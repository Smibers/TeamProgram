package com.cps298.chaching

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

import kotlinx.coroutines.*


//responsible for interacting with the Room database on behalf of the ViewModel
//needs all methods provided from the DAO

//THIS MEANS IF I IMPLEMENT ANOTHER ONE (for example, DESC), I NEED TO ADD IT HERE TOO
//Maybe not though, the book says the getAllProducts() DAO method is an exception.
class ContactRepository(application: Application) {

    val searchResults = MutableLiveData<List<Contact>>()
    //declares a MutableLiveData variable named searchResults where
    //the results of a search operation are stored whenever an async search task completes
    //might be important later KEEP NOTE
    //an observer within the ViewModel will monitor the livedata object

    private var contactDao: ContactDao?
    private val coroutineScope = CoroutineScope(Dispatchers.Main)
    val allContacts: LiveData<List<Contact>>?
    //val allContactsDESC: LiveData<List<Contact>>?

    init {
        val db: ContactRoomDatabase? =  ContactRoomDatabase.getDatabase(application)
        contactDao = db?.contactDao()
        allContacts = contactDao?.getAllContacts()
        //allContacts = contactDao?.getAllContactsDESC()
    }

    fun getAllContactsDESC() {
        Log.d("ContactRepository", "getAllContactsDESC Repository")
        //contactDao?.getAllContactsDESC()
        coroutineScope.launch(Dispatchers.Main) {
            searchResults.value = asyncDesc().await()
        }
    }
    private suspend fun asyncDesc(): Deferred<List<Contact>?> =

        coroutineScope.async(Dispatchers.IO) {
            return@async contactDao?.getAllContactsDESC()
        }


    fun getAllContactsASC() {
        //contactDao?.getAllContactsASC()
        coroutineScope.launch(Dispatchers.Main) {
            searchResults.value = asyncAsc().await()
        }
    }

    private suspend fun asyncAsc(): Deferred<List<Contact>?> =

        coroutineScope.async(Dispatchers.IO) {
            return@async contactDao?.getAllContactsASC()
        }

    fun insertContact(newcontact: Contact) {
        coroutineScope.launch(Dispatchers.IO) {
            asyncInsert(newcontact)
        }
    }

    private suspend fun asyncInsert(contact: Contact) {
        contactDao?.insertContact(contact)
    }

    fun deleteContact(id: Int) { //changed from string to Int
        coroutineScope.launch(Dispatchers.IO) {
            asyncDelete(id)
            Log.d("ContactRepository", "deleteContact running, deleting card id " + id.toString())

        }
    }

    private suspend fun asyncDelete(id: Int) { //changed from string to int
        contactDao?.deleteContact(id)
        Log.d("ContactRepository", "asyncDelete runningdeleting card id " + id.toString())
    }

    fun findContact(name: String) {

        coroutineScope.launch(Dispatchers.Main) {
            searchResults.value = asyncFind(name).await()
        }
    }

    private suspend fun asyncFind(name: String): Deferred<List<Contact>?> =

        coroutineScope.async(Dispatchers.IO) {
            return@async contactDao?.findContact(name)
        }

    fun getContactsByCategory(category: String): LiveData<List<Contact>>? {
        return contactDao?.getContactsByCategory(category)
    }

}
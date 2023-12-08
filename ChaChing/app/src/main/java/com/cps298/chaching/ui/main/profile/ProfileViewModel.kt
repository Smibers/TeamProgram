package com.cps298.chaching.ui.main.profile

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cps298.chaching.Contact
import com.cps298.chaching.ContactRepository

class ProfileViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: ContactRepository = ContactRepository(application)
    private val allContacts: LiveData<List<Contact>>?
    private val searchResults: MutableLiveData<List<Contact>>

    init {
        allContacts = repository.allContacts
        searchResults = repository.searchResults
    }

    fun deleteContact(id: Int) { //changed from string to int
        repository.deleteContact(id)
        //needs to be ID
    }

    fun getSearchResults(): MutableLiveData<List<Contact>> {
        return searchResults
    }

    fun getAllContacts(): LiveData<List<Contact>>? {
        Log.d("ProfileFragment ", "getAllContacts Ran")
        return allContacts
    }

    fun insertContact(contact: Contact) {
        Log.d("HomeViewModel", "insertContact Ran")
        repository.insertContact(contact)
    }

    fun findContact(name: String) {
        repository.findContact(name)
    }

    fun getAllContactsDesc() {
        Log.d("HomeViewModel ", "getAllContactsDesc Ran")
        //return allContacts
        repository.getAllContactsDESC()
    }

    fun getAllContactsAsc() {
        Log.d("HomeViewModel ", "getAllContactsAsc Ran")
        //return allContacts
        repository.getAllContactsASC()
    }


}
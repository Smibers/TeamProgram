package com.cps298.chaching

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao //declare as Data Access Object
interface ContactDao {

    @Insert //assign function to SQL method
    fun insertContact(contact: Contact)

    //@Query("SELECT * FROM contacts WHERE contactName = :name")
    @Query("SELECT * FROM contacts WHERE cardName LIKE '%' || :name || '%'") //provided by HW
    fun findContact(name: String): List<Contact>

    //@Query("DELETE FROM contacts WHERE contactName = :name")
    @Query("DELETE FROM contacts WHERE card = :id")
    fun deleteContact(id: Int) //changed from string to int

    @Query("SELECT * FROM contacts")
    fun getAllContacts(): LiveData<List<Contact>>//returns a livedata object containing all records in the db to display on recyclerview
    //I can probably use a different function to call descending with the "order by" sql statement
    //EX: SELECT * FROM contacts ORDER BY contactName DESC

    //THIS DOES THE ASC SORT FROM THE DATABASE
    @Query("SELECT * FROM contacts ORDER BY cardName ASC")
    fun getAllContactsASC(): List<Contact>

    //THIS DOES THE DESC SORT FROM THE DATABASE
    @Query("SELECT * FROM contacts ORDER BY cardName DESC")
    fun getAllContactsDESC(): List<Contact>

    @Query("SELECT * FROM contacts WHERE useCategory = :category")
    fun getContactsByCategory(category: String): LiveData<List<Contact>>
}
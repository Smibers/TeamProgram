package com.ebookfrenzy.roomdemo;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH\'\u00a8\u0006\u0011"}, d2 = {"Lcom/ebookfrenzy/roomdemo/ContactDao;", "", "deleteContact", "", "id", "", "findContact", "", "Lcom/ebookfrenzy/roomdemo/Contact;", "name", "", "getAllContacts", "Landroidx/lifecycle/LiveData;", "getAllContactsASC", "getAllContactsDESC", "insertContact", "contact", "app_debug"})
public abstract interface ContactDao {
    
    @androidx.room.Insert
    public abstract void insertContact(@org.jetbrains.annotations.NotNull
    com.ebookfrenzy.roomdemo.Contact contact);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM contacts WHERE cardName LIKE \'%\' || :name || \'%\'")
    public abstract java.util.List<com.ebookfrenzy.roomdemo.Contact> findContact(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    @androidx.room.Query(value = "DELETE FROM contacts WHERE card = :id")
    public abstract void deleteContact(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM contacts")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ebookfrenzy.roomdemo.Contact>> getAllContacts();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM contacts ORDER BY cardName ASC")
    public abstract java.util.List<com.ebookfrenzy.roomdemo.Contact> getAllContactsASC();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM contacts ORDER BY cardName DESC")
    public abstract java.util.List<com.ebookfrenzy.roomdemo.Contact> getAllContactsDESC();
}
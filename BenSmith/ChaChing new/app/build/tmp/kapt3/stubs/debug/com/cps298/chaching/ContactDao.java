package com.cps298.chaching;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH\'\u00a8\u0006\u0011"}, d2 = {"Lcom/cps298/chaching/ContactDao;", "", "deleteContact", "", "id", "", "findContact", "", "Lcom/cps298/chaching/Contact;", "name", "", "getAllContacts", "Landroidx/lifecycle/LiveData;", "getAllContactsASC", "getAllContactsDESC", "insertContact", "contact", "app_debug"})
@androidx.room.Dao
public abstract interface ContactDao {
    
    @androidx.room.Insert
    public abstract void insertContact(@org.jetbrains.annotations.NotNull
    com.cps298.chaching.Contact contact);
    
    @androidx.room.Query(value = "SELECT * FROM contacts WHERE cardName LIKE \'%\' || :name || \'%\'")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.cps298.chaching.Contact> findContact(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    @androidx.room.Query(value = "DELETE FROM contacts WHERE card = :id")
    public abstract void deleteContact(int id);
    
    @androidx.room.Query(value = "SELECT * FROM contacts")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.cps298.chaching.Contact>> getAllContacts();
    
    @androidx.room.Query(value = "SELECT * FROM contacts ORDER BY cardName ASC")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.cps298.chaching.Contact> getAllContactsASC();
    
    @androidx.room.Query(value = "SELECT * FROM contacts ORDER BY cardName DESC")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.cps298.chaching.Contact> getAllContactsDESC();
}
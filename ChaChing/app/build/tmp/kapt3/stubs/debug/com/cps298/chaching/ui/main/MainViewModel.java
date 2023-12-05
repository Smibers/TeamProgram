package com.cps298.chaching.ui.main;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006J\u0006\u0010\u0015\u001a\u00020\u000eJ\u0006\u0010\u0016\u001a\u00020\u000eJ\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fJ\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\bR\u001c\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/cps298/chaching/ui/main/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allContacts", "Landroidx/lifecycle/LiveData;", "", "Lcom/cps298/chaching/Contact;", "repository", "Lcom/cps298/chaching/ContactRepository;", "searchResults", "Landroidx/lifecycle/MutableLiveData;", "deleteContact", "", "id", "", "findContact", "name", "", "getAllContacts", "getAllContactsAsc", "getAllContactsDesc", "getSearchResults", "insertContact", "contact", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.cps298.chaching.ContactRepository repository = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.lifecycle.LiveData<java.util.List<com.cps298.chaching.Contact>> allContacts = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.cps298.chaching.Contact>> searchResults = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    public final void insertContact(@org.jetbrains.annotations.NotNull
    com.cps298.chaching.Contact contact) {
    }
    
    public final void findContact(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    public final void deleteContact(int id) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.cps298.chaching.Contact>> getSearchResults() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.lifecycle.LiveData<java.util.List<com.cps298.chaching.Contact>> getAllContacts() {
        return null;
    }
    
    public final void getAllContactsDesc() {
    }
    
    public final void getAllContactsAsc() {
    }
}
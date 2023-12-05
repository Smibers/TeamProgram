package com.cps298.chaching;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\'\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010%\u001a\u00020\u0017J\u0006\u0010&\u001a\u00020\u0017J\u000e\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\bR\u001f\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/cps298/chaching/ContactRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allContacts", "Landroidx/lifecycle/LiveData;", "", "Lcom/cps298/chaching/Contact;", "getAllContacts", "()Landroidx/lifecycle/LiveData;", "contactDao", "Lcom/cps298/chaching/ContactDao;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "searchResults", "Landroidx/lifecycle/MutableLiveData;", "getSearchResults", "()Landroidx/lifecycle/MutableLiveData;", "asyncAsc", "Lkotlinx/coroutines/Deferred;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asyncDelete", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asyncDesc", "asyncFind", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asyncInsert", "contact", "(Lcom/cps298/chaching/Contact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteContact", "findContact", "getAllContactsASC", "getAllContactsDESC", "insertContact", "newcontact", "app_debug"})
public final class ContactRepository {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.cps298.chaching.Contact>> searchResults = null;
    @org.jetbrains.annotations.Nullable
    private com.cps298.chaching.ContactDao contactDao;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.lifecycle.LiveData<java.util.List<com.cps298.chaching.Contact>> allContacts = null;
    
    public ContactRepository(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.cps298.chaching.Contact>> getSearchResults() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.lifecycle.LiveData<java.util.List<com.cps298.chaching.Contact>> getAllContacts() {
        return null;
    }
    
    public final void getAllContactsDESC() {
    }
    
    private final java.lang.Object asyncDesc(kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends java.util.List<com.cps298.chaching.Contact>>> $completion) {
        return null;
    }
    
    public final void getAllContactsASC() {
    }
    
    private final java.lang.Object asyncAsc(kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends java.util.List<com.cps298.chaching.Contact>>> $completion) {
        return null;
    }
    
    public final void insertContact(@org.jetbrains.annotations.NotNull
    com.cps298.chaching.Contact newcontact) {
    }
    
    private final java.lang.Object asyncInsert(com.cps298.chaching.Contact contact, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void deleteContact(int id) {
    }
    
    private final java.lang.Object asyncDelete(int id, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void findContact(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    private final java.lang.Object asyncFind(java.lang.String name, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends java.util.List<com.cps298.chaching.Contact>>> $completion) {
        return null;
    }
}
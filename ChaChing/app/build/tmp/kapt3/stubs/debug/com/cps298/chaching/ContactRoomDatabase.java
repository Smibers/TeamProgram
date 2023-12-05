package com.cps298.chaching;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/cps298/chaching/ContactRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "contactDao", "Lcom/cps298/chaching/ContactDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.cps298.chaching.Contact.class}, version = 1)
public abstract class ContactRoomDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.Nullable
    private static com.cps298.chaching.ContactRoomDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.cps298.chaching.ContactRoomDatabase.Companion Companion = null;
    
    public ContactRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.cps298.chaching.ContactDao contactDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\b\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/cps298/chaching/ContactRoomDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/cps298/chaching/ContactRoomDatabase;", "getDatabase", "context", "Landroid/content/Context;", "getDatabase$app_debug", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.cps298.chaching.ContactRoomDatabase getDatabase$app_debug(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}
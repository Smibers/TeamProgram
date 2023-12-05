package com.ebookfrenzy.roomdemo;

import java.lang.System;

@androidx.room.Database(entities = {com.ebookfrenzy.roomdemo.Contact.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ebookfrenzy/roomdemo/ContactRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "contactDao", "Lcom/ebookfrenzy/roomdemo/ContactDao;", "Companion", "app_debug"})
public abstract class ContactRoomDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.ebookfrenzy.roomdemo.ContactRoomDatabase.Companion Companion = null;
    private static com.ebookfrenzy.roomdemo.ContactRoomDatabase INSTANCE;
    
    public ContactRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.ebookfrenzy.roomdemo.ContactDao contactDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\b\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ebookfrenzy/roomdemo/ContactRoomDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/ebookfrenzy/roomdemo/ContactRoomDatabase;", "getDatabase", "context", "Landroid/content/Context;", "getDatabase$app_debug", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.ebookfrenzy.roomdemo.ContactRoomDatabase getDatabase$app_debug(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}
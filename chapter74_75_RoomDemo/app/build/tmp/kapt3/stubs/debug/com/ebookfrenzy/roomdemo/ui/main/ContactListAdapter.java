package com.ebookfrenzy.roomdemo.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0016J\u0014\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u001c\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/ebookfrenzy/roomdemo/ui/main/ContactListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ebookfrenzy/roomdemo/ui/main/ContactListAdapter$ViewHolder;", "contactItemLayout", "", "(I)V", "_binding", "Lcom/ebookfrenzy/roomdemo/databinding/ContactListItemBinding;", "contactList", "", "Lcom/ebookfrenzy/roomdemo/Contact;", "listener", "Lcom/ebookfrenzy/roomdemo/ui/main/ContactListAdapter$onItemClickListener;", "getListener", "()Lcom/ebookfrenzy/roomdemo/ui/main/ContactListAdapter$onItemClickListener;", "setListener", "(Lcom/ebookfrenzy/roomdemo/ui/main/ContactListAdapter$onItemClickListener;)V", "getItemCount", "onBindViewHolder", "", "holder", "listPosition", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setContactList", "contacts", "settingListener", "ViewHolder", "onItemClickListener", "app_debug"})
public final class ContactListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ebookfrenzy.roomdemo.ui.main.ContactListAdapter.ViewHolder> {
    private final int contactItemLayout = 0;
    private com.ebookfrenzy.roomdemo.databinding.ContactListItemBinding _binding;
    @org.jetbrains.annotations.Nullable
    private com.ebookfrenzy.roomdemo.ui.main.ContactListAdapter.onItemClickListener listener;
    private java.util.List<com.ebookfrenzy.roomdemo.Contact> contactList;
    
    public ContactListAdapter(int contactItemLayout) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ebookfrenzy.roomdemo.ui.main.ContactListAdapter.onItemClickListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    com.ebookfrenzy.roomdemo.ui.main.ContactListAdapter.onItemClickListener p0) {
    }
    
    public final void settingListener(@org.jetbrains.annotations.Nullable
    com.ebookfrenzy.roomdemo.ui.main.ContactListAdapter.onItemClickListener listener) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.ebookfrenzy.roomdemo.ui.main.ContactListAdapter.ViewHolder holder, int listPosition) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.ebookfrenzy.roomdemo.ui.main.ContactListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setContactList(@org.jetbrains.annotations.NotNull
    java.util.List<com.ebookfrenzy.roomdemo.Contact> contacts) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/ebookfrenzy/roomdemo/ui/main/ContactListAdapter$onItemClickListener;", "", "onClick", "", "str", "", "app_debug"})
    public static abstract interface onItemClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull
        java.lang.String str);
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class DefaultImpls {
            
            public static void onClick(@org.jetbrains.annotations.NotNull
            com.ebookfrenzy.roomdemo.ui.main.ContactListAdapter.onItemClickListener $this, @org.jetbrains.annotations.NotNull
            java.lang.String str) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/ebookfrenzy/roomdemo/ui/main/ContactListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "deleteBtn", "Landroid/widget/ImageView;", "getDeleteBtn", "()Landroid/widget/ImageView;", "item", "Landroid/widget/TextView;", "getItem", "()Landroid/widget/TextView;", "setItem", "(Landroid/widget/TextView;)V", "item2", "getItem2", "setItem2", "item3", "getItem3", "setItem3", "item4", "getItem4", "setItem4", "item5", "getItem5", "setItem5", "item6", "getItem6", "setItem6", "item7", "getItem7", "setItem7", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView item;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView item2;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView item3;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView item4;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView item5;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView item6;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView item7;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView deleteBtn = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getItem() {
            return null;
        }
        
        public final void setItem(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getItem2() {
            return null;
        }
        
        public final void setItem2(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getItem3() {
            return null;
        }
        
        public final void setItem3(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getItem4() {
            return null;
        }
        
        public final void setItem4(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getItem5() {
            return null;
        }
        
        public final void setItem5(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getItem6() {
            return null;
        }
        
        public final void setItem6(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getItem7() {
            return null;
        }
        
        public final void setItem7(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getDeleteBtn() {
            return null;
        }
    }
}
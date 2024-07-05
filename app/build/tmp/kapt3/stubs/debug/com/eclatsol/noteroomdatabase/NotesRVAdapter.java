package com.eclatsol.noteroomdatabase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/eclatsol/noteroomdatabase/NotesRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/eclatsol/noteroomdatabase/NotesRVAdapter$NoteViewHolder;", "context", "Landroid/content/Context;", "listener", "Lcom/eclatsol/noteroomdatabase/INoteRVAdapter;", "(Landroid/content/Context;Lcom/eclatsol/noteroomdatabase/INoteRVAdapter;)V", "allNotes", "Ljava/util/ArrayList;", "Lcom/eclatsol/noteroomdatabase/Note;", "getAllNotes", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "", "NoteViewHolder", "app_debug"})
public final class NotesRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.eclatsol.noteroomdatabase.NotesRVAdapter.NoteViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.eclatsol.noteroomdatabase.INoteRVAdapter listener = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.eclatsol.noteroomdatabase.Note> allNotes = null;
    
    public NotesRVAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.eclatsol.noteroomdatabase.INoteRVAdapter listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.eclatsol.noteroomdatabase.Note> getAllNotes() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.eclatsol.noteroomdatabase.NotesRVAdapter.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.eclatsol.noteroomdatabase.NotesRVAdapter.NoteViewHolder holder, int position) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull
    java.util.List<com.eclatsol.noteroomdatabase.Note> newList) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/eclatsol/noteroomdatabase/NotesRVAdapter$NoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/eclatsol/noteroomdatabase/NotesRVAdapter;Landroid/view/View;)V", "deleteButton", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getDeleteButton", "()Landroid/widget/ImageView;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "app_debug"})
    public final class NoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView textView = null;
        private final android.widget.ImageView deleteButton = null;
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.TextView getTextView() {
            return null;
        }
        
        public final android.widget.ImageView getDeleteButton() {
            return null;
        }
    }
}
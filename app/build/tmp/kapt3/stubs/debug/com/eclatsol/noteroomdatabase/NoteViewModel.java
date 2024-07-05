package com.eclatsol.noteroomdatabase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/eclatsol/noteroomdatabase/NoteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allNotes", "Landroidx/lifecycle/LiveData;", "", "Lcom/eclatsol/noteroomdatabase/Note;", "getAllNotes", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/eclatsol/noteroomdatabase/NoteRepository;", "getRepository", "()Lcom/eclatsol/noteroomdatabase/NoteRepository;", "deleteNote", "Lkotlinx/coroutines/Job;", "note", "insertNote", "app_debug"})
public final class NoteViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.eclatsol.noteroomdatabase.NoteRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.eclatsol.noteroomdatabase.Note>> allNotes = null;
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.eclatsol.noteroomdatabase.NoteRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.eclatsol.noteroomdatabase.Note>> getAllNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteNote(@org.jetbrains.annotations.NotNull
    com.eclatsol.noteroomdatabase.Note note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insertNote(@org.jetbrains.annotations.NotNull
    com.eclatsol.noteroomdatabase.Note note) {
        return null;
    }
}
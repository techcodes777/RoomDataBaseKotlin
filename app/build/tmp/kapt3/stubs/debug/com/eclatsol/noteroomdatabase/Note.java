package com.eclatsol.noteroomdatabase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/eclatsol/noteroomdatabase/Note;", "", "text", "", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "getText", "()Ljava/lang/String;", "app_debug"})
@androidx.room.Entity(tableName = "note_table")
public final class Note {
    @androidx.room.ColumnInfo(name = "text")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String text = null;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    
    public Note(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
}
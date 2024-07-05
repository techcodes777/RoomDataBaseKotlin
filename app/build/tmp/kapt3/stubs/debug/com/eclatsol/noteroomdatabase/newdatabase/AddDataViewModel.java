package com.eclatsol.noteroomdatabase.newdatabase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/eclatsol/noteroomdatabase/newdatabase/AddDataViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allAddData", "Landroidx/lifecycle/LiveData;", "", "Lcom/eclatsol/noteroomdatabase/newdatabase/AddData;", "getAllAddData", "()Landroidx/lifecycle/LiveData;", "setAllAddData", "(Landroidx/lifecycle/LiveData;)V", "dataRepository", "Lcom/eclatsol/noteroomdatabase/newdatabase/DataRepository;", "getDataRepository", "()Lcom/eclatsol/noteroomdatabase/newdatabase/DataRepository;", "setDataRepository", "(Lcom/eclatsol/noteroomdatabase/newdatabase/DataRepository;)V", "delete", "Lkotlinx/coroutines/Job;", "addData", "insert", "app_debug"})
public final class AddDataViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<java.util.List<com.eclatsol.noteroomdatabase.newdatabase.AddData>> allAddData;
    @org.jetbrains.annotations.NotNull
    private com.eclatsol.noteroomdatabase.newdatabase.DataRepository dataRepository;
    
    public AddDataViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.eclatsol.noteroomdatabase.newdatabase.AddData>> getAllAddData() {
        return null;
    }
    
    public final void setAllAddData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.util.List<com.eclatsol.noteroomdatabase.newdatabase.AddData>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.eclatsol.noteroomdatabase.newdatabase.DataRepository getDataRepository() {
        return null;
    }
    
    public final void setDataRepository(@org.jetbrains.annotations.NotNull
    com.eclatsol.noteroomdatabase.newdatabase.DataRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull
    com.eclatsol.noteroomdatabase.newdatabase.AddData addData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull
    com.eclatsol.noteroomdatabase.newdatabase.AddData addData) {
        return null;
    }
}
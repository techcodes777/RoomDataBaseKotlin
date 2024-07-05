package com.eclatsol.noteroomdatabase.newdatabase;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AddDataDao_Impl implements AddDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AddData> __insertionAdapterOfAddData;

  private final EntityDeletionOrUpdateAdapter<AddData> __deletionAdapterOfAddData;

  public AddDataDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAddData = new EntityInsertionAdapter<AddData>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR IGNORE INTO `add_data` (`text`,`id`) VALUES (?,nullif(?, 0))";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final AddData entity) {
        if (entity.getText() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getText());
        }
        statement.bindLong(2, entity.getId());
      }
    };
    this.__deletionAdapterOfAddData = new EntityDeletionOrUpdateAdapter<AddData>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `add_data` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final AddData entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public Object insert(final AddData addData, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAddData.insert(addData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final AddData addData, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfAddData.handle(addData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<List<AddData>> getAllAddData() {
    final String _sql = "Select * from add_data order by id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"add_data"}, false, new Callable<List<AddData>>() {
      @Override
      @Nullable
      public List<AddData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<AddData> _result = new ArrayList<AddData>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final AddData _item;
            final String _tmpText;
            if (_cursor.isNull(_cursorIndexOfText)) {
              _tmpText = null;
            } else {
              _tmpText = _cursor.getString(_cursorIndexOfText);
            }
            _item = new AddData(_tmpText);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

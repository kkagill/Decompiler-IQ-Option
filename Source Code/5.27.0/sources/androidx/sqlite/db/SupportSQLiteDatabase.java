package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener);

    SupportSQLiteStatement compileStatement(String str);

    int delete(String str, String str2, Object[] objArr);

    @RequiresApi(api = 16)
    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    void execSQL(String str);

    void execSQL(String str, Object[] objArr);

    List<Pair<String, String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(String str, int i, ContentValues contentValues);

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    boolean isOpen();

    boolean isReadOnly();

    @RequiresApi(api = 16)
    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int i);

    Cursor query(SupportSQLiteQuery supportSQLiteQuery);

    @RequiresApi(api = 16)
    Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal);

    Cursor query(String str);

    Cursor query(String str, Object[] objArr);

    @RequiresApi(api = 16)
    void setForeignKeyConstraintsEnabled(boolean z);

    void setLocale(Locale locale);

    void setMaxSqlCacheSize(int i);

    long setMaximumSize(long j);

    void setPageSize(long j);

    void setTransactionSuccessful();

    void setVersion(int i);

    int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long j);
}

package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.sqlite.db.SupportSQLiteStatement;

@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class EntityDeletionOrUpdateAdapter<T> extends SharedSQLiteStatement {
    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t);

    public abstract String createQuery();

    public EntityDeletionOrUpdateAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final int handle(T t) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t);
            int executeUpdateDelete = acquire.executeUpdateDelete();
            return executeUpdateDelete;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<T> iterable) {
        SupportSQLiteStatement acquire = acquire();
        int i = 0;
        try {
            for (T bind : iterable) {
                bind(acquire, bind);
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        SupportSQLiteStatement acquire = acquire();
        try {
            int i = 0;
            for (Object bind : tArr) {
                bind(acquire, bind);
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}

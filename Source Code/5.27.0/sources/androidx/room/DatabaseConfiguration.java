package androidx.room;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.room.RoomDatabase.Callback;
import androidx.room.RoomDatabase.JournalMode;
import androidx.room.RoomDatabase.MigrationContainer;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public class DatabaseConfiguration {
    public final boolean allowMainThreadQueries;
    @Nullable
    public final List<Callback> callbacks;
    @NonNull
    public final Context context;
    public final JournalMode journalMode;
    private final Set<Integer> mMigrationNotRequiredFrom;
    @NonNull
    public final MigrationContainer migrationContainer;
    @Nullable
    public final String name;
    @NonNull
    public final Executor queryExecutor;
    public final boolean requireMigration;
    @NonNull
    public final Factory sqliteOpenHelperFactory;

    @RestrictTo({Scope.LIBRARY_GROUP})
    public DatabaseConfiguration(@NonNull Context context, @Nullable String str, @NonNull Factory factory, @NonNull MigrationContainer migrationContainer, @Nullable List<Callback> list, boolean z, JournalMode journalMode, @NonNull Executor executor, boolean z2, @Nullable Set<Integer> set) {
        this.sqliteOpenHelperFactory = factory;
        this.context = context;
        this.name = str;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z;
        this.journalMode = journalMode;
        this.queryExecutor = executor;
        this.requireMigration = z2;
        this.mMigrationNotRequiredFrom = set;
    }

    public boolean isMigrationRequiredFrom(int i) {
        if (this.requireMigration) {
            Set set = this.mMigrationNotRequiredFrom;
            if (set == null || !set.contains(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }
}

package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.File;

public interface SupportSQLiteOpenHelper {

    public static abstract class Callback {
        private static final String TAG = "SupportSQLite";
        public final int version;

        public void onConfigure(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public abstract void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        public Callback(int i) {
            this.version = i;
        }

        public void onDowngrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't downgrade database from version ");
            stringBuilder.append(i);
            stringBuilder.append(" to ");
            stringBuilder.append(i2);
            throw new SQLiteException(stringBuilder.toString());
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A:{ExcHandler: all (th java.lang.Throwable), PHI: r0 , Splitter:B:5:0x0029} */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing block: B:10:0x0034, code skipped:
            if (r0 != null) goto L_0x0036;
     */
        /* JADX WARNING: Missing block: B:11:0x0036, code skipped:
            r3 = r0.iterator();
     */
        /* JADX WARNING: Missing block: B:13:0x003e, code skipped:
            if (r3.hasNext() != false) goto L_0x0040;
     */
        /* JADX WARNING: Missing block: B:14:0x0040, code skipped:
            deleteDatabaseFile((java.lang.String) ((android.util.Pair) r3.next()).second);
     */
        /* JADX WARNING: Missing block: B:15:0x004e, code skipped:
            deleteDatabaseFile(r3.getPath());
     */
        public void onCorruption(androidx.sqlite.db.SupportSQLiteDatabase r3) {
            /*
            r2 = this;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "Corruption reported by sqlite on database: ";
            r0.append(r1);
            r1 = r3.getPath();
            r0.append(r1);
            r0 = r0.toString();
            r1 = "SupportSQLite";
            android.util.Log.e(r1, r0);
            r0 = r3.isOpen();
            if (r0 != 0) goto L_0x0028;
        L_0x0020:
            r3 = r3.getPath();
            r2.deleteDatabaseFile(r3);
            return;
        L_0x0028:
            r0 = 0;
            r0 = r3.getAttachedDbs();	 Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
            goto L_0x0030;
        L_0x002e:
            r1 = move-exception;
            goto L_0x0034;
        L_0x0030:
            r3.close();	 Catch:{ IOException -> 0x0056, all -> 0x002e }
            goto L_0x0056;
        L_0x0034:
            if (r0 == 0) goto L_0x004e;
        L_0x0036:
            r3 = r0.iterator();
        L_0x003a:
            r0 = r3.hasNext();
            if (r0 == 0) goto L_0x0055;
        L_0x0040:
            r0 = r3.next();
            r0 = (android.util.Pair) r0;
            r0 = r0.second;
            r0 = (java.lang.String) r0;
            r2.deleteDatabaseFile(r0);
            goto L_0x003a;
        L_0x004e:
            r3 = r3.getPath();
            r2.deleteDatabaseFile(r3);
        L_0x0055:
            throw r1;
        L_0x0056:
            if (r0 == 0) goto L_0x0070;
        L_0x0058:
            r3 = r0.iterator();
        L_0x005c:
            r0 = r3.hasNext();
            if (r0 == 0) goto L_0x0077;
        L_0x0062:
            r0 = r3.next();
            r0 = (android.util.Pair) r0;
            r0 = r0.second;
            r0 = (java.lang.String) r0;
            r2.deleteDatabaseFile(r0);
            goto L_0x005c;
        L_0x0070:
            r3 = r3.getPath();
            r2.deleteDatabaseFile(r3);
        L_0x0077:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.db.SupportSQLiteOpenHelper$Callback.onCorruption(androidx.sqlite.db.SupportSQLiteDatabase):void");
        }

        private void deleteDatabaseFile(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("deleting the database file: ");
                stringBuilder.append(str);
                String stringBuilder2 = stringBuilder.toString();
                String str2 = TAG;
                Log.w(str2, stringBuilder2);
                try {
                    if (VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Could not delete the database file ");
                            stringBuilder.append(str);
                            Log.e(str2, stringBuilder.toString());
                        }
                    } catch (Exception e) {
                        Log.e(str2, "error while deleting corrupted database file", e);
                    }
                } catch (Exception e2) {
                    Log.w(str2, "delete failed: ", e2);
                }
            }
        }
    }

    public static class Configuration {
        @NonNull
        public final Callback callback;
        @NonNull
        public final Context context;
        @Nullable
        public final String name;

        public static class Builder {
            Callback mCallback;
            Context mContext;
            String mName;

            public Configuration build() {
                Callback callback = this.mCallback;
                if (callback != null) {
                    Context context = this.mContext;
                    if (context != null) {
                        return new Configuration(context, this.mName, callback);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            Builder(@NonNull Context context) {
                this.mContext = context;
            }

            public Builder name(@Nullable String str) {
                this.mName = str;
                return this;
            }

            public Builder callback(@NonNull Callback callback) {
                this.mCallback = callback;
                return this;
            }
        }

        Configuration(@NonNull Context context, @Nullable String str, @NonNull Callback callback) {
            this.context = context;
            this.name = str;
            this.callback = callback;
        }

        public static Builder builder(Context context) {
            return new Builder(context);
        }
    }

    public interface Factory {
        SupportSQLiteOpenHelper create(Configuration configuration);
    }

    void close();

    String getDatabaseName();

    SupportSQLiteDatabase getReadableDatabase();

    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);
}

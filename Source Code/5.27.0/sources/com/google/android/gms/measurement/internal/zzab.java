package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzab {
    @WorkerThread
    private static Set<String> zza(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
        stringBuilder.append("SELECT * FROM ");
        stringBuilder.append(str);
        stringBuilder.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    @WorkerThread
    static void zza(zzef zzef, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        String str4 = "Monitor must not be null";
        if (zzef != null) {
            if (!zza(zzef, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            if (zzef != null) {
                try {
                    Set zza = zza(sQLiteDatabase, str);
                    String[] split = str3.split(",");
                    int length = split.length;
                    int i = 0;
                    while (i < length) {
                        Object obj = split[i];
                        if (zza.remove(obj)) {
                            i++;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(obj).length());
                            stringBuilder.append("Table ");
                            stringBuilder.append(str);
                            stringBuilder.append(" is missing required column: ");
                            stringBuilder.append(obj);
                            throw new SQLiteException(stringBuilder.toString());
                        }
                    }
                    if (strArr != null) {
                        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                            if (!zza.remove(strArr[i2])) {
                                sQLiteDatabase.execSQL(strArr[i2 + 1]);
                            }
                        }
                    }
                    if (!zza.isEmpty()) {
                        zzef.zzgn().zza("Table has extra columns. table, columns", str, TextUtils.join(", ", zza));
                        return;
                    }
                    return;
                } catch (SQLiteException e) {
                    zzef.zzgk().zza("Failed to verify columns on table that was just created", str);
                    throw e;
                }
            }
            throw new IllegalArgumentException(str4);
        }
        throw new IllegalArgumentException(str4);
    }

    @WorkerThread
    private static boolean zza(zzef zzef, SQLiteDatabase sQLiteDatabase, String str) {
        if (zzef != null) {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                cursor = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{ConditionalUserProperty.NAME}, "name=?", new String[]{str}, null, null, null);
                zzef = cursor.moveToFirst();
                if (cursor != null) {
                    cursor.close();
                }
                return zzef;
            } catch (SQLiteException e) {
                zzef.zzgn().zza("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    static void zza(zzef zzef, SQLiteDatabase sQLiteDatabase) {
        if (zzef != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                zzef.zzgn().zzao("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzef.zzgn().zzao("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzef.zzgn().zzao("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                zzef.zzgn().zzao("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}

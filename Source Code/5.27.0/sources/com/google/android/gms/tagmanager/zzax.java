package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.HashSet;
import java.util.Set;

@VisibleForTesting
final class zzax extends SQLiteOpenHelper {
    private final /* synthetic */ zzat zzagd;

    zzax(zzat zzat, Context context, String str) {
        this.zzagd = zzat;
        super(context, str, null, 1);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|(1:10)(1:11)|12|17|13) */
    /* JADX WARNING: Missing block: B:8:?, code skipped:
            r11 = "Error querying for table ";
            r10 = java.lang.String.valueOf(r10);
     */
    /* JADX WARNING: Missing block: B:9:0x002f, code skipped:
            if (r10.length() != 0) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:10:0x0031, code skipped:
            r10 = r11.concat(r10);
     */
    /* JADX WARNING: Missing block: B:11:0x0036, code skipped:
            r10 = new java.lang.String(r11);
     */
    /* JADX WARNING: Missing block: B:12:0x003b, code skipped:
            com.google.android.gms.tagmanager.zzdi.zzac(r10);
     */
    /* JADX WARNING: Missing block: B:13:0x0043, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:14:0x0044, code skipped:
            if (r1 != null) goto L_0x0046;
     */
    /* JADX WARNING: Missing block: B:15:0x0046, code skipped:
            r1.close();
     */
    private static boolean zza(java.lang.String r10, android.database.sqlite.SQLiteDatabase r11) {
        /*
        r0 = 0;
        r1 = 0;
        r3 = "SQLITE_MASTER";
        r2 = "name";
        r4 = new java.lang.String[]{r2};	 Catch:{ SQLiteException -> 0x0025 }
        r5 = "name=?";
        r2 = 1;
        r6 = new java.lang.String[r2];	 Catch:{ SQLiteException -> 0x0025 }
        r6[r0] = r10;	 Catch:{ SQLiteException -> 0x0025 }
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r2 = r11;
        r1 = r2.query(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ SQLiteException -> 0x0025 }
        r10 = r1.moveToFirst();	 Catch:{ SQLiteException -> 0x0025 }
        if (r1 == 0) goto L_0x0022;
    L_0x001f:
        r1.close();
    L_0x0022:
        return r10;
    L_0x0023:
        r10 = move-exception;
        goto L_0x0044;
    L_0x0025:
        r11 = "Error querying for table ";
        r10 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x0023 }
        r2 = r10.length();	 Catch:{ all -> 0x0023 }
        if (r2 == 0) goto L_0x0036;
    L_0x0031:
        r10 = r11.concat(r10);	 Catch:{ all -> 0x0023 }
        goto L_0x003b;
    L_0x0036:
        r10 = new java.lang.String;	 Catch:{ all -> 0x0023 }
        r10.<init>(r11);	 Catch:{ all -> 0x0023 }
    L_0x003b:
        com.google.android.gms.tagmanager.zzdi.zzac(r10);	 Catch:{ all -> 0x0023 }
        if (r1 == 0) goto L_0x0043;
    L_0x0040:
        r1.close();
    L_0x0043:
        return r0;
    L_0x0044:
        if (r1 == 0) goto L_0x0049;
    L_0x0046:
        r1.close();
    L_0x0049:
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzax.zza(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
    }

    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            this.zzagd.zzrm.getDatabasePath("google_tagmanager.db").delete();
            writableDatabase = null;
        }
        return writableDatabase == null ? super.getWritableDatabase() : writableDatabase;
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (VERSION.SDK_INT < 15) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
            try {
                rawQuery.moveToFirst();
            } finally {
                rawQuery.close();
            }
        }
        if (zza("datalayer", sQLiteDatabase)) {
            Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
            Set hashSet = new HashSet();
            try {
                String[] columnNames = rawQuery2.getColumnNames();
                for (Object add : columnNames) {
                    hashSet.add(add);
                }
                if (!hashSet.remove("key") || !hashSet.remove(ConditionalUserProperty.VALUE) || !hashSet.remove("ID") || !hashSet.remove("expires")) {
                    throw new SQLiteException("Database column missing");
                } else if (!hashSet.isEmpty()) {
                    throw new SQLiteException("Database has extra columns");
                }
            } finally {
                rawQuery2.close();
            }
        } else {
            sQLiteDatabase.execSQL(zzat.zzafx);
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzbr.zzbb(sQLiteDatabase.getPath());
    }
}

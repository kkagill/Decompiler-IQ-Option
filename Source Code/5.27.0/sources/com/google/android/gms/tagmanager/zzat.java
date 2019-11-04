package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzdf;
import com.google.android.gms.internal.gtm.zzdi;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

final class zzat implements zzc {
    private static final String zzafx = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[]{"datalayer", "ID", "key", ConditionalUserProperty.VALUE, "expires"});
    private final Executor zzafy;
    private zzax zzafz;
    private int zzaga;
    private final Context zzrm;
    private Clock zzsd;

    public zzat(Context context) {
        Context context2 = context;
        this(context2, DefaultClock.getInstance(), "google_tagmanager.db", CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, zzdf.zzgp().zzr(zzdi.zzadg));
    }

    @VisibleForTesting
    private zzat(Context context, Clock clock, String str, int i, Executor executor) {
        this.zzrm = context;
        this.zzsd = clock;
        this.zzaga = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
        this.zzafy = executor;
        this.zzafz = new zzax(this, this.zzrm, str);
    }

    public final void zza(List<zza> list, long j) {
        ArrayList arrayList = new ArrayList();
        for (zza zza : list) {
            arrayList.add(new zzay(zza.mKey, zzf(zza.mValue)));
        }
        this.zzafy.execute(new zzau(this, arrayList, j));
    }

    public final void zza(zzaq zzaq) {
        this.zzafy.execute(new zzav(this, zzaq));
    }

    public final void zzas(String str) {
        this.zzafy.execute(new zzaw(this, str));
    }

    private final List<zza> zzht() {
        try {
            zzl(this.zzsd.currentTimeMillis());
            List<zzay> zzhu = zzhu();
            List<zza> arrayList = new ArrayList();
            for (zzay zzay : zzhu) {
                arrayList.add(new zza(zzay.zzagg, zza(zzay.zzagh)));
            }
            return arrayList;
        } finally {
            zzhw();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0032 A:{SYNTHETIC, Splitter:B:31:0x0032} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0028 A:{SYNTHETIC, Splitter:B:22:0x0028} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e A:{SYNTHETIC, Splitter:B:13:0x001e} */
    private static java.lang.Object zza(byte[] r3) {
        /*
        r0 = new java.io.ByteArrayInputStream;
        r0.<init>(r3);
        r3 = 0;
        r1 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x002f, ClassNotFoundException -> 0x0025, all -> 0x001b }
        r1.<init>(r0);	 Catch:{ IOException -> 0x002f, ClassNotFoundException -> 0x0025, all -> 0x001b }
        r3 = r1.readObject();	 Catch:{ IOException -> 0x0030, ClassNotFoundException -> 0x0026, all -> 0x0016 }
        r1.close();	 Catch:{ IOException -> 0x0015 }
        r0.close();	 Catch:{ IOException -> 0x0015 }
    L_0x0015:
        return r3;
    L_0x0016:
        r3 = move-exception;
        r2 = r1;
        r1 = r3;
        r3 = r2;
        goto L_0x001c;
    L_0x001b:
        r1 = move-exception;
    L_0x001c:
        if (r3 == 0) goto L_0x0021;
    L_0x001e:
        r3.close();	 Catch:{ IOException -> 0x0024 }
    L_0x0021:
        r0.close();	 Catch:{ IOException -> 0x0024 }
    L_0x0024:
        throw r1;
    L_0x0025:
        r1 = r3;
    L_0x0026:
        if (r1 == 0) goto L_0x002b;
    L_0x0028:
        r1.close();	 Catch:{ IOException -> 0x002e }
    L_0x002b:
        r0.close();	 Catch:{ IOException -> 0x002e }
    L_0x002e:
        return r3;
    L_0x002f:
        r1 = r3;
    L_0x0030:
        if (r1 == 0) goto L_0x0035;
    L_0x0032:
        r1.close();	 Catch:{ IOException -> 0x0038 }
    L_0x0035:
        r0.close();	 Catch:{ IOException -> 0x0038 }
    L_0x0038:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzat.zza(byte[]):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0029 A:{SYNTHETIC, Splitter:B:22:0x0029} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f A:{SYNTHETIC, Splitter:B:13:0x001f} */
    private static byte[] zzf(java.lang.Object r3) {
        /*
        r0 = new java.io.ByteArrayOutputStream;
        r0.<init>();
        r1 = 0;
        r2 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x0026, all -> 0x001c }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0026, all -> 0x001c }
        r2.writeObject(r3);	 Catch:{ IOException -> 0x0027, all -> 0x0019 }
        r3 = r0.toByteArray();	 Catch:{ IOException -> 0x0027, all -> 0x0019 }
        r2.close();	 Catch:{ IOException -> 0x0018 }
        r0.close();	 Catch:{ IOException -> 0x0018 }
    L_0x0018:
        return r3;
    L_0x0019:
        r3 = move-exception;
        r1 = r2;
        goto L_0x001d;
    L_0x001c:
        r3 = move-exception;
    L_0x001d:
        if (r1 == 0) goto L_0x0022;
    L_0x001f:
        r1.close();	 Catch:{ IOException -> 0x0025 }
    L_0x0022:
        r0.close();	 Catch:{ IOException -> 0x0025 }
    L_0x0025:
        throw r3;
    L_0x0026:
        r2 = r1;
    L_0x0027:
        if (r2 == 0) goto L_0x002c;
    L_0x0029:
        r2.close();	 Catch:{ IOException -> 0x002f }
    L_0x002c:
        r0.close();	 Catch:{ IOException -> 0x002f }
    L_0x002f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzat.zzf(java.lang.Object):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008a A:{Catch:{ all -> 0x00d4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085 A:{Catch:{ all -> 0x00d4 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0075 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|15|(1:17)(1:18)|19) */
    private final synchronized void zzb(java.util.List<com.google.android.gms.tagmanager.zzay> r11, long r12) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.zzsd;	 Catch:{ all -> 0x00d4 }
        r0 = r0.currentTimeMillis();	 Catch:{ all -> 0x00d4 }
        r10.zzl(r0);	 Catch:{ all -> 0x00d4 }
        r2 = r11.size();	 Catch:{ all -> 0x00d4 }
        r3 = r10.zzhv();	 Catch:{ all -> 0x00d4 }
        r4 = r10.zzaga;	 Catch:{ all -> 0x00d4 }
        r3 = r3 - r4;
        r3 = r3 + r2;
        if (r3 <= 0) goto L_0x0092;
    L_0x0018:
        r2 = r10.zzu(r3);	 Catch:{ all -> 0x00d4 }
        r3 = r2.size();	 Catch:{ all -> 0x00d4 }
        r4 = 64;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d4 }
        r5.<init>(r4);	 Catch:{ all -> 0x00d4 }
        r4 = "DataLayer store full, deleting ";
        r5.append(r4);	 Catch:{ all -> 0x00d4 }
        r5.append(r3);	 Catch:{ all -> 0x00d4 }
        r3 = " entries to make room.";
        r5.append(r3);	 Catch:{ all -> 0x00d4 }
        r3 = r5.toString();	 Catch:{ all -> 0x00d4 }
        com.google.android.gms.tagmanager.zzdi.zzaw(r3);	 Catch:{ all -> 0x00d4 }
        r3 = 0;
        r4 = new java.lang.String[r3];	 Catch:{ all -> 0x00d4 }
        r2 = r2.toArray(r4);	 Catch:{ all -> 0x00d4 }
        r2 = (java.lang.String[]) r2;	 Catch:{ all -> 0x00d4 }
        if (r2 == 0) goto L_0x0092;
    L_0x0046:
        r4 = r2.length;	 Catch:{ all -> 0x00d4 }
        if (r4 != 0) goto L_0x004a;
    L_0x0049:
        goto L_0x0092;
    L_0x004a:
        r4 = "Error opening database for deleteEntries.";
        r4 = r10.zzau(r4);	 Catch:{ all -> 0x00d4 }
        if (r4 == 0) goto L_0x0092;
    L_0x0052:
        r5 = "%s in (%s)";
        r6 = 2;
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x00d4 }
        r7 = "ID";
        r6[r3] = r7;	 Catch:{ all -> 0x00d4 }
        r3 = 1;
        r7 = ",";
        r8 = r2.length;	 Catch:{ all -> 0x00d4 }
        r9 = "?";
        r8 = java.util.Collections.nCopies(r8, r9);	 Catch:{ all -> 0x00d4 }
        r7 = android.text.TextUtils.join(r7, r8);	 Catch:{ all -> 0x00d4 }
        r6[r3] = r7;	 Catch:{ all -> 0x00d4 }
        r3 = java.lang.String.format(r5, r6);	 Catch:{ all -> 0x00d4 }
        r5 = "datalayer";
        r4.delete(r5, r3, r2);	 Catch:{ SQLiteException -> 0x0075 }
        goto L_0x0092;
    L_0x0075:
        r3 = "Error deleting entries ";
        r2 = java.util.Arrays.toString(r2);	 Catch:{ all -> 0x00d4 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00d4 }
        r4 = r2.length();	 Catch:{ all -> 0x00d4 }
        if (r4 == 0) goto L_0x008a;
    L_0x0085:
        r2 = r3.concat(r2);	 Catch:{ all -> 0x00d4 }
        goto L_0x008f;
    L_0x008a:
        r2 = new java.lang.String;	 Catch:{ all -> 0x00d4 }
        r2.<init>(r3);	 Catch:{ all -> 0x00d4 }
    L_0x008f:
        com.google.android.gms.tagmanager.zzdi.zzac(r2);	 Catch:{ all -> 0x00d4 }
    L_0x0092:
        r0 = r0 + r12;
        r12 = "Error opening database for writeEntryToDatabase.";
        r12 = r10.zzau(r12);	 Catch:{ all -> 0x00d4 }
        if (r12 == 0) goto L_0x00cf;
    L_0x009b:
        r11 = r11.iterator();	 Catch:{ all -> 0x00d4 }
    L_0x009f:
        r13 = r11.hasNext();	 Catch:{ all -> 0x00d4 }
        if (r13 == 0) goto L_0x00cf;
    L_0x00a5:
        r13 = r11.next();	 Catch:{ all -> 0x00d4 }
        r13 = (com.google.android.gms.tagmanager.zzay) r13;	 Catch:{ all -> 0x00d4 }
        r2 = new android.content.ContentValues;	 Catch:{ all -> 0x00d4 }
        r2.<init>();	 Catch:{ all -> 0x00d4 }
        r3 = "expires";
        r4 = java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x00d4 }
        r2.put(r3, r4);	 Catch:{ all -> 0x00d4 }
        r3 = "key";
        r4 = r13.zzagg;	 Catch:{ all -> 0x00d4 }
        r2.put(r3, r4);	 Catch:{ all -> 0x00d4 }
        r3 = "value";
        r13 = r13.zzagh;	 Catch:{ all -> 0x00d4 }
        r2.put(r3, r13);	 Catch:{ all -> 0x00d4 }
        r13 = "datalayer";
        r3 = 0;
        r12.insert(r13, r3, r2);	 Catch:{ all -> 0x00d4 }
        goto L_0x009f;
    L_0x00cf:
        r10.zzhw();	 Catch:{ all -> 0x00d9 }
        monitor-exit(r10);
        return;
    L_0x00d4:
        r11 = move-exception;
        r10.zzhw();	 Catch:{ all -> 0x00d9 }
        throw r11;	 Catch:{ all -> 0x00d9 }
    L_0x00d9:
        r11 = move-exception;
        monitor-exit(r10);
        goto L_0x00dd;
    L_0x00dc:
        throw r11;
    L_0x00dd:
        goto L_0x00dc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzat.zzb(java.util.List, long):void");
    }

    private final List<zzay> zzhu() {
        SQLiteDatabase zzau = zzau("Error opening database for loadSerialized.");
        List<zzay> arrayList = new ArrayList();
        if (zzau == null) {
            return arrayList;
        }
        Cursor query = zzau.query("datalayer", new String[]{"key", ConditionalUserProperty.VALUE}, null, null, null, null, "ID", null);
        while (query.moveToNext()) {
            try {
                arrayList.add(new zzay(query.getString(0), query.getBlob(1)));
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    private final void zzat(String str) {
        SQLiteDatabase zzau = zzau("Error opening database for clearKeysWithPrefix.");
        if (zzau != null) {
            StringBuilder stringBuilder;
            try {
                int delete = zzau.delete("datalayer", "key = ? OR key LIKE ?", new String[]{str, String.valueOf(str).concat(".%")});
                stringBuilder = new StringBuilder(25);
                stringBuilder.append("Cleared ");
                stringBuilder.append(delete);
                stringBuilder.append(" items");
                zzdi.zzab(stringBuilder.toString());
            } catch (SQLiteException e) {
                String valueOf = String.valueOf(e);
                stringBuilder = new StringBuilder((String.valueOf(str).length() + 44) + String.valueOf(valueOf).length());
                stringBuilder.append("Error deleting entries with key prefix: ");
                stringBuilder.append(str);
                stringBuilder.append(" (");
                stringBuilder.append(valueOf);
                stringBuilder.append(").");
                zzdi.zzac(stringBuilder.toString());
            } finally {
                zzhw();
            }
        }
    }

    private final void zzl(long j) {
        SQLiteDatabase zzau = zzau("Error opening database for deleteOlderThan.");
        if (zzau != null) {
            try {
                int delete = zzau.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)});
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Deleted ");
                stringBuilder.append(delete);
                stringBuilder.append(" expired items");
                zzdi.zzab(stringBuilder.toString());
            } catch (SQLiteException unused) {
                zzdi.zzac("Error deleting old entries.");
            }
        }
    }

    private final List<String> zzu(int i) {
        String str = "ID";
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            zzdi.zzac("Invalid maxEntries specified. Skipping.");
            return arrayList;
        }
        SQLiteDatabase zzau = zzau("Error opening database for peekEntryIds.");
        if (zzau == null) {
            return arrayList;
        }
        Cursor cursor = null;
        try {
            cursor = zzau.query("datalayer", new String[]{str}, null, null, null, null, String.format("%s ASC", new Object[]{str}), Integer.toString(i));
            if (cursor.moveToFirst()) {
                do {
                    arrayList.add(String.valueOf(cursor.getLong(0)));
                } while (cursor.moveToNext());
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (SQLiteException e) {
            str = "Error in peekEntries fetching entryIds: ";
            String valueOf = String.valueOf(e.getMessage());
            zzdi.zzac(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0024 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|18|14) */
    /* JADX WARNING: Missing block: B:13:?, code skipped:
            com.google.android.gms.tagmanager.zzdi.zzac("Error getting numStoredEntries");
     */
    /* JADX WARNING: Missing block: B:15:0x002f, code skipped:
            if (r2 != null) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:16:0x0031, code skipped:
            r2.close();
     */
    private final int zzhv() {
        /*
        r4 = this;
        r0 = "Error opening database for getNumStoredEntries.";
        r0 = r4.zzau(r0);
        r1 = 0;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        return r1;
    L_0x000a:
        r2 = 0;
        r3 = "SELECT COUNT(*) from datalayer";
        r2 = r0.rawQuery(r3, r2);	 Catch:{ SQLiteException -> 0x0024 }
        r0 = r2.moveToFirst();	 Catch:{ SQLiteException -> 0x0024 }
        if (r0 == 0) goto L_0x001c;
    L_0x0017:
        r0 = r2.getLong(r1);	 Catch:{ SQLiteException -> 0x0024 }
        r1 = (int) r0;
    L_0x001c:
        if (r2 == 0) goto L_0x002e;
    L_0x001e:
        r2.close();
        goto L_0x002e;
    L_0x0022:
        r0 = move-exception;
        goto L_0x002f;
    L_0x0024:
        r0 = "Error getting numStoredEntries";
        com.google.android.gms.tagmanager.zzdi.zzac(r0);	 Catch:{ all -> 0x0022 }
        if (r2 == 0) goto L_0x002e;
    L_0x002b:
        r2.close();
    L_0x002e:
        return r1;
    L_0x002f:
        if (r2 == 0) goto L_0x0034;
    L_0x0031:
        r2.close();
    L_0x0034:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzat.zzhv():int");
    }

    private final SQLiteDatabase zzau(String str) {
        try {
            str = this.zzafz.getWritableDatabase();
            return str;
        } catch (SQLiteException unused) {
            zzdi.zzac(str);
            return null;
        }
    }

    private final void zzhw() {
        try {
            this.zzafz.close();
        } catch (SQLiteException unused) {
        }
    }
}

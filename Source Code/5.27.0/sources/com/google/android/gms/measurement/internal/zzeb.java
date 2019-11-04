package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzeb extends zzg {
    private final zzea zzjv = new zzea(this, getContext(), "google_app_measurement_local.db");
    private boolean zzjw;

    zzeb(zzfj zzfj) {
        super(zzfj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzbk() {
        return false;
    }

    @WorkerThread
    public final void resetAnalyticsData() {
        zzm();
        zzo();
        try {
            int delete = getWritableDatabase().delete("messages", null, null) + 0;
            if (delete > 0) {
                zzab().zzgs().zza("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error resetting local analytics data. error", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0131 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00de A:{SYNTHETIC, Splitter:B:57:0x00de} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0131 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A:{SYNTHETIC, ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), Splitter:B:9:0x0033} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00de A:{SYNTHETIC, Splitter:B:57:0x00de} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0131 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0131 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0131 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00de A:{SYNTHETIC, Splitter:B:57:0x00de} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0131 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0140  */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:14:0x003b, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:15:0x003c, code skipped:
            r13 = null;
     */
    /* JADX WARNING: Missing block: B:16:0x003f, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:48:0x00cd, code skipped:
            r8 = null;
     */
    /* JADX WARNING: Missing block: B:59:0x00e2, code skipped:
            if (r8.inTransaction() != false) goto L_0x00e4;
     */
    /* JADX WARNING: Missing block: B:60:0x00e4, code skipped:
            r8.endTransaction();
     */
    /* JADX WARNING: Missing block: B:63:0x00f7, code skipped:
            r13.close();
     */
    /* JADX WARNING: Missing block: B:65:0x00fc, code skipped:
            r8.close();
     */
    /* JADX WARNING: Missing block: B:66:0x0100, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:67:0x0101, code skipped:
            r10 = r8;
     */
    /* JADX WARNING: Missing block: B:75:0x010d, code skipped:
            r8.close();
     */
    /* JADX WARNING: Missing block: B:77:0x0112, code skipped:
            r10.close();
     */
    /* JADX WARNING: Missing block: B:90:0x013b, code skipped:
            r13.close();
     */
    /* JADX WARNING: Missing block: B:92:0x0140, code skipped:
            r10.close();
     */
    @androidx.annotation.WorkerThread
    private final boolean zza(int r18, byte[] r19) {
        /*
        r17 = this;
        r1 = r17;
        r2 = "Error writing entry to local database";
        r17.zzm();
        r17.zzo();
        r0 = r1.zzjw;
        r3 = 0;
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        return r3;
    L_0x0010:
        r4 = new android.content.ContentValues;
        r4.<init>();
        r0 = java.lang.Integer.valueOf(r18);
        r5 = "type";
        r4.put(r5, r0);
        r0 = "entry";
        r5 = r19;
        r4.put(r0, r5);
        r5 = 5;
        r6 = 0;
        r7 = 5;
    L_0x0029:
        if (r6 >= r5) goto L_0x0144;
    L_0x002b:
        r8 = 0;
        r9 = 1;
        r10 = r17.getWritableDatabase();	 Catch:{ SQLiteFullException -> 0x0116, SQLiteDatabaseLockedException -> 0x0103, SQLiteException -> 0x00d9, all -> 0x00d3 }
        if (r10 != 0) goto L_0x0042;
    L_0x0033:
        r1.zzjw = r9;	 Catch:{ SQLiteFullException -> 0x003f, SQLiteDatabaseLockedException -> 0x00cd, SQLiteException -> 0x003b }
        if (r10 == 0) goto L_0x003a;
    L_0x0037:
        r10.close();
    L_0x003a:
        return r3;
    L_0x003b:
        r0 = move-exception;
        r13 = r8;
        goto L_0x00cb;
    L_0x003f:
        r0 = move-exception;
        goto L_0x0119;
    L_0x0042:
        r10.beginTransaction();	 Catch:{ SQLiteFullException -> 0x00d0, SQLiteDatabaseLockedException -> 0x00cd, SQLiteException -> 0x00c8, all -> 0x00c3 }
        r11 = 0;
        r0 = "select count(1) from messages";
        r13 = r10.rawQuery(r0, r8);	 Catch:{ SQLiteFullException -> 0x00d0, SQLiteDatabaseLockedException -> 0x00cd, SQLiteException -> 0x00c8, all -> 0x00c3 }
        if (r13 == 0) goto L_0x0064;
    L_0x004f:
        r0 = r13.moveToFirst();	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        if (r0 == 0) goto L_0x0064;
    L_0x0055:
        r11 = r13.getLong(r3);	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        goto L_0x0064;
    L_0x005a:
        r0 = move-exception;
        goto L_0x0139;
    L_0x005d:
        r0 = move-exception;
        goto L_0x00cb;
    L_0x0060:
        r0 = move-exception;
        r8 = r13;
        goto L_0x0119;
    L_0x0064:
        r0 = "messages";
        r14 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;
        r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1));
        if (r16 < 0) goto L_0x00ab;
    L_0x006d:
        r16 = r17.zzab();	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r5 = r16.zzgk();	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r8 = "Data loss, local db full";
        r5.zzao(r8);	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r14 = r14 - r11;
        r11 = 1;
        r14 = r14 + r11;
        r5 = "rowid in (select rowid from messages order by rowid asc limit ?)";
        r8 = new java.lang.String[r9];	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r11 = java.lang.Long.toString(r14);	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r8[r3] = r11;	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r5 = r10.delete(r0, r5, r8);	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r11 = (long) r5;	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r5 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1));
        if (r5 == 0) goto L_0x00ab;
    L_0x0091:
        r5 = r17.zzab();	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r5 = r5.zzgk();	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r8 = "Different delete count than expected in local db. expected, received, difference";
        r3 = java.lang.Long.valueOf(r14);	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r9 = java.lang.Long.valueOf(r11);	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r14 = r14 - r11;
        r11 = java.lang.Long.valueOf(r14);	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r5.zza(r8, r3, r9, r11);	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
    L_0x00ab:
        r3 = 0;
        r10.insertOrThrow(r0, r3, r4);	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r10.setTransactionSuccessful();	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        r10.endTransaction();	 Catch:{ SQLiteFullException -> 0x0060, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005d, all -> 0x005a }
        if (r13 == 0) goto L_0x00ba;
    L_0x00b7:
        r13.close();
    L_0x00ba:
        if (r10 == 0) goto L_0x00bf;
    L_0x00bc:
        r10.close();
    L_0x00bf:
        r2 = 1;
        return r2;
    L_0x00c1:
        r8 = r13;
        goto L_0x0105;
    L_0x00c3:
        r0 = move-exception;
        r3 = r8;
        r13 = r3;
        goto L_0x0139;
    L_0x00c8:
        r0 = move-exception;
        r3 = r8;
        r13 = r3;
    L_0x00cb:
        r8 = r10;
        goto L_0x00dc;
    L_0x00cd:
        r3 = r8;
        r8 = r3;
        goto L_0x0105;
    L_0x00d0:
        r0 = move-exception;
        r3 = r8;
        goto L_0x0119;
    L_0x00d3:
        r0 = move-exception;
        r3 = r8;
        r10 = r3;
        r13 = r10;
        goto L_0x0139;
    L_0x00d9:
        r0 = move-exception;
        r3 = r8;
        r13 = r8;
    L_0x00dc:
        if (r8 == 0) goto L_0x00e7;
    L_0x00de:
        r3 = r8.inTransaction();	 Catch:{ all -> 0x0100 }
        if (r3 == 0) goto L_0x00e7;
    L_0x00e4:
        r8.endTransaction();	 Catch:{ all -> 0x0100 }
    L_0x00e7:
        r3 = r17.zzab();	 Catch:{ all -> 0x0100 }
        r3 = r3.zzgk();	 Catch:{ all -> 0x0100 }
        r3.zza(r2, r0);	 Catch:{ all -> 0x0100 }
        r3 = 1;
        r1.zzjw = r3;	 Catch:{ all -> 0x0100 }
        if (r13 == 0) goto L_0x00fa;
    L_0x00f7:
        r13.close();
    L_0x00fa:
        if (r8 == 0) goto L_0x0131;
    L_0x00fc:
        r8.close();
        goto L_0x0131;
    L_0x0100:
        r0 = move-exception;
        r10 = r8;
        goto L_0x0139;
    L_0x0103:
        r3 = r8;
        r10 = r8;
    L_0x0105:
        r11 = (long) r7;
        android.os.SystemClock.sleep(r11);	 Catch:{ all -> 0x0137 }
        r7 = r7 + 20;
        if (r8 == 0) goto L_0x0110;
    L_0x010d:
        r8.close();
    L_0x0110:
        if (r10 == 0) goto L_0x0131;
    L_0x0112:
        r10.close();
        goto L_0x0131;
    L_0x0116:
        r0 = move-exception;
        r3 = r8;
        r10 = r8;
    L_0x0119:
        r3 = r17.zzab();	 Catch:{ all -> 0x0137 }
        r3 = r3.zzgk();	 Catch:{ all -> 0x0137 }
        r3.zza(r2, r0);	 Catch:{ all -> 0x0137 }
        r3 = 1;
        r1.zzjw = r3;	 Catch:{ all -> 0x0137 }
        if (r8 == 0) goto L_0x012c;
    L_0x0129:
        r8.close();
    L_0x012c:
        if (r10 == 0) goto L_0x0131;
    L_0x012e:
        r10.close();
    L_0x0131:
        r6 = r6 + 1;
        r3 = 0;
        r5 = 5;
        goto L_0x0029;
    L_0x0137:
        r0 = move-exception;
        r13 = r8;
    L_0x0139:
        if (r13 == 0) goto L_0x013e;
    L_0x013b:
        r13.close();
    L_0x013e:
        if (r10 == 0) goto L_0x0143;
    L_0x0140:
        r10.close();
    L_0x0143:
        throw r0;
    L_0x0144:
        r0 = r17.zzab();
        r0 = r0.zzgn();
        r2 = "Failed to write entry to local database";
        r0.zzao(r2);
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeb.zza(int, byte[]):boolean");
    }

    public final boolean zza(zzai zzai) {
        Parcel obtain = Parcel.obtain();
        zzai.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zza(0, marshall);
        }
        zzab().zzgn().zzao("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zza(zzjn zzjn) {
        Parcel obtain = Parcel.obtain();
        zzjn.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zza(1, marshall);
        }
        zzab().zzgn().zzao("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzc(zzq zzq) {
        zzz();
        byte[] zza = zzjs.zza((Parcelable) zzq);
        if (zza.length <= 131072) {
            return zza(2, zza);
        }
        zzab().zzgn().zzao("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0155 */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0205 A:{SYNTHETIC, Splitter:B:150:0x0205} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0205 A:{SYNTHETIC, Splitter:B:150:0x0205} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0205 A:{SYNTHETIC, Splitter:B:150:0x0205} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0205 A:{SYNTHETIC, Splitter:B:150:0x0205} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A:{SYNTHETIC, ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), Splitter:B:12:0x0029} */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0205 A:{SYNTHETIC, Splitter:B:150:0x0205} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x025f  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00ef */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A:{SYNTHETIC, ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), Splitter:B:12:0x0029} */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0205 A:{SYNTHETIC, Splitter:B:150:0x0205} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0253 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x025f  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0121 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:61|62|63|64|199) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:76|77|78|79) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:91|92|93|94) */
    /* JADX WARNING: Missing block: B:39:0x0092, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:40:0x0093, code skipped:
            r24 = r15;
     */
    /* JADX WARNING: Missing block: B:41:0x0097, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:42:0x0098, code skipped:
            r24 = r15;
     */
    /* JADX WARNING: Missing block: B:43:0x009c, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:44:0x009d, code skipped:
            r24 = r15;
     */
    /* JADX WARNING: Missing block: B:62:?, code skipped:
            zzab().zzgk().zzao("Failed to load event from local database");
     */
    /* JADX WARNING: Missing block: B:64:?, code skipped:
            r11.recycle();
     */
    /* JADX WARNING: Missing block: B:77:?, code skipped:
            zzab().zzgk().zzao(r13);
     */
    /* JADX WARNING: Missing block: B:79:?, code skipped:
            r11.recycle();
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:92:?, code skipped:
            zzab().zzgk().zzao(r13);
     */
    /* JADX WARNING: Missing block: B:94:?, code skipped:
            r11.recycle();
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:133:0x01ec, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:134:0x01ed, code skipped:
            r13 = r15;
     */
    /* JADX WARNING: Missing block: B:136:0x01f1, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:137:0x01f2, code skipped:
            r13 = r15;
     */
    /* JADX WARNING: Missing block: B:139:0x01f5, code skipped:
            r13 = r15;
     */
    /* JADX WARNING: Missing block: B:142:0x01f8, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:143:0x01f9, code skipped:
            r13 = r15;
     */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zzc(int r24) {
        /*
        r23 = this;
        r1 = r23;
        r2 = "Error reading entries from local database";
        r23.zzo();
        r23.zzm();
        r0 = r1.zzjw;
        r3 = 0;
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        return r3;
    L_0x0010:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r0 = r23.zzcg();
        if (r0 != 0) goto L_0x001c;
    L_0x001b:
        return r4;
    L_0x001c:
        r5 = 5;
        r6 = 0;
        r7 = 0;
        r8 = 5;
    L_0x0020:
        if (r7 >= r5) goto L_0x0263;
    L_0x0022:
        r9 = 1;
        r15 = r23.getWritableDatabase();	 Catch:{ SQLiteFullException -> 0x0239, SQLiteDatabaseLockedException -> 0x0226, SQLiteException -> 0x0200, all -> 0x01fc }
        if (r15 != 0) goto L_0x0040;
    L_0x0029:
        r1.zzjw = r9;	 Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x0036, all -> 0x0031 }
        if (r15 == 0) goto L_0x0030;
    L_0x002d:
        r15.close();
    L_0x0030:
        return r3;
    L_0x0031:
        r0 = move-exception;
        r10 = r3;
        r13 = r15;
        goto L_0x0258;
    L_0x0036:
        r0 = move-exception;
        r10 = r3;
        r13 = r15;
        goto L_0x0203;
    L_0x003b:
        r0 = move-exception;
        r10 = r3;
        r13 = r15;
        goto L_0x023c;
    L_0x0040:
        r15.beginTransaction();	 Catch:{ SQLiteFullException -> 0x01f8, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x01f1, all -> 0x01ec }
        r0 = r23.zzad();	 Catch:{ SQLiteFullException -> 0x01f8, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x01f1, all -> 0x01ec }
        r10 = com.google.android.gms.measurement.internal.zzak.zzjd;	 Catch:{ SQLiteFullException -> 0x01f8, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x01f1, all -> 0x01ec }
        r0 = r0.zza(r10);	 Catch:{ SQLiteFullException -> 0x01f8, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x01f1, all -> 0x01ec }
        r10 = 100;
        r11 = "entry";
        r12 = "type";
        r13 = "rowid";
        r19 = -1;
        if (r0 == 0) goto L_0x00a1;
    L_0x005a:
        r16 = zza(r15);	 Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x0097, all -> 0x0092 }
        r0 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1));
        if (r0 == 0) goto L_0x006d;
    L_0x0062:
        r0 = "rowid<?";
        r14 = new java.lang.String[r9];	 Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x0036, all -> 0x0031 }
        r16 = java.lang.String.valueOf(r16);	 Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x0036, all -> 0x0031 }
        r14[r6] = r16;	 Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x0036, all -> 0x0031 }
        goto L_0x006f;
    L_0x006d:
        r0 = r3;
        r14 = r0;
    L_0x006f:
        r16 = "messages";
        r12 = new java.lang.String[]{r13, r12, r11};	 Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x0097, all -> 0x0092 }
        r17 = 0;
        r18 = 0;
        r21 = "rowid asc";
        r22 = java.lang.Integer.toString(r10);	 Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x0097, all -> 0x0092 }
        r10 = r15;
        r11 = r16;
        r13 = r0;
        r24 = r15;
        r15 = r17;
        r16 = r18;
        r17 = r21;
        r18 = r22;
        r0 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18);	 Catch:{ SQLiteFullException -> 0x01e8, SQLiteDatabaseLockedException -> 0x01e5, SQLiteException -> 0x01e1, all -> 0x01dd }
        goto L_0x00bb;
    L_0x0092:
        r0 = move-exception;
        r24 = r15;
        goto L_0x01de;
    L_0x0097:
        r0 = move-exception;
        r24 = r15;
        goto L_0x01e2;
    L_0x009c:
        r0 = move-exception;
        r24 = r15;
        goto L_0x01e9;
    L_0x00a1:
        r24 = r15;
        r0 = "messages";
        r12 = new java.lang.String[]{r13, r12, r11};	 Catch:{ SQLiteFullException -> 0x01e8, SQLiteDatabaseLockedException -> 0x01e5, SQLiteException -> 0x01e1, all -> 0x01dd }
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = "rowid asc";
        r18 = java.lang.Integer.toString(r10);	 Catch:{ SQLiteFullException -> 0x01e8, SQLiteDatabaseLockedException -> 0x01e5, SQLiteException -> 0x01e1, all -> 0x01dd }
        r10 = r24;
        r11 = r0;
        r0 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18);	 Catch:{ SQLiteFullException -> 0x01e8, SQLiteDatabaseLockedException -> 0x01e5, SQLiteException -> 0x01e1, all -> 0x01dd }
    L_0x00bb:
        r10 = r0;
    L_0x00bc:
        r0 = r10.moveToNext();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        if (r0 == 0) goto L_0x0190;
    L_0x00c2:
        r19 = r10.getLong(r6);	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r0 = r10.getInt(r9);	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r11 = 2;
        r12 = r10.getBlob(r11);	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        if (r0 != 0) goto L_0x0104;
    L_0x00d1:
        r11 = android.os.Parcel.obtain();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r0 = r12.length;	 Catch:{ ParseException -> 0x00ef }
        r11.unmarshall(r12, r6, r0);	 Catch:{ ParseException -> 0x00ef }
        r11.setDataPosition(r6);	 Catch:{ ParseException -> 0x00ef }
        r0 = com.google.android.gms.measurement.internal.zzai.CREATOR;	 Catch:{ ParseException -> 0x00ef }
        r0 = r0.createFromParcel(r11);	 Catch:{ ParseException -> 0x00ef }
        r0 = (com.google.android.gms.measurement.internal.zzai) r0;	 Catch:{ ParseException -> 0x00ef }
        r11.recycle();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        if (r0 == 0) goto L_0x00bc;
    L_0x00e9:
        r4.add(r0);	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        goto L_0x00bc;
    L_0x00ed:
        r0 = move-exception;
        goto L_0x0100;
    L_0x00ef:
        r0 = r23.zzab();	 Catch:{ all -> 0x00ed }
        r0 = r0.zzgk();	 Catch:{ all -> 0x00ed }
        r12 = "Failed to load event from local database";
        r0.zzao(r12);	 Catch:{ all -> 0x00ed }
        r11.recycle();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        goto L_0x00bc;
    L_0x0100:
        r11.recycle();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        throw r0;	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
    L_0x0104:
        r13 = "Failed to load user property from local database";
        if (r0 != r9) goto L_0x013a;
    L_0x0108:
        r11 = android.os.Parcel.obtain();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r0 = r12.length;	 Catch:{ ParseException -> 0x0121 }
        r11.unmarshall(r12, r6, r0);	 Catch:{ ParseException -> 0x0121 }
        r11.setDataPosition(r6);	 Catch:{ ParseException -> 0x0121 }
        r0 = com.google.android.gms.measurement.internal.zzjn.CREATOR;	 Catch:{ ParseException -> 0x0121 }
        r0 = r0.createFromParcel(r11);	 Catch:{ ParseException -> 0x0121 }
        r0 = (com.google.android.gms.measurement.internal.zzjn) r0;	 Catch:{ ParseException -> 0x0121 }
        r11.recycle();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        goto L_0x0130;
    L_0x011f:
        r0 = move-exception;
        goto L_0x0136;
    L_0x0121:
        r0 = r23.zzab();	 Catch:{ all -> 0x011f }
        r0 = r0.zzgk();	 Catch:{ all -> 0x011f }
        r0.zzao(r13);	 Catch:{ all -> 0x011f }
        r11.recycle();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r0 = r3;
    L_0x0130:
        if (r0 == 0) goto L_0x00bc;
    L_0x0132:
        r4.add(r0);	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        goto L_0x00bc;
    L_0x0136:
        r11.recycle();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        throw r0;	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
    L_0x013a:
        if (r0 != r11) goto L_0x016f;
    L_0x013c:
        r11 = android.os.Parcel.obtain();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r0 = r12.length;	 Catch:{ ParseException -> 0x0155 }
        r11.unmarshall(r12, r6, r0);	 Catch:{ ParseException -> 0x0155 }
        r11.setDataPosition(r6);	 Catch:{ ParseException -> 0x0155 }
        r0 = com.google.android.gms.measurement.internal.zzq.CREATOR;	 Catch:{ ParseException -> 0x0155 }
        r0 = r0.createFromParcel(r11);	 Catch:{ ParseException -> 0x0155 }
        r0 = (com.google.android.gms.measurement.internal.zzq) r0;	 Catch:{ ParseException -> 0x0155 }
        r11.recycle();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        goto L_0x0164;
    L_0x0153:
        r0 = move-exception;
        goto L_0x016b;
    L_0x0155:
        r0 = r23.zzab();	 Catch:{ all -> 0x0153 }
        r0 = r0.zzgk();	 Catch:{ all -> 0x0153 }
        r0.zzao(r13);	 Catch:{ all -> 0x0153 }
        r11.recycle();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r0 = r3;
    L_0x0164:
        if (r0 == 0) goto L_0x00bc;
    L_0x0166:
        r4.add(r0);	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        goto L_0x00bc;
    L_0x016b:
        r11.recycle();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        throw r0;	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
    L_0x016f:
        r11 = 3;
        if (r0 != r11) goto L_0x0181;
    L_0x0172:
        r0 = r23.zzab();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r0 = r0.zzgn();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r11 = "Skipping app launch break";
        r0.zzao(r11);	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        goto L_0x00bc;
    L_0x0181:
        r0 = r23.zzab();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r0 = r0.zzgk();	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r11 = "Unknown record type in local database";
        r0.zzao(r11);	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        goto L_0x00bc;
    L_0x0190:
        r0 = "messages";
        r11 = "rowid <= ?";
        r12 = new java.lang.String[r9];	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r13 = java.lang.Long.toString(r19);	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r12[r6] = r13;	 Catch:{ SQLiteFullException -> 0x01d8, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01d0, all -> 0x01cb }
        r13 = r24;
        r0 = r13.delete(r0, r11, r12);	 Catch:{ SQLiteFullException -> 0x01c8, SQLiteDatabaseLockedException -> 0x0228, SQLiteException -> 0x01c6 }
        r11 = r4.size();	 Catch:{ SQLiteFullException -> 0x01c8, SQLiteDatabaseLockedException -> 0x0228, SQLiteException -> 0x01c6 }
        if (r0 >= r11) goto L_0x01b5;
    L_0x01a8:
        r0 = r23.zzab();	 Catch:{ SQLiteFullException -> 0x01c8, SQLiteDatabaseLockedException -> 0x0228, SQLiteException -> 0x01c6 }
        r0 = r0.zzgk();	 Catch:{ SQLiteFullException -> 0x01c8, SQLiteDatabaseLockedException -> 0x0228, SQLiteException -> 0x01c6 }
        r11 = "Fewer entries removed from local database than expected";
        r0.zzao(r11);	 Catch:{ SQLiteFullException -> 0x01c8, SQLiteDatabaseLockedException -> 0x0228, SQLiteException -> 0x01c6 }
    L_0x01b5:
        r13.setTransactionSuccessful();	 Catch:{ SQLiteFullException -> 0x01c8, SQLiteDatabaseLockedException -> 0x0228, SQLiteException -> 0x01c6 }
        r13.endTransaction();	 Catch:{ SQLiteFullException -> 0x01c8, SQLiteDatabaseLockedException -> 0x0228, SQLiteException -> 0x01c6 }
        if (r10 == 0) goto L_0x01c0;
    L_0x01bd:
        r10.close();
    L_0x01c0:
        if (r13 == 0) goto L_0x01c5;
    L_0x01c2:
        r13.close();
    L_0x01c5:
        return r4;
    L_0x01c6:
        r0 = move-exception;
        goto L_0x0203;
    L_0x01c8:
        r0 = move-exception;
        goto L_0x023c;
    L_0x01cb:
        r0 = move-exception;
        r13 = r24;
        goto L_0x0258;
    L_0x01d0:
        r0 = move-exception;
        r13 = r24;
        goto L_0x0203;
    L_0x01d4:
        r13 = r24;
        goto L_0x0228;
    L_0x01d8:
        r0 = move-exception;
        r13 = r24;
        goto L_0x023c;
    L_0x01dd:
        r0 = move-exception;
    L_0x01de:
        r13 = r24;
        goto L_0x01ee;
    L_0x01e1:
        r0 = move-exception;
    L_0x01e2:
        r13 = r24;
        goto L_0x01f3;
    L_0x01e5:
        r13 = r24;
        goto L_0x01f6;
    L_0x01e8:
        r0 = move-exception;
    L_0x01e9:
        r13 = r24;
        goto L_0x01fa;
    L_0x01ec:
        r0 = move-exception;
        r13 = r15;
    L_0x01ee:
        r10 = r3;
        goto L_0x0258;
    L_0x01f1:
        r0 = move-exception;
        r13 = r15;
    L_0x01f3:
        r10 = r3;
        goto L_0x0203;
    L_0x01f5:
        r13 = r15;
    L_0x01f6:
        r10 = r3;
        goto L_0x0228;
    L_0x01f8:
        r0 = move-exception;
        r13 = r15;
    L_0x01fa:
        r10 = r3;
        goto L_0x023c;
    L_0x01fc:
        r0 = move-exception;
        r10 = r3;
        r13 = r10;
        goto L_0x0258;
    L_0x0200:
        r0 = move-exception;
        r10 = r3;
        r13 = r10;
    L_0x0203:
        if (r13 == 0) goto L_0x020e;
    L_0x0205:
        r11 = r13.inTransaction();	 Catch:{ all -> 0x0257 }
        if (r11 == 0) goto L_0x020e;
    L_0x020b:
        r13.endTransaction();	 Catch:{ all -> 0x0257 }
    L_0x020e:
        r11 = r23.zzab();	 Catch:{ all -> 0x0257 }
        r11 = r11.zzgk();	 Catch:{ all -> 0x0257 }
        r11.zza(r2, r0);	 Catch:{ all -> 0x0257 }
        r1.zzjw = r9;	 Catch:{ all -> 0x0257 }
        if (r10 == 0) goto L_0x0220;
    L_0x021d:
        r10.close();
    L_0x0220:
        if (r13 == 0) goto L_0x0253;
    L_0x0222:
        r13.close();
        goto L_0x0253;
    L_0x0226:
        r10 = r3;
        r13 = r10;
    L_0x0228:
        r11 = (long) r8;
        android.os.SystemClock.sleep(r11);	 Catch:{ all -> 0x0257 }
        r8 = r8 + 20;
        if (r10 == 0) goto L_0x0233;
    L_0x0230:
        r10.close();
    L_0x0233:
        if (r13 == 0) goto L_0x0253;
    L_0x0235:
        r13.close();
        goto L_0x0253;
    L_0x0239:
        r0 = move-exception;
        r10 = r3;
        r13 = r10;
    L_0x023c:
        r11 = r23.zzab();	 Catch:{ all -> 0x0257 }
        r11 = r11.zzgk();	 Catch:{ all -> 0x0257 }
        r11.zza(r2, r0);	 Catch:{ all -> 0x0257 }
        r1.zzjw = r9;	 Catch:{ all -> 0x0257 }
        if (r10 == 0) goto L_0x024e;
    L_0x024b:
        r10.close();
    L_0x024e:
        if (r13 == 0) goto L_0x0253;
    L_0x0250:
        r13.close();
    L_0x0253:
        r7 = r7 + 1;
        goto L_0x0020;
    L_0x0257:
        r0 = move-exception;
    L_0x0258:
        if (r10 == 0) goto L_0x025d;
    L_0x025a:
        r10.close();
    L_0x025d:
        if (r13 == 0) goto L_0x0262;
    L_0x025f:
        r13.close();
    L_0x0262:
        throw r0;
    L_0x0263:
        r0 = r23.zzab();
        r0 = r0.zzgn();
        r2 = "Failed to read events from database in reasonable time";
        r0.zzao(r2);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeb.zzc(int):java.util.List");
    }

    @WorkerThread
    public final boolean zzgh() {
        return zza(3, new byte[0]);
    }

    /* JADX WARNING: Missing block: B:43:0x008a, code skipped:
            r3 = r3 + 1;
     */
    @androidx.annotation.WorkerThread
    public final boolean zzgi() {
        /*
        r11 = this;
        r0 = "Error deleting app launch break from local database";
        r11.zzo();
        r11.zzm();
        r1 = r11.zzjw;
        r2 = 0;
        if (r1 == 0) goto L_0x000e;
    L_0x000d:
        return r2;
    L_0x000e:
        r1 = r11.zzcg();
        if (r1 != 0) goto L_0x0015;
    L_0x0014:
        return r2;
    L_0x0015:
        r1 = 5;
        r3 = 0;
        r4 = 5;
    L_0x0018:
        if (r3 >= r1) goto L_0x0093;
    L_0x001a:
        r5 = 0;
        r6 = 1;
        r5 = r11.getWritableDatabase();	 Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
        if (r5 != 0) goto L_0x002a;
    L_0x0022:
        r11.zzjw = r6;	 Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
        if (r5 == 0) goto L_0x0029;
    L_0x0026:
        r5.close();
    L_0x0029:
        return r2;
    L_0x002a:
        r5.beginTransaction();	 Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
        r7 = "messages";
        r8 = "type == ?";
        r9 = new java.lang.String[r6];	 Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
        r10 = 3;
        r10 = java.lang.Integer.toString(r10);	 Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
        r9[r2] = r10;	 Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
        r5.delete(r7, r8, r9);	 Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
        r5.setTransactionSuccessful();	 Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
        r5.endTransaction();	 Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
        if (r5 == 0) goto L_0x0049;
    L_0x0046:
        r5.close();
    L_0x0049:
        return r6;
    L_0x004a:
        r0 = move-exception;
        goto L_0x008d;
    L_0x004c:
        r7 = move-exception;
        if (r5 == 0) goto L_0x0058;
    L_0x004f:
        r8 = r5.inTransaction();	 Catch:{ all -> 0x004a }
        if (r8 == 0) goto L_0x0058;
    L_0x0055:
        r5.endTransaction();	 Catch:{ all -> 0x004a }
    L_0x0058:
        r8 = r11.zzab();	 Catch:{ all -> 0x004a }
        r8 = r8.zzgk();	 Catch:{ all -> 0x004a }
        r8.zza(r0, r7);	 Catch:{ all -> 0x004a }
        r11.zzjw = r6;	 Catch:{ all -> 0x004a }
        if (r5 == 0) goto L_0x008a;
    L_0x0067:
        r5.close();
        goto L_0x008a;
    L_0x006b:
        r6 = (long) r4;
        android.os.SystemClock.sleep(r6);	 Catch:{ all -> 0x004a }
        r4 = r4 + 20;
        if (r5 == 0) goto L_0x008a;
    L_0x0073:
        r5.close();
        goto L_0x008a;
    L_0x0077:
        r7 = move-exception;
        r8 = r11.zzab();	 Catch:{ all -> 0x004a }
        r8 = r8.zzgk();	 Catch:{ all -> 0x004a }
        r8.zza(r0, r7);	 Catch:{ all -> 0x004a }
        r11.zzjw = r6;	 Catch:{ all -> 0x004a }
        if (r5 == 0) goto L_0x008a;
    L_0x0087:
        r5.close();
    L_0x008a:
        r3 = r3 + 1;
        goto L_0x0018;
    L_0x008d:
        if (r5 == 0) goto L_0x0092;
    L_0x008f:
        r5.close();
    L_0x0092:
        throw r0;
    L_0x0093:
        r0 = r11.zzab();
        r0 = r0.zzgn();
        r1 = "Error deleting app launch break from local database in reasonable time";
        r0.zzao(r1);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeb.zzgi():boolean");
    }

    private static long zza(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                return j;
            }
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @WorkerThread
    @VisibleForTesting
    private final SQLiteDatabase getWritableDatabase() {
        if (this.zzjw) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzjv.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzjw = true;
        return null;
    }

    @VisibleForTesting
    private final boolean zzcg() {
        return getContext().getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final /* bridge */ /* synthetic */ void zzl() {
        super.zzl();
    }

    public final /* bridge */ /* synthetic */ void zzm() {
        super.zzm();
    }

    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    public final /* bridge */ /* synthetic */ zza zzp() {
        return super.zzp();
    }

    public final /* bridge */ /* synthetic */ zzgp zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ zzdy zzr() {
        return super.zzr();
    }

    public final /* bridge */ /* synthetic */ zzhv zzs() {
        return super.zzs();
    }

    public final /* bridge */ /* synthetic */ zzhq zzt() {
        return super.zzt();
    }

    public final /* bridge */ /* synthetic */ zzeb zzu() {
        return super.zzu();
    }

    public final /* bridge */ /* synthetic */ zziw zzv() {
        return super.zzv();
    }

    public final /* bridge */ /* synthetic */ zzac zzw() {
        return super.zzw();
    }

    public final /* bridge */ /* synthetic */ Clock zzx() {
        return super.zzx();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ zzed zzy() {
        return super.zzy();
    }

    public final /* bridge */ /* synthetic */ zzjs zzz() {
        return super.zzz();
    }

    public final /* bridge */ /* synthetic */ zzfc zzaa() {
        return super.zzaa();
    }

    public final /* bridge */ /* synthetic */ zzef zzab() {
        return super.zzab();
    }

    public final /* bridge */ /* synthetic */ zzeo zzac() {
        return super.zzac();
    }

    public final /* bridge */ /* synthetic */ zzs zzad() {
        return super.zzad();
    }

    public final /* bridge */ /* synthetic */ zzr zzae() {
        return super.zzae();
    }
}

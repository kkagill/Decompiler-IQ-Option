package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@VisibleForTesting
final class zzeb implements zzcb {
    private static final String zzxj = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", new Object[]{"gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time"});
    private final zzed zzaie;
    private volatile zzbe zzaif;
    private final zzcc zzaig;
    private final String zzaih;
    private long zzaii;
    private final int zzaij;
    private final Context zzrm;
    private Clock zzsd;

    zzeb(zzcc zzcc, Context context) {
        this(zzcc, context, "gtm_urls.db", CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
    }

    @VisibleForTesting
    private zzeb(zzcc zzcc, Context context, String str, int i) {
        this.zzrm = context.getApplicationContext();
        this.zzaih = str;
        this.zzaig = zzcc;
        this.zzsd = DefaultClock.getInstance();
        this.zzaie = new zzed(this, this.zzrm, this.zzaih);
        this.zzaif = new zzfu(this.zzrm, new zzec(this));
        this.zzaii = 0;
        this.zzaij = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
    }

    public final void zzb(long j, String str) {
        SQLiteDatabase zzau;
        long currentTimeMillis = this.zzsd.currentTimeMillis();
        String str2 = "gtm_hits";
        if (currentTimeMillis > this.zzaii + 86400000) {
            this.zzaii = currentTimeMillis;
            zzau = zzau("Error opening database for deleteStaleHits.");
            if (zzau != null) {
                zzau.delete(str2, "HIT_TIME < ?", new String[]{Long.toString(this.zzsd.currentTimeMillis() - 2592000000L)});
                this.zzaig.zze(zziv() == 0);
            }
        }
        int zziv = (zziv() - this.zzaij) + 1;
        if (zziv > 0) {
            List zzz = zzz(zziv);
            int size = zzz.size();
            StringBuilder stringBuilder = new StringBuilder(51);
            stringBuilder.append("Store full, deleting ");
            stringBuilder.append(size);
            stringBuilder.append(" hits to make room.");
            zzdi.zzab(stringBuilder.toString());
            zza((String[]) zzz.toArray(new String[0]));
        }
        zzau = zzau("Error opening database for putHit");
        if (zzau != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_time", Long.valueOf(j));
            contentValues.put("hit_url", str);
            contentValues.put("hit_first_send_time", Integer.valueOf(0));
            try {
                zzau.insert(str2, null, contentValues);
                this.zzaig.zze(false);
            } catch (SQLiteException unused) {
                zzdi.zzac("Error storing hit");
            }
        }
    }

    private final List<String> zzz(int i) {
        String str = "hit_id";
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            zzdi.zzac("Invalid maxHits specified. Skipping");
            return arrayList;
        }
        SQLiteDatabase zzau = zzau("Error opening database for peekHitIds.");
        if (zzau == null) {
            return arrayList;
        }
        Cursor cursor = null;
        try {
            cursor = zzau.query("gtm_hits", new String[]{str}, null, null, null, null, String.format("%s ASC", new Object[]{str}), Integer.toString(i));
            if (cursor.moveToFirst()) {
                do {
                    arrayList.add(String.valueOf(cursor.getLong(0)));
                } while (cursor.moveToNext());
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (SQLiteException e) {
            str = "Error in peekHits fetching hitIds: ";
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

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ff A:{Catch:{ all -> 0x0135 }} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa A:{Catch:{ all -> 0x0135 }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0116 A:{Catch:{ all -> 0x0135 }} */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa A:{Catch:{ all -> 0x0135 }} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ff A:{Catch:{ all -> 0x0135 }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0116 A:{Catch:{ all -> 0x0135 }} */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0161 A:{Catch:{ all -> 0x016f }} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015c A:{Catch:{ all -> 0x016f }} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015c A:{Catch:{ all -> 0x016f }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0161 A:{Catch:{ all -> 0x016f }} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0161 A:{Catch:{ all -> 0x016f }} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015c A:{Catch:{ all -> 0x016f }} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013f A:{ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x003a} */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0172  */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:68:0x013f, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:69:0x0140, code skipped:
            r14 = r13;
     */
    /* JADX WARNING: Missing block: B:70:0x0143, code skipped:
            r0 = e;
     */
    private final java.util.List<com.google.android.gms.tagmanager.zzbw> zzaa(int r19) {
        /*
        r18 = this;
        r0 = "%s ASC";
        r1 = "hit_id";
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = "Error opening database for peekHits";
        r4 = r18;
        r3 = r4.zzau(r3);
        if (r3 != 0) goto L_0x0014;
    L_0x0013:
        return r2;
    L_0x0014:
        r6 = "gtm_hits";
        r5 = "hit_time";
        r7 = "hit_first_send_time";
        r7 = new java.lang.String[]{r1, r5, r7};	 Catch:{ SQLiteException -> 0x014a, all -> 0x0147 }
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r15 = 1;
        r5 = new java.lang.Object[r15];	 Catch:{ SQLiteException -> 0x014a, all -> 0x0147 }
        r13 = 0;
        r5[r13] = r1;	 Catch:{ SQLiteException -> 0x014a, all -> 0x0147 }
        r12 = java.lang.String.format(r0, r5);	 Catch:{ SQLiteException -> 0x014a, all -> 0x0147 }
        r16 = 40;
        r17 = java.lang.Integer.toString(r16);	 Catch:{ SQLiteException -> 0x014a, all -> 0x0147 }
        r5 = r3;
        r14 = 0;
        r13 = r17;
        r13 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13);	 Catch:{ SQLiteException -> 0x014a, all -> 0x0147 }
        r12 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x0143, all -> 0x013f }
        r12.<init>();	 Catch:{ SQLiteException -> 0x0143, all -> 0x013f }
        r2 = r13.moveToFirst();	 Catch:{ SQLiteException -> 0x013c, all -> 0x013f }
        if (r2 == 0) goto L_0x006b;
    L_0x0045:
        r2 = new com.google.android.gms.tagmanager.zzbw;	 Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
        r6 = r13.getLong(r14);	 Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
        r8 = r13.getLong(r15);	 Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
        r5 = 2;
        r10 = r13.getLong(r5);	 Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
        r5 = r2;
        r5.<init>(r6, r8, r10);	 Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
        r12.add(r2);	 Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
        r2 = r13.moveToNext();	 Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
        if (r2 != 0) goto L_0x0045;
    L_0x0061:
        goto L_0x006b;
    L_0x0062:
        r0 = move-exception;
        r14 = r13;
        goto L_0x0170;
    L_0x0066:
        r0 = move-exception;
        r2 = r12;
        r14 = r13;
        goto L_0x014c;
    L_0x006b:
        if (r13 == 0) goto L_0x0070;
    L_0x006d:
        r13.close();
    L_0x0070:
        r6 = "gtm_hits";
        r2 = "hit_url";
        r7 = new java.lang.String[]{r1, r2};	 Catch:{ SQLiteException -> 0x00e7, all -> 0x00e4 }
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r2 = new java.lang.Object[r15];	 Catch:{ SQLiteException -> 0x00e7, all -> 0x00e4 }
        r2[r14] = r1;	 Catch:{ SQLiteException -> 0x00e7, all -> 0x00e4 }
        r0 = java.lang.String.format(r0, r2);	 Catch:{ SQLiteException -> 0x00e7, all -> 0x00e4 }
        r1 = java.lang.Integer.toString(r16);	 Catch:{ SQLiteException -> 0x00e7, all -> 0x00e4 }
        r5 = r3;
        r2 = r12;
        r12 = r0;
        r3 = r13;
        r13 = r1;
        r13 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13);	 Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
        r0 = r13.moveToFirst();	 Catch:{ SQLiteException -> 0x00dc }
        if (r0 == 0) goto L_0x00d6;
    L_0x0097:
        r0 = 0;
    L_0x0098:
        r1 = r13;
        r1 = (android.database.sqlite.SQLiteCursor) r1;	 Catch:{ SQLiteException -> 0x00dc }
        r1 = r1.getWindow();	 Catch:{ SQLiteException -> 0x00dc }
        r1 = r1.getNumRows();	 Catch:{ SQLiteException -> 0x00dc }
        if (r1 <= 0) goto L_0x00b3;
    L_0x00a5:
        r1 = r2.get(r0);	 Catch:{ SQLiteException -> 0x00dc }
        r1 = (com.google.android.gms.tagmanager.zzbw) r1;	 Catch:{ SQLiteException -> 0x00dc }
        r3 = r13.getString(r15);	 Catch:{ SQLiteException -> 0x00dc }
        r1.zzbc(r3);	 Catch:{ SQLiteException -> 0x00dc }
        goto L_0x00ce;
    L_0x00b3:
        r1 = "HitString for hitId %d too large.  Hit will be deleted.";
        r3 = new java.lang.Object[r15];	 Catch:{ SQLiteException -> 0x00dc }
        r5 = r2.get(r0);	 Catch:{ SQLiteException -> 0x00dc }
        r5 = (com.google.android.gms.tagmanager.zzbw) r5;	 Catch:{ SQLiteException -> 0x00dc }
        r5 = r5.zzih();	 Catch:{ SQLiteException -> 0x00dc }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ SQLiteException -> 0x00dc }
        r3[r14] = r5;	 Catch:{ SQLiteException -> 0x00dc }
        r1 = java.lang.String.format(r1, r3);	 Catch:{ SQLiteException -> 0x00dc }
        com.google.android.gms.tagmanager.zzdi.zzac(r1);	 Catch:{ SQLiteException -> 0x00dc }
    L_0x00ce:
        r0 = r0 + 1;
        r1 = r13.moveToNext();	 Catch:{ SQLiteException -> 0x00dc }
        if (r1 != 0) goto L_0x0098;
    L_0x00d6:
        if (r13 == 0) goto L_0x00db;
    L_0x00d8:
        r13.close();
    L_0x00db:
        return r2;
    L_0x00dc:
        r0 = move-exception;
        goto L_0x00ea;
    L_0x00de:
        r0 = move-exception;
        r13 = r3;
        goto L_0x0136;
    L_0x00e1:
        r0 = move-exception;
        r13 = r3;
        goto L_0x00ea;
    L_0x00e4:
        r0 = move-exception;
        r3 = r13;
        goto L_0x0136;
    L_0x00e7:
        r0 = move-exception;
        r2 = r12;
        r3 = r13;
    L_0x00ea:
        r1 = "Error in peekHits fetching hit url: ";
        r0 = r0.getMessage();	 Catch:{ all -> 0x0135 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0135 }
        r3 = r0.length();	 Catch:{ all -> 0x0135 }
        if (r3 == 0) goto L_0x00ff;
    L_0x00fa:
        r0 = r1.concat(r0);	 Catch:{ all -> 0x0135 }
        goto L_0x0104;
    L_0x00ff:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0135 }
        r0.<init>(r1);	 Catch:{ all -> 0x0135 }
    L_0x0104:
        com.google.android.gms.tagmanager.zzdi.zzac(r0);	 Catch:{ all -> 0x0135 }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0135 }
        r0.<init>();	 Catch:{ all -> 0x0135 }
        r12 = r2;
        r12 = (java.util.ArrayList) r12;	 Catch:{ all -> 0x0135 }
        r1 = r12.size();	 Catch:{ all -> 0x0135 }
        r2 = 0;
    L_0x0114:
        if (r14 >= r1) goto L_0x012f;
    L_0x0116:
        r3 = r12.get(r14);	 Catch:{ all -> 0x0135 }
        r14 = r14 + 1;
        r3 = (com.google.android.gms.tagmanager.zzbw) r3;	 Catch:{ all -> 0x0135 }
        r5 = r3.zzij();	 Catch:{ all -> 0x0135 }
        r5 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x0135 }
        if (r5 == 0) goto L_0x012b;
    L_0x0128:
        if (r2 != 0) goto L_0x012f;
    L_0x012a:
        r2 = 1;
    L_0x012b:
        r0.add(r3);	 Catch:{ all -> 0x0135 }
        goto L_0x0114;
    L_0x012f:
        if (r13 == 0) goto L_0x0134;
    L_0x0131:
        r13.close();
    L_0x0134:
        return r0;
    L_0x0135:
        r0 = move-exception;
    L_0x0136:
        if (r13 == 0) goto L_0x013b;
    L_0x0138:
        r13.close();
    L_0x013b:
        throw r0;
    L_0x013c:
        r0 = move-exception;
        r2 = r12;
        goto L_0x0144;
    L_0x013f:
        r0 = move-exception;
        r3 = r13;
        r14 = r3;
        goto L_0x0170;
    L_0x0143:
        r0 = move-exception;
    L_0x0144:
        r3 = r13;
        r14 = r3;
        goto L_0x014c;
    L_0x0147:
        r0 = move-exception;
        r14 = 0;
        goto L_0x0170;
    L_0x014a:
        r0 = move-exception;
        r14 = 0;
    L_0x014c:
        r1 = "Error in peekHits fetching hitIds: ";
        r0 = r0.getMessage();	 Catch:{ all -> 0x016f }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x016f }
        r3 = r0.length();	 Catch:{ all -> 0x016f }
        if (r3 == 0) goto L_0x0161;
    L_0x015c:
        r0 = r1.concat(r0);	 Catch:{ all -> 0x016f }
        goto L_0x0166;
    L_0x0161:
        r0 = new java.lang.String;	 Catch:{ all -> 0x016f }
        r0.<init>(r1);	 Catch:{ all -> 0x016f }
    L_0x0166:
        com.google.android.gms.tagmanager.zzdi.zzac(r0);	 Catch:{ all -> 0x016f }
        if (r14 == 0) goto L_0x016e;
    L_0x016b:
        r14.close();
    L_0x016e:
        return r2;
    L_0x016f:
        r0 = move-exception;
    L_0x0170:
        if (r14 == 0) goto L_0x0175;
    L_0x0172:
        r14.close();
    L_0x0175:
        goto L_0x0177;
    L_0x0176:
        throw r0;
    L_0x0177:
        goto L_0x0176;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzeb.zzaa(int):java.util.List");
    }

    private final void zza(String[] strArr) {
        if (!(strArr == null || strArr.length == 0)) {
            SQLiteDatabase zzau = zzau("Error opening database for deleteHits.");
            if (zzau != null) {
                boolean z = true;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.join(",", Collections.nCopies(strArr.length, "?"));
                try {
                    zzau.delete("gtm_hits", String.format("HIT_ID in (%s)", objArr), strArr);
                    zzcc zzcc = this.zzaig;
                    if (zziv() != 0) {
                        z = false;
                    }
                    zzcc.zze(z);
                } catch (SQLiteException unused) {
                    zzdi.zzac("Error deleting hits");
                }
            }
        }
    }

    private final void zze(long j) {
        zza(new String[]{String.valueOf(j)});
    }

    private final void zzb(long j, long j2) {
        SQLiteDatabase zzau = zzau("Error opening database for getNumStoredHits.");
        if (zzau != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_first_send_time", Long.valueOf(j2));
            try {
                zzau.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
            } catch (SQLiteException unused) {
                StringBuilder stringBuilder = new StringBuilder(69);
                stringBuilder.append("Error setting HIT_FIRST_DISPATCH_TIME for hitId: ");
                stringBuilder.append(j);
                zzdi.zzac(stringBuilder.toString());
                zze(j);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0024 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|18|14) */
    /* JADX WARNING: Missing block: B:13:?, code skipped:
            com.google.android.gms.tagmanager.zzdi.zzac("Error getting numStoredHits");
     */
    /* JADX WARNING: Missing block: B:15:0x002f, code skipped:
            if (r2 != null) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:16:0x0031, code skipped:
            r2.close();
     */
    private final int zziv() {
        /*
        r4 = this;
        r0 = "Error opening database for getNumStoredHits.";
        r0 = r4.zzau(r0);
        r1 = 0;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        return r1;
    L_0x000a:
        r2 = 0;
        r3 = "SELECT COUNT(*) from gtm_hits";
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
        r0 = "Error getting numStoredHits";
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzeb.zziv():int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:10:?, code skipped:
            com.google.android.gms.tagmanager.zzdi.zzac("Error getting num untried hits");
     */
    /* JADX WARNING: Missing block: B:12:0x0036, code skipped:
            if (r9 != null) goto L_0x0038;
     */
    /* JADX WARNING: Missing block: B:13:0x0038, code skipped:
            r9.close();
     */
    private final int zziw() {
        /*
        r10 = this;
        r0 = "Error opening database for getNumStoredHits.";
        r1 = r10.zzau(r0);
        r0 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r9 = 0;
        r2 = "gtm_hits";
        r3 = "hit_id";
        r4 = "hit_first_send_time";
        r3 = new java.lang.String[]{r3, r4};	 Catch:{ SQLiteException -> 0x002b }
        r4 = "hit_first_send_time=0";
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x002b }
        r0 = r9.getCount();	 Catch:{ SQLiteException -> 0x002b }
        if (r9 == 0) goto L_0x0035;
    L_0x0025:
        r9.close();
        goto L_0x0035;
    L_0x0029:
        r0 = move-exception;
        goto L_0x0036;
    L_0x002b:
        r1 = "Error getting num untried hits";
        com.google.android.gms.tagmanager.zzdi.zzac(r1);	 Catch:{ all -> 0x0029 }
        if (r9 == 0) goto L_0x0035;
    L_0x0032:
        r9.close();
    L_0x0035:
        return r0;
    L_0x0036:
        if (r9 == 0) goto L_0x003b;
    L_0x0038:
        r9.close();
    L_0x003b:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzeb.zziw():int");
    }

    public final void dispatch() {
        zzdi.zzab("GTM Dispatch running...");
        if (this.zzaif.zzhy()) {
            List zzaa = zzaa(40);
            if (zzaa.isEmpty()) {
                zzdi.zzab("...nothing to dispatch");
                this.zzaig.zze(true);
                return;
            }
            this.zzaif.zzd(zzaa);
            if (zziw() > 0) {
                zzfn.zzjq().dispatch();
            }
        }
    }

    private final SQLiteDatabase zzau(String str) {
        try {
            str = this.zzaie.getWritableDatabase();
            return str;
        } catch (SQLiteException unused) {
            zzdi.zzac(str);
            return null;
        }
    }
}

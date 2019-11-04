package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzbk.zzd;
import com.google.android.gms.internal.measurement.zzbs.zzc;
import com.google.android.gms.internal.measurement.zzbs.zze;
import com.google.android.gms.internal.measurement.zzbs.zzg;
import com.google.android.gms.internal.measurement.zzbs.zzg.zza;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zzx extends zzjh {
    private static final String[] zzek = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzel = new String[]{ConditionalUserProperty.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzem = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;"};
    private static final String[] zzen = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzeo = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzep;
    private static final String[] zzeq;
    private static final String[] zzer = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzy zzes = new zzy(this, getContext(), "google_app_measurement.db");
    private final zzjd zzet = new zzjd(zzx());

    zzx(zzjg zzjg) {
        super(zzjg);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzbk() {
        return false;
    }

    @WorkerThread
    public final void beginTransaction() {
        zzbi();
        getWritableDatabase().beginTransaction();
    }

    @WorkerThread
    public final void setTransactionSuccessful() {
        zzbi();
        getWritableDatabase().setTransactionSuccessful();
    }

    @WorkerThread
    public final void endTransaction() {
        zzbi();
        getWritableDatabase().endTransaction();
    }

    @WorkerThread
    private final long zza(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @WorkerThread
    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j2 = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j2;
            }
            if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    @VisibleForTesting
    public final SQLiteDatabase getWritableDatabase() {
        zzo();
        try {
            return this.zzes.getWritableDatabase();
        } catch (SQLiteException e) {
            zzab().zzgn().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015b  */
    @androidx.annotation.WorkerThread
    public final com.google.android.gms.measurement.internal.zzae zzc(java.lang.String r27, java.lang.String r28) {
        /*
        r26 = this;
        r15 = r27;
        r14 = r28;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r27);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28);
        r26.zzo();
        r26.zzbi();
        r0 = r26.zzad();
        r1 = com.google.android.gms.measurement.internal.zzak.zziz;
        r0 = r0.zze(r15, r1);
        r1 = new java.util.ArrayList;
        r2 = "lifetime_count";
        r3 = "current_bundle_count";
        r4 = "last_fire_timestamp";
        r5 = "last_bundled_timestamp";
        r6 = "last_bundled_day";
        r7 = "last_sampled_complex_event_id";
        r8 = "last_sampling_rate";
        r9 = "last_exempt_from_sampling";
        r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9};
        r2 = java.util.Arrays.asList(r2);
        r1.<init>(r2);
        if (r0 == 0) goto L_0x003e;
    L_0x0039:
        r2 = "current_session_count";
        r1.add(r2);
    L_0x003e:
        r18 = 0;
        r2 = r26.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
        r3 = "events";
        r10 = 0;
        r4 = new java.lang.String[r10];	 Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
        r1 = r1.toArray(r4);	 Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
        r4 = r1;
        r4 = (java.lang.String[]) r4;	 Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
        r5 = "app_id=? and name=?";
        r1 = 2;
        r6 = new java.lang.String[r1];	 Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
        r6[r10] = r15;	 Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
        r11 = 1;
        r6[r11] = r14;	 Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r12 = r2.query(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
        r2 = r12.moveToFirst();	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        if (r2 != 0) goto L_0x006d;
    L_0x0067:
        if (r12 == 0) goto L_0x006c;
    L_0x0069:
        r12.close();
    L_0x006c:
        return r18;
    L_0x006d:
        r4 = r12.getLong(r10);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r6 = r12.getLong(r11);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r16 = r12.getLong(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r1 = 3;
        r2 = r12.isNull(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r8 = 0;
        if (r2 == 0) goto L_0x0085;
    L_0x0082:
        r19 = r8;
        goto L_0x008b;
    L_0x0085:
        r1 = r12.getLong(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r19 = r1;
    L_0x008b:
        r1 = 4;
        r2 = r12.isNull(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        if (r2 == 0) goto L_0x0095;
    L_0x0092:
        r21 = r18;
        goto L_0x009f;
    L_0x0095:
        r1 = r12.getLong(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r21 = r1;
    L_0x009f:
        r1 = 5;
        r2 = r12.isNull(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        if (r2 == 0) goto L_0x00a9;
    L_0x00a6:
        r22 = r18;
        goto L_0x00b3;
    L_0x00a9:
        r1 = r12.getLong(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r22 = r1;
    L_0x00b3:
        r1 = 6;
        r2 = r12.isNull(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        if (r2 == 0) goto L_0x00bd;
    L_0x00ba:
        r23 = r18;
        goto L_0x00c7;
    L_0x00bd:
        r1 = r12.getLong(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r23 = r1;
    L_0x00c7:
        r1 = 7;
        r2 = r12.isNull(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        if (r2 != 0) goto L_0x00e0;
    L_0x00ce:
        r1 = r12.getLong(r1);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r24 = 1;
        r3 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1));
        if (r3 != 0) goto L_0x00d9;
    L_0x00d8:
        r10 = 1;
    L_0x00d9:
        r1 = java.lang.Boolean.valueOf(r10);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r24 = r1;
        goto L_0x00e2;
    L_0x00e0:
        r24 = r18;
    L_0x00e2:
        if (r0 == 0) goto L_0x00f1;
    L_0x00e4:
        r0 = 8;
        r1 = r12.isNull(r0);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        if (r1 != 0) goto L_0x00f1;
    L_0x00ec:
        r0 = r12.getLong(r0);	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r8 = r0;
    L_0x00f1:
        r0 = new com.google.android.gms.measurement.internal.zzae;	 Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
        r1 = r0;
        r2 = r27;
        r3 = r28;
        r10 = r16;
        r25 = r12;
        r12 = r19;
        r14 = r21;
        r15 = r22;
        r16 = r23;
        r17 = r24;
        r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17);	 Catch:{ SQLiteException -> 0x0126 }
        r1 = r25.moveToNext();	 Catch:{ SQLiteException -> 0x0126 }
        if (r1 == 0) goto L_0x0120;
    L_0x010f:
        r1 = r26.zzab();	 Catch:{ SQLiteException -> 0x0126 }
        r1 = r1.zzgk();	 Catch:{ SQLiteException -> 0x0126 }
        r2 = "Got multiple records for event aggregates, expected one. appId";
        r3 = com.google.android.gms.measurement.internal.zzef.zzam(r27);	 Catch:{ SQLiteException -> 0x0126 }
        r1.zza(r2, r3);	 Catch:{ SQLiteException -> 0x0126 }
    L_0x0120:
        if (r25 == 0) goto L_0x0125;
    L_0x0122:
        r25.close();
    L_0x0125:
        return r0;
    L_0x0126:
        r0 = move-exception;
        goto L_0x0137;
    L_0x0128:
        r0 = move-exception;
        r25 = r12;
        goto L_0x0159;
    L_0x012c:
        r0 = move-exception;
        r25 = r12;
        goto L_0x0137;
    L_0x0130:
        r0 = move-exception;
        r25 = r18;
        goto L_0x0159;
    L_0x0134:
        r0 = move-exception;
        r25 = r18;
    L_0x0137:
        r1 = r26.zzab();	 Catch:{ all -> 0x0158 }
        r1 = r1.zzgk();	 Catch:{ all -> 0x0158 }
        r2 = "Error querying events. appId";
        r3 = com.google.android.gms.measurement.internal.zzef.zzam(r27);	 Catch:{ all -> 0x0158 }
        r4 = r26.zzy();	 Catch:{ all -> 0x0158 }
        r5 = r28;
        r4 = r4.zzaj(r5);	 Catch:{ all -> 0x0158 }
        r1.zza(r2, r3, r4, r0);	 Catch:{ all -> 0x0158 }
        if (r25 == 0) goto L_0x0157;
    L_0x0154:
        r25.close();
    L_0x0157:
        return r18;
    L_0x0158:
        r0 = move-exception;
    L_0x0159:
        if (r25 == 0) goto L_0x015e;
    L_0x015b:
        r25.close();
    L_0x015e:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzae");
    }

    @WorkerThread
    public final void zza(zzae zzae) {
        Preconditions.checkNotNull(zzae);
        zzo();
        zzbi();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzae.zzce);
        contentValues.put(ConditionalUserProperty.NAME, zzae.name);
        contentValues.put("lifetime_count", Long.valueOf(zzae.zzfg));
        contentValues.put("current_bundle_count", Long.valueOf(zzae.zzfh));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzae.zzfj));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzae.zzfk));
        contentValues.put("last_bundled_day", zzae.zzfl);
        contentValues.put("last_sampled_complex_event_id", zzae.zzfm);
        contentValues.put("last_sampling_rate", zzae.zzfn);
        if (zzad().zze(zzae.zzce, zzak.zziz)) {
            contentValues.put("current_session_count", Long.valueOf(zzae.zzfi));
        }
        Long valueOf = (zzae.zzfo == null || !zzae.zzfo.booleanValue()) ? null : Long.valueOf(1);
        contentValues.put("last_exempt_from_sampling", valueOf);
        try {
            if (getWritableDatabase().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzab().zzgk().zza("Failed to insert/update event aggregates (got -1). appId", zzef.zzam(zzae.zzce));
            }
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing event aggregates. appId", zzef.zzam(zzae.zzce), e);
        }
    }

    @WorkerThread
    public final void zzd(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzo();
        zzbi();
        try {
            zzab().zzgs().zza("Deleted user attribute rows", Integer.valueOf(getWritableDatabase().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error deleting user attribute. appId", zzef.zzam(str), zzy().zzal(str2), e);
        }
    }

    @WorkerThread
    public final boolean zza(zzjp zzjp) {
        Preconditions.checkNotNull(zzjp);
        zzo();
        zzbi();
        if (zze(zzjp.zzce, zzjp.name) == null) {
            if (zzjs.zzbk(zzjp.name)) {
                if (zza("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzjp.zzce}) >= 25) {
                    return false;
                }
            }
            String str = "select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'";
            if (zzad().zze(zzjp.zzce, zzak.zzij)) {
                if (!"_npa".equals(zzjp.name)) {
                    if (zza(str, new String[]{zzjp.zzce, zzjp.origin}) >= 25) {
                        return false;
                    }
                }
            }
            if (zza(str, new String[]{zzjp.zzce, zzjp.origin}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzjp.zzce);
        contentValues.put(ConditionalUserProperty.ORIGIN, zzjp.origin);
        contentValues.put(ConditionalUserProperty.NAME, zzjp.name);
        contentValues.put("set_timestamp", Long.valueOf(zzjp.zztr));
        zza(contentValues, ConditionalUserProperty.VALUE, zzjp.value);
        try {
            if (getWritableDatabase().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzab().zzgk().zza("Failed to insert/update user property (got -1). appId", zzef.zzam(zzjp.zzce));
            }
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing user property. appId", zzef.zzam(zzjp.zzce), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab  */
    @androidx.annotation.WorkerThread
    public final com.google.android.gms.measurement.internal.zzjp zze(java.lang.String r19, java.lang.String r20) {
        /*
        r18 = this;
        r8 = r20;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r19);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20);
        r18.zzo();
        r18.zzbi();
        r9 = 0;
        r10 = r18.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0085, all -> 0x0080 }
        r11 = "user_attributes";
        r0 = "set_timestamp";
        r1 = "value";
        r2 = "origin";
        r12 = new java.lang.String[]{r0, r1, r2};	 Catch:{ SQLiteException -> 0x0085, all -> 0x0080 }
        r13 = "app_id=? and name=?";
        r0 = 2;
        r14 = new java.lang.String[r0];	 Catch:{ SQLiteException -> 0x0085, all -> 0x0080 }
        r1 = 0;
        r14[r1] = r19;	 Catch:{ SQLiteException -> 0x0085, all -> 0x0080 }
        r2 = 1;
        r14[r2] = r8;	 Catch:{ SQLiteException -> 0x0085, all -> 0x0080 }
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r10 = r10.query(r11, r12, r13, r14, r15, r16, r17);	 Catch:{ SQLiteException -> 0x0085, all -> 0x0080 }
        r3 = r10.moveToFirst();	 Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
        if (r3 != 0) goto L_0x0041;
    L_0x003b:
        if (r10 == 0) goto L_0x0040;
    L_0x003d:
        r10.close();
    L_0x0040:
        return r9;
    L_0x0041:
        r5 = r10.getLong(r1);	 Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
        r11 = r18;
        r7 = r11.zza(r10, r2);	 Catch:{ SQLiteException -> 0x0076 }
        r3 = r10.getString(r0);	 Catch:{ SQLiteException -> 0x0076 }
        r0 = new com.google.android.gms.measurement.internal.zzjp;	 Catch:{ SQLiteException -> 0x0076 }
        r1 = r0;
        r2 = r19;
        r4 = r20;
        r1.<init>(r2, r3, r4, r5, r7);	 Catch:{ SQLiteException -> 0x0076 }
        r1 = r10.moveToNext();	 Catch:{ SQLiteException -> 0x0076 }
        if (r1 == 0) goto L_0x0070;
    L_0x005f:
        r1 = r18.zzab();	 Catch:{ SQLiteException -> 0x0076 }
        r1 = r1.zzgk();	 Catch:{ SQLiteException -> 0x0076 }
        r2 = "Got multiple records for user property, expected one. appId";
        r3 = com.google.android.gms.measurement.internal.zzef.zzam(r19);	 Catch:{ SQLiteException -> 0x0076 }
        r1.zza(r2, r3);	 Catch:{ SQLiteException -> 0x0076 }
    L_0x0070:
        if (r10 == 0) goto L_0x0075;
    L_0x0072:
        r10.close();
    L_0x0075:
        return r0;
    L_0x0076:
        r0 = move-exception;
        goto L_0x0089;
    L_0x0078:
        r0 = move-exception;
        r11 = r18;
        goto L_0x00a9;
    L_0x007c:
        r0 = move-exception;
        r11 = r18;
        goto L_0x0089;
    L_0x0080:
        r0 = move-exception;
        r11 = r18;
        r10 = r9;
        goto L_0x00a9;
    L_0x0085:
        r0 = move-exception;
        r11 = r18;
        r10 = r9;
    L_0x0089:
        r1 = r18.zzab();	 Catch:{ all -> 0x00a8 }
        r1 = r1.zzgk();	 Catch:{ all -> 0x00a8 }
        r2 = "Error querying user property. appId";
        r3 = com.google.android.gms.measurement.internal.zzef.zzam(r19);	 Catch:{ all -> 0x00a8 }
        r4 = r18.zzy();	 Catch:{ all -> 0x00a8 }
        r4 = r4.zzal(r8);	 Catch:{ all -> 0x00a8 }
        r1.zza(r2, r3, r4, r0);	 Catch:{ all -> 0x00a8 }
        if (r10 == 0) goto L_0x00a7;
    L_0x00a4:
        r10.close();
    L_0x00a7:
        return r9;
    L_0x00a8:
        r0 = move-exception;
    L_0x00a9:
        if (r10 == 0) goto L_0x00ae;
    L_0x00ab:
        r10.close();
    L_0x00ae:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zze(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzjp");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    @androidx.annotation.WorkerThread
    public final java.util.List<com.google.android.gms.measurement.internal.zzjp> zzaa(java.lang.String r14) {
        /*
        r13 = this;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14);
        r13.zzo();
        r13.zzbi();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = 0;
        r2 = r13.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0087, all -> 0x0084 }
        r3 = "user_attributes";
        r4 = "name";
        r5 = "origin";
        r6 = "set_timestamp";
        r7 = "value";
        r4 = new java.lang.String[]{r4, r5, r6, r7};	 Catch:{ SQLiteException -> 0x0087, all -> 0x0084 }
        r5 = "app_id=?";
        r11 = 1;
        r6 = new java.lang.String[r11];	 Catch:{ SQLiteException -> 0x0087, all -> 0x0084 }
        r12 = 0;
        r6[r12] = r14;	 Catch:{ SQLiteException -> 0x0087, all -> 0x0084 }
        r7 = 0;
        r8 = 0;
        r9 = "rowid";
        r10 = "1000";
        r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ SQLiteException -> 0x0087, all -> 0x0084 }
        r3 = r2.moveToFirst();	 Catch:{ SQLiteException -> 0x0082 }
        if (r3 != 0) goto L_0x0041;
    L_0x003b:
        if (r2 == 0) goto L_0x0040;
    L_0x003d:
        r2.close();
    L_0x0040:
        return r0;
    L_0x0041:
        r7 = r2.getString(r12);	 Catch:{ SQLiteException -> 0x0082 }
        r3 = r2.getString(r11);	 Catch:{ SQLiteException -> 0x0082 }
        if (r3 != 0) goto L_0x004d;
    L_0x004b:
        r3 = "";
    L_0x004d:
        r6 = r3;
        r3 = 2;
        r8 = r2.getLong(r3);	 Catch:{ SQLiteException -> 0x0082 }
        r3 = 3;
        r10 = r13.zza(r2, r3);	 Catch:{ SQLiteException -> 0x0082 }
        if (r10 != 0) goto L_0x006c;
    L_0x005a:
        r3 = r13.zzab();	 Catch:{ SQLiteException -> 0x0082 }
        r3 = r3.zzgk();	 Catch:{ SQLiteException -> 0x0082 }
        r4 = "Read invalid user property value, ignoring it. appId";
        r5 = com.google.android.gms.measurement.internal.zzef.zzam(r14);	 Catch:{ SQLiteException -> 0x0082 }
        r3.zza(r4, r5);	 Catch:{ SQLiteException -> 0x0082 }
        goto L_0x0076;
    L_0x006c:
        r3 = new com.google.android.gms.measurement.internal.zzjp;	 Catch:{ SQLiteException -> 0x0082 }
        r4 = r3;
        r5 = r14;
        r4.<init>(r5, r6, r7, r8, r10);	 Catch:{ SQLiteException -> 0x0082 }
        r0.add(r3);	 Catch:{ SQLiteException -> 0x0082 }
    L_0x0076:
        r3 = r2.moveToNext();	 Catch:{ SQLiteException -> 0x0082 }
        if (r3 != 0) goto L_0x0041;
    L_0x007c:
        if (r2 == 0) goto L_0x0081;
    L_0x007e:
        r2.close();
    L_0x0081:
        return r0;
    L_0x0082:
        r0 = move-exception;
        goto L_0x0089;
    L_0x0084:
        r14 = move-exception;
        r2 = r1;
        goto L_0x00a1;
    L_0x0087:
        r0 = move-exception;
        r2 = r1;
    L_0x0089:
        r3 = r13.zzab();	 Catch:{ all -> 0x00a0 }
        r3 = r3.zzgk();	 Catch:{ all -> 0x00a0 }
        r4 = "Error querying user properties. appId";
        r14 = com.google.android.gms.measurement.internal.zzef.zzam(r14);	 Catch:{ all -> 0x00a0 }
        r3.zza(r4, r14, r0);	 Catch:{ all -> 0x00a0 }
        if (r2 == 0) goto L_0x009f;
    L_0x009c:
        r2.close();
    L_0x009f:
        return r1;
    L_0x00a0:
        r14 = move-exception;
    L_0x00a1:
        if (r2 == 0) goto L_0x00a6;
    L_0x00a3:
        r2.close();
    L_0x00a6:
        goto L_0x00a8;
    L_0x00a7:
        throw r14;
    L_0x00a8:
        goto L_0x00a7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzaa(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0102 A:{ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0102 A:{ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:46:0x00fa, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:47:0x00fb, code skipped:
            r12 = r21;
     */
    /* JADX WARNING: Missing block: B:50:0x0102, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:51:0x0103, code skipped:
            r12 = r21;
     */
    /* JADX WARNING: Missing block: B:52:0x0106, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:53:0x0107, code skipped:
            r12 = r21;
            r11 = r22;
     */
    /* JADX WARNING: Missing block: B:59:0x0121, code skipped:
            r2.close();
     */
    @androidx.annotation.WorkerThread
    public final java.util.List<com.google.android.gms.measurement.internal.zzjp> zza(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
        r21 = this;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r22);
        r21.zzo();
        r21.zzbi();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = 0;
        r2 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
        r3 = 3;
        r2.<init>(r3);	 Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
        r11 = r22;
        r2.add(r11);	 Catch:{ SQLiteException -> 0x00fe, all -> 0x0102 }
        r4 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x00fe, all -> 0x0102 }
        r5 = "app_id=?";
        r4.<init>(r5);	 Catch:{ SQLiteException -> 0x00fe, all -> 0x0102 }
        r5 = android.text.TextUtils.isEmpty(r23);	 Catch:{ SQLiteException -> 0x00fe, all -> 0x0102 }
        if (r5 != 0) goto L_0x0032;
    L_0x0027:
        r5 = r23;
        r2.add(r5);	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        r6 = " and origin=?";
        r4.append(r6);	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        goto L_0x0034;
    L_0x0032:
        r5 = r23;
    L_0x0034:
        r6 = android.text.TextUtils.isEmpty(r24);	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        if (r6 != 0) goto L_0x004c;
    L_0x003a:
        r6 = java.lang.String.valueOf(r24);	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        r7 = "*";
        r6 = r6.concat(r7);	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        r2.add(r6);	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        r6 = " and name glob ?";
        r4.append(r6);	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
    L_0x004c:
        r6 = r2.size();	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        r6 = new java.lang.String[r6];	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        r2 = r2.toArray(r6);	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        r16 = r2;
        r16 = (java.lang.String[]) r16;	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        r12 = r21.getWritableDatabase();	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        r13 = "user_attributes";
        r2 = "name";
        r6 = "set_timestamp";
        r7 = "value";
        r8 = "origin";
        r14 = new java.lang.String[]{r2, r6, r7, r8};	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        r15 = r4.toString();	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        r17 = 0;
        r18 = 0;
        r19 = "rowid";
        r20 = "1001";
        r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ SQLiteException -> 0x00fa, all -> 0x0102 }
        r4 = r2.moveToFirst();	 Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
        if (r4 != 0) goto L_0x008a;
    L_0x0084:
        if (r2 == 0) goto L_0x0089;
    L_0x0086:
        r2.close();
    L_0x0089:
        return r0;
    L_0x008a:
        r4 = r0.size();	 Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r4 < r6) goto L_0x00a6;
    L_0x0092:
        r3 = r21.zzab();	 Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
        r3 = r3.zzgk();	 Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
        r4 = "Read more than the max allowed user properties, ignoring excess";
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
        r3.zza(r4, r6);	 Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
        r12 = r21;
        goto L_0x00e5;
    L_0x00a6:
        r4 = 0;
        r7 = r2.getString(r4);	 Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
        r4 = 1;
        r8 = r2.getLong(r4);	 Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
        r4 = 2;
        r12 = r21;
        r10 = r12.zza(r2, r4);	 Catch:{ SQLiteException -> 0x00f0 }
        r13 = r2.getString(r3);	 Catch:{ SQLiteException -> 0x00f0 }
        if (r10 != 0) goto L_0x00d1;
    L_0x00bd:
        r4 = r21.zzab();	 Catch:{ SQLiteException -> 0x00ed }
        r4 = r4.zzgk();	 Catch:{ SQLiteException -> 0x00ed }
        r5 = "(2)Read invalid user property value, ignoring it";
        r6 = com.google.android.gms.measurement.internal.zzef.zzam(r22);	 Catch:{ SQLiteException -> 0x00ed }
        r14 = r24;
        r4.zza(r5, r6, r13, r14);	 Catch:{ SQLiteException -> 0x00ed }
        goto L_0x00df;
    L_0x00d1:
        r14 = r24;
        r15 = new com.google.android.gms.measurement.internal.zzjp;	 Catch:{ SQLiteException -> 0x00ed }
        r4 = r15;
        r5 = r22;
        r6 = r13;
        r4.<init>(r5, r6, r7, r8, r10);	 Catch:{ SQLiteException -> 0x00ed }
        r0.add(r15);	 Catch:{ SQLiteException -> 0x00ed }
    L_0x00df:
        r4 = r2.moveToNext();	 Catch:{ SQLiteException -> 0x00ed }
        if (r4 != 0) goto L_0x00eb;
    L_0x00e5:
        if (r2 == 0) goto L_0x00ea;
    L_0x00e7:
        r2.close();
    L_0x00ea:
        return r0;
    L_0x00eb:
        r5 = r13;
        goto L_0x008a;
    L_0x00ed:
        r0 = move-exception;
        r5 = r13;
        goto L_0x010e;
    L_0x00f0:
        r0 = move-exception;
        goto L_0x010e;
    L_0x00f2:
        r0 = move-exception;
        r12 = r21;
        goto L_0x0126;
    L_0x00f6:
        r0 = move-exception;
        r12 = r21;
        goto L_0x010e;
    L_0x00fa:
        r0 = move-exception;
        r12 = r21;
        goto L_0x010d;
    L_0x00fe:
        r0 = move-exception;
        r12 = r21;
        goto L_0x010b;
    L_0x0102:
        r0 = move-exception;
        r12 = r21;
        goto L_0x0127;
    L_0x0106:
        r0 = move-exception;
        r12 = r21;
        r11 = r22;
    L_0x010b:
        r5 = r23;
    L_0x010d:
        r2 = r1;
    L_0x010e:
        r3 = r21.zzab();	 Catch:{ all -> 0x0125 }
        r3 = r3.zzgk();	 Catch:{ all -> 0x0125 }
        r4 = "(2)Error querying user properties";
        r6 = com.google.android.gms.measurement.internal.zzef.zzam(r22);	 Catch:{ all -> 0x0125 }
        r3.zza(r4, r6, r5, r0);	 Catch:{ all -> 0x0125 }
        if (r2 == 0) goto L_0x0124;
    L_0x0121:
        r2.close();
    L_0x0124:
        return r1;
    L_0x0125:
        r0 = move-exception;
    L_0x0126:
        r1 = r2;
    L_0x0127:
        if (r1 == 0) goto L_0x012c;
    L_0x0129:
        r1.close();
    L_0x012c:
        goto L_0x012e;
    L_0x012d:
        throw r0;
    L_0x012e:
        goto L_0x012d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zza(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @WorkerThread
    public final boolean zza(zzq zzq) {
        Preconditions.checkNotNull(zzq);
        zzo();
        zzbi();
        if (zze(zzq.packageName, zzq.zzdw.name) == null) {
            if (zza("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzq.packageName}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzq.packageName);
        contentValues.put(ConditionalUserProperty.ORIGIN, zzq.origin);
        contentValues.put(ConditionalUserProperty.NAME, zzq.zzdw.name);
        zza(contentValues, ConditionalUserProperty.VALUE, zzq.zzdw.getValue());
        contentValues.put(ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzq.active));
        contentValues.put(ConditionalUserProperty.TRIGGER_EVENT_NAME, zzq.triggerEventName);
        contentValues.put(ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzq.triggerTimeout));
        zzz();
        contentValues.put("timed_out_event", zzjs.zza(zzq.zzdx));
        contentValues.put(ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzq.creationTimestamp));
        zzz();
        contentValues.put("triggered_event", zzjs.zza(zzq.zzdy));
        contentValues.put(ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzq.zzdw.zztr));
        contentValues.put(ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzq.timeToLive));
        zzz();
        contentValues.put("expired_event", zzjs.zza(zzq.zzdz));
        try {
            if (getWritableDatabase().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzab().zzgk().zza("Failed to insert/update conditional user property (got -1)", zzef.zzam(zzq.packageName));
            }
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing conditional user property", zzef.zzam(zzq.packageName), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012c  */
    @androidx.annotation.WorkerThread
    public final com.google.android.gms.measurement.internal.zzq zzf(java.lang.String r30, java.lang.String r31) {
        /*
        r29 = this;
        r7 = r31;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r30);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r31);
        r29.zzo();
        r29.zzbi();
        r8 = 0;
        r9 = r29.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0106, all -> 0x0101 }
        r10 = "conditional_properties";
        r11 = "origin";
        r12 = "value";
        r13 = "active";
        r14 = "trigger_event_name";
        r15 = "trigger_timeout";
        r16 = "timed_out_event";
        r17 = "creation_timestamp";
        r18 = "triggered_event";
        r19 = "triggered_timestamp";
        r20 = "time_to_live";
        r21 = "expired_event";
        r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21};	 Catch:{ SQLiteException -> 0x0106, all -> 0x0101 }
        r12 = "app_id=? and name=?";
        r0 = 2;
        r13 = new java.lang.String[r0];	 Catch:{ SQLiteException -> 0x0106, all -> 0x0101 }
        r1 = 0;
        r13[r1] = r30;	 Catch:{ SQLiteException -> 0x0106, all -> 0x0101 }
        r2 = 1;
        r13[r2] = r7;	 Catch:{ SQLiteException -> 0x0106, all -> 0x0101 }
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r9 = r9.query(r10, r11, r12, r13, r14, r15, r16);	 Catch:{ SQLiteException -> 0x0106, all -> 0x0101 }
        r3 = r9.moveToFirst();	 Catch:{ SQLiteException -> 0x00fd, all -> 0x00f9 }
        if (r3 != 0) goto L_0x0055;
    L_0x004f:
        if (r9 == 0) goto L_0x0054;
    L_0x0051:
        r9.close();
    L_0x0054:
        return r8;
    L_0x0055:
        r16 = r9.getString(r1);	 Catch:{ SQLiteException -> 0x00fd, all -> 0x00f9 }
        r10 = r29;
        r5 = r10.zza(r9, r2);	 Catch:{ SQLiteException -> 0x00f7 }
        r0 = r9.getInt(r0);	 Catch:{ SQLiteException -> 0x00f7 }
        if (r0 == 0) goto L_0x0068;
    L_0x0065:
        r20 = 1;
        goto L_0x006a;
    L_0x0068:
        r20 = 0;
    L_0x006a:
        r0 = 3;
        r21 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00f7 }
        r0 = 4;
        r23 = r9.getLong(r0);	 Catch:{ SQLiteException -> 0x00f7 }
        r0 = r29.zzgw();	 Catch:{ SQLiteException -> 0x00f7 }
        r1 = 5;
        r1 = r9.getBlob(r1);	 Catch:{ SQLiteException -> 0x00f7 }
        r2 = com.google.android.gms.measurement.internal.zzai.CREATOR;	 Catch:{ SQLiteException -> 0x00f7 }
        r0 = r0.zza(r1, r2);	 Catch:{ SQLiteException -> 0x00f7 }
        r22 = r0;
        r22 = (com.google.android.gms.measurement.internal.zzai) r22;	 Catch:{ SQLiteException -> 0x00f7 }
        r0 = 6;
        r18 = r9.getLong(r0);	 Catch:{ SQLiteException -> 0x00f7 }
        r0 = r29.zzgw();	 Catch:{ SQLiteException -> 0x00f7 }
        r1 = 7;
        r1 = r9.getBlob(r1);	 Catch:{ SQLiteException -> 0x00f7 }
        r2 = com.google.android.gms.measurement.internal.zzai.CREATOR;	 Catch:{ SQLiteException -> 0x00f7 }
        r0 = r0.zza(r1, r2);	 Catch:{ SQLiteException -> 0x00f7 }
        r25 = r0;
        r25 = (com.google.android.gms.measurement.internal.zzai) r25;	 Catch:{ SQLiteException -> 0x00f7 }
        r0 = 8;
        r3 = r9.getLong(r0);	 Catch:{ SQLiteException -> 0x00f7 }
        r0 = 9;
        r26 = r9.getLong(r0);	 Catch:{ SQLiteException -> 0x00f7 }
        r0 = r29.zzgw();	 Catch:{ SQLiteException -> 0x00f7 }
        r1 = 10;
        r1 = r9.getBlob(r1);	 Catch:{ SQLiteException -> 0x00f7 }
        r2 = com.google.android.gms.measurement.internal.zzai.CREATOR;	 Catch:{ SQLiteException -> 0x00f7 }
        r0 = r0.zza(r1, r2);	 Catch:{ SQLiteException -> 0x00f7 }
        r28 = r0;
        r28 = (com.google.android.gms.measurement.internal.zzai) r28;	 Catch:{ SQLiteException -> 0x00f7 }
        r17 = new com.google.android.gms.measurement.internal.zzjn;	 Catch:{ SQLiteException -> 0x00f7 }
        r1 = r17;
        r2 = r31;
        r6 = r16;
        r1.<init>(r2, r3, r5, r6);	 Catch:{ SQLiteException -> 0x00f7 }
        r0 = new com.google.android.gms.measurement.internal.zzq;	 Catch:{ SQLiteException -> 0x00f7 }
        r14 = r0;
        r15 = r30;
        r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28);	 Catch:{ SQLiteException -> 0x00f7 }
        r1 = r9.moveToNext();	 Catch:{ SQLiteException -> 0x00f7 }
        if (r1 == 0) goto L_0x00f1;
    L_0x00d8:
        r1 = r29.zzab();	 Catch:{ SQLiteException -> 0x00f7 }
        r1 = r1.zzgk();	 Catch:{ SQLiteException -> 0x00f7 }
        r2 = "Got multiple records for conditional property, expected one";
        r3 = com.google.android.gms.measurement.internal.zzef.zzam(r30);	 Catch:{ SQLiteException -> 0x00f7 }
        r4 = r29.zzy();	 Catch:{ SQLiteException -> 0x00f7 }
        r4 = r4.zzal(r7);	 Catch:{ SQLiteException -> 0x00f7 }
        r1.zza(r2, r3, r4);	 Catch:{ SQLiteException -> 0x00f7 }
    L_0x00f1:
        if (r9 == 0) goto L_0x00f6;
    L_0x00f3:
        r9.close();
    L_0x00f6:
        return r0;
    L_0x00f7:
        r0 = move-exception;
        goto L_0x010a;
    L_0x00f9:
        r0 = move-exception;
        r10 = r29;
        goto L_0x012a;
    L_0x00fd:
        r0 = move-exception;
        r10 = r29;
        goto L_0x010a;
    L_0x0101:
        r0 = move-exception;
        r10 = r29;
        r9 = r8;
        goto L_0x012a;
    L_0x0106:
        r0 = move-exception;
        r10 = r29;
        r9 = r8;
    L_0x010a:
        r1 = r29.zzab();	 Catch:{ all -> 0x0129 }
        r1 = r1.zzgk();	 Catch:{ all -> 0x0129 }
        r2 = "Error querying conditional property";
        r3 = com.google.android.gms.measurement.internal.zzef.zzam(r30);	 Catch:{ all -> 0x0129 }
        r4 = r29.zzy();	 Catch:{ all -> 0x0129 }
        r4 = r4.zzal(r7);	 Catch:{ all -> 0x0129 }
        r1.zza(r2, r3, r4, r0);	 Catch:{ all -> 0x0129 }
        if (r9 == 0) goto L_0x0128;
    L_0x0125:
        r9.close();
    L_0x0128:
        return r8;
    L_0x0129:
        r0 = move-exception;
    L_0x012a:
        if (r9 == 0) goto L_0x012f;
    L_0x012c:
        r9.close();
    L_0x012f:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzf(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    @WorkerThread
    public final int zzg(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzo();
        zzbi();
        try {
            str = getWritableDatabase().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
            return str;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error deleting conditional property", zzef.zzam(str), zzy().zzal(str2), e);
            return 0;
        }
    }

    @WorkerThread
    public final List<zzq> zzb(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzo();
        zzbi();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder stringBuilder = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            stringBuilder.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            stringBuilder.append(" and name glob ?");
        }
        return zzb(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List<zzq> zzb(String str, String[] strArr) {
        zzo();
        zzbi();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().query("conditional_properties", new String[]{"app_id", ConditionalUserProperty.ORIGIN, ConditionalUserProperty.NAME, ConditionalUserProperty.VALUE, ConditionalUserProperty.ACTIVE, ConditionalUserProperty.TRIGGER_EVENT_NAME, ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", ConditionalUserProperty.TRIGGERED_TIMESTAMP, ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, str, strArr, null, null, "rowid", "1001");
            if (cursor.moveToFirst()) {
                do {
                    if (arrayList.size() >= 1000) {
                        zzab().zzgk().zza("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(1000));
                        break;
                    }
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object zza = zza(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j = cursor.getLong(6);
                    zzai zzai = (zzai) zzgw().zza(cursor.getBlob(7), zzai.CREATOR);
                    long j2 = cursor.getLong(8);
                    zzai zzai2 = (zzai) zzgw().zza(cursor.getBlob(9), zzai.CREATOR);
                    long j3 = cursor.getLong(10);
                    long j4 = cursor.getLong(11);
                    zzai zzai3 = (zzai) zzgw().zza(cursor.getBlob(12), zzai.CREATOR);
                    zzjn zzjn = new zzjn(string3, j3, zza, string2);
                    boolean z2 = z;
                    zzq zzq = r3;
                    zzq zzq2 = new zzq(string, string2, zzjn, j2, z2, string4, zzai, j, zzai2, j4, zzai3);
                    arrayList.add(zzq);
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error querying conditional user property value", e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0179 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0196 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0195 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a5 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01c0 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011d A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0119 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0155 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0153 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0164 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0179 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0195 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0196 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a5 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01c0 A:{Catch:{ SQLiteException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01fd  */
    @androidx.annotation.WorkerThread
    public final com.google.android.gms.measurement.internal.zzf zzab(java.lang.String r34) {
        /*
        r33 = this;
        r1 = r34;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r34);
        r33.zzo();
        r33.zzbi();
        r2 = 0;
        r3 = r33.getWritableDatabase();	 Catch:{ SQLiteException -> 0x01e6, all -> 0x01e1 }
        r4 = "apps";
        r5 = "app_instance_id";
        r6 = "gmp_app_id";
        r7 = "resettable_device_id_hash";
        r8 = "last_bundle_index";
        r9 = "last_bundle_start_timestamp";
        r10 = "last_bundle_end_timestamp";
        r11 = "app_version";
        r12 = "app_store";
        r13 = "gmp_version";
        r14 = "dev_cert_hash";
        r15 = "measurement_enabled";
        r16 = "day";
        r17 = "daily_public_events_count";
        r18 = "daily_events_count";
        r19 = "daily_conversions_count";
        r20 = "config_fetched_time";
        r21 = "failed_config_fetch_time";
        r22 = "app_version_int";
        r23 = "firebase_instance_id";
        r24 = "daily_error_events_count";
        r25 = "daily_realtime_events_count";
        r26 = "health_monitor_sample";
        r27 = "android_id";
        r28 = "adid_reporting_enabled";
        r29 = "ssaid_reporting_enabled";
        r30 = "admob_app_id";
        r31 = "dynamite_version";
        r32 = "safelisted_events";
        r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32};	 Catch:{ SQLiteException -> 0x01e6, all -> 0x01e1 }
        r6 = "app_id=?";
        r0 = 1;
        r7 = new java.lang.String[r0];	 Catch:{ SQLiteException -> 0x01e6, all -> 0x01e1 }
        r11 = 0;
        r7[r11] = r1;	 Catch:{ SQLiteException -> 0x01e6, all -> 0x01e1 }
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r3 = r3.query(r4, r5, r6, r7, r8, r9, r10);	 Catch:{ SQLiteException -> 0x01e6, all -> 0x01e1 }
        r4 = r3.moveToFirst();	 Catch:{ SQLiteException -> 0x01dd, all -> 0x01d9 }
        if (r4 != 0) goto L_0x0069;
    L_0x0063:
        if (r3 == 0) goto L_0x0068;
    L_0x0065:
        r3.close();
    L_0x0068:
        return r2;
    L_0x0069:
        r4 = new com.google.android.gms.measurement.internal.zzf;	 Catch:{ SQLiteException -> 0x01dd, all -> 0x01d9 }
        r5 = r33;
        r6 = r5.zzkz;	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = r6.zzjt();	 Catch:{ SQLiteException -> 0x01d7 }
        r4.<init>(r6, r1);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = r3.getString(r11);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zza(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = r3.getString(r0);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzb(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 2;
        r6 = r3.getString(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzd(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 3;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzk(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 4;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zze(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 5;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzf(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 6;
        r6 = r3.getString(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzf(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 7;
        r6 = r3.getString(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzg(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 8;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzh(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 9;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzi(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 10;
        r7 = r3.isNull(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        if (r7 != 0) goto L_0x00d7;
    L_0x00ce:
        r6 = r3.getInt(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        if (r6 == 0) goto L_0x00d5;
    L_0x00d4:
        goto L_0x00d7;
    L_0x00d5:
        r6 = 0;
        goto L_0x00d8;
    L_0x00d7:
        r6 = 1;
    L_0x00d8:
        r4.setMeasurementEnabled(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 11;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzn(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 12;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzo(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 13;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzp(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 14;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzq(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 15;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzl(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 16;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzm(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 17;
        r7 = r3.isNull(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        if (r7 == 0) goto L_0x011d;
    L_0x0119:
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        goto L_0x0122;
    L_0x011d:
        r6 = r3.getInt(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = (long) r6;	 Catch:{ SQLiteException -> 0x01d7 }
    L_0x0122:
        r4.zzg(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 18;
        r6 = r3.getString(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zze(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 19;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzs(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 20;
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzr(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 21;
        r6 = r3.getString(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzh(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 22;
        r7 = r3.isNull(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r8 = 0;
        if (r7 == 0) goto L_0x0155;
    L_0x0153:
        r6 = r8;
        goto L_0x0159;
    L_0x0155:
        r6 = r3.getLong(r6);	 Catch:{ SQLiteException -> 0x01d7 }
    L_0x0159:
        r4.zzt(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 23;
        r7 = r3.isNull(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        if (r7 != 0) goto L_0x016d;
    L_0x0164:
        r6 = r3.getInt(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        if (r6 == 0) goto L_0x016b;
    L_0x016a:
        goto L_0x016d;
    L_0x016b:
        r6 = 0;
        goto L_0x016e;
    L_0x016d:
        r6 = 1;
    L_0x016e:
        r4.zzb(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = 24;
        r7 = r3.isNull(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        if (r7 != 0) goto L_0x0181;
    L_0x0179:
        r6 = r3.getInt(r6);	 Catch:{ SQLiteException -> 0x01d7 }
        if (r6 == 0) goto L_0x0180;
    L_0x017f:
        goto L_0x0181;
    L_0x0180:
        r0 = 0;
    L_0x0181:
        r4.zzc(r0);	 Catch:{ SQLiteException -> 0x01d7 }
        r0 = 25;
        r0 = r3.getString(r0);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zzc(r0);	 Catch:{ SQLiteException -> 0x01d7 }
        r0 = 26;
        r6 = r3.isNull(r0);	 Catch:{ SQLiteException -> 0x01d7 }
        if (r6 == 0) goto L_0x0196;
    L_0x0195:
        goto L_0x019a;
    L_0x0196:
        r8 = r3.getLong(r0);	 Catch:{ SQLiteException -> 0x01d7 }
    L_0x019a:
        r4.zzj(r8);	 Catch:{ SQLiteException -> 0x01d7 }
        r0 = 27;
        r6 = r3.isNull(r0);	 Catch:{ SQLiteException -> 0x01d7 }
        if (r6 != 0) goto L_0x01b7;
    L_0x01a5:
        r0 = r3.getString(r0);	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = ",";
        r7 = -1;
        r0 = r0.split(r6, r7);	 Catch:{ SQLiteException -> 0x01d7 }
        r0 = java.util.Arrays.asList(r0);	 Catch:{ SQLiteException -> 0x01d7 }
        r4.zza(r0);	 Catch:{ SQLiteException -> 0x01d7 }
    L_0x01b7:
        r4.zzaf();	 Catch:{ SQLiteException -> 0x01d7 }
        r0 = r3.moveToNext();	 Catch:{ SQLiteException -> 0x01d7 }
        if (r0 == 0) goto L_0x01d1;
    L_0x01c0:
        r0 = r33.zzab();	 Catch:{ SQLiteException -> 0x01d7 }
        r0 = r0.zzgk();	 Catch:{ SQLiteException -> 0x01d7 }
        r6 = "Got multiple records for app, expected one. appId";
        r7 = com.google.android.gms.measurement.internal.zzef.zzam(r34);	 Catch:{ SQLiteException -> 0x01d7 }
        r0.zza(r6, r7);	 Catch:{ SQLiteException -> 0x01d7 }
    L_0x01d1:
        if (r3 == 0) goto L_0x01d6;
    L_0x01d3:
        r3.close();
    L_0x01d6:
        return r4;
    L_0x01d7:
        r0 = move-exception;
        goto L_0x01ea;
    L_0x01d9:
        r0 = move-exception;
        r5 = r33;
        goto L_0x0202;
    L_0x01dd:
        r0 = move-exception;
        r5 = r33;
        goto L_0x01ea;
    L_0x01e1:
        r0 = move-exception;
        r5 = r33;
        r3 = r2;
        goto L_0x0202;
    L_0x01e6:
        r0 = move-exception;
        r5 = r33;
        r3 = r2;
    L_0x01ea:
        r4 = r33.zzab();	 Catch:{ all -> 0x0201 }
        r4 = r4.zzgk();	 Catch:{ all -> 0x0201 }
        r6 = "Error querying app. appId";
        r1 = com.google.android.gms.measurement.internal.zzef.zzam(r34);	 Catch:{ all -> 0x0201 }
        r4.zza(r6, r1, r0);	 Catch:{ all -> 0x0201 }
        if (r3 == 0) goto L_0x0200;
    L_0x01fd:
        r3.close();
    L_0x0200:
        return r2;
    L_0x0201:
        r0 = move-exception;
    L_0x0202:
        if (r3 == 0) goto L_0x0207;
    L_0x0204:
        r3.close();
    L_0x0207:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzab(java.lang.String):com.google.android.gms.measurement.internal.zzf");
    }

    @WorkerThread
    public final void zza(zzf zzf) {
        String str = "apps";
        Preconditions.checkNotNull(zzf);
        zzo();
        zzbi();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzf.zzag());
        contentValues.put("app_instance_id", zzf.getAppInstanceId());
        contentValues.put("gmp_app_id", zzf.getGmpAppId());
        contentValues.put("resettable_device_id_hash", zzf.zzai());
        contentValues.put("last_bundle_index", Long.valueOf(zzf.zzar()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzf.zzaj()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzf.zzak()));
        contentValues.put("app_version", zzf.zzal());
        contentValues.put("app_store", zzf.zzan());
        contentValues.put("gmp_version", Long.valueOf(zzf.zzao()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzf.zzap()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzf.isMeasurementEnabled()));
        contentValues.put("day", Long.valueOf(zzf.zzav()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzf.zzaw()));
        contentValues.put("daily_events_count", Long.valueOf(zzf.zzax()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzf.zzay()));
        contentValues.put("config_fetched_time", Long.valueOf(zzf.zzas()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzf.zzat()));
        contentValues.put("app_version_int", Long.valueOf(zzf.zzam()));
        contentValues.put("firebase_instance_id", zzf.getFirebaseInstanceId());
        contentValues.put("daily_error_events_count", Long.valueOf(zzf.zzba()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzf.zzaz()));
        contentValues.put("health_monitor_sample", zzf.zzbb());
        contentValues.put("android_id", Long.valueOf(zzf.zzbd()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzf.zzbe()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(zzf.zzbf()));
        contentValues.put("admob_app_id", zzf.zzah());
        contentValues.put("dynamite_version", Long.valueOf(zzf.zzaq()));
        if (zzf.zzbh() != null) {
            if (zzf.zzbh().size() == 0) {
                zzab().zzgn().zza("Safelisted events should not be an empty list. appId", zzf.zzag());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzf.zzbh()));
            }
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (((long) writableDatabase.update(str, contentValues, "app_id = ?", new String[]{zzf.zzag()})) == 0 && writableDatabase.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzab().zzgk().zza("Failed to insert/update app (got -1). appId", zzef.zzam(zzf.zzag()));
            }
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing app. appId", zzef.zzam(zzf.zzag()), e);
        }
    }

    public final long zzac(String str) {
        Preconditions.checkNotEmpty(str);
        zzo();
        zzbi();
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            String valueOf = String.valueOf(Math.max(0, Math.min(1000000, zzad().zzb(str, zzak.zzgu))));
            str = writableDatabase.delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, valueOf});
            return (long) str;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error deleting over the limit events. appId", zzef.zzam(str), e);
            return 0;
        }
    }

    @WorkerThread
    public final zzw zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        zzo();
        zzbi();
        String[] strArr = new String[]{str};
        zzw zzw = new zzw();
        Cursor cursor = null;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            SQLiteDatabase sQLiteDatabase = writableDatabase;
            cursor = sQLiteDatabase.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            if (cursor.moveToFirst()) {
                if (cursor.getLong(0) == j) {
                    zzw.zzeg = cursor.getLong(1);
                    zzw.zzef = cursor.getLong(2);
                    zzw.zzeh = cursor.getLong(3);
                    zzw.zzei = cursor.getLong(4);
                    zzw.zzej = cursor.getLong(5);
                }
                if (z) {
                    zzw.zzeg++;
                }
                if (z2) {
                    zzw.zzef++;
                }
                if (z3) {
                    zzw.zzeh++;
                }
                if (z4) {
                    zzw.zzei++;
                }
                if (z5) {
                    zzw.zzej++;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(zzw.zzef));
                contentValues.put("daily_events_count", Long.valueOf(zzw.zzeg));
                contentValues.put("daily_conversions_count", Long.valueOf(zzw.zzeh));
                contentValues.put("daily_error_events_count", Long.valueOf(zzw.zzei));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzw.zzej));
                writableDatabase.update("apps", contentValues, "app_id=?", strArr);
                if (cursor != null) {
                    cursor.close();
                }
                return zzw;
            }
            zzab().zzgn().zza("Not updating daily counts, app is not known. appId", zzef.zzam(str));
            if (cursor != null) {
                cursor.close();
            }
            return zzw;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error updating daily counts. appId", zzef.zzam(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return zzw;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    @androidx.annotation.WorkerThread
    public final byte[] zzad(java.lang.String r11) {
        /*
        r10 = this;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11);
        r10.zzo();
        r10.zzbi();
        r0 = 0;
        r1 = r10.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
        r2 = "apps";
        r3 = "remote_config";
        r3 = new java.lang.String[]{r3};	 Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
        r4 = "app_id=?";
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
        r9 = 0;
        r5[r9] = r11;	 Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r1 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
        r2 = r1.moveToFirst();	 Catch:{ SQLiteException -> 0x0052 }
        if (r2 != 0) goto L_0x0031;
    L_0x002b:
        if (r1 == 0) goto L_0x0030;
    L_0x002d:
        r1.close();
    L_0x0030:
        return r0;
    L_0x0031:
        r2 = r1.getBlob(r9);	 Catch:{ SQLiteException -> 0x0052 }
        r3 = r1.moveToNext();	 Catch:{ SQLiteException -> 0x0052 }
        if (r3 == 0) goto L_0x004c;
    L_0x003b:
        r3 = r10.zzab();	 Catch:{ SQLiteException -> 0x0052 }
        r3 = r3.zzgk();	 Catch:{ SQLiteException -> 0x0052 }
        r4 = "Got multiple records for app config, expected one. appId";
        r5 = com.google.android.gms.measurement.internal.zzef.zzam(r11);	 Catch:{ SQLiteException -> 0x0052 }
        r3.zza(r4, r5);	 Catch:{ SQLiteException -> 0x0052 }
    L_0x004c:
        if (r1 == 0) goto L_0x0051;
    L_0x004e:
        r1.close();
    L_0x0051:
        return r2;
    L_0x0052:
        r2 = move-exception;
        goto L_0x0059;
    L_0x0054:
        r11 = move-exception;
        r1 = r0;
        goto L_0x0071;
    L_0x0057:
        r2 = move-exception;
        r1 = r0;
    L_0x0059:
        r3 = r10.zzab();	 Catch:{ all -> 0x0070 }
        r3 = r3.zzgk();	 Catch:{ all -> 0x0070 }
        r4 = "Error querying remote config. appId";
        r11 = com.google.android.gms.measurement.internal.zzef.zzam(r11);	 Catch:{ all -> 0x0070 }
        r3.zza(r4, r11, r2);	 Catch:{ all -> 0x0070 }
        if (r1 == 0) goto L_0x006f;
    L_0x006c:
        r1.close();
    L_0x006f:
        return r0;
    L_0x0070:
        r11 = move-exception;
    L_0x0071:
        if (r1 == 0) goto L_0x0076;
    L_0x0073:
        r1.close();
    L_0x0076:
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzad(java.lang.String):byte[]");
    }

    @WorkerThread
    public final boolean zza(zzg zzg, boolean z) {
        zzo();
        zzbi();
        Preconditions.checkNotNull(zzg);
        Preconditions.checkNotEmpty(zzg.zzag());
        Preconditions.checkState(zzg.zzof());
        zzca();
        long currentTimeMillis = zzx().currentTimeMillis();
        if (zzg.zznr() < currentTimeMillis - zzs.zzbs() || zzg.zznr() > zzs.zzbs() + currentTimeMillis) {
            zzab().zzgn().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzef.zzam(zzg.zzag()), Long.valueOf(currentTimeMillis), Long.valueOf(zzg.zznr()));
        }
        try {
            byte[] zzc = zzgw().zzc(zzg.toByteArray());
            zzab().zzgs().zza("Saving bundle, size", Integer.valueOf(zzc.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzg.zzag());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzg.zznr()));
            contentValues.put("data", zzc);
            contentValues.put("has_realtime", Integer.valueOf(z));
            if (zzg.zzpn()) {
                contentValues.put("retry_count", Integer.valueOf(zzg.zzpo()));
            }
            try {
                if (getWritableDatabase().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzab().zzgk().zza("Failed to insert bundle (got -1). appId", zzef.zzam(zzg.zzag()));
                return false;
            } catch (SQLiteException e) {
                zzab().zzgk().zza("Error storing bundle. appId", zzef.zzam(zzg.zzag()), e);
                return false;
            }
        } catch (IOException e2) {
            zzab().zzgk().zza("Data loss. Failed to serialize bundle. appId", zzef.zzam(zzg.zzag()), e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    @androidx.annotation.WorkerThread
    public final java.lang.String zzby() {
        /*
        r6 = this;
        r0 = r6.getWritableDatabase();
        r1 = 0;
        r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;";
        r0 = r0.rawQuery(r2, r1);	 Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
        r2 = r0.moveToFirst();	 Catch:{ SQLiteException -> 0x0022 }
        if (r2 == 0) goto L_0x001c;
    L_0x0011:
        r2 = 0;
        r1 = r0.getString(r2);	 Catch:{ SQLiteException -> 0x0022 }
        if (r0 == 0) goto L_0x001b;
    L_0x0018:
        r0.close();
    L_0x001b:
        return r1;
    L_0x001c:
        if (r0 == 0) goto L_0x0021;
    L_0x001e:
        r0.close();
    L_0x0021:
        return r1;
    L_0x0022:
        r2 = move-exception;
        goto L_0x002b;
    L_0x0024:
        r0 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x003f;
    L_0x0029:
        r2 = move-exception;
        r0 = r1;
    L_0x002b:
        r3 = r6.zzab();	 Catch:{ all -> 0x003e }
        r3 = r3.zzgk();	 Catch:{ all -> 0x003e }
        r4 = "Database error getting next bundle app id";
        r3.zza(r4, r2);	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x003d;
    L_0x003a:
        r0.close();
    L_0x003d:
        return r1;
    L_0x003e:
        r1 = move-exception;
    L_0x003f:
        if (r0 == 0) goto L_0x0044;
    L_0x0041:
        r0.close();
    L_0x0044:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzby():java.lang.String");
    }

    public final boolean zzbz() {
        return zza("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    @WorkerThread
    public final List<Pair<zzg, Long>> zza(String str, int i, int i2) {
        zzo();
        zzbi();
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        List emptyList;
        try {
            cursor = getWritableDatabase().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
            if (cursor.moveToFirst()) {
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                do {
                    long j = cursor.getLong(0);
                    try {
                        byte[] zzb = zzgw().zzb(cursor.getBlob(1));
                        if (!arrayList.isEmpty() && zzb.length + i3 > i2) {
                            break;
                        }
                        try {
                            zza zza = (zza) zzg.zzpr().zzf(zzb, zzel.zztq());
                            if (!cursor.isNull(2)) {
                                zza.zzw(cursor.getInt(2));
                            }
                            i3 += zzb.length;
                            arrayList.add(Pair.create((zzg) ((zzey) zza.zzug()), Long.valueOf(j)));
                        } catch (IOException e) {
                            zzab().zzgk().zza("Failed to merge queued bundle. appId", zzef.zzam(str), e);
                        }
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    } catch (IOException e2) {
                        zzab().zzgk().zza("Failed to unzip queued bundle. appId", zzef.zzam(str), e2);
                    }
                } while (i3 <= i2);
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (SQLiteException e3) {
            zzab().zzgk().zza("Error querying bundles. appId", zzef.zzam(str), e3);
            emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzca() {
        zzo();
        zzbi();
        if (zzcg()) {
            long j = zzac().zzlm.get();
            long elapsedRealtime = zzx().elapsedRealtime();
            if (Math.abs(elapsedRealtime - j) > ((Long) zzak.zzhd.get(null)).longValue()) {
                zzac().zzlm.set(elapsedRealtime);
                zzo();
                zzbi();
                if (zzcg()) {
                    int delete = getWritableDatabase().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzx().currentTimeMillis()), String.valueOf(zzs.zzbs())});
                    if (delete > 0) {
                        zzab().zzgs().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    @VisibleForTesting
    public final void zzb(List<Long> list) {
        zzo();
        zzbi();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzcg()) {
            String join = TextUtils.join(",", list);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(join).length() + 2);
            stringBuilder.append("(");
            stringBuilder.append(join);
            stringBuilder.append(")");
            join = stringBuilder.toString();
            stringBuilder = new StringBuilder(String.valueOf(join).length() + 80);
            stringBuilder.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            stringBuilder.append(join);
            stringBuilder.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zza(stringBuilder.toString(), null) > 0) {
                zzab().zzgn().zzao("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(join).length() + 127);
                stringBuilder2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                stringBuilder2.append(join);
                stringBuilder2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                writableDatabase.execSQL(stringBuilder2.toString());
            } catch (SQLiteException e) {
                zzab().zzgk().zza("Error incrementing retry count. error", e);
            }
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zza(String str, zzbv[] zzbvArr) {
        String str2 = str;
        zzbv[] zzbvArr2 = zzbvArr;
        String str3 = "app_id=? and audience_id=?";
        String str4 = "event_filters";
        String str5 = "app_id=?";
        String str6 = "property_filters";
        zzbi();
        zzo();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbvArr);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            zzbi();
            zzo();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase writableDatabase2 = getWritableDatabase();
            String[] strArr = new String[1];
            int i = 0;
            strArr[0] = str2;
            writableDatabase2.delete(str6, str5, strArr);
            writableDatabase2.delete(str4, str5, new String[]{str2});
            for (Object obj : zzbvArr2) {
                zzbi();
                zzo();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(obj);
                Preconditions.checkNotNull(obj.zzzh);
                Preconditions.checkNotNull(obj.zzzg);
                if (obj.zzzf == null) {
                    zzab().zzgn().zza("Audience with no ID. appId", zzef.zzam(str));
                } else {
                    Object obj2;
                    int intValue = obj.zzzf.intValue();
                    for (zzbk.zza zzkb : obj.zzzh) {
                        if (!zzkb.zzkb()) {
                            zzab().zzgn().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzef.zzam(str), obj.zzzf);
                            break;
                        }
                    }
                    for (zzd zzkb2 : obj.zzzg) {
                        if (!zzkb2.zzkb()) {
                            zzab().zzgn().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzef.zzam(str), obj.zzzf);
                            break;
                        }
                    }
                    for (zzbk.zza zza : obj.zzzh) {
                        if (!zza(str2, intValue, zza)) {
                            obj2 = null;
                            break;
                        }
                    }
                    obj2 = 1;
                    if (obj2 != null) {
                        for (zzd zza2 : obj.zzzg) {
                            if (!zza(str2, intValue, zza2)) {
                                obj2 = null;
                                break;
                            }
                        }
                    }
                    if (obj2 == null) {
                        zzbi();
                        zzo();
                        Preconditions.checkNotEmpty(str);
                        SQLiteDatabase writableDatabase3 = getWritableDatabase();
                        writableDatabase3.delete(str6, str3, new String[]{str2, String.valueOf(intValue)});
                        writableDatabase3.delete(str4, str3, new String[]{str2, String.valueOf(intValue)});
                    }
                }
            }
            List arrayList = new ArrayList();
            int length = zzbvArr2.length;
            while (i < length) {
                arrayList.add(zzbvArr2[i].zzzf);
                i++;
            }
            zza(str2, arrayList);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @WorkerThread
    private final boolean zza(String str, int i, zzbk.zza zza) {
        zzbi();
        zzo();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zza);
        Object obj = null;
        if (TextUtils.isEmpty(zza.zzjz())) {
            zzeh zzgn = zzab().zzgn();
            Object zzam = zzef.zzam(str);
            Integer valueOf = Integer.valueOf(i);
            if (zza.zzkb()) {
                obj = Integer.valueOf(zza.getId());
            }
            zzgn.zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzam, valueOf, String.valueOf(obj));
            return false;
        }
        byte[] toByteArray = zza.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zza.zzkb() ? Integer.valueOf(zza.getId()) : null);
        contentValues.put("event_name", zza.zzjz());
        if (zzad().zze(str, zzak.zziy)) {
            contentValues.put("session_scoped", zza.zzkh() ? Boolean.valueOf(zza.zzki()) : null);
        }
        contentValues.put("data", toByteArray);
        try {
            if (getWritableDatabase().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                zzab().zzgk().zza("Failed to insert event filter (got -1). appId", zzef.zzam(str));
            }
            return true;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing event filter. appId", zzef.zzam(str), e);
            return false;
        }
    }

    @WorkerThread
    private final boolean zza(String str, int i, zzd zzd) {
        zzbi();
        zzo();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzd);
        Object obj = null;
        if (TextUtils.isEmpty(zzd.getPropertyName())) {
            zzeh zzgn = zzab().zzgn();
            Object zzam = zzef.zzam(str);
            Integer valueOf = Integer.valueOf(i);
            if (zzd.zzkb()) {
                obj = Integer.valueOf(zzd.getId());
            }
            zzgn.zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzam, valueOf, String.valueOf(obj));
            return false;
        }
        byte[] toByteArray = zzd.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzd.zzkb() ? Integer.valueOf(zzd.getId()) : null);
        contentValues.put("property_name", zzd.getPropertyName());
        if (zzad().zze(str, zzak.zziy)) {
            contentValues.put("session_scoped", zzd.zzkh() ? Boolean.valueOf(zzd.zzki()) : null);
        }
        contentValues.put("data", toByteArray);
        try {
            if (getWritableDatabase().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzab().zzgk().zza("Failed to insert property filter (got -1). appId", zzef.zzam(str));
            return false;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing property filter. appId", zzef.zzam(str), e);
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbk.zza>> zzh(java.lang.String r13, java.lang.String r14) {
        /*
        r12 = this;
        r12.zzbi();
        r12.zzo();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14);
        r0 = new androidx.collection.ArrayMap;
        r0.<init>();
        r1 = r12.getWritableDatabase();
        r9 = 0;
        r2 = "event_filters";
        r3 = "audience_id";
        r4 = "data";
        r3 = new java.lang.String[]{r3, r4};	 Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
        r4 = "app_id=? AND event_name=?";
        r5 = 2;
        r5 = new java.lang.String[r5];	 Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
        r10 = 0;
        r5[r10] = r13;	 Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
        r11 = 1;
        r5[r11] = r14;	 Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r14 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
        r1 = r14.moveToFirst();	 Catch:{ SQLiteException -> 0x008c }
        if (r1 != 0) goto L_0x0042;
    L_0x0038:
        r13 = java.util.Collections.emptyMap();	 Catch:{ SQLiteException -> 0x008c }
        if (r14 == 0) goto L_0x0041;
    L_0x003e:
        r14.close();
    L_0x0041:
        return r13;
    L_0x0042:
        r1 = r14.getBlob(r11);	 Catch:{ SQLiteException -> 0x008c }
        r2 = com.google.android.gms.internal.measurement.zzel.zztq();	 Catch:{ IOException -> 0x006e }
        r1 = com.google.android.gms.internal.measurement.zzbk.zza.zza(r1, r2);	 Catch:{ IOException -> 0x006e }
        r2 = r14.getInt(r10);	 Catch:{ SQLiteException -> 0x008c }
        r3 = java.lang.Integer.valueOf(r2);	 Catch:{ SQLiteException -> 0x008c }
        r3 = r0.get(r3);	 Catch:{ SQLiteException -> 0x008c }
        r3 = (java.util.List) r3;	 Catch:{ SQLiteException -> 0x008c }
        if (r3 != 0) goto L_0x006a;
    L_0x005e:
        r3 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x008c }
        r3.<init>();	 Catch:{ SQLiteException -> 0x008c }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ SQLiteException -> 0x008c }
        r0.put(r2, r3);	 Catch:{ SQLiteException -> 0x008c }
    L_0x006a:
        r3.add(r1);	 Catch:{ SQLiteException -> 0x008c }
        goto L_0x0080;
    L_0x006e:
        r1 = move-exception;
        r2 = r12.zzab();	 Catch:{ SQLiteException -> 0x008c }
        r2 = r2.zzgk();	 Catch:{ SQLiteException -> 0x008c }
        r3 = "Failed to merge filter. appId";
        r4 = com.google.android.gms.measurement.internal.zzef.zzam(r13);	 Catch:{ SQLiteException -> 0x008c }
        r2.zza(r3, r4, r1);	 Catch:{ SQLiteException -> 0x008c }
    L_0x0080:
        r1 = r14.moveToNext();	 Catch:{ SQLiteException -> 0x008c }
        if (r1 != 0) goto L_0x0042;
    L_0x0086:
        if (r14 == 0) goto L_0x008b;
    L_0x0088:
        r14.close();
    L_0x008b:
        return r0;
    L_0x008c:
        r0 = move-exception;
        goto L_0x0093;
    L_0x008e:
        r13 = move-exception;
        r14 = r9;
        goto L_0x00ab;
    L_0x0091:
        r0 = move-exception;
        r14 = r9;
    L_0x0093:
        r1 = r12.zzab();	 Catch:{ all -> 0x00aa }
        r1 = r1.zzgk();	 Catch:{ all -> 0x00aa }
        r2 = "Database error querying filters. appId";
        r13 = com.google.android.gms.measurement.internal.zzef.zzam(r13);	 Catch:{ all -> 0x00aa }
        r1.zza(r2, r13, r0);	 Catch:{ all -> 0x00aa }
        if (r14 == 0) goto L_0x00a9;
    L_0x00a6:
        r14.close();
    L_0x00a9:
        return r9;
    L_0x00aa:
        r13 = move-exception;
    L_0x00ab:
        if (r14 == 0) goto L_0x00b0;
    L_0x00ad:
        r14.close();
    L_0x00b0:
        goto L_0x00b2;
    L_0x00b1:
        throw r13;
    L_0x00b2:
        goto L_0x00b1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzh(java.lang.String, java.lang.String):java.util.Map");
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbk.zzd>> zzi(java.lang.String r13, java.lang.String r14) {
        /*
        r12 = this;
        r12.zzbi();
        r12.zzo();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14);
        r0 = new androidx.collection.ArrayMap;
        r0.<init>();
        r1 = r12.getWritableDatabase();
        r9 = 0;
        r2 = "property_filters";
        r3 = "audience_id";
        r4 = "data";
        r3 = new java.lang.String[]{r3, r4};	 Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
        r4 = "app_id=? AND property_name=?";
        r5 = 2;
        r5 = new java.lang.String[r5];	 Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
        r10 = 0;
        r5[r10] = r13;	 Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
        r11 = 1;
        r5[r11] = r14;	 Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r14 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
        r1 = r14.moveToFirst();	 Catch:{ SQLiteException -> 0x008c }
        if (r1 != 0) goto L_0x0042;
    L_0x0038:
        r13 = java.util.Collections.emptyMap();	 Catch:{ SQLiteException -> 0x008c }
        if (r14 == 0) goto L_0x0041;
    L_0x003e:
        r14.close();
    L_0x0041:
        return r13;
    L_0x0042:
        r1 = r14.getBlob(r11);	 Catch:{ SQLiteException -> 0x008c }
        r2 = com.google.android.gms.internal.measurement.zzel.zztq();	 Catch:{ IOException -> 0x006e }
        r1 = com.google.android.gms.internal.measurement.zzbk.zzd.zzb(r1, r2);	 Catch:{ IOException -> 0x006e }
        r2 = r14.getInt(r10);	 Catch:{ SQLiteException -> 0x008c }
        r3 = java.lang.Integer.valueOf(r2);	 Catch:{ SQLiteException -> 0x008c }
        r3 = r0.get(r3);	 Catch:{ SQLiteException -> 0x008c }
        r3 = (java.util.List) r3;	 Catch:{ SQLiteException -> 0x008c }
        if (r3 != 0) goto L_0x006a;
    L_0x005e:
        r3 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x008c }
        r3.<init>();	 Catch:{ SQLiteException -> 0x008c }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ SQLiteException -> 0x008c }
        r0.put(r2, r3);	 Catch:{ SQLiteException -> 0x008c }
    L_0x006a:
        r3.add(r1);	 Catch:{ SQLiteException -> 0x008c }
        goto L_0x0080;
    L_0x006e:
        r1 = move-exception;
        r2 = r12.zzab();	 Catch:{ SQLiteException -> 0x008c }
        r2 = r2.zzgk();	 Catch:{ SQLiteException -> 0x008c }
        r3 = "Failed to merge filter";
        r4 = com.google.android.gms.measurement.internal.zzef.zzam(r13);	 Catch:{ SQLiteException -> 0x008c }
        r2.zza(r3, r4, r1);	 Catch:{ SQLiteException -> 0x008c }
    L_0x0080:
        r1 = r14.moveToNext();	 Catch:{ SQLiteException -> 0x008c }
        if (r1 != 0) goto L_0x0042;
    L_0x0086:
        if (r14 == 0) goto L_0x008b;
    L_0x0088:
        r14.close();
    L_0x008b:
        return r0;
    L_0x008c:
        r0 = move-exception;
        goto L_0x0093;
    L_0x008e:
        r13 = move-exception;
        r14 = r9;
        goto L_0x00ab;
    L_0x0091:
        r0 = move-exception;
        r14 = r9;
    L_0x0093:
        r1 = r12.zzab();	 Catch:{ all -> 0x00aa }
        r1 = r1.zzgk();	 Catch:{ all -> 0x00aa }
        r2 = "Database error querying filters. appId";
        r13 = com.google.android.gms.measurement.internal.zzef.zzam(r13);	 Catch:{ all -> 0x00aa }
        r1.zza(r2, r13, r0);	 Catch:{ all -> 0x00aa }
        if (r14 == 0) goto L_0x00a9;
    L_0x00a6:
        r14.close();
    L_0x00a9:
        return r9;
    L_0x00aa:
        r13 = move-exception;
    L_0x00ab:
        if (r14 == 0) goto L_0x00b0;
    L_0x00ad:
        r14.close();
    L_0x00b0:
        goto L_0x00b2;
    L_0x00b1:
        throw r13;
    L_0x00b2:
        goto L_0x00b1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzi(java.lang.String, java.lang.String):java.util.Map");
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> zzae(java.lang.String r8) {
        /*
        r7 = this;
        r7.zzbi();
        r7.zzo();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8);
        r0 = new androidx.collection.ArrayMap;
        r0.<init>();
        r1 = r7.getWritableDatabase();
        r2 = 0;
        r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;";
        r4 = 2;
        r4 = new java.lang.String[r4];	 Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
        r5 = 0;
        r4[r5] = r8;	 Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
        r6 = 1;
        r4[r6] = r8;	 Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
        r1 = r1.rawQuery(r3, r4);	 Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
        r3 = r1.moveToFirst();	 Catch:{ SQLiteException -> 0x0065 }
        if (r3 != 0) goto L_0x0032;
    L_0x0028:
        r8 = java.util.Collections.emptyMap();	 Catch:{ SQLiteException -> 0x0065 }
        if (r1 == 0) goto L_0x0031;
    L_0x002e:
        r1.close();
    L_0x0031:
        return r8;
    L_0x0032:
        r3 = r1.getInt(r5);	 Catch:{ SQLiteException -> 0x0065 }
        r4 = java.lang.Integer.valueOf(r3);	 Catch:{ SQLiteException -> 0x0065 }
        r4 = r0.get(r4);	 Catch:{ SQLiteException -> 0x0065 }
        r4 = (java.util.List) r4;	 Catch:{ SQLiteException -> 0x0065 }
        if (r4 != 0) goto L_0x004e;
    L_0x0042:
        r4 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x0065 }
        r4.<init>();	 Catch:{ SQLiteException -> 0x0065 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ SQLiteException -> 0x0065 }
        r0.put(r3, r4);	 Catch:{ SQLiteException -> 0x0065 }
    L_0x004e:
        r3 = r1.getInt(r6);	 Catch:{ SQLiteException -> 0x0065 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ SQLiteException -> 0x0065 }
        r4.add(r3);	 Catch:{ SQLiteException -> 0x0065 }
        r3 = r1.moveToNext();	 Catch:{ SQLiteException -> 0x0065 }
        if (r3 != 0) goto L_0x0032;
    L_0x005f:
        if (r1 == 0) goto L_0x0064;
    L_0x0061:
        r1.close();
    L_0x0064:
        return r0;
    L_0x0065:
        r0 = move-exception;
        goto L_0x006c;
    L_0x0067:
        r8 = move-exception;
        r1 = r2;
        goto L_0x0084;
    L_0x006a:
        r0 = move-exception;
        r1 = r2;
    L_0x006c:
        r3 = r7.zzab();	 Catch:{ all -> 0x0083 }
        r3 = r3.zzgk();	 Catch:{ all -> 0x0083 }
        r4 = "Database error querying scoped filters. appId";
        r8 = com.google.android.gms.measurement.internal.zzef.zzam(r8);	 Catch:{ all -> 0x0083 }
        r3.zza(r4, r8, r0);	 Catch:{ all -> 0x0083 }
        if (r1 == 0) goto L_0x0082;
    L_0x007f:
        r1.close();
    L_0x0082:
        return r2;
    L_0x0083:
        r8 = move-exception;
    L_0x0084:
        if (r1 == 0) goto L_0x0089;
    L_0x0086:
        r1.close();
    L_0x0089:
        goto L_0x008b;
    L_0x008a:
        throw r8;
    L_0x008b:
        goto L_0x008a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzae(java.lang.String):java.util.Map");
    }

    private final boolean zza(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzbi();
        zzo();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            if (zza("select count(1) from audience_filter_values where app_id=?", new String[]{str}) <= ((long) Math.max(0, Math.min(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, zzad().zzb(str, zzak.zzhk))))) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(join).length() + 2);
            stringBuilder.append("(");
            stringBuilder.append(join);
            stringBuilder.append(")");
            join = stringBuilder.toString();
            stringBuilder = new StringBuilder(String.valueOf(join).length() + 140);
            stringBuilder.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            stringBuilder.append(join);
            stringBuilder.append(" order by rowid desc limit -1 offset ?)");
            return writableDatabase.delete("audience_filter_values", stringBuilder.toString(), new String[]{str, Integer.toString(r2)}) > 0;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Database error querying filters. appId", zzef.zzam(str), e);
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzbs.zzi> zzaf(java.lang.String r12) {
        /*
        r11 = this;
        r11.zzbi();
        r11.zzo();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12);
        r0 = r11.getWritableDatabase();
        r8 = 0;
        r1 = "audience_filter_values";
        r2 = "audience_id";
        r3 = "current_results";
        r2 = new java.lang.String[]{r2, r3};	 Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
        r3 = "app_id=?";
        r9 = 1;
        r4 = new java.lang.String[r9];	 Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
        r10 = 0;
        r4[r10] = r12;	 Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r0.query(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
        r1 = r0.moveToFirst();	 Catch:{ SQLiteException -> 0x0072 }
        if (r1 != 0) goto L_0x0033;
    L_0x002d:
        if (r0 == 0) goto L_0x0032;
    L_0x002f:
        r0.close();
    L_0x0032:
        return r8;
    L_0x0033:
        r1 = new androidx.collection.ArrayMap;	 Catch:{ SQLiteException -> 0x0072 }
        r1.<init>();	 Catch:{ SQLiteException -> 0x0072 }
    L_0x0038:
        r2 = r0.getInt(r10);	 Catch:{ SQLiteException -> 0x0072 }
        r3 = r0.getBlob(r9);	 Catch:{ SQLiteException -> 0x0072 }
        r4 = com.google.android.gms.internal.measurement.zzel.zztq();	 Catch:{ IOException -> 0x0050 }
        r3 = com.google.android.gms.internal.measurement.zzbs.zzi.zze(r3, r4);	 Catch:{ IOException -> 0x0050 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ SQLiteException -> 0x0072 }
        r1.put(r2, r3);	 Catch:{ SQLiteException -> 0x0072 }
        goto L_0x0066;
    L_0x0050:
        r3 = move-exception;
        r4 = r11.zzab();	 Catch:{ SQLiteException -> 0x0072 }
        r4 = r4.zzgk();	 Catch:{ SQLiteException -> 0x0072 }
        r5 = "Failed to merge filter results. appId, audienceId, error";
        r6 = com.google.android.gms.measurement.internal.zzef.zzam(r12);	 Catch:{ SQLiteException -> 0x0072 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ SQLiteException -> 0x0072 }
        r4.zza(r5, r6, r2, r3);	 Catch:{ SQLiteException -> 0x0072 }
    L_0x0066:
        r2 = r0.moveToNext();	 Catch:{ SQLiteException -> 0x0072 }
        if (r2 != 0) goto L_0x0038;
    L_0x006c:
        if (r0 == 0) goto L_0x0071;
    L_0x006e:
        r0.close();
    L_0x0071:
        return r1;
    L_0x0072:
        r1 = move-exception;
        goto L_0x0079;
    L_0x0074:
        r12 = move-exception;
        r0 = r8;
        goto L_0x0091;
    L_0x0077:
        r1 = move-exception;
        r0 = r8;
    L_0x0079:
        r2 = r11.zzab();	 Catch:{ all -> 0x0090 }
        r2 = r2.zzgk();	 Catch:{ all -> 0x0090 }
        r3 = "Database error querying filter results. appId";
        r12 = com.google.android.gms.measurement.internal.zzef.zzam(r12);	 Catch:{ all -> 0x0090 }
        r2.zza(r3, r12, r1);	 Catch:{ all -> 0x0090 }
        if (r0 == 0) goto L_0x008f;
    L_0x008c:
        r0.close();
    L_0x008f:
        return r8;
    L_0x0090:
        r12 = move-exception;
    L_0x0091:
        if (r0 == 0) goto L_0x0096;
    L_0x0093:
        r0.close();
    L_0x0096:
        goto L_0x0098;
    L_0x0097:
        throw r12;
    L_0x0098:
        goto L_0x0097;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzaf(java.lang.String):java.util.Map");
    }

    @WorkerThread
    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @WorkerThread
    @VisibleForTesting
    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzab().zzgk().zzao("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                zzab().zzgk().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            zzab().zzgk().zzao("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    @WorkerThread
    public final long zzcb() {
        return zza("select max(bundle_end_timestamp) from queue", null, 0);
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    @VisibleForTesting
    public final long zzj(String str, String str2) {
        Object e;
        Throwable th;
        String str3 = str;
        String str4 = str2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzo();
        zzbi();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        long zza;
        try {
            String str5;
            String str6;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 32);
            stringBuilder.append("select ");
            stringBuilder.append(str4);
            stringBuilder.append(" from app2 where app_id=?");
            try {
                zza = zza(stringBuilder.toString(), new String[]{str3}, -1);
                str5 = "app2";
                str6 = "app_id";
                if (zza == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(str6, str3);
                    contentValues.put("first_open_count", Integer.valueOf(0));
                    contentValues.put("previous_install_count", Integer.valueOf(0));
                    if (writableDatabase.insertWithOnConflict(str5, null, contentValues, 5) == -1) {
                        zzab().zzgk().zza("Failed to insert column (got -1). appId", zzef.zzam(str), str4);
                        writableDatabase.endTransaction();
                        return -1;
                    }
                    zza = 0;
                }
            } catch (SQLiteException e2) {
                e = e2;
                zza = 0;
                try {
                    zzab().zzgk().zza("Error inserting column. appId", zzef.zzam(str), str4, e);
                    writableDatabase.endTransaction();
                    return zza;
                } catch (Throwable th2) {
                    th = th2;
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(str6, str3);
                contentValues2.put(str4, Long.valueOf(1 + zza));
                if (((long) writableDatabase.update(str5, contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    zzab().zzgk().zza("Failed to update column (got 0). appId", zzef.zzam(str), str4);
                    writableDatabase.endTransaction();
                    return -1;
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return zza;
            } catch (SQLiteException e3) {
                e = e3;
                zzab().zzgk().zza("Error inserting column. appId", zzef.zzam(str), str4, e);
                writableDatabase.endTransaction();
                return zza;
            }
        } catch (SQLiteException e4) {
            e = e4;
            zza = 0;
            zzab().zzgk().zza("Error inserting column. appId", zzef.zzam(str), str4, e);
            writableDatabase.endTransaction();
            return zza;
        } catch (Throwable th3) {
            th = th3;
            writableDatabase.endTransaction();
            throw th;
        }
    }

    @WorkerThread
    public final long zzcc() {
        return zza("select max(timestamp) from raw_events", null, 0);
    }

    public final long zza(zzg zzg) {
        zzo();
        zzbi();
        Preconditions.checkNotNull(zzg);
        Preconditions.checkNotEmpty(zzg.zzag());
        byte[] toByteArray = zzg.toByteArray();
        long zza = zzgw().zza(toByteArray);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzg.zzag());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza));
        contentValues.put("metadata", toByteArray);
        try {
            getWritableDatabase().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing raw event metadata. appId", zzef.zzam(zzg.zzag()), e);
            throw e;
        }
    }

    public final boolean zzcd() {
        return zza("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzce() {
        return zza("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final long zzag(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    public final java.lang.String zzu(long r5) {
        /*
        r4 = this;
        r4.zzo();
        r4.zzbi();
        r0 = 0;
        r1 = r4.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
        r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;";
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
        r6 = 0;
        r3[r6] = r5;	 Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
        r5 = r1.rawQuery(r2, r3);	 Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
        r1 = r5.moveToFirst();	 Catch:{ SQLiteException -> 0x003e }
        if (r1 != 0) goto L_0x0034;
    L_0x0021:
        r6 = r4.zzab();	 Catch:{ SQLiteException -> 0x003e }
        r6 = r6.zzgs();	 Catch:{ SQLiteException -> 0x003e }
        r1 = "No expired configs for apps with pending events";
        r6.zzao(r1);	 Catch:{ SQLiteException -> 0x003e }
        if (r5 == 0) goto L_0x0033;
    L_0x0030:
        r5.close();
    L_0x0033:
        return r0;
    L_0x0034:
        r6 = r5.getString(r6);	 Catch:{ SQLiteException -> 0x003e }
        if (r5 == 0) goto L_0x003d;
    L_0x003a:
        r5.close();
    L_0x003d:
        return r6;
    L_0x003e:
        r6 = move-exception;
        goto L_0x0045;
    L_0x0040:
        r6 = move-exception;
        r5 = r0;
        goto L_0x0059;
    L_0x0043:
        r6 = move-exception;
        r5 = r0;
    L_0x0045:
        r1 = r4.zzab();	 Catch:{ all -> 0x0058 }
        r1 = r1.zzgk();	 Catch:{ all -> 0x0058 }
        r2 = "Error selecting expired configs";
        r1.zza(r2, r6);	 Catch:{ all -> 0x0058 }
        if (r5 == 0) goto L_0x0057;
    L_0x0054:
        r5.close();
    L_0x0057:
        return r0;
    L_0x0058:
        r6 = move-exception;
    L_0x0059:
        if (r5 == 0) goto L_0x005e;
    L_0x005b:
        r5.close();
    L_0x005e:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzu(long):java.lang.String");
    }

    public final long zzcf() {
        long j = -1;
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            if (cursor.moveToFirst()) {
                j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error querying raw events", e);
            if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0083  */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzbs.zzc, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) {
        /*
        r7 = this;
        r7.zzo();
        r7.zzbi();
        r0 = 0;
        r1 = r7.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
        r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?";
        r3 = 2;
        r3 = new java.lang.String[r3];	 Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
        r4 = 0;
        r3[r4] = r8;	 Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
        r5 = java.lang.String.valueOf(r9);	 Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
        r6 = 1;
        r3[r6] = r5;	 Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
        r1 = r1.rawQuery(r2, r3);	 Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
        r2 = r1.moveToFirst();	 Catch:{ SQLiteException -> 0x006d }
        if (r2 != 0) goto L_0x0037;
    L_0x0024:
        r8 = r7.zzab();	 Catch:{ SQLiteException -> 0x006d }
        r8 = r8.zzgs();	 Catch:{ SQLiteException -> 0x006d }
        r9 = "Main event not found";
        r8.zzao(r9);	 Catch:{ SQLiteException -> 0x006d }
        if (r1 == 0) goto L_0x0036;
    L_0x0033:
        r1.close();
    L_0x0036:
        return r0;
    L_0x0037:
        r2 = r1.getBlob(r4);	 Catch:{ SQLiteException -> 0x006d }
        r3 = r1.getLong(r6);	 Catch:{ SQLiteException -> 0x006d }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ SQLiteException -> 0x006d }
        r4 = com.google.android.gms.internal.measurement.zzel.zztq();	 Catch:{ IOException -> 0x0055 }
        r8 = com.google.android.gms.internal.measurement.zzbs.zzc.zzc(r2, r4);	 Catch:{ IOException -> 0x0055 }
        r8 = android.util.Pair.create(r8, r3);	 Catch:{ SQLiteException -> 0x006d }
        if (r1 == 0) goto L_0x0054;
    L_0x0051:
        r1.close();
    L_0x0054:
        return r8;
    L_0x0055:
        r2 = move-exception;
        r3 = r7.zzab();	 Catch:{ SQLiteException -> 0x006d }
        r3 = r3.zzgk();	 Catch:{ SQLiteException -> 0x006d }
        r4 = "Failed to merge main event. appId, eventId";
        r8 = com.google.android.gms.measurement.internal.zzef.zzam(r8);	 Catch:{ SQLiteException -> 0x006d }
        r3.zza(r4, r8, r9, r2);	 Catch:{ SQLiteException -> 0x006d }
        if (r1 == 0) goto L_0x006c;
    L_0x0069:
        r1.close();
    L_0x006c:
        return r0;
    L_0x006d:
        r8 = move-exception;
        goto L_0x0074;
    L_0x006f:
        r8 = move-exception;
        r1 = r0;
        goto L_0x0088;
    L_0x0072:
        r8 = move-exception;
        r1 = r0;
    L_0x0074:
        r9 = r7.zzab();	 Catch:{ all -> 0x0087 }
        r9 = r9.zzgk();	 Catch:{ all -> 0x0087 }
        r2 = "Error selecting main event";
        r9.zza(r2, r8);	 Catch:{ all -> 0x0087 }
        if (r1 == 0) goto L_0x0086;
    L_0x0083:
        r1.close();
    L_0x0086:
        return r0;
    L_0x0087:
        r8 = move-exception;
    L_0x0088:
        if (r1 == 0) goto L_0x008d;
    L_0x008a:
        r1.close();
    L_0x008d:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final boolean zza(String str, Long l, long j, zzc zzc) {
        zzo();
        zzbi();
        Preconditions.checkNotNull(zzc);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] toByteArray = zzc.toByteArray();
        zzab().zzgs().zza("Saving complex main event, appId, data size", zzy().zzaj(str), Integer.valueOf(toByteArray.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", toByteArray);
        try {
            if (getWritableDatabase().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzab().zzgk().zza("Failed to insert complex main event (got -1). appId", zzef.zzam(str));
            return false;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing complex main event. appId", zzef.zzam(str), e);
            return false;
        }
    }

    public final boolean zza(zzaf zzaf, long j, boolean z) {
        zzo();
        zzbi();
        Preconditions.checkNotNull(zzaf);
        Preconditions.checkNotEmpty(zzaf.zzce);
        zzc.zza zzah = zzc.zzmq().zzah(zzaf.zzfp);
        Iterator it = zzaf.zzfq.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zze.zza zzbz = zze.zzng().zzbz(str);
            zzgw().zza(zzbz, zzaf.zzfq.get(str));
            zzah.zza(zzbz);
        }
        byte[] toByteArray = ((zzc) ((zzey) zzah.zzug())).toByteArray();
        zzab().zzgs().zza("Saving event, name, data size", zzy().zzaj(zzaf.name), Integer.valueOf(toByteArray.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzaf.zzce);
        contentValues.put(ConditionalUserProperty.NAME, zzaf.name);
        contentValues.put("timestamp", Long.valueOf(zzaf.timestamp));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", toByteArray);
        contentValues.put("realtime", Integer.valueOf(z));
        try {
            if (getWritableDatabase().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzab().zzgk().zza("Failed to insert raw event (got -1). appId", zzef.zzam(zzaf.zzce));
            return false;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing raw event. appId", zzef.zzam(zzaf.zzce), e);
            return false;
        }
    }

    private final boolean zzcg() {
        return getContext().getDatabasePath("google_app_measurement.db").exists();
    }

    static {
        String str = "session_scoped";
        zzep = new String[]{str, "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        zzeq = new String[]{str, "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    }
}

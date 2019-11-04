package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.zza;
import com.google.android.gms.analytics.zzg;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

final class zzbb extends zzan {
    private boolean started;
    private final zzay zzxp;
    private final zzck zzxq;
    private final zzcj zzxr;
    private final zzat zzxs;
    private long zzxt = Long.MIN_VALUE;
    private final zzbs zzxu;
    private final zzbs zzxv;
    private final zzcv zzxw;
    private long zzxx;
    private boolean zzxy;

    protected zzbb(zzap zzap, zzar zzar) {
        super(zzap);
        Preconditions.checkNotNull(zzar);
        this.zzxr = new zzcj(zzap);
        this.zzxp = new zzay(zzap);
        this.zzxq = new zzck(zzap);
        this.zzxs = new zzat(zzap);
        this.zzxw = new zzcv(zzcn());
        this.zzxu = new zzbc(this, zzap);
        this.zzxv = new zzbd(this, zzap);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        this.zzxp.zzag();
        this.zzxq.zzag();
        this.zzxs.zzag();
    }

    /* Access modifiers changed, original: final */
    public final void start() {
        zzdb();
        Preconditions.checkState(this.started ^ 1, "Analytics backend already started");
        this.started = true;
        zzcq().zza(new zzbe(this));
    }

    private final boolean zzx(String str) {
        return Wrappers.packageManager(getContext()).checkCallingOrSelfPermission(str) == 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzdw() {
        zzdb();
        zzk.zzav();
        Context context = zzcm().getContext();
        if (!zzcp.zza(context)) {
            zzt("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzcq.zze(context)) {
            zzu("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.zza(context)) {
            zzt("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzcv().zzfv();
        if (!zzx("android.permission.ACCESS_NETWORK_STATE")) {
            zzu("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzeg();
        }
        if (!zzx("android.permission.INTERNET")) {
            zzu("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzeg();
        }
        if (zzcq.zze(getContext())) {
            zzq("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzt("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!(this.zzxy || this.zzxp.isEmpty())) {
            zzdz();
        }
        zzec();
    }

    private final void zzdx() {
        zzb(new zzbf(this));
    }

    /* Access modifiers changed, original: final */
    public final void zzcl() {
        zzk.zzav();
        this.zzxx = zzcn().currentTimeMillis();
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A:{LOOP_START, LOOP:1: B:15:0x0044->B:24:0x0069} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0040 A:{SYNTHETIC} */
    public final void onServiceConnected() {
        /*
        r5 = this;
        com.google.android.gms.analytics.zzk.zzav();
        com.google.android.gms.analytics.zzk.zzav();
        r5.zzdb();
        r0 = com.google.android.gms.internal.gtm.zzbq.zzen();
        if (r0 != 0) goto L_0x0014;
    L_0x000f:
        r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService";
        r5.zzt(r0);
    L_0x0014:
        r0 = r5.zzxs;
        r0 = r0.isConnected();
        if (r0 != 0) goto L_0x0022;
    L_0x001c:
        r0 = "Service not connected";
        r5.zzq(r0);
        return;
    L_0x0022:
        r0 = r5.zzxp;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x007d;
    L_0x002a:
        r0 = "Dispatching local hits to device AnalyticsService";
        r5.zzq(r0);
    L_0x002f:
        r0 = r5.zzxp;	 Catch:{ SQLiteException -> 0x0074 }
        r1 = com.google.android.gms.internal.gtm.zzbq.zzer();	 Catch:{ SQLiteException -> 0x0074 }
        r1 = (long) r1;	 Catch:{ SQLiteException -> 0x0074 }
        r0 = r0.zzd(r1);	 Catch:{ SQLiteException -> 0x0074 }
        r1 = r0.isEmpty();	 Catch:{ SQLiteException -> 0x0074 }
        if (r1 == 0) goto L_0x0044;
    L_0x0040:
        r5.zzec();	 Catch:{ SQLiteException -> 0x0074 }
        return;
    L_0x0044:
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x002f;
    L_0x004a:
        r1 = 0;
        r1 = r0.get(r1);
        r1 = (com.google.android.gms.internal.gtm.zzcd) r1;
        r2 = r5.zzxs;
        r2 = r2.zzb(r1);
        if (r2 != 0) goto L_0x005d;
    L_0x0059:
        r5.zzec();
        return;
    L_0x005d:
        r0.remove(r1);
        r2 = r5.zzxp;	 Catch:{ SQLiteException -> 0x006a }
        r3 = r1.zzfg();	 Catch:{ SQLiteException -> 0x006a }
        r2.zze(r3);	 Catch:{ SQLiteException -> 0x006a }
        goto L_0x0044;
    L_0x006a:
        r0 = move-exception;
        r1 = "Failed to remove hit that was send for delivery";
        r5.zze(r1, r0);
        r5.zzee();
        return;
    L_0x0074:
        r0 = move-exception;
        r1 = "Failed to read hits from store";
        r5.zze(r1, r0);
        r5.zzee();
    L_0x007d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbb.onServiceConnected():void");
    }

    private final void zzdy() {
        try {
            this.zzxp.zzdr();
            zzec();
        } catch (SQLiteException e) {
            zzd("Failed to delete stale hits", e);
        }
        this.zzxv.zzh(86400000);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzb(zzas zzas) {
        zzk.zzav();
        zzb("Sending first hit to property", zzas.zzdj());
        if (!zzcv().zzfw().zzj(zzbq.zzex())) {
            String zzfz = zzcv().zzfz();
            if (!TextUtils.isEmpty(zzfz)) {
                zzr zza = zzcz.zza(zzco(), zzfz);
                zzb("Found relevant installation campaign", zza);
                zza(zzas, zza);
            }
        }
    }

    public final void zzg(long j) {
        zzk.zzav();
        zzdb();
        if (j < 0) {
            j = 0;
        }
        this.zzxt = j;
        zzec();
    }

    private final void zzdz() {
        if (!this.zzxy && zzbq.zzen() && !this.zzxs.isConnected()) {
            if (this.zzxw.zzj(((Long) zzby.zzaan.get()).longValue())) {
                this.zzxw.start();
                zzq("Connecting to service");
                if (this.zzxs.connect()) {
                    zzq("Connected to service");
                    this.zzxw.clear();
                    onServiceConnected();
                }
            }
        }
    }

    public final long zza(zzas zzas, boolean z) {
        String str = "properties";
        String str2 = "Failed to end transaction";
        Preconditions.checkNotNull(zzas);
        zzdb();
        zzk.zzav();
        try {
            this.zzxp.beginTransaction();
            zzay zzay = this.zzxp;
            long zzdi = zzas.zzdi();
            String zzbt = zzas.zzbt();
            Preconditions.checkNotEmpty(zzbt);
            zzay.zzdb();
            zzk.zzav();
            String[] strArr = new String[2];
            strArr[0] = String.valueOf(zzdi);
            int i = 1;
            strArr[1] = zzbt;
            int delete = zzay.getWritableDatabase().delete(str, "app_uid=? AND cid<>?", strArr);
            if (delete > 0) {
                zzay.zza("Deleted property records", Integer.valueOf(delete));
            }
            long zza = this.zzxp.zza(zzas.zzdi(), zzas.zzbt(), zzas.zzdj());
            zzas.zzb(1 + zza);
            zzay zzay2 = this.zzxp;
            Preconditions.checkNotNull(zzas);
            zzay2.zzdb();
            zzk.zzav();
            SQLiteDatabase writableDatabase = zzay2.getWritableDatabase();
            Map zzdm = zzas.zzdm();
            Preconditions.checkNotNull(zzdm);
            Builder builder = new Builder();
            for (Entry entry : zzdm.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_uid", Long.valueOf(zzas.zzdi()));
            contentValues.put("cid", zzas.zzbt());
            contentValues.put("tid", zzas.zzdj());
            String str3 = "adid";
            if (!zzas.zzdk()) {
                i = 0;
            }
            contentValues.put(str3, Integer.valueOf(i));
            contentValues.put("hits_count", Long.valueOf(zzas.zzdl()));
            contentValues.put("params", encodedQuery);
            try {
                if (writableDatabase.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                    zzay2.zzu("Failed to insert/update a property (got -1)");
                }
            } catch (SQLiteException e) {
                zzay2.zze("Error storing a property", e);
            }
            this.zzxp.setTransactionSuccessful();
            try {
                this.zzxp.endTransaction();
            } catch (SQLiteException e2) {
                zze(str2, e2);
            }
            return zza;
        } catch (SQLiteException e22) {
            zze("Failed to update Analytics property", e22);
            try {
                this.zzxp.endTransaction();
            } catch (SQLiteException e222) {
                zze(str2, e222);
            }
            return -1;
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                this.zzxp.endTransaction();
            } catch (SQLiteException e2222) {
                zze(str2, e2222);
            }
        }
    }

    public final void zza(zzcd zzcd) {
        Preconditions.checkNotNull(zzcd);
        zzk.zzav();
        zzdb();
        if (this.zzxy) {
            zzr("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            zza("Delivering hit", zzcd);
        }
        if (TextUtils.isEmpty(zzcd.zzfl())) {
            Pair zzgc = zzcv().zzga().zzgc();
            if (zzgc != null) {
                Long l = (Long) zzgc.second;
                String str = (String) zzgc.first;
                String valueOf = String.valueOf(l);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(":");
                stringBuilder.append(str);
                str = stringBuilder.toString();
                HashMap hashMap = new HashMap(zzcd.zzdm());
                hashMap.put("_m", str);
                zzcd = new zzcd(this, hashMap, zzcd.zzfh(), zzcd.zzfj(), zzcd.zzfg(), zzcd.zzff(), zzcd.zzfi());
            }
        }
        zzdz();
        if (this.zzxs.zzb(zzcd)) {
            zzr("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        try {
            this.zzxp.zzc(zzcd);
            zzec();
        } catch (SQLiteException e) {
            zze("Delivery failed to save hit to a database", e);
            zzco().zza(zzcd, "deliver: failed to insert hit to database");
        }
    }

    public final void zzch() {
        zzk.zzav();
        zzdb();
        zzq("Delete all hits from local store");
        try {
            zzay zzay = this.zzxp;
            zzk.zzav();
            zzay.zzdb();
            zzay.getWritableDatabase().delete("hits2", null, null);
            zzay = this.zzxp;
            zzk.zzav();
            zzay.zzdb();
            zzay.getWritableDatabase().delete("properties", null, null);
            zzec();
        } catch (SQLiteException e) {
            zzd("Failed to delete hits from store", e);
        }
        zzdz();
        if (this.zzxs.zzdn()) {
            zzq("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    /* JADX WARNING: Missing block: B:26:0x0090, code skipped:
            zzd("Database contains successfully uploaded hit", java.lang.Long.valueOf(r5), java.lang.Integer.valueOf(r7.size()));
            zzee();
     */
    private final boolean zzea() {
        /*
        r12 = this;
        r0 = "Failed to commit local dispatch transaction";
        com.google.android.gms.analytics.zzk.zzav();
        r12.zzdb();
        r1 = "Dispatching a batch of local hits";
        r12.zzq(r1);
        r1 = r12.zzxs;
        r1 = r1.isConnected();
        r1 = r1 ^ 1;
        r2 = r12.zzxq;
        r2 = r2.zzfr();
        r2 = r2 ^ 1;
        r3 = 0;
        if (r1 == 0) goto L_0x0028;
    L_0x0020:
        if (r2 == 0) goto L_0x0028;
    L_0x0022:
        r0 = "No network or service available. Will retry later";
        r12.zzq(r0);
        return r3;
    L_0x0028:
        r1 = com.google.android.gms.internal.gtm.zzbq.zzer();
        r2 = com.google.android.gms.internal.gtm.zzbq.zzes();
        r1 = java.lang.Math.max(r1, r2);
        r1 = (long) r1;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = 0;
    L_0x003c:
        r7 = r12.zzxp;	 Catch:{ all -> 0x01ae }
        r7.beginTransaction();	 Catch:{ all -> 0x01ae }
        r4.clear();	 Catch:{ all -> 0x01ae }
        r7 = r12.zzxp;	 Catch:{ SQLiteException -> 0x0192 }
        r7 = r7.zzd(r1);	 Catch:{ SQLiteException -> 0x0192 }
        r8 = r7.isEmpty();	 Catch:{ SQLiteException -> 0x0192 }
        if (r8 == 0) goto L_0x006b;
    L_0x0050:
        r1 = "Store is empty, nothing to dispatch";
        r12.zzq(r1);	 Catch:{ SQLiteException -> 0x0192 }
        r12.zzee();	 Catch:{ SQLiteException -> 0x0192 }
        r1 = r12.zzxp;	 Catch:{ SQLiteException -> 0x0063 }
        r1.setTransactionSuccessful();	 Catch:{ SQLiteException -> 0x0063 }
        r1 = r12.zzxp;	 Catch:{ SQLiteException -> 0x0063 }
        r1.endTransaction();	 Catch:{ SQLiteException -> 0x0063 }
        return r3;
    L_0x0063:
        r1 = move-exception;
        r12.zze(r0, r1);
        r12.zzee();
        return r3;
    L_0x006b:
        r8 = "Hits loaded from store. count";
        r9 = r7.size();	 Catch:{ SQLiteException -> 0x0192 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ SQLiteException -> 0x0192 }
        r12.zza(r8, r9);	 Catch:{ SQLiteException -> 0x0192 }
        r8 = r7.iterator();	 Catch:{ all -> 0x01ae }
    L_0x007c:
        r9 = r8.hasNext();	 Catch:{ all -> 0x01ae }
        if (r9 == 0) goto L_0x00b7;
    L_0x0082:
        r9 = r8.next();	 Catch:{ all -> 0x01ae }
        r9 = (com.google.android.gms.internal.gtm.zzcd) r9;	 Catch:{ all -> 0x01ae }
        r9 = r9.zzfg();	 Catch:{ all -> 0x01ae }
        r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r11 != 0) goto L_0x007c;
    L_0x0090:
        r1 = "Database contains successfully uploaded hit";
        r2 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x01ae }
        r4 = r7.size();	 Catch:{ all -> 0x01ae }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x01ae }
        r12.zzd(r1, r2, r4);	 Catch:{ all -> 0x01ae }
        r12.zzee();	 Catch:{ all -> 0x01ae }
        r1 = r12.zzxp;	 Catch:{ SQLiteException -> 0x00af }
        r1.setTransactionSuccessful();	 Catch:{ SQLiteException -> 0x00af }
        r1 = r12.zzxp;	 Catch:{ SQLiteException -> 0x00af }
        r1.endTransaction();	 Catch:{ SQLiteException -> 0x00af }
        return r3;
    L_0x00af:
        r1 = move-exception;
        r12.zze(r0, r1);
        r12.zzee();
        return r3;
    L_0x00b7:
        r8 = r12.zzxs;	 Catch:{ all -> 0x01ae }
        r8 = r8.isConnected();	 Catch:{ all -> 0x01ae }
        if (r8 == 0) goto L_0x0119;
    L_0x00bf:
        r8 = "Service connected, sending hits to the service";
        r12.zzq(r8);	 Catch:{ all -> 0x01ae }
    L_0x00c4:
        r8 = r7.isEmpty();	 Catch:{ all -> 0x01ae }
        if (r8 != 0) goto L_0x0119;
    L_0x00ca:
        r8 = r7.get(r3);	 Catch:{ all -> 0x01ae }
        r8 = (com.google.android.gms.internal.gtm.zzcd) r8;	 Catch:{ all -> 0x01ae }
        r9 = r12.zzxs;	 Catch:{ all -> 0x01ae }
        r9 = r9.zzb(r8);	 Catch:{ all -> 0x01ae }
        if (r9 == 0) goto L_0x0119;
    L_0x00d8:
        r9 = r8.zzfg();	 Catch:{ all -> 0x01ae }
        r5 = java.lang.Math.max(r5, r9);	 Catch:{ all -> 0x01ae }
        r7.remove(r8);	 Catch:{ all -> 0x01ae }
        r9 = "Hit sent do device AnalyticsService for delivery";
        r12.zzb(r9, r8);	 Catch:{ all -> 0x01ae }
        r9 = r12.zzxp;	 Catch:{ SQLiteException -> 0x00fd }
        r10 = r8.zzfg();	 Catch:{ SQLiteException -> 0x00fd }
        r9.zze(r10);	 Catch:{ SQLiteException -> 0x00fd }
        r8 = r8.zzfg();	 Catch:{ SQLiteException -> 0x00fd }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ SQLiteException -> 0x00fd }
        r4.add(r8);	 Catch:{ SQLiteException -> 0x00fd }
        goto L_0x00c4;
    L_0x00fd:
        r1 = move-exception;
        r2 = "Failed to remove hit that was send for delivery";
        r12.zze(r2, r1);	 Catch:{ all -> 0x01ae }
        r12.zzee();	 Catch:{ all -> 0x01ae }
        r1 = r12.zzxp;	 Catch:{ SQLiteException -> 0x0111 }
        r1.setTransactionSuccessful();	 Catch:{ SQLiteException -> 0x0111 }
        r1 = r12.zzxp;	 Catch:{ SQLiteException -> 0x0111 }
        r1.endTransaction();	 Catch:{ SQLiteException -> 0x0111 }
        return r3;
    L_0x0111:
        r1 = move-exception;
        r12.zze(r0, r1);
        r12.zzee();
        return r3;
    L_0x0119:
        r8 = r12.zzxq;	 Catch:{ all -> 0x01ae }
        r8 = r8.zzfr();	 Catch:{ all -> 0x01ae }
        if (r8 == 0) goto L_0x0165;
    L_0x0121:
        r8 = r12.zzxq;	 Catch:{ all -> 0x01ae }
        r7 = r8.zzb(r7);	 Catch:{ all -> 0x01ae }
        r8 = r7.iterator();	 Catch:{ all -> 0x01ae }
    L_0x012b:
        r9 = r8.hasNext();	 Catch:{ all -> 0x01ae }
        if (r9 == 0) goto L_0x0140;
    L_0x0131:
        r9 = r8.next();	 Catch:{ all -> 0x01ae }
        r9 = (java.lang.Long) r9;	 Catch:{ all -> 0x01ae }
        r9 = r9.longValue();	 Catch:{ all -> 0x01ae }
        r5 = java.lang.Math.max(r5, r9);	 Catch:{ all -> 0x01ae }
        goto L_0x012b;
    L_0x0140:
        r8 = r12.zzxp;	 Catch:{ SQLiteException -> 0x0149 }
        r8.zza(r7);	 Catch:{ SQLiteException -> 0x0149 }
        r4.addAll(r7);	 Catch:{ SQLiteException -> 0x0149 }
        goto L_0x0165;
    L_0x0149:
        r1 = move-exception;
        r2 = "Failed to remove successfully uploaded hits";
        r12.zze(r2, r1);	 Catch:{ all -> 0x01ae }
        r12.zzee();	 Catch:{ all -> 0x01ae }
        r1 = r12.zzxp;	 Catch:{ SQLiteException -> 0x015d }
        r1.setTransactionSuccessful();	 Catch:{ SQLiteException -> 0x015d }
        r1 = r12.zzxp;	 Catch:{ SQLiteException -> 0x015d }
        r1.endTransaction();	 Catch:{ SQLiteException -> 0x015d }
        return r3;
    L_0x015d:
        r1 = move-exception;
        r12.zze(r0, r1);
        r12.zzee();
        return r3;
    L_0x0165:
        r7 = r4.isEmpty();	 Catch:{ all -> 0x01ae }
        if (r7 == 0) goto L_0x017e;
    L_0x016b:
        r1 = r12.zzxp;	 Catch:{ SQLiteException -> 0x0176 }
        r1.setTransactionSuccessful();	 Catch:{ SQLiteException -> 0x0176 }
        r1 = r12.zzxp;	 Catch:{ SQLiteException -> 0x0176 }
        r1.endTransaction();	 Catch:{ SQLiteException -> 0x0176 }
        return r3;
    L_0x0176:
        r1 = move-exception;
        r12.zze(r0, r1);
        r12.zzee();
        return r3;
    L_0x017e:
        r7 = r12.zzxp;	 Catch:{ SQLiteException -> 0x018a }
        r7.setTransactionSuccessful();	 Catch:{ SQLiteException -> 0x018a }
        r7 = r12.zzxp;	 Catch:{ SQLiteException -> 0x018a }
        r7.endTransaction();	 Catch:{ SQLiteException -> 0x018a }
        goto L_0x003c;
    L_0x018a:
        r1 = move-exception;
        r12.zze(r0, r1);
        r12.zzee();
        return r3;
    L_0x0192:
        r1 = move-exception;
        r2 = "Failed to read hits from persisted store";
        r12.zzd(r2, r1);	 Catch:{ all -> 0x01ae }
        r12.zzee();	 Catch:{ all -> 0x01ae }
        r1 = r12.zzxp;	 Catch:{ SQLiteException -> 0x01a6 }
        r1.setTransactionSuccessful();	 Catch:{ SQLiteException -> 0x01a6 }
        r1 = r12.zzxp;	 Catch:{ SQLiteException -> 0x01a6 }
        r1.endTransaction();	 Catch:{ SQLiteException -> 0x01a6 }
        return r3;
    L_0x01a6:
        r1 = move-exception;
        r12.zze(r0, r1);
        r12.zzee();
        return r3;
    L_0x01ae:
        r1 = move-exception;
        r2 = r12.zzxp;	 Catch:{ SQLiteException -> 0x01ba }
        r2.setTransactionSuccessful();	 Catch:{ SQLiteException -> 0x01ba }
        r2 = r12.zzxp;	 Catch:{ SQLiteException -> 0x01ba }
        r2.endTransaction();	 Catch:{ SQLiteException -> 0x01ba }
        throw r1;
    L_0x01ba:
        r1 = move-exception;
        r12.zze(r0, r1);
        r12.zzee();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbb.zzea():boolean");
    }

    public final void zzb(zzbw zzbw) {
        long j = this.zzxx;
        zzk.zzav();
        zzdb();
        long zzfx = zzcv().zzfx();
        zzb("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(zzfx != 0 ? Math.abs(zzcn().currentTimeMillis() - zzfx) : -1));
        zzdz();
        try {
            zzea();
            zzcv().zzfy();
            zzec();
            if (zzbw != null) {
                zzbw.zza(null);
            }
            if (this.zzxx != j) {
                this.zzxr.zzfq();
            }
        } catch (Exception e) {
            zze("Local dispatch failed", e);
            zzcv().zzfy();
            zzec();
            if (zzbw != null) {
                zzbw.zza(e);
            }
        }
    }

    public final void zzeb() {
        zzk.zzav();
        zzdb();
        zzr("Sync dispatching local hits");
        long j = this.zzxx;
        zzdz();
        try {
            zzea();
            zzcv().zzfy();
            zzec();
            if (this.zzxx != j) {
                this.zzxr.zzfq();
            }
        } catch (Exception e) {
            zze("Sync local dispatch failed", e);
            zzec();
        }
    }

    private final long zzds() {
        zzk.zzav();
        zzdb();
        try {
            return this.zzxp.zzds();
        } catch (SQLiteException e) {
            zze("Failed to get min/max hit times from local store", e);
            return 0;
        }
    }

    public final void zzec() {
        zzk.zzav();
        zzdb();
        boolean z = true;
        Object obj = (this.zzxy || zzef() <= 0) ? null : 1;
        if (obj == null) {
            this.zzxr.unregister();
            zzee();
        } else if (this.zzxp.isEmpty()) {
            this.zzxr.unregister();
            zzee();
        } else {
            if (!((Boolean) zzby.zzaai.get()).booleanValue()) {
                this.zzxr.zzfo();
                z = this.zzxr.isConnected();
            }
            if (z) {
                zzed();
                long zzef = zzef();
                long zzfx = zzcv().zzfx();
                if (zzfx != 0) {
                    zzfx = zzef - Math.abs(zzcn().currentTimeMillis() - zzfx);
                    if (zzfx <= 0) {
                        zzfx = Math.min(zzbq.zzep(), zzef);
                    }
                } else {
                    zzfx = Math.min(zzbq.zzep(), zzef);
                }
                zza("Dispatch scheduled (ms)", Long.valueOf(zzfx));
                if (this.zzxu.zzez()) {
                    this.zzxu.zzi(Math.max(1, zzfx + this.zzxu.zzey()));
                    return;
                } else {
                    this.zzxu.zzh(zzfx);
                    return;
                }
            }
            zzee();
            zzed();
        }
    }

    private final void zzed() {
        zzbv zzct = zzct();
        if (zzct.zzfc() && !zzct.zzez()) {
            long zzds = zzds();
            if (zzds != 0 && Math.abs(zzcn().currentTimeMillis() - zzds) <= ((Long) zzby.zzzm.get()).longValue()) {
                zza("Dispatch alarm scheduled (ms)", Long.valueOf(zzbq.zzeq()));
                zzct.zzfd();
            }
        }
    }

    private final void zzee() {
        if (this.zzxu.zzez()) {
            zzq("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzxu.cancel();
        zzbv zzct = zzct();
        if (zzct.zzez()) {
            zzct.cancel();
        }
    }

    private final long zzef() {
        long j = this.zzxt;
        if (j != Long.MIN_VALUE) {
            return j;
        }
        j = ((Long) zzby.zzzh.get()).longValue();
        zzda zzcu = zzcu();
        zzcu.zzdb();
        if (zzcu.zzacv) {
            zzda zzcu2 = zzcu();
            zzcu2.zzdb();
            j = ((long) zzcu2.zzaax) * 1000;
        }
        return j;
    }

    public final void zzy(String str) {
        Preconditions.checkNotEmpty(str);
        zzk.zzav();
        zzr zza = zzcz.zza(zzco(), str);
        if (zza == null) {
            zzd("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String zzfz = zzcv().zzfz();
        if (str.equals(zzfz)) {
            zzt("Ignoring duplicate install campaign");
        } else if (TextUtils.isEmpty(zzfz)) {
            zzcv().zzad(str);
            if (zzcv().zzfw().zzj(zzbq.zzex())) {
                zzd("Campaign received too late, ignoring", zza);
                return;
            }
            zzb("Received installation campaign", zza);
            for (zzas zza2 : this.zzxp.zzf(0)) {
                zza(zza2, zza);
            }
        } else {
            zzd("Ignoring multiple install campaigns. original, new", zzfz, str);
        }
    }

    private final void zza(zzas zzas, zzr zzr) {
        Preconditions.checkNotNull(zzas);
        Preconditions.checkNotNull(zzr);
        zza zza = new zza(zzcm());
        zza.zza(zzas.zzdj());
        zza.enableAdvertisingIdCollection(zzas.zzdk());
        zzg zzac = zza.zzac();
        zzz zzz = (zzz) zzac.zzb(zzz.class);
        zzz.zzl("data");
        zzz.zzb(true);
        zzac.zza((zzi) zzr);
        zzu zzu = (zzu) zzac.zzb(zzu.class);
        zzq zzq = (zzq) zzac.zzb(zzq.class);
        for (Entry entry : zzas.zzdm().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                zzq.setAppName(str2);
            } else if ("av".equals(str)) {
                zzq.setAppVersion(str2);
            } else if ("aid".equals(str)) {
                zzq.setAppId(str2);
            } else if ("aiid".equals(str)) {
                zzq.setAppInstallerId(str2);
            } else if ("uid".equals(str)) {
                zzz.setUserId(str2);
            } else {
                zzu.set(str, str2);
            }
        }
        zzb("Sending installation campaign to", zzas.zzdj(), zzr);
        zzac.zza(zzcv().zzfv());
        zzac.zzam();
    }

    private final void zzeg() {
        zzdb();
        zzk.zzav();
        this.zzxy = true;
        this.zzxs.disconnect();
        zzec();
    }
}

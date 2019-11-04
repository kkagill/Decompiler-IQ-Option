package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import androidx.annotation.MainThread;

@TargetApi(14)
@MainThread
final class zzhj implements ActivityLifecycleCallbacks {
    private final /* synthetic */ zzgp zzpt;

    private zzhj(zzgp zzgp) {
        this.zzpt = zzgp;
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0126 A:{Catch:{ Exception -> 0x01db, all -> 0x01d9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6 A:{Catch:{ Exception -> 0x01db, all -> 0x01d9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0162 A:{SYNTHETIC, Splitter:B:74:0x0162} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6 A:{Catch:{ Exception -> 0x01db, all -> 0x01d9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0126 A:{Catch:{ Exception -> 0x01db, all -> 0x01d9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0162 A:{SYNTHETIC, Splitter:B:74:0x0162} */
    public final void onActivityCreated(android.app.Activity r20, android.os.Bundle r21) {
        /*
        r19 = this;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        r0 = "referrer";
        r4 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r4 = r4.zzab();	 Catch:{ Exception -> 0x01db }
        r4 = r4.zzgs();	 Catch:{ Exception -> 0x01db }
        r5 = "onActivityCreated";
        r4.zzao(r5);	 Catch:{ Exception -> 0x01db }
        r4 = r20.getIntent();	 Catch:{ Exception -> 0x01db }
        if (r4 != 0) goto L_0x0027;
    L_0x001d:
        r0 = r1.zzpt;
        r0 = r0.zzt();
        r0.onActivityCreated(r2, r3);
        return;
    L_0x0027:
        r5 = r4.getData();	 Catch:{ Exception -> 0x01db }
        if (r5 == 0) goto L_0x01cf;
    L_0x002d:
        r6 = r5.isHierarchical();	 Catch:{ Exception -> 0x01db }
        if (r6 != 0) goto L_0x0035;
    L_0x0033:
        goto L_0x01cf;
    L_0x0035:
        r6 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r6.zzz();	 Catch:{ Exception -> 0x01db }
        r4 = com.google.android.gms.measurement.internal.zzjs.zzc(r4);	 Catch:{ Exception -> 0x01db }
        r6 = "auto";
        if (r4 == 0) goto L_0x0045;
    L_0x0042:
        r4 = "gs";
        goto L_0x0046;
    L_0x0045:
        r4 = r6;
    L_0x0046:
        r7 = r5.getQueryParameter(r0);	 Catch:{ Exception -> 0x01db }
        r8 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r8 = r8.zzad();	 Catch:{ Exception -> 0x01db }
        r9 = com.google.android.gms.measurement.internal.zzak.zzje;	 Catch:{ Exception -> 0x01db }
        r8 = r8.zza(r9);	 Catch:{ Exception -> 0x01db }
        r9 = "Activity created with data 'referrer' without required params";
        r10 = "utm_medium";
        r11 = "_cis";
        r12 = "utm_source";
        r13 = "utm_campaign";
        r15 = "gclid";
        if (r8 != 0) goto L_0x007a;
    L_0x0067:
        r8 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r8 = r8.zzad();	 Catch:{ Exception -> 0x01db }
        r14 = com.google.android.gms.measurement.internal.zzak.zzjg;	 Catch:{ Exception -> 0x01db }
        r8 = r8.zza(r14);	 Catch:{ Exception -> 0x01db }
        if (r8 == 0) goto L_0x0076;
    L_0x0075:
        goto L_0x007a;
    L_0x0076:
        r17 = r9;
        r14 = 0;
        goto L_0x00d3;
    L_0x007a:
        r8 = android.text.TextUtils.isEmpty(r7);	 Catch:{ Exception -> 0x01db }
        if (r8 == 0) goto L_0x0081;
    L_0x0080:
        goto L_0x0076;
    L_0x0081:
        r8 = r7.contains(r15);	 Catch:{ Exception -> 0x01db }
        if (r8 != 0) goto L_0x00a7;
    L_0x0087:
        r8 = r7.contains(r13);	 Catch:{ Exception -> 0x01db }
        if (r8 != 0) goto L_0x00a7;
    L_0x008d:
        r8 = r7.contains(r12);	 Catch:{ Exception -> 0x01db }
        if (r8 != 0) goto L_0x00a7;
    L_0x0093:
        r8 = r7.contains(r10);	 Catch:{ Exception -> 0x01db }
        if (r8 != 0) goto L_0x00a7;
    L_0x0099:
        r0 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r0 = r0.zzab();	 Catch:{ Exception -> 0x01db }
        r0 = r0.zzgr();	 Catch:{ Exception -> 0x01db }
        r0.zzao(r9);	 Catch:{ Exception -> 0x01db }
        goto L_0x0076;
    L_0x00a7:
        r8 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r8 = r8.zzz();	 Catch:{ Exception -> 0x01db }
        r14 = "https://google.com/search?";
        r17 = r9;
        r9 = java.lang.String.valueOf(r7);	 Catch:{ Exception -> 0x01db }
        r18 = r9.length();	 Catch:{ Exception -> 0x01db }
        if (r18 == 0) goto L_0x00c0;
    L_0x00bb:
        r9 = r14.concat(r9);	 Catch:{ Exception -> 0x01db }
        goto L_0x00c5;
    L_0x00c0:
        r9 = new java.lang.String;	 Catch:{ Exception -> 0x01db }
        r9.<init>(r14);	 Catch:{ Exception -> 0x01db }
    L_0x00c5:
        r9 = android.net.Uri.parse(r9);	 Catch:{ Exception -> 0x01db }
        r8 = r8.zza(r9);	 Catch:{ Exception -> 0x01db }
        if (r8 == 0) goto L_0x00d2;
    L_0x00cf:
        r8.putString(r11, r0);	 Catch:{ Exception -> 0x01db }
    L_0x00d2:
        r14 = r8;
    L_0x00d3:
        r8 = 1;
        if (r3 != 0) goto L_0x0126;
    L_0x00d6:
        r9 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r9 = r9.zzz();	 Catch:{ Exception -> 0x01db }
        r5 = r9.zza(r5);	 Catch:{ Exception -> 0x01db }
        if (r5 == 0) goto L_0x0123;
    L_0x00e2:
        r9 = "intent";
        r5.putString(r11, r9);	 Catch:{ Exception -> 0x01db }
        r9 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r9 = r9.zzad();	 Catch:{ Exception -> 0x01db }
        r11 = com.google.android.gms.measurement.internal.zzak.zzje;	 Catch:{ Exception -> 0x01db }
        r9 = r9.zza(r11);	 Catch:{ Exception -> 0x01db }
        if (r9 == 0) goto L_0x0119;
    L_0x00f5:
        r9 = r5.containsKey(r15);	 Catch:{ Exception -> 0x01db }
        if (r9 != 0) goto L_0x0119;
    L_0x00fb:
        if (r14 == 0) goto L_0x0119;
    L_0x00fd:
        r9 = r14.containsKey(r15);	 Catch:{ Exception -> 0x01db }
        if (r9 == 0) goto L_0x0119;
    L_0x0103:
        r9 = "_cer";
        r11 = "gclid=%s";
        r0 = new java.lang.Object[r8];	 Catch:{ Exception -> 0x01db }
        r16 = r14.getString(r15);	 Catch:{ Exception -> 0x01db }
        r18 = 0;
        r0[r18] = r16;	 Catch:{ Exception -> 0x01db }
        r0 = java.lang.String.format(r11, r0);	 Catch:{ Exception -> 0x01db }
        r5.putString(r9, r0);	 Catch:{ Exception -> 0x01db }
        goto L_0x011b;
    L_0x0119:
        r18 = 0;
    L_0x011b:
        r0 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r9 = "_cmp";
        r0.logEvent(r4, r9, r5);	 Catch:{ Exception -> 0x01db }
        goto L_0x0129;
    L_0x0123:
        r18 = 0;
        goto L_0x0129;
    L_0x0126:
        r18 = 0;
        r5 = 0;
    L_0x0129:
        r0 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r0 = r0.zzad();	 Catch:{ Exception -> 0x01db }
        r4 = com.google.android.gms.measurement.internal.zzak.zzjg;	 Catch:{ Exception -> 0x01db }
        r0 = r0.zza(r4);	 Catch:{ Exception -> 0x01db }
        if (r0 == 0) goto L_0x0152;
    L_0x0137:
        if (r14 == 0) goto L_0x0152;
    L_0x0139:
        r0 = r14.containsKey(r15);	 Catch:{ Exception -> 0x01db }
        if (r0 == 0) goto L_0x0152;
    L_0x013f:
        if (r5 == 0) goto L_0x0147;
    L_0x0141:
        r0 = r5.containsKey(r15);	 Catch:{ Exception -> 0x01db }
        if (r0 != 0) goto L_0x0152;
    L_0x0147:
        r0 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r4 = "_lgclid";
        r5 = r14.getString(r15);	 Catch:{ Exception -> 0x01db }
        r0.zzb(r6, r4, r5, r8);	 Catch:{ Exception -> 0x01db }
    L_0x0152:
        r0 = android.text.TextUtils.isEmpty(r7);	 Catch:{ Exception -> 0x01db }
        if (r0 == 0) goto L_0x0162;
    L_0x0158:
        r0 = r1.zzpt;
        r0 = r0.zzt();
        r0.onActivityCreated(r2, r3);
        return;
    L_0x0162:
        r0 = r7.contains(r15);	 Catch:{ Exception -> 0x01db }
        if (r0 == 0) goto L_0x018e;
    L_0x0168:
        r0 = r7.contains(r13);	 Catch:{ Exception -> 0x01db }
        if (r0 != 0) goto L_0x018c;
    L_0x016e:
        r0 = r7.contains(r12);	 Catch:{ Exception -> 0x01db }
        if (r0 != 0) goto L_0x018c;
    L_0x0174:
        r0 = r7.contains(r10);	 Catch:{ Exception -> 0x01db }
        if (r0 != 0) goto L_0x018c;
    L_0x017a:
        r0 = "utm_term";
        r0 = r7.contains(r0);	 Catch:{ Exception -> 0x01db }
        if (r0 != 0) goto L_0x018c;
    L_0x0183:
        r0 = "utm_content";
        r0 = r7.contains(r0);	 Catch:{ Exception -> 0x01db }
        if (r0 == 0) goto L_0x018e;
    L_0x018c:
        r18 = 1;
    L_0x018e:
        if (r18 != 0) goto L_0x01a9;
    L_0x0190:
        r0 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r0 = r0.zzab();	 Catch:{ Exception -> 0x01db }
        r0 = r0.zzgr();	 Catch:{ Exception -> 0x01db }
        r4 = r17;
        r0.zzao(r4);	 Catch:{ Exception -> 0x01db }
        r0 = r1.zzpt;
        r0 = r0.zzt();
        r0.onActivityCreated(r2, r3);
        return;
    L_0x01a9:
        r0 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r0 = r0.zzab();	 Catch:{ Exception -> 0x01db }
        r0 = r0.zzgr();	 Catch:{ Exception -> 0x01db }
        r4 = "Activity created with referrer";
        r0.zza(r4, r7);	 Catch:{ Exception -> 0x01db }
        r0 = android.text.TextUtils.isEmpty(r7);	 Catch:{ Exception -> 0x01db }
        if (r0 != 0) goto L_0x01c5;
    L_0x01be:
        r0 = r1.zzpt;	 Catch:{ Exception -> 0x01db }
        r4 = "_ldl";
        r0.zzb(r6, r4, r7, r8);	 Catch:{ Exception -> 0x01db }
    L_0x01c5:
        r0 = r1.zzpt;
        r0 = r0.zzt();
        r0.onActivityCreated(r2, r3);
        return;
    L_0x01cf:
        r0 = r1.zzpt;
        r0 = r0.zzt();
        r0.onActivityCreated(r2, r3);
        return;
    L_0x01d9:
        r0 = move-exception;
        goto L_0x01f5;
    L_0x01db:
        r0 = move-exception;
        r4 = r1.zzpt;	 Catch:{ all -> 0x01d9 }
        r4 = r4.zzab();	 Catch:{ all -> 0x01d9 }
        r4 = r4.zzgk();	 Catch:{ all -> 0x01d9 }
        r5 = "Throwable caught in onActivityCreated";
        r4.zza(r5, r0);	 Catch:{ all -> 0x01d9 }
        r0 = r1.zzpt;
        r0 = r0.zzt();
        r0.onActivityCreated(r2, r3);
        return;
    L_0x01f5:
        r4 = r1.zzpt;
        r4 = r4.zzt();
        r4.onActivityCreated(r2, r3);
        goto L_0x0200;
    L_0x01ff:
        throw r0;
    L_0x0200:
        goto L_0x01ff;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhj.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public final void onActivityDestroyed(Activity activity) {
        this.zzpt.zzt().onActivityDestroyed(activity);
    }

    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.zzpt.zzt().onActivityPaused(activity);
        zziw zzv = this.zzpt.zzv();
        zzv.zzaa().zza(new zzja(zzv, zzv.zzx().elapsedRealtime()));
    }

    @MainThread
    public final void onActivityResumed(Activity activity) {
        this.zzpt.zzt().onActivityResumed(activity);
        zziw zzv = this.zzpt.zzv();
        zzv.zzaa().zza(new zzjb(zzv, zzv.zzx().elapsedRealtime()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zzpt.zzt().onActivitySaveInstanceState(activity, bundle);
    }

    /* synthetic */ zzhj(zzgp zzgp, zzgo zzgo) {
        this(zzgp);
    }
}

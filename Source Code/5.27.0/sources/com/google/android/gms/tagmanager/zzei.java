package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzb;

final class zzei extends zzbq {
    private static final String ID = zza.RANDOM.toString();
    private static final String zzaix = zzb.MIN.toString();
    private static final String zzaiy = zzb.MAX.toString();

    public zzei() {
        super(ID, new String[0]);
    }

    public final boolean zzgw() {
        return false;
    }

    /* JADX WARNING: Missing block: B:12:0x003e, code skipped:
            if (r0 <= r2) goto L_0x0048;
     */
    public final com.google.android.gms.internal.gtm.zzl zzb(java.util.Map<java.lang.String, com.google.android.gms.internal.gtm.zzl> r7) {
        /*
        r6 = this;
        r0 = zzaix;
        r0 = r7.get(r0);
        r0 = (com.google.android.gms.internal.gtm.zzl) r0;
        r1 = zzaiy;
        r7 = r7.get(r1);
        r7 = (com.google.android.gms.internal.gtm.zzl) r7;
        if (r0 == 0) goto L_0x0041;
    L_0x0012:
        r1 = com.google.android.gms.tagmanager.zzgj.zzkc();
        if (r0 == r1) goto L_0x0041;
    L_0x0018:
        if (r7 == 0) goto L_0x0041;
    L_0x001a:
        r1 = com.google.android.gms.tagmanager.zzgj.zzkc();
        if (r7 == r1) goto L_0x0041;
    L_0x0020:
        r0 = com.google.android.gms.tagmanager.zzgj.zzd(r0);
        r7 = com.google.android.gms.tagmanager.zzgj.zzd(r7);
        r1 = com.google.android.gms.tagmanager.zzgj.zzka();
        if (r0 == r1) goto L_0x0041;
    L_0x002e:
        r1 = com.google.android.gms.tagmanager.zzgj.zzka();
        if (r7 == r1) goto L_0x0041;
    L_0x0034:
        r0 = r0.doubleValue();
        r2 = r7.doubleValue();
        r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r7 > 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0048;
    L_0x0041:
        r0 = 0;
        r2 = 4746794007244308480; // 0x41dfffffffc00000 float:NaN double:2.147483647E9;
    L_0x0048:
        r4 = java.lang.Math.random();
        r2 = r2 - r0;
        r4 = r4 * r2;
        r4 = r4 + r0;
        r0 = java.lang.Math.round(r4);
        r7 = java.lang.Long.valueOf(r0);
        r7 = com.google.android.gms.tagmanager.zzgj.zzi(r7);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzei.zzb(java.util.Map):com.google.android.gms.internal.gtm.zzl");
    }
}

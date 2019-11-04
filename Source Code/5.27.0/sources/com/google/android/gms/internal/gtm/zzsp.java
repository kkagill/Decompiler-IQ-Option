package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzsp<T> implements zzsz<T> {
    private final zzsk zzbdc;
    private final boolean zzbdd;
    private final zztr<?, ?> zzbdm;
    private final zzqq<?> zzbdn;

    private zzsp(zztr<?, ?> zztr, zzqq<?> zzqq, zzsk zzsk) {
        this.zzbdm = zztr;
        this.zzbdd = zzqq.zze(zzsk);
        this.zzbdn = zzqq;
        this.zzbdc = zzsk;
    }

    static <T> zzsp<T> zza(zztr<?, ?> zztr, zzqq<?> zzqq, zzsk zzsk) {
        return new zzsp(zztr, zzqq, zzsk);
    }

    public final T newInstance() {
        return this.zzbdc.zzph().zzpl();
    }

    public final boolean equals(T t, T t2) {
        if (this.zzbdm.zzag(t).equals(this.zzbdm.zzag(t2))) {
            return this.zzbdd ? this.zzbdn.zzr(t).equals(this.zzbdn.zzr(t2)) : true;
        } else {
            return false;
        }
    }

    public final int hashCode(T t) {
        int hashCode = this.zzbdm.zzag(t).hashCode();
        return this.zzbdd ? (hashCode * 53) + this.zzbdn.zzr(t).hashCode() : hashCode;
    }

    public final void zzd(T t, T t2) {
        zztb.zza(this.zzbdm, (Object) t, (Object) t2);
        if (this.zzbdd) {
            zztb.zza(this.zzbdn, (Object) t, (Object) t2);
        }
    }

    public final void zza(T t, zzum zzum) {
        Iterator it = this.zzbdn.zzr(t).iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            zzqv zzqv = (zzqv) entry.getKey();
            if (zzqv.zzoy() != zzul.MESSAGE || zzqv.zzoz() || zzqv.zzpa()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof zzrp) {
                zzum.zza(zzqv.zzc(), ((zzrp) entry).zzpz().zzmv());
            } else {
                zzum.zza(zzqv.zzc(), entry.getValue());
            }
        }
        zztr zztr = this.zzbdm;
        zztr.zzc(zztr.zzag(t), zzum);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085 A:{SYNTHETIC} */
    public final void zza(T r11, com.google.android.gms.internal.gtm.zzsy r12, com.google.android.gms.internal.gtm.zzqp r13) {
        /*
        r10 = this;
        r0 = r10.zzbdm;
        r1 = r10.zzbdn;
        r2 = r0.zzah(r11);
        r3 = r1.zzs(r11);
    L_0x000c:
        r4 = r12.zzog();	 Catch:{ all -> 0x008e }
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r4 != r5) goto L_0x0019;
    L_0x0015:
        r0.zzg(r11, r2);
        return;
    L_0x0019:
        r4 = r12.getTag();	 Catch:{ all -> 0x008e }
        r6 = 11;
        if (r4 == r6) goto L_0x003e;
    L_0x0021:
        r5 = r4 & 7;
        r6 = 2;
        if (r5 != r6) goto L_0x0039;
    L_0x0026:
        r5 = r10.zzbdc;	 Catch:{ all -> 0x008e }
        r4 = r4 >>> 3;
        r4 = r1.zza(r13, r5, r4);	 Catch:{ all -> 0x008e }
        if (r4 == 0) goto L_0x0034;
    L_0x0030:
        r1.zza(r12, r4, r13, r3);	 Catch:{ all -> 0x008e }
        goto L_0x0082;
    L_0x0034:
        r4 = r0.zza(r2, r12);	 Catch:{ all -> 0x008e }
        goto L_0x0083;
    L_0x0039:
        r4 = r12.zzoh();	 Catch:{ all -> 0x008e }
        goto L_0x0083;
    L_0x003e:
        r4 = 0;
        r6 = 0;
        r7 = r6;
    L_0x0041:
        r8 = r12.zzog();	 Catch:{ all -> 0x008e }
        if (r8 == r5) goto L_0x006f;
    L_0x0047:
        r8 = r12.getTag();	 Catch:{ all -> 0x008e }
        r9 = 16;
        if (r8 != r9) goto L_0x005a;
    L_0x004f:
        r4 = r12.zznr();	 Catch:{ all -> 0x008e }
        r6 = r10.zzbdc;	 Catch:{ all -> 0x008e }
        r6 = r1.zza(r13, r6, r4);	 Catch:{ all -> 0x008e }
        goto L_0x0041;
    L_0x005a:
        r9 = 26;
        if (r8 != r9) goto L_0x0069;
    L_0x005e:
        if (r6 == 0) goto L_0x0064;
    L_0x0060:
        r1.zza(r12, r6, r13, r3);	 Catch:{ all -> 0x008e }
        goto L_0x0041;
    L_0x0064:
        r7 = r12.zznq();	 Catch:{ all -> 0x008e }
        goto L_0x0041;
    L_0x0069:
        r8 = r12.zzoh();	 Catch:{ all -> 0x008e }
        if (r8 != 0) goto L_0x0041;
    L_0x006f:
        r5 = r12.getTag();	 Catch:{ all -> 0x008e }
        r8 = 12;
        if (r5 != r8) goto L_0x0089;
    L_0x0077:
        if (r7 == 0) goto L_0x0082;
    L_0x0079:
        if (r6 == 0) goto L_0x007f;
    L_0x007b:
        r1.zza(r7, r6, r13, r3);	 Catch:{ all -> 0x008e }
        goto L_0x0082;
    L_0x007f:
        r0.zza(r2, r4, r7);	 Catch:{ all -> 0x008e }
    L_0x0082:
        r4 = 1;
    L_0x0083:
        if (r4 != 0) goto L_0x000c;
    L_0x0085:
        r0.zzg(r11, r2);
        return;
    L_0x0089:
        r12 = com.google.android.gms.internal.gtm.zzrk.zzps();	 Catch:{ all -> 0x008e }
        throw r12;	 Catch:{ all -> 0x008e }
    L_0x008e:
        r12 = move-exception;
        r0.zzg(r11, r2);
        goto L_0x0094;
    L_0x0093:
        throw r12;
    L_0x0094:
        goto L_0x0093;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzsp.zza(java.lang.Object, com.google.android.gms.internal.gtm.zzsy, com.google.android.gms.internal.gtm.zzqp):void");
    }

    public final void zzt(T t) {
        this.zzbdm.zzt(t);
        this.zzbdn.zzt(t);
    }

    public final boolean zzae(T t) {
        return this.zzbdn.zzr(t).isInitialized();
    }

    public final int zzad(T t) {
        zztr zztr = this.zzbdm;
        int zzai = zztr.zzai(zztr.zzag(t)) + 0;
        return this.zzbdd ? zzai + this.zzbdn.zzr(t).zzow() : zzai;
    }
}

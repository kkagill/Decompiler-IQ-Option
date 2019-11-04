package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzhl<T> implements zzhw<T> {
    private final zzhf zzzh;
    private final boolean zzzi;
    private final zzio<?, ?> zzzr;
    private final zzfl<?> zzzs;

    private zzhl(zzio<?, ?> zzio, zzfl<?> zzfl, zzhf zzhf) {
        this.zzzr = zzio;
        this.zzzi = zzfl.zze(zzhf);
        this.zzzs = zzfl;
        this.zzzh = zzhf;
    }

    static <T> zzhl<T> zza(zzio<?, ?> zzio, zzfl<?> zzfl, zzhf zzhf) {
        return new zzhl(zzio, zzfl, zzhf);
    }

    public final T newInstance() {
        return this.zzzh.zzfa().zzff();
    }

    public final boolean equals(T t, T t2) {
        if (this.zzzr.zzt(t).equals(this.zzzr.zzt(t2))) {
            return this.zzzi ? this.zzzs.zzc(t).equals(this.zzzs.zzc(t2)) : true;
        } else {
            return false;
        }
    }

    public final int hashCode(T t) {
        int hashCode = this.zzzr.zzt(t).hashCode();
        return this.zzzi ? (hashCode * 53) + this.zzzs.zzc(t).hashCode() : hashCode;
    }

    public final void zzc(T t, T t2) {
        zzhy.zza(this.zzzr, (Object) t, (Object) t2);
        if (this.zzzi) {
            zzhy.zza(this.zzzs, (Object) t, (Object) t2);
        }
    }

    public final void zza(T t, zzjj zzjj) {
        Iterator it = this.zzzs.zzc(t).iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            zzfr zzfr = (zzfr) entry.getKey();
            if (zzfr.zzet() != zzji.MESSAGE || zzfr.zzeu() || zzfr.zzev()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof zzgk) {
                zzjj.zza(zzfr.zzr(), ((zzgk) entry).zzfs().zzce());
            } else {
                zzjj.zza(zzfr.zzr(), entry.getValue());
            }
        }
        zzio zzio = this.zzzr;
        zzio.zzc(zzio.zzt(t), zzjj);
    }

    public final void zza(T t, byte[] bArr, int i, int i2, zzei zzei) {
        zzfy zzfy = (zzfy) t;
        zzip zzip = zzfy.zzwj;
        if (zzip == zzip.zzhe()) {
            zzip = zzip.zzhf();
            zzfy.zzwj = zzip;
        }
        zzip zzip2 = zzip;
        while (i < i2) {
            int zza = zzeh.zza(bArr, i, zzei);
            int i3 = zzei.zzro;
            if (i3 == 11) {
                i = 0;
                Object obj = null;
                while (zza < i2) {
                    zza = zzeh.zza(bArr, zza, zzei);
                    int i4 = zzei.zzro;
                    int i5 = i4 >>> 3;
                    int i6 = i4 & 7;
                    if (i5 != 2) {
                        if (i5 == 3 && i6 == 2) {
                            zza = zzeh.zze(bArr, zza, zzei);
                            obj = (zzeo) zzei.zzrq;
                        }
                    } else if (i6 == 0) {
                        zza = zzeh.zza(bArr, zza, zzei);
                        i = zzei.zzro;
                    }
                    if (i4 == 12) {
                        break;
                    }
                    zza = zzeh.zza(i4, bArr, zza, i2, zzei);
                }
                if (obj != null) {
                    zzip2.zzb((i << 3) | 2, obj);
                }
                i = zza;
            } else if ((i3 & 7) == 2) {
                i = zzeh.zza(i3, bArr, zza, i2, zzip2, zzei);
            } else {
                i = zzeh.zza(i3, bArr, zza, i2, zzei);
            }
        }
        if (i != i2) {
            throw zzgf.zzfo();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085 A:{SYNTHETIC} */
    public final void zza(T r11, com.google.android.gms.internal.vision.zzhv r12, com.google.android.gms.internal.vision.zzfk r13) {
        /*
        r10 = this;
        r0 = r10.zzzr;
        r1 = r10.zzzs;
        r2 = r0.zzu(r11);
        r3 = r1.zzd(r11);
    L_0x000c:
        r4 = r12.zzcn();	 Catch:{ all -> 0x008e }
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r4 != r5) goto L_0x0019;
    L_0x0015:
        r0.zzf(r11, r2);
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
        r5 = r10.zzzh;	 Catch:{ all -> 0x008e }
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
        r4 = r12.zzco();	 Catch:{ all -> 0x008e }
        goto L_0x0083;
    L_0x003e:
        r4 = 0;
        r6 = 0;
        r7 = r6;
    L_0x0041:
        r8 = r12.zzcn();	 Catch:{ all -> 0x008e }
        if (r8 == r5) goto L_0x006f;
    L_0x0047:
        r8 = r12.getTag();	 Catch:{ all -> 0x008e }
        r9 = 16;
        if (r8 != r9) goto L_0x005a;
    L_0x004f:
        r4 = r12.zzcx();	 Catch:{ all -> 0x008e }
        r6 = r10.zzzh;	 Catch:{ all -> 0x008e }
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
        r7 = r12.zzcw();	 Catch:{ all -> 0x008e }
        goto L_0x0041;
    L_0x0069:
        r8 = r12.zzco();	 Catch:{ all -> 0x008e }
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
        r0.zzf(r11, r2);
        return;
    L_0x0089:
        r12 = com.google.android.gms.internal.vision.zzgf.zzfl();	 Catch:{ all -> 0x008e }
        throw r12;	 Catch:{ all -> 0x008e }
    L_0x008e:
        r12 = move-exception;
        r0.zzf(r11, r2);
        goto L_0x0094;
    L_0x0093:
        throw r12;
    L_0x0094:
        goto L_0x0093;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhl.zza(java.lang.Object, com.google.android.gms.internal.vision.zzhv, com.google.android.gms.internal.vision.zzfk):void");
    }

    public final void zze(T t) {
        this.zzzr.zze(t);
        this.zzzs.zze((Object) t);
    }

    public final boolean zzr(T t) {
        return this.zzzs.zzc(t).isInitialized();
    }

    public final int zzp(T t) {
        zzio zzio = this.zzzr;
        int zzv = zzio.zzv(zzio.zzt(t)) + 0;
        return this.zzzi ? zzv + this.zzzs.zzc(t).zzer() : zzv;
    }
}

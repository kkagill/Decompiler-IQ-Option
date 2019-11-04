package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey.zzb;
import com.google.android.gms.internal.measurement.zzey.zze;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzgo<T> implements zzgx<T> {
    private final zzgi zzakn;
    private final boolean zzako;
    private final zzhp<?, ?> zzakx;
    private final zzen<?> zzaky;

    private zzgo(zzhp<?, ?> zzhp, zzen<?> zzen, zzgi zzgi) {
        this.zzakx = zzhp;
        this.zzako = zzen.zze(zzgi);
        this.zzaky = zzen;
        this.zzakn = zzgi;
    }

    static <T> zzgo<T> zza(zzhp<?, ?> zzhp, zzen<?> zzen, zzgi zzgi) {
        return new zzgo(zzhp, zzen, zzgi);
    }

    public final T newInstance() {
        return this.zzakn.zzup().zzuf();
    }

    public final boolean equals(T t, T t2) {
        if (this.zzakx.zzx(t).equals(this.zzakx.zzx(t2))) {
            return this.zzako ? this.zzaky.zzh(t).equals(this.zzaky.zzh(t2)) : true;
        } else {
            return false;
        }
    }

    public final int hashCode(T t) {
        int hashCode = this.zzakx.zzx(t).hashCode();
        return this.zzako ? (hashCode * 53) + this.zzaky.zzh(t).hashCode() : hashCode;
    }

    public final void zzc(T t, T t2) {
        zzgz.zza(this.zzakx, (Object) t, (Object) t2);
        if (this.zzako) {
            zzgz.zza(this.zzaky, (Object) t, (Object) t2);
        }
    }

    public final void zza(T t, zzim zzim) {
        Iterator it = this.zzaky.zzh(t).iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            zzeq zzeq = (zzeq) entry.getKey();
            if (zzeq.zztx() != zzij.MESSAGE || zzeq.zzty() || zzeq.zztz()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof zzfl) {
                zzim.zza(zzeq.zzlg(), ((zzfl) entry).zzve().zzrs());
            } else {
                zzim.zza(zzeq.zzlg(), entry.getValue());
            }
        }
        zzhp zzhp = this.zzakx;
        zzhp.zzc(zzhp.zzx(t), zzim);
    }

    public final void zza(T t, byte[] bArr, int i, int i2, zzdk zzdk) {
        zzey zzey = (zzey) t;
        zzhs zzhs = zzey.zzahz;
        if (zzhs == zzhs.zzwq()) {
            zzhs = zzhs.zzwr();
            zzey.zzahz = zzhs;
        }
        ((zzb) t).zzuq();
        zze zze = null;
        while (i < i2) {
            int zza = zzdl.zza(bArr, i, zzdk);
            int i3 = zzdk.zzada;
            if (i3 == 11) {
                i = 0;
                Object obj = null;
                while (zza < i2) {
                    zza = zzdl.zza(bArr, zza, zzdk);
                    int i4 = zzdk.zzada;
                    int i5 = i4 >>> 3;
                    int i6 = i4 & 7;
                    if (i5 != 2) {
                        if (i5 == 3) {
                            if (zze != null) {
                                zzgt.zzvy();
                                throw new NoSuchMethodError();
                            } else if (i6 == 2) {
                                zza = zzdl.zze(bArr, zza, zzdk);
                                obj = (zzdp) zzdk.zzadc;
                            }
                        }
                    } else if (i6 == 0) {
                        zza = zzdl.zza(bArr, zza, zzdk);
                        i = zzdk.zzada;
                        zze = (zze) this.zzaky.zza(zzdk.zzadd, this.zzakn, i);
                    }
                    if (i4 == 12) {
                        break;
                    }
                    zza = zzdl.zza(i4, bArr, zza, i2, zzdk);
                }
                if (obj != null) {
                    zzhs.zzb((i << 3) | 2, obj);
                }
                i = zza;
            } else if ((i3 & 7) == 2) {
                zze = (zze) this.zzaky.zza(zzdk.zzadd, this.zzakn, i3 >>> 3);
                if (zze == null) {
                    i = zzdl.zza(i3, bArr, zza, i2, zzhs, zzdk);
                } else {
                    zzgt.zzvy();
                    throw new NoSuchMethodError();
                }
            } else {
                i = zzdl.zza(i3, bArr, zza, i2, zzdk);
            }
        }
        if (i != i2) {
            throw zzfi.zzva();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085 A:{SYNTHETIC} */
    public final void zza(T r11, com.google.android.gms.internal.measurement.zzgy r12, com.google.android.gms.internal.measurement.zzel r13) {
        /*
        r10 = this;
        r0 = r10.zzakx;
        r1 = r10.zzaky;
        r2 = r0.zzy(r11);
        r3 = r1.zzi(r11);
    L_0x000c:
        r4 = r12.zzsy();	 Catch:{ all -> 0x008e }
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
        r5 = r10.zzakn;	 Catch:{ all -> 0x008e }
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
        r4 = r12.zzsz();	 Catch:{ all -> 0x008e }
        goto L_0x0083;
    L_0x003e:
        r4 = 0;
        r6 = 0;
        r7 = r6;
    L_0x0041:
        r8 = r12.zzsy();	 Catch:{ all -> 0x008e }
        if (r8 == r5) goto L_0x006f;
    L_0x0047:
        r8 = r12.getTag();	 Catch:{ all -> 0x008e }
        r9 = 16;
        if (r8 != r9) goto L_0x005a;
    L_0x004f:
        r4 = r12.zzsp();	 Catch:{ all -> 0x008e }
        r6 = r10.zzakn;	 Catch:{ all -> 0x008e }
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
        r7 = r12.zzso();	 Catch:{ all -> 0x008e }
        goto L_0x0041;
    L_0x0069:
        r8 = r12.zzsz();	 Catch:{ all -> 0x008e }
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
        r12 = com.google.android.gms.internal.measurement.zzfi.zzux();	 Catch:{ all -> 0x008e }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgo.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzgy, com.google.android.gms.internal.measurement.zzel):void");
    }

    public final void zzj(T t) {
        this.zzakx.zzj(t);
        this.zzaky.zzj(t);
    }

    public final boolean zzv(T t) {
        return this.zzaky.zzh(t).isInitialized();
    }

    public final int zzt(T t) {
        zzhp zzhp = this.zzakx;
        int zzz = zzhp.zzz(zzhp.zzx(t)) + 0;
        return this.zzako ? zzz + this.zzaky.zzh(t).zzts() : zzz;
    }
}

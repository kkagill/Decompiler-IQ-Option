package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzqt<FieldDescriptorType extends zzqv<FieldDescriptorType>> {
    private static final zzqt zzaxq = new zzqt(true);
    private boolean zzaut;
    final zztc<FieldDescriptorType, Object> zzaxo = zztc.zzbu(16);
    private boolean zzaxp = false;

    private zzqt() {
    }

    private zzqt(boolean z) {
        zzmi();
    }

    public static <T extends zzqv<T>> zzqt<T> zzov() {
        return zzaxq;
    }

    public final void zzmi() {
        if (!this.zzaut) {
            this.zzaxo.zzmi();
            this.zzaut = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzaut;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqt)) {
            return false;
        }
        return this.zzaxo.equals(((zzqt) obj).zzaxo);
    }

    public final int hashCode() {
        return this.zzaxo.hashCode();
    }

    public final Iterator<Entry<FieldDescriptorType, Object>> iterator() {
        if (this.zzaxp) {
            return new zzrq(this.zzaxo.entrySet().iterator());
        }
        return this.zzaxo.entrySet().iterator();
    }

    /* Access modifiers changed, original: final */
    public final Iterator<Entry<FieldDescriptorType, Object>> descendingIterator() {
        if (this.zzaxp) {
            return new zzrq(this.zzaxo.zzrc().iterator());
        }
        return this.zzaxo.zzrc().iterator();
    }

    private final Object zza(FieldDescriptorType fieldDescriptorType) {
        Object obj = this.zzaxo.get(fieldDescriptorType);
        return obj instanceof zzrn ? zzrn.zzpy() : obj;
    }

    private final void zza(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (!fieldDescriptorType.zzoz()) {
            zza(fieldDescriptorType.zzox(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fieldDescriptorType.zzox(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzrn) {
            this.zzaxp = true;
        }
        this.zzaxo.put((Comparable) fieldDescriptorType, obj);
    }

    /* JADX WARNING: Missing block: B:5:0x001b, code skipped:
            if ((r3 instanceof com.google.android.gms.internal.gtm.zzrn) == false) goto L_0x0043;
     */
    /* JADX WARNING: Missing block: B:9:0x0024, code skipped:
            if ((r3 instanceof com.google.android.gms.internal.gtm.zzrf) == false) goto L_0x0043;
     */
    /* JADX WARNING: Missing block: B:10:0x0026, code skipped:
            r1 = true;
     */
    /* JADX WARNING: Missing block: B:14:0x002e, code skipped:
            if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    private static void zza(com.google.android.gms.internal.gtm.zzug r2, java.lang.Object r3) {
        /*
        com.google.android.gms.internal.gtm.zzre.checkNotNull(r3);
        r0 = com.google.android.gms.internal.gtm.zzqu.zzaxr;
        r2 = r2.zzrs();
        r2 = r2.ordinal();
        r2 = r0[r2];
        r0 = 1;
        r1 = 0;
        switch(r2) {
            case 1: goto L_0x0040;
            case 2: goto L_0x003d;
            case 3: goto L_0x003a;
            case 4: goto L_0x0037;
            case 5: goto L_0x0034;
            case 6: goto L_0x0031;
            case 7: goto L_0x0028;
            case 8: goto L_0x001e;
            case 9: goto L_0x0015;
            default: goto L_0x0014;
        };
    L_0x0014:
        goto L_0x0043;
    L_0x0015:
        r2 = r3 instanceof com.google.android.gms.internal.gtm.zzsk;
        if (r2 != 0) goto L_0x0026;
    L_0x0019:
        r2 = r3 instanceof com.google.android.gms.internal.gtm.zzrn;
        if (r2 == 0) goto L_0x0043;
    L_0x001d:
        goto L_0x0026;
    L_0x001e:
        r2 = r3 instanceof java.lang.Integer;
        if (r2 != 0) goto L_0x0026;
    L_0x0022:
        r2 = r3 instanceof com.google.android.gms.internal.gtm.zzrf;
        if (r2 == 0) goto L_0x0043;
    L_0x0026:
        r1 = 1;
        goto L_0x0043;
    L_0x0028:
        r2 = r3 instanceof com.google.android.gms.internal.gtm.zzps;
        if (r2 != 0) goto L_0x0026;
    L_0x002c:
        r2 = r3 instanceof byte[];
        if (r2 == 0) goto L_0x0043;
    L_0x0030:
        goto L_0x0026;
    L_0x0031:
        r0 = r3 instanceof java.lang.String;
        goto L_0x0042;
    L_0x0034:
        r0 = r3 instanceof java.lang.Boolean;
        goto L_0x0042;
    L_0x0037:
        r0 = r3 instanceof java.lang.Double;
        goto L_0x0042;
    L_0x003a:
        r0 = r3 instanceof java.lang.Float;
        goto L_0x0042;
    L_0x003d:
        r0 = r3 instanceof java.lang.Long;
        goto L_0x0042;
    L_0x0040:
        r0 = r3 instanceof java.lang.Integer;
    L_0x0042:
        r1 = r0;
    L_0x0043:
        if (r1 == 0) goto L_0x0046;
    L_0x0045:
        return;
    L_0x0046:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Wrong object type used with protocol message reflection.";
        r2.<init>(r3);
        goto L_0x004f;
    L_0x004e:
        throw r2;
    L_0x004f:
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzqt.zza(com.google.android.gms.internal.gtm.zzug, java.lang.Object):void");
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzaxo.zzra(); i++) {
            if (!zzc(this.zzaxo.zzbv(i))) {
                return false;
            }
        }
        for (Entry zzc : this.zzaxo.zzrb()) {
            if (!zzc(zzc)) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzc(Entry<FieldDescriptorType, Object> entry) {
        zzqv zzqv = (zzqv) entry.getKey();
        if (zzqv.zzoy() == zzul.MESSAGE) {
            if (zzqv.zzoz()) {
                for (zzsk isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            }
            Object value = entry.getValue();
            if (value instanceof zzsk) {
                if (!((zzsk) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof zzrn) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public final void zza(zzqt<FieldDescriptorType> zzqt) {
        for (int i = 0; i < zzqt.zzaxo.zzra(); i++) {
            zzd(zzqt.zzaxo.zzbv(i));
        }
        for (Entry zzd : zzqt.zzaxo.zzrb()) {
            zzd(zzd);
        }
    }

    private static Object zzu(Object obj) {
        if (obj instanceof zzsq) {
            return ((zzsq) obj).zzqo();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzd(Entry<FieldDescriptorType, Object> entry) {
        Comparable comparable = (zzqv) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzrn) {
            value = zzrn.zzpy();
        }
        Object zza;
        if (comparable.zzoz()) {
            zza = zza((zzqv) comparable);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object zzu : (List) value) {
                ((List) zza).add(zzu(zzu));
            }
            this.zzaxo.put(comparable, zza);
        } else if (comparable.zzoy() == zzul.MESSAGE) {
            zza = zza((zzqv) comparable);
            if (zza == null) {
                this.zzaxo.put(comparable, zzu(value));
                return;
            }
            if (zza instanceof zzsq) {
                value = comparable.zza((zzsq) zza, (zzsq) value);
            } else {
                value = comparable.zza(((zzsk) zza).zzpg(), (zzsk) value).zzpm();
            }
            this.zzaxo.put(comparable, value);
        } else {
            this.zzaxo.put(comparable, zzu(value));
        }
    }

    static void zza(zzqj zzqj, zzug zzug, int i, Object obj) {
        if (zzug == zzug.GROUP) {
            zzsk zzsk = (zzsk) obj;
            zzre.zzf(zzsk);
            zzqj.zzd(i, 3);
            zzsk.zzb(zzqj);
            zzqj.zzd(i, 4);
            return;
        }
        zzqj.zzd(i, zzug.zzrt());
        switch (zzqu.zzaws[zzug.ordinal()]) {
            case 1:
                zzqj.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzqj.zza(((Float) obj).floatValue());
                return;
            case 3:
                zzqj.zzp(((Long) obj).longValue());
                return;
            case 4:
                zzqj.zzp(((Long) obj).longValue());
                return;
            case 5:
                zzqj.zzax(((Integer) obj).intValue());
                return;
            case 6:
                zzqj.zzr(((Long) obj).longValue());
                return;
            case 7:
                zzqj.zzba(((Integer) obj).intValue());
                return;
            case 8:
                zzqj.zzi(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzsk) obj).zzb(zzqj);
                return;
            case 10:
                zzqj.zzb((zzsk) obj);
                return;
            case 11:
                if (obj instanceof zzps) {
                    zzqj.zza((zzps) obj);
                    return;
                } else {
                    zzqj.zzcz((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzps) {
                    zzqj.zza((zzps) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzqj.zze(bArr, 0, bArr.length);
                return;
            case 13:
                zzqj.zzay(((Integer) obj).intValue());
                return;
            case 14:
                zzqj.zzba(((Integer) obj).intValue());
                return;
            case 15:
                zzqj.zzr(((Long) obj).longValue());
                return;
            case 16:
                zzqj.zzaz(((Integer) obj).intValue());
                return;
            case 17:
                zzqj.zzq(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof zzrf)) {
                    zzqj.zzax(((Integer) obj).intValue());
                    break;
                } else {
                    zzqj.zzax(((zzrf) obj).zzc());
                    return;
                }
        }
    }

    public final int zzow() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzaxo.zzra(); i2++) {
            i += zze(this.zzaxo.zzbv(i2));
        }
        for (Entry zze : this.zzaxo.zzrb()) {
            i += zze(zze);
        }
        return i;
    }

    private static int zze(Entry<FieldDescriptorType, Object> entry) {
        zzqv zzqv = (zzqv) entry.getKey();
        Object value = entry.getValue();
        if (zzqv.zzoy() != zzul.MESSAGE || zzqv.zzoz() || zzqv.zzpa()) {
            return zzb(zzqv, value);
        }
        if (value instanceof zzrn) {
            return zzqj.zzb(((zzqv) entry.getKey()).zzc(), (zzrn) value);
        }
        return zzqj.zzd(((zzqv) entry.getKey()).zzc(), (zzsk) value);
    }

    static int zza(zzug zzug, int i, Object obj) {
        i = zzqj.zzbb(i);
        if (zzug == zzug.GROUP) {
            zzre.zzf((zzsk) obj);
            i <<= 1;
        }
        return i + zzb(zzug, obj);
    }

    private static int zzb(zzug zzug, Object obj) {
        switch (zzqu.zzaws[zzug.ordinal()]) {
            case 1:
                return zzqj.zzc(((Double) obj).doubleValue());
            case 2:
                return zzqj.zzb(((Float) obj).floatValue());
            case 3:
                return zzqj.zzs(((Long) obj).longValue());
            case 4:
                return zzqj.zzt(((Long) obj).longValue());
            case 5:
                return zzqj.zzbc(((Integer) obj).intValue());
            case 6:
                return zzqj.zzv(((Long) obj).longValue());
            case 7:
                return zzqj.zzbf(((Integer) obj).intValue());
            case 8:
                return zzqj.zzj(((Boolean) obj).booleanValue());
            case 9:
                return zzqj.zzd((zzsk) obj);
            case 10:
                if (obj instanceof zzrn) {
                    return zzqj.zza((zzrn) obj);
                }
                return zzqj.zzc((zzsk) obj);
            case 11:
                if (obj instanceof zzps) {
                    return zzqj.zzb((zzps) obj);
                }
                return zzqj.zzda((String) obj);
            case 12:
                if (obj instanceof zzps) {
                    return zzqj.zzb((zzps) obj);
                }
                return zzqj.zzh((byte[]) obj);
            case 13:
                return zzqj.zzbd(((Integer) obj).intValue());
            case 14:
                return zzqj.zzbg(((Integer) obj).intValue());
            case 15:
                return zzqj.zzw(((Long) obj).longValue());
            case 16:
                return zzqj.zzbe(((Integer) obj).intValue());
            case 17:
                return zzqj.zzu(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzrf) {
                    return zzqj.zzbh(((zzrf) obj).zzc());
                }
                return zzqj.zzbh(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzqv<?> zzqv, Object obj) {
        zzug zzox = zzqv.zzox();
        int zzc = zzqv.zzc();
        if (!zzqv.zzoz()) {
            return zza(zzox, zzc, obj);
        }
        int i = 0;
        if (zzqv.zzpa()) {
            for (Object obj2 : (List) obj2) {
                i += zzb(zzox, obj2);
            }
            return (zzqj.zzbb(zzc) + i) + zzqj.zzbj(i);
        }
        for (Object obj22 : (List) obj22) {
            i += zza(zzox, zzc, obj22);
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        Entry zzbv;
        zzqt zzqt = new zzqt();
        for (int i = 0; i < this.zzaxo.zzra(); i++) {
            zzbv = this.zzaxo.zzbv(i);
            zzqt.zza((zzqv) zzbv.getKey(), zzbv.getValue());
        }
        for (Entry zzbv2 : this.zzaxo.zzrb()) {
            zzqt.zza((zzqv) zzbv2.getKey(), zzbv2.getValue());
        }
        zzqt.zzaxp = this.zzaxp;
        return zzqt;
    }
}

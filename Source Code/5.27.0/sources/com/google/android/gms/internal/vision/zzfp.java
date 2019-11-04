package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzfp<FieldDescriptorType extends zzfr<FieldDescriptorType>> {
    private static final zzfp zztp = new zzfp(true);
    private final zzhz<FieldDescriptorType, Object> zztm = zzhz.zzbo(16);
    private boolean zztn;
    private boolean zzto = false;

    private zzfp() {
    }

    private zzfp(boolean z) {
        zzci();
    }

    public static <T extends zzfr<T>> zzfp<T> zzep() {
        return zztp;
    }

    /* Access modifiers changed, original: final */
    public final boolean isEmpty() {
        return this.zztm.isEmpty();
    }

    public final void zzci() {
        if (!this.zztn) {
            this.zztm.zzci();
            this.zztn = true;
        }
    }

    public final boolean isImmutable() {
        return this.zztn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfp)) {
            return false;
        }
        return this.zztm.equals(((zzfp) obj).zztm);
    }

    public final int hashCode() {
        return this.zztm.hashCode();
    }

    public final Iterator<Entry<FieldDescriptorType, Object>> iterator() {
        if (this.zzto) {
            return new zzgl(this.zztm.entrySet().iterator());
        }
        return this.zztm.entrySet().iterator();
    }

    /* Access modifiers changed, original: final */
    public final Iterator<Entry<FieldDescriptorType, Object>> descendingIterator() {
        if (this.zzto) {
            return new zzgl(this.zztm.zzgw().iterator());
        }
        return this.zztm.zzgw().iterator();
    }

    public final Object zza(FieldDescriptorType fieldDescriptorType) {
        Object obj = this.zztm.get(fieldDescriptorType);
        return obj instanceof zzgi ? zzgi.zzfr() : obj;
    }

    public final void zza(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (!fieldDescriptorType.zzeu()) {
            zza(fieldDescriptorType.zzes(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fieldDescriptorType.zzes(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzgi) {
            this.zzto = true;
        }
        this.zztm.put((Comparable) fieldDescriptorType, obj);
    }

    public final void zzb(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (fieldDescriptorType.zzeu()) {
            List arrayList;
            zza(fieldDescriptorType.zzes(), obj);
            Object zza = zza((zzfr) fieldDescriptorType);
            if (zza == null) {
                arrayList = new ArrayList();
                this.zztm.put((Comparable) fieldDescriptorType, (Object) arrayList);
            } else {
                arrayList = (List) zza;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARNING: Missing block: B:5:0x001b, code skipped:
            if ((r3 instanceof com.google.android.gms.internal.vision.zzgi) == false) goto L_0x0043;
     */
    /* JADX WARNING: Missing block: B:9:0x0024, code skipped:
            if ((r3 instanceof com.google.android.gms.internal.vision.zzgb) == false) goto L_0x0043;
     */
    /* JADX WARNING: Missing block: B:10:0x0026, code skipped:
            r1 = true;
     */
    /* JADX WARNING: Missing block: B:14:0x002e, code skipped:
            if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    private static void zza(com.google.android.gms.internal.vision.zzjd r2, java.lang.Object r3) {
        /*
        com.google.android.gms.internal.vision.zzga.checkNotNull(r3);
        r0 = com.google.android.gms.internal.vision.zzfq.zztq;
        r2 = r2.zzho();
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
        r2 = r3 instanceof com.google.android.gms.internal.vision.zzhf;
        if (r2 != 0) goto L_0x0026;
    L_0x0019:
        r2 = r3 instanceof com.google.android.gms.internal.vision.zzgi;
        if (r2 == 0) goto L_0x0043;
    L_0x001d:
        goto L_0x0026;
    L_0x001e:
        r2 = r3 instanceof java.lang.Integer;
        if (r2 != 0) goto L_0x0026;
    L_0x0022:
        r2 = r3 instanceof com.google.android.gms.internal.vision.zzgb;
        if (r2 == 0) goto L_0x0043;
    L_0x0026:
        r1 = 1;
        goto L_0x0043;
    L_0x0028:
        r2 = r3 instanceof com.google.android.gms.internal.vision.zzeo;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfp.zza(com.google.android.gms.internal.vision.zzjd, java.lang.Object):void");
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zztm.zzgu(); i++) {
            if (!zzb(this.zztm.zzbp(i))) {
                return false;
            }
        }
        for (Entry zzb : this.zztm.zzgv()) {
            if (!zzb(zzb)) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzb(Entry<FieldDescriptorType, Object> entry) {
        zzfr zzfr = (zzfr) entry.getKey();
        if (zzfr.zzet() == zzji.MESSAGE) {
            if (zzfr.zzeu()) {
                for (zzhf isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            }
            Object value = entry.getValue();
            if (value instanceof zzhf) {
                if (!((zzhf) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof zzgi) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public final void zza(zzfp<FieldDescriptorType> zzfp) {
        for (int i = 0; i < zzfp.zztm.zzgu(); i++) {
            zzc(zzfp.zztm.zzbp(i));
        }
        for (Entry zzc : zzfp.zztm.zzgv()) {
            zzc(zzc);
        }
    }

    private static Object zzf(Object obj) {
        if (obj instanceof zzhm) {
            return ((zzhm) obj).zzgh();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzc(Entry<FieldDescriptorType, Object> entry) {
        Comparable comparable = (zzfr) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzgi) {
            value = zzgi.zzfr();
        }
        Object zza;
        if (comparable.zzeu()) {
            zza = zza((zzfr) comparable);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object zzf : (List) value) {
                ((List) zza).add(zzf(zzf));
            }
            this.zztm.put(comparable, zza);
        } else if (comparable.zzet() == zzji.MESSAGE) {
            zza = zza((zzfr) comparable);
            if (zza == null) {
                this.zztm.put(comparable, zzf(value));
                return;
            }
            if (zza instanceof zzhm) {
                value = comparable.zza((zzhm) zza, (zzhm) value);
            } else {
                value = comparable.zza(((zzhf) zza).zzez(), (zzhf) value).zzfg();
            }
            this.zztm.put(comparable, value);
        } else {
            this.zztm.put(comparable, zzf(value));
        }
    }

    static void zza(zzfe zzfe, zzjd zzjd, int i, Object obj) {
        if (zzjd == zzjd.GROUP) {
            zzhf zzhf = (zzhf) obj;
            zzga.zzf(zzhf);
            zzfe.zzd(i, 3);
            zzhf.zzb(zzfe);
            zzfe.zzd(i, 4);
            return;
        }
        zzfe.zzd(i, zzjd.zzhp());
        switch (zzfq.zzrr[zzjd.ordinal()]) {
            case 1:
                zzfe.zza(((Double) obj).doubleValue());
                break;
            case 2:
                zzfe.zzf(((Float) obj).floatValue());
                return;
            case 3:
                zzfe.zze(((Long) obj).longValue());
                return;
            case 4:
                zzfe.zze(((Long) obj).longValue());
                return;
            case 5:
                zzfe.zzar(((Integer) obj).intValue());
                return;
            case 6:
                zzfe.zzg(((Long) obj).longValue());
                return;
            case 7:
                zzfe.zzau(((Integer) obj).intValue());
                return;
            case 8:
                zzfe.zzh(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzhf) obj).zzb(zzfe);
                return;
            case 10:
                zzfe.zzb((zzhf) obj);
                return;
            case 11:
                if (obj instanceof zzeo) {
                    zzfe.zza((zzeo) obj);
                    return;
                } else {
                    zzfe.zzm((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzeo) {
                    zzfe.zza((zzeo) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzfe.zzf(bArr, 0, bArr.length);
                return;
            case 13:
                zzfe.zzas(((Integer) obj).intValue());
                return;
            case 14:
                zzfe.zzau(((Integer) obj).intValue());
                return;
            case 15:
                zzfe.zzg(((Long) obj).longValue());
                return;
            case 16:
                zzfe.zzat(((Integer) obj).intValue());
                return;
            case 17:
                zzfe.zzf(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof zzgb)) {
                    zzfe.zzar(((Integer) obj).intValue());
                    break;
                } else {
                    zzfe.zzar(((zzgb) obj).zzr());
                    return;
                }
        }
    }

    public final int zzeq() {
        Entry zzbp;
        int i = 0;
        for (int i2 = 0; i2 < this.zztm.zzgu(); i2++) {
            zzbp = this.zztm.zzbp(i2);
            i += zzc((zzfr) zzbp.getKey(), zzbp.getValue());
        }
        for (Entry zzbp2 : this.zztm.zzgv()) {
            i += zzc((zzfr) zzbp2.getKey(), zzbp2.getValue());
        }
        return i;
    }

    public final int zzer() {
        int i = 0;
        for (int i2 = 0; i2 < this.zztm.zzgu(); i2++) {
            i += zzd(this.zztm.zzbp(i2));
        }
        for (Entry zzd : this.zztm.zzgv()) {
            i += zzd(zzd);
        }
        return i;
    }

    private static int zzd(Entry<FieldDescriptorType, Object> entry) {
        zzfr zzfr = (zzfr) entry.getKey();
        Object value = entry.getValue();
        if (zzfr.zzet() != zzji.MESSAGE || zzfr.zzeu() || zzfr.zzev()) {
            return zzc(zzfr, value);
        }
        if (value instanceof zzgi) {
            return zzfe.zzb(((zzfr) entry.getKey()).zzr(), (zzgi) value);
        }
        return zzfe.zzd(((zzfr) entry.getKey()).zzr(), (zzhf) value);
    }

    static int zza(zzjd zzjd, int i, Object obj) {
        i = zzfe.zzav(i);
        if (zzjd == zzjd.GROUP) {
            zzga.zzf((zzhf) obj);
            i <<= 1;
        }
        return i + zzb(zzjd, obj);
    }

    private static int zzb(zzjd zzjd, Object obj) {
        switch (zzfq.zzrr[zzjd.ordinal()]) {
            case 1:
                return zzfe.zzb(((Double) obj).doubleValue());
            case 2:
                return zzfe.zzg(((Float) obj).floatValue());
            case 3:
                return zzfe.zzh(((Long) obj).longValue());
            case 4:
                return zzfe.zzi(((Long) obj).longValue());
            case 5:
                return zzfe.zzaw(((Integer) obj).intValue());
            case 6:
                return zzfe.zzk(((Long) obj).longValue());
            case 7:
                return zzfe.zzaz(((Integer) obj).intValue());
            case 8:
                return zzfe.zzi(((Boolean) obj).booleanValue());
            case 9:
                return zzfe.zzd((zzhf) obj);
            case 10:
                if (obj instanceof zzgi) {
                    return zzfe.zza((zzgi) obj);
                }
                return zzfe.zzc((zzhf) obj);
            case 11:
                if (obj instanceof zzeo) {
                    return zzfe.zzb((zzeo) obj);
                }
                return zzfe.zzn((String) obj);
            case 12:
                if (obj instanceof zzeo) {
                    return zzfe.zzb((zzeo) obj);
                }
                return zzfe.zzh((byte[]) obj);
            case 13:
                return zzfe.zzax(((Integer) obj).intValue());
            case 14:
                return zzfe.zzba(((Integer) obj).intValue());
            case 15:
                return zzfe.zzl(((Long) obj).longValue());
            case 16:
                return zzfe.zzay(((Integer) obj).intValue());
            case 17:
                return zzfe.zzj(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzgb) {
                    return zzfe.zzbb(((zzgb) obj).zzr());
                }
                return zzfe.zzbb(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zzc(zzfr<?> zzfr, Object obj) {
        zzjd zzes = zzfr.zzes();
        int zzr = zzfr.zzr();
        if (!zzfr.zzeu()) {
            return zza(zzes, zzr, obj);
        }
        int i = 0;
        if (zzfr.zzev()) {
            for (Object obj2 : (List) obj2) {
                i += zzb(zzes, obj2);
            }
            return (zzfe.zzav(zzr) + i) + zzfe.zzbd(i);
        }
        for (Object obj22 : (List) obj22) {
            i += zza(zzes, zzr, obj22);
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        Entry zzbp;
        zzfp zzfp = new zzfp();
        for (int i = 0; i < this.zztm.zzgu(); i++) {
            zzbp = this.zztm.zzbp(i);
            zzfp.zza((zzfr) zzbp.getKey(), zzbp.getValue());
        }
        for (Entry zzbp2 : this.zztm.zzgv()) {
            zzfp.zza((zzfr) zzbp2.getKey(), zzbp2.getValue());
        }
        zzfp.zzto = this.zzto;
        return zzfp;
    }
}

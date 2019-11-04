package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy.zzd;
import com.google.android.gms.internal.vision.zzfy.zzf;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

final class zzfm extends zzfl<zze> {
    zzfm() {
    }

    /* Access modifiers changed, original: final */
    public final boolean zze(zzhf zzhf) {
        return zzhf instanceof zzd;
    }

    /* Access modifiers changed, original: final */
    public final zzfp<zze> zzc(Object obj) {
        return ((zzd) obj).zzwp;
    }

    /* Access modifiers changed, original: final */
    public final void zza(Object obj, zzfp<zze> zzfp) {
        ((zzd) obj).zzwp = zzfp;
    }

    /* Access modifiers changed, original: final */
    public final zzfp<zze> zzd(Object obj) {
        zzfp<zze> zzc = zzc(obj);
        if (!zzc.isImmutable()) {
            return zzc;
        }
        zzfp zzfp = (zzfp) zzc.clone();
        zza(obj, zzfp);
        return zzfp;
    }

    /* Access modifiers changed, original: final */
    public final void zze(Object obj) {
        zzc(obj).zzci();
    }

    /* Access modifiers changed, original: final */
    public final <UT, UB> UB zza(zzhv zzhv, Object obj, zzfk zzfk, zzfp<zze> zzfp, UB ub, zzio<UT, UB> zzio) {
        zzf zzf = (zzf) obj;
        int i = zzf.zzww.number;
        if (zzf.zzww.zzws && zzf.zzww.zzwt) {
            Object arrayList;
            switch (zzf.zzww.zzwr) {
                case DOUBLE:
                    arrayList = new ArrayList();
                    zzhv.zza(arrayList);
                    break;
                case FLOAT:
                    arrayList = new ArrayList();
                    zzhv.zzb(arrayList);
                    break;
                case INT64:
                    arrayList = new ArrayList();
                    zzhv.zzd(arrayList);
                    break;
                case UINT64:
                    arrayList = new ArrayList();
                    zzhv.zzc(arrayList);
                    break;
                case INT32:
                    arrayList = new ArrayList();
                    zzhv.zze(arrayList);
                    break;
                case FIXED64:
                    arrayList = new ArrayList();
                    zzhv.zzf(arrayList);
                    break;
                case FIXED32:
                    arrayList = new ArrayList();
                    zzhv.zzg(arrayList);
                    break;
                case BOOL:
                    arrayList = new ArrayList();
                    zzhv.zzh(arrayList);
                    break;
                case UINT32:
                    arrayList = new ArrayList();
                    zzhv.zzk(arrayList);
                    break;
                case SFIXED32:
                    arrayList = new ArrayList();
                    zzhv.zzm(arrayList);
                    break;
                case SFIXED64:
                    arrayList = new ArrayList();
                    zzhv.zzn(arrayList);
                    break;
                case SINT32:
                    arrayList = new ArrayList();
                    zzhv.zzo(arrayList);
                    break;
                case SINT64:
                    arrayList = new ArrayList();
                    zzhv.zzp(arrayList);
                    break;
                case ENUM:
                    arrayList = new ArrayList();
                    zzhv.zzl(arrayList);
                    ub = zzhy.zza(i, (List) arrayList, zzf.zzww.zzwq, (Object) ub, (zzio) zzio);
                    break;
                default:
                    String valueOf = String.valueOf(zzf.zzww.zzwr);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    stringBuilder.append("Type cannot be packed: ");
                    stringBuilder.append(valueOf);
                    throw new IllegalStateException(stringBuilder.toString());
            }
            zzfp.zza(zzf.zzww, arrayList);
        } else {
            int zzcr;
            Object obj2 = null;
            if (zzf.zzww.zzwr != zzjd.ENUM) {
                switch (zzf.zzww.zzwr) {
                    case DOUBLE:
                        obj2 = Double.valueOf(zzhv.readDouble());
                        break;
                    case FLOAT:
                        obj2 = Float.valueOf(zzhv.readFloat());
                        break;
                    case INT64:
                        obj2 = Long.valueOf(zzhv.zzcq());
                        break;
                    case UINT64:
                        obj2 = Long.valueOf(zzhv.zzcp());
                        break;
                    case INT32:
                        obj2 = Integer.valueOf(zzhv.zzcr());
                        break;
                    case FIXED64:
                        obj2 = Long.valueOf(zzhv.zzcs());
                        break;
                    case FIXED32:
                        obj2 = Integer.valueOf(zzhv.zzct());
                        break;
                    case BOOL:
                        obj2 = Boolean.valueOf(zzhv.zzcu());
                        break;
                    case UINT32:
                        obj2 = Integer.valueOf(zzhv.zzcx());
                        break;
                    case SFIXED32:
                        obj2 = Integer.valueOf(zzhv.zzcz());
                        break;
                    case SFIXED64:
                        obj2 = Long.valueOf(zzhv.zzda());
                        break;
                    case SINT32:
                        obj2 = Integer.valueOf(zzhv.zzdb());
                        break;
                    case SINT64:
                        obj2 = Long.valueOf(zzhv.zzdc());
                        break;
                    case ENUM:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case BYTES:
                        obj2 = zzhv.zzcw();
                        break;
                    case STRING:
                        obj2 = zzhv.readString();
                        break;
                    case GROUP:
                        obj2 = zzhv.zzb(zzf.zzwv.getClass(), zzfk);
                        break;
                    case MESSAGE:
                        obj2 = zzhv.zza(zzf.zzwv.getClass(), zzfk);
                        break;
                }
            }
            zzcr = zzhv.zzcr();
            if (zzf.zzww.zzwq.zzf(zzcr) == null) {
                return zzhy.zza(i, zzcr, (Object) ub, (zzio) zzio);
            }
            obj2 = Integer.valueOf(zzcr);
            if (zzf.zzww.zzws) {
                zzfp.zzb(zzf.zzww, obj2);
            } else {
                zzcr = zzfn.zzrr[zzf.zzww.zzwr.ordinal()];
                if (zzcr == 17 || zzcr == 18) {
                    Object zza = zzfp.zza(zzf.zzww);
                    if (zza != null) {
                        obj2 = zzga.zza(zza, obj2);
                    }
                }
                zzfp.zza(zzf.zzww, obj2);
            }
        }
        return ub;
    }

    /* Access modifiers changed, original: final */
    public final int zza(Entry<?, ?> entry) {
        return ((zze) entry.getKey()).number;
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzjj zzjj, Entry<?, ?> entry) {
        zze zze = (zze) entry.getKey();
        if (zze.zzws) {
            List list;
            switch (zze.zzwr) {
                case DOUBLE:
                    zzhy.zza(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    break;
                case FLOAT:
                    zzhy.zzb(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case INT64:
                    zzhy.zzc(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case UINT64:
                    zzhy.zzd(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case INT32:
                    zzhy.zzh(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case FIXED64:
                    zzhy.zzf(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case FIXED32:
                    zzhy.zzk(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case BOOL:
                    zzhy.zzn(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case UINT32:
                    zzhy.zzi(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case SFIXED32:
                    zzhy.zzl(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case SFIXED64:
                    zzhy.zzg(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case SINT32:
                    zzhy.zzj(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case SINT64:
                    zzhy.zze(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case ENUM:
                    zzhy.zzh(zze.number, (List) entry.getValue(), zzjj, zze.zzwt);
                    return;
                case BYTES:
                    zzhy.zzb(zze.number, (List) entry.getValue(), zzjj);
                    return;
                case STRING:
                    zzhy.zza(zze.number, (List) entry.getValue(), zzjj);
                    return;
                case GROUP:
                    list = (List) entry.getValue();
                    if (!(list == null || list.isEmpty())) {
                        zzhy.zzb(zze.number, (List) entry.getValue(), zzjj, zzhs.zzgl().zzf(list.get(0).getClass()));
                    }
                    return;
                case MESSAGE:
                    list = (List) entry.getValue();
                    if (!(list == null || list.isEmpty())) {
                        zzhy.zza(zze.number, (List) entry.getValue(), zzjj, zzhs.zzgl().zzf(list.get(0).getClass()));
                        break;
                    }
            }
            return;
        }
        switch (zze.zzwr) {
            case DOUBLE:
                zzjj.zza(zze.number, ((Double) entry.getValue()).doubleValue());
                break;
            case FLOAT:
                zzjj.zza(zze.number, ((Float) entry.getValue()).floatValue());
                return;
            case INT64:
                zzjj.zzi(zze.number, ((Long) entry.getValue()).longValue());
                return;
            case UINT64:
                zzjj.zza(zze.number, ((Long) entry.getValue()).longValue());
                return;
            case INT32:
                zzjj.zze(zze.number, ((Integer) entry.getValue()).intValue());
                return;
            case FIXED64:
                zzjj.zzc(zze.number, ((Long) entry.getValue()).longValue());
                return;
            case FIXED32:
                zzjj.zzh(zze.number, ((Integer) entry.getValue()).intValue());
                return;
            case BOOL:
                zzjj.zzb(zze.number, ((Boolean) entry.getValue()).booleanValue());
                return;
            case UINT32:
                zzjj.zzf(zze.number, ((Integer) entry.getValue()).intValue());
                return;
            case SFIXED32:
                zzjj.zzo(zze.number, ((Integer) entry.getValue()).intValue());
                return;
            case SFIXED64:
                zzjj.zzj(zze.number, ((Long) entry.getValue()).longValue());
                return;
            case SINT32:
                zzjj.zzg(zze.number, ((Integer) entry.getValue()).intValue());
                return;
            case SINT64:
                zzjj.zzb(zze.number, ((Long) entry.getValue()).longValue());
                return;
            case ENUM:
                zzjj.zze(zze.number, ((Integer) entry.getValue()).intValue());
                return;
            case BYTES:
                zzjj.zza(zze.number, (zzeo) entry.getValue());
                return;
            case STRING:
                zzjj.zza(zze.number, (String) entry.getValue());
                return;
            case GROUP:
                zzjj.zzb(zze.number, entry.getValue(), zzhs.zzgl().zzf(entry.getValue().getClass()));
                return;
            case MESSAGE:
                zzjj.zza(zze.number, entry.getValue(), zzhs.zzgl().zzf(entry.getValue().getClass()));
                break;
        }
    }

    /* Access modifiers changed, original: final */
    public final Object zza(zzfk zzfk, zzhf zzhf, int i) {
        return zzfk.zza(zzhf, i);
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzhv zzhv, Object obj, zzfk zzfk, zzfp<zze> zzfp) {
        zzf zzf = (zzf) obj;
        zzfp.zza(zzf.zzww, zzhv.zza(zzf.zzwv.getClass(), zzfk));
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzeo zzeo, Object obj, zzfk zzfk, zzfp<zze> zzfp) {
        byte[] bArr;
        zzf zzf = (zzf) obj;
        Object zzff = zzf.zzwv.zzfa().zzff();
        int size = zzeo.size();
        if (size == 0) {
            bArr = zzga.zzxn;
        } else {
            byte[] bArr2 = new byte[size];
            zzeo.zza(bArr2, 0, 0, size);
            bArr = bArr2;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray()) {
            zzel zzel = new zzel(wrap, true);
            zzhs.zzgl().zzs(zzff).zza(zzff, zzel, zzfk);
            zzfp.zza(zzf.zzww, zzff);
            if (zzel.zzcn() != Integer.MAX_VALUE) {
                throw zzgf.zzfl();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}

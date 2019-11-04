package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class zzur<M extends zzuq<M>, T> {
    public final int tag;
    private final int type;
    private final zzrc<?, ?> zzban;
    protected final Class<T> zzbhc;
    protected final boolean zzbhd;

    public static <M extends zzuq<M>, T extends zzuw> zzur<M, T> zza(int i, Class<T> cls, long j) {
        return new zzur(11, cls, 810, false);
    }

    private zzur(int i, Class<T> cls, int i2, boolean z) {
        this(11, cls, null, 810, false);
    }

    private zzur(int i, Class<T> cls, zzrc<?, ?> zzrc, int i2, boolean z) {
        this.type = i;
        this.zzbhc = cls;
        this.tag = i2;
        this.zzbhd = false;
        this.zzban = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzur)) {
            return false;
        }
        zzur zzur = (zzur) obj;
        return this.type == zzur.type && this.zzbhc == zzur.zzbhc && this.tag == zzur.tag && this.zzbhd == zzur.zzbhd;
    }

    public final int hashCode() {
        return ((((((this.type + 1147) * 31) + this.zzbhc.hashCode()) * 31) + this.tag) * 31) + this.zzbhd;
    }

    /* Access modifiers changed, original: final */
    public final T zzag(List<zzuy> list) {
        if (list == null) {
            return null;
        }
        if (this.zzbhd) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                zzuy zzuy = (zzuy) list.get(i);
                if (zzuy.zzawe.length != 0) {
                    arrayList.add(zzc(zzun.zzk(zzuy.zzawe)));
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                return null;
            }
            Class cls = this.zzbhc;
            Object cast = cls.cast(Array.newInstance(cls.getComponentType(), size));
            for (int i2 = 0; i2 < size; i2++) {
                Array.set(cast, i2, arrayList.get(i2));
            }
            return cast;
        } else if (list.isEmpty()) {
            return null;
        } else {
            return this.zzbhc.cast(zzc(zzun.zzk(((zzuy) list.get(list.size() - 1)).zzawe)));
        }
    }

    private final Object zzc(zzun zzun) {
        String valueOf;
        String str = "Error creating instance of class ";
        Class componentType = this.zzbhd ? this.zzbhc.getComponentType() : this.zzbhc;
        StringBuilder stringBuilder;
        try {
            int i = this.type;
            zzuw zzuw;
            if (i == 10) {
                zzuw = (zzuw) componentType.newInstance();
                zzun.zza(zzuw, this.tag >>> 3);
                return zzuw;
            } else if (i == 11) {
                zzuw = (zzuw) componentType.newInstance();
                zzun.zza(zzuw);
                return zzuw;
            } else {
                i = this.type;
                stringBuilder = new StringBuilder(24);
                stringBuilder.append("Unknown type ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (InstantiationException e) {
            valueOf = String.valueOf(componentType);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
            stringBuilder.append(str);
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        } catch (IllegalAccessException e2) {
            valueOf = String.valueOf(componentType);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
            stringBuilder.append(str);
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString(), e2);
        } catch (IOException e3) {
            throw new IllegalArgumentException("Error reading extension field", e3);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(Object obj, zzuo zzuo) {
        try {
            zzuo.zzcb(this.tag);
            int i = this.type;
            if (i == 10) {
                i = this.tag >>> 3;
                ((zzuw) obj).zza(zzuo);
                zzuo.zzd(i, 4);
            } else if (i == 11) {
                zzuo.zzb((zzuw) obj);
            } else {
                int i2 = this.type;
                StringBuilder stringBuilder = new StringBuilder(24);
                stringBuilder.append("Unknown type ");
                stringBuilder.append(i2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzaj(Object obj) {
        int i = this.tag >>> 3;
        int i2 = this.type;
        if (i2 == 10) {
            return (zzuo.zzbb(i) << 1) + ((zzuw) obj).zzpe();
        } else if (i2 == 11) {
            return zzuo.zzb(i, (zzuw) obj);
        } else {
            StringBuilder stringBuilder = new StringBuilder(24);
            stringBuilder.append("Unknown type ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

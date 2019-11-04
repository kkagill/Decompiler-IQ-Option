package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzfy<MessageType extends zzfy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzec<MessageType, BuilderType> {
    private static Map<Object, zzfy<?, ?>> zzwl = new ConcurrentHashMap();
    protected zzip zzwj = zzip.zzhe();
    private int zzwk = -1;

    public enum zzg {
        public static final int zzwx = 1;
        public static final int zzwy = 2;
        public static final int zzwz = 3;
        public static final int zzxa = 4;
        public static final int zzxb = 5;
        public static final int zzxc = 6;
        public static final int zzxd = 7;
        private static final /* synthetic */ int[] zzxe = new int[]{zzwx, zzwy, zzwz, zzxa, zzxb, zzxc, zzxd};
        public static final int zzxf = 1;
        public static final int zzxg = 2;
        private static final /* synthetic */ int[] zzxh = new int[]{zzxf, zzxg};
        public static final int zzxi = 1;
        public static final int zzxj = 2;
        private static final /* synthetic */ int[] zzxk = new int[]{zzxi, zzxj};

        public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0() {
            return (int[]) zzxe.clone();
        }
    }

    static final class zze implements zzfr<zze> {
        final int number = 202056002;
        final zzgc<?> zzwq = null;
        final zzjd zzwr;
        final boolean zzws;
        final boolean zzwt;

        zze(zzgc<?> zzgc, int i, zzjd zzjd, boolean z, boolean z2) {
            this.zzwr = zzjd;
            this.zzws = true;
            this.zzwt = false;
        }

        public final int zzr() {
            return this.number;
        }

        public final zzjd zzes() {
            return this.zzwr;
        }

        public final zzji zzet() {
            return this.zzwr.zzho();
        }

        public final boolean zzeu() {
            return this.zzws;
        }

        public final boolean zzev() {
            return this.zzwt;
        }

        public final zzhg zza(zzhg zzhg, zzhf zzhf) {
            return ((zza) zzhg).zza((zzfy) zzhf);
        }

        public final zzhm zza(zzhm zzhm, zzhm zzhm2) {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return this.number - ((zze) obj).number;
        }
    }

    public static class zzf<ContainingType extends zzhf, Type> extends zzfi<ContainingType, Type> {
        final Type zzgq;
        final ContainingType zzwu;
        final zzhf zzwv;
        final zze zzww;

        zzf(ContainingType containingType, Type type, zzhf zzhf, zze zze, Class cls) {
            if (containingType == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (zze.zzwr == zzjd.MESSAGE && zzhf == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.zzwu = containingType;
                this.zzgq = type;
                this.zzwv = zzhf;
                this.zzww = zze;
            }
        }

        /* Access modifiers changed, original: final */
        public final Object zzg(Object obj) {
            return this.zzww.zzwr.zzho() == zzji.ENUM ? this.zzww.zzwq.zzf(((Integer) obj).intValue()) : obj;
        }
    }

    public static class zzb<T extends zzfy<T, ?>> extends zzee<T> {
        private final T zzwm;

        public zzb(T t) {
            this.zzwm = t;
        }

        public final /* synthetic */ Object zza(zzez zzez, zzfk zzfk) {
            return zzfy.zza(this.zzwm, zzez, zzfk);
        }
    }

    public static abstract class zza<MessageType extends zzfy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzed<MessageType, BuilderType> {
        private final MessageType zzwm;
        protected MessageType zzwn;
        protected boolean zzwo = false;

        protected zza(MessageType messageType) {
            this.zzwm = messageType;
            this.zzwn = (zzfy) messageType.zza(zzg.zzxa, null, null);
        }

        /* Access modifiers changed, original: protected */
        public void zzfc() {
            if (this.zzwo) {
                zzfy zzfy = (zzfy) this.zzwn.zza(zzg.zzxa, null, null);
                zza(zzfy, this.zzwn);
                this.zzwn = zzfy;
                this.zzwo = false;
            }
        }

        public final boolean isInitialized() {
            return zzfy.zza(this.zzwn, false);
        }

        /* renamed from: zzfd */
        public MessageType zzff() {
            if (this.zzwo) {
                return this.zzwn;
            }
            zzfy zzfy = this.zzwn;
            zzhs.zzgl().zzs(zzfy).zze(zzfy);
            this.zzwo = true;
            return this.zzwn;
        }

        /* renamed from: zzfe */
        public final MessageType zzfg() {
            zzfy zzfy = (zzfy) zzff();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) zzfy.zza(zzg.zzwx, null, null)).byteValue();
            boolean z = true;
            if (byteValue != (byte) 1) {
                if (byteValue == (byte) 0) {
                    z = false;
                } else {
                    z = zzhs.zzgl().zzs(zzfy).zzr(zzfy);
                    if (booleanValue) {
                        zzfy.zza(zzg.zzwy, z ? zzfy : null, null);
                    }
                }
            }
            if (z) {
                return zzfy;
            }
            throw new zzin(zzfy);
        }

        public final BuilderType zza(MessageType messageType) {
            zzfc();
            zza(this.zzwn, messageType);
            return this;
        }

        private static void zza(MessageType messageType, MessageType messageType2) {
            zzhs.zzgl().zzs(messageType).zzc(messageType, messageType2);
        }

        public final /* synthetic */ zzed zzcg() {
            return (zza) clone();
        }

        public final /* synthetic */ zzhf zzfb() {
            return this.zzwm;
        }

        public /* synthetic */ Object clone() {
            zza zza = (zza) this.zzwm.zza(zzg.zzxb, null, null);
            zza.zza((zzfy) zzff());
            return zza;
        }
    }

    public static abstract class zzc<MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>> extends zza<MessageType, BuilderType> implements zzhh {
        protected zzc(MessageType messageType) {
            super(messageType);
        }

        /* Access modifiers changed, original: protected|final */
        public final void zzfc() {
            if (this.zzwo) {
                super.zzfc();
                ((zzd) this.zzwn).zzwp = (zzfp) ((zzd) this.zzwn).zzwp.clone();
            }
        }

        public /* synthetic */ zzfy zzfd() {
            return (zzd) zzff();
        }

        public /* synthetic */ zzhf zzff() {
            if (this.zzwo) {
                return (zzd) this.zzwn;
            }
            ((zzd) this.zzwn).zzwp.zzci();
            return (zzd) super.zzff();
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>> extends zzfy<MessageType, BuilderType> implements zzhh {
        protected zzfp<zze> zzwp = zzfp.zzep();

        public final <Type> Type zzc(zzfi<MessageType, Type> zzfi) {
            zzf zzb = zzfy.zza(zzfi);
            if (zzb.zzwu == ((zzfy) zzfb())) {
                Object zza = this.zzwp.zza(zzb.zzww);
                if (zza == null) {
                    return zzb.zzgq;
                }
                if (!zzb.zzww.zzws) {
                    return zzb.zzg(zza);
                }
                if (zzb.zzww.zzwr.zzho() != zzji.ENUM) {
                    return zza;
                }
                ArrayList arrayList = new ArrayList();
                for (Object zzg : (List) zza) {
                    arrayList.add(zzb.zzg(zzg));
                }
                return arrayList;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    public String toString() {
        return zzhi.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzri != 0) {
            return this.zzri;
        }
        this.zzri = zzhs.zzgl().zzs(this).hashCode(this);
        return this.zzri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzfy) zza(zzg.zzxc, null, null)).getClass().isInstance(obj)) {
            return zzhs.zzgl().zzs(this).equals(this, (zzfy) obj);
        }
        return false;
    }

    public final boolean isInitialized() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) zza(zzg.zzwx, null, null)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        boolean zzr = zzhs.zzgl().zzs(this).zzr(this);
        if (booleanValue) {
            zza(zzg.zzwy, zzr ? this : null, null);
        }
        return zzr;
    }

    /* Access modifiers changed, original: final */
    public final int zzcf() {
        return this.zzwk;
    }

    /* Access modifiers changed, original: final */
    public final void zzy(int i) {
        this.zzwk = i;
    }

    public final void zzb(zzfe zzfe) {
        zzhs.zzgl().zzf(getClass()).zza(this, zzfg.zza(zzfe));
    }

    public final int zzeq() {
        if (this.zzwk == -1) {
            this.zzwk = zzhs.zzgl().zzs(this).zzp(this);
        }
        return this.zzwk;
    }

    static <T extends zzfy<?, ?>> T zzd(Class<T> cls) {
        T t = (zzfy) zzwl.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzfy) zzwl.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzfy) ((zzfy) zziu.zzh(cls)).zza(zzg.zzxc, null, null);
            if (t != null) {
                zzwl.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzfy<?, ?>> void zza(Class<T> cls, T t) {
        zzwl.put(cls, t);
    }

    protected static Object zza(zzhf zzhf, String str, Object[] objArr) {
        return new zzhu(zzhf, str, objArr);
    }

    public static <ContainingType extends zzhf, Type> zzf<ContainingType, Type> zza(ContainingType containingType, zzhf zzhf, zzgc<?> zzgc, int i, zzjd zzjd, boolean z, Class cls) {
        return new zzf(containingType, Collections.emptyList(), zzhf, new zze(null, 202056002, zzjd, true, false), cls);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    private static <MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>, T> zzf<MessageType, T> zza(zzfi<MessageType, T> zzfi) {
        return (zzf) zzfi;
    }

    protected static final <T extends zzfy<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzg.zzwx, null, null)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        return zzhs.zzgl().zzs(t).zzr(t);
    }

    protected static <E> zzge<E> zzey() {
        return zzht.zzgm();
    }

    static <T extends zzfy<T, ?>> T zza(T t, zzez zzez, zzfk zzfk) {
        zzfy zzfy = (zzfy) t.zza(zzg.zzxa, null, null);
        try {
            zzhs.zzgl().zzs(zzfy).zza(zzfy, zzfc.zza(zzez), zzfk);
            zzhs.zzgl().zzs(zzfy).zze(zzfy);
            return zzfy;
        } catch (IOException e) {
            if (e.getCause() instanceof zzgf) {
                throw ((zzgf) e.getCause());
            }
            throw new zzgf(e.getMessage()).zzg(zzfy);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzgf) {
                throw ((zzgf) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends zzfy<T, ?>> T zza(T t, byte[] bArr) {
        zzfy zzfy = (zzfy) t.zza(zzg.zzxa, null, null);
        try {
            zzhs.zzgl().zzs(zzfy).zza(zzfy, bArr, 0, bArr.length, new zzei());
            zzhs.zzgl().zzs(zzfy).zze(zzfy);
            if (zzfy.zzri == 0) {
                return zzfy;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzgf) {
                throw ((zzgf) e.getCause());
            }
            throw new zzgf(e.getMessage()).zzg(zzfy);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgf.zzfh().zzg(zzfy);
        }
    }

    private static <T extends zzfy<T, ?>> T zza(T t, byte[] bArr, zzfk zzfk) {
        zzfy zza;
        try {
            zzez zzf = zzez.zzf(bArr);
            zza = zza((zzfy) t, zzf, zzfk);
            zzf.zzak(0);
            return zza;
        } catch (zzgf e) {
            throw e.zzg(zza);
        } catch (zzgf e2) {
            throw e2;
        }
    }

    protected static <T extends zzfy<T, ?>> T zzb(T t, byte[] bArr) {
        zzfy zza = zza((zzfy) t, bArr);
        if (zza != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) zza.zza(zzg.zzwx, null, null)).byteValue();
            boolean z = true;
            if (byteValue != (byte) 1) {
                if (byteValue == (byte) 0) {
                    z = false;
                } else {
                    z = zzhs.zzgl().zzs(zza).zzr(zza);
                    if (booleanValue) {
                        zza.zza(zzg.zzwy, z ? zza : null, null);
                    }
                }
            }
            if (!z) {
                throw new zzin(zza).zzhc().zzg(zza);
            }
        }
        return zza;
    }

    protected static <T extends zzfy<T, ?>> T zzb(T t, byte[] bArr, zzfk zzfk) {
        zzfy zza = zza((zzfy) t, bArr, zzfk);
        if (zza != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) zza.zza(zzg.zzwx, null, null)).byteValue();
            boolean z = true;
            if (byteValue != (byte) 1) {
                if (byteValue == (byte) 0) {
                    z = false;
                } else {
                    z = zzhs.zzgl().zzs(zza).zzr(zza);
                    if (booleanValue) {
                        zza.zza(zzg.zzwy, z ? zza : null, null);
                    }
                }
            }
            if (!z) {
                throw new zzin(zza).zzhc().zzg(zza);
            }
        }
        return zza;
    }

    public final /* synthetic */ zzhg zzez() {
        zza zza = (zza) zza(zzg.zzxb, null, null);
        zza.zza(this);
        return zza;
    }

    public final /* synthetic */ zzhg zzfa() {
        return (zza) zza(zzg.zzxb, null, null);
    }

    public final /* synthetic */ zzhf zzfb() {
        return (zzfy) zza(zzg.zzxc, null, null);
    }
}

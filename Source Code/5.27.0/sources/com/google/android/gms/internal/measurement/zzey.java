package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzey<MessageType extends zzey<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdf<MessageType, BuilderType> {
    private static Map<Object, zzey<?, ?>> zzaib = new ConcurrentHashMap();
    protected zzhs zzahz = zzhs.zzwq();
    private int zzaia = -1;

    public enum zzd {
        public static final int zzaid = 1;
        public static final int zzaie = 2;
        public static final int zzaif = 3;
        public static final int zzaig = 4;
        public static final int zzaih = 5;
        public static final int zzaii = 6;
        public static final int zzaij = 7;
        private static final /* synthetic */ int[] zzaik = new int[]{zzaid, zzaie, zzaif, zzaig, zzaih, zzaii, zzaij};
        public static final int zzail = 1;
        public static final int zzaim = 2;
        private static final /* synthetic */ int[] zzain = new int[]{zzail, zzaim};
        public static final int zzaio = 1;
        public static final int zzaip = 2;
        private static final /* synthetic */ int[] zzaiq = new int[]{zzaio, zzaip};

        public static int[] zzur() {
            return (int[]) zzaik.clone();
        }
    }

    public static class zze<ContainingType extends zzgi, Type> extends zzek<ContainingType, Type> {
    }

    public static class zzc<T extends zzey<T, ?>> extends zzdg<T> {
        private final T zzahw;

        public zzc(T t) {
            this.zzahw = t;
        }

        public final /* synthetic */ Object zzc(zzeb zzeb, zzel zzel) {
            return zzey.zza(this.zzahw, zzeb, zzel);
        }
    }

    public static abstract class zza<MessageType extends zzey<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdh<MessageType, BuilderType> {
        private final MessageType zzahw;
        protected MessageType zzahx;
        private boolean zzahy = false;

        protected zza(MessageType messageType) {
            this.zzahw = messageType;
            this.zzahx = (zzey) messageType.zza(zzd.zzaig, null, null);
        }

        /* Access modifiers changed, original: protected|final */
        public final void zzuc() {
            if (this.zzahy) {
                zzey zzey = (zzey) this.zzahx.zza(zzd.zzaig, null, null);
                zza(zzey, this.zzahx);
                this.zzahx = zzey;
                this.zzahy = false;
            }
        }

        public final boolean isInitialized() {
            return zzey.zza(this.zzahx, false);
        }

        /* renamed from: zzud */
        public MessageType zzuf() {
            if (this.zzahy) {
                return this.zzahx;
            }
            this.zzahx.zzry();
            this.zzahy = true;
            return this.zzahx;
        }

        /* renamed from: zzue */
        public final MessageType zzug() {
            zzey zzey = (zzey) zzuf();
            if (zzey.isInitialized()) {
                return zzey;
            }
            throw new zzhq(zzey);
        }

        public final BuilderType zza(MessageType messageType) {
            zzuc();
            zza(this.zzahx, (zzey) messageType);
            return this;
        }

        private static void zza(MessageType messageType, MessageType messageType2) {
            zzgt.zzvy().zzw(messageType).zzc(messageType, messageType2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzel zzel) {
            zzuc();
            try {
                zzgt.zzvy().zzw(this.zzahx).zza(this.zzahx, bArr, 0, i2 + 0, new zzdk(zzel));
                return this;
            } catch (zzfi e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw zzfi.zzut();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        private final BuilderType zzb(zzeb zzeb, zzel zzel) {
            zzuc();
            try {
                zzgt.zzvy().zzw(this.zzahx).zza(this.zzahx, zzec.zza(zzeb), zzel);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        public final /* synthetic */ zzdh zza(byte[] bArr, int i, int i2, zzel zzel) {
            return zzb(bArr, 0, i2, zzel);
        }

        public final /* synthetic */ zzdh zzru() {
            return (zza) clone();
        }

        public final /* synthetic */ zzgi zzuh() {
            return this.zzahw;
        }

        public /* synthetic */ Object clone() {
            zza zza = (zza) this.zzahw.zza(zzd.zzaih, null, null);
            zza.zza((zzey) zzuf());
            return zza;
        }
    }

    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzey<MessageType, BuilderType> implements zzgk {
        protected zzeo<Object> zzaic = zzeo.zztr();

        /* Access modifiers changed, original: final */
        public final zzeo<Object> zzuq() {
            if (this.zzaic.isImmutable()) {
                this.zzaic = (zzeo) this.zzaic.clone();
            }
            return this.zzaic;
        }
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    public String toString() {
        return zzgj.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzact != 0) {
            return this.zzact;
        }
        this.zzact = zzgt.zzvy().zzw(this).hashCode(this);
        return this.zzact;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzey) zza(zzd.zzaii, null, null)).getClass().isInstance(obj)) {
            return zzgt.zzvy().zzw(this).equals(this, (zzey) obj);
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzry() {
        zzgt.zzvy().zzw(this).zzj(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final <MessageType extends zzey<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzui() {
        return (zza) zza(zzd.zzaih, null, null);
    }

    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    public final BuilderType zzuj() {
        zza zza = (zza) zza(zzd.zzaih, null, null);
        zza.zza(this);
        return zza;
    }

    /* Access modifiers changed, original: final */
    public final int zzrt() {
        return this.zzaia;
    }

    /* Access modifiers changed, original: final */
    public final void zzam(int i) {
        this.zzaia = i;
    }

    public final void zzb(zzee zzee) {
        zzgt.zzvy().zzf(getClass()).zza(this, zzei.zza(zzee));
    }

    public final int zzuk() {
        if (this.zzaia == -1) {
            this.zzaia = zzgt.zzvy().zzw(this).zzt(this);
        }
        return this.zzaia;
    }

    static <T extends zzey<?, ?>> T zzd(Class<T> cls) {
        T t = (zzey) zzaib.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzey) zzaib.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzey) ((zzey) zzhv.zzh(cls)).zza(zzd.zzaii, null, null);
            if (t != null) {
                zzaib.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzey<?, ?>> void zza(Class<T> cls, T t) {
        zzaib.put(cls, t);
    }

    protected static Object zza(zzgi zzgi, String str, Object[] objArr) {
        return new zzgv(zzgi, str, objArr);
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

    protected static final <T extends zzey<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzd.zzaid, null, null)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        boolean zzv = zzgt.zzvy().zzw(t).zzv(t);
        if (z) {
            t.zza(zzd.zzaie, zzv ? t : null, null);
        }
        return zzv;
    }

    protected static zzfd zzul() {
        return zzfa.zzus();
    }

    protected static zzfg zzum() {
        return zzfw.zzvk();
    }

    protected static zzfg zza(zzfg zzfg) {
        int size = zzfg.size();
        return zzfg.zzbv(size == 0 ? 10 : size << 1);
    }

    protected static <E> zzff<E> zzun() {
        return zzgw.zzwb();
    }

    protected static <E> zzff<E> zza(zzff<E> zzff) {
        int size = zzff.size();
        return zzff.zzap(size == 0 ? 10 : size << 1);
    }

    static <T extends zzey<T, ?>> T zza(T t, zzeb zzeb, zzel zzel) {
        zzey zzey = (zzey) t.zza(zzd.zzaig, null, null);
        try {
            zzgt.zzvy().zzw(zzey).zza(zzey, zzec.zza(zzeb), zzel);
            zzey.zzry();
            return zzey;
        } catch (IOException e) {
            if (e.getCause() instanceof zzfi) {
                throw ((zzfi) e.getCause());
            }
            throw new zzfi(e.getMessage()).zzg(zzey);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzfi) {
                throw ((zzfi) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends zzey<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zzel zzel) {
        zzey zzey = (zzey) t.zza(zzd.zzaig, null, null);
        try {
            zzgt.zzvy().zzw(zzey).zza(zzey, bArr, 0, i2, new zzdk(zzel));
            zzey.zzry();
            if (zzey.zzact == 0) {
                return zzey;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzfi) {
                throw ((zzfi) e.getCause());
            }
            throw new zzfi(e.getMessage()).zzg(zzey);
        } catch (IndexOutOfBoundsException unused) {
            throw zzfi.zzut().zzg(zzey);
        }
    }

    protected static <T extends zzey<T, ?>> T zza(T t, byte[] bArr, zzel zzel) {
        zzey zza = zza(t, bArr, 0, bArr.length, zzel);
        if (zza == null || zza.isInitialized()) {
            return zza;
        }
        throw new zzfi(new zzhq(zza).getMessage()).zzg(zza);
    }

    public final /* synthetic */ zzgh zzuo() {
        zza zza = (zza) zza(zzd.zzaih, null, null);
        zza.zza(this);
        return zza;
    }

    public final /* synthetic */ zzgh zzup() {
        return (zza) zza(zzd.zzaih, null, null);
    }

    public final /* synthetic */ zzgi zzuh() {
        return (zzey) zza(zzd.zzaii, null, null);
    }
}

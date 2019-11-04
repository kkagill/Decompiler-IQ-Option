package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzrc<MessageType extends zzrc<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzpl<MessageType, BuilderType> {
    private static Map<Object, zzrc<?, ?>> zzbam = new ConcurrentHashMap();
    protected zzts zzbak = zzts.zzrj();
    private int zzbal = -1;

    public enum zze {
        public static final int zzbar = 1;
        public static final int zzbas = 2;
        public static final int zzbat = 3;
        public static final int zzbau = 4;
        public static final int zzbav = 5;
        public static final int zzbaw = 6;
        public static final int zzbax = 7;
        private static final /* synthetic */ int[] zzbay = new int[]{zzbar, zzbas, zzbat, zzbau, zzbav, zzbaw, zzbax};
        public static final int zzbaz = 1;
        public static final int zzbba = 2;
        private static final /* synthetic */ int[] zzbbb = new int[]{zzbaz, zzbba};
        public static final int zzbbc = 1;
        public static final int zzbbd = 2;
        private static final /* synthetic */ int[] zzbbe = new int[]{zzbbc, zzbbd};

        public static int[] zzpn() {
            return (int[]) zzbay.clone();
        }
    }

    public static class zzd<ContainingType extends zzsk, Type> extends zzqn<ContainingType, Type> {
    }

    public static class zzb<T extends zzrc<T, ?>> extends zzpn<T> {
        private final T zzban;

        public zzb(T t) {
            this.zzban = t;
        }

        public final /* synthetic */ Object zza(zzqe zzqe, zzqp zzqp) {
            return zzrc.zza(this.zzban, zzqe, zzqp);
        }
    }

    public static abstract class zza<MessageType extends zzrc<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzpm<MessageType, BuilderType> {
        private final MessageType zzban;
        private MessageType zzbao;
        private boolean zzbap = false;

        protected zza(MessageType messageType) {
            this.zzban = messageType;
            this.zzbao = (zzrc) messageType.zza(zze.zzbau, null, null);
        }

        public final boolean isInitialized() {
            return zzrc.zza(this.zzbao, false);
        }

        /* renamed from: zzpj */
        public MessageType zzpl() {
            if (this.zzbap) {
                return this.zzbao;
            }
            this.zzbao.zzmi();
            this.zzbap = true;
            return this.zzbao;
        }

        /* renamed from: zzpk */
        public final MessageType zzpm() {
            zzrc zzrc = (zzrc) zzpl();
            if (zzrc.isInitialized()) {
                return zzrc;
            }
            throw new zztq(zzrc);
        }

        public final BuilderType zza(MessageType messageType) {
            if (this.zzbap) {
                zzrc zzrc = (zzrc) this.zzbao.zza(zze.zzbau, null, null);
                zza(zzrc, this.zzbao);
                this.zzbao = zzrc;
                this.zzbap = false;
            }
            zza(this.zzbao, messageType);
            return this;
        }

        private static void zza(MessageType messageType, MessageType messageType2) {
            zzsw.zzqs().zzaf(messageType).zzd(messageType, messageType2);
        }

        public final /* synthetic */ zzpm zzmx() {
            return (zza) clone();
        }

        public final /* synthetic */ zzsk zzpi() {
            return this.zzban;
        }

        public /* synthetic */ Object clone() {
            zza zza = (zza) this.zzban.zza(zze.zzbav, null, null);
            zza.zza((zzrc) zzpl());
            return zza;
        }
    }

    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType> extends zzrc<MessageType, BuilderType> implements zzsm {
        protected zzqt<Object> zzbaq = zzqt.zzov();
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    public String toString() {
        return zzsn.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzavp != 0) {
            return this.zzavp;
        }
        this.zzavp = zzsw.zzqs().zzaf(this).hashCode(this);
        return this.zzavp;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzrc) zza(zze.zzbaw, null, null)).getClass().isInstance(obj)) {
            return zzsw.zzqs().zzaf(this).equals(this, (zzrc) obj);
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzmi() {
        zzsw.zzqs().zzaf(this).zzt(this);
    }

    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    public final BuilderType zzpd() {
        zza zza = (zza) zza(zze.zzbav, null, null);
        zza.zza(this);
        return zza;
    }

    /* Access modifiers changed, original: final */
    public final int zzmw() {
        return this.zzbal;
    }

    /* Access modifiers changed, original: final */
    public final void zzag(int i) {
        this.zzbal = i;
    }

    public final void zzb(zzqj zzqj) {
        zzsw.zzqs().zzi(getClass()).zza(this, zzql.zza(zzqj));
    }

    public final int zzpe() {
        if (this.zzbal == -1) {
            this.zzbal = zzsw.zzqs().zzaf(this).zzad(this);
        }
        return this.zzbal;
    }

    static <T extends zzrc<?, ?>> T zzg(Class<T> cls) {
        T t = (zzrc) zzbam.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzrc) zzbam.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzrc) ((zzrc) zztx.zzk(cls)).zza(zze.zzbaw, null, null);
            if (t != null) {
                zzbam.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzrc<?, ?>> void zza(Class<T> cls, T t) {
        zzbam.put(cls, t);
    }

    protected static Object zza(zzsk zzsk, String str, Object[] objArr) {
        return new zzsx(zzsk, str, objArr);
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

    protected static final <T extends zzrc<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zze.zzbar, null, null)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        boolean zzae = zzsw.zzqs().zzaf(t).zzae(t);
        if (z) {
            t.zza(zze.zzbas, zzae ? t : null, null);
        }
        return zzae;
    }

    protected static zzri zzpf() {
        return zzrd.zzpo();
    }

    static <T extends zzrc<T, ?>> T zza(T t, zzqe zzqe, zzqp zzqp) {
        zzrc zzrc = (zzrc) t.zza(zze.zzbau, null, null);
        try {
            zzsw.zzqs().zzaf(zzrc).zza(zzrc, zzqh.zza(zzqe), zzqp);
            zzrc.zzmi();
            return zzrc;
        } catch (IOException e) {
            if (e.getCause() instanceof zzrk) {
                throw ((zzrk) e.getCause());
            }
            throw new zzrk(e.getMessage()).zzg(zzrc);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzrk) {
                throw ((zzrk) e2.getCause());
            }
            throw e2;
        }
    }

    public final /* synthetic */ zzsl zzpg() {
        zza zza = (zza) zza(zze.zzbav, null, null);
        zza.zza(this);
        return zza;
    }

    public final /* synthetic */ zzsl zzph() {
        return (zza) zza(zze.zzbav, null, null);
    }

    public final /* synthetic */ zzsk zzpi() {
        return (zzrc) zza(zze.zzbaw, null, null);
    }
}

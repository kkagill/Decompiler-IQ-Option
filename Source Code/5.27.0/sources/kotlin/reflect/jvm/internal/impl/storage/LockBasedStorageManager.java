package kotlin.reflect.jvm.internal.impl.storage;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;

public class LockBasedStorageManager implements h {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String PACKAGE_NAME = v.x(LockBasedStorageManager.class.getCanonicalName(), ".", "");
    public static final h fwt = new LockBasedStorageManager("NO_LOCKS", c.fwA, d.fwH) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1", "recursionDetectedDefault"}));
        }

        /* Access modifiers changed, original: protected */
        public <T> i<T> bPa() {
            i bPe = i.bPe();
            if (bPe == null) {
                AnonymousClass1.$$$reportNull$$$0(0);
            }
            return bPe;
        }
    };
    protected final Lock cRY;
    private final c fwu;
    private final String fwv;

    private enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    public interface c {
        public static final c fwA = new c() {
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"}));
            }

            public RuntimeException ap(Throwable th) {
                if (th == null) {
                    AnonymousClass1.$$$reportNull$$$0(0);
                }
                throw kotlin.reflect.jvm.internal.impl.utils.c.j(th);
            }
        };

        RuntimeException ap(Throwable th);
    }

    private static class d<K, V> {
        private final kotlin.jvm.a.a<? extends V> fwB;
        private final K key;

        public d(K k, kotlin.jvm.a.a<? extends V> aVar) {
            this.key = k;
            this.fwB = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.key.equals(((d) obj).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }
    }

    private static class i<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean fwG;
        private final T value;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[2];
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$RecursionDetectedResult";
            if (i != 1) {
                objArr[1] = ConditionalUserProperty.VALUE;
            } else {
                objArr[1] = "fallThrough";
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
        }

        static {
            Class cls = LockBasedStorageManager.class;
        }

        public static <T> i<T> dU(T t) {
            return new i(t, false);
        }

        public static <T> i<T> bPe() {
            return new i(null, true);
        }

        private i(T t, boolean z) {
            this.value = t;
            this.fwG = z;
        }

        public T getValue() {
            return this.value;
        }

        public boolean bPf() {
            return this.fwG;
        }

        public String toString() {
            return bPf() ? "FALL_THROUGH" : String.valueOf(this.value);
        }
    }

    private static class e<T> implements f<T> {
        private final LockBasedStorageManager fwC;
        private final kotlin.jvm.a.a<? extends T> fwD;
        private volatile Object value;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i2 = (i == 2 || i == 3) ? 2 : 3;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = str2;
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = str2;
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i == 2 || i == 3)) {
                objArr[2] = "<init>";
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i == 2 || i == 3) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        /* Access modifiers changed, original: protected */
        public void dS(T t) {
        }

        public e(LockBasedStorageManager lockBasedStorageManager, kotlin.jvm.a.a<? extends T> aVar) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (aVar == null) {
                $$$reportNull$$$0(1);
            }
            this.value = NotValue.NOT_COMPUTED;
            this.fwC = lockBasedStorageManager;
            this.fwD = aVar;
        }

        public boolean bPc() {
            return (this.value == NotValue.NOT_COMPUTED || this.value == NotValue.COMPUTING) ? false : true;
        }

        public T invoke() {
            Object obj = this.value;
            if (!(obj instanceof NotValue)) {
                return WrappedValues.eb(obj);
            }
            this.fwC.cRY.lock();
            try {
                T value;
                NotValue notValue = this.value;
                if (notValue instanceof NotValue) {
                    if (notValue == NotValue.COMPUTING) {
                        this.value = NotValue.RECURSION_WAS_DETECTED;
                        i ha = ha(true);
                        if (!ha.bPf()) {
                            value = ha.getValue();
                        }
                    }
                    if (notValue == NotValue.RECURSION_WAS_DETECTED) {
                        i ha2 = ha(false);
                        if (!ha2.bPf()) {
                            value = ha2.getValue();
                        }
                    }
                    this.value = NotValue.COMPUTING;
                    value = this.fwD.invoke();
                    this.value = value;
                    dS(value);
                } else {
                    value = WrappedValues.eb(notValue);
                }
                this.fwC.cRY.unlock();
                return value;
            } catch (Throwable th) {
                this.fwC.cRY.unlock();
            }
        }

        /* Access modifiers changed, original: protected */
        public i<T> ha(boolean z) {
            i bPa = this.fwC.bPa();
            if (bPa == null) {
                $$$reportNull$$$0(2);
            }
            return bPa;
        }
    }

    private static class g<K, V> implements c<K, V> {
        private final LockBasedStorageManager fwC;
        private final ConcurrentMap<K, Object> fwE;
        private final kotlin.jvm.a.b<? super K, ? extends V> fwF;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i2 = (i == 3 || i == 4) ? 2 : 3;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = str2;
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = str2;
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i == 3 || i == 4) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        public g(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<K, Object> concurrentMap, kotlin.jvm.a.b<? super K, ? extends V> bVar) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
            if (bVar == null) {
                $$$reportNull$$$0(2);
            }
            this.fwC = lockBasedStorageManager;
            this.fwE = concurrentMap;
            this.fwF = bVar;
        }

        public V invoke(K k) {
            NotValue notValue = this.fwE.get(k);
            if (notValue != null && notValue != NotValue.COMPUTING) {
                return WrappedValues.ea(notValue);
            }
            this.fwC.cRY.lock();
            try {
                notValue = this.fwE.get(k);
                if (notValue == NotValue.COMPUTING) {
                    throw dT(k);
                } else if (notValue != null) {
                    Object ea = WrappedValues.ea(notValue);
                    this.fwC.cRY.unlock();
                    return ea;
                } else {
                    this.fwE.put(k, NotValue.COMPUTING);
                    Object invoke = this.fwF.invoke(k);
                    NotValue put = this.fwE.put(k, WrappedValues.dZ(invoke));
                    if (put == NotValue.COMPUTING) {
                        this.fwC.cRY.unlock();
                        return invoke;
                    }
                    throw C(k, put);
                }
            } catch (Throwable th) {
                this.fwC.cRY.unlock();
            }
        }

        private AssertionError dT(K k) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Recursion detected on input: ");
            stringBuilder.append(k);
            stringBuilder.append(" under ");
            stringBuilder.append(this.fwC);
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.an(new AssertionError(stringBuilder.toString()));
            if (assertionError == null) {
                $$$reportNull$$$0(3);
            }
            return assertionError;
        }

        private AssertionError C(K k, Object obj) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Race condition detected on input ");
            stringBuilder.append(k);
            stringBuilder.append(". Old value is ");
            stringBuilder.append(obj);
            stringBuilder.append(" under ");
            stringBuilder.append(this.fwC);
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.an(new AssertionError(stringBuilder.toString()));
            if (assertionError == null) {
                $$$reportNull$$$0(4);
            }
            return assertionError;
        }

        /* Access modifiers changed, original: protected */
        public LockBasedStorageManager bPd() {
            return this.fwC;
        }
    }

    private static class b<K, V> extends g<d<K, V>, V> {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* synthetic */ b(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, AnonymousClass1 anonymousClass1) {
            this(lockBasedStorageManager, concurrentMap);
        }

        private b(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<d<K, V>, Object> concurrentMap) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
            super(lockBasedStorageManager, concurrentMap, new kotlin.jvm.a.b<d<K, V>, V>() {
                /* renamed from: a */
                public V invoke(d<K, V> dVar) {
                    return dVar.fwB.invoke();
                }
            });
        }

        public V b(K k, kotlin.jvm.a.a<? extends V> aVar) {
            if (aVar == null) {
                $$$reportNull$$$0(2);
            }
            return invoke(new d(k, aVar));
        }
    }

    private static class f<T> extends e<T> implements e<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = str2;
            }
            if (i != 2) {
                objArr[1] = str2;
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            str = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(str) : new IllegalStateException(str));
        }

        static {
            Class cls = LockBasedStorageManager.class;
        }

        public f(LockBasedStorageManager lockBasedStorageManager, kotlin.jvm.a.a<? extends T> aVar) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (aVar == null) {
                $$$reportNull$$$0(1);
            }
            super(lockBasedStorageManager, aVar);
        }

        public T invoke() {
            Object invoke = super.invoke();
            if (invoke == null) {
                $$$reportNull$$$0(2);
            }
            return invoke;
        }
    }

    private static class h<K, V> extends g<K, V> implements b<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = str2;
            }
            if (i != 3) {
                objArr[1] = str2;
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            str = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(str) : new IllegalStateException(str));
        }

        static {
            Class cls = LockBasedStorageManager.class;
        }

        public h(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<K, Object> concurrentMap, kotlin.jvm.a.b<? super K, ? extends V> bVar) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
            if (bVar == null) {
                $$$reportNull$$$0(2);
            }
            super(lockBasedStorageManager, concurrentMap, bVar);
        }

        public V invoke(K k) {
            Object invoke = super.invoke(k);
            if (invoke == null) {
                $$$reportNull$$$0(3);
            }
            return invoke;
        }
    }

    private static class a<K, V> extends b<K, V> implements a<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = str2;
            }
            String str3 = "computeIfAbsent";
            if (i != 3) {
                objArr[1] = str2;
            } else {
                objArr[1] = str3;
            }
            if (i == 2) {
                objArr[2] = str3;
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            str = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(str) : new IllegalStateException(str));
        }

        static {
            Class cls = LockBasedStorageManager.class;
        }

        /* synthetic */ a(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, AnonymousClass1 anonymousClass1) {
            this(lockBasedStorageManager, concurrentMap);
        }

        private a(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<d<K, V>, Object> concurrentMap) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
            super(lockBasedStorageManager, concurrentMap, null);
        }

        public V b(K k, kotlin.jvm.a.a<? extends V> aVar) {
            if (aVar == null) {
                $$$reportNull$$$0(2);
            }
            Object b = super.b(k, aVar);
            if (b == null) {
                $$$reportNull$$$0(3);
            }
            return b;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 2:
            case 7:
            case 10:
            case 12:
            case 15:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 35:
            case 36:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 7:
            case 10:
            case 12:
            case 15:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 35:
            case 36:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "compute";
        String str3 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "exceptionHandlingStrategy";
                break;
            case 2:
            case 7:
            case 10:
            case 12:
            case 15:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 35:
            case 36:
                objArr[0] = str3;
                break;
            case 5:
                objArr[0] = "lock";
                break;
            case 6:
            case 8:
            case 11:
            case 13:
                objArr[0] = str2;
                break;
            case 9:
            case 14:
                objArr[0] = "map";
                break;
            case 16:
            case 18:
            case 21:
            case 24:
            case 26:
            case 28:
            case 31:
                objArr[0] = "computable";
                break;
            case 19:
                objArr[0] = "onRecursiveCall";
                break;
            case 22:
            case 29:
                objArr[0] = "postCompute";
                break;
            case 33:
                objArr[0] = "throwable";
                break;
            default:
                objArr[0] = "debugText";
                break;
        }
        String str4 = "sanitizeStackTrace";
        String str5 = "createNullableLazyValueWithPostCompute";
        String str6 = "createRecursionTolerantNullableLazyValue";
        String str7 = "createNullableLazyValue";
        String str8 = "createLazyValueWithPostCompute";
        String str9 = "createRecursionTolerantLazyValue";
        String str10 = "createLazyValue";
        String str11 = "createMemoizedFunctionWithNullableValues";
        String str12 = "createMemoizedFunction";
        String str13 = "createWithExceptionHandling";
        switch (i) {
            case 2:
                objArr[1] = str13;
                break;
            case 7:
            case 10:
                objArr[1] = str12;
                break;
            case 12:
            case 15:
                objArr[1] = str11;
                break;
            case 17:
                objArr[1] = str10;
                break;
            case 20:
                objArr[1] = str9;
                break;
            case 23:
                objArr[1] = str8;
                break;
            case 25:
                objArr[1] = str7;
                break;
            case 27:
                objArr[1] = str6;
                break;
            case 30:
                objArr[1] = str5;
                break;
            case 32:
                objArr[1] = "createConcurrentHashMap";
                break;
            case 34:
                objArr[1] = str4;
                break;
            case 35:
                objArr[1] = "createCacheWithNullableValues";
                break;
            case 36:
                objArr[1] = "createCacheWithNotNullValues";
                break;
            default:
                objArr[1] = str3;
                break;
        }
        switch (i) {
            case 2:
            case 7:
            case 10:
            case 12:
            case 15:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 35:
            case 36:
                break;
            case 3:
            case 4:
            case 5:
                objArr[2] = "<init>";
                break;
            case 6:
            case 8:
            case 9:
                objArr[2] = str12;
                break;
            case 11:
            case 13:
            case 14:
                objArr[2] = str11;
                break;
            case 16:
                objArr[2] = str10;
                break;
            case 18:
            case 19:
                objArr[2] = str9;
                break;
            case 21:
            case 22:
                objArr[2] = str8;
                break;
            case 24:
                objArr[2] = str7;
                break;
            case 26:
                objArr[2] = str6;
                break;
            case 28:
            case 29:
                objArr[2] = str5;
                break;
            case 31:
                objArr[2] = str2;
                break;
            case 33:
                objArr[2] = str4;
                break;
            default:
                objArr[2] = str13;
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 2:
            case 7:
            case 10:
            case 12:
            case 15:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 35:
            case 36:
                illegalStateException = new IllegalStateException(str);
                break;
            default:
                illegalStateException = new IllegalArgumentException(str);
                break;
        }
        throw illegalStateException;
    }

    /* synthetic */ LockBasedStorageManager(String str, c cVar, Lock lock, AnonymousClass1 anonymousClass1) {
        this(str, cVar, lock);
    }

    private LockBasedStorageManager(String str, c cVar, Lock lock) {
        if (str == null) {
            $$$reportNull$$$0(3);
        }
        if (cVar == null) {
            $$$reportNull$$$0(4);
        }
        if (lock == null) {
            $$$reportNull$$$0(5);
        }
        this.cRY = lock;
        this.fwu = cVar;
        this.fwv = str;
    }

    public LockBasedStorageManager(String str) {
        this(str, c.fwA, new ReentrantLock());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(" (");
        stringBuilder.append(this.fwv);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public <K, V> b<K, V> q(kotlin.jvm.a.b<? super K, ? extends V> bVar) {
        if (bVar == null) {
            $$$reportNull$$$0(6);
        }
        b a = a((kotlin.jvm.a.b) bVar, bOZ());
        if (a == null) {
            $$$reportNull$$$0(7);
        }
        return a;
    }

    public <K, V> b<K, V> a(kotlin.jvm.a.b<? super K, ? extends V> bVar, ConcurrentMap<K, Object> concurrentMap) {
        if (bVar == null) {
            $$$reportNull$$$0(8);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(9);
        }
        return new h(this, concurrentMap, bVar);
    }

    public <K, V> c<K, V> r(kotlin.jvm.a.b<? super K, ? extends V> bVar) {
        if (bVar == null) {
            $$$reportNull$$$0(11);
        }
        c b = b(bVar, bOZ());
        if (b == null) {
            $$$reportNull$$$0(12);
        }
        return b;
    }

    public <K, V> c<K, V> b(kotlin.jvm.a.b<? super K, ? extends V> bVar, ConcurrentMap<K, Object> concurrentMap) {
        if (bVar == null) {
            $$$reportNull$$$0(13);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(14);
        }
        return new g(this, concurrentMap, bVar);
    }

    public <T> e<T> f(kotlin.jvm.a.a<? extends T> aVar) {
        if (aVar == null) {
            $$$reportNull$$$0(16);
        }
        return new f(this, aVar);
    }

    public <T> e<T> a(kotlin.jvm.a.a<? extends T> aVar, final T t) {
        if (aVar == null) {
            $$$reportNull$$$0(18);
        }
        if (t == null) {
            $$$reportNull$$$0(19);
        }
        return new f<T>(this, aVar) {
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$2", "recursionDetected"}));
            }

            /* Access modifiers changed, original: protected */
            public i<T> ha(boolean z) {
                i dU = i.dU(t);
                if (dU == null) {
                    AnonymousClass2.$$$reportNull$$$0(0);
                }
                return dU;
            }
        };
    }

    public <T> e<T> a(kotlin.jvm.a.a<? extends T> aVar, kotlin.jvm.a.b<? super Boolean, ? extends T> bVar, kotlin.jvm.a.b<? super T, l> bVar2) {
        if (aVar == null) {
            $$$reportNull$$$0(21);
        }
        if (bVar2 == null) {
            $$$reportNull$$$0(22);
        }
        final kotlin.jvm.a.b<? super Boolean, ? extends T> bVar3 = bVar;
        final kotlin.jvm.a.b<? super T, l> bVar4 = bVar2;
        return new f<T>(this, aVar) {
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                Object[] objArr = new Object[(i != 2 ? 2 : 3)];
                String str2 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$3";
                if (i != 2) {
                    objArr[0] = str2;
                } else {
                    objArr[0] = ConditionalUserProperty.VALUE;
                }
                if (i != 2) {
                    objArr[1] = "recursionDetected";
                } else {
                    objArr[1] = str2;
                }
                if (i == 2) {
                    objArr[2] = "postCompute";
                }
                str = String.format(str, objArr);
                throw (i != 2 ? new IllegalStateException(str) : new IllegalArgumentException(str));
            }

            /* Access modifiers changed, original: protected */
            public i<T> ha(boolean z) {
                kotlin.jvm.a.b bVar = bVar3;
                i ha;
                if (bVar == null) {
                    ha = super.ha(z);
                    if (ha == null) {
                        AnonymousClass3.$$$reportNull$$$0(0);
                    }
                    return ha;
                }
                ha = i.dU(bVar.invoke(Boolean.valueOf(z)));
                if (ha == null) {
                    AnonymousClass3.$$$reportNull$$$0(1);
                }
                return ha;
            }

            /* Access modifiers changed, original: protected */
            public void dS(T t) {
                if (t == null) {
                    AnonymousClass3.$$$reportNull$$$0(2);
                }
                bVar4.invoke(t);
            }
        };
    }

    public <T> f<T> g(kotlin.jvm.a.a<? extends T> aVar) {
        if (aVar == null) {
            $$$reportNull$$$0(24);
        }
        return new e(this, aVar);
    }

    private static <K> ConcurrentMap<K, Object> bOZ() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* Access modifiers changed, original: protected */
    public <T> i<T> bPa() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Recursive call in a lazy value under ");
        stringBuilder.append(this);
        throw ((IllegalStateException) an(new IllegalStateException(stringBuilder.toString())));
    }

    private static <T extends Throwable> T an(T t) {
        if (t == null) {
            $$$reportNull$$$0(33);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (!stackTrace[i2].getClassName().startsWith(PACKAGE_NAME)) {
                i = i2;
                break;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        if (t == null) {
            $$$reportNull$$$0(34);
        }
        return t;
    }

    public <K, V> a<K, V> bPb() {
        return new a(this, bOZ(), null);
    }
}

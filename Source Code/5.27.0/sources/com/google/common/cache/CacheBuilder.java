package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Suppliers;
import com.google.common.base.e;
import com.google.common.base.i;
import com.google.common.base.n;
import com.google.common.base.p;
import com.google.common.cache.a.a;
import com.google.common.cache.a.b;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class CacheBuilder<K, V> {
    static final n<? extends b> SU = Suppliers.aq(new b() {
        public void bp(int i) {
        }

        public void bq(int i) {
        }

        public void qo() {
        }

        public void v(long j) {
        }

        public void w(long j) {
        }
    });
    static final c SW = new c(0, 0, 0, 0, 0, 0);
    static final n<b> Ta = new n<b>() {
        /* renamed from: qI */
        public b get() {
            return new a();
        }
    };
    static final p Tb = new p() {
        public long qm() {
            return 0;
        }
    };
    private static final Logger logger = Logger.getLogger(CacheBuilder.class.getName());
    boolean Tc = true;
    int Td = -1;
    long Te = -1;
    long Tf = -1;
    long Tg = -1;
    n<? extends b> Th = SU;
    int concurrencyLevel = -1;
    long expireAfterAccessNanos = -1;
    long expireAfterWriteNanos = -1;
    Equivalence<Object> keyEquivalence;
    Strength keyStrength;
    h<? super K, ? super V> removalListener;
    p ticker;
    Equivalence<Object> valueEquivalence;
    Strength valueStrength;
    i<? super K, ? super V> weigher;

    enum NullListener implements h<Object, Object> {
        INSTANCE;

        public void onRemoval(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    enum OneWeigher implements i<Object, Object> {
        INSTANCE;

        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    private CacheBuilder() {
    }

    public static CacheBuilder<Object, Object> qq() {
        return new CacheBuilder();
    }

    /* Access modifiers changed, original: 0000 */
    public CacheBuilder<K, V> a(Equivalence<Object> equivalence) {
        i.b(this.keyEquivalence == null, "key equivalence was already set to %s", this.keyEquivalence);
        this.keyEquivalence = (Equivalence) i.checkNotNull(equivalence);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public Equivalence<Object> qr() {
        return (Equivalence) e.g(this.keyEquivalence, qy().defaultEquivalence());
    }

    /* Access modifiers changed, original: 0000 */
    public CacheBuilder<K, V> b(Equivalence<Object> equivalence) {
        i.b(this.valueEquivalence == null, "value equivalence was already set to %s", this.valueEquivalence);
        this.valueEquivalence = (Equivalence) i.checkNotNull(equivalence);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public Equivalence<Object> qs() {
        return (Equivalence) e.g(this.valueEquivalence, qz().defaultEquivalence());
    }

    /* Access modifiers changed, original: 0000 */
    public int qt() {
        int i = this.Td;
        return i == -1 ? 16 : i;
    }

    public CacheBuilder<K, V> br(int i) {
        boolean z = true;
        i.b(this.concurrencyLevel == -1, "concurrency level was already set to %s", this.concurrencyLevel);
        if (i <= 0) {
            z = false;
        }
        i.checkArgument(z);
        this.concurrencyLevel = i;
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public int qu() {
        int i = this.concurrencyLevel;
        return i == -1 ? 4 : i;
    }

    public CacheBuilder<K, V> x(long j) {
        boolean z = true;
        i.b(this.Te == -1, "maximum size was already set to %s", this.Te);
        i.b(this.Tf == -1, "maximum weight was already set to %s", this.Tf);
        i.checkState(this.weigher == null, "maximum size can not be combined with weigher");
        if (j < 0) {
            z = false;
        }
        i.checkArgument(z, "maximum size must not be negative");
        this.Te = j;
        return this;
    }

    public CacheBuilder<K, V> y(long j) {
        boolean z = true;
        i.b(this.Tf == -1, "maximum weight was already set to %s", this.Tf);
        i.b(this.Te == -1, "maximum size was already set to %s", this.Te);
        this.Tf = j;
        if (j < 0) {
            z = false;
        }
        i.checkArgument(z, "maximum weight must not be negative");
        return this;
    }

    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> a(i<? super K1, ? super V1> iVar) {
        boolean z = true;
        i.checkState(this.weigher == null);
        if (this.Tc) {
            if (this.Te != -1) {
                z = false;
            }
            i.b(z, "weigher can not be combined with maximum size", this.Te);
        }
        this.weigher = (i) i.checkNotNull(iVar);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public long qv() {
        if (this.expireAfterWriteNanos == 0 || this.expireAfterAccessNanos == 0) {
            return 0;
        }
        return this.weigher == null ? this.Te : this.Tf;
    }

    /* Access modifiers changed, original: 0000 */
    public <K1 extends K, V1 extends V> i<K1, V1> qw() {
        return (i) e.g(this.weigher, OneWeigher.INSTANCE);
    }

    public CacheBuilder<K, V> qx() {
        return a(Strength.WEAK);
    }

    /* Access modifiers changed, original: 0000 */
    public CacheBuilder<K, V> a(Strength strength) {
        i.b(this.keyStrength == null, "Key strength was already set to %s", this.keyStrength);
        this.keyStrength = (Strength) i.checkNotNull(strength);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public Strength qy() {
        return (Strength) e.g(this.keyStrength, Strength.STRONG);
    }

    /* Access modifiers changed, original: 0000 */
    public CacheBuilder<K, V> b(Strength strength) {
        i.b(this.valueStrength == null, "Value strength was already set to %s", this.valueStrength);
        this.valueStrength = (Strength) i.checkNotNull(strength);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public Strength qz() {
        return (Strength) e.g(this.valueStrength, Strength.STRONG);
    }

    public CacheBuilder<K, V> a(long j, TimeUnit timeUnit) {
        boolean z = true;
        i.b(this.expireAfterWriteNanos == -1, "expireAfterWrite was already set to %s ns", this.expireAfterWriteNanos);
        if (j < 0) {
            z = false;
        }
        i.a(z, "duration cannot be negative: %s %s", j, (Object) timeUnit);
        this.expireAfterWriteNanos = timeUnit.toNanos(j);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public long qA() {
        long j = this.expireAfterWriteNanos;
        return j == -1 ? 0 : j;
    }

    public CacheBuilder<K, V> b(long j, TimeUnit timeUnit) {
        boolean z = true;
        i.b(this.expireAfterAccessNanos == -1, "expireAfterAccess was already set to %s ns", this.expireAfterAccessNanos);
        if (j < 0) {
            z = false;
        }
        i.a(z, "duration cannot be negative: %s %s", j, (Object) timeUnit);
        this.expireAfterAccessNanos = timeUnit.toNanos(j);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public long qB() {
        long j = this.expireAfterAccessNanos;
        return j == -1 ? 0 : j;
    }

    /* Access modifiers changed, original: 0000 */
    public long qC() {
        long j = this.Tg;
        return j == -1 ? 0 : j;
    }

    public CacheBuilder<K, V> a(p pVar) {
        i.checkState(this.ticker == null);
        this.ticker = (p) i.checkNotNull(pVar);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public p ah(boolean z) {
        p pVar = this.ticker;
        if (pVar != null) {
            return pVar;
        }
        return z ? p.qn() : Tb;
    }

    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> a(h<? super K1, ? super V1> hVar) {
        i.checkState(this.removalListener == null);
        this.removalListener = (h) i.checkNotNull(hVar);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public <K1 extends K, V1 extends V> h<K1, V1> qD() {
        return (h) e.g(this.removalListener, NullListener.INSTANCE);
    }

    /* Access modifiers changed, original: 0000 */
    public n<? extends b> qE() {
        return this.Th;
    }

    public <K1 extends K, V1 extends V> e<K1, V1> a(CacheLoader<? super K1, V1> cacheLoader) {
        qH();
        return new LocalLoadingCache(this, cacheLoader);
    }

    public <K1 extends K, V1 extends V> b<K1, V1> qF() {
        qH();
        qG();
        return new LocalManualCache(this);
    }

    private void qG() {
        i.checkState(this.Tg == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void qH() {
        boolean z = true;
        if (this.weigher == null) {
            if (this.Tf != -1) {
                z = false;
            }
            i.checkState(z, "maximumWeight requires weigher");
        } else if (this.Tc) {
            if (this.Tf == -1) {
                z = false;
            }
            i.checkState(z, "weigher requires maximumWeight");
        } else if (this.Tf == -1) {
            logger.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public String toString() {
        StringBuilder stringBuilder;
        e.a aj = e.aj(this);
        int i = this.Td;
        if (i != -1) {
            aj.k("initialCapacity", i);
        }
        i = this.concurrencyLevel;
        if (i != -1) {
            aj.k("concurrencyLevel", i);
        }
        long j = this.Te;
        if (j != -1) {
            aj.d("maximumSize", j);
        }
        j = this.Tf;
        if (j != -1) {
            aj.d("maximumWeight", j);
        }
        String str = "ns";
        if (this.expireAfterWriteNanos != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.expireAfterWriteNanos);
            stringBuilder.append(str);
            aj.d("expireAfterWrite", stringBuilder.toString());
        }
        if (this.expireAfterAccessNanos != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.expireAfterAccessNanos);
            stringBuilder.append(str);
            aj.d("expireAfterAccess", stringBuilder.toString());
        }
        Strength strength = this.keyStrength;
        if (strength != null) {
            aj.d("keyStrength", com.google.common.base.a.toLowerCase(strength.toString()));
        }
        strength = this.valueStrength;
        if (strength != null) {
            aj.d("valueStrength", com.google.common.base.a.toLowerCase(strength.toString()));
        }
        if (this.keyEquivalence != null) {
            aj.ak("keyEquivalence");
        }
        if (this.valueEquivalence != null) {
            aj.ak("valueEquivalence");
        }
        if (this.removalListener != null) {
            aj.ak("removalListener");
        }
        return aj.toString();
    }
}

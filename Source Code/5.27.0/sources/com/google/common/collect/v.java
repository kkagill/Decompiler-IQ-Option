package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.e;
import com.google.common.base.e.a;
import com.google.common.base.i;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: MapMaker */
public final class v {
    int Td = -1;
    boolean WT;
    int concurrencyLevel = -1;
    Equivalence<Object> keyEquivalence;
    Strength keyStrength;
    Strength valueStrength;

    /* Access modifiers changed, original: 0000 */
    public v c(Equivalence<Object> equivalence) {
        i.b(this.keyEquivalence == null, "key equivalence was already set to %s", this.keyEquivalence);
        this.keyEquivalence = (Equivalence) i.checkNotNull(equivalence);
        this.WT = true;
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public Equivalence<Object> qr() {
        return (Equivalence) e.g(this.keyEquivalence, tH().defaultEquivalence());
    }

    public v cc(int i) {
        boolean z = true;
        i.b(this.Td == -1, "initial capacity was already set to %s", this.Td);
        if (i < 0) {
            z = false;
        }
        i.checkArgument(z);
        this.Td = i;
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public int qt() {
        int i = this.Td;
        return i == -1 ? 16 : i;
    }

    public v cd(int i) {
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

    public v tG() {
        return a(Strength.WEAK);
    }

    /* Access modifiers changed, original: 0000 */
    public v a(Strength strength) {
        i.b(this.keyStrength == null, "Key strength was already set to %s", this.keyStrength);
        this.keyStrength = (Strength) i.checkNotNull(strength);
        if (strength != Strength.STRONG) {
            this.WT = true;
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public Strength tH() {
        return (Strength) e.g(this.keyStrength, Strength.STRONG);
    }

    /* Access modifiers changed, original: 0000 */
    public v b(Strength strength) {
        i.b(this.valueStrength == null, "Value strength was already set to %s", this.valueStrength);
        this.valueStrength = (Strength) i.checkNotNull(strength);
        if (strength != Strength.STRONG) {
            this.WT = true;
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public Strength tI() {
        return (Strength) e.g(this.valueStrength, Strength.STRONG);
    }

    public <K, V> ConcurrentMap<K, V> tJ() {
        if (this.WT) {
            return MapMakerInternalMap.a(this);
        }
        return new ConcurrentHashMap(qt(), 0.75f, qu());
    }

    public String toString() {
        a aj = e.aj(this);
        int i = this.Td;
        if (i != -1) {
            aj.k("initialCapacity", i);
        }
        i = this.concurrencyLevel;
        if (i != -1) {
            aj.k("concurrencyLevel", i);
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
        return aj.toString();
    }
}

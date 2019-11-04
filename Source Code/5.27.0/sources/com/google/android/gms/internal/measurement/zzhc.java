package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzhc<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzaey;
    private final int zzalk;
    private List<zzhh> zzall;
    private Map<K, V> zzalm;
    private volatile zzhj zzaln;
    private Map<K, V> zzalo;
    private volatile zzhd zzalp;

    static <FieldDescriptorType extends zzeq<FieldDescriptorType>> zzhc<FieldDescriptorType, Object> zzce(int i) {
        return new zzhb(i);
    }

    private zzhc(int i) {
        this.zzalk = i;
        this.zzall = Collections.emptyList();
        this.zzalm = Collections.emptyMap();
        this.zzalo = Collections.emptyMap();
    }

    public void zzry() {
        if (!this.zzaey) {
            Map emptyMap;
            if (this.zzalm.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.zzalm);
            }
            this.zzalm = emptyMap;
            if (this.zzalo.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.zzalo);
            }
            this.zzalo = emptyMap;
            this.zzaey = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzaey;
    }

    public final int zzwh() {
        return this.zzall.size();
    }

    public final Entry<K, V> zzcf(int i) {
        return (Entry) this.zzall.get(i);
    }

    public final Iterable<Entry<K, V>> zzwi() {
        if (this.zzalm.isEmpty()) {
            return zzhg.zzwn();
        }
        return this.zzalm.entrySet();
    }

    public int size() {
        return this.zzall.size() + this.zzalm.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzalm.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return ((zzhh) this.zzall.get(zza)).getValue();
        }
        return this.zzalm.get(comparable);
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        zzwk();
        int zza = zza((Comparable) k);
        if (zza >= 0) {
            return ((zzhh) this.zzall.get(zza)).setValue(v);
        }
        zzwk();
        if (this.zzall.isEmpty() && !(this.zzall instanceof ArrayList)) {
            this.zzall = new ArrayList(this.zzalk);
        }
        zza = -(zza + 1);
        if (zza >= this.zzalk) {
            return zzwl().put(k, v);
        }
        int size = this.zzall.size();
        int i = this.zzalk;
        if (size == i) {
            zzhh zzhh = (zzhh) this.zzall.remove(i - 1);
            zzwl().put((Comparable) zzhh.getKey(), zzhh.getValue());
        }
        this.zzall.add(zza, new zzhh(this, k, v));
        return null;
    }

    public void clear() {
        zzwk();
        if (!this.zzall.isEmpty()) {
            this.zzall.clear();
        }
        if (!this.zzalm.isEmpty()) {
            this.zzalm.clear();
        }
    }

    public V remove(Object obj) {
        zzwk();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return zzcg(zza);
        }
        if (this.zzalm.isEmpty()) {
            return null;
        }
        return this.zzalm.remove(comparable);
    }

    private final V zzcg(int i) {
        zzwk();
        Object value = ((zzhh) this.zzall.remove(i)).getValue();
        if (!this.zzalm.isEmpty()) {
            Iterator it = zzwl().entrySet().iterator();
            this.zzall.add(new zzhh(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final int zza(K k) {
        int compareTo;
        int size = this.zzall.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo((Comparable) ((zzhh) this.zzall.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        compareTo = 0;
        while (compareTo <= size) {
            int i = (compareTo + size) / 2;
            int compareTo2 = k.compareTo((Comparable) ((zzhh) this.zzall.get(i)).getKey());
            if (compareTo2 < 0) {
                size = i - 1;
            } else if (compareTo2 <= 0) {
                return i;
            } else {
                compareTo = i + 1;
            }
        }
        return -(compareTo + 1);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.zzaln == null) {
            this.zzaln = new zzhj(this, null);
        }
        return this.zzaln;
    }

    /* Access modifiers changed, original: final */
    public final Set<Entry<K, V>> zzwj() {
        if (this.zzalp == null) {
            this.zzalp = new zzhd(this, null);
        }
        return this.zzalp;
    }

    private final void zzwk() {
        if (this.zzaey) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzwl() {
        zzwk();
        if (this.zzalm.isEmpty() && !(this.zzalm instanceof TreeMap)) {
            this.zzalm = new TreeMap();
            this.zzalo = ((TreeMap) this.zzalm).descendingMap();
        }
        return (SortedMap) this.zzalm;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhc)) {
            return super.equals(obj);
        }
        zzhc zzhc = (zzhc) obj;
        int size = size();
        if (size != zzhc.size()) {
            return false;
        }
        int zzwh = zzwh();
        if (zzwh != zzhc.zzwh()) {
            return entrySet().equals(zzhc.entrySet());
        }
        for (int i = 0; i < zzwh; i++) {
            if (!zzcf(i).equals(zzhc.zzcf(i))) {
                return false;
            }
        }
        if (zzwh != size) {
            return this.zzalm.equals(zzhc.zzalm);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < zzwh(); i2++) {
            i += ((zzhh) this.zzall.get(i2)).hashCode();
        }
        return this.zzalm.size() > 0 ? i + this.zzalm.hashCode() : i;
    }

    /* synthetic */ zzhc(int i, zzhb zzhb) {
        this(i);
    }
}
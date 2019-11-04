package com.google.android.gms.internal.gtm;

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

class zztc<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzaut;
    private final int zzbdy;
    private List<zztj> zzbdz;
    private Map<K, V> zzbea;
    private volatile zztl zzbeb;
    private Map<K, V> zzbec;
    private volatile zztf zzbed;

    static <FieldDescriptorType extends zzqv<FieldDescriptorType>> zztc<FieldDescriptorType, Object> zzbu(int i) {
        return new zztd(i);
    }

    private zztc(int i) {
        this.zzbdy = i;
        this.zzbdz = Collections.emptyList();
        this.zzbea = Collections.emptyMap();
        this.zzbec = Collections.emptyMap();
    }

    public void zzmi() {
        if (!this.zzaut) {
            Map emptyMap;
            if (this.zzbea.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.zzbea);
            }
            this.zzbea = emptyMap;
            if (this.zzbec.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.zzbec);
            }
            this.zzbec = emptyMap;
            this.zzaut = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzaut;
    }

    public final int zzra() {
        return this.zzbdz.size();
    }

    public final Entry<K, V> zzbv(int i) {
        return (Entry) this.zzbdz.get(i);
    }

    public final Iterable<Entry<K, V>> zzrb() {
        if (this.zzbea.isEmpty()) {
            return zztg.zzrg();
        }
        return this.zzbea.entrySet();
    }

    public int size() {
        return this.zzbdz.size() + this.zzbea.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzbea.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return ((zztj) this.zzbdz.get(zza)).getValue();
        }
        return this.zzbea.get(comparable);
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        zzrd();
        int zza = zza((Comparable) k);
        if (zza >= 0) {
            return ((zztj) this.zzbdz.get(zza)).setValue(v);
        }
        zzrd();
        if (this.zzbdz.isEmpty() && !(this.zzbdz instanceof ArrayList)) {
            this.zzbdz = new ArrayList(this.zzbdy);
        }
        zza = -(zza + 1);
        if (zza >= this.zzbdy) {
            return zzre().put(k, v);
        }
        int size = this.zzbdz.size();
        int i = this.zzbdy;
        if (size == i) {
            zztj zztj = (zztj) this.zzbdz.remove(i - 1);
            zzre().put((Comparable) zztj.getKey(), zztj.getValue());
        }
        this.zzbdz.add(zza, new zztj(this, k, v));
        return null;
    }

    public void clear() {
        zzrd();
        if (!this.zzbdz.isEmpty()) {
            this.zzbdz.clear();
        }
        if (!this.zzbea.isEmpty()) {
            this.zzbea.clear();
        }
    }

    public V remove(Object obj) {
        zzrd();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return zzbw(zza);
        }
        if (this.zzbea.isEmpty()) {
            return null;
        }
        return this.zzbea.remove(comparable);
    }

    private final V zzbw(int i) {
        zzrd();
        Object value = ((zztj) this.zzbdz.remove(i)).getValue();
        if (!this.zzbea.isEmpty()) {
            Iterator it = zzre().entrySet().iterator();
            this.zzbdz.add(new zztj(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final int zza(K k) {
        int compareTo;
        int size = this.zzbdz.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo((Comparable) ((zztj) this.zzbdz.get(size)).getKey());
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
            int compareTo2 = k.compareTo((Comparable) ((zztj) this.zzbdz.get(i)).getKey());
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
        if (this.zzbeb == null) {
            this.zzbeb = new zztl(this, null);
        }
        return this.zzbeb;
    }

    /* Access modifiers changed, original: final */
    public final Set<Entry<K, V>> zzrc() {
        if (this.zzbed == null) {
            this.zzbed = new zztf(this, null);
        }
        return this.zzbed;
    }

    private final void zzrd() {
        if (this.zzaut) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzre() {
        zzrd();
        if (this.zzbea.isEmpty() && !(this.zzbea instanceof TreeMap)) {
            this.zzbea = new TreeMap();
            this.zzbec = ((TreeMap) this.zzbea).descendingMap();
        }
        return (SortedMap) this.zzbea;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zztc)) {
            return super.equals(obj);
        }
        zztc zztc = (zztc) obj;
        int size = size();
        if (size != zztc.size()) {
            return false;
        }
        int zzra = zzra();
        if (zzra != zztc.zzra()) {
            return entrySet().equals(zztc.entrySet());
        }
        for (int i = 0; i < zzra; i++) {
            if (!zzbv(i).equals(zztc.zzbv(i))) {
                return false;
            }
        }
        if (zzra != size) {
            return this.zzbea.equals(zztc.zzbea);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < zzra(); i2++) {
            i += ((zztj) this.zzbdz.get(i2)).hashCode();
        }
        return this.zzbea.size() > 0 ? i + this.zzbea.hashCode() : i;
    }

    /* synthetic */ zztc(int i, zztd zztd) {
        this(i);
    }
}

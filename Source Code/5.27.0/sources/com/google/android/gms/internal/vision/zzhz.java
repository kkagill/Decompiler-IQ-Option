package com.google.android.gms.internal.vision;

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

class zzhz<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zzaae;
    private List<zzig> zzaaf;
    private Map<K, V> zzaag;
    private volatile zzii zzaah;
    private Map<K, V> zzaai;
    private volatile zzic zzaaj;
    private boolean zztn;

    static <FieldDescriptorType extends zzfr<FieldDescriptorType>> zzhz<FieldDescriptorType, Object> zzbo(int i) {
        return new zzia(i);
    }

    private zzhz(int i) {
        this.zzaae = i;
        this.zzaaf = Collections.emptyList();
        this.zzaag = Collections.emptyMap();
        this.zzaai = Collections.emptyMap();
    }

    public void zzci() {
        if (!this.zztn) {
            Map emptyMap;
            if (this.zzaag.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.zzaag);
            }
            this.zzaag = emptyMap;
            if (this.zzaai.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.zzaai);
            }
            this.zzaai = emptyMap;
            this.zztn = true;
        }
    }

    public final boolean isImmutable() {
        return this.zztn;
    }

    public final int zzgu() {
        return this.zzaaf.size();
    }

    public final Entry<K, V> zzbp(int i) {
        return (Entry) this.zzaaf.get(i);
    }

    public final Iterable<Entry<K, V>> zzgv() {
        if (this.zzaag.isEmpty()) {
            return zzid.zzha();
        }
        return this.zzaag.entrySet();
    }

    public int size() {
        return this.zzaaf.size() + this.zzaag.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzaag.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return ((zzig) this.zzaaf.get(zza)).getValue();
        }
        return this.zzaag.get(comparable);
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        zzgx();
        int zza = zza((Comparable) k);
        if (zza >= 0) {
            return ((zzig) this.zzaaf.get(zza)).setValue(v);
        }
        zzgx();
        if (this.zzaaf.isEmpty() && !(this.zzaaf instanceof ArrayList)) {
            this.zzaaf = new ArrayList(this.zzaae);
        }
        zza = -(zza + 1);
        if (zza >= this.zzaae) {
            return zzgy().put(k, v);
        }
        int size = this.zzaaf.size();
        int i = this.zzaae;
        if (size == i) {
            zzig zzig = (zzig) this.zzaaf.remove(i - 1);
            zzgy().put((Comparable) zzig.getKey(), zzig.getValue());
        }
        this.zzaaf.add(zza, new zzig(this, k, v));
        return null;
    }

    public void clear() {
        zzgx();
        if (!this.zzaaf.isEmpty()) {
            this.zzaaf.clear();
        }
        if (!this.zzaag.isEmpty()) {
            this.zzaag.clear();
        }
    }

    public V remove(Object obj) {
        zzgx();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return zzbq(zza);
        }
        if (this.zzaag.isEmpty()) {
            return null;
        }
        return this.zzaag.remove(comparable);
    }

    private final V zzbq(int i) {
        zzgx();
        Object value = ((zzig) this.zzaaf.remove(i)).getValue();
        if (!this.zzaag.isEmpty()) {
            Iterator it = zzgy().entrySet().iterator();
            this.zzaaf.add(new zzig(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final int zza(K k) {
        int compareTo;
        int size = this.zzaaf.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo((Comparable) ((zzig) this.zzaaf.get(size)).getKey());
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
            int compareTo2 = k.compareTo((Comparable) ((zzig) this.zzaaf.get(i)).getKey());
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
        if (this.zzaah == null) {
            this.zzaah = new zzii(this, null);
        }
        return this.zzaah;
    }

    /* Access modifiers changed, original: final */
    public final Set<Entry<K, V>> zzgw() {
        if (this.zzaaj == null) {
            this.zzaaj = new zzic(this, null);
        }
        return this.zzaaj;
    }

    private final void zzgx() {
        if (this.zztn) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzgy() {
        zzgx();
        if (this.zzaag.isEmpty() && !(this.zzaag instanceof TreeMap)) {
            this.zzaag = new TreeMap();
            this.zzaai = ((TreeMap) this.zzaag).descendingMap();
        }
        return (SortedMap) this.zzaag;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhz)) {
            return super.equals(obj);
        }
        zzhz zzhz = (zzhz) obj;
        int size = size();
        if (size != zzhz.size()) {
            return false;
        }
        int zzgu = zzgu();
        if (zzgu != zzhz.zzgu()) {
            return entrySet().equals(zzhz.entrySet());
        }
        for (int i = 0; i < zzgu; i++) {
            if (!zzbp(i).equals(zzhz.zzbp(i))) {
                return false;
            }
        }
        if (zzgu != size) {
            return this.zzaag.equals(zzhz.zzaag);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < zzgu(); i2++) {
            i += ((zzig) this.zzaaf.get(i2)).hashCode();
        }
        return this.zzaag.size() > 0 ? i + this.zzaag.hashCode() : i;
    }

    /* synthetic */ zzhz(int i, zzia zzia) {
        this(i);
    }
}

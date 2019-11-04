package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap */
class s<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int fqS;
    private List<b> fqT;
    private Map<K, V> fqU;
    private volatile d fqV;
    private boolean fqa;

    /* compiled from: SmallSortedMap */
    private static class a {
        private static final Iterator<Object> fqW = new Iterator<Object>() {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        private static final Iterable<Object> fqX = new Iterable<Object>() {
            public Iterator<Object> iterator() {
                return a.fqW;
            }
        };

        static <T> Iterable<T> bLK() {
            return fqX;
        }
    }

    /* compiled from: SmallSortedMap */
    private class b implements Comparable<b>, Entry<K, V> {
        private final K fqY;
        private V value;

        b(s sVar, Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        b(K k, V v) {
            this.fqY = k;
            this.value = v;
        }

        /* renamed from: bLM */
        public K getKey() {
            return this.fqY;
        }

        public V getValue() {
            return this.value;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            return getKey().compareTo(bVar.getKey());
        }

        public V setValue(V v) {
            s.this.bLH();
            Object obj = this.value;
            this.value = v;
            return obj;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!(equals(this.fqY, entry.getKey()) && equals(this.value, entry.getValue()))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            Comparable comparable = this.fqY;
            int i = 0;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.value;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode ^ i;
        }

        public String toString() {
            String valueOf = String.valueOf(String.valueOf(this.fqY));
            String valueOf2 = String.valueOf(String.valueOf(this.value));
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 1) + valueOf2.length());
            stringBuilder.append(valueOf);
            stringBuilder.append("=");
            stringBuilder.append(valueOf2);
            return stringBuilder.toString();
        }

        private boolean equals(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            } else {
                return obj.equals(obj2);
            }
        }
    }

    /* compiled from: SmallSortedMap */
    private class c implements Iterator<Entry<K, V>> {
        private boolean fra;
        private Iterator<Entry<K, V>> frb;
        private int pos;

        private c() {
            this.pos = -1;
        }

        /* synthetic */ c(s sVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        public boolean hasNext() {
            return this.pos + 1 < s.this.fqT.size() || bLN().hasNext();
        }

        public Entry<K, V> next() {
            this.fra = true;
            int i = this.pos + 1;
            this.pos = i;
            if (i < s.this.fqT.size()) {
                return (Entry) s.this.fqT.get(this.pos);
            }
            return (Entry) bLN().next();
        }

        public void remove() {
            if (this.fra) {
                this.fra = false;
                s.this.bLH();
                if (this.pos < s.this.fqT.size()) {
                    s sVar = s.this;
                    int i = this.pos;
                    this.pos = i - 1;
                    sVar.mn(i);
                    return;
                }
                bLN().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        private Iterator<Entry<K, V>> bLN() {
            if (this.frb == null) {
                this.frb = s.this.fqU.entrySet().iterator();
            }
            return this.frb;
        }
    }

    /* compiled from: SmallSortedMap */
    private class d extends AbstractSet<Entry<K, V>> {
        private d() {
        }

        /* synthetic */ d(s sVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        public Iterator<Entry<K, V>> iterator() {
            return new c(s.this, null);
        }

        public int size() {
            return s.this.size();
        }

        public boolean contains(Object obj) {
            Entry entry = (Entry) obj;
            Object obj2 = s.this.get(entry.getKey());
            obj = entry.getValue();
            return obj2 == obj || (obj2 != null && obj2.equals(obj));
        }

        public boolean add(Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            s.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public boolean remove(Object obj) {
            Entry entry = (Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            s.this.remove(entry.getKey());
            return true;
        }

        public void clear() {
            s.this.clear();
        }
    }

    /* synthetic */ s(int i, AnonymousClass1 anonymousClass1) {
        this(i);
    }

    static <FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g.a<FieldDescriptorType>> s<FieldDescriptorType, Object> ml(int i) {
        return new s<FieldDescriptorType, Object>(i) {
            public /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((kotlin.reflect.jvm.internal.impl.protobuf.g.a) obj, obj2);
            }

            public void bKY() {
                if (!isImmutable()) {
                    Entry mm;
                    for (int i = 0; i < bLF(); i++) {
                        mm = mm(i);
                        if (((kotlin.reflect.jvm.internal.impl.protobuf.g.a) mm.getKey()).bLc()) {
                            mm.setValue(Collections.unmodifiableList((List) mm.getValue()));
                        }
                    }
                    for (Entry mm2 : bLG()) {
                        if (((kotlin.reflect.jvm.internal.impl.protobuf.g.a) mm2.getKey()).bLc()) {
                            mm2.setValue(Collections.unmodifiableList((List) mm2.getValue()));
                        }
                    }
                }
                super.bKY();
            }
        };
    }

    private s(int i) {
        this.fqS = i;
        this.fqT = Collections.emptyList();
        this.fqU = Collections.emptyMap();
    }

    public void bKY() {
        if (!this.fqa) {
            this.fqU = this.fqU.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.fqU);
            this.fqa = true;
        }
    }

    public boolean isImmutable() {
        return this.fqa;
    }

    public int bLF() {
        return this.fqT.size();
    }

    public Entry<K, V> mm(int i) {
        return (Entry) this.fqT.get(i);
    }

    public Iterable<Entry<K, V>> bLG() {
        return this.fqU.isEmpty() ? a.bLK() : this.fqU.entrySet();
    }

    public int size() {
        return this.fqT.size() + this.fqU.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.fqU.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((b) this.fqT.get(a)).getValue();
        }
        return this.fqU.get(comparable);
    }

    /* renamed from: a */
    public V put(K k, V v) {
        bLH();
        int a = a((Comparable) k);
        if (a >= 0) {
            return ((b) this.fqT.get(a)).setValue(v);
        }
        bLJ();
        a = -(a + 1);
        if (a >= this.fqS) {
            return bLI().put(k, v);
        }
        int size = this.fqT.size();
        int i = this.fqS;
        if (size == i) {
            b bVar = (b) this.fqT.remove(i - 1);
            bLI().put(bVar.getKey(), bVar.getValue());
        }
        this.fqT.add(a, new b(k, v));
        return null;
    }

    public void clear() {
        bLH();
        if (!this.fqT.isEmpty()) {
            this.fqT.clear();
        }
        if (!this.fqU.isEmpty()) {
            this.fqU.clear();
        }
    }

    public V remove(Object obj) {
        bLH();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return mn(a);
        }
        if (this.fqU.isEmpty()) {
            return null;
        }
        return this.fqU.remove(comparable);
    }

    private V mn(int i) {
        bLH();
        Object value = ((b) this.fqT.remove(i)).getValue();
        if (!this.fqU.isEmpty()) {
            Iterator it = bLI().entrySet().iterator();
            this.fqT.add(new b(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private int a(K k) {
        int compareTo;
        int size = this.fqT.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo(((b) this.fqT.get(size)).getKey());
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
            int compareTo2 = k.compareTo(((b) this.fqT.get(i)).getKey());
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
        if (this.fqV == null) {
            this.fqV = new d(this, null);
        }
        return this.fqV;
    }

    private void bLH() {
        if (this.fqa) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> bLI() {
        bLH();
        if (this.fqU.isEmpty() && !(this.fqU instanceof TreeMap)) {
            this.fqU = new TreeMap();
        }
        return (SortedMap) this.fqU;
    }

    private void bLJ() {
        bLH();
        if (this.fqT.isEmpty() && !(this.fqT instanceof ArrayList)) {
            this.fqT = new ArrayList(this.fqS);
        }
    }
}

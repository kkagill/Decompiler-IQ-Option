package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: LazyField */
public class i extends j {
    private final n fqu;

    /* compiled from: LazyField */
    static class a<K> implements Entry<K, Object> {
        private Entry<K, i> Va;

        private a(Entry<K, i> entry) {
            this.Va = entry;
        }

        public K getKey() {
            return this.Va.getKey();
        }

        public Object getValue() {
            i iVar = (i) this.Va.getValue();
            if (iVar == null) {
                return null;
            }
            return iVar.bLy();
        }

        public Object setValue(Object obj) {
            if (obj instanceof n) {
                return ((i) this.Va.getValue()).i((n) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* compiled from: LazyField */
    static class b<K> implements Iterator<Entry<K, Object>> {
        private Iterator<Entry<K, Object>> WJ;

        public b(Iterator<Entry<K, Object>> it) {
            this.WJ = it;
        }

        public boolean hasNext() {
            return this.WJ.hasNext();
        }

        public Entry<K, Object> next() {
            Entry entry = (Entry) this.WJ.next();
            return entry.getValue() instanceof i ? new a(entry) : entry;
        }

        public void remove() {
            this.WJ.remove();
        }
    }

    public n bLy() {
        return h(this.fqu);
    }

    public int hashCode() {
        return bLy().hashCode();
    }

    public boolean equals(Object obj) {
        return bLy().equals(obj);
    }

    public String toString() {
        return bLy().toString();
    }
}

package com.google.common.collect;

import java.io.Serializable;
import java.util.Map.Entry;

abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Entry<K, V>> {

    private static class EntrySetSerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableMap<K, V> map;

        EntrySetSerializedForm(ImmutableMap<K, V> immutableMap) {
            this.map = immutableMap;
        }

        /* Access modifiers changed, original: 0000 */
        public Object readResolve() {
            return this.map.entrySet();
        }
    }

    public abstract ImmutableMap<K, V> th();

    ImmutableMapEntrySet() {
    }

    public int size() {
        return th().size();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object obj2 = th().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean sP() {
        return th().sP();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean te() {
        return th().te();
    }

    public int hashCode() {
        return th().hashCode();
    }

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new EntrySetSerializedForm(th());
    }
}

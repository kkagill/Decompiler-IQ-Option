package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.util.HashMap;
import java.util.Map.Entry;

@RestrictTo({Scope.LIBRARY_GROUP})
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    private HashMap<K, Entry<K, V>> mHashMap = new HashMap();

    /* Access modifiers changed, original: protected */
    public Entry<K, V> get(K k) {
        return (Entry) this.mHashMap.get(k);
    }

    public V putIfAbsent(@NonNull K k, @NonNull V v) {
        Entry entry = get(k);
        if (entry != null) {
            return entry.mValue;
        }
        this.mHashMap.put(k, put(k, v));
        return null;
    }

    public V remove(@NonNull K k) {
        Object remove = super.remove(k);
        this.mHashMap.remove(k);
        return remove;
    }

    public boolean contains(K k) {
        return this.mHashMap.containsKey(k);
    }

    public Entry<K, V> ceil(K k) {
        return contains(k) ? ((Entry) this.mHashMap.get(k)).mPrevious : null;
    }
}

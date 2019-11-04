package com.google.common.cache;

import com.google.common.base.i;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;

public abstract class CacheLoader<K, V> {

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    public abstract V at(K k);

    protected CacheLoader() {
    }

    public t<V> h(K k, V v) {
        i.checkNotNull(k);
        i.checkNotNull(v);
        return p.bo(at(k));
    }
}

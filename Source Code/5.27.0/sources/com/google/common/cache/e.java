package com.google.common.cache;

import com.google.common.base.d;

/* compiled from: LoadingCache */
public interface e<K, V> extends d<K, V>, b<K, V> {
    @Deprecated
    V apply(K k);

    V au(K k);
}

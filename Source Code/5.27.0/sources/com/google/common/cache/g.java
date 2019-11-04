package com.google.common.cache;

/* compiled from: ReferenceEntry */
interface g<K, V> {
    long getAccessTime();

    int getHash();

    K getKey();

    g<K, V> getNext();

    g<K, V> getNextInAccessQueue();

    g<K, V> getNextInWriteQueue();

    g<K, V> getPreviousInAccessQueue();

    g<K, V> getPreviousInWriteQueue();

    q<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j);

    void setNextInAccessQueue(g<K, V> gVar);

    void setNextInWriteQueue(g<K, V> gVar);

    void setPreviousInAccessQueue(g<K, V> gVar);

    void setPreviousInWriteQueue(g<K, V> gVar);

    void setValueReference(q<K, V> qVar);

    void setWriteTime(long j);
}

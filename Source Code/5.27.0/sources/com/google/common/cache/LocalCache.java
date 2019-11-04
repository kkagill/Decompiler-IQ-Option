package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.ac;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    static final q<Object, Object> Tv = new q<Object, Object>() {
        public q<Object, Object> a(ReferenceQueue<Object> referenceQueue, Object obj, g<Object, Object> gVar) {
            return this;
        }

        public void aw(Object obj) {
        }

        public Object get() {
            return null;
        }

        public int getWeight() {
            return 0;
        }

        public boolean isActive() {
            return false;
        }

        public g<Object, Object> re() {
            return null;
        }

        public boolean rf() {
            return false;
        }

        public Object rg() {
            return null;
        }
    };
    static final Queue<?> Tw = new AbstractQueue<Object>() {
        public boolean offer(Object obj) {
            return true;
        }

        public Object peek() {
            return null;
        }

        public Object poll() {
            return null;
        }

        public int size() {
            return 0;
        }

        public Iterator<Object> iterator() {
            return ImmutableSet.tm().iterator();
        }
    };
    static final Logger logger = Logger.getLogger(LocalCache.class.getName());
    final long Tg;
    final int To;
    final int Tp;
    final Segment<K, V>[] Tq;
    final Queue<RemovalNotification<K, V>> Tr;
    final EntryFactory Ts;
    final com.google.common.cache.a.b Tt;
    final CacheLoader<? super K, V> Tu;
    Set<K> Tx;
    Collection<V> Ty;
    Set<Entry<K, V>> Tz;
    final int concurrencyLevel;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final Equivalence<Object> keyEquivalence;
    final Strength keyStrength;
    final long maxWeight;
    final h<K, V> removalListener;
    final com.google.common.base.p ticker;
    final Equivalence<Object> valueEquivalence;
    final Strength valueStrength;
    final i<K, V> weigher;

    enum EntryFactory {
        STRONG {
            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> newEntry(Segment<K, V> segment, K k, int i, g<K, V> gVar) {
                return new m(k, i, gVar);
            }
        },
        STRONG_ACCESS {
            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> newEntry(Segment<K, V> segment, K k, int i, g<K, V> gVar) {
                return new k(k, i, gVar);
            }

            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> copyEntry(Segment<K, V> segment, g<K, V> gVar, g<K, V> gVar2) {
                g copyEntry = super.copyEntry(segment, gVar, gVar2);
                copyAccessEntry(gVar, copyEntry);
                return copyEntry;
            }
        },
        STRONG_WRITE {
            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> newEntry(Segment<K, V> segment, K k, int i, g<K, V> gVar) {
                return new o(k, i, gVar);
            }

            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> copyEntry(Segment<K, V> segment, g<K, V> gVar, g<K, V> gVar2) {
                g copyEntry = super.copyEntry(segment, gVar, gVar2);
                copyWriteEntry(gVar, copyEntry);
                return copyEntry;
            }
        },
        STRONG_ACCESS_WRITE {
            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> newEntry(Segment<K, V> segment, K k, int i, g<K, V> gVar) {
                return new l(k, i, gVar);
            }

            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> copyEntry(Segment<K, V> segment, g<K, V> gVar, g<K, V> gVar2) {
                g copyEntry = super.copyEntry(segment, gVar, gVar2);
                copyAccessEntry(gVar, copyEntry);
                copyWriteEntry(gVar, copyEntry);
                return copyEntry;
            }
        },
        WEAK {
            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> newEntry(Segment<K, V> segment, K k, int i, g<K, V> gVar) {
                return new u(segment.keyReferenceQueue, k, i, gVar);
            }
        },
        WEAK_ACCESS {
            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> newEntry(Segment<K, V> segment, K k, int i, g<K, V> gVar) {
                return new s(segment.keyReferenceQueue, k, i, gVar);
            }

            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> copyEntry(Segment<K, V> segment, g<K, V> gVar, g<K, V> gVar2) {
                g copyEntry = super.copyEntry(segment, gVar, gVar2);
                copyAccessEntry(gVar, copyEntry);
                return copyEntry;
            }
        },
        WEAK_WRITE {
            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> newEntry(Segment<K, V> segment, K k, int i, g<K, V> gVar) {
                return new w(segment.keyReferenceQueue, k, i, gVar);
            }

            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> copyEntry(Segment<K, V> segment, g<K, V> gVar, g<K, V> gVar2) {
                g copyEntry = super.copyEntry(segment, gVar, gVar2);
                copyWriteEntry(gVar, copyEntry);
                return copyEntry;
            }
        },
        WEAK_ACCESS_WRITE {
            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> newEntry(Segment<K, V> segment, K k, int i, g<K, V> gVar) {
                return new t(segment.keyReferenceQueue, k, i, gVar);
            }

            /* Access modifiers changed, original: 0000 */
            public <K, V> g<K, V> copyEntry(Segment<K, V> segment, g<K, V> gVar, g<K, V> gVar2) {
                g copyEntry = super.copyEntry(segment, gVar, gVar2);
                copyAccessEntry(gVar, copyEntry);
                copyWriteEntry(gVar, copyEntry);
                return copyEntry;
            }
        };
        
        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final EntryFactory[] factories = null;

        public abstract <K, V> g<K, V> newEntry(Segment<K, V> segment, K k, int i, g<K, V> gVar);

        static {
            factories = new EntryFactory[]{r10, r11, r12, r13, r14, r15, r16, r17};
        }

        static EntryFactory getFactory(Strength strength, boolean z, boolean z2) {
            int i = 0;
            int i2 = (strength == Strength.WEAK ? 4 : 0) | z;
            if (z2) {
                i = 2;
            }
            return factories[i2 | i];
        }

        /* Access modifiers changed, original: 0000 */
        public <K, V> g<K, V> copyEntry(Segment<K, V> segment, g<K, V> gVar, g<K, V> gVar2) {
            return newEntry(segment, gVar.getKey(), gVar.getHash(), gVar2);
        }

        /* Access modifiers changed, original: 0000 */
        public <K, V> void copyAccessEntry(g<K, V> gVar, g<K, V> gVar2) {
            gVar2.setAccessTime(gVar.getAccessTime());
            LocalCache.a(gVar.getPreviousInAccessQueue(), (g) gVar2);
            LocalCache.a((g) gVar2, gVar.getNextInAccessQueue());
            LocalCache.b(gVar);
        }

        /* Access modifiers changed, original: 0000 */
        public <K, V> void copyWriteEntry(g<K, V> gVar, g<K, V> gVar2) {
            gVar2.setWriteTime(gVar.getWriteTime());
            LocalCache.b(gVar.getPreviousInWriteQueue(), (g) gVar2);
            LocalCache.b((g) gVar2, gVar.getNextInWriteQueue());
            LocalCache.c(gVar);
        }
    }

    static class Segment<K, V> extends ReentrantLock {
        final Queue<g<K, V>> accessQueue;
        volatile int count;
        final ReferenceQueue<K> keyReferenceQueue;
        final LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<g<K, V>> recencyQueue;
        final com.google.common.cache.a.b statsCounter;
        volatile AtomicReferenceArray<g<K, V>> table;
        int threshold;
        long totalWeight;
        final ReferenceQueue<V> valueReferenceQueue;
        final Queue<g<K, V>> writeQueue;

        Segment(LocalCache<K, V> localCache, int i, long j, com.google.common.cache.a.b bVar) {
            Queue concurrentLinkedQueue;
            Queue cVar;
            this.map = localCache;
            this.maxSegmentWeight = j;
            this.statsCounter = (com.google.common.cache.a.b) com.google.common.base.i.checkNotNull(bVar);
            a(bv(i));
            ReferenceQueue referenceQueue = null;
            this.keyReferenceQueue = localCache.qX() ? new ReferenceQueue() : null;
            if (localCache.qY()) {
                referenceQueue = new ReferenceQueue();
            }
            this.valueReferenceQueue = referenceQueue;
            if (localCache.qQ()) {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
            } else {
                concurrentLinkedQueue = LocalCache.rb();
            }
            this.recencyQueue = concurrentLinkedQueue;
            if (localCache.qR()) {
                concurrentLinkedQueue = new aa();
            } else {
                concurrentLinkedQueue = LocalCache.rb();
            }
            this.writeQueue = concurrentLinkedQueue;
            if (localCache.qQ()) {
                cVar = new c();
            } else {
                cVar = LocalCache.rb();
            }
            this.accessQueue = cVar;
        }

        /* Access modifiers changed, original: 0000 */
        public AtomicReferenceArray<g<K, V>> bv(int i) {
            return new AtomicReferenceArray(i);
        }

        /* Access modifiers changed, original: 0000 */
        public void a(AtomicReferenceArray<g<K, V>> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            if (!this.map.qM()) {
                int i = this.threshold;
                if (((long) i) == this.maxSegmentWeight) {
                    this.threshold = i + 1;
                }
            }
            this.table = atomicReferenceArray;
        }

        /* Access modifiers changed, original: 0000 */
        public g<K, V> a(K k, int i, g<K, V> gVar) {
            return this.map.Ts.newEntry(this, com.google.common.base.i.checkNotNull(k), i, gVar);
        }

        /* Access modifiers changed, original: 0000 */
        public g<K, V> c(g<K, V> gVar, g<K, V> gVar2) {
            if (gVar.getKey() == null) {
                return null;
            }
            q valueReference = gVar.getValueReference();
            Object obj = valueReference.get();
            if (obj == null && valueReference.isActive()) {
                return null;
            }
            g copyEntry = this.map.Ts.copyEntry(this, gVar, gVar2);
            copyEntry.setValueReference(valueReference.a(this.valueReferenceQueue, obj, copyEntry));
            return copyEntry;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(g<K, V> gVar, K k, V v, long j) {
            q valueReference = gVar.getValueReference();
            int weigh = this.map.weigher.weigh(k, v);
            com.google.common.base.i.checkState(weigh >= 0, "Weights must be non-negative");
            gVar.setValueReference(this.map.valueStrength.referenceValue(this, gVar, v, weigh));
            a((g) gVar, weigh, j);
            valueReference.aw(v);
        }

        /* Access modifiers changed, original: 0000 */
        public V a(K k, int i, CacheLoader<? super K, V> cacheLoader) {
            com.google.common.base.i.checkNotNull(k);
            com.google.common.base.i.checkNotNull(cacheLoader);
            try {
                Object a;
                if (this.count != 0) {
                    g b = b(k, i);
                    if (b != null) {
                        long qm = this.map.ticker.qm();
                        Object a2 = a(b, qm);
                        if (a2 != null) {
                            c(b, qm);
                            this.statsCounter.bp(1);
                            a = a(b, k, i, a2, qm, cacheLoader);
                            ry();
                            return a;
                        }
                        q valueReference = b.getValueReference();
                        if (valueReference.rf()) {
                            a = a(b, (Object) k, valueReference);
                            ry();
                            return a;
                        }
                    }
                }
                a = b((Object) k, i, (CacheLoader) cacheLoader);
                ry();
                return a;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new ExecutionError((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new UncheckedExecutionException(cause);
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                ry();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V get(Object obj, int i) {
            try {
                V v = null;
                if (this.count != 0) {
                    long qm = this.map.ticker.qm();
                    g a = a(obj, i, qm);
                    if (a == null) {
                        return v;
                    }
                    Object obj2 = a.getValueReference().get();
                    if (obj2 != null) {
                        c(a, qm);
                        obj = a(a, a.getKey(), i, obj2, qm, this.map.Tu);
                        ry();
                        return obj;
                    }
                    ro();
                }
                ry();
                return v;
            } finally {
                ry();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V b(K k, int i, CacheLoader<? super K, V> cacheLoader) {
            Object obj = k;
            int i2 = i;
            lock();
            try {
                i iVar;
                q qVar;
                Object obj2;
                long qm = this.map.ticker.qm();
                B(qm);
                int i3 = this.count - 1;
                AtomicReferenceArray atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                g gVar = (g) atomicReferenceArray.get(length);
                g gVar2 = gVar;
                while (true) {
                    iVar = null;
                    if (gVar2 == null) {
                        qVar = null;
                        break;
                    }
                    Object key = gVar2.getKey();
                    if (gVar2.getHash() == i2 && key != null && this.map.keyEquivalence.e(obj, key)) {
                        q valueReference = gVar2.getValueReference();
                        if (valueReference.rf()) {
                            obj2 = null;
                            qVar = valueReference;
                        } else {
                            Object obj3 = valueReference.get();
                            if (obj3 == null) {
                                a(key, i, obj3, valueReference.getWeight(), RemovalCause.COLLECTED);
                            } else if (this.map.b(gVar2, qm)) {
                                a(key, i, obj3, valueReference.getWeight(), RemovalCause.EXPIRED);
                            } else {
                                d(gVar2, qm);
                                this.statsCounter.bp(1);
                                unlock();
                                rz();
                                return obj3;
                            }
                            this.writeQueue.remove(gVar2);
                            this.accessQueue.remove(gVar2);
                            this.count = i3;
                            qVar = valueReference;
                        }
                    } else {
                        gVar2 = gVar2.getNext();
                    }
                }
                obj2 = 1;
                if (obj2 != null) {
                    iVar = new i();
                    if (gVar2 == null) {
                        gVar2 = a(obj, i2, gVar);
                        gVar2.setValueReference(iVar);
                        atomicReferenceArray.set(length, gVar2);
                    } else {
                        gVar2.setValueReference(iVar);
                    }
                }
                unlock();
                rz();
                if (obj2 == null) {
                    return a(gVar2, obj, qVar);
                }
                try {
                    synchronized (gVar2) {
                        obj = a(obj, i2, iVar, (CacheLoader) cacheLoader);
                    }
                    this.statsCounter.bq(1);
                    return obj;
                } catch (Throwable th) {
                    this.statsCounter.bq(1);
                }
            } catch (Throwable th2) {
                unlock();
                rz();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V a(g<K, V> gVar, K k, q<K, V> qVar) {
            if (qVar.rf()) {
                com.google.common.base.i.b(Thread.holdsLock(gVar) ^ 1, "Recursive load of: %s", (Object) k);
                try {
                    V rg = qVar.rg();
                    if (rg != null) {
                        c((g) gVar, this.map.ticker.qm());
                        return rg;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("CacheLoader returned null for key ");
                    stringBuilder.append(k);
                    stringBuilder.append(".");
                    throw new InvalidCacheLoadException(stringBuilder.toString());
                } finally {
                    this.statsCounter.bq(1);
                }
            } else {
                throw new AssertionError();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V a(K k, int i, i<K, V> iVar, CacheLoader<? super K, V> cacheLoader) {
            return a((Object) k, i, (i) iVar, iVar.b(k, cacheLoader));
        }

        /* Access modifiers changed, original: 0000 */
        public com.google.common.util.concurrent.t<V> b(K k, int i, i<K, V> iVar, CacheLoader<? super K, V> cacheLoader) {
            com.google.common.util.concurrent.t b = iVar.b(k, cacheLoader);
            final K k2 = k;
            final int i2 = i;
            final i<K, V> iVar2 = iVar;
            final com.google.common.util.concurrent.t tVar = b;
            b.addListener(new Runnable() {
                public void run() {
                    try {
                        Segment.this.a(k2, i2, iVar2, tVar);
                    } catch (Throwable th) {
                        LocalCache.logger.log(Level.WARNING, "Exception thrown during refresh", th);
                        iVar2.setException(th);
                    }
                }
            }, com.google.common.util.concurrent.x.vG());
            return b;
        }

        /* Access modifiers changed, original: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
        public V a(K r4, int r5, com.google.common.cache.LocalCache.i<K, V> r6, com.google.common.util.concurrent.t<V> r7) {
            /*
            r3 = this;
            r7 = com.google.common.util.concurrent.ac.getUninterruptibly(r7);	 Catch:{ all -> 0x003f }
            if (r7 == 0) goto L_0x0023;
        L_0x0006:
            r0 = r3.statsCounter;	 Catch:{ all -> 0x0021 }
            r1 = r6.qi();	 Catch:{ all -> 0x0021 }
            r0.v(r1);	 Catch:{ all -> 0x0021 }
            r3.a(r4, r5, r6, r7);	 Catch:{ all -> 0x0021 }
            if (r7 != 0) goto L_0x0020;
        L_0x0014:
            r0 = r3.statsCounter;
            r1 = r6.qi();
            r0.w(r1);
            r3.a(r4, r5, r6);
        L_0x0020:
            return r7;
        L_0x0021:
            r0 = move-exception;
            goto L_0x0041;
        L_0x0023:
            r0 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException;	 Catch:{ all -> 0x0021 }
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0021 }
            r1.<init>();	 Catch:{ all -> 0x0021 }
            r2 = "CacheLoader returned null for key ";
            r1.append(r2);	 Catch:{ all -> 0x0021 }
            r1.append(r4);	 Catch:{ all -> 0x0021 }
            r2 = ".";
            r1.append(r2);	 Catch:{ all -> 0x0021 }
            r1 = r1.toString();	 Catch:{ all -> 0x0021 }
            r0.<init>(r1);	 Catch:{ all -> 0x0021 }
            throw r0;	 Catch:{ all -> 0x0021 }
        L_0x003f:
            r0 = move-exception;
            r7 = 0;
        L_0x0041:
            if (r7 != 0) goto L_0x004f;
        L_0x0043:
            r7 = r3.statsCounter;
            r1 = r6.qi();
            r7.w(r1);
            r3.a(r4, r5, r6);
        L_0x004f:
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.a(java.lang.Object, int, com.google.common.cache.LocalCache$i, com.google.common.util.concurrent.t):java.lang.Object");
        }

        /* Access modifiers changed, original: 0000 */
        public V a(g<K, V> gVar, K k, int i, V v, long j, CacheLoader<? super K, V> cacheLoader) {
            if (this.map.qP() && j - gVar.getWriteTime() > this.map.Tg && !gVar.getValueReference().rf()) {
                Object a = a((Object) k, i, (CacheLoader) cacheLoader, true);
                if (a != null) {
                    return a;
                }
            }
            return v;
        }

        /* Access modifiers changed, original: 0000 */
        public V a(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            i a = a((Object) k, i, z);
            if (a == null) {
                return null;
            }
            com.google.common.util.concurrent.t b = b(k, i, a, cacheLoader);
            if (b.isDone()) {
                try {
                    return ac.getUninterruptibly(b);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public i<K, V> a(K k, int i, boolean z) {
            lock();
            try {
                long qm = this.map.ticker.qm();
                B(qm);
                AtomicReferenceArray atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                g gVar = (g) atomicReferenceArray.get(length);
                g gVar2 = gVar;
                while (gVar2 != null) {
                    Object key = gVar2.getKey();
                    if (gVar2.getHash() == i && key != null && this.map.keyEquivalence.e(k, key)) {
                        q valueReference = gVar2.getValueReference();
                        if (!valueReference.rf()) {
                            if (!z || qm - gVar2.getWriteTime() >= this.map.Tg) {
                                this.modCount++;
                                i iVar = new i(valueReference);
                                gVar2.setValueReference(iVar);
                                unlock();
                                rz();
                                return iVar;
                            }
                        }
                        unlock();
                        rz();
                        return null;
                    }
                    gVar2 = gVar2.getNext();
                }
                this.modCount++;
                i iVar2 = new i();
                g a = a((Object) k, i, gVar);
                a.setValueReference(iVar2);
                atomicReferenceArray.set(length, a);
                unlock();
                rz();
                return iVar2;
            } catch (Throwable th) {
                unlock();
                rz();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void ro() {
            if (tryLock()) {
                try {
                    rp();
                } finally {
                    unlock();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void rp() {
            if (this.map.qX()) {
                rq();
            }
            if (this.map.qY()) {
                rr();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void rq() {
            int i = 0;
            do {
                Reference poll = this.keyReferenceQueue.poll();
                if (poll != null) {
                    this.map.a((g) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* Access modifiers changed, original: 0000 */
        public void rr() {
            int i = 0;
            do {
                Reference poll = this.valueReferenceQueue.poll();
                if (poll != null) {
                    this.map.a((q) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* Access modifiers changed, original: 0000 */
        public void rs() {
            if (this.map.qX()) {
                rt();
            }
            if (this.map.qY()) {
                ru();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void rt() {
            while (this.keyReferenceQueue.poll() != null) {
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void ru() {
            while (this.valueReferenceQueue.poll() != null) {
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void c(g<K, V> gVar, long j) {
            if (this.map.qT()) {
                gVar.setAccessTime(j);
            }
            this.recencyQueue.add(gVar);
        }

        /* Access modifiers changed, original: 0000 */
        public void d(g<K, V> gVar, long j) {
            if (this.map.qT()) {
                gVar.setAccessTime(j);
            }
            this.accessQueue.add(gVar);
        }

        /* Access modifiers changed, original: 0000 */
        public void a(g<K, V> gVar, int i, long j) {
            rv();
            this.totalWeight += (long) i;
            if (this.map.qT()) {
                gVar.setAccessTime(j);
            }
            if (this.map.qS()) {
                gVar.setWriteTime(j);
            }
            this.accessQueue.add(gVar);
            this.writeQueue.add(gVar);
        }

        /* Access modifiers changed, original: 0000 */
        public void rv() {
            while (true) {
                g gVar = (g) this.recencyQueue.poll();
                if (gVar == null) {
                    return;
                }
                if (this.accessQueue.contains(gVar)) {
                    this.accessQueue.add(gVar);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void z(long j) {
            if (tryLock()) {
                try {
                    A(j);
                } finally {
                    unlock();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void A(long j) {
            g gVar;
            rv();
            while (true) {
                gVar = (g) this.writeQueue.peek();
                if (gVar == null || !this.map.b(gVar, j)) {
                    while (true) {
                        gVar = (g) this.accessQueue.peek();
                    }
                } else if (!a(gVar, gVar.getHash(), RemovalCause.EXPIRED)) {
                    throw new AssertionError();
                }
            }
            while (true) {
                gVar = (g) this.accessQueue.peek();
                if (gVar != null && this.map.b(gVar, j)) {
                    if (!a(gVar, gVar.getHash(), RemovalCause.EXPIRED)) {
                        throw new AssertionError();
                    }
                } else {
                    return;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void a(K k, int i, V v, int i2, RemovalCause removalCause) {
            this.totalWeight -= (long) i2;
            if (removalCause.wasEvicted()) {
                this.statsCounter.qo();
            }
            if (this.map.Tr != LocalCache.Tw) {
                this.map.Tr.offer(RemovalNotification.a(k, v, removalCause));
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void g(g<K, V> gVar) {
            if (this.map.qL()) {
                rv();
                if (((long) gVar.getValueReference().getWeight()) <= this.maxSegmentWeight || a((g) gVar, gVar.getHash(), RemovalCause.SIZE)) {
                    while (this.totalWeight > this.maxSegmentWeight) {
                        g rw = rw();
                        if (!a(rw, rw.getHash(), RemovalCause.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public g<K, V> rw() {
            for (g gVar : this.accessQueue) {
                if (gVar.getValueReference().getWeight() > 0) {
                    return gVar;
                }
            }
            throw new AssertionError();
        }

        /* Access modifiers changed, original: 0000 */
        public g<K, V> bw(int i) {
            AtomicReferenceArray atomicReferenceArray = this.table;
            return (g) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* Access modifiers changed, original: 0000 */
        public g<K, V> b(Object obj, int i) {
            for (g bw = bw(i); bw != null; bw = bw.getNext()) {
                if (bw.getHash() == i) {
                    Object key = bw.getKey();
                    if (key == null) {
                        ro();
                    } else if (this.map.keyEquivalence.e(obj, key)) {
                        return bw;
                    }
                }
            }
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public g<K, V> a(Object obj, int i, long j) {
            g b = b(obj, i);
            if (b == null) {
                return null;
            }
            if (!this.map.b(b, j)) {
                return b;
            }
            z(j);
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public V a(g<K, V> gVar, long j) {
            if (gVar.getKey() == null) {
                ro();
                return null;
            }
            Object obj = gVar.getValueReference().get();
            if (obj == null) {
                ro();
                return null;
            } else if (!this.map.b((g) gVar, j)) {
                return obj;
            } else {
                z(j);
                return null;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean c(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    g a = a(obj, i, this.map.ticker.qm());
                    if (a == null) {
                        return z;
                    }
                    if (a.getValueReference().get() != null) {
                        z = true;
                    }
                    ry();
                    return z;
                }
                ry();
                return z;
            } finally {
                ry();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V a(K k, int i, V v, boolean z) {
            K k2 = k;
            int i2 = i;
            lock();
            try {
                g gVar;
                long qm = this.map.ticker.qm();
                B(qm);
                if (this.count + 1 > this.threshold) {
                    rx();
                    int i3 = this.count;
                }
                AtomicReferenceArray atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                g gVar2 = (g) atomicReferenceArray.get(length);
                for (gVar = gVar2; gVar != null; gVar = gVar.getNext()) {
                    Object key = gVar.getKey();
                    if (gVar.getHash() == i2 && key != null && this.map.keyEquivalence.e(k, key)) {
                        q valueReference = gVar.getValueReference();
                        Object obj = valueReference.get();
                        if (obj == null) {
                            int i4;
                            this.modCount++;
                            if (valueReference.isActive()) {
                                a(k, i, obj, valueReference.getWeight(), RemovalCause.COLLECTED);
                                a(gVar, (Object) k, (Object) v, qm);
                                i4 = this.count;
                            } else {
                                a(gVar, (Object) k, (Object) v, qm);
                                i4 = this.count + 1;
                            }
                            this.count = i4;
                            g(gVar);
                            unlock();
                            rz();
                            return null;
                        }
                        if (z) {
                            d(gVar, qm);
                        } else {
                            this.modCount++;
                            a(k, i, obj, valueReference.getWeight(), RemovalCause.REPLACED);
                            a(gVar, (Object) k, (Object) v, qm);
                            g(gVar);
                        }
                        unlock();
                        rz();
                        return obj;
                    }
                }
                this.modCount++;
                gVar = a((Object) k, i2, gVar2);
                a(gVar, (Object) k, (Object) v, qm);
                atomicReferenceArray.set(length, gVar);
                this.count++;
                g(gVar);
                unlock();
                rz();
                return null;
            } catch (Throwable th) {
                unlock();
                rz();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void rx() {
            AtomicReferenceArray atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.count;
                AtomicReferenceArray bv = bv(length << 1);
                this.threshold = (bv.length() * 3) / 4;
                int length2 = bv.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    g gVar = (g) atomicReferenceArray.get(i2);
                    if (gVar != null) {
                        g next = gVar.getNext();
                        int hash = gVar.getHash() & length2;
                        if (next == null) {
                            bv.set(hash, gVar);
                        } else {
                            g gVar2 = gVar;
                            while (next != null) {
                                int hash2 = next.getHash() & length2;
                                if (hash2 != hash) {
                                    gVar2 = next;
                                    hash = hash2;
                                }
                                next = next.getNext();
                            }
                            bv.set(hash, gVar2);
                            while (gVar != gVar2) {
                                int hash3 = gVar.getHash() & length2;
                                g c = c(gVar, (g) bv.get(hash3));
                                if (c != null) {
                                    bv.set(hash3, c);
                                } else {
                                    h(gVar);
                                    i--;
                                }
                                gVar = gVar.getNext();
                            }
                        }
                    }
                }
                this.table = bv;
                this.count = i;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(K k, int i, V v, V v2) {
            int i2 = i;
            lock();
            try {
                long qm = this.map.ticker.qm();
                B(qm);
                AtomicReferenceArray atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                g gVar = (g) atomicReferenceArray.get(length);
                for (g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.getNext()) {
                    Object key = gVar2.getKey();
                    if (gVar2.getHash() != i2 || key == null) {
                        K k2 = k;
                    } else if (this.map.keyEquivalence.e(k, key)) {
                        q valueReference = gVar2.getValueReference();
                        Object obj = valueReference.get();
                        if (obj == null) {
                            if (valueReference.isActive()) {
                                int i3 = this.count;
                                this.modCount++;
                                g a = a(gVar, gVar2, key, i, obj, valueReference, RemovalCause.COLLECTED);
                                i3 = this.count - 1;
                                atomicReferenceArray.set(length, a);
                                this.count = i3;
                            }
                        } else if (this.map.valueEquivalence.e(v, obj)) {
                            this.modCount++;
                            a(k, i, obj, valueReference.getWeight(), RemovalCause.REPLACED);
                            a(gVar2, (Object) k, (Object) v2, qm);
                            g(gVar2);
                            unlock();
                            rz();
                            return true;
                        } else {
                            d(gVar2, qm);
                        }
                        unlock();
                        rz();
                        return false;
                    }
                    V v3 = v;
                }
                unlock();
                rz();
                return false;
            } catch (Throwable th) {
                unlock();
                rz();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V a(K k, int i, V v) {
            int i2 = i;
            lock();
            try {
                long qm = this.map.ticker.qm();
                B(qm);
                AtomicReferenceArray atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                g gVar = (g) atomicReferenceArray.get(length);
                for (g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.getNext()) {
                    Object key = gVar2.getKey();
                    if (gVar2.getHash() != i2 || key == null) {
                        K k2 = k;
                    } else if (this.map.keyEquivalence.e(k, key)) {
                        q valueReference = gVar2.getValueReference();
                        Object obj = valueReference.get();
                        if (obj == null) {
                            if (valueReference.isActive()) {
                                int i3 = this.count;
                                this.modCount++;
                                g a = a(gVar, gVar2, key, i, obj, valueReference, RemovalCause.COLLECTED);
                                i3 = this.count - 1;
                                atomicReferenceArray.set(length, a);
                                this.count = i3;
                            }
                            unlock();
                            rz();
                            return null;
                        }
                        this.modCount++;
                        a(k, i, obj, valueReference.getWeight(), RemovalCause.REPLACED);
                        a(gVar2, (Object) k, (Object) v, qm);
                        g(gVar2);
                        unlock();
                        rz();
                        return obj;
                    }
                }
                unlock();
                rz();
                return null;
            } catch (Throwable th) {
                unlock();
                rz();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V d(Object obj, int i) {
            lock();
            try {
                B(this.map.ticker.qm());
                int i2 = this.count;
                AtomicReferenceArray atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                g gVar = (g) atomicReferenceArray.get(length);
                for (g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.getNext()) {
                    Object key = gVar2.getKey();
                    if (gVar2.getHash() == i && key != null && this.map.keyEquivalence.e(obj, key)) {
                        RemovalCause removalCause;
                        q valueReference = gVar2.getValueReference();
                        V v = valueReference.get();
                        if (v != null) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else {
                            if (valueReference.isActive()) {
                                removalCause = RemovalCause.COLLECTED;
                            }
                            unlock();
                            rz();
                            return null;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.modCount++;
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, a(gVar, gVar2, key, i, v, valueReference, removalCause2));
                        this.count = i3;
                        return v;
                    }
                }
                unlock();
                rz();
                return null;
            } finally {
                unlock();
                rz();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean b(Object obj, int i, Object obj2) {
            lock();
            try {
                B(this.map.ticker.qm());
                int i2 = this.count;
                AtomicReferenceArray atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                g gVar = (g) atomicReferenceArray.get(length);
                for (g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.getNext()) {
                    Object key = gVar2.getKey();
                    if (gVar2.getHash() == i && key != null && this.map.keyEquivalence.e(obj, key)) {
                        RemovalCause removalCause;
                        q valueReference = gVar2.getValueReference();
                        Object obj3 = valueReference.get();
                        if (this.map.valueEquivalence.e(obj2, obj3)) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else {
                            if (obj3 == null && valueReference.isActive()) {
                                removalCause = RemovalCause.COLLECTED;
                            }
                            unlock();
                            rz();
                            return false;
                        }
                        this.modCount++;
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, a(gVar, gVar2, key, i, obj3, valueReference, removalCause));
                        this.count = i3;
                        if (removalCause != RemovalCause.EXPLICIT) {
                            z = false;
                        }
                        unlock();
                        rz();
                        return z;
                    }
                }
                unlock();
                rz();
                return false;
            } catch (Throwable th) {
                unlock();
                rz();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(K k, int i, i<K, V> iVar, V v) {
            Object obj = k;
            int i2 = i;
            lock();
            try {
                g gVar;
                long qm = this.map.ticker.qm();
                B(qm);
                int i3 = this.count + 1;
                if (i3 > this.threshold) {
                    rx();
                    i3 = this.count + 1;
                }
                int i4 = i3;
                AtomicReferenceArray atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                g gVar2 = (g) atomicReferenceArray.get(length);
                for (gVar = gVar2; gVar != null; gVar = gVar.getNext()) {
                    Object key = gVar.getKey();
                    if (gVar.getHash() == i2 && key != null && this.map.keyEquivalence.e(obj, key)) {
                        q valueReference = gVar.getValueReference();
                        Object obj2 = valueReference.get();
                        if (iVar != valueReference) {
                            if (obj2 != null || valueReference == LocalCache.Tv) {
                                a(k, i, v, 0, RemovalCause.REPLACED);
                                unlock();
                                rz();
                                return false;
                            }
                        }
                        this.modCount++;
                        if (iVar.isActive()) {
                            a(k, i, obj2, iVar.getWeight(), obj2 == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                            i4--;
                        }
                        a(gVar, (Object) k, (Object) v, qm);
                        this.count = i4;
                        g(gVar);
                        unlock();
                        rz();
                        return true;
                    }
                    i<K, V> iVar2 = iVar;
                }
                this.modCount++;
                gVar = a(obj, i2, gVar2);
                a(gVar, (Object) k, (Object) v, qm);
                atomicReferenceArray.set(length, gVar);
                this.count = i4;
                g(gVar);
                unlock();
                rz();
                return true;
            } catch (Throwable th) {
                unlock();
                rz();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void clear() {
            if (this.count != 0) {
                lock();
                try {
                    int i;
                    B(this.map.ticker.qm());
                    AtomicReferenceArray atomicReferenceArray = this.table;
                    for (i = 0; i < atomicReferenceArray.length(); i++) {
                        for (g gVar = (g) atomicReferenceArray.get(i); gVar != null; gVar = gVar.getNext()) {
                            if (gVar.getValueReference().isActive()) {
                                RemovalCause removalCause;
                                Object key = gVar.getKey();
                                Object obj = gVar.getValueReference().get();
                                if (key != null) {
                                    if (obj != null) {
                                        removalCause = RemovalCause.EXPLICIT;
                                        a(key, gVar.getHash(), obj, gVar.getValueReference().getWeight(), removalCause);
                                    }
                                }
                                removalCause = RemovalCause.COLLECTED;
                                a(key, gVar.getHash(), obj, gVar.getValueReference().getWeight(), removalCause);
                            }
                        }
                    }
                    for (i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    rs();
                    this.writeQueue.clear();
                    this.accessQueue.clear();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                    rz();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public g<K, V> a(g<K, V> gVar, g<K, V> gVar2, K k, int i, V v, q<K, V> qVar, RemovalCause removalCause) {
            a(k, i, v, qVar.getWeight(), removalCause);
            this.writeQueue.remove(gVar2);
            this.accessQueue.remove(gVar2);
            if (!qVar.rf()) {
                return d((g) gVar, (g) gVar2);
            }
            qVar.aw(null);
            return gVar;
        }

        /* Access modifiers changed, original: 0000 */
        public g<K, V> d(g<K, V> gVar, g<K, V> gVar2) {
            int i = this.count;
            g next = gVar2.getNext();
            g gVar3;
            while (gVar3 != gVar2) {
                g c = c(gVar3, next);
                if (c != null) {
                    next = c;
                } else {
                    h(gVar3);
                    i--;
                }
                gVar3 = gVar3.getNext();
            }
            this.count = i;
            return next;
        }

        /* Access modifiers changed, original: 0000 */
        public void h(g<K, V> gVar) {
            a(gVar.getKey(), gVar.getHash(), gVar.getValueReference().get(), gVar.getValueReference().getWeight(), RemovalCause.COLLECTED);
            this.writeQueue.remove(gVar);
            this.accessQueue.remove(gVar);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(g<K, V> gVar, int i) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - z) & i;
                g<K, V> gVar2 = (g) atomicReferenceArray.get(length);
                for (g<K, V> gVar3 = gVar2; gVar3 != null; gVar3 = gVar3.getNext()) {
                    if (gVar3 == gVar) {
                        this.modCount += z;
                        i = this.count - z;
                        atomicReferenceArray.set(length, a(gVar2, gVar3, gVar3.getKey(), i, gVar3.getValueReference().get(), gVar3.getValueReference(), RemovalCause.COLLECTED));
                        this.count = i;
                        return z;
                    }
                }
                unlock();
                rz();
                return false;
            } finally {
                unlock();
                rz();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(K k, int i, q<K, V> qVar) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - z) & i;
                g gVar = (g) atomicReferenceArray.get(length);
                g gVar2 = gVar;
                while (gVar2 != null) {
                    Object key = gVar2.getKey();
                    if (gVar2.getHash() != i || key == null || !this.map.keyEquivalence.e(k, key)) {
                        gVar2 = gVar2.getNext();
                    } else if (gVar2.getValueReference() == qVar) {
                        this.modCount += z;
                        i = this.count - z;
                        atomicReferenceArray.set(length, a(gVar, gVar2, key, i, qVar.get(), qVar, RemovalCause.COLLECTED));
                        this.count = i;
                        return z;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            rz();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    rz();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    rz();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(K k, int i, i<K, V> iVar) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                g gVar = (g) atomicReferenceArray.get(length);
                for (g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.getNext()) {
                    Object key = gVar2.getKey();
                    if (gVar2.getHash() == i && key != null && this.map.keyEquivalence.e(k, key)) {
                        if (gVar2.getValueReference() == iVar) {
                            if (iVar.isActive()) {
                                gVar2.setValueReference(iVar.rm());
                            } else {
                                atomicReferenceArray.set(length, d(gVar, gVar2));
                            }
                            unlock();
                            rz();
                            return true;
                        }
                        unlock();
                        rz();
                        return false;
                    }
                }
                unlock();
                rz();
                return false;
            } catch (Throwable th) {
                unlock();
                rz();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(g<K, V> gVar, int i, RemovalCause removalCause) {
            int i2 = this.count;
            AtomicReferenceArray atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            g<K, V> gVar2 = (g) atomicReferenceArray.get(length);
            for (g<K, V> gVar3 = gVar2; gVar3 != null; gVar3 = gVar3.getNext()) {
                if (gVar3 == gVar) {
                    this.modCount++;
                    i = this.count - 1;
                    atomicReferenceArray.set(length, a(gVar2, gVar3, gVar3.getKey(), i, gVar3.getValueReference().get(), gVar3.getValueReference(), removalCause));
                    this.count = i;
                    return true;
                }
            }
            return false;
        }

        /* Access modifiers changed, original: 0000 */
        public void ry() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                cleanUp();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void B(long j) {
            C(j);
        }

        /* Access modifiers changed, original: 0000 */
        public void rz() {
            rA();
        }

        /* Access modifiers changed, original: 0000 */
        public void cleanUp() {
            C(this.map.ticker.qm());
            rA();
        }

        /* Access modifiers changed, original: 0000 */
        public void C(long j) {
            if (tryLock()) {
                try {
                    rp();
                    A(j);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void rA() {
            if (!isHeldByCurrentThread()) {
                this.map.rc();
            }
        }
    }

    enum Strength {
        STRONG {
            /* Access modifiers changed, original: 0000 */
            public <K, V> q<K, V> referenceValue(Segment<K, V> segment, g<K, V> gVar, V v, int i) {
                return i == 1 ? new n(v) : new y(v, i);
            }

            /* Access modifiers changed, original: 0000 */
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.pT();
            }
        },
        SOFT {
            /* Access modifiers changed, original: 0000 */
            public <K, V> q<K, V> referenceValue(Segment<K, V> segment, g<K, V> gVar, V v, int i) {
                return i == 1 ? new j(segment.valueReferenceQueue, v, gVar) : new x(segment.valueReferenceQueue, v, gVar, i);
            }

            /* Access modifiers changed, original: 0000 */
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.pU();
            }
        },
        WEAK {
            /* Access modifiers changed, original: 0000 */
            public <K, V> q<K, V> referenceValue(Segment<K, V> segment, g<K, V> gVar, V v, int i) {
                return i == 1 ? new v(segment.valueReferenceQueue, v, gVar) : new z(segment.valueReferenceQueue, v, gVar, i);
            }

            /* Access modifiers changed, original: 0000 */
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.pU();
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();

        public abstract <K, V> q<K, V> referenceValue(Segment<K, V> segment, g<K, V> gVar, V v, int i);
    }

    abstract class a<T> extends AbstractSet<T> {
        final ConcurrentMap<?, ?> TA;

        a(ConcurrentMap<?, ?> concurrentMap) {
            this.TA = concurrentMap;
        }

        public int size() {
            return this.TA.size();
        }

        public boolean isEmpty() {
            return this.TA.isEmpty();
        }

        public void clear() {
            this.TA.clear();
        }

        public Object[] toArray() {
            return LocalCache.f(this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return LocalCache.f(this).toArray(eArr);
        }
    }

    static final class aa<K, V> extends AbstractQueue<g<K, V>> {
        final g<K, V> TI = new b<K, V>() {
            g<K, V> Uu = this;
            g<K, V> Uv = this;

            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            public void setWriteTime(long j) {
            }

            public g<K, V> getNextInWriteQueue() {
                return this.Uu;
            }

            public void setNextInWriteQueue(g<K, V> gVar) {
                this.Uu = gVar;
            }

            public g<K, V> getPreviousInWriteQueue() {
                return this.Uv;
            }

            public void setPreviousInWriteQueue(g<K, V> gVar) {
                this.Uv = gVar;
            }
        };

        aa() {
        }

        /* renamed from: d */
        public boolean offer(g<K, V> gVar) {
            LocalCache.b(gVar.getPreviousInWriteQueue(), gVar.getNextInWriteQueue());
            LocalCache.b(this.TI.getPreviousInWriteQueue(), (g) gVar);
            LocalCache.b((g) gVar, this.TI);
            return true;
        }

        /* renamed from: rh */
        public g<K, V> peek() {
            g<K, V> nextInWriteQueue = this.TI.getNextInWriteQueue();
            return nextInWriteQueue == this.TI ? null : nextInWriteQueue;
        }

        /* renamed from: ri */
        public g<K, V> poll() {
            g nextInWriteQueue = this.TI.getNextInWriteQueue();
            if (nextInWriteQueue == this.TI) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        public boolean remove(Object obj) {
            g gVar = (g) obj;
            g previousInWriteQueue = gVar.getPreviousInWriteQueue();
            g nextInWriteQueue = gVar.getNextInWriteQueue();
            LocalCache.b(previousInWriteQueue, nextInWriteQueue);
            LocalCache.c(gVar);
            return nextInWriteQueue != NullEntry.INSTANCE;
        }

        public boolean contains(Object obj) {
            return ((g) obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        public boolean isEmpty() {
            return this.TI.getNextInWriteQueue() == this.TI;
        }

        public int size() {
            int i = 0;
            for (g nextInWriteQueue = this.TI.getNextInWriteQueue(); nextInWriteQueue != this.TI; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }

        public void clear() {
            g nextInWriteQueue = this.TI.getNextInWriteQueue();
            while (true) {
                g gVar = this.TI;
                if (nextInWriteQueue != gVar) {
                    gVar = nextInWriteQueue.getNextInWriteQueue();
                    LocalCache.c(nextInWriteQueue);
                    nextInWriteQueue = gVar;
                } else {
                    gVar.setNextInWriteQueue(gVar);
                    nextInWriteQueue = this.TI;
                    nextInWriteQueue.setPreviousInWriteQueue(nextInWriteQueue);
                    return;
                }
            }
        }

        public Iterator<g<K, V>> iterator() {
            return new com.google.common.collect.e<g<K, V>>(peek()) {
                /* Access modifiers changed, original: protected */
                /* renamed from: e */
                public g<K, V> ax(g<K, V> gVar) {
                    gVar = gVar.getNextInWriteQueue();
                    return gVar == aa.this.TI ? null : gVar;
                }
            };
        }
    }

    final class ab implements Entry<K, V> {
        final K key;
        V value;

        ab(K k, V v) {
            this.key = k;
            this.value = v;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (this.key.equals(entry.getKey()) && this.value.equals(entry.getValue())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        public V setValue(V v) {
            Object put = LocalCache.this.put(this.key, v);
            this.value = v;
            return put;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getKey());
            stringBuilder.append("=");
            stringBuilder.append(getValue());
            return stringBuilder.toString();
        }
    }

    static final class c<K, V> extends AbstractQueue<g<K, V>> {
        final g<K, V> TI = new b<K, V>() {
            g<K, V> TP = this;
            g<K, V> TQ = this;

            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            public void setAccessTime(long j) {
            }

            public g<K, V> getNextInAccessQueue() {
                return this.TP;
            }

            public void setNextInAccessQueue(g<K, V> gVar) {
                this.TP = gVar;
            }

            public g<K, V> getPreviousInAccessQueue() {
                return this.TQ;
            }

            public void setPreviousInAccessQueue(g<K, V> gVar) {
                this.TQ = gVar;
            }
        };

        c() {
        }

        /* renamed from: d */
        public boolean offer(g<K, V> gVar) {
            LocalCache.a(gVar.getPreviousInAccessQueue(), gVar.getNextInAccessQueue());
            LocalCache.a(this.TI.getPreviousInAccessQueue(), (g) gVar);
            LocalCache.a((g) gVar, this.TI);
            return true;
        }

        /* renamed from: rh */
        public g<K, V> peek() {
            g<K, V> nextInAccessQueue = this.TI.getNextInAccessQueue();
            return nextInAccessQueue == this.TI ? null : nextInAccessQueue;
        }

        /* renamed from: ri */
        public g<K, V> poll() {
            g nextInAccessQueue = this.TI.getNextInAccessQueue();
            if (nextInAccessQueue == this.TI) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        public boolean remove(Object obj) {
            g gVar = (g) obj;
            g previousInAccessQueue = gVar.getPreviousInAccessQueue();
            g nextInAccessQueue = gVar.getNextInAccessQueue();
            LocalCache.a(previousInAccessQueue, nextInAccessQueue);
            LocalCache.b(gVar);
            return nextInAccessQueue != NullEntry.INSTANCE;
        }

        public boolean contains(Object obj) {
            return ((g) obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        public boolean isEmpty() {
            return this.TI.getNextInAccessQueue() == this.TI;
        }

        public int size() {
            int i = 0;
            for (g nextInAccessQueue = this.TI.getNextInAccessQueue(); nextInAccessQueue != this.TI; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }

        public void clear() {
            g nextInAccessQueue = this.TI.getNextInAccessQueue();
            while (true) {
                g gVar = this.TI;
                if (nextInAccessQueue != gVar) {
                    gVar = nextInAccessQueue.getNextInAccessQueue();
                    LocalCache.b(nextInAccessQueue);
                    nextInAccessQueue = gVar;
                } else {
                    gVar.setNextInAccessQueue(gVar);
                    nextInAccessQueue = this.TI;
                    nextInAccessQueue.setPreviousInAccessQueue(nextInAccessQueue);
                    return;
                }
            }
        }

        public Iterator<g<K, V>> iterator() {
            return new com.google.common.collect.e<g<K, V>>(peek()) {
                /* Access modifiers changed, original: protected */
                /* renamed from: e */
                public g<K, V> ax(g<K, V> gVar) {
                    gVar = gVar.getNextInAccessQueue();
                    return gVar == c.this.TI ? null : gVar;
                }
            };
        }
    }

    abstract class f<T> implements Iterator<T> {
        int TU;
        int TX = -1;
        Segment<K, V> TY;
        AtomicReferenceArray<g<K, V>> Ua;
        g<K, V> Ub;
        ab Uc;
        ab Ud;

        f() {
            this.TU = LocalCache.this.Tq.length - 1;
            advance();
        }

        /* Access modifiers changed, original: final */
        public final void advance() {
            this.Uc = null;
            if (!rj() && !rk()) {
                while (this.TU >= 0) {
                    Segment[] segmentArr = LocalCache.this.Tq;
                    int i = this.TU;
                    this.TU = i - 1;
                    this.TY = segmentArr[i];
                    if (this.TY.count != 0) {
                        this.Ua = this.TY.table;
                        this.TX = this.Ua.length() - 1;
                        if (rk()) {
                            break;
                        }
                    }
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean rj() {
            g gVar = this.Ub;
            if (gVar != null) {
                while (true) {
                    this.Ub = gVar.getNext();
                    gVar = this.Ub;
                    if (gVar == null) {
                        break;
                    } else if (f(gVar)) {
                        return true;
                    } else {
                        gVar = this.Ub;
                    }
                }
            }
            return false;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean rk() {
            while (true) {
                int i = this.TX;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.Ua;
                this.TX = i - 1;
                g gVar = (g) atomicReferenceArray.get(i);
                this.Ub = gVar;
                if (gVar == null || !(f(this.Ub) || rj())) {
                }
            }
            return true;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean f(g<K, V> gVar) {
            try {
                boolean z;
                long qm = LocalCache.this.ticker.qm();
                Object key = gVar.getKey();
                Object a = LocalCache.this.a((g) gVar, qm);
                if (a != null) {
                    this.Uc = new ab(key, a);
                    z = true;
                } else {
                    z = false;
                }
                this.TY.ry();
                return z;
            } catch (Throwable th) {
                this.TY.ry();
            }
        }

        public boolean hasNext() {
            return this.Uc != null;
        }

        /* Access modifiers changed, original: 0000 */
        public ab rl() {
            ab abVar = this.Uc;
            if (abVar != null) {
                this.Ud = abVar;
                advance();
                return this.Ud;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            com.google.common.base.i.checkState(this.Ud != null);
            LocalCache.this.remove(this.Ud.getKey());
            this.Ud = null;
        }
    }

    interface q<K, V> {
        q<K, V> a(ReferenceQueue<V> referenceQueue, V v, g<K, V> gVar);

        void aw(V v);

        V get();

        int getWeight();

        boolean isActive();

        g<K, V> re();

        boolean rf();

        V rg();
    }

    final class r extends AbstractCollection<V> {
        private final ConcurrentMap<?, ?> TA;

        r(ConcurrentMap<?, ?> concurrentMap) {
            this.TA = concurrentMap;
        }

        public int size() {
            return this.TA.size();
        }

        public boolean isEmpty() {
            return this.TA.isEmpty();
        }

        public void clear() {
            this.TA.clear();
        }

        public Iterator<V> iterator() {
            return new p();
        }

        public boolean contains(Object obj) {
            return this.TA.containsValue(obj);
        }

        public Object[] toArray() {
            return LocalCache.f(this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return LocalCache.f(this).toArray(eArr);
        }
    }

    static class LocalManualCache<K, V> implements b<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final LocalCache<K, V> localCache;

        /* synthetic */ LocalManualCache(LocalCache localCache, AnonymousClass1 anonymousClass1) {
            this(localCache);
        }

        LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new LocalCache(cacheBuilder, null));
        }

        private LocalManualCache(LocalCache<K, V> localCache) {
            this.localCache = localCache;
        }

        public V ar(Object obj) {
            return this.localCache.ar(obj);
        }

        public V a(K k, final Callable<? extends V> callable) {
            com.google.common.base.i.checkNotNull(callable);
            return this.localCache.a((Object) k, new CacheLoader<Object, V>() {
                public V at(Object obj) {
                    return callable.call();
                }
            });
        }

        public void put(K k, V v) {
            this.localCache.put(k, v);
        }

        public void as(Object obj) {
            com.google.common.base.i.checkNotNull(obj);
            this.localCache.remove(obj);
        }

        public void invalidateAll() {
            this.localCache.clear();
        }

        public ConcurrentMap<K, V> qp() {
            return this.localCache;
        }

        /* Access modifiers changed, original: 0000 */
        public Object writeReplace() {
            return new ManualSerializationProxy(this.localCache);
        }
    }

    private enum NullEntry implements g<Object, Object> {
        INSTANCE;

        public long getAccessTime() {
            return 0;
        }

        public int getHash() {
            return 0;
        }

        public Object getKey() {
            return null;
        }

        public g<Object, Object> getNext() {
            return null;
        }

        public g<Object, Object> getNextInAccessQueue() {
            return this;
        }

        public g<Object, Object> getNextInWriteQueue() {
            return this;
        }

        public g<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        public g<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        public q<Object, Object> getValueReference() {
            return null;
        }

        public long getWriteTime() {
            return 0;
        }

        public void setAccessTime(long j) {
        }

        public void setNextInAccessQueue(g<Object, Object> gVar) {
        }

        public void setNextInWriteQueue(g<Object, Object> gVar) {
        }

        public void setPreviousInAccessQueue(g<Object, Object> gVar) {
        }

        public void setPreviousInWriteQueue(g<Object, Object> gVar) {
        }

        public void setValueReference(q<Object, Object> qVar) {
        }

        public void setWriteTime(long j) {
        }
    }

    static abstract class b<K, V> implements g<K, V> {
        b() {
        }

        public q<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(q<K, V> qVar) {
            throw new UnsupportedOperationException();
        }

        public g<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        public int getHash() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            throw new UnsupportedOperationException();
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public g<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(g<K, V> gVar) {
            throw new UnsupportedOperationException();
        }

        public g<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(g<K, V> gVar) {
            throw new UnsupportedOperationException();
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }

        public g<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(g<K, V> gVar) {
            throw new UnsupportedOperationException();
        }

        public g<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(g<K, V> gVar) {
            throw new UnsupportedOperationException();
        }
    }

    final class d extends f<Entry<K, V>> {
        d() {
            super();
        }

        public Entry<K, V> next() {
            return rl();
        }
    }

    final class e extends a<Entry<K, V>> {
        e(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        public Iterator<Entry<K, V>> iterator() {
            return new d();
        }

        public boolean contains(Object obj) {
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null) {
                return false;
            }
            key = LocalCache.this.get(key);
            if (key != null && LocalCache.this.valueEquivalence.e(entry.getValue(), key)) {
                z = true;
            }
            return z;
        }

        public boolean remove(Object obj) {
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key != null && LocalCache.this.remove(key, entry.getValue())) {
                z = true;
            }
            return z;
        }
    }

    final class g extends f<K> {
        g() {
            super();
        }

        public K next() {
            return rl().getKey();
        }
    }

    final class h extends a<K> {
        h(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        public Iterator<K> iterator() {
            return new g();
        }

        public boolean contains(Object obj) {
            return this.TA.containsKey(obj);
        }

        public boolean remove(Object obj) {
            return this.TA.remove(obj) != null;
        }
    }

    static class i<K, V> implements q<K, V> {
        volatile q<K, V> Uf;
        final com.google.common.util.concurrent.aa<V> Ug;
        final com.google.common.base.l Uh;

        public q<K, V> a(ReferenceQueue<V> referenceQueue, V v, g<K, V> gVar) {
            return this;
        }

        public g<K, V> re() {
            return null;
        }

        public boolean rf() {
            return true;
        }

        public i() {
            this(LocalCache.qZ());
        }

        public i(q<K, V> qVar) {
            this.Ug = com.google.common.util.concurrent.aa.vM();
            this.Uh = com.google.common.base.l.qf();
            this.Uf = qVar;
        }

        public boolean isActive() {
            return this.Uf.isActive();
        }

        public int getWeight() {
            return this.Uf.getWeight();
        }

        public boolean set(V v) {
            return this.Ug.set(v);
        }

        public boolean setException(Throwable th) {
            return this.Ug.setException(th);
        }

        private com.google.common.util.concurrent.t<V> i(Throwable th) {
            return com.google.common.util.concurrent.p.m(th);
        }

        public void aw(V v) {
            if (v != null) {
                set(v);
            } else {
                this.Uf = LocalCache.qZ();
            }
        }

        public com.google.common.util.concurrent.t<V> b(K k, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.Uh.qh();
                Object obj = this.Uf.get();
                if (obj == null) {
                    Object at = cacheLoader.at(k);
                    return set(at) ? this.Ug : com.google.common.util.concurrent.p.bo(at);
                }
                com.google.common.util.concurrent.t h = cacheLoader.h(k, obj);
                if (h == null) {
                    return com.google.common.util.concurrent.p.bo(null);
                }
                return com.google.common.util.concurrent.p.b(h, new com.google.common.base.d<V, V>() {
                    public V apply(V v) {
                        i.this.set(v);
                        return v;
                    }
                }, com.google.common.util.concurrent.x.vG());
            } catch (Throwable th) {
                com.google.common.util.concurrent.t<V> i = setException(th) ? this.Ug : i(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return i;
            }
        }

        public long qi() {
            return this.Uh.a(TimeUnit.NANOSECONDS);
        }

        public V rg() {
            return ac.getUninterruptibly(this.Ug);
        }

        public V get() {
            return this.Uf.get();
        }

        public q<K, V> rm() {
            return this.Uf;
        }
    }

    static class j<K, V> extends SoftReference<V> implements q<K, V> {
        final g<K, V> Ur;

        public void aw(V v) {
        }

        public int getWeight() {
            return 1;
        }

        public boolean isActive() {
            return true;
        }

        public boolean rf() {
            return false;
        }

        j(ReferenceQueue<V> referenceQueue, V v, g<K, V> gVar) {
            super(v, referenceQueue);
            this.Ur = gVar;
        }

        public g<K, V> re() {
            return this.Ur;
        }

        public q<K, V> a(ReferenceQueue<V> referenceQueue, V v, g<K, V> gVar) {
            return new j(referenceQueue, v, gVar);
        }

        public V rg() {
            return get();
        }
    }

    static class n<K, V> implements q<K, V> {
        final V Uy;

        public q<K, V> a(ReferenceQueue<V> referenceQueue, V v, g<K, V> gVar) {
            return this;
        }

        public void aw(V v) {
        }

        public int getWeight() {
            return 1;
        }

        public boolean isActive() {
            return true;
        }

        public g<K, V> re() {
            return null;
        }

        public boolean rf() {
            return false;
        }

        n(V v) {
            this.Uy = v;
        }

        public V get() {
            return this.Uy;
        }

        public V rg() {
            return get();
        }
    }

    final class p extends f<V> {
        p() {
            super();
        }

        public V next() {
            return rl().getValue();
        }
    }

    static class u<K, V> extends WeakReference<K> implements g<K, V> {
        final g<K, V> Uw;
        volatile q<K, V> Ux = LocalCache.qZ();
        final int hash;

        u(ReferenceQueue<K> referenceQueue, K k, int i, g<K, V> gVar) {
            super(k, referenceQueue);
            this.hash = i;
            this.Uw = gVar;
        }

        public K getKey() {
            return get();
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public g<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(g<K, V> gVar) {
            throw new UnsupportedOperationException();
        }

        public g<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(g<K, V> gVar) {
            throw new UnsupportedOperationException();
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }

        public g<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(g<K, V> gVar) {
            throw new UnsupportedOperationException();
        }

        public g<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(g<K, V> gVar) {
            throw new UnsupportedOperationException();
        }

        public q<K, V> getValueReference() {
            return this.Ux;
        }

        public void setValueReference(q<K, V> qVar) {
            this.Ux = qVar;
        }

        public int getHash() {
            return this.hash;
        }

        public g<K, V> getNext() {
            return this.Uw;
        }
    }

    static class v<K, V> extends WeakReference<V> implements q<K, V> {
        final g<K, V> Ur;

        public void aw(V v) {
        }

        public int getWeight() {
            return 1;
        }

        public boolean isActive() {
            return true;
        }

        public boolean rf() {
            return false;
        }

        v(ReferenceQueue<V> referenceQueue, V v, g<K, V> gVar) {
            super(v, referenceQueue);
            this.Ur = gVar;
        }

        public g<K, V> re() {
            return this.Ur;
        }

        public q<K, V> a(ReferenceQueue<V> referenceQueue, V v, g<K, V> gVar) {
            return new v(referenceQueue, v, gVar);
        }

        public V rg() {
            return get();
        }
    }

    static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements e<K, V> {
        private static final long serialVersionUID = 1;

        LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super(new LocalCache(cacheBuilder, (CacheLoader) com.google.common.base.i.checkNotNull(cacheLoader)), null);
        }

        public V get(K k) {
            return this.localCache.av(k);
        }

        public V au(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new UncheckedExecutionException(e.getCause());
            }
        }

        public final V apply(K k) {
            return au(k);
        }

        /* Access modifiers changed, original: 0000 */
        public Object writeReplace() {
            return new LoadingSerializationProxy(this.localCache);
        }
    }

    static class ManualSerializationProxy<K, V> extends d<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        transient b<K, V> Ul;
        final int concurrencyLevel;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final CacheLoader<? super K, V> loader;
        final long maxWeight;
        final h<? super K, ? super V> removalListener;
        final com.google.common.base.p ticker;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;
        final i<K, V> weigher;

        ManualSerializationProxy(LocalCache<K, V> localCache) {
            LocalCache<K, V> localCache2 = localCache;
            Strength strength = localCache2.keyStrength;
            Strength strength2 = localCache2.valueStrength;
            Equivalence equivalence = localCache2.keyEquivalence;
            Equivalence equivalence2 = localCache2.valueEquivalence;
            long j = localCache2.expireAfterWriteNanos;
            long j2 = localCache2.expireAfterAccessNanos;
            long j3 = localCache2.maxWeight;
            i iVar = localCache2.weigher;
            int i = localCache2.concurrencyLevel;
            h hVar = localCache2.removalListener;
            com.google.common.base.p pVar = localCache2.ticker;
            CacheLoader cacheLoader = localCache2.Tu;
            this(strength, strength2, equivalence, equivalence2, j, j2, j3, iVar, i, hVar, pVar, cacheLoader);
        }

        private ManualSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j, long j2, long j3, i<K, V> iVar, int i, h<? super K, ? super V> hVar, com.google.common.base.p pVar, CacheLoader<? super K, V> cacheLoader) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.expireAfterWriteNanos = j;
            this.expireAfterAccessNanos = j2;
            this.maxWeight = j3;
            this.weigher = iVar;
            this.concurrencyLevel = i;
            this.removalListener = hVar;
            if (pVar == com.google.common.base.p.qn() || pVar == CacheBuilder.Tb) {
                pVar = null;
            }
            this.ticker = pVar;
            this.loader = cacheLoader;
        }

        /* Access modifiers changed, original: 0000 */
        public CacheBuilder<K, V> rn() {
            CacheBuilder a = CacheBuilder.qq().a(this.keyStrength).b(this.valueStrength).a(this.keyEquivalence).b(this.valueEquivalence).br(this.concurrencyLevel).a(this.removalListener);
            a.Tc = false;
            long j = this.expireAfterWriteNanos;
            if (j > 0) {
                a.a(j, TimeUnit.NANOSECONDS);
            }
            j = this.expireAfterAccessNanos;
            if (j > 0) {
                a.b(j, TimeUnit.NANOSECONDS);
            }
            if (this.weigher != OneWeigher.INSTANCE) {
                a.a(this.weigher);
                j = this.maxWeight;
                if (j != -1) {
                    a.y(j);
                }
            } else {
                j = this.maxWeight;
                if (j != -1) {
                    a.x(j);
                }
            }
            com.google.common.base.p pVar = this.ticker;
            if (pVar != null) {
                a.a(pVar);
            }
            return a;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.Ul = rn().qF();
        }

        private Object readResolve() {
            return this.Ul;
        }

        /* Access modifiers changed, original: protected */
        /* renamed from: qJ */
        public b<K, V> qK() {
            return this.Ul;
        }
    }

    static class m<K, V> extends b<K, V> {
        final g<K, V> Uw;
        volatile q<K, V> Ux = LocalCache.qZ();
        final int hash;
        final K key;

        m(K k, int i, g<K, V> gVar) {
            this.key = k;
            this.hash = i;
            this.Uw = gVar;
        }

        public K getKey() {
            return this.key;
        }

        public q<K, V> getValueReference() {
            return this.Ux;
        }

        public void setValueReference(q<K, V> qVar) {
            this.Ux = qVar;
        }

        public int getHash() {
            return this.hash;
        }

        public g<K, V> getNext() {
            return this.Uw;
        }
    }

    static final class s<K, V> extends u<K, V> {
        g<K, V> TP = LocalCache.ra();
        g<K, V> TQ = LocalCache.ra();
        volatile long Us = Long.MAX_VALUE;

        s(ReferenceQueue<K> referenceQueue, K k, int i, g<K, V> gVar) {
            super(referenceQueue, k, i, gVar);
        }

        public long getAccessTime() {
            return this.Us;
        }

        public void setAccessTime(long j) {
            this.Us = j;
        }

        public g<K, V> getNextInAccessQueue() {
            return this.TP;
        }

        public void setNextInAccessQueue(g<K, V> gVar) {
            this.TP = gVar;
        }

        public g<K, V> getPreviousInAccessQueue() {
            return this.TQ;
        }

        public void setPreviousInAccessQueue(g<K, V> gVar) {
            this.TQ = gVar;
        }
    }

    static final class t<K, V> extends u<K, V> {
        g<K, V> TP = LocalCache.ra();
        g<K, V> TQ = LocalCache.ra();
        volatile long Us = Long.MAX_VALUE;
        volatile long Ut = Long.MAX_VALUE;
        g<K, V> Uu = LocalCache.ra();
        g<K, V> Uv = LocalCache.ra();

        t(ReferenceQueue<K> referenceQueue, K k, int i, g<K, V> gVar) {
            super(referenceQueue, k, i, gVar);
        }

        public long getAccessTime() {
            return this.Us;
        }

        public void setAccessTime(long j) {
            this.Us = j;
        }

        public g<K, V> getNextInAccessQueue() {
            return this.TP;
        }

        public void setNextInAccessQueue(g<K, V> gVar) {
            this.TP = gVar;
        }

        public g<K, V> getPreviousInAccessQueue() {
            return this.TQ;
        }

        public void setPreviousInAccessQueue(g<K, V> gVar) {
            this.TQ = gVar;
        }

        public long getWriteTime() {
            return this.Ut;
        }

        public void setWriteTime(long j) {
            this.Ut = j;
        }

        public g<K, V> getNextInWriteQueue() {
            return this.Uu;
        }

        public void setNextInWriteQueue(g<K, V> gVar) {
            this.Uu = gVar;
        }

        public g<K, V> getPreviousInWriteQueue() {
            return this.Uv;
        }

        public void setPreviousInWriteQueue(g<K, V> gVar) {
            this.Uv = gVar;
        }
    }

    static final class w<K, V> extends u<K, V> {
        volatile long Ut = Long.MAX_VALUE;
        g<K, V> Uu = LocalCache.ra();
        g<K, V> Uv = LocalCache.ra();

        w(ReferenceQueue<K> referenceQueue, K k, int i, g<K, V> gVar) {
            super(referenceQueue, k, i, gVar);
        }

        public long getWriteTime() {
            return this.Ut;
        }

        public void setWriteTime(long j) {
            this.Ut = j;
        }

        public g<K, V> getNextInWriteQueue() {
            return this.Uu;
        }

        public void setNextInWriteQueue(g<K, V> gVar) {
            this.Uu = gVar;
        }

        public g<K, V> getPreviousInWriteQueue() {
            return this.Uv;
        }

        public void setPreviousInWriteQueue(g<K, V> gVar) {
            this.Uv = gVar;
        }
    }

    static final class x<K, V> extends j<K, V> {
        final int weight;

        x(ReferenceQueue<V> referenceQueue, V v, g<K, V> gVar, int i) {
            super(referenceQueue, v, gVar);
            this.weight = i;
        }

        public int getWeight() {
            return this.weight;
        }

        public q<K, V> a(ReferenceQueue<V> referenceQueue, V v, g<K, V> gVar) {
            return new x(referenceQueue, v, gVar, this.weight);
        }
    }

    static final class y<K, V> extends n<K, V> {
        final int weight;

        y(V v, int i) {
            super(v);
            this.weight = i;
        }

        public int getWeight() {
            return this.weight;
        }
    }

    static final class z<K, V> extends v<K, V> {
        final int weight;

        z(ReferenceQueue<V> referenceQueue, V v, g<K, V> gVar, int i) {
            super(referenceQueue, v, gVar);
            this.weight = i;
        }

        public int getWeight() {
            return this.weight;
        }

        public q<K, V> a(ReferenceQueue<V> referenceQueue, V v, g<K, V> gVar) {
            return new z(referenceQueue, v, gVar, this.weight);
        }
    }

    static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements e<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        transient e<K, V> Ue;

        LoadingSerializationProxy(LocalCache<K, V> localCache) {
            super(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.Ue = rn().a(this.loader);
        }

        public V au(K k) {
            return this.Ue.au(k);
        }

        public final V apply(K k) {
            return this.Ue.apply(k);
        }

        private Object readResolve() {
            return this.Ue;
        }
    }

    static final class k<K, V> extends m<K, V> {
        g<K, V> TP = LocalCache.ra();
        g<K, V> TQ = LocalCache.ra();
        volatile long Us = Long.MAX_VALUE;

        k(K k, int i, g<K, V> gVar) {
            super(k, i, gVar);
        }

        public long getAccessTime() {
            return this.Us;
        }

        public void setAccessTime(long j) {
            this.Us = j;
        }

        public g<K, V> getNextInAccessQueue() {
            return this.TP;
        }

        public void setNextInAccessQueue(g<K, V> gVar) {
            this.TP = gVar;
        }

        public g<K, V> getPreviousInAccessQueue() {
            return this.TQ;
        }

        public void setPreviousInAccessQueue(g<K, V> gVar) {
            this.TQ = gVar;
        }
    }

    static final class l<K, V> extends m<K, V> {
        g<K, V> TP = LocalCache.ra();
        g<K, V> TQ = LocalCache.ra();
        volatile long Us = Long.MAX_VALUE;
        volatile long Ut = Long.MAX_VALUE;
        g<K, V> Uu = LocalCache.ra();
        g<K, V> Uv = LocalCache.ra();

        l(K k, int i, g<K, V> gVar) {
            super(k, i, gVar);
        }

        public long getAccessTime() {
            return this.Us;
        }

        public void setAccessTime(long j) {
            this.Us = j;
        }

        public g<K, V> getNextInAccessQueue() {
            return this.TP;
        }

        public void setNextInAccessQueue(g<K, V> gVar) {
            this.TP = gVar;
        }

        public g<K, V> getPreviousInAccessQueue() {
            return this.TQ;
        }

        public void setPreviousInAccessQueue(g<K, V> gVar) {
            this.TQ = gVar;
        }

        public long getWriteTime() {
            return this.Ut;
        }

        public void setWriteTime(long j) {
            this.Ut = j;
        }

        public g<K, V> getNextInWriteQueue() {
            return this.Uu;
        }

        public void setNextInWriteQueue(g<K, V> gVar) {
            this.Uu = gVar;
        }

        public g<K, V> getPreviousInWriteQueue() {
            return this.Uv;
        }

        public void setPreviousInWriteQueue(g<K, V> gVar) {
            this.Uv = gVar;
        }
    }

    static final class o<K, V> extends m<K, V> {
        volatile long Ut = Long.MAX_VALUE;
        g<K, V> Uu = LocalCache.ra();
        g<K, V> Uv = LocalCache.ra();

        o(K k, int i, g<K, V> gVar) {
            super(k, i, gVar);
        }

        public long getWriteTime() {
            return this.Ut;
        }

        public void setWriteTime(long j) {
            this.Ut = j;
        }

        public g<K, V> getNextInWriteQueue() {
            return this.Uu;
        }

        public void setNextInWriteQueue(g<K, V> gVar) {
            this.Uu = gVar;
        }

        public g<K, V> getPreviousInWriteQueue() {
            return this.Uv;
        }

        public void setPreviousInWriteQueue(g<K, V> gVar) {
            this.Uv = gVar;
        }
    }

    static int bs(int i) {
        i += (i << 15) ^ -12931;
        i ^= i >>> 10;
        i += i << 3;
        i ^= i >>> 6;
        i += (i << 2) + (i << 14);
        return i ^ (i >>> 16);
    }

    LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
        this.concurrencyLevel = Math.min(cacheBuilder.qu(), 65536);
        this.keyStrength = cacheBuilder.qy();
        this.valueStrength = cacheBuilder.qz();
        this.keyEquivalence = cacheBuilder.qr();
        this.valueEquivalence = cacheBuilder.qs();
        this.maxWeight = cacheBuilder.qv();
        this.weigher = cacheBuilder.qw();
        this.expireAfterAccessNanos = cacheBuilder.qB();
        this.expireAfterWriteNanos = cacheBuilder.qA();
        this.Tg = cacheBuilder.qC();
        this.removalListener = cacheBuilder.qD();
        this.Tr = this.removalListener == NullListener.INSTANCE ? rb() : new ConcurrentLinkedQueue();
        this.ticker = cacheBuilder.ah(qU());
        this.Ts = EntryFactory.getFactory(this.keyStrength, qW(), qV());
        this.Tt = (com.google.common.cache.a.b) cacheBuilder.qE().get();
        this.Tu = cacheLoader;
        int min = Math.min(cacheBuilder.qt(), 1073741824);
        if (qL() && !qM()) {
            min = (int) Math.min((long) min, this.maxWeight);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.concurrencyLevel && (!qL() || ((long) (i3 * 20)) <= this.maxWeight)) {
            i4++;
            i3 <<= 1;
        }
        this.Tp = 32 - i4;
        this.To = i3 - 1;
        this.Tq = bu(i3);
        i4 = min / i3;
        if (i4 * i3 < min) {
            i4++;
        }
        while (i2 < i4) {
            i2 <<= 1;
        }
        if (qL()) {
            long j = this.maxWeight;
            long j2 = (long) i3;
            long j3 = (j / j2) + 1;
            j %= j2;
            while (i < this.Tq.length) {
                if (((long) i) == j) {
                    j3--;
                }
                this.Tq[i] = a(i2, j3, (com.google.common.cache.a.b) cacheBuilder.qE().get());
                i++;
            }
            return;
        }
        while (true) {
            Segment[] segmentArr = this.Tq;
            if (i < segmentArr.length) {
                segmentArr[i] = a(i2, -1, (com.google.common.cache.a.b) cacheBuilder.qE().get());
                i++;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qL() {
        return this.maxWeight >= 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qM() {
        return this.weigher != OneWeigher.INSTANCE;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qN() {
        return this.expireAfterWriteNanos > 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qO() {
        return this.expireAfterAccessNanos > 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qP() {
        return this.Tg > 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qQ() {
        return qO() || qL();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qR() {
        return qN();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qS() {
        return qN() || qP();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qT() {
        return qO();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qU() {
        return qS() || qT();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qV() {
        return qR() || qS();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qW() {
        return qQ() || qT();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qX() {
        return this.keyStrength != Strength.STRONG;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean qY() {
        return this.valueStrength != Strength.STRONG;
    }

    static <K, V> q<K, V> qZ() {
        return Tv;
    }

    static <K, V> g<K, V> ra() {
        return NullEntry.INSTANCE;
    }

    static <E> Queue<E> rb() {
        return Tw;
    }

    /* Access modifiers changed, original: 0000 */
    public int af(Object obj) {
        return bs(this.keyEquivalence.af(obj));
    }

    /* Access modifiers changed, original: 0000 */
    public void a(q<K, V> qVar) {
        g re = qVar.re();
        int hash = re.getHash();
        bt(hash).a(re.getKey(), hash, (q) qVar);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(g<K, V> gVar) {
        int hash = gVar.getHash();
        bt(hash).a((g) gVar, hash);
    }

    /* Access modifiers changed, original: 0000 */
    public Segment<K, V> bt(int i) {
        return this.Tq[(i >>> this.Tp) & this.To];
    }

    /* Access modifiers changed, original: 0000 */
    public Segment<K, V> a(int i, long j, com.google.common.cache.a.b bVar) {
        return new Segment(this, i, j, bVar);
    }

    /* Access modifiers changed, original: 0000 */
    public V a(g<K, V> gVar, long j) {
        if (gVar.getKey() == null) {
            return null;
        }
        Object obj = gVar.getValueReference().get();
        if (obj == null || b((g) gVar, j)) {
            return null;
        }
        return obj;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean b(g<K, V> gVar, long j) {
        com.google.common.base.i.checkNotNull(gVar);
        if (qO() && j - gVar.getAccessTime() >= this.expireAfterAccessNanos) {
            return true;
        }
        if (!qN() || j - gVar.getWriteTime() < this.expireAfterWriteNanos) {
            return false;
        }
        return true;
    }

    static <K, V> void a(g<K, V> gVar, g<K, V> gVar2) {
        gVar.setNextInAccessQueue(gVar2);
        gVar2.setPreviousInAccessQueue(gVar);
    }

    static <K, V> void b(g<K, V> gVar) {
        g ra = ra();
        gVar.setNextInAccessQueue(ra);
        gVar.setPreviousInAccessQueue(ra);
    }

    static <K, V> void b(g<K, V> gVar, g<K, V> gVar2) {
        gVar.setNextInWriteQueue(gVar2);
        gVar2.setPreviousInWriteQueue(gVar);
    }

    static <K, V> void c(g<K, V> gVar) {
        g ra = ra();
        gVar.setNextInWriteQueue(ra);
        gVar.setPreviousInWriteQueue(ra);
    }

    /* Access modifiers changed, original: 0000 */
    public void rc() {
        while (true) {
            RemovalNotification removalNotification = (RemovalNotification) this.Tr.poll();
            if (removalNotification != null) {
                try {
                    this.removalListener.onRemoval(removalNotification);
                } catch (Throwable th) {
                    logger.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final Segment<K, V>[] bu(int i) {
        return new Segment[i];
    }

    public boolean isEmpty() {
        int i;
        Segment[] segmentArr = this.Tq;
        long j = 0;
        for (i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += (long) segmentArr[i].modCount;
        }
        if (j != 0) {
            for (i = 0; i < segmentArr.length; i++) {
                if (segmentArr[i].count != 0) {
                    return false;
                }
                j -= (long) segmentArr[i].modCount;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public long rd() {
        long j = 0;
        for (Segment segment : this.Tq) {
            j += (long) Math.max(0, segment.count);
        }
        return j;
    }

    public int size() {
        return com.google.common.primitives.c.G(rd());
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int af = af(obj);
        return bt(af).get(obj, af);
    }

    /* Access modifiers changed, original: 0000 */
    public V a(K k, CacheLoader<? super K, V> cacheLoader) {
        int af = af(com.google.common.base.i.checkNotNull(k));
        return bt(af).a((Object) k, af, (CacheLoader) cacheLoader);
    }

    public V ar(Object obj) {
        int af = af(com.google.common.base.i.checkNotNull(obj));
        obj = bt(af).get(obj, af);
        if (obj == null) {
            this.Tt.bq(1);
        } else {
            this.Tt.bp(1);
        }
        return obj;
    }

    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* Access modifiers changed, original: 0000 */
    public V av(K k) {
        return a((Object) k, this.Tu);
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int af = af(obj);
        return bt(af).c(obj, af);
    }

    public boolean containsValue(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        long qm = this.ticker.qm();
        Segment[] segmentArr = this.Tq;
        long j = -1;
        int i = 0;
        while (i < 3) {
            Segment[] segmentArr2;
            long j2;
            int length = segmentArr.length;
            long j3 = 0;
            int i2 = 0;
            while (i2 < length) {
                Segment segment = segmentArr[i2];
                int i3 = segment.count;
                AtomicReferenceArray atomicReferenceArray = segment.table;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    g gVar = (g) atomicReferenceArray.get(i4);
                    while (gVar != null) {
                        segmentArr2 = segmentArr;
                        Object a = segment.a(gVar, qm);
                        if (a != null) {
                            j2 = qm;
                            if (this.valueEquivalence.e(obj2, a)) {
                                return true;
                            }
                        } else {
                            j2 = qm;
                        }
                        gVar = gVar.getNext();
                        segmentArr = segmentArr2;
                        qm = j2;
                    }
                    j2 = qm;
                    segmentArr2 = segmentArr;
                }
                segmentArr2 = segmentArr;
                j3 += (long) segment.modCount;
                i2++;
                qm = qm;
            }
            j2 = qm;
            segmentArr2 = segmentArr;
            if (j3 == j) {
                break;
            }
            i++;
            j = j3;
            segmentArr = segmentArr2;
            qm = j2;
        }
        return false;
    }

    public V put(K k, V v) {
        com.google.common.base.i.checkNotNull(k);
        com.google.common.base.i.checkNotNull(v);
        int af = af(k);
        return bt(af).a((Object) k, af, (Object) v, false);
    }

    public V putIfAbsent(K k, V v) {
        com.google.common.base.i.checkNotNull(k);
        com.google.common.base.i.checkNotNull(v);
        int af = af(k);
        return bt(af).a((Object) k, af, (Object) v, true);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int af = af(obj);
        return bt(af).d(obj, af);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int af = af(obj);
        return bt(af).b(obj, af, obj2);
    }

    public boolean replace(K k, V v, V v2) {
        com.google.common.base.i.checkNotNull(k);
        com.google.common.base.i.checkNotNull(v2);
        if (v == null) {
            return false;
        }
        int af = af(k);
        return bt(af).a((Object) k, af, (Object) v, (Object) v2);
    }

    public V replace(K k, V v) {
        com.google.common.base.i.checkNotNull(k);
        com.google.common.base.i.checkNotNull(v);
        int af = af(k);
        return bt(af).a((Object) k, af, (Object) v);
    }

    public void clear() {
        for (Segment clear : this.Tq) {
            clear.clear();
        }
    }

    public Set<K> keySet() {
        Set<K> set = this.Tx;
        if (set != null) {
            return set;
        }
        h hVar = new h(this);
        this.Tx = hVar;
        return hVar;
    }

    public Collection<V> values() {
        Collection<V> collection = this.Ty;
        if (collection != null) {
            return collection;
        }
        r rVar = new r(this);
        this.Ty = rVar;
        return rVar;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.Tz;
        if (set != null) {
            return set;
        }
        e eVar = new e(this);
        this.Tz = eVar;
        return eVar;
    }

    private static <E> ArrayList<E> f(Collection<E> collection) {
        Collection arrayList = new ArrayList(collection.size());
        com.google.common.collect.t.a(arrayList, collection.iterator());
        return arrayList;
    }
}

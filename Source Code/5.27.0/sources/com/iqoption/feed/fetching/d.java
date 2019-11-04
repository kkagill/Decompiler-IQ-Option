package com.iqoption.feed.fetching;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker */
final class d {
    private final Map<String, a> cRW = new HashMap();
    private final b cRX = new b();

    /* compiled from: DiskCacheWriteLocker */
    private static class a {
        final Lock cRY;
        int cRZ;

        private a() {
            this.cRY = new ReentrantLock();
        }
    }

    /* compiled from: DiskCacheWriteLocker */
    private static class b {
        private final Queue<a> cSa;

        private b() {
            this.cSa = new ArrayDeque();
        }

        /* Access modifiers changed, original: 0000 */
        public a awu() {
            a aVar;
            synchronized (this.cSa) {
                aVar = (a) this.cSa.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(a aVar) {
            synchronized (this.cSa) {
                if (this.cSa.size() < 10) {
                    this.cSa.offer(aVar);
                }
            }
        }
    }

    d() {
    }

    /* Access modifiers changed, original: 0000 */
    public void id(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) this.cRW.get(str);
            if (aVar == null) {
                aVar = this.cRX.awu();
                this.cRW.put(str, aVar);
            }
            aVar.cRZ++;
        }
        aVar.cRY.lock();
    }

    /* Access modifiers changed, original: 0000 */
    public void ie(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) this.cRW.get(str);
            if (aVar != null) {
                if (aVar.cRZ > 0) {
                    int i = aVar.cRZ - 1;
                    aVar.cRZ = i;
                    if (i == 0) {
                        a aVar2 = (a) this.cRW.remove(str);
                        if (aVar2.equals(aVar)) {
                            this.cRX.a(aVar2);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Removed the wrong lock, expected to remove: ");
                            stringBuilder.append(aVar);
                            stringBuilder.append(", but actually removed: ");
                            stringBuilder.append(aVar2);
                            stringBuilder.append(", key: ");
                            stringBuilder.append(str);
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Cannot release a lock that is not held, key: ");
            stringBuilder2.append(str);
            stringBuilder2.append(", interestedThreads: ");
            stringBuilder2.append(aVar == null ? 0 : aVar.cRZ);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        aVar.cRY.unlock();
    }
}

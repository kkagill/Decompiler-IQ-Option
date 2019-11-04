package io.reactivex.internal.util;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.b.g;
import org.a.c;

/* compiled from: QueueDrainHelper */
public final class h {
    public static <T, U> void a(g<T> gVar, c<? super U> cVar, boolean z, b bVar, g<T, U> gVar2) {
        int i = 1;
        while (true) {
            boolean bmv = gVar2.bmv();
            Object poll = gVar.poll();
            boolean z2 = poll == null;
            if (a(bmv, z2, cVar, z, gVar, gVar2)) {
                if (bVar != null) {
                    bVar.dispose();
                }
                return;
            } else if (z2) {
                i = gVar2.jD(-i);
                if (i == 0) {
                    return;
                }
            } else {
                long bmz = gVar2.bmz();
                if (bmz == 0) {
                    gVar.clear();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    cVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                } else if (gVar2.a(cVar, poll) && bmz != Long.MAX_VALUE) {
                    gVar2.cU(1);
                }
            }
        }
    }

    public static <T, U> boolean a(boolean z, boolean z2, c<?> cVar, boolean z3, io.reactivex.internal.b.h<?> hVar, g<T, U> gVar) {
        if (gVar.bmu()) {
            hVar.clear();
            return true;
        }
        if (z) {
            Throwable bmy;
            if (!z3) {
                bmy = gVar.bmy();
                if (bmy != null) {
                    hVar.clear();
                    cVar.onError(bmy);
                    return true;
                } else if (z2) {
                    cVar.onComplete();
                    return true;
                }
            } else if (z2) {
                bmy = gVar.bmy();
                if (bmy != null) {
                    cVar.onError(bmy);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}

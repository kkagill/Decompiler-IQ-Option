package com.iqoption.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Predicates;
import com.google.common.base.j;
import com.google.common.base.n;
import com.google.common.util.concurrent.aa;
import com.google.common.util.concurrent.h;
import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.google.common.util.concurrent.x;
import com.iqoption.app.IQApp;
import com.iqoption.core.b.f;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: FutureUtils */
public final class v {

    /* compiled from: FutureUtils */
    public interface a {
        void call(@NonNull Throwable th);
    }

    /* compiled from: FutureUtils */
    public interface b<T> {
        void call(@NonNull T t, @NonNull Throwable th);
    }

    /* compiled from: FutureUtils */
    public interface d<T> {
        void call(@NonNull T t);
    }

    /* compiled from: FutureUtils */
    public interface e<T, V> {
        void call(@NonNull T t, @NonNull V v);
    }

    /* compiled from: FutureUtils */
    public static class c<V> implements o<V> {
        private static final String TAG = "com.iqoption.util.v$c";
        public static final long ebm = TimeUnit.MINUTES.toMillis(10);
        private String bEW;
        private long bgC;
        private long bgE;
        private long ebn;
        private int ebo;
        private long ebp;
        private final n<t<V>> ebq;
        private final j<V> ebr;
        private final ScheduledExecutorService ebs;
        private final o<V> ebt;

        /* synthetic */ c(n nVar, j jVar, ScheduledExecutorService scheduledExecutorService, o oVar, AnonymousClass1 anonymousClass1) {
            this(nVar, jVar, scheduledExecutorService, oVar);
        }

        private c(n<t<V>> nVar, j<V> jVar, ScheduledExecutorService scheduledExecutorService, o<V> oVar) {
            this.bgE = (long) (new Random().nextInt(150) + 50);
            this.ebo = 10;
            this.ebp = ebm;
            this.ebq = nVar;
            this.ebr = jVar;
            this.ebs = scheduledExecutorService;
            this.ebt = oVar;
        }

        public void onSuccess(@Nullable V v) {
            try {
                if (this.ebr.apply(v) || !retry()) {
                    this.ebt.onSuccess(v);
                }
            } catch (CancellationException e) {
                this.ebt.l(e);
            }
        }

        public void l(Throwable th) {
            if (!retry()) {
                this.ebt.l(th);
            }
        }

        public c<V> hw(int i) {
            this.ebo = i;
            return this;
        }

        public void hx(int i) {
            this.bgE = (long) i;
        }

        public void cq(long j) {
            this.ebp = j;
        }

        public void jO(String str) {
            this.bEW = str;
        }

        private boolean retry() {
            long j = this.bgC;
            if (j == ((long) this.ebo)) {
                return false;
            }
            Object valueOf;
            this.bgC = j + 1;
            j = this.ebn;
            long j2 = this.bgE;
            j += j2;
            this.ebn = j2;
            this.bgE = Math.min(j, this.ebp);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TIMEOUT ");
            if (this.bEW == null) {
                valueOf = Character.valueOf(' ');
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(' ');
                stringBuilder2.append(this.bEW);
                valueOf = stringBuilder2.toString();
            }
            stringBuilder.append(valueOf);
            stringBuilder.append(" retry ");
            stringBuilder.append(this.bgC);
            stringBuilder.append('/');
            stringBuilder.append(this.ebo);
            stringBuilder.append(" with delay:");
            stringBuilder.append(this.bgE);
            stringBuilder.toString();
            String str = this.bEW;
            if (!(str == null || str.contains("api/appsflyer/link"))) {
                IQApp.Ex().bt(new f(this.bgC, (long) this.ebo, this.bgE, this.bEW));
            }
            j = this.bgE;
            if (j > 0) {
                this.ebs.schedule(new -$$Lambda$v$c$SROJ2XbB58U6lRFG7QwPfKo0XGg(this, this), j, TimeUnit.MILLISECONDS);
            }
            return true;
        }

        private /* synthetic */ void a(c cVar) {
            v.b((t) this.ebq.get(), cVar);
        }
    }

    public static <V> void a(t<V> tVar, o<? super V> oVar) {
        p.a(tVar, oVar, com.iqoption.core.c.a.biN);
    }

    public static <V> void b(t<V> tVar, o<? super V> oVar) {
        p.a(tVar, oVar, x.vG());
    }

    public static <V> void a(t<V> tVar, d<V> dVar, a aVar) {
        a(tVar, dVar, aVar, com.iqoption.core.c.a.biN);
    }

    public static <V> void b(t<V> tVar, d<V> dVar, a aVar) {
        a(tVar, dVar, aVar, x.vG());
    }

    public static <V> void a(t<V> tVar, d<V> dVar, a aVar, Executor executor) {
        a((t) tVar, (d) dVar, aVar, null, executor);
    }

    public static <V> void a(t<V> tVar, final d<V> dVar, final a aVar, final Runnable runnable, Executor executor) {
        p.a(tVar, new o<V>() {
            public void onSuccess(@Nullable V v) {
                if (v != null) {
                    d dVar = dVar;
                    if (dVar != null) {
                        dVar.call(v);
                    }
                } else {
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.call(new RuntimeException("result is null"));
                    }
                }
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }

            public void l(@NonNull Throwable th) {
                a aVar = aVar;
                if (aVar != null) {
                    aVar.call(th);
                }
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, executor);
    }

    public static <T, V> void a(t<V> tVar, T t, final e<T, V> eVar, final b<T> bVar, Executor executor) {
        p.a(tVar, new com.iqoption.system.c.b<T, V>(t) {
            public void v(@NonNull T t, V v) {
                super.v(t, v);
                e eVar = eVar;
                if (eVar != null) {
                    eVar.call(t, v);
                }
            }

            public void c(@NonNull T t, Throwable th) {
                super.c(t, th);
                b bVar = bVar;
                if (bVar != null) {
                    bVar.call(t, th);
                }
            }
        }, executor);
    }

    public static <V> void a(t<V> tVar, d<V> dVar) {
        a(tVar, dVar, null, x.vG());
    }

    public static <I, O> t<O> a(t<I> tVar, h<? super I, ? extends O> hVar) {
        return p.b((t) tVar, (h) hVar, x.vG());
    }

    public static <I, O> t<O> a(t<I> tVar, com.google.common.base.d<? super I, ? extends O> dVar) {
        return p.b((t) tVar, (com.google.common.base.d) dVar, x.vG());
    }

    public static <V> void a(t<V> tVar, String str, String str2) {
        p.a(tVar, new o<V>() {
            public void l(Throwable th) {
            }

            public void onSuccess(@Nullable V v) {
            }
        }, x.vG());
    }

    public static <V> boolean f(t<V> tVar) {
        return (tVar == null || tVar.isCancelled() || tVar.isDone()) ? false : true;
    }

    public static <T> t<T> a(T t, long j, TimeUnit timeUnit) {
        return com.iqoption.core.c.a.biM.a(i.bn(t), j, timeUnit);
    }

    public static <V> t<V> a(n<t<V>> nVar, @Nullable String str) {
        return a(nVar, Predicates.pZ(), com.iqoption.core.c.a.biM, 10, -1, str);
    }

    public static <V> t<V> a(n<t<V>> nVar, j<V> jVar, ScheduledExecutorService scheduledExecutorService, int i, int i2, @Nullable String str) {
        return a(nVar, jVar, scheduledExecutorService, i, i2, c.ebm, str);
    }

    public static <V> t<V> a(n<t<V>> nVar, j<V> jVar, ScheduledExecutorService scheduledExecutorService, int i, int i2, long j, @Nullable String str) {
        int i3 = i2;
        final aa vM = aa.vM();
        t tVar = (t) nVar.get();
        c cVar = new c(nVar, jVar, scheduledExecutorService, new o<V>() {
            public void onSuccess(@Nullable V v) {
                vM.set(v);
            }

            public void l(@NonNull Throwable th) {
                vM.setException(th);
            }
        }, null);
        int i4 = i;
        cVar = cVar.hw(i);
        if (i3 != -1) {
            cVar.hx(i2);
        }
        cVar.cq(j);
        cVar.jO(str);
        b(tVar, cVar);
        return vM;
    }
}

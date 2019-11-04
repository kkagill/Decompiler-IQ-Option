package com.iqoption.core.rx.backoff;

import io.reactivex.b.g;
import io.reactivex.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.i;
import kotlin.jvm.a.m;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u001a\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0001:\u0001\u001aBE\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011BW\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00042\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/core/rx/backoff/Backoff;", "Lio/reactivex/functions/Function;", "Lio/reactivex/Flowable;", "", "Lorg/reactivestreams/Publisher;", "retries", "", "strategy", "Lcom/iqoption/core/rx/backoff/BackoffStrategy;", "maxDelay", "", "units", "Ljava/util/concurrent/TimeUnit;", "connectionTrigger", "Lcom/iqoption/core/rx/backoff/ConnectionTrigger;", "tag", "", "(ILcom/iqoption/core/rx/backoff/BackoffStrategy;JLjava/util/concurrent/TimeUnit;Lcom/iqoption/core/rx/backoff/ConnectionTrigger;Ljava/lang/String;)V", "stopPredicate", "Lkotlin/Function2;", "", "(Lcom/iqoption/core/rx/backoff/BackoffStrategy;JLjava/util/concurrent/TimeUnit;Lcom/iqoption/core/rx/backoff/ConnectionTrigger;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "attempt", "Ljava/util/concurrent/atomic/AtomicInteger;", "apply", "flowable", "Companion", "core_release"})
/* compiled from: Backoff.kt */
public final class a implements g<e<? extends Throwable>, org.a.b<?>> {
    private static final String TAG = a.class.getSimpleName();
    private static final m<Throwable, Integer, Boolean> bFv = Backoff$Companion$DEFAULT_PREDICATE$1.bFx;
    @Deprecated
    public static final a bFw = new a();
    private final AtomicInteger bFp;
    private final b bFq;
    private final long bFr;
    private final TimeUnit bFs;
    private final c bFt;
    private final m<Throwable, Integer, Boolean> bFu;
    private final String tag;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/core/rx/backoff/Backoff$Companion;", "", "()V", "DEFAULT_PREDICATE", "Lkotlin/Function2;", "", "", "", "getDEFAULT_PREDICATE", "()Lkotlin/jvm/functions/Function2;", "TAG", "", "kotlin.jvm.PlatformType", "core_release"})
    /* compiled from: Backoff.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lorg/reactivestreams/Publisher;", "", "kotlin.jvm.PlatformType", "error", "", "apply"})
    /* compiled from: Backoff.kt */
    static final class b<T, R> implements g<T, org.a.b<? extends R>> {
        final /* synthetic */ a bFy;

        b(a aVar) {
            this.bFy = aVar;
        }

        /* renamed from: v */
        public final org.a.b<? extends Object> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "error");
            int incrementAndGet = this.bFy.bFp.incrementAndGet();
            if (((Boolean) this.bFy.bFu.w(th, Integer.valueOf(incrementAndGet))).booleanValue()) {
                return e.aa(th);
            }
            e g;
            c c = this.bFy.bFt;
            if (c == null || c.isConnected()) {
                g = e.g(Math.min(this.bFy.bFq.fc(incrementAndGet), this.bFy.bFr), this.bFy.bFs);
            } else {
                g = this.bFy.bFt.akn().bkO();
            }
            return g;
        }
    }

    public a() {
        this(null, 0, null, null, null, null, 63, null);
    }

    public a(int i) {
        this(i, null, 0, null, null, null, 62, null);
    }

    public a(b bVar, long j, TimeUnit timeUnit, c cVar, String str, m<? super Throwable, ? super Integer, Boolean> mVar) {
        kotlin.jvm.internal.i.f(bVar, "strategy");
        kotlin.jvm.internal.i.f(timeUnit, "units");
        kotlin.jvm.internal.i.f(mVar, "stopPredicate");
        this.bFq = bVar;
        this.bFr = j;
        this.bFs = timeUnit;
        this.bFt = cVar;
        this.tag = str;
        this.bFu = mVar;
        this.bFp = new AtomicInteger();
    }

    public a(int i, b bVar, long j, TimeUnit timeUnit, c cVar, String str) {
        b bVar2 = bVar;
        kotlin.jvm.internal.i.f(bVar, "strategy");
        TimeUnit timeUnit2 = timeUnit;
        kotlin.jvm.internal.i.f(timeUnit, "units");
        int i2 = i;
        this(bVar2, j, timeUnit2, cVar, str, (m) new Backoff$1(i));
    }

    /* renamed from: e */
    public org.a.b<?> apply(e<? extends Throwable> eVar) {
        kotlin.jvm.internal.i.f(eVar, "flowable");
        e d = eVar.d((g) new b(this));
        kotlin.jvm.internal.i.e(d, "flowable.flatMap<Any> { …)\n            }\n        }");
        return d;
    }
}

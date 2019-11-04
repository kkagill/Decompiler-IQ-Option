package com.iqoption.core.rx;

import io.reactivex.b.g;
import io.reactivex.b.l;
import io.reactivex.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00102\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0001:\u0001\u0010B9\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u001a\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/rx/RetryCountFunction;", "Lio/reactivex/functions/Function;", "Lio/reactivex/Flowable;", "", "Lorg/reactivestreams/Publisher;", "count", "", "onRetry", "Lio/reactivex/functions/Action;", "failPredicate", "Lio/reactivex/functions/Predicate;", "logTag", "", "(ILio/reactivex/functions/Action;Lio/reactivex/functions/Predicate;Ljava/lang/String;)V", "apply", "errors", "Companion", "core_release"})
/* compiled from: RetryCountFunction.kt */
public final class f implements g<e<Throwable>, org.a.b<?>> {
    private static final String TAG = f.class.getSimpleName();
    public static final a bEX = new a();
    private final io.reactivex.b.a bEU;
    private final l<Throwable> bEV;
    private final String bEW;
    private final int count;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/rx/RetryCountFunction$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "TAG$annotations", "core_release"})
    /* compiled from: RetryCountFunction.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "", "apply"})
    /* compiled from: RetryCountFunction.kt */
    static final class b<T, R> implements g<T, org.a.b<? extends R>> {
        final /* synthetic */ f bEY;
        final /* synthetic */ AtomicInteger bEZ;

        b(f fVar, AtomicInteger atomicInteger) {
            this.bEY = fVar;
            this.bEZ = atomicInteger;
        }

        /* renamed from: u */
        public final e<Long> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            l a = this.bEY.bEV;
            if (a != null && a.test(th)) {
                return e.aa(th);
            }
            if (this.bEZ.getAndIncrement() == this.bEY.count) {
                return e.aa(th);
            }
            long j = (long) this.bEZ.get();
            if (this.bEY.bEU != null) {
                return e.g(j, TimeUnit.SECONDS).f(this.bEY.bEU);
            }
            return e.g(j, TimeUnit.SECONDS);
        }
    }

    public f() {
        this(0, null, null, null, 15, null);
    }

    public f(int i, io.reactivex.b.a aVar, l<Throwable> lVar, String str) {
        this.count = i;
        this.bEU = aVar;
        this.bEV = lVar;
        this.bEW = str;
    }

    public /* synthetic */ f(int i, io.reactivex.b.a aVar, l lVar, String str, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            aVar = (io.reactivex.b.a) null;
        }
        if ((i2 & 4) != 0) {
            lVar = (l) null;
        }
        if ((i2 & 8) != 0) {
            str = (String) null;
        }
        this(i, aVar, lVar, str);
    }

    /* renamed from: e */
    public org.a.b<?> apply(e<Throwable> eVar) {
        kotlin.jvm.internal.i.f(eVar, "errors");
        e d = eVar.d((g) new b(this, new AtomicInteger()));
        kotlin.jvm.internal.i.e(d, "errors.flatMap {\n       …)\n            }\n        }");
        return d;
    }
}

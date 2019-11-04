package com.iqoption.core.rx;

import io.reactivex.b.g;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00102\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/rx/RepeatTimerFunction;", "Lio/reactivex/functions/Function;", "Lio/reactivex/Flowable;", "", "Lorg/reactivestreams/Publisher;", "delay", "", "unit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)V", "getDelay", "()J", "getUnit", "()Ljava/util/concurrent/TimeUnit;", "apply", "errors", "Companion", "core_release"})
/* compiled from: RepeatTimerFunction.kt */
public final class e implements g<io.reactivex.e<Object>, org.a.b<?>> {
    private static final String TAG = e.class.getSimpleName();
    public static final a bES = new a();
    private final long delay;
    private final TimeUnit unit;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/rx/RepeatTimerFunction$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "TAG$annotations", "core_release"})
    /* compiled from: RepeatTimerFunction.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "", "apply"})
    /* compiled from: RepeatTimerFunction.kt */
    static final class b<T, R> implements g<T, org.a.b<? extends R>> {
        final /* synthetic */ e bET;

        b(e eVar) {
            this.bET = eVar;
        }

        /* renamed from: bN */
        public final io.reactivex.e<Long> apply(Object obj) {
            kotlin.jvm.internal.i.f(obj, "it");
            return io.reactivex.e.g(this.bET.mv(), this.bET.ake());
        }
    }

    public e(long j, TimeUnit timeUnit) {
        kotlin.jvm.internal.i.f(timeUnit, "unit");
        this.delay = j;
        this.unit = timeUnit;
    }

    public final TimeUnit ake() {
        return this.unit;
    }

    public final long mv() {
        return this.delay;
    }

    /* renamed from: e */
    public org.a.b<?> apply(io.reactivex.e<Object> eVar) {
        kotlin.jvm.internal.i.f(eVar, "errors");
        io.reactivex.e d = eVar.d((g) new b(this));
        kotlin.jvm.internal.i.e(d, "errors.flatMap {\n       …er(delay, unit)\n        }");
        return d;
    }
}

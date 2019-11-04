package com.iqoption.core.rx.a;

import com.iqoption.core.util.z;
import io.reactivex.b.g;
import io.reactivex.b.l;
import io.reactivex.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\fB7\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\u0010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "T", "R", "", "publishedStream", "Lio/reactivex/Flowable;", "dataPredicate", "Lio/reactivex/functions/Predicate;", "dataConverter", "Lio/reactivex/functions/Function;", "(Lio/reactivex/Flowable;Lio/reactivex/functions/Predicate;Lio/reactivex/functions/Function;)V", "get", "Companion", "core_release"})
/* compiled from: RxLiveStreamSupplier.kt */
public final class a<T, R> {
    private static final String TAG;
    private static final l<z<?>> bFG = c.bFK;
    private static final g<z<?>, Object> bFH = b.bFJ;
    public static final a bFI = new a();
    private final e<T> bFD;
    private final l<T> bFE;
    private final g<T, R> bFF;

    @i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jc\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0005\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0002\u0010\f2\u0006\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u0015¢\u0006\u0002\u0010\u0017JN\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0005\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0002\u0010\f2\u0006\u0010\r\u001a\u00020\t2\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00050\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013Jn\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u001b0\u000b\"\u0004\b\u0002\u0010\f\"\u0004\b\u0003\u0010\u001b2\u0006\u0010\r\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\f0\u000f2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\f0\u00072\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u001b0\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J>\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000f\"\u0004\b\u0002\u0010\f2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0002J \u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0005\u0012\u0004\u0012\u0002H\f0\u0004\"\u0004\b\u0002\u0010\fH\u0002J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u0002H\f0\u0007\"\u0004\b\u0002\u0010\fH\u0002JB\u0010!\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0002\u0010\f2\u0006\u0010\r\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\f0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u001e\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, bng = {"Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier$Companion;", "", "()V", "OPTIONAL_CONVERTER", "Lio/reactivex/functions/Function;", "Lcom/iqoption/core/util/Optional;", "OPTIONAL_PREDICATE", "Lio/reactivex/functions/Predicate;", "TAG", "", "fromDependentStream", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "T", "tag", "stream", "Lio/reactivex/Flowable;", "lifetimeDuration", "", "lifetimeUnit", "Ljava/util/concurrent/TimeUnit;", "conditionStreams", "", "", "(Ljava/lang/String;Lio/reactivex/Flowable;JLjava/util/concurrent/TimeUnit;[Lio/reactivex/Flowable;)Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "fromOptionalStream", "dataStream", "fromStream", "R", "dataPredicate", "dataConverter", "makePublishedStream", "optionalConverter", "optionalPredicate", "simple", "core_release"})
    /* compiled from: RxLiveStreamSupplier.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "T", "R", "it", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: RxLiveStreamSupplier.kt */
        static final class a<T> implements io.reactivex.b.f<org.a.d> {
            public static final a bFL = new a();

            a() {
            }

            public final void accept(org.a.d dVar) {
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "T", "R", "run"})
        /* compiled from: RxLiveStreamSupplier.kt */
        static final class b implements io.reactivex.b.a {
            public static final b bFM = new b();

            b() {
            }

            public final void run() {
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "T", "R", "error", "", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: RxLiveStreamSupplier.kt */
        static final class c<T> implements io.reactivex.b.f<Throwable> {
            public static final c bFN = new c();

            c() {
            }

            /* renamed from: o */
            public final void accept(Throwable th) {
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "T", "R", "run"})
        /* compiled from: RxLiveStreamSupplier.kt */
        static final class d implements io.reactivex.b.a {
            public static final d bFO = new d();

            d() {
            }

            public final void run() {
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "T", "R", "it", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: RxLiveStreamSupplier.kt */
        static final class e<T> implements io.reactivex.b.f<org.a.d> {
            public static final e bFP = new e();

            e() {
            }

            public final void accept(org.a.d dVar) {
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "T", "R", "run"})
        /* compiled from: RxLiveStreamSupplier.kt */
        static final class f implements io.reactivex.b.a {
            public static final f bFQ = new f();

            f() {
            }

            public final void run() {
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public static /* synthetic */ a a(a aVar, String str, io.reactivex.e eVar, long j, TimeUnit timeUnit, int i, Object obj) {
            if ((i & 4) != 0) {
                j = 5;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                timeUnit = TimeUnit.SECONDS;
            }
            return aVar.b(str, eVar, j2, timeUnit);
        }

        public final <T> a<T, T> b(String str, io.reactivex.e<T> eVar, long j, TimeUnit timeUnit) {
            String str2 = str;
            kotlin.jvm.internal.i.f(str, "tag");
            io.reactivex.e<T> eVar2 = eVar;
            kotlin.jvm.internal.i.f(eVar, "dataStream");
            TimeUnit timeUnit2 = timeUnit;
            kotlin.jvm.internal.i.f(timeUnit2, "lifetimeUnit");
            return a(this, str2, eVar2, null, null, j, timeUnit2, 12, null);
        }

        public static /* synthetic */ a a(a aVar, String str, io.reactivex.e eVar, l lVar, g gVar, long j, TimeUnit timeUnit, int i, Object obj) {
            return aVar.a(str, eVar, (i & 4) != 0 ? com.iqoption.core.rx.g.akg() : lVar, (i & 8) != 0 ? com.iqoption.core.rx.g.akf() : gVar, (i & 16) != 0 ? 5 : j, (i & 32) != 0 ? TimeUnit.SECONDS : timeUnit);
        }

        public final <T, R> a<T, R> a(String str, io.reactivex.e<T> eVar, l<T> lVar, g<T, R> gVar, long j, TimeUnit timeUnit) {
            kotlin.jvm.internal.i.f(str, "tag");
            kotlin.jvm.internal.i.f(eVar, "dataStream");
            kotlin.jvm.internal.i.f(lVar, "dataPredicate");
            kotlin.jvm.internal.i.f(gVar, "dataConverter");
            kotlin.jvm.internal.i.f(timeUnit, "lifetimeUnit");
            return new a(a(str, j, timeUnit, eVar), lVar, gVar, null);
        }

        public final <T> a<z<T>, T> c(String str, io.reactivex.e<z<T>> eVar, long j, TimeUnit timeUnit) {
            kotlin.jvm.internal.i.f(str, "tag");
            kotlin.jvm.internal.i.f(eVar, "dataStream");
            kotlin.jvm.internal.i.f(timeUnit, "lifetimeUnit");
            a aVar = this;
            return aVar.a(str, eVar, aVar.akr(), aVar.aks(), j, timeUnit);
        }

        private final <T> l<T> akr() {
            l akp = a.bFG;
            if (akp != null) {
                return akp;
            }
            throw new TypeCastException("null cannot be cast to non-null type io.reactivex.functions.Predicate<T>");
        }

        private final <T> g<z<T>, T> aks() {
            g akq = a.bFH;
            if (akq != null) {
                return akq;
            }
            throw new TypeCastException("null cannot be cast to non-null type io.reactivex.functions.Function<com.iqoption.core.util.Optional<T>, T>");
        }

        private final <T> io.reactivex.e<T> a(String str, long j, TimeUnit timeUnit, io.reactivex.e<T> eVar) {
            if (com.iqoption.core.d.Un().Ds()) {
                AtomicInteger atomicInteger = new AtomicInteger();
                io.reactivex.e<T> e = eVar.d((io.reactivex.b.f) a.bFL).e((io.reactivex.b.a) b.bFM).b((io.reactivex.b.f) c.bFN).f((io.reactivex.b.a) d.bFO).jw(1).n(j, timeUnit).d((io.reactivex.b.f) e.bFP).e((io.reactivex.b.a) f.bFQ);
                kotlin.jvm.internal.i.e(e, "dataStream\n             …                        }");
                return e;
            }
            io.reactivex.e n = eVar.jw(1).n(j, timeUnit);
            kotlin.jvm.internal.i.e(n, "dataStream.replay(1).ref…meDuration, lifetimeUnit)");
            return n;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "T", "R", "it", "Lcom/iqoption/core/util/Optional;", "apply"})
    /* compiled from: RxLiveStreamSupplier.kt */
    static final class b<T, R> implements g<z<?>, Object> {
        public static final b bFJ = new b();

        b() {
        }

        /* renamed from: a */
        public final Object apply(z<?> zVar) {
            kotlin.jvm.internal.i.f(zVar, "it");
            return zVar.get();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "T", "R", "it", "Lcom/iqoption/core/util/Optional;", "test"})
    /* compiled from: RxLiveStreamSupplier.kt */
    static final class c<T> implements l<z<?>> {
        public static final c bFK = new c();

        c() {
        }

        /* renamed from: b */
        public final boolean test(z<?> zVar) {
            kotlin.jvm.internal.i.f(zVar, "it");
            return zVar.isPresent();
        }
    }

    private a(e<T> eVar, l<T> lVar, g<T, R> gVar) {
        this.bFD = eVar;
        this.bFE = lVar;
        this.bFF = gVar;
    }

    public /* synthetic */ a(e eVar, l lVar, g gVar, f fVar) {
        this(eVar, lVar, gVar);
    }

    public final e<R> ako() {
        e g = this.bFD.b(this.bFE).g(this.bFF);
        kotlin.jvm.internal.i.e(g, "publishedStream\n        …      .map(dataConverter)");
        return g;
    }

    static {
        String simpleName = a.class.getSimpleName();
        kotlin.jvm.internal.i.e(simpleName, "RxLiveStreamSupplier::class.java.simpleName");
        TAG = simpleName;
    }
}

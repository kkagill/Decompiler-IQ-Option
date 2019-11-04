package com.iqoption.core.manager;

import com.iqoption.core.rx.d;
import com.iqoption.core.util.z;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.processors.PublishProcessor;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007J\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0007J\u0001\u0010\u0017\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u0019\u0012\u0004\u0012\u0002H\u001a0\u0018j\b\u0012\u0004\u0012\u0002H\u001a`\u001b\"\u0004\b\u0000\u0010\u001a\"\u0004\b\u0001\u0010\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u0002H\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u001a0\u00070\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001c0\u00072\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001c0\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&JR\u0010\u0017\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u0019\u0012\u0004\u0012\u0002H\u001a0\u0018j\b\u0012\u0004\u0012\u0002H\u001a`\u001b\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001d\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00072\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&J\u0006\u0010(\u001a\u00020\u0014J\u000e\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\b0\b0\fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, bng = {"Lcom/iqoption/core/manager/SocketManager;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "beforeDisconnectEvents", "Lio/reactivex/Flowable;", "", "getBeforeDisconnectEvents", "()Lio/reactivex/Flowable;", "beforeDisconnectProcessor", "Lio/reactivex/processors/FlowableProcessor;", "isConnected", "", "isConnectedImmediate", "()Z", "isConnectedProcessor", "Lcom/iqoption/core/rx/IQBehaviorProcessor;", "connect", "Lio/reactivex/Completable;", "connectEvents", "connectedEvents", "createLiveStreamSupplier", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "T", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "R", "tag", "dataStreamFactory", "Lkotlin/Function1;", "resettingStream", "resettingPredicate", "Lio/reactivex/functions/Predicate;", "lifetimeDuration", "", "lifetimeUnit", "Ljava/util/concurrent/TimeUnit;", "dataStream", "disconnect", "disconnectedEvents", "core_release"})
/* compiled from: SocketManager.kt */
public final class ac {
    private static final String TAG = ac.class.getSimpleName();
    private static final d<Boolean> bjP = d.bER.bQ(Boolean.valueOf(false));
    private static final io.reactivex.processors.a<l> bko;
    public static final ac bkp = new ac();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/util/Optional;", "T", "kotlin.jvm.PlatformType", "isConnected", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Flowable;"})
    /* compiled from: SocketManager.kt */
    static final class a<T, R> implements g<T, org.a.b<? extends R>> {
        final /* synthetic */ e bks;

        a(e eVar) {
            this.bks = eVar;
        }

        /* renamed from: l */
        public final e<z<T>> apply(Boolean bool) {
            kotlin.jvm.internal.i.f(bool, "isConnected");
            if (bool.booleanValue()) {
                return this.bks.g(AnonymousClass1.bkt).cG(z.bRg.any());
            }
            return e.cD(z.bRg.any());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/util/Optional;", "T", "kotlin.jvm.PlatformType", "R", "isConnected", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Flowable;"})
    /* compiled from: SocketManager.kt */
    static final class b<T, R> implements g<T, org.a.b<? extends R>> {
        final /* synthetic */ e bku;
        final /* synthetic */ io.reactivex.b.l bkv;
        final /* synthetic */ kotlin.jvm.a.b bkw;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/util/Optional;", "T", "kotlin.jvm.PlatformType", "R", "r", "apply", "(Ljava/lang/Object;)Lio/reactivex/Flowable;"})
        /* compiled from: SocketManager.kt */
        /* renamed from: com.iqoption.core.manager.ac$b$1 */
        static final class AnonymousClass1<T, R> implements g<T, org.a.b<? extends R>> {
            final /* synthetic */ b bkx;

            AnonymousClass1(b bVar) {
                this.bkx = bVar;
            }

            /* renamed from: bN */
            public final e<z<T>> apply(R r) {
                if (this.bkx.bkv.test(r)) {
                    return ((e) this.bkx.bkw.invoke(r)).g(AnonymousClass1.bky).cG(z.bRg.any());
                }
                return e.cD(z.bRg.any());
            }
        }

        b(e eVar, io.reactivex.b.l lVar, kotlin.jvm.a.b bVar) {
            this.bku = eVar;
            this.bkv = lVar;
            this.bkw = bVar;
        }

        /* renamed from: l */
        public final e<z<T>> apply(Boolean bool) {
            kotlin.jvm.internal.i.f(bool, "isConnected");
            if (bool.booleanValue()) {
                return this.bku.k(new AnonymousClass1(this));
            }
            return e.cD(z.bRg.any());
        }
    }

    static {
        io.reactivex.processors.a bmJ = PublishProcessor.bmK().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "PublishProcessor.create<Unit>().toSerialized()");
        bko = bmJ;
        com.iqoption.core.d.Up().Ux().d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.aki()).a((f) AnonymousClass1.bkq, (f) AnonymousClass2.bkr);
    }

    private ac() {
    }

    public final e<Boolean> YF() {
        return bjP;
    }

    public final boolean YG() {
        Boolean bool = (Boolean) bjP.getValue();
        return bool != null ? bool.booleanValue() : false;
    }

    public static /* synthetic */ com.iqoption.core.rx.a.a a(ac acVar, String str, e eVar, long j, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 5;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            timeUnit = TimeUnit.SECONDS;
        }
        return acVar.a(str, eVar, j2, timeUnit);
    }

    public final <T> com.iqoption.core.rx.a.a<z<T>, T> a(String str, e<T> eVar, long j, TimeUnit timeUnit) {
        kotlin.jvm.internal.i.f(str, "tag");
        kotlin.jvm.internal.i.f(eVar, "dataStream");
        kotlin.jvm.internal.i.f(timeUnit, "lifetimeUnit");
        e k = bkp.YF().k(new a(eVar));
        com.iqoption.core.rx.a.a.a aVar = com.iqoption.core.rx.a.a.bFI;
        kotlin.jvm.internal.i.e(k, "stream");
        return aVar.c(str, k, j, timeUnit);
    }

    public static /* synthetic */ com.iqoption.core.rx.a.a a(ac acVar, String str, kotlin.jvm.a.b bVar, e eVar, io.reactivex.b.l lVar, long j, TimeUnit timeUnit, int i, Object obj) {
        return acVar.a(str, bVar, eVar, (i & 8) != 0 ? com.iqoption.core.rx.g.akg() : lVar, (i & 16) != 0 ? 5 : j, (i & 32) != 0 ? TimeUnit.SECONDS : timeUnit);
    }

    public final <T, R> com.iqoption.core.rx.a.a<z<T>, T> a(String str, kotlin.jvm.a.b<? super R, ? extends e<? extends T>> bVar, e<R> eVar, io.reactivex.b.l<R> lVar, long j, TimeUnit timeUnit) {
        kotlin.jvm.internal.i.f(str, "tag");
        kotlin.jvm.internal.i.f(bVar, "dataStreamFactory");
        kotlin.jvm.internal.i.f(eVar, "resettingStream");
        kotlin.jvm.internal.i.f(lVar, "resettingPredicate");
        kotlin.jvm.internal.i.f(timeUnit, "lifetimeUnit");
        e k = bkp.YF().k(new b(eVar, lVar, bVar));
        com.iqoption.core.rx.a.a.a aVar = com.iqoption.core.rx.a.a.bFI;
        kotlin.jvm.internal.i.e(k, "stream");
        return aVar.c(str, k, j, timeUnit);
    }
}

package com.iqoption.core.rx;

import io.reactivex.processors.BehaviorProcessor;
import kotlin.i;
import org.a.c;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001cB\u0011\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0016J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00132\u0010\u0010\u0018\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0000\u0018\u00010\u001bH\u0014R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u00000\u0002X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u00000\bX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, bng = {"Lcom/iqoption/core/rx/IQBehaviorProcessor;", "T", "Lio/reactivex/processors/FlowableProcessor;", "default", "(Ljava/lang/Object;)V", "serialized", "kotlin.jvm.PlatformType", "unsafe", "Lio/reactivex/processors/BehaviorProcessor;", "value", "getValue", "()Ljava/lang/Object;", "getThrowable", "", "hasComplete", "", "hasSubscribers", "hasThrowable", "onComplete", "", "onError", "t", "onNext", "onSubscribe", "s", "Lorg/reactivestreams/Subscription;", "subscribeActual", "Lorg/reactivestreams/Subscriber;", "Companion", "core_release"})
/* compiled from: IQBehaviorProcessor.kt */
public final class d<T> extends io.reactivex.processors.a<T> {
    public static final a bER = new a();
    private final BehaviorProcessor<T> bEP;
    private final io.reactivex.processors.a<T> bEQ;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005H\u0007J!\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/rx/IQBehaviorProcessor$Companion;", "", "()V", "create", "Lcom/iqoption/core/rx/IQBehaviorProcessor;", "T", "default", "(Ljava/lang/Object;)Lcom/iqoption/core/rx/IQBehaviorProcessor;", "core_release"})
    /* compiled from: IQBehaviorProcessor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final <T> d<T> akd() {
            return new d(null, null);
        }

        public final <T> d<T> bQ(T t) {
            return new d(t, null);
        }
    }

    public static final <T> d<T> akd() {
        return bER.akd();
    }

    public static final <T> d<T> bQ(T t) {
        return bER.bQ(t);
    }

    private d(T t) {
        Object cX;
        if (t != null) {
            cX = BehaviorProcessor.cX(t);
        } else {
            cX = BehaviorProcessor.bmG();
        }
        kotlin.jvm.internal.i.e(cX, "if (default != null) {\n …rProcessor.create()\n    }");
        this.bEP = cX;
        io.reactivex.processors.a bmJ = this.bEP.bmJ();
        kotlin.jvm.internal.i.e(bmJ, "unsafe.toSerialized()");
        this.bEQ = bmJ;
    }

    public /* synthetic */ d(Object obj, f fVar) {
        this(obj);
    }

    public final T getValue() {
        return this.bEP.getValue();
    }

    public void onComplete() {
        this.bEQ.onComplete();
    }

    public void onSubscribe(org.a.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "s");
        this.bEQ.onSubscribe(dVar);
    }

    public void onError(Throwable th) {
        this.bEQ.onError(th);
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.bEQ.subscribe(cVar);
    }

    public void onNext(T t) {
        this.bEQ.onNext(t);
    }
}

package com.iqoption.core.rx.a;

import android.util.ArrayMap;
import io.reactivex.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004B%\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eR&\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00070\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/rx/livestream/RxLiveStreamsContainer;", "Key", "T", "R", "", "supplierFactory", "Lkotlin/Function1;", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "(Lkotlin/jvm/functions/Function1;)V", "suppliers", "Landroid/util/ArrayMap;", "get", "Lio/reactivex/Flowable;", "key", "(Ljava/lang/Object;)Lio/reactivex/Flowable;", "core_release"})
/* compiled from: RxLiveStreamsContainer.kt */
public final class b<Key, T, R> {
    private final ArrayMap<Key, a<T, R>> bFR = new ArrayMap();
    private final kotlin.jvm.a.b<Key, a<T, R>> bFS;

    public b(kotlin.jvm.a.b<? super Key, a<T, R>> bVar) {
        kotlin.jvm.internal.i.f(bVar, "supplierFactory");
        this.bFS = bVar;
    }

    public final synchronized e<R> bR(Key key) {
        a aVar;
        aVar = (a) this.bFR.get(key);
        if (aVar == null) {
            Object invoke = this.bFS.invoke(key);
            this.bFR.put(key, (a) invoke);
            aVar = (a) invoke;
        }
        return aVar.ako();
    }
}

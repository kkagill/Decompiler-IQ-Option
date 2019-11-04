package com.iqoption.core.ext;

import io.reactivex.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aE\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u00012\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b0\u0007H\b\u001aE\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\t2\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b0\u0007H\b\u001aE\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u000b2\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b0\u0007H\b\u001a=\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0016\b\u0004\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\r0\u0007H\b\u001a=\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0016\b\u0004\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\r0\u0007H\b\u001a=\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0016\b\u0004\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\r0\u0007H\b\u001a\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00100\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00100\t\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t\u001a\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00100\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0012\u0010\u0014\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016\u001a.\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u001a.\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b¨\u0006\u001c"}, bng = {"cacheLast", "Lio/reactivex/Flowable;", "T", "findOrEmpty", "C", "", "finder", "Lkotlin/Function1;", "", "Lio/reactivex/Maybe;", "findOrError", "Lio/reactivex/Single;", "mapNotNull", "R", "mapper", "mapToList", "", "onCompleteSafe", "", "Lio/reactivex/CompletableEmitter;", "onErrorSafe", "t", "", "retryInfinitely", "tag", "", "seconds", "", "core_release"})
/* compiled from: RxExtensions.kt */
public final class h {
    public static final <T> e<T> d(e<T> eVar) {
        kotlin.jvm.internal.i.f(eVar, "$this$cacheLast");
        e blq = eVar.jw(1).blq();
        kotlin.jvm.internal.i.e(blq, "this.replay(1).refCount()");
        return blq;
    }
}
package com.iqoption.util;

import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032'\b\u0002\u0010\u0004\u001a!\u0012\u0015\u0012\u0013\u0018\u0001H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001aÁ\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0010*\n\u0012\u0006\b\u0001\u0012\u0002H\u00100\u00032\u0006\u0010\u0011\u001a\u0002H\u00022<\b\u0002\u0010\u0004\u001a6\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u0001H\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122:\b\u0002\u0010\t\u001a4\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0013\u001a|\u0010\u0014\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0010*\n\u0012\u0006\b\u0001\u0012\u0002H\u00100\u00032'\b\u0002\u0010\u0004\u001a!\u0012\u0015\u0012\u0013\u0018\u0001H\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052'\b\u0002\u0010\t\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u001aB\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00160\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u00020\u00182\b\b\u0002\u0010\u000e\u001a\u00020\u000f¨\u0006\u0019"}, bng = {"addCallback", "", "T", "Lcom/google/common/util/concurrent/ListenableFuture;", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "onFailure", "", "t", "onAny", "Lkotlin/Function0;", "executor", "Ljava/util/concurrent/Executor;", "V", "referent", "Lkotlin/Function2;", "(Lcom/google/common/util/concurrent/ListenableFuture;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Ljava/util/concurrent/Executor;)V", "addUiCallback", "transform", "F", "transformation", "Lcom/google/common/base/Function;", "app_optionXRelease"})
/* compiled from: FutureTools.kt */
public final class u {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, bng = {"com/iqoption/util/FutureToolsKt$addUiCallback$1", "Lcom/google/common/util/concurrent/FutureCallback;", "onFailure", "", "t", "", "onSuccess", "result", "(Ljava/lang/Object;)V", "app_optionXRelease"})
    /* compiled from: FutureTools.kt */
    public static final class a implements o<V> {
        final /* synthetic */ b ebd;
        final /* synthetic */ kotlin.jvm.a.a ebe;
        final /* synthetic */ b ebf;

        a(b bVar, kotlin.jvm.a.a aVar, b bVar2) {
            this.ebd = bVar;
            this.ebe = aVar;
            this.ebf = bVar2;
        }

        public void onSuccess(V v) {
            l lVar;
            b bVar = this.ebd;
            if (bVar != null) {
                lVar = (l) bVar.invoke(v);
            }
            kotlin.jvm.a.a aVar = this.ebe;
            if (aVar != null) {
                lVar = (l) aVar.invoke();
            }
        }

        public void l(Throwable th) {
            l lVar;
            b bVar = this.ebf;
            if (bVar != null) {
                lVar = (l) bVar.invoke(th);
            }
            kotlin.jvm.a.a aVar = this.ebe;
            if (aVar != null) {
                lVar = (l) aVar.invoke();
            }
        }
    }

    public static /* synthetic */ void a(t tVar, b bVar, b bVar2, kotlin.jvm.a.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = (b) null;
        }
        if ((i & 2) != 0) {
            bVar2 = (b) null;
        }
        if ((i & 4) != 0) {
            aVar = (kotlin.jvm.a.a) null;
        }
        a(tVar, bVar, bVar2, aVar);
    }

    public static final <V> void a(t<? extends V> tVar, b<? super V, l> bVar, b<? super Throwable, l> bVar2, kotlin.jvm.a.a<l> aVar) {
        kotlin.jvm.internal.i.f(tVar, "$this$addUiCallback");
        p.a(tVar, new a(bVar, aVar, bVar2), com.iqoption.core.c.a.biN);
    }
}

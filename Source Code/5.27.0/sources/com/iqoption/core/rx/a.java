package com.iqoption.core.rx;

import io.reactivex.b.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002J!\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0017J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0003H&J\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/rx/BaseBiConsumer;", "T", "Lio/reactivex/functions/BiConsumer;", "", "accept", "", "result", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "execute", "Lio/reactivex/disposables/Disposable;", "single", "Lio/reactivex/Single;", "onFailure", "t", "onSuccess", "value", "(Ljava/lang/Object;)V", "core_release"})
/* compiled from: RxConsumers.kt */
public interface a<T> extends b<T, Throwable> {

    @i(bne = {1, 1, 15})
    /* compiled from: RxConsumers.kt */
    public static final class a {
        public static <T> void a(a<T> aVar, T t, Throwable th) {
            if (t != null) {
                aVar.onSuccess(t);
            } else if (th != null) {
                aVar.l(th);
            }
        }
    }

    void l(Throwable th);

    void onSuccess(T t);
}

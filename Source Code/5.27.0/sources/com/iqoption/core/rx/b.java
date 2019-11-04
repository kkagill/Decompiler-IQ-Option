package com.iqoption.core.rx;

import io.reactivex.b.f;
import io.reactivex.l;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/core/rx/BaseFlowableConsumer;", "T", "Lio/reactivex/functions/Consumer;", "Lio/reactivex/Notification;", "accept", "", "notification", "onFailure", "t", "", "onSuccess", "value", "(Ljava/lang/Object;)V", "core_release"})
/* compiled from: RxConsumers.kt */
public interface b<T> extends f<l<T>> {

    @i(bne = {1, 1, 15})
    /* compiled from: RxConsumers.kt */
    public static final class a {
        public static <T> void a(b<T> bVar, l<T> lVar) {
            kotlin.jvm.internal.i.f(lVar, "notification");
            if (lVar.bli()) {
                Object value = lVar.getValue();
                if (value == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                bVar.onSuccess(value);
            } else if (lVar.blh()) {
                Throwable blj = lVar.blj();
                if (blj == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                kotlin.jvm.internal.i.e(blj, "notification.error!!");
                bVar.l(blj);
            }
        }
    }

    void l(Throwable th);

    void onSuccess(T t);
}

package com.iqoption.core.rx.backoff;

import com.iqoption.core.connect.bus.IQBusState;
import io.reactivex.b.l;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/rx/backoff/IQBusConnectionTrigger;", "Lcom/iqoption/core/rx/backoff/ConnectionTrigger;", "()V", "connection", "Lio/reactivex/Completable;", "isConnected", "", "core_release"})
/* compiled from: ConnectionTrigger.kt */
public final class d implements c {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/connect/bus/IQBusState;", "test"})
    /* compiled from: ConnectionTrigger.kt */
    static final class a<T> implements l<IQBusState> {
        public static final a bFB = new a();

        a() {
        }

        /* renamed from: b */
        public final boolean test(IQBusState iQBusState) {
            kotlin.jvm.internal.i.f(iQBusState, "it");
            return iQBusState == IQBusState.CONNECTED;
        }
    }

    public boolean isConnected() {
        return com.iqoption.core.d.ED().EU().Uy() == IQBusState.CONNECTED;
    }

    public io.reactivex.a akn() {
        io.reactivex.a blf = com.iqoption.core.d.ED().EU().Ux().b((l) a.bFB).bkU().blf();
        kotlin.jvm.internal.i.e(blf, "connect.bus.stateStream.…         .ignoreElement()");
        return blf;
    }
}

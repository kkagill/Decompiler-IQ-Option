package com.iqoption.core.rx.backoff;

import io.reactivex.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/rx/backoff/ConnectionTrigger;", "", "connection", "Lio/reactivex/Completable;", "isConnected", "", "core_release"})
/* compiled from: ConnectionTrigger.kt */
public interface c {
    a akn();

    boolean isConnected();
}

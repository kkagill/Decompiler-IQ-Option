package com.iqoption.core.marketanalysis;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/marketanalysis/LoadingState;", "", "startOffset", "", "(I)V", "hasMore", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHasMore", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoading", "pageOffset", "Ljava/util/concurrent/atomic/AtomicInteger;", "getPageOffset", "()Ljava/util/concurrent/atomic/AtomicInteger;", "core_release"})
/* compiled from: LoadingState.kt */
public final class d {
    private final AtomicBoolean blg = new AtomicBoolean(true);
    private final AtomicBoolean blh = new AtomicBoolean(true);
    private final AtomicInteger bli;

    public d(int i) {
        this.bli = new AtomicInteger(i);
    }

    public final AtomicBoolean YR() {
        return this.blg;
    }

    public final AtomicBoolean YS() {
        return this.blh;
    }

    public final AtomicInteger YT() {
        return this.bli;
    }
}

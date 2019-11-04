package com.iqoption.core.graphics.animation.a;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/graphics/animation/transition/Durations;", "", "duration", "", "(J)V", "enter", "exit", "(JJ)V", "getEnter", "()J", "getExit", "core_release"})
/* compiled from: TransitionInfo.kt */
public final class b {
    private final long bii;
    private final long bij;

    public b(long j, long j2) {
        this.bii = j;
        this.bij = j2;
    }

    public final long XR() {
        return this.bii;
    }

    public final long XS() {
        return this.bij;
    }

    public b(long j) {
        this(j, j);
    }
}

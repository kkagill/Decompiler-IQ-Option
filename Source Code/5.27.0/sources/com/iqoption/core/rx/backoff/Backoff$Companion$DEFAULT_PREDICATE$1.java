package com.iqoption.core.rx.backoff;

import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "", "attempt", "", "invoke"})
/* compiled from: Backoff.kt */
final class Backoff$Companion$DEFAULT_PREDICATE$1 extends Lambda implements m<Throwable, Integer, Boolean> {
    public static final Backoff$Companion$DEFAULT_PREDICATE$1 bFx = new Backoff$Companion$DEFAULT_PREDICATE$1();

    Backoff$Companion$DEFAULT_PREDICATE$1() {
        super(2);
    }

    public final boolean a(Throwable th, int i) {
        kotlin.jvm.internal.i.f(th, "<anonymous parameter 0>");
        return i >= 10;
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        return Boolean.valueOf(a((Throwable) obj, ((Number) obj2).intValue()));
    }
}

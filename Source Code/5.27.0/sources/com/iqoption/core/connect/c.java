package com.iqoption.core.connect;

import io.reactivex.e;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bH&J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0012H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\fH&J(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\fH&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u000eH&¨\u0006\u001c"}, bng = {"Lcom/iqoption/core/connect/EventBuilder;", "T", "", "buildExecutable", "Lcom/iqoption/core/connect/Executable;", "buildStream", "Lio/reactivex/Flowable;", "denyLogging", "denySharing", "filter", "value", "Lkotlin/Function1;", "", "microService", "", "param", "name", "params", "", "sendSubscription", "isSend", "throttle", "", "unit", "Ljava/util/concurrent/TimeUnit;", "beforeFilter", "unsubscribe", "version", "core_release"})
/* compiled from: EventBuilder.kt */
public interface c<T> {
    c<T> HO();

    c<T> HP();

    e<T> HQ();

    c<T> a(long j, TimeUnit timeUnit, boolean z);

    c<T> b(b<? super T, Boolean> bVar);

    c<T> bx(boolean z);

    c<T> ec(String str);

    c<T> ed(String str);

    c<T> i(String str, Object obj);
}

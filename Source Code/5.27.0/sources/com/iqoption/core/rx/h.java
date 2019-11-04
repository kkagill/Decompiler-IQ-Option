package com.iqoption.core.rx;

import com.iqoption.core.connect.http.HttpException;
import com.iqoption.core.connect.ws.SocketException;
import io.reactivex.b.f;
import io.reactivex.exceptions.UndeliverableException;
import java.io.IOException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/rx/RxJavaErrorHandlers;", "", "()V", "rxJavaErrorHandler", "Lio/reactivex/functions/Consumer;", "", "core_release"})
/* compiled from: RxJavaErrorHandlers.kt */
public final class h {
    public static final f<Throwable> bFh = a.bFj;
    public static final h bFi = new h();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RxJavaErrorHandlers.kt */
    static final class a<T> implements f<Throwable> {
        public static final a bFj = new a();

        a() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            if (th instanceof UndeliverableException) {
                th = th.getCause();
            }
            if (!(th instanceof IOException) && !(th instanceof SocketException) && !(th instanceof HttpException) && !(th instanceof InterruptedException)) {
                String str = "Thread.currentThread()";
                Thread currentThread;
                if ((th instanceof NullPointerException) || (th instanceof IllegalArgumentException)) {
                    currentThread = Thread.currentThread();
                    kotlin.jvm.internal.i.e(currentThread, str);
                    currentThread.getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                } else if (th instanceof IllegalStateException) {
                    currentThread = Thread.currentThread();
                    kotlin.jvm.internal.i.e(currentThread, str);
                    currentThread.getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                } else {
                    com.crashlytics.android.a.d(th);
                }
            }
        }
    }

    private h() {
    }
}

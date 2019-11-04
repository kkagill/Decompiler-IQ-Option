package com.iqoption.core.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\f\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/util/CycledCommand;", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "predicate", "Lkotlin/Function0;", "", "onAction", "", "onCancel", "(Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cancel", "run", "Companion", "core_release"})
/* compiled from: CycledCommand.kt */
public final class g implements Runnable {
    private static final Handler bQs = new Handler(Looper.getMainLooper());
    public static final a bQt = new a();
    private final kotlin.jvm.a.a<l> aSS;
    private final kotlin.jvm.a.a<Boolean> bQq;
    private final kotlin.jvm.a.a<l> bQr;
    private final Handler handler;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/util/CycledCommand$Companion;", "", "()V", "MAIN_THREAD_HANDLER", "Landroid/os/Handler;", "getMAIN_THREAD_HANDLER", "()Landroid/os/Handler;", "core_release"})
    /* compiled from: CycledCommand.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public g(Handler handler, kotlin.jvm.a.a<Boolean> aVar, kotlin.jvm.a.a<l> aVar2, kotlin.jvm.a.a<l> aVar3) {
        kotlin.jvm.internal.i.f(handler, "handler");
        kotlin.jvm.internal.i.f(aVar, "predicate");
        kotlin.jvm.internal.i.f(aVar2, "onAction");
        this.handler = handler;
        this.bQq = aVar;
        this.bQr = aVar2;
        this.aSS = aVar3;
    }

    public /* synthetic */ g(Handler handler, kotlin.jvm.a.a aVar, kotlin.jvm.a.a aVar2, kotlin.jvm.a.a aVar3, int i, f fVar) {
        if ((i & 1) != 0) {
            handler = bQs;
        }
        if ((i & 8) != 0) {
            aVar3 = (kotlin.jvm.a.a) null;
        }
        this(handler, aVar, aVar2, aVar3);
    }

    public void run() {
        if (((Boolean) this.bQq.invoke()).booleanValue()) {
            this.bQr.invoke();
        } else {
            this.handler.post(this);
        }
    }

    public final void cancel() {
        Handler handler = this.handler;
        kotlin.jvm.a.a aVar = this.bQr;
        if (aVar != null) {
            aVar = new h(aVar);
        }
        handler.removeCallbacks((Runnable) aVar);
        kotlin.jvm.a.a aVar2 = this.aSS;
        if (aVar2 != null) {
            l lVar = (l) aVar2.invoke();
        }
    }
}

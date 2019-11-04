package com.iqoption.feed.feedlist;

import android.os.Message;
import android.os.SystemClock;
import com.iqoption.core.util.ag;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.l;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, bng = {"Lcom/iqoption/feed/feedlist/SparseUiExecutor;", "", "task", "Lkotlin/Function0;", "", "delay", "", "(Lkotlin/jvm/functions/Function0;I)V", "getDelay", "()I", "lastUpdateTime", "", "messageId", "getTask", "()Lkotlin/jvm/functions/Function0;", "execute", "executeInternal", "Companion", "feed_release"})
/* compiled from: SparseUiExecutor.kt */
public final class i {
    private static final AtomicInteger cQU = new AtomicInteger(512);
    public static final a cQV = new a();
    private final int cQS = cQU.incrementAndGet();
    private final kotlin.jvm.a.a<l> cQT;
    private final int delay;
    private long lastUpdateTime;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/feed/feedlist/SparseUiExecutor$Companion;", "", "()V", "messageIdGenerator", "Ljava/util/concurrent/atomic/AtomicInteger;", "feed_release"})
    /* compiled from: SparseUiExecutor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: SparseUiExecutor.kt */
    static final class b implements Runnable {
        final /* synthetic */ i cQW;

        b(i iVar) {
            this.cQW = iVar;
        }

        public final void run() {
            this.cQW.avZ();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: SparseUiExecutor.kt */
    static final class c implements Runnable {
        final /* synthetic */ i cQW;

        c(i iVar) {
            this.cQW = iVar;
        }

        public final void run() {
            this.cQW.awa().invoke();
        }
    }

    public i(kotlin.jvm.a.a<l> aVar, int i) {
        kotlin.jvm.internal.i.f(aVar, "task");
        this.cQT = aVar;
        this.delay = i;
    }

    public final kotlin.jvm.a.a<l> awa() {
        return this.cQT;
    }

    public final void execute() {
        if (ag.anH()) {
            avZ();
        } else {
            com.iqoption.core.c.a.biN.execute(new b(this));
        }
    }

    private final void avZ() {
        if (SystemClock.uptimeMillis() - this.lastUpdateTime < ((long) this.delay)) {
            if (!com.iqoption.core.c.a.biN.hasMessages(this.cQS)) {
                Message obtain = Message.obtain(com.iqoption.core.c.a.biN, new c(this));
                obtain.what = this.cQS;
                com.iqoption.core.c.a.biN.sendMessageDelayed(obtain, Math.max(0, ((long) this.delay) - (SystemClock.uptimeMillis() - this.lastUpdateTime)));
            }
            return;
        }
        this.cQT.invoke();
    }
}

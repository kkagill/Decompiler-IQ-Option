package com.iqoption.debugmenu.debugmenu;

import com.iqoption.core.microservices.quotes.response.ActivePhase;
import io.reactivex.b.f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/PhaseEmulator;", "", "()V", "emulatedPhase", "Lcom/iqoption/core/microservices/quotes/response/ActivePhase;", "getEmulatedPhase", "()Lcom/iqoption/core/microservices/quotes/response/ActivePhase;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "phases", "", "debugmenu_release"})
/* compiled from: PhaseEmulator.kt */
public final class e {
    private static final List<ActivePhase> cwl = m.listOf(ActivePhase.OPENING_AUCTION, ActivePhase.TRADING, ActivePhase.INTRADAY_AUCTION, ActivePhase.CLOSING_AUCTION);
    public static final e cwm = new e();
    private static int index;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"})
    /* compiled from: PhaseEmulator.kt */
    static final class a<T> implements f<Long> {
        public static final a cwn = new a();

        a() {
        }

        /* renamed from: o */
        public final void accept(Long l) {
            int index = e.cwm.getIndex();
            e.cwm.setIndex(index >= e.cwl.size() + -1 ? 0 : index + 1);
        }
    }

    static {
        io.reactivex.e.f(5, TimeUnit.SECONDS).e((f) a.cwn);
    }

    private e() {
    }

    public final int getIndex() {
        return index;
    }

    public final void setIndex(int i) {
        index = i;
    }

    public final ActivePhase aog() {
        return (ActivePhase) cwl.get(index);
    }
}

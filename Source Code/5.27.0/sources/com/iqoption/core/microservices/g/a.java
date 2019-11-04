package com.iqoption.core.microservices.g;

import com.iqoption.core.d;
import com.iqoption.core.data.model.InstrumentType;
import io.reactivex.b.l;
import io.reactivex.e;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/microservices/tradersmood/TradersMoodRequests;", "", "()V", "CMD_GET_TRADERS_MOOD_CHANGED", "", "EVENT_TRADERS_MOOD_CHANGED", "getTradersMood", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/tradersmood/response/TradersMood;", "activeId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getTradersMoodUpdates", "Lio/reactivex/Flowable;", "updateTradersMood", "core_release"})
/* compiled from: TradersMoodRequests.kt */
public final class a {
    public static final a bzj = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradersmood/response/TradersMood;", "test"})
    /* compiled from: TradersMoodRequests.kt */
    static final class a<T> implements l<com.iqoption.core.microservices.g.a.a> {
        final /* synthetic */ int $activeId;
        final /* synthetic */ InstrumentType $instrumentType;

        a(int i, InstrumentType instrumentType) {
            this.$activeId = i;
            this.$instrumentType = instrumentType;
        }

        /* renamed from: a */
        public final boolean test(com.iqoption.core.microservices.g.a.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.getActiveId() == this.$activeId && aVar.getInstrumentType() == this.$instrumentType;
        }
    }

    private a() {
    }

    public final e<com.iqoption.core.microservices.g.a.a> d(int i, InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        e blb = d.EW().b("traders-mood-changed", com.iqoption.core.microservices.g.a.a.class).bx(false).HO().HQ().b((l) new a(i, instrumentType)).blb();
        kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
        return blb;
    }

    public final p<com.iqoption.core.microservices.g.a.a> e(int i, InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return d.EV().a("get-traders-mood", com.iqoption.core.microservices.g.a.a.class).k("asset_id", Integer.valueOf(i)).k("instrument", instrumentType).UB();
    }
}

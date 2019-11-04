package com.iqoption.core.microservices.f;

import com.iqoption.core.d;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.f.a.a.b;
import io.reactivex.b.l;
import io.reactivex.e;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/microservices/topassets/TopAssetsRequests;", "", "()V", "CMD_GET_TOP_ASSETS", "", "EVENT_TOP_ASSETS_UPDATED", "INSTRUMENT_TYPE", "getTopAssetUpdates", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadDataResult;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getTopAssets", "Lio/reactivex/Single;", "core_release"})
/* compiled from: TopAssetsRequests.kt */
public final class a {
    public static final a byW = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadDataResult;", "test"})
    /* compiled from: TopAssetsRequests.kt */
    static final class a<T> implements l<b> {
        final /* synthetic */ InstrumentType $instrumentType;

        a(InstrumentType instrumentType) {
            this.$instrumentType = instrumentType;
        }

        /* renamed from: b */
        public final boolean test(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return bVar.getInstrumentType() == this.$instrumentType;
        }
    }

    private a() {
    }

    public final p<b> K(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return d.EV().a("get-top-assets", b.class).fp("1.2").k("instrument_type", instrumentType).UB();
    }

    public final e<b> L(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        e blb = d.EW().b("top-assets-updated", b.class).ec("1.2").i("instrument_type", instrumentType).HO().HQ().b((l) new a(instrumentType)).blb();
        kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
        return blb;
    }
}

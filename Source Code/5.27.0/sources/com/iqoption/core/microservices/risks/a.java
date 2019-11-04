package com.iqoption.core.microservices.risks;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.risks.response.a.b;
import com.iqoption.core.microservices.risks.response.a.c;
import com.iqoption.core.microservices.risks.response.markup.d;
import io.reactivex.b.l;
import io.reactivex.e;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0017J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0017J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0017J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0017J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0017J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001c2\u0006\u0010\u0013\u001a\u00020\u0014J(\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u0017J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006'"}, bng = {"Lcom/iqoption/core/microservices/risks/RisksRequests;", "", "()V", "ACTIVE_ID", "", "CMD_GET_ACTIVE_EXPOSURE", "CMD_GET_COMMISSIONS", "CMD_GET_CUSTODIAL_FEE", "CMD_GET_OVERNIGHT_FEE", "CMD_GET_SPREAD_MARKUPS", "EVENT_COMMISSION_CHANGED", "EVENT_SPREAD_MARKUP_CHANGED", "INSTRUMENT_TYPE", "USER_GROUP_ID", "getActiveExposure", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/risks/response/Exposure;", "activeId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "currencyTicker", "time", "", "getCommissions", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionsResult;", "userGroupId", "getCommissionsChanges", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionEvent;", "getCustodialFee", "Lcom/iqoption/core/microservices/risks/response/custodialfee/CustodialFee;", "getOvernightFee", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFee;", "getOvernightFeeChanges", "getSpreadMarkupChanges", "Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkupChanged;", "getSpreadMarkups", "Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkups;", "core_release"})
/* compiled from: RisksRequests.kt */
public final class a {
    public static final a bxY = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkupChanged;", "test"})
    /* compiled from: RisksRequests.kt */
    static final class a<T> implements l<d> {
        final /* synthetic */ int $activeId;
        final /* synthetic */ InstrumentType $instrumentType;

        a(InstrumentType instrumentType, int i) {
            this.$instrumentType = instrumentType;
            this.$activeId = i;
        }

        /* renamed from: a */
        public final boolean test(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return dVar.getInstrumentType() == this.$instrumentType && (this.$activeId == -1 || dVar.getActiveId() == this.$activeId);
        }
    }

    private a() {
    }

    public final p<c> c(InstrumentType instrumentType, long j) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return com.iqoption.core.d.EV().a("get-commissions", c.class).fp("1.0").k("user_group_id", Long.valueOf(j)).k("instrument_type", instrumentType).UB();
    }

    public final e<b> d(InstrumentType instrumentType, long j) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return com.iqoption.core.d.EW().b("commission-changed", b.class).b(new RisksRequests$getCommissionsChanges$1(j, instrumentType)).ec("1.0").i("instrument_type", instrumentType).i("user_group_id", Long.valueOf(j)).HQ();
    }

    public final p<com.iqoption.core.microservices.risks.response.overnightfee.b> e(InstrumentType instrumentType, long j) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return com.iqoption.core.d.EV().a("get-overnight-fee", com.iqoption.core.microservices.risks.response.overnightfee.b.class).fp("1.0").k("user_group_id", Long.valueOf(j)).k("instrument_type", instrumentType).UB();
    }

    public static /* synthetic */ p a(a aVar, InstrumentType instrumentType, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = com.iqoption.core.d.EA().Et();
        }
        return aVar.f(instrumentType, j);
    }

    public final p<com.iqoption.core.microservices.risks.response.markup.e> f(InstrumentType instrumentType, long j) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return com.iqoption.core.d.EV().a("get-spread-markups", com.iqoption.core.microservices.risks.response.markup.e.class).fp("1.0").k("user_group_id", Long.valueOf(j)).k("instrument_type", instrumentType).UB();
    }

    public static /* synthetic */ e a(a aVar, InstrumentType instrumentType, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            j = com.iqoption.core.d.EA().Et();
        }
        return aVar.a(instrumentType, i, j);
    }

    public final e<d> a(InstrumentType instrumentType, int i, long j) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        String str = "user_group_id";
        com.iqoption.core.connect.c i2 = com.iqoption.core.d.EW().b("spread-markup-changed", d.class).ec("1.0").i("instrument_type", instrumentType).i(str, Long.valueOf(j));
        if (i != -1) {
            i2 = i2.i("active_id", Integer.valueOf(i));
        }
        e blb = i2.HO().HQ().b((l) new a(instrumentType, i)).blb();
        kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
        return blb;
    }

    public final p<com.iqoption.core.microservices.risks.response.b.a> g(InstrumentType instrumentType, long j) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return com.iqoption.core.d.EV().a("get-custodial-fee", com.iqoption.core.microservices.risks.response.b.a.class).k("user_group_id", Long.valueOf(j)).k("instrument_type", instrumentType.getServerValue()).UB();
    }

    public final p<com.iqoption.core.microservices.risks.response.a> a(int i, InstrumentType instrumentType, String str, long j) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        int i2 = b.aob[instrumentType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            p ab = p.ab(new IllegalArgumentException("Not support cfd, forex instrument"));
            kotlin.jvm.internal.i.e(ab, "Single.error(IllegalArgu… cfd, forex instrument\"))");
            return ab;
        }
        return com.iqoption.core.d.EV().a("get-active-exposure", com.iqoption.core.microservices.risks.response.a.class).fp("1.0").k("active_id", Integer.valueOf(i)).k("instrument_type", instrumentType).k("currency", str).k("time", Long.valueOf(j)).UB();
    }
}

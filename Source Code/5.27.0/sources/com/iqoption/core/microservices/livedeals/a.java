package com.iqoption.core.microservices.livedeals;

import com.google.gson.reflect.TypeToken;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.event.OtnEmissionExecuted;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u0010J\u0016\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u0010J\u0016\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00170\u00162\u0006\u0010\u0012\u001a\u00020\u0010J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00170\u00162\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00170\u00162\u0006\u0010\u0012\u001a\u00020\u0010J\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00170\u00162\u0006\u0010\u0012\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/core/microservices/livedeals/LiveDealsRequests;", "", "()V", "CMD_GET_TOP_DEALS", "", "CMD_GET_TOP_DEALS_BINARY_OPTION", "CMD_GET_TOP_DEALS_DIGITAL_OPTION", "CMD_GET_TOP_DEALS_FX_OPTION", "EVENT_LIVE_DEAL", "EVENT_LIVE_DEAL_BINARY_OPTION_PLACED", "EVENT_LIVE_DEAL_DIGITAL_OPTION", "EVENT_LIVE_DEAL_FX_OPTION", "getLiveDealBOUpdates", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/livedeals/response/LiveDeal;", "params", "Lcom/iqoption/core/microservices/livedeals/params/LiveDealsParams;", "getLiveDealDigitalUpdates", "liveDealsParams", "getLiveDealFxUpdates", "getLiveDealUpdates", "getTopDeals", "Lio/reactivex/Single;", "", "getTopDealsBO", "getTopDealsDigital", "getTopDealsFx", "core_release"})
/* compiled from: LiveDealsRequests.kt */
public final class a {
    public static final a bwp = new a();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/livedeals/response/bo/LiveDealBO;", "test"})
    /* compiled from: LiveDealsRequests.kt */
    static final class a<T> implements io.reactivex.b.l<com.iqoption.core.microservices.livedeals.response.a.a> {
        final /* synthetic */ InstrumentType $instrumentType;
        final /* synthetic */ com.iqoption.core.microservices.livedeals.a.c bwq;

        a(com.iqoption.core.microservices.livedeals.a.c cVar, InstrumentType instrumentType) {
            this.bwq = cVar;
            this.$instrumentType = instrumentType;
        }

        /* renamed from: a */
        public final boolean test(com.iqoption.core.microservices.livedeals.response.a.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.getActiveId() == this.bwq.getActiveId() && aVar.getInstrumentType() == this.$instrumentType;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/livedeals/response/digital/LiveDealDigital;", "test"})
    /* compiled from: LiveDealsRequests.kt */
    static final class b<T> implements io.reactivex.b.l<com.iqoption.core.microservices.livedeals.response.b.a> {
        final /* synthetic */ InstrumentType $instrumentType;
        final /* synthetic */ com.iqoption.core.microservices.livedeals.a.a bwr;

        b(com.iqoption.core.microservices.livedeals.a.a aVar, InstrumentType instrumentType) {
            this.bwr = aVar;
            this.$instrumentType = instrumentType;
        }

        /* renamed from: a */
        public final boolean test(com.iqoption.core.microservices.livedeals.response.b.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.getActiveId() == this.bwr.getActiveId() && aVar.getInstrumentType() == this.$instrumentType;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/livedeals/response/fx/LiveDealFx;", "test"})
    /* compiled from: LiveDealsRequests.kt */
    static final class c<T> implements io.reactivex.b.l<com.iqoption.core.microservices.livedeals.response.c.a> {
        final /* synthetic */ com.iqoption.core.microservices.livedeals.a.a bwr;

        c(com.iqoption.core.microservices.livedeals.a.a aVar) {
            this.bwr = aVar;
        }

        /* renamed from: a */
        public final boolean test(com.iqoption.core.microservices.livedeals.response.c.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.getActiveId() == this.bwr.getActiveId() && aVar.afU() == this.bwr.afU();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/livedeals/response/instrument/LiveDealInstrument;", "test"})
    /* compiled from: LiveDealsRequests.kt */
    static final class d<T> implements io.reactivex.b.l<com.iqoption.core.microservices.livedeals.response.instrument.a> {
        final /* synthetic */ InstrumentType $instrumentType;
        final /* synthetic */ com.iqoption.core.microservices.livedeals.a.c bwq;

        d(com.iqoption.core.microservices.livedeals.a.c cVar, InstrumentType instrumentType) {
            this.bwq = cVar;
            this.$instrumentType = instrumentType;
        }

        /* renamed from: a */
        public final boolean test(com.iqoption.core.microservices.livedeals.response.instrument.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.getActiveId() == this.bwq.getActiveId() && aVar.getInstrumentType() == this.$instrumentType;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/livedeals/LiveDealsRequests$create$$inlined$typeOf$1"})
    /* compiled from: GsonExtensions.kt */
    public static final class e extends TypeToken<com.iqoption.core.microservices.livedeals.response.instrument.b> {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/livedeals/response/instrument/LiveDealInstrument;", "response", "Lcom/iqoption/core/microservices/livedeals/response/instrument/TopDealsInstrumentResponse;", "apply"})
    /* compiled from: LiveDealsRequests.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, R> {
        public static final f bws = new f();

        f() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.livedeals.response.instrument.a> apply(com.iqoption.core.microservices.livedeals.response.instrument.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "response");
            Iterable<com.iqoption.core.microservices.livedeals.response.instrument.a> agd = bVar.agd();
            Collection arrayList = new ArrayList(n.e(agd, 10));
            for (com.iqoption.core.microservices.livedeals.response.instrument.a a : agd) {
                arrayList.add(com.iqoption.core.microservices.livedeals.response.instrument.a.a(a, 0, null, null, 0.0d, 0, 0, null, 0, null, null, Boolean.valueOf(true), null, 3071, null));
            }
            return u.T((List) arrayList);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/livedeals/LiveDealsRequests$create$$inlined$typeOf$2"})
    /* compiled from: GsonExtensions.kt */
    public static final class g extends TypeToken<com.iqoption.core.microservices.livedeals.response.a.b> {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/livedeals/response/bo/LiveDealBO;", "response", "Lcom/iqoption/core/microservices/livedeals/response/bo/TopDealsBOResponse;", "apply"})
    /* compiled from: LiveDealsRequests.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, R> {
        public static final h bwt = new h();

        h() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.livedeals.response.a.a> apply(com.iqoption.core.microservices.livedeals.response.a.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "response");
            Iterable<com.iqoption.core.microservices.livedeals.response.a.a> agd = bVar.agd();
            Collection arrayList = new ArrayList(n.e(agd, 10));
            for (com.iqoption.core.microservices.livedeals.response.a.a a : agd) {
                arrayList.add(com.iqoption.core.microservices.livedeals.response.a.a.a(a, 0, null, null, null, 0.0d, 0, 0, 0, null, 0, null, null, Boolean.valueOf(true), 4095, null));
            }
            return u.T((List) arrayList);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/livedeals/LiveDealsRequests$create$$inlined$typeOf$3"})
    /* compiled from: GsonExtensions.kt */
    public static final class i extends TypeToken<com.iqoption.core.microservices.livedeals.response.b.b> {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/livedeals/response/digital/LiveDealDigital;", "response", "Lcom/iqoption/core/microservices/livedeals/response/digital/TopDealsDigitalResponse;", "apply"})
    /* compiled from: LiveDealsRequests.kt */
    static final class j<T, R> implements io.reactivex.b.g<T, R> {
        public static final j bwu = new j();

        j() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.livedeals.response.b.a> apply(com.iqoption.core.microservices.livedeals.response.b.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "response");
            Iterable<com.iqoption.core.microservices.livedeals.response.b.a> agd = bVar.agd();
            Collection arrayList = new ArrayList(n.e(agd, 10));
            for (com.iqoption.core.microservices.livedeals.response.b.a a : agd) {
                arrayList.add(com.iqoption.core.microservices.livedeals.response.b.a.a(a, 0, null, null, 0.0d, 0, 0, null, 0, null, 0, null, null, Boolean.valueOf(true), 4095, null));
            }
            return u.T((List) arrayList);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/livedeals/LiveDealsRequests$create$$inlined$typeOf$4"})
    /* compiled from: GsonExtensions.kt */
    public static final class k extends TypeToken<com.iqoption.core.microservices.livedeals.response.c.b> {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/livedeals/response/fx/LiveDealFx;", "response", "Lcom/iqoption/core/microservices/livedeals/response/fx/TopDealsFxResponse;", "apply"})
    /* compiled from: LiveDealsRequests.kt */
    static final class l<T, R> implements io.reactivex.b.g<T, R> {
        public static final l bwv = new l();

        l() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.livedeals.response.c.a> apply(com.iqoption.core.microservices.livedeals.response.c.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "response");
            Iterable<com.iqoption.core.microservices.livedeals.response.c.a> agd = bVar.agd();
            Collection arrayList = new ArrayList(n.e(agd, 10));
            for (com.iqoption.core.microservices.livedeals.response.c.a a : agd) {
                arrayList.add(com.iqoption.core.microservices.livedeals.response.c.a.a(a, 0, null, null, 0.0d, 0, 0, null, 0, null, 0, null, null, Boolean.valueOf(true), 4095, null));
            }
            return u.T((List) arrayList);
        }
    }

    private a() {
    }

    public final p<List<com.iqoption.core.microservices.livedeals.response.a>> a(com.iqoption.core.microservices.livedeals.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "liveDealsParams");
        Object instrumentType = cVar.getInstrumentType();
        if (com.iqoption.core.ext.c.b(instrumentType, InstrumentType.CFD_INSTRUMENT, InstrumentType.FOREX_INSTRUMENT, InstrumentType.CRYPTO_INSTRUMENT)) {
            com.iqoption.core.microservices.livedeals.a.b bVar = (com.iqoption.core.microservices.livedeals.a.b) cVar;
            com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
            Type type = new e().getType();
            kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
            String str = "from";
            str = "to";
            com.iqoption.core.connect.j k = EV.a("get-top-deals", type).fp("1.0").k("instrument_active_id", Integer.valueOf(bVar.getActiveId())).k("instrument_type", instrumentType).k(str, bVar.afV()).k(str, bVar.afW());
            Integer afX = bVar.afX();
            if (afX != null) {
                k.k(OtnEmissionExecuted.COUNT, Integer.valueOf(afX.intValue()));
            }
            p t = k.UB().t(f.bws);
            kotlin.jvm.internal.i.e(t, "builder\n                …sBig = true) }.toList() }");
            return t;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected instrument type: ");
        stringBuilder.append(instrumentType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final io.reactivex.e<? extends com.iqoption.core.microservices.livedeals.response.a> b(com.iqoption.core.microservices.livedeals.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "params");
        Object instrumentType = cVar.getInstrumentType();
        if (com.iqoption.core.ext.c.b(instrumentType, InstrumentType.CFD_INSTRUMENT, InstrumentType.FOREX_INSTRUMENT, InstrumentType.CRYPTO_INSTRUMENT)) {
            String str = "instrument_active_id";
            io.reactivex.e blb = com.iqoption.core.d.EW().b("live-deal", com.iqoption.core.microservices.livedeals.response.instrument.a.class).ec("1.0").i(str, Integer.valueOf(cVar.getActiveId())).i("instrument_type", instrumentType).HO().HQ().b((io.reactivex.b.l) new d(cVar, instrumentType)).blb();
            kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
            return blb;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected instrument type: ");
        stringBuilder.append(instrumentType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final p<List<com.iqoption.core.microservices.livedeals.response.a>> c(com.iqoption.core.microservices.livedeals.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "params");
        Object instrumentType = cVar.getInstrumentType();
        if (com.iqoption.core.ext.c.b(instrumentType, InstrumentType.TURBO_INSTRUMENT, InstrumentType.BINARY_INSTRUMENT)) {
            com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
            Type type = new g().getType();
            kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
            String str = "option_type";
            p t = EV.a("get-top-deals-binary-option", type).fp("1.0").k("active_id", Integer.valueOf(cVar.getActiveId())).k(str, instrumentType.toOptionActiveType()).UB().t(h.bwt);
            kotlin.jvm.internal.i.e(t, "requestBuilderFactory\n  …sBig = true) }.toList() }");
            return t;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected instrument type: ");
        stringBuilder.append(instrumentType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final io.reactivex.e<? extends com.iqoption.core.microservices.livedeals.response.a> d(com.iqoption.core.microservices.livedeals.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "params");
        Object instrumentType = cVar.getInstrumentType();
        if (com.iqoption.core.ext.c.b(instrumentType, InstrumentType.TURBO_INSTRUMENT, InstrumentType.BINARY_INSTRUMENT)) {
            String str = "active_id";
            str = "option_type";
            io.reactivex.e blb = com.iqoption.core.d.EW().b("live-deal-binary-option-placed", com.iqoption.core.microservices.livedeals.response.a.a.class).ec("1.0").i(str, Integer.valueOf(cVar.getActiveId())).i(str, instrumentType.toOptionActiveType()).HO().HQ().b((io.reactivex.b.l) new a(cVar, instrumentType)).blb();
            kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
            return blb;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected instrument type: ");
        stringBuilder.append(instrumentType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final p<List<com.iqoption.core.microservices.livedeals.response.a>> e(com.iqoption.core.microservices.livedeals.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "liveDealsParams");
        InstrumentType instrumentType = cVar.getInstrumentType();
        if (instrumentType == InstrumentType.DIGITAL_INSTRUMENT) {
            com.iqoption.core.microservices.livedeals.a.a aVar = (com.iqoption.core.microservices.livedeals.a.a) cVar;
            com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
            Type type = new i().getType();
            kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
            String str = "expiration_type";
            p t = EV.a("get-top-deals-digital-option", type).fp("1.0").k("instrument_active_id", Integer.valueOf(aVar.getActiveId())).k(str, aVar.afU()).UB().t(j.bwu);
            kotlin.jvm.internal.i.e(t, "requestBuilderFactory\n  …sBig = true) }.toList() }");
            return t;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected instrument type: ");
        stringBuilder.append(instrumentType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final io.reactivex.e<? extends com.iqoption.core.microservices.livedeals.response.a> f(com.iqoption.core.microservices.livedeals.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "liveDealsParams");
        InstrumentType instrumentType = cVar.getInstrumentType();
        if (instrumentType == InstrumentType.DIGITAL_INSTRUMENT) {
            com.iqoption.core.microservices.livedeals.a.a aVar = (com.iqoption.core.microservices.livedeals.a.a) cVar;
            String str = "instrument_active_id";
            str = "expiration_type";
            io.reactivex.e blb = com.iqoption.core.d.EW().b("live-deal-digital-option", com.iqoption.core.microservices.livedeals.response.b.a.class).ec("1.0").i(str, Integer.valueOf(aVar.getActiveId())).i(str, aVar.afU()).HO().HQ().b((io.reactivex.b.l) new b(aVar, instrumentType)).blb();
            kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
            return blb;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected instrument type: ");
        stringBuilder.append(instrumentType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final p<List<com.iqoption.core.microservices.livedeals.response.a>> g(com.iqoption.core.microservices.livedeals.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "liveDealsParams");
        InstrumentType instrumentType = cVar.getInstrumentType();
        if (instrumentType == InstrumentType.FX_INSTRUMENT) {
            com.iqoption.core.microservices.livedeals.a.a aVar = (com.iqoption.core.microservices.livedeals.a.a) cVar;
            com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
            Type type = new k().getType();
            kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
            String str = "expiration_type";
            p t = EV.a("get-top-deals-fx-option", type).fp("1.0").k("instrument_active_id", Integer.valueOf(aVar.getActiveId())).k(str, aVar.afU()).UB().t(l.bwv);
            kotlin.jvm.internal.i.e(t, "requestBuilderFactory\n  …sBig = true) }.toList() }");
            return t;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected instrument type: ");
        stringBuilder.append(instrumentType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final io.reactivex.e<? extends com.iqoption.core.microservices.livedeals.response.a> h(com.iqoption.core.microservices.livedeals.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "liveDealsParams");
        InstrumentType instrumentType = cVar.getInstrumentType();
        if (instrumentType == InstrumentType.FX_INSTRUMENT) {
            com.iqoption.core.microservices.livedeals.a.a aVar = (com.iqoption.core.microservices.livedeals.a.a) cVar;
            String str = "instrument_active_id";
            str = "expiration_type";
            io.reactivex.e blb = com.iqoption.core.d.EW().b("live-deal-fx-option", com.iqoption.core.microservices.livedeals.response.c.a.class).ec("1.0").i(str, Integer.valueOf(aVar.getActiveId())).i(str, aVar.afU()).HO().HQ().b((io.reactivex.b.l) new c(aVar)).blb();
            kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
            return blb;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected instrument type: ");
        stringBuilder.append(instrumentType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

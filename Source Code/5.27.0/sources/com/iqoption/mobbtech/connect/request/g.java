package com.iqoption.mobbtech.connect.request;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.app.IQApp;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.data.repository.h;
import com.iqoption.core.rx.i;
import com.iqoption.dto.entity.BackCall;
import com.iqoption.dto.entity.result.AvatarResult;
import com.iqoption.fragment.ah;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.util.aj;
import com.iqoption.util.v;
import com.iqoption.vip.j;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* compiled from: QueueInitializedRequests */
public class g {
    private static final String TAG = "com.iqoption.mobbtech.connect.request.g";
    private final WeakReference<ah> dHY;
    private WeakReference<TradeRoomActivity> dHZ = new WeakReference(null);
    private boolean initialized;

    /* compiled from: QueueInitializedRequests */
    private static class a extends com.iqoption.system.c.b<g, com.iqoption.core.microservices.tradingengine.response.active.g.a> {
        public a(g gVar) {
            super(gVar);
        }

        /* renamed from: a */
        public void v(@NonNull g gVar, com.iqoption.core.microservices.tradingengine.response.active.g.a aVar) {
            com.iqoption.app.helpers.a.Gs().a(aVar);
        }

        /* renamed from: a */
        public void c(@NonNull g gVar, Throwable th) {
            com.iqoption.app.helpers.a.Gs().a(null);
        }
    }

    /* compiled from: QueueInitializedRequests */
    private static class b extends com.iqoption.system.c.b<g, Void> {
        public b(g gVar) {
            super(gVar);
        }

        /* renamed from: a */
        public void v(@NonNull g gVar, @NonNull Void voidR) {
            gVar.aPk();
        }

        /* renamed from: a */
        public void c(@NonNull g gVar, Throwable th) {
            gVar.aPk();
        }
    }

    /* compiled from: QueueInitializedRequests */
    private static class c extends com.iqoption.system.c.b<g, com.iqoption.core.microservices.tradingengine.response.a.b> {
        private final InstrumentType type;

        /* renamed from: a */
        public void c(@NonNull g gVar, Throwable th) {
        }

        public c(g gVar, InstrumentType instrumentType) {
            super(gVar);
            this.type = instrumentType;
        }

        /* renamed from: a */
        public void v(@NonNull g gVar, @NonNull com.iqoption.core.microservices.tradingengine.response.a.b bVar) {
            com.iqoption.app.helpers.a.Gs().b(this.type, bVar.aiu());
        }
    }

    /* compiled from: QueueInitializedRequests */
    private static class d extends com.iqoption.system.c.b<g, List<Object>> {
        private final InstrumentType type;

        public d(g gVar, InstrumentType instrumentType) {
            super(gVar);
            this.type = instrumentType;
        }

        /* renamed from: a */
        public void v(@NonNull g gVar, List<Object> list) {
            if (list == null) {
                c(gVar, new NullPointerException("Result is null"));
                return;
            }
            Map map = (Map) list.get(0);
            Map map2 = (Map) list.get(1);
            com.iqoption.app.helpers.a.Gs().a(this.type, map);
            com.iqoption.app.helpers.a.Gs().b(this.type, map2);
        }

        /* renamed from: a */
        public void c(@NonNull g gVar, Throwable th) {
            com.iqoption.app.helpers.a.Gs().a(this.type, null);
            com.iqoption.app.helpers.a.Gs().b(this.type, null);
        }
    }

    /* compiled from: QueueInitializedRequests */
    private static class e extends com.iqoption.system.c.b<g, Map<Integer, com.iqoption.core.microservices.f.a.a.a>> {
        private final InstrumentType type;

        public e(g gVar, InstrumentType instrumentType) {
            super(gVar);
            this.type = instrumentType;
        }

        /* renamed from: a */
        public void v(@NonNull g gVar, Map<Integer, com.iqoption.core.microservices.f.a.a.a> map) {
            if (map != null) {
                com.iqoption.app.helpers.a.Gs().c(this.type, (Map) map);
            }
        }
    }

    /* compiled from: QueueInitializedRequests */
    private static class f extends com.iqoption.system.c.b<g, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> {
        private final InstrumentType type;

        public f(g gVar, InstrumentType instrumentType) {
            super(gVar);
            this.type = instrumentType;
        }

        /* renamed from: a */
        public void v(@NonNull g gVar, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a> map) {
            if (map == null) {
                c(gVar, new NullPointerException("Result is null"));
            } else {
                com.iqoption.app.helpers.a.Gs().a(this.type, (Map) map);
            }
        }

        /* renamed from: a */
        public void c(@NonNull g gVar, Throwable th) {
            com.iqoption.app.helpers.a.Gs().a(this.type, null);
        }
    }

    private static /* synthetic */ void O(Throwable th) {
    }

    private static /* synthetic */ void P(Throwable th) {
    }

    private static /* synthetic */ void aPq() {
    }

    public g(ah ahVar) {
        this.dHY = new WeakReference(ahVar);
    }

    public void f(TradeRoomActivity tradeRoomActivity) {
        this.dHZ = new WeakReference(tradeRoomActivity);
    }

    public void aPe() {
        if (this.initialized) {
            aPg();
        } else {
            aPh();
        }
    }

    private boolean aPf() {
        ah ahVar = (ah) this.dHY.get();
        if (ahVar != null && ahVar.isAdded()) {
            return true;
        }
        aj.aWY();
        return false;
    }

    private void aPg() {
        aPl();
        aPi();
        aPm();
        aPn();
        aPj();
    }

    @SuppressLint({"CheckResult"})
    private void aPh() {
        if (aPf()) {
            com.iqoption.core.data.repository.d.bdF.WT().bkV().blf().b(com.iqoption.core.data.repository.d.WV()).b(i.aki()).a(i.akj()).a(new com.iqoption.core.rx.backoff.a(2)).a(new -$$Lambda$g$0cK3sAHZsS6YZGFH9ffiraBtd2Q(this), -$$Lambda$g$SqTRuIzGCJwcZFW2tVktD-Bmn7U.INSTANCE);
        }
    }

    private void aPi() {
        if (aPf()) {
            v.b(com.iqoption.app.helpers.a.Gs().GI(), new b(this));
        }
    }

    private void aPj() {
        com.iqoption.core.c.a.biN.execute(new -$$Lambda$g$lRq_7-jnkXW8ZR8FiE07YqIpcuA(this));
    }

    private /* synthetic */ void aPr() {
        TradeRoomActivity tradeRoomActivity = (TradeRoomActivity) this.dHZ.get();
        if (tradeRoomActivity != null && !tradeRoomActivity.zO()) {
            j.ejY.K(tradeRoomActivity).initialize();
        }
    }

    private static <T> t<T> g(io.reactivex.e<T> eVar) {
        return com.iqoption.core.rx.g.c(eVar.bkV());
    }

    private void aPk() {
        if (aPf()) {
            t g;
            t g2;
            t g3;
            boolean ep = com.iqoption.app.managers.feature.c.Iw().ep("commission-popup");
            if (com.iqoption.core.features.instrument.b.Xq()) {
                com.iqoption.asset.b.a.awZ.t(InstrumentType.MULTI_INSTRUMENT);
                v.b(g(com.iqoption.asset.b.a.awZ.p(InstrumentType.MULTI_INSTRUMENT)), new e(this, InstrumentType.MULTI_INSTRUMENT));
                v.b(g(com.iqoption.asset.b.a.awZ.n(InstrumentType.MULTI_INSTRUMENT)), new f(this, InstrumentType.MULTI_INSTRUMENT));
            }
            if (com.iqoption.core.features.instrument.b.Xr()) {
                com.iqoption.asset.b.a.awZ.t(InstrumentType.DIGITAL_INSTRUMENT);
                v.b(g(com.iqoption.asset.b.a.awZ.p(InstrumentType.DIGITAL_INSTRUMENT)), new e(this, InstrumentType.DIGITAL_INSTRUMENT));
                v.b(g(com.iqoption.asset.b.a.awZ.n(InstrumentType.DIGITAL_INSTRUMENT)), new f(this, InstrumentType.DIGITAL_INSTRUMENT));
            }
            if (com.iqoption.core.features.instrument.b.Xs()) {
                com.iqoption.asset.b.a.awZ.t(InstrumentType.FX_INSTRUMENT);
                v.b(g(com.iqoption.asset.b.a.awZ.p(InstrumentType.FX_INSTRUMENT)), new e(this, InstrumentType.FX_INSTRUMENT));
                v.b(g(com.iqoption.asset.b.a.awZ.n(InstrumentType.FX_INSTRUMENT)), new f(this, InstrumentType.FX_INSTRUMENT));
            }
            if (com.iqoption.core.features.instrument.b.Xu()) {
                com.iqoption.asset.c.b.axz.t(InstrumentType.CFD_INSTRUMENT);
                com.iqoption.asset.b.a.awZ.t(InstrumentType.CFD_INSTRUMENT);
                v.b(g(com.iqoption.asset.b.a.awZ.p(InstrumentType.CFD_INSTRUMENT)), new e(this, InstrumentType.CFD_INSTRUMENT));
                g = g(com.iqoption.asset.b.a.awZ.n(InstrumentType.CFD_INSTRUMENT));
                g2 = g(com.iqoption.asset.b.a.awZ.q(InstrumentType.CFD_INSTRUMENT));
                g3 = g(com.iqoption.asset.c.b.axz.x(InstrumentType.CFD_INSTRUMENT));
                v.b(p.a(g, g2, g3), new d(this, InstrumentType.CFD_INSTRUMENT));
                if (ep) {
                    v.b(com.iqoption.mobbtech.connect.request.api.e.aa(InstrumentType.CFD_INSTRUMENT), new c(this, InstrumentType.CFD_INSTRUMENT));
                }
            }
            if (com.iqoption.core.features.instrument.b.Xv()) {
                com.iqoption.asset.c.b.axz.t(InstrumentType.FOREX_INSTRUMENT);
                com.iqoption.asset.b.a.awZ.t(InstrumentType.FOREX_INSTRUMENT);
                v.b(g(com.iqoption.asset.b.a.awZ.p(InstrumentType.FOREX_INSTRUMENT)), new e(this, InstrumentType.FOREX_INSTRUMENT));
                g = g(com.iqoption.asset.b.a.awZ.n(InstrumentType.FOREX_INSTRUMENT));
                g2 = g(com.iqoption.asset.b.a.awZ.q(InstrumentType.FOREX_INSTRUMENT));
                g3 = g(com.iqoption.asset.c.b.axz.x(InstrumentType.FOREX_INSTRUMENT));
                v.b(p.a(g, g2, g3), new d(this, InstrumentType.FOREX_INSTRUMENT));
                if (ep) {
                    v.b(com.iqoption.mobbtech.connect.request.api.e.aa(InstrumentType.FOREX_INSTRUMENT), new c(this, InstrumentType.FOREX_INSTRUMENT));
                }
            }
            if (com.iqoption.core.features.instrument.b.Xw()) {
                com.iqoption.asset.c.b.axz.t(InstrumentType.CRYPTO_INSTRUMENT);
                com.iqoption.asset.b.a.awZ.t(InstrumentType.CRYPTO_INSTRUMENT);
                v.b(g(com.iqoption.asset.b.a.awZ.p(InstrumentType.CRYPTO_INSTRUMENT)), new e(this, InstrumentType.CRYPTO_INSTRUMENT));
                g = g(com.iqoption.asset.b.a.awZ.n(InstrumentType.CRYPTO_INSTRUMENT));
                g2 = g(com.iqoption.asset.b.a.awZ.q(InstrumentType.CRYPTO_INSTRUMENT));
                g3 = g(com.iqoption.asset.c.b.axz.x(InstrumentType.CRYPTO_INSTRUMENT));
                v.b(p.a(g, g2, g3), new d(this, InstrumentType.CRYPTO_INSTRUMENT));
                if (ep) {
                    v.b(com.iqoption.mobbtech.connect.request.api.e.aa(InstrumentType.CRYPTO_INSTRUMENT), new c(this, InstrumentType.CRYPTO_INSTRUMENT));
                }
            }
            if (com.iqoption.core.features.instrument.b.Xt()) {
                com.iqoption.asset.b.a.awZ.t(InstrumentType.TURBO_INSTRUMENT);
                com.iqoption.asset.b.a.awZ.t(InstrumentType.BINARY_INSTRUMENT);
                v.b(g(com.iqoption.asset.b.a.awZ.p(InstrumentType.TURBO_INSTRUMENT)), new e(this, InstrumentType.TURBO_INSTRUMENT));
                v.b(g(com.iqoption.asset.b.a.awZ.p(InstrumentType.BINARY_INSTRUMENT)), new e(this, InstrumentType.BINARY_INSTRUMENT));
                v.b(g(h.bet.Xc()), new a(this));
            }
            this.initialized = true;
        }
    }

    private void aPl() {
        if (aPf()) {
            String Ve = IQApp.Ev().Ve();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Ve);
            Ve = "api/v1/avatars/current";
            stringBuilder.append(Ve);
            new com.iqoption.mobbtech.connect.request.a.a.c(AvatarResult.class, RequestManager.a(stringBuilder.toString(), null, IQApp.Eu()), new com.iqoption.mobbtech.connect.a.b<AvatarResult>() {
                public void a(com.iqoption.mobbtech.connect.response.f fVar) {
                }

                /* renamed from: a */
                public void onSuccess(AvatarResult avatarResult) {
                    if (avatarResult != null && avatarResult.getAvatar() != null) {
                        com.iqoption.app.b.DG().a(avatarResult.getAvatar());
                    }
                }
            }, Ve).aPF();
        }
    }

    public void aPm() {
        String Vb = IQApp.Ev().Vb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vb);
        Vb = "api/getcontactinfo";
        stringBuilder.append(Vb);
        new com.iqoption.mobbtech.connect.request.a.a.c(BackCall.class, RequestManager.a(stringBuilder.toString(), null, IQApp.Eu()), new com.iqoption.mobbtech.connect.a.b<BackCall>() {
            public void a(com.iqoption.mobbtech.connect.response.f fVar) {
            }

            /* renamed from: c */
            public void onSuccess(BackCall backCall) {
                if (g.this.dHY.get() != null && ((ah) g.this.dHY.get()).isAdded() && backCall != null) {
                    com.iqoption.app.managers.a.GM().a(backCall);
                }
            }
        }, Vb).aPG();
    }

    private void aPn() {
        if (aPf()) {
            com.iqoption.core.f.b.bEJ.ajY().b(i.aki()).a(-$$Lambda$g$k98NMzIov1DoDFlio3hZLiaG2MQ.INSTANCE, -$$Lambda$g$gBF74yCKtxL6vmH8KYPWoymqvdo.INSTANCE);
        }
    }

    public static t<com.iqoption.mobbtech.connect.response.i> aPo() {
        t<com.iqoption.mobbtech.connect.response.i> bo;
        if (com.iqoption.app.d.Fa().Fz()) {
            boolean Er = com.iqoption.app.d.Fa().Er();
            if (Er) {
                RequestManager.aOR().aOX();
            }
            bo = p.bo(com.iqoption.mobbtech.connect.response.i.eW(Er));
        } else {
            bo = null;
        }
        return bo != null ? bo : p.b(v.a(-$$Lambda$g$yUBkD98C4PAHxRBShO1ESzcYGw8.INSTANCE, "api/regulation"), -$$Lambda$g$bfj_O_j81dk_JGlQ0By4XC2SjZg.INSTANCE, com.iqoption.core.c.a.biN);
    }

    private static /* synthetic */ t aPp() {
        Context Eu = IQApp.Eu();
        String Va = IQApp.Ev().Va();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Va);
        Va = "api/regulation";
        stringBuilder.append(Va);
        return new com.iqoption.mobbtech.connect.request.a.a.b(com.iqoption.mobbtech.connect.response.i.class, RequestManager.a(stringBuilder.toString(), null, Eu), Va).aPF();
    }

    private static /* synthetic */ com.iqoption.mobbtech.connect.response.i c(com.iqoption.mobbtech.connect.response.i iVar) {
        boolean z = iVar.isSuccessful() && iVar.dJa != null && iVar.dJa.dJb != null && iVar.dJa.dJb.booleanValue();
        if (z) {
            RequestManager.aOR().aOX();
            com.iqoption.app.d.Fa().dN(com.iqoption.app.c.asO);
        } else {
            com.iqoption.app.d.Fa().dN(com.iqoption.app.c.asN);
        }
        IQApp.Ex().bt(new com.iqoption.core.b.e(z));
        return iVar;
    }
}

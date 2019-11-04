package com.iqoption.mobbtech.connect.request.api.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.collect.aj;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.core.connect.l;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.e;
import com.iqoption.core.microservices.tradingengine.response.order.TradingOrder.Type;
import com.iqoption.core.microservices.tradingengine.response.order.d;
import com.iqoption.core.microservices.tradingengine.response.position.TPSLKind;
import com.iqoption.core.rx.g;
import com.iqoption.dto.Balance;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.mobbtech.connect.response.options.c;
import com.iqoption.util.v;
import java.util.Set;

/* compiled from: OrderRequests */
public class b extends a {
    private static final String TAG = "com.iqoption.mobbtech.connect.request.api.a.b";
    private static final Set<Long> dIp = Sets.ux();

    /* compiled from: OrderRequests */
    public static class a {
        public final boolean dad;
        public final Position position;

        public a(Position position, boolean z) {
            this.position = position;
            this.dad = z;
        }
    }

    public static boolean z(Long l) {
        return dIp.contains(l);
    }

    public static boolean k(ImmutableList<c> immutableList) {
        boolean z = false;
        if (dIp.isEmpty()) {
            return false;
        }
        aj sK = immutableList.iterator();
        while (sK.hasNext()) {
            c cVar = (c) sK.next();
            if (dIp.contains(cVar.getId())) {
                dIp.remove(cVar.getId());
                z = true;
            }
        }
        return z;
    }

    private b() {
    }

    public static t<com.iqoption.core.microservices.tradingengine.response.order.b> a(Long l, Double d, Double d2, boolean z) {
        return g.c(e.bzn.a(l.longValue(), d, d2, Boolean.valueOf(z), TPSLKind.PRICE));
    }

    public static t<com.iqoption.core.microservices.tradingengine.response.order.a> b(Long l, boolean z) {
        return g.c(e.bzn.b(l.longValue(), z));
    }

    public static t<d> a(int i, String str, InstrumentType instrumentType, long j, long j2, boolean z, double d, int i2, double d2, double d3, double d4, @Nullable Double d5, @Nullable Double d6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Type type) {
        return g.c(e.bzn.a((long) i, str, instrumentType, j, j2, z, d, i2, d2, d3, d4, d5, d6, bool, bool2, type));
    }

    public static t<d> a(com.iqoption.core.microservices.tradingengine.response.instrument.e eVar, int i, double d, long j, boolean z) {
        if (eVar == null) {
            return p.m(new NullPointerException("Strike in null"));
        }
        InstrumentType instrumentType = eVar.getInstrumentType();
        String id = (z ? eVar.aiA() : eVar.aiB()).getId();
        String aPB = com.iqoption.mobbtech.connect.request.a.a.b.aPB();
        long j2 = (long) i;
        com.iqoption.core.analytics.a.b.aZL.a(true, j2, aPB, instrumentType, (long) Balance.getBalanceType(com.iqoption.app.b.DG().f(Long.valueOf(j))));
        String str = "amount";
        str = "leverage";
        return g.c(com.iqoption.core.analytics.a.b.aZL.a(com.iqoption.mobbtech.connect.request.a.a.b.z(d.class).fo(ab(instrumentType)).fp(ac(instrumentType)).fq(com.iqoption.mobbtech.connect.request.api.e.Z(instrumentType)).ch(false).k("user_balance_id", Long.valueOf(j)).k("client_platform_id", Integer.valueOf(17)).k("instrument_id", id).k("instrument_type", instrumentType).k(PendingOrderWrapper.SIDE, Order.BUY).k("type", Order.MARKET).k(str, String.valueOf(d)).k(str, Integer.valueOf(1)).fr(aPB).UB(), instrumentType, j2, aPB));
    }

    public static io.reactivex.p<d> a(com.iqoption.core.microservices.tradingengine.response.instrument.e eVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar, double d, boolean z) {
        Balance DN = com.iqoption.app.b.DG().DN();
        if (eVar == null) {
            return io.reactivex.p.ab(new NullPointerException("Strike in null"));
        }
        if (aVar == null) {
            return io.reactivex.p.ab(new NullPointerException("active null"));
        }
        if (DN == null) {
            return io.reactivex.p.ab(new NullPointerException("balance null"));
        }
        InstrumentType instrumentType = eVar.getInstrumentType();
        String id = (z ? eVar.aiA() : eVar.aiB()).getId();
        String aPB = com.iqoption.mobbtech.connect.request.a.a.b.aPB();
        String str = aPB;
        com.iqoption.core.analytics.a.b.aZL.a(true, (long) aVar.getActiveId(), str, instrumentType, (long) DN.type);
        String str2 = "amount";
        return com.iqoption.core.analytics.a.b.aZL.a(com.iqoption.mobbtech.connect.request.a.a.b.z(d.class).fo("place-multi-option").fq("multi-options").ch(false).k("user_balance_id", Long.valueOf(DN.id)).k("multi_underlying", aVar.agB()).k("instrument_id", id).k(str2, String.valueOf(d)).fr(aPB).UB(), instrumentType, (long) aVar.getActiveId(), str);
    }

    public static io.reactivex.p<d> a(com.iqoption.core.microservices.tradingengine.response.instrument.e eVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar, long j, boolean z) {
        Balance DN = com.iqoption.app.b.DG().DN();
        if (eVar == null) {
            return io.reactivex.p.ab(new NullPointerException("Strike in null"));
        }
        if (aVar == null) {
            return io.reactivex.p.ab(new NullPointerException("active null"));
        }
        if (DN == null) {
            return io.reactivex.p.ab(new NullPointerException("balance null"));
        }
        InstrumentType instrumentType = eVar.getInstrumentType();
        String id = (z ? eVar.aiA() : eVar.aiB()).getId();
        String aPB = com.iqoption.mobbtech.connect.request.a.a.b.aPB();
        com.iqoption.core.analytics.a.b.aZL.a(true, (long) aVar.getActiveId(), aPB, instrumentType, (long) DN.type);
        return com.iqoption.core.analytics.a.b.aZL.a(com.iqoption.mobbtech.connect.request.a.a.b.z(d.class).fo("add-multi-option").fq("multi-options").ch(false).k("multi_option_id", Long.valueOf(j)).k("instrument_id", id).fr(aPB).UB(), instrumentType, (long) aVar.getActiveId(), aPB);
    }

    public static t<Order> k(final Position position) {
        dIl.add(position.getId());
        final com.iqoption.core.analytics.a Ut = com.iqoption.core.analytics.a.b.aZL.Ut();
        t UA = com.iqoption.mobbtech.connect.request.a.a.b.z(Order.class).ch(false).fq(com.iqoption.mobbtech.connect.request.api.e.Z(position.getInstrumentType())).fo("close-position").k(PendingOrderWrapper.POSITION_ID, position.getId()).UA();
        v.b(UA, new o<Order>() {
            /* renamed from: n */
            public void onSuccess(Order order) {
                com.iqoption.core.analytics.a.b.aZL.a(Ut, (long) position.getActiveId(), position.getId().longValue());
                a.dIl.remove(position.getId());
                IQApp.Ex().bd(new a(position, false));
            }

            public void l(Throwable th) {
                if (th instanceof l) {
                    l lVar = (l) th;
                    com.iqoption.core.analytics.a.b.aZL.a(Ut, (long) position.getActiveId(), lVar.getMessage(), Integer.valueOf(lVar.getCode()));
                } else {
                    com.iqoption.core.analytics.a.b.aZL.a(Ut, (long) position.getActiveId(), "", Integer.valueOf(0));
                }
                a.dIl.remove(position.getId());
                IQApp.Ex().bd(new a(position, true));
                com.iqoption.app.a.b.aQ(IQApp.Eu());
            }
        });
        return UA;
    }

    @NonNull
    private static String ab(@NonNull InstrumentType instrumentType) {
        return (instrumentType == InstrumentType.DIGITAL_INSTRUMENT && com.iqoption.app.managers.feature.c.Iw().ej("digital-ms")) ? "place-digital-option" : "place-order-temp";
    }

    @NonNull
    private static String ac(@NonNull InstrumentType instrumentType) {
        return (instrumentType == InstrumentType.DIGITAL_INSTRUMENT && com.iqoption.app.managers.feature.c.Iw().ej("digital-ms")) ? "1.0" : "3.0";
    }

    public static boolean l(ImmutableList<c> immutableList) {
        aj sK = immutableList.iterator();
        boolean z = false;
        while (sK.hasNext()) {
            Position position = (Position) ((c) sK.next());
            if (!a.y(position.getId())) {
                k(position);
                z = true;
            }
            dIp.add(position.getId());
        }
        return z;
    }

    public static t<d> A(Long l) {
        return com.iqoption.mobbtech.connect.request.a.a.b.z(d.class).ch(false).fo("cancel-order").k("order_id", l).UA();
    }
}

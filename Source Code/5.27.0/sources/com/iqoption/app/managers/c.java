package com.iqoption.app.managers;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.aj;
import com.google.common.collect.s;
import com.google.common.util.concurrent.aa;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.k;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.ToastEntity;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.dto.entity.position.PositionAndOrder;
import com.iqoption.dto.entity.position.PositionItem;
import com.iqoption.dto.entity.position.result.DeferredOrdersResult;
import com.iqoption.dto.entity.position.result.PositionsResult;
import com.iqoption.dto.entity.result.BuybackResult;
import com.iqoption.fragment.ah;
import com.iqoption.gl.NativeHandler;
import com.iqoption.mobbtech.connect.request.api.Requests;
import com.iqoption.mobbtech.connect.request.api.Requests.OptionType;
import com.iqoption.mobbtech.connect.response.ArrayBuybackResponse;
import com.iqoption.mobbtech.connect.response.options.OptionEvents;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.TYPE_REMOVE_GROUP;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.j;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.m;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.p;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.q;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.ai;
import com.iqoption.util.v;
import com.iqoption.x.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: OptionManager */
public class c {
    private static final String TAG = "com.iqoption.app.managers.c";
    private static final n<c> atE = Suppliers.a(-$$Lambda$c$E7_xT1BYls6KfnZcHnAIJs-CEqI.INSTANCE);
    private t<List<Object>> atF;
    private boolean atG;
    private volatile boolean atH;
    private volatile aa<Void> atI = aa.vM();
    private final b atJ = new b(this, null);
    private final g atK = new g(this, null);
    private final ConcurrentSkipListMap<com.iqoption.mobbtech.connect.response.options.d, com.iqoption.mobbtech.connect.response.options.b> atL = new ConcurrentSkipListMap(com.iqoption.mobbtech.connect.response.options.d.dJA);
    private final ConcurrentSkipListMap<com.iqoption.mobbtech.connect.response.options.d, com.iqoption.mobbtech.connect.response.options.a> atM = new ConcurrentSkipListMap(com.iqoption.mobbtech.connect.response.options.d.dJB);
    private final ConcurrentSkipListMap<com.iqoption.mobbtech.connect.response.options.d, com.iqoption.mobbtech.connect.response.options.b> atN = new ConcurrentSkipListMap(com.iqoption.mobbtech.connect.response.options.d.dJA);
    private final ConcurrentMap<com.iqoption.mobbtech.connect.response.options.d, com.iqoption.mobbtech.connect.response.c> atO = Maps.ul();
    private final ConcurrentMap<com.iqoption.mobbtech.connect.response.d.a, com.iqoption.mobbtech.connect.response.d> atP = Maps.ul();
    private final ConcurrentMap<com.iqoption.core.microservices.tradingengine.response.a.b, com.iqoption.core.microservices.tradingengine.response.a> atQ = Maps.ul();
    private final ConcurrentMap<Integer, ActiveQuote> atR = Maps.ul();
    private final com.iqoption.util.a.a<Order> atS = new com.iqoption.util.a.a();
    private final Map<com.iqoption.core.microservices.pricing.a.a, f> atT = Maps.uk();
    private final ConcurrentHashMap<Long, com.iqoption.util.a.a<Order>> atU = new ConcurrentHashMap();
    private final ConcurrentLinkedQueue<OptionEvents> atV = new ConcurrentLinkedQueue();
    private ScheduledFuture<?> atW;
    private ScheduledFuture<?> atX;
    private final g atY = new g(new com.iqoption.app.managers.g.a() {
        public void Hj() {
            c.this.atJ.register();
            c.this.atK.register();
            c cVar = c.this;
            cVar.atW = cVar.singleThreadExecutor.scheduleAtFixedRate(new -$$Lambda$c$1$qdMwPzithbBst3bUmFGJzWYp54s(this), 5000, 5000, TimeUnit.MILLISECONDS);
            cVar = c.this;
            cVar.atX = cVar.singleThreadExecutor.scheduleAtFixedRate(new -$$Lambda$c$1$YjWRC6F6C68YOFgZTxQSe8aVoNk(this), 300, 300, TimeUnit.MILLISECONDS);
            c.this.update();
            com.iqoption.view.a.b.aYv().a(c.this.atZ, Integer.valueOf(5));
        }

        private /* synthetic */ void Hm() {
            c.this.GY();
        }

        private /* synthetic */ void Hl() {
            c.this.Hd();
        }

        public void Hk() {
            com.iqoption.view.a.b.aYv().b(c.this.atZ);
            if (c.this.atW != null) {
                c.this.atW.cancel(true);
            }
            if (c.this.atX != null) {
                c.this.atX.cancel(true);
            }
            c.this.atJ.unregister();
            c.this.atK.unregister();
        }
    });
    private com.iqoption.view.a.b.a atZ = new -$$Lambda$c$2FEsKHgBe1GRo6chqKCblK2ED4g(this);
    private final Runnable aua = new -$$Lambda$c$FVGdAFAoTM0Lhj3EWPa6t3tFVzg(this);
    private h aub = new h();
    private final Runnable auc = new Runnable() {
        public void run() {
            aj sK = c.this.GU().iterator();
            double d = 0.0d;
            double d2 = 0.0d;
            double d3 = d2;
            while (sK.hasNext()) {
                com.iqoption.mobbtech.connect.response.options.b bVar = (com.iqoption.mobbtech.connect.response.options.b) sK.next();
                d += bVar.getSellPnl();
                d2 += bVar.getInvestSum();
                d3 += bVar.aQc();
            }
            double d4 = (d / d2) * 100.0d;
            if (!c.this.aub.b(d, d4, d2, d3)) {
                IQApp.Ex().bd(c.this.aub.a(d, d4, d2, d3));
            }
        }
    };
    private final Context cO = IQApp.Eu();
    private final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();

    /* compiled from: OptionManager */
    class f {
        private int counter;
        private final io.reactivex.disposables.b disposable;

        static /* synthetic */ int b(f fVar) {
            int i = fVar.counter + 1;
            fVar.counter = i;
            return i;
        }

        static /* synthetic */ int d(f fVar) {
            int i = fVar.counter - 1;
            fVar.counter = i;
            return i;
        }

        f(io.reactivex.disposables.b bVar) {
            this.disposable = bVar;
        }
    }

    /* compiled from: OptionManager */
    public static final class h {
        private volatile double auf;
        private volatile double aug;
        private volatile double auh;
        private volatile double aui;

        private h a(double d, double d2, double d3, double d4) {
            this.auf = d;
            this.aug = d2;
            this.auh = d3;
            this.aui = d4;
            return this;
        }

        public boolean b(double d, double d2, double d3, double d4) {
            return com.google.common.c.a.b(this.auf, d, 0.01d) && com.google.common.c.a.b(this.aug, d2, 0.01d) && com.google.common.c.a.b(this.auh, d3, 0.01d) && com.google.common.c.a.b(this.aui, d4, 0.01d);
        }

        public double Hp() {
            return this.auf;
        }

        public double getInvest() {
            return this.auh;
        }

        public double Hq() {
            return (this.auh + this.auf) + this.aui;
        }
    }

    /* compiled from: OptionManager */
    private class b extends com.iqoption.system.a.d {
        private final com.google.common.base.d<BuybackResult, Pair<BuybackResult, com.iqoption.mobbtech.connect.response.options.d>> aue;

        private b() {
            this.aue = -$$Lambda$c$b$8sGx4m_0teZKwmJqNEHvXtXPgkQ.INSTANCE;
        }

        /* synthetic */ b(c cVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @com.google.common.b.e
        public void onMapBuybackResponse(ArrayBuybackResponse.Map map) {
            if (map != null) {
                c.this.singleThreadExecutor.execute(new -$$Lambda$c$b$oeeQMsYyYviFmrqWPjk5Bvyek7o(this, map));
            }
        }

        @com.google.common.b.e
        public void onTabChanged(k kVar) {
            c.this.He();
        }
    }

    /* compiled from: OptionManager */
    private class c implements o<List<com.iqoption.mobbtech.connect.response.options.e>> {
        public void l(Throwable th) {
        }

        private c() {
        }

        /* synthetic */ c(c cVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: B */
        public void onSuccess(List<com.iqoption.mobbtech.connect.response.options.e> list) {
            if (list != null) {
                for (com.iqoption.mobbtech.connect.response.options.e eVar : list) {
                    long DH = com.iqoption.app.b.aK(IQApp.Eu()).DH();
                    if (eVar.userBalanceId == null || eVar.userBalanceId.equals(Long.valueOf(DH))) {
                        for (com.iqoption.mobbtech.connect.response.options.c cVar : eVar.aTU) {
                            cVar.getOptionKey();
                            double currentTimeMillis = (double) System.currentTimeMillis();
                            Double.isNaN(currentTimeMillis);
                            cVar.timeRecieved = Double.valueOf(currentTimeMillis / 1000.0d);
                            c.this.c(cVar);
                        }
                        for (com.iqoption.mobbtech.connect.response.options.a a : eVar.dJD) {
                            c.this.a(a);
                        }
                        if (!eVar.aTU.isEmpty() || !eVar.dJD.isEmpty()) {
                            com.iqoption.analytics.a.BN();
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: OptionManager */
    private class g extends com.iqoption.system.a.f {
        private g() {
        }

        /* synthetic */ g(c cVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @com.google.common.b.e
        public void onChangeBalanceId(com.iqoption.service.e.a aVar) {
            c.this.singleThreadExecutor.execute(new -$$Lambda$c$g$KQEK1gx9O7_QC0o2R73skRuKOec(this));
        }

        private /* synthetic */ void Ho() {
            c.this.clear();
            c.this.update();
        }

        @com.google.common.b.e
        public void onOpenWebSocket(com.iqoption.service.e.f fVar) {
            c.this.singleThreadExecutor.execute(new -$$Lambda$c$g$49B-MqMpCzJPSu4OTXTEfFW56Nw(this));
        }

        private /* synthetic */ void Hn() {
            c.this.clear();
            c.this.update();
        }
    }

    /* compiled from: OptionManager */
    private final class i implements o<List<Object>> {
        private i() {
        }

        /* synthetic */ i(c cVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: B */
        public void onSuccess(List<Object> list) {
            Hr();
        }

        public void l(@NonNull Throwable th) {
            if (!(th instanceof CancellationException) || c.this.atF.isCancelled()) {
                fail();
            }
        }

        private void Hr() {
            c.this.atG = false;
            p pVar = new p();
            pVar.setValue(Boolean.valueOf(true));
            c.this.atV.add(pVar);
            c.this.GW();
            c.this.atH = true;
            c.this.atI.set(null);
            c.this.atI = aa.vM();
        }

        private void fail() {
            c.this.atG = true;
            p pVar = new p();
            pVar.setValue(Boolean.valueOf(false));
            c.this.atV.add(pVar);
            c.this.atH = true;
            c.this.atI.set(null);
            c.this.atI = aa.vM();
            c.this.clear();
        }
    }

    /* compiled from: OptionManager */
    private class a extends com.iqoption.system.c.a<List<DeferredOrdersResult>> {
        private a() {
        }

        /* synthetic */ a(c cVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: B */
        public void onSuccess(List<DeferredOrdersResult> list) {
            if (list != null) {
                List arrayList = new ArrayList();
                for (DeferredOrdersResult deferredOrdersResult : list) {
                    if (deferredOrdersResult != null) {
                        if (!com.iqoption.util.g.isEmpty(deferredOrdersResult.deferredOrders)) {
                            Iterator it = deferredOrdersResult.deferredOrders.iterator();
                            while (it.hasNext()) {
                                Order order = (Order) it.next();
                                if (Order.isDeferredOrder(order)) {
                                    arrayList.add(order);
                                }
                            }
                        }
                    }
                }
                c.this.y(arrayList);
            }
        }
    }

    /* compiled from: OptionManager */
    private class d extends com.iqoption.system.c.a<List<Position>> {
        private d() {
        }

        /* synthetic */ d(c cVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: B */
        public void onSuccess(List<Position> list) {
            if (list != null) {
                long DH = com.iqoption.app.b.DG().DH();
                for (com.iqoption.mobbtech.connect.response.options.c cVar : list) {
                    if (cVar.getUserBalanceId() == DH) {
                        c.this.f(cVar);
                    } else {
                        return;
                    }
                }
                if (!list.isEmpty()) {
                    com.iqoption.analytics.a.BN();
                }
            }
        }
    }

    /* compiled from: OptionManager */
    private class e extends com.iqoption.system.c.a<List<PositionsResult>> {
        private e() {
        }

        /* synthetic */ e(c cVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: B */
        public void onSuccess(List<PositionsResult> list) {
            if (list != null) {
                for (PositionsResult positionsResult : list) {
                    if (positionsResult != null) {
                        if (!com.iqoption.util.g.isEmpty(positionsResult.positions)) {
                            com.google.common.collect.ImmutableList.a sT = ImmutableList.sT();
                            Iterator it = positionsResult.positions.iterator();
                            while (it.hasNext()) {
                                com.iqoption.mobbtech.connect.response.options.c cVar = (PositionAndOrder) it.next();
                                sT.e(cVar.getOrders());
                                double currentTimeMillis = (double) System.currentTimeMillis();
                                Double.isNaN(currentTimeMillis);
                                cVar.timeRecieved = Double.valueOf(currentTimeMillis / 1000.0d);
                                c.this.c(cVar);
                            }
                            aj sK = sT.sU().iterator();
                            while (sK.hasNext()) {
                                Order order = (Order) sK.next();
                                if (Order.isTpslOrder(order)) {
                                    c.this.g(order);
                                }
                            }
                            if (!positionsResult.positions.isEmpty()) {
                                com.iqoption.analytics.a.BN();
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean j(long j, long j2) {
        return j != -1 && (j * 1000) + 60000 < j2;
    }

    private static /* synthetic */ void p(Throwable th) {
    }

    private void a(Order order) {
        if (order != null) {
            if ((this.atS.ct(order) == null ? 1 : null) != null) {
                IQApp.Ex().bd(new com.iqoption.mobbtech.connect.response.options.OptionEvents.d().setValue(order));
            }
            IQApp.Ex().bd(new com.iqoption.mobbtech.connect.response.options.OptionEvents.c());
            GW();
        }
    }

    private void y(List<Order> list) {
        if (list != null) {
            this.atS.addAll(list);
            IQApp.Ex().bd(new com.iqoption.mobbtech.connect.response.options.OptionEvents.c());
        }
    }

    private boolean b(Order order) {
        boolean z = false;
        if (order == null) {
            return false;
        }
        if (this.atS.remove(order) != null) {
            z = true;
        }
        if (z) {
            IQApp.Ex().bd(new com.iqoption.mobbtech.connect.response.options.OptionEvents.c());
        }
        return z;
    }

    public ImmutableList<Order> GQ() {
        return ImmutableList.m(this.atS.aXc());
    }

    public ImmutableList<Order> GR() {
        com.google.common.collect.ImmutableList.a sT = ImmutableList.sT();
        for (com.iqoption.util.a.a aXc : this.atU.values()) {
            sT.e(aXc.aXc());
        }
        return sT.sU();
    }

    public ImmutableList<Order> j(Long l) {
        com.iqoption.util.a.a aVar = (com.iqoption.util.a.a) this.atU.get(l);
        if (aVar == null) {
            return ImmutableList.sQ();
        }
        return ImmutableList.m(aVar.aXc());
    }

    public ImmutableList<Order> k(Long l) {
        com.iqoption.util.a.a aVar = (com.iqoption.util.a.a) this.atU.remove(l);
        if (aVar == null) {
            return ImmutableList.sQ();
        }
        return ImmutableList.m(aVar.aXc());
    }

    private Order c(Order order) {
        com.iqoption.util.a.a aVar = (com.iqoption.util.a.a) this.atU.get(order.getPositionId());
        if (aVar == null) {
            aVar = new com.iqoption.util.a.a();
            this.atU.put(order.getPositionId(), aVar);
        }
        if (!a(aVar, order)) {
            return null;
        }
        aVar.ct(order);
        return order;
    }

    private boolean a(com.iqoption.util.a.a<Order> aVar, Order order) {
        Order order2 = (Order) aVar.get(order);
        boolean z = true;
        if (order2 == null) {
            return true;
        }
        if (order2.getIndex() > order.getIndex()) {
            z = false;
        }
        return z;
    }

    private Order d(Order order) {
        com.iqoption.util.a.a aVar = (com.iqoption.util.a.a) this.atU.get(order.getPositionId());
        if (aVar != null) {
            aVar.remove(order);
        }
        return order;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    private void e(com.iqoption.dto.entity.position.Order r5) {
        /*
        r4 = this;
        r0 = r5.getStatus();
        r1 = r0.hashCode();
        r2 = -123173735; // 0xfffffffff8a88499 float:-2.7343602E34 double:NaN;
        r3 = 1;
        if (r1 == r2) goto L_0x001e;
    L_0x000e:
        r2 = 108960; // 0x1a9a0 float:1.52685E-40 double:5.38334E-319;
        if (r1 == r2) goto L_0x0014;
    L_0x0013:
        goto L_0x0028;
    L_0x0014:
        r1 = "new";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0028;
    L_0x001c:
        r0 = 0;
        goto L_0x0029;
    L_0x001e:
        r1 = "canceled";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0028;
    L_0x0026:
        r0 = 1;
        goto L_0x0029;
    L_0x0028:
        r0 = -1;
    L_0x0029:
        if (r0 == 0) goto L_0x0032;
    L_0x002b:
        if (r0 == r3) goto L_0x002e;
    L_0x002d:
        goto L_0x0035;
    L_0x002e:
        r4.b(r5);
        goto L_0x0035;
    L_0x0032:
        r4.a(r5);
    L_0x0035:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.managers.c.e(com.iqoption.dto.entity.position.Order):void");
    }

    private void f(Order order) {
        if (!"new".equals(order.getExecuteStatus())) {
            return;
        }
        if (b(order)) {
            IQApp.Ex().bd(new com.iqoption.mobbtech.connect.response.options.OptionEvents.e().setValue(order));
        } else {
            j(c(order));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    private void g(com.iqoption.dto.entity.position.Order r5) {
        /*
        r4 = this;
        r0 = r5.getStatus();
        r1 = r0.hashCode();
        r2 = -123173735; // 0xfffffffff8a88499 float:-2.7343602E34 double:NaN;
        r3 = 1;
        if (r1 == r2) goto L_0x001e;
    L_0x000e:
        r2 = 108960; // 0x1a9a0 float:1.52685E-40 double:5.38334E-319;
        if (r1 == r2) goto L_0x0014;
    L_0x0013:
        goto L_0x0028;
    L_0x0014:
        r1 = "new";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0028;
    L_0x001c:
        r0 = 0;
        goto L_0x0029;
    L_0x001e:
        r1 = "canceled";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0028;
    L_0x0026:
        r0 = 1;
        goto L_0x0029;
    L_0x0028:
        r0 = -1;
    L_0x0029:
        if (r0 == 0) goto L_0x0036;
    L_0x002b:
        if (r0 == r3) goto L_0x002e;
    L_0x002d:
        goto L_0x0054;
    L_0x002e:
        r5 = r4.d(r5);
        k(r5);
        goto L_0x0054;
    L_0x0036:
        r0 = r4.b(r5);
        if (r0 != 0) goto L_0x0044;
    L_0x003c:
        r5 = r4.c(r5);
        j(r5);
        goto L_0x0054;
    L_0x0044:
        r0 = com.iqoption.app.IQApp.Ex();
        r1 = new com.iqoption.mobbtech.connect.response.options.OptionEvents$e;
        r1.<init>();
        r5 = r1.setValue(r5);
        r0.bd(r5);
    L_0x0054:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.managers.c.g(com.iqoption.dto.entity.position.Order):void");
    }

    private void h(Order order) {
        if (order.getInstrumentType() != null) {
            IQApp.Ex().bd(new com.iqoption.mobbtech.connect.response.options.OptionEvents.f(order));
        }
    }

    private c() {
    }

    public static c GS() {
        return (c) atE.get();
    }

    public void initialize() {
        this.atY.start();
    }

    private /* synthetic */ void ak(long j) {
        He();
        Hh();
    }

    public ImmutableList<com.iqoption.mobbtech.connect.response.options.a> GT() {
        return ImmutableList.m(this.atM.values());
    }

    public ImmutableList<com.iqoption.mobbtech.connect.response.options.b> GU() {
        return ImmutableList.m(this.atL.values());
    }

    public Iterable<com.iqoption.mobbtech.connect.response.options.b> l(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return s.a(GU(), new -$$Lambda$c$eRLHLMrvDKORzchA7xxKyhCah9g(aVar.getActiveId(), aVar.getInstrumentType()));
    }

    @Nullable
    public com.iqoption.mobbtech.connect.response.options.b a(com.iqoption.mobbtech.connect.response.options.d dVar) {
        com.iqoption.mobbtech.connect.response.options.b bVar = dVar == null ? null : (com.iqoption.mobbtech.connect.response.options.b) this.atL.get(dVar);
        return bVar != null ? bVar.aPY() : bVar;
    }

    public boolean b(com.iqoption.mobbtech.connect.response.options.d dVar) {
        return this.atL.containsKey(dVar) ^ 1;
    }

    public boolean GV() {
        return this.atL.isEmpty();
    }

    private void GW() {
        com.iqoption.m.a aTn = WebSocketHandler.aTn();
        if (aTn.DR()) {
            WebSocketHandler.a(aTn);
        }
    }

    public void update() {
        if (WebSocketHandler.aTn().DR()) {
            long DH = com.iqoption.app.b.aK(this.cO).DH();
            if (!(DH == -1 || Ha())) {
                this.atH = false;
                IQApp.Ex().bd(new q());
                t ag = ag(DH);
                t ai = ai(DH);
                t ah = ah(DH);
                t aj = aj(DH);
                ArrayList arrayList = new ArrayList();
                if (ag != null) {
                    arrayList.add(ag);
                }
                if (ai != null) {
                    arrayList.add(ai);
                }
                if (aj != null) {
                    arrayList.add(aj);
                }
                if (ah != null) {
                    arrayList.add(ah);
                }
                if (arrayList.isEmpty()) {
                    this.atH = true;
                    this.atI.set(null);
                    this.atI = aa.vM();
                } else {
                    this.atF = com.google.common.util.concurrent.p.B(arrayList);
                    com.google.common.util.concurrent.p.a(this.atF, new i(this, null), this.singleThreadExecutor);
                }
            }
        }
    }

    public t<?> ag(long j) {
        if (!com.iqoption.core.features.instrument.b.Xt()) {
            return null;
        }
        t a = Requests.a(this.cO, OptionType.turbo, 100, j);
        t a2 = Requests.a(this.cO, OptionType.binary, 100, j);
        t<?> a3 = com.google.common.util.concurrent.p.a(a, a2);
        com.google.common.util.concurrent.p.a(a3, new c(this, null), this.singleThreadExecutor);
        return a3;
    }

    public t<?> ah(long j) {
        ArrayList arrayList = new ArrayList();
        if (com.iqoption.core.features.instrument.b.Xu()) {
            arrayList.add(com.iqoption.mobbtech.connect.request.api.e.b(j, InstrumentType.CFD_INSTRUMENT));
        }
        if (com.iqoption.core.features.instrument.b.Xv()) {
            arrayList.add(com.iqoption.mobbtech.connect.request.api.e.b(j, InstrumentType.FOREX_INSTRUMENT));
        }
        if (com.iqoption.core.features.instrument.b.Xw()) {
            arrayList.add(com.iqoption.mobbtech.connect.request.api.e.b(j, InstrumentType.CRYPTO_INSTRUMENT));
        }
        t B = com.google.common.util.concurrent.p.B(arrayList);
        com.google.common.util.concurrent.p.a(B, new a(this, null), this.singleThreadExecutor);
        return B;
    }

    public t<?> ai(long j) {
        ArrayList arrayList = new ArrayList();
        if (com.iqoption.core.features.instrument.b.Xq()) {
            arrayList.add(com.iqoption.mobbtech.connect.request.api.e.a(j, InstrumentType.MULTI_INSTRUMENT));
        }
        if (com.iqoption.core.features.instrument.b.Xr()) {
            arrayList.add(com.iqoption.mobbtech.connect.request.api.e.a(j, InstrumentType.DIGITAL_INSTRUMENT));
        }
        if (com.iqoption.core.features.instrument.b.Xu()) {
            arrayList.add(com.iqoption.mobbtech.connect.request.api.e.a(j, InstrumentType.CFD_INSTRUMENT));
        }
        if (com.iqoption.core.features.instrument.b.Xv()) {
            arrayList.add(com.iqoption.mobbtech.connect.request.api.e.a(j, InstrumentType.FOREX_INSTRUMENT));
        }
        if (com.iqoption.core.features.instrument.b.Xw()) {
            arrayList.add(com.iqoption.mobbtech.connect.request.api.e.a(j, InstrumentType.CRYPTO_INSTRUMENT));
        }
        if (com.iqoption.core.features.instrument.b.Xs()) {
            arrayList.add(com.iqoption.mobbtech.connect.request.api.e.a(j, InstrumentType.FX_INSTRUMENT));
        }
        t B = com.google.common.util.concurrent.p.B(arrayList);
        com.google.common.util.concurrent.p.a(B, new e(this, null), this.singleThreadExecutor);
        return B;
    }

    public t<?> aj(long j) {
        List arrayList = new ArrayList();
        if (com.iqoption.core.features.instrument.b.Xq()) {
            arrayList.add(InstrumentType.MULTI_INSTRUMENT);
        }
        if (com.iqoption.core.features.instrument.b.Xr()) {
            arrayList.add(InstrumentType.DIGITAL_INSTRUMENT);
        }
        if (com.iqoption.core.features.instrument.b.Xs()) {
            arrayList.add(InstrumentType.FX_INSTRUMENT);
        }
        if (com.iqoption.core.features.instrument.b.Xu()) {
            arrayList.add(InstrumentType.CFD_INSTRUMENT);
        }
        if (com.iqoption.core.features.instrument.b.Xv()) {
            arrayList.add(InstrumentType.FOREX_INSTRUMENT);
        }
        if (com.iqoption.core.features.instrument.b.Xw()) {
            arrayList.add(InstrumentType.CRYPTO_INSTRUMENT);
        }
        t d = d(com.iqoption.mobbtech.connect.request.api.e.a(j, arrayList));
        com.google.common.util.concurrent.p.a(d, new d(this, null), this.singleThreadExecutor);
        return d;
    }

    public void clear() {
        IQApp.Ex().bd(this.aub.a(0.0d, 0.0d, 0.0d, 0.0d));
        if (Ha()) {
            this.atF.cancel(true);
        }
        this.atF = null;
        GX();
        this.atO.clear();
        this.atP.clear();
        this.atQ.clear();
        this.atU.clear();
        this.atS.clear();
        this.atL.clear();
        this.atM.clear();
        this.atN.clear();
        Hc();
    }

    private void GX() {
        for (Entry entry : this.atL.entrySet()) {
            com.iqoption.mobbtech.connect.response.options.d dVar = (com.iqoption.mobbtech.connect.response.options.d) entry.getKey();
            int i = AnonymousClass4.$SwitchMap$com$iqoption$core$data$model$InstrumentType[dVar.getInstrumentType().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                aj sK = ((com.iqoption.mobbtech.connect.response.options.b) entry.getValue()).aPX().iterator();
                while (sK.hasNext()) {
                    b((Position) ((com.iqoption.mobbtech.connect.response.options.c) sK.next()));
                }
            } else if (i == 4 || i == 5) {
                d(dVar);
            }
        }
    }

    private void a(com.iqoption.mobbtech.connect.response.options.c cVar) {
        int i = AnonymousClass4.$SwitchMap$com$iqoption$core$data$model$InstrumentType[cVar.getInstrumentType().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            a((Position) cVar);
        } else if (i == 4 || i == 5) {
            c(cVar.getOptionKey());
        }
    }

    private void b(com.iqoption.mobbtech.connect.response.options.c cVar) {
        int i = AnonymousClass4.$SwitchMap$com$iqoption$core$data$model$InstrumentType[cVar.getInstrumentType().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            b((Position) cVar);
        } else if (i == 4 || i == 5) {
            d(cVar.getOptionKey());
        }
    }

    private void c(com.iqoption.mobbtech.connect.response.options.d dVar) {
        com.iqoption.mobbtech.connect.response.d.a b = com.iqoption.mobbtech.connect.response.d.b(dVar.aiq(), dVar.aQd());
        j.a(true, b);
        b.recycle();
    }

    private void d(com.iqoption.mobbtech.connect.response.options.d dVar) {
        com.iqoption.mobbtech.connect.response.d.a e = com.iqoption.mobbtech.connect.response.d.e(dVar);
        if (j.a(false, e)) {
            this.atP.remove(e);
        }
        e.recycle();
    }

    private void a(Position position) {
        InstrumentType instrumentType = position.getInstrumentType();
        int groupId = com.iqoption.app.b.DG().getGroupId();
        if (instrumentType == InstrumentType.MULTI_INSTRUMENT) {
            Iterator it = position.getPositionItems().iterator();
            while (it.hasNext()) {
                PositionItem positionItem = (PositionItem) it.next();
                a(true, positionItem.spotLowerInstrumentId(), InstrumentType.DIGITAL_INSTRUMENT, groupId);
                a(true, positionItem.spotUpperInstrumentId(), InstrumentType.DIGITAL_INSTRUMENT, groupId);
            }
        } else if (position.isSpotStrike()) {
            a(true, position.spotLowerInstrumentId(), instrumentType, groupId);
            a(true, position.spotUpperInstrumentId(), instrumentType, groupId);
        } else {
            a(true, position.getInstrumentId(), instrumentType, groupId);
        }
    }

    private void b(Position position) {
        InstrumentType instrumentType = position.getInstrumentType();
        int groupId = com.iqoption.app.b.DG().getGroupId();
        if (instrumentType == InstrumentType.MULTI_INSTRUMENT) {
            Iterator it = position.getPositionItems().iterator();
            while (it.hasNext()) {
                PositionItem positionItem = (PositionItem) it.next();
                a(false, positionItem.spotLowerInstrumentId(), InstrumentType.DIGITAL_INSTRUMENT, groupId);
                a(false, positionItem.spotUpperInstrumentId(), InstrumentType.DIGITAL_INSTRUMENT, groupId);
            }
        } else if (position.isSpotStrike()) {
            a(false, position.spotLowerInstrumentId(), instrumentType, groupId);
            a(false, position.spotUpperInstrumentId(), instrumentType, groupId);
        } else {
            a(false, position.getInstrumentId(), instrumentType, groupId);
        }
    }

    public synchronized void a(boolean z, String str, InstrumentType instrumentType, int i) {
        com.iqoption.core.microservices.pricing.a.a aVar = new com.iqoption.core.microservices.pricing.a.a(str, instrumentType, (long) i);
        f fVar = (f) this.atT.get(aVar);
        if (z) {
            if (fVar == null || fVar.counter == 0) {
                fVar = new f(com.iqoption.core.microservices.tradingengine.e.a(aVar).d(com.iqoption.core.rx.i.aki()).a(new -$$Lambda$OFWe73rS7Ekodnb9k___GS5I8Sk(this), -$$Lambda$c$_oL--V1BTpzsWtiFKFpzcHFjbUw.INSTANCE));
                this.atT.put(aVar, fVar);
            }
            f.b(fVar);
        } else if (fVar != null) {
            if (fVar.counter == 1) {
                if (!(fVar.disposable == null || fVar.disposable.isDisposed())) {
                    fVar.disposable.dispose();
                }
                this.atT.remove(aVar);
            }
            f.d(fVar);
        }
    }

    private boolean a(com.iqoption.mobbtech.connect.response.options.d dVar, long j) {
        com.iqoption.mobbtech.connect.response.options.c bX;
        com.iqoption.mobbtech.connect.response.options.b bVar = (com.iqoption.mobbtech.connect.response.options.b) this.atL.get(dVar);
        com.iqoption.mobbtech.connect.response.options.b bVar2 = (com.iqoption.mobbtech.connect.response.options.b) this.atN.get(dVar);
        boolean z = false;
        if (bVar != null) {
            bX = bVar.bX(j);
            if (bX != null) {
                z = true;
                if (bVar2 == null) {
                    bVar2 = new com.iqoption.mobbtech.connect.response.options.b(bX);
                    this.atN.put(dVar, bVar2);
                } else if (!bVar2.aPX().contains(bX)) {
                    bVar2.s(bX);
                }
                if (bVar.isEmpty()) {
                    this.atL.remove(bVar.getOptionKey());
                    this.atN.remove(dVar);
                    this.atV.add(new OptionEvents.k(GU(), bVar2, TYPE_REMOVE_GROUP.SELL));
                    Hd();
                }
                b(bX);
            }
        } else {
            bX = null;
        }
        if (z && !bVar.isEmpty()) {
            this.atV.add(new j(GU(), bVar, bX));
        }
        return z;
    }

    private void GY() {
        long GZ = GZ();
        ArrayList<com.iqoption.mobbtech.connect.response.options.d> arrayList = new ArrayList();
        for (com.iqoption.mobbtech.connect.response.options.d dVar : this.atL.keySet()) {
            if (j(dVar.aQd().longValue(), GZ)) {
                arrayList.add(dVar);
            }
        }
        for (com.iqoption.mobbtech.connect.response.options.d dVar2 : arrayList) {
            com.iqoption.mobbtech.connect.response.options.b bVar = (com.iqoption.mobbtech.connect.response.options.b) this.atN.remove(dVar2);
            com.iqoption.mobbtech.connect.response.options.b bVar2 = (com.iqoption.mobbtech.connect.response.options.b) this.atL.remove(dVar2);
            if (bVar2 != null) {
                this.atV.add(new OptionEvents.k(GU(), bVar2, TYPE_REMOVE_GROUP.HOVERING));
            }
        }
        if (!arrayList.isEmpty()) {
            update();
        }
        ArrayList<com.iqoption.core.microservices.tradingengine.response.a.b> arrayList2 = new ArrayList();
        for (Entry entry : this.atQ.entrySet()) {
            if (((com.iqoption.core.microservices.tradingengine.response.a) entry.getValue()).isExpired()) {
                arrayList2.add(entry.getKey());
            }
        }
        for (com.iqoption.core.microservices.tradingengine.response.a.b remove : arrayList2) {
            this.atQ.remove(remove);
        }
    }

    private long GZ() {
        return l.HZ().Ib();
    }

    public boolean Ha() {
        t tVar = this.atF;
        return (tVar == null || tVar.isDone() || this.atF.isCancelled()) ? false : true;
    }

    public boolean Hb() {
        return this.atG;
    }

    private void Hc() {
        IQApp.Ex().bd(new m());
        IQApp.Ex().bd(new com.iqoption.mobbtech.connect.response.options.OptionEvents.b());
        IQApp.Ex().bd(new com.iqoption.mobbtech.connect.response.options.OptionEvents.c());
    }

    private void c(com.iqoption.mobbtech.connect.response.options.c cVar) {
        com.iqoption.mobbtech.connect.response.options.d optionKey = cVar.getOptionKey();
        if (!j(optionKey.aQd().longValue(), GZ())) {
            com.iqoption.mobbtech.connect.response.options.b bVar = (com.iqoption.mobbtech.connect.response.options.b) this.atL.get(optionKey);
            if (bVar == null) {
                bVar = new com.iqoption.mobbtech.connect.response.options.b(cVar);
                this.atL.put(optionKey, bVar);
                this.atV.add(new com.iqoption.mobbtech.connect.response.options.OptionEvents.h(GU(), bVar));
                Hd();
            } else {
                bVar.s(cVar);
                this.atV.add(new com.iqoption.mobbtech.connect.response.options.OptionEvents.i(GU(), bVar, cVar));
                Hd();
            }
            a(cVar);
        }
    }

    private void d(com.iqoption.mobbtech.connect.response.options.c cVar) {
        if (cVar != null && Objects.equals(Long.valueOf(com.iqoption.app.b.DG().DH()), Long.valueOf(cVar.getUserBalanceId()))) {
            if (cVar.isClosed()) {
                f(cVar);
            } else {
                c(cVar);
                e(cVar);
            }
            GW();
        }
    }

    private void e(com.iqoption.mobbtech.connect.response.options.c cVar) {
        if ((cVar.getCreateTime() % 1000 > 0 ? 1 : null) != null && cVar.getInstrumentType().isBinary() && com.iqoption.l.b.aTS().FB()) {
            com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(cVar.getActiveId()), cVar.getInstrumentType());
            if (a != null) {
                DecimalFormat fr = com.iqoption.core.util.j.fr(a.getPrecision());
                IQApp Eu = IQApp.Eu();
                ah.a((int) R.drawable.local_toast_type_indicator_grey, new ai().cs(new ForegroundColorSpan(ContextCompat.getColor(Eu, R.color.grey_blue_70))).jP(Eu.getString(R.string.executed_tick_by_tick)).aWX().F(10).cs(new StyleSpan(1)).cs(new ForegroundColorSpan(ContextCompat.getColor(Eu, R.color.white))).jP(fr.format(cVar.getValue())).anA(), (long) ToastEntity.TOAST_DURATION);
                String str = "asset_id";
                EventManager.BS().a(Event.Builder(Event.CATEGORY_POPUP_SERVED, "tick-deal-notification_show").setParameters(u.anp().o("balance_type_id", Integer.valueOf(com.iqoption.app.b.DG().DJ())).o("instrument_type", a.instrumentType).o(str, Integer.valueOf(a.getActiveId())).anr()).build());
            }
        }
    }

    private void c(Position position) {
        if (position != null) {
            double currentTimeMillis = (double) System.currentTimeMillis();
            Double.isNaN(currentTimeMillis);
            position.timeRecieved = Double.valueOf(currentTimeMillis / 1000.0d);
            if (position.isClosed() && position.isSold()) {
                d(position);
            } else {
                d((com.iqoption.mobbtech.connect.response.options.c) position);
            }
        }
    }

    private void d(Position position) {
        if (position != null) {
            if (position.getUserBalanceId() == com.iqoption.app.b.DG().DH()) {
                this.atV.add(new OptionEvents.n(position));
                try {
                    com.iqoption.mobbtech.connect.response.options.d closeOptionKey = position.getCloseOptionKey();
                    com.iqoption.mobbtech.connect.response.options.a aVar = (com.iqoption.mobbtech.connect.response.options.a) this.atM.get(closeOptionKey);
                    if (aVar == null) {
                        aVar = com.iqoption.mobbtech.connect.response.options.a.l(position);
                        this.atM.put(closeOptionKey, aVar);
                        com.iqoption.mobbtech.connect.response.options.OptionEvents.g gVar = new com.iqoption.mobbtech.connect.response.options.OptionEvents.g();
                        gVar.setValue(Pair.create(GT(), aVar));
                        this.atV.add(gVar);
                    } else if (!aVar.B(position.getId())) {
                        aVar.m(position);
                        this.atV.add(new com.iqoption.mobbtech.connect.response.options.OptionEvents.a(GT(), aVar, position.getId()));
                    }
                    closeOptionKey = position.getOptionKey();
                    com.iqoption.mobbtech.connect.response.options.b bVar = (com.iqoption.mobbtech.connect.response.options.b) this.atL.get(closeOptionKey);
                    if (bVar != null) {
                        bVar.s(position);
                    }
                    a(closeOptionKey, position.getId().longValue());
                    GW();
                } catch (Exception unused) {
                }
            }
        }
    }

    private void a(com.iqoption.mobbtech.connect.response.options.d dVar, BuybackResult buybackResult) {
        if (dVar != null && buybackResult != null) {
            com.iqoption.mobbtech.connect.response.options.a aVar = (com.iqoption.mobbtech.connect.response.options.a) this.atM.get(dVar);
            if (aVar == null) {
                com.iqoption.mobbtech.connect.response.options.a b = com.iqoption.mobbtech.connect.response.options.a.b(buybackResult);
                this.atM.put(dVar, b);
                com.iqoption.mobbtech.connect.response.options.OptionEvents.g gVar = new com.iqoption.mobbtech.connect.response.options.OptionEvents.g();
                gVar.setValue(Pair.create(GT(), b));
                this.atV.add(gVar);
            } else if (!aVar.B(buybackResult.optionId)) {
                aVar.c(buybackResult);
                this.atV.add(new com.iqoption.mobbtech.connect.response.options.OptionEvents.a(GT(), aVar, buybackResult.optionId));
            }
        }
    }

    private void f(com.iqoption.mobbtech.connect.response.options.c cVar) {
        com.iqoption.mobbtech.connect.response.options.d closeOptionKey = cVar.getCloseOptionKey();
        com.iqoption.mobbtech.connect.response.options.a aVar = (com.iqoption.mobbtech.connect.response.options.a) this.atM.get(closeOptionKey);
        if (aVar == null) {
            aVar = com.iqoption.mobbtech.connect.response.options.a.q(cVar);
            this.atM.put(closeOptionKey, aVar);
            com.iqoption.mobbtech.connect.response.options.OptionEvents.g gVar = new com.iqoption.mobbtech.connect.response.options.OptionEvents.g();
            gVar.setValue(Pair.create(GT(), aVar));
            this.atV.add(gVar);
        } else if (!aVar.B(cVar.getId())) {
            aVar.s(cVar);
            this.atV.add(new com.iqoption.mobbtech.connect.response.options.OptionEvents.a(GT(), aVar, cVar.getId()));
        }
        com.iqoption.mobbtech.connect.response.options.b bVar = (com.iqoption.mobbtech.connect.response.options.b) this.atL.get(closeOptionKey);
        com.iqoption.mobbtech.connect.response.options.b bVar2 = (com.iqoption.mobbtech.connect.response.options.b) this.atN.get(closeOptionKey);
        if (bVar != null) {
            if (bVar2 == null) {
                bVar2 = new com.iqoption.mobbtech.connect.response.options.b(cVar);
                this.atN.put(closeOptionKey, bVar2);
            } else if (!bVar2.aPX().contains(cVar)) {
                bVar2.s(cVar);
            }
        }
        if (bVar != null) {
            com.iqoption.mobbtech.connect.response.options.c bX = bVar.bX(cVar.getId().longValue());
            if (bX != null) {
                this.atV.add(new j(GU(), bVar, bX));
                if (bVar.isEmpty()) {
                    this.atL.remove(closeOptionKey);
                    this.atN.remove(closeOptionKey);
                    this.atV.add(new OptionEvents.k(GU(), bVar2, TYPE_REMOVE_GROUP.EXPIRED));
                }
                b(cVar);
            }
        }
    }

    private void Hd() {
        ImmutableList GT = GT();
        ImmutableList GU = GU();
        OptionEvents optionEvents = (OptionEvents) this.atV.poll();
        while (optionEvents != null) {
            if (optionEvents.a(GT, GU)) {
                IQApp.Ex().bd(optionEvents);
            }
            optionEvents = (OptionEvents) this.atV.poll();
        }
    }

    private void a(com.iqoption.mobbtech.connect.response.options.a aVar) {
        com.iqoption.mobbtech.connect.response.options.d optionKey = aVar.getOptionKey();
        com.iqoption.mobbtech.connect.response.options.a aVar2 = (com.iqoption.mobbtech.connect.response.options.a) this.atM.get(optionKey);
        if (aVar2 == null) {
            this.atM.put(optionKey, aVar);
            com.iqoption.mobbtech.connect.response.options.OptionEvents.g gVar = new com.iqoption.mobbtech.connect.response.options.OptionEvents.g();
            gVar.setValue(Pair.create(GT(), aVar));
            this.atV.add(gVar);
        } else if (aVar2.size() < aVar.size()) {
            this.atM.replace(optionKey, aVar);
            OptionEvents.o oVar = new OptionEvents.o();
            oVar.setValue(Pair.create(GT(), aVar));
            this.atV.add(oVar);
        }
        com.iqoption.mobbtech.connect.response.options.b bVar = (com.iqoption.mobbtech.connect.response.options.b) this.atL.get(optionKey);
        if (bVar != null) {
            com.iqoption.mobbtech.connect.response.options.b bVar2 = (com.iqoption.mobbtech.connect.response.options.b) this.atN.get(optionKey);
            aj sK = aVar.aPU().iterator();
            while (sK.hasNext()) {
                com.iqoption.mobbtech.connect.response.options.c bX = bVar.bX(((Long) sK.next()).longValue());
                if (bX != null) {
                    this.atV.add(new j(GU(), bVar, bX));
                }
                if (bVar2 == null) {
                    bVar2 = new com.iqoption.mobbtech.connect.response.options.b(bX);
                    this.atN.put(optionKey, bVar2);
                } else if (!bVar2.aPX().contains(bX)) {
                    bVar2.s(bX);
                }
            }
            if (bVar.isEmpty()) {
                this.atL.remove(optionKey);
                this.atN.remove(optionKey);
                this.atV.add(new OptionEvents.k(GU(), bVar2, TYPE_REMOVE_GROUP.EXPIRED));
                Hd();
            }
        }
    }

    public void g(com.iqoption.mobbtech.connect.response.options.c cVar) {
        this.singleThreadExecutor.execute(new -$$Lambda$c$g9FP9Iupgd-8-2Sp9c-rZHX1w7I(this, cVar));
    }

    public void e(Position position) {
        this.singleThreadExecutor.execute(new -$$Lambda$c$2SqEzhy9ibM0m9rU04trfYrA3II(this, position));
    }

    public void a(int i, double d, double d2, double d3, String str) {
        ActiveQuote activeQuote = (ActiveQuote) this.atR.get(Integer.valueOf(i));
        if (activeQuote != null) {
            activeQuote.update(d, d2, d3, str);
            return;
        }
        int i2 = i;
        this.atR.put(Integer.valueOf(i), new ActiveQuote(i, d, d2, d3, com.iqoption.app.helpers.a.Gs().dV(i), str));
    }

    @Nullable
    public com.iqoption.mobbtech.connect.response.b a(Long l, Integer num, InstrumentType instrumentType) {
        return b(l, num, instrumentType);
    }

    public com.iqoption.mobbtech.connect.response.d b(Long l, Integer num, InstrumentType instrumentType) {
        com.iqoption.mobbtech.connect.response.d.a b = com.iqoption.mobbtech.connect.response.d.b(num, l);
        com.iqoption.mobbtech.connect.response.d dVar = (com.iqoption.mobbtech.connect.response.d) this.atP.get(b);
        b.recycle();
        return (dVar == null || !dVar.d(l.longValue(), instrumentType)) ? null : dVar;
    }

    public void a(com.iqoption.mobbtech.connect.response.d dVar) {
        com.iqoption.mobbtech.connect.response.d.a c = com.iqoption.mobbtech.connect.response.d.c(dVar);
        if (this.atP.containsKey(c)) {
            this.atP.put(c, dVar);
        } else {
            this.atP.put(com.iqoption.mobbtech.connect.response.d.b(dVar), dVar);
        }
        c.recycle();
    }

    public void a(com.iqoption.mobbtech.connect.response.c cVar) {
        com.iqoption.mobbtech.connect.response.options.d b = com.iqoption.mobbtech.connect.response.options.d.b(cVar);
        if (this.atO.containsKey(b)) {
            this.atO.put(b, cVar);
        } else {
            this.atO.put(cVar.getOptionKey(), cVar);
        }
        b.recycle();
    }

    public void z(List<com.iqoption.core.microservices.tradingengine.response.a> list) {
        if (list != null) {
            for (com.iqoption.core.microservices.tradingengine.response.a b : list) {
                b(b);
            }
        }
    }

    public void A(List<com.iqoption.core.microservices.tradingengine.response.a> list) {
        if (list != null) {
            for (com.iqoption.core.microservices.tradingengine.response.a b : list) {
                b(b);
            }
        }
    }

    public void a(com.iqoption.core.microservices.tradingengine.response.a aVar) {
        if (aVar != null) {
            b(aVar);
        }
    }

    private void b(com.iqoption.core.microservices.tradingengine.response.a aVar) {
        if (aVar != null) {
            aVar.aW(System.currentTimeMillis());
            com.iqoption.core.microservices.tradingengine.response.a.b d = com.iqoption.core.microservices.tradingengine.response.a.d(aVar.getInstrumentId(), aVar.getInstrumentType());
            com.iqoption.core.microservices.tradingengine.response.a aVar2 = (com.iqoption.core.microservices.tradingengine.response.a) this.atQ.get(d);
            d.recycle();
            if (aVar2 != null) {
                this.atQ.put(d, aVar);
            } else {
                this.atQ.put(new com.iqoption.core.microservices.tradingengine.response.a.b(aVar.getInstrumentId(), aVar.getInstrumentType()), aVar);
            }
        }
    }

    public void b(String str, InstrumentType instrumentType) {
        com.iqoption.core.microservices.tradingengine.response.a.b d = com.iqoption.core.microservices.tradingengine.response.a.d(str, instrumentType);
        this.atQ.remove(d);
        d.recycle();
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.a c(String str, InstrumentType instrumentType) {
        com.iqoption.core.microservices.tradingengine.response.a.b d = com.iqoption.core.microservices.tradingengine.response.a.d(str, instrumentType);
        com.iqoption.core.microservices.tradingengine.response.a aVar = (com.iqoption.core.microservices.tradingengine.response.a) this.atQ.get(d);
        d.recycle();
        return aVar;
    }

    @Nullable
    public ActiveQuote dY(int i) {
        return (ActiveQuote) this.atR.get(Integer.valueOf(i));
    }

    public void i(Order order) {
        if (Order.isMarketOrderFilled(order)) {
            h(order);
        } else if (Order.isTpslOrder(order)) {
            g(order);
        } else if (Order.isDeferredOrder(order)) {
            e(order);
        } else if (Order.mktOnOpenExecuting(order)) {
            f(order);
        }
    }

    private void He() {
        NativeHandler.instance().singleThreadExecutor.execute(this.aua);
    }

    private /* synthetic */ void Hi() {
        TabHelper IM = TabHelper.IM();
        com.iqoption.app.managers.tab.TabHelper.i Jh = IM.Jh();
        if (IM.isInitialized() && Jh != null) {
            com.iqoption.mobbtech.connect.response.options.d a = com.iqoption.mobbtech.connect.response.options.d.a(Integer.valueOf(Jh.Jv()), Jh.getInstrumentType(), Long.valueOf(Jh.Jx()));
            com.iqoption.mobbtech.connect.response.options.b bVar = (com.iqoption.mobbtech.connect.response.options.b) this.atL.get(a);
            a.recycle();
            if (bVar != null) {
                aj sK;
                switch (bVar.instrumentType) {
                    case MULTI_INSTRUMENT:
                    case FOREX_INSTRUMENT:
                    case CRYPTO_INSTRUMENT:
                    case CFD_INSTRUMENT:
                        break;
                    case DIGITAL_INSTRUMENT:
                    case FX_INSTRUMENT:
                        bVar.aPZ();
                        break;
                    case TURBO_INSTRUMENT:
                    case BINARY_INSTRUMENT:
                        sK = bVar.aPX().iterator();
                        while (sK.hasNext()) {
                            com.iqoption.mobbtech.connect.response.options.c cVar = (com.iqoption.mobbtech.connect.response.options.c) sK.next();
                            com.iqoption.gl.c.aIy().onBetsProfitChange(cVar.getId().longValue(), cVar.getCurrentProfitAmount());
                        }
                        return;
                    default:
                        return;
                }
                sK = bVar.aPX().iterator();
                while (sK.hasNext()) {
                    h((Position) ((com.iqoption.mobbtech.connect.response.options.c) sK.next()));
                }
            }
        }
    }

    public h Hf() {
        return this.aub;
    }

    public t<Void> Hg() {
        return this.atH ? com.google.common.util.concurrent.p.bo(null) : this.atI;
    }

    private void Hh() {
        this.singleThreadExecutor.execute(this.auc);
    }

    private com.iqoption.core.microservices.tradingengine.response.active.a a(int i, InstrumentType instrumentType, com.iqoption.mobbtech.connect.response.options.c cVar) {
        if (InstrumentType.MULTI_INSTRUMENT != instrumentType) {
            return com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(i), instrumentType);
        }
        com.iqoption.core.microservices.tradingengine.response.active.a c = com.iqoption.app.helpers.a.Gs().c(Integer.valueOf(i));
        return c != null ? ((com.iqoption.core.microservices.tradingengine.response.active.j) c).fa(((PositionItem) ((Position) cVar).getPositionItems().get(0)).getActiveId()) : null;
    }

    public void h(com.iqoption.mobbtech.connect.response.options.c cVar) {
        long expired = cVar.getExpired();
        if (expired > 0) {
            expired *= 1000;
        }
        int activeId = cVar.getActiveId();
        InstrumentType instrumentType = cVar.getInstrumentType();
        com.iqoption.core.microservices.tradingengine.response.active.a a = a(activeId, instrumentType, cVar);
        if (a != null) {
            com.iqoption.app.managers.tab.TabHelper.i e = TabHelper.IM().e(a, new Expiration(expired, cVar.getExpirationPeriod() * 1000));
            switch (instrumentType) {
                case MULTI_INSTRUMENT:
                case DIGITAL_INSTRUMENT:
                case FX_INSTRUMENT:
                case FOREX_INSTRUMENT:
                case CRYPTO_INSTRUMENT:
                case CFD_INSTRUMENT:
                    if (e != null && (cVar instanceof Position)) {
                        com.iqoption.gl.c.aIy().setSelectedPosition(e.Ju(), ((Position) cVar).getPositionSplitId());
                        return;
                    }
                    return;
                case TURBO_INSTRUMENT:
                case BINARY_INSTRUMENT:
                    com.iqoption.gl.c.aIy().onBetSelected(cVar.getId().longValue());
                    return;
                default:
                    return;
            }
        }
    }

    public static void i(com.iqoption.mobbtech.connect.response.options.c cVar) {
        a(true, ImmutableList.aJ(cVar), -1);
    }

    public static void b(ImmutableList<com.iqoption.mobbtech.connect.response.options.c> immutableList) {
        a(true, (ImmutableList) immutableList, -1);
    }

    public static void j(com.iqoption.mobbtech.connect.response.options.c cVar) {
        a(false, ImmutableList.aJ(cVar), -1);
    }

    public static void c(ImmutableList<com.iqoption.mobbtech.connect.response.options.c> immutableList) {
        a(false, (ImmutableList) immutableList, -1);
    }

    public static void k(com.iqoption.mobbtech.connect.response.options.c cVar) {
        a(false, ImmutableList.aJ(cVar), l.HZ().Ib());
    }

    public static void d(ImmutableList<com.iqoption.mobbtech.connect.response.options.c> immutableList) {
        a(false, (ImmutableList) immutableList, l.HZ().Ib());
    }

    private static void a(boolean z, ImmutableList<com.iqoption.mobbtech.connect.response.options.c> immutableList, long j) {
        ImmutableList immutableList2 = immutableList;
        if (immutableList2 != null) {
            int size = immutableList.size();
            if (size != 0) {
                int[] iArr = new int[size];
                long[] jArr = new long[size];
                int[] iArr2 = new int[size];
                int[] iArr3 = new int[size];
                double[] dArr = new double[size];
                long[] jArr2 = new long[size];
                long[] jArr3 = new long[size];
                long[] jArr4 = new long[size];
                double[] dArr2 = new double[size];
                double[] dArr3 = new double[size];
                double[] dArr4 = new double[size];
                int i = 0;
                while (i < size) {
                    com.iqoption.mobbtech.connect.response.options.c cVar = (com.iqoption.mobbtech.connect.response.options.c) immutableList2.get(i);
                    iArr[i] = cVar.getActiveId();
                    jArr[i] = cVar.getId().longValue();
                    iArr2[i] = cVar.getClientPlatformId() == null ? 17 : cVar.getClientPlatformId().intValue();
                    dArr[i] = cVar.getValue();
                    jArr2[i] = cVar.getCreated();
                    iArr3[i] = cVar.getDir().equals(NotificationCompat.CATEGORY_CALL);
                    jArr3[i] = cVar.getExpired();
                    jArr4[i] = j;
                    dArr4[i] = cVar.timeRecieved.doubleValue();
                    dArr2[i] = cVar.getInvestSum();
                    dArr3[i] = cVar.getCurrentProfitAmount();
                    i++;
                    ImmutableList<com.iqoption.mobbtech.connect.response.options.c> immutableList22 = immutableList;
                }
                if (z) {
                    com.iqoption.gl.c.aIy().addBets(size, iArr, jArr, iArr2, iArr3, dArr, jArr2, jArr3, jArr4, dArr2, dArr3, dArr4);
                } else {
                    com.iqoption.gl.c.aIy().setClosedBets(size, iArr, jArr, iArr2, iArr3, dArr, jArr2, jArr3, jArr4, dArr2, dArr3, dArr4);
                }
            }
        }
    }

    public static void j(Order order) {
        a(true, order);
    }

    public static void k(Order order) {
        a(false, order);
    }

    private static void a(boolean z, Order order) {
        if (order != null) {
            if (z) {
                com.iqoption.gl.c.aIy().addOrders(String.valueOf(order.getId()), order.getInstrumentActiveId().intValue(), order.getInstrumentType().getOptionActiveOrInstrumentValue(), order.getCount(), order.getAvgPriceGL().doubleValue(), order.getLimitPrice() == null ? -1.0d : order.getLimitPrice().doubleValue(), order.getStopPrice() == null ? -1.0d : order.getStopPrice().doubleValue(), NotificationCompat.CATEGORY_CALL.equals(order.getInstrumentDir()), order.getCreateAt().longValue(), order.getInstrumentExpiration().longValue(), 0, order.createStrikeKey(), (double) order.getLeverage(), order.getStatus(), order.getExecuteStatus(), order.getType(), Position.createPositionSplitId(order.getInstrumentType(), order.getInstrumentActiveId(), order.getInstrumentExpiration(), order.getPositionId()));
            } else {
                com.iqoption.gl.c.aIy().deleteOrders(String.valueOf(order.getId()));
            }
        }
    }

    public static void f(Position position) {
        a(0, position);
    }

    public static void g(Position position) {
        a(1, position);
    }

    public static void h(Position position) {
        a(2, position);
    }

    private static void a(int i, Position position) {
        if (position != null) {
            double currentProfitAmount;
            double bidPrice;
            if (position.getInstrumentType() == InstrumentType.MULTI_INSTRUMENT) {
                currentProfitAmount = position.getCurrentProfitAmount() - position.getInvestSum();
                int size = position.getPositionItems().size();
                Iterator it = position.getPositionItems().iterator();
                int i2 = 1;
                while (it.hasNext()) {
                    PositionItem positionItem = (PositionItem) it.next();
                    double buyAmount = i2 == size ? position.getBuyAmount() : 0.0d;
                    int activeId = positionItem.getActiveId();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(position.getPositionSplitId());
                    stringBuilder.append("_");
                    stringBuilder.append(positionItem.getActiveId());
                    String stringBuilder2 = stringBuilder.toString();
                    String optionActiveOrInstrumentValue = position.getInstrumentType().getOptionActiveOrInstrumentValue();
                    double count = position.getCount();
                    double countRealized = position.getCountRealized();
                    double buyAvgPrice = positionItem.getBuyAvgPrice();
                    double sellAvgPrice = positionItem.getSellAvgPrice();
                    double buyAvgPriceEnrolled = positionItem.getBuyAvgPriceEnrolled();
                    double sellAvgPriceEnrolled = positionItem.getSellAvgPriceEnrolled();
                    int i3 = size;
                    Iterator it2 = it;
                    bidPrice = positionItem.getBidPrice(position.getRate());
                    double d = currentProfitAmount;
                    double d2 = bidPrice;
                    int i4 = i2;
                    a(i, activeId, stringBuilder2, optionActiveOrInstrumentValue, count, countRealized, buyAvgPrice, sellAvgPrice, buyAvgPriceEnrolled, sellAvgPriceEnrolled, d2, positionItem.getAskPrice(position.getRate()), position.isLongInt(), positionItem.isCallInt(), position.getExpired(), positionItem.getCreated(), position.getUpdated(), position.getClosed(), positionItem.createStrikeKey(position.getInstrumentExpiration().longValue(), position.getExpirationPeriod()), (double) position.getLeverage(), position.getStringStopLoseOrderId(), position.getStringTakeProfitOrderId(), position.getCloseReason(), position.getRate(), position.getSelfSwap(), position.getSelfMarginCall(), position.isAutoMarginCall(), position.getGLstopOutThreshold(), d, 1, position.getExpirationPeriod(), position.getProfitPercentRestriction(), position.getProfitAbsoluteRestriction(), position.getInvestSum(), buyAmount, position.getSellAmount());
                    i2 = i4 + 1;
                    size = i3;
                    it = it2;
                    currentProfitAmount = d;
                }
            } else {
                int activeId2 = position.getActiveId();
                String positionSplitId = position.getPositionSplitId();
                String optionActiveOrInstrumentValue2 = position.getInstrumentType().getOptionActiveOrInstrumentValue();
                double count2 = position.getCount();
                double countRealized2 = position.getCountRealized();
                double buyAvgPrice2 = position.getBuyAvgPrice();
                double sellAvgPrice2 = position.getSellAvgPrice();
                double buyAvgPriceEnrolled2 = position.getBuyAvgPriceEnrolled();
                double sellAvgPriceEnrolled2 = position.getSellAvgPriceEnrolled();
                double bidPrice2 = position.getBidPrice();
                double askPrice = position.getAskPrice();
                int isLongInt = position.isLongInt();
                int isCallInt = position.isCallInt();
                long expired = position.getExpired();
                long created = position.getCreated();
                long updated = position.getUpdated();
                long closed = position.getClosed();
                String createStrikeKey = position.createStrikeKey();
                currentProfitAmount = (double) position.getLeverage();
                String stringStopLoseOrderId = position.getStringStopLoseOrderId();
                String stringTakeProfitOrderId = position.getStringTakeProfitOrderId();
                String closeReason = position.getCloseReason();
                double rate = position.getRate();
                double selfSwap = position.getSelfSwap();
                double selfMarginCall = position.getSelfMarginCall();
                boolean isAutoMarginCall = position.isAutoMarginCall();
                int gLstopOutThreshold = position.getGLstopOutThreshold();
                bidPrice = (double) position.getInstrumentStrikeValue();
                Double.isNaN(bidPrice);
                a(i, activeId2, positionSplitId, optionActiveOrInstrumentValue2, count2, countRealized2, buyAvgPrice2, sellAvgPrice2, buyAvgPriceEnrolled2, sellAvgPriceEnrolled2, bidPrice2, askPrice, isLongInt, isCallInt, expired, created, updated, closed, createStrikeKey, currentProfitAmount, stringStopLoseOrderId, stringTakeProfitOrderId, closeReason, rate, selfSwap, selfMarginCall, isAutoMarginCall, gLstopOutThreshold, bidPrice / 1000000.0d, position.isSpotStrike(), position.getExpirationPeriod(), position.getProfitPercentRestriction(), position.getProfitAbsoluteRestriction(), position.getInvestSum(), position.getBuyAmount(), position.getSellAmount());
            }
        }
    }

    private static void a(int i, int i2, String str, String str2, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i3, int i4, long j, long j2, long j3, long j4, String str3, double d9, String str4, String str5, String str6, double d10, double d11, double d12, int i5, int i6, double d13, int i7, long j5, double d14, double d15, double d16, double d17, double d18) {
        int i8 = i;
        if (i8 == 0) {
            com.iqoption.gl.c.aIy().addPosition(i2, str, str2, d, d2, d3, d4, d5, d6, d7, d8, i3, i4, j, j2, j3, j4, str3, d9, str4, str5, str6, d10, d11, d12, i5, i6, d13, i7, j5, d14, d15, d16, d17, d18);
        } else if (i8 == 1) {
            com.iqoption.gl.c.aIy().deletePosition(i2, str, str2, d, d2, d3, d4, d5, d6, d7, d8, i3, i4, j, j2, j3, j4, str3, d9, str4, str5, str6, d10, d12, i5, i6, d13, i7, j5, d17, d18);
        } else if (i8 == 2) {
            com.iqoption.gl.c.aIy().updatePosition(i2, str, str2, d, d2, d3, d4, d5, d6, d7, d8, i3, i4, j, j2, j3, j4, str3, d9, str4, str5, str6, d10, d11, d12, i5, i6, d13, i7, j5, d14, d15, d16, d17, d18);
        }
    }

    private static t<List<Position>> d(t<com.iqoption.trading.history.a.a.a> tVar) {
        return v.a((t) tVar, new com.google.common.base.d<com.iqoption.trading.history.a.a.a, List<Position>>() {
            /* renamed from: a */
            public List<Position> apply(com.iqoption.trading.history.a.a.a aVar) {
                if (aVar == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (com.iqoption.trading.history.a.a aVd : aVar.agl()) {
                    Position aVd2 = aVd.aVd();
                    if (aVd2 != null) {
                        arrayList.add(aVd2);
                    }
                }
                return arrayList;
            }
        });
    }
}

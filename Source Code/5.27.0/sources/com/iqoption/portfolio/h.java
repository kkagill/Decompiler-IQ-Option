package com.iqoption.portfolio;

import android.util.Pair;
import com.google.common.b.e;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import com.google.common.collect.aj;
import com.google.common.primitives.Longs;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.c;
import com.iqoption.app.managers.g;
import com.iqoption.core.microservices.tradingengine.response.active.d;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.mobbtech.connect.response.options.OptionEvents;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.i;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.j;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.k;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.m;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.o;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.p;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.q;
import com.iqoption.util.v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PortfolioManager */
public class h implements com.iqoption.view.a.b.a {
    private static final Ordering<d> ORDERING = new Ordering<d>() {
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return dVar.aQw() ? dVar2.aQw() ? 0 : -1 : dVar2.aQw() ? 1 : 0;
        }
    }.compound((Comparator) new Ordering<d>() {
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return Longs.compare(dVar2.aQB(), dVar.aQB());
        }
    }).compound(new Ordering<d>() {
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            com.iqoption.core.microservices.tradingengine.response.active.a Jt = dVar.Jt();
            com.iqoption.core.microservices.tradingengine.response.active.a Jt2 = dVar2.Jt();
            if (Jt != null && Jt2 != null) {
                return d.B(dVar.Jt()).compareToIgnoreCase(d.B(dVar2.Jt()));
            }
            int i = Jt == null ? Jt2 != null ? 1 : 0 : -1;
            return i;
        }
    });
    private static final Ordering<e> dLA = new Ordering<e>() {
        /* renamed from: a */
        public int compare(e eVar, e eVar2) {
            return Longs.compare(eVar2.aQB(), eVar.aQB());
        }
    }.compound((Comparator) new Ordering<e>() {
        /* renamed from: a */
        public int compare(e eVar, e eVar2) {
            return d.B(eVar.Jt()).compareToIgnoreCase(d.B(eVar2.Jt()));
        }
    });
    private static final Ordering<b> dLz = new Ordering<b>() {
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return Longs.compare(bVar2.getCloseTime(), bVar.getCloseTime());
        }
    }.compound((Comparator) new Ordering<b>() {
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            com.iqoption.core.microservices.tradingengine.response.active.a Jt = bVar.Jt();
            com.iqoption.core.microservices.tradingengine.response.active.a Jt2 = bVar2.Jt();
            if (Jt != null && Jt2 != null) {
                return d.B(bVar.Jt()).compareToIgnoreCase(d.B(bVar2.Jt()));
            }
            int i = Jt == null ? Jt2 != null ? 1 : 0 : -1;
            return i;
        }
    });
    private static final n<h> dne = Suppliers.a(-$$Lambda$h$QB8_uw3NMkLGw7I6FWvH4zs47J8.INSTANCE);
    private g atY = new g(new com.iqoption.app.managers.g.a() {
        public void Hj() {
            com.iqoption.view.a.b.aYv().a(h.this, Integer.valueOf(5));
        }

        public void Hk() {
            com.iqoption.view.a.b.aYv().b(h.this);
        }
    });
    private final f dLB = new f(0);
    private final Set<Long> dLC = Sets.uw();
    private final Map<Long, t> dLD = Maps.uk();
    private final List<b> gb = new ArrayList();

    /* compiled from: PortfolioManager */
    public interface b {
        void aQU();

        void aQV();

        void aQW();

        void aQX();

        void aQY();
    }

    /* compiled from: PortfolioManager */
    private final class a extends com.iqoption.system.a.d {
        private a() {
        }

        /* synthetic */ a(h hVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        private void q(ImmutableList<com.iqoption.mobbtech.connect.response.options.b> immutableList) {
            h.this.bn(immutableList);
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    h.this.aQP();
                }
            });
        }

        private void r(ImmutableList<Order> immutableList) {
            h.this.bo(immutableList);
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    h.this.aQQ();
                }
            });
        }

        private void s(ImmutableList<com.iqoption.mobbtech.connect.response.options.a> immutableList) {
            h.this.bp(immutableList);
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    h.this.aQR();
                }
            });
        }

        @e
        public void onOpenOptionGroupsClear(m mVar) {
            q(ImmutableList.sQ());
        }

        @e
        public void onOpenOptionGroupOptionRemoved(j jVar) {
            q(jVar.dJq);
        }

        @e
        public void onOpenOptionGroupRemoved(k kVar) {
            q(kVar.dJq);
        }

        @e
        public void onNewOpenOptionGroup(com.iqoption.mobbtech.connect.response.options.OptionEvents.h hVar) {
            q(hVar.dJq);
        }

        @e
        public void onOpenOptionGroupOptionAdded(i iVar) {
            q(iVar.dJq);
        }

        @e
        public void onClosedOptionGroupsClear(com.iqoption.mobbtech.connect.response.options.OptionEvents.b bVar) {
            s(ImmutableList.sQ());
        }

        @e
        public void onNewClosedOptionGroup(OptionEvents.g gVar) {
            s((ImmutableList) ((Pair) gVar.getValue()).first);
        }

        @e
        public void onReplaceClosedOptionGroup(o oVar) {
            s((ImmutableList) ((Pair) oVar.getValue()).first);
        }

        @e
        public void onClosedOptionGroupOptionAdded(com.iqoption.mobbtech.connect.response.options.OptionEvents.a aVar) {
            s(aVar.dJn);
        }

        @e
        public void onUpdateStarted(q qVar) {
            h.this.dLB.gC(1);
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$h$a$_ewDwbe8r1-8XPbYk4mOLIbZiRY(h.this));
        }

        @e
        public void onUpdateStoped(p pVar) {
            if (c.GS().Hb()) {
                h.this.dLB.gC(3);
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$h$a$asvhC7R20UBeYYAI9Mnm2inF4Vs(h.this));
                return;
            }
            h.this.dLB.gC(2);
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$h$a$eQjJxzqpgtmvjJHHLVFRWz2HytA(h.this));
        }

        @e
        public void onDefferedOrdersChanged(OptionEvents.c cVar) {
            r(c.GS().GQ());
        }
    }

    public static h aQJ() {
        return (h) dne.get();
    }

    public void gD(int i) {
        this.dLB.gx(i);
    }

    public t<?> bZ(final long j) {
        t k;
        aj sK = this.dLB.aQE().iterator();
        com.iqoption.mobbtech.connect.response.options.c cVar = null;
        while (sK.hasNext()) {
            aj sK2 = ((d) sK.next()).aQy().iterator();
            while (sK2.hasNext()) {
                com.iqoption.mobbtech.connect.response.options.c cVar2 = (com.iqoption.mobbtech.connect.response.options.c) sK2.next();
                if (cVar2.getId().longValue() == j) {
                    cVar = cVar2;
                    continue;
                    break;
                }
            }
            if (cVar != null) {
                break;
            }
        }
        AnonymousClass9 anonymousClass9 = new com.google.common.util.concurrent.o<Object>() {
            public void onSuccess(Object obj) {
                h.this.dLC.remove(Long.valueOf(j));
            }

            public void l(Throwable th) {
                h.this.dLC.remove(Long.valueOf(j));
            }
        };
        if (cVar instanceof Position) {
            k = com.iqoption.mobbtech.connect.request.api.a.b.k((Position) cVar);
        } else {
            k = com.iqoption.mobbtech.connect.request.api.a.a.d(IQApp.Eu(), j);
        }
        v.b(k, anonymousClass9);
        this.dLC.add(Long.valueOf(j));
        return k;
    }

    public boolean ca(long j) {
        return this.dLC.contains(Long.valueOf(j));
    }

    public t q(final Order order) {
        t tVar = (t) this.dLD.get(order.getId());
        if (tVar != null) {
            return tVar;
        }
        tVar = com.iqoption.mobbtech.connect.request.api.a.b.A(order.getId());
        v.b(tVar, new com.google.common.util.concurrent.o<Object>() {
            public void onSuccess(Object obj) {
                h.this.dLD.remove(order.getId());
            }

            public void l(Throwable th) {
                h.this.dLD.remove(order.getId());
            }
        });
        this.dLD.put(order.getId(), tVar);
        return tVar;
    }

    public boolean r(Order order) {
        t tVar = (t) this.dLD.get(order.getId());
        return (tVar == null || tVar.isCancelled() || tVar.isDone()) ? false : true;
    }

    private h() {
        new a(this, null).register();
    }

    public void onTick(long j) {
        this.dLB.aQH();
        aQO();
    }

    public f aQK() {
        if (!this.atY.isStarted()) {
            if (c.GS().Ha()) {
                this.dLB.gC(1);
            } else if (c.GS().Hb()) {
                this.dLB.gC(3);
            } else {
                this.dLB.gC(2);
            }
            aQL();
            aQM();
            aQN();
        }
        return this.dLB;
    }

    private void bn(List<com.iqoption.mobbtech.connect.response.options.b> list) {
        this.dLB.n(d.a(list, ORDERING));
        this.dLB.aQH();
    }

    private void bo(List<Order> list) {
        this.dLB.p(e.a(list, dLA));
    }

    private void bp(List<com.iqoption.mobbtech.connect.response.options.a> list) {
        this.dLB.o(b.a(list, dLz));
    }

    private void aQL() {
        bn(c.GS().GU());
    }

    private void aQM() {
        bo(c.GS().GQ());
    }

    private void aQN() {
        bp(c.GS().GT());
    }

    private void aQO() {
        for (b aQU : this.gb) {
            aQU.aQU();
        }
    }

    private void aQP() {
        for (b aQV : this.gb) {
            aQV.aQV();
        }
    }

    private void aQQ() {
        for (b aQW : this.gb) {
            aQW.aQW();
        }
    }

    private void aQR() {
        for (b aQX : this.gb) {
            aQX.aQX();
        }
    }

    private void aQS() {
        for (b aQY : this.gb) {
            aQY.aQY();
        }
    }

    public void a(b bVar) {
        if (bVar != null) {
            this.gb.add(bVar);
        }
        this.atY.start();
    }

    public void b(b bVar) {
        if (bVar != null) {
            this.gb.remove(bVar);
        }
        this.atY.stop();
    }
}

package com.iqoption.app.managers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Suppliers;
import com.google.common.base.j;
import com.google.common.base.n;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.dto.event.OtnEmissionExecuted;
import com.iqoption.system.a.f;
import com.iqoption.util.p;
import com.iqoption.util.v;
import java.math.BigDecimal;

/* compiled from: OtnManager */
public final class e {
    private static final String TAG = "com.iqoption.app.managers.e";
    private static final n<e> UB = Suppliers.a(-$$Lambda$e$TaIGU1CVW7kBDW6Xz1a96hYMh7c.INSTANCE);
    private static final j<com.iqoption.microservice.d.a.d> aun = new j<com.iqoption.microservice.d.a.d>() {
        /* renamed from: a */
        public boolean apply(com.iqoption.microservice.d.a.d dVar) {
            return "emission".equalsIgnoreCase(dVar.getType());
        }
    };
    private final d auo = new d(this, null);
    private t<com.iqoption.microservice.d.a.a> aup;
    private t<com.iqoption.microservice.d.a.c> auq;
    private t<com.iqoption.microservice.d.a.e> aur;
    private t<com.iqoption.microservice.d.a.b> aus;
    private com.iqoption.microservice.d.a.a aut;
    private com.iqoption.microservice.d.a.c auu;
    private com.iqoption.microservice.d.a.e auv;
    private com.iqoption.microservice.d.a.b auw;

    /* compiled from: OtnManager */
    private final class d extends f {
        private d() {
        }

        /* synthetic */ d(e eVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @com.google.common.b.e
        public void onSocketOpened(com.iqoption.service.e.f fVar) {
            com.iqoption.core.c.a.biL.execute(new Runnable() {
                public void run() {
                    e.this.clear();
                    e.this.Hw();
                }
            });
        }
    }

    /* compiled from: OtnManager */
    public static final class a extends com.iqoption.system.a.c<Boolean> {
        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: OtnManager */
    public static final class b extends com.iqoption.system.a.c<Boolean> {
        /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: OtnManager */
    public static final class c extends com.iqoption.system.a.c<Boolean> {
        /* synthetic */ c(AnonymousClass1 anonymousClass1) {
            this();
        }

        private c() {
        }
    }

    public static e Hv() {
        return (e) UB.get();
    }

    private static void a(com.iqoption.system.a.a aVar) {
        IQApp.Ex().bd(aVar);
    }

    private e() {
    }

    public void initialize() {
        this.auo.register();
    }

    public void onEmissionExecuted(final OtnEmissionExecuted otnEmissionExecuted) {
        com.iqoption.core.c.a.biL.execute(new Runnable() {
            public void run() {
                e.this.a(otnEmissionExecuted.getTime(), otnEmissionExecuted);
                IQApp.Ex().bd(otnEmissionExecuted);
            }
        });
    }

    private void a(long j, OtnEmissionExecuted otnEmissionExecuted) {
        com.iqoption.microservice.d.a.a aVar = this.aut;
        if (aVar != null) {
            aVar.d(aVar.aOp().add(otnEmissionExecuted.getCount()));
            aVar = this.aut;
            aVar.m(p.d(aVar.aOq(), Double.valueOf(otnEmissionExecuted.getCommissionVolumeEnrolled())));
            aVar = this.aut;
            aVar.l(p.d(aVar.aOr(), Double.valueOf(otnEmissionExecuted.getTotalCommissionEnrolled())));
        }
        if (this.auu != null) {
            Hz();
        }
        if (this.auv != null) {
            com.iqoption.microservice.d.a.d dVar = new com.iqoption.microservice.d.a.d();
            dVar.setType("emission");
            dVar.setTime(j);
            dVar.e(otnEmissionExecuted.getCount());
            this.auv.aOu().add(0, dVar);
        }
    }

    private void clear() {
        this.aut = null;
        this.auu = null;
        this.auv = null;
    }

    public void Hw() {
        Hx();
        Hz();
        HB();
        HD();
    }

    public void Hx() {
        if (com.iqoption.app.managers.feature.a.Ih() && !Hy()) {
            this.aup = com.iqoption.microservice.d.a.aOn();
            v.b(this.aup, new o<com.iqoption.microservice.d.a.a>() {
                /* renamed from: a */
                public void onSuccess(com.iqoption.microservice.d.a.a aVar) {
                    e.this.aut = aVar;
                    e.a((com.iqoption.system.a.a) new a().setValue(Boolean.valueOf(true)));
                }

                public void l(@NonNull Throwable th) {
                    e.a((com.iqoption.system.a.a) new a().setValue(Boolean.valueOf(false)));
                }
            });
        }
    }

    public boolean Hy() {
        t tVar = this.aup;
        return (tVar == null || tVar.isDone()) ? false : true;
    }

    public void Hz() {
        if (com.iqoption.app.managers.feature.a.Ih() && !HA()) {
            this.auq = com.iqoption.microservice.d.a.aOm();
            v.b(this.auq, new o<com.iqoption.microservice.d.a.c>() {
                /* renamed from: a */
                public void onSuccess(com.iqoption.microservice.d.a.c cVar) {
                    e.this.auu = cVar;
                    e.a((com.iqoption.system.a.a) new b().setValue(Boolean.valueOf(true)));
                }

                public void l(@NonNull Throwable th) {
                    e.a((com.iqoption.system.a.a) new b().setValue(Boolean.valueOf(false)));
                }
            });
        }
    }

    public boolean HA() {
        t tVar = this.auq;
        return (tVar == null || tVar.isDone()) ? false : true;
    }

    public void HB() {
        if (com.iqoption.app.managers.feature.a.Ih() && !HC()) {
            this.aur = com.iqoption.microservice.d.a.aOl();
            v.b(this.aur, new o<com.iqoption.microservice.d.a.e>() {
                /* renamed from: a */
                public void onSuccess(com.iqoption.microservice.d.a.e eVar) {
                    e.this.auv = eVar;
                    e.a((com.iqoption.system.a.a) new c().setValue(Boolean.valueOf(true)));
                }

                public void l(@NonNull Throwable th) {
                    e.a((com.iqoption.system.a.a) new c().setValue(Boolean.valueOf(false)));
                }
            });
        }
    }

    public boolean HC() {
        t tVar = this.aur;
        return (tVar == null || tVar.isDone()) ? false : true;
    }

    public void HD() {
        if (com.iqoption.app.managers.feature.a.Ih() && !HE()) {
            this.aus = com.iqoption.microservice.d.a.aOo();
            v.b(this.aus, new o<com.iqoption.microservice.d.a.b>() {
                /* renamed from: a */
                public void onSuccess(com.iqoption.microservice.d.a.b bVar) {
                    e.this.auw = bVar;
                    e.a((com.iqoption.system.a.a) new b().setValue(Boolean.valueOf(true)));
                }

                public void l(@NonNull Throwable th) {
                    e.a((com.iqoption.system.a.a) new b().setValue(Boolean.valueOf(false)));
                }
            });
        }
    }

    public boolean HE() {
        t tVar = this.aus;
        return (tVar == null || tVar.isDone()) ? false : true;
    }

    @Nullable
    public Double l(double d) {
        com.iqoption.microservice.d.a.a aVar = this.aut;
        if (aVar == null) {
            return null;
        }
        BigDecimal HF = aVar.HF();
        Double aOq = this.aut.aOq();
        if (BigDecimal.ZERO.equals(HF) || aOq == null) {
            return null;
        }
        return Double.valueOf(HF.doubleValue() / com.iqoption.util.j.b(aOq, Double.valueOf(d)).doubleValue());
    }

    @Nullable
    public BigDecimal HF() {
        com.iqoption.microservice.d.a.a aVar = this.aut;
        if (aVar == null) {
            return null;
        }
        return aVar.HF();
    }

    @Nullable
    public Double HG() {
        com.iqoption.microservice.d.a.a aVar = this.aut;
        if (aVar == null) {
            return null;
        }
        return aVar.aOq();
    }

    @Nullable
    public Double HH() {
        com.iqoption.microservice.d.a.a aVar = this.aut;
        if (aVar == null) {
            return null;
        }
        return aVar.aOr();
    }

    @Nullable
    public BigDecimal HI() {
        com.iqoption.microservice.d.a.c cVar = this.auu;
        if (cVar == null) {
            return null;
        }
        return cVar.aOt();
    }

    @Nullable
    public BigDecimal HJ() {
        com.iqoption.microservice.d.a.c cVar = this.auu;
        if (cVar == null) {
            return null;
        }
        return cVar.HJ();
    }

    @Nullable
    public BigDecimal HK() {
        com.iqoption.microservice.d.a.c cVar = this.auu;
        if (cVar == null) {
            return null;
        }
        return cVar.HK();
    }

    @Nullable
    public BigDecimal HL() {
        com.iqoption.microservice.d.a.c cVar = this.auu;
        if (cVar == null) {
            return null;
        }
        return cVar.HL();
    }

    @NonNull
    public ImmutableList<Object> HM() {
        com.iqoption.microservice.d.a.b bVar = this.auw;
        if (bVar == null || bVar.aOs() == null) {
            return ImmutableList.sQ();
        }
        return ImmutableList.m(this.auw.aOs());
    }
}

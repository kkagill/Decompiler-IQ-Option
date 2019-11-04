package com.iqoption.app.managers.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.common.base.Predicates;
import com.google.common.base.d;
import com.google.common.base.f;
import com.google.common.base.j;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.i;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.instrument.e;
import com.iqoption.core.rx.g;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.util.v;
import com.iqoption.x.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* compiled from: ExpirationDigitalHelper */
public class c implements i {
    private static final String TAG = "c";
    private static final d<Iterable<Expiration>, Expiration> avn = -$$Lambda$c$rp_UJVCD2G40kO57YZ2Sye_fb08.INSTANCE;
    private static final long avo = TimeUnit.SECONDS.toMillis(10);
    protected final ConcurrentHashMap<com.iqoption.core.microservices.tradingengine.response.instrument.d, t<ConcurrentHashMap<String, e>>> avp = new ConcurrentHashMap();
    protected final ConcurrentHashMap<com.iqoption.core.microservices.tradingengine.response.instrument.d, ConcurrentHashMap<String, e>> avq = new ConcurrentHashMap();
    private final ConcurrentHashMap<a, t<ImmutableList<Expiration>>> avr = new ConcurrentHashMap();
    private final ConcurrentHashMap<a, ConcurrentSkipListSet<Expiration>> avs = new ConcurrentHashMap();

    /* compiled from: ExpirationDigitalHelper */
    public static class a {
        public InstrumentType instrumentType;
        public String underlying;

        public a(InstrumentType instrumentType, String str) {
            this.instrumentType = instrumentType;
            this.underlying = str;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (com.google.common.base.f.equal(r2.underlying, r3.underlying) != false) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r3 == r2) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.app.managers.a.c.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r0 = r2.instrumentType;
            r3 = (com.iqoption.app.managers.a.c.a) r3;
            r1 = r3.instrumentType;
            r0 = com.google.common.base.f.equal(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.underlying;
            r3 = r3.underlying;
            r3 = com.google.common.base.f.equal(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            goto L_0x0020;
        L_0x001f:
            r3 = 1;
        L_0x0020:
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.managers.a.c$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return f.hashCode(this.instrumentType, this.underlying);
        }
    }

    /* Access modifiers changed, original: protected */
    public String HV() {
        return null;
    }

    public long n(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return 10000;
    }

    private ConcurrentSkipListSet<Expiration> a(a aVar) {
        if (!this.avs.containsKey(aVar)) {
            this.avs.put(aVar, new ConcurrentSkipListSet(Expiration.ORDERING));
        }
        return (ConcurrentSkipListSet) this.avs.get(aVar);
    }

    private ConcurrentSkipListSet<Expiration> r(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return a(new a(aVar.getInstrumentType(), aVar.agB()));
    }

    public t<ImmutableList<Expiration>> m(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        final a aVar2 = new a(aVar.getInstrumentType(), aVar.agB());
        final ConcurrentSkipListSet a = a(aVar2);
        com.iqoption.app.managers.a.e.c cVar = new com.iqoption.app.managers.a.e.c(Integer.valueOf(aVar.getActiveId()), aVar.getInstrumentType(), l.HZ().Ib());
        ImmutableList e = e(a, cVar);
        t tVar = (t) this.avr.get(aVar2);
        if (tVar != null) {
            return tVar;
        }
        if (!e.isEmpty()) {
            return p.bo(e);
        }
        t a2 = v.a(com.iqoption.mobbtech.connect.request.api.e.a(aVar.getInstrumentType(), aVar.agB(), aVar.getActiveId(), HV()), new -$$Lambda$c$HXf68sTxsj8SaxBYmwO7-WnPB8c(this, cVar));
        this.avr.put(aVar2, a2);
        v.b(a2, new o<ImmutableList<Expiration>>() {
            /* renamed from: e */
            public void onSuccess(@NonNull ImmutableList<Expiration> immutableList) {
                a.clear();
                a.addAll(immutableList);
                c.this.avr.remove(aVar2);
            }

            public void l(@NonNull Throwable th) {
                c.this.avr.remove(aVar2);
            }
        });
        return a2;
    }

    private ImmutableList<Expiration> e(Iterable<Expiration> iterable, j<Expiration> jVar) {
        return i.b((Iterable) iterable).b((j) jVar).a(Expiration.ORDERING);
    }

    public t<Expiration> p(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return v.a(m(aVar), avn);
    }

    public boolean b(com.iqoption.core.microservices.tradingengine.response.active.a aVar, Expiration expiration) {
        return i.b(r(aVar)).d(Predicates.ao(expiration)).isPresent();
    }

    public void q(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        b(aVar, r(aVar));
    }

    public Expiration a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, Expiration expiration) {
        Iterator it = r(aVar).iterator();
        while (it.hasNext()) {
            Expiration expiration2 = (Expiration) it.next();
            if (expiration2.expValue.longValue() > expiration.expValue.longValue() && f.equal(Long.valueOf(expiration2.getDigitalExpirationPeriod()), Long.valueOf(expiration.getDigitalExpirationPeriod()))) {
                return expiration2;
            }
        }
        return new Expiration(0, expiration.getDigitalExpirationPeriod());
    }

    @WorkerThread
    public void a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, Set<Expiration> set) {
        ImmutableList e = e(set, new com.iqoption.app.managers.a.e.c(Integer.valueOf(aVar.getActiveId()), aVar.getInstrumentType(), l.HZ().Ib()));
        if (e != null && !e.isEmpty() && r(aVar).addAll(e)) {
            IQApp.Ex().bd(new e.f());
        }
    }

    public String a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, long j) {
        if (j == 0) {
            return IQApp.Eu().getString(R.string.n_a);
        }
        return TimeUtil.bRq.format(Long.valueOf(j));
    }

    public long c(com.iqoption.core.microservices.tradingengine.response.active.a aVar, Expiration expiration) {
        if (expiration == null || expiration.expValue.equals(Long.valueOf(0))) {
            return 0;
        }
        Expiration expiration2 = (Expiration) i.b(r(aVar)).d(Predicates.ao(expiration)).pN();
        return (expiration2 == null || expiration2.deadTime == null) ? 15000 : expiration2.deadTime.longValue();
    }

    private void b(com.iqoption.core.microservices.tradingengine.response.active.a aVar, Set<Expiration> set) {
        long Ib = l.HZ().Ib() - avo;
        Iterator it = set.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Expiration expiration = (Expiration) it.next();
            if (expiration.expValue.longValue() < Ib) {
                a(aVar, expiration, false);
                a(aVar, expiration, true);
                it.remove();
                obj = 1;
            }
        }
        if (obj != null) {
            IQApp.Ex().bd(new e.e());
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, Expiration expiration, boolean z) {
        Expiration expiration2 = expiration;
        ConcurrentHashMap b = b(aVar.getInstrumentType(), aVar.agB(), expiration2.expValue, Long.valueOf(expiration2.expInterval.longValue() / 1000), z);
        if (b != null) {
            for (Entry entry : b.entrySet()) {
                e eVar = (e) entry.getValue();
                String str = (String) entry.getKey();
                com.iqoption.app.managers.c.GS().b(eVar.aiA().getId(), eVar.getInstrumentType());
                com.iqoption.app.managers.c.GS().b(eVar.aiB().getId(), eVar.getInstrumentType());
                com.iqoption.gl.c.aIy().tabDeleteStrike(str);
            }
            a(aVar.getInstrumentType(), aVar.agB(), expiration2.expValue, Long.valueOf(expiration2.expInterval.longValue() / 1000), z);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(InstrumentType instrumentType, String str, Long l, Long l2, boolean z) {
        this.avq.remove(new com.iqoption.core.microservices.tradingengine.response.instrument.d(instrumentType, str, l.longValue(), l2.longValue(), z));
    }

    @Nullable
    public e a(InstrumentType instrumentType, String str, Long l, String str2, Long l2, boolean z) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.avq.get(new com.iqoption.core.microservices.tradingengine.response.instrument.d(instrumentType, str, l.longValue(), l2.longValue(), z));
        if (concurrentHashMap == null) {
            return null;
        }
        String str3 = str2;
        return (e) concurrentHashMap.get(str2);
    }

    @Nullable
    public ConcurrentHashMap<String, e> b(InstrumentType instrumentType, String str, Long l, Long l2, boolean z) {
        return (ConcurrentHashMap) this.avq.get(new com.iqoption.core.microservices.tradingengine.response.instrument.d(instrumentType, str, l.longValue(), l2.longValue(), z));
    }

    public t<ConcurrentHashMap<String, e>> a(Integer num, InstrumentType instrumentType, String str, Long l, Long l2, boolean z) {
        final com.iqoption.core.microservices.tradingengine.response.instrument.d dVar = new com.iqoption.core.microservices.tradingengine.response.instrument.d(instrumentType, str, l.longValue(), l2.longValue(), z);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.avq.get(dVar);
        if (concurrentHashMap != null) {
            return p.bo(concurrentHashMap);
        }
        t<ConcurrentHashMap<String, e>> tVar = (t) this.avp.get(dVar);
        if (tVar == null) {
            io.reactivex.p b;
            if (z) {
                b = com.iqoption.core.microservices.tradingengine.e.bzn.b(instrumentType, str, l.longValue(), l2.longValue(), num.intValue());
            } else {
                b = com.iqoption.core.microservices.tradingengine.e.bzn.a(instrumentType, str, l.longValue(), l2.longValue(), num.intValue());
            }
            tVar = v.a(g.c(b), -$$Lambda$c$uzO1TgBrFgigttZ0vzJkcTDahrE.INSTANCE);
            this.avp.put(dVar, tVar);
            final Integer num2 = num;
            v.b(tVar, new o<ConcurrentHashMap<String, e>>() {
                /* renamed from: b */
                public void onSuccess(@NonNull ConcurrentHashMap<String, e> concurrentHashMap) {
                    for (Entry entry : concurrentHashMap.entrySet()) {
                        c.this.a((e) entry.getValue(), (String) entry.getKey(), num2);
                    }
                    c.this.avq.put(dVar, concurrentHashMap);
                    c.this.avp.remove(dVar);
                }

                public void l(@NonNull Throwable th) {
                    c.this.avp.remove(dVar);
                }
            });
        }
        return tVar;
    }

    private static /* synthetic */ ConcurrentHashMap C(List list) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (e eVar : list) {
            concurrentHashMap.put(eVar.aiy(), eVar);
        }
        return concurrentHashMap;
    }

    private void a(e eVar, String str, Integer num) {
        if (eVar != null) {
            com.iqoption.core.microservices.tradingengine.response.a c = com.iqoption.app.managers.c.GS().c(eVar.aiA().getId(), eVar.getInstrumentType());
            com.iqoption.core.microservices.tradingengine.response.a c2 = com.iqoption.app.managers.c.GS().c(eVar.aiB().getId(), eVar.getInstrumentType());
            com.iqoption.gl.c.aIy().tabAddStrike(num.intValue(), (double) eVar.Jx(), eVar.getInstrumentType().getOptionActiveOrInstrumentValue(), str, (long) ((int) eVar.aiC()), eVar.getValue(), com.iqoption.core.microservices.tradingengine.response.a.e(c), com.iqoption.core.microservices.tradingengine.response.a.f(c), com.iqoption.core.microservices.tradingengine.response.a.e(c2), com.iqoption.core.microservices.tradingengine.response.a.f(c2), 1, 1, eVar.aiD());
        }
    }

    public void clear() {
        this.avp.clear();
        this.avq.clear();
        this.avr.clear();
        this.avs.clear();
    }
}

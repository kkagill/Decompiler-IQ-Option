package com.iqoption.app.managers.a;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.collect.aj;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.core.microservices.tradingengine.response.active.n;
import com.iqoption.core.microservices.tradingengine.response.active.n.d.c;
import com.iqoption.core.util.LocalizationUtil;
import com.iqoption.dto.entity.expiration.Expiration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeSet;

/* compiled from: ExpirationTurboBinaryHelper */
public abstract class g implements i {
    public void q(a aVar) {
    }

    public t<Expiration> p(a aVar) {
        return p.bo(b((n) aVar));
    }

    private Expiration b(n nVar) {
        long startTime;
        long aim = nVar.aij().aim() * 1000;
        int activeId = nVar.getActiveId();
        InstrumentType instrumentType = nVar.getInstrumentType();
        long Ia = l.HZ().Ia();
        if (nVar.aij().aio() == 0) {
            startTime = nVar.aij().getStartTime() * 1000;
        } else {
            startTime = nVar.aij().aio();
        }
        long a = e.a(activeId, instrumentType, Ia, startTime, aim, (long) (nVar.aik() * 1000));
        nVar.aij().ba(a);
        return new Expiration(a, aim);
    }

    public Expiration a(a aVar, Expiration expiration) {
        n nVar = (n) aVar;
        long aim = nVar.aij().aim() * 1000;
        Expiration expiration2 = new Expiration(expiration.expValue.longValue() + aim, aim);
        if (b(nVar, expiration2)) {
            return new Expiration(expiration2.expValue.longValue(), aim);
        }
        return b(nVar);
    }

    public boolean b(a aVar, Expiration expiration) {
        if (!(expiration == null || expiration.expValue.longValue() == -1 || expiration.expValue.longValue() == 0)) {
            aj sK = c((n) aVar).iterator();
            while (sK.hasNext()) {
                if (((Expiration) sK.next()).expValue.equals(expiration.expValue)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public ImmutableList<Expiration> c(n nVar) {
        long startTime;
        TreeSet d = Sets.d(e.ORDERING);
        long aim = nVar.aij().aim() * 1000;
        long Ib = l.HZ().Ib();
        if (nVar.aij().aio() == 0) {
            startTime = nVar.aij().getStartTime() * 1000;
        } else {
            startTime = nVar.aij().aio();
        }
        long a = e.a(Ib, startTime, aim, (long) (nVar.aik() * 1000));
        for (int i = 0; i < nVar.aij().getCount(); i++) {
            long j = (((long) i) * aim) + a;
            if (nVar.aX(j)) {
                d.add(new Expiration(j, aim));
            }
        }
        d.addAll(a(nVar, aim));
        return ImmutableList.m(d);
    }

    /* Access modifiers changed, original: protected */
    public TreeSet<Expiration> a(n nVar, long j) {
        TreeSet d = Sets.d(e.ORDERING);
        if (nVar.aij().ain() != null) {
            for (Entry entry : nVar.aij().ain().entrySet()) {
                Long l = (Long) entry.getKey();
                c cVar = (c) entry.getValue();
                if (cVar.getEnabled()) {
                    d.add(Expiration.special2expiration(l.longValue(), j, LocalizationUtil.hq(cVar.getTitle())));
                }
            }
        }
        return d;
    }

    public String a(a aVar, long j) {
        n nVar = (n) aVar;
        Iterator it = a(nVar, nVar.aij().aim() * 1000).iterator();
        while (it.hasNext()) {
            Expiration expiration = (Expiration) it.next();
            if (expiration.expValue.longValue() == j) {
                return expiration.title;
            }
        }
        return e.ap(j);
    }

    public long c(a aVar, Expiration expiration) {
        return (long) (((n) aVar).aik() * 1000);
    }
}

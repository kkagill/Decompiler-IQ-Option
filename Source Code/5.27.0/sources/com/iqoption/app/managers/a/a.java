package com.iqoption.app.managers.a;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.managers.l;
import com.iqoption.core.microservices.tradingengine.response.active.n;
import com.iqoption.dto.entity.expiration.Expiration;
import java.util.List;
import java.util.TreeSet;

/* compiled from: ExpirationBinaryHelper */
public class a extends g {
    public long n(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return 60000;
    }

    public t<ImmutableList<Expiration>> m(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        n nVar = (n) aVar;
        if (nVar.aij().getCount() > 4) {
            return p.bo(a(nVar));
        }
        return p.bo(c(nVar));
    }

    private ImmutableList<Expiration> a(n nVar) {
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
                Expiration expiration = new Expiration(j, aim);
                List findGroupExp = Expiration.findGroupExp(d, expiration);
                if (findGroupExp == null) {
                    Expiration createGroupExpiration = Expiration.createGroupExpiration(j, aim);
                    createGroupExpiration.expirationsInGroup.add(expiration);
                    d.add(createGroupExpiration);
                } else {
                    findGroupExp.add(expiration);
                }
            }
        }
        d.addAll(a(nVar, aim));
        return ImmutableList.m(d);
    }
}

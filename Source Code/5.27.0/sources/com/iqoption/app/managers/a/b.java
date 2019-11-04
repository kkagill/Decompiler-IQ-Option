package com.iqoption.app.managers.a;

import android.util.LruCache;
import androidx.annotation.NonNull;
import com.google.common.base.Predicates;
import com.google.common.base.d;
import com.google.common.base.e;
import com.google.common.base.j;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aj;
import com.google.common.collect.i;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.a.e.c;
import com.iqoption.app.managers.l;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.util.v;
import com.iqoption.x.R;
import java.util.concurrent.ExecutionException;

/* compiled from: ExpirationCfdHelper */
public class b implements i {
    private static final LruCache<Long, j<Expiration>> avm = new LruCache(10);
    private final d<Iterable<Expiration>, Expiration> avn = -$$Lambda$b$c9ykY2z8-DJsWMh4ClLgpsAw9RA.INSTANCE;

    public long n(a aVar) {
        return 0;
    }

    public void q(a aVar) {
    }

    private static j<Expiration> c(@NonNull Expiration expiration) {
        j jVar = (j) avm.get(expiration.expValue);
        if (jVar != null) {
            return jVar;
        }
        -$$Lambda$b$3Pr7WMfooOgIo5LJhl_8_i5n46c -__lambda_b_3pr7wmfooogio5ljhl_8_i5n46c = new -$$Lambda$b$3Pr7WMfooOgIo5LJhl_8_i5n46c(expiration);
        avm.put(expiration.expValue, -__lambda_b_3pr7wmfooogio5ljhl_8_i5n46c);
        return -__lambda_b_3pr7wmfooogio5ljhl_8_i5n46c;
    }

    private ImmutableList<Expiration> o(a aVar) {
        return (ImmutableList) m(aVar).get();
    }

    public t<ImmutableList<Expiration>> m(a aVar) {
        com.iqoption.core.microservices.tradingengine.response.active.j jVar = (com.iqoption.core.microservices.tradingengine.response.active.j) aVar;
        if (!jVar.isExpired()) {
            return p.bo(ImmutableList.sQ());
        }
        return p.bo(i.b(jVar.aia()).b(Predicates.qb()).a(-$$Lambda$b$lkneWSAuIiPdGBye-A4gYXGX2OI.INSTANCE).b(new c(Integer.valueOf(aVar.getActiveId()), aVar.getInstrumentType(), l.HZ().Ib())).a(Expiration.orderingValue));
    }

    public t<Expiration> p(a aVar) {
        com.iqoption.core.microservices.tradingengine.response.active.j jVar = (com.iqoption.core.microservices.tradingengine.response.active.j) aVar;
        if (jVar.isExpired()) {
            return v.a(m(jVar), this.avn);
        }
        return p.bo(Expiration.ignoredExpiration);
    }

    public Expiration a(a aVar, Expiration expiration) {
        if (((com.iqoption.core.microservices.tradingengine.response.active.j) aVar).isExpired()) {
            try {
                aj sK = o(aVar).iterator();
                Long valueOf = expiration == null ? Long.valueOf(0) : (Long) e.g(expiration.expValue, Long.valueOf(0));
                while (sK.hasNext()) {
                    Expiration expiration2 = (Expiration) sK.next();
                    if ((expiration2 == null ? Long.valueOf(0) : (Long) e.g(expiration2.expValue, Long.valueOf(0))).longValue() > valueOf.longValue()) {
                        return expiration2;
                    }
                }
                return expiration;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return Expiration.ignoredExpiration;
    }

    public boolean b(a aVar, Expiration expiration) {
        if (((com.iqoption.core.microservices.tradingengine.response.active.j) aVar).isExpired()) {
            try {
                return i.b(o(aVar)).d(Predicates.ao(expiration)).isPresent();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return true;
    }

    public String a(a aVar, long j) {
        if (!((com.iqoption.core.microservices.tradingengine.response.active.j) aVar).isExpired()) {
            return null;
        }
        if (j == 0) {
            return IQApp.Eu().getString(R.string.n_a);
        }
        return TimeUtil.bRq.format(Long.valueOf(j));
    }

    public long c(a aVar, Expiration expiration) {
        if (((com.iqoption.core.microservices.tradingengine.response.active.j) aVar).isExpired() && expiration != null) {
            try {
                if (expiration.expValue != null) {
                    if (!expiration.expValue.equals(Long.valueOf(0))) {
                        Expiration expiration2 = (Expiration) i.b(o(aVar)).d(c(expiration)).pN();
                        if (!(expiration2 == null || expiration2.deadTime == null)) {
                            return expiration2.deadTime.longValue();
                        }
                    }
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return 0;
    }
}

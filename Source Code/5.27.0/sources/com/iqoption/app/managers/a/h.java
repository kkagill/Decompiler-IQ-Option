package com.iqoption.app.managers.a;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.core.microservices.tradingengine.response.active.n;
import com.iqoption.dto.entity.expiration.Expiration;

/* compiled from: ExpirationTurboHelper */
public class h extends g {
    public t<ImmutableList<Expiration>> m(a aVar) {
        return p.bo(c((n) aVar));
    }

    public long n(a aVar) {
        return c(aVar, Expiration.notInitilizedExpiration);
    }
}

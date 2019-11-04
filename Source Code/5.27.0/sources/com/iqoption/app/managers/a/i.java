package com.iqoption.app.managers.a;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.t;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.dto.entity.expiration.Expiration;

/* compiled from: IExpirationHelper */
public interface i {
    Expiration a(a aVar, Expiration expiration);

    String a(a aVar, long j);

    boolean b(a aVar, Expiration expiration);

    long c(a aVar, Expiration expiration);

    t<ImmutableList<Expiration>> m(a aVar);

    long n(a aVar);

    t<Expiration> p(a aVar);

    void q(a aVar);
}

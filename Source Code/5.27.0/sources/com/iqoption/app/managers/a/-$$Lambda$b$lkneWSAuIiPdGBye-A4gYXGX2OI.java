package com.iqoption.app.managers.a;

import com.google.common.base.d;
import com.iqoption.core.microservices.tradingengine.response.active.j.a;
import com.iqoption.dto.entity.expiration.Expiration;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$b$lkneWSAuIiPdGBye-A4gYXGX2OI implements d {
    public static final /* synthetic */ -$$Lambda$b$lkneWSAuIiPdGBye-A4gYXGX2OI INSTANCE = new -$$Lambda$b$lkneWSAuIiPdGBye-A4gYXGX2OI();

    private /* synthetic */ -$$Lambda$b$lkneWSAuIiPdGBye-A4gYXGX2OI() {
    }

    public final Object apply(Object obj) {
        return Expiration.createCfdExpiration(((a) obj).getExpiration() * 1000, ((a) obj).aid() * 1000);
    }
}

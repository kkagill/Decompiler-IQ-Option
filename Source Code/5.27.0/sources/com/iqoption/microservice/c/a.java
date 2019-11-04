package com.iqoption.microservice.c;

import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.b;
import com.google.common.util.concurrent.h;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.util.v;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: OtnLeaderBoardRequests */
public final class a {
    private static b<Long, com.iqoption.microservice.c.a.a> dGM = CacheBuilder.qq().x(1).a(1, TimeUnit.MINUTES).qF();
    private static n<b<Long, Object>> dGN = Suppliers.a(new n<b<Long, Object>>() {
        /* renamed from: aOh */
        public b<Long, Object> get() {
            return CacheBuilder.qq().x(10).a(30, TimeUnit.MINUTES).qF();
        }
    });

    public static t<com.iqoption.microservice.c.a.a> bU(final long j) {
        com.iqoption.microservice.c.a.a aVar = (com.iqoption.microservice.c.a.a) dGM.ar(Long.valueOf(j));
        if (aVar != null) {
            return p.bo(aVar);
        }
        Long valueOf = Long.valueOf(com.iqoption.app.b.DG().getUserId());
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", valueOf);
        hashMap.put("user_country_id", Integer.valueOf(0));
        hashMap.put("country_id", Long.valueOf(j));
        hashMap.put("from_position", Integer.valueOf(1));
        hashMap.put("to_position", Integer.valueOf(200));
        hashMap.put("position_country", Integer.valueOf(0));
        hashMap.put("near_traders_count", Integer.valueOf(0));
        hashMap.put("top_count", Integer.valueOf(0));
        hashMap.put("request_id", Integer.valueOf(0));
        hashMap.put("top_type", Integer.valueOf(3));
        return v.a(new com.iqoption.mobbtech.connect.request.a.a.b.a(com.iqoption.microservice.c.a.a.class).ch(false).fo("request-leaderboard-deals-client").b(hashMap).UA(), new h<com.iqoption.microservice.c.a.a, com.iqoption.microservice.c.a.a>() {
            /* renamed from: b */
            public t<com.iqoption.microservice.c.a.a> apply(com.iqoption.microservice.c.a.a aVar) {
                a.dGM.put(Long.valueOf(j), aVar);
                return p.bo(aVar);
            }
        });
    }
}

package com.iqoption.mobbtech.connect.request.api;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.dto.entity.iqbus.CountriesResponse;
import com.iqoption.dto.entity.iqbus.Country;
import com.iqoption.mobbtech.connect.request.a.a.b;
import com.iqoption.util.v;
import java.util.HashMap;

/* compiled from: IQBusGeoRequests */
public class c {
    private static final String TAG = "com.iqoption.mobbtech.connect.request.api.c";
    private static ImmutableMap<Long, Country> dIf = ImmutableMap.sW();
    private static ImmutableList<Country> dIg = ImmutableList.sQ();

    public static t<Country> bQ(final long j) {
        if (dIf.containsKey(Long.valueOf(j))) {
            return p.bo(dIf.get(Long.valueOf(j)));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(j));
        String str = "get-country-by-brand";
        t b = new b(Country.class, null, str).b(str, hashMap);
        v.b(b, new o<Country>() {
            public void l(Throwable th) {
            }

            /* renamed from: e */
            public void onSuccess(Country country) {
                c.dIf = ImmutableMap.sX().p(c.dIf).m(Long.valueOf(j), country).tf();
            }
        });
        return b;
    }

    public static t<ImmutableList<Country>> aPt() {
        if (!dIg.isEmpty()) {
            return p.bo(dIg);
        }
        String str = "get-countries-list-by-brand";
        return v.a(new b(CountriesResponse.class, str).b(str, new HashMap()), -$$Lambda$c$FeDLYNLDOj4bNjq5a6kE1jIf64k.INSTANCE);
    }
}

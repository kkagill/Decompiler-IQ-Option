package com.iqoption.microservice.d;

import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.microservice.d.a.b;
import com.iqoption.microservice.d.a.c;
import com.iqoption.microservice.d.a.e;

/* compiled from: OtnTokenRequests */
public final class a {
    public static t<e> aOl() {
        return new com.iqoption.mobbtech.connect.request.a.a.b.a(e.class).fo("get-operations").ch(false).UA();
    }

    public static t<c> aOm() {
        return p.m(new RuntimeException("API get-emission-summary is not available anymore"));
    }

    public static t<com.iqoption.microservice.d.a.a> aOn() {
        return p.m(new RuntimeException("API get-coin-balance is not available anymore"));
    }

    public static t<b> aOo() {
        return p.m(new RuntimeException("API get-emission-history is not available anymore"));
    }
}

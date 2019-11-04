package com.iqoption.microservice.quotes.history;

import com.google.common.util.concurrent.t;
import com.iqoption.core.microservices.quoteshistory.response.c;
import com.iqoption.core.rx.g;
import com.iqoption.mobbtech.connect.request.a.a.b;

/* compiled from: QuotesHistoryRequests */
public final class a {
    public static t<c> a(int i, long j, long j2, int i2) {
        return g.c(com.iqoption.core.microservices.quoteshistory.a.a(i, i2, j, j2, 0, 0, 0, com.iqoption.app.managers.feature.c.Iw().ej("only-closed-candles")));
    }

    public static t<com.iqoption.core.microservices.quoteshistory.response.a> a(int i, long j, long j2, int i2, int i3, int i4, int i5) {
        return g.c(com.iqoption.core.microservices.quoteshistory.a.b(i, i2, j, j2, i3, i4, i5, com.iqoption.app.managers.feature.c.Iw().ej("only-closed-candles")));
    }

    public static t<com.iqoption.microservice.quotes.history.response.a> go(int i) {
        t UA = b.z(com.iqoption.microservice.quotes.history.response.a.class).fo("get-first-candles").fp("1.0").ch(false).k("active_id", Integer.valueOf(i)).UA();
        com.iqoption.core.analytics.a.b.aZL.a(UA, i);
        return UA;
    }
}

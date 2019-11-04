package com.iqoption.microservice.regulators;

import com.google.common.util.concurrent.t;
import com.iqoption.core.d;
import com.iqoption.microservice.regulators.response.b;
import io.reactivex.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/microservice/regulators/RegulatorsRequests;", "", "()V", "CMD_GET_PRO_TRADER_APPLICATION_STATUS", "", "CMD_GET_PRO_TRADER_NOTIFICATION", "EVENT_PRO_TRADER_APPLICATION_STATUS_UPDATED", "getProTraderApplicationStatus", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/iqoption/microservice/regulators/response/ProTraderApplicationStatus;", "getProTraderApplicationStatusUpdates", "Lio/reactivex/Flowable;", "getProTraderNotification", "Lcom/iqoption/microservice/regulators/response/ProTraderNotification;", "app_optionXRelease"})
/* compiled from: RegulatorsRequests.kt */
public final class a {
    public static final a dHd = new a();

    private a() {
    }

    public final t<b> aOv() {
        return com.iqoption.mobbtech.connect.request.a.a.b.z(b.class).fo("get-pro-trader-notification").UA();
    }

    public final t<com.iqoption.microservice.regulators.response.a> aOw() {
        return com.iqoption.mobbtech.connect.request.a.a.b.z(com.iqoption.microservice.regulators.response.a.class).fo("get-pro-trader-application-status").UA();
    }

    public final e<com.iqoption.microservice.regulators.response.a> aOx() {
        return d.EW().b("pro-trader-application-status-updated", com.iqoption.microservice.regulators.response.a.class).HQ();
    }
}

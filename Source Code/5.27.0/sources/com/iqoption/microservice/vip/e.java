package com.iqoption.microservice.vip;

import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.mobbtech.connect.request.a.a.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/microservice/vip/VipManagerRequests;", "", "()V", "getVipManagerInfo", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/iqoption/microservice/vip/VipManagerResponse;", "requestCallBack", "Lcom/iqoption/microservice/vip/BasicResponse;", "time", "", "trainingSessionId", "", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/google/common/util/concurrent/ListenableFuture;", "app_optionXRelease"})
/* compiled from: VipManagerRequests.kt */
public final class e {
    public static final e dHD = new e();

    private e() {
    }

    public final t<f> aOP() {
        t aPF = b.A(f.class).jo(IQApp.Ev().Vb()).jp("api/getcontactinfo").aPF();
        kotlin.jvm.internal.i.e(aPF, "RequestTask.httpOf(VipMa…)\n                .exec()");
        return aPF;
    }

    public final t<a> b(String str, Long l) {
        b.b jp = b.A(a.class).jo(IQApp.Ev().Vb()).gq(2).jp("api/callbackme");
        if (str != null) {
            jp.q("time", str);
        }
        if (l != null) {
            l.longValue();
            jp.q("trainingSessionId", l);
        }
        t aPF = jp.aPF();
        kotlin.jvm.internal.i.e(aPF, "builder.exec()");
        return aPF;
    }
}

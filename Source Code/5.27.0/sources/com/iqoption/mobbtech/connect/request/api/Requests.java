package com.iqoption.mobbtech.connect.request.api;

import android.content.Context;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.core.rx.g;
import com.iqoption.dto.Balance;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.request.a.a.a;
import com.iqoption.mobbtech.connect.request.a.a.b;
import com.iqoption.mobbtech.connect.response.options.e;
import java.util.HashMap;

public final class Requests {
    private static final String TAG = "com.iqoption.mobbtech.connect.request.api.Requests";

    public enum OptionType {
        turbo,
        binary
    }

    private Requests() {
    }

    public static void aPA() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(IQApp.Ev().Vb());
        String str = "api/demo/reset";
        stringBuilder.append(str);
        new a(RequestManager.b(stringBuilder.toString(), null, IQApp.Eu()), null, str).aPG();
    }

    public static void x(Long l) {
        HashMap hashMap = new HashMap();
        hashMap.put("balance_id", l);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(IQApp.Ev().Vb());
        String str = "api/profile/changebalance";
        stringBuilder.append(str);
        new a(RequestManager.b(stringBuilder.toString(), hashMap, IQApp.Eu()), null, str).aPG();
    }

    public static void a(Context context, Balance balance, com.iqoption.mobbtech.connect.a.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("balance_id", Long.valueOf(balance.id));
        String Vb = IQApp.Ev().Vb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vb);
        Vb = "api/profile/changebalance";
        stringBuilder.append(Vb);
        new a(RequestManager.b(stringBuilder.toString(), hashMap, context), aVar, Vb).aPG();
    }

    public static t<e> a(Context context, OptionType optionType, int i, long j) {
        String str = "type";
        return b.z(e.class).fo("get-options").k("user_balance_id", Long.valueOf(j)).k(str, optionType.name()).k(Order.LIMIT, Integer.valueOf(i)).UA();
    }

    public static t<com.iqoption.core.microservices.cms.a.b> jl(String str) {
        return g.c(com.iqoption.core.microservices.cms.a.gt(str));
    }
}

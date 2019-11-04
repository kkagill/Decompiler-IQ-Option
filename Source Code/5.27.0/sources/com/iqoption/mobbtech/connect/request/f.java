package com.iqoption.mobbtech.connect.request;

import android.content.Context;
import com.iqoption.app.IQApp;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.response.g;
import java.util.HashMap;

/* compiled from: PushSettingRequest */
public class f {

    /* compiled from: PushSettingRequest */
    public interface a {
        void a(com.iqoption.mobbtech.connect.response.f fVar);

        void onFinish();
    }

    public static void a(long j, boolean z, final a aVar, Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(j));
        hashMap.put("enabled", Boolean.valueOf(z));
        String Vb = IQApp.Ev().Vb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vb);
        Vb = "api/profile/settings/push";
        stringBuilder.append(Vb);
        com.iqoption.mobbtech.connect.request.a.a.a.a(RequestManager.b(stringBuilder.toString(), hashMap, context), new com.iqoption.mobbtech.connect.a.a() {
            /* renamed from: a */
            public void onSuccess(g gVar) {
                aVar.onFinish();
            }

            public void a(com.iqoption.mobbtech.connect.response.f fVar) {
                aVar.a(fVar);
            }
        }, Vb);
    }
}

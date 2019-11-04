package com.iqoption.mobbtech.connect.request;

import android.content.Context;
import com.iqoption.app.IQApp;
import com.iqoption.core.d;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.a.c;
import com.iqoption.mobbtech.connect.response.f;
import com.iqoption.mobbtech.connect.response.g;
import java.util.HashMap;
import java.util.TimeZone;

/* compiled from: ChangeLangRequest */
public class a {
    private boolean AB = false;

    public void a(Context context, final c cVar) {
        this.AB = true;
        HashMap hashMap = new HashMap();
        hashMap.put("lang", d.getLocale());
        hashMap.put("tz", TimeZone.getDefault().getID());
        String Vb = IQApp.Ev().Vb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vb);
        Vb = "api/profile/settings";
        stringBuilder.append(Vb);
        com.iqoption.mobbtech.connect.request.a.a.a.a(RequestManager.b(stringBuilder.toString(), hashMap, context), new com.iqoption.mobbtech.connect.a.a() {
            /* renamed from: a */
            public void onSuccess(g gVar) {
                a.this.AB = false;
                cVar.perform(new Object[0]);
            }

            public void a(f fVar) {
                a.this.AB = false;
                cVar.perform(new Object[0]);
            }
        }, Vb);
    }
}

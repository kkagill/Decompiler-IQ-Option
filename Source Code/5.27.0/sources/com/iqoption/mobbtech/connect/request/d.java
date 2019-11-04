package com.iqoption.mobbtech.connect.request;

import android.text.TextUtils;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.core.util.LocalizationUtil;
import com.iqoption.mobbtech.connect.request.a.a.b.b;
import com.iqoption.mobbtech.connect.response.e;
import com.iqoption.util.v;

/* compiled from: LocalizationRequest */
public final class d {
    public static t<e> aPc() {
        return h(null);
    }

    public static t<e> h(final Runnable runnable) {
        b jo = com.iqoption.mobbtech.connect.request.a.a.b.A(e.class).jo(IQApp.Ev().Vb());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("api/lang/json/");
        stringBuilder.append(LocalizationUtil.Wb());
        t aPF = jo.jp(stringBuilder.toString()).aPF();
        v.b(aPF, new o<e>() {
            /* renamed from: a */
            public void onSuccess(e eVar) {
                if (!(eVar == null || !eVar.isSuccessful() || eVar.aPO() == null || eVar.aPO().isJsonNull())) {
                    String jsonElement = eVar.aPO().toString();
                    if (!(TextUtils.isEmpty(jsonElement) || jsonElement.equalsIgnoreCase("null"))) {
                        LocalizationUtil.ae(eVar.getVersion(), jsonElement);
                    }
                }
                aPd();
            }

            public void l(Throwable th) {
                aPd();
            }

            private void aPd() {
                LocalizationUtil.init();
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        return aPF;
    }
}

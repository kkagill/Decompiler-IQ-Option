package com.iqoption.mobbtech.connect.request;

import android.content.Context;
import android.text.TextUtils;
import com.iqoption.app.IQApp;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.request.a.a.a;
import com.iqoption.mobbtech.connect.response.f;
import com.iqoption.mobbtech.connect.response.g;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChangePassRequest */
public class b {
    public void b(final Context context, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("current_password", str);
        hashMap.put("password", str2);
        hashMap.put("password2", str3);
        str = IQApp.Ev().Vb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        str = "api/profile/password";
        stringBuilder.append(str);
        a.a(RequestManager.b(stringBuilder.toString(), hashMap, context), new com.iqoption.mobbtech.connect.a.a() {
            /* renamed from: a */
            public void onSuccess(g gVar) {
                try {
                    com.iqoption.app.a.b.b(gVar.aPR().getJSONArray("message").getString(0), context);
                } catch (JSONException unused) {
                }
            }

            public void a(f fVar) {
                String str = "current_password";
                String str2 = "password";
                String str3 = "";
                if (fVar.aPP() != null) {
                    String str4 = "message";
                    if (!(fVar.aPP().optJSONArray(str4) == null && fVar.aPP().optJSONObject(str4) == null)) {
                        try {
                            JSONObject jSONObject = fVar.aPP().getJSONObject(str4);
                            if (TextUtils.isEmpty(str3) && jSONObject.optJSONArray(str2) != null) {
                                str3 = jSONObject.optJSONArray(str2).getString(0);
                            }
                            if (TextUtils.isEmpty(str3) && jSONObject.optJSONArray(str) != null) {
                                str3 = jSONObject.optJSONArray(str).getString(0);
                            }
                        } catch (JSONException unused) {
                            str3 = fVar.getErrorMessage();
                        }
                    }
                }
                if (str3.isEmpty()) {
                    com.iqoption.app.a.b.aQ(context);
                } else {
                    com.iqoption.app.a.b.b(str3, context);
                }
            }
        }, str);
    }
}

package com.iqoption.mobbtech.connect.response;

import android.content.Context;
import android.text.TextUtils;
import com.iqoption.app.a.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MobbError */
public class f {
    private static final String TAG = "com.iqoption.mobbtech.connect.response.f";
    private int code = -100;
    private JSONObject dIX;
    private Object dIY;
    private String message;

    public f(String str) {
        jq(str);
    }

    public void gr(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public JSONObject aPP() {
        return this.dIX;
    }

    public void jq(String str) {
        try {
            this.dIX = new JSONObject(str);
        } catch (NullPointerException | JSONException unused) {
        }
    }

    public void bF(Context context) {
        String errorMessage = getErrorMessage();
        if (TextUtils.isEmpty(errorMessage)) {
            b.aQ(context);
        } else {
            b.b(errorMessage, context);
        }
    }

    public String getErrorMessage() {
        String str;
        if (aPP() == null) {
            str = null;
        } else {
            String str2 = "message";
            if (aPP().optJSONArray(str2) == null || aPP().optJSONArray(str2).length() <= 0) {
                str = aPP().optString(str2);
            } else {
                str = aPP().optJSONArray(str2).optString(0);
            }
        }
        return TextUtils.isEmpty(str) ? this.message : str;
    }

    public void ci(Object obj) {
        this.dIY = obj;
    }

    public String toString() {
        String errorMessage = getErrorMessage();
        return TextUtils.isEmpty(errorMessage) ? super.toString() : errorMessage;
    }
}

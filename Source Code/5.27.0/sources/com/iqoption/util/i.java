package com.iqoption.util;

import android.text.TextUtils;
import com.crashlytics.android.a;
import com.iqoption.mobbtech.connect.response.MobbErrorException;
import com.iqoption.mobbtech.connect.response.f;
import org.json.JSONObject;

/* compiled from: CrashlyticsUtils */
public final class i {
    private static final String TAG = "com.iqoption.util.i";

    private i() {
    }

    public static void d(Throwable th) {
        String errorMessage;
        if (th instanceof MobbErrorException) {
            MobbErrorException mobbErrorException = (MobbErrorException) th;
            if (mobbErrorException.aPQ() != null) {
                CharSequence charSequence;
                f aPQ = mobbErrorException.aPQ();
                JSONObject aPP = aPQ.aPP();
                if (aPP == null) {
                    charSequence = null;
                } else {
                    charSequence = aPP.toString();
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    a.ag(charSequence);
                }
                errorMessage = aPQ.getErrorMessage();
                if (!TextUtils.isEmpty(errorMessage)) {
                    a.ag(errorMessage);
                }
                a.d(th);
            }
        }
        errorMessage = th.getMessage();
        if (!TextUtils.isEmpty(errorMessage)) {
            a.ag(errorMessage);
        }
        a.d(th);
    }

    public static void ag(String str) {
        if (!TextUtils.isEmpty(str)) {
            a.ag(str);
        }
    }
}

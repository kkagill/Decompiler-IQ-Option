package com.iqoption.mobbtech.connect.response;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.iqoption.app.IQApp;
import com.iqoption.core.microservices.c;
import com.iqoption.system.c.b;

/* compiled from: SimpleResponseBase */
public abstract class k implements c {
    @SerializedName("isSuccessful")
    public Boolean isSuccessful = Boolean.valueOf(false);

    /* compiled from: SimpleResponseBase */
    public static abstract class a<T> extends b<T, k> {
        private static final String TAG = "com.iqoption.mobbtech.connect.response.k$a";

        public a(T t) {
            super(t);
        }

        public void l(Throwable th) {
            if (th instanceof MobbErrorException) {
                String errorMessage = ((MobbErrorException) th).aPQ().getErrorMessage();
                if (TextUtils.isEmpty(errorMessage)) {
                    com.iqoption.app.a.b.aQ(IQApp.Eu());
                } else {
                    com.iqoption.app.a.b.b(errorMessage, IQApp.Eu());
                }
            }
            super.l(th);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isSuccessful: ");
        stringBuilder.append(this.isSuccessful);
        return stringBuilder.toString();
    }

    public boolean isSuccessful() {
        return this.isSuccessful.booleanValue();
    }
}

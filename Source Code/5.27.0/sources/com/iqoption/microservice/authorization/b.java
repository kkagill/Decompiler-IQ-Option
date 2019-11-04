package com.iqoption.microservice.authorization;

import com.iqoption.microservice.authorization.a.a;
import com.jumio.analytics.MobileEvents;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: RedirectRequestTask */
public class b extends com.iqoption.mobbtech.connect.request.a.a.b<a> {
    private static final String TAG = "com.iqoption.microservice.authorization.b";
    private static final Pattern dGy = Pattern.compile("(\\?|\\&)(error_code)\\=([\\d]+)\\\"");
    private a dGz = new a();

    /* Access modifiers changed, original: protected */
    public boolean aOa() {
        return false;
    }

    public b(Request request, String str) {
        super(a.class, request, str);
    }

    /* Access modifiers changed, original: protected */
    public String b(Response response) {
        try {
            this.responseCode = response.code();
            ResponseBody body = response.body();
            this.dGz.body = body != null ? body.string() : "";
            if (this.responseCode == MobileEvents.EVENTTYPE_SDKLIFECYCLE) {
                Matcher matcher = dGy.matcher(this.dGz.body);
                if (matcher.find() && matcher.groupCount() >= 3) {
                    this.dGz.dGA = Integer.valueOf(matcher.group(3)).intValue();
                }
                String str = this.dGz.body;
                return str;
            }
            response.close();
            return null;
        } finally {
            response.close();
        }
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: iX */
    public a iY(String str) {
        return this.dGz;
    }
}

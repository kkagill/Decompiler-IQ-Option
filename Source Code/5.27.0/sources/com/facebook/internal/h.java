package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FacebookWebFallbackDialog */
public class h extends ab {
    private static final String TAG = "com.facebook.internal.h";
    private boolean xT;

    public static h c(Context context, String str, String str2) {
        ab.ai(context);
        return new h(context, str, str2);
    }

    private h(Context context, String str, String str2) {
        super(context, str);
        bt(str2);
    }

    /* Access modifiers changed, original: protected */
    public Bundle bd(String str) {
        Bundle bq = z.bq(Uri.parse(str).getQuery());
        String str2 = "bridge_args";
        String string = bq.getString(str2);
        bq.remove(str2);
        String str3 = "Unable to parse bridge_args JSON";
        if (!z.aB(string)) {
            try {
                bq.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", c.g(new JSONObject(string)));
            } catch (JSONException e) {
                z.a(TAG, str3, e);
            }
        }
        str2 = "method_results";
        string = bq.getString(str2);
        bq.remove(str2);
        if (!z.aB(string)) {
            if (z.aB(string)) {
                string = "{}";
            }
            try {
                bq.putBundle("com.facebook.platform.protocol.RESULT_ARGS", c.g(new JSONObject(string)));
            } catch (JSONException e2) {
                z.a(TAG, str3, e2);
            }
        }
        bq.remove("version");
        bq.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", u.ky());
        return bq;
    }

    public void cancel() {
        WebView webView = getWebView();
        if (!la() || kZ() || webView == null || !webView.isShown()) {
            super.cancel();
        } else if (!this.xT) {
            this.xT = true;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("javascript:");
            stringBuilder.append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            webView.loadUrl(stringBuilder.toString());
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public void run() {
                    super.cancel();
                }
            }, 1500);
        }
    }
}

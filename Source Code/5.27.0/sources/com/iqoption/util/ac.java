package com.iqoption.util;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.iqoption.core.d;
import com.iqoption.mobbtech.connect.RequestManager;
import okhttp3.HttpUrl;

/* compiled from: NetworkUtil */
public class ac {
    public static void a(CookieManager cookieManager, String str) {
        if (!TextUtils.isEmpty(str)) {
            str = HttpUrl.parse(str).host();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lang=");
            stringBuilder.append(d.getLocale());
            cookieManager.setCookie(str, stringBuilder.toString());
            cookieManager.setCookie(str, "platform=17");
            stringBuilder = new StringBuilder();
            stringBuilder.append("ssid=");
            stringBuilder.append(RequestManager.aOR().aOU());
            cookieManager.setCookie(str, stringBuilder.toString());
            if (!TextUtils.isEmpty("")) {
                cookieManager.setCookie(str, "ws_route=");
            }
        }
    }
}

package com.iqoption.mobbtech.connect;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.core.connect.http.c;
import com.iqoption.core.d;
import com.iqoption.core.data.config.ApiConfig;
import com.iqoption.mobbtech.connect.request.a.a.e;
import com.iqoption.util.af;
import com.iqoption.util.i;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class RequestManager {
    private static final String TAG = "com.iqoption.mobbtech.connect.RequestManager";
    public static final MediaType blz = MediaType.parse("application/json; charset=utf-8");
    public static final long dHF = TimeUnit.DAYS.toMillis(6);
    private static volatile RequestManager dHG;
    public static String dHJ = null;
    public static final MediaType dHK = MediaType.parse("text/x-markdown; charset=utf-8");
    private final com.iqoption.core.connect.http.cookie.b baz = c.UH();
    private final OkHttpClient client;
    private final a dHH;
    private final OkHttpClient dHI;

    /* renamed from: com.iqoption.mobbtech.connect.RequestManager$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] dHL = new int[Method.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.iqoption.mobbtech.connect.RequestManager.Method.values();
            r0 = r0.length;
            r0 = new int[r0];
            dHL = r0;
            r0 = dHL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.mobbtech.connect.RequestManager.Method.GET;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = dHL;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.mobbtech.connect.RequestManager.Method.POST;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = dHL;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.mobbtech.connect.RequestManager.Method.DELETE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.mobbtech.connect.RequestManager$AnonymousClass1.<clinit>():void");
        }
    }

    public enum Method {
        GET,
        POST,
        PUT,
        DELETE,
        PATCH,
        MULTIPART,
        POST_JSON
    }

    static class a {
        final CookieJar cookieJar;

        a(CookieJar cookieJar) {
            this.cookieJar = cookieJar;
        }

        /* Access modifiers changed, original: 0000 */
        public Builder aPb() {
            return d.Um().EF().cookieJar(this.cookieJar).connectTimeout(60000, TimeUnit.MILLISECONDS).readTimeout(60000, TimeUnit.MILLISECONDS);
        }

        /* Access modifiers changed, original: 0000 */
        public Builder UN() {
            return aPb();
        }
    }

    static class b extends a {
        private static SSLSocketFactory dHM;
        private static SSLSocketFactory dHN;
        private static X509TrustManager trustManager;

        static {
            try {
                dHM = new com.iqoption.core.connect.http.a.b();
                dHN = new com.iqoption.core.connect.http.a.a(dHM);
                trustManager = new com.iqoption.core.connect.http.a.c();
            } catch (Exception e) {
                i.d(e);
            }
        }

        b(CookieJar cookieJar) {
            super(cookieJar);
        }

        /* Access modifiers changed, original: 0000 */
        public Builder UN() {
            return super.UN().sslSocketFactory(dHM, trustManager);
        }
    }

    private boolean jc(String str) {
        return false;
    }

    public static synchronized void initialize() {
        synchronized (RequestManager.class) {
            synchronized (RequestManager.class) {
                dHG = new RequestManager();
            }
        }
    }

    public static synchronized RequestManager aOR() {
        RequestManager requestManager;
        synchronized (RequestManager.class) {
            if (dHG == null) {
                synchronized (RequestManager.class) {
                    if (dHG == null) {
                        dHG = new RequestManager();
                    }
                }
            }
            requestManager = dHG;
        }
        return requestManager;
    }

    public RequestManager() {
        if (af.ebR) {
            this.dHH = new a(this.baz);
        } else {
            this.dHH = new b(this.baz);
        }
        Builder UN = this.dHH.UN();
        this.client = UN.build();
        this.dHI = UN.followRedirects(false).build();
    }

    public OkHttpClient aOS() {
        return this.client;
    }

    public Response a(Request request, boolean z) {
        if (z) {
            return this.client.newCall(request).execute();
        }
        return this.dHI.newCall(request).execute();
    }

    private Cookie aOT() {
        List<Cookie> loadForRequest = this.baz.loadForRequest(HttpUrl.parse(IQApp.Ev().Va()));
        synchronized (this) {
            String Va = IQApp.Ev().Va();
            for (Cookie cookie : loadForRequest) {
                if (Va.contains(cookie.domain()) && cookie.name().equalsIgnoreCase("ssid")) {
                    return cookie;
                }
            }
            return null;
        }
    }

    public String aOU() {
        Cookie aOT = aOT();
        if (aOT == null) {
            return null;
        }
        return aOT.value();
    }

    public boolean aOV() {
        return aOT() != null;
    }

    public boolean aOW() {
        long j = com.iqoption.app.d.getLong("a63e971afa3e");
        return aOV() && (j == 0 || System.currentTimeMillis() - j < dHF);
    }

    public void aOX() {
        String Vb = IQApp.Ev().Vb();
        ArrayList arrayList = new ArrayList();
        HttpUrl parse = HttpUrl.parse(Vb);
        arrayList.add(new Cookie.Builder().name("is_regulated").value("1").domain(parse.host()).expiresAt(Long.MAX_VALUE).build());
        this.baz.saveFromResponse(parse, arrayList);
    }

    public void aOY() {
        this.baz.clear();
    }

    public void aOZ() {
        List<Cookie> loadForRequest = this.baz.loadForRequest(HttpUrl.parse(IQApp.Ev().Va()));
        synchronized (this) {
            for (Cookie cookie : loadForRequest) {
                if (cookie.name().equalsIgnoreCase("ssid")) {
                    this.baz.b(cookie);
                    break;
                }
            }
        }
        com.iqoption.app.d.setLong("a63e971afa3e", 0);
    }

    public void bC(Context context) {
        if (context != null) {
            ApiConfig Ev = IQApp.Ev();
            HttpUrl parse = HttpUrl.parse(Ev.UX() ? Ev.Vb() : com.iqoption.debugmenu.debugmenu.a.cvk);
            String locale = d.getLocale();
            com.iqoption.app.d aP = com.iqoption.app.d.aP(context);
            CharSequence FG = aP.FG();
            long FH = aP.FH();
            if (!TextUtils.isEmpty(FG) && System.currentTimeMillis() - FH > 86400000) {
                FG = null;
                aP.dO(null);
            }
            String str = "5.27.0";
            String bD = bD(context);
            String bE = bE(context);
            String str2 = "platform";
            if (!jc(str2)) {
                this.baz.a(new Cookie.Builder().name(str2).value(Integer.toString(17)).domain(parse.host()).build());
            }
            if (!TextUtils.isEmpty(locale)) {
                str2 = "lang";
                if (!jc(str2)) {
                    this.baz.a(new Cookie.Builder().name(str2).value(locale).domain(parse.host()).build());
                }
            }
            if (!TextUtils.isEmpty(bD)) {
                locale = "aff";
                if (!jc(locale)) {
                    this.baz.a(new Cookie.Builder().name(locale).value(bD).domain(parse.host()).build());
                }
            }
            if (!TextUtils.isEmpty(bE)) {
                locale = "afftrack";
                if (!jc(locale)) {
                    this.baz.a(new Cookie.Builder().name(locale).value(bE).domain(parse.host()).build());
                }
            }
            if (!TextUtils.isEmpty(FG)) {
                bE = "retrack";
                if (!jc(bE)) {
                    this.baz.a(new Cookie.Builder().name(bE).value(FG).domain(parse.host()).build());
                }
            }
            if (!TextUtils.isEmpty(str)) {
                bE = "platform_version";
                if (!jc(bE)) {
                    this.baz.a(new Cookie.Builder().name(bE).value(str).domain(parse.host()).build());
                }
            }
            bE = "";
            if (!TextUtils.isEmpty(bE)) {
                locale = "ws_route";
                if (!jc(locale)) {
                    this.baz.a(new Cookie.Builder().name(locale).value(bE).domain(parse.host()).build());
                }
            }
            d.Un();
            bE = com.iqoption.app.d.Fa().Gm();
            if (!TextUtils.isEmpty(bE)) {
                this.baz.a(new Cookie.Builder().name("features").value(bE).domain(parse.host()).build());
            }
        }
    }

    public static String bD(Context context) {
        String str = "";
        if (TextUtils.isEmpty(str)) {
            return com.iqoption.app.d.aP(context).DB();
        }
        return str;
    }

    public static String bE(Context context) {
        return com.iqoption.app.d.aP(context).FF();
    }

    public static Request c(String str, Context context) {
        return a(str, null, context);
    }

    public static Request a(String str, HashMap<String, Object> hashMap, Context context) {
        return a(str, null, hashMap, context);
    }

    public static Request a(String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, Context context) {
        return a(str, (HashMap) hashMap, (HashMap) hashMap2, Method.GET, context);
    }

    public static Request b(String str, HashMap<String, Object> hashMap, Context context) {
        return a(str, null, (HashMap) hashMap, Method.POST, context);
    }

    public static <T> t<T> a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, Context context, Class<T> cls) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return a((Class) cls, a(stringBuilder.toString(), (HashMap) hashMap, (HashMap) hashMap2, Method.POST, context), str2);
    }

    public static <T> t<T> a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, Context context, Type type) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return a(type, a(stringBuilder.toString(), (HashMap) hashMap, (HashMap) hashMap2, Method.POST, context), str2);
    }

    public static <T> t<T> a(String str, String str2, HashMap<String, Object> hashMap, Context context, Class<T> cls) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return a((Class) cls, a(stringBuilder.toString(), null, (HashMap) hashMap, Method.POST, context), str2);
    }

    public static <T> t<T> a(String str, String str2, HashMap<String, Object> hashMap, String str3, Context context, Class<T> cls, @Nullable String str4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return a((Class) cls, a(stringBuilder.toString(), (HashMap) hashMap, str3, Method.POST, context, str4), str2);
    }

    public static <T> t<T> a(String str, String str2, HashMap<String, Object> hashMap, String str3, Context context, Type type, @Nullable String str4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return a(type, a(stringBuilder.toString(), (HashMap) hashMap, str3, Method.POST, context, str4), str2);
    }

    public static <T> t<T> a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, Context context, Class<T> cls, String str3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return a((Class) cls, a(stringBuilder.toString(), hashMap, hashMap2, context), str3);
    }

    public static <T> t<T> a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, Context context, Type type, String str3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return a(type, a(stringBuilder.toString(), hashMap, hashMap2, context), str3);
    }

    @NonNull
    private static <T> t<T> a(Class<T> cls, Request request, String str) {
        return new e((Class) cls, request, str).aPF();
    }

    @NonNull
    private static <T> t<T> a(Type type, Request request, String str) {
        return new e(type, request, str).aPF();
    }

    private static Request a(String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, Method method, Context context) {
        aOR().bC(context);
        Request.Builder builder = new Request.Builder();
        int i = AnonymousClass1.dHL[method.ordinal()];
        if (i == 1) {
            if (!(hashMap2 == null || hashMap2.isEmpty())) {
                str = String.format("%s?%s", new Object[]{str, c(hashMap2)});
            }
            builder.url(str);
        } else if (i == 2) {
            builder.url(str);
            builder.post(d(hashMap2));
        } else if (i == 3) {
            builder.url(str);
            builder.delete();
        }
        builder.addHeader("User-Agent", hu());
        builder.addHeader("Accept", "application/json, */*");
        if (!(hashMap == null || hashMap.isEmpty())) {
            for (String str2 : hashMap.keySet()) {
                builder.addHeader(str2, String.valueOf(hashMap.get(str2)));
            }
        }
        return builder.build();
    }

    private static Request a(String str, HashMap<String, Object> hashMap, String str2, Method method, Context context, String str3) {
        aOR().bC(context);
        Request.Builder builder = new Request.Builder();
        if (AnonymousClass1.dHL[method.ordinal()] == 2) {
            builder.url(str);
            builder.post(RequestBody.create(blz, str2));
            builder.addHeader("User-Agent", hu());
            builder.addHeader("Accept", "application/json, */*");
            if (!TextUtils.isEmpty(str3)) {
                builder.addHeader("Session-Id", str3);
            }
            if (hashMap != null) {
                for (String str22 : hashMap.keySet()) {
                    builder.addHeader(str22, String.valueOf(hashMap.get(str22)));
                }
            }
            return builder.build();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("json is not supported for ");
        stringBuilder.append(method);
        throw new RuntimeException(stringBuilder.toString());
    }

    public static String ad(String str, String str2) {
        return q(null, str, str2);
    }

    public static String q(String str, String str2, String str3) {
        HttpUrl parse = HttpUrl.parse(IQApp.Ev().Va());
        if (str == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(parse.scheme());
            stringBuilder.append("://");
            str = stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(str2);
        stringBuilder2.append(parse.host());
        stringBuilder2.append("/");
        stringBuilder2.append(str3);
        return stringBuilder2.toString();
    }

    public static String hu() {
        String str = ")";
        String str2 = "/";
        if (TextUtils.isEmpty(dHJ)) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com.iqoption.x");
                stringBuilder.append(str2);
                stringBuilder.append("5.27.0");
                stringBuilder.append("(");
                stringBuilder.append(465);
                stringBuilder.append(str);
                stringBuilder.append("(Android ");
                stringBuilder.append(Build.DEVICE);
                stringBuilder.append(str2);
                stringBuilder.append(VERSION.RELEASE);
                stringBuilder.append(str);
                dHJ = URLEncoder.encode(stringBuilder.toString(), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return dHJ;
    }

    protected static String c(HashMap<String, Object> hashMap) {
        String str = "UTF-8";
        if (hashMap == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : hashMap.entrySet()) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("&");
                }
                stringBuilder.append(String.format("%s=%s", new Object[]{URLEncoder.encode(entry.getKey().toString(), str), URLEncoder.encode(entry.getValue().toString(), str)}));
            }
        } catch (Exception unused) {
        }
        return stringBuilder.toString();
    }

    private static RequestBody d(HashMap<String, Object> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return aPa();
        }
        FormBody.Builder builder = new FormBody.Builder();
        for (Entry entry : hashMap.entrySet()) {
            builder.add((String) entry.getKey(), com.google.common.base.e.g(entry.getValue(), "").toString());
        }
        return builder.build();
    }

    private static RequestBody aPa() {
        return RequestBody.create(dHK, " ");
    }
}

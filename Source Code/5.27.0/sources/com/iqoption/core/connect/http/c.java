package com.iqoption.core.connect.http;

import android.os.Build;
import android.os.Build.VERSION;
import com.iqoption.core.d;
import com.iqoption.core.manager.LogoutClearList;
import com.iqoption.core.manager.LogoutClearList.Clearable;
import com.iqoption.core.manager.ae;
import io.reactivex.b.l;
import io.reactivex.p;
import io.reactivex.q;
import io.reactivex.s;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002fgB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010A\u001a\u00020BH\u0016JG\u0010C\u001a\u0002HD\"\u0004\b\u0000\u0010D2\u0006\u0010E\u001a\u00020F2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002HD0\t2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I2\b\b\u0002\u0010K\u001a\u000206¢\u0006\u0002\u0010LJa\u0010C\u001a\u0002HD\"\u0004\b\u0000\u0010D\"\u0004\b\u0001\u0010M2\u0006\u0010E\u001a\u00020F2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002HM0\t2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u0002HM\u0012\u0004\u0012\u0002HD0\t2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I2\b\b\u0002\u0010K\u001a\u000206¢\u0006\u0002\u0010OJH\u0010P\u001a\b\u0012\u0004\u0012\u0002HD0Q\"\u0004\b\u0000\u0010D2\u0006\u0010E\u001a\u00020F2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002HD0\t2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I2\b\b\u0002\u0010K\u001a\u000206Jb\u0010P\u001a\b\u0012\u0004\u0012\u0002HD0Q\"\u0004\b\u0000\u0010D\"\u0004\b\u0001\u0010M2\u0006\u0010E\u001a\u00020F2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002HM0\t2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u0002HM\u0012\u0004\u0012\u0002HD0\t2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I2\b\b\u0002\u0010K\u001a\u000206J\b\u0010R\u001a\u0004\u0018\u00010+J\u0010\u0010R\u001a\u0004\u0018\u00010+2\u0006\u0010S\u001a\u00020\u0004J\u0006\u0010T\u001a\u00020BJ\u0016\u0010U\u001a\u00020B2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010V\u001a\u00020+J\u0014\u0010W\u001a\u00020F*\u00020F2\b\b\u0002\u0010X\u001a\u00020\u0004J\u0014\u0010Y\u001a\u00020F*\u00020F2\b\b\u0002\u0010X\u001a\u00020\u0004J\u001e\u0010Z\u001a\u00020B*\u0002012\u0006\u0010[\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010]H\u0002J.\u0010^\u001a\u00020F*\u00020F2\u0006\u0010_\u001a\u00020\u00042\u0006\u0010`\u001a\u00020\u00042\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020]0bJ&\u0010^\u001a\u00020F*\u00020F2\u0006\u0010S\u001a\u00020\u00042\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020]0bJ\u0018\u0010c\u001a\u00020+*\u00020\u00042\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010]H\u0002J\u0012\u0010d\u001a\u00020F*\u00020F2\u0006\u0010X\u001a\u00020\u0004J\f\u0010e\u001a\u00020\u0004*\u00020\u0004H\u0002J\u0018\u0010e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020]0bH\u0002J\f\u0010@\u001a\u00020F*\u00020FH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R%\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R%\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00040\u00040\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000eR\u0016\u0010&\u001a\n \f*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0004¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0002018\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u0002\u001a\u0004\b3\u00104R\u001c\u00105\u001a\u0002068\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u0002\u001a\u0004\b8\u00109R\u001c\u0010:\u001a\u0002068\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010\u0002\u001a\u0004\b<\u00109R\u001c\u0010=\u001a\u0002068\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010\u0002\u001a\u0004\b?\u00109R\u0016\u0010@\u001a\n \f*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006h"}, bng = {"Lcom/iqoption/core/connect/http/Http;", "Lcom/iqoption/core/manager/LogoutClearList$Clearable;", "()V", "ACCEPT_ENCODED", "", "ACCEPT_JSON", "AFF", "AFFTRACK", "BYTES_BODY_FETCHER", "Lkotlin/Function1;", "Lokhttp3/ResponseBody;", "", "kotlin.jvm.PlatformType", "getBYTES_BODY_FETCHER", "()Lkotlin/jvm/functions/Function1;", "CONNECT_TIMEOUT", "", "CONTENT_TYPE_JSON", "Lokhttp3/MediaType;", "getCONTENT_TYPE_JSON", "()Lokhttp3/MediaType;", "CONTENT_TYPE_TEXT", "getCONTENT_TYPE_TEXT", "FEATURES", "HEADER_ACCEPT", "HEADER_ACCEPT_X", "HEADER_CONTENT_TYPE", "HEADER_SESSION_ID", "HEADER_USER_AGENT", "LANG", "PLATFORM", "PLATFORM_VERSION", "READ_TIMEOUT", "RETRACK", "SSID", "STAGING", "STRING_BODY_FETCHER", "getSTRING_BODY_FETCHER", "TAG", "WS_ROUTE", "X_ACTION", "appCookies", "", "Lokhttp3/Cookie;", "getAppCookies", "()Ljava/util/List;", "clientBuilderFactory", "Lcom/iqoption/core/connect/http/Http$ClientBuilderFactory;", "cookieJar", "Lcom/iqoption/core/connect/http/cookie/DecoratedCookieJar;", "cookieJar$annotations", "getCookieJar", "()Lcom/iqoption/core/connect/http/cookie/DecoratedCookieJar;", "noRedirectClient", "Lokhttp3/OkHttpClient;", "noRedirectClient$annotations", "getNoRedirectClient", "()Lokhttp3/OkHttpClient;", "noSSLv3Client", "noSSLv3Client$annotations", "getNoSSLv3Client", "secureClient", "secureClient$annotations", "getSecureClient", "userAgent", "clearOnLogout", "", "execute", "T", "builder", "Lokhttp3/Request$Builder;", "parser", "validator", "Lio/reactivex/functions/Predicate;", "Lokhttp3/Response;", "client", "(Lokhttp3/Request$Builder;Lkotlin/jvm/functions/Function1;Lio/reactivex/functions/Predicate;Lokhttp3/OkHttpClient;)Ljava/lang/Object;", "D", "bodyFetcher", "(Lokhttp3/Request$Builder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lio/reactivex/functions/Predicate;Lokhttp3/OkHttpClient;)Ljava/lang/Object;", "executeSingle", "Lio/reactivex/Single;", "getSSIDCookie", "url", "refreshAppCookies", "setSSIDCookie", "cookie", "accept", "v", "acceptX", "addCookie", "name", "value", "", "addGetParams", "host", "path", "map", "", "asCookie", "sessionId", "urlEncode", "ClientBuilderFactory", "ClientBuilderFactoryKitKat", "core_release"})
/* compiled from: Http.kt */
public final class c implements Clearable {
    private static final String TAG = c.class.getSimpleName();
    private static final List<Cookie> baA = baz.UQ();
    private static final a baB;
    private static final OkHttpClient baC;
    private static final OkHttpClient baD;
    private static final OkHttpClient baE;
    public static final c baF;
    private static final MediaType bav = MediaType.parse("application/json; charset=utf-8");
    private static final MediaType baw = MediaType.parse("text/x-markdown; charset=utf-8");
    private static final kotlin.jvm.a.b<ResponseBody, String> bax = Http$STRING_BODY_FETCHER$1.baL;
    private static final kotlin.jvm.a.b<ResponseBody, byte[]> bay = Http$BYTES_BODY_FETCHER$1.baG;
    private static final com.iqoption.core.connect.http.cookie.b baz = new com.iqoption.core.connect.http.cookie.b(new com.iqoption.core.connect.http.cookie.c(new com.iqoption.core.connect.http.cookie.a.c(), new com.iqoption.core.connect.http.cookie.persistence.b(d.Uo())));
    private static final String userAgent;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, bng = {"Lcom/iqoption/core/connect/http/Http$ClientBuilderFactory;", "", "cookieJar", "Lokhttp3/CookieJar;", "(Lokhttp3/CookieJar;)V", "factory", "Lokhttp3/OkHttpClient$Builder;", "getFactory", "()Lokhttp3/OkHttpClient$Builder;", "noSSLv3Factory", "getNoSSLv3Factory", "secureFactory", "getSecureFactory", "core_release"})
    /* compiled from: Http.kt */
    public static class a {
        private final CookieJar cookieJar;

        public a(CookieJar cookieJar) {
            kotlin.jvm.internal.i.f(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
        }

        public Builder UM() {
            return UO();
        }

        public Builder UN() {
            return UO();
        }

        private final Builder UO() {
            Builder readTimeout = d.Um().EF().cookieJar(this.cookieJar).connectTimeout(15, TimeUnit.SECONDS).readTimeout(15, TimeUnit.SECONDS);
            kotlin.jvm.internal.i.e(readTimeout, "core.okHttpClientBuilder…IMEOUT, TimeUnit.SECONDS)");
            return readTimeout;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, bng = {"Lcom/iqoption/core/connect/http/Http$ClientBuilderFactoryKitKat;", "Lcom/iqoption/core/connect/http/Http$ClientBuilderFactory;", "cookieJar", "Lokhttp3/CookieJar;", "(Lokhttp3/CookieJar;)V", "noSSLv3Factory", "Lokhttp3/OkHttpClient$Builder;", "getNoSSLv3Factory", "()Lokhttp3/OkHttpClient$Builder;", "secureFactory", "getSecureFactory", "Companion", "core_release"})
    /* compiled from: Http.kt */
    public static final class b extends a {
        private static final com.iqoption.core.connect.http.a.b baH = new com.iqoption.core.connect.http.a.b();
        private static com.iqoption.core.connect.http.a.a baI = new com.iqoption.core.connect.http.a.a(baH);
        private static com.iqoption.core.connect.http.a.c baJ = new com.iqoption.core.connect.http.a.c();
        public static final a baK = new a();

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/core/connect/http/Http$ClientBuilderFactoryKitKat$Companion;", "", "()V", "noSSLv3SocketFactory", "Lcom/iqoption/core/connect/http/ssl/NoSSLv3SocketFactory;", "tlsSocketFactory", "Lcom/iqoption/core/connect/http/ssl/TLSSocketFactory;", "trustManager", "Lcom/iqoption/core/connect/http/ssl/x509TrustManager;", "core_release"})
        /* compiled from: Http.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }
        }

        public b(CookieJar cookieJar) {
            kotlin.jvm.internal.i.f(cookieJar, "cookieJar");
            super(cookieJar);
        }

        public Builder UM() {
            Builder sslSocketFactory = super.UM().sslSocketFactory(baI, baJ);
            kotlin.jvm.internal.i.e(sslSocketFactory, "super.noSSLv3Factory\n   …ketFactory, trustManager)");
            return sslSocketFactory;
        }

        public Builder UN() {
            Builder sslSocketFactory = super.UN().sslSocketFactory(baH, baJ);
            kotlin.jvm.internal.i.e(sslSocketFactory, "super.secureFactory\n    …ketFactory, trustManager)");
            return sslSocketFactory;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u0001H\u0002H\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "T", "D", "subscriber", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe"})
    /* compiled from: Http.kt */
    static final class c<T> implements s<T> {
        final /* synthetic */ Request.Builder baM;
        final /* synthetic */ kotlin.jvm.a.b baN;
        final /* synthetic */ kotlin.jvm.a.b baO;
        final /* synthetic */ l baP;
        final /* synthetic */ OkHttpClient baQ;

        c(Request.Builder builder, kotlin.jvm.a.b bVar, kotlin.jvm.a.b bVar2, l lVar, OkHttpClient okHttpClient) {
            this.baM = builder;
            this.baN = bVar;
            this.baO = bVar2;
            this.baP = lVar;
            this.baQ = okHttpClient;
        }

        public final void a(q<T> qVar) {
            kotlin.jvm.internal.i.f(qVar, "subscriber");
            try {
                qVar.onSuccess(c.baF.a(this.baM, this.baN, this.baO, this.baP, this.baQ));
            } catch (Throwable th) {
                qVar.onError(th);
            }
        }
    }

    static {
        a aVar;
        c cVar = new c();
        baF = cVar;
        com.iqoption.config.a Un = d.Un();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Un.Dv());
        stringBuilder.append('/');
        stringBuilder.append(Un.Dy());
        stringBuilder.append('(');
        stringBuilder.append(Un.getVersionCode());
        stringBuilder.append(")(Android ");
        stringBuilder.append(Build.DEVICE);
        stringBuilder.append('/');
        stringBuilder.append(VERSION.RELEASE);
        stringBuilder.append(")}");
        userAgent = URLEncoder.encode(stringBuilder.toString(), "UTF-8");
        if ((VERSION.SDK_INT >= 21 ? 1 : null) != null) {
            aVar = new a(baz);
        } else {
            aVar = new b(baz);
        }
        baB = aVar;
        LogoutClearList.a(cVar);
        Builder UN = baB.UN();
        OkHttpClient build = UN.build();
        kotlin.jvm.internal.i.e(build, "builder.build()");
        baC = build;
        OkHttpClient build2 = UN.followRedirects(false).build();
        kotlin.jvm.internal.i.e(build2, "builder.followRedirects(false).build()");
        baD = build2;
        build2 = baB.UM().build();
        kotlin.jvm.internal.i.e(build2, "clientBuilderFactory.noSSLv3Factory.build()");
        baE = build2;
        cVar.UI();
    }

    private c() {
    }

    public final MediaType UF() {
        return bav;
    }

    public final kotlin.jvm.a.b<ResponseBody, byte[]> UG() {
        return bay;
    }

    public static final com.iqoption.core.connect.http.cookie.b UH() {
        return baz;
    }

    public final void UI() {
        baz.UR();
        com.iqoption.core.connect.http.cookie.b bVar = baz;
        baF.a(bVar, "platform", d.Un().Dx());
        baF.a(bVar, "platform_version", d.Un().Dy());
        baF.a(bVar, "lang", d.getLocale());
        baF.a(bVar, "features", ae.bkV.getIdentity());
        baF.a(bVar, "aff", d.Un().DB());
        baF.a(bVar, "afftrack", d.Un().Dz());
        baF.a(bVar, "retrack", d.Un().DA());
        if (d.Un().Ds()) {
            if (d.Un().DC()) {
                baF.a(bVar, "ws_route", d.Un().DD());
            }
            if (d.Un().DE()) {
                baF.a(bVar, "staging", d.Un().DF());
            }
        }
    }

    private final void a(com.iqoption.core.connect.http.cookie.b bVar, String str, Object obj) {
        if (obj != null) {
            bVar.a(l(str, obj));
        }
    }

    private final Cookie l(String str, Object obj) {
        Cookie build = new Cookie.Builder().name(str).value(String.valueOf(obj)).domain(d.EE().getDomain()).build();
        kotlin.jvm.internal.i.e(build, "Cookie.Builder().name(th…apiConfig.domain).build()");
        return build;
    }

    public static final OkHttpClient UJ() {
        return baC;
    }

    public static final OkHttpClient UK() {
        return baE;
    }

    public void clearOnLogout() {
        baz.clear();
    }

    public static /* synthetic */ Object a(c cVar, Request.Builder builder, kotlin.jvm.a.b bVar, l lVar, OkHttpClient okHttpClient, int i, Object obj) {
        if ((i & 4) != 0) {
            lVar = b.bau;
        }
        if ((i & 8) != 0) {
            okHttpClient = baC;
        }
        return cVar.a(builder, bVar, lVar, okHttpClient);
    }

    public final <T> T a(Request.Builder builder, kotlin.jvm.a.b<? super String, ? extends T> bVar, l<Response> lVar, OkHttpClient okHttpClient) {
        kotlin.jvm.internal.i.f(builder, "builder");
        kotlin.jvm.internal.i.f(bVar, "parser");
        kotlin.jvm.internal.i.f(lVar, "validator");
        kotlin.jvm.internal.i.f(okHttpClient, "client");
        return a(builder, bax, (kotlin.jvm.a.b) bVar, (l) lVar, okHttpClient);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c0 A:{ExcHandler: HttpException (r10_18 'e' com.iqoption.core.connect.http.HttpException), Splitter:B:1:0x0029} */
    /* JADX WARNING: Missing block: B:23:0x00c0, code skipped:
            r10 = move-exception;
     */
    /* JADX WARNING: Missing block: B:25:0x00c3, code skipped:
            throw r10;
     */
    public final <T, D> T a(okhttp3.Request.Builder r10, kotlin.jvm.a.b<? super okhttp3.ResponseBody, ? extends D> r11, kotlin.jvm.a.b<? super D, ? extends T> r12, io.reactivex.b.l<okhttp3.Response> r13, okhttp3.OkHttpClient r14) {
        /*
        r9 = this;
        r0 = "url";
        r1 = "builder";
        kotlin.jvm.internal.i.f(r10, r1);
        r1 = "bodyFetcher";
        kotlin.jvm.internal.i.f(r11, r1);
        r1 = "parser";
        kotlin.jvm.internal.i.f(r12, r1);
        r1 = "validator";
        kotlin.jvm.internal.i.f(r13, r1);
        r1 = "client";
        kotlin.jvm.internal.i.f(r14, r1);
        r10 = r9.a(r10);
        r10 = r10.build();
        r8 = r10.url();
        r10 = r14.newCall(r10);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r10 = r10.execute();	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r13 = r13.test(r10);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        if (r13 == 0) goto L_0x008b;
    L_0x0037:
        r10 = r10.body();	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        if (r10 == 0) goto L_0x0047;
    L_0x003d:
        r13 = "it";
        kotlin.jvm.internal.i.e(r10, r13);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r10 = r11.invoke(r10);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        goto L_0x0048;
    L_0x0047:
        r10 = 0;
    L_0x0048:
        if (r10 == 0) goto L_0x0070;
    L_0x004a:
        r10 = r12.invoke(r10);	 Catch:{ Throwable -> 0x004f, HttpException -> 0x00c0 }
        return r10;
    L_0x004f:
        r5 = move-exception;
        r10 = new com.iqoption.core.connect.http.HttpException;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r11 = com.iqoption.core.connect.h.aZX;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r2 = r11;
        r2 = (com.iqoption.core.connect.b) r2;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        kotlin.jvm.internal.i.e(r8, r0);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r4 = 0;
        r6 = 4;
        r7 = 0;
        r1 = r10;
        r3 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r11 = "error during parsing body";
        com.crashlytics.android.a.ag(r11);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r11 = r10;
        r11 = (java.lang.Throwable) r11;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        com.crashlytics.android.a.d(r11);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r10 = (java.lang.Throwable) r10;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        throw r10;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
    L_0x0070:
        r10 = new com.iqoption.core.connect.http.HttpException;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r2 = 0;
        kotlin.jvm.internal.i.e(r8, r0);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r4 = 0;
        r11 = new java.lang.Exception;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r12 = "Response body is null";
        r11.<init>(r12);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r5 = r11;
        r5 = (java.lang.Throwable) r5;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r6 = 5;
        r7 = 0;
        r1 = r10;
        r3 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r10 = (java.lang.Throwable) r10;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        throw r10;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
    L_0x008b:
        r11 = r10.code();	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r10 = r10.message();	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r12 = new com.iqoption.core.connect.http.HttpException;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r13 = new com.iqoption.core.connect.i;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r13.<init>(r11, r10);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r2 = r13;
        r2 = (com.iqoption.core.connect.b) r2;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        kotlin.jvm.internal.i.e(r8, r0);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r4 = 0;
        r5 = 0;
        r6 = 12;
        r7 = 0;
        r1 = r12;
        r3 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        r12 = (java.lang.Throwable) r12;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
        throw r12;	 Catch:{ HttpException -> 0x00c0, Throwable -> 0x00ad }
    L_0x00ad:
        r10 = move-exception;
        r5 = r10;
        r10 = new com.iqoption.core.connect.http.HttpException;
        r2 = 0;
        kotlin.jvm.internal.i.e(r8, r0);
        r4 = 0;
        r6 = 5;
        r7 = 0;
        r1 = r10;
        r3 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r10 = (java.lang.Throwable) r10;
        throw r10;
    L_0x00c0:
        r10 = move-exception;
        r10 = (java.lang.Throwable) r10;
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.connect.http.c.a(okhttp3.Request$Builder, kotlin.jvm.a.b, kotlin.jvm.a.b, io.reactivex.b.l, okhttp3.OkHttpClient):java.lang.Object");
    }

    public static /* synthetic */ p b(c cVar, Request.Builder builder, kotlin.jvm.a.b bVar, l lVar, OkHttpClient okHttpClient, int i, Object obj) {
        if ((i & 4) != 0) {
            lVar = b.bau;
        }
        if ((i & 8) != 0) {
            okHttpClient = baC;
        }
        return cVar.b(builder, bVar, lVar, okHttpClient);
    }

    public final <T> p<T> b(Request.Builder builder, kotlin.jvm.a.b<? super String, ? extends T> bVar, l<Response> lVar, OkHttpClient okHttpClient) {
        kotlin.jvm.internal.i.f(builder, "builder");
        kotlin.jvm.internal.i.f(bVar, "parser");
        kotlin.jvm.internal.i.f(lVar, "validator");
        kotlin.jvm.internal.i.f(okHttpClient, "client");
        return b(builder, bax, (kotlin.jvm.a.b) bVar, (l) lVar, okHttpClient);
    }

    public static /* synthetic */ p a(c cVar, Request.Builder builder, kotlin.jvm.a.b bVar, kotlin.jvm.a.b bVar2, l lVar, OkHttpClient okHttpClient, int i, Object obj) {
        if ((i & 8) != 0) {
            lVar = b.bau;
        }
        l lVar2 = lVar;
        if ((i & 16) != 0) {
            okHttpClient = baC;
        }
        return cVar.b(builder, bVar, bVar2, lVar2, okHttpClient);
    }

    public final <T, D> p<T> b(Request.Builder builder, kotlin.jvm.a.b<? super ResponseBody, ? extends D> bVar, kotlin.jvm.a.b<? super D, ? extends T> bVar2, l<Response> lVar, OkHttpClient okHttpClient) {
        kotlin.jvm.internal.i.f(builder, "builder");
        kotlin.jvm.internal.i.f(bVar, "bodyFetcher");
        kotlin.jvm.internal.i.f(bVar2, "parser");
        kotlin.jvm.internal.i.f(lVar, "validator");
        kotlin.jvm.internal.i.f(okHttpClient, "client");
        p a = p.a((s) new c(builder, bVar, bVar2, lVar, okHttpClient));
        kotlin.jvm.internal.i.e(a, "Single\n                .…      }\n                }");
        return a;
    }

    public final Cookie UL() {
        return fs(d.EE().Va());
    }

    public final Cookie fs(String str) {
        kotlin.jvm.internal.i.f(str, "url");
        HttpUrl parse = HttpUrl.parse(str);
        Cookie cookie = null;
        if (parse == null) {
            return null;
        }
        List loadForRequest = baz.loadForRequest(parse);
        if (loadForRequest.isEmpty()) {
            return null;
        }
        for (Cookie next : loadForRequest) {
            if (kotlin.jvm.internal.i.y(next.name(), "ssid")) {
                cookie = next;
                break;
            }
        }
        return cookie;
    }

    public final void a(String str, Cookie cookie) {
        kotlin.jvm.internal.i.f(str, "url");
        kotlin.jvm.internal.i.f(cookie, "cookie");
        HttpUrl parse = HttpUrl.parse(str);
        if (parse != null && kotlin.jvm.internal.i.y(cookie.name(), "ssid")) {
            baz.saveFromResponse(parse, m.K(cookie));
        }
    }

    private final Request.Builder a(Request.Builder builder) {
        builder = builder.addHeader("User-Agent", userAgent);
        kotlin.jvm.internal.i.e(builder, "addHeader(HEADER_USER_AGENT, userAgent)");
        return builder;
    }

    public final Request.Builder a(Request.Builder builder, String str) {
        kotlin.jvm.internal.i.f(builder, "$this$accept");
        kotlin.jvm.internal.i.f(str, "v");
        builder = builder.addHeader("Accept", str);
        kotlin.jvm.internal.i.e(builder, "addHeader(HEADER_ACCEPT, v)");
        return builder;
    }

    public final Request.Builder b(Request.Builder builder, String str) {
        kotlin.jvm.internal.i.f(builder, "$this$acceptX");
        kotlin.jvm.internal.i.f(str, "v");
        builder = builder.addHeader("X-Action", str);
        kotlin.jvm.internal.i.e(builder, "addHeader(HEADER_ACCEPT_X, v)");
        return builder;
    }

    public final Request.Builder c(Request.Builder builder, String str) {
        kotlin.jvm.internal.i.f(builder, "$this$sessionId");
        kotlin.jvm.internal.i.f(str, "v");
        builder = builder.addHeader("Session-Id", str);
        kotlin.jvm.internal.i.e(builder, "addHeader(HEADER_SESSION_ID, v)");
        return builder;
    }

    public final Request.Builder a(Request.Builder builder, String str, String str2, Map<String, ? extends Object> map) {
        kotlin.jvm.internal.i.f(builder, "$this$addGetParams");
        kotlin.jvm.internal.i.f(str, "host");
        kotlin.jvm.internal.i.f(str2, "path");
        kotlin.jvm.internal.i.f(map, "map");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        if ((map.isEmpty() ^ 1) != 0) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append('?');
            stringBuilder2.append(B(map));
            str = stringBuilder2.toString();
        } else {
            str = "";
        }
        stringBuilder.append(str);
        builder = builder.url(stringBuilder.toString());
        kotlin.jvm.internal.i.e(builder, "url(\"$host$path${if (map….urlEncode()}\" else \"\"}\")");
        return builder;
    }

    /* JADX WARNING: Missing block: B:12:0x0044, code skipped:
            if ((((java.lang.CharSequence) r2.getValue().toString()).length() > 0 ? 1 : null) != null) goto L_0x0048;
     */
    private final java.lang.String B(java.util.Map<java.lang.String, ? extends java.lang.Object> r11) {
        /*
        r10 = this;
        r11 = r11.entrySet();
        r11 = (java.lang.Iterable) r11;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r11 = r11.iterator();
    L_0x0011:
        r1 = r11.hasNext();
        if (r1 == 0) goto L_0x004e;
    L_0x0017:
        r1 = r11.next();
        r2 = r1;
        r2 = (java.util.Map.Entry) r2;
        r3 = r2.getKey();
        r3 = (java.lang.CharSequence) r3;
        r3 = r3.length();
        r4 = 1;
        r5 = 0;
        if (r3 <= 0) goto L_0x002e;
    L_0x002c:
        r3 = 1;
        goto L_0x002f;
    L_0x002e:
        r3 = 0;
    L_0x002f:
        if (r3 == 0) goto L_0x0047;
    L_0x0031:
        r2 = r2.getValue();
        r2 = r2.toString();
        r2 = (java.lang.CharSequence) r2;
        r2 = r2.length();
        if (r2 <= 0) goto L_0x0043;
    L_0x0041:
        r2 = 1;
        goto L_0x0044;
    L_0x0043:
        r2 = 0;
    L_0x0044:
        if (r2 == 0) goto L_0x0047;
    L_0x0046:
        goto L_0x0048;
    L_0x0047:
        r4 = 0;
    L_0x0048:
        if (r4 == 0) goto L_0x0011;
    L_0x004a:
        r0.add(r1);
        goto L_0x0011;
    L_0x004e:
        r0 = (java.util.List) r0;
        r1 = r0;
        r1 = (java.lang.Iterable) r1;
        r11 = "&";
        r2 = r11;
        r2 = (java.lang.CharSequence) r2;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r11 = com.iqoption.core.connect.http.Http$urlEncode$2.baR;
        r7 = r11;
        r7 = (kotlin.jvm.a.b) r7;
        r8 = 30;
        r9 = 0;
        r11 = kotlin.collections.u.a(r1, r2, r3, r4, r5, r6, r7, r8, r9);
        r11 = r10.ft(r11);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.connect.http.c.B(java.util.Map):java.lang.String");
    }

    private final String ft(String str) {
        str = com.google.common.d.b.vd().escape(str);
        kotlin.jvm.internal.i.e(str, "UrlEscapers.urlPathSegmentEscaper().escape(this)");
        return str;
    }
}

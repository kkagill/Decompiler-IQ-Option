package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.h;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.c;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: AbstractSpiCall */
public abstract class a {
    private static final Pattern eMJ = Pattern.compile("http(s?)://[^\\/]+", 2);
    private final HttpMethod eMK;
    private final String eML;
    protected final h nP;
    private final c nS;
    private final String url;

    public a(h hVar, String str, String str2, c cVar, HttpMethod httpMethod) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (cVar != null) {
            this.nP = hVar;
            this.eML = str;
            this.url = lk(str2);
            this.nS = cVar;
            this.eMK = httpMethod;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* Access modifiers changed, original: protected */
    public String getUrl() {
        return this.url;
    }

    /* Access modifiers changed, original: protected */
    public HttpRequest bjk() {
        return S(Collections.emptyMap());
    }

    /* Access modifiers changed, original: protected */
    public HttpRequest S(Map<String, String> map) {
        HttpRequest jt = this.nS.a(this.eMK, getUrl(), map).go(false).jt(10000);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics Android SDK/");
        stringBuilder.append(this.nP.getVersion());
        return jt.aS("User-Agent", stringBuilder.toString()).aS("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    private String lk(String str) {
        return !CommonUtils.aB(this.eML) ? eMJ.matcher(str).replaceFirst(this.eML) : str;
    }
}

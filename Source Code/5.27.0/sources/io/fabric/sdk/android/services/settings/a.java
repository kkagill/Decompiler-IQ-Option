package io.fabric.sdk.android.services.settings;

import android.content.res.Resources.NotFoundException;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.j;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.s;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.c;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: AbstractAppSpiCall */
abstract class a extends io.fabric.sdk.android.services.common.a {
    public a(h hVar, String str, String str2, c cVar, HttpMethod httpMethod) {
        super(hVar, str, str2, cVar, httpMethod);
    }

    public boolean a(d dVar) {
        HttpRequest b = b(a(bjk(), dVar), dVar);
        k biX = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending app info to ");
        stringBuilder.append(getUrl());
        String str = "Fabric";
        biX.d(str, stringBuilder.toString());
        if (dVar.ePm != null) {
            biX = io.fabric.sdk.android.c.biX();
            stringBuilder = new StringBuilder();
            stringBuilder.append("App icon hash is ");
            stringBuilder.append(dVar.ePm.ePf);
            biX.d(str, stringBuilder.toString());
            biX = io.fabric.sdk.android.c.biX();
            stringBuilder = new StringBuilder();
            stringBuilder.append("App icon size is ");
            stringBuilder.append(dVar.ePm.width);
            stringBuilder.append("x");
            stringBuilder.append(dVar.ePm.height);
            biX.d(str, stringBuilder.toString());
        }
        int code = b.code();
        String str2 = "POST".equals(b.method()) ? "Create" : "Update";
        k biX2 = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str2);
        stringBuilder2.append(" app request ID: ");
        stringBuilder2.append(b.header("X-REQUEST-ID"));
        biX2.d(str, stringBuilder2.toString());
        k biX3 = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Result was ");
        stringBuilder3.append(code);
        biX3.d(str, stringBuilder3.toString());
        return s.jq(code) == 0;
    }

    private HttpRequest a(HttpRequest httpRequest, d dVar) {
        return httpRequest.aS("X-CRASHLYTICS-API-KEY", dVar.oM).aS("X-CRASHLYTICS-API-CLIENT-TYPE", "android").aS("X-CRASHLYTICS-API-CLIENT-VERSION", this.nP.getVersion());
    }

    private HttpRequest b(HttpRequest httpRequest, d dVar) {
        String str = "Failed to close app icon InputStream.";
        String str2 = "app[name]";
        str2 = "app[display_version]";
        str2 = "app[build_version]";
        str2 = "app[source]";
        str2 = "app[minimum_sdk_version]";
        str2 = "app[built_sdk_version]";
        httpRequest = httpRequest.aW("app[identifier]", dVar.appId).aW(str2, dVar.name).aW(str2, dVar.ePg).aW(str2, dVar.ePh).b(str2, Integer.valueOf(dVar.ePj)).aW(str2, dVar.ePk).aW(str2, dVar.ePl);
        if (!CommonUtils.aB(dVar.ePi)) {
            httpRequest.aW("app[instance_identifier]", dVar.ePi);
        }
        if (dVar.ePm != null) {
            Closeable closeable = null;
            try {
                closeable = this.nP.getContext().getResources().openRawResource(dVar.ePm.ePE);
                httpRequest.aW("app[icon][hash]", dVar.ePm.ePf).a("app[icon][data]", "icon.png", "application/octet-stream", (InputStream) closeable).b("app[icon][width]", Integer.valueOf(dVar.ePm.width)).b("app[icon][height]", Integer.valueOf(dVar.ePm.height));
            } catch (NotFoundException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to find app icon with resource ID: ");
                stringBuilder.append(dVar.ePm.ePE);
                io.fabric.sdk.android.c.biX().e("Fabric", stringBuilder.toString(), e);
            } catch (Throwable th) {
                CommonUtils.a(closeable, str);
            }
            CommonUtils.a(closeable, str);
        }
        if (dVar.ePn != null) {
            for (j jVar : dVar.ePn) {
                httpRequest.aW(a(jVar), jVar.getVersion());
                httpRequest.aW(b(jVar), jVar.bji());
            }
        }
        return httpRequest;
    }

    /* Access modifiers changed, original: 0000 */
    public String a(j jVar) {
        return String.format(Locale.US, "app[build][libraries][%s][version]", new Object[]{jVar.getIdentifier()});
    }

    /* Access modifiers changed, original: 0000 */
    public String b(j jVar) {
        return String.format(Locale.US, "app[build][libraries][%s][type]", new Object[]{jVar.getIdentifier()});
    }
}

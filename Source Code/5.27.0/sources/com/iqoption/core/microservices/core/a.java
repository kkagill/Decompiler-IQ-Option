package com.iqoption.core.microservices.core;

import android.net.Uri;
import com.google.gson.JsonObject;
import com.iqoption.core.connect.http.c;
import com.iqoption.core.microservices.core.response.b;
import com.iqoption.core.microservices.core.response.f;
import io.reactivex.e;
import io.reactivex.p;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import okhttp3.Request.Builder;

@i(bne = {1, 1, 15}, bnf = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0004J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u0006\u0010\u0019\u001a\u00020\u0004J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u001c\u001a\u00020\u0004J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0014J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0014J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0014J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006'"}, bng = {"Lcom/iqoption/core/microservices/core/CoreRequests;", "", "()V", "API_CHANGE_BALANCE", "", "API_CONFIGURATION", "API_COUNT_ONLINE", "API_CURRENCIES", "API_GET_MY_COUNTRY", "API_LOCALIZATION", "API_REGULATION", "EVENT_PROFILE", "profileEvents", "Lio/reactivex/Flowable;", "Lcom/google/gson/JsonObject;", "getProfileEvents", "()Lio/reactivex/Flowable;", "profileEvents$delegate", "Lkotlin/Lazy;", "getConfiguration", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/core/response/Configuration;", "host", "getLocalization", "Lcom/iqoption/core/microservices/core/response/LocalizationResponse;", "version", "getMyCountry", "Lcom/iqoption/core/microservices/core/response/MyCountryResponse;", "apiKey", "getOnlineCount", "Lcom/iqoption/core/microservices/core/response/OnlineCountResponses;", "getRegistrationCurrencies", "Lcom/iqoption/core/microservices/core/response/RegistrationCurrenciesResponse;", "getRegulation", "Lcom/iqoption/core/microservices/core/response/RegulationResponse;", "selectBalance", "Lio/reactivex/Completable;", "balanceId", "", "core_release"})
/* compiled from: CoreRequests.kt */
public final class a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "profileEvents", "getProfileEvents()Lio/reactivex/Flowable;"))};
    private static final d brO = g.c(CoreRequests$profileEvents$2.brR);
    public static final a brP = new a();

    public final e<JsonObject> acU() {
        d dVar = brO;
        j jVar = anY[0];
        return (e) dVar.getValue();
    }

    private a() {
    }

    public final p<b> gy(String str) {
        kotlin.jvm.internal.i.f(str, "host");
        c cVar = c.baF;
        Builder a = c.a(c.baF, new Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("api/configuration");
        Builder builder = a.url(stringBuilder.toString()).get();
        kotlin.jvm.internal.i.e(builder, "Request.Builder().accept… API_CONFIGURATION).get()");
        return c.b(cVar, builder, new CoreRequests$getConfiguration$1(str), null, null, 12, null);
    }

    public final p<f> fN(String str) {
        kotlin.jvm.internal.i.f(str, "apiKey");
        Uri.Builder builder = new Uri.Builder();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.EE().Vb());
        stringBuilder.append("api/geoip/getmycountry");
        Uri build = builder.encodedPath(stringBuilder.toString()).appendQueryParameter("geokey", str).build();
        c cVar = c.baF;
        Builder builder2 = c.a(c.baF, new Builder(), null, 1, null).url(build.toString()).get();
        kotlin.jvm.internal.i.e(builder2, "Request.Builder().accept…url(uri.toString()).get()");
        return c.b(cVar, builder2, CoreRequests$getMyCountry$1.brQ, null, null, 12, null);
    }
}

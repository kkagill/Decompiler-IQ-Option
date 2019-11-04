package com.iqoption.core.microservices.configuration;

import com.google.gson.reflect.TypeToken;
import com.iqoption.core.microservices.configuration.a.e;
import io.reactivex.b.g;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import okhttp3.Request.Builder;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00140\u001eJ\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00140\u001eJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u001e2\u0006\u0010!\u001a\u00020\"J\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00140\u001eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R¨\u0001\u0010\u000e\u001a\u0001\u0012@\u0012>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 \u0013*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u0011 \u0013*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 \u0013*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u0011\u0018\u00010\u00140\u0010 \u0013*F\u0012@\u0012>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 \u0013*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u0011 \u0013*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 \u0013*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u0011\u0018\u00010\u00140\u0010\u0018\u00010\u000f0\u000f8FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R¨\u0001\u0010\u0019\u001a\u0001\u0012@\u0012>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001a \u0013*\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00110\u0011 \u0013*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001a \u0013*\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00110\u0011\u0018\u00010\u00140\u0010 \u0013*F\u0012@\u0012>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001a \u0013*\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00110\u0011 \u0013*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001a \u0013*\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00110\u0011\u0018\u00010\u00140\u0010\u0018\u00010\u000f0\u000f8FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016¨\u0006$"}, bng = {"Lcom/iqoption/core/microservices/configuration/ConfigurationRequests;", "", "()V", "CMD_GET_COUNTRIES_LIST_BY_BRAND", "", "CMD_GET_COUNTRIES_V3_HTTP", "CMD_GET_COUNTRY_BY_BRAND", "CMD_GET_CURRENCIES_LIST", "EVENT_COUNTRY_CREATED", "EVENT_COUNTRY_DELETED", "EVENT_COUNTRY_UPDATED", "EVENT_CURRENCY_CREATED", "EVENT_CURRENCY_DELETED", "EVENT_CURRENCY_UPDATED", "countryUpdatesStream", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/microservices/Event;", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "", "getCountryUpdatesStream", "()Lio/reactivex/Flowable;", "countryUpdatesStream$delegate", "Lkotlin/Lazy;", "currencyUpdatesStream", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "getCurrencyUpdatesStream", "currencyUpdatesStream$delegate", "getCountries", "Lio/reactivex/Single;", "getCountriesHttp", "getCountry", "id", "", "getCurrencies", "core_release"})
/* compiled from: ConfigurationRequests.kt */
public final class a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "currencyUpdatesStream", "getCurrencyUpdatesStream()Lio/reactivex/Flowable;")), k.a(new PropertyReference1Impl(k.G(a.class), "countryUpdatesStream", "getCountryUpdatesStream()Lio/reactivex/Flowable;"))};
    private static final d bre = g.c(ConfigurationRequests$currencyUpdatesStream$2.brm);
    private static final d brf = g.c(ConfigurationRequests$countryUpdatesStream$2.brh);
    public static final a brg = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/configuration/ConfigurationRequests$create$$inlined$typeOf$1"})
    /* compiled from: GsonExtensions.kt */
    public static final class a extends TypeToken<com.iqoption.core.microservices.configuration.a.a> {
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "it", "Lcom/iqoption/core/microservices/configuration/response/CountriesResponse;", "apply"})
    /* compiled from: ConfigurationRequests.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b brr = new b();

        b() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.configuration.a.c> apply(com.iqoption.core.microservices.configuration.a.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.getCountries();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "it", "Lcom/iqoption/core/microservices/configuration/response/GetCurrenciesResponse;", "apply"})
    /* compiled from: ConfigurationRequests.kt */
    static final class c<T, R> implements g<T, R> {
        public static final c brt = new c();

        c() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.configuration.a.d> apply(e eVar) {
            kotlin.jvm.internal.i.f(eVar, "it");
            return eVar.Kn();
        }
    }

    public final io.reactivex.e<List<com.iqoption.core.microservices.b<com.iqoption.core.microservices.configuration.a.d>>> acJ() {
        d dVar = bre;
        j jVar = anY[0];
        return (io.reactivex.e) dVar.getValue();
    }

    public final io.reactivex.e<List<com.iqoption.core.microservices.b<com.iqoption.core.microservices.configuration.a.c>>> acL() {
        d dVar = brf;
        j jVar = anY[1];
        return (io.reactivex.e) dVar.getValue();
    }

    private a() {
    }

    public final p<List<com.iqoption.core.microservices.configuration.a.d>> acI() {
        p t = com.iqoption.core.d.EV().a("get-currencies-list", e.class).fp("5.0").UB().t(c.brt);
        kotlin.jvm.internal.i.e(t, "requestBuilderFactory\n  …   .map { it.currencies }");
        return t;
    }

    public final p<List<com.iqoption.core.microservices.configuration.a.c>> acK() {
        com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
        Type type = new a().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        p t = EV.a("get-countries-list-by-brand", type).fp("1.0").UB().t(b.brr);
        kotlin.jvm.internal.i.e(t, "requestBuilderFactory\n  …    .map { it.countries }");
        return t;
    }

    public final p<List<com.iqoption.core.microservices.configuration.a.c>> WP() {
        Builder builder = new Builder();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.Um().EE().Vb());
        stringBuilder.append("api/v3/countries");
        Builder builder2 = builder.url(stringBuilder.toString()).get();
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        kotlin.jvm.internal.i.e(builder2, "builder");
        return com.iqoption.core.connect.http.c.b(cVar, builder2, ConfigurationRequests$getCountriesHttp$1.brs, null, null, 12, null);
    }
}

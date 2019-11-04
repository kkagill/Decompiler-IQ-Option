package com.iqoption.mobbtech.connect.request;

import android.annotation.SuppressLint;
import com.iqoption.core.d;
import com.iqoption.x.R;
import io.reactivex.b.f;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/mobbtech/connect/request/CountriesRequest;", "", "()V", "perform", "", "callback", "Lcom/iqoption/mobbtech/connect/request/CountriesRequest$CountriesRequestCallback;", "CountriesRequestCallback", "app_optionXRelease"})
/* compiled from: CountriesRequest.kt */
public final class c {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, bng = {"Lcom/iqoption/mobbtech/connect/request/CountriesRequest$CountriesRequestCallback;", "", "onCountriesLoaded", "", "countries", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "app_optionXRelease"})
    /* compiled from: CountriesRequest.kt */
    public interface a {
        void onCountriesLoaded(List<com.iqoption.core.microservices.configuration.a.c> list);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: CountriesRequest.kt */
    static final class b<T> implements f<List<? extends com.iqoption.core.microservices.configuration.a.c>> {
        final /* synthetic */ a dHR;

        b(a aVar) {
            this.dHR = aVar;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.configuration.a.c> list) {
            a aVar = this.dHR;
            kotlin.jvm.internal.i.e(list, "it");
            aVar.onCountriesLoaded(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: CountriesRequest.kt */
    static final class c<T> implements f<Throwable> {
        public static final c dHS = new c();

        c() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            d.a((int) R.string.unknown_error_occurred, 0, 2, null);
        }
    }

    @SuppressLint({"CheckResult"})
    public final void a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        com.iqoption.core.data.repository.c.bdy.WQ().bkV().h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((f) new b(aVar), (f) c.dHS);
    }
}

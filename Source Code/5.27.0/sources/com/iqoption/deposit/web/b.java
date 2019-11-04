package com.iqoption.deposit.web;

import com.google.gson.JsonObject;
import com.iqoption.core.analytics.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\tJ\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/deposit/web/BillingPaymentPageLoadedEventHelper;", "", "()V", "loadUrlEvents", "Ljava/util/LinkedHashMap;", "", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "Lkotlin/collections/LinkedHashMap;", "addBillingPaymentPageLoadedEvent", "", "url", "sendAllBillingPaymentPageLoadedEvents", "loadingFlag", "", "sendBillingPaymentPageErrorLoadedEvent", "sendBillingPaymentPageLoadedEvent", "sendBillingPaymentPageLoadedEventsOnExit", "sendPageLoadedEvent", "event", "Companion", "deposit_release"})
/* compiled from: BillingPaymentPageLoadedEventHelper.kt */
public final class b {
    private static final String TAG = b.class.getName();
    public static final a cGQ = new a();
    private final LinkedHashMap<String, com.iqoption.core.analytics.b> cGP = new LinkedHashMap();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/deposit/web/BillingPaymentPageLoadedEventHelper$Companion;", "", "()V", "PAGE_IS_LOADED", "", "PAGE_IS_NOT_LOADED_EVENT_SEND_ON_FRAGMENT_EXIT", "PAGE_LOADING_ERROR", "TAG", "", "kotlin.jvm.PlatformType", "deposit_release"})
    /* compiled from: BillingPaymentPageLoadedEventHelper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public final void hO(String str) {
        kotlin.jvm.internal.i.f(str, "url");
        d EC = com.iqoption.core.d.EC();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("url_redirect", str);
        jsonObject.addProperty("is_native_deposit", "1");
        com.iqoption.core.analytics.b b = EC.b("billing_payment-page-loaded", 0.0d, jsonObject, true);
        Map map = this.cGP;
        kotlin.jvm.internal.i.e(b, "loadUrlEvent");
        map.put(str, b);
    }

    public final void hP(String str) {
        kotlin.jvm.internal.i.f(str, "url");
        com.iqoption.core.analytics.b bVar = (com.iqoption.core.analytics.b) this.cGP.get(str);
        if (bVar != null) {
            this.cGP.remove(str);
            t(1.0d);
            a(bVar, 1.0d);
        }
    }

    public final void hQ(String str) {
        kotlin.jvm.internal.i.f(str, "url");
        com.iqoption.core.analytics.b bVar = (com.iqoption.core.analytics.b) this.cGP.get(str);
        if (bVar != null) {
            this.cGP.remove(str);
            a(bVar, 2.0d);
        }
    }

    public final void atr() {
        t(0.0d);
    }

    private final void a(com.iqoption.core.analytics.b bVar, double d) {
        bVar.a((Number) Double.valueOf(d));
        bVar.Cc();
    }

    private final void t(double d) {
        for (com.iqoption.core.analytics.b bVar : this.cGP.values()) {
            kotlin.jvm.internal.i.e(bVar, "event");
            a(bVar, d);
        }
        this.cGP.clear();
    }
}

package com.iqoption.analytics;

import com.google.gson.JsonObject;
import com.iqoption.app.IQApp;
import com.iqoption.core.microservices.billing.response.PaymentStatusType;
import com.iqoption.core.microservices.billing.response.e;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import io.reactivex.b.f;
import java.util.List;
import kotlin.Pair;
import kotlin.i;
import kotlin.j;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0019\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/analytics/DepositAnalyticsHelper;", "", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "canReportFirstDep", "", "clear", "", "reportFirstDepIfNeeded", "amount", "", "(Ljava/lang/Double;)V", "setCurrencyCode", "currency", "", "subscribeOnChanges", "app_optionXRelease"})
/* compiled from: DepositAnalyticsHelper.kt */
public final class b {
    private static final io.reactivex.disposables.a aqB = new io.reactivex.disposables.a();
    public static final b aqC = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "depositCompleted", "Lcom/iqoption/core/microservices/billing/response/DepositCompleted;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositAnalyticsHelper.kt */
    static final class a<T> implements f<e> {
        public static final a aqD = new a();

        a() {
        }

        /* renamed from: a */
        public final void accept(e eVar) {
            double ZC = eVar.ZC();
            double d = (double) 1000000;
            Double.isNaN(d);
            ZC /= d;
            d = eVar.ZB();
            double d2 = (double) 100;
            Double.isNaN(d2);
            d /= d2;
            if (eVar.Dx() == com.iqoption.core.d.Un().Dx()) {
                Pair[] pairArr = new Pair[3];
                pairArr[0] = j.x("af_revenue", Double.valueOf(d));
                pairArr[1] = j.x("af_currency", eVar.getCurrency());
                pairArr[2] = j.x("af_param_1", Double.valueOf(ZC));
                IQApp.a("deposit", af.a(pairArr));
                com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("currency", eVar.getCurrency());
                jsonObject.addProperty("amount", (Number) Double.valueOf(ZC));
                EC.a("user_deposited", ZC, jsonObject, false);
            }
            b.aqC.b(Double.valueOf(ZC));
            b.aqC.P(eVar.getCurrency());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositAnalyticsHelper.kt */
    static final class b<T> implements f<Throwable> {
        public static final b aqE = new b();

        b() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "invoices", "", "Lcom/iqoption/core/microservices/billing/response/invoice/Invoice;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositAnalyticsHelper.kt */
    static final class c<T> implements f<List<? extends com.iqoption.core.microservices.billing.response.a.a>> {
        public static final c aqF = new c();

        c() {
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.billing.response.a.a> list) {
            kotlin.jvm.internal.i.e(list, "invoices");
            if ((list.isEmpty() ^ 1) != 0) {
                b.a(b.aqC, null, 1, null);
                b.aqC.P(((com.iqoption.core.microservices.billing.response.a.a) u.bU(list)).getCurrency());
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositAnalyticsHelper.kt */
    static final class d<T> implements f<Throwable> {
        public static final d aqG = new d();

        d() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    private b() {
    }

    public static final void BO() {
        aqB.e(com.iqoption.core.microservices.billing.a.bmi.Zs().d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((f) a.aqD, (f) b.aqE));
        if (aqC.BP()) {
            aqB.e(com.iqoption.core.microservices.billing.a.bmi.a(PaymentStatusType.IQOPTION_SUCCESS, Integer.valueOf(1)).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((f) c.aqF, (f) d.aqG));
        }
    }

    public static final void clear() {
        aqB.clear();
    }

    static /* synthetic */ void a(b bVar, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = (Double) null;
        }
        bVar.b(d);
    }

    private final void b(Double d) {
        if (BP()) {
            String str = "first_time_deposit";
            IQApp.a(str, null);
            com.iqoption.core.data.d.b.bdk.WB().cs(true);
            Builder Builder = Event.Builder(Event.CATEGORY_SYSTEM, str);
            if (d != null) {
                Builder.setValue(Double.valueOf(d.doubleValue()));
            }
            EventManager.BS().a(Builder.build());
        }
    }

    private final boolean BP() {
        return com.iqoption.core.data.d.b.bdk.WB().Wv() && !com.iqoption.core.data.d.b.bdk.WB().Ww();
    }

    private final void P(String str) {
        com.appsflyer.j.dq().P(str);
    }
}

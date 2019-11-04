package com.iqoption.billing.wallet;

import android.app.Activity;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import io.reactivex.p;
import io.reactivex.processors.BehaviorProcessor;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import org.json.JSONObject;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, bng = {"Lcom/iqoption/billing/wallet/GooglePayClientWrapper;", "", "()V", "REQUEST_CODE_GOOGLE_PAY", "", "isGooglePayEnabledProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "", "kotlin.jvm.PlatformType", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "getPaymentsClient", "()Lcom/google/android/gms/wallet/PaymentsClient;", "paymentsClient$delegate", "Lkotlin/Lazy;", "getGooglePayEnvironment", "getMerchantId", "", "isGooglePayEnabled", "Lio/reactivex/Single;", "isTest", "requestPayment", "", "activity", "Landroid/app/Activity;", "amount", "Ljava/math/BigDecimal;", "currencyCode", "billing_release"})
/* compiled from: GooglePayClientWrapper.kt */
public final class a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "paymentsClient", "getPaymentsClient()Lcom/google/android/gms/wallet/PaymentsClient;"))};
    private static final BehaviorProcessor<Boolean> azA;
    public static final a azB = new a();
    private static final d azz = g.c(GooglePayClientWrapper$paymentsClient$2.azE);

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "onFailure"})
    /* compiled from: GooglePayClientWrapper.kt */
    static final class a implements OnFailureListener {
        public static final a azC = new a();

        a() {
        }

        public final void onFailure(Exception exception) {
            kotlin.jvm.internal.i.f(exception, "it");
            a.azA.onNext(Boolean.valueOf(false));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "completedTask", "Lcom/google/android/gms/tasks/Task;", "", "kotlin.jvm.PlatformType", "onComplete"})
    /* compiled from: GooglePayClientWrapper.kt */
    static final class b<TResult> implements OnCompleteListener<Boolean> {
        public static final b azD = new b();

        b() {
        }

        public final void onComplete(Task<Boolean> task) {
            kotlin.jvm.internal.i.f(task, "completedTask");
            try {
                a.azA.onNext(Boolean.valueOf(kotlin.jvm.internal.i.y((Boolean) task.getResult(ApiException.class), Boolean.valueOf(true))));
            } catch (ApiException unused) {
                a.azA.onNext(Boolean.valueOf(false));
            }
        }
    }

    private final PaymentsClient KG() {
        d dVar = azz;
        j jVar = anY[0];
        return (PaymentsClient) dVar.getValue();
    }

    static {
        BehaviorProcessor bmG = BehaviorProcessor.bmG();
        kotlin.jvm.internal.i.e(bmG, "BehaviorProcessor.create<Boolean>()");
        azA = bmG;
    }

    private a() {
    }

    public final String KE() {
        return Dt() ? "787cba8958c5094" : "ffbf34307da0e0e";
    }

    private final boolean Dt() {
        return (com.iqoption.core.d.Un().Ds() || com.iqoption.core.d.Un().Dr()) && com.iqoption.core.data.d.a.bdi.Wo();
    }

    private final int KF() {
        return Dt() ? 3 : 1;
    }

    public final p<Boolean> KH() {
        boolean Zw = com.iqoption.core.microservices.billing.b.bmm.Zw();
        String str = "Single.just(false)";
        Boolean valueOf = Boolean.valueOf(false);
        p m;
        if (Zw) {
            JSONObject KM = d.azM.KM();
            if (KM != null) {
                IsReadyToPayRequest fromJson = IsReadyToPayRequest.fromJson(KM.toString());
                if (fromJson != null) {
                    Task isReadyToPay = KG().isReadyToPay(fromJson);
                    isReadyToPay.addOnFailureListener(a.azC);
                    isReadyToPay.addOnCompleteListener(b.azD);
                    m = azA.bkV().m(5, TimeUnit.SECONDS);
                    kotlin.jvm.internal.i.e(m, "isGooglePayEnabledProces…eout(5, TimeUnit.SECONDS)");
                    return m;
                }
                m = p.cI(valueOf);
                kotlin.jvm.internal.i.e(m, str);
                return m;
            }
            m = p.cI(valueOf);
            kotlin.jvm.internal.i.e(m, str);
            return m;
        }
        m = p.cI(valueOf);
        kotlin.jvm.internal.i.e(m, str);
        return m;
    }

    public final void a(Activity activity, BigDecimal bigDecimal, String str) {
        kotlin.jvm.internal.i.f(activity, "activity");
        kotlin.jvm.internal.i.f(bigDecimal, "amount");
        kotlin.jvm.internal.i.f(str, "currencyCode");
        AutoResolveHelper.resolveTask(KG().loadPaymentData(d.azM.a(bigDecimal, str)), activity, 500);
    }
}

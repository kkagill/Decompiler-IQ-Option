package com.iqoption.deposit.complete;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.billing.response.failure.PaymentErrorCategory;
import com.iqoption.core.microservices.billing.response.failure.PaymentStatus;
import com.iqoption.core.util.ag;
import com.iqoption.core.util.v;
import com.iqoption.core.util.z;
import io.reactivex.subjects.CompletableSubject;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\b&\u0018\u0000 [2\u00020\u0001:\u0004[\\]^B\u0005¢\u0006\u0002\u0010\u0002J\u000f\u0010'\u001a\u0004\u0018\u00010(H&¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020+H&J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0002J\b\u00102\u001a\u00020/H&J\b\u00103\u001a\u00020-H\u0002J\b\u00104\u001a\u00020-H\u0002J\b\u00105\u001a\u00020+H&J\u0010\u00106\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0002J\b\u00107\u001a\u00020/H&J\b\u00108\u001a\u000209H&J\b\u0010:\u001a\u00020/H&J\b\u0010;\u001a\u00020/H&J\n\u0010<\u001a\u0004\u0018\u00010/H&J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000209H\u0002J\u0012\u0010@\u001a\u00020\u00192\b\u0010A\u001a\u0004\u0018\u00010BH\u0014J\u0012\u0010C\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010F\u001a\u00020-H\u0016J\b\u0010G\u001a\u00020-H\u0016J\u001a\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020+2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010J\u001a\u00020-H\u0002J\b\u0010K\u001a\u00020LH&J\b\u0010M\u001a\u00020/H&J\b\u0010N\u001a\u00020/H&J\b\u0010O\u001a\u00020-H\u0015J \u0010P\u001a\u00020-2\b\u0010Q\u001a\u0004\u0018\u00010\u000f2\u000e\u0010R\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010SJ\u0018\u0010T\u001a\u00020-2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u0019H\u0002J\u0010\u0010X\u001a\u00020-2\u0006\u0010U\u001a\u00020VH&J\b\u0010Y\u001a\u000209H&J\b\u0010Z\u001a\u00020-H\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0018\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\u001f\u0010 R#\u0010\"\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b#\u0010\u0012R\u000e\u0010%\u001a\u00020&X.¢\u0006\u0002\n\u0000¨\u0006_"}, bng = {"Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "<set-?>", "Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment$CompletePaymentDelegate;", "completePaymentDelegate", "getCompletePaymentDelegate", "()Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment$CompletePaymentDelegate;", "setCompletePaymentDelegate", "(Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment$CompletePaymentDelegate;)V", "completePaymentDelegate$delegate", "Lkotlin/properties/ReadWriteProperty;", "compositionLoader", "Lcom/airbnb/lottie/Cancellable;", "currencyName", "", "kotlin.jvm.PlatformType", "getCurrencyName", "()Ljava/lang/String;", "currencyName$delegate", "Lkotlin/Lazy;", "errorSession", "getErrorSession", "errorSession$delegate", "isGooglePay", "", "()Z", "isGooglePay$delegate", "operationCompleted", "payAmount", "Ljava/math/BigDecimal;", "getPayAmount", "()Ljava/math/BigDecimal;", "payAmount$delegate", "showTag", "getShowTag", "showTag$delegate", "viewModel", "Lcom/iqoption/deposit/complete/CompleteViewModel;", "animationStartDelayMillis", "", "()Ljava/lang/Long;", "backButton", "Landroid/view/View;", "bindErrorButton", "", "button", "Landroid/widget/TextView;", "category", "Lcom/iqoption/core/microservices/billing/response/failure/PaymentErrorCategory;", "buyingTextView", "close", "closeAndShowMethodsScreen", "copyErrorButton", "delegateFromTag", "doneButton", "errorAnimation", "Lcom/iqoption/deposit/CurrencyAnimation;", "leftButton", "line1TextView", "line2TextView", "loadAnim", "Lio/reactivex/Completable;", "animation", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onViewCreated", "view", "openSupport", "progressLogoView", "Lcom/airbnb/lottie/LottieAnimationView;", "resultTextView", "rightButton", "showError", "showErrorStatus", "message", "errorCategories", "", "showSuccessImmediate", "mainText", "", "autoClose", "showSuccessUI", "successAnimation", "vibrate", "Companion", "CompleteDepositDelegate", "CompletePaymentDelegate", "ErrorDelegate", "deposit_release"})
/* compiled from: BaseCompletePaymentFragment.kt */
public abstract class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "showTag", "getShowTag()Ljava/lang/String;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "errorSession", "getErrorSession()Ljava/lang/String;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "currencyName", "getCurrencyName()Ljava/lang/String;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "payAmount", "getPayAmount()Ljava/math/BigDecimal;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "isGooglePay", "isGooglePay()Z")), kotlin.jvm.internal.k.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "completePaymentDelegate", "getCompletePaymentDelegate()Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment$CompletePaymentDelegate;"))};
    public static final a cyi = new a();
    private HashMap apm;
    private final kotlin.d cxZ = g.c(new BaseCompletePaymentFragment$showTag$2(this));
    private final kotlin.d cya = g.c(new BaseCompletePaymentFragment$errorSession$2(this));
    private final kotlin.d cyb = g.c(new BaseCompletePaymentFragment$currencyName$2(this));
    private final kotlin.d cyc = g.c(new BaseCompletePaymentFragment$payAmount$2(this));
    private final kotlin.d cyd = g.c(new BaseCompletePaymentFragment$isGooglePay$2(this));
    private com.airbnb.lottie.a cye;
    private boolean cyf;
    private c cyg;
    private final kotlin.f.d cyh = kotlin.f.a.eWg.bnQ();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment$Companion;", "", "()V", "ARG_CURRENCY_NAME", "", "ARG_ERROR_SESSION", "ARG_IS_GOOGLE_PAY", "ARG_PAY_AMOUNT", "ARG_SHOW_TAG", "DEPOSIT_TAG", "ERROR_DEPOSIT_TAG", "TAG", "getTAG", "()Ljava/lang/String;", "UNKNOWN_STATUS_CODE", "", "deposit_release"})
    /* compiled from: BaseCompletePaymentFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, bng = {"Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment$CompletePaymentDelegate;", "", "cleanup", "", "makePayment", "fragment", "Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment;", "showProgress", "deposit_release"})
    /* compiled from: BaseCompletePaymentFragment.kt */
    private interface c {

        @kotlin.i(bne = {1, 1, 15})
        /* compiled from: BaseCompletePaymentFragment.kt */
        public static final class a {
            public static void b(c cVar) {
            }
        }

        void cleanup();

        void h(a aVar);
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: BaseCompletePaymentFragment.kt */
    static final class k implements OnClickListener {
        final /* synthetic */ a this$0;

        k(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            this.this$0.apL();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: BaseCompletePaymentFragment.kt */
    static final class l implements OnClickListener {
        final /* synthetic */ a this$0;

        l(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            this.this$0.close();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: BaseCompletePaymentFragment.kt */
    static final class m implements OnClickListener {
        final /* synthetic */ a this$0;

        m(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            com.iqoption.core.d.Um().EC().di("deposit-page_success-trade");
            this.this$0.close();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: BaseCompletePaymentFragment.kt */
    static final class o implements Runnable {
        final /* synthetic */ WeakReference cyr;

        o(WeakReference weakReference) {
            this.cyr = weakReference;
        }

        public final void run() {
            a aVar = (a) this.cyr.get();
            if (aVar != null) {
                aVar.close();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment$CompleteDepositDelegate;", "Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment$CompletePaymentDelegate;", "realBalance", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/data/mediators/BalanceData;", "(Lio/reactivex/Flowable;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "cleanup", "", "makePayment", "fragment", "Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment;", "deposit_release"})
    /* compiled from: BaseCompletePaymentFragment.kt */
    private static final class b implements c {
        private final io.reactivex.disposables.a cyj = new io.reactivex.disposables.a();
        private final io.reactivex.e<com.iqoption.core.data.c.a> cyk;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "currencyResult", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: BaseCompletePaymentFragment.kt */
        static final class a<T> implements io.reactivex.b.f<z<com.iqoption.core.microservices.configuration.a.d>> {
            final /* synthetic */ a cyl;

            a(a aVar) {
                this.cyl = aVar;
            }

            /* renamed from: c */
            public final void accept(z<com.iqoption.core.microservices.configuration.a.d> zVar) {
                com.iqoption.core.microservices.configuration.a.d dVar = (com.iqoption.core.microservices.configuration.a.d) zVar.anw();
                if (dVar != null) {
                    String a = com.iqoption.core.util.e.a(this.cyl.apJ(), dVar, true, false, 4, null);
                    a aVar = this.cyl;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("+ ");
                    stringBuilder.append(a);
                    aVar.b(stringBuilder.toString(), false);
                }
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: BaseCompletePaymentFragment.kt */
        static final class b<T> implements io.reactivex.b.f<Throwable> {
            public static final b cym = new b();

            b() {
            }

            /* renamed from: o */
            public final void accept(Throwable th) {
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/data/mediators/BalanceData;", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: BaseCompletePaymentFragment.kt */
        static final class c<T> implements io.reactivex.b.f<com.iqoption.core.data.c.a> {
            final /* synthetic */ a cyl;
            final /* synthetic */ TextView cyn;

            c(TextView textView, a aVar) {
                this.cyn = textView;
                this.cyl = aVar;
            }

            /* renamed from: b */
            public final void accept(com.iqoption.core.data.c.a aVar) {
                this.cyn.setText(com.iqoption.core.ext.a.q(this.cyl).getString(com.iqoption.deposit.o.g.balance_n1, new Object[]{aVar.VN()}));
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: BaseCompletePaymentFragment.kt */
        static final class d<T> implements io.reactivex.b.f<Throwable> {
            final /* synthetic */ TextView cyn;

            d(TextView textView) {
                this.cyn = textView;
            }

            /* renamed from: o */
            public final void accept(Throwable th) {
                this.cyn.setText((CharSequence) null);
            }
        }

        public b(io.reactivex.e<com.iqoption.core.data.c.a> eVar) {
            kotlin.jvm.internal.i.f(eVar, "realBalance");
            this.cyk = eVar;
        }

        public void h(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "fragment");
            io.reactivex.disposables.a aVar2 = this.cyj;
            com.iqoption.core.data.repository.c cVar = com.iqoption.core.data.repository.c.bdy;
            String b = aVar.VK();
            kotlin.jvm.internal.i.e(b, "fragment.currencyName");
            aVar2.e(cVar.fO(b).f(com.iqoption.core.rx.i.aki()).e(com.iqoption.core.rx.i.akj()).a(new a(aVar), b.cym));
            TextView apR = aVar.apR();
            this.cyj.e(this.cyk.d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new c(apR, aVar), (io.reactivex.b.f) new d(apR)));
            apR = aVar.apS();
            if (apR != null) {
                if (aVar.aom()) {
                    com.iqoption.core.ext.a.ak(apR);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(com.iqoption.core.d.getString(com.iqoption.deposit.o.g.paid_with));
                    spannableStringBuilder.append(" ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(com.iqoption.core.d.getString(com.iqoption.deposit.o.g.google_pay));
                    spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
                    apR.setText(spannableStringBuilder);
                } else {
                    com.iqoption.core.ext.a.al(apR);
                }
            }
            com.iqoption.billing.repository.a.ayY.Kx();
            com.iqoption.core.d.EC().dm("deposit-page_success").Cc();
        }

        public void cleanup() {
            a.b(this);
            this.cyj.clear();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, bng = {"Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment$ErrorDelegate;", "Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment$CompletePaymentDelegate;", "errorSession", "", "(Ljava/lang/String;)V", "getErrorSession", "()Ljava/lang/String;", "makePayment", "", "fragment", "Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment;", "deposit_release"})
    /* compiled from: BaseCompletePaymentFragment.kt */
    private static final class d implements c {
        private final String bmD;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/core/microservices/billing/response/failure/PaymentStatusResponse;", "kotlin.jvm.PlatformType", "onChanged"})
        /* compiled from: BaseCompletePaymentFragment.kt */
        static final class a<T> implements Observer<com.iqoption.core.ui.d<com.iqoption.core.microservices.billing.response.failure.a>> {
            final /* synthetic */ a cyl;
            final /* synthetic */ ObjectRef cyo;

            a(ObjectRef objectRef, a aVar) {
                this.cyo = objectRef;
                this.cyl = aVar;
            }

            /* renamed from: a */
            public final void onChanged(com.iqoption.core.ui.d<com.iqoption.core.microservices.billing.response.failure.a> dVar) {
                Object obj = null;
                String str = (String) null;
                com.iqoption.core.microservices.billing.response.failure.a aVar = dVar != null ? (com.iqoption.core.microservices.billing.response.failure.a) dVar.getData() : null;
                if (!(dVar == null || !dVar.isSuccess() || aVar == null)) {
                    String errorMessage = aVar.getErrorMessage();
                    if (errorMessage == null) {
                        if (aVar.aaU() == PaymentStatus.IN_PROGRESS) {
                            errorMessage = com.iqoption.core.d.getString(com.iqoption.deposit.o.g.transaction_details_are_outdated);
                        } else {
                            errorMessage = com.iqoption.core.d.getString(com.iqoption.deposit.o.g.an_error_occurred_please_try_again);
                        }
                    }
                    ObjectRef objectRef = this.cyo;
                    Integer aaV = aVar.aaV();
                    if (aaV != null) {
                        obj = Double.valueOf((double) aaV.intValue());
                    }
                    objectRef.element = obj;
                    this.cyl.d(errorMessage, aVar.aaW());
                }
                Double d = (Double) this.cyo.element;
                com.iqoption.core.d.Um().EC().g("deposit-page_failed", d != null ? d.doubleValue() : -2.0d).Cc();
            }
        }

        public d(String str) {
            this.bmD = str;
        }

        public void cleanup() {
            a.b(this);
        }

        public void h(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "fragment");
            aVar.Lg();
            ObjectRef objectRef = new ObjectRef();
            objectRef.element = (Double) null;
            String str = this.bmD;
            if (str != null) {
                a.a(aVar).hF(str).observe(aVar, new a(objectRef, aVar));
            } else {
                com.iqoption.core.d.Um().EC().dm("deposit-page_failed").Cc();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public e(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.apM();
            com.iqoption.core.d.Um().EC().di("deposit-page_failed-other-methods");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class f extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public f(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.deposit.navigator.b.cGp.Q(this.this$0);
            com.iqoption.core.d.Um().EC().di("deposit-page_failed-support");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class g extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public g(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.close();
            com.iqoption.core.d.Um().EC().di("deposit-page_failed-check-creds");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class h extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public h(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.apM();
            com.iqoption.core.d.Um().EC().di("deposit-page_failed-new-card");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class i extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public i(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.close();
            com.iqoption.core.d.Um().EC().di("deposit-page_failed-change-amount");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class j extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public j(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.close();
            com.iqoption.core.d.Um().EC().di("deposit-page_failed-try-again");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class n extends com.iqoption.core.ext.g {
        final /* synthetic */ String cyq;
        final /* synthetic */ a this$0;

        public n(a aVar, String str) {
            this.this$0 = aVar;
            this.cyq = str;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            ag.au(this.this$0.getString(com.iqoption.deposit.o.g.deposit_error), this.cyq);
            com.iqoption.core.d.a(com.iqoption.core.ext.a.q(this.this$0), com.iqoption.deposit.o.g.error_text_copied, 0);
        }
    }

    private final String VK() {
        kotlin.d dVar = this.cyb;
        kotlin.reflect.j jVar = anY[2];
        return (String) dVar.getValue();
    }

    private final void a(c cVar) {
        this.cyh.a(this, anY[5], cVar);
    }

    private final boolean aom() {
        kotlin.d dVar = this.cyd;
        kotlin.reflect.j jVar = anY[4];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    private final String apH() {
        kotlin.d dVar = this.cxZ;
        kotlin.reflect.j jVar = anY[0];
        return (String) dVar.getValue();
    }

    private final String apI() {
        kotlin.d dVar = this.cya;
        kotlin.reflect.j jVar = anY[1];
        return (String) dVar.getValue();
    }

    private final BigDecimal apJ() {
        kotlin.d dVar = this.cyc;
        kotlin.reflect.j jVar = anY[3];
        return (BigDecimal) dVar.getValue();
    }

    private final c apK() {
        return (c) this.cyh.b(this, anY[5]);
    }

    private final void apL() {
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract void J(CharSequence charSequence);

    public abstract View apO();

    public abstract TextView apP();

    public abstract TextView apQ();

    public abstract TextView apR();

    public abstract TextView apS();

    public abstract TextView apT();

    public abstract TextView apU();

    public abstract TextView apV();

    public abstract LottieAnimationView apW();

    public abstract Long apX();

    public abstract View apY();

    public abstract com.iqoption.deposit.b apZ();

    public abstract com.iqoption.deposit.b aqa();

    static {
        String name = a.class.getName();
        kotlin.jvm.internal.i.e(name, "BaseCompletePaymentFragment::class.java.name");
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cyg = c.cys.F(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        apU().setOnClickListener(new k(this));
        apO().setOnClickListener(new l(this));
        apV().setOnClickListener(new m(this));
        String apH = apH();
        kotlin.jvm.internal.i.e(apH, "showTag");
        a(hD(apH));
        apK().h(this);
    }

    public void onDestroyView() {
        super.onDestroyView();
        apK().cleanup();
        com.airbnb.lottie.a aVar = this.cye;
        if (aVar != null) {
            aVar.cancel();
        }
        this.cye = (com.airbnb.lottie.a) null;
        Bj();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        close();
        return true;
    }

    /* Access modifiers changed, original: protected */
    @CallSuper
    public void Lg() {
        apW().ad();
        apW().p(false);
        a(apZ());
        this.cyf = true;
        com.iqoption.core.ext.a.al(apV());
        com.iqoption.core.ext.a.ak(apO());
        com.iqoption.core.ext.a.al(apY());
        com.iqoption.core.ext.a.ak(apT());
        apT().setText(com.iqoption.deposit.o.g.failed);
        com.iqoption.core.ext.a.al(apR());
        com.iqoption.core.ext.a.al(apU());
        com.iqoption.core.ext.a.al(apP());
        com.iqoption.core.ext.a.al(apQ());
    }

    public final void d(String str, List<? extends PaymentErrorCategory> list) {
        List list2;
        if (str == null) {
            str = getString(com.iqoption.deposit.o.g.default_payment_failed_description);
            kotlin.jvm.internal.i.e(str, "getString(R.string.defau…yment_failed_description)");
        }
        CharSequence charSequence = str;
        apU().setText(charSequence);
        com.iqoption.core.ext.a.ak(apU());
        View apY = apY();
        if ((u.Y(charSequence) ^ 1) != 0) {
            com.iqoption.core.ext.a.ak(apY);
            apY.setOnClickListener(new n(this, str));
        } else {
            com.iqoption.core.ext.a.al(apY);
        }
        boolean Dq = com.iqoption.core.d.Un().Dq();
        int i = 0;
        PaymentErrorCategory paymentErrorCategory = null;
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                Object obj = (Dq && ((PaymentErrorCategory) next) == PaymentErrorCategory.SUPPORT) ? null : 1;
                if (obj != null) {
                    arrayList.add(next);
                }
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        PaymentErrorCategory paymentErrorCategory2 = list2 != null ? (PaymentErrorCategory) u.bV(list2) : null;
        if (list2 != null) {
            i = list2.size();
        }
        if (i > 1 && list2 != null) {
            paymentErrorCategory = (PaymentErrorCategory) list2.get(1);
        }
        a(apP(), paymentErrorCategory2);
        a(apQ(), paymentErrorCategory);
    }

    private final void a(TextView textView, PaymentErrorCategory paymentErrorCategory) {
        if (paymentErrorCategory == null) {
            com.iqoption.core.ext.a.hide(textView);
            return;
        }
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        switch (paymentErrorCategory) {
            case OTHER_METHODS:
                valueOf = Integer.valueOf(com.iqoption.deposit.o.g.other_methods);
                valueOf2 = Integer.valueOf(com.iqoption.deposit.o.b.white);
                valueOf3 = Integer.valueOf(com.iqoption.deposit.o.d.deposit_button_selector);
                textView.setOnClickListener(new e(this));
                break;
            case SUPPORT:
                valueOf = Integer.valueOf(com.iqoption.deposit.o.g.support);
                valueOf2 = Integer.valueOf(com.iqoption.deposit.o.b.deposit_dark_grey);
                valueOf3 = Integer.valueOf(com.iqoption.deposit.o.d.bg_warm_grey_rounded_selector);
                textView.setOnClickListener(new f(this));
                break;
            case CHECK_CREDENTIALS:
                valueOf = Integer.valueOf(com.iqoption.deposit.o.g.check_credentials);
                valueOf2 = Integer.valueOf(com.iqoption.deposit.o.b.white);
                valueOf3 = Integer.valueOf(com.iqoption.deposit.o.d.deposit_button_selector);
                textView.setOnClickListener(new g(this));
                break;
            case ADD_NEW_CARD:
                valueOf = Integer.valueOf(com.iqoption.deposit.o.g.add_new_card);
                valueOf2 = Integer.valueOf(com.iqoption.deposit.o.b.white);
                valueOf3 = Integer.valueOf(com.iqoption.deposit.o.d.deposit_button_selector);
                textView.setOnClickListener(new h(this));
                break;
            case CHANGE_AMOUNT:
                valueOf = Integer.valueOf(com.iqoption.deposit.o.g.change_amount);
                valueOf2 = Integer.valueOf(com.iqoption.deposit.o.b.white);
                valueOf3 = Integer.valueOf(com.iqoption.deposit.o.d.deposit_button_selector);
                textView.setOnClickListener(new i(this));
                break;
            case TRY_AGAIN:
                valueOf = Integer.valueOf(com.iqoption.deposit.o.g.try_again);
                valueOf2 = Integer.valueOf(com.iqoption.deposit.o.b.white);
                valueOf3 = Integer.valueOf(com.iqoption.deposit.o.d.deposit_button_selector);
                textView.setOnClickListener(new j(this));
                break;
            default:
                valueOf = (Integer) null;
                valueOf2 = valueOf;
                valueOf3 = valueOf2;
                break;
        }
        if (valueOf != null) {
            com.iqoption.core.ext.a.ak(textView);
            String string = getString(valueOf.intValue());
            kotlin.jvm.internal.i.e(string, "getString(buttonTextResId)");
            textView.setText(u.mY(string));
            Context q = com.iqoption.core.ext.a.q(this);
            if (valueOf2 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            textView.setTextColor(com.iqoption.core.ext.a.k(q, valueOf2.intValue()));
            q = com.iqoption.core.ext.a.q(this);
            if (valueOf3 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            textView.setBackground(com.iqoption.core.ext.a.n(q, valueOf3.intValue()));
        } else {
            com.iqoption.core.ext.a.hide(textView);
        }
    }

    private final void apM() {
        close();
        com.iqoption.deposit.navigator.b.cGp.T(this);
    }

    private final void b(CharSequence charSequence, boolean z) {
        apW().ad();
        apW().p(false);
        a(aqa());
        com.iqoption.core.ext.a.al(apY());
        apN();
        J(charSequence);
        this.cyf = true;
        if (z) {
            com.iqoption.core.c.a.biN.postDelayed(new o(com.iqoption.core.ext.c.bJ(this)), 2500);
        }
    }

    private final io.reactivex.a a(com.iqoption.deposit.b bVar) {
        CompletableSubject bmQ = CompletableSubject.bmQ();
        kotlin.jvm.internal.i.e(bmQ, "CompletableSubject.create()");
        this.cye = bVar.a(com.iqoption.core.ext.a.q(this), new BaseCompletePaymentFragment$loadAnim$1(this, bmQ));
        return bmQ;
    }

    public void onResume() {
        super.onResume();
        v.j(com.iqoption.core.ext.a.r(this));
    }

    private final c hD(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1339226265) {
            if (hashCode == 1554454174 && str.equals("deposit")) {
                c cVar = this.cyg;
                if (cVar == null) {
                    kotlin.jvm.internal.i.lG("viewModel");
                }
                String VK = VK();
                kotlin.jvm.internal.i.e(VK, "currencyName");
                return new b(cVar.hE(VK));
            }
        } else if (str.equals("error_deposit")) {
            return new d(apI());
        }
        return new d(apI());
    }

    private final void close() {
        String apH = apH();
        if (apH != null && apH.hashCode() == 1554454174 && apH.equals("deposit")) {
            com.iqoption.deposit.navigator.b.cGp.b(this, true);
            return;
        }
        com.iqoption.billing.repository.a.ayY.Kx();
        com.iqoption.deposit.navigator.b.cGp.P(this).alG();
    }

    private final void apN() {
        Object systemService = com.iqoption.core.ext.a.q(this).getSystemService("vibrator");
        if (systemService != null) {
            Vibrator vibrator = (Vibrator) systemService;
            if (VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(100, -1));
                return;
            } else {
                vibrator.vibrate(50);
                return;
            }
        }
        throw new TypeCastException("null cannot be cast to non-null type android.os.Vibrator");
    }
}

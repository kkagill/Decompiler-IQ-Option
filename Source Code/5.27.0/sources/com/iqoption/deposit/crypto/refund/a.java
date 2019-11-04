package com.iqoption.deposit.crypto.refund;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.gson.JsonObject;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.deposit.b.ad;
import com.iqoption.deposit.b.ax;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u000fH\u0002J\u0012\u0010%\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u0012\u0010(\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J&\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00104\u001a\u00020\u001fH\u0016J\b\u00105\u001a\u00020\u001fH\u0016J\b\u00106\u001a\u00020\u001fH\u0016J\u001a\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020/2\b\u0010,\u001a\u0004\u0018\u00010-H\u0017J\b\u00109\u001a\u00020\u001fH\u0002J\b\u0010:\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R#\u0010\u0013\u001a\n \u0014*\u0004\u0018\u00010\u00120\u00128BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000¨\u0006<"}, bng = {"Lcom/iqoption/deposit/crypto/refund/RefundAddressFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/qrcode/BarcodeCaptureFragment$OnFragmentInteractionListener;", "()V", "binding", "Lcom/iqoption/deposit/databinding/FragmentRefundAddressBinding;", "buttonBinding", "Lcom/iqoption/deposit/databinding/LayoutDepositButtonBinding;", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "getDepositParams", "()Lcom/iqoption/deposit/DepositParams;", "depositParams$delegate", "Lkotlin/Lazy;", "isCustomAnimationsEnabled", "", "()Z", "lastInput", "", "previousRefundWallet", "kotlin.jvm.PlatformType", "getPreviousRefundWallet", "()Ljava/lang/String;", "previousRefundWallet$delegate", "screenEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "viewModel", "Lcom/iqoption/deposit/crypto/refund/RefundAddressViewModel;", "analyticsParams", "Lcom/google/gson/JsonObject;", "beginDelayedTransition", "", "close", "closeBarcode", "closeBarcodeFragmentIfExist", "hidePayProgress", "isBarcodeFragmentExist", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onBarcodeDetected", "barcode", "Lcom/google/android/gms/vision/barcode/Barcode;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onEnterAnimation", "onExitAnimation", "onViewCreated", "view", "showPayProgress", "vibrate", "Companion", "deposit_release"})
/* compiled from: RefundAddressFragment.kt */
public final class a extends com.iqoption.core.ui.fragment.d implements com.iqoption.qrcode.a.b {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "depositParams", "getDepositParams()Lcom/iqoption/deposit/DepositParams;")), k.a(new PropertyReference1Impl(k.G(a.class), "previousRefundWallet", "getPreviousRefundWallet()Ljava/lang/String;"))};
    public static final a cAp = new a();
    private HashMap apm;
    private final boolean bIN = true;
    private b cAj;
    private ad cAk;
    private ax cAl;
    private String cAm;
    private final kotlin.d cAn = g.c(new RefundAddressFragment$depositParams$2(this));
    private final kotlin.d cAo = g.c(new RefundAddressFragment$previousRefundWallet$2(this));
    private com.iqoption.core.analytics.c czd;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, bng = {"Lcom/iqoption/deposit/crypto/refund/RefundAddressFragment$Companion;", "", "()V", "ARG_DEPOSIT_PARAMS", "", "ARG_PREVIOUS_REFUND_WALLET", "TAG", "getTAG", "()Ljava/lang/String;", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "previousRefundWallet", "deposit_release"})
    /* compiled from: RefundAddressFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final com.iqoption.core.ui.d.c a(com.iqoption.deposit.i iVar, String str) {
            com.iqoption.deposit.i iVar2 = iVar;
            kotlin.jvm.internal.i.f(iVar2, "depositParams");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_DEPOSIT_PARAMS", iVar2);
            bundle.putString("ARG_PREVIOUS_REFUND_WALLET", str);
            return new com.iqoption.core.ui.d.c(Bx(), a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"})
    /* compiled from: RefundAddressFragment.kt */
    static final class e implements OnFocusChangeListener {
        final /* synthetic */ a this$0;

        e(a aVar) {
            this.this$0 = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.this$0.aqZ();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"})
    /* compiled from: RefundAddressFragment.kt */
    static final class h implements OnFocusChangeListener {
        final /* synthetic */ a this$0;

        h(a aVar) {
            this.this$0 = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                com.iqoption.core.d.EC().c("deposit-page_refund-address-address", 0.0d, this.this$0.are());
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public b(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.close(false);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public c(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.ui.d.c m = com.iqoption.qrcode.a.dQV.m(true, false);
            if (!this.this$0.arb()) {
                CardView cardView = a.b(this.this$0).cCT;
                kotlin.jvm.internal.i.e(cardView, "binding.depositRefundScanCardContainer");
                com.iqoption.core.ext.a.ak(cardView);
                this.this$0.ara();
                com.iqoption.core.ext.a.u(this.this$0).beginTransaction().add(com.iqoption.deposit.o.e.depositRefundScanContainer, m.bh(com.iqoption.core.ext.a.q(this.this$0)), m.getName()).addToBackStack(m.getName()).commitAllowingStateLoss();
                a aVar = this.this$0;
                EditText editText = a.b(aVar).cCR;
                String str = "binding.depositRefundEdit";
                kotlin.jvm.internal.i.e(editText, str);
                aVar.cAm = editText.getText().toString();
                EditText editText2 = a.b(this.this$0).cCR;
                kotlin.jvm.internal.i.e(editText2, str);
                com.iqoption.deposit.light.b.b(editText2, null);
                editText2 = a.b(this.this$0).cCR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.this$0.getString(com.iqoption.deposit.o.g.scanning));
                stringBuilder.append("…");
                editText2.setText(stringBuilder.toString());
                a.b(this.this$0).cCR.setTextSize(0, com.iqoption.core.ext.a.q(this.this$0).getResources().getDimension(com.iqoption.deposit.o.c.sp16));
                TextView textView = a.b(this.this$0).cCQ;
                kotlin.jvm.internal.i.e(textView, "binding.depositRefundDescription");
                com.iqoption.core.ext.a.al(textView);
                a.b(this.this$0).cCP.requestFocus();
                v.az(a.b(this.this$0).getRoot());
                com.iqoption.core.d.EC().a("deposit-page_refund-address-scan", this.this$0.aqY().aeo().doubleValue(), this.this$0.are());
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public d(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x007c A:{Catch:{ Exception -> 0x0095 }} */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0073 A:{Catch:{ Exception -> 0x0095 }} */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00e1  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00f2  */
        public void M(android.view.View r14) {
            /*
            r13 = this;
            r0 = "refund_wallet";
            r1 = "v";
            kotlin.jvm.internal.i.f(r14, r1);
            r14 = r13.this$0;
            r14 = com.iqoption.deposit.crypto.refund.a.b(r14);
            r14 = r14.cCR;
            r1 = "binding.depositRefundEdit";
            kotlin.jvm.internal.i.e(r14, r1);
            r14 = r14.getText();
            r2 = r14.toString();
            r3 = "bitcoin:";
            r4 = "";
            r5 = 0;
            r6 = 4;
            r7 = 0;
            r14 = kotlin.text.u.a(r2, r3, r4, r5, r6, r7);
            if (r14 == 0) goto L_0x0104;
        L_0x002a:
            r14 = (java.lang.CharSequence) r14;
            r14 = kotlin.text.v.trim(r14);
            r14 = r14.toString();
            r2 = 0;
            r3 = r13.this$0;	 Catch:{ Exception -> 0x0095 }
            r3 = r3.aqY();	 Catch:{ Exception -> 0x0095 }
            r3 = r3.aon();	 Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x008d;
        L_0x0041:
            r3 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) r3;	 Catch:{ Exception -> 0x0095 }
            r3 = r3.aaH();	 Catch:{ Exception -> 0x0095 }
            if (r3 != 0) goto L_0x004c;
        L_0x0049:
            kotlin.jvm.internal.i.bnJ();	 Catch:{ Exception -> 0x0095 }
        L_0x004c:
            r3 = r3.aaT();	 Catch:{ Exception -> 0x0095 }
            if (r3 != 0) goto L_0x0055;
        L_0x0052:
            kotlin.jvm.internal.i.bnJ();	 Catch:{ Exception -> 0x0095 }
        L_0x0055:
            r3 = r3.get(r0);	 Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x0085;
        L_0x005b:
            r3 = (com.iqoption.core.microservices.billing.response.extraparams.d) r3;	 Catch:{ Exception -> 0x0095 }
            r3 = r3.getPattern();	 Catch:{ Exception -> 0x0095 }
            r4 = r3;
            r4 = (java.lang.CharSequence) r4;	 Catch:{ Exception -> 0x0095 }
            r5 = 1;
            if (r4 == 0) goto L_0x0070;
        L_0x0067:
            r4 = r4.length();	 Catch:{ Exception -> 0x0095 }
            if (r4 != 0) goto L_0x006e;
        L_0x006d:
            goto L_0x0070;
        L_0x006e:
            r4 = 0;
            goto L_0x0071;
        L_0x0070:
            r4 = 1;
        L_0x0071:
            if (r4 == 0) goto L_0x007c;
        L_0x0073:
            r3 = r14;
            r3 = (java.lang.CharSequence) r3;	 Catch:{ Exception -> 0x0095 }
            r2 = kotlin.text.u.Y(r3);	 Catch:{ Exception -> 0x0095 }
            r2 = r2 ^ r5;
            goto L_0x0083;
        L_0x007c:
            r4 = r14;
            r4 = (java.lang.CharSequence) r4;	 Catch:{ Exception -> 0x0095 }
            r2 = java.util.regex.Pattern.matches(r3, r4);	 Catch:{ Exception -> 0x0095 }
        L_0x0083:
            r12 = r2;
            goto L_0x0096;
        L_0x0085:
            r3 = new kotlin.TypeCastException;	 Catch:{ Exception -> 0x0095 }
            r4 = "null cannot be cast to non-null type com.iqoption.core.microservices.billing.response.extraparams.ExtraParamStringProperty";
            r3.<init>(r4);	 Catch:{ Exception -> 0x0095 }
            throw r3;	 Catch:{ Exception -> 0x0095 }
        L_0x008d:
            r3 = new kotlin.TypeCastException;	 Catch:{ Exception -> 0x0095 }
            r4 = "null cannot be cast to non-null type com.iqoption.core.microservices.billing.response.deposit.cashboxitem.PaymentMethod";
            r3.<init>(r4);	 Catch:{ Exception -> 0x0095 }
            throw r3;	 Catch:{ Exception -> 0x0095 }
        L_0x0095:
            r12 = 0;
        L_0x0096:
            if (r12 == 0) goto L_0x00c1;
        L_0x0098:
            r1 = r13.this$0;
            r1 = com.iqoption.deposit.crypto.refund.a.g(r1);
            r2 = r13.this$0;
            r2 = r2.aqY();
            r3 = 0;
            r4 = 0;
            r5 = 0;
            r6 = 0;
            r7 = 0;
            r8 = 0;
            r10 = 63;
            r11 = 0;
            r9 = r14;
            r2 = com.iqoption.deposit.i.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
            r14 = kotlin.j.x(r0, r14);
            r14 = kotlin.collections.ae.m(r14);
            r1.a(r2, r14);
            r14 = 0;
            r14 = (java.lang.String) r14;
            goto L_0x00df;
        L_0x00c1:
            r14 = r13.this$0;
            r0 = com.iqoption.deposit.o.g.incorrect_bitcoin_wallet_address;
            r14 = r14.getString(r0);
            r0 = r13.this$0;
            r0 = com.iqoption.deposit.crypto.refund.a.b(r0);
            r0 = r0.cCR;
            kotlin.jvm.internal.i.e(r0, r1);
            r1 = r13.this$0;
            r2 = com.iqoption.deposit.o.g.incorrect_bitcoin_wallet_address;
            r1 = r1.getString(r2);
            com.iqoption.deposit.light.b.b(r0, r1);
        L_0x00df:
            if (r12 == 0) goto L_0x00e4;
        L_0x00e1:
            r0 = 0;
            goto L_0x00e6;
        L_0x00e4:
            r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        L_0x00e6:
            r2 = com.iqoption.core.d.EC();
            r3 = r13.this$0;
            r3 = r3.are();
            if (r14 == 0) goto L_0x00fe;
        L_0x00f2:
            r4 = new com.google.gson.JsonPrimitive;
            r4.<init>(r14);
            r4 = (com.google.gson.JsonElement) r4;
            r14 = "error_description";
            r3.add(r14, r4);
        L_0x00fe:
            r14 = "deposit-page_refund-address-next";
            r2.a(r14, r0, r3);
            return;
        L_0x0104:
            r14 = new kotlin.TypeCastException;
            r0 = "null cannot be cast to non-null type kotlin.CharSequence";
            r14.<init>(r0);
            throw r14;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.crypto.refund.a$d.M(android.view.View):void");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/deposit/crypto/refund/RefundAddressFragment$onViewCreated$3", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "deposit_release"})
    /* compiled from: RefundAddressFragment.kt */
    public static final class f extends ah {
        final /* synthetic */ a this$0;

        f(a aVar) {
            this.this$0 = aVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            EditText editText = a.b(this.this$0).cCR;
            kotlin.jvm.internal.i.e(editText, "binding.depositRefundEdit");
            com.iqoption.deposit.light.b.b(editText, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: RefundAddressFragment.kt */
    static final class g<T> implements Observer<Boolean> {
        final /* synthetic */ a this$0;

        g(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                this.this$0.arc();
            } else {
                this.this$0.ard();
            }
        }
    }

    private final String aak() {
        kotlin.d dVar = this.cAo;
        j jVar = anY[1];
        return (String) dVar.getValue();
    }

    private final com.iqoption.deposit.i aqY() {
        kotlin.d dVar = this.cAn;
        j jVar = anY[0];
        return (com.iqoption.deposit.i) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final /* synthetic */ ad b(a aVar) {
        ad adVar = aVar.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return adVar;
    }

    public static final /* synthetic */ b g(a aVar) {
        b bVar = aVar.cAj;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return bVar;
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cAj = b.cAr.K(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.cAk = (ad) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.deposit.o.f.fragment_refund_address, viewGroup, false, 4, null);
        ad adVar = this.cAk;
        String str = "binding";
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ax axVar = adVar.cCO;
        kotlin.jvm.internal.i.e(axVar, "binding.depositBottomButtonBinding");
        this.cAl = axVar;
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return adVar.getRoot();
    }

    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.czd = com.iqoption.core.d.EC().h("deposit-page_refund-address", 0.0d, are());
        ad adVar = this.cAk;
        String str = "binding";
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        adVar.cBc.cDD.setText(com.iqoption.deposit.o.g.refund_address);
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = adVar.cBc.cCu;
        kotlin.jvm.internal.i.e(imageView, "binding.cryptoToolbar.toolbarBack");
        imageView.setOnClickListener(new b(this));
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        adVar.cCR.setOnFocusChangeListener(new e(this));
        if (bundle == null) {
            adVar = this.cAk;
            if (adVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            adVar.cCR.setText(aak());
        }
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        adVar.cCR.addTextChangedListener(new f(this));
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        imageView = adVar.cCS;
        kotlin.jvm.internal.i.e(imageView, "binding.depositRefundScan");
        imageView.setOnClickListener(new c(this));
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        adVar.cCO.cDq.setText(com.iqoption.deposit.o.g.next);
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = adVar.cCO.cDo;
        kotlin.jvm.internal.i.e(frameLayout, "binding.depositBottomBut…nding.depositBottomButton");
        frameLayout.setOnClickListener(new d(this));
        b bVar = this.cAj;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.aor().observe(this, new g(this));
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        adVar.cCR.setOnFocusChangeListener(new h(this));
    }

    public void onDestroyView() {
        com.iqoption.core.analytics.c cVar = this.czd;
        if (cVar != null) {
            cVar.Cc();
        }
        super.onDestroyView();
        Bj();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        close(true);
        return true;
    }

    private final void close(boolean z) {
        if (!z || !aqZ()) {
            com.iqoption.deposit.navigator.b.cGp.P(this).alG();
        }
    }

    private final boolean aqZ() {
        if (!arb()) {
            return false;
        }
        ara();
        com.iqoption.core.ext.a.u(this).popBackStack();
        ad adVar = this.cAk;
        String str = "binding";
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        adVar.cCR.setText(this.cAm);
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = adVar.cCQ;
        kotlin.jvm.internal.i.e(textView, "binding.depositRefundDescription");
        com.iqoption.core.ext.a.ak(textView);
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        adVar.cCR.setTextSize(0, com.iqoption.core.ext.a.q(this).getResources().getDimension(com.iqoption.deposit.o.c.sp12));
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        CardView cardView = adVar.cCT;
        kotlin.jvm.internal.i.e(cardView, "binding.depositRefundScanCardContainer");
        com.iqoption.core.ext.a.hide(cardView);
        return true;
    }

    private final void ara() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new Fade(2));
        transitionSet.addTransition(new Fade(1));
        transitionSet.setOrdering(0);
        transitionSet.setDuration(250);
        ad adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TransitionManager.beginDelayedTransition(adVar.cCP, transitionSet);
    }

    private final boolean arb() {
        return com.iqoption.core.ext.a.u(this).findFragmentByTag(com.iqoption.qrcode.a.dQV.Bx()) != null;
    }

    public void a(Barcode barcode) {
        aqZ();
        ad adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        adVar.cCR.setText(barcode != null ? barcode.rawValue : null);
        apN();
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

    private final void arc() {
        ax axVar = this.cAl;
        String str = "buttonBinding";
        if (axVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = axVar.cDo;
        kotlin.jvm.internal.i.e(frameLayout, "buttonBinding.depositBottomButton");
        frameLayout.setEnabled(false);
        axVar = this.cAl;
        if (axVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = axVar.cDq;
        kotlin.jvm.internal.i.e(textView, "buttonBinding.depositBottomButtonText");
        com.iqoption.core.ext.a.hide(textView);
        axVar = this.cAl;
        if (axVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = axVar.cDp;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "buttonBinding.depositBottomButtonProgress");
        contentLoadingProgressBar.setVisibility(0);
    }

    private final void ard() {
        ax axVar = this.cAl;
        String str = "buttonBinding";
        if (axVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = axVar.cDo;
        kotlin.jvm.internal.i.e(frameLayout, "buttonBinding.depositBottomButton");
        frameLayout.setEnabled(true);
        axVar = this.cAl;
        if (axVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = axVar.cDq;
        kotlin.jvm.internal.i.e(textView, "buttonBinding.depositBottomButtonText");
        com.iqoption.core.ext.a.ak(textView);
        axVar = this.cAl;
        if (axVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = axVar.cDp;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "buttonBinding.depositBottomButtonProgress");
        contentLoadingProgressBar.setVisibility(4);
    }

    public boolean PU() {
        return this.bIN;
    }

    public void PX() {
        Resources resources = com.iqoption.core.ext.a.q(this).getResources();
        kotlin.jvm.internal.i.e(resources, "ctx.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        ad adVar = this.cAk;
        String str = "binding";
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = adVar.getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{((float) displayMetrics.widthPixels) / ((float) 2), 0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "translation");
        ofPropertyValuesHolder.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(adVar.getRoot(), View.ALPHA, new float[]{0.0f, 1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alpha");
        ofFloat.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, PV());
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }

    public void PY() {
        Resources resources = com.iqoption.core.ext.a.q(this).getResources();
        kotlin.jvm.internal.i.e(resources, "ctx.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        ad adVar = this.cAk;
        String str = "binding";
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = adVar.getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f, ((float) displayMetrics.widthPixels) / ((float) 2)});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "translation");
        ofPropertyValuesHolder.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        adVar = this.cAk;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(adVar.getRoot(), View.ALPHA, new float[]{1.0f, 0.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alpha");
        ofFloat.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, PV());
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }

    private final JsonObject are() {
        return com.iqoption.deposit.d.a.cGB.o(aqY().aon());
    }
}

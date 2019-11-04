package com.iqoption.deposit.light.perform;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewStubProxy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.util.ag;
import com.iqoption.core.util.v;
import com.iqoption.deposit.b.az;
import com.iqoption.deposit.b.bh;
import com.iqoption.deposit.b.bo;
import com.iqoption.deposit.b.t;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\t \u0018\u0000 2\u00020\u00012\u00020\u0002:\u0003\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020BH\u0002J\b\u0010D\u001a\u00020EH\u0016J\u0019\u0010F\u001a\u0004\u0018\u00010G2\b\b\u0002\u0010H\u001a\u00020.H\u0002¢\u0006\u0002\u0010IJ\b\u0010J\u001a\u00020BH\u0002J\b\u0010K\u001a\u00020BH\u0002J\b\u0010L\u001a\u00020BH\u0002J\u0012\u0010M\u001a\u00020B2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J&\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0012\u0010V\u001a\u00020B2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0003J\b\u0010W\u001a\u00020BH\u0016J\u0010\u0010X\u001a\u00020B2\u0006\u0010Y\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020BH\u0016J\u0010\u0010\\\u001a\u00020B2\u0006\u0010]\u001a\u00020OH\u0016J\b\u0010^\u001a\u00020BH\u0016J\u001a\u0010_\u001a\u00020B2\u0006\u0010`\u001a\u00020Q2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010a\u001a\u00020B2\u0006\u0010b\u001a\u00020cH\u0002J\u001c\u0010d\u001a\u00020B2\b\u0010e\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010f\u001a\u000203H\u0002J\u0010\u0010g\u001a\u00020B2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010h\u001a\u00020B2\b\u0010i\u001a\u0004\u0018\u00010>H\u0002J\b\u0010j\u001a\u00020BH\u0002J\b\u0010k\u001a\u000203H\u0002J\b\u0010l\u001a\u000203H\u0002J\b\u0010m\u001a\u000203H\u0002J\b\u0010n\u001a\u000203H\u0002J\u0010\u0010o\u001a\u00020B2\u0006\u0010e\u001a\u00020,H\u0002J\b\u0010p\u001a\u00020BH\u0002J\b\u0010q\u001a\u00020BH\u0003J\b\u0010r\u001a\u00020BH\u0002J\b\u0010s\u001a\u00020BH\u0002J\b\u0010t\u001a\u00020BH\u0002J\b\u0010u\u001a\u00020BH\u0002J\b\u0010v\u001a\u00020BH\u0002J\b\u0010w\u001a\u00020BH\u0002J\b\u0010x\u001a\u00020BH\u0002J\u0010\u0010y\u001a\u00020B2\u0006\u0010z\u001a\u000203H\u0002J\b\u0010{\u001a\u00020BH\u0002J\u001b\u0010|\u001a\u0004\u0018\u00010}2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0002\u0010~R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\nR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148B@BX\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0004\n\u0002\u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R#\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8BX\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u000e¢\u0006\u0002\n\u0000R+\u00105\u001a\u0002042\u0006\u0010\u000b\u001a\u0002048B@BX\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0013\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X.¢\u0006\u0002\n\u0000¨\u0006\u0001"}, bng = {"Lcom/iqoption/deposit/light/perform/DepositPerformLightFragment;", "Lcom/iqoption/core/ui/navigation/BaseSlotNavigatorFragment;", "Lcom/iqoption/deposit/light/presets/OnPresetLightClickListener;", "()V", "_methodsToShowTutorial", "", "amount", "Ljava/math/BigDecimal;", "amountWatcher", "com/iqoption/deposit/light/perform/DepositPerformLightFragment$amountWatcher$1", "Lcom/iqoption/deposit/light/perform/DepositPerformLightFragment$amountWatcher$1;", "<set-?>", "Lcom/iqoption/deposit/databinding/FragmentDepositPerformLightBinding;", "binding", "getBinding", "()Lcom/iqoption/deposit/databinding/FragmentDepositPerformLightBinding;", "setBinding", "(Lcom/iqoption/deposit/databinding/FragmentDepositPerformLightBinding;)V", "binding$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lcom/iqoption/deposit/databinding/LayoutDepositButtonLightBinding;", "buttonBinding", "getButtonBinding", "()Lcom/iqoption/deposit/databinding/LayoutDepositButtonLightBinding;", "setButtonBinding", "(Lcom/iqoption/deposit/databinding/LayoutDepositButtonLightBinding;)V", "buttonBinding$delegate", "cashboxData", "Lcom/iqoption/billing/CashboxData;", "cashboxItem", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "convertedAmountWatcher", "com/iqoption/deposit/light/perform/DepositPerformLightFragment$convertedAmountWatcher$1", "Lcom/iqoption/deposit/light/perform/DepositPerformLightFragment$convertedAmountWatcher$1;", "currentPayDepositParams", "Lcom/iqoption/deposit/DepositParams;", "defaultPreset", "Ljava/util/ArrayList;", "Lcom/iqoption/core/features/limit/CurrencyValue;", "getDefaultPreset", "()Ljava/util/ArrayList;", "defaultPreset$delegate", "Lkotlin/Lazy;", "lastDefaultPresetAmount", "", "lastEditedAmount", "Landroid/widget/EditText;", "methodsToShowTutorial", "getMethodsToShowTutorial", "()[J", "payInProgress", "", "Lcom/iqoption/deposit/light/presets/PresetsLightAdapter;", "presetsAdapter", "getPresetsAdapter", "()Lcom/iqoption/deposit/light/presets/PresetsLightAdapter;", "setPresetsAdapter", "(Lcom/iqoption/deposit/light/presets/PresetsLightAdapter;)V", "presetsAdapter$delegate", "rateData", "Lcom/iqoption/deposit/crypto/preform/RateData;", "selectedCurrency", "Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "viewModel", "Lcom/iqoption/deposit/light/perform/DepositPerformLightViewModel;", "checkParamsAndPay", "", "clearFocusAndHideKeyboard", "getContainerId", "", "getDepositAmount", "", "editText", "(Landroid/widget/EditText;)Ljava/lang/Double;", "hidePayProgress", "initPresets", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMethodSelected", "onPause", "onPresetClick", "item", "Lcom/iqoption/deposit/light/presets/PresetItem;", "onResume", "onSaveInstanceState", "outState", "onStart", "onViewCreated", "view", "openInfoLink", "payMethodId", "", "setAmountError", "message", "shouldLinkifyKyc", "setData", "setDefaultPreset", "currency", "setPresets", "shouldShowCryptoUi", "shouldShowGooglePayUi", "shouldShowKycBeforeDep", "shouldShowLockedReason", "showKycAmountError", "showPayProgress", "subscribeOnChanges", "updateAmountConvertedVisibility", "updateButtonTextAndBackground", "updateConvertedAmount", "updateDepositButtonAvailability", "updateFiatCurrencyVisibility", "updateNoDataUIVisibility", "updatePresets", "updatePresetsVisibility", "focused", "updateProvidedVisibility", "validateAmount", "Lcom/iqoption/deposit/light/perform/AmountError;", "(Ljava/lang/Double;)Lcom/iqoption/deposit/light/perform/AmountError;", "Companion", "DepositInstructionsParams", "deposit_release"})
/* compiled from: DepositPerformLightFragment.kt */
public final class c extends com.iqoption.core.ui.d.a implements com.iqoption.deposit.light.d.a {
    private static final String TAG;
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.k.G(c.class), "binding", "getBinding()Lcom/iqoption/deposit/databinding/FragmentDepositPerformLightBinding;")), kotlin.jvm.internal.k.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.k.G(c.class), "buttonBinding", "getButtonBinding()Lcom/iqoption/deposit/databinding/LayoutDepositButtonLightBinding;")), kotlin.jvm.internal.k.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.k.G(c.class), "presetsAdapter", "getPresetsAdapter()Lcom/iqoption/deposit/light/presets/PresetsLightAdapter;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(c.class), "defaultPreset", "getDefaultPreset()Ljava/util/ArrayList;"))};
    public static final a cFO = new a();
    private HashMap apm;
    private com.iqoption.billing.e ayL;
    private final kotlin.f.d bIb = kotlin.f.a.eWg.bnQ();
    private BigDecimal bub;
    private e cFB;
    private final kotlin.f.d cFC = kotlin.f.a.eWg.bnQ();
    private final kotlin.f.d cFD = kotlin.f.a.eWg.bnQ();
    private com.iqoption.core.microservices.billing.response.deposit.d cFE;
    private final kotlin.d cFF = g.c(new DepositPerformLightFragment$defaultPreset$2(this));
    private String cFG;
    private com.iqoption.deposit.crypto.a.d cFH;
    private EditText cFI;
    private boolean cFJ;
    private com.iqoption.deposit.i cFK;
    private final c cFL = new c(this);
    private final d cFM = new d(this);
    private long[] cFN;
    private com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a cxs;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, bng = {"Lcom/iqoption/deposit/light/perform/DepositPerformLightFragment$Companion;", "", "()V", "ARG_DEFAULT_PRESET", "", "STATE_CURRENCY", "STATE_DEPOSIT_PARAMS", "TAG", "getTAG", "()Ljava/lang/String;", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "depositPreset", "Ljava/util/ArrayList;", "Lcom/iqoption/core/features/limit/CurrencyValue;", "deposit_release"})
    /* compiled from: DepositPerformLightFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return c.TAG;
        }

        public final com.iqoption.core.ui.d.c h(ArrayList<com.iqoption.core.features.c.a> arrayList) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("ARG_DEFAULT_PRESET", arrayList);
            return new com.iqoption.core.ui.d.c(Bx(), c.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/deposit/light/perform/DepositPerformLightFragment$DepositInstructionsParams;", "", "()V", "methodIds", "", "([J)V", "getMethodIds", "()[J", "deposit_release"})
    /* compiled from: DepositPerformLightFragment.kt */
    private static final class b {
        @SerializedName("depositMethodsIds")
        private final long[] cFP;

        public b(long[] jArr) {
            this.cFP = jArr;
        }

        public final long[] asJ() {
            return this.cFP;
        }

        public b() {
            this(null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "focused", "", "onFocusChange"})
    /* compiled from: DepositPerformLightFragment.kt */
    static final class s implements OnFocusChangeListener {
        final /* synthetic */ com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a cFR;
        final /* synthetic */ c this$0;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnLayout$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_release"})
        /* compiled from: AndroidExtensions.kt */
        public static final class a implements OnGlobalLayoutListener {
            final /* synthetic */ View bgH;
            final /* synthetic */ s cFS;
            final /* synthetic */ boolean cFT;

            public a(View view, s sVar, boolean z) {
                this.bgH = view;
                this.cFS = sVar;
                this.cFT = z;
            }

            public void onGlobalLayout() {
                this.bgH.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.cFS.this$0.cQ(this.cFT);
            }
        }

        s(c cVar, com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
            this.this$0 = cVar;
            this.cFR = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (this.this$0.akX()) {
                this.this$0.cQ(z);
            } else {
                view = this.this$0.asp().getRoot();
                kotlin.jvm.internal.i.e(view, "binding.root");
                view.getViewTreeObserver().addOnGlobalLayoutListener(new a(view, this, z));
            }
            if (z) {
                Double a = c.a(this.this$0, null, 1, null);
                double doubleValue = a != null ? a.doubleValue() : 0.0d;
                com.iqoption.core.analytics.d EC = com.iqoption.core.d.Um().EC();
                JsonObject o = com.iqoption.deposit.d.a.cGB.o(this.cFR);
                com.iqoption.core.microservices.billing.response.deposit.d e = this.this$0.cFE;
                if (e != null) {
                    String name = e.getName();
                    if (name != null) {
                        o.add("currency_name", new JsonPrimitive(name));
                    }
                }
                EC.c("deposit-page_amount", doubleValue, o);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends com.iqoption.core.ext.g {
        final /* synthetic */ c this$0;

        public e(c cVar) {
            this.this$0 = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.asp().cCq.fullScroll(130);
            v.j(this.this$0.getActivity());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class f extends com.iqoption.core.ext.g {
        final /* synthetic */ c this$0;

        public f(c cVar) {
            this.this$0 = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.asu();
            this.this$0.back();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class g extends com.iqoption.core.ext.g {
        final /* synthetic */ c this$0;

        public g(c cVar) {
            this.this$0 = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.d.Um().EC().a("deposit-page_deposit", 0.0d, com.iqoption.deposit.d.a.cGB.atf());
            this.this$0.asC();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class h extends com.iqoption.core.ext.g {
        final /* synthetic */ ObjectRef cFQ;
        final /* synthetic */ c this$0;

        public h(c cVar, ObjectRef objectRef) {
            this.this$0 = cVar;
            this.cFQ = objectRef;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.bv(((Long) this.cFQ.element).longValue());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class i extends com.iqoption.core.ext.g {
        final /* synthetic */ ObjectRef cFQ;
        final /* synthetic */ c this$0;

        public i(c cVar, ObjectRef objectRef) {
            this.this$0 = cVar;
            this.cFQ = objectRef;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.bv(((Long) this.cFQ.element).longValue());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "onChanged"})
    /* compiled from: DepositPerformLightFragment.kt */
    static final class j<T> implements Observer<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> {
        final /* synthetic */ c this$0;

        j(c cVar) {
            this.this$0 = cVar;
        }

        /* renamed from: k */
        public final void onChanged(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
            this.this$0.n(aVar);
            this.this$0.asy();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "currency", "Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositPerformLightFragment.kt */
    static final class k<T> implements Observer<com.iqoption.core.microservices.billing.response.deposit.d> {
        final /* synthetic */ c this$0;

        k(c cVar) {
            this.this$0 = cVar;
        }

        /* renamed from: e */
        public final void onChanged(com.iqoption.core.microservices.billing.response.deposit.d dVar) {
            if (dVar != null) {
                if (!(this.this$0.cFE == null || (kotlin.jvm.internal.i.y(this.this$0.cFE, dVar) ^ 1) == 0)) {
                    c.a(this.this$0, null, false, 2, null);
                }
                this.this$0.cFE = dVar;
                TextView textView = this.this$0.asp().cCi;
                kotlin.jvm.internal.i.e(textView, "binding.depositAmountTitle");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.this$0.getString(com.iqoption.deposit.o.g.amount));
                stringBuilder.append(" (");
                stringBuilder.append(dVar.getName());
                stringBuilder.append(')');
                textView.setText(stringBuilder.toString());
                textView = this.this$0.asp().cCa.cDn;
                kotlin.jvm.internal.i.e(textView, "binding.currencySelector.selectCurrencyName");
                textView.setText(dVar.getName());
            }
            this.this$0.asx();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "deposit", "Lcom/iqoption/core/microservices/billing/response/deposit/Deposit;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositPerformLightFragment.kt */
    static final class l<T> implements Observer<com.iqoption.core.microservices.billing.response.deposit.e> {
        final /* synthetic */ c this$0;

        l(c cVar) {
            this.this$0 = cVar;
        }

        /* renamed from: e */
        public final void onChanged(com.iqoption.core.microservices.billing.response.deposit.e eVar) {
            if (eVar != null) {
                this.this$0.asp().cCg.setText(com.iqoption.deposit.f.a(eVar));
                EditText editText = this.this$0.asp().cCg;
                EditText editText2 = this.this$0.asp().cCg;
                kotlin.jvm.internal.i.e(editText2, "binding.depositAmountEdit");
                editText.setSelection(editText2.getText().length());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "amount", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositPerformLightFragment.kt */
    static final class m<T> implements Observer<BigDecimal> {
        final /* synthetic */ c this$0;

        m(c cVar) {
            this.this$0 = cVar;
        }

        /* renamed from: c */
        public final void onChanged(BigDecimal bigDecimal) {
            this.this$0.asy();
            this.this$0.bub = bigDecimal;
            this.this$0.asr().c(this.this$0.asr().getItems(), bigDecimal != null ? com.iqoption.core.util.e.a(bigDecimal, 0, null, true, false, null, 19, null) : null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "cashboxDisplayData", "Lcom/iqoption/billing/CashboxDisplayData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositPerformLightFragment.kt */
    static final class n<T> implements Observer<com.iqoption.billing.f> {
        final /* synthetic */ c this$0;

        n(c cVar) {
            this.this$0 = cVar;
        }

        /* renamed from: c */
        public final void onChanged(com.iqoption.billing.f fVar) {
            if (fVar != null) {
                com.iqoption.billing.e Kp = fVar.Kp();
                if (Kp != null) {
                    this.this$0.b(Kp);
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/deposit/crypto/preform/RateData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositPerformLightFragment.kt */
    static final class o<T> implements Observer<com.iqoption.deposit.crypto.a.d> {
        final /* synthetic */ c this$0;

        o(c cVar) {
            this.this$0 = cVar;
        }

        /* renamed from: b */
        public final void onChanged(com.iqoption.deposit.crypto.a.d dVar) {
            this.this$0.cFH = dVar;
            this.this$0.asz();
            this.this$0.asG();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: DepositPerformLightFragment.kt */
    static final class p<T> implements Observer<Boolean> {
        final /* synthetic */ c this$0;

        p(c cVar) {
            this.this$0 = cVar;
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

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/billing/wallet/GooglePayResult;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositPerformLightFragment.kt */
    static final class q<T> implements Observer<com.iqoption.billing.wallet.b> {
        final /* synthetic */ c this$0;

        q(c cVar) {
            this.this$0 = cVar;
        }

        /* renamed from: b */
        public final void onChanged(com.iqoption.billing.wallet.b bVar) {
            com.iqoption.deposit.i l = this.this$0.cFK;
            if (l == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            com.iqoption.billing.wallet.c KJ = bVar != null ? bVar.KJ() : null;
            if (KJ != null) {
                c.m(this.this$0).a(l, KJ.KK());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class r extends com.iqoption.core.ext.g {
        final /* synthetic */ c this$0;

        public r(c cVar) {
            this.this$0 = cVar;
            super(0, 1, null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
        public void M(android.view.View r6) {
            /*
            r5 = this;
            r0 = "v";
            kotlin.jvm.internal.i.f(r6, r0);
            r6 = r5.this$0;
            r6 = r6.ayL;
            r0 = 0;
            if (r6 == 0) goto L_0x001a;
        L_0x000f:
            r6 = r6.Km();
            if (r6 == 0) goto L_0x001a;
        L_0x0015:
            r6 = r6.XA();
            goto L_0x001b;
        L_0x001a:
            r6 = r0;
        L_0x001b:
            if (r6 != 0) goto L_0x0020;
        L_0x001d:
            kotlin.jvm.internal.i.bnJ();
        L_0x0020:
            r1 = com.iqoption.deposit.light.menu.currency.c.cFb;
            r2 = new com.iqoption.deposit.c.a.b;
            r6 = (java.util.List) r6;
            r3 = r5.this$0;
            r3 = r3.cFE;
            if (r3 == 0) goto L_0x0037;
        L_0x002e:
            r3 = r3.getId();
            r3 = java.lang.Long.valueOf(r3);
            goto L_0x0038;
        L_0x0037:
            r3 = r0;
        L_0x0038:
            r2.<init>(r6, r3);
            r6 = r1.a(r2);
            r1 = com.iqoption.deposit.navigator.b.cGp;
            r2 = r5.this$0;
            r2 = (androidx.fragment.app.Fragment) r2;
            r1 = r1.P(r2);
            r2 = 0;
            r3 = 2;
            com.iqoption.core.ui.d.g.b(r1, r6, r2, r3, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.light.perform.c$r.M(android.view.View):void");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/deposit/light/perform/DepositPerformLightFragment$amountWatcher$1", "Lcom/iqoption/deposit/light/perform/AmountWatcher;", "cycledUpdate", "", "text", "Landroid/text/Editable;", "onTextChanged", "deposit_release"})
    /* compiled from: DepositPerformLightFragment.kt */
    public static final class c extends b {
        final /* synthetic */ c this$0;

        c(c cVar) {
            this.this$0 = cVar;
        }

        public void a(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "text");
            if (this.this$0.ayL == null || this.this$0.cFE == null || c.a(this.this$0, null, 1, null) != null) {
                c.m(this.this$0).b(null);
                return;
            }
            c.m(this.this$0).b(new BigDecimal(editable.toString()));
            c.a(this.this$0, null, false, 2, null);
        }

        public void b(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "text");
            c cVar = this.this$0;
            cVar.cFI = cVar.asp().cCg;
            this.this$0.asz();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/deposit/light/perform/DepositPerformLightFragment$convertedAmountWatcher$1", "Lcom/iqoption/deposit/light/perform/AmountWatcher;", "cycledUpdate", "", "text", "Landroid/text/Editable;", "onTextChanged", "deposit_release"})
    /* compiled from: DepositPerformLightFragment.kt */
    public static final class d extends b {
        final /* synthetic */ c this$0;

        public void a(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "text");
        }

        d(c cVar) {
            this.this$0 = cVar;
        }

        public void b(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "text");
            c cVar = this.this$0;
            cVar.cFI = cVar.asp().cCf;
            this.this$0.asz();
        }
    }

    private final void a(az azVar) {
        this.cFC.a(this, anY[1], azVar);
    }

    private final void a(t tVar) {
        this.bIb.a(this, anY[0], tVar);
    }

    private final void a(com.iqoption.deposit.light.d.d dVar) {
        this.cFD.a(this, anY[2], dVar);
    }

    private final t asp() {
        return (t) this.bIb.b(this, anY[0]);
    }

    private final az asq() {
        return (az) this.cFC.b(this, anY[1]);
    }

    private final com.iqoption.deposit.light.d.d asr() {
        return (com.iqoption.deposit.light.d.d) this.cFD.b(this, anY[2]);
    }

    private final ArrayList<com.iqoption.core.features.c.a> ass() {
        kotlin.d dVar = this.cFF;
        kotlin.reflect.j jVar = anY[3];
        return (ArrayList) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ e m(c cVar) {
        e eVar = cVar.cFB;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return eVar;
    }

    static {
        String name = c.class.getName();
        kotlin.jvm.internal.i.e(name, "DepositPerformLightFragment::class.java.name");
        TAG = name;
    }

    private final long[] ast() {
        long[] jArr = this.cFN;
        if (jArr != null) {
            return jArr;
        }
        com.iqoption.core.microservices.features.a.a ei = com.iqoption.core.d.EH().ei("deposit-instructions");
        long[] jArr2 = null;
        if (ei != null && ei.isEnabled()) {
            try {
                b bVar = (b) com.iqoption.core.ext.d.a(ei.ady(), b.class, null, 2, null);
                if (bVar != null) {
                    jArr2 = bVar.asJ();
                }
            } catch (Throwable unused) {
            }
        }
        if (jArr2 == null) {
            jArr2 = new long[0];
        }
        this.cFN = jArr2;
        return jArr2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cFB = e.cFU.N(this);
        if (bundle != null) {
            this.cFE = (com.iqoption.core.microservices.billing.response.deposit.d) bundle.getParcelable("STATE_CURRENCY");
            this.cFK = (com.iqoption.deposit.i) bundle.getParcelable("STATE_DEPOSIT_PARAMS");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        a((t) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.deposit.o.f.fragment_deposit_perform_light, viewGroup, false, 4, null));
        az azVar = asp().cCj;
        kotlin.jvm.internal.i.e(azVar, "binding.depositButtonBinding");
        a(azVar);
        return asp().getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        apy();
        asv();
        asI();
        BO();
    }

    private final void apy() {
        ard();
        bo boVar = asp().cCv;
        kotlin.jvm.internal.i.e(boVar, "binding.toolbarTitleLayout");
        LinearLayout linearLayout = boVar.cDH;
        kotlin.jvm.internal.i.e(linearLayout, "toolbarLayout.depositToolbarSecure");
        linearLayout.setOnClickListener(new e(this));
        String str = "binding.toolbarBack";
        ImageView imageView;
        if (ag.a(getResources())) {
            imageView = asp().cCu;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.al(imageView);
        } else {
            imageView = asp().cCu;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.ak(imageView);
            imageView = asp().cCu;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setOnClickListener(new f(this));
        }
        EditText editText = asp().cCg;
        kotlin.jvm.internal.i.e(editText, "binding.depositAmountEdit");
        com.iqoption.core.ext.a.a(editText, (InputFilter) new com.iqoption.core.ui.widget.a(2));
        FrameLayout frameLayout = asq().cDo;
        kotlin.jvm.internal.i.e(frameLayout, "buttonBinding.depositBottomButton");
        frameLayout.setOnClickListener(new g(this));
        asA();
    }

    private final void asu() {
        v.j(getActivity());
        View view = getView();
        if (view != null) {
            view = view.findFocus();
            if (view != null) {
                view.clearFocus();
            }
        }
    }

    public void onStart() {
        super.onStart();
        asv();
    }

    public void onResume() {
        super.onResume();
        asp().cCg.addTextChangedListener(this.cFL);
    }

    public void onPause() {
        asp().cCg.removeTextChangedListener(this.cFL);
        super.onPause();
    }

    private final void asv() {
        String str = "binding.depositFields";
        String str2 = "binding.depositAmountContainer";
        String str3 = "binding.toolbarTitleLayout.depositToolbarSecure";
        String str4 = "binding.depositNoData";
        LinearLayout linearLayout;
        TextView textView;
        FrameLayout frameLayout;
        if (this.ayL == null || this.cxs == null) {
            linearLayout = asp().cCv.cDH;
            kotlin.jvm.internal.i.e(linearLayout, str3);
            com.iqoption.core.ext.a.al(linearLayout);
            textView = asp().cCo;
            kotlin.jvm.internal.i.e(textView, str4);
            textView.setText(getString(com.iqoption.deposit.o.g.choose_method));
            linearLayout = asp().cCb;
            kotlin.jvm.internal.i.e(linearLayout, str2);
            com.iqoption.core.ext.a.al(linearLayout);
            textView = asp().cCo;
            kotlin.jvm.internal.i.e(textView, str4);
            com.iqoption.core.ext.a.ak(textView);
            frameLayout = asp().cCk;
            kotlin.jvm.internal.i.e(frameLayout, str);
            com.iqoption.core.ext.a.al(frameLayout);
            return;
        }
        String str5 = null;
        if (aoJ()) {
            linearLayout = asp().cCv.cDH;
            kotlin.jvm.internal.i.e(linearLayout, str3);
            com.iqoption.core.ext.a.ak(linearLayout);
            textView = asp().cCo;
            kotlin.jvm.internal.i.e(textView, str4);
            textView.setText((CharSequence) null);
            linearLayout = asp().cCb;
            kotlin.jvm.internal.i.e(linearLayout, str2);
            com.iqoption.core.ext.a.ak(linearLayout);
            textView = asp().cCo;
            kotlin.jvm.internal.i.e(textView, str4);
            com.iqoption.core.ext.a.ak(textView);
            frameLayout = asp().cCk;
            kotlin.jvm.internal.i.e(frameLayout, str);
            com.iqoption.core.ext.a.al(frameLayout);
        } else if (asw()) {
            linearLayout = asp().cCv.cDH;
            kotlin.jvm.internal.i.e(linearLayout, str3);
            com.iqoption.core.ext.a.ak(linearLayout);
            textView = asp().cCo;
            kotlin.jvm.internal.i.e(textView, str4);
            com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar = this.cxs;
            if (aVar != null) {
                str5 = com.iqoption.deposit.light.methods.i.cFx.b(aVar, com.iqoption.core.ext.a.q(this));
            }
            textView.setText(str5);
            linearLayout = asp().cCb;
            kotlin.jvm.internal.i.e(linearLayout, str2);
            com.iqoption.core.ext.a.al(linearLayout);
            textView = asp().cCo;
            kotlin.jvm.internal.i.e(textView, str4);
            com.iqoption.core.ext.a.ak(textView);
            frameLayout = asp().cCk;
            kotlin.jvm.internal.i.e(frameLayout, str);
            com.iqoption.core.ext.a.al(frameLayout);
        } else {
            linearLayout = asp().cCv.cDH;
            kotlin.jvm.internal.i.e(linearLayout, str3);
            com.iqoption.core.ext.a.ak(linearLayout);
            linearLayout = asp().cCb;
            kotlin.jvm.internal.i.e(linearLayout, str2);
            com.iqoption.core.ext.a.ak(linearLayout);
            textView = asp().cCo;
            kotlin.jvm.internal.i.e(textView, str4);
            com.iqoption.core.ext.a.al(textView);
            frameLayout = asp().cCk;
            kotlin.jvm.internal.i.e(frameLayout, str);
            com.iqoption.core.ext.a.ak(frameLayout);
        }
    }

    private final boolean aoJ() {
        e eVar = this.cFB;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return eVar.aoJ();
    }

    private final boolean asw() {
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar = this.cxs;
        return aVar != null && aVar.ZY();
    }

    @SuppressLint({"SetTextI18n"})
    private final void BO() {
        e eVar = this.cFB;
        String str = "viewModel";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        eVar.aoy().observe(lifecycleOwner, new j(this));
        eVar = this.cFB;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.aoz().observe(lifecycleOwner, new k(this));
        eVar = this.cFB;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.aoC().observe(lifecycleOwner, new l(this));
        eVar = this.cFB;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.aoD().observe(lifecycleOwner, new m(this));
        eVar = this.cFB;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.aox().observe(lifecycleOwner, new n(this));
        eVar = this.cFB;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.aoB().observe(lifecycleOwner, new o(this));
        eVar = this.cFB;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.aor().observe(lifecycleOwner, new p(this));
        eVar = this.cFB;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.aot().observe(lifecycleOwner, new q(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    private final void asx() {
        /*
        r12 = this;
        r0 = r12.cFE;
        if (r0 == 0) goto L_0x0073;
    L_0x0004:
        r1 = r12.cxs;
        if (r1 == 0) goto L_0x0073;
    L_0x0008:
        r1 = r12.ayL;
        if (r1 != 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0073;
    L_0x000d:
        r2 = 0;
        if (r1 == 0) goto L_0x0027;
    L_0x0010:
        r1 = r1.Km();
        if (r1 == 0) goto L_0x0027;
    L_0x0016:
        r1 = r1.aar();
        if (r1 == 0) goto L_0x0027;
    L_0x001c:
        r3 = r0.getName();
        r1 = r1.get(r3);
        r1 = (java.util.ArrayList) r1;
        goto L_0x0028;
    L_0x0027:
        r1 = r2;
    L_0x0028:
        if (r1 == 0) goto L_0x0051;
    L_0x002a:
        r1 = (java.lang.Iterable) r1;
        r1 = kotlin.collections.u.Z(r1);
        if (r1 == 0) goto L_0x0051;
    L_0x0032:
        r3 = new com.iqoption.deposit.light.perform.DepositPerformLightFragment$setPresets$items$1;
        r3.<init>(r12);
        r3 = (kotlin.jvm.a.b) r3;
        r1 = kotlin.sequences.n.b(r1, r3);
        if (r1 == 0) goto L_0x0051;
    L_0x003f:
        r3 = new com.iqoption.deposit.light.perform.DepositPerformLightFragment$setPresets$items$2;
        r3.<init>(r0);
        r3 = (kotlin.jvm.a.b) r3;
        r1 = kotlin.sequences.n.f(r1, r3);
        if (r1 == 0) goto L_0x0051;
    L_0x004c:
        r1 = kotlin.sequences.n.f(r1);
        goto L_0x0052;
    L_0x0051:
        r1 = r2;
    L_0x0052:
        r3 = r12.asr();
        if (r1 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x005d;
    L_0x0059:
        r1 = kotlin.collections.m.emptyList();
    L_0x005d:
        r4 = r12.bub;
        if (r4 == 0) goto L_0x006d;
    L_0x0061:
        r5 = 0;
        r6 = 0;
        r7 = 1;
        r8 = 0;
        r9 = 0;
        r10 = 19;
        r11 = 0;
        r2 = com.iqoption.core.util.e.a(r4, r5, r6, r7, r8, r9, r10, r11);
    L_0x006d:
        r3.c(r1, r2);
        r12.d(r0);
    L_0x0073:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.light.perform.c.asx():void");
    }

    private final void asy() {
        if (this.cxs != null) {
            Drawable n;
            BigDecimal bigDecimal = this.bub;
            String string = getString(com.iqoption.deposit.o.g.deposit1);
            kotlin.jvm.internal.i.e(string, "getString(R.string.deposit1)");
            String str = "buttonBinding.googlepayButton";
            String str2 = "buttonBinding.depositBottomButtonText";
            TextView textView;
            ViewStubProxy viewStubProxy;
            View root;
            if (asD()) {
                n = com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), com.iqoption.deposit.o.d.bg_rectangle_green);
                asq().cDq.setText(com.iqoption.deposit.o.g.next);
                textView = asq().cDq;
                kotlin.jvm.internal.i.e(textView, str2);
                com.iqoption.core.ext.a.ak(textView);
                viewStubProxy = asq().cDr;
                kotlin.jvm.internal.i.e(viewStubProxy, str);
                root = viewStubProxy.getRoot();
                if (root != null) {
                    com.iqoption.core.ext.a.al(root);
                }
            } else if (asE()) {
                n = (Drawable) null;
                viewStubProxy = asq().cDr;
                kotlin.jvm.internal.i.e(viewStubProxy, str);
                if (!viewStubProxy.isInflated()) {
                    viewStubProxy = asq().cDr;
                    kotlin.jvm.internal.i.e(viewStubProxy, str);
                    ViewStub viewStub = viewStubProxy.getViewStub();
                    if (viewStub != null) {
                        viewStub.inflate();
                    }
                }
                textView = asq().cDq;
                kotlin.jvm.internal.i.e(textView, str2);
                com.iqoption.core.ext.a.al(textView);
                viewStubProxy = asq().cDr;
                kotlin.jvm.internal.i.e(viewStubProxy, str);
                root = viewStubProxy.getRoot();
                if (root != null) {
                    com.iqoption.core.ext.a.ak(root);
                }
            } else if (bigDecimal == null || this.cFE == null) {
                n = com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), com.iqoption.deposit.o.d.bg_rectangle_green);
                TextView textView2 = asq().cDq;
                kotlin.jvm.internal.i.e(textView2, str2);
                textView2.setText(string);
                textView = asq().cDq;
                kotlin.jvm.internal.i.e(textView, str2);
                com.iqoption.core.ext.a.ak(textView);
                viewStubProxy = asq().cDr;
                kotlin.jvm.internal.i.e(viewStubProxy, str);
                root = viewStubProxy.getRoot();
                if (root != null) {
                    com.iqoption.core.ext.a.al(root);
                }
            } else {
                Drawable n2 = com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), com.iqoption.deposit.o.d.bg_rectangle_green);
                TextView textView3 = asq().cDq;
                kotlin.jvm.internal.i.e(textView3, str2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(' ');
                com.iqoption.core.microservices.billing.response.deposit.d dVar = this.cFE;
                if (dVar == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                stringBuilder.append(com.iqoption.core.util.e.a(bigDecimal, dVar, false, 2, null));
                textView3.setText(stringBuilder.toString());
                TextView textView4 = asq().cDq;
                kotlin.jvm.internal.i.e(textView4, str2);
                com.iqoption.core.ext.a.ak(textView4);
                ViewStubProxy viewStubProxy2 = asq().cDr;
                kotlin.jvm.internal.i.e(viewStubProxy2, str);
                View root2 = viewStubProxy2.getRoot();
                if (root2 != null) {
                    com.iqoption.core.ext.a.al(root2);
                }
                n = n2;
            }
            FrameLayout frameLayout = asq().cDo;
            String str3 = "buttonBinding.depositBottomButton";
            kotlin.jvm.internal.i.e(frameLayout, str3);
            LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.setMarginEnd(0);
                marginLayoutParams.bottomMargin = 0;
                FrameLayout frameLayout2 = asq().cDo;
                kotlin.jvm.internal.i.e(frameLayout2, str3);
                frameLayout2.setLayoutParams(marginLayoutParams);
                frameLayout = asq().cDo;
                kotlin.jvm.internal.i.e(frameLayout, str3);
                frameLayout.setBackground(n);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    private final void asz() {
        com.iqoption.deposit.crypto.a.d dVar = this.cFH;
        EditText editText = this.cFI;
        if (asD() && dVar != null && editText != null) {
            boolean y = kotlin.jvm.internal.i.y(editText, asp().cCg);
            Double f = f(editText);
            if (f != null) {
                double doubleValue = f.doubleValue();
                double doubleValue2 = dVar.aal().aam().doubleValue();
                String str = "Locale.US";
                String a;
                if (y) {
                    double d = doubleValue / doubleValue2;
                    int minorUnits = dVar.aqW().getMinorUnits();
                    Locale locale = Locale.US;
                    kotlin.jvm.internal.i.e(locale, str);
                    a = com.iqoption.core.util.e.a(d, minorUnits, null, true, false, false, false, null, locale, 114, null);
                    editText = asp().cCf;
                    kotlin.jvm.internal.i.e(editText, "binding.depositAmountConvertedEdit");
                    d.a(editText, a, this.cFM);
                    return;
                }
                doubleValue *= doubleValue2;
                int minorUnits2 = dVar.aqX().getMinorUnits();
                Locale locale2 = Locale.US;
                kotlin.jvm.internal.i.e(locale2, str);
                a = com.iqoption.core.util.e.a(doubleValue, minorUnits2, null, true, false, false, false, null, locale2, 114, null);
                editText = asp().cCg;
                kotlin.jvm.internal.i.e(editText, "binding.depositAmountEdit");
                d.a(editText, a, this.cFL);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010d  */
    private final void d(com.iqoption.core.microservices.billing.response.deposit.d r21) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r20.asp();
        r1 = r1.cCg;
        r2 = "binding.depositAmountEdit";
        kotlin.jvm.internal.i.e(r1, r2);
        if (r21 == 0) goto L_0x0158;
    L_0x000f:
        r2 = r0.cFG;
        r3 = 1;
        if (r2 == 0) goto L_0x0027;
    L_0x0014:
        r2 = r1.getText();
        r2 = r2.toString();
        r4 = r0.cFG;
        r2 = kotlin.jvm.internal.i.y(r2, r4);
        r2 = r2 ^ r3;
        if (r2 == 0) goto L_0x0027;
    L_0x0025:
        goto L_0x0158;
    L_0x0027:
        r2 = r20.ass();
        r4 = 0;
        if (r2 == 0) goto L_0x0068;
    L_0x002e:
        r2 = (java.lang.Iterable) r2;
        r2 = r2.iterator();
    L_0x0034:
        r5 = r2.hasNext();
        if (r5 == 0) goto L_0x0050;
    L_0x003a:
        r5 = r2.next();
        r6 = r5;
        r6 = (com.iqoption.core.features.c.a) r6;
        r6 = r6.getName();
        r7 = r21.getName();
        r6 = kotlin.jvm.internal.i.y(r6, r7);
        if (r6 == 0) goto L_0x0034;
    L_0x004f:
        goto L_0x0051;
    L_0x0050:
        r5 = r4;
    L_0x0051:
        r5 = (com.iqoption.core.features.c.a) r5;
        if (r5 == 0) goto L_0x0068;
    L_0x0055:
        r6 = r5.Xy();
        if (r6 == 0) goto L_0x0068;
    L_0x005b:
        r7 = 0;
        r8 = 0;
        r9 = 1;
        r10 = 0;
        r11 = 0;
        r12 = 19;
        r13 = 0;
        r2 = com.iqoption.core.util.e.a(r6, r7, r8, r9, r10, r11, r12, r13);
        goto L_0x0069;
    L_0x0068:
        r2 = r4;
    L_0x0069:
        r5 = r0.ayL;
        if (r5 == 0) goto L_0x0084;
    L_0x006d:
        r5 = r5.Km();
        if (r5 == 0) goto L_0x0084;
    L_0x0073:
        r5 = r5.aar();
        if (r5 == 0) goto L_0x0084;
    L_0x0079:
        r6 = r21.getName();
        r5 = r5.get(r6);
        r5 = (java.util.ArrayList) r5;
        goto L_0x0085;
    L_0x0084:
        r5 = r4;
    L_0x0085:
        if (r2 != 0) goto L_0x00a5;
    L_0x0087:
        if (r5 == 0) goto L_0x00a5;
    L_0x0089:
        r2 = r20.asr();
        r2 = r2.getItems();
        r2 = kotlin.collections.u.bV(r2);
        r2 = (com.iqoption.deposit.light.d.b) r2;
        if (r2 == 0) goto L_0x00a4;
    L_0x0099:
        r2 = r2.asL();
        if (r2 == 0) goto L_0x00a4;
    L_0x009f:
        r2 = com.iqoption.deposit.f.a(r2);
        goto L_0x00a5;
    L_0x00a4:
        r2 = r4;
    L_0x00a5:
        r6 = r0.cxs;
        r7 = r0.cFE;
        r8 = r4;
        r8 = (java.lang.Double) r8;
        if (r2 != 0) goto L_0x00f4;
    L_0x00ae:
        r9 = r6 instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d;
        if (r9 == 0) goto L_0x00f4;
    L_0x00b2:
        if (r7 == 0) goto L_0x00f4;
    L_0x00b4:
        r6 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) r6;
        r6 = r6.aaI();
        if (r6 == 0) goto L_0x00cd;
    L_0x00bc:
        r7 = r7.getName();
        r6 = r6.get(r7);
        r6 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d.b) r6;
        if (r6 == 0) goto L_0x00cd;
    L_0x00c8:
        r6 = r6.OL();
        goto L_0x00ce;
    L_0x00cd:
        r6 = r4;
    L_0x00ce:
        if (r6 == 0) goto L_0x00f5;
    L_0x00d0:
        r7 = r0.f(r6);
        if (r7 != 0) goto L_0x00f5;
    L_0x00d6:
        r8 = r6.doubleValue();
        r10 = 0;
        r11 = 0;
        r12 = 1;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r2 = java.util.Locale.US;
        r7 = "Locale.US";
        kotlin.jvm.internal.i.e(r2, r7);
        r18 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r19 = 0;
        r17 = r2;
        r2 = com.iqoption.core.util.e.a(r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x00f5;
    L_0x00f4:
        r6 = r8;
    L_0x00f5:
        if (r2 == 0) goto L_0x00f8;
    L_0x00f7:
        goto L_0x00fa;
    L_0x00f8:
        r2 = "";
    L_0x00fa:
        r0.cFG = r2;
        r2 = (java.lang.CharSequence) r2;
        r1.setText(r2);
        r1 = r2.length();
        r2 = 0;
        if (r1 != 0) goto L_0x010a;
    L_0x0108:
        r1 = 1;
        goto L_0x010b;
    L_0x010a:
        r1 = 0;
    L_0x010b:
        if (r1 == 0) goto L_0x0155;
    L_0x010d:
        r1 = r0.cxs;
        r7 = r1 instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d;
        if (r7 != 0) goto L_0x0114;
    L_0x0113:
        r1 = r4;
    L_0x0114:
        r1 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) r1;
        if (r1 == 0) goto L_0x011e;
    L_0x0118:
        r1 = r1.aaE();
        if (r1 == r3) goto L_0x0155;
    L_0x011e:
        if (r6 == 0) goto L_0x0122;
    L_0x0120:
        r1 = r6;
        goto L_0x0138;
    L_0x0122:
        if (r5 == 0) goto L_0x0137;
    L_0x0124:
        r5 = (java.util.List) r5;
        r1 = kotlin.collections.u.bV(r5);
        r1 = (com.iqoption.core.microservices.billing.response.deposit.e) r1;
        if (r1 == 0) goto L_0x0137;
    L_0x012e:
        r5 = r1.ZC();
        r1 = java.lang.Double.valueOf(r5);
        goto L_0x0138;
    L_0x0137:
        r1 = r4;
    L_0x0138:
        if (r1 == 0) goto L_0x013b;
    L_0x013a:
        goto L_0x0141;
    L_0x013b:
        r5 = 0;
        r1 = java.lang.Double.valueOf(r5);
    L_0x0141:
        r1 = r0.f(r1);
        if (r1 == 0) goto L_0x014b;
    L_0x0147:
        r4 = r1.getErrorMessage();
    L_0x014b:
        if (r1 == 0) goto L_0x0151;
    L_0x014d:
        r2 = r1.aso();
    L_0x0151:
        r0.u(r4, r2);
        goto L_0x0158;
    L_0x0155:
        r0.u(r4, r2);
    L_0x0158:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.light.perform.c.d(com.iqoption.core.microservices.billing.response.deposit.d):void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        com.iqoption.core.microservices.billing.response.deposit.d dVar = this.cFE;
        if (dVar != null) {
            bundle.putParcelable("STATE_CURRENCY", dVar);
        }
        com.iqoption.deposit.i iVar = this.cFK;
        if (iVar != null) {
            bundle.putParcelable("STATE_DEPOSIT_PARAMS", iVar);
        }
        super.onSaveInstanceState(bundle);
    }

    private final void asA() {
        RecyclerView recyclerView = asp().cCr;
        kotlin.jvm.internal.i.e(recyclerView, "binding.depositPresetsList");
        recyclerView.setItemAnimator((ItemAnimator) null);
        recyclerView.setLayoutManager(new LinearLayoutManager(com.iqoption.core.ext.a.q(this), 0, false));
        com.iqoption.core.ui.a.a(recyclerView, getResources().getDimension(com.iqoption.deposit.o.c.dp8), false);
        a(new com.iqoption.deposit.light.d.d(this));
        recyclerView.setAdapter(asr());
        asB();
    }

    /* JADX WARNING: Missing block: B:8:0x0028, code skipped:
            if (r2 != 0) goto L_0x002b;
     */
    private final void asB() {
        /*
        r6 = this;
        r0 = r6.cxs;
        r1 = r6.asp();
        r1 = r1.cCg;
        r2 = "binding.depositAmountEdit";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = r0 instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d;
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x002b;
    L_0x0013:
        r2 = r0;
        r2 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) r2;
        r2 = r2.aaH();
        if (r2 == 0) goto L_0x0027;
    L_0x001c:
        r2 = r2.aaT();
        if (r2 == 0) goto L_0x0027;
    L_0x0022:
        r2 = r2.size();
        goto L_0x0028;
    L_0x0027:
        r2 = 0;
    L_0x0028:
        if (r2 != 0) goto L_0x002b;
    L_0x002a:
        goto L_0x0040;
    L_0x002b:
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r2 = r0.ZL();
        goto L_0x0033;
    L_0x0032:
        r2 = 0;
    L_0x0033:
        r5 = com.iqoption.core.microservices.billing.response.deposit.cashboxitem.CashboxItemType.USER_CARD;
        if (r2 != r5) goto L_0x0038;
    L_0x0037:
        goto L_0x0040;
    L_0x0038:
        r2 = r6.aoJ();
        if (r2 == 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0040;
    L_0x003f:
        r4 = 0;
    L_0x0040:
        r2 = "binding.depositPresetsList";
        if (r4 == 0) goto L_0x0053;
    L_0x0044:
        r0 = r6.asp();
        r0 = r0.cCr;
        kotlin.jvm.internal.i.e(r0, r2);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.ak(r0);
        goto L_0x006b;
    L_0x0053:
        r3 = r6.asp();
        r3 = r3.cCr;
        kotlin.jvm.internal.i.e(r3, r2);
        r3 = (android.view.View) r3;
        com.iqoption.core.ext.a.al(r3);
        r2 = new com.iqoption.deposit.light.perform.c$s;
        r2.<init>(r6, r0);
        r2 = (android.view.View.OnFocusChangeListener) r2;
        r1.setOnFocusChangeListener(r2);
    L_0x006b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.light.perform.c.asB():void");
    }

    private final void cQ(boolean z) {
        RecyclerView recyclerView = asp().cCr;
        kotlin.jvm.internal.i.e(recyclerView, "binding.depositPresetsList");
        if (z) {
            com.iqoption.core.ext.a.ak(recyclerView);
        } else {
            com.iqoption.core.ext.a.al(recyclerView);
        }
    }

    public void a(com.iqoption.deposit.light.d.b bVar) {
        kotlin.jvm.internal.i.f(bVar, "item");
        e eVar = this.cFB;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        eVar.b(bVar.asL());
        JsonObject o = com.iqoption.deposit.d.a.cGB.o(this.cxs);
        o.add("is_vip", new JsonPrimitive(Boolean.valueOf(kotlin.jvm.internal.i.y(bVar.asL().aaw(), "vip"))));
        com.iqoption.core.d.Um().EC().a("deposit-page_preset-picked", bVar.asL().ZC(), o);
    }

    private final void asC() {
        asu();
        if (aoJ()) {
            KycVerificationContext kycVerificationContext;
            com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar = this.cxs;
            if (!(aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d)) {
                aVar = null;
            }
            com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d dVar = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) aVar;
            if (dVar == null || !dVar.aaE()) {
                kycVerificationContext = KycVerificationContext.BILLING_DEPOSIT;
            } else {
                kycVerificationContext = KycVerificationContext.BILLING_DEPOSIT_AML;
            }
            com.iqoption.deposit.navigator.b.cGp.a(this, true, kycVerificationContext);
            return;
        }
        Fragment findFragmentById = com.iqoption.core.ext.a.u(this).findFragmentById(com.iqoption.deposit.o.e.depositFields);
        if (!(findFragmentById instanceof com.iqoption.deposit.n)) {
            findFragmentById = null;
        }
        com.iqoption.deposit.n nVar = (com.iqoption.deposit.n) findFragmentById;
        a a = a(this, null, 1, null);
        Object obj = a == null ? 1 : null;
        com.iqoption.billing.e eVar = this.ayL;
        com.iqoption.core.microservices.billing.response.a Kl = eVar != null ? eVar.Kl() : null;
        boolean asE = asE();
        if (nVar != null && ((asE || nVar.validate()) && obj != null && Kl != null)) {
            BigDecimal bigDecimal = (BigDecimal) null;
            Boolean bool = (Boolean) null;
            if (asD()) {
                EditText editText = asp().cCf;
                kotlin.jvm.internal.i.e(editText, "binding.depositAmountConvertedEdit");
                Double f = f(editText);
                bigDecimal = f != null ? new BigDecimal(f.doubleValue()) : null;
                bool = Boolean.valueOf(kotlin.jvm.internal.i.y(this.cFI, asp().cCf));
            }
            BigDecimal bigDecimal2 = bigDecimal;
            Boolean bool2 = bool;
            com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c aoS = nVar.aoS();
            String Zx = Kl.Zx();
            Double a2 = a(this, null, 1, null);
            if (a2 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            BigDecimal bigDecimal3 = new BigDecimal(a2.doubleValue());
            com.iqoption.core.microservices.billing.response.deposit.d dVar2 = this.cFE;
            if (dVar2 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            com.iqoption.deposit.i iVar = new com.iqoption.deposit.i(Zx, aoS, bigDecimal3, dVar2, bigDecimal2, bool2, null, 64, null);
            if (asE) {
                this.cFK = iVar;
                com.iqoption.billing.wallet.a aVar2 = com.iqoption.billing.wallet.a.azB;
                Activity r = com.iqoption.core.ext.a.r(this);
                Double a3 = a(this, null, 1, null);
                if (a3 == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                BigDecimal bigDecimal4 = new BigDecimal(a3.doubleValue());
                com.iqoption.core.microservices.billing.response.deposit.d dVar3 = this.cFE;
                if (dVar3 == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                aVar2.a(r, bigDecimal4, dVar3.getName());
            } else if (!nVar.a(iVar)) {
                e eVar2 = this.cFB;
                if (eVar2 == null) {
                    kotlin.jvm.internal.i.lG("viewModel");
                }
                eVar2.a(iVar, nVar.aoR());
            }
        } else if (obj == null) {
            if (a == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            u(a.getErrorMessage(), a.aso());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0100  */
    private final com.iqoption.deposit.light.perform.a f(java.lang.Double r21) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r0.cFE;
        r2 = 0;
        if (r1 == 0) goto L_0x01d2;
    L_0x0007:
        r3 = r0.ayL;
        if (r3 == 0) goto L_0x01d0;
    L_0x000b:
        r3 = r3.Km();
        if (r3 == 0) goto L_0x01d0;
    L_0x0011:
        r4 = r2;
        r4 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d.b) r4;
        r5 = r0.cxs;
        r6 = r5 instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d;
        if (r6 == 0) goto L_0x002e;
    L_0x001a:
        r5 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) r5;
        r4 = r5.aaI();
        if (r4 == 0) goto L_0x002d;
    L_0x0022:
        r5 = r1.getName();
        r4 = r4.get(r5);
        r4 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d.b) r4;
        goto L_0x002e;
    L_0x002d:
        r4 = r2;
    L_0x002e:
        if (r4 == 0) goto L_0x003b;
    L_0x0030:
        r7 = r4.OL();
        if (r7 == 0) goto L_0x003b;
    L_0x0036:
        r7 = r7.doubleValue();
        goto L_0x003d;
    L_0x003b:
        r7 = 0;
    L_0x003d:
        if (r4 == 0) goto L_0x004a;
    L_0x003f:
        r4 = r4.OM();
        if (r4 == 0) goto L_0x004a;
    L_0x0045:
        r9 = r4.doubleValue();
        goto L_0x004c;
    L_0x004a:
        r9 = 0;
    L_0x004c:
        r11 = r3.aas();
        r4 = 0;
        r13 = (double) r4;
        r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r15 >= 0) goto L_0x005a;
    L_0x0056:
        r11 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        goto L_0x00ec;
    L_0x005a:
        r11 = r3.aan();
        if (r11 == 0) goto L_0x0066;
    L_0x0060:
        r11 = r3.aas();
        goto L_0x00ec;
    L_0x0066:
        r11 = r0.ayL;
        if (r11 == 0) goto L_0x00a7;
    L_0x006a:
        r11 = r11.Kn();
        if (r11 == 0) goto L_0x00a7;
    L_0x0070:
        r11 = (java.lang.Iterable) r11;
        r11 = r11.iterator();
    L_0x0076:
        r12 = r11.hasNext();
        if (r12 == 0) goto L_0x009d;
    L_0x007c:
        r12 = r11.next();
        r17 = r12;
        r17 = (com.iqoption.core.microservices.configuration.a.d) r17;
        r15 = r17.getName();
        r16 = r3.aaq();
        if (r16 == 0) goto L_0x0094;
    L_0x008e:
        r16 = r16.getName();
        r2 = r16;
    L_0x0094:
        r2 = kotlin.jvm.internal.i.y(r15, r2);
        if (r2 == 0) goto L_0x009b;
    L_0x009a:
        goto L_0x009e;
    L_0x009b:
        r2 = 0;
        goto L_0x0076;
    L_0x009d:
        r12 = 0;
    L_0x009e:
        r12 = (com.iqoption.core.microservices.configuration.a.d) r12;
        if (r12 == 0) goto L_0x00a7;
    L_0x00a2:
        r11 = r12.getRate();
        goto L_0x00a9;
    L_0x00a7:
        r11 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x00a9:
        r2 = r0.ayL;
        if (r2 == 0) goto L_0x00e2;
    L_0x00ad:
        r2 = r2.Kn();
        if (r2 == 0) goto L_0x00e2;
    L_0x00b3:
        r2 = (java.lang.Iterable) r2;
        r2 = r2.iterator();
    L_0x00b9:
        r15 = r2.hasNext();
        if (r15 == 0) goto L_0x00d6;
    L_0x00bf:
        r15 = r2.next();
        r17 = r15;
        r17 = (com.iqoption.core.microservices.configuration.a.d) r17;
        r5 = r17.getName();
        r6 = r1.getName();
        r5 = kotlin.jvm.internal.i.y(r5, r6);
        if (r5 == 0) goto L_0x00b9;
    L_0x00d5:
        goto L_0x00d7;
    L_0x00d6:
        r15 = 0;
    L_0x00d7:
        r15 = (com.iqoption.core.microservices.configuration.a.d) r15;
        if (r15 == 0) goto L_0x00e2;
    L_0x00db:
        r5 = r15.getRate();
        r18 = r5;
        goto L_0x00e4;
    L_0x00e2:
        r18 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x00e4:
        r5 = r3.aas();
        r5 = r5 * r11;
        r11 = r5 / r18;
    L_0x00ec:
        if (r21 != 0) goto L_0x0100;
    L_0x00ee:
        r2 = new com.iqoption.deposit.light.perform.a;
        r1 = com.iqoption.deposit.o.g.incorrect_value;
        r1 = r0.getString(r1);
        r3 = "getString(R.string.incorrect_value)";
        kotlin.jvm.internal.i.e(r1, r3);
        r2.<init>(r1, r4);
        goto L_0x01cf;
    L_0x0100:
        r2 = -1;
        r5 = (double) r2;
        r2 = 1;
        r15 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
        if (r15 <= 0) goto L_0x0140;
    L_0x0107:
        r5 = r3.aat();
        r17 = r21.doubleValue();
        r5 = r5 + r17;
        r15 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1));
        if (r15 < 0) goto L_0x0140;
    L_0x0115:
        r5 = r3.aat();
        r11 = r11 - r5;
        r3 = new java.math.BigDecimal;
        r5 = 0;
        r5 = java.lang.Math.max(r5, r11);
        r3.<init>(r5);
        r5 = com.iqoption.deposit.o.g.remaining_deposit_amount_n1;
        r6 = new java.lang.Object[r2];
        r1 = com.iqoption.core.util.e.a(r3, r1, r2);
        r6[r4] = r1;
        r1 = r0.getString(r5, r6);
        r3 = "getString(R.string.remai…atAmount(currency, true))";
        kotlin.jvm.internal.i.e(r1, r3);
        r3 = new com.iqoption.deposit.light.perform.a;
        r3.<init>(r1, r2);
        r2 = r3;
        goto L_0x01cf;
    L_0x0140:
        r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1));
        if (r3 <= 0) goto L_0x014c;
    L_0x0144:
        r5 = r21.doubleValue();
        r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r3 < 0) goto L_0x0158;
    L_0x014c:
        r5 = r21.doubleValue();
        r11 = r1.aau();
        r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1));
        if (r3 >= 0) goto L_0x0187;
    L_0x0158:
        r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1));
        if (r3 <= 0) goto L_0x0165;
    L_0x015c:
        r5 = r1.aau();
        r5 = java.lang.Math.max(r7, r5);
        goto L_0x0169;
    L_0x0165:
        r5 = r1.aau();
    L_0x0169:
        r3 = new java.math.BigDecimal;
        r3.<init>(r5);
        r5 = com.iqoption.deposit.o.g.deposit_limit_n1;
        r6 = new java.lang.Object[r2];
        r1 = com.iqoption.core.util.e.a(r3, r1, r2);
        r6[r4] = r1;
        r1 = r0.getString(r5, r6);
        r2 = "getString(R.string.depos…atAmount(currency, true))";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = new com.iqoption.deposit.light.perform.a;
        r2.<init>(r1, r4);
        goto L_0x01cf;
    L_0x0187:
        r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1));
        if (r3 <= 0) goto L_0x0193;
    L_0x018b:
        r5 = r21.doubleValue();
        r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r3 > 0) goto L_0x019f;
    L_0x0193:
        r5 = r21.doubleValue();
        r7 = r1.aav();
        r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r3 <= 0) goto L_0x01ce;
    L_0x019f:
        r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1));
        if (r3 <= 0) goto L_0x01ac;
    L_0x01a3:
        r5 = r1.aav();
        r5 = java.lang.Math.min(r9, r5);
        goto L_0x01b0;
    L_0x01ac:
        r5 = r1.aav();
    L_0x01b0:
        r3 = new java.math.BigDecimal;
        r3.<init>(r5);
        r5 = com.iqoption.deposit.o.g.up_to_n1;
        r6 = new java.lang.Object[r2];
        r1 = com.iqoption.core.util.e.a(r3, r1, r2);
        r6[r4] = r1;
        r1 = r0.getString(r5, r6);
        r2 = "getString(R.string.up_to…atAmount(currency, true))";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = new com.iqoption.deposit.light.perform.a;
        r2.<init>(r1, r4);
        goto L_0x01cf;
    L_0x01ce:
        r2 = 0;
    L_0x01cf:
        return r2;
    L_0x01d0:
        r1 = r2;
        return r1;
    L_0x01d2:
        r1 = r2;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.light.perform.c.f(java.lang.Double):com.iqoption.deposit.light.perform.a");
    }

    private final void b(com.iqoption.billing.e eVar) {
        this.ayL = eVar;
        asv();
        asI();
        com.iqoption.core.microservices.billing.response.deposit.b Km = eVar.Km();
        ArrayList XA = Km.XA();
        com.iqoption.core.microservices.billing.response.deposit.d dVar = this.cFE;
        if (dVar == null) {
            dVar = Km.aaq();
        }
        Object obj = null;
        if (dVar == null) {
            dVar = XA != null ? (com.iqoption.core.microservices.billing.response.deposit.d) u.bV(XA) : null;
        }
        HashMap aar = Km.aar();
        if (aar != null) {
            Map map = aar;
            if (dVar != null) {
                obj = dVar.getName();
            }
            obj = (ArrayList) map.get(obj);
        }
        if (!(obj == null || dVar == null)) {
            e eVar2 = this.cFB;
            if (eVar2 == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            eVar2.a(dVar);
        }
        this.cFE = dVar;
        asF();
        String str = "binding.depositTerms";
        if (((XA != null ? XA.size() : 0) > 1 ? 1 : null) == null || !com.iqoption.core.d.EA().Er()) {
            TextView textView = asp().cCt;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.al(textView);
            return;
        }
        int i;
        TextView textView2 = asp().cCt;
        kotlin.jvm.internal.i.e(textView2, str);
        com.iqoption.core.ext.a.ak(textView2);
        str = getString(com.iqoption.deposit.o.g.terms_and_conditions);
        kotlin.jvm.internal.i.e(str, "getString(R.string.terms_and_conditions)");
        com.iqoption.core.util.b.a aVar = new com.iqoption.core.util.b.a(str, com.iqoption.core.util.b.f.bn(com.iqoption.core.ext.a.q(this)));
        if (asD()) {
            i = com.iqoption.deposit.o.g.next;
        } else {
            i = com.iqoption.deposit.o.g.deposit1;
        }
        str = getString(com.iqoption.deposit.o.g.by_clicking_n1_you_confirm_n2, getString(i), aVar.getText());
        kotlin.jvm.internal.i.e(str, "getString(R.string.by_cl…meResId), termsLink.text)");
        com.iqoption.core.util.b.d.a(new com.iqoption.core.util.b.e(new com.iqoption.core.util.b.a[]{aVar}, textView2, str, com.iqoption.deposit.o.b.green, com.iqoption.deposit.o.b.green_60, false, null, 96, null));
    }

    private final void arc() {
        this.cFJ = true;
        FrameLayout frameLayout = asq().cDo;
        kotlin.jvm.internal.i.e(frameLayout, "buttonBinding.depositBottomButton");
        frameLayout.setEnabled(false);
        TextView textView = asq().cDq;
        kotlin.jvm.internal.i.e(textView, "buttonBinding.depositBottomButtonText");
        com.iqoption.core.ext.a.hide(textView);
        ContentLoadingProgressBar contentLoadingProgressBar = asq().cDp;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "buttonBinding.depositBottomButtonProgress");
        contentLoadingProgressBar.setVisibility(0);
    }

    private final void ard() {
        this.cFJ = false;
        FrameLayout frameLayout = asq().cDo;
        kotlin.jvm.internal.i.e(frameLayout, "buttonBinding.depositBottomButton");
        frameLayout.setEnabled(true);
        TextView textView = asq().cDq;
        kotlin.jvm.internal.i.e(textView, "buttonBinding.depositBottomButtonText");
        com.iqoption.core.ext.a.ak(textView);
        ContentLoadingProgressBar contentLoadingProgressBar = asq().cDp;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "buttonBinding.depositBottomButtonProgress");
        contentLoadingProgressBar.setVisibility(4);
    }

    /* JADX WARNING: Missing block: B:3:0x0011, code skipped:
            if (r0 != null) goto L_0x0021;
     */
    @android.annotation.SuppressLint({"SetTextI18n"})
    private final void n(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a r10) {
        /*
        r9 = this;
        r9.cxs = r10;
        if (r10 == 0) goto L_0x0014;
    L_0x0004:
        r1 = com.iqoption.core.ext.a.q(r9);
        r2 = 1;
        r3 = 0;
        r4 = 4;
        r5 = 0;
        r0 = r10;
        r0 = com.iqoption.deposit.c.b.c.a(r0, r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x0014;
    L_0x0013:
        goto L_0x0021;
    L_0x0014:
        r0 = com.iqoption.deposit.o.g.deposit1;
        r0 = r9.getString(r0);
        r1 = "getString(R.string.deposit1)";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = (java.lang.CharSequence) r0;
    L_0x0021:
        r1 = r9.asp();
        r1 = r1.cCv;
        r1 = r1.cDG;
        r2 = "binding.toolbarTitleLayo….depositPerformLightTitle";
        kotlin.jvm.internal.i.e(r1, r2);
        r1.setText(r0);
        r0 = com.iqoption.deposit.light.c.a.cEV;
        r0 = r0.aqV();
        r1 = com.iqoption.core.ext.a.u(r9);
        r2 = r0.getName();
        r2 = r1.findFragmentByTag(r2);
        r2 = (com.iqoption.deposit.light.c.a) r2;
        r3 = r10 instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b;
        r4 = "binding.depositButtonBinding.root";
        r5 = "binding.depositButtonBinding";
        r6 = "binding.depositPerformLightScroll";
        r7 = "binding.depositPerformHoldContainer";
        if (r3 == 0) goto L_0x00bd;
    L_0x0051:
        r3 = r9.asp();
        r3 = r3.cCv;
        r3 = r3.cDH;
        r8 = "binding.toolbarTitleLayout.depositToolbarSecure";
        kotlin.jvm.internal.i.e(r3, r8);
        r3 = (android.view.View) r3;
        com.iqoption.core.ext.a.ak(r3);
        r3 = r9.asp();
        r3 = r3.cCp;
        kotlin.jvm.internal.i.e(r3, r7);
        r3 = (android.view.View) r3;
        com.iqoption.core.ext.a.ak(r3);
        r3 = r9.asp();
        r3 = r3.cCq;
        kotlin.jvm.internal.i.e(r3, r6);
        r3 = (android.view.View) r3;
        com.iqoption.core.ext.a.al(r3);
        r3 = r9.asp();
        r3 = r3.cCj;
        kotlin.jvm.internal.i.e(r3, r5);
        r3 = r3.getRoot();
        kotlin.jvm.internal.i.e(r3, r4);
        com.iqoption.core.ext.a.al(r3);
        if (r2 != 0) goto L_0x0147;
    L_0x0094:
        r2 = com.iqoption.core.ext.a.q(r9);
        r2 = r0.bh(r2);
        if (r2 == 0) goto L_0x00b5;
    L_0x009e:
        r2 = (com.iqoption.deposit.light.c.a) r2;
        r1 = r1.beginTransaction();
        r3 = com.iqoption.deposit.o.e.depositPerformHoldContainer;
        r2 = (androidx.fragment.app.Fragment) r2;
        r0 = r0.getName();
        r0 = r1.add(r3, r2, r0);
        r0.commitAllowingStateLoss();
        goto L_0x0147;
    L_0x00b5:
        r10 = new kotlin.TypeCastException;
        r0 = "null cannot be cast to non-null type com.iqoption.deposit.light.hold.DepositHoldLightFragment";
        r10.<init>(r0);
        throw r10;
    L_0x00bd:
        r0 = r9.asp();
        r0 = r0.cCp;
        kotlin.jvm.internal.i.e(r0, r7);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.al(r0);
        r0 = r9.asp();
        r0 = r0.cCq;
        kotlin.jvm.internal.i.e(r0, r6);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.ak(r0);
        r0 = r9.asp();
        r0 = r0.cCj;
        kotlin.jvm.internal.i.e(r0, r5);
        r0 = r0.getRoot();
        kotlin.jvm.internal.i.e(r0, r4);
        com.iqoption.core.ext.a.ak(r0);
        if (r2 == 0) goto L_0x00fb;
    L_0x00ee:
        r0 = r1.beginTransaction();
        r2 = (androidx.fragment.app.Fragment) r2;
        r0 = r0.remove(r2);
        r0.commitAllowingStateLoss();
    L_0x00fb:
        r9.asv();
        if (r10 == 0) goto L_0x0135;
    L_0x0100:
        r0 = com.iqoption.core.microservices.billing.response.deposit.c.e(r10);
        if (r0 == 0) goto L_0x010d;
    L_0x0106:
        r0 = com.iqoption.deposit.crypto.a.b.czV;
        r0 = r0.aqV();
        goto L_0x0125;
    L_0x010d:
        r0 = r10 instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.e;
        if (r0 != 0) goto L_0x011f;
    L_0x0111:
        r0 = com.iqoption.core.microservices.billing.response.deposit.c.b(r10);
        if (r0 == 0) goto L_0x0118;
    L_0x0117:
        goto L_0x011f;
    L_0x0118:
        r0 = com.iqoption.deposit.light.constructor.a.cEF;
        r0 = r0.apA();
        goto L_0x0125;
    L_0x011f:
        r0 = com.iqoption.deposit.light.a.a.cEA;
        r0 = r0.apA();
    L_0x0125:
        r1 = r9.alD();
        r1.a(r0);
        r0 = r9.asp();
        r0 = r0.cCw;
        r0.requestFocus();
    L_0x0135:
        r9.asI();
        r9.asB();
        r9.asx();
        r9.asF();
        r9.asG();
        r9.asH();
    L_0x0147:
        r0 = new kotlin.jvm.internal.Ref$ObjectRef;
        r0.<init>();
        r1 = 0;
        r1 = (java.lang.Long) r1;
        r0.element = r1;
        r1 = r10 instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c;
        if (r1 == 0) goto L_0x016b;
    L_0x0155:
        r10 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c) r10;
        r1 = r10.aaD();
        r10 = r9.ast();
        r10 = kotlin.collections.i.a(r10, r1);
        if (r10 == 0) goto L_0x016b;
    L_0x0165:
        r10 = java.lang.Long.valueOf(r1);
        r0.element = r10;
    L_0x016b:
        r10 = r0.element;
        r10 = (java.lang.Long) r10;
        r1 = "binding.depositInfoHint";
        if (r10 == 0) goto L_0x01bc;
    L_0x0173:
        r10 = r9.asp();
        r10 = r10.cCl;
        kotlin.jvm.internal.i.e(r10, r1);
        r10 = (android.view.View) r10;
        com.iqoption.core.ext.a.ak(r10);
        r10 = r9.asp();
        r10 = r10.cCv;
        r10 = r10.cDI;
        if (r10 == 0) goto L_0x0190;
    L_0x018b:
        r10 = (android.view.View) r10;
        com.iqoption.core.ext.a.ak(r10);
    L_0x0190:
        r10 = r9.asp();
        r10 = r10.cCl;
        kotlin.jvm.internal.i.e(r10, r1);
        r10 = (android.view.View) r10;
        r1 = new com.iqoption.deposit.light.perform.c$h;
        r1.<init>(r9, r0);
        r1 = (android.view.View.OnClickListener) r1;
        r10.setOnClickListener(r1);
        r10 = r9.asp();
        r10 = r10.cCv;
        r10 = r10.cDI;
        if (r10 == 0) goto L_0x01d9;
    L_0x01af:
        r10 = (android.view.View) r10;
        r1 = new com.iqoption.deposit.light.perform.c$i;
        r1.<init>(r9, r0);
        r1 = (android.view.View.OnClickListener) r1;
        r10.setOnClickListener(r1);
        goto L_0x01d9;
    L_0x01bc:
        r10 = r9.asp();
        r10 = r10.cCl;
        kotlin.jvm.internal.i.e(r10, r1);
        r10 = (android.view.View) r10;
        com.iqoption.core.ext.a.al(r10);
        r10 = r9.asp();
        r10 = r10.cCv;
        r10 = r10.cDI;
        if (r10 == 0) goto L_0x01d9;
    L_0x01d4:
        r10 = (android.view.View) r10;
        com.iqoption.core.ext.a.al(r10);
    L_0x01d9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.light.perform.c.n(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a):void");
    }

    private final void bv(long j) {
        String Va = com.iqoption.core.d.EE().Va();
        StringBuilder stringBuilder = new StringBuilder();
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.i.e(locale, "Locale.getDefault()");
        stringBuilder.append(locale.getLanguage());
        stringBuilder.append("/deposit-instructions/");
        stringBuilder.append(j);
        stringBuilder.append("?platformId=");
        stringBuilder.append(com.iqoption.core.d.Un().Dx().getId());
        stringBuilder.append("&locale=");
        stringBuilder.append(com.iqoption.core.d.EA().getLocale());
        String ad = com.iqoption.core.data.config.b.ad(Va, stringBuilder.toString());
        Context context = getContext();
        if (context != null) {
            com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
            double d = (double) j;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("url", ad);
            EC.a("deposit_instructions_page-open", d, jsonObject);
            kotlin.jvm.internal.i.e(context, "it");
            com.iqoption.core.util.b.d.a(context, ad, Integer.valueOf(268435456), null, 8, null);
        }
    }

    private final boolean asD() {
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar = this.cxs;
        if (!(aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d)) {
            aVar = null;
        }
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d dVar = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) aVar;
        return dVar != null && com.iqoption.core.microservices.billing.response.deposit.c.e(dVar);
    }

    private final boolean asE() {
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar = this.cxs;
        if (!(aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d)) {
            aVar = null;
        }
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d dVar = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) aVar;
        return dVar != null && com.iqoption.core.microservices.billing.response.deposit.c.f(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    private final void asF() {
        /*
        r5 = this;
        r0 = r5.ayL;
        r1 = 0;
        if (r0 == 0) goto L_0x0016;
    L_0x0005:
        r0 = r0.Km();
        if (r0 == 0) goto L_0x0016;
    L_0x000b:
        r0 = r0.XA();
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r0 = r0.size();
        goto L_0x0017;
    L_0x0016:
        r0 = 0;
    L_0x0017:
        r2 = 1;
        if (r0 <= r2) goto L_0x001b;
    L_0x001a:
        r1 = 1;
    L_0x001b:
        r0 = "binding.currencySelector.selectCurrencyIcon";
        r2 = 0;
        r3 = "binding.currencySelector.root";
        r4 = "binding.currencySelector";
        if (r1 == 0) goto L_0x007b;
    L_0x0024:
        r1 = r5.asp();
        r1 = r1.cCa;
        kotlin.jvm.internal.i.e(r1, r4);
        r1 = r1.getRoot();
        kotlin.jvm.internal.i.e(r1, r3);
        com.iqoption.core.ext.a.ak(r1);
        r1 = r5.asp();
        r1 = r1.cCa;
        kotlin.jvm.internal.i.e(r1, r4);
        r1 = r1.getRoot();
        kotlin.jvm.internal.i.e(r1, r3);
        r3 = new com.iqoption.deposit.light.perform.c$r;
        r3.<init>(r5);
        r3 = (android.view.View.OnClickListener) r3;
        r1.setOnClickListener(r3);
        r1 = r5.asp();
        r1 = r1.cCa;
        r1 = r1.cDm;
        kotlin.jvm.internal.i.e(r1, r0);
        r1 = (android.view.View) r1;
        com.iqoption.core.ext.a.ak(r1);
        r0 = r5.asp();
        r0 = r0.cCa;
        kotlin.jvm.internal.i.e(r0, r4);
        r0 = r0.getRoot();
        r1 = new com.iqoption.core.ui.widget.h.a;
        r3 = 3;
        r4 = 0;
        r1.<init>(r4, r4, r3, r2);
        r1 = (android.view.View.OnTouchListener) r1;
        r0.setOnTouchListener(r1);
        goto L_0x00d8;
    L_0x007b:
        r1 = r5.asD();
        if (r1 == 0) goto L_0x00c5;
    L_0x0081:
        r1 = r5.asp();
        r1 = r1.cCa;
        kotlin.jvm.internal.i.e(r1, r4);
        r1 = r1.getRoot();
        kotlin.jvm.internal.i.e(r1, r3);
        com.iqoption.core.ext.a.ak(r1);
        r1 = r5.asp();
        r1 = r1.cCa;
        r1 = r1.cDm;
        kotlin.jvm.internal.i.e(r1, r0);
        r1 = (android.view.View) r1;
        com.iqoption.core.ext.a.al(r1);
        r0 = r5.asp();
        r0 = r0.cCa;
        kotlin.jvm.internal.i.e(r0, r4);
        r0 = r0.getRoot();
        r0.setOnClickListener(r2);
        r0 = r5.asp();
        r0 = r0.cCa;
        kotlin.jvm.internal.i.e(r0, r4);
        r0 = r0.getRoot();
        r0.setOnTouchListener(r2);
        goto L_0x00d8;
    L_0x00c5:
        r0 = r5.asp();
        r0 = r0.cCa;
        kotlin.jvm.internal.i.e(r0, r4);
        r0 = r0.getRoot();
        kotlin.jvm.internal.i.e(r0, r3);
        com.iqoption.core.ext.a.al(r0);
    L_0x00d8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.light.perform.c.asF():void");
    }

    private final void asG() {
        String str = "binding.depositAmountConvertedDivider";
        String str2 = "binding.depositAmountConvertedContainer";
        LinearLayout linearLayout;
        View view;
        if (!asD() || this.cFH == null) {
            linearLayout = asp().cCc;
            kotlin.jvm.internal.i.e(linearLayout, str2);
            com.iqoption.core.ext.a.al(linearLayout);
            view = asp().cCe;
            kotlin.jvm.internal.i.e(view, str);
            com.iqoption.core.ext.a.al(view);
            asp().cCf.removeTextChangedListener(this.cFM);
            return;
        }
        linearLayout = asp().cCc;
        kotlin.jvm.internal.i.e(linearLayout, str2);
        com.iqoption.core.ext.a.ak(linearLayout);
        view = asp().cCe;
        kotlin.jvm.internal.i.e(view, str);
        com.iqoption.core.ext.a.ak(view);
        TextView textView = asp().cCd;
        kotlin.jvm.internal.i.e(textView, "binding.depositAmountConvertedCurrency");
        textView.setText(com.iqoption.deposit.k.cxn.aoN());
        asp().cCf.addTextChangedListener(this.cFM);
    }

    private final void asH() {
        String str = "binding.depositProtected.root";
        String str2 = "binding.depositProtected";
        bh bhVar;
        View root;
        if (asD() || asE()) {
            bhVar = asp().cCs;
            kotlin.jvm.internal.i.e(bhVar, str2);
            root = bhVar.getRoot();
            kotlin.jvm.internal.i.e(root, str);
            com.iqoption.core.ext.a.al(root);
            return;
        }
        bhVar = asp().cCs;
        kotlin.jvm.internal.i.e(bhVar, str2);
        root = bhVar.getRoot();
        kotlin.jvm.internal.i.e(root, str);
        com.iqoption.core.ext.a.ak(root);
    }

    private final void asI() {
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar = this.cxs;
        FrameLayout frameLayout = asq().cDo;
        kotlin.jvm.internal.i.e(frameLayout, "buttonBinding.depositBottomButton");
        boolean z = false;
        if (!(this.cFJ || this.ayL == null || aVar == null || asw() || (!aoJ() && (aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) && ((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) aVar).aaE()))) {
            z = true;
        }
        frameLayout.setEnabled(z);
    }

    private final Double f(EditText editText) {
        Editable text = editText.getText();
        kotlin.jvm.internal.i.e(text, "text");
        Double d = null;
        if ((((CharSequence) text).length() == 0 ? 1 : null) != null) {
            return null;
        }
        try {
            Double valueOf;
            BigDecimal bigDecimal = new BigDecimal(text.toString());
            if (bigDecimal.compareTo(BigDecimal.valueOf(kotlin.jvm.internal.g.eWa.bnF())) == -1) {
                valueOf = Double.valueOf(bigDecimal.doubleValue());
            } else {
                valueOf = Double.valueOf(kotlin.jvm.internal.g.eWa.bnF());
            }
            d = valueOf;
        } catch (NumberFormatException unused) {
        }
        return d;
    }

    static /* synthetic */ void a(c cVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        cVar.u(str, z);
    }

    private final void u(String str, boolean z) {
        if (str == null || !z) {
            TextView textView = asp().cCh;
            kotlin.jvm.internal.i.e(textView, "binding.depositAmountKycError");
            com.iqoption.core.ext.a.al(textView);
            EditText editText = asp().cCg;
            kotlin.jvm.internal.i.e(editText, "binding.depositAmountEdit");
            com.iqoption.deposit.light.b.b(editText, str);
        } else {
            hM(str);
        }
        asp().cCi.setTextColor(com.iqoption.core.ext.a.k(com.iqoption.core.ext.a.q(this), str != null ? com.iqoption.deposit.o.b.red : com.iqoption.deposit.o.b.deposit_dark_grey));
    }

    private final void hM(String str) {
        EditText editText = asp().cCg;
        kotlin.jvm.internal.i.e(editText, "binding.depositAmountEdit");
        com.iqoption.deposit.light.b.b(editText, null);
        TextView textView = asp().cCh;
        String str2 = "binding.depositAmountKycError";
        kotlin.jvm.internal.i.e(textView, str2);
        com.iqoption.core.ext.a.ak(textView);
        com.iqoption.deposit.h hVar = com.iqoption.deposit.h.cwJ;
        Fragment fragment = this;
        TextView textView2 = asp().cCh;
        kotlin.jvm.internal.i.e(textView2, str2);
        hVar.a(fragment, textView2, str, false);
        asp().cCg.setTextColor(com.iqoption.core.ext.a.k(com.iqoption.core.ext.a.q(this), com.iqoption.deposit.o.b.red));
        asp().cCg.requestFocus();
    }

    public int KW() {
        return com.iqoption.deposit.o.e.depositFields;
    }
}

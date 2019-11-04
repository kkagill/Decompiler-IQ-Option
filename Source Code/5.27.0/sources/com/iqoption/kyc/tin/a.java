package com.iqoption.kyc.tin;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.base.Optional;
import com.iqoption.core.a.n;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.kyc.b.ay;
import com.iqoption.kyc.u;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020$H\u0016J\b\u0010-\u001a\u00020\u001dH\u0016J\u001a\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u0007H\u0002J\b\u00102\u001a\u00020\u0007H\u0014J\b\u00103\u001a\u00020\u001dH\u0002J\b\u00104\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000¨\u00066"}, bng = {"Lcom/iqoption/kyc/tin/KycTinFragment;", "Lcom/iqoption/kyc/BaseKycStepFragment;", "Lcom/iqoption/core/ui/country/OnCountrySelectionListener;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycTinBinding;", "countriesLoaded", "", "countryBinding", "Lcom/iqoption/core/databinding/LayoutCountryFieldBinding;", "isContinuePressedAnalytics", "()Z", "screenName", "", "getScreenName", "()Ljava/lang/String;", "selectedCountry", "Lcom/iqoption/core/microservices/configuration/response/Country;", "stageName", "getStageName", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "getStep", "()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "step$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/kyc/tin/KycTinViewModel;", "loadCountries", "", "onCountriesLoaded", "myCountry", "onCountryResult", "country", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onStart", "onViewCreated", "view", "setSelectedCountry", "animate", "showBottomBar", "showCountriesFragment", "updateValidation", "Companion", "kyc_release"})
/* compiled from: KycTinFragment.kt */
public final class a extends com.iqoption.kyc.b implements com.iqoption.core.ui.country.i {
    private static final String TAG;
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{k.a(new PropertyReference1Impl(k.G(a.class), "step", "getStep()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;"))};
    public static final a dEu = new a();
    private HashMap apm;
    private com.iqoption.core.microservices.configuration.a.c bIj;
    private ay dEq;
    private n dEr;
    private boolean dEs;
    private b dEt;
    private final String dtM;
    private final String dtN;
    private final kotlin.d dwS = g.c(new KycTinFragment$step$2(this));
    private final boolean dxb;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, bng = {"Lcom/iqoption/kyc/tin/KycTinFragment$Companion;", "", "()V", "ARG_STEP", "", "STATE_COUNTRY", "TAG", "getTAG", "()Ljava/lang/String;", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "kyc_release"})
    /* compiled from: KycTinFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final com.iqoption.core.ui.d.c f(com.iqoption.core.microservices.kyc.response.step.c cVar) {
            com.iqoption.core.microservices.kyc.response.step.c cVar2 = cVar;
            kotlin.jvm.internal.i.f(cVar2, "step");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_STEP", cVar2);
            return new com.iqoption.core.ui.d.c(Bx(), a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnLayout$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c implements OnGlobalLayoutListener {
        final /* synthetic */ View bgH;
        final /* synthetic */ a this$0;

        public c(View view, a aVar) {
            this.bgH = view;
            this.this$0 = aVar;
        }

        public void onGlobalLayout() {
            this.bgH.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            a.a(this.this$0).dvX.requestFocus();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: KycTinFragment.kt */
    static final class f implements OnClickListener {
        final /* synthetic */ a this$0;

        f(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            this.this$0.aNh();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "focused", "", "onFocusChange"})
    /* compiled from: KycTinFragment.kt */
    static final class g implements OnFocusChangeListener {
        final /* synthetic */ a this$0;

        g(a aVar) {
            this.this$0 = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!this.this$0.isAdded() || !z) {
                return;
            }
            if (this.this$0.dEs) {
                this.this$0.aNi();
            } else {
                this.this$0.aNh();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: KycTinFragment.kt */
    static final class j implements Runnable {
        final /* synthetic */ a this$0;

        j(a aVar) {
            this.this$0 = aVar;
        }

        public final void run() {
            FrameLayout frameLayout = a.i(this.this$0).bfL;
            kotlin.jvm.internal.i.e(frameLayout, "countryBinding.countryContainer");
            com.iqoption.core.ext.a.hide(frameLayout);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycTinFragment.kt */
    static final class b<T> implements Observer<Optional<com.iqoption.core.microservices.configuration.a.c>> {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Optional<com.iqoption.core.microservices.configuration.a.c> optional) {
            com.iqoption.core.microservices.configuration.a.c cVar = optional != null ? (com.iqoption.core.microservices.configuration.a.c) optional.pN() : null;
            if (cVar != null) {
                this.this$0.h(cVar);
                return;
            }
            ContentLoadingProgressBar contentLoadingProgressBar = a.i(this.this$0).bfN;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, "countryBinding.countryProgress");
            com.iqoption.core.ext.a.al(contentLoadingProgressBar);
            ImageView imageView = a.i(this.this$0).bfM;
            kotlin.jvm.internal.i.e(imageView, "countryBinding.countryLocationError");
            com.iqoption.core.ext.a.ak(imageView);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public d(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            ContentLoadingProgressBar contentLoadingProgressBar = a.a(this.this$0).duX.dwD;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.nextButton.kycButtonProgress");
            contentLoadingProgressBar.setVisibility(0);
            b f = a.f(this.this$0);
            com.iqoption.core.microservices.configuration.a.c g = this.this$0.bIj;
            if (g == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            IQTextInputEditText iQTextInputEditText = a.a(this.this$0).dvX;
            kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycTinEdit");
            Editable text = iQTextInputEditText.getText();
            if (text == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(text, "binding.kycTinEdit.text!!");
            f.a(g, v.trim(text).toString());
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
            a.f(this.this$0).g(this.this$0.aKH().afH());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/kyc/tin/KycTinFragment$onViewCreated$5", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "kyc_release"})
    /* compiled from: KycTinFragment.kt */
    public static final class h extends ah {
        final /* synthetic */ a this$0;

        h(a aVar) {
            this.this$0 = aVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            this.this$0.aMY();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/google/common/base/Optional;", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycTinFragment.kt */
    static final class i<T> implements Observer<Optional<String>> {
        final /* synthetic */ a this$0;

        i(a aVar) {
            this.this$0 = aVar;
        }

        /* JADX WARNING: Missing block: B:3:0x001c, code skipped:
            if (r4 != null) goto L_0x002c;
     */
        /* renamed from: a */
        public final void onChanged(com.google.common.base.Optional<java.lang.String> r4) {
            /*
            r3 = this;
            r0 = r3.this$0;
            r0 = com.iqoption.kyc.tin.a.a(r0);
            r0 = r0.duX;
            r0 = r0.dwD;
            r1 = "binding.nextButton.kycButtonProgress";
            kotlin.jvm.internal.i.e(r0, r1);
            r0 = (android.view.View) r0;
            com.iqoption.core.ext.a.al(r0);
            if (r4 == 0) goto L_0x001f;
        L_0x0016:
            r4 = r4.pN();
            r4 = (java.lang.String) r4;
            if (r4 == 0) goto L_0x001f;
        L_0x001e:
            goto L_0x002c;
        L_0x001f:
            r4 = r3.this$0;
            r0 = com.iqoption.kyc.o.f.unknown_error_occurred;
            r4 = r4.getString(r0);
            r0 = "getString(R.string.unknown_error_occurred)";
            kotlin.jvm.internal.i.e(r4, r0);
        L_0x002c:
            r0 = 0;
            r1 = 2;
            r2 = 0;
            com.iqoption.core.d.a(r4, r0, r1, r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.tin.a$i.onChanged(com.google.common.base.Optional):void");
        }
    }

    private final com.iqoption.core.microservices.kyc.response.step.c aKH() {
        kotlin.d dVar = this.dwS;
        kotlin.reflect.j jVar = anY[0];
        return (com.iqoption.core.microservices.kyc.response.step.c) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean aIE() {
        return false;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public a() {
        String str = "tin";
        this.dtM = str;
        this.dtN = str;
        this.dxb = true;
    }

    public static final /* synthetic */ ay a(a aVar) {
        ay ayVar = aVar.dEq;
        if (ayVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return ayVar;
    }

    public static final /* synthetic */ n i(a aVar) {
        n nVar = aVar.dEr;
        if (nVar == null) {
            kotlin.jvm.internal.i.lG("countryBinding");
        }
        return nVar;
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
        this.dEt = b.dEx.aR(this);
        if (bundle != null) {
            this.bIj = (com.iqoption.core.microservices.configuration.a.c) bundle.getParcelable("STATE_COUNTRY");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dEq = (ay) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.kyc.o.e.fragment_kyc_tin, viewGroup, false, 4, null);
        ay ayVar = this.dEq;
        String str = "binding";
        if (ayVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        n nVar = ayVar.dvW;
        kotlin.jvm.internal.i.e(nVar, "binding.kycTinCountryField");
        this.dEr = nVar;
        ayVar = this.dEq;
        if (ayVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return ayVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        b bVar = this.dEt;
        String str = "viewModel";
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        String string = getString(com.iqoption.kyc.o.f.tin2);
        kotlin.jvm.internal.i.e(string, "getString(R.string.tin2)");
        bVar.setTitle(string);
        bVar = this.dEt;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar.b(aKH());
        ay ayVar = this.dEq;
        string = "binding";
        if (ayVar == null) {
            kotlin.jvm.internal.i.lG(string);
        }
        IQTextInputEditText iQTextInputEditText = ayVar.dvX;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycTinEdit");
        EditText editText = iQTextInputEditText;
        ay ayVar2 = this.dEq;
        if (ayVar2 == null) {
            kotlin.jvm.internal.i.lG(string);
        }
        TextInputLayout textInputLayout = ayVar2.dvY;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycTinInput");
        u.a(editText, textInputLayout);
        ayVar = this.dEq;
        if (ayVar == null) {
            kotlin.jvm.internal.i.lG(string);
        }
        TextInputLayout textInputLayout2 = ayVar.dvW.bfn;
        kotlin.jvm.internal.i.e(textInputLayout2, "binding.kycTinCountryField.countryInput");
        textInputLayout2.setHint(getString(com.iqoption.kyc.o.f.tax_residence));
        ayVar = this.dEq;
        if (ayVar == null) {
            kotlin.jvm.internal.i.lG(string);
        }
        EditText editText2 = ayVar.dvX;
        String aKn = aKn();
        String aKo = aKo();
        bVar = this.dEt;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        com.iqoption.kyc.a.c cVar = new com.iqoption.kyc.a.c(editText2, aKn, aKo, "Tin", 10, bVar.Er());
        view.getViewTreeObserver().addOnGlobalLayoutListener(new c(view, this));
        n nVar = this.dEr;
        String str2 = "countryBinding";
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        ImageView imageView = nVar.bfp;
        kotlin.jvm.internal.i.e(imageView, "countryBinding.countryLocationButton");
        com.iqoption.core.ext.a.al(imageView);
        nVar = this.dEr;
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        nVar.bfM.setOnClickListener(new f(this));
        nVar = this.dEr;
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        nVar.bfm.setOnFocusChangeListener(new g(this));
        aNh();
        Fragment findFragmentByTag = com.iqoption.kyc.navigator.a.dAF.ax(this).findFragmentByTag(com.iqoption.core.ui.country.d.bIl.Bx());
        if (findFragmentByTag != null) {
            if (findFragmentByTag != null) {
                ((com.iqoption.core.ui.country.d) findFragmentByTag).a((com.iqoption.core.ui.country.i) this);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.ui.country.CountrySearchFragment");
            }
        }
        ay ayVar3 = this.dEq;
        if (ayVar3 == null) {
            kotlin.jvm.internal.i.lG(string);
        }
        ayVar3.dvX.addTextChangedListener(new h(this));
        aMY();
        ayVar3 = this.dEq;
        if (ayVar3 == null) {
            kotlin.jvm.internal.i.lG(string);
        }
        FrameLayout frameLayout = ayVar3.duX.dwC;
        kotlin.jvm.internal.i.e(frameLayout, "binding.nextButton.kycButton");
        frameLayout.setOnClickListener(new d(this));
        b bVar2 = this.dEt;
        if (bVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar2.aNj().observe(this, new i(this));
        str2 = "binding.kycTinLater";
        TextView textView;
        if (aKH().afJ()) {
            ayVar3 = this.dEq;
            if (ayVar3 == null) {
                kotlin.jvm.internal.i.lG(string);
            }
            textView = ayVar3.dvZ;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.ak(textView);
            ayVar3 = this.dEq;
            if (ayVar3 == null) {
                kotlin.jvm.internal.i.lG(string);
            }
            textView = ayVar3.dvZ;
            kotlin.jvm.internal.i.e(textView, str2);
            textView.setOnClickListener(new e(this));
            return;
        }
        ayVar3 = this.dEq;
        if (ayVar3 == null) {
            kotlin.jvm.internal.i.lG(string);
        }
        textView = ayVar3.dvZ;
        kotlin.jvm.internal.i.e(textView, str2);
        com.iqoption.core.ext.a.al(textView);
    }

    /* JADX WARNING: Missing block: B:6:0x0024, code skipped:
            if ((kotlin.text.u.Y(java.lang.String.valueOf(r0.getText())) ^ 1) != 0) goto L_0x0028;
     */
    private final void aMY() {
        /*
        r4 = this;
        r0 = r4.bIj;
        r1 = 1;
        r2 = "binding";
        if (r0 == 0) goto L_0x0027;
    L_0x0007:
        r0 = r4.dEq;
        if (r0 != 0) goto L_0x000e;
    L_0x000b:
        kotlin.jvm.internal.i.lG(r2);
    L_0x000e:
        r0 = r0.dvX;
        r3 = "binding.kycTinEdit";
        kotlin.jvm.internal.i.e(r0, r3);
        r0 = r0.getText();
        r0 = java.lang.String.valueOf(r0);
        r0 = (java.lang.CharSequence) r0;
        r0 = kotlin.text.u.Y(r0);
        r0 = r0 ^ r1;
        if (r0 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0028;
    L_0x0027:
        r1 = 0;
    L_0x0028:
        r0 = r4.dEq;
        if (r0 != 0) goto L_0x002f;
    L_0x002c:
        kotlin.jvm.internal.i.lG(r2);
    L_0x002f:
        r0 = r0.duX;
        r0 = r0.dwC;
        r2 = "binding.nextButton.kycButton";
        kotlin.jvm.internal.i.e(r0, r2);
        r0.setEnabled(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.tin.a.aMY():void");
    }

    public void onStart() {
        super.onStart();
        ay ayVar = this.dEq;
        String str = "binding";
        if (ayVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ayVar.dvX.requestFocus();
        ayVar = this.dEq;
        if (ayVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = ayVar.dvX;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycTinEdit");
        com.iqoption.core.ext.a.d(iQTextInputEditText);
        Context context = getContext();
        ay ayVar2 = this.dEq;
        if (ayVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        v.b(context, ayVar2.dvX);
    }

    private final void aNh() {
        com.iqoption.core.microservices.configuration.a.c cVar = this.bIj;
        if (cVar != null) {
            h(cVar);
            return;
        }
        n nVar = this.dEr;
        String str = "countryBinding";
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = nVar.bfm;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "countryBinding.countryEdit");
        iQTextInputEditText.setEnabled(false);
        nVar = this.dEr;
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = nVar.bfN;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "countryBinding.countryProgress");
        contentLoadingProgressBar.setVisibility(0);
        nVar = this.dEr;
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = nVar.bfM;
        kotlin.jvm.internal.i.e(imageView, "countryBinding.countryLocationError");
        com.iqoption.core.ext.a.al(imageView);
        b bVar = this.dEt;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.aNk().observe(this, new b(this));
    }

    private final void h(com.iqoption.core.microservices.configuration.a.c cVar) {
        com.iqoption.core.microservices.configuration.a.c cVar2 = this.bIj;
        if (cVar2 != null) {
            cVar = cVar2;
        }
        a(cVar, true);
        this.dEs = true;
        n nVar = this.dEr;
        if (nVar == null) {
            kotlin.jvm.internal.i.lG("countryBinding");
        }
        IQTextInputEditText iQTextInputEditText = nVar.bfm;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "countryEdit");
        iQTextInputEditText.setEnabled(true);
        ContentLoadingProgressBar contentLoadingProgressBar = nVar.bfN;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "countryProgress");
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        ImageView imageView = nVar.bfM;
        kotlin.jvm.internal.i.e(imageView, "countryLocationError");
        com.iqoption.core.ext.a.al(imageView);
    }

    private final void aNi() {
        n nVar = this.dEr;
        String str = "countryBinding";
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextInputLayout textInputLayout = nVar.bfn;
        kotlin.jvm.internal.i.e(textInputLayout, "countryBinding.countryInput");
        Point ai = com.iqoption.core.ext.a.ai(textInputLayout);
        nVar = this.dEr;
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = nVar.bfm;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "countryBinding.countryEdit");
        com.iqoption.core.ui.d.c a = com.iqoption.core.ui.country.d.bIl.a(ai, String.valueOf(iQTextInputEditText.getText()), true, false, true, false);
        Fragment bh = a.bh(com.iqoption.core.ext.a.q(this));
        if (bh != null) {
            com.iqoption.core.ui.country.d dVar = (com.iqoption.core.ui.country.d) bh;
            dVar.a((com.iqoption.core.ui.country.i) this);
            com.iqoption.kyc.navigator.a.dAF.ax(this).beginTransaction().add(com.iqoption.kyc.navigator.a.dAF.aLI(), dVar, a.getName()).addToBackStack(a.getName()).commitAllowingStateLoss();
            View view = getView();
            view = view != null ? view.findFocus() : null;
            if (view != null) {
                view.clearFocus();
            }
            nVar = this.dEr;
            if (nVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            nVar.bfL.post(new j(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.ui.country.CountrySearchFragment");
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        com.iqoption.core.microservices.configuration.a.c cVar = this.bIj;
        if (cVar != null) {
            bundle.putParcelable("STATE_COUNTRY", cVar);
        }
        super.onSaveInstanceState(bundle);
    }

    public void f(com.iqoption.core.microservices.configuration.a.c cVar) {
        n nVar = this.dEr;
        String str = "countryBinding";
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = nVar.bfL;
        String str2 = "countryBinding.countryContainer";
        kotlin.jvm.internal.i.e(frameLayout, str2);
        if (com.iqoption.core.ext.a.ag(frameLayout)) {
            nVar = this.dEr;
            if (nVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            frameLayout = nVar.bfL;
            kotlin.jvm.internal.i.e(frameLayout, str2);
            com.iqoption.core.ext.a.ak(frameLayout);
        }
        if (cVar != null) {
            a(cVar, false);
        }
        aMY();
        v.j(getActivity());
    }

    private final void a(com.iqoption.core.microservices.configuration.a.c cVar, boolean z) {
        n nVar;
        TextInputLayout textInputLayout;
        this.bIj = cVar;
        String str = "countryBinding.countryInput";
        String str2 = "countryBinding";
        if (!z) {
            nVar = this.dEr;
            if (nVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textInputLayout = nVar.bfn;
            kotlin.jvm.internal.i.e(textInputLayout, str);
            textInputLayout.setHintAnimationEnabled(false);
        }
        nVar = this.dEr;
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        nVar.bfm.setText(cVar.getName());
        nVar = this.dEr;
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        textInputLayout = nVar.bfn;
        kotlin.jvm.internal.i.e(textInputLayout, str);
        textInputLayout.setHintAnimationEnabled(true);
        nVar = this.dEr;
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        IQTextInputEditText iQTextInputEditText = nVar.bfm;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "countryBinding.countryEdit");
        iQTextInputEditText.setTag(Long.valueOf(cVar.getId().longValue()));
    }

    public String aKn() {
        return this.dtM;
    }

    public String aKo() {
        return this.dtN;
    }

    public boolean aKp() {
        return this.dxb;
    }
}

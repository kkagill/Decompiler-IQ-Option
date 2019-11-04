package com.iqoption.kyc.questionnaire.warning;

import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.microservices.kyc.response.questionnaire.g;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.ah;
import com.iqoption.kyc.b.ak;
import com.iqoption.kyc.h;
import com.iqoption.kyc.o.f;
import com.iqoption.kyc.u;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.text.Regex;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010&\u001a\u00020\u0006H\u0014J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0006H\u0002J\b\u0010)\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, bng = {"Lcom/iqoption/kyc/questionnaire/warning/KycQuestionsWarningFragment;", "Lcom/iqoption/kyc/BaseKycStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycQuestionWarningBinding;", "isContinuePressedAnalytics", "", "()Z", "setContinuePressedAnalytics", "(Z)V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "viewModel", "Lcom/iqoption/kyc/questionnaire/warning/KycQuestionWarningViewModel;", "warning", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycRiskWarning;", "getWarning", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycRiskWarning;", "warning$delegate", "Lkotlin/Lazy;", "isSignatureValid", "value", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showBottomBar", "showProgress", "show", "updateButtonValidation", "Companion", "kyc_release"})
/* compiled from: KycQuestionsWarningFragment.kt */
public final class b extends com.iqoption.kyc.b {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "warning", "getWarning()Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycRiskWarning;"))};
    public static final a dDZ = new a();
    private HashMap apm;
    private final kotlin.d dDW = g.c(new KycQuestionsWarningFragment$warning$2(this));
    private a dDX;
    private ak dDY;
    private final String dtM = "TradingExperience";
    private final String dtN = "Warning";
    private boolean dxb;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/kyc/questionnaire/warning/KycQuestionsWarningFragment$Companion;", "", "()V", "ARG_WARNING", "", "TAG", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "warning", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycRiskWarning;", "kyc_release"})
    /* compiled from: KycQuestionsWarningFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c c(g gVar) {
            g gVar2 = gVar;
            kotlin.jvm.internal.i.f(gVar2, "warning");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_WARNING", gVar2);
            return new com.iqoption.core.ui.d.c(b.TAG, b.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends com.iqoption.core.ext.g {
        final /* synthetic */ b this$0;

        public b(b bVar) {
            this.this$0 = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            if (this.this$0.aNb().afr()) {
                IQTextInputEditText iQTextInputEditText = b.c(this.this$0).dvD;
                kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycQuestionSignatureEdit");
                String valueOf = String.valueOf(iQTextInputEditText.getText());
                if (valueOf != null) {
                    valueOf = v.trim(valueOf).toString();
                    if (this.this$0.iT(valueOf)) {
                        this.this$0.eT(true);
                        this.this$0.ev(true);
                        b.d(this.this$0).iS(valueOf);
                    } else {
                        TextInputLayout textInputLayout = b.c(this.this$0).dvE;
                        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycQuestionSignatureInput");
                        textInputLayout.setError(this.this$0.getString(f.incorrect_value));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            b.d(this.this$0).iS(null);
            com.iqoption.kyc.a.a.dtL.i("kyc_risk-warning-confirm", this.this$0.aKn(), this.this$0.aKo(), b.d(this.this$0).Er());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ b this$0;

        public c(b bVar) {
            this.this$0 = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.kyc.a.a.k(this.this$0.aKn(), this.this$0.aKo(), b.d(this.this$0).Er());
            com.iqoption.kyc.questionnaire.a.a.a(com.iqoption.kyc.questionnaire.a.dCC, this.this$0, com.iqoption.kyc.questionnaire.a.a.dDn.aLM(), false, 4, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/kyc/questionnaire/warning/KycQuestionsWarningFragment$onViewCreated$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "kyc_release"})
    /* compiled from: KycQuestionsWarningFragment.kt */
    public static final class d extends ah {
        final /* synthetic */ b this$0;

        d(b bVar) {
            this.this$0 = bVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            this.this$0.aNc();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycQuestionsWarningFragment.kt */
    static final class e<T> implements Observer<Throwable> {
        final /* synthetic */ b this$0;

        e(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: L */
        public final void onChanged(Throwable th) {
            String K = h.dsg.aIX().K(th);
            if (K == null) {
                K = this.this$0.getString(f.unknown_error_occurred);
                kotlin.jvm.internal.i.e(K, "getString(R.string.unknown_error_occurred)");
            }
            com.iqoption.core.d.a(K, 0, 2, null);
        }
    }

    private final g aNb() {
        kotlin.d dVar = this.dDW;
        j jVar = anY[0];
        return (g) dVar.getValue();
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

    public static final /* synthetic */ ak c(b bVar) {
        ak akVar = bVar.dDY;
        if (akVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return akVar;
    }

    public static final /* synthetic */ a d(b bVar) {
        a aVar = bVar.dDX;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return aVar;
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dDX = a.dDU.aP(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dDY = (ak) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.kyc.o.e.fragment_kyc_question_warning, viewGroup, false, 4, null);
        ak akVar = this.dDY;
        if (akVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return akVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        ak akVar;
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        a aVar = this.dDX;
        String str = "viewModel";
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        String string = getString(f.kyc_risk_warning);
        kotlin.jvm.internal.i.e(string, "getString(R.string.kyc_risk_warning)");
        aVar.setTitle(string);
        aVar = this.dDX;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        aVar.aMx();
        String afp = aNb().afp();
        String str2 = "binding.kycQuestionWarningText";
        String str3 = "binding";
        if ((((CharSequence) afp).length() > 0 ? 1 : null) != null) {
            akVar = this.dDY;
            if (akVar == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            TextView textView = akVar.dvG;
            kotlin.jvm.internal.i.e(textView, str2);
            textView.setText(Html.fromHtml(afp));
        }
        ak akVar2 = this.dDY;
        if (akVar2 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        TextView textView2 = akVar2.dvG;
        kotlin.jvm.internal.i.e(textView2, str2);
        textView2.setMovementMethod(new ScrollingMovementMethod());
        string = "binding.kycQuestionSignatureContainer";
        str2 = "binding.kycQuestionRecommendation";
        LinearLayout linearLayout;
        if (aNb().afr()) {
            akVar2 = this.dDY;
            if (akVar2 == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            textView2 = akVar2.dvA;
            kotlin.jvm.internal.i.e(textView2, str2);
            com.iqoption.core.ext.a.al(textView2);
            akVar2 = this.dDY;
            if (akVar2 == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            linearLayout = akVar2.dvC;
            kotlin.jvm.internal.i.e(linearLayout, string);
            com.iqoption.core.ext.a.ak(linearLayout);
        } else {
            akVar2 = this.dDY;
            if (akVar2 == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            textView2 = akVar2.dvA;
            kotlin.jvm.internal.i.e(textView2, str2);
            com.iqoption.core.ext.a.ak(textView2);
            akVar2 = this.dDY;
            if (akVar2 == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            linearLayout = akVar2.dvC;
            kotlin.jvm.internal.i.e(linearLayout, string);
            com.iqoption.core.ext.a.al(linearLayout);
        }
        if (aNb().afr()) {
            akVar2 = this.dDY;
            if (akVar2 == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            akVar2.dvD.addTextChangedListener(new d(this));
        }
        akVar2 = this.dDY;
        if (akVar2 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        IQTextInputEditText iQTextInputEditText = akVar2.dvD;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycQuestionSignatureEdit");
        EditText editText = iQTextInputEditText;
        akVar = this.dDY;
        if (akVar == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        TextInputLayout textInputLayout = akVar.dvE;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycQuestionSignatureInput");
        u.a(editText, textInputLayout);
        aNc();
        akVar2 = this.dDY;
        if (akVar2 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        akVar2.dvF.dwE.setText(f.kyc_i_have_read_and_understood);
        akVar2 = this.dDY;
        if (akVar2 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        FrameLayout frameLayout = akVar2.dvF.dwC;
        kotlin.jvm.internal.i.e(frameLayout, "binding.kycQuestionWarningButton.kycButton");
        frameLayout.setOnClickListener(new b(this));
        akVar2 = this.dDY;
        if (akVar2 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        textView2 = akVar2.dvB;
        kotlin.jvm.internal.i.e(textView2, "binding.kycQuestionRiskDisclosure");
        textView2.setOnClickListener(new c(this));
        aVar = this.dDX;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        aVar.aNa().observe(this, new e(this));
    }

    private final void aNc() {
        ak akVar = this.dDY;
        String str = "binding";
        if (akVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = akVar.dvF.dwC;
        kotlin.jvm.internal.i.e(frameLayout, "binding.kycQuestionWarningButton.kycButton");
        boolean z = true;
        if (aNb().afr()) {
            ak akVar2 = this.dDY;
            if (akVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextView textView = akVar2.dvG;
            kotlin.jvm.internal.i.e(textView, "binding.kycQuestionWarningText");
            CharSequence text = textView.getText();
            kotlin.jvm.internal.i.e(text, "binding.kycQuestionWarningText.text");
            if ((u.Y(text) ^ 1) == 0) {
                z = false;
            }
        }
        frameLayout.setEnabled(z);
    }

    private final void ev(boolean z) {
        ak akVar = this.dDY;
        String str = "binding";
        if (akVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = akVar.dvF.dwD;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.kycQuestionWarningButton.kycButtonProgress");
        contentLoadingProgressBar.setVisibility(z ? 0 : 8);
        akVar = this.dDY;
        if (akVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = akVar.dvF.dwC;
        kotlin.jvm.internal.i.e(frameLayout, "binding.kycQuestionWarningButton.kycButton");
        frameLayout.setEnabled(z ^ 1);
        akVar = this.dDY;
        if (akVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = akVar.dvB;
        kotlin.jvm.internal.i.e(textView, "binding.kycQuestionRiskDisclosure");
        textView.setEnabled(z ^ 1);
        akVar = this.dDY;
        if (akVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = akVar.dvD;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycQuestionSignatureEdit");
        iQTextInputEditText.setEnabled(z ^ 1);
    }

    public boolean aKp() {
        return this.dxb;
    }

    public void eT(boolean z) {
        this.dxb = z;
    }

    public String aKo() {
        return this.dtN;
    }

    public String aKn() {
        return this.dtM;
    }

    private final boolean iT(String str) {
        CharSequence charSequence = str;
        boolean z = false;
        Object obj = (charSequence == null || u.Y(charSequence)) ? 1 : null;
        if (obj != null) {
            return false;
        }
        try {
            String afs = aNb().afs();
            Regex regex = afs != null ? new Regex(afs) : null;
            if (regex != null && regex.L(str)) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return z;
    }
}

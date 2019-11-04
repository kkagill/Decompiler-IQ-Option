package com.iqoption.kyc.phone.a;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.textfield.TextInputLayout;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.kyc.b.y;
import com.iqoption.kyc.o.f;
import com.iqoption.kyc.u;
import java.util.HashMap;
import java.util.Locale;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010!\u001a\u00020\u0018H\u0016J\u001a\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010$\u001a\u00020\bH\u0014J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006("}, bng = {"Lcom/iqoption/kyc/phone/input/KycPhoneInputFragment;", "Lcom/iqoption/kyc/phone/BaseKycPhoneFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycPhoneInputBinding;", "initialPhone", "", "isContinuePressedAnalytics", "", "()Z", "phoneStepProgress", "", "getPhoneStepProgress", "()I", "screenName", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "viewModel", "Lcom/iqoption/kyc/phone/input/KycPhoneInputViewModel;", "getEditedPhoneNumber", "Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onViewCreated", "view", "showBottomBar", "showProgress", "show", "Companion", "kyc_release"})
/* compiled from: KycPhoneInputFragment.kt */
public final class a extends com.iqoption.kyc.phone.a {
    private static final String TAG;
    public static final a dAW = new a();
    private HashMap apm;
    private final int dAR = 50;
    private y dAT;
    private b dAU;
    private String dAV;
    private final String dtM = "PersonalData";
    private final String dtN = "InputPhone";
    private final boolean dxb = true;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/phone/input/KycPhoneInputFragment$Companion;", "", "()V", "TAG", "", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "kyc_release"})
    /* compiled from: KycPhoneInputFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c aLM() {
            return new com.iqoption.core.ui.d.c(a.TAG, a.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ a dAX;

        public b(a aVar) {
            this.dAX = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            PhoneNumber phoneNumber;
            kotlin.jvm.internal.i.f(view, "v");
            CharSequence a = this.dAX.dAV;
            Object obj = null;
            Object obj2 = (a == null || u.Y(a)) ? 1 : null;
            if (obj2 == null) {
                String a2 = this.dAX.dAV;
                IQTextInputEditText iQTextInputEditText = a.b(this.dAX).dvm;
                kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycPhoneEdit");
                if (kotlin.jvm.internal.i.y(a2, String.valueOf(iQTextInputEditText.getText()))) {
                    obj = 1;
                }
            }
            if (obj != null) {
                phoneNumber = null;
            } else {
                phoneNumber = this.dAX.aLs();
            }
            if (obj == null && phoneNumber == null) {
                TextInputLayout textInputLayout = a.b(this.dAX).dvn;
                String str = "binding.kycPhoneInput";
                kotlin.jvm.internal.i.e(textInputLayout, str);
                textInputLayout.setErrorEnabled(true);
                textInputLayout = a.b(this.dAX).dvn;
                kotlin.jvm.internal.i.e(textInputLayout, str);
                textInputLayout.setError(this.dAX.getString(f.incorrect_value));
                return;
            }
            this.dAX.ev(true);
            a.d(this.dAX).f(phoneNumber);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/kyc/phone/input/KycPhoneInputFragment$onViewCreated$1$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "kyc_release"})
    /* compiled from: KycPhoneInputFragment.kt */
    public static final class c extends ah {
        final /* synthetic */ a dAX;

        c(a aVar) {
            this.dAX = aVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            String a = this.dAX.dAV;
            if (a != null && v.b((CharSequence) editable, (CharSequence) "*", false, 2, null)) {
                if (editable.length() > a.length()) {
                    editable.replace(a.length(), editable.length(), "");
                } else if (editable.length() < a.length()) {
                    editable.clear();
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "keycode", "", "onKeyPressed"})
    /* compiled from: KycPhoneInputFragment.kt */
    static final class d implements com.iqoption.widget.numpad.NumPad.b {
        final /* synthetic */ a dAX;

        d(a aVar) {
            this.dAX = aVar;
        }

        public final void onKeyPressed(int i) {
            a.b(this.dAX).dvm.dispatchKeyEvent(new KeyEvent(0, i));
            a.b(this.dAX).dvm.dispatchKeyEvent(new KeyEvent(1, i));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/core/microservices/ResponseStatus;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycPhoneInputFragment.kt */
    static final class e<T> implements Observer<com.iqoption.core.ui.d<com.iqoption.core.microservices.c>> {
        final /* synthetic */ a dAX;

        e(a aVar) {
            this.dAX = aVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.core.ui.d<com.iqoption.core.microservices.c> dVar) {
            Object obj = 1;
            if (dVar == null || dVar.isSuccess()) {
                com.iqoption.core.microservices.c cVar = (com.iqoption.core.microservices.c) dVar.getData();
                if (cVar != null && cVar.isSuccessful()) {
                    com.iqoption.kyc.phone.navigator.a.a aVar = com.iqoption.kyc.phone.navigator.a.dBe;
                    a aVar2 = this.dAX;
                    Fragment fragment = aVar2;
                    IQTextInputEditText iQTextInputEditText = a.b(aVar2).dvm;
                    kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycPhoneEdit");
                    aVar.e(fragment, String.valueOf(iQTextInputEditText.getText()));
                    this.dAX.ev(false);
                }
            }
            com.iqoption.core.microservices.c cVar2 = (com.iqoption.core.microservices.c) dVar.getData();
            String message = cVar2 != null ? cVar2.getMessage() : null;
            CharSequence charSequence = message;
            if (!(charSequence == null || u.Y(charSequence))) {
                obj = null;
            }
            if (obj != null) {
                message = this.dAX.getString(f.unknown_error_occurred);
            }
            com.iqoption.core.d.a(message, 0, 2, null);
            this.dAX.ev(false);
        }
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

    public static final /* synthetic */ y b(a aVar) {
        y yVar = aVar.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return yVar;
    }

    public static final /* synthetic */ b d(a aVar) {
        b bVar = aVar.dAU;
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
        this.dAU = b.dBa.aB(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dAT = (y) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.kyc.o.e.fragment_kyc_phone_input, viewGroup, false, 4, null);
        y yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return yVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        y yVar = this.dAT;
        String str = "binding";
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        yVar.dvl.dwE.setText(f.next);
        yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = yVar.dvm;
        iQTextInputEditText.addTextChangedListener(new com.iqoption.core.e.a());
        if (VERSION.SDK_INT >= 21) {
            iQTextInputEditText.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        } else {
            iQTextInputEditText.addTextChangedListener(new com.iqoption.core.e.d());
        }
        iQTextInputEditText.addTextChangedListener(new c(this));
        yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        v.a((EditText) yVar.dvm, false);
        yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        yVar.dvo.setKeyListener(new d(this));
        yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        iQTextInputEditText = yVar.dvm;
        String str2 = "binding.kycPhoneEdit";
        kotlin.jvm.internal.i.e(iQTextInputEditText, str2);
        EditText editText = iQTextInputEditText;
        y yVar2 = this.dAT;
        if (yVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextInputLayout textInputLayout = yVar2.dvn;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycPhoneInput");
        u.a(editText, textInputLayout);
        yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = yVar.dvl.dwC;
        kotlin.jvm.internal.i.e(frameLayout, "binding.kycPhoneButton.kycButton");
        frameLayout.setOnClickListener(new b(this));
        yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        yVar.dvm.setText(com.iqoption.core.d.EA().getPhone());
        yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        iQTextInputEditText = yVar.dvm;
        yVar2 = this.dAT;
        if (yVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText2 = yVar2.dvm;
        kotlin.jvm.internal.i.e(iQTextInputEditText2, str2);
        Editable text = iQTextInputEditText2.getText();
        if (text == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        iQTextInputEditText.setSelection(text.length());
        yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        iQTextInputEditText = yVar.dvm;
        kotlin.jvm.internal.i.e(iQTextInputEditText, str2);
        this.dAV = String.valueOf(iQTextInputEditText.getText());
        b bVar = this.dAU;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.aLN().observe(this, new e(this));
    }

    public void onStart() {
        super.onStart();
        y yVar = this.dAT;
        String str = "binding";
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        yVar.dvm.requestFocus();
        yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = yVar.dvm;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycPhoneEdit");
        com.iqoption.core.ext.a.d(iQTextInputEditText);
    }

    private final void ev(boolean z) {
        String str = "binding.kycPhoneEdit";
        String str2 = "binding.kycPhoneButton.kycButton";
        String str3 = "binding.kycPhoneButton.kycButtonProgress";
        String str4 = "binding";
        y yVar;
        ContentLoadingProgressBar contentLoadingProgressBar;
        FrameLayout frameLayout;
        IQTextInputEditText iQTextInputEditText;
        if (z) {
            yVar = this.dAT;
            if (yVar == null) {
                kotlin.jvm.internal.i.lG(str4);
            }
            contentLoadingProgressBar = yVar.dvl.dwD;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str3);
            contentLoadingProgressBar.setVisibility(0);
            yVar = this.dAT;
            if (yVar == null) {
                kotlin.jvm.internal.i.lG(str4);
            }
            frameLayout = yVar.dvl.dwC;
            kotlin.jvm.internal.i.e(frameLayout, str2);
            frameLayout.setEnabled(false);
            yVar = this.dAT;
            if (yVar == null) {
                kotlin.jvm.internal.i.lG(str4);
            }
            iQTextInputEditText = yVar.dvm;
            kotlin.jvm.internal.i.e(iQTextInputEditText, str);
            iQTextInputEditText.setEnabled(false);
            return;
        }
        yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str4);
        }
        contentLoadingProgressBar = yVar.dvl.dwD;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, str3);
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str4);
        }
        frameLayout = yVar.dvl.dwC;
        kotlin.jvm.internal.i.e(frameLayout, str2);
        frameLayout.setEnabled(true);
        yVar = this.dAT;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG(str4);
        }
        iQTextInputEditText = yVar.dvm;
        kotlin.jvm.internal.i.e(iQTextInputEditText, str);
        iQTextInputEditText.setEnabled(true);
    }

    private final PhoneNumber aLs() {
        try {
            y yVar = this.dAT;
            if (yVar == null) {
                kotlin.jvm.internal.i.lG("binding");
            }
            IQTextInputEditText iQTextInputEditText = yVar.dvm;
            kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycPhoneEdit");
            String valueOf = String.valueOf(iQTextInputEditText.getText());
            PhoneNumberUtil xt = PhoneNumberUtil.xt();
            CharSequence charSequence = valueOf;
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.i.e(locale, "Locale.getDefault()");
            return xt.b(charSequence, locale.getCountry());
        } catch (NumberParseException unused) {
            return null;
        }
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

    public int aLL() {
        return this.dAR;
    }
}

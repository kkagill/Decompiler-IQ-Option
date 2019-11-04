package com.iqoption.kyc.commonphone;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.ui.widget.time.TimeTextView;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.kyc.b.ba;
import com.iqoption.kyc.b.bs;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/kyc/commonphone/PhoneConfirmFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentPhoneConfirmBinding;", "phone", "", "kotlin.jvm.PlatformType", "getPhone", "()Ljava/lang/String;", "phone$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/kyc/commonphone/PhoneConfirmViewModel;", "observeData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onViewCreated", "view", "setDummySpaceToMakeHintAlwaysExpanded", "showProgress", "show", "", "Companion", "kyc_release"})
/* compiled from: PhoneConfirmFragment.kt */
public final class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = a.class.getName();
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{k.a(new PropertyReference1Impl(k.G(a.class), "phone", "getPhone()Ljava/lang/String;"))};
    public static final a dtV = new a();
    private HashMap apm;
    private final kotlin.d bsv = g.c(new PhoneConfirmFragment$phone$2(this));
    private ba dtT;
    private b dtU;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/kyc/commonphone/PhoneConfirmFragment$Companion;", "", "()V", "ARG_IS_CONFIRM_PHONE", "", "ARG_IS_ENABLE_TWO_FACTOR", "ARG_PHONE", "CONFIRM_CODE_SIZE", "", "TAG", "kotlin.jvm.PlatformType", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "phone", "isConfirmPhone", "", "isEnableTwoFactor", "kyc_release"})
    /* compiled from: PhoneConfirmFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public static /* synthetic */ com.iqoption.core.ui.d.c a(a aVar, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = com.iqoption.core.d.EA().getPhone();
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            return aVar.c(str, z, z2);
        }

        public final com.iqoption.core.ui.d.c c(String str, boolean z, boolean z2) {
            String Bw = a.TAG;
            kotlin.jvm.internal.i.e(Bw, "TAG");
            Bundle bundle = new Bundle();
            bundle.putString("ARG_PHONE", str);
            bundle.putBoolean("ARG_IS_CONFIRM_PHONE", z);
            bundle.putBoolean("ARG_IS_ENABLE_TWO_FACTOR", z2);
            return new com.iqoption.core.ui.d.c(Bw, a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: PhoneConfirmFragment.kt */
    static final class b<T> implements Observer<String> {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            TimeTextView timeTextView = a.a(this.this$0).dwh;
            if (str == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            timeTextView.D(str);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: PhoneConfirmFragment.kt */
    static final class c<T> implements Observer<Boolean> {
        final /* synthetic */ a this$0;

        c(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            String str = "binding.kycPhoneConfirmTime";
            String str2 = "binding.kycPhoneConfirmResend";
            TextView textView;
            TimeTextView timeTextView;
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                textView = a.a(this.this$0).dwg;
                kotlin.jvm.internal.i.e(textView, str2);
                textView.setEnabled(true);
                timeTextView = a.a(this.this$0).dwh;
                kotlin.jvm.internal.i.e(timeTextView, str);
                com.iqoption.core.ext.a.al(timeTextView);
                return;
            }
            textView = a.a(this.this$0).dwg;
            kotlin.jvm.internal.i.e(textView, str2);
            textView.setEnabled(false);
            timeTextView = a.a(this.this$0).dwh;
            kotlin.jvm.internal.i.e(timeTextView, str);
            com.iqoption.core.ext.a.ak(timeTextView);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "message", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: PhoneConfirmFragment.kt */
    static final class d<T> implements Observer<String> {
        public static final d dtW = new d();

        d() {
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                com.iqoption.core.d.a(str, 0, 2, null);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: PhoneConfirmFragment.kt */
    static final class e<T> implements Observer<Boolean> {
        final /* synthetic */ a this$0;

        e(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            this.this$0.ev(kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true)));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: PhoneConfirmFragment.kt */
    static final class f<T> implements Observer<Pair<? extends Boolean, ? extends Boolean>> {
        final /* synthetic */ a this$0;

        f(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Boolean, Boolean> pair) {
            Fragment v = com.iqoption.core.ext.a.v(this.this$0);
            if (v instanceof c) {
                if (pair == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                if (((Boolean) pair.getFirst()).booleanValue()) {
                    ((c) v).aKD();
                } else {
                    ((c) v).eE(((Boolean) pair.bni()).booleanValue());
                }
            }
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
            Fragment parentFragment = this.this$0.getParentFragment();
            if (!(parentFragment instanceof c)) {
                parentFragment = null;
            }
            c cVar = (c) parentFragment;
            if (cVar != null) {
                cVar.aKE();
            }
            a.b(this.this$0).aKB();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/kyc/commonphone/PhoneConfirmFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class h extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public h(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            IQTextInputEditText iQTextInputEditText = a.a(this.this$0).dwc;
            kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycPhoneConfirmEdit");
            String valueOf = String.valueOf(iQTextInputEditText.getText());
            if (valueOf != null) {
                a.b(this.this$0).iN(v.trim(valueOf).toString());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "keycode", "", "onKeyPressed"})
    /* compiled from: PhoneConfirmFragment.kt */
    static final class i implements com.iqoption.widget.numpad.NumPad.b {
        final /* synthetic */ a this$0;

        i(a aVar) {
            this.this$0 = aVar;
        }

        public final void onKeyPressed(int i) {
            a.a(this.this$0).dwc.dispatchKeyEvent(new KeyEvent(0, i));
            a.a(this.this$0).dwc.dispatchKeyEvent(new KeyEvent(1, i));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/kyc/commonphone/PhoneConfirmFragment$onViewCreated$4", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "kyc_release"})
    /* compiled from: PhoneConfirmFragment.kt */
    public static final class j extends ah {
        final /* synthetic */ a this$0;

        j(a aVar) {
            this.this$0 = aVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            CharSequence charSequence = editable;
            CharSequence trim = v.trim(charSequence);
            Object obj = 1;
            boolean z = TextUtils.isDigitsOnly(trim) && trim.length() >= 6;
            FrameLayout frameLayout = a.a(this.this$0).dwb.dwC;
            kotlin.jvm.internal.i.e(frameLayout, "binding.kycPhoneConfirmApply.kycButton");
            frameLayout.setEnabled(z);
            if (charSequence.length() != 0) {
                obj = null;
            }
            if (obj != null) {
                this.this$0.aKu();
            }
        }
    }

    private final String getPhone() {
        kotlin.d dVar = this.bsv;
        kotlin.reflect.j jVar = anY[0];
        return (String) dVar.getValue();
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

    public static final /* synthetic */ ba a(a aVar) {
        ba baVar = aVar.dtT;
        if (baVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return baVar;
    }

    public static final /* synthetic */ b b(a aVar) {
        b bVar = aVar.dtU;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return bVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dtU = b.dui.ao(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dtT = (ba) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.kyc.o.e.fragment_phone_confirm, viewGroup, false, 4, null);
        b bVar = this.dtU;
        String str = "viewModel";
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar.eC(com.iqoption.core.ext.a.s(this).getBoolean("ARG_IS_CONFIRM_PHONE"));
        bVar = this.dtU;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar.eD(com.iqoption.core.ext.a.s(this).getBoolean("ARG_IS_ENABLE_TWO_FACTOR"));
        ba baVar = this.dtT;
        if (baVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return baVar.getRoot();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ba baVar = this.dtT;
        String str = "binding";
        if (baVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = baVar.dwf;
        kotlin.jvm.internal.i.e(textView, "binding.kycPhoneConfirmNumber");
        textView.setText(getPhone());
        baVar = this.dtT;
        if (baVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        v.a((EditText) baVar.dwc, false);
        baVar = this.dtT;
        if (baVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        baVar.dwe.setKeyListener(new i(this));
        baVar = this.dtT;
        if (baVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bs bsVar = baVar.dwb;
        bsVar.dwE.setText(com.iqoption.kyc.o.f.redeem);
        FrameLayout frameLayout = bsVar.dwC;
        String str2 = "kycButton";
        kotlin.jvm.internal.i.e(frameLayout, str2);
        frameLayout.setMinimumWidth(getResources().getDimensionPixelSize(com.iqoption.kyc.o.b.dp108));
        frameLayout = bsVar.dwC;
        kotlin.jvm.internal.i.e(frameLayout, str2);
        frameLayout.setMinimumHeight(getResources().getDimensionPixelSize(com.iqoption.kyc.o.b.dp36));
        bsVar.dwC.setBackgroundResource(com.iqoption.kyc.o.c.bg_green_selector);
        FrameLayout frameLayout2 = bsVar.dwC;
        kotlin.jvm.internal.i.e(frameLayout2, str2);
        frameLayout2.setOnClickListener(new h(this));
        baVar = this.dtT;
        if (baVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView = baVar.dwg;
        kotlin.jvm.internal.i.e(textView, "binding.kycPhoneConfirmResend");
        textView.setOnClickListener(new g(this));
        baVar = this.dtT;
        if (baVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        baVar.dwc.addTextChangedListener(new j(this));
        aKu();
        aKt();
    }

    public void onStart() {
        super.onStart();
        ba baVar = this.dtT;
        String str = "binding";
        if (baVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        baVar.dwc.requestFocus();
        baVar = this.dtT;
        if (baVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = baVar.dwc;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycPhoneConfirmEdit");
        com.iqoption.core.ext.a.d(iQTextInputEditText);
    }

    private final void aKt() {
        b bVar = this.dtU;
        String str = "viewModel";
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        bVar.aqE().observe(lifecycleOwner, new b(this));
        bVar = this.dtU;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar.aKv().observe(lifecycleOwner, new c(this));
        bVar = this.dtU;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar.aKw().observe(lifecycleOwner, d.dtW);
        bVar = this.dtU;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar.aKx().observe(lifecycleOwner, new e(this));
        bVar = this.dtU;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar.aKy().observe(lifecycleOwner, new f(this));
    }

    private final void ev(boolean z) {
        ba baVar = this.dtT;
        if (baVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        bs bsVar = baVar.dwb;
        String str = "kycButtonProgress";
        String str2 = "kycButton";
        FrameLayout frameLayout;
        ContentLoadingProgressBar contentLoadingProgressBar;
        if (z) {
            frameLayout = bsVar.dwC;
            kotlin.jvm.internal.i.e(frameLayout, str2);
            frameLayout.setEnabled(false);
            contentLoadingProgressBar = bsVar.dwD;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
            contentLoadingProgressBar.setVisibility(0);
            return;
        }
        frameLayout = bsVar.dwC;
        kotlin.jvm.internal.i.e(frameLayout, str2);
        frameLayout.setEnabled(true);
        contentLoadingProgressBar = bsVar.dwD;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
    }

    private final void aKu() {
        ba baVar = this.dtT;
        if (baVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        baVar.dwc.setText(" ");
    }
}

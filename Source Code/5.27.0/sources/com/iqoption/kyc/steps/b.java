package com.iqoption.kyc.steps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.core.util.v;
import com.iqoption.kyc.b.aw;
import com.iqoption.kyc.b.bm;
import com.iqoption.kyc.o.f;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.internal.Ref.BooleanRef;

@i(bne = {1, 1, 15}, bnf = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0003J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010$\u001a\u00020\u0006H\u0014J\b\u0010%\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006'"}, bng = {"Lcom/iqoption/kyc/steps/KysStepsFragment;", "Lcom/iqoption/kyc/BaseKycStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycStepsBinding;", "isContinuePressedAnalytics", "", "()Z", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "viewModel", "Lcom/iqoption/kyc/steps/KycStepsViewModel;", "bindStatus", "", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "stepBinding", "Lcom/iqoption/kyc/databinding/ItemKycStepBinding;", "fillData", "steps", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showBottomBar", "showProgress", "Companion", "kyc_release"})
/* compiled from: KysStepsFragment.kt */
public final class b extends com.iqoption.kyc.b {
    private static final String TAG;
    public static final a dEd = new a();
    private HashMap apm;
    private aw dEb;
    private a dEc;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/kyc/steps/KysStepsFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "kyc_release"})
    /* compiled from: KysStepsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }

        public final com.iqoption.core.ui.d.c aLM() {
            return new com.iqoption.core.ui.d.c(Bx(), b.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/kyc/steps/KysStepsFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ com.iqoption.core.microservices.kyc.response.step.c dEe;
        final /* synthetic */ b dEf;
        final /* synthetic */ List dEg;
        final /* synthetic */ BooleanRef dEh;
        final /* synthetic */ LinearLayout dxe;

        public b(com.iqoption.core.microservices.kyc.response.step.c cVar, b bVar, LinearLayout linearLayout, List list, BooleanRef booleanRef) {
            this.dEe = cVar;
            this.dEf = bVar;
            this.dxe = linearLayout;
            this.dEg = list;
            this.dEh = booleanRef;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            b.a(this.dEf).h(this.dEe);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends g {
        final /* synthetic */ b dEf;

        public c(b bVar) {
            this.dEf = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            b.a(this.dEf).aKS();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends g {
        final /* synthetic */ b dEf;

        public d(b bVar) {
            this.dEf = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.kyc.navigator.a.dAF.aw(this.dEf);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "steps", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KysStepsFragment.kt */
    static final class e<T> implements Observer<List<? extends com.iqoption.core.microservices.kyc.response.step.c>> {
        final /* synthetic */ b dEf;

        e(b bVar) {
            this.dEf = bVar;
        }

        /* renamed from: u */
        public final void onChanged(List<com.iqoption.core.microservices.kyc.response.step.c> list) {
            if (list != null) {
                this.dEf.bh(list);
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean aID() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public boolean aIE() {
        return false;
    }

    public String aKn() {
        return "Welcome";
    }

    public String aKo() {
        return "VerifyAccountAfterSignUp";
    }

    public boolean aKp() {
        return false;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ a a(b bVar) {
        a aVar = bVar.dEc;
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
        this.dEc = a.dEa.aQ(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dEb = (aw) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.kyc.o.e.fragment_kyc_steps, viewGroup, false, 4, null);
        aw awVar = this.dEb;
        if (awVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return awVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        aw awVar = this.dEb;
        String str = "binding";
        if (awVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = awVar.dvU;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.kycStepsProgress");
        contentLoadingProgressBar.setVisibility(0);
        awVar = this.dEb;
        if (awVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = awVar.dvT;
        kotlin.jvm.internal.i.e(linearLayout, "binding.kycStepsContainer");
        com.iqoption.core.ext.a.al(linearLayout);
        a aVar = this.dEc;
        String str2 = "viewModel";
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        String string = getString(f.verification_flow);
        kotlin.jvm.internal.i.e(string, "getString(R.string.verification_flow)");
        aVar.setTitle(string);
        aVar = this.dEc;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        aVar.aNf();
        aVar = this.dEc;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        aVar.aNe().observe(this, new e(this));
        awVar = this.dEb;
        if (awVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        awVar.dvV.requestFocus();
        v.az(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    private final void bh(java.util.List<com.iqoption.core.microservices.kyc.response.step.c> r18) {
        /*
        r17 = this;
        r6 = r17;
        r0 = r6.dEb;
        r7 = "binding";
        if (r0 != 0) goto L_0x000b;
    L_0x0008:
        kotlin.jvm.internal.i.lG(r7);
    L_0x000b:
        r0 = r0.dvU;
        r1 = "binding.kycStepsProgress";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.al(r0);
        r0 = r6.dEb;
        if (r0 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.i.lG(r7);
    L_0x001e:
        r8 = r0.dvT;
        r0 = "binding.kycStepsContainer";
        kotlin.jvm.internal.i.e(r8, r0);
        r0 = r8;
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.ak(r0);
        r8.removeAllViews();
        r9 = new kotlin.jvm.internal.Ref$BooleanRef;
        r9.<init>();
        r10 = 0;
        r9.element = r10;
        r11 = r18;
        r11 = (java.lang.Iterable) r11;
        r12 = r11.iterator();
        r0 = 0;
    L_0x003f:
        r1 = r12.hasNext();
        r3 = 3;
        r5 = 1;
        if (r1 == 0) goto L_0x0130;
    L_0x0047:
        r1 = r12.next();
        r13 = r0 + 1;
        if (r0 >= 0) goto L_0x0052;
    L_0x004f:
        kotlin.collections.m.bno();
    L_0x0052:
        r1 = (com.iqoption.core.microservices.kyc.response.step.c) r1;
        r14 = com.iqoption.kyc.o.e.item_kyc_step;
        r15 = r8;
        r15 = (android.view.ViewGroup) r15;
        r14 = com.iqoption.core.ext.a.a(r6, r14, r15, r10);
        r14 = (com.iqoption.kyc.b.bm) r14;
        r15 = r1.afI();
        r4 = com.iqoption.core.microservices.kyc.response.step.KycStepState.PASSED;
        if (r15 != r4) goto L_0x0069;
    L_0x0067:
        r4 = 1;
        goto L_0x006a;
    L_0x0069:
        r4 = 0;
    L_0x006a:
        if (r4 == 0) goto L_0x006f;
    L_0x006c:
        r15 = com.iqoption.kyc.o.a.grey_blue_10;
        goto L_0x0071;
    L_0x006f:
        r15 = com.iqoption.kyc.o.a.grey_blue_5;
    L_0x0071:
        r2 = r14.dws;
        r2.setBackgroundResource(r15);
        if (r0 != 0) goto L_0x007b;
    L_0x0078:
        r0 = com.iqoption.kyc.steps.ProgressPosition.FIRST;
        goto L_0x0087;
    L_0x007b:
        r2 = r18.size();
        r2 = r2 - r5;
        if (r0 != r2) goto L_0x0085;
    L_0x0082:
        r0 = com.iqoption.kyc.steps.ProgressPosition.LAST;
        goto L_0x0087;
    L_0x0085:
        r0 = com.iqoption.kyc.steps.ProgressPosition.MIDDLE;
    L_0x0087:
        r2 = r14.dwu;
        r2.a(r0, r4);
        r0 = r14.dwt;
        r2 = "stepBinding.kycStepName";
        kotlin.jvm.internal.i.e(r0, r2);
        r2 = r1.getTitle();
        r2 = (java.lang.CharSequence) r2;
        r0.setText(r2);
        r6.a(r1, r14);
        r0 = r1.afI();
        r2 = new com.iqoption.core.microservices.kyc.response.step.KycStepState[r3];
        r3 = com.iqoption.core.microservices.kyc.response.step.KycStepState.SKIPPED;
        r2[r10] = r3;
        r3 = com.iqoption.core.microservices.kyc.response.step.KycStepState.NEED_ACTION;
        r2[r5] = r3;
        r3 = com.iqoption.core.microservices.kyc.response.step.KycStepState.DECLINED;
        r4 = 2;
        r2[r4] = r3;
        r0 = com.iqoption.core.ext.c.b(r0, r2);
        if (r0 == 0) goto L_0x00ba;
    L_0x00b8:
        r0 = 1;
        goto L_0x00e1;
    L_0x00ba:
        r0 = r9.element;
        if (r0 != 0) goto L_0x00c9;
    L_0x00be:
        r0 = r1.afI();
        r2 = com.iqoption.core.microservices.kyc.response.step.KycStepState.NOT_FILLED;
        if (r0 != r2) goto L_0x00c9;
    L_0x00c6:
        r9.element = r5;
        goto L_0x00b8;
    L_0x00c9:
        r0 = r1.afI();
        r2 = com.iqoption.core.microservices.kyc.response.step.KycStepState.NOT_FILLED;
        if (r0 == r2) goto L_0x00e0;
    L_0x00d1:
        r0 = com.iqoption.core.microservices.kyc.response.step.d.afM();
        r2 = r1.afH();
        r0 = r0.contains(r2);
        if (r0 == 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x00b8;
    L_0x00e0:
        r0 = 0;
    L_0x00e1:
        r2 = "stepBinding.kycStepClickable";
        if (r0 == 0) goto L_0x011c;
    L_0x00e5:
        r0 = r14.dwr;
        kotlin.jvm.internal.i.e(r0, r2);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.ak(r0);
        r0 = r14.dws;
        r2 = new com.iqoption.core.ui.widget.h.b;
        r3 = 0;
        r4 = 0;
        r2.<init>(r3, r5, r4);
        r2 = (android.view.View.OnTouchListener) r2;
        r0.setOnTouchListener(r2);
        r0 = r14.dws;
        r2 = "stepBinding.kycStepContainer";
        kotlin.jvm.internal.i.e(r0, r2);
        r15 = r0;
        r15 = (android.view.View) r15;
        r16 = new com.iqoption.kyc.steps.b$b;
        r0 = r16;
        r2 = r17;
        r3 = r8;
        r4 = r18;
        r5 = r9;
        r0.<init>(r1, r2, r3, r4, r5);
        r0 = r16;
        r0 = (android.view.View.OnClickListener) r0;
        r15.setOnClickListener(r0);
        goto L_0x0126;
    L_0x011c:
        r0 = r14.dwr;
        kotlin.jvm.internal.i.e(r0, r2);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.al(r0);
    L_0x0126:
        r0 = r14.getRoot();
        r8.addView(r0);
        r0 = r13;
        goto L_0x003f;
    L_0x0130:
        r4 = 0;
        r0 = r11.iterator();
    L_0x0135:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x015d;
    L_0x013b:
        r1 = r0.next();
        r2 = r1;
        r2 = (com.iqoption.core.microservices.kyc.response.step.c) r2;
        r2 = r2.afI();
        r8 = new com.iqoption.core.microservices.kyc.response.step.KycStepState[r3];
        r9 = com.iqoption.core.microservices.kyc.response.step.KycStepState.PASSED;
        r8[r10] = r9;
        r9 = com.iqoption.core.microservices.kyc.response.step.KycStepState.PENDING;
        r8[r5] = r9;
        r9 = com.iqoption.core.microservices.kyc.response.step.KycStepState.SKIPPED;
        r11 = 2;
        r8[r11] = r9;
        r2 = com.iqoption.core.ext.c.b(r2, r8);
        r2 = r2 ^ r5;
        if (r2 == 0) goto L_0x0135;
    L_0x015c:
        goto L_0x015e;
    L_0x015d:
        r1 = r4;
    L_0x015e:
        r0 = "binding.kycButton.kycButton";
        if (r1 == 0) goto L_0x018d;
    L_0x0162:
        r1 = r6.dEb;
        if (r1 != 0) goto L_0x0169;
    L_0x0166:
        kotlin.jvm.internal.i.lG(r7);
    L_0x0169:
        r1 = r1.dvS;
        r1 = r1.dwE;
        r2 = com.iqoption.kyc.o.f.continue_;
        r1.setText(r2);
        r1 = r6.dEb;
        if (r1 != 0) goto L_0x0179;
    L_0x0176:
        kotlin.jvm.internal.i.lG(r7);
    L_0x0179:
        r1 = r1.dvS;
        r1 = r1.dwC;
        kotlin.jvm.internal.i.e(r1, r0);
        r1 = (android.view.View) r1;
        r0 = new com.iqoption.kyc.steps.b$c;
        r0.<init>(r6);
        r0 = (android.view.View.OnClickListener) r0;
        r1.setOnClickListener(r0);
        goto L_0x01b7;
    L_0x018d:
        r1 = r6.dEb;
        if (r1 != 0) goto L_0x0194;
    L_0x0191:
        kotlin.jvm.internal.i.lG(r7);
    L_0x0194:
        r1 = r1.dvS;
        r1 = r1.dwE;
        r2 = com.iqoption.kyc.o.f.done;
        r1.setText(r2);
        r1 = r6.dEb;
        if (r1 != 0) goto L_0x01a4;
    L_0x01a1:
        kotlin.jvm.internal.i.lG(r7);
    L_0x01a4:
        r1 = r1.dvS;
        r1 = r1.dwC;
        kotlin.jvm.internal.i.e(r1, r0);
        r1 = (android.view.View) r1;
        r0 = new com.iqoption.kyc.steps.b$d;
        r0.<init>(r6);
        r0 = (android.view.View.OnClickListener) r0;
        r1.setOnClickListener(r0);
    L_0x01b7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.steps.b.bh(java.util.List):void");
    }

    private final void a(com.iqoption.core.microservices.kyc.response.step.c cVar, bm bmVar) {
        String string;
        switch (cVar.afI()) {
            case PASSED:
                string = getString(f.done);
                break;
            case PENDING:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(getString(f.kyc_step_pending));
                stringBuilder.append("…");
                string = stringBuilder.toString();
                break;
            case DECLINED:
                string = getString(f.declined);
                break;
            case SKIPPED:
                string = getString(f.kyc_step_skipped);
                break;
            case NOT_FILLED:
                string = null;
                break;
            case NEED_ACTION:
                string = getString(f.need_action);
                break;
            case UNKNOWN:
                string = getString(f.unknown);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str = "stepBinding.kycStepStatus";
        if (string != null) {
            TextView textView = bmVar.dwv;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(string);
            TextView textView2 = bmVar.dwv;
            kotlin.jvm.internal.i.e(textView2, str);
            com.iqoption.core.ext.a.ak(textView2);
            int i = c.axg[cVar.afI().ordinal()];
            if (i == 1) {
                i = com.iqoption.kyc.o.a.green;
            } else if (i == 2 || i == 3) {
                i = com.iqoption.kyc.o.a.grey_blue;
            } else {
                i = com.iqoption.kyc.o.a.red;
            }
            bmVar.dwv.setTextColor(com.iqoption.core.ext.a.k(com.iqoption.core.ext.a.q(this), i));
            return;
        }
        TextView textView3 = bmVar.dwv;
        kotlin.jvm.internal.i.e(textView3, str);
        com.iqoption.core.ext.a.al(textView3);
    }
}

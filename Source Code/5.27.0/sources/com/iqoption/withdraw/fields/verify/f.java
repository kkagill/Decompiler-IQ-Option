package com.iqoption.withdraw.fields.verify;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.transition.TransitionManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.kyc.KycCaller;
import com.iqoption.withdraw.WrapContentViewPager;
import com.iqoption.withdraw.a.k;
import com.iqoption.withdraw.d.e;
import com.rd.PageIndicatorView;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010 \u001a\u00020\u0010H\u0002J\u0016\u0010!\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006%"}, bng = {"Lcom/iqoption/withdraw/fields/verify/WithdrawVerifyFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/withdraw/fields/verify/WarningListener;", "()V", "adapter", "Lcom/iqoption/withdraw/fields/verify/WithdrawVerifyWarningAdapter;", "allWarnings", "", "Lcom/iqoption/withdraw/fields/verify/VerificationWarning;", "binding", "Lcom/iqoption/withdraw/databinding/FragmentWithdrawVerifyBinding;", "shouldShowWarnings", "", "viewModel", "Lcom/iqoption/withdraw/fields/verify/WithdrawVerifyViewModel;", "hideContent", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDocWarningClick", "onMultipleCardsWarningClick", "onSingleCardWarningClick", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "onViewCreated", "view", "showContent", "showWarnings", "warnings", "updateShouldShowWarnings", "Companion", "withdraw_release"})
/* compiled from: WithdrawVerifyFragment.kt */
public final class f extends d implements e {
    private static final String TAG;
    public static final a esn = new a();
    private HashMap apm;
    private g esi;
    private k esj;
    private h esk;
    private boolean esl;
    private List<? extends c> esm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/withdraw/fields/verify/WithdrawVerifyFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/withdraw/fields/verify/WithdrawVerifyFragment;", "withdraw_release"})
    /* compiled from: WithdrawVerifyFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return f.TAG;
        }

        public final f bcE() {
            return new f();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnLayout$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c implements OnGlobalLayoutListener {
        final /* synthetic */ View bgH;
        final /* synthetic */ LinearLayout dxe;
        final /* synthetic */ f eso;
        final /* synthetic */ List esp;

        public c(View view, LinearLayout linearLayout, f fVar, List list) {
            this.bgH = view;
            this.dxe = linearLayout;
            this.eso = fVar;
            this.esp = list;
        }

        public void onGlobalLayout() {
            if (ViewCompat.isLaidOut(this.dxe)) {
                this.bgH.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                f.a(this.eso).L(this.esp);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "warnings", "", "Lcom/iqoption/withdraw/fields/verify/VerificationWarning;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawVerifyFragment.kt */
    static final class b<T> implements Observer<List<? extends c>> {
        final /* synthetic */ f eso;

        b(f fVar) {
            this.eso = fVar;
        }

        /* renamed from: u */
        public final void onChanged(List<? extends c> list) {
            if (list != null) {
                this.eso.esm = list;
                this.eso.bB(list);
            }
        }
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

    public static final /* synthetic */ h a(f fVar) {
        h hVar = fVar.esk;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        return hVar;
    }

    static {
        String name = f.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.esj = (k) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_withdraw_verify, viewGroup, false, 4, null);
        k kVar = this.esj;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return kVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.esi = g.esv.T(com.iqoption.core.ext.a.r(this));
        bcD();
        k kVar = this.esj;
        String str = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        WrapContentViewPager wrapContentViewPager = kVar.eqm;
        kotlin.jvm.internal.i.e(wrapContentViewPager, "binding.withdrawVerifyPager");
        this.esk = new h(com.iqoption.core.ext.a.q(this), this);
        h hVar = this.esk;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        wrapContentViewPager.setAdapter(hVar);
        k kVar2 = this.esj;
        if (kVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        PageIndicatorView pageIndicatorView = kVar2.eql;
        kotlin.jvm.internal.i.e(pageIndicatorView, "binding.withdrawVerifyIndicator");
        pageIndicatorView.setViewPager(wrapContentViewPager);
        g gVar = this.esi;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        gVar.bcF().observe(this, new b(this));
    }

    private final void bB(List<? extends c> list) {
        k kVar = this.esj;
        String str = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = kVar.getRoot();
        if (root != null) {
            TransitionManager.beginDelayedTransition((ViewGroup) root);
            if (list.isEmpty() || !this.esl) {
                bcD();
                return;
            }
            Li();
            kVar = this.esj;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            PageIndicatorView pageIndicatorView = kVar.eql;
            kotlin.jvm.internal.i.e(pageIndicatorView, "binding.withdrawVerifyIndicator");
            if (list.size() > 1) {
                pageIndicatorView.setCount(list.size());
                com.iqoption.core.ext.a.ak(pageIndicatorView);
            } else {
                com.iqoption.core.ext.a.al(pageIndicatorView);
            }
            kVar = this.esj;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            LinearLayout linearLayout = kVar.eqk;
            kotlin.jvm.internal.i.e(linearLayout, "binding.withdrawVerifyContainer");
            View view = linearLayout;
            if (ViewCompat.isLaidOut(view)) {
                a(this).L(list);
            } else {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new c(view, linearLayout, this, list));
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public void bcB() {
        com.iqoption.kyc.e eVar = new com.iqoption.kyc.e();
        eVar.a(KycCaller.WITHDRAW);
        eVar.aIK();
        eVar.el(false);
        eVar.ai(this);
    }

    public void m(com.iqoption.core.microservices.billing.verification.response.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "card");
        com.iqoption.cardsverification.c.aAp.KZ().d(this, cVar);
    }

    public void bcC() {
        com.iqoption.cardsverification.c.b.a(com.iqoption.cardsverification.c.aAp.KZ(), this, null, 2, null);
    }

    public final void fE(boolean z) {
        this.esl = z;
        List list = this.esm;
        if (list != null) {
            bB(list);
        }
    }

    private final void Li() {
        k kVar = this.esj;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LinearLayout linearLayout = kVar.eqk;
        kotlin.jvm.internal.i.e(linearLayout, "binding.withdrawVerifyContainer");
        com.iqoption.core.ext.a.ak(linearLayout);
    }

    private final void bcD() {
        k kVar = this.esj;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LinearLayout linearLayout = kVar.eqk;
        kotlin.jvm.internal.i.e(linearLayout, "binding.withdrawVerifyContainer");
        com.iqoption.core.ext.a.al(linearLayout);
    }
}

package com.iqoption.withdraw.d;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.core.util.v;
import com.iqoption.withdraw.a.w;
import com.iqoption.withdraw.b.l;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u00017B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\nH\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0012\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u0016H\u0016J)\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u001c2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u0016H\u0016J\u001a\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u00100\u001a\u00020\u0016H\u0002J\b\u00101\u001a\u00020\u0016H\u0002J\u0018\u00102\u001a\u00020\u00162\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u000204J\b\u00106\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u00068"}, bng = {"Lcom/iqoption/withdraw/navigator/WithdrawNavigatorFragment;", "Lcom/iqoption/core/ui/navigation/BaseStackNavigatorFragment;", "Lcom/iqoption/withdraw/navigator/MethodsCallback;", "Lcom/iqoption/withdraw/WithdrawLimitReasonDialog$OnCloseListener;", "()V", "binding", "Lcom/iqoption/withdraw/databinding/FragmentWithdrawNavigatorBinding;", "fieldsFragment", "Lcom/iqoption/withdraw/fields/WithdrawFieldsFragment;", "freePayoutLimit", "", "Ljava/lang/Integer;", "freePayoutLimitLeft", "historyFragment", "Lcom/iqoption/withdraw/history/WithdrawHistoryFragment;", "infoPopupHelper", "Lcom/iqoption/InfoPopupHelper;", "methodsFragment", "Lcom/iqoption/withdraw/methods/WithdrawMethodsFragment;", "viewModel", "Lcom/iqoption/withdraw/navigator/WithdrawNavigatorViewModel;", "closeWithdraw", "", "getContainerId", "getInitialEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "initToolbar", "onBackPressed", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDialogClose", "onLoadingFail", "onLoadingSuccess", "hasMethods", "(ZLjava/lang/Integer;Ljava/lang/Integer;)V", "onStop", "onViewCreated", "view", "setLimitReasonDialogListener", "showContentUi", "showLimitReasonDialog", "title", "", "warning", "showProgressUi", "Companion", "withdraw_release"})
/* compiled from: WithdrawNavigatorFragment.kt */
public abstract class b extends com.iqoption.core.ui.d.b implements a, com.iqoption.withdraw.g.b {
    public static final a etC = new a();
    private HashMap apm;
    private final com.iqoption.c cyy = new com.iqoption.c(new b());
    private Integer etA;
    private Integer etB;
    private c etv;
    private com.iqoption.withdraw.a.i etw;
    private com.iqoption.withdraw.c.e etx;
    private com.iqoption.withdraw.fields.d ety;
    private l etz;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ \u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¨\u0006\u000f"}, bng = {"Lcom/iqoption/withdraw/navigator/WithdrawNavigatorFragment$Companion;", "", "()V", "closeWithdraw", "Lcom/iqoption/withdraw/navigator/WithdrawNavigatorFragment;", "child", "Landroidx/fragment/app/Fragment;", "showComplete", "success", "", "amount", "", "showLimitReasonDialog", "title", "warning", "withdraw_release"})
    /* compiled from: WithdrawNavigatorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b a(Fragment fragment, String str, String str2) {
            kotlin.jvm.internal.i.f(fragment, "child");
            kotlin.jvm.internal.i.f(str2, "warning");
            b bVar = (b) com.iqoption.core.ext.a.a(fragment, b.class);
            bVar.aI(str, str2);
            return bVar;
        }

        public final b a(Fragment fragment, boolean z, String str) {
            kotlin.jvm.internal.i.f(fragment, "child");
            b bVar = (b) com.iqoption.core.ext.a.a(fragment, b.class);
            bVar.alE().b(com.iqoption.withdraw.complete.a.epK.i(z, str), false);
            v.j(bVar.getActivity());
            return bVar;
        }

        public final b bE(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            b bVar = (b) com.iqoption.core.ext.a.a(fragment, b.class);
            bVar.bdf();
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: WithdrawNavigatorFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ b etD;

        c(b bVar) {
            this.etD = bVar;
        }

        public final void onClick(View view) {
            this.etD.back();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, bng = {"com/iqoption/withdraw/navigator/WithdrawNavigatorFragment$infoPopupHelper$1", "Lcom/iqoption/InfoPopupHelper$OnInfoListener;", "onInfoClosed", "", "onInfoOpened", "withdraw_release"})
    /* compiled from: WithdrawNavigatorFragment.kt */
    public static final class b implements com.iqoption.c.a {
        public void zE() {
        }

        public void zF() {
        }

        b() {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends g {
        final /* synthetic */ b etD;

        public d(b bVar) {
            this.etD = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            int[] iArr = new int[2];
            b.a(this.etD).eqj.eqJ.getLocationInWindow(iArr);
            b bVar = this.etD;
            int i = com.iqoption.withdraw.d.f.you_have_free_withdrawals_n1;
            Object[] objArr = new Object[1];
            Integer b = this.etD.etA;
            if (b == null) {
                b = Integer.valueOf(0);
            }
            objArr[0] = b;
            String string = bVar.getString(i, objArr);
            kotlin.jvm.internal.i.e(string, "getString(R.string.you_h…, (freePayoutLimit ?: 0))");
            b.c(this.etD).a(new com.iqoption.withdraw.c(string, iArr[0], iArr[1]));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawNavigatorFragment.kt */
    static final class e<T> implements Observer<String> {
        final /* synthetic */ b etD;

        e(b bVar) {
            this.etD = bVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            TextView textView = b.a(this.etD).eqc;
            kotlin.jvm.internal.i.e(textView, "binding.withdrawBalance");
            textView.setText(str);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/withdraw/InfoPopupParams;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawNavigatorFragment.kt */
    static final class f<T> implements Observer<com.iqoption.withdraw.c> {
        final /* synthetic */ b etD;
        final /* synthetic */ View etE;

        f(b bVar, View view) {
            this.etD = bVar;
            this.etE = view;
        }

        /* renamed from: b */
        public final void onChanged(com.iqoption.withdraw.c cVar) {
            com.iqoption.c d = this.etD.cyy;
            Activity r = com.iqoption.core.ext.a.r(this.etD);
            View view = this.etE;
            if (view != null) {
                d.a(r, (ViewGroup) view, cVar.getText(), cVar.getAnchorX(), cVar.getAnchorY());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public com.iqoption.core.ui.d.c KX() {
        return null;
    }

    public abstract void bdf();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ c c(b bVar) {
        c cVar = bVar.etv;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return cVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.etv = c.etF.bF(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.etw = (com.iqoption.withdraw.a.i) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.withdraw.d.e.fragment_withdraw_navigator, viewGroup, false, 4, null);
        com.iqoption.withdraw.a.i iVar = this.etw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return iVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Lb();
        aqx();
        FragmentManager u = com.iqoption.core.ext.a.u(this);
        com.iqoption.withdraw.fields.d dVar = (com.iqoption.withdraw.fields.d) u.findFragmentByTag(com.iqoption.withdraw.fields.d.TAG);
        if (dVar == null) {
            FragmentTransaction beginTransaction = u.beginTransaction();
            kotlin.jvm.internal.i.e(beginTransaction, "fm.beginTransaction()");
            this.etx = com.iqoption.withdraw.c.e.eti.bcZ();
            int i = com.iqoption.withdraw.d.d.withdrawMethodsContainer;
            com.iqoption.withdraw.c.e eVar = this.etx;
            if (eVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            beginTransaction.add(i, eVar, com.iqoption.withdraw.c.e.TAG);
            this.ety = com.iqoption.withdraw.fields.d.erB.bcs();
            i = com.iqoption.withdraw.d.d.withdrawFieldsContainer;
            com.iqoption.withdraw.fields.d dVar2 = this.ety;
            if (dVar2 == null) {
                kotlin.jvm.internal.i.lG("fieldsFragment");
            }
            beginTransaction.add(i, dVar2, com.iqoption.withdraw.fields.d.TAG);
            this.etz = l.esQ.bcQ();
            i = com.iqoption.withdraw.d.d.withdrawHistoryContainer;
            l lVar = this.etz;
            if (lVar == null) {
                kotlin.jvm.internal.i.lG("historyFragment");
            }
            beginTransaction.add(i, lVar, l.TAG);
            beginTransaction.commit();
        } else {
            Fragment findFragmentByTag = u.findFragmentByTag(com.iqoption.withdraw.c.e.TAG);
            if (findFragmentByTag != null) {
                this.etx = (com.iqoption.withdraw.c.e) findFragmentByTag;
                this.ety = dVar;
                Fragment findFragmentByTag2 = u.findFragmentByTag(l.TAG);
                if (findFragmentByTag2 != null) {
                    this.etz = (l) findFragmentByTag2;
                    bde();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.iqoption.withdraw.history.WithdrawHistoryFragment");
                }
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.withdraw.methods.WithdrawMethodsFragment");
        }
        com.iqoption.withdraw.c.e eVar2 = this.etx;
        if (eVar2 != null) {
            eVar2.a((a) this);
        }
        com.iqoption.withdraw.a.i iVar = this.etw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ImageView imageView = iVar.eqj.eqJ;
        kotlin.jvm.internal.i.e(imageView, "binding.withdrawToolbar.toolbarWithdrawInfo");
        imageView.setOnClickListener(new d(this));
        c cVar = this.etv;
        String str = "viewModel";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        cVar.bdg().observe(lifecycleOwner, new e(this));
        cVar = this.etv;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.bbW().observe(lifecycleOwner, new f(this, view));
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        return !this.cyy.zC() ? super.a(fragmentManager) : true;
    }

    public void onStop() {
        super.onStop();
        this.cyy.zC();
    }

    private final void bde() {
        com.iqoption.withdraw.g gVar = (com.iqoption.withdraw.g) alE().alH().findFragmentByTag(com.iqoption.withdraw.g.epj.Bx());
        if (gVar != null) {
            gVar.a(this);
        }
    }

    private final void Lb() {
        com.iqoption.withdraw.a.i iVar = this.etw;
        String str = "binding";
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = iVar.getRoot();
        String str2 = "binding.root";
        kotlin.jvm.internal.i.e(root, str2);
        ((ImageView) root.findViewById(com.iqoption.withdraw.d.d.toolbarBack)).setOnClickListener(new c(this));
        iVar = this.etw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        root = iVar.getRoot();
        kotlin.jvm.internal.i.e(root, str2);
        TextView textView = (TextView) root.findViewById(com.iqoption.withdraw.d.d.toolbarTitle);
        kotlin.jvm.internal.i.e(textView, "binding.root.toolbarTitle");
        textView.setText(getString(com.iqoption.withdraw.d.f.withdrawal));
    }

    public void bdd() {
        com.iqoption.core.d.a(com.iqoption.withdraw.d.f.unknown_error_occurred, 0, 2, null);
        back();
    }

    public void a(boolean z, Integer num, Integer num2) {
        this.etA = num;
        this.etB = num2;
        aqy();
        if (!(z || this.etx == null)) {
            FragmentTransaction beginTransaction = com.iqoption.core.ext.a.u(this).beginTransaction();
            com.iqoption.withdraw.c.e eVar = this.etx;
            if (eVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            beginTransaction = beginTransaction.remove(eVar);
            com.iqoption.withdraw.fields.d dVar = this.ety;
            if (dVar == null) {
                kotlin.jvm.internal.i.lG("fieldsFragment");
            }
            beginTransaction.remove(dVar).commitAllowingStateLoss();
            String string = getString(com.iqoption.withdraw.d.f.there_are_no_available_withdrawal_methods);
            kotlin.jvm.internal.i.e(string, "getString(R.string.there…lable_withdrawal_methods)");
            aI(null, string);
            bde();
        }
        com.iqoption.withdraw.a.i iVar = this.etw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        w wVar = iVar.eqj;
        kotlin.jvm.internal.i.e(wVar, "binding.withdrawToolbar");
        String str = "toolbar.toolbarWithdrawFee";
        if ((num2 != null ? num2.intValue() : 0) > 0) {
            TextView textView = wVar.eqI;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.ak(textView);
            textView = wVar.eqI;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(getString(com.iqoption.withdraw.d.f.free_withdrawals_left_n1, String.valueOf(r7)));
        } else {
            TextView textView2 = wVar.eqI;
            kotlin.jvm.internal.i.e(textView2, str);
            com.iqoption.core.ext.a.al(textView2);
        }
        String str2 = "toolbar.toolbarWithdrawInfo";
        ImageView imageView;
        if (num != null) {
            imageView = wVar.eqJ;
            kotlin.jvm.internal.i.e(imageView, str2);
            com.iqoption.core.ext.a.ak(imageView);
            return;
        }
        imageView = wVar.eqJ;
        kotlin.jvm.internal.i.e(imageView, str2);
        com.iqoption.core.ext.a.al(imageView);
    }

    public void LI() {
        back();
    }

    private final void aqx() {
        com.iqoption.withdraw.a.i iVar = this.etw;
        String str = "binding";
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        NestedScrollView nestedScrollView = iVar.eqd;
        kotlin.jvm.internal.i.e(nestedScrollView, "binding.withdrawContent");
        com.iqoption.core.ext.a.al(nestedScrollView);
        iVar = this.etw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = iVar.eqi;
        kotlin.jvm.internal.i.e(frameLayout, "binding.withdrawProgress");
        com.iqoption.core.ext.a.ak(frameLayout);
    }

    private final void aqy() {
        com.iqoption.withdraw.a.i iVar = this.etw;
        String str = "binding";
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        NestedScrollView nestedScrollView = iVar.eqd;
        kotlin.jvm.internal.i.e(nestedScrollView, "binding.withdrawContent");
        com.iqoption.core.ext.a.ak(nestedScrollView);
        iVar = this.etw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = iVar.eqi;
        kotlin.jvm.internal.i.e(frameLayout, "binding.withdrawProgress");
        com.iqoption.core.ext.a.al(frameLayout);
    }

    public final void aI(String str, String str2) {
        kotlin.jvm.internal.i.f(str2, "warning");
        alE().b(com.iqoption.withdraw.g.epj.a(str, str2), false);
    }

    public int KW() {
        return com.iqoption.withdraw.d.d.withdrawNavigatorOther;
    }
}

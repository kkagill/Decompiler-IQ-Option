package com.iqoption.withdraw.complete;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.animation.transitions.e;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.withdraw.d.f;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0014J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000¨\u0006'"}, bng = {"Lcom/iqoption/withdraw/complete/WithdrawCompleteFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "amount", "", "kotlin.jvm.PlatformType", "getAmount", "()Ljava/lang/String;", "amount$delegate", "Lkotlin/Lazy;", "binding", "Lcom/iqoption/withdraw/databinding/FragmentWithdrawCompleteBinding;", "success", "", "getSuccess", "()Z", "success$delegate", "viewModel", "Lcom/iqoption/withdraw/complete/WithdrawCompleteViewModel;", "close", "", "initToolbar", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "withdraw_release"})
/* compiled from: WithdrawCompleteFragment.kt */
public final class a extends d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "success", "getSuccess()Z")), k.a(new PropertyReference1Impl(k.G(a.class), "amount", "getAmount()Ljava/lang/String;"))};
    public static final a epK = new a();
    private HashMap apm;
    private b epG;
    private com.iqoption.withdraw.a.a epH;
    private final kotlin.d epI = g.c(new WithdrawCompleteFragment$success$2(this));
    private final kotlin.d epJ = g.c(new WithdrawCompleteFragment$amount$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, bng = {"Lcom/iqoption/withdraw/complete/WithdrawCompleteFragment$Companion;", "", "()V", "AMOUNT_PLACEHOLDER", "", "ARG_AMOUNT", "ARG_SUCCESS", "BALANCE_PLACEHOLDER", "TAG", "getTAG", "()Ljava/lang/String;", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "success", "", "amount", "withdraw_release"})
    /* compiled from: WithdrawCompleteFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final com.iqoption.core.ui.d.c i(boolean z, String str) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_SUCCESS", z);
            bundle.putString("ARG_AMOUNT", str);
            return new com.iqoption.core.ui.d.c(Bx(), a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: WithdrawCompleteFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            this.this$0.close();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "balance", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawCompleteFragment.kt */
    static final class c<T> implements Observer<String> {
        final /* synthetic */ a this$0;

        c(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            String a = this.this$0.VN();
            if (a == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            int k = com.iqoption.core.ext.a.k(com.iqoption.core.ext.a.q(this.this$0), com.iqoption.withdraw.d.a.green);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.this$0.getString(f.request_to_withdraw_accepted_n2, "__AMOUNT_PLACEHOLDER__", "__BALANCE_PLACEHOLDER__"));
            CharSequence charSequence = spannableStringBuilder;
            int a2 = v.a(charSequence, "__AMOUNT_PLACEHOLDER__", 0, false, 6, null);
            spannableStringBuilder.replace(a2, a2 + 22, a);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(k), a2, a.length() + a2, 17);
            int a3 = v.a(charSequence, "__BALANCE_PLACEHOLDER__", 0, false, 6, null);
            spannableStringBuilder.replace(a3, a3 + 23, str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(k), a3, str.length() + a3, 17);
            TextView textView = a.b(this.this$0).epO;
            kotlin.jvm.internal.i.e(textView, "binding.completeDescription");
            textView.setText(charSequence);
        }
    }

    private final boolean RD() {
        kotlin.d dVar = this.epI;
        j jVar = anY[0];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    private final String VN() {
        kotlin.d dVar = this.epJ;
        j jVar = anY[1];
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

    public static final /* synthetic */ com.iqoption.withdraw.a.a b(a aVar) {
        com.iqoption.withdraw.a.a aVar2 = aVar.epH;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aVar2;
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
        this.epG = b.epL.bA(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        com.iqoption.withdraw.a.a af = com.iqoption.withdraw.a.a.af(layoutInflater, viewGroup, false);
        kotlin.jvm.internal.i.e(af, "this");
        this.epH = af;
        kotlin.jvm.internal.i.e(af, "FragmentWithdrawComplete….apply { binding = this }");
        return af.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        int i3;
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Lb();
        if (RD()) {
            i = com.iqoption.withdraw.d.c.ic_withdraw_success;
            i2 = f.requested;
            i3 = com.iqoption.withdraw.d.a.withdraw_green;
        } else {
            i = com.iqoption.withdraw.d.c.ic_withdraw_error;
            i2 = f.failed;
            i3 = com.iqoption.withdraw.d.a.red;
        }
        com.iqoption.withdraw.a.a aVar = this.epH;
        String str = "binding";
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ViewDataBinding viewDataBinding = aVar;
        aVar.epP.setImageDrawable(com.iqoption.core.ext.a.e(viewDataBinding, i));
        aVar.epQ.setText(i2);
        aVar.epQ.setTextColor(com.iqoption.core.ext.a.a(viewDataBinding, i3));
        if (RD()) {
            b bVar = this.epG;
            if (bVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            bVar.bca().observe(this, new c(this));
            return;
        }
        com.iqoption.withdraw.a.a aVar2 = this.epH;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        aVar2.epO.setText(f.the_withdraw_was_unsuccessful);
    }

    private final void Lb() {
        com.iqoption.withdraw.a.a aVar = this.epH;
        String str = "binding";
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = aVar.getRoot();
        String str2 = "binding.root";
        kotlin.jvm.internal.i.e(root, str2);
        ((ImageView) root.findViewById(com.iqoption.withdraw.d.d.toolbarBack)).setOnClickListener(new b(this));
        aVar = this.epH;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        root = aVar.getRoot();
        kotlin.jvm.internal.i.e(root, str2);
        TextView textView = (TextView) root.findViewById(com.iqoption.withdraw.d.d.toolbarTitle);
        kotlin.jvm.internal.i.e(textView, "binding.root.toolbarTitle");
        textView.setText(getString(f.withdrawal));
    }

    /* Access modifiers changed, original: protected */
    public e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.bHB.e(this);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        close();
        return true;
    }

    private final void close() {
        com.iqoption.withdraw.d.b.etC.bE(this);
    }
}

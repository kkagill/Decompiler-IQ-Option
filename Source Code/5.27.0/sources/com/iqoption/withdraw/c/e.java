package com.iqoption.withdraw.c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView2;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.withdraw.response.m;
import com.iqoption.core.util.v;
import com.iqoption.withdraw.a.ai;
import com.iqoption.withdraw.a.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010\u00132\u0006\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001fH\u0016J\u001a\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u0016\u0010*\u001a\u00020\u001c2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006."}, bng = {"Lcom/iqoption/withdraw/methods/WithdrawMethodsFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/withdraw/databinding/FragmentWithdrawMethodsBinding;", "callbacks", "Lcom/iqoption/withdraw/navigator/MethodsCallback;", "getCallbacks", "()Lcom/iqoption/withdraw/navigator/MethodsCallback;", "setCallbacks", "(Lcom/iqoption/withdraw/navigator/MethodsCallback;)V", "data", "Lcom/iqoption/withdraw/methods/WithdrawMethodsData;", "restoredSelectedMethod", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "selectedMethod", "viewModel", "Lcom/iqoption/withdraw/methods/WithdrawMethodsViewModel;", "createMethodView", "Landroid/view/View;", "layoutInflater", "Landroid/view/LayoutInflater;", "enabledContainer", "Landroid/widget/LinearLayout;", "method", "mask", "", "highlightSelectedMethod", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "container", "Landroid/view/ViewGroup;", "onDataLoaded", "onSaveInstanceState", "outState", "onViewCreated", "view", "performMethodSelection", "showMethods", "methods", "", "Companion", "withdraw_release"})
/* compiled from: WithdrawMethodsFragment.kt */
public final class e extends com.iqoption.core.ui.fragment.d {
    public static final String TAG;
    public static final a eti = new a();
    private HashMap apm;
    private com.iqoption.core.microservices.withdraw.response.c esc;
    private g etc;
    private f etd;
    private d ete;
    private com.iqoption.core.microservices.withdraw.response.c etg;
    private com.iqoption.withdraw.d.a eth;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/withdraw/methods/WithdrawMethodsFragment$Companion;", "", "()V", "STATE_SELECTED_METHOD", "", "TAG", "newInstance", "Lcom/iqoption/withdraw/methods/WithdrawMethodsFragment;", "withdraw_release"})
    /* compiled from: WithdrawMethodsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final e bcZ() {
            return new e();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: WithdrawMethodsFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ com.iqoption.core.microservices.withdraw.response.c esa;
        final /* synthetic */ e etj;

        c(e eVar, com.iqoption.core.microservices.withdraw.response.c cVar) {
            this.etj = eVar;
            this.esa = cVar;
        }

        public final void onClick(View view) {
            this.etj.b(this.esa);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: WithdrawMethodsFragment.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ e etj;
        final /* synthetic */ String etk;

        d(e eVar, String str) {
            this.etj = eVar;
            this.etk = str;
        }

        public final void onClick(View view) {
            com.iqoption.withdraw.d.b.etC.a((Fragment) this.etj, null, this.etk);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "value", "Lcom/iqoption/withdraw/methods/WithdrawMethodsData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawMethodsFragment.kt */
    static final class b<T> implements Observer<d> {
        final /* synthetic */ e etj;

        b(e eVar) {
            this.etj = eVar;
        }

        /* renamed from: b */
        public final void onChanged(d dVar) {
            if (dVar != null) {
                int isEmpty = dVar.ajQ().isEmpty() ^ 1;
                com.iqoption.withdraw.d.a bcY = this.etj.bcY();
                if (bcY == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                bcY.a(isEmpty, dVar.bbS().ajM(), dVar.bbS().ajN());
                if (isEmpty != 0) {
                    this.etj.a(dVar);
                    return;
                }
                return;
            }
            com.iqoption.withdraw.d.a bcY2 = this.etj.bcY();
            if (bcY2 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            bcY2.bdd();
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

    static {
        String name = e.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public final void a(com.iqoption.withdraw.d.a aVar) {
        this.eth = aVar;
    }

    public final com.iqoption.withdraw.d.a bcY() {
        return this.eth;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.etg = bundle != null ? (com.iqoption.core.microservices.withdraw.response.c) bundle.getParcelable("STATE_SELECTED_METHOD") : null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.etc = (g) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.withdraw.d.e.fragment_withdraw_methods, viewGroup, false, 4, null);
        g gVar = this.etc;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return gVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.etd = f.etn.bD(this);
        f fVar = this.etd;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        fVar.o(true, true).observe(this, new b(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        com.iqoption.core.microservices.withdraw.response.c cVar = this.esc;
        if (cVar != null) {
            bundle.putParcelable("STATE_SELECTED_METHOD", cVar);
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARNING: Missing block: B:11:0x0030, code skipped:
            if (r4 != null) goto L_0x0057;
     */
    private final void a(com.iqoption.withdraw.c.d r7) {
        /*
        r6 = this;
        r6.ete = r7;
        r0 = r7.ajQ();
        r7 = r7.bcX();
        r1 = r6.esc;
        if (r1 == 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0011;
    L_0x000f:
        r1 = r6.etg;
    L_0x0011:
        r2 = 0;
        if (r1 == 0) goto L_0x0033;
    L_0x0014:
        r3 = r0;
        r3 = (java.lang.Iterable) r3;
        r3 = r3.iterator();
    L_0x001b:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x002f;
    L_0x0021:
        r4 = r3.next();
        r5 = r4;
        r5 = (com.iqoption.core.microservices.withdraw.response.c) r5;
        r5 = com.iqoption.core.microservices.withdraw.response.m.a(r5, r1);
        if (r5 == 0) goto L_0x001b;
    L_0x002e:
        goto L_0x0030;
    L_0x002f:
        r4 = r2;
    L_0x0030:
        if (r4 == 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0057;
    L_0x0033:
        r1 = r0;
        r1 = (java.lang.Iterable) r1;
        r1 = r1.iterator();
    L_0x003a:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0053;
    L_0x0040:
        r3 = r1.next();
        r4 = r3;
        r4 = (com.iqoption.core.microservices.withdraw.response.c) r4;
        r4 = r7.get(r4);
        if (r4 != 0) goto L_0x004f;
    L_0x004d:
        r4 = 1;
        goto L_0x0050;
    L_0x004f:
        r4 = 0;
    L_0x0050:
        if (r4 == 0) goto L_0x003a;
    L_0x0052:
        goto L_0x0054;
    L_0x0053:
        r3 = r2;
    L_0x0054:
        r1 = r3;
        r1 = (com.iqoption.core.microservices.withdraw.response.c) r1;
    L_0x0057:
        r6.bG(r0);
        if (r1 == 0) goto L_0x006b;
    L_0x005c:
        r7 = r6.esc;
        r7 = com.iqoption.core.microservices.withdraw.response.m.a(r1, r7);
        if (r7 != 0) goto L_0x0068;
    L_0x0064:
        r6.b(r1);
        goto L_0x006b;
    L_0x0068:
        r6.c(r1);
    L_0x006b:
        r2 = (com.iqoption.core.microservices.withdraw.response.c) r2;
        r6.etg = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.c.e.a(com.iqoption.withdraw.c.d):void");
    }

    private final void bG(List<? extends com.iqoption.core.microservices.withdraw.response.c> list) {
        LayoutInflater from = LayoutInflater.from(getContext());
        g gVar = this.etc;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = gVar.eqb;
        kotlin.jvm.internal.i.e(linearLayout, "binding.withdrawEnabledMethodsContainer");
        g gVar2 = this.etc;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = gVar2.getRoot();
        String str2 = "binding.root";
        kotlin.jvm.internal.i.e(root, str2);
        LinearLayout linearLayout2 = (LinearLayout) root.findViewById(com.iqoption.withdraw.d.d.withdrawDisabledMethodsContainer);
        linearLayout.removeAllViews();
        linearLayout2.removeAllViews();
        d dVar = this.ete;
        if (dVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        Map bcX = dVar.bcX();
        for (com.iqoption.core.microservices.withdraw.response.c cVar : list) {
            String str3 = (String) bcX.get(cVar);
            kotlin.jvm.internal.i.e(from, "layoutInflater");
            View a = a(from, linearLayout, cVar, dVar.VM().getMask());
            if (str3 == null) {
                ((CardView2) a.findViewById(com.iqoption.withdraw.d.d.withdrawMethodContainer)).setOnClickListener(new c(this, cVar));
                linearLayout.addView(a);
            } else {
                ((CardView2) a.findViewById(com.iqoption.withdraw.d.d.withdrawMethodContainer)).setOnClickListener(new d(this, str3));
                linearLayout2.addView(a);
            }
        }
        g gVar3 = this.etc;
        if (gVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root2 = gVar3.getRoot();
        kotlin.jvm.internal.i.e(root2, str2);
        LinearLayout linearLayout3 = (LinearLayout) root2.findViewById(com.iqoption.withdraw.d.d.withdrawDisabledLayout);
        kotlin.jvm.internal.i.e(linearLayout3, "binding.root.withdrawDisabledLayout");
        kotlin.jvm.internal.i.e(linearLayout2, "disabledContainer");
        linearLayout3.setVisibility(linearLayout2.getChildCount() > 0 ? 0 : 8);
    }

    private final View a(LayoutInflater layoutInflater, LinearLayout linearLayout, com.iqoption.core.microservices.withdraw.response.c cVar, String str) {
        ai ah = ai.ah(layoutInflater, linearLayout, false);
        kotlin.jvm.internal.i.e(ah, "WithdrawMethodCardLayout… enabledContainer, false)");
        View root = ah.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        root.setTag(new b(ah, cVar, str));
        return root;
    }

    private final void b(com.iqoption.core.microservices.withdraw.response.c cVar) {
        g gVar = this.etc;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        v.az(gVar.eqb);
        this.esc = cVar;
        c(cVar);
        gVar = this.etc;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar.eqb.requestFocus();
        f fVar = this.etd;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        d dVar = this.ete;
        if (dVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        fVar.a(dVar, cVar);
    }

    private final void c(com.iqoption.core.microservices.withdraw.response.c cVar) {
        g gVar = this.etc;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LinearLayout linearLayout = gVar.eqb;
        kotlin.jvm.internal.i.e(linearLayout, "binding.withdrawEnabledMethodsContainer");
        int i = 0;
        int childCount = linearLayout.getChildCount();
        while (i < childCount) {
            View childAt = linearLayout.getChildAt(i);
            kotlin.jvm.internal.i.e(childAt, Promotion.ACTION_VIEW);
            Object tag = childAt.getTag();
            if (tag != null) {
                int i2;
                b bVar = (b) tag;
                boolean a = m.a(bVar.bcf(), cVar);
                childAt = bVar.bcW().getRoot();
                kotlin.jvm.internal.i.e(childAt, "holder.binding.root");
                CardView2 cardView2 = (CardView2) childAt.findViewById(com.iqoption.withdraw.d.d.withdrawMethodContainer);
                kotlin.jvm.internal.i.e(cardView2, "cardView");
                cardView2.setCardElevation(a ? 0.0f : getResources().getDimension(com.iqoption.withdraw.d.b.withdraw_method_elevation));
                if (a) {
                    i2 = com.iqoption.withdraw.d.c.withdraw_method_selected;
                } else {
                    i2 = com.iqoption.withdraw.d.c.withdraw_method_normal;
                }
                cardView2.setForeground(com.iqoption.core.ext.a.e((Fragment) this, i2));
                i++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.withdraw.methods.MethodHolder");
            }
        }
    }
}

package com.iqoption.charttools.constructor;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.iqoption.core.util.v;
import java.util.HashMap;
import java.util.List;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\""}, bng = {"Lcom/iqoption/charttools/constructor/IndicatorSettingsFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/charttools/constructor/InputItemsAdapter$Callbacks;", "()V", "binding", "Lcom/iqoption/charttools/databinding/FragmentIndicatorSettingsBinding;", "inputData", "Lcom/iqoption/charttools/constructor/IndicatorSettingsInputData;", "getInputData", "()Lcom/iqoption/charttools/constructor/IndicatorSettingsInputData;", "isCustomTransitionsEnabled", "", "()Z", "viewModel", "Lcom/iqoption/charttools/constructor/IndicatorSettingsViewModel;", "eatFocus", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onItemHostRequest", "item", "Lcom/iqoption/charttools/constructor/InputHost;", "onItemSelectRequest", "Lcom/iqoption/charttools/constructor/InputSelect;", "onItemToggled", "Lcom/iqoption/charttools/constructor/InputGroupTitle;", "Companion", "techtools_release"})
/* compiled from: IndicatorSettingsFragment.kt */
public final class c extends com.iqoption.core.ui.fragment.d implements com.iqoption.charttools.constructor.r.a {
    public static final String TAG = c.class.getName();
    public static final a aED = new a();
    private e aEB;
    private com.iqoption.charttools.b.a aEC;
    private HashMap apm;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/charttools/constructor/IndicatorSettingsFragment$Companion;", "", "()V", "ARG_INPUT_DATA", "", "TAG", "kotlin.jvm.PlatformType", "makeArgs", "Landroid/os/Bundle;", "inputData", "Lcom/iqoption/charttools/constructor/IndicatorSettingsInputData;", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "newInstance", "Lcom/iqoption/charttools/constructor/IndicatorSettingsFragment;", "techtools_release"})
    /* compiled from: IndicatorSettingsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c a(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "inputData");
            return com.iqoption.core.ui.d.c.bJi.a(c.class, c(dVar));
        }

        public final c b(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "inputData");
            c cVar = new c();
            cVar.setArguments(c.aED.c(dVar));
            return cVar;
        }

        public final Bundle c(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "inputData");
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg.inputData", dVar);
            return bundle;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "newFocus", "onGlobalFocusChanged"})
    /* compiled from: IndicatorSettingsFragment.kt */
    static final class f implements OnGlobalFocusChangeListener {
        public static final f aEH = new f();

        f() {
        }

        public final void onGlobalFocusChanged(View view, View view2) {
            if (view2 != null && !(view2 instanceof EditText)) {
                v.a(view2.getContext(), view2);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n¸\u0006\u0000"}, bng = {"com/iqoption/charttools/constructor/IndicatorSettingsFragment$onCreateView$1$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "outputViewModel", "Lcom/iqoption/charttools/constructor/IndicatorOutputViewModel;", "getOutputViewModel", "()Lcom/iqoption/charttools/constructor/IndicatorOutputViewModel;", "onDelayClick", "", "v", "Landroid/view/View;", "techtools_release"})
    /* compiled from: IndicatorSettingsFragment.kt */
    public static final class b extends com.iqoption.core.ext.g {
        private final b aEE = b.aEA.f(com.iqoption.core.ext.a.r(this.aEF));
        final /* synthetic */ c aEF;
        final /* synthetic */ c aEG;

        b(c cVar, c cVar2) {
            this.aEF = cVar;
            this.aEG = cVar2;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            int id = view.getId();
            if (id == com.iqoption.charttools.n.g.outside || id == com.iqoption.charttools.n.g.btnBack) {
                this.aEF.back();
            } else if (id == com.iqoption.charttools.n.g.btnRestore) {
                c.a(this.aEF).MU();
            } else if (id == com.iqoption.charttools.n.g.btnApply) {
                c.a(this.aEF).a(this.aEE);
                com.iqoption.charttools.d.b.OY().c(this.aEF);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "title", "", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/charttools/constructor/IndicatorSettingsFragment$onCreateView$1$2"})
    /* compiled from: IndicatorSettingsFragment.kt */
    static final class c<T> implements Observer<String> {
        final /* synthetic */ c aEF;
        final /* synthetic */ c aEG;

        c(c cVar, c cVar2) {
            this.aEF = cVar;
            this.aEG = cVar2;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                TextView textView = c.b(this.aEF).alH;
                kotlin.jvm.internal.i.e(textView, "binding.title");
                textView.setText(str);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "isOpened", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/iqoption/charttools/constructor/IndicatorSettingsFragment$onCreateView$1$4"})
    /* compiled from: IndicatorSettingsFragment.kt */
    static final class d<T> implements Observer<Boolean> {
        final /* synthetic */ c aEF;
        final /* synthetic */ c aEG;

        d(c cVar, c cVar2) {
            this.aEF = cVar;
            this.aEG = cVar2;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                String str = "beginTransaction()";
                if (!bool.booleanValue()) {
                    Fragment findFragmentByTag = com.iqoption.core.ext.a.u(this.aEF).findFragmentByTag(v.aFO.Bx());
                    if (!(findFragmentByTag instanceof v)) {
                        findFragmentByTag = null;
                    }
                    v vVar = (v) findFragmentByTag;
                    if (vVar != null) {
                        FragmentManager u = com.iqoption.core.ext.a.u(this.aEF);
                        FragmentTransaction beginTransaction = u.beginTransaction();
                        kotlin.jvm.internal.i.e(beginTransaction, str);
                        beginTransaction.remove(vVar);
                        beginTransaction.commitAllowingStateLoss();
                        u.executePendingTransactions();
                    }
                } else if (com.iqoption.core.ext.a.u(this.aEF).findFragmentByTag(v.aFO.Bx()) == null) {
                    FragmentManager u2 = com.iqoption.core.ext.a.u(this.aEF);
                    FragmentTransaction beginTransaction2 = u2.beginTransaction();
                    kotlin.jvm.internal.i.e(beginTransaction2, str);
                    beginTransaction2.add(com.iqoption.charttools.n.g.content, new v(), v.aFO.Bx());
                    beginTransaction2.commitAllowingStateLoss();
                    u2.executePendingTransactions();
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "isOpened", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/iqoption/charttools/constructor/IndicatorSettingsFragment$onCreateView$1$5"})
    /* compiled from: IndicatorSettingsFragment.kt */
    static final class e<T> implements Observer<Boolean> {
        final /* synthetic */ c aEF;
        final /* synthetic */ c aEG;

        e(c cVar, c cVar2) {
            this.aEF = cVar;
            this.aEG = cVar2;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                String str = "beginTransaction()";
                if (!bool.booleanValue()) {
                    Fragment findFragmentByTag = com.iqoption.core.ext.a.u(this.aEF).findFragmentByTag(p.aFz.Bx());
                    if (!(findFragmentByTag instanceof p)) {
                        findFragmentByTag = null;
                    }
                    p pVar = (p) findFragmentByTag;
                    if (pVar != null) {
                        FragmentManager u = com.iqoption.core.ext.a.u(this.aEF);
                        FragmentTransaction beginTransaction = u.beginTransaction();
                        kotlin.jvm.internal.i.e(beginTransaction, str);
                        beginTransaction.remove(pVar);
                        beginTransaction.commitAllowingStateLoss();
                        u.executePendingTransactions();
                    }
                } else if (com.iqoption.core.ext.a.u(this.aEF).findFragmentByTag(p.aFz.Bx()) == null) {
                    FragmentManager u2 = com.iqoption.core.ext.a.u(this.aEF);
                    FragmentTransaction beginTransaction2 = u2.beginTransaction();
                    kotlin.jvm.internal.i.e(beginTransaction2, str);
                    beginTransaction2.add(com.iqoption.charttools.n.g.content, new p(), p.aFz.Bx());
                    beginTransaction2.commitAllowingStateLoss();
                    u2.executePendingTransactions();
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "items", "", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: IndicatorSettingsFragment.kt */
    static final class g<T> implements Observer<List<? extends f>> {
        final /* synthetic */ r aEI;

        g(r rVar) {
            this.aEI = rVar;
        }

        /* renamed from: u */
        public final void onChanged(List<? extends f> list) {
            if (list != null) {
                com.iqoption.core.ui.widget.recyclerview.adapter.a.a(this.aEI, list, null, 2, null);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "isEnabled", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: IndicatorSettingsFragment.kt */
    static final class h<T> implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.charttools.b.a aEJ;

        h(com.iqoption.charttools.b.a aVar) {
            this.aEJ = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                TextView textView = this.aEJ.aHL;
                kotlin.jvm.internal.i.e(textView, "btnRestore");
                textView.setEnabled(booleanValue);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "isEnabled", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: IndicatorSettingsFragment.kt */
    static final class i<T> implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.charttools.b.a aEJ;

        i(com.iqoption.charttools.b.a aVar) {
            this.aEJ = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                TextView textView = this.aEJ.aHJ;
                kotlin.jvm.internal.i.e(textView, "btnApply");
                textView.setEnabled(booleanValue);
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public boolean ME() {
        return true;
    }

    public static final /* synthetic */ com.iqoption.charttools.b.a b(c cVar) {
        com.iqoption.charttools.b.a aVar = cVar.aEC;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aVar;
    }

    private final d MD() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this).getParcelable("arg.inputData");
        if (parcelable == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return (d) parcelable;
    }

    public void a(n nVar) {
        kotlin.jvm.internal.i.f(nVar, "item");
        MF();
        e eVar = this.aEB;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        eVar.b(nVar);
    }

    public void a(u uVar) {
        kotlin.jvm.internal.i.f(uVar, "item");
        MF();
        w f = w.aFS.f(this);
        e eVar = this.aEB;
        String str = "viewModel";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        f.a(eVar, uVar);
        e eVar2 = this.aEB;
        if (eVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar2.MQ();
    }

    public void a(o oVar) {
        kotlin.jvm.internal.i.f(oVar, "item");
        MF();
        q e = q.aFF.e(this);
        e eVar = this.aEB;
        String str = "viewModel";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        e.a(eVar, oVar);
        e eVar2 = this.aEB;
        if (eVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar2.MS();
    }

    private final void MF() {
        com.iqoption.charttools.b.a aVar = this.aEC;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        aVar.alH.requestFocus();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.aEC = (com.iqoption.charttools.b.a) com.iqoption.core.ext.a.a(layoutInflater, com.iqoption.charttools.n.h.fragment_indicator_settings, viewGroup, false, 4, null);
        c cVar = this;
        com.iqoption.charttools.b.a aVar = this.aEC;
        String str = "binding";
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        r rVar = new r(cVar);
        RecyclerView recyclerView = aVar.aHO;
        String str2 = "inputList";
        kotlin.jvm.internal.i.e(recyclerView, str2);
        recyclerView.setAdapter(rVar);
        aVar.aHO.addItemDecoration(new s(rVar));
        aVar.aHO.addOnScrollListener(new com.iqoption.core.ui.widget.recyclerview.b(null, 1, null));
        recyclerView = aVar.aHO;
        kotlin.jvm.internal.i.e(recyclerView, str2);
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(layoutManager, "inputList.layoutManager!!");
        layoutManager.setItemPrefetchEnabled(false);
        View view = aVar.aHN;
        kotlin.jvm.internal.i.e(view, "content");
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(f.aEH);
        b bVar = new b(this, cVar);
        FrameLayout frameLayout = aVar.aHP;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(bVar);
        }
        OnClickListener onClickListener = bVar;
        aVar.aHK.setOnClickListener(onClickListener);
        aVar.aHL.setOnClickListener(onClickListener);
        aVar.aHJ.setOnClickListener(onClickListener);
        this.aEB = e.aFf.a(cVar, MD());
        e eVar = this.aEB;
        str2 = "viewModel";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        a(eVar.MK(), new c(this, cVar));
        eVar = this.aEB;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        a(eVar.ML(), new g(rVar));
        e eVar2 = this.aEB;
        if (eVar2 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        a(eVar2.MO(), new d(this, cVar));
        eVar2 = this.aEB;
        if (eVar2 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        a(eVar2.MP(), new e(this, cVar));
        e eVar3 = this.aEB;
        if (eVar3 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        a(eVar3.MM(), new h(aVar));
        eVar3 = this.aEB;
        if (eVar3 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        a(eVar3.MN(), new i(aVar));
        com.iqoption.charttools.b.a aVar2 = this.aEC;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return aVar2.getRoot();
    }

    public void onDestroyView() {
        super.onDestroyView();
        v.j(getActivity());
        Bj();
    }
}

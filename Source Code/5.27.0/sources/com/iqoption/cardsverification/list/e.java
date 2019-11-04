package com.iqoption.cardsverification.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.cardsverification.g.f;
import com.iqoption.core.ext.g;
import com.iqoption.core.util.n;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0017H\u0016J\u001a\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002J\b\u0010%\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u0006'"}, bng = {"Lcom/iqoption/cardsverification/list/VerifyCardsFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "adapter", "Lcom/iqoption/cardsverification/list/VerifyCardsAdapter;", "binding", "Lcom/iqoption/cardsverification/databinding/FragmentVerifyCardsBinding;", "clickedCard", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "defaultColor", "", "getDefaultColor", "()I", "defaultColor$delegate", "Lkotlin/Lazy;", "selectedColor", "getSelectedColor", "selectedColor$delegate", "viewModel", "Lcom/iqoption/cardsverification/list/VerifyCardsViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewCreated", "view", "showContent", "showEmpty", "showError", "showProgress", "Companion", "cardsverification_release"})
/* compiled from: VerifyCardsFragment.kt */
public final class e extends com.iqoption.core.ui.fragment.d {
    public static final String TAG;
    public static final a aBy = new a();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(e.class), "defaultColor", "getDefaultColor()I")), k.a(new PropertyReference1Impl(k.G(e.class), "selectedColor", "getSelectedColor()I"))};
    private com.iqoption.cardsverification.a.c aBs;
    private f aBt;
    private d aBu;
    private com.iqoption.core.microservices.billing.verification.response.c aBv;
    private final kotlin.d aBw = g.c(new VerifyCardsFragment$defaultColor$2(this));
    private final kotlin.d aBx = g.c(new VerifyCardsFragment$selectedColor$2(this));
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/cardsverification/list/VerifyCardsFragment$Companion;", "", "()V", "STATE_CLICKED_CARD_ID", "", "TAG", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "cardsverification_release"})
    /* compiled from: VerifyCardsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c Lj() {
            return new com.iqoption.core.ui.d.c(e.TAG, e.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: VerifyCardsFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ e this$0;

        b(e eVar) {
            this.this$0 = eVar;
        }

        public final void onClick(View view) {
            this.this$0.back();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/cardsverification/list/VerifyCardsFragment$onViewCreated$2", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "cardsverification_release"})
    /* compiled from: VerifyCardsFragment.kt */
    public static final class c extends g {
        final /* synthetic */ e this$0;

        c(e eVar) {
            this.this$0 = eVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            Object tag = view.getTag();
            if (tag != null) {
                com.iqoption.core.microservices.billing.verification.response.c cVar = (com.iqoption.core.microservices.billing.verification.response.c) tag;
                this.this$0.aBv = cVar;
                com.iqoption.cardsverification.b.aAo.a((Fragment) this.this$0, cVar);
                view.setBackgroundColor(this.this$0.getSelectedColor());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.billing.verification.response.VerifyCard");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "value", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "onChanged"})
    /* compiled from: VerifyCardsFragment.kt */
    static final class d<T> implements Observer<List<? extends com.iqoption.core.microservices.billing.verification.response.c>> {
        final /* synthetic */ e this$0;

        d(e eVar) {
            this.this$0 = eVar;
        }

        /* renamed from: u */
        public final void onChanged(List<com.iqoption.core.microservices.billing.verification.response.c> list) {
            if (list == null) {
                this.this$0.Lg();
            } else if (list.isEmpty()) {
                this.this$0.Lh();
            } else {
                this.this$0.Li();
                e.f(this.this$0).L(list);
                com.iqoption.core.microservices.billing.verification.response.c a = this.this$0.aBv;
                if (a != null) {
                    e.f(this.this$0).f(a);
                }
                this.this$0.aBv = (com.iqoption.core.microservices.billing.verification.response.c) null;
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "onBackStackChanged"})
    /* compiled from: VerifyCardsFragment.kt */
    static final class e implements OnBackStackChangedListener {
        final /* synthetic */ e this$0;

        e(e eVar) {
            this.this$0 = eVar;
        }

        public final void onBackStackChanged() {
            FragmentManager fragmentManager = this.this$0.getFragmentManager();
            if (fragmentManager != null && n.bQH.a(fragmentManager, e.TAG)) {
                e.g(this.this$0).Lm();
            }
        }
    }

    private final int getDefaultColor() {
        kotlin.d dVar = this.aBw;
        j jVar = anY[0];
        return ((Number) dVar.getValue()).intValue();
    }

    private final int getSelectedColor() {
        kotlin.d dVar = this.aBx;
        j jVar = anY[1];
        return ((Number) dVar.getValue()).intValue();
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

    public static final /* synthetic */ d f(e eVar) {
        d dVar = eVar.aBu;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        return dVar;
    }

    public static final /* synthetic */ f g(e eVar) {
        f fVar = eVar.aBt;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return fVar;
    }

    static {
        String name = e.class.getName();
        kotlin.jvm.internal.i.e(name, "VerifyCardsFragment::class.java.name");
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.aBt = f.aBB.d(com.iqoption.core.ext.a.r(this));
        if (bundle != null) {
            this.aBv = (com.iqoption.core.microservices.billing.verification.response.c) bundle.getParcelable("STATE_CLICKED_CARD_ID");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.aBs = (com.iqoption.cardsverification.a.c) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.cardsverification.g.e.fragment_verify_cards, viewGroup, false, 4, null);
        com.iqoption.cardsverification.a.c cVar = this.aBs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return cVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.cardsverification.a.c cVar = this.aBs;
        String str = "binding";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        Toolbar toolbar = cVar.aAz.toolbar;
        kotlin.jvm.internal.i.e(toolbar, "binding.verifyCardsToolbar.toolbar");
        com.iqoption.cardsverification.j jVar = com.iqoption.cardsverification.j.aAu;
        FragmentActivity activity = getActivity();
        if (!(activity instanceof AppCompatActivity)) {
            activity = null;
        }
        jVar.a((AppCompatActivity) activity, toolbar, f.bank_cards);
        toolbar.setNavigationOnClickListener(new b(this));
        cVar = this.aBs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = cVar.aAy;
        kotlin.jvm.internal.i.e(recyclerView, "binding.verifyCardsRecyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.aBu = new d(com.iqoption.core.ext.a.q(this), getDefaultColor(), getSelectedColor(), new c(this));
        d dVar = this.aBu;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        recyclerView.setAdapter(dVar);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), 1);
        dividerItemDecoration.setDrawable(com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), com.iqoption.cardsverification.g.c.separator_grey_transparent));
        recyclerView.addItemDecoration(dividerItemDecoration);
        Lf();
        f fVar = this.aBt;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        fVar.Ll().observe(this, new d(this));
        com.iqoption.core.ext.a.t(this).addOnBackStackChangedListener(new e(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        com.iqoption.core.microservices.billing.verification.response.c cVar = this.aBv;
        if (cVar != null) {
            bundle.putParcelable("STATE_CLICKED_CARD_ID", cVar);
        }
        super.onSaveInstanceState(bundle);
    }

    private final void Lf() {
        com.iqoption.cardsverification.a.c cVar = this.aBs;
        String str = "binding";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = cVar.aAx;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.verifyCardsProgress");
        contentLoadingProgressBar.setVisibility(0);
        cVar = this.aBs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = cVar.aAw;
        kotlin.jvm.internal.i.e(textView, "binding.verifyCardsErrorTextView");
        com.iqoption.core.ext.a.al(textView);
        cVar = this.aBs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = cVar.aAy;
        kotlin.jvm.internal.i.e(recyclerView, "binding.verifyCardsRecyclerView");
        com.iqoption.core.ext.a.al(recyclerView);
    }

    private final void Lg() {
        com.iqoption.cardsverification.a.c cVar = this.aBs;
        String str = "binding";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = cVar.aAx;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.verifyCardsProgress");
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        cVar = this.aBs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = cVar.aAw;
        kotlin.jvm.internal.i.e(textView, "binding.verifyCardsErrorTextView");
        com.iqoption.core.ext.a.ak(textView);
        cVar = this.aBs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = cVar.aAy;
        kotlin.jvm.internal.i.e(recyclerView, "binding.verifyCardsRecyclerView");
        com.iqoption.core.ext.a.al(recyclerView);
        cVar = this.aBs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aAw.setText(f.unknown_error_occurred);
    }

    private final void Lh() {
        com.iqoption.cardsverification.a.c cVar = this.aBs;
        String str = "binding";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = cVar.aAx;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.verifyCardsProgress");
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        cVar = this.aBs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = cVar.aAw;
        kotlin.jvm.internal.i.e(textView, "binding.verifyCardsErrorTextView");
        com.iqoption.core.ext.a.ak(textView);
        cVar = this.aBs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = cVar.aAy;
        kotlin.jvm.internal.i.e(recyclerView, "binding.verifyCardsRecyclerView");
        com.iqoption.core.ext.a.al(recyclerView);
        cVar = this.aBs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aAw.setText(f.you_have_no_added_cards);
    }

    private final void Li() {
        com.iqoption.cardsverification.a.c cVar = this.aBs;
        String str = "binding";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = cVar.aAx;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.verifyCardsProgress");
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        cVar = this.aBs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = cVar.aAw;
        kotlin.jvm.internal.i.e(textView, "binding.verifyCardsErrorTextView");
        com.iqoption.core.ext.a.al(textView);
        cVar = this.aBs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = cVar.aAy;
        kotlin.jvm.internal.i.e(recyclerView, "binding.verifyCardsRecyclerView");
        com.iqoption.core.ext.a.ak(recyclerView);
    }
}

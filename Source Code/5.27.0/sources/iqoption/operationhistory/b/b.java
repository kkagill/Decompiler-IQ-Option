package iqoption.operationhistory.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.transaction.Transaction;
import com.iqoption.j.a.g;
import com.iqoption.j.c.e;
import com.iqoption.j.c.f;
import iqoption.operationhistory.OperationViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\t\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0014J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u001a\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002J\u001e\u0010!\u001a\u00020\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006*"}, bng = {"Liqoption/operationhistory/result/OperationSearchResultFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/operationhistory/databinding/FragmentOperationSearchResultBinding;", "currentlyLoading", "", "hasMore", "listListener", "iqoption/operationhistory/result/OperationSearchResultFragment$listListener$1", "Liqoption/operationhistory/result/OperationSearchResultFragment$listListener$1;", "resultAdapter", "Liqoption/operationhistory/result/OperationSearchResultAdapter;", "viewModel", "Liqoption/operationhistory/OperationViewModel;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "", "outState", "onViewCreated", "view", "performSearch", "offset", "", "setItems", "items", "", "Lcom/iqoption/core/microservices/transaction/Transaction;", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "toolbarTitle", "Landroid/widget/TextView;", "Companion", "operationhistory_release"})
/* compiled from: OperationSearchResultFragment.kt */
public final class b extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = "javaClass";
    public static final a eVl = new a();
    private HashMap apm;
    private boolean btw = true;
    private boolean cPi;
    private OperationViewModel eUL;
    private g eVi;
    private a eVj;
    private final b eVk = new b(this);

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Liqoption/operationhistory/result/OperationSearchResultFragment$Companion;", "", "()V", "INITIAL_SEARCH_STATE_DONE", "", "TAG", "VISIBLE_THREAD_HOLD", "", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "operationhistory_release"})
    /* compiled from: OperationSearchResultFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c Lj() {
            return new com.iqoption.core.ui.d.c(b.TAG, b.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, bng = {"iqoption/operationhistory/result/OperationSearchResultFragment$listListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "operationhistory_release"})
    /* compiled from: OperationSearchResultFragment.kt */
    public static final class b extends OnScrollListener {
        final /* synthetic */ b eVm;

        b(b bVar) {
            this.eVm = bVar;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
            i = recyclerView.getChildCount();
            if (i != 0 && recyclerView.getAdapter() != null && this.eVm.btw) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i - 1));
                if (!this.eVm.cPi && childAdapterPosition > b.d(this.eVm).getItemCount() - 15) {
                    b bVar = this.eVm;
                    bVar.jH(b.d(bVar).getItemCount());
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ b eVm;

        public c(b bVar) {
            this.eVm = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.ext.a.r(this.eVm).onBackPressed();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "data", "Liqoption/operationhistory/OperationViewModel$OperationsResult;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: OperationSearchResultFragment.kt */
    static final class d<T> implements Observer<iqoption.operationhistory.OperationViewModel.d> {
        final /* synthetic */ b eVm;

        d(b bVar) {
            this.eVm = bVar;
        }

        /* renamed from: a */
        public final void onChanged(iqoption.operationhistory.OperationViewModel.d dVar) {
            String str = "binding.notFound";
            String str2 = "binding.operationHistoryResultList";
            RecyclerView recyclerView;
            LinearLayout linearLayout;
            if (dVar == null) {
                recyclerView = b.a(this.eVm).dKd;
                kotlin.jvm.internal.i.e(recyclerView, str2);
                recyclerView.setVisibility(8);
                linearLayout = b.a(this.eVm).dKc;
                kotlin.jvm.internal.i.e(linearLayout, str);
                linearLayout.setVisibility(0);
                this.eVm.cPi = false;
                return;
            }
            if (dVar.bna() == 0) {
                b.a(this.eVm).bZl.hide();
                if (dVar.getItems().isEmpty()) {
                    recyclerView = b.a(this.eVm).dKd;
                    kotlin.jvm.internal.i.e(recyclerView, str2);
                    recyclerView.setVisibility(8);
                    linearLayout = b.a(this.eVm).dKc;
                    kotlin.jvm.internal.i.e(linearLayout, str);
                    linearLayout.setVisibility(0);
                } else {
                    this.eVm.a(dVar.getItems(), dVar.VM());
                    this.eVm.btw = dVar.adP();
                }
            } else {
                this.eVm.a(dVar.getItems(), dVar.VM());
                this.eVm.btw = dVar.adP();
            }
            this.eVm.cPi = false;
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

    public static final /* synthetic */ g a(b bVar) {
        g gVar = bVar.eVi;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return gVar;
    }

    public static final /* synthetic */ a d(b bVar) {
        a aVar = bVar.eVj;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("resultAdapter");
        }
        return aVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.eVi = (g) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_operation_search_result, viewGroup, false, 4, null);
        this.eUL = OperationViewModel.eUW.bG(this);
        this.eVj = new a();
        g gVar = this.eVi;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = gVar.dKe.cCu;
        kotlin.jvm.internal.i.e(imageView, "binding.operationHistoryResultToolbar.toolbarBack");
        imageView.setOnClickListener(new c(this));
        bnb().setText(f.search);
        gVar = this.eVi;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = gVar.dKd;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        a aVar = this.eVj;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("resultAdapter");
        }
        recyclerView.setAdapter(aVar);
        recyclerView.addOnScrollListener(this.eVk);
        recyclerView.addItemDecoration(new com.iqoption.core.ui.widget.recyclerview.d(com.iqoption.core.ext.a.q(this).getResources().getDimensionPixelOffset(com.iqoption.j.c.b.dp1)));
        gVar = this.eVi;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return gVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        if (bundle == null || !bundle.getBoolean("initial_done_state", false)) {
            a(this, 0, 1, null);
        }
        bnb().setText(f.operation_history);
        OperationViewModel operationViewModel = this.eUL;
        if (operationViewModel == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        operationViewModel.bmT().observe(this, new d(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        a aVar = this.eVj;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("resultAdapter");
        }
        bundle.putBoolean("initial_done_state", aVar.getItemCount() != 0);
    }

    static /* synthetic */ void a(b bVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        bVar.jH(i);
    }

    private final void jH(int i) {
        if (i == 0) {
            g gVar = this.eVi;
            if (gVar == null) {
                kotlin.jvm.internal.i.lG("binding");
            }
            gVar.bZl.show();
        }
        OperationViewModel operationViewModel = this.eUL;
        if (operationViewModel == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        operationViewModel.jH(i);
    }

    private final void a(List<Transaction> list, com.iqoption.core.microservices.configuration.a.d dVar) {
        a aVar = this.eVj;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("resultAdapter");
        }
        Iterable<Transaction> iterable = list;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (Transaction eVar : iterable) {
            arrayList.add(new e(eVar, dVar));
        }
        aVar.aG((List) arrayList);
    }

    private final TextView bnb() {
        g gVar = this.eVi;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = gVar.dKe.dKg;
        kotlin.jvm.internal.i.e(textView, "binding.operationHistory…bar.operationHistoryTitle");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.bHB.e(this);
    }
}

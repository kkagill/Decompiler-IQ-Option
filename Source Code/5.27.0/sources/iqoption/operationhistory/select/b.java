package iqoption.operationhistory.select;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.j.c.e;
import com.iqoption.j.c.f;
import iqoption.operationhistory.OperationViewModel;
import iqoption.operationhistory.OperationViewModel.FilterType;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0014J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Liqoption/operationhistory/select/SelectOptionsFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/operationhistory/databinding/FragmentOperationHistoryOptionsBinding;", "viewModel", "Liqoption/operationhistory/OperationViewModel;", "applyListTitle", "", "filterType", "Liqoption/operationhistory/OperationViewModel$FilterType;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "operationhistory_release"})
/* compiled from: SelectOptionsFragment.kt */
public final class b extends d {
    private static final String TAG = "javaClass";
    public static final a eVx = new a();
    private HashMap apm;
    private OperationViewModel eUL;
    private com.iqoption.j.a.c eVw;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, bng = {"Liqoption/operationhistory/select/SelectOptionsFragment$Companion;", "", "()V", "ARG_FILTER_TYPE", "", "TAG", "getTAG", "()Ljava/lang/String;", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "filterType", "Liqoption/operationhistory/OperationViewModel$FilterType;", "operationhistory_release"})
    /* compiled from: SelectOptionsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }

        public final com.iqoption.core.ui.d.c g(FilterType filterType) {
            FilterType filterType2 = filterType;
            kotlin.jvm.internal.i.f(filterType2, "filterType");
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARG_FILTER_TYPE", filterType2);
            return new com.iqoption.core.ui.d.c(Bx(), b.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ b this$0;

        public b(b bVar) {
            this.this$0 = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.ext.a.r(this.this$0).onBackPressed();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Liqoption/operationhistory/OperationViewModel$FilterType;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: SelectOptionsFragment.kt */
    static final class c<T> implements Observer<FilterType> {
        final /* synthetic */ FilterType $filterType;
        final /* synthetic */ a eVy;

        c(FilterType filterType, a aVar) {
            this.$filterType = filterType;
            this.eVy = aVar;
        }

        /* renamed from: c */
        public final void onChanged(FilterType filterType) {
            if (filterType == this.$filterType) {
                this.eVy.notifyDataSetChanged();
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

    public static final /* synthetic */ OperationViewModel a(b bVar) {
        OperationViewModel operationViewModel = bVar.eUL;
        if (operationViewModel == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return operationViewModel;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.eUL = OperationViewModel.eUW.bG(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.eVw = (com.iqoption.j.a.c) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_operation_history_options, viewGroup, false, 4, null);
        com.iqoption.j.a.c cVar = this.eVw;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return cVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Serializable serializable = com.iqoption.core.ext.a.s(this).getSerializable("ARG_FILTER_TYPE");
        if (serializable != null) {
            FilterType filterType = (FilterType) serializable;
            f(filterType);
            com.iqoption.j.a.c cVar = this.eVw;
            String str = "binding";
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            ImageView imageView = cVar.dKa.cCu;
            kotlin.jvm.internal.i.e(imageView, "binding.operationOptionsToolbar.toolbarBack");
            imageView.setOnClickListener(new b(this));
            OperationViewModel operationViewModel = this.eUL;
            String str2 = "viewModel";
            if (operationViewModel == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            iqoption.operationhistory.OperationViewModel.b e = operationViewModel.e(filterType);
            OperationViewModel operationViewModel2 = this.eUL;
            if (operationViewModel2 == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            a aVar = new a(operationViewModel2.a(e), e.bmW(), new SelectOptionsFragment$onViewCreated$selectionAdapter$1(this, filterType));
            cVar = this.eVw;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            RecyclerView recyclerView = cVar.dJZ;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(aVar);
            recyclerView.addItemDecoration(new com.iqoption.core.ui.widget.recyclerview.d(com.iqoption.core.ext.a.q(this).getResources().getDimensionPixelOffset(com.iqoption.j.c.b.dp1)));
            operationViewModel = this.eUL;
            if (operationViewModel == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            operationViewModel.bmU().observe(this, new c(filterType, aVar));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type iqoption.operationhistory.OperationViewModel.FilterType");
    }

    private final void f(FilterType filterType) {
        int i = c.aob[filterType.ordinal()];
        if (i == 1) {
            i = f.date;
        } else if (i == 2) {
            i = f.operation;
        } else if (i == 3) {
            i = f.status;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        com.iqoption.j.a.c cVar = this.eVw;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        cVar.dKa.dKg.setText(i);
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.bHB.e(this);
    }
}

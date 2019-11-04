package iqoption.operationhistory;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import iqoption.operationhistory.OperationViewModel.FilterType;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0017J\b\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Liqoption/operationhistory/OperationHistoryFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/operationhistory/databinding/FragmentOperationHistoryBinding;", "viewModel", "Liqoption/operationhistory/OperationViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "performSearch", "selectOptions", "filterType", "Liqoption/operationhistory/OperationViewModel$FilterType;", "updateSelectionTextForType", "Companion", "operationhistory_release"})
/* compiled from: OperationHistoryFragment.kt */
public final class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a eUN = new a();
    private HashMap apm;
    private OperationViewModel eUL;
    private com.iqoption.j.a.a eUM;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Liqoption/operationhistory/OperationHistoryFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "operationhistory_release"})
    /* compiled from: OperationHistoryFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final com.iqoption.core.ui.d.c Lj() {
            return new com.iqoption.core.ui.d.c(Bx(), a.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "iqoption/operationhistory/OperationHistoryFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends com.iqoption.core.ext.g {
        final /* synthetic */ a eUO;

        public b(a aVar) {
            this.eUO = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.ext.a.r(this.eUO).onBackPressed();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "iqoption/operationhistory/OperationHistoryFragment$$special$$inlined$setOnDelayedClickListener$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ a eUO;

        public c(a aVar) {
            this.eUO = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.eUO.bmS();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "iqoption/operationhistory/OperationHistoryFragment$$special$$inlined$setOnDelayedClickListener$3"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends com.iqoption.core.ext.g {
        final /* synthetic */ a eUO;

        public d(a aVar) {
            this.eUO = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.eUO.b(FilterType.OPERATION);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "iqoption/operationhistory/OperationHistoryFragment$$special$$inlined$setOnDelayedClickListener$4"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends com.iqoption.core.ext.g {
        final /* synthetic */ a eUO;

        public e(a aVar) {
            this.eUO = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.eUO.b(FilterType.STATUS);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "iqoption/operationhistory/OperationHistoryFragment$$special$$inlined$setOnDelayedClickListener$5"})
    /* compiled from: AndroidExtensions.kt */
    public static final class f extends com.iqoption.core.ext.g {
        final /* synthetic */ a eUO;

        public f(a aVar) {
            this.eUO = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.eUO.b(FilterType.DATE);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "filterType", "Liqoption/operationhistory/OperationViewModel$FilterType;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: OperationHistoryFragment.kt */
    static final class g<T> implements Observer<FilterType> {
        final /* synthetic */ a eUO;

        g(a aVar) {
            this.eUO = aVar;
        }

        /* renamed from: c */
        public final void onChanged(FilterType filterType) {
            if (filterType != null) {
                this.eUO.a(filterType);
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

    static {
        String name = a.class.getName();
        kotlin.jvm.internal.i.e(name, "OperationHistoryFragment::class.java.name");
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.eUL = OperationViewModel.eUW.bG(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.eUM = (com.iqoption.j.a.a) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.j.c.e.fragment_operation_history, viewGroup, false, 4, null);
        com.iqoption.j.a.a aVar = this.eUM;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aVar.getRoot();
    }

    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.j.a.a aVar = this.eUM;
        String str = "binding";
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        com.iqoption.j.a.i iVar = aVar.dJW;
        ImageView imageView = iVar.cCu;
        kotlin.jvm.internal.i.e(imageView, "toolbarBack");
        imageView.setOnClickListener(new b(this));
        iVar.dKg.setText(com.iqoption.j.c.f.operation_history);
        TextView textView = iVar.dKf;
        String str2 = "operationHistoryApply";
        kotlin.jvm.internal.i.e(textView, str2);
        com.iqoption.core.ext.a.ak(textView);
        TextView textView2 = iVar.dKf;
        kotlin.jvm.internal.i.e(textView2, str2);
        textView2.setOnClickListener(new c(this));
        aVar = this.eUM;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = aVar.dJX;
        kotlin.jvm.internal.i.e(linearLayout, "operationHistoryType");
        linearLayout.setOnClickListener(new d(this));
        linearLayout = aVar.dJU;
        kotlin.jvm.internal.i.e(linearLayout, "operationHistoryStatus");
        linearLayout.setOnClickListener(new e(this));
        LinearLayout linearLayout2 = aVar.dJR;
        kotlin.jvm.internal.i.e(linearLayout2, "operationHistoryDate");
        linearLayout2.setOnClickListener(new f(this));
        a(FilterType.OPERATION);
        a(FilterType.STATUS);
        a(FilterType.DATE);
        OperationViewModel operationViewModel = this.eUL;
        if (operationViewModel == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        operationViewModel.bmU().observe(this, new g(this));
    }

    private final void a(FilterType filterType) {
        OperationViewModel operationViewModel = this.eUL;
        if (operationViewModel == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        String d = operationViewModel.d(filterType);
        int i = b.aob[filterType.ordinal()];
        String str = "binding";
        com.iqoption.j.a.a aVar;
        TextView textView;
        if (i == 1) {
            aVar = this.eUM;
            if (aVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = aVar.dJY;
            kotlin.jvm.internal.i.e(textView, "binding.operationHistoryTypeValue");
            textView.setText(d);
        } else if (i == 2) {
            aVar = this.eUM;
            if (aVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = aVar.dJV;
            kotlin.jvm.internal.i.e(textView, "binding.operationHistoryStatusValue");
            textView.setText(d);
        } else if (i == 3) {
            aVar = this.eUM;
            if (aVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = aVar.dJS;
            kotlin.jvm.internal.i.e(textView, "binding.operationHistoryDateValue");
            textView.setText(d);
        }
    }

    private final void b(FilterType filterType) {
        iqoption.operationhistory.a.a.eVh.a(this, filterType);
    }

    private final void bmS() {
        iqoption.operationhistory.a.a.eVh.bH(this);
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.bHB.e(this);
    }
}

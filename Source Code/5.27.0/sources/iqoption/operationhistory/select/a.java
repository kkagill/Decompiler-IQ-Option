package iqoption.operationhistory.select;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.j.a.k;
import com.iqoption.j.a.m;
import com.iqoption.j.c.e;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0019\u001aB/\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Liqoption/operationhistory/select/SelectOperationsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Liqoption/operationhistory/select/SelectOperationsAdapter$SelectOperationViewHolder;", "items", "", "Liqoption/operationhistory/OperationViewModel$FilterItem;", "multiSelection", "", "listener", "Lkotlin/Function1;", "", "(Ljava/util/List;ZLkotlin/jvm/functions/Function1;)V", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MultiSelectionViewHolder", "SelectOperationViewHolder", "SingleSelectionViewHolder", "operationhistory_release"})
/* compiled from: SelectOperationsAdapter.kt */
public final class a extends Adapter<b> {
    private final boolean eVp;
    private final kotlin.jvm.a.b<iqoption.operationhistory.OperationViewModel.c, Object> eVq;
    private final List<iqoption.operationhistory.OperationViewModel.c> iA;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H&R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, bng = {"Liqoption/operationhistory/select/SelectOperationsAdapter$SelectOperationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "listener", "Lkotlin/Function1;", "Liqoption/operationhistory/OperationViewModel$FilterItem;", "", "(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/functions/Function1;)V", "getListener", "()Lkotlin/jvm/functions/Function1;", "bind", "", "filterItem", "operationhistory_release"})
    /* compiled from: SelectOperationsAdapter.kt */
    public static abstract class b extends ViewHolder {
        private final kotlin.jvm.a.b<iqoption.operationhistory.OperationViewModel.c, Object> eVq;

        public abstract void b(iqoption.operationhistory.OperationViewModel.c cVar);

        public final kotlin.jvm.a.b<iqoption.operationhistory.OperationViewModel.c, Object> bnd() {
            return this.eVq;
        }

        public b(ViewDataBinding viewDataBinding, kotlin.jvm.a.b<? super iqoption.operationhistory.OperationViewModel.c, ? extends Object> bVar) {
            kotlin.jvm.internal.i.f(viewDataBinding, "binding");
            kotlin.jvm.internal.i.f(bVar, CastExtraArgs.LISTENER);
            super(viewDataBinding.getRoot());
            this.eVq = bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, bng = {"Liqoption/operationhistory/select/SelectOperationsAdapter$MultiSelectionViewHolder;", "Liqoption/operationhistory/select/SelectOperationsAdapter$SelectOperationViewHolder;", "binding", "Lcom/iqoption/operationhistory/databinding/OperationHistoryMultiSelectionBinding;", "listener", "Lkotlin/Function1;", "Liqoption/operationhistory/OperationViewModel$FilterItem;", "", "(Lcom/iqoption/operationhistory/databinding/OperationHistoryMultiSelectionBinding;Lkotlin/jvm/functions/Function1;)V", "getBinding", "()Lcom/iqoption/operationhistory/databinding/OperationHistoryMultiSelectionBinding;", "bind", "", "filterItem", "operationhistory_release"})
    /* compiled from: SelectOperationsAdapter.kt */
    public static final class a extends b {
        private final k eVr;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
        /* compiled from: SelectOperationsAdapter.kt */
        static final class a implements OnClickListener {
            final /* synthetic */ a eVs;
            final /* synthetic */ iqoption.operationhistory.OperationViewModel.c eVt;

            a(a aVar, iqoption.operationhistory.OperationViewModel.c cVar) {
                this.eVs = aVar;
                this.eVt = cVar;
            }

            public final void onClick(View view) {
                this.eVs.bnd().invoke(this.eVt);
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCheckedChanged"})
        /* compiled from: SelectOperationsAdapter.kt */
        static final class b implements OnCheckedChangeListener {
            final /* synthetic */ a eVs;
            final /* synthetic */ iqoption.operationhistory.OperationViewModel.c eVt;

            b(a aVar, iqoption.operationhistory.OperationViewModel.c cVar) {
                this.eVs = aVar;
                this.eVt = cVar;
            }

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.eVs.bnd().invoke(this.eVt);
            }
        }

        public a(k kVar, kotlin.jvm.a.b<? super iqoption.operationhistory.OperationViewModel.c, ? extends Object> bVar) {
            kotlin.jvm.internal.i.f(kVar, "binding");
            kotlin.jvm.internal.i.f(bVar, CastExtraArgs.LISTENER);
            super(kVar, bVar);
            this.eVr = kVar;
        }

        public void b(iqoption.operationhistory.OperationViewModel.c cVar) {
            kotlin.jvm.internal.i.f(cVar, "filterItem");
            this.eVr.dKi.setText(cVar.bmZ());
            this.eVr.getRoot().setOnClickListener(new a(this, cVar));
            this.eVr.dKh.setOnCheckedChangeListener(null);
            CheckBox checkBox = this.eVr.dKh;
            kotlin.jvm.internal.i.e(checkBox, "binding.checker");
            checkBox.setChecked(cVar.asM());
            this.eVr.dKh.setOnCheckedChangeListener(new b(this, cVar));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, bng = {"Liqoption/operationhistory/select/SelectOperationsAdapter$SingleSelectionViewHolder;", "Liqoption/operationhistory/select/SelectOperationsAdapter$SelectOperationViewHolder;", "binding", "Lcom/iqoption/operationhistory/databinding/OperationHistorySingleSelectionBinding;", "listener", "Lkotlin/Function1;", "Liqoption/operationhistory/OperationViewModel$FilterItem;", "", "(Lcom/iqoption/operationhistory/databinding/OperationHistorySingleSelectionBinding;Lkotlin/jvm/functions/Function1;)V", "getBinding", "()Lcom/iqoption/operationhistory/databinding/OperationHistorySingleSelectionBinding;", "bind", "", "filterItem", "operationhistory_release"})
    /* compiled from: SelectOperationsAdapter.kt */
    public static final class c extends b {
        private final m eVu;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
        /* compiled from: SelectOperationsAdapter.kt */
        static final class a implements OnClickListener {
            final /* synthetic */ iqoption.operationhistory.OperationViewModel.c eVt;
            final /* synthetic */ c eVv;

            a(c cVar, iqoption.operationhistory.OperationViewModel.c cVar2) {
                this.eVv = cVar;
                this.eVt = cVar2;
            }

            public final void onClick(View view) {
                this.eVv.bnd().invoke(this.eVt);
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCheckedChanged"})
        /* compiled from: SelectOperationsAdapter.kt */
        static final class b implements OnCheckedChangeListener {
            final /* synthetic */ iqoption.operationhistory.OperationViewModel.c eVt;
            final /* synthetic */ c eVv;

            b(c cVar, iqoption.operationhistory.OperationViewModel.c cVar2) {
                this.eVv = cVar;
                this.eVt = cVar2;
            }

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.eVv.bnd().invoke(this.eVt);
            }
        }

        public c(m mVar, kotlin.jvm.a.b<? super iqoption.operationhistory.OperationViewModel.c, ? extends Object> bVar) {
            kotlin.jvm.internal.i.f(mVar, "binding");
            kotlin.jvm.internal.i.f(bVar, CastExtraArgs.LISTENER);
            super(mVar, bVar);
            this.eVu = mVar;
        }

        public void b(iqoption.operationhistory.OperationViewModel.c cVar) {
            kotlin.jvm.internal.i.f(cVar, "filterItem");
            this.eVu.dKi.setText(cVar.bmZ());
            this.eVu.getRoot().setOnClickListener(new a(this, cVar));
            this.eVu.dKj.setOnCheckedChangeListener(null);
            AppCompatRadioButton appCompatRadioButton = this.eVu.dKj;
            kotlin.jvm.internal.i.e(appCompatRadioButton, "binding.checker");
            appCompatRadioButton.setChecked(cVar.asM());
            this.eVu.dKj.setOnCheckedChangeListener(new b(this, cVar));
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public a(List<iqoption.operationhistory.OperationViewModel.c> list, boolean z, kotlin.jvm.a.b<? super iqoption.operationhistory.OperationViewModel.c, ? extends Object> bVar) {
        kotlin.jvm.internal.i.f(list, "items");
        kotlin.jvm.internal.i.f(bVar, CastExtraArgs.LISTENER);
        this.iA = list;
        this.eVp = z;
        this.eVq = bVar;
        setHasStableIds(true);
    }

    /* renamed from: aa */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        String str = "DataBindingUtil\n        …selection, parent, false)";
        ViewDataBinding inflate;
        if (this.eVp) {
            inflate = DataBindingUtil.inflate(from, e.operation_history_multi_selection, viewGroup, false);
            kotlin.jvm.internal.i.e(inflate, str);
            return new a((k) inflate, this.eVq);
        }
        inflate = DataBindingUtil.inflate(from, e.operation_history_single_selection, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, str);
        return new c((m) inflate, this.eVq);
    }

    public int getItemCount() {
        return this.iA.size();
    }

    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i) {
        kotlin.jvm.internal.i.f(bVar, "holder");
        bVar.b((iqoption.operationhistory.OperationViewModel.c) this.iA.get(i));
    }
}

package com.iqoption.withdraw.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.microservices.configuration.a.d;
import com.iqoption.core.microservices.withdraw.response.o;
import com.iqoption.withdraw.a.aa;
import com.iqoption.withdraw.a.ac;
import com.iqoption.withdraw.d.e;
import com.iqoption.withdraw.d.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0013J\u0006\u0010\u001d\u001a\u00020\u0013J\u0016\u0010\u001e\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/withdraw/history/WithdrawHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqoption/withdraw/history/WithdrawHistoryViewHolder;", "context", "Landroid/content/Context;", "cancelClickListener", "Lcom/iqoption/withdraw/history/CancelClickListener;", "(Landroid/content/Context;Lcom/iqoption/withdraw/history/CancelClickListener;)V", "getContext", "()Landroid/content/Context;", "items", "", "Lcom/iqoption/withdraw/history/WithdrawHistoryAdapterItem;", "getItemCount", "", "getItemViewType", "position", "item", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "adapterData", "Lcom/iqoption/withdraw/history/AdapterData;", "showError", "showProgress", "updateItems", "newItems", "withdraw_release"})
/* compiled from: WithdrawHistoryAdapter.kt */
public final class j extends Adapter<n> {
    private final Context context;
    private final b esH;
    private List<? extends k> iA = m.emptyList();

    public j(Context context, b bVar) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(bVar, "cancelClickListener");
        this.context = context;
        this.esH = bVar;
    }

    public int getItemCount() {
        return this.iA.size();
    }

    public int getItemViewType(int i) {
        return hW(i).asd();
    }

    private final k hW(int i) {
        return (k) this.iA.get(i);
    }

    /* renamed from: X */
    public n onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(this.context);
        ViewDataBinding inflate;
        if (i == 0) {
            inflate = DataBindingUtil.inflate(from, e.withdraw_history_title_item, viewGroup, false);
            kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…itle_item, parent, false)");
            return new i((ac) inflate);
        } else if (i == 1) {
            inflate = DataBindingUtil.inflate(from, e.withdraw_history_payout_item, viewGroup, false);
            kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…yout_item, parent, false)");
            return new f((aa) inflate, this.esH);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected viewType: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(n nVar, int i) {
        kotlin.jvm.internal.i.f(nVar, "holder");
        k hW;
        if (nVar instanceof i) {
            i iVar = (i) nVar;
            hW = hW(i);
            if (hW != null) {
                iVar.a((h) hW);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.withdraw.history.TitleItem");
        } else if (nVar instanceof f) {
            f fVar = (f) nVar;
            hW = hW(i);
            if (hW != null) {
                fVar.a((e) hW);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.withdraw.history.PayoutItem");
        }
    }

    public final void Lf() {
        String string = this.context.getString(f.loading);
        kotlin.jvm.internal.i.e(string, "context.getString(R.string.loading)");
        bF(l.listOf(new h(string)));
    }

    public final void Lg() {
        String string = this.context.getString(f.unable_to_load_transactions);
        kotlin.jvm.internal.i.e(string, "context.getString(R.stri…ble_to_load_transactions)");
        bF(l.listOf(new h(string)));
    }

    public final void a(a aVar) {
        Object string;
        kotlin.jvm.internal.i.f(aVar, "adapterData");
        List arrayList = new ArrayList();
        List<o> bbY = aVar.bbY();
        if (bbY.isEmpty()) {
            string = this.context.getString(f.you_have_no_transactions_yet);
        } else {
            string = this.context.getString(f.withdrawal_requests);
        }
        kotlin.jvm.internal.i.e(string, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        arrayList.add(new h(string));
        Set bcM = aVar.bcM();
        for (o oVar : bbY) {
            Object obj = aVar.bbZ().get(oVar.getCurrency());
            if (obj == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            d dVar = (d) obj;
            arrayList.add(new e(oVar, dVar.getMask(), dVar.getMinorUnits(), bcM.contains(Long.valueOf(oVar.getId()))));
        }
        bF(arrayList);
    }

    private final void bF(List<? extends k> list) {
        List list2 = this.iA;
        this.iA = list;
        DiffResult calculateDiff = DiffUtil.calculateDiff(new d(list2, list));
        kotlin.jvm.internal.i.e(calculateDiff, "DiffUtil.calculateDiff(callback)");
        calculateDiff.dispatchUpdatesTo((Adapter) this);
    }
}

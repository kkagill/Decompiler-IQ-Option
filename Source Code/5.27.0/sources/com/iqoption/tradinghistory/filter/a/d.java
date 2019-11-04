package com.iqoption.tradinghistory.filter.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.tradinghistory.a.aa;
import com.iqoption.tradinghistory.g.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, bng = {"Lcom/iqoption/tradinghistory/filter/active/ActiveFilterViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/tradinghistory/filter/active/ActiveAdapterItem;", "binding", "Lcom/iqoption/tradinghistory/databinding/TradingHistoryMultiSelectionBinding;", "listener", "Lcom/iqoption/tradinghistory/filter/active/OnActiveCheckListener;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/tradinghistory/databinding/TradingHistoryMultiSelectionBinding;Lcom/iqoption/tradinghistory/filter/active/OnActiveCheckListener;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getBinding", "()Lcom/iqoption/tradinghistory/databinding/TradingHistoryMultiSelectionBinding;", "getListener", "()Lcom/iqoption/tradinghistory/filter/active/OnActiveCheckListener;", "bind", "", "item", "tradinghistory_release"})
/* compiled from: ActiveFilterViewHolders.kt */
public final class d extends c<a> {
    private final i dXh;
    private final aa dXt;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ActiveFilterViewHolders.kt */
    static final class a implements OnClickListener {
        final /* synthetic */ d dXu;
        final /* synthetic */ a dXv;

        a(d dVar, a aVar) {
            this.dXu = dVar;
            this.dXv = aVar;
        }

        public final void onClick(View view) {
            i aVR = this.dXu.aVR();
            a aVar = this.dXv;
            CheckBox checkBox = this.dXu.aVQ().dKh;
            kotlin.jvm.internal.i.e(checkBox, "binding.checker");
            aVR.a(aVar, checkBox.isChecked() ^ 1);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "selected", "", "onCheckedChanged"})
    /* compiled from: ActiveFilterViewHolders.kt */
    static final class b implements OnCheckedChangeListener {
        final /* synthetic */ d dXu;
        final /* synthetic */ a dXv;

        b(d dVar, a aVar) {
            this.dXu = dVar;
            this.dXv = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.dXu.aVR().a(this.dXv, z);
        }
    }

    public final aa aVQ() {
        return this.dXt;
    }

    public final i aVR() {
        return this.dXh;
    }

    public d(aa aaVar, i iVar, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(aaVar, "binding");
        kotlin.jvm.internal.i.f(iVar, CastExtraArgs.LISTENER);
        View root = aaVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        super(root, aVar);
        this.dXt = aaVar;
        this.dXh = iVar;
    }

    /* renamed from: a */
    public void bB(a aVar) {
        CharSequence string;
        kotlin.jvm.internal.i.f(aVar, "item");
        TextView textView = this.dXt.dKi;
        kotlin.jvm.internal.i.e(textView, "binding.checkerText");
        if (aVar.aVN()) {
            string = com.iqoption.core.d.getString(f.select_all);
        } else {
            com.iqoption.core.microservices.tradingengine.response.active.a Jt = aVar.Jt();
            if (Jt == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            string = com.iqoption.core.microservices.tradingengine.response.active.d.B(Jt);
        }
        textView.setText(string);
        this.dXt.getRoot().setOnClickListener(new a(this, aVar));
        this.dXt.dKh.setOnCheckedChangeListener(null);
        CheckBox checkBox = this.dXt.dKh;
        kotlin.jvm.internal.i.e(checkBox, "binding.checker");
        checkBox.setChecked(aVar.asM());
        this.dXt.dKh.setOnCheckedChangeListener(new b(this, aVar));
    }
}

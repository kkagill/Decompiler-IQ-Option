package com.iqoption.tradinghistory.filter.b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.tradinghistory.a.ac;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, bng = {"Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterAdapterItem;", "binding", "Lcom/iqoption/tradinghistory/databinding/TradingHistorySingleSelectionBinding;", "listener", "Lcom/iqoption/tradinghistory/filter/balance/OnBalanceCheckListener;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/tradinghistory/databinding/TradingHistorySingleSelectionBinding;Lcom/iqoption/tradinghistory/filter/balance/OnBalanceCheckListener;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getBinding", "()Lcom/iqoption/tradinghistory/databinding/TradingHistorySingleSelectionBinding;", "getListener", "()Lcom/iqoption/tradinghistory/filter/balance/OnBalanceCheckListener;", "bind", "", "item", "tradinghistory_release"})
/* compiled from: BalanceFilterViewHolder.kt */
public final class e extends c<c> {
    private final g dXF;
    private final ac dXL;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: BalanceFilterViewHolder.kt */
    static final class a implements OnClickListener {
        final /* synthetic */ e dXM;
        final /* synthetic */ c dXN;

        a(e eVar, c cVar) {
            this.dXM = eVar;
            this.dXN = cVar;
        }

        public final void onClick(View view) {
            g aVU = this.dXM.aVU();
            c cVar = this.dXN;
            AppCompatRadioButton appCompatRadioButton = this.dXM.aVT().dKj;
            kotlin.jvm.internal.i.e(appCompatRadioButton, "binding.checker");
            aVU.a(cVar, appCompatRadioButton.isChecked() ^ 1);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "selected", "", "onCheckedChanged"})
    /* compiled from: BalanceFilterViewHolder.kt */
    static final class b implements OnCheckedChangeListener {
        final /* synthetic */ e dXM;
        final /* synthetic */ c dXN;

        b(e eVar, c cVar) {
            this.dXM = eVar;
            this.dXN = cVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.dXM.aVU().a(this.dXN, z);
        }
    }

    public final ac aVT() {
        return this.dXL;
    }

    public final g aVU() {
        return this.dXF;
    }

    public e(ac acVar, g gVar, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(acVar, "binding");
        kotlin.jvm.internal.i.f(gVar, CastExtraArgs.LISTENER);
        View root = acVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        super(root, aVar);
        this.dXL = acVar;
        this.dXF = gVar;
    }

    /* renamed from: a */
    public void bB(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "item");
        TextView textView = this.dXL.dKi;
        kotlin.jvm.internal.i.e(textView, "binding.checkerText");
        textView.setText(a.e(cVar.VL()));
        this.dXL.getRoot().setOnClickListener(new a(this, cVar));
        this.dXL.dKj.setOnCheckedChangeListener(null);
        AppCompatRadioButton appCompatRadioButton = this.dXL.dKj;
        kotlin.jvm.internal.i.e(appCompatRadioButton, "binding.checker");
        appCompatRadioButton.setChecked(cVar.asM());
        this.dXL.dKj.setOnCheckedChangeListener(new b(this, cVar));
    }
}

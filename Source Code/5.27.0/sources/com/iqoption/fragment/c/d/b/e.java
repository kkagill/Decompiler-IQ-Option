package com.iqoption.fragment.c.d.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.d;
import com.iqoption.core.ext.g;
import com.iqoption.core.util.af;
import com.iqoption.core.util.j;
import com.iqoption.e.bd;
import com.iqoption.fragment.c.a.b.h;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsFullViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetInfoStatisticsFullItemBinding;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatisticsFull;", "callback", "Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsFullViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "uiConfig", "Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsFullViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/fragment/infoasset/adapters/UIConfig;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getCallback", "()Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsFullViewHolder$Callback;", "getUiConfig", "()Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: StatisticsFullViewHolder.kt */
public final class e extends com.iqoption.core.ui.widget.recyclerview.a.e<bd, h> {
    private final com.iqoption.fragment.c.a.a dgU;
    private final a die;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsFullViewHolder$Callback;", "", "onFullStatisticsClick", "", "item", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatisticsFull;", "app_optionXRelease"})
    /* compiled from: StatisticsFullViewHolder.kt */
    public interface a {
        void a(h hVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/infoasset/viewholder/info/StatisticsFullViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: StatisticsFullViewHolder.kt */
    /* renamed from: com.iqoption.fragment.c.d.b.e$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ e dif;

        AnonymousClass1(e eVar) {
            this.dif = eVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            h hVar = (h) this.dif.and();
            if (hVar != null) {
                this.dif.aEc().a(hVar);
            }
        }
    }

    public final a aEc() {
        return this.die;
    }

    public e(a aVar, ViewGroup viewGroup, com.iqoption.fragment.c.a.a aVar2, com.iqoption.core.ui.widget.recyclerview.a.a aVar3) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "uiConfig");
        kotlin.jvm.internal.i.f(aVar3, "data");
        super(R.layout.asset_info_statistics_full_item, viewGroup, aVar3);
        this.die = aVar;
        this.dgU = aVar2;
        ((bd) getBinding()).getRoot().setOnClickListener(new AnonymousClass1(this));
    }

    public void a(bd bdVar, h hVar) {
        bd bdVar2 = bdVar;
        kotlin.jvm.internal.i.f(bdVar2, "$this$bind");
        kotlin.jvm.internal.i.f(hVar, "item");
        double d = ((hVar.aDG().agP()[0] - hVar.aDG().agO()[0]) / hVar.aDG().agP()[0]) * 100.0d;
        com.iqoption.fragment.c.a.a aVar = this.dgU;
        TextView textView = bdVar2.bWt;
        String str = "oneWeekDiff";
        kotlin.jvm.internal.i.e(textView, str);
        aVar.a(textView, d);
        TextView textView2 = bdVar2.bWx;
        kotlin.jvm.internal.i.e(textView2, "oneWeekTitle");
        Integer valueOf = Integer.valueOf(1);
        textView2.setText(d.getString(R.string.n1_one_week, valueOf));
        textView2 = bdVar2.bWt;
        kotlin.jvm.internal.i.e(textView2, str);
        textView2.setText(af.h(d, 3));
        textView2 = bdVar2.bWv;
        kotlin.jvm.internal.i.e(textView2, "oneWeekLow");
        textView2.setText(j.fr(hVar.getPrecision()).format(hVar.aDG().agQ()[0]));
        textView2 = bdVar2.bWu;
        kotlin.jvm.internal.i.e(textView2, "oneWeekHigh");
        textView2.setText(j.fr(hVar.getPrecision()).format(hVar.aDG().agR()[0]));
        bdVar2.bWw.a((float) ((hVar.aDG().agP()[0] - hVar.aDG().agQ()[0]) / (hVar.aDG().agR()[0] - hVar.aDG().agQ()[0])), true);
        d = ((hVar.aDH().agP()[0] - hVar.aDH().agO()[0]) / hVar.aDH().agP()[0]) * 100.0d;
        aVar = this.dgU;
        TextView textView3 = bdVar2.bWo;
        String str2 = "oneMounthDiff";
        kotlin.jvm.internal.i.e(textView3, str2);
        aVar.a(textView3, d);
        textView2 = bdVar2.bWs;
        kotlin.jvm.internal.i.e(textView2, "oneMounthTitle");
        textView2.setText(d.getString(R.string.n1_one_month, valueOf));
        textView2 = bdVar2.bWo;
        kotlin.jvm.internal.i.e(textView2, str2);
        textView2.setText(af.h(d, 3));
        textView2 = bdVar2.bWq;
        kotlin.jvm.internal.i.e(textView2, "oneMounthLow");
        textView2.setText(j.fr(hVar.getPrecision()).format(hVar.aDH().agQ()[0]));
        textView2 = bdVar2.bWp;
        kotlin.jvm.internal.i.e(textView2, "oneMounthHigh");
        textView2.setText(j.fr(hVar.getPrecision()).format(hVar.aDH().agR()[0]));
        bdVar2.bWr.a((float) ((hVar.aDH().agP()[0] - hVar.aDH().agQ()[0]) / (hVar.aDH().agR()[0] - hVar.aDH().agQ()[0])), true);
    }
}

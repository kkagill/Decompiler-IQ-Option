package com.iqoption.fragment.c.d.b;

import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.d;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.core.util.af;
import com.iqoption.core.util.j;
import com.iqoption.e.bf;
import com.iqoption.fragment.c.a.a;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetInfoStatisticsItemBinding;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatistics;", "parent", "Landroid/view/ViewGroup;", "uiConfig", "Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "(Landroid/view/ViewGroup;Lcom/iqoption/fragment/infoasset/adapters/UIConfig;)V", "getUiConfig", "()Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "bind", "", "item", "app_optionXRelease"})
/* compiled from: StatisticsViewHolder.kt */
public final class g extends e<bf, com.iqoption.fragment.c.a.b.g> {
    private final a dgU;

    public g(ViewGroup viewGroup, a aVar) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "uiConfig");
        super(R.layout.asset_info_statistics_item, viewGroup, null, 4, null);
        this.dgU = aVar;
    }

    public void a(bf bfVar, com.iqoption.fragment.c.a.b.g gVar) {
        bf bfVar2 = bfVar;
        kotlin.jvm.internal.i.f(bfVar2, "$this$bind");
        kotlin.jvm.internal.i.f(gVar, "item");
        double d = ((gVar.aDD().agP()[0] - gVar.aDD().agO()[0]) / gVar.aDD().agP()[0]) * 100.0d;
        a aVar = this.dgU;
        TextView textView = bfVar2.bWy;
        String str = "fiveMinDiff";
        kotlin.jvm.internal.i.e(textView, str);
        aVar.a(textView, d);
        TextView textView2 = bfVar2.bWC;
        kotlin.jvm.internal.i.e(textView2, "fiveMinTitle");
        Integer valueOf = Integer.valueOf(1);
        textView2.setText(d.getString(R.string.few_minutes_n1, Integer.valueOf(5)));
        textView2 = bfVar2.bWy;
        kotlin.jvm.internal.i.e(textView2, str);
        textView2.setText(af.h(d, 3));
        textView2 = bfVar2.bWA;
        kotlin.jvm.internal.i.e(textView2, "fiveMinLow");
        textView2.setText(j.fr(gVar.getPrecision()).format(gVar.aDD().agQ()[0]));
        textView2 = bfVar2.bWz;
        kotlin.jvm.internal.i.e(textView2, "fiveMinHigh");
        textView2.setText(j.fr(gVar.getPrecision()).format(gVar.aDD().agR()[0]));
        bfVar2.bWB.a((float) ((gVar.aDD().agP()[0] - gVar.aDD().agQ()[0]) / (gVar.aDD().agR()[0] - gVar.aDD().agQ()[0])), true);
        d = ((gVar.aDE().agP()[0] - gVar.aDE().agO()[0]) / gVar.aDE().agP()[0]) * 100.0d;
        aVar = this.dgU;
        TextView textView3 = bfVar2.bWK;
        String str2 = "oneHourDiff";
        kotlin.jvm.internal.i.e(textView3, str2);
        aVar.a(textView3, d);
        textView2 = bfVar2.bWO;
        kotlin.jvm.internal.i.e(textView2, "oneHourTitle");
        textView2.setText(d.getString(R.string.n1_one_hour, valueOf));
        textView2 = bfVar2.bWK;
        kotlin.jvm.internal.i.e(textView2, str2);
        textView2.setText(af.h(d, 3));
        textView2 = bfVar2.bWM;
        kotlin.jvm.internal.i.e(textView2, "oneHourLow");
        textView2.setText(j.fr(gVar.getPrecision()).format(gVar.aDE().agQ()[0]));
        textView2 = bfVar2.bWL;
        kotlin.jvm.internal.i.e(textView2, "oneHourHigh");
        textView2.setText(j.fr(gVar.getPrecision()).format(gVar.aDE().agR()[0]));
        bfVar2.bWN.a((float) ((gVar.aDE().agP()[0] - gVar.aDE().agQ()[0]) / (gVar.aDE().agR()[0] - gVar.aDE().agQ()[0])), true);
        d = ((gVar.aDF().agP()[0] - gVar.aDF().agO()[0]) / gVar.aDF().agP()[0]) * 100.0d;
        aVar = this.dgU;
        TextView textView4 = bfVar2.bWF;
        String str3 = "oneDayDiff";
        kotlin.jvm.internal.i.e(textView4, str3);
        aVar.a(textView4, d);
        textView2 = bfVar2.bWJ;
        kotlin.jvm.internal.i.e(textView2, "oneDayTitle");
        textView2.setText(d.getString(R.string.n1_one_day, valueOf));
        textView2 = bfVar2.bWF;
        kotlin.jvm.internal.i.e(textView2, str3);
        textView2.setText(af.h(d, 3));
        textView2 = bfVar2.bWH;
        kotlin.jvm.internal.i.e(textView2, "oneDayLow");
        textView2.setText(j.fr(gVar.getPrecision()).format(gVar.aDF().agQ()[0]));
        textView2 = bfVar2.bWG;
        kotlin.jvm.internal.i.e(textView2, "oneDayHigh");
        textView2.setText(j.fr(gVar.getPrecision()).format(gVar.aDF().agR()[0]));
        bfVar2.bWI.a((float) ((gVar.aDF().agP()[0] - gVar.aDF().agQ()[0]) / (gVar.aDF().agR()[0] - gVar.aDF().agQ()[0])), true);
    }
}

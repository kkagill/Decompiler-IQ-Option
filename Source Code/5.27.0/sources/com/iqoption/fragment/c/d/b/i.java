package com.iqoption.fragment.c.d.b;

import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.d;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.core.util.af;
import com.iqoption.e.bl;
import com.iqoption.fragment.c.a.b.k;
import com.iqoption.x.R;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/TradersPulseViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetInfoTradersPulseItemBinding;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetTradersPulse;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "checkValue", "", "value", "bind", "", "item", "app_optionXRelease"})
/* compiled from: TradersPulseViewHolder.kt */
public final class i extends e<bl, k> {
    private final float Z(float f) {
        return f >= 0.99f ? 0.99f : f <= 0.01f ? 0.01f : f;
    }

    public i(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(R.layout.asset_info_traders_pulse_item, viewGroup, null, 4, null);
    }

    public void a(bl blVar, k kVar) {
        CharSequence string;
        CharSequence string2;
        kotlin.jvm.internal.i.f(blVar, "$this$bind");
        kotlin.jvm.internal.i.f(kVar, "item");
        float Z = Z(kVar.getValue());
        int i = 100 - ((int) (((float) 100) * Z));
        blVar.bWW.a(Z, true);
        TextView textView = blVar.bWU;
        kotlin.jvm.internal.i.e(textView, "buyPercente");
        if (kVar.isOption()) {
            string = d.getString(R.string.call_n1, af.i(Integer.valueOf(r2)));
        } else {
            string = d.getString(R.string.buy_n1, af.i(Integer.valueOf(r2)));
        }
        textView.setText(string);
        TextView textView2 = blVar.bWV;
        kotlin.jvm.internal.i.e(textView2, "sellPercente");
        if (kVar.isOption()) {
            string2 = d.getString(R.string.put_n1, af.i(Integer.valueOf(i)));
        } else {
            string2 = d.getString(R.string.sell_n1, af.i(Integer.valueOf(i)));
        }
        textView2.setText(string2);
    }
}

package com.iqoption.fragment.c.d.a;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.core.util.af;
import com.iqoption.e.ar;
import com.iqoption.fragment.c.a.a;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/conditions/BaseOptionsViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetBaseOptionsItemBinding;", "Lcom/iqoption/fragment/infoasset/adapters/conditions/AssetBaseOptions;", "parent", "Landroid/view/ViewGroup;", "uiConfig", "Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "(Landroid/view/ViewGroup;Lcom/iqoption/fragment/infoasset/adapters/UIConfig;)V", "getUiConfig", "()Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "bind", "", "item", "app_optionXRelease"})
/* compiled from: BaseOptionsViewHolder.kt */
public final class b extends e<ar, com.iqoption.fragment.c.a.a.b> {
    private final a dgU;

    public b(ViewGroup viewGroup, a aVar) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "uiConfig");
        super(R.layout.asset_base_options_item, viewGroup, null, 4, null);
        this.dgU = aVar;
    }

    public void a(ar arVar, com.iqoption.fragment.c.a.a.b bVar) {
        CharSequence charSequence;
        kotlin.jvm.internal.i.f(arVar, "$this$bind");
        kotlin.jvm.internal.i.f(bVar, "item");
        TextView textView = arVar.bTF;
        kotlin.jvm.internal.i.e(textView, "minIvest");
        textView.setText(bVar.aDo());
        String str = "profitContainer";
        LinearLayout linearLayout;
        if (bVar.aDt() != null) {
            textView = arVar.alW;
            kotlin.jvm.internal.i.e(textView, "profit");
            textView.setText(bVar.aDt());
            linearLayout = arVar.bTH;
            kotlin.jvm.internal.i.e(linearLayout, str);
            com.iqoption.core.ext.a.ak(linearLayout);
        } else {
            linearLayout = arVar.bTH;
            kotlin.jvm.internal.i.e(linearLayout, str);
            com.iqoption.core.ext.a.al(linearLayout);
        }
        textView = arVar.bTD;
        kotlin.jvm.internal.i.e(textView, "expTime");
        textView.setText(bVar.aDr());
        TextView textView2 = arVar.bTG;
        kotlin.jvm.internal.i.e(textView2, "spread");
        Double aDp = bVar.aDp();
        if (aDp != null) {
            String a = af.a(aDp.doubleValue(), 3, true);
            if (a != null) {
                charSequence = a;
                textView2.setText(charSequence);
            }
        }
        charSequence = this.dgU.aDm();
        textView2.setText(charSequence);
    }
}

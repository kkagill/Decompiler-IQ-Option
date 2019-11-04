package com.iqoption.fragment.rightpanel.a.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.iqoption.core.d;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.sz;
import com.iqoption.fragment.rightpanel.a.d.a;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, bng = {"Lcom/iqoption/fragment/rightpanel/multiselector/viewholder/MultiPositionItemViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/MultiPositionItemBinding;", "Lcom/iqoption/fragment/rightpanel/multiselector/MultiPositionItem;", "parent", "Landroid/view/ViewGroup;", "callback", "Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapter$Callbacks;", "uiConfig", "Lcom/iqoption/fragment/rightpanel/multiselector/viewholder/UIConfig;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Landroid/view/ViewGroup;Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapter$Callbacks;Lcom/iqoption/fragment/rightpanel/multiselector/viewholder/UIConfig;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getCallback", "()Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapter$Callbacks;", "getUiConfig", "()Lcom/iqoption/fragment/rightpanel/multiselector/viewholder/UIConfig;", "bind", "", "item", "app_optionXRelease"})
/* compiled from: MultiPositionItemViewHolder.kt */
public final class b extends e<sz, com.iqoption.fragment.rightpanel.a.b> {
    private final c dqb;
    private final a dqe;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/rightpanel/multiselector/viewholder/MultiPositionItemViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: MultiPositionItemViewHolder.kt */
    /* renamed from: com.iqoption.fragment.rightpanel.a.a.b$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ b dqg;

        AnonymousClass1(b bVar) {
            this.dqg = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.fragment.rightpanel.a.b bVar = (com.iqoption.fragment.rightpanel.a.b) this.dqg.and();
            if (bVar != null) {
                this.dqg.aHS().onItemClick(bVar.Jt());
            }
        }
    }

    public final a aHS() {
        return this.dqe;
    }

    public b(ViewGroup viewGroup, a aVar, c cVar, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(cVar, "uiConfig");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(R.layout.multi_position_item, viewGroup, aVar2);
        this.dqe = aVar;
        this.dqb = cVar;
        ((sz) getBinding()).getRoot().setOnClickListener(new AnonymousClass1(this));
    }

    public void a(sz szVar, com.iqoption.fragment.rightpanel.a.b bVar) {
        CharSequence charSequence;
        kotlin.jvm.internal.i.f(szVar, "$this$bind");
        kotlin.jvm.internal.i.f(bVar, "item");
        View root = szVar.getRoot();
        kotlin.jvm.internal.i.e(root, "root");
        root.setSelected(bVar.isSelected());
        if ((((CharSequence) bVar.aHO()).length() > 0 ? 1 : null) != null) {
            root = this.itemView;
            kotlin.jvm.internal.i.e(root, "itemView");
            Picasso.with(root.getContext()).load(bVar.aHO()).into(szVar.bXh);
        }
        TextView textView = szVar.aoh;
        kotlin.jvm.internal.i.e(textView, "assetName");
        textView.setText(bVar.ahP());
        textView = szVar.cox;
        kotlin.jvm.internal.i.e(textView, NotificationCompat.CATEGORY_STATUS);
        Boolean aHP = bVar.aHP();
        if (aHP != null) {
            boolean booleanValue = aHP.booleanValue();
            szVar.cox.setTextColor(booleanValue ? this.dqb.aHT() : this.dqb.aHU());
            charSequence = booleanValue ? d.getString(R.string.status_profit) : d.getString(R.string.status_lose);
        } else {
            charSequence = null;
        }
        textView.setText(charSequence);
        szVar.cow.setImageDrawable(bVar.isCall() ? this.dqb.aHV() : this.dqb.aHW());
    }
}

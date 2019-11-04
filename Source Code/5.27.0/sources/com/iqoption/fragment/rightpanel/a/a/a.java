package com.iqoption.fragment.rightpanel.a.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.st;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, bng = {"Lcom/iqoption/fragment/rightpanel/multiselector/viewholder/MultiActiveItemViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/MultiActiveItemBinding;", "Lcom/iqoption/fragment/rightpanel/multiselector/MultiActiveItem;", "parent", "Landroid/view/ViewGroup;", "callback", "Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapter$Callbacks;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Landroid/view/ViewGroup;Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapter$Callbacks;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getCallback", "()Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapter$Callbacks;", "bind", "", "item", "app_optionXRelease"})
/* compiled from: MultiActiveItemViewHolder.kt */
public final class a extends e<st, com.iqoption.fragment.rightpanel.a.a> {
    private final com.iqoption.fragment.rightpanel.a.d.a dqe;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/rightpanel/multiselector/viewholder/MultiActiveItemViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: MultiActiveItemViewHolder.kt */
    /* renamed from: com.iqoption.fragment.rightpanel.a.a.a$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ a dqf;

        AnonymousClass1(a aVar) {
            this.dqf = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.fragment.rightpanel.a.a aVar = (com.iqoption.fragment.rightpanel.a.a) this.dqf.and();
            if (aVar != null) {
                this.dqf.aHS().onItemClick(aVar.Jt());
            }
        }
    }

    public final com.iqoption.fragment.rightpanel.a.d.a aHS() {
        return this.dqe;
    }

    public a(ViewGroup viewGroup, com.iqoption.fragment.rightpanel.a.d.a aVar, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(R.layout.multi_active_item, viewGroup, aVar2);
        this.dqe = aVar;
        ((st) getBinding()).getRoot().setOnClickListener(new AnonymousClass1(this));
    }

    public void a(st stVar, com.iqoption.fragment.rightpanel.a.a aVar) {
        kotlin.jvm.internal.i.f(stVar, "$this$bind");
        kotlin.jvm.internal.i.f(aVar, "item");
        View root = stVar.getRoot();
        kotlin.jvm.internal.i.e(root, "root");
        root.setSelected(aVar.isSelected());
        if ((((CharSequence) aVar.aHO()).length() > 0 ? 1 : null) != null) {
            root = this.itemView;
            kotlin.jvm.internal.i.e(root, "itemView");
            Picasso.with(root.getContext()).load(aVar.aHO()).into(stVar.bXh);
        }
        TextView textView = stVar.aoh;
        kotlin.jvm.internal.i.e(textView, "assetName");
        textView.setText(aVar.ahP());
    }
}

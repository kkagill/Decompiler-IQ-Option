package com.iqoption.charttools.constructor.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.charttools.b.k;
import com.iqoption.charttools.constructor.n;
import com.iqoption.charttools.n.h;
import com.iqoption.core.ext.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/GroupTitleViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/charttools/databinding/IndicatorConstructorGroupTitleItemBinding;", "Lcom/iqoption/charttools/constructor/InputGroupTitle;", "callback", "Lcom/iqoption/charttools/constructor/viewholder/GroupTitleViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/charttools/constructor/viewholder/GroupTitleViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "techtools_release"})
/* compiled from: GroupTitleViewHolder.kt */
public final class e extends com.iqoption.core.ui.widget.recyclerview.a.e<k, n> {
    private final a aGl;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/GroupTitleViewHolder$Callback;", "", "onItemToggled", "", "item", "Lcom/iqoption/charttools/constructor/InputGroupTitle;", "techtools_release"})
    /* compiled from: GroupTitleViewHolder.kt */
    public interface a {
        void a(n nVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/charttools/constructor/viewholder/GroupTitleViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "techtools_release"})
    /* compiled from: GroupTitleViewHolder.kt */
    /* renamed from: com.iqoption.charttools.constructor.a.e$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ e aGm;

        AnonymousClass1(e eVar) {
            this.aGm = eVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            n nVar = (n) this.aGm.and();
            if (nVar != null && nVar.Ng()) {
                ImageView imageView = ((k) this.aGm.getBinding()).aIs;
                imageView.setSelected(imageView.isSelected() ^ 1);
                this.aGm.aGl.a(nVar);
            }
        }
    }

    public e(a aVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(h.indicator_constructor_group_title_item, viewGroup, aVar2);
        this.aGl = aVar;
        ((k) getBinding()).aIs.setOnClickListener(new AnonymousClass1(this));
    }

    public void a(k kVar, n nVar) {
        kotlin.jvm.internal.i.f(kVar, "$this$bind");
        kotlin.jvm.internal.i.f(nVar, "item");
        TextView textView = kVar.alH;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        textView.setText(nVar.getText());
        String str = "btnExpand";
        ImageView imageView;
        if (nVar.Ng()) {
            ImageView imageView2 = kVar.aIs;
            kotlin.jvm.internal.i.e(imageView2, str);
            com.iqoption.core.ext.a.ak(imageView2);
            imageView = kVar.aIs;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setSelected(nVar.nq());
            return;
        }
        imageView = kVar.aIs;
        kotlin.jvm.internal.i.e(imageView, str);
        com.iqoption.core.ext.a.al(imageView);
    }
}

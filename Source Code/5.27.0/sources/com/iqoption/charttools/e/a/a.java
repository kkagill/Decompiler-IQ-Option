package com.iqoption.charttools.e.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.charttools.b.y;
import com.iqoption.charttools.e.b;
import com.iqoption.charttools.n;
import com.iqoption.charttools.n.h;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/charttools/templates/viewholder/FigureViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/charttools/databinding/TemplatesFigureItemBinding;", "Lcom/iqoption/charttools/templates/FigureItem;", "callback", "Lcom/iqoption/charttools/templates/viewholder/ViewHolderCallback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/charttools/templates/viewholder/ViewHolderCallback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "techtools_release"})
/* compiled from: FigureViewHolder.kt */
public final class a extends e<y, b> {
    private final d aKl;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/charttools/templates/viewholder/FigureViewHolder$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "techtools_release"})
    /* compiled from: FigureViewHolder.kt */
    public static final class a extends g {
        final /* synthetic */ a aLw;

        a(a aVar) {
            this.aLw = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            b bVar = (b) this.aLw.and();
            if (bVar != null) {
                int id = view.getId();
                if (id == n.g.btnVisibility) {
                    this.aLw.aKl.a(bVar);
                } else if (id == n.g.btnSettings) {
                    this.aLw.aKl.b(bVar);
                } else if (id == n.g.btnDelete) {
                    this.aLw.aKl.c(bVar);
                }
            }
        }
    }

    public a(d dVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(dVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(h.templates_figure_item, viewGroup, aVar);
        this.aKl = dVar;
        y yVar = (y) getBinding();
        OnClickListener aVar2 = new a(this);
        yVar.aIC.setOnClickListener(aVar2);
        yVar.aIB.setOnClickListener(aVar2);
        yVar.aIA.setOnClickListener(aVar2);
    }

    public void a(y yVar, b bVar) {
        kotlin.jvm.internal.i.f(yVar, "$this$bind");
        kotlin.jvm.internal.i.f(bVar, "item");
        TextView textView = yVar.amZ;
        kotlin.jvm.internal.i.e(textView, ConditionalUserProperty.NAME);
        textView.setText(bVar.getName());
        textView = yVar.aIz;
        kotlin.jvm.internal.i.e(textView, ConditionalUserProperty.ACTIVE);
        textView.setText(bVar.OZ());
        ImageView imageView = yVar.aIC;
        kotlin.jvm.internal.i.e(imageView, "btnVisibility");
        imageView.setSelected(bVar.Pa().isHidden());
    }
}

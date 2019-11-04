package com.iqoption.charttools.e.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.charttools.b.aa;
import com.iqoption.charttools.e.c;
import com.iqoption.charttools.n;
import com.iqoption.charttools.n.h;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/charttools/templates/viewholder/IndicatorViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/charttools/databinding/TemplatesIndicatorItemBinding;", "Lcom/iqoption/charttools/templates/IndicatorItem;", "callback", "Lcom/iqoption/charttools/templates/viewholder/ViewHolderCallback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/charttools/templates/viewholder/ViewHolderCallback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "techtools_release"})
/* compiled from: IndicatorViewHolder.kt */
public final class b extends e<aa, c> {
    private final d aKl;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/charttools/templates/viewholder/IndicatorViewHolder$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "techtools_release"})
    /* compiled from: IndicatorViewHolder.kt */
    public static final class a extends g {
        final /* synthetic */ b aLx;

        a(b bVar) {
            this.aLx = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            c cVar = (c) this.aLx.and();
            if (cVar != null) {
                int id = view.getId();
                if (id == n.g.btnVisibility) {
                    this.aLx.aKl.a(cVar);
                } else if (id == n.g.btnSettings) {
                    this.aLx.aKl.b(cVar);
                } else if (id == n.g.btnDelete) {
                    this.aLx.aKl.c(cVar);
                }
            }
        }
    }

    public b(d dVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(dVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(h.templates_indicator_item, viewGroup, aVar);
        this.aKl = dVar;
        aa aaVar = (aa) getBinding();
        OnClickListener aVar2 = new a(this);
        aaVar.aIC.setOnClickListener(aVar2);
        aaVar.aIB.setOnClickListener(aVar2);
        aaVar.aIA.setOnClickListener(aVar2);
    }

    public void a(aa aaVar, c cVar) {
        kotlin.jvm.internal.i.f(aaVar, "$this$bind");
        kotlin.jvm.internal.i.f(cVar, "item");
        TextView textView = aaVar.amZ;
        kotlin.jvm.internal.i.e(textView, ConditionalUserProperty.NAME);
        textView.setText(cVar.getName());
        ImageView imageView = aaVar.aIC;
        kotlin.jvm.internal.i.e(imageView, "btnVisibility");
        imageView.setSelected(cVar.LU().isHidden());
    }
}

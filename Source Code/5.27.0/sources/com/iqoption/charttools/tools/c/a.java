package com.iqoption.charttools.tools.c;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.charttools.model.indicator.h;
import com.iqoption.charttools.model.indicator.k;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.z;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/charttools/tools/viewholder/ActiveIndicatorViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/ActiveToolsItemBinding;", "Lcom/iqoption/charttools/tools/data/ActiveIndicatorItem;", "callback", "Lcom/iqoption/charttools/tools/viewholder/ActiveIndicatorViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/charttools/tools/viewholder/ActiveIndicatorViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: ActiveIndicatorViewHolder.kt */
public final class a extends e<z, com.iqoption.charttools.tools.data.a> {
    private final a aNK;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, bng = {"Lcom/iqoption/charttools/tools/viewholder/ActiveIndicatorViewHolder$Callback;", "", "onItemClick", "", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "onItemRemoveClick", "onItemSettingsClick", "onItemToggleVisibilityClick", "app_optionXRelease"})
    /* compiled from: ActiveIndicatorViewHolder.kt */
    public interface a {
        void q(h hVar);

        void r(h hVar);

        void s(h hVar);

        void t(h hVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/charttools/tools/viewholder/ActiveIndicatorViewHolder$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: ActiveIndicatorViewHolder.kt */
    public static final class b extends g {
        final /* synthetic */ a aNL;

        b(a aVar) {
            this.aNL = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.charttools.tools.data.a aVar = (com.iqoption.charttools.tools.data.a) this.aNL.and();
            if (aVar != null) {
                h LU = aVar.LU();
                if (LU != null) {
                    switch (view.getId()) {
                        case R.id.content /*2131362341*/:
                            this.aNL.aNK.q(LU);
                            return;
                        case R.id.editIndicator /*2131362655*/:
                            this.aNL.aNK.s(LU);
                            return;
                        case R.id.removeIndicator /*2131363717*/:
                            this.aNL.aNK.t(LU);
                            return;
                        case R.id.visibleIndicator /*2131364392*/:
                            this.aNL.aNK.r(LU);
                            return;
                        default:
                            return;
                    }
                }
            }
        }
    }

    public a(a aVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(R.layout.active_tools_item, viewGroup, aVar2);
        this.aNK = aVar;
        OnClickListener bVar = new b(this);
        this.itemView.setOnClickListener(bVar);
        ((z) getBinding()).bTq.setOnClickListener(bVar);
        ((z) getBinding()).bTo.setOnClickListener(bVar);
        ((z) getBinding()).bTp.setOnClickListener(bVar);
    }

    public void a(z zVar, com.iqoption.charttools.tools.data.a aVar) {
        kotlin.jvm.internal.i.f(zVar, "$this$bind");
        kotlin.jvm.internal.i.f(aVar, "item");
        TextView textView = zVar.amZ;
        kotlin.jvm.internal.i.e(textView, ConditionalUserProperty.NAME);
        textView.setText(aVar.getTitle());
        textView = zVar.aRi;
        kotlin.jvm.internal.i.e(textView, "snippet");
        textView.setText(aVar.getSnippet());
        zVar.aRi.setTextColor(aVar.Qx());
        ImageView imageView = zVar.bTq;
        kotlin.jvm.internal.i.e(imageView, "visibleIndicator");
        imageView.setSelected(aVar.LU().isHidden());
        View view = this.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        view.setClickable(aVar.LU().MH() instanceof k);
    }
}

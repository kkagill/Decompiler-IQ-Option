package com.iqoption.charttools.tools.c;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.charttools.tools.data.m;
import com.iqoption.core.ext.g;
import com.iqoption.e.zj;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/charttools/tools/viewholder/TemplateViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/TemplateItemBinding;", "Lcom/iqoption/charttools/tools/data/TemplateItem;", "callback", "Lcom/iqoption/charttools/tools/viewholder/TemplateViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/charttools/tools/viewholder/TemplateViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: TemplateViewHolder.kt */
public final class e extends com.iqoption.core.ui.widget.recyclerview.a.e<zj, m> {
    private final a aNS;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, bng = {"Lcom/iqoption/charttools/tools/viewholder/TemplateViewHolder$Callback;", "", "onItemClick", "", "item", "Lcom/iqoption/charttools/tools/data/TemplateItem;", "onItemRemoveClick", "onItemSettingsClick", "app_optionXRelease"})
    /* compiled from: TemplateViewHolder.kt */
    public interface a {
        void d(m mVar);

        void e(m mVar);

        void f(m mVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/charttools/tools/viewholder/TemplateViewHolder$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: TemplateViewHolder.kt */
    public static final class b extends g {
        final /* synthetic */ e aNT;

        b(e eVar) {
            this.aNT = eVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            m mVar = (m) this.aNT.and();
            if (mVar != null) {
                int id = view.getId();
                if (id == R.id.btnEdit) {
                    this.aNT.aNS.e(mVar);
                } else if (id == R.id.btnRemove) {
                    this.aNT.aNS.f(mVar);
                } else if (id == R.id.content) {
                    this.aNT.aNS.d(mVar);
                }
            }
        }
    }

    public e(a aVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(R.layout.template_item, viewGroup, aVar2);
        this.aNS = aVar;
        OnClickListener bVar = new b(this);
        ((zj) getBinding()).aIv.setOnClickListener(bVar);
        ((zj) getBinding()).cng.setOnClickListener(bVar);
        ((zj) getBinding()).cui.setOnClickListener(bVar);
    }

    public void a(zj zjVar, m mVar) {
        kotlin.jvm.internal.i.f(zjVar, "$this$bind");
        kotlin.jvm.internal.i.f(mVar, "item");
        TextView textView = zjVar.amZ;
        kotlin.jvm.internal.i.e(textView, ConditionalUserProperty.NAME);
        textView.setText(mVar.QB().getName());
        textView = zjVar.cuj;
        kotlin.jvm.internal.i.e(textView, "indicators");
        textView.setText(mVar.QC());
        ConstraintLayout constraintLayout = zjVar.aIv;
        kotlin.jvm.internal.i.e(constraintLayout, "content");
        constraintLayout.setEnabled(mVar.QD() ^ 1);
    }
}

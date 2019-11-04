package com.iqoption.charttools.tools.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.on;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/charttools/tools/viewholder/IndicatorInfoViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/IndicatorInfoItemBinding;", "Lcom/iqoption/charttools/tools/data/InfoIndicatorItem;", "callback", "Lcom/iqoption/charttools/tools/viewholder/IndicatorInfoViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/charttools/tools/viewholder/IndicatorInfoViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: IndicatorInfoViewHolder.kt */
public final class b extends e<on, com.iqoption.charttools.tools.data.i> {
    private final b aNM;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/charttools/tools/viewholder/IndicatorInfoViewHolder$Callback;", "", "onItemVideoLinkClick", "", "item", "Lcom/iqoption/charttools/tools/data/InfoIndicatorItem;", "app_optionXRelease"})
    /* compiled from: IndicatorInfoViewHolder.kt */
    public interface b {
        void a(com.iqoption.charttools.tools.data.i iVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ b aNN;

        public a(b bVar) {
            this.aNN = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.charttools.tools.data.i iVar = (com.iqoption.charttools.tools.data.i) this.aNN.and();
            if (iVar != null) {
                this.aNN.aNM.a(iVar);
            }
        }
    }

    public b(b bVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(bVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(R.layout.indicator_info_item, viewGroup, aVar);
        this.aNM = bVar;
        TextView textView = ((on) getBinding()).clp;
        kotlin.jvm.internal.i.e(textView, "binding.videoLink");
        textView.setOnClickListener(new a(this));
    }

    public void a(on onVar, com.iqoption.charttools.tools.data.i iVar) {
        kotlin.jvm.internal.i.f(onVar, "$this$bind");
        kotlin.jvm.internal.i.f(iVar, "item");
        TextView textView = onVar.ani;
        kotlin.jvm.internal.i.e(textView, "text");
        textView.setText(iVar.getInfo());
        String str = "videoLink";
        TextView textView2;
        if (iVar.Oq() != null) {
            textView2 = onVar.clp;
            kotlin.jvm.internal.i.e(textView2, str);
            com.iqoption.core.ext.a.ak(textView2);
            return;
        }
        textView2 = onVar.clp;
        kotlin.jvm.internal.i.e(textView2, str);
        com.iqoption.core.ext.a.al(textView2);
    }
}

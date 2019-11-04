package com.iqoption.charttools.tools.a;

import android.view.ViewGroup;
import com.iqoption.charttools.tools.c.f;
import com.iqoption.charttools.tools.data.l;
import com.iqoption.charttools.tools.data.m;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.x.R;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/charttools/tools/adapters/TemplatesAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/charttools/tools/data/TemplateAdapterItem;", "callbacks", "Lcom/iqoption/charttools/tools/adapters/TemplatesAdapter$Callbacks;", "(Lcom/iqoption/charttools/tools/adapters/TemplatesAdapter$Callbacks;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callbacks", "Companion", "app_optionXRelease"})
/* compiled from: TemplatesAdapter.kt */
public final class d extends com.iqoption.core.ui.widget.recyclerview.adapter.a<e<?, ?>, l> {
    public static final b aMR = new b();
    private final a aMQ;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/charttools/tools/adapters/TemplatesAdapter$Companion;", "", "()V", "VIEW_TYPE_EMPTY", "", "VIEW_TYPE_ITEM", "app_optionXRelease"})
    /* compiled from: TemplatesAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, bng = {"Lcom/iqoption/charttools/tools/adapters/TemplatesAdapter$Callbacks;", "Lcom/iqoption/charttools/tools/viewholder/TemplateViewHolder$Callback;", "app_optionXRelease"})
    /* compiled from: TemplatesAdapter.kt */
    public interface a extends com.iqoption.charttools.tools.c.e.a {
    }

    public d(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callbacks");
        this.aMQ = aVar;
    }

    /* renamed from: m */
    public e<?, ?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == 1) {
            return new com.iqoption.charttools.tools.c.e(this.aMQ, viewGroup, this);
        }
        if (i == 2) {
            return new f((int) R.string.you_have_no_templates, viewGroup);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported viewType: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public void onBindViewHolder(e<?, ?> eVar, int i) {
        kotlin.jvm.internal.i.f(eVar, "holder");
        if (eVar.getItemViewType() == 1) {
            com.iqoption.charttools.tools.c.e eVar2 = (com.iqoption.charttools.tools.c.e) eVar;
            com.iqoption.core.ui.widget.recyclerview.adapter.a.d fp = fp(i);
            if (fp != null) {
                eVar2.bV((m) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.tools.data.TemplateItem");
        }
    }

    public int getItemViewType(int i) {
        return ((l) fp(i)) instanceof m ? 1 : 2;
    }
}

package com.iqoption.charttools.tools.delegate;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.charttools.tools.a.d;
import com.iqoption.charttools.tools.data.l;
import com.iqoption.charttools.tools.data.m;
import com.iqoption.charttools.tools.e;
import com.iqoption.core.ext.g;
import com.iqoption.e.aab;
import com.iqoption.x.R;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, bng = {"Lcom/iqoption/charttools/tools/delegate/TemplatesDelegate;", "Lcom/iqoption/charttools/tools/delegate/ContentDelegate;", "Lcom/iqoption/databinding/ToolsContentTemplatesBinding;", "context", "Lcom/iqoption/charttools/tools/delegate/DelegateContext;", "(Lcom/iqoption/charttools/tools/delegate/DelegateContext;)V", "Callback", "app_optionXRelease"})
/* compiled from: TemplatesDelegate.kt */
public final class f extends b<aab> {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/charttools/tools/delegate/TemplatesDelegate$Callback;", "", "onOpenTemplateSettings", "", "templateItem", "Lcom/iqoption/charttools/tools/data/TemplateItem;", "app_optionXRelease"})
    /* compiled from: TemplatesDelegate.kt */
    public interface b {
        void a(m mVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/charttools/tools/delegate/TemplatesDelegate$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ f aNC;
        final /* synthetic */ d aND;

        public a(f fVar, d dVar) {
            this.aNC = fVar;
            this.aND = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.aNC.PQ().PR();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, bng = {"com/iqoption/charttools/tools/delegate/TemplatesDelegate$adapter$1", "Lcom/iqoption/charttools/tools/adapters/TemplatesAdapter$Callbacks;", "onItemClick", "", "item", "Lcom/iqoption/charttools/tools/data/TemplateItem;", "onItemRemoveClick", "onItemSettingsClick", "app_optionXRelease"})
    /* compiled from: TemplatesDelegate.kt */
    public static final class c implements com.iqoption.charttools.tools.a.d.a {
        final /* synthetic */ f aNC;

        c(f fVar) {
            this.aNC = fVar;
        }

        public void d(m mVar) {
            kotlin.jvm.internal.i.f(mVar, "item");
            this.aNC.PL().b(mVar);
            this.aNC.PQ().onClose();
        }

        public void e(m mVar) {
            kotlin.jvm.internal.i.f(mVar, "item");
            com.iqoption.charttools.model.b.a QB = mVar.QB();
            e.aLA.af(QB.LV().size(), QB.Ms().size());
            this.aNC.PQ().a(mVar);
        }

        public void f(m mVar) {
            kotlin.jvm.internal.i.f(mVar, "item");
            this.aNC.PL().c(mVar);
        }
    }

    public f(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "context");
        super(R.layout.tools_content_templates, cVar);
        final d dVar = new d(new c(this));
        PL().Qi().observe(this, new Observer<List<? extends l>>() {
            /* renamed from: u */
            public final void onChanged(List<? extends l> list) {
                if (list != null) {
                    com.iqoption.core.ui.widget.recyclerview.adapter.a.a(dVar, list, null, 2, null);
                }
            }
        });
        aab aab = (aab) getBinding();
        RecyclerView recyclerView = aab.apj;
        kotlin.jvm.internal.i.e(recyclerView, "listView");
        recyclerView.setAdapter(dVar);
        aab.apj.addItemDecoration(PO());
        TextView textView = aab.cux;
        kotlin.jvm.internal.i.e(textView, "btnCreateTemplate");
        textView.setOnClickListener(new a(this, dVar));
    }
}

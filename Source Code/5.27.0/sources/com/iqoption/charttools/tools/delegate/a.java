package com.iqoption.charttools.tools.delegate;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.iqoption.charttools.model.indicator.h;
import com.iqoption.core.ext.g;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.e.zr;
import com.iqoption.x.R;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/charttools/tools/delegate/ActiveToolsDelegate;", "Lcom/iqoption/charttools/tools/delegate/ContentDelegate;", "Lcom/iqoption/databinding/ToolsContentActiveToolsBinding;", "context", "Lcom/iqoption/charttools/tools/delegate/DelegateContext;", "(Lcom/iqoption/charttools/tools/delegate/DelegateContext;)V", "clearAllTransition", "Landroidx/transition/AutoTransition;", "Callback", "app_optionXRelease"})
/* compiled from: ActiveToolsDelegate.kt */
public final class a extends b<zr> {
    private final AutoTransition aNg;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, bng = {"Lcom/iqoption/charttools/tools/delegate/ActiveToolsDelegate$Callback;", "", "onOpenIndicatorSettings", "", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "onOpenTemplateActivity", "app_optionXRelease"})
    /* compiled from: ActiveToolsDelegate.kt */
    public interface b {
        void PR();

        void k(h hVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "clearAllMode", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: ActiveToolsDelegate.kt */
    /* renamed from: com.iqoption.charttools.tools.delegate.a$2 */
    static final class AnonymousClass2<T> implements Observer<Boolean> {
        final /* synthetic */ a aNh;

        AnonymousClass2(a aVar) {
            this.aNh = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                TransitionManager.beginDelayedTransition(((zr) this.aNh.getBinding()).cun, this.aNh.aNg);
                String str = "binding.btnCancel";
                String str2 = "binding.btnConfirm";
                String str3 = "binding.btnClearAll";
                String str4 = "binding.title";
                TextView textView;
                if (booleanValue) {
                    textView = ((zr) this.aNh.getBinding()).alH;
                    kotlin.jvm.internal.i.e(textView, str4);
                    com.iqoption.core.ext.a.hide(textView);
                    textView = ((zr) this.aNh.getBinding()).cul;
                    kotlin.jvm.internal.i.e(textView, str3);
                    com.iqoption.core.ext.a.hide(textView);
                    textView = ((zr) this.aNh.getBinding()).cbI;
                    kotlin.jvm.internal.i.e(textView, str2);
                    com.iqoption.core.ext.a.ak(textView);
                    textView = ((zr) this.aNh.getBinding()).aQO;
                    kotlin.jvm.internal.i.e(textView, str);
                    com.iqoption.core.ext.a.ak(textView);
                    return;
                }
                textView = ((zr) this.aNh.getBinding()).alH;
                kotlin.jvm.internal.i.e(textView, str4);
                com.iqoption.core.ext.a.ak(textView);
                textView = ((zr) this.aNh.getBinding()).cul;
                kotlin.jvm.internal.i.e(textView, str3);
                com.iqoption.core.ext.a.ak(textView);
                textView = ((zr) this.aNh.getBinding()).cbI;
                kotlin.jvm.internal.i.e(textView, str2);
                com.iqoption.core.ext.a.hide(textView);
                textView = ((zr) this.aNh.getBinding()).aQO;
                kotlin.jvm.internal.i.e(textView, str);
                com.iqoption.core.ext.a.hide(textView);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/charttools/tools/delegate/ActiveToolsDelegate$3$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: ActiveToolsDelegate.kt */
    public static final class a extends g {
        final /* synthetic */ a aNh;
        final /* synthetic */ com.iqoption.charttools.tools.a.a aNi;

        a(a aVar, com.iqoption.charttools.tools.a.a aVar2) {
            this.aNh = aVar;
            this.aNi = aVar2;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            switch (view.getId()) {
                case R.id.btnCancel /*2131362038*/:
                    this.aNh.PL().Qq();
                    return;
                case R.id.btnClearAll /*2131362040*/:
                    this.aNh.PL().Qp();
                    return;
                case R.id.btnConfirm /*2131362047*/:
                    this.aNh.PL().Qo();
                    return;
                case R.id.btnSaveAsTemplate /*2131362081*/:
                    this.aNh.PQ().PR();
                    return;
                default:
                    return;
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, bng = {"com/iqoption/charttools/tools/delegate/ActiveToolsDelegate$adapter$1", "Lcom/iqoption/charttools/tools/adapters/ActiveIndicatorsAdapter$Callbacks;", "onItemClick", "", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "onItemRemoveClick", "onItemSettingsClick", "onItemToggleVisibilityClick", "app_optionXRelease"})
    /* compiled from: ActiveToolsDelegate.kt */
    public static final class c implements com.iqoption.charttools.tools.a.a.a {
        final /* synthetic */ a aNh;

        c(a aVar) {
            this.aNh = aVar;
        }

        public void q(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "indicator");
            if (this.aNh.PL().n(hVar)) {
                this.aNh.PQ().onClose();
            }
        }

        public void r(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "indicator");
            this.aNh.PL().m(hVar);
        }

        public void s(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "indicator");
            this.aNh.PQ().k(hVar);
        }

        public void t(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "indicator");
            this.aNh.PL().l(hVar);
        }
    }

    public a(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "context");
        super(R.layout.tools_content_active_tools, cVar);
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setDuration(200);
        autoTransition.setInterpolator((TimeInterpolator) j.XJ());
        autoTransition.setOrdering(0);
        this.aNg = autoTransition;
        final com.iqoption.charttools.tools.a.a aVar = new com.iqoption.charttools.tools.a.a(new c(this));
        LifecycleOwner lifecycleOwner = this;
        PL().Qg().observe(lifecycleOwner, new Observer<List<? extends com.iqoption.charttools.tools.data.a>>() {
            /* renamed from: u */
            public final void onChanged(List<com.iqoption.charttools.tools.data.a> list) {
                if (list != null) {
                    com.iqoption.core.ui.widget.recyclerview.adapter.a.a(aVar, list, null, 2, null);
                }
            }
        });
        PL().Qh().observe(lifecycleOwner, new AnonymousClass2(this));
        zr zrVar = (zr) getBinding();
        RecyclerView recyclerView = zrVar.apj;
        kotlin.jvm.internal.i.e(recyclerView, "listView");
        recyclerView.setAdapter(aVar);
        zrVar.apj.addItemDecoration(PO());
        OnClickListener aVar2 = new a(this, aVar);
        zrVar.cul.setOnClickListener(aVar2);
        zrVar.aQO.setOnClickListener(aVar2);
        zrVar.cbI.setOnClickListener(aVar2);
        if (com.iqoption.app.managers.feature.a.ef("templates")) {
            zrVar.cum.setOnClickListener(aVar2);
            return;
        }
        TextView textView = zrVar.cum;
        kotlin.jvm.internal.i.e(textView, "btnSaveAsTemplate");
        com.iqoption.core.ext.a.al(textView);
    }
}

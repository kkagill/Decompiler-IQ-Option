package com.iqoption.charttools.constructor;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.charttools.model.indicator.constructor.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0011\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/charttools/constructor/InputHostViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "item", "Lcom/iqoption/charttools/constructor/InputHost;", "parent", "Lcom/iqoption/charttools/constructor/IndicatorSettingsViewModel;", "destroy", "", "getItems", "", "Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "()[Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "getTitle", "", "init", "viewModel", "select", "host", "Companion", "techtools_release"})
/* compiled from: InputHostViewModel.kt */
public final class q extends ViewModel {
    public static final a aFF = new a();
    private e aFD;
    private o aFE;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/charttools/constructor/InputHostViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/charttools/constructor/InputHostViewModel;", "f", "Landroidx/fragment/app/Fragment;", "techtools_release"})
    /* compiled from: InputHostViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final q e(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragment);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(f)");
            ViewModel viewModel = of.get(q.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (q) viewModel;
        }
    }

    public final void a(e eVar, o oVar) {
        kotlin.jvm.internal.i.f(eVar, "viewModel");
        kotlin.jvm.internal.i.f(oVar, "item");
        this.aFD = eVar;
        this.aFE = oVar;
    }

    public final String getTitle() {
        o oVar = this.aFE;
        String label = oVar != null ? oVar.getLabel() : null;
        return label != null ? label : "";
    }

    public final b[] Nl() {
        o oVar = this.aFE;
        if (oVar != null) {
            b[] Ni = oVar.Ni();
            if (Ni != null) {
                return Ni;
            }
        }
        return new b[0];
    }

    public final void c(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "host");
        e eVar = this.aFD;
        o oVar = this.aFE;
        if (eVar != null && oVar != null) {
            eVar.b(new o(oVar, bVar));
        }
    }

    public final void destroy() {
        e eVar = this.aFD;
        if (eVar != null) {
            eVar.MT();
        }
    }
}

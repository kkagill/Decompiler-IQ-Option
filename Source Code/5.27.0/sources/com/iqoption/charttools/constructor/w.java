package com.iqoption.charttools.constructor;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0011\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/charttools/constructor/InputSelectViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "item", "Lcom/iqoption/charttools/constructor/InputSelect;", "parent", "Lcom/iqoption/charttools/constructor/IndicatorSettingsViewModel;", "destroy", "", "getItems", "", "", "()[Ljava/lang/String;", "getTitle", "init", "viewModel", "select", "option", "Companion", "techtools_release"})
/* compiled from: InputSelectViewModel.kt */
public final class w extends ViewModel {
    public static final a aFS = new a();
    private e aFD;
    private u aFR;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/charttools/constructor/InputSelectViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/charttools/constructor/InputSelectViewModel;", "f", "Landroidx/fragment/app/Fragment;", "techtools_release"})
    /* compiled from: InputSelectViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final w f(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragment);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(f)");
            ViewModel viewModel = of.get(w.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (w) viewModel;
        }
    }

    public final void a(e eVar, u uVar) {
        kotlin.jvm.internal.i.f(eVar, "viewModel");
        kotlin.jvm.internal.i.f(uVar, "item");
        this.aFD = eVar;
        this.aFR = uVar;
    }

    public final String getTitle() {
        u uVar = this.aFR;
        String label = uVar != null ? uVar.getLabel() : null;
        return label != null ? label : "";
    }

    public final String[] Nn() {
        u uVar = this.aFR;
        if (uVar != null) {
            String[] Nm = uVar.Nm();
            if (Nm != null) {
                return Nm;
            }
        }
        return new String[0];
    }

    public final void eM(String str) {
        kotlin.jvm.internal.i.f(str, "option");
        e eVar = this.aFD;
        u uVar = this.aFR;
        if (eVar != null && uVar != null) {
            eVar.b(new u(uVar, i.indexOf(uVar.Nm(), str)));
        }
    }

    public final void destroy() {
        e eVar = this.aFD;
        if (eVar != null) {
            eVar.MR();
        }
    }
}

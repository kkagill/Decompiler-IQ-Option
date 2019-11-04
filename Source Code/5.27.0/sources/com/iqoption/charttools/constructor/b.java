package com.iqoption.charttools.constructor;

import androidx.annotation.AnyThread;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.charttools.model.indicator.h;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/charttools/constructor/IndicatorOutputViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "output", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "getOutput", "()Landroidx/lifecycle/LiveData;", "outputData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "publishOutput", "", "publishOutput$techtools_release", "Companion", "techtools_release"})
/* compiled from: IndicatorOutputViewModel.kt */
public final class b extends ViewModel {
    public static final a aEA = new a();
    private final com.iqoption.core.data.b.b<h> aEy = new com.iqoption.core.data.b.b();
    private final LiveData<h> aEz = this.aEy;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/charttools/constructor/IndicatorOutputViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/charttools/constructor/IndicatorOutputViewModel;", "a", "Landroidx/fragment/app/FragmentActivity;", "techtools_release"})
    /* compiled from: IndicatorOutputViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b f(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "a");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragmentActivity);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(a)");
            ViewModel viewModel = of.get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(a)\n    }[T::class.java]");
            return (b) viewModel;
        }
    }

    public final LiveData<h> MC() {
        return this.aEz;
    }

    @AnyThread
    public final void d(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "output");
        com.iqoption.core.ext.a.d((MutableLiveData) this.aEy, (Object) hVar);
    }
}

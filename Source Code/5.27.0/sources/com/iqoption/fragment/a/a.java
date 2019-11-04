package com.iqoption.fragment.a;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.app.b;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ui.f.d;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Currencies.ConversionCurrency;
import io.reactivex.b.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/fragment/amountcalculator/ExposureViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "exposure", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/microservices/risks/response/Exposure;", "getExposure", "()Landroidx/lifecycle/LiveData;", "exposureData", "Landroidx/lifecycle/MutableLiveData;", "Companion", "app_optionXRelease"})
/* compiled from: ExposureViewModel.kt */
public final class a extends d {
    private static final String TAG = a.class.getSimpleName();
    public static final a dar = new a();
    private final MutableLiveData<com.iqoption.core.microservices.risks.response.a> dap = new MutableLiveData();
    private final LiveData<com.iqoption.core.microservices.risks.response.a> daq = this.dap;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/fragment/amountcalculator/ExposureViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/fragment/amountcalculator/ExposureViewModel;", "f", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: ExposureViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a Z(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragment);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(f)");
            ViewModel viewModel = of.get(a.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (a) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/risks/response/Exposure;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ExposureViewModel.kt */
    /* renamed from: com.iqoption.fragment.a.a$1 */
    static final class AnonymousClass1<T> implements f<com.iqoption.core.microservices.risks.response.a> {
        final /* synthetic */ a das;

        AnonymousClass1(a aVar) {
            this.das = aVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.risks.response.a aVar) {
            this.das.dap.setValue(aVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ExposureViewModel.kt */
    /* renamed from: com.iqoption.fragment.a.a$2 */
    static final class AnonymousClass2<T> implements f<Throwable> {
        final /* synthetic */ a das;

        AnonymousClass2(a aVar) {
            this.das = aVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.das.dap.setValue(null);
        }
    }

    public a() {
        b DG = b.DG();
        String str = "IQAccount.instance()";
        kotlin.jvm.internal.i.e(DG, str);
        Balance DN = DG.DN();
        Object obj = 1;
        if (DN == null || DN.type != 1) {
            obj = null;
        }
        TabHelper IM = TabHelper.IM();
        String str2 = "TabHelper.instance()";
        kotlin.jvm.internal.i.e(IM, str2);
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = IM.IZ();
        String str3 = null;
        if (obj == null || IZ == null) {
            this.dap.setValue(null);
            return;
        }
        long Jf;
        b DG2 = b.DG();
        kotlin.jvm.internal.i.e(DG2, str);
        ConversionCurrency DQ = DG2.DQ();
        if (IZ.isExpired()) {
            TabHelper IM2 = TabHelper.IM();
            kotlin.jvm.internal.i.e(IM2, str2);
            Jf = IM2.Jf();
        } else {
            Jf = System.currentTimeMillis() / 1000;
        }
        long j = Jf;
        com.iqoption.core.microservices.risks.a aVar = com.iqoption.core.microservices.risks.a.bxY;
        int activeId = IZ.getActiveId();
        InstrumentType instrumentType = IZ.getInstrumentType();
        if (DQ != null) {
            str3 = DQ.getName();
        }
        io.reactivex.disposables.b a = aVar.a(activeId, instrumentType, str3, j).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((f) new AnonymousClass1(this), (f) new AnonymousClass2(this));
        kotlin.jvm.internal.i.e(a, "RisksRequests.getActiveE…  \n                    })");
        b(a);
    }

    public final LiveData<com.iqoption.core.microservices.risks.response.a> azY() {
        return this.daq;
    }
}

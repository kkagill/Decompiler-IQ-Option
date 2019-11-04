package com.iqoption.fragment.rightpanel;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import io.reactivex.b.f;
import java.util.Calendar;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\bR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/fragment/rightpanel/RightPanelViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "active", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getActive", "()Landroidx/lifecycle/LiveData;", "activeData", "Landroidx/lifecycle/MutableLiveData;", "calendar", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "disposables", "Lio/reactivex/disposables/Disposable;", "overnightFee", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFeeData;", "getOvernightFee", "overnightFeeMap", "userGroupId", "", "onCleared", "", "setActive", "Companion", "app_optionXRelease"})
/* compiled from: RightPanelViewModel.kt */
public final class q extends ViewModel {
    public static final a dpD = new a();
    private final String TAG = q.class.getSimpleName();
    private final long aZx = com.iqoption.app.b.DG().Et();
    private final Calendar calendar = Calendar.getInstance();
    private io.reactivex.disposables.b dpA;
    private final MutableLiveData<com.iqoption.core.microservices.tradingengine.response.active.a> dpB = new MutableLiveData();
    private final LiveData<com.iqoption.core.microservices.tradingengine.response.active.a> dpC = this.dpB;
    private final MutableLiveData<com.iqoption.core.microservices.risks.response.overnightfee.c> dpy = new MutableLiveData();
    private final LiveData<com.iqoption.core.microservices.risks.response.overnightfee.c> dpz = this.dpy;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/fragment/rightpanel/RightPanelViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/fragment/rightpanel/RightPanelViewModel;", "a", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: RightPanelViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final q t(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "a");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(q.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(a)…nelViewModel::class.java)");
            return (q) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "it", "", "", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFeeData;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RightPanelViewModel.kt */
    static final class b<T> implements f<Map<Integer, ? extends com.iqoption.core.microservices.risks.response.overnightfee.c>> {
        final /* synthetic */ int $activeId;
        final /* synthetic */ q dpE;

        b(q qVar, int i) {
            this.dpE = qVar;
            this.$activeId = i;
        }

        /* renamed from: z */
        public final void accept(Map<Integer, com.iqoption.core.microservices.risks.response.overnightfee.c> map) {
            this.dpE.dpy.postValue(map.get(Integer.valueOf(this.$activeId)));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RightPanelViewModel.kt */
    static final class c<T> implements f<Throwable> {
        final /* synthetic */ q dpE;

        c(q qVar) {
            this.dpE = qVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.dpE.dpy.postValue(null);
        }
    }

    public static final q t(FragmentActivity fragmentActivity) {
        return dpD.t(fragmentActivity);
    }

    public final LiveData<com.iqoption.core.microservices.risks.response.overnightfee.c> aFq() {
        return this.dpz;
    }

    public final void e(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
        this.dpB.setValue(aVar);
        int activeId = aVar.getActiveId();
        io.reactivex.disposables.b bVar = this.dpA;
        if (bVar != null) {
            bVar.dispose();
        }
        this.dpA = com.iqoption.core.data.repository.f.bdW.E(aVar.getInstrumentType()).d(com.iqoption.core.rx.i.aki()).a((f) new b(this, activeId), (f) new c(this));
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        io.reactivex.disposables.b bVar = this.dpA;
        if (bVar != null) {
            bVar.dispose();
        }
    }
}

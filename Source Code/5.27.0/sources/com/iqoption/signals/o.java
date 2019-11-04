package com.iqoption.signals;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.google.gson.JsonObject;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.d;
import com.iqoption.x.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u000eJ\u0006\u0010\u0016\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/signals/SignalsAndAlertsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "alertsFilter", "", "currentFilterIndex", "", "filter", "Landroidx/lifecycle/LiveData;", "getFilter", "()Landroidx/lifecycle/LiveData;", "filterData", "Landroidx/lifecycle/MutableLiveData;", "signalsFilter", "Lcom/iqoption/signals/SignalFilter;", "applyAlertFilterToLiveData", "", "applySignalFilterToLiveData", "onChangeAlertsFilter", "onChangeFilterIndex", "index", "onChangeSignalsFilter", "onTabSelectAlerts", "Companion", "app_optionXRelease"})
/* compiled from: SignalsAndAlertsViewModel.kt */
public final class o extends ViewModel {
    public static final a dTB = new a();
    private final LiveData<String> dTA = this.dTz;
    private int dTw;
    private SignalFilter dTx = SignalFilter.ALL;
    private String dTy = "";
    private final MutableLiveData<String> dTz = new MutableLiveData();

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/signals/SignalsAndAlertsViewModel$Companion;", "", "()V", "FILTER_INDEX_ALERTS", "", "FILTER_INDEX_SIGNALS", "get", "Lcom/iqoption/signals/SignalsAndAlertsViewModel;", "f", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: SignalsAndAlertsViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final o aU(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragment);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(f)");
            ViewModel viewModel = of.get(o.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (o) viewModel;
        }
    }

    public final LiveData<String> aUj() {
        return this.dTA;
    }

    public final void a(SignalFilter signalFilter) {
        kotlin.jvm.internal.i.f(signalFilter, "filter");
        this.dTx = signalFilter;
        if (this.dTw == 0) {
            aUk();
        }
    }

    public final void hc(int i) {
        if (this.dTw != i) {
            this.dTw = i;
            if (i == 0) {
                aUk();
            } else {
                aUl();
            }
        }
    }

    private final void aUk() {
        MutableLiveData mutableLiveData = this.dTz;
        int i = p.aob[this.dTx.ordinal()];
        if (i == 1) {
            i = R.string.all_signals;
        } else if (i == 2) {
            i = R.string.gap;
        } else if (i == 3) {
            i = R.string.sharp_jump_drop;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mutableLiveData.setValue(d.getString(i));
    }

    private final void aUl() {
        this.dTz.setValue(this.dTy);
    }

    public final void aUm() {
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = IM.IZ();
        if (IZ != null) {
            com.iqoption.core.analytics.d EC = d.EC();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("asset_id", (Number) Integer.valueOf(IZ.getActiveId()));
            jsonObject.addProperty("instrument_type", IZ.getInstrumentType().getServerValue());
            EC.a("left-bar_alerts", jsonObject);
        }
    }
}

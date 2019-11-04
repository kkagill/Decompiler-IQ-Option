package com.iqoption.alerts.ui.optionspicker;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.google.gson.JsonObject;
import com.iqoption.core.analytics.d;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0004J\u001c\u0010!\u001a\u00020\u001d2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0019\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00160\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00160\u0014X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, bng = {"Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "assetId", "", "getAssetId", "()I", "setAssetId", "(I)V", "instrumentType", "", "getInstrumentType", "()Ljava/lang/String;", "setInstrumentType", "(Ljava/lang/String;)V", "isShown", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isShownData", "Landroidx/lifecycle/MutableLiveData;", "options", "", "getOptions", "optionsData", "selected", "getSelected", "selectedData", "onHide", "", "onShown", "select", "index", "setOptions", "Companion", "alerts_release"})
/* compiled from: AlertsOptionsPickerViewModel.kt */
public final class b extends ViewModel {
    public static final a aqi = new a();
    private final MutableLiveData<List<String>> aqa = new MutableLiveData();
    private final LiveData<List<String>> aqb = this.aqa;
    private final MutableLiveData<Boolean> aqc = new MutableLiveData();
    private final LiveData<Boolean> aqd = this.aqc;
    private final MutableLiveData<Integer> aqe = new MutableLiveData();
    private final LiveData<Integer> aqf = this.aqe;
    private int aqg;
    private String aqh;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerViewModel;", "a", "Landroidx/fragment/app/FragmentActivity;", "alerts_release"})
    /* compiled from: AlertsOptionsPickerViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b b(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "a");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragmentActivity);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(a)");
            ViewModel viewModel = of.get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(a)\n    }[T::class.java]");
            return (b) viewModel;
        }
    }

    public final LiveData<List<String>> BA() {
        return this.aqb;
    }

    public final LiveData<Boolean> BB() {
        return this.aqd;
    }

    public final LiveData<Integer> BC() {
        return this.aqf;
    }

    public final void dD(int i) {
        this.aqg = i;
    }

    public final void df(String str) {
        this.aqh = str;
    }

    public final void nv() {
        this.aqc.setValue(Boolean.valueOf(true));
    }

    public final void onHide() {
        this.aqc.setValue(Boolean.valueOf(false));
    }

    public final void a(List<String> list, int i) {
        kotlin.jvm.internal.i.f(list, "options");
        this.aqe.setValue(Integer.valueOf(i));
        this.aqa.setValue(list);
    }

    public final void dE(int i) {
        this.aqe.setValue(Integer.valueOf(i));
        int i2 = this.aqg;
        String str = this.aqh;
        if (i2 != 0 && str != null) {
            d EC = com.iqoption.core.d.EC();
            double d = (double) i;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("asset_id", (Number) Integer.valueOf(i2));
            jsonObject.addProperty("instrument_type", str);
            EC.d("alerts_create-repeat-change", d, jsonObject);
        }
    }
}

package com.iqoption.alerts.ui.pricepicker;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.google.gson.JsonObject;
import com.iqoption.core.analytics.d;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u001fJ\u0006\u0010#\u001a\u00020\u001fJ\u0006\u0010$\u001a\u00020\u001fJ\u0006\u0010%\u001a\u00020\u001fJ\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\nJ\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001dH\u0002J\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\nJ&\u0010*\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000¨\u0006."}, bng = {"Lcom/iqoption/alerts/ui/pricepicker/AlertsPricePickerViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "assetId", "", "getAssetId", "()I", "setAssetId", "(I)V", "instrumentType", "", "getInstrumentType", "()Ljava/lang/String;", "setInstrumentType", "(Ljava/lang/String;)V", "isShowResetButton", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isShown", "isShownData", "Landroidx/lifecycle/MutableLiveData;", "precision", "getPrecision", "price", "getPrice", "priceInputHelper", "Lcom/iqoption/core/ui/viewmodel/DecimalInputHelper;", "stepValue", "", "onHide", "", "onKeyClick", "keycode", "onMinusClick", "onPlusClick", "onResetClick", "onShown", "onTextChanged", "priceString", "sendEvent", "value", "setPrice", "step", "userDefined", "Companion", "alerts_release"})
/* compiled from: AlertsPricePickerViewModel.kt */
public final class b extends ViewModel {
    private static final String TAG = b.class.getSimpleName();
    public static final a aqp = new a();
    private final MutableLiveData<Boolean> aqc = new MutableLiveData();
    private int aqg;
    private String aqh;
    private final com.iqoption.core.ui.f.b aqn = new com.iqoption.core.ui.f.b("", 0);
    private double aqo;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/alerts/ui/pricepicker/AlertsPricePickerViewModel$Companion;", "", "()V", "ANALYTICS_VALUE_DELETE", "", "ANALYTICS_VALUE_DIGIT", "ANALYTICS_VALUE_RESET", "ANALYTICS_VALUE_SIGN", "TAG", "", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/alerts/ui/pricepicker/AlertsPricePickerViewModel;", "a", "Landroidx/fragment/app/FragmentActivity;", "alerts_release"})
    /* compiled from: AlertsPricePickerViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b c(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "a");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragmentActivity);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(a)");
            ViewModel viewModel = of.get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(a)\n    }[T::class.java]");
            return (b) viewModel;
        }
    }

    public final LiveData<String> BH() {
        return this.aqn.alM();
    }

    public final LiveData<Integer> BI() {
        return this.aqn.BI();
    }

    public final LiveData<Boolean> BJ() {
        return this.aqn.alN();
    }

    public final LiveData<Boolean> BB() {
        return this.aqc;
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

    public final void a(String str, int i, double d, boolean z) {
        kotlin.jvm.internal.i.f(str, PendingOrderWrapper.PRICE);
        this.aqo = d;
        this.aqn.fg(i);
        this.aqn.s(str, z);
        this.aqn.r(str, z ^ 1);
    }

    public final void setPrice(String str) {
        kotlin.jvm.internal.i.f(str, PendingOrderWrapper.PRICE);
        com.iqoption.core.ui.f.b.a(this.aqn, str, false, 2, null);
    }

    public final void BK() {
        this.aqn.p(this.aqo);
        g(0.0d);
    }

    public final void BL() {
        this.aqn.p(-this.aqo);
        g(0.0d);
    }

    public final void BM() {
        this.aqn.r(com.iqoption.core.ui.f.b.bJS.d(this.aqn.alK(), this.aqn.alJ()), true);
        g(2.0d);
    }

    public final void dh(String str) {
        kotlin.jvm.internal.i.f(str, "priceString");
        if ((kotlin.jvm.internal.i.y((String) BH().getValue(), str) ^ 1) != 0) {
            com.iqoption.core.ui.f.b.b(this.aqn, str, false, 2, null);
        }
    }

    public final void dF(int i) {
        g(i == 67 ? 3.0d : 1.0d);
    }

    private final void g(double d) {
        int i = this.aqg;
        String str = this.aqh;
        if (i != 0 && str != null) {
            d EC = com.iqoption.core.d.EC();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("asset_id", (Number) Integer.valueOf(i));
            jsonObject.addProperty("instrument_type", str);
            EC.a("alerts_create-keyboard-button", d, jsonObject);
        }
    }
}

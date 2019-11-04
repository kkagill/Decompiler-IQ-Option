package com.iqoption.fragment.assets;

import androidx.annotation.MainThread;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.fragment.assets.model.e;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u000fH\u0007J\b\u0010\u0016\u001a\u00020\u000fH\u0007J\b\u0010\u0017\u001a\u00020\u000fH\u0014J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0005J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u000e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0005J\u0006\u0010\u001d\u001a\u00020\u000fR2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/fragment/assets/AssetsOutputViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "callbacks", "", "Lcom/iqoption/fragment/assets/AssetsOutputViewModel$Callback;", "kotlin.jvm.PlatformType", "", "isPickerOpened", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isPickerOpenedData", "Landroidx/lifecycle/MutableLiveData;", "notifyAssetChosen", "", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "notifyCategorySelected", "category", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "notifyPickerClosed", "notifyPickerOpened", "onCleared", "register", "callback", "requestAlert", "requestInfo", "unregister", "unregisterAll", "Callback", "Companion", "app_optionXRelease"})
/* compiled from: AssetsOutputViewModel.kt */
public final class d extends ViewModel {
    public static final b dbk = new b();
    private final Set<a> dbh = Collections.newSetFromMap(new WeakHashMap());
    private final MutableLiveData<Boolean> dbi = new MutableLiveData();
    private final LiveData<Boolean> dbj = this.dbi;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, bng = {"Lcom/iqoption/fragment/assets/AssetsOutputViewModel$Callback;", "", "onAssetChosen", "", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "onCategorySelected", "category", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "onRequestAlert", "onRequestInfo", "app_optionXRelease"})
    /* compiled from: AssetsOutputViewModel.kt */
    public interface a {
        void a(com.iqoption.core.microservices.tradingengine.response.active.a aVar);

        void a(e eVar);

        void b(com.iqoption.core.microservices.tradingengine.response.active.a aVar);

        void c(com.iqoption.core.microservices.tradingengine.response.active.a aVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/fragment/assets/AssetsOutputViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/fragment/assets/AssetsOutputViewModel;", "a", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: AssetsOutputViewModel.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final d o(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "a");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragmentActivity);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(a)");
            ViewModel viewModel = of.get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(a)\n    }[T::class.java]");
            return (d) viewModel;
        }
    }

    public static final d o(FragmentActivity fragmentActivity) {
        return dbk.o(fragmentActivity);
    }

    public final void a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        this.dbh.add(aVar);
    }

    public final void unregisterAll() {
        this.dbh.clear();
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        unregisterAll();
    }

    public final LiveData<Boolean> aAv() {
        return this.dbj;
    }

    @MainThread
    public final void aAw() {
        this.dbi.setValue(Boolean.valueOf(true));
    }

    @MainThread
    public final void aAx() {
        this.dbi.setValue(Boolean.valueOf(false));
    }

    @MainThread
    public final void E(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
        Set<a> set = this.dbh;
        kotlin.jvm.internal.i.e(set, "callbacks");
        for (a a : set) {
            a.a(aVar);
        }
    }

    @MainThread
    public final void F(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
        Set<a> set = this.dbh;
        kotlin.jvm.internal.i.e(set, "callbacks");
        for (a b : set) {
            b.b(aVar);
        }
    }

    @MainThread
    public final void G(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
        Set<a> set = this.dbh;
        kotlin.jvm.internal.i.e(set, "callbacks");
        for (a c : set) {
            c.c(aVar);
        }
    }

    @MainThread
    public final void c(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "category");
        Set<a> set = this.dbh;
        kotlin.jvm.internal.i.e(set, "callbacks");
        for (a a : set) {
            a.a(eVar);
        }
    }
}

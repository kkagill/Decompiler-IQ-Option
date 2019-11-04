package com.iqoption.fragment.assets;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStores;
import com.google.gson.JsonObject;
import com.iqoption.core.d.c;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ui.f.d;
import com.iqoption.core.util.u;
import com.iqoption.fragment.assets.model.AssetCategoryType;
import com.iqoption.fragment.assets.model.AssetSortType;
import com.iqoption.fragment.assets.model.f;
import com.iqoption.fragment.assets.model.l;
import com.iqoption.fragment.assets.model.p;
import io.reactivex.disposables.b;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\bJ\u000e\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010)\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0010\u0010*\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010,J\u000e\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020\u0013J\u0006\u0010/\u001a\u00020 R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R/\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00138B@BX\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\fX\u0004¢\u0006\u0002\n\u0000¨\u00061"}, bng = {"Lcom/iqoption/fragment/assets/AssetsViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "select", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "(Lcom/iqoption/fragment/assets/model/AssetCategoryType;)V", "categoryItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "getCategoryItems", "()Landroidx/lifecycle/LiveData;", "categoryItemsData", "Landroidx/lifecycle/MutableLiveData;", "isSearchShown", "", "isSearchShownData", "model", "Lcom/iqoption/fragment/assets/model/AssetModelImpl;", "<set-?>", "Lcom/iqoption/fragment/assets/AssetsOutputViewModel;", "output", "getOutput", "()Lcom/iqoption/fragment/assets/AssetsOutputViewModel;", "setOutput", "(Lcom/iqoption/fragment/assets/AssetsOutputViewModel;)V", "output$delegate", "Lkotlin/properties/ReadWriteProperty;", "selectedInfo", "Lcom/iqoption/fragment/assets/model/AssetCategoryInfo;", "getSelectedInfo", "selectedInfoData", "onAssetClick", "", "item", "Lcom/iqoption/fragment/assets/model/AssetItem;", "onCategoryClick", "onClickSortBy", "sortType", "Lcom/iqoption/fragment/assets/model/AssetSortType;", "onOpenAlertSetupClick", "onOpenInfoClick", "onToggleFavoritesClick", "search", "constraint", "", "setOutputViewModel", "outputViewModel", "toggleSearch", "Companion", "app_optionXRelease"})
/* compiled from: AssetsViewModel.kt */
public final class e extends d {
    private static final String TAG = e.class.getSimpleName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(e.class), "output", "getOutput()Lcom/iqoption/fragment/assets/AssetsOutputViewModel;"))};
    private static AssetCategoryType dbr;
    public static final a dbs = new a();
    private final MutableLiveData<List<com.iqoption.fragment.assets.model.e>> aLU = new MutableLiveData();
    private final LiveData<List<com.iqoption.fragment.assets.model.e>> aLV = this.aLU;
    private final MutableLiveData<f> dbl = new MutableLiveData();
    private final LiveData<f> dbm = this.dbl;
    private final MutableLiveData<Boolean> dbn = new MutableLiveData();
    private final LiveData<Boolean> dbo = this.dbn;
    private final l dbp;
    private final kotlin.f.d dbq;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "categories", "", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AssetsViewModel.kt */
    /* renamed from: com.iqoption.fragment.assets.e$1 */
    static final class AnonymousClass1<T> implements io.reactivex.b.f<List<? extends com.iqoption.fragment.assets.model.e>> {
        final /* synthetic */ e dbt;

        AnonymousClass1(e eVar) {
            this.dbt = eVar;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.fragment.assets.model.e> list) {
            this.dbt.aLU.postValue(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "info", "Lcom/iqoption/fragment/assets/model/AssetCategoryInfo;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AssetsViewModel.kt */
    /* renamed from: com.iqoption.fragment.assets.e$3 */
    static final class AnonymousClass3<T> implements io.reactivex.b.f<f> {
        final /* synthetic */ e dbt;

        AnonymousClass3(e eVar) {
            this.dbt = eVar;
        }

        /* renamed from: b */
        public final void accept(f fVar) {
            this.dbt.dbl.postValue(fVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/fragment/assets/AssetsViewModel$Companion;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "SELECT", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "TAG", "", "kotlin.jvm.PlatformType", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "get", "Lcom/iqoption/fragment/assets/AssetsViewModel;", "f", "Landroidx/fragment/app/Fragment;", "select", "app_optionXRelease"})
    /* compiled from: AssetsViewModel.kt */
    public static final class a implements Factory {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public <T extends ViewModel> T create(Class<T> cls) {
            kotlin.jvm.internal.i.f(cls, "modelClass");
            return new e(e.dbr);
        }

        public final e a(Fragment fragment, AssetCategoryType assetCategoryType) {
            kotlin.jvm.internal.i.f(fragment, "f");
            e.dbr = assetCategoryType;
            ViewModel viewModel = new ViewModelProvider(ViewModelStores.of(fragment), (Factory) this).get(e.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (e) viewModel;
        }
    }

    private final void a(d dVar) {
        this.dbq.a(this, anY[0], dVar);
    }

    private final d aAA() {
        return (d) this.dbq.b(this, anY[0]);
    }

    public e(AssetCategoryType assetCategoryType) {
        this.dbp = new l(assetCategoryType);
        this.dbq = c.c(null, 1, null);
        b a = this.dbp.aBp().d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass1(this), (io.reactivex.b.f) AnonymousClass2.dbu);
        kotlin.jvm.internal.i.e(a, "model.getCategories()\n  …      \n                })");
        b(a);
        a = this.dbp.aBq().d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass3(this), (io.reactivex.b.f) AnonymousClass4.dbv);
        kotlin.jvm.internal.i.e(a, "model.getSelectedInfo()\n…      \n                })");
        b(a);
    }

    public final LiveData<List<com.iqoption.fragment.assets.model.e>> Qe() {
        return this.aLV;
    }

    public final LiveData<f> aAy() {
        return this.dbm;
    }

    public final LiveData<Boolean> aAz() {
        return this.dbo;
    }

    public final void b(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "outputViewModel");
        a(dVar);
    }

    public final void b(com.iqoption.fragment.assets.model.e eVar) {
        kotlin.jvm.internal.i.f(eVar, "item");
        if (eVar.Ng()) {
            this.dbp.d(eVar);
        } else if (eVar.isSelectable()) {
            this.dbp.e(eVar);
            com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
            u.b o = u.anp().o("instrument_type", u.bU(eVar.JU()));
            com.iqoption.app.b DG = com.iqoption.app.b.DG();
            kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
            String str = "change-asset_tap-instrument";
            EC.a(str, o.o("user_balance_type", Integer.valueOf(DG.DJ())).anr());
        }
        d aAA = aAA();
        if (aAA != null) {
            aAA.c(eVar);
        }
    }

    public final void e(com.iqoption.fragment.assets.model.k kVar) {
        kotlin.jvm.internal.i.f(kVar, "item");
        d aAA = aAA();
        if (aAA != null) {
            aAA.E(kVar.Jt());
        }
    }

    public final void f(com.iqoption.fragment.assets.model.k kVar) {
        kotlin.jvm.internal.i.f(kVar, "item");
        d aAA = aAA();
        if (aAA != null) {
            aAA.F(kVar.Jt());
        }
    }

    public final void g(com.iqoption.fragment.assets.model.k kVar) {
        kotlin.jvm.internal.i.f(kVar, "item");
        d aAA = aAA();
        if (aAA != null) {
            aAA.G(kVar.Jt());
        }
    }

    public final void a(AssetSortType assetSortType) {
        kotlin.jvm.internal.i.f(assetSortType, "sortType");
        f fVar = (f) this.dbm.getValue();
        if (fVar != null) {
            com.iqoption.fragment.assets.model.e aAS = fVar.aAS();
            if (aAS != null) {
                p aAQ = aAS.aAQ();
                if (aAQ != null) {
                    p a;
                    String str = null;
                    if (aAQ.aBv() == assetSortType) {
                        a = p.a(aAQ, null, null, p.a(aAQ, null, 1, null) ^ 1, 3, null);
                    } else {
                        a = p.a(aAQ, null, assetSortType, false, 5, null);
                    }
                    this.dbp.f(a);
                    fVar = (f) this.dbm.getValue();
                    if (fVar != null) {
                        String str2;
                        switch (a.aBv()) {
                            case BY_NAME:
                                str2 = "change-asset_sort-asset";
                                break;
                            case BY_PROFIT:
                                str2 = "change-asset_sort-profit";
                                break;
                            case BY_DIFF:
                                str2 = "change-asset_sort-today";
                                break;
                            case BY_SPOT_PROFIT:
                                str2 = "change-asset_sort-spotprofit";
                                break;
                            case BY_EXPIRATION:
                                str2 = "change-asset_sort-expiration";
                                break;
                            case BY_VOLUME:
                                str2 = "change-asset_sort-volume";
                                break;
                            case BY_SPREAD:
                                str2 = "change-asset_sort-spread";
                                break;
                            case BY_LEVERAGE:
                                str2 = "change-asset_sort-leverage";
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        double d = p.a(a, null, 1, null) ? 0.0d : 1.0d;
                        JsonObject jsonObject = new JsonObject();
                        InstrumentType instrumentType = (InstrumentType) u.bV(fVar.aAS().JU());
                        if (instrumentType != null) {
                            str = instrumentType.getServerValue();
                        }
                        jsonObject.addProperty("instrument_type", str);
                        com.iqoption.app.b DG = com.iqoption.app.b.DG();
                        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
                        jsonObject.addProperty("user_balance_type", (Number) Integer.valueOf(DG.DJ()));
                        com.iqoption.core.d.EC().a(str2, d, jsonObject);
                    }
                }
            }
        }
    }

    public final void axe() {
        Boolean bool = (Boolean) this.dbo.getValue();
        Boolean valueOf = Boolean.valueOf(true);
        if (kotlin.jvm.internal.i.y(bool, valueOf)) {
            this.dbn.setValue(Boolean.valueOf(false));
            A("");
            return;
        }
        this.dbn.setValue(valueOf);
        com.iqoption.core.d.EC().di("change-asset_search");
    }

    public final void A(CharSequence charSequence) {
        l lVar = this.dbp;
        if (charSequence == null) {
            charSequence = "";
        }
        lVar.M(charSequence);
    }

    public final void h(com.iqoption.fragment.assets.model.k kVar) {
        kotlin.jvm.internal.i.f(kVar, "item");
        this.dbp.i(kVar);
        com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
        double d = kVar.QE() ? 0.0d : 1.0d;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("active_id", (Number) Integer.valueOf(kVar.Bs()));
        jsonObject.addProperty("instrument_type", kVar.getInstrumentType().getServerValue());
        EC.a("traderoom_add-favorite-asset", d, jsonObject);
    }
}

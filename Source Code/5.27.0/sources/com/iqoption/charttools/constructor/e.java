package com.iqoption.charttools.constructor;

import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStores;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.iqoption.charttools.model.indicator.constructor.InputItem;
import com.iqoption.charttools.model.indicator.x;
import io.reactivex.p;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0007J\b\u0010$\u001a\u00020!H\u0007J\b\u0010%\u001a\u00020!H\u0007J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002J\b\u0010)\u001a\u00020!H\u0007J\b\u0010*\u001a\u00020!H\u0007J\b\u0010+\u001a\u00020!H\u0007J\u0010\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.H\u0007J\"\u0010/\u001a\u00020!2\b\b\u0002\u00100\u001a\u00020\u00122\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0010\u00102\u001a\u00020!2\u0006\u00103\u001a\u000204H\u0007J\u0010\u00105\u001a\u00020!2\u0006\u00103\u001a\u00020\nH\u0002J\u0010\u00106\u001a\u00020!2\u0006\u00103\u001a\u000207H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000¨\u00069"}, bng = {"Lcom/iqoption/charttools/constructor/IndicatorSettingsViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "inputData", "Lcom/iqoption/charttools/constructor/IndicatorSettingsInputData;", "(Lcom/iqoption/charttools/constructor/IndicatorSettingsInputData;)V", "constructor", "Lcom/iqoption/charttools/model/indicator/constructor/Constructor;", "inputItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "getInputItems", "()Landroidx/lifecycle/LiveData;", "inputItemsData", "Lcom/iqoption/core/data/livedata/IQMutableLiveData;", "inputItemsHelper", "Lcom/iqoption/charttools/constructor/InputAdapterItemsHelper;", "isApplyButtonEnabled", "", "isApplyButtonEnabledData", "isInputHostOptionsOpened", "isInputHostOptionsOpenedData", "isInputSelectOptionsOpened", "isInputSelectOptionsOpenedData", "isRestoreButtonEnabled", "isRestoreButtonEnabledData", "title", "", "getTitle", "titleData", "values", "Lcom/google/gson/JsonArray;", "applyInputs", "", "outputViewModel", "Lcom/iqoption/charttools/constructor/IndicatorOutputViewModel;", "closeInputHostOptions", "closeInputSelectOptions", "collectValues", "Lio/reactivex/Single;", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "openInputHostOptions", "openInputSelectOptions", "restoreInputs", "toggleGroupInfo", "item", "Lcom/iqoption/charttools/constructor/InputGroupTitle;", "updateButtonsState", "post", "items", "updateInputHost", "updated", "Lcom/iqoption/charttools/constructor/InputHost;", "updateInputItem", "updateInputSelect", "Lcom/iqoption/charttools/constructor/InputSelect;", "Companion", "techtools_release"})
/* compiled from: IndicatorSettingsViewModel.kt */
public final class e extends com.iqoption.core.ui.f.d {
    private static final String TAG = e.class.getSimpleName();
    private static d aFe;
    public static final a aFf = new a();
    private final g aEO = new g();
    private com.iqoption.charttools.model.indicator.constructor.a aEP = com.iqoption.charttools.model.indicator.constructor.a.aJS.OB();
    private JsonArray aEQ;
    private final com.iqoption.core.data.b.c<String> aER;
    private final LiveData<String> aES;
    private final com.iqoption.core.data.b.c<List<f>> aET;
    private final LiveData<List<f>> aEU;
    private final com.iqoption.core.data.b.c<Boolean> aEV;
    private final LiveData<Boolean> aEW;
    private final com.iqoption.core.data.b.c<Boolean> aEX;
    private final LiveData<Boolean> aEY;
    private final com.iqoption.core.data.b.c<Boolean> aEZ;
    private final LiveData<Boolean> aFa;
    private final com.iqoption.core.data.b.c<Boolean> aFb;
    private final LiveData<Boolean> aFc;
    private final d aFd;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "call"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    static final class g<V> implements Callable<T> {
        final /* synthetic */ e this$0;

        g(e eVar) {
            this.this$0 = eVar;
        }

        /* renamed from: MX */
        public final com.iqoption.charttools.model.indicator.h call() {
            JsonArray a = this.this$0.aEO.a(this.this$0.aFd.getActiveId(), this.this$0.aEP.f(this.this$0.aEQ), (List) this.this$0.aET.getValue());
            com.iqoption.charttools.model.indicator.h LU = this.this$0.aFd.LU();
            if (LU != null) {
                com.iqoption.charttools.model.indicator.h a2 = com.iqoption.charttools.model.indicator.h.a(LU, null, 0, false, a, 7, null);
                if (a2 != null) {
                    return a2;
                }
            }
            return new com.iqoption.charttools.model.indicator.h(this.this$0.aFd.MH(), 0, false, a);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "call"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    static final class k<V> implements Callable<T> {
        final /* synthetic */ e this$0;

        k(e eVar) {
            this.this$0 = eVar;
        }

        public final List<com.iqoption.charttools.model.indicator.h> call() {
            List<com.iqoption.charttools.model.indicator.h> MJ = this.this$0.aFd.MJ();
            return (MJ == null || (MJ.isEmpty() ^ 1) == 0) ? null : MJ;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    /* renamed from: com.iqoption.charttools.constructor.e$1 */
    static final class AnonymousClass1<T> implements io.reactivex.b.f<List<? extends f>> {
        final /* synthetic */ e this$0;

        AnonymousClass1(e eVar) {
            this.this$0 = eVar;
        }

        /* renamed from: v */
        public final void accept(List<? extends f> list) {
            com.iqoption.core.data.b.c e = this.this$0.aET;
            String str = "it";
            kotlin.jvm.internal.i.e(list, str);
            Object obj = (((Collection) list).isEmpty() ^ 1) != 0 ? list : null;
            if (obj == null) {
                obj = l.listOf(a.aEx);
            }
            e.postValue(obj);
            e eVar = this.this$0;
            kotlin.jvm.internal.i.e(list, str);
            eVar.a(true, (List) list);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/charttools/constructor/IndicatorSettingsViewModel$Companion;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "INPUT_DATA", "Lcom/iqoption/charttools/constructor/IndicatorSettingsInputData;", "TAG", "", "kotlin.jvm.PlatformType", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "get", "Lcom/iqoption/charttools/constructor/IndicatorSettingsViewModel;", "f", "Landroidx/fragment/app/Fragment;", "inputData", "techtools_release"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    public static final class a implements Factory {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public <T extends ViewModel> T create(Class<T> cls) {
            kotlin.jvm.internal.i.f(cls, "modelClass");
            d MW = e.aFe;
            if (MW == null) {
                kotlin.jvm.internal.i.lG("INPUT_DATA");
            }
            return new e(MW);
        }

        public final e a(Fragment fragment, d dVar) {
            kotlin.jvm.internal.i.f(fragment, "f");
            kotlin.jvm.internal.i.f(dVar, "inputData");
            a aVar = this;
            e.aFe = dVar;
            ViewModel viewModel = new ViewModelProvider(ViewModelStores.of(fragment), (Factory) this).get(e.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (e) viewModel;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    static final class b<T> implements io.reactivex.b.f<com.iqoption.charttools.model.indicator.h> {
        final /* synthetic */ b aFh;

        b(b bVar) {
            this.aFh = bVar;
        }

        /* renamed from: e */
        public final void accept(com.iqoption.charttools.model.indicator.h hVar) {
            b bVar = this.aFh;
            kotlin.jvm.internal.i.e(hVar, "indicator");
            bVar.d(hVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<Throwable> {
        public static final c aFi = new c();

        c() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "apply"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    static final class d<T, R> implements io.reactivex.b.g<com.iqoption.charttools.model.indicator.h, io.reactivex.c> {
        final /* synthetic */ e this$0;

        d(e eVar) {
            this.this$0 = eVar;
        }

        /* renamed from: f */
        public final io.reactivex.c apply(com.iqoption.charttools.model.indicator.h hVar) {
            kotlin.jvm.internal.i.f(hVar, "indicator");
            if (hVar.getIndex() != 0) {
                return com.iqoption.charttools.f.a(com.iqoption.charttools.f.aCQ, this.this$0.aFd.MG(), hVar.getIndex(), null, hVar.Oh(), false, 20, null);
            }
            return com.iqoption.charttools.f.aCQ.a(this.this$0.aFd.MG(), hVar.MH(), hVar.Oh()).blf();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    static final class e implements io.reactivex.b.a {
        public static final e aFj = new e();

        e() {
        }

        public final void run() {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        public static final f aFk = new f();

        f() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/charttools/model/indicator/constructor/Constructor;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    static final class h<T> implements io.reactivex.b.f<com.iqoption.charttools.model.indicator.constructor.a> {
        final /* synthetic */ x aDt;
        final /* synthetic */ e this$0;

        h(e eVar, x xVar) {
            this.this$0 = eVar;
            this.aDt = xVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.charttools.model.indicator.constructor.a aVar) {
            e eVar = this.this$0;
            kotlin.jvm.internal.i.e(aVar, "it");
            eVar.aEP = aVar;
            this.this$0.aER.postValue(this.aDt.On());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "hosts", "Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "constructor", "Lcom/iqoption/charttools/model/indicator/constructor/Constructor;", "apply"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    static final class i<T1, T2, R> implements io.reactivex.b.c<List<? extends com.iqoption.charttools.model.indicator.constructor.b>, com.iqoption.charttools.model.indicator.constructor.a, List<? extends f>> {
        final /* synthetic */ kotlin.jvm.a.a aFl;
        final /* synthetic */ e this$0;

        i(e eVar, kotlin.jvm.a.a aVar) {
            this.this$0 = eVar;
            this.aFl = aVar;
        }

        /* renamed from: a */
        public final List<f> apply(List<com.iqoption.charttools.model.indicator.constructor.b> list, com.iqoption.charttools.model.indicator.constructor.a aVar) {
            List list2;
            kotlin.jvm.internal.i.f(list, "hosts");
            kotlin.jvm.internal.i.f(aVar, "constructor");
            g b = this.this$0.aEO;
            InputItem[] f = aVar.f(this.this$0.aEQ);
            com.iqoption.charttools.model.indicator.constructor.c[] Oz = aVar.Oz();
            JsonArray d = this.this$0.aEQ;
            if (d != null) {
                Iterable<JsonElement> iterable = d;
                Collection arrayList = new ArrayList(n.e(iterable, 10));
                for (JsonElement jsonElement : iterable) {
                    kotlin.jvm.internal.i.e(jsonElement, "it");
                    arrayList.add(jsonElement.getAsString());
                }
                list2 = (List) arrayList;
            } else {
                list2 = aVar.Oy();
            }
            return b.a(f, Oz, list2, list, this.this$0.aEQ == null, this.aFl);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "constructor", "Lcom/iqoption/charttools/model/indicator/constructor/Constructor;", "apply"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    static final class j<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ kotlin.jvm.a.a aFl;
        final /* synthetic */ e this$0;

        j(e eVar, kotlin.jvm.a.a aVar) {
            this.this$0 = eVar;
            this.aFl = aVar;
        }

        /* renamed from: b */
        public final List<f> apply(com.iqoption.charttools.model.indicator.constructor.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "constructor");
            return this.this$0.aEO.a(aVar.f(this.this$0.aEQ), aVar.Oz(), aVar.Oy(), m.emptyList(), false, this.aFl);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "indicators", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "apply"})
    /* compiled from: IndicatorSettingsViewModel.kt */
    static final class l<T, R> implements io.reactivex.b.g<T, R> {
        public static final l aFm = new l();

        l() {
        }

        public final List<com.iqoption.charttools.model.indicator.constructor.b> apply(List<com.iqoption.charttools.model.indicator.h> list) {
            kotlin.jvm.internal.i.f(list, "indicators");
            return n.f(n.f(n.b(u.Z(list), (kotlin.jvm.a.b) IndicatorSettingsViewModel$itemsStream$hostsStream$2$1.aFn), IndicatorSettingsViewModel$itemsStream$hostsStream$2$2.aFo));
        }
    }

    public e(d dVar) {
        Object a;
        kotlin.jvm.internal.i.f(dVar, "inputData");
        this.aFd = dVar;
        String str = "";
        this.aER = new com.iqoption.core.data.b.c(str);
        this.aES = this.aER;
        this.aET = new com.iqoption.core.data.b.c(m.emptyList());
        this.aEU = this.aET;
        Boolean valueOf = Boolean.valueOf(false);
        this.aEV = new com.iqoption.core.data.b.c(valueOf);
        this.aEW = this.aEV;
        this.aEX = new com.iqoption.core.data.b.c(Boolean.valueOf(true));
        this.aEY = this.aEX;
        this.aEZ = new com.iqoption.core.data.b.c(valueOf);
        this.aFa = this.aEZ;
        this.aFb = new com.iqoption.core.data.b.c(valueOf);
        this.aFc = this.aFb;
        x MH = this.aFd.MH();
        this.aEP = com.iqoption.charttools.model.indicator.constructor.a.aJS.OB();
        com.iqoption.charttools.model.indicator.h LU = this.aFd.LU();
        this.aEQ = LU != null ? LU.Oh() : null;
        this.aER.setValue(str);
        this.aET.setValue(l.listOf(aa.aGd));
        this.aEV.setValue(valueOf);
        this.aEX.setValue(valueOf);
        this.aFb.setValue(valueOf);
        this.aEZ.setValue(valueOf);
        kotlin.jvm.a.a indicatorSettingsViewModel$onChanged$1 = new IndicatorSettingsViewModel$onChanged$1(this);
        p h = com.iqoption.charttools.k.a(com.iqoption.charttools.k.aDB, MH, null, 2, null).h((io.reactivex.b.f) new h(this, MH));
        kotlin.jvm.internal.i.e(h, "IndicatorsLibraryManager…itle())\n                }");
        if (MH instanceof com.iqoption.charttools.model.indicator.k) {
            p t = io.reactivex.i.g(new k(this)).b((t) com.iqoption.charttools.f.aCQ.ey(this.aFd.MG())).t(l.aFm);
            kotlin.jvm.internal.i.e(t, "Maybe\n                  …t()\n                    }");
            a = p.a(t, h, new i(this, indicatorSettingsViewModel$onChanged$1));
        } else {
            a = h.t(new j(this, indicatorSettingsViewModel$onChanged$1));
        }
        kotlin.jvm.internal.i.e(a, "if (meta is Figure) {\n  …              }\n        }");
        io.reactivex.disposables.b a2 = a.h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass1(this), (io.reactivex.b.f) AnonymousClass2.aFg);
        kotlin.jvm.internal.i.e(a2, "itemsStream\n            …      \n                })");
        b(a2);
    }

    public final LiveData<String> MK() {
        return this.aES;
    }

    public final LiveData<List<f>> ML() {
        return this.aEU;
    }

    public final LiveData<Boolean> MM() {
        return this.aEW;
    }

    public final LiveData<Boolean> MN() {
        return this.aEY;
    }

    public final LiveData<Boolean> MO() {
        return this.aFa;
    }

    public final LiveData<Boolean> MP() {
        return this.aFc;
    }

    @MainThread
    public final void b(u uVar) {
        kotlin.jvm.internal.i.f(uVar, "updated");
        a((f) uVar);
    }

    @MainThread
    public final void b(o oVar) {
        kotlin.jvm.internal.i.f(oVar, "updated");
        a((f) oVar);
    }

    private final void a(f fVar) {
        com.iqoption.core.data.b.c cVar = this.aET;
        List<f> I = u.I((Collection) cVar.getValue());
        int i = 0;
        for (f JR : I) {
            if ((JR.getId().intValue() == fVar.getId().intValue() ? 1 : null) != null) {
                break;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            I.set(i, fVar);
        }
        cVar.setValue(I);
        a(this, false, null, 3, null);
    }

    @MainThread
    public final void MQ() {
        this.aEZ.setValue(Boolean.valueOf(true));
    }

    @MainThread
    public final void MR() {
        this.aEZ.setValue(Boolean.valueOf(false));
    }

    @MainThread
    public final void MS() {
        this.aFb.setValue(Boolean.valueOf(true));
    }

    @MainThread
    public final void MT() {
        this.aFb.setValue(Boolean.valueOf(false));
    }

    @MainThread
    public final void b(n nVar) {
        kotlin.jvm.internal.i.f(nVar, "item");
        nVar.setExpanded(nVar.nq() ^ 1);
        com.iqoption.core.data.b.c cVar = this.aET;
        List<f> I = u.I((Collection) cVar.getValue());
        int i = 0;
        for (f JR : I) {
            if ((JR.getId().intValue() == nVar.getId().intValue() ? 1 : null) != null) {
                break;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            if (nVar.nq()) {
                I.add(i + 1, new m(nVar.getId().intValue() + 1, nVar.getDescription(), nVar.Nh()));
            } else {
                I.remove(i + 1);
            }
        }
        cVar.setValue(I);
    }

    static /* synthetic */ void a(e eVar, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            list = (List) eVar.aET.getValue();
        }
        eVar.a(z, list);
    }

    private final void a(boolean z, List<? extends f> list) {
        boolean z2;
        int size = list.size();
        Boolean bool = null;
        Boolean bool2 = (Boolean) null;
        boolean z3 = false;
        Boolean valueOf = Boolean.valueOf(false);
        if (size == 0) {
            bool = valueOf;
        }
        Boolean bool3 = bool;
        int i = 0;
        while (true) {
            z2 = true;
            if (i < size) {
                if (bool2 == null && !((f) list.get(i)).isDefault()) {
                    bool2 = Boolean.valueOf(true);
                }
                if (bool3 == null && ((f) list.get(i)).MZ() && !((f) list.get(i)).isValid()) {
                    bool3 = valueOf;
                }
                if (bool2 != null && r5 != null) {
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        com.iqoption.core.data.b.c cVar;
        if (z) {
            cVar = this.aEV;
            if (bool2 != null) {
                z3 = bool2.booleanValue();
            }
            cVar.postValue(Boolean.valueOf(z3));
            cVar = this.aEX;
            if (bool3 != null) {
                z2 = bool3.booleanValue();
            }
            cVar.postValue(Boolean.valueOf(z2));
            return;
        }
        cVar = this.aEV;
        if (bool2 != null) {
            z3 = bool2.booleanValue();
        }
        cVar.setValue(Boolean.valueOf(z3));
        cVar = this.aEX;
        if (bool3 != null) {
            z2 = bool3.booleanValue();
        }
        cVar.setValue(Boolean.valueOf(z2));
    }

    @MainThread
    public final void MU() {
        com.iqoption.core.data.b.c cVar = this.aET;
        Iterable<f> iterable = (Iterable) cVar.getValue();
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (f Nb : iterable) {
            arrayList.add(Nb.Nb());
        }
        cVar.setValue((List) arrayList);
        this.aEV.setValue(Boolean.valueOf(false));
        this.aEX.setValue(Boolean.valueOf(true));
    }

    @MainThread
    public final void a(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "outputViewModel");
        if (this.aFd.MI()) {
            MV().h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new b(bVar), (io.reactivex.b.f) c.aFi);
        } else {
            MV().o(new d(this)).b(com.iqoption.core.rx.i.aki()).a(e.aFj, f.aFk);
        }
    }

    private final p<com.iqoption.charttools.model.indicator.h> MV() {
        p j = p.j(new g(this));
        kotlin.jvm.internal.i.e(j, "Single\n                .…      }\n                }");
        return j;
    }
}

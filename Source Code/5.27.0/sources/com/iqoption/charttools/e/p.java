package com.iqoption.charttools.e;

import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStores;
import com.iqoption.charttools.model.indicator.k;
import com.iqoption.charttools.n;
import com.iqoption.charttools.q;
import com.iqoption.core.data.model.chart.ChartColor;
import com.iqoption.core.data.model.chart.ChartType;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000fJ\b\u00109\u001a\u00020\u001bH\u0002J\b\u0010:\u001a\u000207H\u0007J\u0010\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020\u0017H\u0007J\u0006\u0010=\u001a\u00020\u000fJ\u0010\u0010>\u001a\u0002072\u0006\u0010?\u001a\u00020.H\u0003J\u000e\u0010@\u001a\u0002072\u0006\u0010<\u001a\u00020\u0017J\u0006\u0010A\u001a\u000207J\u000e\u0010B\u001a\u0002072\u0006\u0010C\u001a\u00020\u001bJ\u000e\u0010D\u001a\u0002072\u0006\u0010C\u001a\u00020\u001bJ\u0010\u0010E\u001a\u0002072\u0006\u0010F\u001a\u00020\u001bH\u0007J\u000e\u0010G\u001a\u0002072\u0006\u0010C\u001a\u00020\u001bJ\u000e\u0010H\u001a\u0002072\u0006\u0010C\u001a\u00020\u001bJ\u000e\u0010I\u001a\u0002072\u0006\u0010C\u001a\u00020\u001bJ\u000e\u0010J\u001a\u0002072\u0006\u0010C\u001a\u00020\u001bJ\u000e\u0010K\u001a\u0002072\u0006\u0010<\u001a\u00020\u0017J\u000e\u0010L\u001a\u0002072\u0006\u0010M\u001a\u00020NJ\b\u0010O\u001a\u000207H\u0002J\u001a\u0010P\u001a\u000207*\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010C\u001a\u00020\u001bH\u0002R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0014X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000bR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000bR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000bR\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000bR\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000bR\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u000bR\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000bR\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000bR\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u000bR\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020.01X\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0012\u00103\u001a\u0004\u0018\u000104X\u0004¢\u0006\u0004\n\u0002\u00105¨\u0006R"}, bng = {"Lcom/iqoption/charttools/templates/TemplateViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "inputData", "Lcom/iqoption/charttools/templates/TemplateInputData;", "activesProvider", "Lcom/iqoption/charttools/templates/DistinctActivesProvider;", "(Lcom/iqoption/charttools/templates/TemplateInputData;Lcom/iqoption/charttools/templates/DistinctActivesProvider;)V", "actionResult", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/charttools/templates/TemplateActionResult;", "getActionResult", "()Landroidx/lifecycle/LiveData;", "actionResultData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "currentTemplateName", "", "deleteMode", "", "getDeleteMode", "deleteModeData", "Lcom/iqoption/core/data/livedata/IQMutableLiveData;", "instrumentItems", "", "Lcom/iqoption/charttools/templates/InstrumentAdapterItem;", "getInstrumentItems", "instrumentItemsData", "isAutoScaleEnabled", "", "isAutoScaleEnabledData", "isChartSettingsEnabled", "isChartSettingsEnabledData", "isHeikenAshiEnabled", "isHeikenAshiEnabledData", "isLiveDealsEnabled", "isLiveDealsEnabledData", "isSaveButtonEnabled", "isSaveButtonEnabledData", "isShowLinesSnippet", "isShowLinesSnippetData", "isShowSaveProgress", "isShowSaveProgressData", "isTradersMoodEnabled", "isTradersMoodEnabledData", "isVolumeEnabled", "isVolumeEnabledData", "state", "Lcom/iqoption/charttools/templates/TemplateInitialState;", "getState$techtools_release", "stateData", "Landroidx/lifecycle/MutableLiveData;", "tabId", "templateId", "", "Ljava/lang/Long;", "changeTemplateName", "", "newTemplateName", "checkIsSaveButtonEnabled", "delete", "editInstrument", "item", "getTitle", "onInitialStateSet", "initialState", "removeInstrument", "save", "setAutoScaleEnabled", "enabled", "setChartSettingsEnabled", "setDeleteConfirmationShown", "shown", "setHeikenAshiEnabled", "setLiveDealsEnabled", "setTradersMoodEnabled", "setVolumeEnabled", "toggleInstrumentVisibility", "updateInstrument", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "updateSaveButton", "setEnabled", "Companion", "techtools_release"})
/* compiled from: TemplateViewModel.kt */
public final class p extends com.iqoption.core.ui.f.d {
    public static final String TAG = p.class.getSimpleName();
    public static a aLn = new b();
    private static m aLo;
    public static final a aLp = new a();
    private final String aEK;
    private final Long aKJ;
    private final MutableLiveData<l> aKM = new MutableLiveData();
    private final LiveData<l> aKN = this.aKM;
    private String aKO = "";
    private final com.iqoption.core.data.b.c<List<d>> aKP = new com.iqoption.core.data.b.c(m.emptyList());
    private final LiveData<List<d>> aKQ = this.aKP;
    private final com.iqoption.core.data.b.c<Boolean> aKR;
    private final LiveData<Boolean> aKS;
    private final com.iqoption.core.data.b.c<Boolean> aKT;
    private final LiveData<Boolean> aKU;
    private final com.iqoption.core.data.b.c<Integer> aKV;
    private final LiveData<Integer> aKW;
    private final com.iqoption.core.data.b.c<Boolean> aKX;
    private final LiveData<Boolean> aKY;
    private final com.iqoption.core.data.b.c<Boolean> aKZ;
    private final LiveData<Boolean> aLa;
    private final com.iqoption.core.data.b.c<Boolean> aLb;
    private final LiveData<Boolean> aLc;
    private final com.iqoption.core.data.b.c<Boolean> aLd;
    private final LiveData<Boolean> aLe;
    private final com.iqoption.core.data.b.c<Boolean> aLf;
    private final LiveData<Boolean> aLg;
    private final com.iqoption.core.data.b.c<Boolean> aLh;
    private final LiveData<Boolean> aLi;
    private final com.iqoption.core.data.b.c<Boolean> aLj;
    private final LiveData<Boolean> aLk;
    private final com.iqoption.core.data.b.b<g> aLl;
    private final LiveData<g> aLm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "run", "com/iqoption/charttools/templates/TemplateViewModel$delete$1$1"})
    /* compiled from: TemplateViewModel.kt */
    static final class c implements Runnable {
        final /* synthetic */ p aLq;

        c(p pVar) {
            this.aLq = pVar;
        }

        public final void run() {
            com.iqoption.charttools.a.a aVar = com.iqoption.charttools.a.a.aEw;
            int i = 0;
            int i2 = 0;
            for (d dVar : (Iterable) this.aLq.aKP.getValue()) {
                if (dVar instanceof c) {
                    i++;
                } else if (dVar instanceof b) {
                    i2++;
                }
            }
            aVar.ac(i, i2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: TemplateViewModel.kt */
    static final class f implements Runnable {
        public static final f aLv = new f();

        f() {
        }

        public final void run() {
            com.iqoption.charttools.a.a.aEw.MB();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "initialState", "Lcom/iqoption/charttools/templates/TemplateInitialState;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TemplateViewModel.kt */
    /* renamed from: com.iqoption.charttools.e.p$2 */
    static final class AnonymousClass2<T> implements io.reactivex.b.f<l> {
        final /* synthetic */ p aLq;

        AnonymousClass2(p pVar) {
            this.aLq = pVar;
        }

        /* renamed from: c */
        public final void accept(l lVar) {
            p pVar = this.aLq;
            kotlin.jvm.internal.i.e(lVar, "initialState");
            pVar.b(lVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u000f\u001a\u0002H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, bng = {"Lcom/iqoption/charttools/templates/TemplateViewModel$Companion;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "ACTIVES_PROVIDER", "Lcom/iqoption/charttools/templates/DistinctActivesProvider;", "DELETE_MODE_CONFIRMATION", "", "DELETE_MODE_HIDDEN", "DELETE_MODE_NORMAL", "DELETE_MODE_PROGRESS", "INPUT_DATA", "Lcom/iqoption/charttools/templates/TemplateInputData;", "TAG", "", "kotlin.jvm.PlatformType", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "get", "Lcom/iqoption/charttools/templates/TemplateViewModel;", "f", "Landroidx/fragment/app/Fragment;", "inputData", "a", "Landroidx/fragment/app/FragmentActivity;", "techtools_release"})
    /* compiled from: TemplateViewModel.kt */
    public static final class a implements Factory {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public <T extends ViewModel> T create(Class<T> cls) {
            kotlin.jvm.internal.i.f(cls, "modelClass");
            m PE = p.aLo;
            if (PE == null) {
                kotlin.jvm.internal.i.lG("INPUT_DATA");
            }
            return new p(PE, p.aLn);
        }

        public final p a(Fragment fragment, m mVar) {
            kotlin.jvm.internal.i.f(fragment, "f");
            kotlin.jvm.internal.i.f(mVar, "inputData");
            a aVar = this;
            p.aLo = mVar;
            ViewModel viewModel = new ViewModelProvider(ViewModelStores.of(fragment), (Factory) this).get(p.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (p) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/charttools/templates/TemplateViewModel$Companion$ACTIVES_PROVIDER$1", "Lcom/iqoption/charttools/templates/DistinctActivesProvider;", "get", "Lio/reactivex/Single;", "Landroid/util/SparseArray;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "techtools_release"})
    /* compiled from: TemplateViewModel.kt */
    public static final class b implements a {
        b() {
        }

        public io.reactivex.p<SparseArray<com.iqoption.core.microservices.tradingengine.response.active.a>> get() {
            io.reactivex.p bkV = com.iqoption.asset.mediators.b.b(com.iqoption.asset.mediators.b.axN, null, 1, null).bkV();
            kotlin.jvm.internal.i.e(bkV, "AssetStreamMediator.getA…          .firstOrError()");
            return bkV;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "run", "com/iqoption/charttools/templates/TemplateViewModel$delete$1$2"})
    /* compiled from: TemplateViewModel.kt */
    static final class d implements io.reactivex.b.a {
        final /* synthetic */ p aLq;

        d(p pVar) {
            this.aLq = pVar;
        }

        public final void run() {
            this.aLq.aLl.setValue(h.aKo);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "com/iqoption/charttools/templates/TemplateViewModel$delete$1$3"})
    /* compiled from: TemplateViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ p aLq;

        e(p pVar) {
            this.aLq = pVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.aLq.aLl.setValue(new n(com.iqoption.core.d.getString(n.i.could_not_delete_template)));
            this.aLq.aKV.setValue(Integer.valueOf(2));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: TemplateViewModel.kt */
    static final class g implements io.reactivex.b.a {
        final /* synthetic */ p aLq;

        g(p pVar) {
            this.aLq = pVar;
        }

        public final void run() {
            this.aLq.aLl.postValue(o.aKL);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TemplateViewModel.kt */
    static final class h<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ p aLq;

        h(p pVar) {
            this.aLq = pVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.aLq.aLl.postValue(new n(com.iqoption.core.d.getString(n.i.could_not_save_template)));
            this.aLq.aLj.postValue(Boolean.valueOf(false));
            com.iqoption.core.ext.a.b(this.aLq.aKT, Boolean.valueOf(this.aLq.PD()));
        }
    }

    public p(final m mVar, a aVar) {
        kotlin.jvm.internal.i.f(mVar, "inputData");
        kotlin.jvm.internal.i.f(aVar, "activesProvider");
        this.aKJ = mVar.Pm();
        this.aEK = mVar.MG();
        Boolean valueOf = Boolean.valueOf(false);
        this.aKR = new com.iqoption.core.data.b.c(valueOf);
        this.aKS = this.aKR;
        this.aKT = new com.iqoption.core.data.b.c(valueOf);
        this.aKU = this.aKT;
        this.aKV = new com.iqoption.core.data.b.c(Integer.valueOf(1));
        this.aKW = this.aKV;
        this.aKX = new com.iqoption.core.data.b.c(Boolean.valueOf(true));
        this.aKY = this.aKX;
        this.aKZ = new com.iqoption.core.data.b.c(valueOf);
        this.aLa = this.aKZ;
        this.aLb = new com.iqoption.core.data.b.c(valueOf);
        this.aLc = this.aLb;
        this.aLd = new com.iqoption.core.data.b.c(valueOf);
        this.aLe = this.aLd;
        this.aLf = new com.iqoption.core.data.b.c(valueOf);
        this.aLg = this.aLf;
        this.aLh = new com.iqoption.core.data.b.c(valueOf);
        this.aLi = this.aLh;
        this.aLj = new com.iqoption.core.data.b.c(valueOf);
        this.aLk = this.aLj;
        this.aLl = new com.iqoption.core.data.b.b();
        this.aLm = this.aLl;
        io.reactivex.disposables.b a = aVar.get().h(com.iqoption.core.rx.i.aki()).q(new io.reactivex.b.g<T, t<? extends R>>(this) {
            final /* synthetic */ p aLq;

            /* renamed from: a */
            public final io.reactivex.p<l> apply(final SparseArray<com.iqoption.core.microservices.tradingengine.response.active.a> sparseArray) {
                kotlin.jvm.internal.i.f(sparseArray, "actives");
                if (this.aLq.aKJ != null) {
                    return q.aEd.aw(this.aLq.aKJ.longValue()).bkV().t(new io.reactivex.b.g<T, R>() {
                        /* renamed from: a */
                        public final l apply(com.iqoption.charttools.model.b.a aVar) {
                            kotlin.jvm.internal.i.f(aVar, "template");
                            SparseArray sparseArray = sparseArray;
                            kotlin.jvm.internal.i.e(sparseArray, "actives");
                            return new l(aVar, sparseArray);
                        }
                    });
                }
                if (mVar.Pn() != null) {
                    return com.iqoption.charttools.f.aCQ.ey(mVar.MG()).t(new io.reactivex.b.g<T, R>(this) {
                        final /* synthetic */ AnonymousClass1 aLt;

                        /* renamed from: T */
                        public final l apply(List<com.iqoption.charttools.model.indicator.h> list) {
                            kotlin.jvm.internal.i.f(list, "instruments");
                            Iterable iterable = list;
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object next : iterable) {
                                if (((com.iqoption.charttools.model.indicator.h) next).MH() instanceof k) {
                                    arrayList.add(next);
                                } else {
                                    arrayList2.add(next);
                                }
                            }
                            Pair pair = new Pair(arrayList, arrayList2);
                            List list2 = (List) pair.bnj();
                            List list3 = (List) pair.bnk();
                            SparseArray sparseArray = sparseArray;
                            kotlin.jvm.internal.i.e(sparseArray, "actives");
                            return new l(sparseArray, list3, list2, mVar.Pn(), null, null, 48, null);
                        }
                    });
                }
                throw new IllegalArgumentException("Input data is invalid");
            }
        }).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass2(this), (io.reactivex.b.f) AnonymousClass3.aLu);
        kotlin.jvm.internal.i.e(a, "activesProvider.get()\n  …      \n                })");
        b(a);
    }

    public final LiveData<l> Pp() {
        return this.aKN;
    }

    public final LiveData<List<d>> Pq() {
        return this.aKQ;
    }

    public final LiveData<Boolean> Pr() {
        return this.aKS;
    }

    public final LiveData<Boolean> Ps() {
        return this.aKU;
    }

    public final LiveData<Integer> Pt() {
        return this.aKW;
    }

    public final LiveData<Boolean> Pu() {
        return this.aKY;
    }

    public final LiveData<Boolean> Pv() {
        return this.aLa;
    }

    public final LiveData<Boolean> Pw() {
        return this.aLc;
    }

    public final LiveData<Boolean> Px() {
        return this.aLe;
    }

    public final LiveData<Boolean> Py() {
        return this.aLg;
    }

    public final LiveData<Boolean> Pz() {
        return this.aLi;
    }

    public final LiveData<Boolean> PA() {
        return this.aLk;
    }

    public final LiveData<g> PB() {
        return this.aLm;
    }

    @WorkerThread
    private final void b(l lVar) {
        this.aKO = lVar.getName();
        this.aKM.postValue(lVar);
        this.aKP.postValue(lVar.Pe());
        this.aKV.postValue(Integer.valueOf(this.aKJ != null ? 2 : 1));
        com.iqoption.core.data.b.c cVar = this.aKR;
        Iterable<d> Pe = lVar.Pe();
        boolean z = false;
        if (!(Pe instanceof Collection) || !((Collection) Pe).isEmpty()) {
            for (d dVar : Pe) {
                if (dVar instanceof b) {
                    z = true;
                    break;
                }
            }
        }
        cVar.postValue(Boolean.valueOf(z));
        this.aKX.postValue(Boolean.valueOf(lVar.Ph()));
        this.aKZ.postValue(Boolean.valueOf(lVar.Pi()));
        this.aLb.postValue(Boolean.valueOf(lVar.Pj()));
        this.aLf.postValue(Boolean.valueOf(lVar.Pk()));
        this.aLd.postValue(Boolean.valueOf(lVar.Pl()));
        this.aLh.postValue(Boolean.valueOf(lVar.Md()));
        this.aKT.postValue(Boolean.valueOf(PD()));
    }

    public final String getTitle() {
        int i;
        if (this.aKJ == null) {
            i = n.i.create_template;
        } else {
            i = n.i.edit_template;
        }
        return com.iqoption.core.d.getString(i);
    }

    public final void d(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "item");
        List list = (List) this.aKP.getValue();
        if (!list.isEmpty()) {
            this.aKP.setValue(u.d((Iterable) list, (Object) dVar));
            if (dVar instanceof c) {
                com.iqoption.charttools.a.a.aEw.eJ(((c) dVar).LU().MH().getType());
            } else if (dVar instanceof b) {
                com.iqoption.charttools.a.a.aEw.eJ(((b) dVar).Pa().MH().getType());
                com.iqoption.core.data.b.c cVar = this.aKR;
                Iterable<d> iterable = (Iterable) this.aKP.getValue();
                boolean z = false;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (d dVar2 : iterable) {
                        if (dVar2 instanceof b) {
                            z = true;
                            break;
                        }
                    }
                }
                cVar.setValue(Boolean.valueOf(z));
            }
            PC();
        }
    }

    public final void e(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "item");
        List<d> list = (List) this.aKP.getValue();
        if (!list.isEmpty()) {
            Object cVar;
            int isHidden;
            if (dVar instanceof c) {
                c cVar2 = (c) dVar;
                isHidden = cVar2.LU().isHidden() ^ 1;
                com.iqoption.charttools.a.a.aEw.m(cVar2.LU().MH().getType(), isHidden);
                cVar = new c(cVar2.getName(), com.iqoption.charttools.model.indicator.h.a(cVar2.LU(), null, 0, isHidden, null, 11, null), null, 4, null);
            } else if (dVar instanceof b) {
                b bVar = (b) dVar;
                isHidden = bVar.Pa().isHidden() ^ 1;
                com.iqoption.charttools.a.a.aEw.m(bVar.Pa().MH().getType(), isHidden);
                cVar = new b(bVar.getName(), bVar.OZ(), com.iqoption.charttools.model.indicator.h.a(bVar.Pa(), null, 0, isHidden, null, 11, null), null, 8, null);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                com.iqoption.core.data.b.c cVar3 = this.aKP;
                int i = 0;
                for (d y : list) {
                    if (kotlin.jvm.internal.i.y(y, dVar)) {
                        break;
                    }
                    i++;
                }
                i = -1;
                cVar3.setValue(com.iqoption.core.ext.c.a((List) list, i, cVar));
                PC();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049 A:{LOOP_END, LOOP:0: B:3:0x001e->B:17:0x0049} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x004d A:{SYNTHETIC, EDGE_INSN: B:47:0x004d->B:19:0x004d ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac A:{LOOP_END, LOOP:1: B:26:0x0081->B:40:0x00ac} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b0 A:{SYNTHETIC, EDGE_INSN: B:49:0x00b0->B:42:0x00b0 ?: BREAK  } */
    public final void j(com.iqoption.charttools.model.indicator.h r15) {
        /*
        r14 = this;
        r0 = "indicator";
        kotlin.jvm.internal.i.f(r15, r0);
        r0 = r14.aKP;
        r0 = r0.getValue();
        r0 = (java.util.List) r0;
        r1 = r15.MH();
        r1 = r1 instanceof com.iqoption.charttools.model.indicator.k;
        r2 = 0;
        r3 = 1;
        r4 = -1;
        r5 = 0;
        if (r1 == 0) goto L_0x007c;
    L_0x0019:
        r1 = r0.iterator();
        r6 = 0;
    L_0x001e:
        r7 = r1.hasNext();
        if (r7 == 0) goto L_0x004c;
    L_0x0024:
        r7 = r1.next();
        r7 = (com.iqoption.charttools.e.d) r7;
        r8 = r7 instanceof com.iqoption.charttools.e.b;
        if (r8 != 0) goto L_0x002f;
    L_0x002e:
        r7 = r2;
    L_0x002f:
        r7 = (com.iqoption.charttools.e.b) r7;
        if (r7 == 0) goto L_0x0045;
    L_0x0033:
        r7 = r7.Pa();
        if (r7 == 0) goto L_0x0045;
    L_0x0039:
        r7 = r7.getIndex();
        r8 = r15.getIndex();
        if (r7 != r8) goto L_0x0045;
    L_0x0043:
        r7 = 1;
        goto L_0x0046;
    L_0x0045:
        r7 = 0;
    L_0x0046:
        if (r7 == 0) goto L_0x0049;
    L_0x0048:
        goto L_0x004d;
    L_0x0049:
        r6 = r6 + 1;
        goto L_0x001e;
    L_0x004c:
        r6 = -1;
    L_0x004d:
        if (r6 == r4) goto L_0x00c9;
    L_0x004f:
        r1 = r0.get(r6);
        if (r1 == 0) goto L_0x0074;
    L_0x0055:
        r1 = (com.iqoption.charttools.e.b) r1;
        r2 = new com.iqoption.charttools.e.b;
        r8 = r1.getName();
        r9 = r1.OZ();
        r11 = 0;
        r12 = 8;
        r13 = 0;
        r7 = r2;
        r10 = r15;
        r7.<init>(r8, r9, r10, r11, r12, r13);
        r15 = r14.aKP;
        r0 = com.iqoption.core.ext.c.a(r0, r6, r2);
        r15.setValue(r0);
        goto L_0x00c9;
    L_0x0074:
        r15 = new kotlin.TypeCastException;
        r0 = "null cannot be cast to non-null type com.iqoption.charttools.templates.FigureItem";
        r15.<init>(r0);
        throw r15;
    L_0x007c:
        r1 = r0.iterator();
        r6 = 0;
    L_0x0081:
        r7 = r1.hasNext();
        if (r7 == 0) goto L_0x00af;
    L_0x0087:
        r7 = r1.next();
        r7 = (com.iqoption.charttools.e.d) r7;
        r8 = r7 instanceof com.iqoption.charttools.e.c;
        if (r8 != 0) goto L_0x0092;
    L_0x0091:
        r7 = r2;
    L_0x0092:
        r7 = (com.iqoption.charttools.e.c) r7;
        if (r7 == 0) goto L_0x00a8;
    L_0x0096:
        r7 = r7.LU();
        if (r7 == 0) goto L_0x00a8;
    L_0x009c:
        r7 = r7.getIndex();
        r8 = r15.getIndex();
        if (r7 != r8) goto L_0x00a8;
    L_0x00a6:
        r7 = 1;
        goto L_0x00a9;
    L_0x00a8:
        r7 = 0;
    L_0x00a9:
        if (r7 == 0) goto L_0x00ac;
    L_0x00ab:
        goto L_0x00b0;
    L_0x00ac:
        r6 = r6 + 1;
        goto L_0x0081;
    L_0x00af:
        r6 = -1;
    L_0x00b0:
        if (r6 == r4) goto L_0x00c9;
    L_0x00b2:
        r1 = new com.iqoption.charttools.e.c;
        r8 = r15.Of();
        r10 = 0;
        r11 = 4;
        r12 = 0;
        r7 = r1;
        r9 = r15;
        r7.<init>(r8, r9, r10, r11, r12);
        r15 = r14.aKP;
        r0 = com.iqoption.core.ext.c.a(r0, r6, r1);
        r15.setValue(r0);
    L_0x00c9:
        r14.PC();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.charttools.e.p.j(com.iqoption.charttools.model.indicator.h):void");
    }

    @MainThread
    public final void f(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "item");
        com.iqoption.charttools.model.indicator.h LU = dVar instanceof c ? ((c) dVar).LU() : dVar instanceof b ? ((b) dVar).Pa() : null;
        if (LU != null) {
            l lVar = (l) this.aKN.getValue();
            if (lVar != null) {
                List MJ = lVar.MJ();
                if (MJ != null) {
                    this.aLl.setValue(new i(new com.iqoption.charttools.constructor.d(this.aEK, LU, true, MJ)));
                }
            }
        }
    }

    @MainThread
    public final void bV(boolean z) {
        this.aKV.setValue(Integer.valueOf(z ? 3 : 2));
    }

    @MainThread
    public final void delete() {
        Long l = this.aKJ;
        if (l != null) {
            long longValue = l.longValue();
            this.aKV.setValue(Integer.valueOf(4));
            io.reactivex.disposables.b a = q.aEd.ax(longValue).c((io.reactivex.c) io.reactivex.a.l(new c(this))).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).a(new d(this), new e(this));
            kotlin.jvm.internal.i.e(a, "TemplateManager\n        …AL\n                    })");
            b(a);
        }
    }

    public final void save() {
        l lVar = (l) this.aKN.getValue();
        if (lVar != null) {
            com.iqoption.charttools.model.a.a aVar;
            io.reactivex.a a;
            kotlin.jvm.internal.i.e(lVar, "state.value ?: return");
            this.aLj.setValue(Boolean.valueOf(true));
            this.aKT.setValue(Boolean.valueOf(false));
            if (kotlin.jvm.internal.i.y((Boolean) this.aKY.getValue(), Boolean.valueOf(true))) {
                ChartType Pf = lVar.Pf();
                ChartColor Pg = lVar.Pg();
                Integer NV = lVar.NV();
                Boolean bool = (Boolean) this.aLa.getValue();
                if (bool == null) {
                    bool = Boolean.valueOf(false);
                }
                Boolean bool2 = bool;
                bool = (Boolean) this.aLc.getValue();
                if (bool == null) {
                    bool = Boolean.valueOf(false);
                }
                Boolean bool3 = bool;
                bool = (Boolean) this.aLg.getValue();
                if (bool == null) {
                    bool = Boolean.valueOf(false);
                }
                Boolean bool4 = bool;
                bool = (Boolean) this.aLe.getValue();
                if (bool == null) {
                    bool = Boolean.valueOf(false);
                }
                Boolean bool5 = bool;
                bool = (Boolean) this.aLi.getValue();
                if (bool == null) {
                    bool = Boolean.valueOf(false);
                }
                com.iqoption.charttools.model.a.a aVar2 = new com.iqoption.charttools.model.a.a(Pf, Pg, NV, bool2, bool3, bool4, bool5, bool);
            } else {
                aVar = null;
            }
            Collection arrayList = new ArrayList();
            for (d dVar : (Iterable) this.aKP.getValue()) {
                d dVar2;
                if (!(dVar2 instanceof c)) {
                    dVar2 = null;
                }
                c cVar = (c) dVar2;
                Object LU = cVar != null ? cVar.LU() : null;
                if (LU != null) {
                    arrayList.add(LU);
                }
            }
            List list = (List) arrayList;
            Collection arrayList2 = new ArrayList();
            for (d dVar3 : (Iterable) this.aKP.getValue()) {
                d dVar32;
                if (!(dVar32 instanceof b)) {
                    dVar32 = null;
                }
                b bVar = (b) dVar32;
                Object Pa = bVar != null ? bVar.Pa() : null;
                if (Pa != null) {
                    arrayList2.add(Pa);
                }
            }
            List list2 = (List) arrayList2;
            if (this.aKJ == null) {
                a = q.aEd.a(this.aKO, aVar, list, list2);
            } else {
                a = q.aEd.a(this.aKJ.longValue(), this.aKO, aVar, list, list2);
            }
            io.reactivex.disposables.b a2 = a.c((io.reactivex.c) io.reactivex.a.l(f.aLv)).b(com.iqoption.core.rx.i.aki()).a(new g(this), new h(this));
            kotlin.jvm.internal.i.e(a2, "addOrUpdateTemplate\n    …led())\n                })");
            b(a2);
        }
    }

    public final void eS(String str) {
        kotlin.jvm.internal.i.f(str, "newTemplateName");
        if (!kotlin.jvm.internal.i.y(this.aKO, str)) {
            this.aKO = v.trim(str).toString();
            PC();
        }
    }

    public final void bW(boolean z) {
        com.iqoption.charttools.a.a.aEw.bL(z);
        a(this.aKX, z);
    }

    public final void bX(boolean z) {
        com.iqoption.charttools.a.a.aEw.bN(z);
        a(this.aKZ, z);
    }

    public final void bY(boolean z) {
        com.iqoption.charttools.a.a.aEw.bM(z);
        a(this.aLb, z);
    }

    public final void setTradersMoodEnabled(boolean z) {
        com.iqoption.charttools.a.a.aEw.bO(z);
        a(this.aLf, z);
    }

    public final void setLiveDealsEnabled(boolean z) {
        com.iqoption.charttools.a.a.aEw.bP(z);
        a(this.aLd, z);
    }

    public final void bK(boolean z) {
        com.iqoption.charttools.a.a.aEw.bQ(z);
        a(this.aLh, z);
    }

    private final void a(com.iqoption.core.data.b.c<Boolean> cVar, boolean z) {
        if (((Boolean) cVar.getValue()).booleanValue() != z) {
            cVar.setValue(Boolean.valueOf(z));
            PC();
        }
    }

    private final void PC() {
        com.iqoption.core.ext.a.a(this.aKT, Boolean.valueOf(PD()));
    }

    private final boolean PD() {
        l lVar = (l) this.aKN.getValue();
        if (lVar != null) {
            kotlin.jvm.internal.i.e(lVar, "state.value ?: return false");
            if ((((CharSequence) this.aKO).length() == 0 ? 1 : null) != null || ((((List) this.aKP.getValue()).isEmpty() && kotlin.jvm.internal.i.y((Boolean) this.aKY.getValue(), Boolean.valueOf(false))) || (this.aKJ != null && (kotlin.jvm.internal.i.y(this.aKO, lVar.getName()) ^ 1) == 0 && (kotlin.jvm.internal.i.y((Boolean) this.aKY.getValue(), Boolean.valueOf(lVar.Ph())) ^ 1) == 0 && (kotlin.jvm.internal.i.y((Boolean) this.aLa.getValue(), Boolean.valueOf(lVar.Pi())) ^ 1) == 0 && (kotlin.jvm.internal.i.y((Boolean) this.aLc.getValue(), Boolean.valueOf(lVar.Pj())) ^ 1) == 0 && (kotlin.jvm.internal.i.y((Boolean) this.aLg.getValue(), Boolean.valueOf(lVar.Pk())) ^ 1) == 0 && (kotlin.jvm.internal.i.y((Boolean) this.aLe.getValue(), Boolean.valueOf(lVar.Pl())) ^ 1) == 0 && (kotlin.jvm.internal.i.y((Boolean) this.aLi.getValue(), Boolean.valueOf(lVar.Md())) ^ 1) == 0 && (kotlin.jvm.internal.i.y((List) this.aKP.getValue(), lVar.Pe()) ^ 1) == 0))) {
                return false;
            }
            return true;
        }
        return false;
    }
}

package com.iqoption.fragment.rightpanel;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.google.gson.JsonObject;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.useralerts.response.AssetAlertType;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import com.iqoption.gl.NativeHandler;
import com.iqoption.gl.NativeHandler.l;
import com.iqoption.util.MusicUtil;
import com.iqoption.util.MusicUtil.Sound;
import com.iqoption.x.R;
import io.reactivex.p;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.t;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0019\u0018\u0000 Q2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001QB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010'\u001a\u00020(H\u0017J\u0018\u0010)\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\bH\u0017J\u001a\u0010*\u001a\u0004\u0018\u00010\u00122\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u001a\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u00103\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00104\u001a\u000200H\u0002J\u0006\u00105\u001a\u00020(J(\u00106\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00107\u001a\u0002002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000200H\u0002J(\u0010;\u001a\u00020(2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u00107\u001a\u0002002\u0006\u00108\u001a\u000209H\u0007J\b\u0010<\u001a\u00020(H\u0014J\u0006\u0010=\u001a\u00020(J\u0006\u0010>\u001a\u00020(J\u0006\u0010?\u001a\u00020(J\u000e\u0010@\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010A\u001a\u00020(J\u001f\u0010B\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.¢\u0006\u0002\u0010CJ\u0010\u0010D\u001a\u00020(2\u0006\u00107\u001a\u000200H\u0016J\u000e\u0010E\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010F\u001a\u00020(2\u0006\u0010G\u001a\u000209H\u0016J\u0006\u0010H\u001a\u00020(J\u000e\u0010I\u001a\u00020(2\u0006\u0010J\u001a\u00020\u000eJ\u000e\u0010K\u001a\u00020(2\u0006\u0010#\u001a\u00020$J2\u0010L\u001a\u00020(2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000eH\u0003J \u0010L\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010N\u001a\u000200H\u0003J0\u0010O\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010P\u001a\u00020(H\u0002R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u00140\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u00140\u0018X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00150\u00150\u001dX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\nR\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00078F¢\u0006\u0006\u001a\u0004\b%\u0010\nR\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, bng = {"Lcom/iqoption/fragment/rightpanel/PriceAlertViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "Lcom/iqoption/alerts/ui/list/AlertsListInteractor;", "Lcom/iqoption/view/animation/GlobalTimer$TimerUpdateListener;", "Lcom/iqoption/gl/NativeHandler$OnPriceAlertChangeListener;", "()V", "alert", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "getAlert", "()Landroidx/lifecycle/LiveData;", "alertData", "Landroidx/lifecycle/MutableLiveData;", "alertPrice", "", "getAlertPrice", "alertPriceData", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "confirmStatus", "Lkotlin/Pair;", "", "getConfirmStatus", "confirmStatusData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "currPrice", "getCurrPrice", "currPriceData", "dragEventsProcessor", "Lio/reactivex/processors/PublishProcessor;", "kotlin.jvm.PlatformType", "isPulseEnabled", "isPulseEnabledData", "isShowLoading", "isShowLoadingData", "repeat", "Lcom/iqoption/fragment/rightpanel/AlertRepeat;", "getRepeat", "repeatData", "createAlert", "", "editAlert", "getAsset", "assetId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getQuoteValue", "", "tab", "Lcom/iqoption/app/managers/tab/TabHelper$Tab;", "getSuccessAlertMessage", "alertValue", "hideAlertSettings", "onAlertTriggered", "value", "timestamp", "", "analyticsValue", "onAlertTriggeredFromPush", "onCleared", "onCloseFromRightPanel", "onCloseFromTradeRoom", "onCreateAlertFromAssetInfo", "onCreateAlertFromAssetPicker", "onCreateAlertFromTradeRoomBottomBar", "onCreateAlertFromWhatsNew", "(Ljava/lang/Integer;Lcom/iqoption/core/data/model/InstrumentType;)V", "onPriceAlertValueChange", "onRightPanelShown", "onTick", "tick", "saveAlert", "setAlertPrice", "price", "setRepeat", "showAlertSettings", "analyticsEvent", "quote", "showAlertSettingsWhenQuoteReceived", "stopPulsing", "Companion", "app_optionXRelease"})
/* compiled from: PriceAlertViewModel.kt */
public final class n extends com.iqoption.core.ui.f.d implements com.iqoption.alerts.ui.list.f, l, com.iqoption.view.a.b.a {
    private static final String TAG = n.class.getSimpleName();
    public static final a doT = new a();
    private com.iqoption.core.microservices.tradingengine.response.active.a aoX;
    private final MutableLiveData<Boolean> doL;
    private final MutableLiveData<com.iqoption.core.microservices.useralerts.response.a> doM = new MutableLiveData();
    private final MutableLiveData<String> doN = new MutableLiveData();
    private final MutableLiveData<String> doO = new MutableLiveData();
    private final MutableLiveData<AlertRepeat> doP = new MutableLiveData();
    private final MutableLiveData<Boolean> doQ = new MutableLiveData();
    private final com.iqoption.core.data.b.b<Pair<String, Boolean>> doR = new com.iqoption.core.data.b.b();
    private final PublishProcessor<Boolean> doS;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u0013H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/fragment/rightpanel/PriceAlertViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "formatPrice", "price", "", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "get", "Lcom/iqoption/fragment/rightpanel/PriceAlertViewModel;", "a", "Landroidx/fragment/app/FragmentActivity;", "getAlertPrice", "currentPrice", "getPriceStep", "onErrorResumeCause", "Lio/reactivex/Single;", "T", "app_optionXRelease"})
    /* compiled from: PriceAlertViewModel.kt */
    public static final class a {

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/SingleSource;", "T", "kotlin.jvm.PlatformType", "error", "", "apply"})
        /* compiled from: PriceAlertViewModel.kt */
        static final class a<T, R> implements io.reactivex.b.g<Throwable, t<? extends T>> {
            public static final a doY = new a();

            a() {
            }

            /* renamed from: I */
            public final t<? extends T> apply(Throwable th) {
                kotlin.jvm.internal.i.f(th, "error");
                if (th.getCause() != null) {
                    return p.ab(th.getCause());
                }
                return p.ab(th);
            }
        }

        public final double b(com.iqoption.core.microservices.tradingengine.response.active.a aVar, double d) {
            kotlin.jvm.internal.i.f(aVar, "asset");
            return d * 1.0d;
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final double Y(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "asset");
            int i = o.aob[aVar.getInstrumentType().ordinal()];
            return (i == 1 || i == 2 || i == 3 || i == 4) ? 0.01d : 0.1d;
        }

        private final String d(double d, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            return com.iqoption.core.util.e.a(d, aVar.getPrecision(), null, false, false, false, false, null, null, 254, null);
        }

        private final <T> p<T> d(p<T> pVar) {
            p v = pVar.v(a.doY);
            kotlin.jvm.internal.i.e(v, "onErrorResumeNext { erro…          }\n            }");
            return v;
        }

        public final n s(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "a");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragmentActivity);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(a)");
            ViewModel viewModel = of.get(n.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(a)\n    }[T::class.java]");
            return (n) viewModel;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "call"})
    /* compiled from: PriceAlertViewModel.kt */
    static final class i<V> implements Callable<T> {
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dpf;

        i(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            this.dpf = aVar;
        }

        public final Object call() {
            while (true) {
                ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.dpf.getActiveId());
                if (dY != null) {
                    return dY;
                }
                Thread.sleep(50);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"})
    /* compiled from: PriceAlertViewModel.kt */
    /* renamed from: com.iqoption.fragment.rightpanel.n$2 */
    static final class AnonymousClass2<T> implements io.reactivex.b.f<Boolean> {
        final /* synthetic */ n doV;

        AnonymousClass2(n nVar) {
            this.doV = nVar;
        }

        /* renamed from: j */
        public final void accept(Boolean bool) {
            com.iqoption.core.microservices.tradingengine.response.active.a c = this.doV.aoX;
            if (c != null) {
                com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("asset_id", (Number) Integer.valueOf(c.getActiveId()));
                jsonObject.addProperty("instrument_type", c.getInstrumentType().getServerValue());
                EC.b("alerts_create-price-change", jsonObject);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;", "trigger", "apply"})
    /* compiled from: PriceAlertViewModel.kt */
    /* renamed from: com.iqoption.fragment.rightpanel.n$3 */
    static final class AnonymousClass3<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ n doV;

        AnonymousClass3(n nVar) {
            this.doV = nVar;
        }

        /* renamed from: b */
        public final Pair<com.iqoption.core.microservices.tradingengine.response.active.a, com.iqoption.core.microservices.useralerts.response.b> apply(com.iqoption.core.microservices.useralerts.response.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "trigger");
            return kotlin.j.x(this.doV.g(bVar.Bs(), bVar.getInstrumentType()), bVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PriceAlertViewModel.kt */
    /* renamed from: com.iqoption.fragment.rightpanel.n$4 */
    static final class AnonymousClass4<T> implements io.reactivex.b.f<Pair<? extends com.iqoption.core.microservices.tradingengine.response.active.a, ? extends com.iqoption.core.microservices.useralerts.response.b>> {
        final /* synthetic */ n doV;

        AnonymousClass4(n nVar) {
            this.doV = nVar;
        }

        /* renamed from: c */
        public final void accept(Pair<? extends com.iqoption.core.microservices.tradingengine.response.active.a, com.iqoption.core.microservices.useralerts.response.b> pair) {
            com.iqoption.core.microservices.tradingengine.response.active.a aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) pair.bnj();
            com.iqoption.core.microservices.useralerts.response.b bVar = (com.iqoption.core.microservices.useralerts.response.b) pair.bnk();
            if (aVar != null) {
                this.doV.a(aVar, bVar.getValue(), bVar.ajf(), 0.0d);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, bng = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"})
    /* compiled from: PriceAlertViewModel.kt */
    static final class b<T> implements io.reactivex.b.l<Boolean> {
        public static final b doZ = new b();

        b() {
        }

        public final Boolean s(Boolean bool) {
            kotlin.jvm.internal.i.f(bool, "it");
            return bool;
        }

        public /* synthetic */ boolean test(Object obj) {
            return s((Boolean) obj).booleanValue();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"})
    /* compiled from: PriceAlertViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<Boolean> {
        final /* synthetic */ InstrumentType $instrumentType;
        final /* synthetic */ long aYo;
        final /* synthetic */ n doV;
        final /* synthetic */ int dpa;
        final /* synthetic */ double dpb;

        c(n nVar, int i, InstrumentType instrumentType, double d, long j) {
            this.doV = nVar;
            this.dpa = i;
            this.$instrumentType = instrumentType;
            this.dpb = d;
            this.aYo = j;
        }

        /* renamed from: j */
        public final void accept(Boolean bool) {
            com.iqoption.core.microservices.tradingengine.response.active.a a = this.doV.g(this.dpa, this.$instrumentType);
            if (a != null) {
                TabHelper IM = TabHelper.IM();
                kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
                com.iqoption.app.managers.tab.TabHelper.i Jh = IM.Jh();
                if (!(Jh == null || (Jh.getActiveId() == this.dpa && Jh.getInstrumentType() == a.getInstrumentType()))) {
                    TabHelper.IM().u(a);
                }
                this.doV.a(a, this.dpb, this.aYo, 1.0d);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PriceAlertViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        public static final d dpc = new d();

        d() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "kotlin.jvm.PlatformType", "accept", "com/iqoption/fragment/rightpanel/PriceAlertViewModel$saveAlert$1$1$1", "com/iqoption/fragment/rightpanel/PriceAlertViewModel$$special$$inlined$let$lambda$1"})
    /* compiled from: PriceAlertViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<com.iqoption.core.microservices.useralerts.response.a> {
        final /* synthetic */ n doV;
        final /* synthetic */ double dpd;
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dpe;

        e(double d, com.iqoption.core.microservices.tradingengine.response.active.a aVar, n nVar) {
            this.dpd = d;
            this.dpe = aVar;
            this.doV = nVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.useralerts.response.a aVar) {
            this.doV.doR.postValue(kotlin.j.x(this.doV.a(this.dpe, this.dpd), Boolean.valueOf(true)));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept", "com/iqoption/fragment/rightpanel/PriceAlertViewModel$saveAlert$1$1$2", "com/iqoption/fragment/rightpanel/PriceAlertViewModel$$special$$inlined$let$lambda$2"})
    /* compiled from: PriceAlertViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ n doV;
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dpe;

        f(com.iqoption.core.microservices.tradingengine.response.active.a aVar, n nVar) {
            this.dpe = aVar;
            this.doV = nVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            Object message;
            if (th instanceof com.iqoption.core.connect.l) {
                message = ((com.iqoption.core.connect.l) th).getMessage();
            } else {
                message = com.iqoption.core.d.getString(R.string.could_not_update_alert);
            }
            this.doV.doR.postValue(kotlin.j.x(message, Boolean.valueOf(false)));
            this.doV.doQ.postValue(Boolean.valueOf(false));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "kotlin.jvm.PlatformType", "accept", "com/iqoption/fragment/rightpanel/PriceAlertViewModel$saveAlert$1$1$3", "com/iqoption/fragment/rightpanel/PriceAlertViewModel$$special$$inlined$let$lambda$3"})
    /* compiled from: PriceAlertViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<com.iqoption.core.microservices.useralerts.response.a> {
        final /* synthetic */ n doV;
        final /* synthetic */ double dpd;
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dpe;

        g(double d, com.iqoption.core.microservices.tradingengine.response.active.a aVar, n nVar) {
            this.dpd = d;
            this.dpe = aVar;
            this.doV = nVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.useralerts.response.a aVar) {
            this.doV.doR.postValue(kotlin.j.x(this.doV.a(this.dpe, this.dpd), Boolean.valueOf(true)));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept", "com/iqoption/fragment/rightpanel/PriceAlertViewModel$saveAlert$1$1$4", "com/iqoption/fragment/rightpanel/PriceAlertViewModel$$special$$inlined$let$lambda$4"})
    /* compiled from: PriceAlertViewModel.kt */
    static final class h<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ n doV;
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dpe;

        h(com.iqoption.core.microservices.tradingengine.response.active.a aVar, n nVar) {
            this.dpe = aVar;
            this.doV = nVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            Object message;
            if (th instanceof com.iqoption.core.connect.l) {
                message = ((com.iqoption.core.connect.l) th).getMessage();
            } else {
                message = com.iqoption.core.d.getString(R.string.could_not_create_alert);
            }
            this.doV.doR.postValue(kotlin.j.x(message, Boolean.valueOf(false)));
            this.doV.doQ.postValue(Boolean.valueOf(false));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "", "accept"})
    /* compiled from: PriceAlertViewModel.kt */
    static final class j<T> implements io.reactivex.b.f<Object> {
        final /* synthetic */ n doV;
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dpf;
        final /* synthetic */ com.iqoption.app.managers.tab.TabHelper.i dpg;
        final /* synthetic */ com.iqoption.core.microservices.useralerts.response.a dph;
        final /* synthetic */ String dpi;

        j(n nVar, com.iqoption.app.managers.tab.TabHelper.i iVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.useralerts.response.a aVar2, String str) {
            this.doV = nVar;
            this.dpg = iVar;
            this.dpf = aVar;
            this.dph = aVar2;
            this.dpi = str;
        }

        public final void accept(Object obj) {
            TabHelper IM = TabHelper.IM();
            kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
            com.iqoption.app.managers.tab.TabHelper.i Jh = IM.Jh();
            if (Jh != null && Jh.getId() == this.dpg.getId()) {
                this.doV.a(this.dpg, this.dpf, this.dph, this.dpi);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PriceAlertViewModel.kt */
    static final class k<T> implements io.reactivex.b.f<Throwable> {
        public static final k dpj = new k();

        k() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public static final n s(FragmentActivity fragmentActivity) {
        return doT.s(fragmentActivity);
    }

    public n() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Boolean.valueOf(com.iqoption.core.data.d.e.bdq.WK()));
        this.doL = mutableLiveData;
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<Boolean>()");
        this.doS = bmK;
        aHz().observeForever(AnonymousClass1.doU);
        io.reactivex.disposables.b e = this.doS.k(200, TimeUnit.MILLISECONDS).c(com.iqoption.core.rx.i.aki()).e((io.reactivex.b.f) new AnonymousClass2(this));
        kotlin.jvm.internal.i.e(e, "dragEventsProcessor\n    …      }\n                }");
        b(e);
        e = com.iqoption.core.microservices.useralerts.a.b(com.iqoption.core.microservices.useralerts.a.bCX, 0, 1, null).g(new AnonymousClass3(this)).d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass4(this), (io.reactivex.b.f) AnonymousClass5.doW);
        kotlin.jvm.internal.i.e(e, "UserAlertsRequests.getAl…      \n                })");
        b(e);
        NativeHandler.instance().setOnPriceAlertChangeListener(this);
    }

    public final LiveData<Boolean> aHy() {
        return this.doL;
    }

    public final LiveData<com.iqoption.core.microservices.useralerts.response.a> aHz() {
        return this.doM;
    }

    public final LiveData<String> aHA() {
        return this.doN;
    }

    public final LiveData<String> aHB() {
        return this.doO;
    }

    public final LiveData<AlertRepeat> aHC() {
        return this.doP;
    }

    public final LiveData<Boolean> aHD() {
        return this.doQ;
    }

    public final LiveData<Pair<String, Boolean>> aHE() {
        return this.doR;
    }

    @MainThread
    public void Bm() {
        TabHelper IM = TabHelper.IM();
        String str = "TabHelper.instance()";
        kotlin.jvm.internal.i.e(IM, str);
        com.iqoption.app.managers.tab.TabHelper.i Jh = IM.Jh();
        IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, str);
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = IM.IZ();
        if (Jh != null && IZ != null) {
            a(this, IZ, Jh, null, "alerts-screen_alert-add", 4, null);
        }
    }

    @MainThread
    public void a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.useralerts.response.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "asset");
        kotlin.jvm.internal.i.f(aVar2, "alert");
        int activeId = aVar.getActiveId();
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        com.iqoption.app.managers.tab.TabHelper.i Jh = IM.Jh();
        if (!(Jh == null || (Jh.getActiveId() == activeId && Jh.getInstrumentType() == aVar.getInstrumentType()))) {
            Jh = TabHelper.IM().u(aVar);
        }
        if (Jh != null) {
            a(aVar, Jh, aVar2, "alerts-screen_alert-edit");
        }
    }

    @AnyThread
    public final void a(int i, InstrumentType instrumentType, double d, long j) {
        InstrumentType instrumentType2 = instrumentType;
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        io.reactivex.disposables.b a = IM.IN().c(com.iqoption.core.rx.i.aki()).b((io.reactivex.b.l) b.doZ).bkV().a((io.reactivex.b.f) new c(this, i, instrumentType2, d, j), (io.reactivex.b.f) d.dpc);
        kotlin.jvm.internal.i.e(a, "TabHelper.instance().isI…      \n                })");
        b(a);
    }

    private final com.iqoption.core.microservices.tradingengine.response.active.a g(int i, InstrumentType instrumentType) {
        return com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(i), instrumentType);
    }

    private final void a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, double d, long j, double d2) {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar2 = aVar;
        double d3 = d;
        com.iqoption.gl.c.aIy().setPriceAlertDone(d, (double) j, aVar.getActiveId(), com.iqoption.core.microservices.tradingengine.response.active.d.B(aVar), doT.d(d, aVar), aVar.getInstrumentType().getServerValue());
        MusicUtil.a(com.iqoption.core.d.Uo(), Sound.ALERT_TRIGGERED);
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = IM.IZ();
        if (IZ == null) {
            return;
        }
        if (IZ.getActiveId() != aVar.getActiveId() || IZ.getInstrumentType() != aVar.getInstrumentType()) {
            com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("asset_id", (Number) Integer.valueOf(aVar.getActiveId()));
            jsonObject.addProperty("instrument_type", aVar.getInstrumentType().getServerValue());
            EC.g("alerts_done", d2, jsonObject).Cc();
        }
    }

    public void onTick(long j) {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.aoX;
        if (aVar != null) {
            double d = 0.0d;
            ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(aVar.getActiveId());
            if (dY != null) {
                d = dY.getVal();
            }
            this.doO.setValue(doT.d(d, aVar));
            return;
        }
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
    }

    public void L(double d) {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.aoX;
        if (aVar != null) {
            this.doN.postValue(doT.d(d, aVar));
            this.doS.onNext(Boolean.valueOf(true));
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        aHF();
        NativeHandler.instance().setOnPriceAlertChangeListener(null);
    }

    private final double b(com.iqoption.app.managers.tab.TabHelper.i iVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(aVar.getActiveId());
        if (dY != null) {
            return dY.getVal();
        }
        return iVar != null ? com.iqoption.gl.c.aIy().tabGetActualValue(iVar.Ju()) : 0.0d;
    }

    @MainThread
    private final void a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.useralerts.response.a aVar2, double d) {
        this.aoX = aVar;
        this.doM.setValue(aVar2);
        iy(doT.d(aVar2.getValue(), aVar));
        this.doO.setValue(doT.d(d, aVar));
        MutableLiveData mutableLiveData = this.doP;
        AlertRepeat[] values = AlertRepeat.values();
        for (Object obj : values) {
            if ((obj.getActivations() == aVar2.getActivations() ? 1 : null) != null) {
                break;
            }
        }
        Object obj2 = null;
        if (obj2 == null) {
            obj2 = values[0];
        }
        mutableLiveData.setValue(obj2);
        this.doQ.setValue(Boolean.valueOf(false));
        com.iqoption.view.a.b.a aVar3 = this;
        com.iqoption.view.a.b.aYv().b(aVar3);
        com.iqoption.view.a.b.aYv().a(aVar3);
    }

    @MainThread
    private final void a(com.iqoption.app.managers.tab.TabHelper.i iVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.useralerts.response.a aVar2, String str) {
        n nVar;
        com.iqoption.core.microservices.useralerts.response.a aVar3;
        com.iqoption.core.microservices.tradingengine.response.active.a aVar4 = aVar;
        String str2 = str;
        double b = b(iVar, aVar);
        if (aVar2 != null) {
            nVar = this;
            aVar3 = aVar2;
        } else {
            com.iqoption.core.microservices.useralerts.response.a aVar5 = new com.iqoption.core.microservices.useralerts.response.a(0, 0, aVar.getActiveId(), aVar.getInstrumentType(), AssetAlertType.PRICE, doT.b(aVar4, b), AlertRepeat.ONCE.getActivations(), 0, 0, 0, 899, null);
            nVar = this;
            aVar3 = aVar5;
        }
        nVar.a(aVar4, aVar3, b);
        if (str2 != null) {
            com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("asset_id", (Number) Integer.valueOf(aVar.getActiveId()));
            jsonObject.addProperty("instrument_type", aVar.getInstrumentType().getServerValue());
            EC.a(str2, jsonObject);
        }
    }

    public final void aHF() {
        this.aoX = (com.iqoption.core.microservices.tradingengine.response.active.a) null;
        this.doM.setValue(null);
        this.doQ.setValue(Boolean.valueOf(false));
    }

    public final void iy(String str) {
        kotlin.jvm.internal.i.f(str, PendingOrderWrapper.PRICE);
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.aoX;
        if (aVar != null) {
            double ho = com.iqoption.core.util.e.ho(str);
            this.doN.setValue(doT.d(ho, aVar));
            com.iqoption.gl.c.aIy().setPriceAlert(ho, aHz().getValue() != null);
        }
    }

    public final void b(AlertRepeat alertRepeat) {
        kotlin.jvm.internal.i.f(alertRepeat, "repeat");
        this.doP.setValue(alertRepeat);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    public final void aHG() {
        /*
        r19 = this;
        r0 = r19;
        r1 = r0.doQ;
        r2 = 1;
        r2 = java.lang.Boolean.valueOf(r2);
        r1.setValue(r2);
        r1 = r0.aoX;
        if (r1 == 0) goto L_0x00d2;
    L_0x0010:
        r2 = r19.aHz();
        r2 = r2.getValue();
        r2 = (com.iqoption.core.microservices.useralerts.response.a) r2;
        if (r2 == 0) goto L_0x00d2;
    L_0x001c:
        r3 = r19.aHA();
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        if (r3 == 0) goto L_0x0033;
    L_0x0028:
        r3 = kotlin.text.s.mV(r3);
        if (r3 == 0) goto L_0x0033;
    L_0x002e:
        r3 = r3.doubleValue();
        goto L_0x0035;
    L_0x0033:
        r3 = 0;
    L_0x0035:
        r5 = r19.aHC();
        r5 = r5.getValue();
        r5 = (com.iqoption.fragment.rightpanel.AlertRepeat) r5;
        if (r5 == 0) goto L_0x0047;
    L_0x0041:
        r5 = r5.getActivations();
        r13 = r5;
        goto L_0x0049;
    L_0x0047:
        r5 = 0;
        r13 = 0;
    L_0x0049:
        r5 = r2.getId();
        r7 = 0;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 <= 0) goto L_0x0095;
    L_0x0053:
        r15 = doT;
        r5 = com.iqoption.core.microservices.useralerts.a.bCX;
        r6 = r2.getId();
        r8 = r2.Bs();
        r9 = r2.getInstrumentType();
        r10 = r2.ajb();
        r14 = 0;
        r2 = 0;
        r16 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r17 = 0;
        r11 = r3;
        r18 = r15;
        r15 = r2;
        r2 = com.iqoption.core.microservices.useralerts.a.a(r5, r6, r8, r9, r10, r11, r13, r14, r15, r16, r17);
        r5 = r18;
        r2 = r5.d(r2);
        r5 = com.iqoption.core.rx.i.aki();
        r2 = r2.h(r5);
        r5 = new com.iqoption.fragment.rightpanel.n$e;
        r5.<init>(r3, r1, r0);
        r5 = (io.reactivex.b.f) r5;
        r3 = new com.iqoption.fragment.rightpanel.n$f;
        r3.<init>(r1, r0);
        r3 = (io.reactivex.b.f) r3;
        r2.a(r5, r3);
        goto L_0x00d2;
    L_0x0095:
        r15 = doT;
        r5 = com.iqoption.core.microservices.useralerts.a.bCX;
        r6 = r2.Bs();
        r7 = r2.getInstrumentType();
        r8 = r2.ajb();
        r12 = 0;
        r2 = 0;
        r14 = 96;
        r16 = 0;
        r9 = r3;
        r11 = r13;
        r13 = r2;
        r2 = r15;
        r15 = r16;
        r5 = com.iqoption.core.microservices.useralerts.a.a(r5, r6, r7, r8, r9, r11, r12, r13, r14, r15);
        r2 = r2.d(r5);
        r5 = com.iqoption.core.rx.i.aki();
        r2 = r2.h(r5);
        r5 = new com.iqoption.fragment.rightpanel.n$g;
        r5.<init>(r3, r1, r0);
        r5 = (io.reactivex.b.f) r5;
        r3 = new com.iqoption.fragment.rightpanel.n$h;
        r3.<init>(r1, r0);
        r3 = (io.reactivex.b.f) r3;
        r2.a(r5, r3);
    L_0x00d2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.rightpanel.n.aHG():void");
    }

    private final String a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, double d) {
        String string = com.iqoption.core.d.getString(R.string.price_alert_set_title);
        String string2 = com.iqoption.core.d.getString(R.string.notify_me_when, com.iqoption.core.microservices.tradingengine.response.active.d.B(aVar), doT.d(d, aVar));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(10);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void W(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "asset");
        com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("asset_id", (Number) Integer.valueOf(aVar.getActiveId()));
        jsonObject.addProperty("instrument_type", aVar.getInstrumentType().getServerValue());
        EC.c("alerts_create-show", jsonObject);
    }

    public final void X(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "asset");
        aHJ();
        int activeId = aVar.getActiveId();
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        com.iqoption.app.managers.tab.TabHelper.i Jh = IM.Jh();
        if (!(Jh == null || (Jh.getActiveId() == activeId && Jh.getInstrumentType() == aVar.getInstrumentType()))) {
            Jh = TabHelper.IM().u(aVar);
        }
        com.iqoption.app.managers.tab.TabHelper.i iVar = Jh;
        if (iVar != null) {
            a(this, aVar, iVar, null, "traderoom_asset-add-alert", 4, null);
        }
    }

    public final void aHH() {
        aHJ();
        TabHelper IM = TabHelper.IM();
        String str = "TabHelper.instance()";
        kotlin.jvm.internal.i.e(IM, str);
        com.iqoption.app.managers.tab.TabHelper.i Jh = IM.Jh();
        IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, str);
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = IM.IZ();
        if (Jh != null && IZ != null) {
            a(this, Jh, IZ, null, "traderoom_alerts-show", 4, null);
        }
    }

    public final void aHI() {
        aHJ();
        TabHelper IM = TabHelper.IM();
        String str = "TabHelper.instance()";
        kotlin.jvm.internal.i.e(IM, str);
        com.iqoption.app.managers.tab.TabHelper.i Jh = IM.Jh();
        IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, str);
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = IM.IZ();
        if (Jh != null && IZ != null) {
            a(this, Jh, IZ, null, "asset-profile_alert-add", 4, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    public final void c(java.lang.Integer r9, com.iqoption.core.data.model.InstrumentType r10) {
        /*
        r8 = this;
        r8.aHJ();
        r0 = "TabHelper.instance()";
        if (r9 == 0) goto L_0x0013;
    L_0x0007:
        if (r10 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0013;
    L_0x000a:
        r1 = r9.intValue();
        r10 = r8.g(r1, r10);
        goto L_0x001e;
    L_0x0013:
        r10 = com.iqoption.app.managers.tab.TabHelper.IM();
        kotlin.jvm.internal.i.e(r10, r0);
        r10 = r10.IZ();
    L_0x001e:
        r2 = r10;
        if (r2 == 0) goto L_0x005b;
    L_0x0021:
        r10 = com.iqoption.app.managers.tab.TabHelper.IM();
        kotlin.jvm.internal.i.e(r10, r0);
        r10 = r10.Jh();
        if (r10 == 0) goto L_0x004f;
    L_0x002e:
        r0 = r10.getActiveId();
        if (r9 != 0) goto L_0x0035;
    L_0x0034:
        goto L_0x0045;
    L_0x0035:
        r9 = r9.intValue();
        if (r0 != r9) goto L_0x0045;
    L_0x003b:
        r9 = r10.getInstrumentType();
        r0 = r2.getInstrumentType();
        if (r9 == r0) goto L_0x004f;
    L_0x0045:
        r9 = com.iqoption.app.managers.tab.TabHelper.IM();
        r9 = r9.u(r2);
        r3 = r9;
        goto L_0x0050;
    L_0x004f:
        r3 = r10;
    L_0x0050:
        if (r3 == 0) goto L_0x005b;
    L_0x0052:
        r4 = 0;
        r5 = 0;
        r6 = 12;
        r7 = 0;
        r1 = r8;
        a(r1, r2, r3, r4, r5, r6, r7);
    L_0x005b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.rightpanel.n.c(java.lang.Integer, com.iqoption.core.data.model.InstrumentType):void");
    }

    private final void a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.app.managers.tab.TabHelper.i iVar, com.iqoption.core.microservices.useralerts.response.a aVar2, String str) {
        io.reactivex.disposables.b a = p.j(new i(aVar)).m(2, TimeUnit.SECONDS).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new j(this, iVar, aVar, aVar2, str), (io.reactivex.b.f) k.dpj);
        kotlin.jvm.internal.i.e(a, "Single\n                .…      \n                })");
        b(a);
    }

    private final void aHJ() {
        com.iqoption.core.data.d.e.bdq.cy(false);
        com.iqoption.core.ext.a.a(this.doL, Boolean.valueOf(false));
    }

    public final void aHK() {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.aoX;
        if (aVar != null) {
            com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("asset_id", (Number) Integer.valueOf(aVar.getActiveId()));
            jsonObject.addProperty("instrument_type", aVar.getInstrumentType().getServerValue());
            EC.a("traderoom_alerts-close", jsonObject);
        }
        aHF();
    }

    public final void aHL() {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.aoX;
        if (aVar != null) {
            com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("asset_id", (Number) Integer.valueOf(aVar.getActiveId()));
            jsonObject.addProperty("instrument_type", aVar.getInstrumentType().getServerValue());
            EC.a("alerts_create-close", jsonObject);
        }
        aHF();
    }

    static {
        com.iqoption.alerts.ui.list.f.apy.a(PriceAlertViewModel$Companion$1.doX);
    }
}

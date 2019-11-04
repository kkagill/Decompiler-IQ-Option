package com.iqoption.o;

import android.app.Application;
import android.graphics.Rect;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.common.internal.ImagesContract;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.kyc.response.restriction.RestrictionId;
import com.iqoption.dto.ToastEntity;
import com.iqoption.dto.entity.result.BalanceListResult;
import com.iqoption.microservice.regulators.response.StatusType;
import com.iqoption.protrader.dialog.ProTraderDialogType;
import com.iqoption.util.v;
import com.iqoption.welcome.AuthDone;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 M2\u00020\u0001:\u0003LMNB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00110\u0017J&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00110\u00172\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00110\u0017J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010\"J,\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00112\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011H\u0002J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0017J\u0014\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00110*H\u0002J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,J\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00110\u0006J\u000e\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u000202J\"\u00103\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u00104\u001a\u000205H\u0007J\u0006\u00106\u001a\u00020\u001bJ$\u00107\u001a\u00020\u001b2\f\u00108\u001a\b\u0012\u0004\u0012\u00020%0\u00112\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H\u0002J$\u0010:\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010@J\f\u0010A\u001a\b\u0012\u0004\u0012\u0002050\u0006J\u000e\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020DJ\u000e\u0010E\u001a\u00020\u001b2\u0006\u0010F\u001a\u000205J\u000e\u0010G\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020IJ\f\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u0006R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006O"}, bng = {"Lcom/iqoption/traderoom/TradeRoomViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableAndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "action", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action;", "getAction", "()Landroidx/lifecycle/LiveData;", "actionData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "fxHelper", "Lcom/iqoption/traderoom/FxNextExpirationToastHelper;", "nonVerifiedCardsViewModel", "Lcom/iqoption/verify/NonVerifiedCardsViewModel;", "restrictions", "", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "welcomeStateViewModel", "Lcom/iqoption/welcome/WelcomeStateViewModel;", "callPutRestriction", "checkCardStatusChanges", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "cards", "checkNextFxExpiration", "", "activeId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "expTime", "", "(ILcom/iqoption/core/data/model/InstrumentType;Ljava/lang/Long;)V", "getChangedStatuses", "localStatuses", "Lcom/iqoption/cardsverification/repository/VerifyStatus;", "actualCards", "getImportantProApplicationChanges", "Lcom/iqoption/microservice/regulators/response/StatusType;", "getLocalStatuses", "Lio/reactivex/Single;", "getProTraderNotification", "Lio/reactivex/Maybe;", "Lcom/iqoption/protrader/dialog/ProTraderDialogType;", "getRequirements", "Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirement;", "loadBalances", "onBalancesLoaded", "Lio/reactivex/functions/Action;", "openActive", "showInfo", "", "openMarketAnalysis", "persistLocalStatuses", "local", "changed", "playVideo", "videoUrl", "", "revealRect", "Landroid/graphics/Rect;", "analyticsData", "Lcom/iqoption/traderoom/AnalyticsData;", "shouldShowFxExpirationProgress", "showIndicatorSettings", "input", "Lcom/iqoption/charttools/constructor/IndicatorSettingsInputData;", "showIndicatorsLibrary", "openLibrary", "showToast", "toast", "Lcom/iqoption/dto/ToastEntity;", "welcomeState", "Lcom/iqoption/welcome/AuthDone;", "Action", "Companion", "Open", "app_optionXRelease"})
/* compiled from: TradeRoomViewModel.kt */
public final class d extends com.iqoption.core.ui.f.c {
    private static final String TAG = d.class.getSimpleName();
    public static final b dUK = new b();
    private List<com.iqoption.core.microservices.kyc.response.restriction.b> bdG;
    private com.iqoption.verify.a dUH;
    private com.iqoption.welcome.o dUI;
    private final b dUJ;
    private final com.iqoption.core.data.b.b<a> dfl = new com.iqoption.core.data.b.b();
    private final LiveData<a> dfm;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, bng = {"Lcom/iqoption/traderoom/TradeRoomViewModel$Action;", "", "()V", "OpenAsset", "OpenMarketAnalysis", "PlayVideo", "ShowFxNextExpirationToast", "ShowIndicatorSettings", "ShowIndicatorsLibrary", "ShowToast", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action$ShowIndicatorSettings;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action$ShowIndicatorsLibrary;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action$ShowFxNextExpirationToast;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action$OpenAsset;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action$PlayVideo;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action$OpenMarketAnalysis;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action$ShowToast;", "app_optionXRelease"})
    /* compiled from: TradeRoomViewModel.kt */
    public static abstract class a {

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, bng = {"Lcom/iqoption/traderoom/TradeRoomViewModel$Action$OpenAsset;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action;", "activeId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "showInfo", "", "(ILcom/iqoption/core/data/model/InstrumentType;Z)V", "getActiveId", "()I", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getShowInfo", "()Z", "app_optionXRelease"})
        /* compiled from: TradeRoomViewModel.kt */
        public static final class a extends a {
            private final int activeId;
            private final boolean dUP;
            private final InstrumentType instrumentType;

            public a(int i, InstrumentType instrumentType, boolean z) {
                kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
                super();
                this.activeId = i;
                this.instrumentType = instrumentType;
                this.dUP = z;
            }

            public final boolean aUX() {
                return this.dUP;
            }

            public final int getActiveId() {
                return this.activeId;
            }

            public final InstrumentType getInstrumentType() {
                return this.instrumentType;
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, bng = {"Lcom/iqoption/traderoom/TradeRoomViewModel$Action$OpenMarketAnalysis;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action;", "()V", "app_optionXRelease"})
        /* compiled from: TradeRoomViewModel.kt */
        public static final class b extends a {
            public static final b dUQ = new b();

            private b() {
                super();
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, bng = {"Lcom/iqoption/traderoom/TradeRoomViewModel$Action$PlayVideo;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action;", "videoUrl", "", "revealRect", "Landroid/graphics/Rect;", "analyticsData", "Lcom/iqoption/traderoom/AnalyticsData;", "(Ljava/lang/String;Landroid/graphics/Rect;Lcom/iqoption/traderoom/AnalyticsData;)V", "getAnalyticsData", "()Lcom/iqoption/traderoom/AnalyticsData;", "getRevealRect", "()Landroid/graphics/Rect;", "getVideoUrl", "()Ljava/lang/String;", "app_optionXRelease"})
        /* compiled from: TradeRoomViewModel.kt */
        public static final class c extends a {
            private final String aMZ;
            private final a dUR;
            private final Rect ddA;

            public c(String str, Rect rect, a aVar) {
                kotlin.jvm.internal.i.f(str, "videoUrl");
                super();
                this.aMZ = str;
                this.ddA = rect;
                this.dUR = aVar;
            }

            public final String Oq() {
                return this.aMZ;
            }

            public final Rect aUY() {
                return this.ddA;
            }

            public final a aUZ() {
                return this.dUR;
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/traderoom/TradeRoomViewModel$Action$ShowFxNextExpirationToast;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action;", "activeId", "", "expiration", "", "(IJ)V", "getActiveId", "()I", "getExpiration", "()J", "app_optionXRelease"})
        /* compiled from: TradeRoomViewModel.kt */
        public static final class d extends a {
            private final int activeId;
            private final long expiration;

            public d(int i, long j) {
                super();
                this.activeId = i;
                this.expiration = j;
            }

            public final int getActiveId() {
                return this.activeId;
            }

            public final long getExpiration() {
                return this.expiration;
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/traderoom/TradeRoomViewModel$Action$ShowIndicatorSettings;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action;", "input", "Lcom/iqoption/charttools/constructor/IndicatorSettingsInputData;", "(Lcom/iqoption/charttools/constructor/IndicatorSettingsInputData;)V", "getInput", "()Lcom/iqoption/charttools/constructor/IndicatorSettingsInputData;", "app_optionXRelease"})
        /* compiled from: TradeRoomViewModel.kt */
        public static final class e extends a {
            private final com.iqoption.charttools.constructor.d dUS;

            public e(com.iqoption.charttools.constructor.d dVar) {
                kotlin.jvm.internal.i.f(dVar, "input");
                super();
                this.dUS = dVar;
            }

            public final com.iqoption.charttools.constructor.d aVa() {
                return this.dUS;
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/traderoom/TradeRoomViewModel$Action$ShowIndicatorsLibrary;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action;", "openLibrary", "", "(Z)V", "getOpenLibrary", "()Z", "app_optionXRelease"})
        /* compiled from: TradeRoomViewModel.kt */
        public static final class f extends a {
            private final boolean dUT;

            public f(boolean z) {
                super();
                this.dUT = z;
            }

            public final boolean aVb() {
                return this.dUT;
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/traderoom/TradeRoomViewModel$Action$ShowToast;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action;", "toast", "Lcom/iqoption/dto/ToastEntity;", "(Lcom/iqoption/dto/ToastEntity;)V", "getToast", "()Lcom/iqoption/dto/ToastEntity;", "app_optionXRelease"})
        /* compiled from: TradeRoomViewModel.kt */
        public static final class g extends a {
            private final ToastEntity dUU;

            public g(ToastEntity toastEntity) {
                kotlin.jvm.internal.i.f(toastEntity, "toast");
                super();
                this.dUU = toastEntity;
            }

            public final ToastEntity aoa() {
                return this.dUU;
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/traderoom/TradeRoomViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/traderoom/TradeRoomViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: TradeRoomViewModel.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final d F(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(d.class);
            d dVar = (d) viewModel;
            dVar.dUH = com.iqoption.verify.a.ecf.H(fragmentActivity);
            dVar.dUI = com.iqoption.welcome.o.ekt.N(fragmentActivity);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…ty)\n                    }");
            return dVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradeRoomViewModel.kt */
    /* renamed from: com.iqoption.o.d$1 */
    static final class AnonymousClass1<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.kyc.response.restriction.b>> {
        final /* synthetic */ d dUL;

        AnonymousClass1(d dVar) {
            this.dUL = dVar;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.kyc.response.restriction.b> list) {
            this.dUL.bdG = list;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Integer;)V"})
    /* compiled from: TradeRoomViewModel.kt */
    /* renamed from: com.iqoption.o.d$4 */
    static final class AnonymousClass4<T> implements io.reactivex.b.f<Integer> {
        final /* synthetic */ d dUL;

        AnonymousClass4(d dVar) {
            this.dUL = dVar;
        }

        /* renamed from: m */
        public final void accept(Integer num) {
            this.dUL.dUJ.clear();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a@\u0012<\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00020\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "", "Lcom/iqoption/cardsverification/repository/VerifyStatus;", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "kotlin.jvm.PlatformType", "remote", "apply"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class c<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ d dUL;

        c(d dVar) {
            this.dUL = dVar;
        }

        /* renamed from: aW */
        public final io.reactivex.p<Pair<List<com.iqoption.cardsverification.repository.c>, List<com.iqoption.core.microservices.billing.verification.response.c>>> apply(final List<com.iqoption.core.microservices.billing.verification.response.c> list) {
            kotlin.jvm.internal.i.f(list, "remote");
            return this.dUL.aUR().t(new io.reactivex.b.g<T, R>() {
                /* renamed from: aP */
                public final Pair<List<com.iqoption.cardsverification.repository.c>, List<com.iqoption.core.microservices.billing.verification.response.c>> apply(List<com.iqoption.cardsverification.repository.c> list) {
                    kotlin.jvm.internal.i.f(list, ImagesContract.LOCAL);
                    return new Pair(list, list);
                }
            });
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lcom/iqoption/cardsverification/repository/VerifyStatus;", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Pair<? extends List<? extends com.iqoption.cardsverification.repository.c>, ? extends List<? extends com.iqoption.core.microservices.billing.verification.response.c>>> {
        final /* synthetic */ d dUL;

        d(d dVar) {
            this.dUL = dVar;
        }

        /* renamed from: c */
        public final void accept(Pair<? extends List<com.iqoption.cardsverification.repository.c>, ? extends List<com.iqoption.core.microservices.billing.verification.response.c>> pair) {
            List list = (List) pair.bnj();
            List list2 = (List) pair.bnk();
            d dVar = this.dUL;
            kotlin.jvm.internal.i.e(list, ImagesContract.LOCAL);
            kotlin.jvm.internal.i.e(list2, "remote");
            dVar.l(list, list2);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001e\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/cardsverification/repository/VerifyStatus;", "apply"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ d dUL;

        e(d dVar) {
            this.dUL = dVar;
        }

        /* renamed from: h */
        public final List<com.iqoption.core.microservices.billing.verification.response.c> apply(Pair<? extends List<com.iqoption.cardsverification.repository.c>, ? extends List<com.iqoption.core.microservices.billing.verification.response.c>> pair) {
            kotlin.jvm.internal.i.f(pair, "<name for destructuring parameter 0>");
            List list = (List) pair.bnj();
            List list2 = (List) pair.bnk();
            d dVar = this.dUL;
            kotlin.jvm.internal.i.e(list, ImagesContract.LOCAL);
            return dVar.k(list, list2);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lkotlin/Pair;", "Lcom/iqoption/microservice/regulators/response/StatusType;", "new", "Lcom/iqoption/microservice/regulators/response/ProTraderApplicationStatus;", "apply"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ long aCm;
        final /* synthetic */ com.iqoption.app.d dUW;

        f(com.iqoption.app.d dVar, long j) {
            this.dUW = dVar;
            this.aCm = j;
        }

        /* renamed from: b */
        public final Pair<StatusType, StatusType> apply(com.iqoption.microservice.regulators.response.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "new");
            return new Pair(this.dUW.af(this.aCm), aVar.aOy());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/microservice/regulators/response/StatusType;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<Pair<? extends StatusType, ? extends StatusType>> {
        final /* synthetic */ long aCm;
        final /* synthetic */ com.iqoption.app.d dUW;

        g(com.iqoption.app.d dVar, long j) {
            this.dUW = dVar;
            this.aCm = j;
        }

        /* renamed from: c */
        public final void accept(Pair<? extends StatusType, ? extends StatusType> pair) {
            this.dUW.a(this.aCm, (StatusType) pair.bnk());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/microservice/regulators/response/StatusType;", "test"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class h<T> implements io.reactivex.b.l<Pair<? extends StatusType, ? extends StatusType>> {
        final /* synthetic */ long aCm;
        final /* synthetic */ com.iqoption.app.d dUW;

        h(com.iqoption.app.d dVar, long j) {
            this.dUW = dVar;
            this.aCm = j;
        }

        /* renamed from: i */
        public final boolean test(Pair<? extends StatusType, ? extends StatusType> pair) {
            kotlin.jvm.internal.i.f(pair, "<name for destructuring parameter 0>");
            StatusType statusType = (StatusType) pair.bnj();
            Object obj = (StatusType) pair.bnk();
            this.dUW.a(this.aCm, (StatusType) obj);
            if (!(statusType == null || statusType == obj)) {
                if (com.iqoption.core.ext.c.b(obj, StatusType.APPROVED, StatusType.DECLINED)) {
                    return true;
                }
            }
            return false;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/microservice/regulators/response/StatusType;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "apply"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class i<T, R> implements io.reactivex.b.g<T, R> {
        public static final i dUX = new i();

        i() {
        }

        /* renamed from: j */
        public final StatusType apply(Pair<? extends StatusType, ? extends StatusType> pair) {
            kotlin.jvm.internal.i.f(pair, "<name for destructuring parameter 0>");
            StatusType statusType = (StatusType) pair.bnk();
            if (statusType == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            return statusType;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/iqoption/protrader/dialog/ProTraderDialogType;", "kotlin.jvm.PlatformType", "notification", "Lcom/iqoption/microservice/regulators/response/ProTraderNotification;", "apply"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class j<T, R> implements io.reactivex.b.g<T, io.reactivex.k<? extends R>> {
        final /* synthetic */ String dUY;

        j(String str) {
            this.dUY = str;
        }

        /* renamed from: a */
        public final io.reactivex.i<ProTraderDialogType> apply(com.iqoption.microservice.regulators.response.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "notification");
            boolean aOz = bVar.aOz();
            if (aOz && kotlin.jvm.internal.i.y(this.dUY, "pro-benefits")) {
                return io.reactivex.i.cH(ProTraderDialogType.PRO_BENEFITS);
            }
            if (aOz && kotlin.jvm.internal.i.y(this.dUY, "selected-reminder")) {
                return io.reactivex.i.cH(ProTraderDialogType.PRO_SELECTED_REMINDER);
            }
            return io.reactivex.i.bld();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirement;", "result", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "apply"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class k<T, R> implements io.reactivex.b.g<T, R> {
        public static final k dUZ = new k();

        k() {
        }

        /* renamed from: b */
        public final List<com.iqoption.core.microservices.kyc.response.requirement.a> apply(com.iqoption.core.microservices.kyc.response.j jVar) {
            kotlin.jvm.internal.i.f(jVar, "result");
            com.iqoption.core.microservices.kyc.response.requirement.b aeI = jVar.aeI();
            if (aeI != null) {
                List<com.iqoption.core.microservices.kyc.response.requirement.a> afA = aeI.afA();
                if (afA != null) {
                    return afA;
                }
            }
            return m.emptyList();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirement;", "it", "", "apply"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class l<T, R> implements io.reactivex.b.g<Throwable, List<? extends com.iqoption.core.microservices.kyc.response.requirement.a>> {
        public static final l dVa = new l();

        l() {
        }

        /* renamed from: r */
        public final List<com.iqoption.core.microservices.kyc.response.requirement.a> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return m.emptyList();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class n implements io.reactivex.b.a {
        public static final n dVc = new n();

        n() {
        }

        public final void run() {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class o<T> implements io.reactivex.b.f<Throwable> {
        public static final o dVd = new o();

        o() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Integer;)Z"})
    /* compiled from: TradeRoomViewModel.kt */
    static final class p<T, R> implements io.reactivex.b.g<T, R> {
        public static final p dVe = new p();

        p() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(p((Integer) obj));
        }

        public final boolean p(Integer num) {
            kotlin.jvm.internal.i.f(num, "it");
            return com.iqoption.view.d.aXZ();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, bng = {"com/iqoption/traderoom/TradeRoomViewModel$loadBalances$1", "Lcom/iqoption/system/future/CheckFutureCallback;", "Lcom/iqoption/dto/entity/result/BalanceListResult;", "fail", "", "t", "", "ok", "result", "app_optionXRelease"})
    /* compiled from: TradeRoomViewModel.kt */
    public static final class m extends com.iqoption.system.c.a<BalanceListResult> {
        final /* synthetic */ io.reactivex.b.a dVb;

        public void U(Throwable th) {
            kotlin.jvm.internal.i.f(th, "t");
        }

        m(io.reactivex.b.a aVar) {
            this.dVb = aVar;
        }

        /* renamed from: a */
        public void cl(BalanceListResult balanceListResult) {
            kotlin.jvm.internal.i.f(balanceListResult, "result");
            com.iqoption.app.b DG = com.iqoption.app.b.DG();
            kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
            DG.a(balanceListResult.getMapBalance());
            this.dVb.run();
        }
    }

    public static final d F(FragmentActivity fragmentActivity) {
        return dUK.F(fragmentActivity);
    }

    public final void b(InstrumentType instrumentType, int i) {
        a(this, instrumentType, i, false, 4, null);
    }

    public d(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
        com.iqoption.core.data.b.b bVar = this.dfl;
        this.dfm = bVar;
        this.dUJ = new b(bVar);
        io.reactivex.disposables.b a = com.iqoption.core.data.repository.d.bdF.WX().d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new AnonymousClass1(this), (io.reactivex.b.f) AnonymousClass2.dUM);
        kotlin.jvm.internal.i.e(a, "KycRepository.observeRes…r ->  }\n                )");
        b(a);
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        a = IM.IP().g(AnonymousClass3.dUN).bkT().c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new AnonymousClass4(this), (io.reactivex.b.f) AnonymousClass5.dUO);
        kotlin.jvm.internal.i.e(a, "TabHelper.instance().cur…      }\n                )");
        b(a);
    }

    public final LiveData<a> aCp() {
        return this.dfm;
    }

    public final io.reactivex.e<List<com.iqoption.core.microservices.billing.verification.response.c>> aUO() {
        return h(com.iqoption.cardsverification.repository.a.aBI.Lo());
    }

    public final io.reactivex.e<List<com.iqoption.core.microservices.billing.verification.response.c>> h(io.reactivex.e<List<com.iqoption.core.microservices.billing.verification.response.c>> eVar) {
        kotlin.jvm.internal.i.f(eVar, "cards");
        io.reactivex.e c = eVar.f((io.reactivex.b.g) new c(this)).c((io.reactivex.b.f) new d(this)).g(new e(this)).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(c, "cards.flatMapSingle { re…           .observeOn(ui)");
        return c;
    }

    public final io.reactivex.i<ProTraderDialogType> aUP() {
        com.iqoption.core.microservices.features.a.a ei = com.iqoption.app.managers.feature.c.Iw().ei("pro-trader-notification");
        Object status = ei != null ? ei.getStatus() : null;
        Application application = getApplication();
        kotlin.jvm.internal.i.e(application, "getApplication()");
        io.reactivex.i bld;
        if (!com.iqoption.protrader.f.b(application, null, 2, null) || kotlin.jvm.internal.i.y(status, "disabled")) {
            bld = io.reactivex.i.bld();
            kotlin.jvm.internal.i.e(bld, "Maybe.empty()");
            return bld;
        }
        bld = com.iqoption.protrader.g.dQt.aSX().r(new j(status)).f(com.iqoption.core.rx.i.aki()).e(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(bld, "RegulatorsRepository.get…           .observeOn(ui)");
        return bld;
    }

    public final io.reactivex.e<StatusType> aUQ() {
        long userId = com.iqoption.app.b.aK(getApplication()).getUserId();
        com.iqoption.app.d aP = com.iqoption.app.d.aP(getApplication());
        io.reactivex.e bkQ;
        if (aP.af(userId) == StatusType.APPROVED) {
            bkQ = io.reactivex.e.bkQ();
            kotlin.jvm.internal.i.e(bkQ, "Flowable.empty()");
            return bkQ;
        }
        bkQ = com.iqoption.protrader.g.dQt.cc(userId).g(new f(aP, userId)).c((io.reactivex.b.f) new g(aP, userId)).b((io.reactivex.b.l) new h(aP, userId)).g(i.dUX).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(bkQ, "RegulatorsRepository.get…           .observeOn(ui)");
        return bkQ;
    }

    private final List<com.iqoption.core.microservices.billing.verification.response.c> k(List<com.iqoption.cardsverification.repository.c> list, List<com.iqoption.core.microservices.billing.verification.response.c> list2) {
        if (list2 == null) {
            return m.emptyList();
        }
        Iterable iterable = list;
        Map linkedHashMap = new LinkedHashMap(m.bi(af.jL(n.e(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(Long.valueOf(((com.iqoption.cardsverification.repository.c) next).getId()), next);
        }
        Collection arrayList = new ArrayList();
        for (Object next2 : list2) {
            boolean z;
            com.iqoption.core.microservices.billing.verification.response.c cVar = (com.iqoption.core.microservices.billing.verification.response.c) next2;
            com.iqoption.cardsverification.repository.c cVar2 = (com.iqoption.cardsverification.repository.c) linkedHashMap.get(Long.valueOf(cVar.getId()));
            CardStatus Lq = cVar2 != null ? cVar2.Lq() : null;
            if (Lq == null || Lq == cVar.Lq()) {
                z = false;
            } else {
                z = e.dVf.contains(cVar.Lq());
            }
            if (z) {
                arrayList.add(next2);
            }
        }
        return (List) arrayList;
    }

    private final io.reactivex.p<List<com.iqoption.cardsverification.repository.c>> aUR() {
        return com.iqoption.cardsverification.repository.b.aBO.Lp();
    }

    private final void l(List<com.iqoption.cardsverification.repository.c> list, List<com.iqoption.core.microservices.billing.verification.response.c> list2) {
        Iterable<com.iqoption.core.microservices.billing.verification.response.c> iterable = list2;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (com.iqoption.core.microservices.billing.verification.response.c id : iterable) {
            arrayList.add(Long.valueOf(id.getId()));
        }
        Set V = u.V((List) arrayList);
        Collection arrayList2 = new ArrayList();
        for (Object next : list) {
            if ((V.contains(Long.valueOf(((com.iqoption.cardsverification.repository.c) next).getId())) ^ 1) != 0) {
                arrayList2.add(next);
            }
        }
        arrayList2 = (List) arrayList2;
        Collection arrayList3 = new ArrayList(n.e(iterable, 10));
        for (com.iqoption.core.microservices.billing.verification.response.c h : iterable) {
            arrayList3.add(com.iqoption.cardsverification.repository.c.aBS.h(h));
        }
        io.reactivex.disposables.b a = com.iqoption.cardsverification.repository.b.aBO.O(u.b(arrayList2, (Iterable) (List) arrayList3)).b(com.iqoption.core.rx.i.aki()).a(n.dVc, o.dVd);
        kotlin.jvm.internal.i.e(a, "VerifyLocalStatusesRepos…      \n                })");
        b(a);
    }

    public final void a(io.reactivex.b.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "onBalancesLoaded");
        v.a(com.iqoption.mobbtech.connect.request.a.a.b.z(BalanceListResult.class).fo("get-balances").UA(), (com.google.common.util.concurrent.o) new m(aVar));
    }

    public final void e(com.iqoption.charttools.constructor.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "input");
        this.dfl.setValue(new e(dVar));
    }

    public final void fj(boolean z) {
        this.dfl.setValue(new f(z));
    }

    public static /* synthetic */ void a(d dVar, InstrumentType instrumentType, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        dVar.a(instrumentType, i, z);
    }

    public final void a(InstrumentType instrumentType, int i, boolean z) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        if (instrumentType == InstrumentType.UNKNOWN || i == -1) {
            TabHelper IM = TabHelper.IM();
            kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
            com.iqoption.core.microservices.tradingengine.response.active.a IZ = IM.IZ();
            if (IZ != null) {
                this.dfl.setValue(new a(IZ.getActiveId(), IZ.getInstrumentType(), z));
                return;
            }
            return;
        }
        this.dfl.setValue(new a(i, instrumentType, z));
    }

    public final void a(String str, Rect rect, a aVar) {
        kotlin.jvm.internal.i.f(str, "videoUrl");
        this.dfl.setValue(new c(str, rect, aVar));
    }

    public final void a(int i, InstrumentType instrumentType, Long l) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        com.iqoption.l.b aTS = com.iqoption.l.b.aTS();
        kotlin.jvm.internal.i.e(aTS, "SettingsManager.instance()");
        if (aTS.aTX()) {
            this.dUJ.a(i, instrumentType, l);
        }
    }

    public final void aUS() {
        this.dfl.setValue(b.dUQ);
    }

    public final void b(ToastEntity toastEntity) {
        kotlin.jvm.internal.i.f(toastEntity, "toast");
        this.dfl.setValue(new g(toastEntity));
    }

    public final LiveData<Boolean> aUT() {
        io.reactivex.e g = TabHelper.IM().Jl().k(500, TimeUnit.MILLISECONDS).g(p.dVe);
        kotlin.jvm.internal.i.e(g, "tabHelper.observeTabCoun…wFxExpirationProgress() }");
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(g.d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).cF(Boolean.valueOf(false)));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…onErrorReturnItem(false))");
        return fromPublisher;
    }

    public final LiveData<AuthDone> aUU() {
        com.iqoption.welcome.o oVar = this.dUI;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("welcomeStateViewModel");
        }
        return oVar.aUU();
    }

    public final com.iqoption.core.microservices.kyc.response.restriction.b aUV() {
        List list = this.bdG;
        com.iqoption.core.microservices.kyc.response.restriction.b bVar = null;
        if (list == null) {
            return null;
        }
        for (com.iqoption.core.microservices.kyc.response.restriction.b next : list) {
            Object obj;
            if (next.afC() == RestrictionId.BLOCK_REAL_BALANCE_TRADE) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                bVar = next;
                break;
            }
        }
        return bVar;
    }

    public final LiveData<List<com.iqoption.core.microservices.kyc.response.requirement.a>> aUW() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.core.data.repository.d.bdF.WT().bkU().bkO().d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).g(k.dUZ).h(l.dVa));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…{ emptyList() }\n        )");
        return fromPublisher;
    }
}

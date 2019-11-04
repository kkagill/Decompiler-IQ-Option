package com.iqoption.core.gl;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.d;
import com.iqoption.core.ext.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\t\n\u0002\b)\bg\u0018\u0000 j2\u00020\u0001:\u0001jJ)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H\u0016¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J0\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0016J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u000eH\u0016J(\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u001aH\u0016J\b\u0010+\u001a\u00020\u0003H\u0016J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u001aH\u0016J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u000eH\u0016J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u00100\u001a\u00020\u0003H\u0016J\u0010\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0011H\u0016J\u0010\u00103\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0010\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0005H\u0016J\u0010\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u0005H\u0016J\u0010\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0005H\u0016J\u0010\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0005H\u0016J \u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u001aH\u0016J(\u0010@\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020BH\u0016J\u0010\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u001aH\u0016J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u0005H\u0016J\u0010\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u0005H\u0016J \u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eH\u0016J0\u0010N\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020B2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u0011H\u0016J\u0010\u0010R\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0010\u0010S\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J@\u0010T\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020\u001a2\u0006\u0010V\u001a\u00020B2\u0006\u0010W\u001a\u00020B2\u0006\u0010X\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020\u001aH\u0016J\u0010\u0010[\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u001aH\u0016J\u0010\u0010\\\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u001aH\u0016J\u0018\u0010^\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010_\u001a\u00020\u0005H\u0016J\b\u0010`\u001a\u00020\u0003H\u0016J\b\u0010a\u001a\u00020\u0003H\u0016J\b\u0010b\u001a\u00020\u0003H\u0016J\b\u0010c\u001a\u00020\u0003H\u0016J\u0010\u0010d\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u001aH\u0016J\u0010\u0010e\u001a\u00020\u00032\u0006\u0010f\u001a\u00020\u001aH\u0016J(\u0010g\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u001a2\u0006\u0010h\u001a\u00020\u00112\u0006\u0010i\u001a\u00020\u001aH\u0016¨\u0006k"}, bng = {"Lcom/iqoption/core/gl/ChartCallback;", "", "logCall", "", "name", "", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "onActiveIdImageRequested", "activeIdStr", "onAnalyticsEventButtonPressed", "eventName", "value", "", "onAnalyticsEventPopupServed", "isOpen", "", "onAskForSellingTradingPosition", "positionId", "onAttached", "chart", "Lcom/iqoption/core/gl/ChartWindow;", "onBestActivePushed", "tabIndex", "idActive", "", "onCancelSelectChartQuote", "onChangeLimitOrderValue", "isCall", "onChangePriceAlertValue", "onChangeTPSL", "takeProfitId", "stopLoseId", "takeProfitValue", "stopLoseValue", "onChangeVisibleTimeDelta", "time", "onClickSmallDealView", "optionType", "bets", "toptrader", "indxOpenTopDeals", "onClickTradersMoodView", "onCloseInstrument", "idx", "onCrossedReferenceTimeOnTimeScaleBar", "onDetached", "onEnlargeSellControl", "onExpirationCrossScreenBorder", "onScreen", "onFeeInfoPressed", "onFlagImageRequested", "country", "onGetActiveIdByTicker", "ticker", "onImageByUrlRequested", "url", "onLineInstrumentEditEnd", "json", "onLiveDealsRequestedForExpiration", "activeId", "finInstrument", "expirationPeriodSec", "onLiveDealsRequestedForInterval", "fromSec", "", "toSec", "onNeedVibrate", "milliseconds", "onRequestMarginCall", "onRequestTabChange", "assetId", "onRequestTranslation", "key", "onSelectChartQuote", "quoteValue", "quoteVolume", "onSelectStrike", "expiration", "id", "isSpot", "onSelectTradingPosition", "onSellTradingPosition", "onSendCandleRequest", "candleTime", "timestampFrom", "timestampTo", "fromId", "toId", "count", "onSendRequestForFirstCandles", "onSetStrikesAutoSelectionState", "selectionMode", "onSignalPressed", "typeId", "onTapChartTypeChangeButton", "onTapInstrumentsButton", "onTapRotationButton", "onTapTimeScaleBar", "onUpdateInstrumentParams", "onUserWeekPlaceAndProfitRequested", "userId", "onVisibleCandlesSizeChanged", "isSuccessful", "type", "Companion", "core_release"})
@Keep
/* compiled from: ChartCallback.kt */
public interface ChartCallback {
    public static final a Companion = a.bhA;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/gl/ChartCallback$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "core_release"})
    /* compiled from: ChartCallback.kt */
    public static final class a {
        private static final String TAG = ChartCallback.class.getSimpleName();
        static final /* synthetic */ a bhA = new a();

        private a() {
        }
    }

    @i(bne = {1, 1, 15})
    /* compiled from: ChartCallback.kt */
    public static final class b {
        public static void a(ChartCallback chartCallback, ChartWindow chartWindow) {
            kotlin.jvm.internal.i.f(chartWindow, "chart");
        }

        public static void b(ChartCallback chartCallback, ChartWindow chartWindow) {
            kotlin.jvm.internal.i.f(chartWindow, "chart");
        }

        public static void a(ChartCallback chartCallback, String str, Object... objArr) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
            kotlin.jvm.internal.i.f(objArr, "args");
            if (d.Un().Ds()) {
                if ((objArr.length == 0 ? 1 : null) == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append("(");
                    Object obj = null;
                    for (Object obj2 : objArr) {
                        if (obj != null) {
                            stringBuilder.append(", ");
                        } else {
                            obj = 1;
                        }
                        stringBuilder.append(obj2.toString());
                    }
                    stringBuilder.append(")");
                }
            }
        }

        public static void a(ChartCallback chartCallback, int i) {
            chartCallback.logCall("sendRequestForFirstCandles", Integer.valueOf(i));
        }

        public static void a(ChartCallback chartCallback, int i, int i2, long j, long j2, int i3, int i4, int i5) {
            chartCallback.logCall("sendCandleRequest", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }

        public static void a(ChartCallback chartCallback, double d) {
            chartCallback.logCall("onChangeVisibleTimeDelta", Double.valueOf(d));
        }

        public static void b(ChartCallback chartCallback, double d) {
            chartCallback.logCall("onCrossedReferenceTimeOnTimeScaleBar", Double.valueOf(d));
        }

        public static void a(ChartCallback chartCallback, double d, double d2, double d3) {
            chartCallback.logCall("onSelectChartQuote", Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3));
        }

        public static void a(ChartCallback chartCallback) {
            chartCallback.logCall("onCancelSelectChartQuote", new Object[0]);
        }

        public static void b(ChartCallback chartCallback) {
            chartCallback.logCall("onTapTimeScaleBar", new Object[0]);
        }

        public static void b(ChartCallback chartCallback, int i) {
            chartCallback.logCall("onChangeStrikesSelectionMode", Integer.valueOf(i));
        }

        public static void a(ChartCallback chartCallback, String str) {
            kotlin.jvm.internal.i.f(str, "positionId");
            chartCallback.logCall("onRequestMarginCall", str);
        }

        public static void b(ChartCallback chartCallback, String str) {
            kotlin.jvm.internal.i.f(str, "positionId");
            chartCallback.logCall("onFeeInfoPressed", str);
        }

        public static void a(ChartCallback chartCallback, double d, int i) {
            chartCallback.logCall("onChangeLimitOrderValue", Double.valueOf(d), Integer.valueOf(i));
        }

        public static void a(ChartCallback chartCallback, String str, String str2, String str3, double d, double d2) {
            kotlin.jvm.internal.i.f(str, "positionId");
            kotlin.jvm.internal.i.f(str2, "takeProfitId");
            kotlin.jvm.internal.i.f(str3, "stopLoseId");
            chartCallback.logCall("onChangeTPSL", str, str2, str3, Double.valueOf(d), Double.valueOf(d2));
        }

        public static void c(ChartCallback chartCallback, int i) {
            chartCallback.logCall("onNeedVibrate", Integer.valueOf(i));
        }

        public static void d(ChartCallback chartCallback, int i) {
            chartCallback.logCall("onUpdateInstrumentParams", Integer.valueOf(i));
        }

        public static void e(ChartCallback chartCallback, int i) {
            chartCallback.logCall("onCloseInstrument", Integer.valueOf(i));
        }

        public static void c(ChartCallback chartCallback, String str) {
            kotlin.jvm.internal.i.f(str, "positionId");
            chartCallback.logCall("onSellTradingPosition", str);
        }

        public static void d(ChartCallback chartCallback, String str) {
            kotlin.jvm.internal.i.f(str, "positionId");
            chartCallback.logCall("onSelectTradingPosition", str);
        }

        public static void c(ChartCallback chartCallback) {
            chartCallback.logCall("onEnlargeSellControl", new Object[0]);
        }

        public static void e(ChartCallback chartCallback, String str) {
            kotlin.jvm.internal.i.f(str, "json");
            chartCallback.logCall("onLineInstrumentEditEnd", str);
        }

        public static void a(ChartCallback chartCallback, int i, long j, String str, String str2, boolean z) {
            kotlin.jvm.internal.i.f(str, "finInstrument");
            kotlin.jvm.internal.i.f(str2, "id");
            chartCallback.logCall("onSelectStrike", Integer.valueOf(i), Long.valueOf(j), str, str2, Boolean.valueOf(z));
        }

        public static void a(ChartCallback chartCallback, String str, int i, boolean z, int i2) {
            kotlin.jvm.internal.i.f(str, "tabIndex");
            chartCallback.logCall("onVisibleCandlesSizeChanged", str, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2));
        }

        public static void a(ChartCallback chartCallback, String str, String str2, String str3, int i) {
            kotlin.jvm.internal.i.f(str, "optionType");
            kotlin.jvm.internal.i.f(str2, "bets");
            kotlin.jvm.internal.i.f(str3, "toptrader");
            chartCallback.logCall("onClickSmallDealView", str, str2, str3, Integer.valueOf(i));
        }

        public static void d(ChartCallback chartCallback) {
            chartCallback.logCall("onClickTradersMoodView", new Object[0]);
        }

        public static void a(ChartCallback chartCallback, String str, int i) {
            kotlin.jvm.internal.i.f(str, "tabIndex");
            chartCallback.logCall("onBestActivePushed", str, Integer.valueOf(i));
        }

        public static void a(ChartCallback chartCallback, int i, String str) {
            kotlin.jvm.internal.i.f(str, "typeId");
            chartCallback.logCall("onSignalPressed", Integer.valueOf(i), str);
        }

        public static void a(ChartCallback chartCallback, String str, boolean z, double d) {
            kotlin.jvm.internal.i.f(str, "eventName");
            chartCallback.logCall("onAnalyticsEventPopupServed", str, Boolean.valueOf(z), Double.valueOf(d));
        }

        public static void a(ChartCallback chartCallback, String str, double d) {
            kotlin.jvm.internal.i.f(str, "eventName");
            chartCallback.logCall("onAnalyticsEventButtonPressed", str, Double.valueOf(d));
        }

        public static void e(ChartCallback chartCallback) {
            chartCallback.logCall("onTapRotationButton", new Object[0]);
        }

        public static void f(ChartCallback chartCallback) {
            chartCallback.logCall("onTapInstrumentsButton", new Object[0]);
        }

        public static void g(ChartCallback chartCallback) {
            chartCallback.logCall("onTapChartTypeChangeButton", new Object[0]);
        }

        public static void a(ChartCallback chartCallback, int i, String str, long j, long j2) {
            kotlin.jvm.internal.i.f(str, "finInstrument");
            chartCallback.logCall("onLiveDealsRequestedForInterval", Integer.valueOf(i), str, Long.valueOf(j), Long.valueOf(j2));
        }

        public static void a(ChartCallback chartCallback, int i, String str, int i2) {
            kotlin.jvm.internal.i.f(str, "finInstrument");
            chartCallback.logCall("onLiveDealsRequestedForExpiration", Integer.valueOf(i), str, Integer.valueOf(i2));
        }

        public static void f(ChartCallback chartCallback, String str) {
            kotlin.jvm.internal.i.f(str, "country");
            chartCallback.logCall("onFlagImageRequested", str);
        }

        public static void f(ChartCallback chartCallback, int i) {
            chartCallback.logCall("onUserWeekPlaceAndProfitRequested", Integer.valueOf(i));
        }

        public static void g(ChartCallback chartCallback, String str) {
            kotlin.jvm.internal.i.f(str, "url");
            chartCallback.logCall("onImageByUrlRequested", str);
        }

        public static void h(ChartCallback chartCallback, String str) {
            kotlin.jvm.internal.i.f(str, "activeIdStr");
            chartCallback.logCall("onActiveIdImageRequested", str);
        }

        public static void i(ChartCallback chartCallback, String str) {
            kotlin.jvm.internal.i.f(str, "positionId");
            chartCallback.logCall("onAskForSellingTradingPosition", str);
        }

        public static String j(ChartCallback chartCallback, String str) {
            kotlin.jvm.internal.i.f(str, "key");
            chartCallback.logCall("onRequestTranslation", str);
            return c.a(str, null, 1, null);
        }

        public static void a(ChartCallback chartCallback, boolean z) {
            chartCallback.logCall("onExpirationCrossScreenBorder", Boolean.valueOf(z));
        }

        public static int k(ChartCallback chartCallback, String str) {
            kotlin.jvm.internal.i.f(str, "ticker");
            chartCallback.logCall("onGetActiveIdByTicker", str);
            return -1;
        }

        public static void c(ChartCallback chartCallback, double d) {
            chartCallback.logCall("onChangePriceAlertValue", Double.valueOf(d));
        }

        public static void b(ChartCallback chartCallback, int i, String str) {
            kotlin.jvm.internal.i.f(str, "finInstrument");
            chartCallback.logCall("onRequestTabChange", Integer.valueOf(i), str);
        }
    }

    void logCall(String str, Object... objArr);

    void onActiveIdImageRequested(String str);

    void onAnalyticsEventButtonPressed(String str, double d);

    void onAnalyticsEventPopupServed(String str, boolean z, double d);

    void onAskForSellingTradingPosition(String str);

    void onAttached(ChartWindow chartWindow);

    void onBestActivePushed(String str, int i);

    void onCancelSelectChartQuote();

    void onChangeLimitOrderValue(double d, int i);

    void onChangePriceAlertValue(double d);

    void onChangeTPSL(String str, String str2, String str3, double d, double d2);

    void onChangeVisibleTimeDelta(double d);

    void onClickSmallDealView(String str, String str2, String str3, int i);

    void onClickTradersMoodView();

    void onCloseInstrument(int i);

    void onCrossedReferenceTimeOnTimeScaleBar(double d);

    void onDetached(ChartWindow chartWindow);

    void onEnlargeSellControl();

    void onExpirationCrossScreenBorder(boolean z);

    void onFeeInfoPressed(String str);

    void onFlagImageRequested(String str);

    int onGetActiveIdByTicker(String str);

    void onImageByUrlRequested(String str);

    void onLineInstrumentEditEnd(String str);

    void onLiveDealsRequestedForExpiration(int i, String str, int i2);

    void onLiveDealsRequestedForInterval(int i, String str, long j, long j2);

    void onNeedVibrate(int i);

    void onRequestMarginCall(String str);

    void onRequestTabChange(int i, String str);

    String onRequestTranslation(String str);

    void onSelectChartQuote(double d, double d2, double d3);

    void onSelectStrike(int i, long j, String str, String str2, boolean z);

    void onSelectTradingPosition(String str);

    void onSellTradingPosition(String str);

    void onSendCandleRequest(int i, int i2, long j, long j2, int i3, int i4, int i5);

    void onSendRequestForFirstCandles(int i);

    void onSetStrikesAutoSelectionState(int i);

    void onSignalPressed(int i, String str);

    void onTapChartTypeChangeButton();

    void onTapInstrumentsButton();

    void onTapRotationButton();

    void onTapTimeScaleBar();

    void onUpdateInstrumentParams(int i);

    void onUserWeekPlaceAndProfitRequested(int i);

    void onVisibleCandlesSizeChanged(String str, int i, boolean z, int i2);
}

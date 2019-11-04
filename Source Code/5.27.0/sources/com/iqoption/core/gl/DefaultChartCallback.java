package com.iqoption.core.gl;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.gl.ChartCallback.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, bng = {"Lcom/iqoption/core/gl/DefaultChartCallback;", "Lcom/iqoption/core/gl/ChartCallback;", "()V", "core_release"})
@Keep
/* compiled from: DefaultChartCallback.kt */
public class DefaultChartCallback implements ChartCallback {
    public void logCall(String str, Object... objArr) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(objArr, "args");
        b.a((ChartCallback) this, str, objArr);
    }

    public void onActiveIdImageRequested(String str) {
        kotlin.jvm.internal.i.f(str, "activeIdStr");
        b.h(this, str);
    }

    public void onAnalyticsEventButtonPressed(String str, double d) {
        kotlin.jvm.internal.i.f(str, "eventName");
        b.a((ChartCallback) this, str, d);
    }

    public void onAnalyticsEventPopupServed(String str, boolean z, double d) {
        kotlin.jvm.internal.i.f(str, "eventName");
        b.a((ChartCallback) this, str, z, d);
    }

    public void onAskForSellingTradingPosition(String str) {
        kotlin.jvm.internal.i.f(str, "positionId");
        b.i(this, str);
    }

    public void onAttached(ChartWindow chartWindow) {
        kotlin.jvm.internal.i.f(chartWindow, "chart");
        b.a((ChartCallback) this, chartWindow);
    }

    public void onBestActivePushed(String str, int i) {
        kotlin.jvm.internal.i.f(str, "tabIndex");
        b.a((ChartCallback) this, str, i);
    }

    public void onCancelSelectChartQuote() {
        b.a(this);
    }

    public void onChangeLimitOrderValue(double d, int i) {
        b.a((ChartCallback) this, d, i);
    }

    public void onChangePriceAlertValue(double d) {
        b.c((ChartCallback) this, d);
    }

    public void onChangeTPSL(String str, String str2, String str3, double d, double d2) {
        kotlin.jvm.internal.i.f(str, "positionId");
        kotlin.jvm.internal.i.f(str2, "takeProfitId");
        kotlin.jvm.internal.i.f(str3, "stopLoseId");
        b.a((ChartCallback) this, str, str2, str3, d, d2);
    }

    public void onChangeVisibleTimeDelta(double d) {
        b.a((ChartCallback) this, d);
    }

    public void onClickSmallDealView(String str, String str2, String str3, int i) {
        kotlin.jvm.internal.i.f(str, "optionType");
        kotlin.jvm.internal.i.f(str2, "bets");
        kotlin.jvm.internal.i.f(str3, "toptrader");
        b.a((ChartCallback) this, str, str2, str3, i);
    }

    public void onClickTradersMoodView() {
        b.d(this);
    }

    public void onCloseInstrument(int i) {
        b.e((ChartCallback) this, i);
    }

    public void onCrossedReferenceTimeOnTimeScaleBar(double d) {
        b.b((ChartCallback) this, d);
    }

    public void onDetached(ChartWindow chartWindow) {
        kotlin.jvm.internal.i.f(chartWindow, "chart");
        b.b((ChartCallback) this, chartWindow);
    }

    public void onEnlargeSellControl() {
        b.c(this);
    }

    public void onExpirationCrossScreenBorder(boolean z) {
        b.a((ChartCallback) this, z);
    }

    public void onFeeInfoPressed(String str) {
        kotlin.jvm.internal.i.f(str, "positionId");
        b.b((ChartCallback) this, str);
    }

    public void onFlagImageRequested(String str) {
        kotlin.jvm.internal.i.f(str, "country");
        b.f((ChartCallback) this, str);
    }

    public int onGetActiveIdByTicker(String str) {
        kotlin.jvm.internal.i.f(str, "ticker");
        return b.k(this, str);
    }

    public void onImageByUrlRequested(String str) {
        kotlin.jvm.internal.i.f(str, "url");
        b.g(this, str);
    }

    public void onLineInstrumentEditEnd(String str) {
        kotlin.jvm.internal.i.f(str, "json");
        b.e((ChartCallback) this, str);
    }

    public void onLiveDealsRequestedForExpiration(int i, String str, int i2) {
        kotlin.jvm.internal.i.f(str, "finInstrument");
        b.a((ChartCallback) this, i, str, i2);
    }

    public void onLiveDealsRequestedForInterval(int i, String str, long j, long j2) {
        kotlin.jvm.internal.i.f(str, "finInstrument");
        b.a((ChartCallback) this, i, str, j, j2);
    }

    public void onNeedVibrate(int i) {
        b.c((ChartCallback) this, i);
    }

    public void onRequestMarginCall(String str) {
        kotlin.jvm.internal.i.f(str, "positionId");
        b.a((ChartCallback) this, str);
    }

    public void onRequestTabChange(int i, String str) {
        kotlin.jvm.internal.i.f(str, "finInstrument");
        b.b(this, i, str);
    }

    public String onRequestTranslation(String str) {
        kotlin.jvm.internal.i.f(str, "key");
        return b.j(this, str);
    }

    public void onSelectChartQuote(double d, double d2, double d3) {
        b.a((ChartCallback) this, d, d2, d3);
    }

    public void onSelectStrike(int i, long j, String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "finInstrument");
        kotlin.jvm.internal.i.f(str2, "id");
        b.a((ChartCallback) this, i, j, str, str2, z);
    }

    public void onSelectTradingPosition(String str) {
        kotlin.jvm.internal.i.f(str, "positionId");
        b.d((ChartCallback) this, str);
    }

    public void onSellTradingPosition(String str) {
        kotlin.jvm.internal.i.f(str, "positionId");
        b.c((ChartCallback) this, str);
    }

    public void onSendCandleRequest(int i, int i2, long j, long j2, int i3, int i4, int i5) {
        b.a(this, i, i2, j, j2, i3, i4, i5);
    }

    public void onSendRequestForFirstCandles(int i) {
        b.a((ChartCallback) this, i);
    }

    public void onSetStrikesAutoSelectionState(int i) {
        b.b((ChartCallback) this, i);
    }

    public void onSignalPressed(int i, String str) {
        kotlin.jvm.internal.i.f(str, "typeId");
        b.a((ChartCallback) this, i, str);
    }

    public void onTapChartTypeChangeButton() {
        b.g(this);
    }

    public void onTapInstrumentsButton() {
        b.f(this);
    }

    public void onTapRotationButton() {
        b.e(this);
    }

    public void onTapTimeScaleBar() {
        b.b(this);
    }

    public void onUpdateInstrumentParams(int i) {
        b.d((ChartCallback) this, i);
    }

    public void onUserWeekPlaceAndProfitRequested(int i) {
        b.f((ChartCallback) this, i);
    }

    public void onVisibleCandlesSizeChanged(String str, int i, boolean z, int i2) {
        kotlin.jvm.internal.i.f(str, "tabIndex");
        b.a((ChartCallback) this, str, i, z, i2);
    }
}

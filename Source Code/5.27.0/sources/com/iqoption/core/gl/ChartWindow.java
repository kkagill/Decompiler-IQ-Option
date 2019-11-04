package com.iqoption.core.gl;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iqoption.core.data.model.chart.ChartColor;
import com.iqoption.core.util.ab;
import java.util.concurrent.TimeUnit;

@Keep
public class ChartWindow implements ab {
    public static final String BG_RESOURCE_NAME = "bg_dark";
    public static final int BG_TEXTURE_HEIGHT = 512;
    public static final int BG_TEXTURE_WIDTH = 1024;
    public static final int INTERFACE_MODE_IQ_OPTION = 0;
    public static final int INTERFACE_MODE_WALLET = 1;
    public static final int SCALE_BAR_TYPE_CFD = 2;
    public static final int SCALE_BAR_TYPE_LONG = 1;
    public static final int SCALE_BAR_TYPE_SHORT = 0;
    public static final int SCALE_BAR_TYPE_WALLET = 3;
    private ChartCallback callback;
    private final long nativePointer;

    private native void hideLiveDeals();

    private native int instrumentExists(String str, int i);

    private native void nRecycle();

    private native void setChartCallback(@Nullable ChartCallback chartCallback);

    private native void setLimitOrder(double d, int i, int i2, int i3, long j);

    private native void setPriceAlert(double d, int i);

    private native void setTradersMoodEnable(int i);

    private native void showLiveDeals();

    private native int slaTabHasVisibleChartWithoutHoles(String str);

    private native void tabEnableAutoscale(String str, int i);

    private native void tabSetColorPalette(String str, int i);

    private native void tabSetHeikinashi(String str, int i);

    private native void tabSetHighLowVisible(int i);

    public native void actionMove(float f, float f2, float f3);

    public native void actionMoveEnded();

    public native void actionScale(float f);

    public native void actionScaleEnded();

    public native int actionTouchBegin(float f, float f2);

    public native void actionTouchCanceled();

    public native int actionTouchEnd(float f, float f2);

    public native void actionTouchMovedToPoint(float f, float f2);

    public native void addBestTradersDeals(long j, String str);

    public native void addBets(int i, int[] iArr, long[] jArr, int[] iArr2, int[] iArr3, double[] dArr, long[] jArr2, long[] jArr3, long[] jArr4, double[] dArr2, double[] dArr3, double[] dArr4);

    public native void addCandleTimeUnsafeId(int i, int i2, int i3, long j, double d, double d2, double d3, double d4, double d5, long j2);

    public native void addCandles(int i, int i2, int i3, int[] iArr, long[] jArr, long[] jArr2, double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, long[] jArr3);

    public native void addFirstCandleUnsafe(int i, int i2, int i3, long j, double d, double d2, double d3, double d4, double d5);

    public native void addFirstCandles(int i, int i2, int[] iArr, long[] jArr, long[] jArr2, double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5);

    public native void addLiveDeals(long[] jArr, double[] dArr, long[] jArr2, double[] dArr2, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, String[] strArr2, String[] strArr3, String[] strArr4, int[] iArr4);

    public native void addNewLiveDeal(long j, double d, long j2, double d2, int i, String str, int i2, int i3);

    public native void addOrders(String str, int i, String str2, double d, double d2, double d3, double d4, int i2, long j, long j2, long j3, String str3, double d5, String str4, String str5, String str6, String str7);

    public native void addPosition(int i, String str, String str2, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i2, int i3, long j, long j2, long j3, long j4, String str3, double d9, String str4, String str5, String str6, double d10, double d11, double d12, int i4, int i5, double d13, int i6, long j5, double d14, double d15, double d16, double d17, double d18);

    public native void addSmallDeal(int i, long j, double d, double d2, double d3, String str, String str2, String str3, String str4, String[] strArr, int i2);

    public native void addTab(String str, double d);

    public native void addValueTimeId(int i, int i2, long j, long j2, long j3, double d, double d2, double d3, double d4, double d5);

    public native void applyAutoSize();

    public native void clearBets();

    public native void clearOrders();

    public native void clearPositions();

    public native void clearVisibleUnits();

    public native void commonSetDrawEnabled(int i);

    public native void commonSetScaleFactor(float f);

    public native void commonSetViewBackground(String str, float f, float f2, float f3, float f4);

    public native void commonSetViewBackgroundColor(int i);

    public native void commonSetViewWidthAndHeight(int i, int i2);

    public native void commonUpdateAndRender();

    public native void createView();

    public native void deleteOrders(String str);

    public native void deletePosition(int i, String str, String str2, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i2, int i3, long j, long j2, long j3, long j4, String str3, double d9, String str4, String str5, String str6, double d10, double d11, int i4, int i5, double d12, int i6, long j5, double d13, double d14);

    public native void enableAutoscale(int i);

    public native void finishFirstCandlesInsertion(int i);

    public native int getTabsCount();

    public native void hideExpirationProfit();

    public native void instrumentAdd(String str, int i, String str2, boolean z);

    public native void instrumentFinishEdit(String str, int i);

    public native void instrumentHide(String str, int i, boolean z);

    public native void instrumentRemove(String str, int i);

    public native void instrumentRemoveAll(String str);

    public native void instrumentSelect(String str, int i);

    public native void instrumentUnselectAll(String str);

    public native void instrumentUpdate(String str, int i, String str2);

    public native int isCandleDurationEqualToCurrent(int i, int i2);

    public native int isInstrumentHidden(String str, int i);

    public native void lock();

    public native void onAppUnfolding();

    public native void onBetSelected(long j);

    public native void onBetsProfitChange(long j, double d);

    public native void onConfirmationPanelClose();

    public native void onConfirmationPanelOpen(int i);

    public native void providerTexts(String str, String str2);

    public native void removeAllResources(int i);

    public native void removeAllSmallDeals();

    public native void removeAllTabs();

    public native void removeTab(String str);

    public native void setActiveTab(String str);

    public native void setBetDottedLineVisibility(int i);

    public native void setBetTickerExtendedView(int i);

    public native void setBidAsk(String str, double d, double d2);

    public native void setClosedBets(int i, int[] iArr, long[] jArr, int[] iArr2, int[] iArr3, double[] dArr, long[] jArr2, long[] jArr3, long[] jArr4, double[] dArr2, double[] dArr3, double[] dArr4);

    public native void setDollarRate(double d);

    public native void setFeatureState(String str, String str2);

    public native void setFirstDOSellExperience(int i);

    public native void setInterfaceMode(int i);

    public native void setPriceAlertDone(double d, double d2, int i, String str, String str2, String str3);

    public native void setProfitMaskText(String str);

    public native void setPurchaseTexts(int i, String str, String str2);

    public native void setRawImageByActiveId(String str, Bitmap bitmap);

    public native void setRawImageByUrl(String str, Bitmap bitmap);

    public native void setSelectedPosition(String str, String str2);

    public native void setServerTime(double d);

    public native void setSmallDealsEnabled(int i, int i2);

    public native void setText(String str, String str2);

    public native void setTimeScaleBarType(String str, int i);

    public native void setTimeScaleBarXOffsetAndPadding(double d, double d2, double d3, double d4);

    public native void setTopTradersProfitMaskText(String str);

    public native void setTradersMoodCallPercentage(int i, String str, int i2);

    public native void setTradersMoodTexts(String str, String str2);

    public native void setUserAvatar(long j, String str);

    public native void setUserCountry(long j, String str, int i);

    public native void setUserLastOnline(long j, long j2);

    public native void setUserMainInfo(long j, String str, int i, String str2, String str3);

    public native void setUserName(long j, String str);

    public native void setUserRegistered(long j, long j2);

    public native void setUserWeekPlace(long j, int i);

    public native void setUserWeekProfit(long j, int i);

    public native void showExpirationProfit(String str, String str2);

    public native int slaTabIsWaitingForCandleGenerated(String str);

    public native int slaTabIsWaitingForFirstCandles(String str);

    public native void startFirstCandlesInsertion(int i);

    public native void startSellPosition(String str);

    public native void tabAddStrike(int i, double d, String str, String str2, long j, double d2, double d3, double d4, double d5, double d6, int i2, int i3, int i4);

    public native void tabDeleteStrike(String str);

    public native long tabGetActualTime(String str);

    public native double tabGetActualValue(String str);

    public native int tabGetCandleColorType(String str);

    public native int tabGetChartType(String str);

    public native void tabGetCurrentVisibleValueAndTime(String str, double[] dArr, double[] dArr2);

    public native void tabGetMinMaxValuesAndTimes(String str, double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4);

    public native boolean tabIsAutoscaleAvailable(String str);

    public native int tabIsDataAvailable(String str);

    public native boolean tabIsHeikinAshiAvailable(String str);

    public native boolean tabIsLiveDealsAvailable(String str);

    public native boolean tabIsTradersMoodAvailable(String str);

    public native void tabSetActiveId(String str, int i);

    public native void tabSetChartSectorOffsetsInPix(String str, double d, double d2);

    public native int tabSetChartTypeAndTimes(String str, int i, int i2);

    public native void tabSetDeltaTime(String str, long j);

    public native void tabSetExpirationTime(String str, long j, double d, double d2);

    public native void tabSetFinanceInstrument(String str, String str2, boolean z);

    public native void tabSetFrame(float f, float f2, float f3, float f4, float f5);

    public native void tabSetPrecission(String str, int i);

    public native void tabSetSelectedStrike(String str, String str2);

    public native void tabSetStartTime(String str, long j);

    public native void tabSetStrikesSelectionMode(String str, int i);

    public native void tabSetTopAsset(String str, int i, String str2, String str3, int i2);

    public native void tabShowSignal(int i, int i2, long j, long j2, double d, double d2, String str, String str2, String str3, boolean z, long j3, String str4);

    public native void tabUpdateStrike(String str, double d, double d2, double d3, double d4, int i, int i2);

    public native void unlock();

    public native void updateMathPosition(String str, double d, double d2);

    public native void updateOrders(String str, int i, String str2, double d, double d2, double d3, double d4, int i2, long j, long j2, long j3, String str3, double d5, String str4, String str5, String str6, String str7);

    public native void updatePosition(int i, String str, String str2, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i2, int i3, long j, long j2, long j3, long j4, String str3, double d9, String str4, String str5, String str6, double d10, double d11, double d12, int i4, int i5, double d13, int i6, long j5, double d14, double d15, double d16, double d17, double d18);

    public native void workaroundNexusFlickeringEnable();

    ChartWindow(long j, @NonNull ChartCallback chartCallback) {
        this.nativePointer = j;
        setCallback(chartCallback);
    }

    @Nullable
    public ChartCallback getCallback() {
        return this.callback;
    }

    public void setCallback(@Nullable ChartCallback chartCallback) {
        ChartCallback chartCallback2 = this.callback;
        if (chartCallback2 != null) {
            chartCallback2.onDetached(this);
        }
        this.callback = chartCallback;
        if (chartCallback != null) {
            chartCallback.onAttached(this);
        }
        setChartCallback(chartCallback);
    }

    public void recycle() {
        nRecycle();
        ChartCallback chartCallback = this.callback;
        if (chartCallback != null) {
            chartCallback.onDetached(this);
        }
    }

    public void tabSetAutoScaleEnabled(String str, boolean z) {
        tabEnableAutoscale(str, z);
    }

    public void tabSetHeikinashiEnabled(String str, boolean z) {
        tabSetHeikinashi(str, z);
    }

    public boolean hasVisibleChartWithoutHoles(String str) {
        return slaTabHasVisibleChartWithoutHoles(str) == 1;
    }

    public void tabSetHighLowVisible(boolean z) {
        tabSetHighLowVisible((int) z);
    }

    public void setLiveDealsEnabled(boolean z) {
        if (z) {
            showLiveDeals();
        } else {
            hideLiveDeals();
        }
    }

    public void setTradersMoodEnabled(boolean z) {
        setTradersMoodEnable(z);
    }

    public boolean containsInstrument(String str, int i) {
        return instrumentExists(str, i) == 1;
    }

    public void setLimitOrder(double d, boolean z, boolean z2, boolean z3) {
        setLimitOrder(d, z, z2, 0, z3 ? TimeUnit.SECONDS.toMillis(2147483647L) : 0);
    }

    public void setLimitOrder(double d, boolean z, boolean z2) {
        setLimitOrder(d, z, z2, false);
    }

    public void selectLimitOrder(double d, boolean z) {
        setLimitOrder(d, z, 1, 1, 0);
    }

    public void tabSetColorPalette(String str, @NonNull ChartColor chartColor) {
        tabSetColorPalette(str, chartColor.ordinal());
    }

    public void setPriceAlert(double d, boolean z) {
        setPriceAlert(d, (int) z);
    }
}

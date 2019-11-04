package com.iqoption.core.gl;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Keep
public final class ChartLibrary {
    private static final int CHART_TYPE_IQ = 0;
    private static final int CHART_TYPE_PORTFOLIO = 4;
    private static final int CHART_TYPE_PREVIEW = 3;
    private static final int CHART_TYPE_PRO = 1;
    private static final int CHART_TYPE_WALLET = 2;
    private static String TAG = "ChartLibrary";
    private static AssetManager assetManager;
    private static Lock initLock = new ReentrantLock();
    private static Condition initialized = initLock.newCondition();
    private static AtomicBoolean isInitialized = new AtomicBoolean();

    private ChartLibrary() {
    }

    public static void init(@NonNull Context context) {
        try {
            initLock.lock();
            if (!isInitialized.get()) {
                assetManager = context.getAssets();
                JNIWrapper.init(assetManager);
                isInitialized.set(true);
                initialized.signalAll();
            }
            initLock.unlock();
        } catch (Throwable th) {
            initLock.unlock();
        }
    }

    public static void await() {
        try {
            initLock.lock();
            if (!isInitialized.get()) {
                initialized.await();
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            initLock.unlock();
        }
        initLock.unlock();
    }

    public static void requireInit() {
        isInitialized.set(false);
    }

    public static boolean isInitialized() {
        return isInitialized.get();
    }

    @Nullable
    public static String getScriptedInstrumentInputs(@NonNull String str) {
        return JNIWrapper.getScriptedInstrumentInputs(str);
    }

    @Nullable
    public static String getScriptedInstrumentParams(@NonNull String str, @NonNull String str2) {
        return JNIWrapper.getScriptedInstrumentParams(str, str2);
    }

    public static long getScriptedRuntimeVersion() {
        return JNIWrapper.getScriptedRuntimeVersion();
    }

    @NonNull
    public static ChartWindow createWindow(@NonNull ChartCallback chartCallback) {
        return new ChartWindow(JNIWrapper.allocChartWindow(0), chartCallback);
    }

    @NonNull
    public static ChartWindow createProWindow(@NonNull ChartCallback chartCallback) {
        return new ChartWindow(JNIWrapper.allocChartWindow(1), chartCallback);
    }

    @NonNull
    public static ChartWindow createWalletWindow(@NonNull ChartCallback chartCallback) {
        return new ChartWindow(JNIWrapper.allocChartWindow(2), chartCallback);
    }

    @NonNull
    public static ChartWindow createPreviewWindow(@NonNull ChartCallback chartCallback) {
        return new ChartWindow(JNIWrapper.allocChartWindow(3), chartCallback);
    }

    @NonNull
    public static ChartWindow createPortfolioWindow(@NonNull ChartCallback chartCallback) {
        return new ChartWindow(JNIWrapper.allocChartWindow(4), chartCallback);
    }
}

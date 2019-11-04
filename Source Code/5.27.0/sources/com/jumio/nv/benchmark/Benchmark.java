package com.jumio.nv.benchmark;

import android.content.Context;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.log.Log;
import com.jumio.nv.benchmark.BenchmarkAlgorithm.DeviceCategory;
import com.jumio.nv.benchmark.coremark.CoremarkC;
import com.jumio.nv.environment.NVEnvironment;
import com.jumio.persistence.DataAccess;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public class Benchmark {
    private static final long MAX_WAIT_TIMEOUT = 2000;
    public static final String SERVICE = "BenchmarkService";
    private static final AtomicBoolean isMeasuring = new AtomicBoolean(false);
    private static ReentrantLock semaphor = new ReentrantLock();
    private DeviceCategory mCategory;

    private static void executeBenchmark(final Context context) {
        NVEnvironment.loadBenchmarkLib();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("currently measuring: ");
        stringBuilder.append(isMeasuring.get());
        Log.v(SERVICE, stringBuilder.toString());
        if (isMeasuring.compareAndSet(false, true)) {
            new Thread(new Runnable() {
                public void run() {
                    String str = Benchmark.SERVICE;
                    Log.v(str, "running benchmark, waiting for monitor...");
                    try {
                        Benchmark.semaphor.lock();
                        CoremarkC coremarkC = new CoremarkC();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("  monitor acquired starting benchmark ");
                        stringBuilder.append(coremarkC.getName());
                        Log.i(str, stringBuilder.toString());
                        long currentTimeMillis = System.currentTimeMillis();
                        coremarkC.execute();
                        Log.d(str, "  benchmark finished");
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        DataAccess.update(context, DeviceCategory.class, coremarkC.getDeviceCategory());
                        Log.i(str, String.format("  Classified device as %s at %.2f %s (%s)", new Object[]{coremarkC.getDeviceCategory().toString(), coremarkC.getResult(), coremarkC.getUnitName(), coremarkC.getName()}));
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("releasing monitor (took ");
                        stringBuilder.append(currentTimeMillis2);
                        stringBuilder.append(" ms)");
                        Log.v(str, stringBuilder.toString());
                        Benchmark.isMeasuring.set(false);
                        JumioAnalytics.add(MobileEvents.benchmark(JumioAnalytics.getSessionId(), coremarkC.getResult().doubleValue()));
                    } finally {
                        Benchmark.semaphor.unlock();
                    }
                }
            }, "BenchmarkThread").start();
        }
    }

    private static DeviceCategory loadDeviceCategory(Context context) {
        DeviceCategory deviceCategory = (DeviceCategory) DataAccess.load(context, DeviceCategory.class);
        String str = SERVICE;
        if (deviceCategory == null) {
            Log.i(str, "No device category stored!");
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Loading previously stored value ");
            stringBuilder.append(deviceCategory.toString());
            Log.i(str, stringBuilder.toString());
        }
        return deviceCategory;
    }

    public static DeviceCategory getDeviceCategory(Context context) {
        DeviceCategory loadDeviceCategory = loadDeviceCategory(context);
        String str = SERVICE;
        if (loadDeviceCategory == null) {
            if (!isMeasuring.get()) {
                executeBenchmark(context);
            }
            Log.v(str, " waiting for category...");
            try {
                if (semaphor.tryLock(2000, TimeUnit.MILLISECONDS)) {
                    semaphor.unlock();
                } else {
                    Log.d(str, "Timeout expired - assuming FAST");
                    return DeviceCategory.FAST;
                }
            } catch (InterruptedException e) {
                Log.printStackTrace(e);
            }
        }
        Log.v(str, " dev category available!");
        return loadDeviceCategory;
    }

    public static void startMeasurement(Context context) {
        if (loadDeviceCategory(context) == null) {
            executeBenchmark(context);
        }
    }
}

package com.jumio.analytics;

import android.content.Context;
import androidx.annotation.Nullable;
import com.jumio.analytics.agents.EventAgent;
import com.jumio.analytics.agents.FixedRateQuotaAgent;
import com.jumio.analytics.http.HttpEventDispatcher;
import com.jumio.commons.log.Log;
import com.jumio.core.network.ApiCall.DynamicProvider;
import java.util.UUID;

public class JumioAnalytics {
    public static final String LOGTAG = "Analytics";
    @Nullable
    private static EventAgent mAgent = null;
    private static boolean mEnabled = true;
    private static String mScanReference = null;
    private static UUID mSessionId = null;
    private static boolean started = false;

    public static void start() {
        if (!started) {
            started = true;
            Filter disable = new Filter().disable(MobileEvents.EVENTTYPE_RAW_TOUCH);
            String str = LOGTAG;
            Log.d(str, "## Starting JumioAnalytics module ##");
            mAgent = new FixedRateQuotaAgent(null, disable);
            mSessionId = UUID.randomUUID();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("create new session Id: ");
            stringBuilder.append(mSessionId.toString());
            Log.d(str, stringBuilder.toString());
        }
    }

    public static void add(AnalyticsEvent analyticsEvent) {
        if (mEnabled) {
            UUID sessionId = analyticsEvent.getSessionId();
            String str = LOGTAG;
            if (sessionId == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Discarding event (sessionID == null) : ");
                stringBuilder.append(analyticsEvent.toString());
                Log.w(str, stringBuilder.toString());
                return;
            }
            if (mAgent == null) {
                start();
            }
            mAgent.enqueue(analyticsEvent);
            if (analyticsEvent.mEventType == MobileEvents.EVENTTYPE_SDKLIFECYCLE && !analyticsEvent.getPayload().getValue().equals(DismissType.INSTANCE_CREATED.toString())) {
                Log.v(str, "-- event was SDKLIFECYCLE -> flush() events");
                mAgent.flush();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARNING: Missing block: B:5:0x0013, code skipped:
            if (r1.isLocked() != false) goto L_0x0015;
     */
    public static void shutdown(java.lang.Runnable r3) {
        /*
        r0 = "Analytics";
        r1 = "## Shutting down JumioAnalytics module ##";
        com.jumio.commons.log.Log.d(r0, r1);
        r1 = mEnabled;
        if (r1 == 0) goto L_0x0015;
    L_0x000b:
        r1 = mAgent;
        if (r1 == 0) goto L_0x001d;
    L_0x000f:
        r1 = r1.isLocked();
        if (r1 == 0) goto L_0x001d;
    L_0x0015:
        r1 = new java.lang.Thread;
        r1.<init>(r3);
        r1.start();
    L_0x001d:
        r1 = mAgent;
        r2 = 0;
        if (r1 == 0) goto L_0x0037;
    L_0x0022:
        r1.flush();
        r0 = mAgent;
        r0.addFinishTask(r3);
        r3 = mAgent;
        r0 = new com.jumio.analytics.JumioAnalytics$1;
        r0.<init>();
        r3.addFinishTask(r0);
        mAgent = r2;
        goto L_0x0040;
    L_0x0037:
        mSessionId = r2;
        mScanReference = r2;
        r3 = "## Shutting down JumioAnalytics module complete ##";
        com.jumio.commons.log.Log.d(r0, r3);
    L_0x0040:
        r3 = 0;
        started = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.analytics.JumioAnalytics.shutdown(java.lang.Runnable):void");
    }

    public static UUID getSessionId() {
        if (mSessionId == null) {
            Log.w(LOGTAG, "getSessionId(): uninitialized sessionID!");
        }
        return mSessionId;
    }

    public static String getScanReference() {
        return mScanReference;
    }

    public static void setScanReference(String str) {
        mScanReference = str;
    }

    public static void flush() {
        if (mAgent != null) {
            Log.d(LOGTAG, "forced flush");
            mAgent.flush();
        }
    }

    public static void unlock(Context context, DynamicProvider dynamicProvider, String str, String str2) {
        String str3 = LOGTAG;
        Log.d(str3, "Unlock Analytics");
        if (mAgent == null) {
            Log.w(str3, "unlock(): JumioAnalytics not initialized. Call start now!");
            start();
        }
        mEnabled = true;
        mAgent.setEventDispatcher(new HttpEventDispatcher(context, dynamicProvider, str, str2));
        mAgent.setLocked(false);
    }

    public static void disable() {
        Log.d(LOGTAG, "disable Analytics");
        mEnabled = false;
        EventAgent eventAgent = mAgent;
        if (eventAgent != null) {
            eventAgent.stop();
        }
    }

    public static void allowEvent(int i, boolean z) {
        EventAgent eventAgent = mAgent;
        if (eventAgent != null) {
            if (z) {
                eventAgent.getFilter().enable(i);
            } else {
                eventAgent.getFilter().disable(i);
            }
        }
    }
}

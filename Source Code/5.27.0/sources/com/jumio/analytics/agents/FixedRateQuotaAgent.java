package com.jumio.analytics.agents;

import com.jumio.analytics.EventDispatcher;
import com.jumio.analytics.Filter;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.commons.log.Log;

public class FixedRateQuotaAgent extends FixedRateAgent {
    private static final int QUOTA_DEFAULT = 20;
    public final int mEventQueueQuota;

    public FixedRateQuotaAgent() {
        this.mEventQueueQuota = 20;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("new FixedRateQuotaAgent(): quota is ");
        stringBuilder.append(this.mEventQueueQuota);
        Log.v(JumioAnalytics.LOGTAG, stringBuilder.toString());
    }

    public FixedRateQuotaAgent(int i) {
        if (i >= 0) {
            this.mEventQueueQuota = i;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("new FixedRateQuotaAgent(): quota is ");
            stringBuilder.append(this.mEventQueueQuota);
            Log.v(JumioAnalytics.LOGTAG, stringBuilder.toString());
            return;
        }
        throw new IllegalArgumentException("Quota must be >0!");
    }

    public FixedRateQuotaAgent(EventDispatcher eventDispatcher) {
        this.mEventQueueQuota = 20;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("new FixedRateQuotaAgent(): quota is ");
        stringBuilder.append(this.mEventQueueQuota);
        Log.v(JumioAnalytics.LOGTAG, stringBuilder.toString());
        setEventDispatcher(eventDispatcher);
    }

    public FixedRateQuotaAgent(EventDispatcher eventDispatcher, Filter filter) {
        this(eventDispatcher);
        this.mFilter = filter;
    }

    /* Access modifiers changed, original: protected */
    public void eventEnqueued() {
        if (this.mRequestQueue.size() >= this.mEventQueueQuota) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Quota trigger (");
            stringBuilder.append(this.mRequestQueue.size());
            stringBuilder.append(" >= ");
            stringBuilder.append(this.mEventQueueQuota);
            stringBuilder.append("), starting dispatch");
            Log.d(JumioAnalytics.LOGTAG, stringBuilder.toString());
            dispatchAndClear();
        }
    }

    public int getQuota() {
        return this.mEventQueueQuota;
    }
}

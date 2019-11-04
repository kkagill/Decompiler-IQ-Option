package com.jumio.analytics.http;

import android.content.Context;
import com.jumio.analytics.AnalyticsEvent;
import com.jumio.analytics.DispatchException;
import com.jumio.analytics.EventDispatcher;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.commons.log.Log;
import com.jumio.commons.remote.exception.UnexpectedResponseException;
import com.jumio.core.network.ApiCall.DynamicProvider;
import com.jumio.core.network.SimpleApiCall;
import com.jumio.core.network.ale.AleKeyUpdateException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class HttpEventDispatcher extends SimpleApiCall<Void> implements EventDispatcher {
    private static final int TIMEOUT_MS = 20000;
    private Collection<AnalyticsEvent> events;

    private class EventTypeComparator implements Comparator<AnalyticsEvent> {
        private EventTypeComparator() {
        }

        public int compare(AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2) {
            if (analyticsEvent.getEventType() < analyticsEvent2.getEventType()) {
                return -1;
            }
            return analyticsEvent.getEventType() > analyticsEvent2.getEventType() ? 1 : 0;
        }
    }

    /* Access modifiers changed, original: protected */
    public String getUri() {
        return "analytics/events";
    }

    /* Access modifiers changed, original: protected */
    public Void parseResponse(String str) {
        return null;
    }

    public HttpEventDispatcher(Context context, DynamicProvider dynamicProvider, String str, String str2) {
        super(context, dynamicProvider, null);
        configure(str, str2);
        setTimeout(TIMEOUT_MS);
    }

    public void dispatchEvents(Collection<AnalyticsEvent> collection) {
        String str = "Device is offline";
        this.events = collection;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HttpEventDispatcher Dispatching ");
        stringBuilder.append(collection.size());
        stringBuilder.append(" events");
        String stringBuilder2 = stringBuilder.toString();
        String str2 = JumioAnalytics.LOGTAG;
        Log.d(str2, stringBuilder2);
        try {
            if (isDeviceOffline()) {
                Log.w(this.TAG, str);
                throw new DispatchException(str);
            }
            Log.v(this.TAG, "execute()");
            try {
                execute();
            } catch (AleKeyUpdateException e) {
                Log.w(this.TAG, "### ALE key update required. Re-execute call", e);
                execute();
            }
        } catch (UnexpectedResponseException e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(e2.getStatusCode());
            stringBuilder.append(" -- ");
            stringBuilder.append(e2.getMessage());
            throw new DispatchException(stringBuilder.toString());
        } catch (IOException e3) {
            Log.w(str2, "Exception while sending!", (Throwable) e3);
            throw new DispatchException(e3);
        } catch (DispatchException e4) {
            Log.w(str2, "DispatchException while sending!", e4);
            throw e4;
        } catch (Exception e32) {
            Log.w(str2, "General exception", (Throwable) e32);
            throw new DispatchException(e32);
        }
    }

    /* Access modifiers changed, original: protected */
    public String getRequest() {
        Collection collection = this.events;
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("event list cannot be empty!");
        }
        JSONObject jSONObject = new JSONObject();
        boolean z = false;
        String str = "sessionId";
        if (JumioAnalytics.getScanReference() != null) {
            jSONObject.put(str, ((AnalyticsEvent) this.events.iterator().next()).getSessionId().toString());
            jSONObject.put("scanReference", JumioAnalytics.getScanReference());
            z = true;
        } else {
            jSONObject.put(str, ((AnalyticsEvent) this.events.iterator().next()).getSessionId().toString());
        }
        EventTypeComparator eventTypeComparator = new EventTypeComparator();
        ArrayList arrayList = new ArrayList(this.events);
        Collections.sort(arrayList, eventTypeComparator);
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnalyticsEvent analyticsEvent = (AnalyticsEvent) it.next();
            JSONObject jSONObject2 = new JSONObject();
            if (analyticsEvent.getEventType() == 307) {
                analyticsEvent.getPayload().getMetaInfo().put("usesScanRef", Boolean.valueOf(z));
            }
            jSONObject2.put("eventType", analyticsEvent.getEventType());
            jSONObject2.put("timestamp", analyticsEvent.getTimestamp());
            jSONObject2.put("payload", analyticsEvent.getPayload().toJson());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("events", jSONArray);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request body: \n");
        stringBuilder.append(jSONObject.toString());
        Log.v(JumioAnalytics.LOGTAG, stringBuilder.toString());
        return jSONObject.toString();
    }
}

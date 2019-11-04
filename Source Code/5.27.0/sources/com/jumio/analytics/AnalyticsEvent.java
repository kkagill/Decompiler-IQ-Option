package com.jumio.analytics;

import java.util.UUID;

public class AnalyticsEvent {
    protected int mEventType;
    protected Payload mPayload;
    protected UUID mSessionId;
    protected final long mTimestamp = System.currentTimeMillis();

    public AnalyticsEvent(int i, UUID uuid, MetaInfo metaInfo) {
        this.mSessionId = uuid;
        this.mEventType = i;
        this.mPayload = new Payload(metaInfo, null);
    }

    public AnalyticsEvent(int i, UUID uuid, String str, MetaInfo metaInfo) {
        this.mEventType = i;
        this.mSessionId = uuid;
        this.mPayload = new Payload(str, metaInfo);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AnalyticsEvent ");
        stringBuilder.append(this.mEventType);
        String str = " | ";
        stringBuilder.append(str);
        stringBuilder.append(this.mTimestamp);
        stringBuilder.append(" // ");
        stringBuilder.append(this.mPayload.getValue());
        if (this.mPayload.getMetaInfo() != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(this.mPayload.getMetaInfo());
            str = stringBuilder2.toString();
        } else {
            str = "";
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public int hashCode() {
        long j = this.mTimestamp;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        UUID uuid = this.mSessionId;
        return ((i + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.mEventType;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnalyticsEvent)) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
        if (analyticsEvent.mTimestamp == this.mTimestamp && analyticsEvent.mSessionId.equals(this.mSessionId) && analyticsEvent.mEventType == this.mEventType) {
            return true;
        }
        return false;
    }

    public int getEventType() {
        return this.mEventType;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public Payload getPayload() {
        return this.mPayload;
    }

    public UUID getSessionId() {
        return this.mSessionId;
    }
}

package com.iqoption.mobbtech.connect.request.api;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;

/* compiled from: Heartbeat */
class b {
    @SerializedName("request_id")
    private final String bqc = UUID.randomUUID().toString();
    @SerializedName("msg")
    private final a dIc;
    @SerializedName("name")
    private final String name = "heartbeat";

    /* compiled from: Heartbeat */
    private static class a {
        @SerializedName("userTime")
        Long dId;
        @SerializedName("heartbeatTime")
        Long dIe;

        a(long j, long j2) {
            this.dId = Long.valueOf(j);
            this.dIe = Long.valueOf(j2);
        }
    }

    public b(long j, long j2) {
        this.dIc = new a(j2, j);
    }
}

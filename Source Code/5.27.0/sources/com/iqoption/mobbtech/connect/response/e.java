package com.iqoption.mobbtech.connect.response;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

/* compiled from: LocalizationResponse */
public class e {
    @SerializedName("isSuccessful")
    private boolean blS;
    @SerializedName("json")
    private JsonElement dIW;
    @SerializedName("version")
    private String version;

    public boolean isSuccessful() {
        return this.blS;
    }

    public JsonElement aPO() {
        return this.dIW;
    }

    public String getVersion() {
        return this.version;
    }
}

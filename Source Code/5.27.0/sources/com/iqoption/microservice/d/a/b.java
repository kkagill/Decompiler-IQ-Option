package com.iqoption.microservice.d.a;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: OtnEmissionHistory */
public final class b {
    @SerializedName("items")
    private List<Object> dGX;

    public List<Object> aOs() {
        return this.dGX;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OtnEmissionHistory{emissions=");
        stringBuilder.append(this.dGX);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

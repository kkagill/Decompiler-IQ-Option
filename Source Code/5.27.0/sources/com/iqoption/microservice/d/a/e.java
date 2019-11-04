package com.iqoption.microservice.d.a;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: OtnOperationHistory */
public final class e {
    @SerializedName("history")
    private List<d> Ml;

    public List<d> aOu() {
        return this.Ml;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OtnOperationHistory{operations=");
        stringBuilder.append(this.Ml);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

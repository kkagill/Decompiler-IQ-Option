package com.iqoption.microservice.authorization.a;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: TokenResponse */
public class b {
    @SerializedName("data")
    public a dGB;
    @SerializedName("errors")
    public List<Object> errors;

    /* compiled from: TokenResponse */
    public static class a {
        @SerializedName("token")
        public String sw;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TokenResponse{data=");
        stringBuilder.append(this.dGB);
        stringBuilder.append(", errors=");
        stringBuilder.append(this.errors);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

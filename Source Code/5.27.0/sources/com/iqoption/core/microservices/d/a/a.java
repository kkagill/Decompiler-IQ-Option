package com.iqoption.core.microservices.d.a;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, bng = {"Lcom/iqoption/core/microservices/resources/responses/ResourceData;", "", "resolution", "", "locale", "platformId", "", "metadata", "Lcom/google/gson/JsonElement;", "(Ljava/lang/String;Ljava/lang/String;ILcom/google/gson/JsonElement;)V", "getLocale", "()Ljava/lang/String;", "getMetadata", "()Lcom/google/gson/JsonElement;", "getPlatformId", "()I", "getResolution", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getFileUrl", "getImageUrl", "hashCode", "toString", "core_release"})
/* compiled from: ResourceResponses.kt */
public final class a {
    @SerializedName("resolution")
    private final String bxT;
    @SerializedName("platformId")
    private final int bxU;
    @SerializedName("metadata")
    private final JsonElement bxV;
    @SerializedName("locale")
    private final String locale;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.bxT, aVar.bxT) && kotlin.jvm.internal.i.y(this.locale, aVar.locale)) {
                    if ((this.bxU == aVar.bxU ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bxV, aVar.bxV)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.bxT;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.locale;
        hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.bxU) * 31;
        JsonElement jsonElement = this.bxV;
        if (jsonElement != null) {
            i = jsonElement.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ResourceData(resolution=");
        stringBuilder.append(this.bxT);
        stringBuilder.append(", locale=");
        stringBuilder.append(this.locale);
        stringBuilder.append(", platformId=");
        stringBuilder.append(this.bxU);
        stringBuilder.append(", metadata=");
        stringBuilder.append(this.bxV);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final String agX() {
        return this.bxT;
    }

    public final String YE() {
        String str = null;
        if (!this.bxV.isJsonPrimitive()) {
            return null;
        }
        String asString = this.bxV.getAsString();
        if (asString != null) {
            str = d.EE().fz(asString);
        }
        return str;
    }

    public final String agY() {
        String str = null;
        if (this.bxV.isJsonPrimitive()) {
            return null;
        }
        if (this.bxV.isJsonObject()) {
            String str2 = "url";
            JsonElement jsonElement = this.bxV.getAsJsonObject().get(str2);
            kotlin.jvm.internal.i.e(jsonElement, str2);
            if (jsonElement.isJsonPrimitive()) {
                String asString = jsonElement.getAsString();
                if (asString != null) {
                    str = d.EE().fz(asString);
                }
            }
        }
        return str;
    }
}

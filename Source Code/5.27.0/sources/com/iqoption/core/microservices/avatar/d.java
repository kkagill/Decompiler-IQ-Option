package com.iqoption.core.microservices.avatar;

import com.google.gson.annotations.SerializedName;

/* compiled from: Thumbnail */
public final class d {
    @SerializedName("size")
    private c bmg;
    @SerializedName("url")
    private String url;

    public String getUrl() {
        return this.url;
    }

    public int Zq() {
        c cVar = this.bmg;
        return cVar != null ? cVar.Zq() : 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.url;
        if (!str == null ? str.equals(dVar.url) : dVar.url == null) {
            return false;
        }
        c cVar = this.bmg;
        if (cVar != null) {
            z = cVar.equals(dVar.bmg);
        } else if (dVar.bmg != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        c cVar = this.bmg;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Thumbnail{url='");
        stringBuilder.append(this.url);
        stringBuilder.append('\'');
        stringBuilder.append(", size=");
        stringBuilder.append(this.bmg);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

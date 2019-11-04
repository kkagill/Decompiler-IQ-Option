package com.iqoption.core.microservices.avatar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: Avatar */
public final class a {
    private Status bmc;
    private ValidateStatus bmd;
    @SerializedName("crop")
    private b bme;
    @SerializedName("thumbnails")
    private List<d> bmf;
    @SerializedName("id")
    private String id;
    @SerializedName("url")
    private String url;

    @Nullable
    public d am(int i, int i2) {
        i *= i2;
        List<d> list = this.bmf;
        d dVar = null;
        if (list != null) {
            for (d a : list) {
                dVar = a(dVar, a, i);
            }
        }
        return dVar;
    }

    private d a(@Nullable d dVar, @NonNull d dVar2, int i) {
        if (dVar == null) {
            return dVar2;
        }
        float f = (float) i;
        return ((float) dVar.Zq()) / f < ((float) dVar2.Zq()) / f ? dVar : dVar2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.id;
        if (!str == null ? str.equals(aVar.id) : aVar.id == null) {
            return false;
        }
        Status status = this.bmc;
        if (!status == null ? status.equals(aVar.bmc) : aVar.bmc == null) {
            return false;
        }
        ValidateStatus validateStatus = this.bmd;
        if (!validateStatus == null ? validateStatus.equals(aVar.bmd) : aVar.bmd == null) {
            return false;
        }
        str = this.url;
        if (!str == null ? str.equals(aVar.url) : aVar.url == null) {
            return false;
        }
        b bVar = this.bme;
        if (!bVar == null ? bVar.equals(aVar.bme) : aVar.bme == null) {
            return false;
        }
        List list = this.bmf;
        if (list != null) {
            z = list.equals(aVar.bmf);
        } else if (aVar.bmf != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Status status = this.bmc;
        hashCode = (hashCode + (status != null ? status.hashCode() : 0)) * 31;
        ValidateStatus validateStatus = this.bmd;
        hashCode = (hashCode + (validateStatus != null ? validateStatus.hashCode() : 0)) * 31;
        String str2 = this.url;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        b bVar = this.bme;
        hashCode = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        List list = this.bmf;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Avatar{id='");
        stringBuilder.append(this.id);
        stringBuilder.append('\'');
        stringBuilder.append(", status='");
        stringBuilder.append(this.bmc);
        stringBuilder.append('\'');
        stringBuilder.append(", validateStatus='");
        stringBuilder.append(this.bmd);
        stringBuilder.append('\'');
        stringBuilder.append(", url='");
        stringBuilder.append(this.url);
        stringBuilder.append('\'');
        stringBuilder.append(", crop=");
        stringBuilder.append(this.bme);
        stringBuilder.append(", thumbnails=");
        stringBuilder.append(this.bmf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

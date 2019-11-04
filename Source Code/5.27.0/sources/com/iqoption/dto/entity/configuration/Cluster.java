package com.iqoption.dto.entity.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import okhttp3.HttpUrl.Builder;

public class Cluster implements Parcelable {
    public static final Creator<Cluster> CREATOR = new Creator<Cluster>() {
        public Cluster createFromParcel(Parcel parcel) {
            return new Cluster(parcel);
        }

        public Cluster[] newArray(int i) {
            return new Cluster[i];
        }
    };
    @SerializedName("host")
    @Nullable
    private String host;
    @SerializedName("port")
    @Nullable
    private Integer port;
    @SerializedName("protocol")
    @Nullable
    private String protocol;

    public int describeContents() {
        return 0;
    }

    @Nullable
    public String buildUrl() {
        String str = this.protocol;
        if (str == null || this.host == null || this.port == null) {
            return null;
        }
        if (str.equals("wss")) {
            this.protocol = "https";
        } else if (this.protocol.equals("ws")) {
            this.protocol = "http";
        }
        return new Builder().scheme(this.protocol).host(this.host).port(this.port.intValue()).build().toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cluster{protocol='");
        stringBuilder.append(this.protocol);
        stringBuilder.append('\'');
        stringBuilder.append(", host='");
        stringBuilder.append(this.host);
        stringBuilder.append('\'');
        stringBuilder.append(", port=");
        stringBuilder.append(this.port);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cluster)) {
            return false;
        }
        Cluster cluster = (Cluster) obj;
        String str = this.protocol;
        if (!str == null ? str.equals(cluster.protocol) : cluster.protocol == null) {
            return false;
        }
        str = this.host;
        if (!str == null ? str.equals(cluster.host) : cluster.host == null) {
            return false;
        }
        Integer num = this.port;
        if (num != null) {
            z = num.equals(cluster.port);
        } else if (cluster.port != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.protocol;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.host;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.port;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.protocol);
        parcel.writeString(this.host);
        parcel.writeValue(this.port);
    }

    protected Cluster(Parcel parcel) {
        this.protocol = parcel.readString();
        this.host = parcel.readString();
        this.port = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }
}

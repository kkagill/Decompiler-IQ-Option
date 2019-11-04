package com.iqoption.core.microservices.core.response;

import com.google.gson.annotations.SerializedName;
import kotlin.i;
import okhttp3.HttpUrl.Builder;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\n¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/microservices/core/response/Cluster;", "", "()V", "protocol", "", "host", "port", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getHost", "()Ljava/lang/String;", "getPort", "()I", "getProtocol", "url", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core_release"})
/* compiled from: Cluster.kt */
public final class a {
    @SerializedName("host")
    private final String host;
    @SerializedName("port")
    private final int port;
    @SerializedName("protocol")
    private final String protocol;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.protocol, aVar.protocol) && kotlin.jvm.internal.i.y(this.host, aVar.host)) {
                    if ((this.port == aVar.port ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.protocol;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.host;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.port;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cluster(protocol=");
        stringBuilder.append(this.protocol);
        stringBuilder.append(", host=");
        stringBuilder.append(this.host);
        stringBuilder.append(", port=");
        stringBuilder.append(this.port);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(String str, String str2, int i) {
        kotlin.jvm.internal.i.f(str, "protocol");
        kotlin.jvm.internal.i.f(str2, "host");
        this.protocol = str;
        this.host = str2;
        this.port = i;
    }

    public final String getHost() {
        return this.host;
    }

    public /* synthetic */ a(String str, String str2, int i, int i2, f fVar) {
        String str3 = "";
        if ((i2 & 1) != 0) {
            str = str3;
        }
        if ((i2 & 2) != 0) {
            str2 = str3;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(str, str2, i);
    }

    public a() {
        this("", null, 0, 6, null);
    }

    public final String getUrl() {
        String str = this.protocol;
        int hashCode = str.hashCode();
        if (hashCode != 3804) {
            if (hashCode == 118039 && str.equals("wss")) {
                str = "https";
                str = new Builder().scheme(str).host(this.host).port(this.port).build().toString();
                kotlin.jvm.internal.i.e(str, "HttpUrl.Builder()\n      …              .toString()");
                return str;
            }
        } else if (str.equals("ws")) {
            str = "http";
            str = new Builder().scheme(str).host(this.host).port(this.port).build().toString();
            kotlin.jvm.internal.i.e(str, "HttpUrl.Builder()\n      …              .toString()");
            return str;
        }
        str = this.protocol;
        str = new Builder().scheme(str).host(this.host).port(this.port).build().toString();
        kotlin.jvm.internal.i.e(str, "HttpUrl.Builder()\n      …              .toString()");
        return str;
    }
}

package com.iqoption.microservice.vip;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, bng = {"Lcom/iqoption/microservice/vip/BasicResponse;", "", "()V", "success", "", "message", "", "", "(ZLjava/util/List;)V", "getMessage", "()Ljava/util/List;", "getSuccess", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_optionXRelease"})
/* compiled from: VipManagerResposnses.kt */
public final class a {
    @SerializedName("message")
    private final List<String> message;
    @SerializedName("isSuccessful")
    private final boolean success;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.success == aVar.success ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.message, aVar.message)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.success;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        List list = this.message;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BasicResponse(success=");
        stringBuilder.append(this.success);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(boolean z, List<String> list) {
        kotlin.jvm.internal.i.f(list, "message");
        this.success = z;
        this.message = list;
    }

    public final boolean RD() {
        return this.success;
    }

    public a() {
        List emptyList = Collections.emptyList();
        kotlin.jvm.internal.i.e(emptyList, "Collections.emptyList()");
        this(false, emptyList);
    }
}

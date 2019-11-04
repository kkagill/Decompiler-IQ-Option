package com.iqoption.core.microservices.billing.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, bng = {"Lcom/iqoption/core/microservices/billing/response/CreateSessionResult;", "Landroid/os/Parcelable;", "isSuccessful", "", "message", "", "", "result", "Lcom/iqoption/core/microservices/billing/response/BillingSession;", "(ZLjava/util/List;Lcom/iqoption/core/microservices/billing/response/BillingSession;)V", "()Z", "getMessage", "()Ljava/util/List;", "getResult", "()Lcom/iqoption/core/microservices/billing/response/BillingSession;", "setResult", "(Lcom/iqoption/core/microservices/billing/response/BillingSession;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: CreateSessionResult.kt */
public final class d implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("isSuccessful")
    private final boolean blS;
    @SerializedName("result")
    private a bmq;
    @SerializedName("message")
    private final List<String> message;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new d(parcel.readInt() != 0, parcel.createStringArrayList(), (a) a.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new d[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!((this.blS == dVar.blS ? 1 : null) != null && kotlin.jvm.internal.i.y(this.message, dVar.message) && kotlin.jvm.internal.i.y(this.bmq, dVar.bmq))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.blS;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        List list = this.message;
        int i2 = 0;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        a aVar = this.bmq;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CreateSessionResult(isSuccessful=");
        stringBuilder.append(this.blS);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", result=");
        stringBuilder.append(this.bmq);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeInt(this.blS);
        parcel.writeStringList(this.message);
        this.bmq.writeToParcel(parcel, 0);
    }

    public d(boolean z, List<String> list, a aVar) {
        kotlin.jvm.internal.i.f(aVar, "result");
        this.blS = z;
        this.message = list;
        this.bmq = aVar;
    }

    public final a ZA() {
        return this.bmq;
    }
}

package com.iqoption.core.microservices.busapi.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, bng = {"Lcom/iqoption/core/microservices/busapi/response/ForgetUserData;", "Landroid/os/Parcelable;", "()V", "status", "Lcom/iqoption/core/microservices/busapi/response/ForgetUserStatus;", "created", "", "expires", "(Lcom/iqoption/core/microservices/busapi/response/ForgetUserStatus;JJ)V", "getCreated", "()J", "getExpires", "getStatus", "()Lcom/iqoption/core/microservices/busapi/response/ForgetUserStatus;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: ForgetUserData.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("status")
    private final ForgetUserStatus bpn;
    @SerializedName("expires")
    private final long bpo;
    @SerializedName("created")
    private final long created;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new a((ForgetUserStatus) Enum.valueOf(ForgetUserStatus.class, parcel.readString()), parcel.readLong(), parcel.readLong());
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.bpn, aVar.bpn)) {
                    if ((this.created == aVar.created ? 1 : null) != null) {
                        if ((this.bpo == aVar.bpo ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ForgetUserStatus forgetUserStatus = this.bpn;
        int hashCode = (forgetUserStatus != null ? forgetUserStatus.hashCode() : 0) * 31;
        long j = this.created;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.bpo;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ForgetUserData(status=");
        stringBuilder.append(this.bpn);
        stringBuilder.append(", created=");
        stringBuilder.append(this.created);
        stringBuilder.append(", expires=");
        stringBuilder.append(this.bpo);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bpn.name());
        parcel.writeLong(this.created);
        parcel.writeLong(this.bpo);
    }

    public a(ForgetUserStatus forgetUserStatus, long j, long j2) {
        kotlin.jvm.internal.i.f(forgetUserStatus, NotificationCompat.CATEGORY_STATUS);
        this.bpn = forgetUserStatus;
        this.created = j;
        this.bpo = j2;
    }

    public final ForgetUserStatus abt() {
        return this.bpn;
    }

    public final long getCreated() {
        return this.created;
    }

    public /* synthetic */ a(ForgetUserStatus forgetUserStatus, long j, long j2, int i, f fVar) {
        this(forgetUserStatus, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? 0 : j2);
    }

    public final long abu() {
        return this.bpo;
    }

    public a() {
        this(ForgetUserStatus.UNKNOWN, 0, 0, 6, null);
    }
}

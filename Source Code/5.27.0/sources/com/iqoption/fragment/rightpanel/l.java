package com.iqoption.fragment.rightpanel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, bng = {"Lcom/iqoption/fragment/rightpanel/PhaseNotificationParams;", "Landroid/os/Parcelable;", "message", "", "details", "isBlinking", "", "yPivot", "", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "getDetails", "()Ljava/lang/String;", "()Z", "getMessage", "getYPivot", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)Lcom/iqoption/fragment/rightpanel/PhaseNotificationParams;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_optionXRelease"})
/* compiled from: PhaseNotificationFragment.kt */
public final class l implements Parcelable {
    public static final Creator CREATOR = new a();
    private final boolean bPd;
    private final String doy;
    private final Integer doz;
    private final String message;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new l(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        public final Object[] newArray(int i) {
            return new l[i];
        }
    }

    public static /* synthetic */ l a(l lVar, String str, String str2, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lVar.message;
        }
        if ((i & 2) != 0) {
            str2 = lVar.doy;
        }
        if ((i & 4) != 0) {
            z = lVar.bPd;
        }
        if ((i & 8) != 0) {
            num = lVar.doz;
        }
        return lVar.b(str, str2, z, num);
    }

    public final l b(String str, String str2, boolean z, Integer num) {
        kotlin.jvm.internal.i.f(str, "message");
        return new l(str, str2, z, num);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (kotlin.jvm.internal.i.y(this.message, lVar.message) && kotlin.jvm.internal.i.y(this.doy, lVar.doy)) {
                    if ((this.bPd == lVar.bPd ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.doz, lVar.doz)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.doy;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.bPd;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        Integer num = this.doz;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PhaseNotificationParams(message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", details=");
        stringBuilder.append(this.doy);
        stringBuilder.append(", isBlinking=");
        stringBuilder.append(this.bPd);
        stringBuilder.append(", yPivot=");
        stringBuilder.append(this.doz);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.message);
        parcel.writeString(this.doy);
        parcel.writeInt(this.bPd);
        Integer num = this.doz;
        if (num != null) {
            parcel.writeInt(1);
            i = num.intValue();
        } else {
            i = 0;
        }
        parcel.writeInt(i);
    }

    public l(String str, String str2, boolean z, Integer num) {
        kotlin.jvm.internal.i.f(str, "message");
        this.message = str;
        this.doy = str2;
        this.bPd = z;
        this.doz = num;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String aHs() {
        return this.doy;
    }

    public final boolean aHr() {
        return this.bPd;
    }

    public final Integer aHv() {
        return this.doz;
    }
}

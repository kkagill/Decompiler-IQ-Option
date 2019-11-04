package com.iqoption.core.microservices.videoeducation.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0004HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0010\u0010\u0003\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, bng = {"Lcom/iqoption/core/microservices/videoeducation/response/ImageLink;", "Lcom/iqoption/core/microservices/videoeducation/response/LocalePlatformLink;", "()V", "image", "", "locale", "platform", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLocale", "()Ljava/lang/String;", "getPlatform", "url", "getUrl", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: ImageLink.kt */
public final class b implements c {
    public static final Creator CREATOR = new a();
    @SerializedName("platform")
    private final String bDz;
    @SerializedName("image")
    private final String image;
    @SerializedName("locale")
    private final String locale;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new b(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:8:0x002c, code skipped:
            if (kotlin.jvm.internal.i.y(ajm(), r3.ajm()) != false) goto L_0x0031;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0031;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.videoeducation.response.b;
        if (r0 == 0) goto L_0x002f;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.videoeducation.response.b) r3;
        r0 = r2.image;
        r1 = r3.image;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x002f;
    L_0x0012:
        r0 = r2.getLocale();
        r1 = r3.getLocale();
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x002f;
    L_0x0020:
        r0 = r2.ajm();
        r3 = r3.ajm();
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0031;
    L_0x002f:
        r3 = 0;
        return r3;
    L_0x0031:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.videoeducation.response.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.image;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String locale = getLocale();
        hashCode = (hashCode + (locale != null ? locale.hashCode() : 0)) * 31;
        locale = ajm();
        if (locale != null) {
            i = locale.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImageLink(image=");
        stringBuilder.append(this.image);
        stringBuilder.append(", locale=");
        stringBuilder.append(getLocale());
        stringBuilder.append(", platform=");
        stringBuilder.append(ajm());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.image);
        parcel.writeString(this.locale);
        parcel.writeString(this.bDz);
    }

    public b(String str, String str2, String str3) {
        kotlin.jvm.internal.i.f(str, "image");
        kotlin.jvm.internal.i.f(str2, "locale");
        kotlin.jvm.internal.i.f(str3, "platform");
        this.image = str;
        this.locale = str2;
        this.bDz = str3;
    }

    public String getLocale() {
        return this.locale;
    }

    public /* synthetic */ b(String str, String str2, String str3, int i, f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "all_ALL";
        }
        if ((i & 4) != 0) {
            str3 = "mobile";
        }
        this(str, str2, str3);
    }

    public String ajm() {
        return this.bDz;
    }

    public b() {
        this("", null, null, 6, null);
    }

    public final String getUrl() {
        return d.EE().fz(this.image);
    }
}

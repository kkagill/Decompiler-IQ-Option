package com.iqoption.core.marketanalysis;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, bng = {"Lcom/iqoption/core/marketanalysis/FeedDetailsIdentifier;", "Landroid/os/Parcelable;", "fromUrl", "", "feedItem", "Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "(Ljava/lang/String;Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;)V", "getFeedItem", "()Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "getFromUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: FeedDetailsIdentifier.kt */
public final class c implements Parcelable {
    public static final Creator CREATOR = new a();
    private final String ble;
    private final com.iqoption.core.microservices.feed.response.a blf;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new c(parcel.readString(), (com.iqoption.core.microservices.feed.response.a) com.iqoption.core.microservices.feed.response.a.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new c[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.blf, r3.blf) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.marketanalysis.c;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.marketanalysis.c) r3;
        r0 = r2.ble;
        r1 = r3.ble;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.blf;
        r3 = r3.blf;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.marketanalysis.c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.ble;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        com.iqoption.core.microservices.feed.response.a aVar = this.blf;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedDetailsIdentifier(fromUrl=");
        stringBuilder.append(this.ble);
        stringBuilder.append(", feedItem=");
        stringBuilder.append(this.blf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.ble);
        this.blf.writeToParcel(parcel, 0);
    }

    public c(String str, com.iqoption.core.microservices.feed.response.a aVar) {
        kotlin.jvm.internal.i.f(str, "fromUrl");
        kotlin.jvm.internal.i.f(aVar, "feedItem");
        this.ble = str;
        this.blf = aVar;
    }

    public final String YP() {
        return this.ble;
    }

    public final com.iqoption.core.microservices.feed.response.a YQ() {
        return this.blf;
    }
}

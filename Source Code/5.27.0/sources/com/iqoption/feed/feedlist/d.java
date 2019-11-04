package com.iqoption.feed.feedlist;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, bng = {"Lcom/iqoption/feed/feedlist/FeedAdapterItem;", "Landroid/os/Parcelable;", "feedItem", "Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "areTagsExpanded", "", "buttonAssetData", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "(Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;ZLcom/iqoption/asset/mediators/AssetDisplayData;)V", "getAreTagsExpanded", "()Z", "setAreTagsExpanded", "(Z)V", "getButtonAssetData", "()Lcom/iqoption/asset/mediators/AssetDisplayData;", "getFeedItem", "()Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "feed_release"})
/* compiled from: FeedAdapterItem.kt */
public final class d implements Parcelable {
    public static final Creator CREATOR = new a();
    private final com.iqoption.core.microservices.feed.response.a blf;
    private boolean cQP;
    private final com.iqoption.asset.mediators.a cQQ;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new d((com.iqoption.core.microservices.feed.response.a) parcel.readParcelable(d.class.getClassLoader()), parcel.readInt() != 0, (com.iqoption.asset.mediators.a) parcel.readParcelable(d.class.getClassLoader()));
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
                if (kotlin.jvm.internal.i.y(this.blf, dVar.blf)) {
                    if ((this.cQP == dVar.cQP ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.cQQ, dVar.cQQ)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        com.iqoption.core.microservices.feed.response.a aVar = this.blf;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        int i2 = this.cQP;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        com.iqoption.asset.mediators.a aVar2 = this.cQQ;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedAdapterItem(feedItem=");
        stringBuilder.append(this.blf);
        stringBuilder.append(", areTagsExpanded=");
        stringBuilder.append(this.cQP);
        stringBuilder.append(", buttonAssetData=");
        stringBuilder.append(this.cQQ);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeParcelable(this.blf, i);
        parcel.writeInt(this.cQP);
        parcel.writeParcelable(this.cQQ, i);
    }

    public d(com.iqoption.core.microservices.feed.response.a aVar, boolean z, com.iqoption.asset.mediators.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "feedItem");
        this.blf = aVar;
        this.cQP = z;
        this.cQQ = aVar2;
    }

    public final com.iqoption.core.microservices.feed.response.a YQ() {
        return this.blf;
    }

    public final boolean avX() {
        return this.cQP;
    }

    public final void dj(boolean z) {
        this.cQP = z;
    }

    public final com.iqoption.asset.mediators.a avY() {
        return this.cQQ;
    }
}

package com.iqoption.core.microservices.feed.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/microservices/feed/response/FeedListResponse;", "", "items", "", "Lcom/iqoption/core/microservices/feed/response/FeedItem;", "hasMore", "", "(Ljava/util/List;Z)V", "getHasMore", "()Z", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "core_release"})
@o
/* compiled from: FeedResponses.kt */
public final class e {
    @SerializedName("has_more")
    private final boolean btw;
    @SerializedName("data")
    private final List<FeedItem> iA;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (kotlin.jvm.internal.i.y(this.iA, eVar.iA)) {
                    if ((this.btw == eVar.btw ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.iA;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        int i = this.btw;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedListResponse(items=");
        stringBuilder.append(this.iA);
        stringBuilder.append(", hasMore=");
        stringBuilder.append(this.btw);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final List<FeedItem> getItems() {
        return this.iA;
    }

    public final boolean adP() {
        return this.btw;
    }
}

package com.iqoption.core.microservices.cms.a;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012(\b\u0002\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J)\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032(\b\u0002\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u0006J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R6\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, bng = {"Lcom/iqoption/core/microservices/cms/response/TermsResult;", "", "date", "", "content", "Ljava/util/HashMap;", "", "Lcom/iqoption/core/microservices/cms/response/LocalContent;", "Lkotlin/collections/HashMap;", "(JLjava/util/HashMap;)V", "getContent", "()Ljava/util/HashMap;", "getDate", "()J", "locales", "", "getLocales", "()Ljava/util/Collection;", "component1", "component2", "copy", "equals", "", "other", "getLocalContent", "locale", "hashCode", "", "toString", "core_release"})
@o
/* compiled from: TermsResult.kt */
public final class c {
    @SerializedName("date")
    private final long aSH;
    @SerializedName("content")
    private final HashMap<String, a> brd;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if ((this.aSH == cVar.aSH ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.brd, cVar.brd)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.aSH;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        HashMap hashMap = this.brd;
        return i + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TermsResult(date=");
        stringBuilder.append(this.aSH);
        stringBuilder.append(", content=");
        stringBuilder.append(this.brd);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final a gv(String str) {
        kotlin.jvm.internal.i.f(str, "locale");
        HashMap hashMap = this.brd;
        return hashMap != null ? (a) hashMap.get(str) : null;
    }
}

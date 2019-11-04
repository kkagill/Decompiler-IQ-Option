package com.iqoption.core.microservices.feed;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/microservices/feed/FeedbackAction;", "", "documentId", "", "action", "(II)V", "getAction", "()I", "getDocumentId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"})
/* compiled from: FeedRequests.kt */
final class c {
    @SerializedName("action")
    private final int action;
    @SerializedName("document_id")
    private final int btg;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if ((this.btg == cVar.btg ? 1 : null) != null) {
                    if ((this.action == cVar.action ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.btg * 31) + this.action;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedbackAction(documentId=");
        stringBuilder.append(this.btg);
        stringBuilder.append(", action=");
        stringBuilder.append(this.action);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(int i, int i2) {
        this.btg = i;
        this.action = i2;
    }
}

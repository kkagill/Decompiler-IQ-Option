package com.iqoption.alerts.ui.list;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, bng = {"Lcom/iqoption/alerts/ui/list/EmptyItem;", "Lcom/iqoption/alerts/ui/list/AlertAdapterItem;", "resId", "", "(I)V", "id", "", "getId", "()Ljava/lang/String;", "getResId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "alerts_release"})
/* compiled from: AlertAdapterItems.kt */
public final class j extends a {
    private final int resId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                if ((this.resId == ((j) obj).resId ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.resId;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EmptyItem(resId=");
        stringBuilder.append(this.resId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public j(int i) {
        super();
        this.resId = i;
    }

    public final int getResId() {
        return this.resId;
    }

    public String getId() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("empty:");
        stringBuilder.append(this.resId);
        return stringBuilder.toString();
    }
}

package com.iqoption.alerts.ui.list;

import com.google.android.gms.plus.PlusShare;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, bng = {"Lcom/iqoption/alerts/ui/list/TitleItem;", "Lcom/iqoption/alerts/ui/list/AlertAdapterItem;", "()V", "id", "", "getId", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "alerts_release"})
/* compiled from: AlertAdapterItems.kt */
public final class l extends a {
    public String getId() {
        return PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE;
    }

    public l() {
        super();
    }

    public boolean equals(Object obj) {
        return ((l) this) == obj;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }
}

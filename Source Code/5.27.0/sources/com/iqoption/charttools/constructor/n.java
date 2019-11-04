package com.iqoption.charttools.constructor;

import com.google.android.gms.plus.PlusShare;
import com.iqoption.charttools.model.indicator.constructor.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, bng = {"Lcom/iqoption/charttools/constructor/InputGroupTitle;", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "id", "", "text", "", "description", "isExpandable", "", "isExpanded", "group", "Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;", "(ILjava/lang/String;Ljava/lang/String;ZZLcom/iqoption/charttools/model/indicator/constructor/InputGroup;)V", "getDescription", "()Ljava/lang/String;", "getGroup", "()Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;", "()Z", "setExpanded", "(Z)V", "getText", "techtools_release"})
/* compiled from: InputAdapterItems.kt */
public final class n extends f {
    private final c aFu;
    private boolean ape;
    private final String description;
    private final boolean isExpandable;
    private final String text;

    public final String getText() {
        return this.text;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean Ng() {
        return this.isExpandable;
    }

    public final boolean nq() {
        return this.ape;
    }

    public final void setExpanded(boolean z) {
        this.ape = z;
    }

    public final c Nh() {
        return this.aFu;
    }

    public n(int i, String str, String str2, boolean z, boolean z2, c cVar) {
        kotlin.jvm.internal.i.f(str, "text");
        kotlin.jvm.internal.i.f(str2, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
        kotlin.jvm.internal.i.f(cVar, "group");
        super(i, null);
        this.text = str;
        this.description = str2;
        this.isExpandable = z;
        this.ape = z2;
        this.aFu = cVar;
    }
}

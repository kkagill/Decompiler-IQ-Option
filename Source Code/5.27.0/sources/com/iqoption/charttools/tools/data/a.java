package com.iqoption.charttools.tools.data;

import com.google.android.gms.plus.PlusShare;
import com.iqoption.charttools.model.indicator.h;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0014\u0010\n\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, bng = {"Lcom/iqoption/charttools/tools/data/ActiveIndicatorItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "title", "snippet", "snippetColor", "", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "(Ljava/lang/String;Ljava/lang/String;ILcom/iqoption/charttools/model/indicator/ChartIndicator;)V", "id", "getId", "()Ljava/lang/String;", "getIndicator", "()Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "getSnippet", "getSnippetColor", "()I", "getTitle", "app_optionXRelease"})
/* compiled from: ActiveIndicatorAdapterItems.kt */
public final class a implements d<String> {
    private final h aCJ;
    private final String aMS;
    private final int aMT;
    private final String id;
    private final String title;

    public a(String str, String str2, int i, h hVar) {
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        kotlin.jvm.internal.i.f(str2, "snippet");
        kotlin.jvm.internal.i.f(hVar, "indicator");
        this.title = str;
        this.aMS = str2;
        this.aMT = i;
        this.aCJ = hVar;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("indicator:");
        stringBuilder.append(this.aCJ.MH().getType());
        stringBuilder.append(':');
        stringBuilder.append(this.aCJ.getIndex());
        this.id = stringBuilder.toString();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSnippet() {
        return this.aMS;
    }

    public final int Qx() {
        return this.aMT;
    }

    public final h LU() {
        return this.aCJ;
    }

    public String getId() {
        return this.id;
    }
}

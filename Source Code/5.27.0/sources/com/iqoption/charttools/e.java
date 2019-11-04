package com.iqoption.charttools;

import com.iqoption.charttools.model.indicator.h;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000e¨\u0006\u000f"}, bng = {"Lcom/iqoption/charttools/ActiveIndicatorUpdated;", "Lcom/iqoption/charttools/ActiveIndicatorEvent;", "key", "", "indicators", "", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "indicator", "isCallback", "", "isValueChanged", "(Ljava/lang/String;Ljava/util/List;Lcom/iqoption/charttools/model/indicator/ChartIndicator;ZZ)V", "getIndicator", "()Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "()Z", "techtools_release"})
/* compiled from: ActiveIndicatorsManager.kt */
public final class e extends b {
    private final h aCJ;
    private final boolean aCM;
    private final boolean isValueChanged;

    public final h LU() {
        return this.aCJ;
    }

    public final boolean LX() {
        return this.aCM;
    }

    public final boolean LY() {
        return this.isValueChanged;
    }

    public e(String str, List<h> list, h hVar, boolean z, boolean z2) {
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(list, "indicators");
        kotlin.jvm.internal.i.f(hVar, "indicator");
        super(str, list, null);
        this.aCJ = hVar;
        this.aCM = z;
        this.isValueChanged = z2;
    }
}

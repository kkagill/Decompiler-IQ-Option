package com.iqoption.charttools;

import com.iqoption.charttools.model.indicator.x;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, bng = {"Lcom/iqoption/charttools/LocalLibrary;", "", "figures", "", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "indicators", "(Ljava/util/List;Ljava/util/List;)V", "getFigures", "()Ljava/util/List;", "getIndicators", "techtools_release"})
/* compiled from: IndicatorsLibraryManager.kt */
final class l {
    private final List<x> aCK;
    private final List<x> aDV;

    public l(List<? extends x> list, List<? extends x> list2) {
        kotlin.jvm.internal.i.f(list, "figures");
        kotlin.jvm.internal.i.f(list2, "indicators");
        this.aDV = list;
        this.aCK = list2;
    }

    public final List<x> LV() {
        return this.aCK;
    }

    public final List<x> Ms() {
        return this.aDV;
    }
}

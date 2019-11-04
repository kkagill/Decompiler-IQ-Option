package com.iqoption.charttools.e;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.charttools.model.indicator.h;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0013"}, bng = {"Lcom/iqoption/charttools/templates/IndicatorItem;", "Lcom/iqoption/charttools/templates/InstrumentAdapterItem;", "name", "", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "id", "(Ljava/lang/String;Lcom/iqoption/charttools/model/indicator/ChartIndicator;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getIndicator", "()Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "getName", "equals", "", "other", "", "hashCode", "", "techtools_release"})
/* compiled from: InstrumentItems.kt */
public final class c extends d {
    private final h aCJ;
    private final String id;
    private final String name;

    public final String getName() {
        return this.name;
    }

    public final h LU() {
        return this.aCJ;
    }

    public /* synthetic */ c(String str, h hVar, String str2, int i, f fVar) {
        if ((i & 4) != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("indicator:");
            stringBuilder.append(hVar.getIndex());
            str2 = stringBuilder.toString();
        }
        this(str, hVar, str2);
    }

    public String getId() {
        return this.id;
    }

    public c(String str, h hVar, String str2) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(hVar, "indicator");
        kotlin.jvm.internal.i.f(str2, "id");
        super();
        this.name = str;
        this.aCJ = hVar;
        this.id = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            if ((kotlin.jvm.internal.i.y(this.aCJ, ((c) obj).aCJ) ^ 1) != 0) {
                return false;
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.templates.IndicatorItem");
    }

    public int hashCode() {
        return this.aCJ.hashCode();
    }
}

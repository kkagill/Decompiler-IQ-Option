package com.iqoption.tradinghistory.filter.d;

import androidx.annotation.StringRes;
import com.iqoption.core.data.model.InstrumentType;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\b\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, bng = {"Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "textResId", "instrumentTypes", "", "Lcom/iqoption/core/data/model/InstrumentType;", "(ILjava/util/List;)V", "id", "getId", "()Ljava/lang/Integer;", "getInstrumentTypes", "()Ljava/util/List;", "getTextResId", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "tradinghistory_release"})
/* compiled from: InstrumentFilterItem.kt */
public final class d implements com.iqoption.core.ui.widget.recyclerview.adapter.a.d<Integer> {
    private final List<InstrumentType> axW;
    private final int dYs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if ((this.dYs == dVar.dYs ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.axW, dVar.axW)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.dYs * 31;
        List list = this.axW;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstrumentFilterItem(textResId=");
        stringBuilder.append(this.dYs);
        stringBuilder.append(", instrumentTypes=");
        stringBuilder.append(this.axW);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public d(@StringRes int i, List<? extends InstrumentType> list) {
        kotlin.jvm.internal.i.f(list, "instrumentTypes");
        this.dYs = i;
        this.axW = list;
    }

    public final List<InstrumentType> JU() {
        return this.axW;
    }

    public final int aWa() {
        return this.dYs;
    }

    /* renamed from: JR */
    public Integer getId() {
        return Integer.valueOf(this.dYs);
    }
}

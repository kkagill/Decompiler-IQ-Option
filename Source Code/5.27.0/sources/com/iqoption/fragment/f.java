package com.iqoption.fragment;

import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J:\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, bng = {"Lcom/iqoption/fragment/ClickedActivePush;", "", "activeID", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "pushId", "", "pushType", "", "(ILcom/iqoption/core/data/model/InstrumentType;Ljava/lang/Long;Ljava/lang/String;)V", "getActiveID", "()I", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getPushId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPushType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(ILcom/iqoption/core/data/model/InstrumentType;Ljava/lang/Long;Ljava/lang/String;)Lcom/iqoption/fragment/ClickedActivePush;", "equals", "", "other", "hashCode", "toString", "app_optionXRelease"})
/* compiled from: ClickedActivePush.kt */
public final class f {
    private final int cUH;
    private final Long cUI;
    private final String cUJ;
    private final InstrumentType instrumentType;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (!((this.cUH == fVar.cUH ? 1 : null) != null && kotlin.jvm.internal.i.y(this.instrumentType, fVar.instrumentType) && kotlin.jvm.internal.i.y(this.cUI, fVar.cUI) && kotlin.jvm.internal.i.y(this.cUJ, fVar.cUJ))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.cUH * 31;
        InstrumentType instrumentType = this.instrumentType;
        int i2 = 0;
        i = (i + (instrumentType != null ? instrumentType.hashCode() : 0)) * 31;
        Long l = this.cUI;
        i = (i + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.cUJ;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ClickedActivePush(activeID=");
        stringBuilder.append(this.cUH);
        stringBuilder.append(", instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", pushId=");
        stringBuilder.append(this.cUI);
        stringBuilder.append(", pushType=");
        stringBuilder.append(this.cUJ);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public f(int i, InstrumentType instrumentType, Long l, String str) {
        kotlin.jvm.internal.i.f(str, "pushType");
        this.cUH = i;
        this.instrumentType = instrumentType;
        this.cUI = l;
        this.cUJ = str;
    }

    public final int axz() {
        return this.cUH;
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final Long axA() {
        return this.cUI;
    }

    public final String axB() {
        return this.cUJ;
    }
}

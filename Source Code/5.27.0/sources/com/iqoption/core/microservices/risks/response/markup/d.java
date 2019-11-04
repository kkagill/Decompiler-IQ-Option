package com.iqoption.core.microservices.risks.response.markup;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÂ\u0003J7\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, bng = {"Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkupChanged;", "", "()V", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "userGroupId", "", "activeId", "", "_markups", "", "Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkup;", "(Lcom/iqoption/core/data/model/InstrumentType;JILjava/util/List;)V", "getActiveId", "()I", "activeMarkups", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "getActiveMarkups", "()Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "activeMarkups$delegate", "Lkotlin/Lazy;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getUserGroupId", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"})
/* compiled from: SpreadMarkupChanged.kt */
public final class d {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(d.class), "activeMarkups", "getActiveMarkups()Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;"))};
    @SerializedName("user_group_id")
    private final long aZx;
    @SerializedName("active_id")
    private final int activeId;
    private final kotlin.d byu;
    @SerializedName("markups")
    private final List<c> byv;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;

    public final a ahl() {
        kotlin.d dVar = this.byu;
        j jVar = anY[0];
        return (a) dVar.getValue();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (kotlin.jvm.internal.i.y(this.instrumentType, dVar.instrumentType)) {
                    if ((this.aZx == dVar.aZx ? 1 : null) != null) {
                        if ((this.activeId == dVar.activeId ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.byv, dVar.byv)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        InstrumentType instrumentType = this.instrumentType;
        int i = 0;
        int hashCode = (instrumentType != null ? instrumentType.hashCode() : 0) * 31;
        long j = this.aZx;
        hashCode = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.activeId) * 31;
        List list = this.byv;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpreadMarkupChanged(instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", userGroupId=");
        stringBuilder.append(this.aZx);
        stringBuilder.append(", activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", _markups=");
        stringBuilder.append(this.byv);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public d(InstrumentType instrumentType, long j, int i, List<c> list) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(list, "_markups");
        this.instrumentType = instrumentType;
        this.aZx = j;
        this.activeId = i;
        this.byv = list;
        this.byu = g.c(new SpreadMarkupChanged$activeMarkups$2(this));
    }

    public /* synthetic */ d(InstrumentType instrumentType, long j, int i, List list, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            instrumentType = InstrumentType.UNKNOWN;
        }
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            list = m.emptyList();
        }
        this(instrumentType, j2, i3, list);
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final int getActiveId() {
        return this.activeId;
    }

    public d() {
        this(InstrumentType.UNKNOWN, 0, 0, null, 14, null);
    }
}

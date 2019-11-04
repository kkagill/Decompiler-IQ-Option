package com.iqoption.earningscalendar;

import com.iqoption.asset.mediators.a;
import com.iqoption.core.microservices.a.a.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, bng = {"Lcom/iqoption/earningscalendar/EarningsCalendarItem;", "Lcom/iqoption/earningscalendar/EarningsCalendarAdapterItem;", "calendarEvent", "Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "assetDisplayData", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "(Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;Lcom/iqoption/asset/mediators/AssetDisplayData;)V", "getAssetDisplayData", "()Lcom/iqoption/asset/mediators/AssetDisplayData;", "getCalendarEvent", "()Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "earningscalendar_release"})
/* compiled from: EarningsCalendarAdapterItems.kt */
public final class h extends e {
    private final b cNn;
    private final a cNo;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.cNo, r3.cNo) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.earningscalendar.h;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.earningscalendar.h) r3;
        r0 = r2.cNn;
        r1 = r3.cNn;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.cNo;
        r3 = r3.cNo;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.earningscalendar.h.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        b bVar = this.cNn;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        a aVar = this.cNo;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EarningsCalendarItem(calendarEvent=");
        stringBuilder.append(this.cNn);
        stringBuilder.append(", assetDisplayData=");
        stringBuilder.append(this.cNo);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final b auW() {
        return this.cNn;
    }

    public final a auX() {
        return this.cNo;
    }

    public h(b bVar, a aVar) {
        kotlin.jvm.internal.i.f(bVar, "calendarEvent");
        super(String.valueOf(bVar.ado()), null);
        this.cNn = bVar;
        this.cNo = aVar;
    }
}

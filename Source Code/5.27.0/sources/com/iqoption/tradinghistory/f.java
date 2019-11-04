package com.iqoption.tradinghistory;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.tradinghistory.filter.d.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\rJ\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, bng = {"Lcom/iqoption/tradinghistory/InstrumentFilter;", "", "allowedItems", "", "Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterItem;", "(Ljava/util/List;)V", "getAllowedItems", "()Ljava/util/List;", "allowedTypes", "Lcom/iqoption/core/data/model/InstrumentType;", "component1", "copy", "equals", "", "other", "hashCode", "", "isAllAllowed", "toString", "", "tradinghistory_release"})
/* compiled from: Filters.kt */
public final class f {
    private final List<d> dVh;

    public f() {
        this(null, 1, null);
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.dVh, ((com.iqoption.tradinghistory.f) r2).dVh) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.tradinghistory.f;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.tradinghistory.f) r2;
        r0 = r1.dVh;
        r2 = r2.dVh;
        r2 = kotlin.jvm.internal.i.y(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List list = this.dVh;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstrumentFilter(allowedItems=");
        stringBuilder.append(this.dVh);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public f(List<d> list) {
        this.dVh = list;
    }

    public /* synthetic */ f(List list, int i, f fVar) {
        if ((i & 1) != 0) {
            list = (List) null;
        }
        this(list);
    }

    public final List<d> aVg() {
        return this.dVh;
    }

    public final boolean aVe() {
        return this.dVh == null;
    }

    public final List<InstrumentType> aVl() {
        List<d> list = this.dVh;
        if (list == null) {
            return null;
        }
        Collection arrayList = new ArrayList();
        for (d JU : list) {
            r.a(arrayList, (Iterable) JU.JU());
        }
        return (List) arrayList;
    }
}

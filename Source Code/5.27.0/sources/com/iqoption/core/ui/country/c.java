package com.iqoption.core.ui.country;

import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/ui/country/CountryItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "country", "Lcom/iqoption/core/microservices/configuration/response/Country;", "(Lcom/iqoption/core/microservices/configuration/response/Country;)V", "getCountry", "()Lcom/iqoption/core/microservices/configuration/response/Country;", "id", "getId", "()Ljava/lang/Long;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_release"})
/* compiled from: CountryItem.kt */
public final class c implements d<Long> {
    private final com.iqoption.core.microservices.configuration.a.c aBZ;

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.aBZ, ((com.iqoption.core.ui.country.c) r2).aBZ) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.core.ui.country.c;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.core.ui.country.c) r2;
        r0 = r1.aBZ;
        r2 = r2.aBZ;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.country.c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        com.iqoption.core.microservices.configuration.a.c cVar = this.aBZ;
        return cVar != null ? cVar.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CountryItem(country=");
        stringBuilder.append(this.aBZ);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(com.iqoption.core.microservices.configuration.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "country");
        this.aBZ = cVar;
    }

    public final com.iqoption.core.microservices.configuration.a.c LB() {
        return this.aBZ;
    }

    public Long getId() {
        return this.aBZ.getId();
    }
}

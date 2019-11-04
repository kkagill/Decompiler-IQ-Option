package com.iqoption.fragment.assets.model;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u0014"}, bng = {"Lcom/iqoption/fragment/assets/model/MultiWarning;", "Lcom/iqoption/fragment/assets/model/AssetAdapterItem;", "spotProfitFormatted", "", "(Ljava/lang/String;)V", "id", "getId", "()Ljava/lang/String;", "isSystem", "", "()Z", "getSpotProfitFormatted", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "app_optionXRelease"})
/* compiled from: AssetAdapterItems.kt */
public final class s extends a {
    private final String dci;

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.dci, ((com.iqoption.fragment.assets.model.s) r2).dci) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.fragment.assets.model.s;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.fragment.assets.model.s) r2;
        r0 = r1.dci;
        r2 = r2.dci;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.assets.model.s.equals(java.lang.Object):boolean");
    }

    public String getId() {
        return "multiWarning";
    }

    public int hashCode() {
        String str = this.dci;
        return str != null ? str.hashCode() : 0;
    }

    public boolean isSystem() {
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiWarning(spotProfitFormatted=");
        stringBuilder.append(this.dci);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public s(String str) {
        kotlin.jvm.internal.i.f(str, "spotProfitFormatted");
        super();
        this.dci = str;
    }

    public final String aBa() {
        return this.dci;
    }
}

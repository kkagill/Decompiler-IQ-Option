package com.iqoption.fragment.assets.model;

import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryInfo;", "", "category", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "items", "", "Lcom/iqoption/fragment/assets/model/AssetAdapterItem;", "searchConstraint", "", "(Lcom/iqoption/fragment/assets/model/AssetCategory;Ljava/util/List;Ljava/lang/CharSequence;)V", "getCategory", "()Lcom/iqoption/fragment/assets/model/AssetCategory;", "getItems", "()Ljava/util/List;", "getSearchConstraint", "()Ljava/lang/CharSequence;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_optionXRelease"})
/* compiled from: AssetCategoryInfo.kt */
public final class f {
    private final e dbS;
    private final CharSequence dbT;
    private final List<a> iA;

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.dbT, r3.dbT) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.fragment.assets.model.f;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.fragment.assets.model.f) r3;
        r0 = r2.dbS;
        r1 = r3.dbS;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.iA;
        r1 = r3.iA;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.dbT;
        r3 = r3.dbT;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.assets.model.f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        e eVar = this.dbS;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        List list = this.iA;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        CharSequence charSequence = this.dbT;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssetCategoryInfo(category=");
        stringBuilder.append(this.dbS);
        stringBuilder.append(", items=");
        stringBuilder.append(this.iA);
        stringBuilder.append(", searchConstraint=");
        stringBuilder.append(this.dbT);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public f(e eVar, List<? extends a> list, CharSequence charSequence) {
        kotlin.jvm.internal.i.f(eVar, "category");
        kotlin.jvm.internal.i.f(list, "items");
        kotlin.jvm.internal.i.f(charSequence, "searchConstraint");
        this.dbS = eVar;
        this.iA = list;
        this.dbT = charSequence;
    }

    public final e aAS() {
        return this.dbS;
    }

    public final List<a> getItems() {
        return this.iA;
    }
}

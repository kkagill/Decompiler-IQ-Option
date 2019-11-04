package com.iqoption.kyc.profile.steps.country;

import com.google.android.gms.plus.PlusShare;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\nHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, bng = {"Lcom/iqoption/kyc/profile/steps/country/KycTitleItem;", "Lcom/iqoption/kyc/profile/steps/country/KycCountryAdapterItem;", "title", "", "(Ljava/lang/String;)V", "id", "getId", "()Ljava/lang/String;", "getTitle", "viewType", "", "getViewType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "kyc_release"})
/* compiled from: CountryAdapterItems.kt */
public final class j extends c {
    private final int cWK;
    private final String title;

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.title, ((com.iqoption.kyc.profile.steps.country.j) r2).title) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.kyc.profile.steps.country.j;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.kyc.profile.steps.country.j) r2;
        r0 = r1.title;
        r2 = r2.title;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.profile.steps.country.j.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.title;
        return str != null ? str.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycTitleItem(title=");
        stringBuilder.append(this.title);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public j(String str) {
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        super();
        this.title = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public int asd() {
        return this.cWK;
    }

    public String getId() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("title-");
        stringBuilder.append(this.title);
        return stringBuilder.toString();
    }
}

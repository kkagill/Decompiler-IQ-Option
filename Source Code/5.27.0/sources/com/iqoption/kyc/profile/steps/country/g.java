package com.iqoption.kyc.profile.steps.country;

import com.iqoption.core.microservices.configuration.a.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001a\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, bng = {"Lcom/iqoption/kyc/profile/steps/country/KycCountryItem;", "Lcom/iqoption/kyc/profile/steps/country/KycCountryAdapterItem;", "country", "Lcom/iqoption/core/microservices/configuration/response/Country;", "selected", "", "(Lcom/iqoption/core/microservices/configuration/response/Country;Z)V", "getCountry", "()Lcom/iqoption/core/microservices/configuration/response/Country;", "id", "", "getId", "()Ljava/lang/String;", "getSelected", "()Z", "viewType", "", "getViewType", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "kyc_release"})
/* compiled from: CountryAdapterItems.kt */
public final class g extends c {
    private final c aBZ;
    private final boolean cFW;
    private final int cWK = 1;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (kotlin.jvm.internal.i.y(this.aBZ, gVar.aBZ)) {
                    if ((this.cFW == gVar.cFW ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        c cVar = this.aBZ;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        int i = this.cFW;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycCountryItem(country=");
        stringBuilder.append(this.aBZ);
        stringBuilder.append(", selected=");
        stringBuilder.append(this.cFW);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public g(c cVar, boolean z) {
        kotlin.jvm.internal.i.f(cVar, "country");
        super();
        this.aBZ = cVar;
        this.cFW = z;
    }

    public final c LB() {
        return this.aBZ;
    }

    public final boolean asM() {
        return this.cFW;
    }

    public int asd() {
        return this.cWK;
    }

    public String getId() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("country-");
        stringBuilder.append(this.aBZ.getId().longValue());
        return stringBuilder.toString();
    }
}

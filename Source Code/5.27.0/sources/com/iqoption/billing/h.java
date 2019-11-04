package com.iqoption.billing;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, bng = {"Lcom/iqoption/billing/KycDepositPermissions;", "", "isKycLimitEnabled", "", "shouldShowKycBeforeDep", "shouldShowKycAfterDep", "(ZZZ)V", "()Z", "getShouldShowKycAfterDep", "getShouldShowKycBeforeDep", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "billing_release"})
/* compiled from: CashBoxMediator.kt */
public final class h {
    private final boolean ayP;
    private final boolean ayQ;
    private final boolean ayR;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if ((this.ayP == hVar.ayP ? 1 : null) != null) {
                    if ((this.ayQ == hVar.ayQ ? 1 : null) != null) {
                        if ((this.ayR == hVar.ayR ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.ayP;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.ayQ;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.ayR;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycDepositPermissions(isKycLimitEnabled=");
        stringBuilder.append(this.ayP);
        stringBuilder.append(", shouldShowKycBeforeDep=");
        stringBuilder.append(this.ayQ);
        stringBuilder.append(", shouldShowKycAfterDep=");
        stringBuilder.append(this.ayR);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public h(boolean z, boolean z2, boolean z3) {
        this.ayP = z;
        this.ayQ = z2;
        this.ayR = z3;
    }

    public final boolean Kt() {
        return this.ayQ;
    }

    public final boolean Ku() {
        return this.ayR;
    }
}

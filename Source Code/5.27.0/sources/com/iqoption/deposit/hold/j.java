package com.iqoption.deposit.hold;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, bng = {"Lcom/iqoption/deposit/hold/IntCardFieldValue;", "Lcom/iqoption/deposit/hold/CardFieldValue;", "", "isCompleted", "", "value", "(ZI)V", "()Z", "getValue", "()Ljava/lang/Integer;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "deposit_release"})
/* compiled from: CardFieldValues.kt */
public final class j {
    private final boolean cEs;
    private final int value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if ((isCompleted() == jVar.isCompleted() ? 1 : null) != null) {
                    if ((ahd().intValue() == jVar.ahd().intValue() ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int isCompleted = isCompleted();
        if (isCompleted != 0) {
            isCompleted = 1;
        }
        return (isCompleted * 31) + ahd().intValue();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IntCardFieldValue(isCompleted=");
        stringBuilder.append(isCompleted());
        stringBuilder.append(", value=");
        stringBuilder.append(ahd());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public j(boolean z, int i) {
        this.cEs = z;
        this.value = i;
    }

    public boolean isCompleted() {
        return this.cEs;
    }

    public Integer ahd() {
        return Integer.valueOf(this.value);
    }
}

package com.iqoption.deposit.hold;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, bng = {"Lcom/iqoption/deposit/hold/StringCardFieldValue;", "Lcom/iqoption/deposit/hold/CardFieldValue;", "", "isCompleted", "", "value", "(ZLjava/lang/String;)V", "()Z", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "deposit_release"})
/* compiled from: CardFieldValues.kt */
public final class k {
    private final boolean cEs;
    private final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if ((isCompleted() == kVar.isCompleted() ? 1 : null) == null || !kotlin.jvm.internal.i.y(getValue(), kVar.getValue())) {
                    return false;
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
        isCompleted *= 31;
        String value = getValue();
        return isCompleted + (value != null ? value.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StringCardFieldValue(isCompleted=");
        stringBuilder.append(isCompleted());
        stringBuilder.append(", value=");
        stringBuilder.append(getValue());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public k(boolean z, String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.VALUE);
        this.cEs = z;
        this.value = str;
    }

    public boolean isCompleted() {
        return this.cEs;
    }

    public String getValue() {
        return this.value;
    }
}

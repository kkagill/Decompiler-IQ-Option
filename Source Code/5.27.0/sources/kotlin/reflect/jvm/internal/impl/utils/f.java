package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.i;

/* compiled from: numbers.kt */
public final class f {
    private final int fzZ;
    private final String number;

    public final String UD() {
        return this.number;
    }

    public final int component2() {
        return this.fzZ;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (i.y(this.number, fVar.number)) {
                    if ((this.fzZ == fVar.fzZ ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.number;
        return ((str != null ? str.hashCode() : 0) * 31) + this.fzZ;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NumberWithRadix(number=");
        stringBuilder.append(this.number);
        stringBuilder.append(", radix=");
        stringBuilder.append(this.fzZ);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public f(String str, int i) {
        i.f(str, "number");
        this.number = str;
        this.fzZ = i;
    }
}

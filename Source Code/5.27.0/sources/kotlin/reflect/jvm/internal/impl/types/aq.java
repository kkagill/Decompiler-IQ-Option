package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: TypeProjectionBase */
public abstract class aq implements ap {
    public String toString() {
        if (bPC()) {
            return "*";
        }
        if (bPD() == Variance.INVARIANT) {
            return bpT().toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bPD());
        stringBuilder.append(" ");
        stringBuilder.append(bpT());
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return bPC() == apVar.bPC() && bPD() == apVar.bPD() && bpT().equals(apVar.bpT());
    }

    public int hashCode() {
        return (bPD().hashCode() * 31) + (bPC() ? 17 : bpT().hashCode());
    }
}

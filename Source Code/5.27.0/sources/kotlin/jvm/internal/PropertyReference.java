package kotlin.jvm.internal;

import kotlin.reflect.j;

public abstract class PropertyReference extends CallableReference implements j {
    /* Access modifiers changed, original: protected */
    /* renamed from: bnO */
    public j bnz() {
        return (j) super.bnz();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (!(RW().equals(propertyReference.RW()) && getName().equals(propertyReference.getName()) && RX().equals(propertyReference.RX()) && i.y(bnx(), propertyReference.bnx()))) {
                z = false;
            }
            return z;
        } else if (obj instanceof j) {
            return obj.equals(bny());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((RW().hashCode() * 31) + getName().hashCode()) * 31) + RX().hashCode();
    }

    public String toString() {
        PropertyReference bny = bny();
        if (bny != this) {
            return bny.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("property ");
        stringBuilder.append(getName());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}

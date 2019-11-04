package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.i;

/* compiled from: signatureEnhancement.kt */
public final class f {
    private final NullabilityQualifier fkI;
    private final boolean fkJ;

    public static /* synthetic */ f a(f fVar, NullabilityQualifier nullabilityQualifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = fVar.fkI;
        }
        if ((i & 2) != 0) {
            z = fVar.fkJ;
        }
        return fVar.a(nullabilityQualifier, z);
    }

    public final f a(NullabilityQualifier nullabilityQualifier, boolean z) {
        i.f(nullabilityQualifier, "qualifier");
        return new f(nullabilityQualifier, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (i.y(this.fkI, fVar.fkI)) {
                    if ((this.fkJ == fVar.fkJ ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.fkI;
        int hashCode = (nullabilityQualifier != null ? nullabilityQualifier.hashCode() : 0) * 31;
        int i = this.fkJ;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NullabilityQualifierWithMigrationStatus(qualifier=");
        stringBuilder.append(this.fkI);
        stringBuilder.append(", isForWarningOnly=");
        stringBuilder.append(this.fkJ);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public f(NullabilityQualifier nullabilityQualifier, boolean z) {
        i.f(nullabilityQualifier, "qualifier");
        this.fkI = nullabilityQualifier;
        this.fkJ = z;
    }

    public final NullabilityQualifier bxX() {
        return this.fkI;
    }

    public /* synthetic */ f(NullabilityQualifier nullabilityQualifier, boolean z, int i, f fVar) {
        if ((i & 2) != 0) {
            z = false;
        }
        this(nullabilityQualifier, z);
    }

    public final boolean bxY() {
        return this.fkJ;
    }
}

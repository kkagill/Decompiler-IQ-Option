package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;

/* compiled from: JavaTypeResolver.kt */
public final class a {
    private final TypeUsage fkm;
    private final JavaTypeFlexibility fkn;
    private final boolean fko;
    private final ao fkp;

    public static /* synthetic */ a a(a aVar, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, ao aoVar, int i, Object obj) {
        if ((i & 1) != 0) {
            typeUsage = aVar.fkm;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = aVar.fkn;
        }
        if ((i & 4) != 0) {
            z = aVar.fko;
        }
        if ((i & 8) != 0) {
            aoVar = aVar.fkp;
        }
        return aVar.a(typeUsage, javaTypeFlexibility, z, aoVar);
    }

    public final a a(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, ao aoVar) {
        i.f(typeUsage, "howThisTypeIsUsed");
        i.f(javaTypeFlexibility, "flexibility");
        return new a(typeUsage, javaTypeFlexibility, z, aoVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (i.y(this.fkm, aVar.fkm) && i.y(this.fkn, aVar.fkn)) {
                    if ((this.fko == aVar.fko ? 1 : null) == null || !i.y(this.fkp, aVar.fkp)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        TypeUsage typeUsage = this.fkm;
        int i = 0;
        int hashCode = (typeUsage != null ? typeUsage.hashCode() : 0) * 31;
        JavaTypeFlexibility javaTypeFlexibility = this.fkn;
        hashCode = (hashCode + (javaTypeFlexibility != null ? javaTypeFlexibility.hashCode() : 0)) * 31;
        int i2 = this.fko;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        ao aoVar = this.fkp;
        if (aoVar != null) {
            i = aoVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JavaTypeAttributes(howThisTypeIsUsed=");
        stringBuilder.append(this.fkm);
        stringBuilder.append(", flexibility=");
        stringBuilder.append(this.fkn);
        stringBuilder.append(", isForAnnotationParameter=");
        stringBuilder.append(this.fko);
        stringBuilder.append(", upperBoundOfTypeParameter=");
        stringBuilder.append(this.fkp);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, ao aoVar) {
        i.f(typeUsage, "howThisTypeIsUsed");
        i.f(javaTypeFlexibility, "flexibility");
        this.fkm = typeUsage;
        this.fkn = javaTypeFlexibility;
        this.fko = z;
        this.fkp = aoVar;
    }

    public final TypeUsage bwY() {
        return this.fkm;
    }

    public /* synthetic */ a(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, ao aoVar, int i, f fVar) {
        if ((i & 2) != 0) {
            javaTypeFlexibility = JavaTypeFlexibility.INFLEXIBLE;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            aoVar = (ao) null;
        }
        this(typeUsage, javaTypeFlexibility, z, aoVar);
    }

    public final JavaTypeFlexibility bwZ() {
        return this.fkn;
    }

    public final boolean bxa() {
        return this.fko;
    }

    public final ao bxb() {
        return this.fkp;
    }

    public final a a(JavaTypeFlexibility javaTypeFlexibility) {
        i.f(javaTypeFlexibility, "flexibility");
        return a(this, null, javaTypeFlexibility, false, null, 13, null);
    }
}

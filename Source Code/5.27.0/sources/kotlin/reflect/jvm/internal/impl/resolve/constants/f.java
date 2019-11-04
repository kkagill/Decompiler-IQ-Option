package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.name.a;

/* compiled from: ClassLiteralValue.kt */
public final class f {
    private final a classId;
    private final int ftA;

    public final a bse() {
        return this.classId;
    }

    public final int component2() {
        return this.ftA;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (i.y(this.classId, fVar.classId)) {
                    if ((this.ftA == fVar.ftA ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        a aVar = this.classId;
        return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.ftA;
    }

    public f(a aVar, int i) {
        i.f(aVar, "classId");
        this.classId = aVar;
        this.ftA = i;
    }

    public final int bNe() {
        return this.ftA;
    }

    public final a getClassId() {
        return this.classId;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = this.ftA;
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append("kotlin/Array<");
        }
        stringBuilder.append(this.classId);
        i = this.ftA;
        for (int i3 = 0; i3 < i; i3++) {
            stringBuilder.append(">");
        }
        String stringBuilder2 = stringBuilder.toString();
        i.e(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }
}

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ak;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.n;

/* compiled from: KotlinJvmBinarySourceElement.kt */
public final class p implements e {
    private final n<g> flV;
    private final boolean flW;
    private final n fmd;

    public p(n nVar, n<g> nVar2, boolean z) {
        i.f(nVar, "binaryClass");
        this.fmd = nVar;
        this.flV = nVar2;
        this.flW = z;
    }

    public final n byL() {
        return this.fmd;
    }

    public String byy() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class '");
        stringBuilder.append(this.fmd.getClassId().bJZ().boi());
        stringBuilder.append('\'');
        return stringBuilder.toString();
    }

    public ak bqg() {
        ak akVar = ak.fcW;
        i.e(akVar, "SourceFile.NO_SOURCE_FILE");
        return akVar;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(this.fmd);
        return stringBuilder.toString();
    }
}

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ak;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;

/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
public final class o implements aj {
    private final h fjr;

    public o(h hVar) {
        i.f(hVar, "packageFragment");
        this.fjr = hVar;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.fjr);
        stringBuilder.append(": ");
        stringBuilder.append(this.fjr.bwH().keySet());
        return stringBuilder.toString();
    }

    public ak bqg() {
        ak akVar = ak.fcW;
        i.e(akVar, "SourceFile.NO_SOURCE_FILE");
        return akVar;
    }

    public final n b(DeserializedMemberDescriptor deserializedMemberDescriptor) {
        i.f(deserializedMemberDescriptor, "descriptor");
        c a = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.a(deserializedMemberDescriptor);
        return a != null ? (n) this.fjr.bwH().get(a.byE()) : null;
    }
}

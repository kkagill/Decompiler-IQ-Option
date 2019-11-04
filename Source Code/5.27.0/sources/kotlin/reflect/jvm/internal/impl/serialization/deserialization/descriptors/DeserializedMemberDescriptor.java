package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.metadata.a.h;
import kotlin.reflect.jvm.internal.impl.metadata.a.i;
import kotlin.reflect.jvm.internal.impl.metadata.a.k;
import kotlin.reflect.jvm.internal.impl.protobuf.n;

/* compiled from: DeserializedMemberDescriptor.kt */
public interface DeserializedMemberDescriptor extends t {

    /* compiled from: DeserializedMemberDescriptor.kt */
    public enum CoroutinesCompatibilityMode {
        COMPATIBLE,
        NEEDS_WRAPPER,
        INCOMPATIBLE
    }

    /* compiled from: DeserializedMemberDescriptor.kt */
    public static final class a {
        public static List<i> d(DeserializedMemberDescriptor deserializedMemberDescriptor) {
            return i.foi.a(deserializedMemberDescriptor.bOz(), deserializedMemberDescriptor.bot(), deserializedMemberDescriptor.bOo());
        }
    }

    List<i> bOA();

    k bOo();

    e bOp();

    n bOz();

    c bot();

    h bou();
}

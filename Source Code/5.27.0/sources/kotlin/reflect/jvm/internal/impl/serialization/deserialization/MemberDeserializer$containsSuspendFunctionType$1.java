package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.k;
import kotlin.reflect.d;
import kotlin.reflect.jvm.internal.impl.builtins.f;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.l;

/* compiled from: MemberDeserializer.kt */
final /* synthetic */ class MemberDeserializer$containsSuspendFunctionType$1 extends PropertyReference1 {
    public static final l fvz = new MemberDeserializer$containsSuspendFunctionType$1();

    MemberDeserializer$containsSuspendFunctionType$1() {
    }

    public d RW() {
        return k.d(f.class, "deserialization");
    }

    public String RX() {
        return "isSuspendFunctionType(Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public String getName() {
        return "isSuspendFunctionType";
    }

    public Object get(Object obj) {
        return Boolean.valueOf(f.e((ay) obj));
    }
}

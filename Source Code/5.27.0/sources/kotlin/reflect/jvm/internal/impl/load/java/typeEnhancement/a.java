package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: typeEnhancement.kt */
final class a implements c {
    public static final a fky = new a();

    public String toString() {
        return "[EnhancedType]";
    }

    private a() {
    }

    public b btB() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.c.a.b(this);
    }

    private final Void bxO() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    public w bpT() {
        bxO();
        throw null;
    }

    public Map<f, g<?>> buf() {
        bxO();
        throw null;
    }

    public aj brF() {
        bxO();
        throw null;
    }
}

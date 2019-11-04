package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: AnnotationDescriptor.kt */
public interface c {

    /* compiled from: AnnotationDescriptor.kt */
    public static final class a {
        public static b b(c cVar) {
            d m = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.m(cVar);
            if (m == null) {
                return null;
            }
            if (p.Y(m)) {
                m = null;
            }
            return m != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.T(m) : null;
        }
    }

    w bpT();

    aj brF();

    b btB();

    Map<f, g<?>> buf();
}

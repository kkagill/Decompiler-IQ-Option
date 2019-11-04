package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: ValueParameterDescriptor.kt */
public interface ar extends ab, at {

    /* compiled from: ValueParameterDescriptor.kt */
    public static final class a {
        public static boolean b(ar arVar) {
            return false;
        }
    }

    ar a(a aVar, f fVar, int i);

    Collection<ar> bsR();

    a btQ();

    boolean btR();

    w btS();

    ar btT();

    boolean btU();

    boolean btV();

    int getIndex();
}

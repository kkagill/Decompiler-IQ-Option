package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: PackageViewDescriptor.kt */
public interface aa extends k {

    /* compiled from: PackageViewDescriptor.kt */
    public static final class a {
        public static boolean a(aa aaVar) {
            return aaVar.getFragments().isEmpty();
        }
    }

    v bql();

    h bsF();

    b btB();

    List<y> getFragments();

    boolean isEmpty();
}

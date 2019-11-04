package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* compiled from: BuiltInsLoader.kt */
final class BuiltInsLoader$Companion$Instance$2 extends Lambda implements a<a> {
    public static final BuiltInsLoader$Companion$Instance$2 eZj = new BuiltInsLoader$Companion$Instance$2();

    BuiltInsLoader$Companion$Instance$2() {
        super(0);
    }

    /* renamed from: bqs */
    public final a invoke() {
        ServiceLoader load = ServiceLoader.load(a.class, a.class.getClassLoader());
        i.e(load, "implementations");
        a aVar = (a) u.K(load);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}

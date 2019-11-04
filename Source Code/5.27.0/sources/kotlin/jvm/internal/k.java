package kotlin.jvm.internal;

import kotlin.reflect.b;
import kotlin.reflect.d;
import kotlin.reflect.e;
import kotlin.reflect.h;
import kotlin.reflect.l;

/* compiled from: Reflection */
public class k {
    private static final l eWc;
    private static final b[] eWd = new b[0];

    static {
        l lVar = null;
        try {
            lVar = (l) Class.forName("kotlin.reflect.jvm.internal.y").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (lVar == null) {
            lVar = new l();
        }
        eWc = lVar;
    }

    public static d d(Class cls, String str) {
        return eWc.d(cls, str);
    }

    public static b G(Class cls) {
        return eWc.G(cls);
    }

    public static String a(Lambda lambda) {
        return eWc.a(lambda);
    }

    public static e a(FunctionReference functionReference) {
        return eWc.a(functionReference);
    }

    public static kotlin.reflect.k a(PropertyReference0 propertyReference0) {
        return eWc.a(propertyReference0);
    }

    public static l a(PropertyReference1 propertyReference1) {
        return eWc.a(propertyReference1);
    }

    public static h a(MutablePropertyReference1 mutablePropertyReference1) {
        return eWc.a(mutablePropertyReference1);
    }
}

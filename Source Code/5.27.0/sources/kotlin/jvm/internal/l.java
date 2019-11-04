package kotlin.jvm.internal;

import kotlin.reflect.b;
import kotlin.reflect.d;
import kotlin.reflect.e;
import kotlin.reflect.h;
import kotlin.reflect.k;

/* compiled from: ReflectionFactory */
public class l {
    public e a(FunctionReference functionReference) {
        return functionReference;
    }

    public h a(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public k a(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public kotlin.reflect.l a(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public d d(Class cls, String str) {
        return new j(cls, str);
    }

    public b G(Class cls) {
        return new d(cls);
    }

    public String a(Lambda lambda) {
        return a((h) lambda);
    }

    public String a(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}

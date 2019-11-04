package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.l;
import kotlin.reflect.b;
import kotlin.reflect.d;
import kotlin.reflect.e;
import kotlin.reflect.k;

/* compiled from: ReflectionFactoryImpl */
public class y extends l {
    public d d(Class cls, String str) {
        return new m(cls, str);
    }

    public b G(Class cls) {
        return f.I(cls);
    }

    public String a(Lambda lambda) {
        return a((h) lambda);
    }

    public String a(h hVar) {
        e a = kotlin.reflect.jvm.d.a(hVar);
        if (a != null) {
            i du = ae.du(a);
            if (du != null) {
                return z.eYj.c(du.box());
            }
        }
        return super.a(hVar);
    }

    public e a(FunctionReference functionReference) {
        return new i(a((CallableReference) functionReference), functionReference.getName(), functionReference.RX(), functionReference.bnx());
    }

    public k a(PropertyReference0 propertyReference0) {
        return new o(a((CallableReference) propertyReference0), propertyReference0.getName(), propertyReference0.RX(), propertyReference0.bnx());
    }

    public kotlin.reflect.l a(PropertyReference1 propertyReference1) {
        return new p(a((CallableReference) propertyReference1), propertyReference1.getName(), propertyReference1.RX(), propertyReference1.bnx());
    }

    public kotlin.reflect.h a(MutablePropertyReference1 mutablePropertyReference1) {
        return new k(a((CallableReference) mutablePropertyReference1), mutablePropertyReference1.getName(), mutablePropertyReference1.RX(), mutablePropertyReference1.bnx());
    }

    private static KDeclarationContainerImpl a(CallableReference callableReference) {
        d RW = callableReference.RW();
        return RW instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) RW : a.eWC;
    }
}

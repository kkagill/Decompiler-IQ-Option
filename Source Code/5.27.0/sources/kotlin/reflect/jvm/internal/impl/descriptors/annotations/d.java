package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c.a;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: AnnotationDescriptorImpl */
public class d implements c {
    private final w fds;
    private final Map<f, g<?>> fdt;
    private final aj fdu;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 3 || i == 4 || i == 5) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = str2;
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 3 || i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 3 || i == 4 || i == 5) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public d(w wVar, Map<f, g<?>> map, aj ajVar) {
        if (wVar == null) {
            $$$reportNull$$$0(0);
        }
        if (map == null) {
            $$$reportNull$$$0(1);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(2);
        }
        this.fds = wVar;
        this.fdt = map;
        this.fdu = ajVar;
    }

    public w bpT() {
        w wVar = this.fds;
        if (wVar == null) {
            $$$reportNull$$$0(3);
        }
        return wVar;
    }

    public b btB() {
        return a.b(this);
    }

    public Map<f, g<?>> buf() {
        Map map = this.fdt;
        if (map == null) {
            $$$reportNull$$$0(4);
        }
        return map;
    }

    public aj brF() {
        aj ajVar = this.fdu;
        if (ajVar == null) {
            $$$reportNull$$$0(5);
        }
        return ajVar;
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.b.frn.a(this, null);
    }
}

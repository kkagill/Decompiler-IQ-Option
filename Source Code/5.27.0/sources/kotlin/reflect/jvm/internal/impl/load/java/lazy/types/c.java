package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.types.ah;
import kotlin.reflect.jvm.internal.impl.types.ai;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ar;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: JavaTypeResolver.kt */
public final class c {
    private static final b fkr = new b("java.lang.Class");

    public static final ap a(ao aoVar, a aVar) {
        i.f(aoVar, "typeParameter");
        i.f(aVar, "attr");
        if (aVar.bwY() == TypeUsage.SUPERTYPE) {
            return new ar(ai.c(aoVar));
        }
        return new ah(aoVar);
    }

    public static final a a(TypeUsage typeUsage, boolean z, ao aoVar) {
        i.f(typeUsage, "$this$toAttributes");
        return new a(typeUsage, null, z, aoVar, 2, null);
    }

    public static final w a(ao aoVar, ao aoVar2, a<? extends w> aVar) {
        i.f(aoVar, "$this$getErasedUpperBound");
        i.f(aVar, "defaultValue");
        if (aoVar == aoVar2) {
            return (w) aVar.invoke();
        }
        List bod = aoVar.bod();
        i.e(bod, "upperBounds");
        w wVar = (w) u.bU(bod);
        if (wVar.bMZ().brQ() instanceof d) {
            i.e(wVar, "firstUpperBound");
            return kotlin.reflect.jvm.internal.impl.types.b.a.bq(wVar);
        }
        Object aoVar3;
        if (aoVar2 != null) {
            aoVar3 = aoVar2;
        }
        f brQ = wVar.bMZ().brQ();
        String str = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor";
        if (brQ != null) {
            while (true) {
                aoVar2 = (ao) brQ;
                if ((i.y(aoVar2, aoVar3) ^ 1) == 0) {
                    return (w) aVar.invoke();
                }
                List bod2 = aoVar2.bod();
                i.e(bod2, "current.upperBounds");
                w wVar2 = (w) u.bU(bod2);
                if (wVar2.bMZ().brQ() instanceof d) {
                    i.e(wVar2, "nextUpperBound");
                    return kotlin.reflect.jvm.internal.impl.types.b.a.bq(wVar2);
                }
                brQ = wVar2.bMZ().brQ();
                if (brQ == null) {
                    throw new TypeCastException(str);
                }
            }
        } else {
            throw new TypeCastException(str);
        }
    }
}

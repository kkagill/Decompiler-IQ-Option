package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: JavaAnnotationMapper.kt */
final class JavaAnnotationTargetMapper$mapJavaTargetArguments$1 extends Lambda implements b<v, w> {
    public static final JavaAnnotationTargetMapper$mapJavaTargetArguments$1 fih = new JavaAnnotationTargetMapper$mapJavaTargetArguments$1();

    JavaAnnotationTargetMapper$mapJavaTargetArguments$1() {
        super(1);
    }

    /* renamed from: f */
    public final w invoke(v vVar) {
        i.f(vVar, "module");
        ar b = a.b(c.fic.bvL(), vVar.btw().c(g.eZA.fag));
        if (b != null) {
            w bpT = b.bpT();
            if (bpT != null) {
                return bpT;
            }
        }
        ad mK = p.mK("Error: AnnotationTarget[]");
        i.e(mK, "ErrorUtils.createErrorTy…ror: AnnotationTarget[]\")");
        return mK;
    }
}

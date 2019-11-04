package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: annotationUtil.kt */
final class AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1 extends Lambda implements b<v, ad> {
    final /* synthetic */ g $this_createDeprecatedAnnotation;

    AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1(g gVar) {
        this.$this_createDeprecatedAnnotation = gVar;
        super(1);
    }

    /* renamed from: e */
    public final ad invoke(v vVar) {
        i.f(vVar, "module");
        ad a = vVar.btw().a(Variance.INVARIANT, (w) this.$this_createDeprecatedAnnotation.bqY());
        i.e(a, "module.builtIns.getArray…ce.INVARIANT, stringType)");
        return a;
    }
}

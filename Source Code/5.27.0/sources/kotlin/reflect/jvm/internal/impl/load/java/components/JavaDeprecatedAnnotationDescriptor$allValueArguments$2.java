package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.j;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.t;

/* compiled from: JavaAnnotationMapper.kt */
final class JavaDeprecatedAnnotationDescriptor$allValueArguments$2 extends Lambda implements a<Map<f, ? extends t>> {
    public static final JavaDeprecatedAnnotationDescriptor$allValueArguments$2 fij = new JavaDeprecatedAnnotationDescriptor$allValueArguments$2();

    JavaDeprecatedAnnotationDescriptor$allValueArguments$2() {
        super(0);
    }

    /* renamed from: aAU */
    public final Map<f, t> invoke() {
        return ae.m(j.x(c.fic.bvK(), new t("Deprecated in Java")));
    }
}

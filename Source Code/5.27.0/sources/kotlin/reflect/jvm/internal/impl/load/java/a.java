package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import java.util.Set;
import kotlin.j;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.k;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f;
import kotlin.reflect.jvm.internal.impl.name.b;

/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class a {
    private static final Map<b, k> fgA = af.a(j.x(new b("javax.annotation.ParametersAreNullableByDefault"), new k(new f(NullabilityQualifier.NULLABLE, false, 2, null), l.listOf(QualifierApplicabilityType.VALUE_PARAMETER))), j.x(new b("javax.annotation.ParametersAreNonnullByDefault"), new k(new f(NullabilityQualifier.NOT_NULL, false, 2, null), l.listOf(QualifierApplicabilityType.VALUE_PARAMETER))));
    private static final Set<b> fgB = al.setOf(o.bvz(), o.bvA());
    private static final b fgw = new b("javax.annotation.meta.TypeQualifierNickname");
    private static final b fgx = new b("javax.annotation.meta.TypeQualifier");
    private static final b fgy = new b("javax.annotation.meta.TypeQualifierDefault");
    private static final b fgz = new b("kotlin.annotations.jvm.UnderMigration");

    private static final boolean x(d dVar) {
        return fgB.contains(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x((kotlin.reflect.jvm.internal.impl.descriptors.k) dVar)) || dVar.brE().j(fgx);
    }
}

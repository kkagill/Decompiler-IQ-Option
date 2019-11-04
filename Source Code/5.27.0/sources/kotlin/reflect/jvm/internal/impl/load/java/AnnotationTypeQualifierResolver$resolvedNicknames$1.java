package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;

/* compiled from: AnnotationTypeQualifierResolver.kt */
final /* synthetic */ class AnnotationTypeQualifierResolver$resolvedNicknames$1 extends FunctionReference implements b<d, c> {
    AnnotationTypeQualifierResolver$resolvedNicknames$1(AnnotationTypeQualifierResolver annotationTypeQualifierResolver) {
        super(1, annotationTypeQualifierResolver);
    }

    public final kotlin.reflect.d RW() {
        return k.G(AnnotationTypeQualifierResolver.class);
    }

    public final String RX() {
        return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
    }

    public final String getName() {
        return "computeTypeQualifierNickname";
    }

    /* renamed from: w */
    public final c invoke(d dVar) {
        i.f(dVar, "p1");
        return ((AnnotationTypeQualifierResolver) this.receiver).t(dVar);
    }
}

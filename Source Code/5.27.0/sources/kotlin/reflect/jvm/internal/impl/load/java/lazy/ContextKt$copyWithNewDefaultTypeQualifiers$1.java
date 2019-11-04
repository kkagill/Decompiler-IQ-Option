package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;

/* compiled from: context.kt */
final class ContextKt$copyWithNewDefaultTypeQualifiers$1 extends Lambda implements a<d> {
    final /* synthetic */ f $additionalAnnotations;
    final /* synthetic */ h $this_copyWithNewDefaultTypeQualifiers;

    ContextKt$copyWithNewDefaultTypeQualifiers$1(h hVar, f fVar) {
        this.$this_copyWithNewDefaultTypeQualifiers = hVar;
        this.$additionalAnnotations = fVar;
        super(0);
    }

    /* renamed from: bvP */
    public final d invoke() {
        return a.a(this.$this_copyWithNewDefaultTypeQualifiers, this.$additionalAnnotations);
    }
}

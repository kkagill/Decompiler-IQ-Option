package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.name.b;

/* compiled from: signatureEnhancement.kt */
final class SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1 extends Lambda implements m<List<? extends b>, T, T> {
    final /* synthetic */ f $composedAnnotation;

    SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1(f fVar) {
        this.$composedAnnotation = fVar;
        super(2);
    }

    /* renamed from: j */
    public final <T> T w(List<b> list, T t) {
        i.f(list, "$this$ifPresent");
        i.f(t, "qualifier");
        Iterable<b> iterable = list;
        Object obj = null;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (b i : iterable) {
                Object obj2;
                if (this.$composedAnnotation.i(i) != null) {
                    obj2 = 1;
                    continue;
                } else {
                    obj2 = null;
                    continue;
                }
                if (obj2 != null) {
                    obj = 1;
                    break;
                }
            }
        }
        return obj != null ? t : null;
    }
}

package kotlin.reflect.jvm.internal.components;

import java.lang.annotation.Annotation;
import kotlin.i;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ak;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lkotlin/reflect/jvm/internal/components/ReflectAnnotationSource;", "Lkotlin/reflect/jvm/internal/impl/descriptors/SourceElement;", "annotation", "", "(Ljava/lang/annotation/Annotation;)V", "getAnnotation", "()Ljava/lang/annotation/Annotation;", "getContainingFile", "Lkotlin/reflect/jvm/internal/impl/descriptors/SourceFile;", "descriptors.runtime"})
/* compiled from: ReflectAnnotationSource.kt */
public final class a implements aj {
    private final Annotation eYO;

    public a(Annotation annotation) {
        kotlin.jvm.internal.i.f(annotation, "annotation");
        this.eYO = annotation;
    }

    public final Annotation bqh() {
        return this.eYO;
    }

    public ak bqg() {
        ak akVar = ak.fcW;
        kotlin.jvm.internal.i.e(akVar, "SourceFile.NO_SOURCE_FILE");
        return akVar;
    }
}

package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.b;

/* compiled from: DescriptorRenderer.kt */
public interface g {

    /* compiled from: DescriptorRenderer.kt */
    public static final class a {
        public static boolean b(g gVar) {
            return gVar.bLY().getIncludeAnnotationArguments();
        }

        public static boolean c(g gVar) {
            return gVar.bLY().getIncludeEmptyAnnotationArguments();
        }
    }

    void a(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy);

    void a(ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    void a(RenderingFormat renderingFormat);

    void a(a aVar);

    AnnotationArgumentsRenderingPolicy bLY();

    boolean bMd();

    boolean bMg();

    Set<b> bMi();

    void gR(boolean z);

    void gS(boolean z);

    void gT(boolean z);

    void gU(boolean z);

    void gV(boolean z);

    void gW(boolean z);

    void gX(boolean z);

    void gY(boolean z);

    void o(Set<b> set);

    void p(Set<? extends DescriptorRendererModifier> set);
}

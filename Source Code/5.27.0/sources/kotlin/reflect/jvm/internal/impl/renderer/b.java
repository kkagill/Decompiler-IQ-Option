package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: DescriptorRenderer.kt */
public abstract class b {
    public static final b fri = frr.p(DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1.fru);
    public static final b frj = frr.p(DescriptorRenderer$Companion$COMPACT$1.frs);
    public static final b frk = frr.p(DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1.frt);
    public static final b frl = frr.p(DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1.frv);
    public static final b frm = frr.p(DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1.frz);
    public static final b frn = frr.p(DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1.frx);
    public static final b fro = frr.p(DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1.frA);
    public static final b frp = frr.p(DescriptorRenderer$Companion$DEBUG_TEXT$1.frw);
    public static final b frq = frr.p(DescriptorRenderer$Companion$HTML$1.fry);
    public static final a frr = new a();

    /* compiled from: DescriptorRenderer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b p(kotlin.jvm.a.b<? super g, l> bVar) {
            i.f(bVar, "changeOptions");
            h hVar = new h();
            bVar.invoke(hVar);
            hVar.lock();
            return new d(hVar);
        }

        public final String b(g gVar) {
            i.f(gVar, "classifier");
            if (gVar instanceof an) {
                return "typealias";
            }
            if (gVar instanceof d) {
                d dVar = (d) gVar;
                if (dVar.bry()) {
                    return "companion object";
                }
                switch (c.aob[dVar.brt().ordinal()]) {
                    case 1:
                        return "class";
                    case 2:
                        return "interface";
                    case 3:
                        return "enum class";
                    case 4:
                        return "object";
                    case 5:
                        return "annotation class";
                    case 6:
                        return "enum entry";
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected classifier: ");
            stringBuilder.append(gVar);
            throw new AssertionError(stringBuilder.toString());
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    public interface b {

        /* compiled from: DescriptorRenderer.kt */
        public static final class a implements b {
            public static final a frB = new a();

            public void a(ar arVar, int i, int i2, StringBuilder stringBuilder) {
                i.f(arVar, "parameter");
                i.f(stringBuilder, "builder");
            }

            private a() {
            }

            public void b(int i, StringBuilder stringBuilder) {
                i.f(stringBuilder, "builder");
                stringBuilder.append("(");
            }

            public void c(int i, StringBuilder stringBuilder) {
                i.f(stringBuilder, "builder");
                stringBuilder.append(")");
            }

            public void b(ar arVar, int i, int i2, StringBuilder stringBuilder) {
                i.f(arVar, "parameter");
                i.f(stringBuilder, "builder");
                if (i != i2 - 1) {
                    stringBuilder.append(", ");
                }
            }
        }

        void a(ar arVar, int i, int i2, StringBuilder stringBuilder);

        void b(int i, StringBuilder stringBuilder);

        void b(ar arVar, int i, int i2, StringBuilder stringBuilder);

        void c(int i, StringBuilder stringBuilder);
    }

    public abstract String a(String str, String str2, kotlin.reflect.jvm.internal.impl.builtins.g gVar);

    public abstract String a(c cVar, AnnotationUseSiteTarget annotationUseSiteTarget);

    public abstract String a(ap apVar);

    public abstract String b(f fVar, boolean z);

    public abstract String b(w wVar);

    public abstract String f(kotlin.reflect.jvm.internal.impl.name.c cVar);

    public abstract String s(k kVar);

    public final b p(kotlin.jvm.a.b<? super g, l> bVar) {
        i.f(bVar, "changeOptions");
        h bMS = ((d) this).bLV().bMS();
        bVar.invoke(bMS);
        bMS.lock();
        return new d(bMS);
    }

    public static /* synthetic */ String a(b bVar, c cVar, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                annotationUseSiteTarget = (AnnotationUseSiteTarget) null;
            }
            return bVar.a(cVar, annotationUseSiteTarget);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
    }
}

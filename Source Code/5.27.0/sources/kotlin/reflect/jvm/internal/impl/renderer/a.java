package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.y;

/* compiled from: ClassifierNamePolicy.kt */
public interface a {

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class a implements a {
        public static final a frf = new a();

        private a() {
        }

        public String a(f fVar, b bVar) {
            i.f(fVar, "classifier");
            i.f(bVar, "renderer");
            if (fVar instanceof ao) {
                kotlin.reflect.jvm.internal.impl.name.f bsZ = ((ao) fVar).bsZ();
                i.e(bsZ, "classifier.name");
                return bVar.b(bsZ, false);
            }
            kotlin.reflect.jvm.internal.impl.name.c w = kotlin.reflect.jvm.internal.impl.resolve.c.w(fVar);
            i.e(w, "DescriptorUtils.getFqName(classifier)");
            return bVar.f(w);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class b implements a {
        public static final b frg = new b();

        private b() {
        }

        public String a(f fVar, b bVar) {
            i.f(fVar, "classifier");
            i.f(bVar, "renderer");
            if (fVar instanceof ao) {
                kotlin.reflect.jvm.internal.impl.name.f bsZ = ((ao) fVar).bsZ();
                i.e(bsZ, "classifier.name");
                return bVar.b(bsZ, false);
            }
            ArrayList arrayList = new ArrayList();
            k kVar = fVar;
            do {
                arrayList.add(kVar.bsZ());
                kVar = kVar.brj();
            } while (kVar instanceof d);
            return k.cj(s.bT(arrayList));
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class c implements a {
        public static final c frh = new c();

        private c() {
        }

        public String a(f fVar, b bVar) {
            i.f(fVar, "classifier");
            i.f(bVar, "renderer");
            return a(fVar);
        }

        private final String a(f fVar) {
            kotlin.reflect.jvm.internal.impl.name.f bsZ = fVar.bsZ();
            i.e(bsZ, "descriptor.name");
            String K = k.K(bsZ);
            if (fVar instanceof ao) {
                return K;
            }
            k brj = fVar.brj();
            i.e(brj, "descriptor.containingDeclaration");
            String r = r(brj);
            if (!(r == null || (i.y(r, "") ^ 1) == 0)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(r);
                stringBuilder.append(".");
                stringBuilder.append(K);
                K = stringBuilder.toString();
            }
            return K;
        }

        private final String r(k kVar) {
            if (kVar instanceof d) {
                return a((f) kVar);
            }
            if (!(kVar instanceof y)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.c bKa = ((y) kVar).btB().bKa();
            i.e(bKa, "descriptor.fqName.toUnsafe()");
            return k.g(bKa);
        }
    }

    String a(f fVar, b bVar);
}

package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.load.java.structure.l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;
import kotlin.reflect.jvm.internal.impl.name.b;

/* compiled from: JavaResolverCache */
public interface g {
    public static final g fil = new g() {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "method";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a(kotlin.reflect.jvm.internal.impl.load.java.structure.g gVar, d dVar) {
            if (gVar == null) {
                AnonymousClass1.$$$reportNull$$$0(7);
            }
            if (dVar == null) {
                AnonymousClass1.$$$reportNull$$$0(8);
            }
        }

        public void a(l lVar, j jVar) {
            if (lVar == null) {
                AnonymousClass1.$$$reportNull$$$0(3);
            }
            if (jVar == null) {
                AnonymousClass1.$$$reportNull$$$0(4);
            }
        }

        public void a(q qVar, ai aiVar) {
            if (qVar == null) {
                AnonymousClass1.$$$reportNull$$$0(1);
            }
            if (aiVar == null) {
                AnonymousClass1.$$$reportNull$$$0(2);
            }
        }

        public void c(n nVar, ae aeVar) {
            if (nVar == null) {
                AnonymousClass1.$$$reportNull$$$0(5);
            }
            if (aeVar == null) {
                AnonymousClass1.$$$reportNull$$$0(6);
            }
        }

        public d n(b bVar) {
            if (bVar == null) {
                AnonymousClass1.$$$reportNull$$$0(0);
            }
            return null;
        }
    };

    void a(kotlin.reflect.jvm.internal.impl.load.java.structure.g gVar, d dVar);

    void a(l lVar, j jVar);

    void a(q qVar, ai aiVar);

    void c(n nVar, ae aeVar);

    d n(b bVar);
}

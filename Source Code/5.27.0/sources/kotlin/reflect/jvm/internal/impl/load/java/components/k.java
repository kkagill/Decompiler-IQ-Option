package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: SignaturePropagator */
public interface k {
    public static final k fin = new k() {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 5 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 5 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            switch (i) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = str2;
                    break;
                case 6:
                    objArr[0] = "descriptor";
                    break;
                case 7:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            String str3 = "resolvePropagatedSignature";
            if (i != 5) {
                objArr[1] = str2;
            } else {
                objArr[1] = str3;
            }
            if (i != 5) {
                if (i == 6 || i == 7) {
                    objArr[2] = "reportSignatureErrors";
                } else {
                    objArr[2] = str3;
                }
            }
            str = String.format(str, objArr);
            throw (i != 5 ? new IllegalArgumentException(str) : new IllegalStateException(str));
        }

        public a a(q qVar, d dVar, w wVar, w wVar2, List<ar> list, List<ao> list2) {
            if (qVar == null) {
                AnonymousClass1.$$$reportNull$$$0(0);
            }
            if (dVar == null) {
                AnonymousClass1.$$$reportNull$$$0(1);
            }
            if (wVar == null) {
                AnonymousClass1.$$$reportNull$$$0(2);
            }
            if (list == null) {
                AnonymousClass1.$$$reportNull$$$0(3);
            }
            if (list2 == null) {
                AnonymousClass1.$$$reportNull$$$0(4);
            }
            return new a(wVar, wVar2, list, list2, Collections.emptyList(), false);
        }

        public void a(CallableMemberDescriptor callableMemberDescriptor, List<String> list) {
            if (callableMemberDescriptor == null) {
                AnonymousClass1.$$$reportNull$$$0(6);
            }
            if (list == null) {
                AnonymousClass1.$$$reportNull$$$0(7);
            }
            throw new UnsupportedOperationException("Should not be called");
        }
    };

    /* compiled from: SignaturePropagator */
    public static class a {
        private final List<ao> fcP;
        private final boolean feP;
        private final w ffV;
        private final w fio;
        private final List<ar> fip;
        private final List<String> fiq;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i2 = (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = str2;
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getErrors";
            }
            if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
                objArr[2] = "<init>";
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        public a(w wVar, w wVar2, List<ar> list, List<ao> list2, List<String> list3, boolean z) {
            if (wVar == null) {
                $$$reportNull$$$0(0);
            }
            if (list == null) {
                $$$reportNull$$$0(1);
            }
            if (list2 == null) {
                $$$reportNull$$$0(2);
            }
            if (list3 == null) {
                $$$reportNull$$$0(3);
            }
            this.ffV = wVar;
            this.fio = wVar2;
            this.fip = list;
            this.fcP = list2;
            this.fiq = list3;
            this.feP = z;
        }

        public w bsN() {
            w wVar = this.ffV;
            if (wVar == null) {
                $$$reportNull$$$0(4);
            }
            return wVar;
        }

        public w bvN() {
            return this.fio;
        }

        public List<ar> bsP() {
            List list = this.fip;
            if (list == null) {
                $$$reportNull$$$0(5);
            }
            return list;
        }

        public List<ao> bsM() {
            List list = this.fcP;
            if (list == null) {
                $$$reportNull$$$0(6);
            }
            return list;
        }

        public boolean buA() {
            return this.feP;
        }

        public List<String> Zh() {
            List list = this.fiq;
            if (list == null) {
                $$$reportNull$$$0(7);
            }
            return list;
        }
    }

    a a(q qVar, d dVar, w wVar, w wVar2, List<ar> list, List<ao> list2);

    void a(CallableMemberDescriptor callableMemberDescriptor, List<String> list);
}

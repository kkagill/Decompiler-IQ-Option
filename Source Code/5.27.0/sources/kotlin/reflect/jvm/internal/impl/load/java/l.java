package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a.e;

/* compiled from: JavaVisibilities */
public class l {
    public static final aw fhf = new aw("package", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 3 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i2 = (i == 3 || i == 4 || i == 6) ? 2 : 3;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$1";
            switch (i) {
                case 1:
                    objArr[0] = "from";
                    break;
                case 2:
                    objArr[0] = "visibility";
                    break;
                case 3:
                case 4:
                case 6:
                    objArr[0] = str2;
                    break;
                case 5:
                    objArr[0] = "classDescriptor";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
            String str3 = "effectiveVisibility";
            if (i == 3) {
                objArr[1] = "getDisplayName";
            } else if (i == 4) {
                objArr[1] = "normalize";
            } else if (i != 6) {
                objArr[1] = str2;
            } else {
                objArr[1] = str3;
            }
            if (i == 2) {
                objArr[2] = "compareTo";
            } else if (!(i == 3 || i == 4)) {
                if (i == 5) {
                    objArr[2] = str3;
                } else if (i != 6) {
                    objArr[2] = "isVisible";
                }
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i == 3 || i == 4 || i == 6) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        public String getDisplayName() {
            return "public/*package*/";
        }

        public boolean b(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                AnonymousClass1.$$$reportNull$$$0(0);
            }
            if (kVar == null) {
                AnonymousClass1.$$$reportNull$$$0(1);
            }
            return l.b(oVar, kVar);
        }

        /* Access modifiers changed, original: protected */
        public Integer c(aw awVar) {
            if (awVar == null) {
                AnonymousClass1.$$$reportNull$$$0(2);
            }
            if (this == awVar) {
                return Integer.valueOf(0);
            }
            if (av.b(awVar)) {
                return Integer.valueOf(1);
            }
            return Integer.valueOf(-1);
        }

        public aw bud() {
            aw awVar = av.fdc;
            if (awVar == null) {
                AnonymousClass1.$$$reportNull$$$0(4);
            }
            return awVar;
        }
    };
    public static final aw fhg = new aw("protected_static", true) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i2 = (i == 2 || i == 3) ? 2 : 3;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$2";
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2 || i == 3) {
                objArr[0] = str2;
            } else {
                objArr[0] = "what";
            }
            if (i == 2) {
                objArr[1] = "getDisplayName";
            } else if (i != 3) {
                objArr[1] = str2;
            } else {
                objArr[1] = "normalize";
            }
            if (!(i == 2 || i == 3)) {
                objArr[2] = "isVisible";
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i == 2 || i == 3) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        public String getDisplayName() {
            return "protected/*protected static*/";
        }

        public boolean b(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                AnonymousClass2.$$$reportNull$$$0(0);
            }
            if (kVar == null) {
                AnonymousClass2.$$$reportNull$$$0(1);
            }
            return l.c(eVar, oVar, kVar);
        }

        public aw bud() {
            aw awVar = av.fdc;
            if (awVar == null) {
                AnonymousClass2.$$$reportNull$$$0(3);
            }
            return awVar;
        }
    };
    public static final aw fhh = new aw("protected_and_package", true) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i2 = (i == 3 || i == 4) ? 2 : 3;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$3";
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "visibility";
            } else if (i == 3 || i == 4) {
                objArr[0] = str2;
            } else {
                objArr[0] = "what";
            }
            if (i == 3) {
                objArr[1] = "getDisplayName";
            } else if (i != 4) {
                objArr[1] = str2;
            } else {
                objArr[1] = "normalize";
            }
            if (i == 2) {
                objArr[2] = "compareTo";
            } else if (!(i == 3 || i == 4)) {
                objArr[2] = "isVisible";
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i == 3 || i == 4) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        public String getDisplayName() {
            return "protected/*protected and package*/";
        }

        public boolean b(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                AnonymousClass3.$$$reportNull$$$0(0);
            }
            if (kVar == null) {
                AnonymousClass3.$$$reportNull$$$0(1);
            }
            return l.c(eVar, oVar, kVar);
        }

        /* Access modifiers changed, original: protected */
        public Integer c(aw awVar) {
            if (awVar == null) {
                AnonymousClass3.$$$reportNull$$$0(2);
            }
            if (this == awVar) {
                return Integer.valueOf(0);
            }
            if (awVar == av.fdd) {
                return null;
            }
            if (av.b(awVar)) {
                return Integer.valueOf(1);
            }
            return Integer.valueOf(-1);
        }

        public aw bud() {
            aw awVar = av.fdc;
            if (awVar == null) {
                AnonymousClass3.$$$reportNull$$$0(4);
            }
            return awVar;
        }
    };

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2) {
            objArr[0] = "first";
        } else if (i != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "second";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities";
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private static boolean c(e eVar, o oVar, k kVar) {
        if (oVar == null) {
            $$$reportNull$$$0(0);
        }
        if (kVar == null) {
            $$$reportNull$$$0(1);
        }
        if (b(c.a(oVar), kVar)) {
            return true;
        }
        return av.fdc.b(eVar, oVar, kVar);
    }

    private static boolean b(k kVar, k kVar2) {
        if (kVar == null) {
            $$$reportNull$$$0(2);
        }
        if (kVar2 == null) {
            $$$reportNull$$$0(3);
        }
        y yVar = (y) c.a(kVar, y.class, false);
        y yVar2 = (y) c.a(kVar2, y.class, false);
        if (yVar2 == null || yVar == null || !yVar.btB().equals(yVar2.btB())) {
            return false;
        }
        return true;
    }
}

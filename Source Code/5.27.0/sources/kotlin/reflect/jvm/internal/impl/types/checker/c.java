package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.checker.b.a;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: KotlinTypeCheckerImpl */
public class c implements b {
    private final TypeCheckingProcedure fxJ;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 1 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeCheckerImpl";
        switch (i) {
            case 1:
                objArr[0] = str2;
                break;
            case 2:
                objArr[0] = "procedure";
                break;
            case 3:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "supertype";
                break;
            case 5:
                objArr[0] = "a";
                break;
            case 6:
                objArr[0] = "b";
                break;
            default:
                objArr[0] = "equalityAxioms";
                break;
        }
        String str3 = "withAxioms";
        if (i != 1) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 1:
                break;
            case 2:
                objArr[2] = "<init>";
                break;
            case 3:
            case 4:
                objArr[2] = "isSubtypeOf";
                break;
            case 5:
            case 6:
                objArr[2] = "equalTypes";
                break;
            default:
                objArr[2] = str3;
                break;
        }
        str = String.format(str, objArr);
        throw (i != 1 ? new IllegalArgumentException(str) : new IllegalStateException(str));
    }

    public static b b(final a aVar) {
        if (aVar == null) {
            $$$reportNull$$$0(0);
        }
        return new c(new TypeCheckingProcedure(new n() {
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "constructor1";
                } else {
                    objArr[0] = "constructor2";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeCheckerImpl$1";
                objArr[2] = "assertEqualTypeConstructors";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            public boolean c(an anVar, an anVar2) {
                if (anVar == null) {
                    AnonymousClass1.$$$reportNull$$$0(0);
                }
                if (anVar2 == null) {
                    AnonymousClass1.$$$reportNull$$$0(1);
                }
                return anVar.equals(anVar2) || aVar.a(anVar, anVar2);
            }
        }));
    }

    protected c(TypeCheckingProcedure typeCheckingProcedure) {
        if (typeCheckingProcedure == null) {
            $$$reportNull$$$0(2);
        }
        this.fxJ = typeCheckingProcedure;
    }

    public boolean c(w wVar, w wVar2) {
        if (wVar == null) {
            $$$reportNull$$$0(3);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(4);
        }
        return this.fxJ.c(wVar, wVar2);
    }

    public boolean d(w wVar, w wVar2) {
        if (wVar == null) {
            $$$reportNull$$$0(5);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(6);
        }
        return this.fxJ.d(wVar, wVar2);
    }
}

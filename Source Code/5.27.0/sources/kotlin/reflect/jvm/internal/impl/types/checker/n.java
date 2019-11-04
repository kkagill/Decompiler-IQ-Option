package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: TypeCheckerProcedureCallbacksImpl */
class n implements o {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
            default:
                objArr[0] = "a";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public boolean a(w wVar, ap apVar) {
        if (wVar == null) {
            $$$reportNull$$$0(8);
        }
        if (apVar == null) {
            $$$reportNull$$$0(9);
        }
        return false;
    }

    public boolean e(w wVar, w wVar2) {
        if (wVar == null) {
            $$$reportNull$$$0(10);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(11);
        }
        return false;
    }

    n() {
    }

    public boolean a(w wVar, w wVar2, TypeCheckingProcedure typeCheckingProcedure) {
        if (wVar == null) {
            $$$reportNull$$$0(0);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(1);
        }
        if (typeCheckingProcedure == null) {
            $$$reportNull$$$0(2);
        }
        return typeCheckingProcedure.d(wVar, wVar2);
    }

    public boolean c(an anVar, an anVar2) {
        if (anVar == null) {
            $$$reportNull$$$0(3);
        }
        if (anVar2 == null) {
            $$$reportNull$$$0(4);
        }
        return anVar.equals(anVar2);
    }

    public boolean b(w wVar, w wVar2, TypeCheckingProcedure typeCheckingProcedure) {
        if (wVar == null) {
            $$$reportNull$$$0(5);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(6);
        }
        if (typeCheckingProcedure == null) {
            $$$reportNull$$$0(7);
        }
        return typeCheckingProcedure.c(wVar, wVar2);
    }
}

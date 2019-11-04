package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.am;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.t;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.y;

public class TypeCheckingProcedure {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final o fyc;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fyd = new int[Variance.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = kotlin.reflect.jvm.internal.impl.types.Variance.values();
            r0 = r0.length;
            r0 = new int[r0];
            fyd = r0;
            r0 = fyd;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fyd;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = fyd;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure$AnonymousClass1.<clinit>():void");
        }
    }

    public enum EnrichedProjectionKind {
        IN,
        OUT,
        INV,
        STAR;

        public static EnrichedProjectionKind fromVariance(Variance variance) {
            if (variance == null) {
                $$$reportNull$$$0(0);
            }
            int i = AnonymousClass1.fyd[variance.ordinal()];
            EnrichedProjectionKind enrichedProjectionKind;
            if (i == 1) {
                enrichedProjectionKind = INV;
                if (enrichedProjectionKind == null) {
                    $$$reportNull$$$0(1);
                }
                return enrichedProjectionKind;
            } else if (i == 2) {
                enrichedProjectionKind = IN;
                if (enrichedProjectionKind == null) {
                    $$$reportNull$$$0(2);
                }
                return enrichedProjectionKind;
            } else if (i == 3) {
                enrichedProjectionKind = OUT;
                if (enrichedProjectionKind == null) {
                    $$$reportNull$$$0(3);
                }
                return enrichedProjectionKind;
            } else {
                throw new IllegalStateException("Unknown variance");
            }
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 7 || i == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 7 || i == 10) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        switch (i) {
            case 1:
            case 3:
            case 16:
            case 18:
                objArr[0] = "supertype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 21:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = str2;
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 19:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 20:
                objArr[0] = "supertypeArgumentProjection";
                break;
            default:
                objArr[0] = "subtype";
                break;
        }
        String str3 = "getInType";
        String str4 = "getOutType";
        if (i == 7) {
            objArr[1] = str4;
        } else if (i != 10) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 5:
            case 6:
                objArr[2] = str4;
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = str3;
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 15:
            case 16:
                objArr[2] = "isSubtypeOf";
                break;
            case 17:
            case 18:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 19:
            case 20:
            case 21:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 7 || i == 10) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public static w f(w wVar, w wVar2) {
        if (wVar == null) {
            $$$reportNull$$$0(0);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(1);
        }
        return a(wVar, wVar2, new n());
    }

    public static w a(w wVar, w wVar2, o oVar) {
        if (wVar == null) {
            $$$reportNull$$$0(2);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(3);
        }
        if (oVar == null) {
            $$$reportNull$$$0(4);
        }
        return p.a(wVar, wVar2, oVar);
    }

    private static w a(ao aoVar, ap apVar) {
        if (aoVar == null) {
            $$$reportNull$$$0(5);
        }
        if (apVar == null) {
            $$$reportNull$$$0(6);
        }
        Object obj = (apVar.bPD() == Variance.IN_VARIANCE || aoVar.bta() == Variance.IN_VARIANCE) ? 1 : null;
        w bqN = obj != null ? a.Q(aoVar).bqN() : apVar.bpT();
        if (bqN == null) {
            $$$reportNull$$$0(7);
        }
        return bqN;
    }

    private static w b(ao aoVar, ap apVar) {
        if (aoVar == null) {
            $$$reportNull$$$0(8);
        }
        if (apVar == null) {
            $$$reportNull$$$0(9);
        }
        Object obj = (apVar.bPD() == Variance.OUT_VARIANCE || aoVar.bta() == Variance.OUT_VARIANCE) ? 1 : null;
        w bqK = obj != null ? a.Q(aoVar).bqK() : apVar.bpT();
        if (bqK == null) {
            $$$reportNull$$$0(10);
        }
        return bqK;
    }

    public TypeCheckingProcedure(o oVar) {
        this.fyc = oVar;
    }

    public boolean d(w wVar, w wVar2) {
        if (wVar == null) {
            $$$reportNull$$$0(11);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(12);
        }
        boolean z = true;
        if (wVar == wVar2) {
            return true;
        }
        if (t.aE(wVar)) {
            if (!t.aE(wVar2)) {
                return g(wVar2, wVar);
            }
            if (y.aJ(wVar) || y.aJ(wVar2) || !c(wVar, wVar2) || !c(wVar2, wVar)) {
                z = false;
            }
            return z;
        } else if (t.aE(wVar2)) {
            return g(wVar, wVar2);
        } else {
            if (wVar.boc() != wVar2.boc()) {
                return false;
            }
            if (wVar.boc()) {
                return this.fyc.a(au.aZ(wVar), au.aZ(wVar2), this);
            }
            an bMZ = wVar.bMZ();
            an bMZ2 = wVar2.bMZ();
            if (!this.fyc.c(bMZ, bMZ2)) {
                return false;
            }
            List btD = wVar.btD();
            List btD2 = wVar2.btD();
            if (btD.size() != btD2.size()) {
                return false;
            }
            for (int i = 0; i < btD.size(); i++) {
                ap apVar = (ap) btD.get(i);
                ap apVar2 = (ap) btD2.get(i);
                if (!apVar.bPC() || !apVar2.bPC()) {
                    ao aoVar = (ao) bMZ.getParameters().get(i);
                    ao aoVar2 = (ao) bMZ2.getParameters().get(i);
                    if (!(a(apVar, apVar2, aoVar) || (c(aoVar, apVar) == c(aoVar2, apVar2) && this.fyc.a(apVar.bpT(), apVar2.bpT(), this)))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean g(w wVar, w wVar2) {
        return c(t.aF(wVar2).bPr(), wVar) && c(wVar, t.aF(wVar2).bPs());
    }

    public static EnrichedProjectionKind c(ao aoVar, ap apVar) {
        if (aoVar == null) {
            $$$reportNull$$$0(13);
        }
        if (apVar == null) {
            $$$reportNull$$$0(14);
        }
        Variance bta = aoVar.bta();
        Variance bPD = apVar.bPD();
        if (bPD == Variance.INVARIANT) {
            Variance variance = bPD;
            bPD = bta;
            bta = variance;
        }
        if (bta == Variance.IN_VARIANCE && bPD == Variance.OUT_VARIANCE) {
            return EnrichedProjectionKind.STAR;
        }
        if (bta == Variance.OUT_VARIANCE && bPD == Variance.IN_VARIANCE) {
            return EnrichedProjectionKind.STAR;
        }
        return EnrichedProjectionKind.fromVariance(bPD);
    }

    public boolean c(w wVar, w wVar2) {
        if (wVar == null) {
            $$$reportNull$$$0(15);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(16);
        }
        if (am.b(wVar, wVar2)) {
            boolean z = !wVar.boc() || wVar2.boc();
            return z;
        }
        w aQ = am.aQ(wVar);
        w aR = am.aR(wVar2);
        if (aQ == wVar && aR == wVar2) {
            return h(wVar, wVar2);
        }
        return c(aQ, aR);
    }

    private boolean h(w wVar, w wVar2) {
        if (y.aJ(wVar) || y.aJ(wVar2)) {
            return true;
        }
        if (!wVar2.boc() && wVar.boc()) {
            return false;
        }
        if (g.D(wVar)) {
            return true;
        }
        w a = a(wVar, wVar2, this.fyc);
        if (a == null) {
            return this.fyc.e(wVar, wVar2);
        }
        if (wVar2.boc() || !a.boc()) {
            return i(a, wVar2);
        }
        return false;
    }

    private boolean i(w wVar, w wVar2) {
        if (wVar == null) {
            $$$reportNull$$$0(17);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(18);
        }
        an bMZ = wVar.bMZ();
        List btD = wVar.btD();
        List btD2 = wVar2.btD();
        if (btD.size() != btD2.size()) {
            return false;
        }
        List parameters = bMZ.getParameters();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= parameters.size()) {
                return true;
            }
            ao aoVar = (ao) parameters.get(i);
            ap apVar = (ap) btD2.get(i);
            ap apVar2 = (ap) btD.get(i);
            if (!(apVar.bPC() || a(apVar2, apVar, aoVar))) {
                if (!(y.aJ(apVar2.bpT()) || y.aJ(apVar.bpT()))) {
                    z = false;
                }
                if (z || aoVar.bta() != Variance.INVARIANT || apVar2.bPD() != Variance.INVARIANT || apVar.bPD() != Variance.INVARIANT) {
                    w a = a(aoVar, apVar);
                    if (!this.fyc.b(a(aoVar, apVar2), a, this)) {
                        return false;
                    }
                    a = b(aoVar, apVar);
                    w b = b(aoVar, apVar2);
                    if (!(apVar.bPD() == Variance.OUT_VARIANCE || this.fyc.b(a, b, this))) {
                        return false;
                    }
                } else if (!this.fyc.a(apVar2.bpT(), apVar.bpT(), this)) {
                    return false;
                }
            }
            i++;
        }
    }

    private boolean a(ap apVar, ap apVar2, ao aoVar) {
        if (apVar == null) {
            $$$reportNull$$$0(19);
        }
        if (apVar2 == null) {
            $$$reportNull$$$0(20);
        }
        if (aoVar == null) {
            $$$reportNull$$$0(21);
        }
        if (aoVar.bta() == Variance.INVARIANT && apVar.bPD() != Variance.INVARIANT && apVar2.bPD() == Variance.INVARIANT) {
            return this.fyc.a(apVar2.bpT(), apVar);
        }
        return false;
    }
}

package kotlin.reflect.jvm.internal.impl.types;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.j;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.k;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d;
import kotlin.reflect.jvm.internal.impl.types.b.a;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.b;
import kotlin.reflect.jvm.internal.impl.utils.c;

public class TypeSubstitutor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final TypeSubstitutor fxB = e(as.fxz);
    private final as feZ;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] fxC = new int[VarianceConflictType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.values();
            r0 = r0.length;
            r0 = new int[r0];
            fxC = r0;
            r0 = fxC;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.OUT_IN_IN_POSITION;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fxC;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.IN_IN_OUT_POSITION;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = fxC;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.NO_CONFLICT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$AnonymousClass2.<clinit>():void");
        }
    }

    private static final class SubstitutionException extends Exception {
        public SubstitutionException(String str) {
            super(str);
        }
    }

    private enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0121  */
    private static /* synthetic */ void $$$reportNull$$$0(int r17) {
        /*
        r0 = r17;
        r1 = 37;
        r2 = 36;
        r3 = 33;
        r4 = 32;
        r5 = 10;
        r6 = 8;
        r7 = 6;
        r8 = 4;
        r9 = 1;
        if (r0 == r9) goto L_0x002f;
    L_0x0013:
        if (r0 == r8) goto L_0x002f;
    L_0x0015:
        if (r0 == r7) goto L_0x002f;
    L_0x0017:
        if (r0 == r6) goto L_0x002f;
    L_0x0019:
        if (r0 == r5) goto L_0x002f;
    L_0x001b:
        if (r0 == r4) goto L_0x002f;
    L_0x001d:
        if (r0 == r3) goto L_0x002f;
    L_0x001f:
        if (r0 == r2) goto L_0x002f;
    L_0x0021:
        if (r0 == r1) goto L_0x002f;
    L_0x0023:
        switch(r0) {
            case 13: goto L_0x002f;
            case 14: goto L_0x002f;
            case 15: goto L_0x002f;
            default: goto L_0x0026;
        };
    L_0x0026:
        switch(r0) {
            case 21: goto L_0x002f;
            case 22: goto L_0x002f;
            case 23: goto L_0x002f;
            case 24: goto L_0x002f;
            case 25: goto L_0x002f;
            case 26: goto L_0x002f;
            case 27: goto L_0x002f;
            case 28: goto L_0x002f;
            case 29: goto L_0x002f;
            case 30: goto L_0x002f;
            default: goto L_0x0029;
        };
    L_0x0029:
        switch(r0) {
            case 40: goto L_0x002f;
            case 41: goto L_0x002f;
            case 42: goto L_0x002f;
            default: goto L_0x002c;
        };
    L_0x002c:
        r10 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        goto L_0x0031;
    L_0x002f:
        r10 = "@NotNull method %s.%s must not return null";
    L_0x0031:
        r11 = 2;
        if (r0 == r9) goto L_0x004f;
    L_0x0034:
        if (r0 == r8) goto L_0x004f;
    L_0x0036:
        if (r0 == r7) goto L_0x004f;
    L_0x0038:
        if (r0 == r6) goto L_0x004f;
    L_0x003a:
        if (r0 == r5) goto L_0x004f;
    L_0x003c:
        if (r0 == r4) goto L_0x004f;
    L_0x003e:
        if (r0 == r3) goto L_0x004f;
    L_0x0040:
        if (r0 == r2) goto L_0x004f;
    L_0x0042:
        if (r0 == r1) goto L_0x004f;
    L_0x0044:
        switch(r0) {
            case 13: goto L_0x004f;
            case 14: goto L_0x004f;
            case 15: goto L_0x004f;
            default: goto L_0x0047;
        };
    L_0x0047:
        switch(r0) {
            case 21: goto L_0x004f;
            case 22: goto L_0x004f;
            case 23: goto L_0x004f;
            case 24: goto L_0x004f;
            case 25: goto L_0x004f;
            case 26: goto L_0x004f;
            case 27: goto L_0x004f;
            case 28: goto L_0x004f;
            case 29: goto L_0x004f;
            case 30: goto L_0x004f;
            default: goto L_0x004a;
        };
    L_0x004a:
        switch(r0) {
            case 40: goto L_0x004f;
            case 41: goto L_0x004f;
            case 42: goto L_0x004f;
            default: goto L_0x004d;
        };
    L_0x004d:
        r12 = 3;
        goto L_0x0050;
    L_0x004f:
        r12 = 2;
    L_0x0050:
        r12 = new java.lang.Object[r12];
        r13 = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
        r14 = 0;
        switch(r0) {
            case 1: goto L_0x0099;
            case 2: goto L_0x0094;
            case 3: goto L_0x008f;
            case 4: goto L_0x0099;
            case 5: goto L_0x0089;
            case 6: goto L_0x0099;
            case 7: goto L_0x0084;
            case 8: goto L_0x0099;
            case 9: goto L_0x0058;
            case 10: goto L_0x0099;
            case 11: goto L_0x007e;
            case 12: goto L_0x0079;
            case 13: goto L_0x0099;
            case 14: goto L_0x0099;
            case 15: goto L_0x0099;
            case 16: goto L_0x007e;
            case 17: goto L_0x0079;
            case 18: goto L_0x0073;
            case 19: goto L_0x0073;
            case 20: goto L_0x006e;
            case 21: goto L_0x0099;
            case 22: goto L_0x0099;
            case 23: goto L_0x0099;
            case 24: goto L_0x0099;
            case 25: goto L_0x0099;
            case 26: goto L_0x0099;
            case 27: goto L_0x0099;
            case 28: goto L_0x0099;
            case 29: goto L_0x0099;
            case 30: goto L_0x0099;
            case 31: goto L_0x0069;
            case 32: goto L_0x0099;
            case 33: goto L_0x0099;
            case 34: goto L_0x0063;
            case 35: goto L_0x0073;
            case 36: goto L_0x0099;
            case 37: goto L_0x0099;
            case 38: goto L_0x0063;
            case 39: goto L_0x005e;
            case 40: goto L_0x0099;
            case 41: goto L_0x0099;
            case 42: goto L_0x0099;
            default: goto L_0x0058;
        };
    L_0x0058:
        r15 = "substitution";
        r12[r14] = r15;
        goto L_0x009b;
    L_0x005e:
        r15 = "projectionKind";
        r12[r14] = r15;
        goto L_0x009b;
    L_0x0063:
        r15 = "typeParameterVariance";
        r12[r14] = r15;
        goto L_0x009b;
    L_0x0069:
        r15 = "annotations";
        r12[r14] = r15;
        goto L_0x009b;
    L_0x006e:
        r15 = "originalProjection";
        r12[r14] = r15;
        goto L_0x009b;
    L_0x0073:
        r15 = "typeProjection";
        r12[r14] = r15;
        goto L_0x009b;
    L_0x0079:
        r15 = "howThisTypeIsUsed";
        r12[r14] = r15;
        goto L_0x009b;
    L_0x007e:
        r15 = "type";
        r12[r14] = r15;
        goto L_0x009b;
    L_0x0084:
        r15 = "context";
        r12[r14] = r15;
        goto L_0x009b;
    L_0x0089:
        r15 = "substitutionContext";
        r12[r14] = r15;
        goto L_0x009b;
    L_0x008f:
        r15 = "second";
        r12[r14] = r15;
        goto L_0x009b;
    L_0x0094:
        r15 = "first";
        r12[r14] = r15;
        goto L_0x009b;
    L_0x0099:
        r12[r14] = r13;
    L_0x009b:
        r14 = "safeSubstitute";
        r15 = "createChainedSubstitutor";
        r16 = "create";
        if (r0 == r9) goto L_0x00da;
    L_0x00a3:
        if (r0 == r8) goto L_0x00d7;
    L_0x00a5:
        if (r0 == r7) goto L_0x00da;
    L_0x00a7:
        if (r0 == r6) goto L_0x00da;
    L_0x00a9:
        if (r0 == r5) goto L_0x00d2;
    L_0x00ab:
        if (r0 == r4) goto L_0x00cd;
    L_0x00ad:
        if (r0 == r3) goto L_0x00cd;
    L_0x00af:
        if (r0 == r2) goto L_0x00c8;
    L_0x00b1:
        if (r0 == r1) goto L_0x00c8;
    L_0x00b3:
        switch(r0) {
            case 13: goto L_0x00c5;
            case 14: goto L_0x00c5;
            case 15: goto L_0x00c5;
            default: goto L_0x00b6;
        };
    L_0x00b6:
        switch(r0) {
            case 21: goto L_0x00bf;
            case 22: goto L_0x00bf;
            case 23: goto L_0x00bf;
            case 24: goto L_0x00bf;
            case 25: goto L_0x00bf;
            case 26: goto L_0x00bf;
            case 27: goto L_0x00bf;
            case 28: goto L_0x00bf;
            case 29: goto L_0x00bf;
            case 30: goto L_0x00bf;
            default: goto L_0x00b9;
        };
    L_0x00b9:
        switch(r0) {
            case 40: goto L_0x00c8;
            case 41: goto L_0x00c8;
            case 42: goto L_0x00c8;
            default: goto L_0x00bc;
        };
    L_0x00bc:
        r12[r9] = r13;
        goto L_0x00dc;
    L_0x00bf:
        r13 = "unsafeSubstitute";
        r12[r9] = r13;
        goto L_0x00dc;
    L_0x00c5:
        r12[r9] = r14;
        goto L_0x00dc;
    L_0x00c8:
        r13 = "combine";
        r12[r9] = r13;
        goto L_0x00dc;
    L_0x00cd:
        r13 = "filterOutUnsafeVariance";
        r12[r9] = r13;
        goto L_0x00dc;
    L_0x00d2:
        r13 = "getSubstitution";
        r12[r9] = r13;
        goto L_0x00dc;
    L_0x00d7:
        r12[r9] = r15;
        goto L_0x00dc;
    L_0x00da:
        r12[r9] = r16;
    L_0x00dc:
        switch(r0) {
            case 1: goto L_0x0108;
            case 2: goto L_0x0106;
            case 3: goto L_0x0106;
            case 4: goto L_0x0108;
            case 5: goto L_0x00df;
            case 6: goto L_0x0108;
            case 7: goto L_0x00df;
            case 8: goto L_0x0108;
            case 9: goto L_0x0101;
            case 10: goto L_0x0108;
            case 11: goto L_0x00fe;
            case 12: goto L_0x00fe;
            case 13: goto L_0x0108;
            case 14: goto L_0x0108;
            case 15: goto L_0x0108;
            case 16: goto L_0x00f8;
            case 17: goto L_0x00f8;
            case 18: goto L_0x00f8;
            case 19: goto L_0x00f2;
            case 20: goto L_0x00ec;
            case 21: goto L_0x0108;
            case 22: goto L_0x0108;
            case 23: goto L_0x0108;
            case 24: goto L_0x0108;
            case 25: goto L_0x0108;
            case 26: goto L_0x0108;
            case 27: goto L_0x0108;
            case 28: goto L_0x0108;
            case 29: goto L_0x0108;
            case 30: goto L_0x0108;
            case 31: goto L_0x00e7;
            case 32: goto L_0x0108;
            case 33: goto L_0x0108;
            case 34: goto L_0x00e2;
            case 35: goto L_0x00e2;
            case 36: goto L_0x0108;
            case 37: goto L_0x0108;
            case 38: goto L_0x00e2;
            case 39: goto L_0x00e2;
            case 40: goto L_0x0108;
            case 41: goto L_0x0108;
            case 42: goto L_0x0108;
            default: goto L_0x00df;
        };
    L_0x00df:
        r12[r11] = r16;
        goto L_0x0108;
    L_0x00e2:
        r13 = "combine";
        r12[r11] = r13;
        goto L_0x0108;
    L_0x00e7:
        r13 = "filterOutUnsafeVariance";
        r12[r11] = r13;
        goto L_0x0108;
    L_0x00ec:
        r13 = "unsafeSubstitute";
        r12[r11] = r13;
        goto L_0x0108;
    L_0x00f2:
        r13 = "substituteWithoutApproximation";
        r12[r11] = r13;
        goto L_0x0108;
    L_0x00f8:
        r13 = "substitute";
        r12[r11] = r13;
        goto L_0x0108;
    L_0x00fe:
        r12[r11] = r14;
        goto L_0x0108;
    L_0x0101:
        r13 = "<init>";
        r12[r11] = r13;
        goto L_0x0108;
    L_0x0106:
        r12[r11] = r15;
    L_0x0108:
        r10 = java.lang.String.format(r10, r12);
        if (r0 == r9) goto L_0x012d;
    L_0x010e:
        if (r0 == r8) goto L_0x012d;
    L_0x0110:
        if (r0 == r7) goto L_0x012d;
    L_0x0112:
        if (r0 == r6) goto L_0x012d;
    L_0x0114:
        if (r0 == r5) goto L_0x012d;
    L_0x0116:
        if (r0 == r4) goto L_0x012d;
    L_0x0118:
        if (r0 == r3) goto L_0x012d;
    L_0x011a:
        if (r0 == r2) goto L_0x012d;
    L_0x011c:
        if (r0 == r1) goto L_0x012d;
    L_0x011e:
        switch(r0) {
            case 13: goto L_0x012d;
            case 14: goto L_0x012d;
            case 15: goto L_0x012d;
            default: goto L_0x0121;
        };
    L_0x0121:
        switch(r0) {
            case 21: goto L_0x012d;
            case 22: goto L_0x012d;
            case 23: goto L_0x012d;
            case 24: goto L_0x012d;
            case 25: goto L_0x012d;
            case 26: goto L_0x012d;
            case 27: goto L_0x012d;
            case 28: goto L_0x012d;
            case 29: goto L_0x012d;
            case 30: goto L_0x012d;
            default: goto L_0x0124;
        };
    L_0x0124:
        switch(r0) {
            case 40: goto L_0x012d;
            case 41: goto L_0x012d;
            case 42: goto L_0x012d;
            default: goto L_0x0127;
        };
    L_0x0127:
        r0 = new java.lang.IllegalArgumentException;
        r0.<init>(r10);
        goto L_0x0132;
    L_0x012d:
        r0 = new java.lang.IllegalStateException;
        r0.<init>(r10);
    L_0x0132:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.$$$reportNull$$$0(int):void");
    }

    public static TypeSubstitutor e(as asVar) {
        if (asVar == null) {
            $$$reportNull$$$0(0);
        }
        return new TypeSubstitutor(asVar);
    }

    public static TypeSubstitutor b(as asVar, as asVar2) {
        if (asVar == null) {
            $$$reportNull$$$0(2);
        }
        if (asVar2 == null) {
            $$$reportNull$$$0(3);
        }
        TypeSubstitutor e = e(l.a(asVar, asVar2));
        if (e == null) {
            $$$reportNull$$$0(4);
        }
        return e;
    }

    public static TypeSubstitutor aV(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(7);
        }
        TypeSubstitutor e = e(ao.b(wVar.bMZ(), wVar.btD()));
        if (e == null) {
            $$$reportNull$$$0(8);
        }
        return e;
    }

    protected TypeSubstitutor(as asVar) {
        if (asVar == null) {
            $$$reportNull$$$0(9);
        }
        this.feZ = asVar;
    }

    public boolean isEmpty() {
        return this.feZ.isEmpty();
    }

    public as bPG() {
        as asVar = this.feZ;
        if (asVar == null) {
            $$$reportNull$$$0(10);
        }
        return asVar;
    }

    public w b(w wVar, Variance variance) {
        if (wVar == null) {
            $$$reportNull$$$0(11);
        }
        if (variance == null) {
            $$$reportNull$$$0(12);
        }
        if (isEmpty()) {
            if (wVar == null) {
                $$$reportNull$$$0(13);
            }
            return wVar;
        }
        try {
            wVar = a(new ar(variance, wVar), 0).bpT();
            if (wVar == null) {
                $$$reportNull$$$0(14);
            }
            return wVar;
        } catch (SubstitutionException e) {
            ad mK = p.mK(e.getMessage());
            if (mK == null) {
                $$$reportNull$$$0(15);
            }
            return mK;
        }
    }

    public w c(w wVar, Variance variance) {
        if (wVar == null) {
            $$$reportNull$$$0(16);
        }
        if (variance == null) {
            $$$reportNull$$$0(17);
        }
        ap d = d(new ar(variance, bPG().a(wVar, variance)));
        if (d == null) {
            return null;
        }
        return d.bpT();
    }

    public ap d(ap apVar) {
        if (apVar == null) {
            $$$reportNull$$$0(18);
        }
        apVar = e(apVar);
        if (this.feZ.bPm() || this.feZ.bNd()) {
            return b.a(apVar, this.feZ.bNd());
        }
        return apVar;
    }

    public ap e(ap apVar) {
        if (apVar == null) {
            $$$reportNull$$$0(19);
        }
        if (isEmpty()) {
            return apVar;
        }
        try {
            return a(apVar, 0);
        } catch (SubstitutionException unused) {
            return null;
        }
    }

    private ap a(ap apVar, int i) {
        if (apVar == null) {
            $$$reportNull$$$0(20);
        }
        a(i, apVar, this.feZ);
        if (apVar.bPC()) {
            if (apVar == null) {
                $$$reportNull$$$0(21);
            }
            return apVar;
        }
        w bpT = apVar.bpT();
        ap a;
        if (bpT instanceof av) {
            av avVar = (av) bpT;
            ay bPv = avVar.bPv();
            bpT = avVar.bPw();
            a = a(new ar(apVar.bPD(), bPv), i + 1);
            return new ar(a.bPD(), aw.b(a.bpT().bPA(), c(bpT, apVar.bPD())));
        } else if (n.aC(bpT) || (bpT.bPA() instanceof ac)) {
            if (apVar == null) {
                $$$reportNull$$$0(23);
            }
            return apVar;
        } else {
            ap Y = this.feZ.Y(bpT);
            Variance bPD = apVar.bPD();
            if (Y == null && t.aE(bpT) && !am.aO(bpT)) {
                q aF = t.aF(bpT);
                i++;
                Y = a(new ar(bPD, aF.bPr()), i);
                a = a(new ar(bPD, aF.bPs()), i);
                Variance bPD2 = Y.bPD();
                if (Y.bpT() != aF.bPr() || a.bpT() != aF.bPs()) {
                    return new ar(bPD2, x.a(at.aU(Y.bpT()), at.aU(a.bpT())));
                }
                if (apVar == null) {
                    $$$reportNull$$$0(24);
                }
                return apVar;
            } else if (g.C(bpT) || y.aJ(bpT)) {
                if (apVar == null) {
                    $$$reportNull$$$0(26);
                }
                return apVar;
            } else if (Y != null) {
                VarianceConflictType b = b(bPD, Y.bPD());
                if (!d.as(bpT)) {
                    i = AnonymousClass2.fxC[b.ordinal()];
                    if (i == 1) {
                        throw new SubstitutionException("Out-projection in in-position");
                    } else if (i == 2) {
                        return new ar(Variance.OUT_VARIANCE, bpT.bMZ().btw().bqN());
                    }
                }
                f aP = am.aP(bpT);
                if (Y.bPC()) {
                    if (Y == null) {
                        $$$reportNull$$$0(28);
                    }
                    return Y;
                }
                w ab;
                if (aP != null) {
                    ab = aP.ab(Y.bpT());
                } else {
                    ab = au.c(Y.bpT(), bpT.boc());
                }
                if (!bpT.brE().isEmpty()) {
                    f p = p(this.feZ.m(bpT.brE()));
                    ab = a.a(ab, new j(ab.brE(), p));
                }
                if (b == VarianceConflictType.NO_CONFLICT) {
                    bPD = a(bPD, Y.bPD());
                }
                return new ar(bPD, ab);
            } else {
                apVar = b(apVar, i);
                if (apVar == null) {
                    $$$reportNull$$$0(30);
                }
                return apVar;
            }
        }
    }

    private static f p(f fVar) {
        if (fVar == null) {
            $$$reportNull$$$0(31);
        }
        if (fVar.j(g.eZA.fam)) {
            return new k(fVar, new kotlin.jvm.a.b<kotlin.reflect.jvm.internal.impl.name.b, Boolean>() {
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{ConditionalUserProperty.NAME, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"}));
                }

                /* renamed from: u */
                public Boolean invoke(kotlin.reflect.jvm.internal.impl.name.b bVar) {
                    if (bVar == null) {
                        AnonymousClass1.$$$reportNull$$$0(0);
                    }
                    return Boolean.valueOf(bVar.equals(g.eZA.fam) ^ 1);
                }
            });
        }
        if (fVar == null) {
            $$$reportNull$$$0(32);
        }
        return fVar;
    }

    private ap b(ap apVar, int i) {
        w bpT = apVar.bpT();
        Variance bPD = apVar.bPD();
        if (bpT.bMZ().brQ() instanceof ao) {
            return apVar;
        }
        w wVar = null;
        ad aL = ag.aL(bpT);
        if (aL != null) {
            wVar = c(aL, Variance.INVARIANT);
        }
        w a = at.a(bpT, a(bpT.bMZ().getParameters(), bpT.btD(), i), this.feZ.m(bpT.brE()));
        if ((a instanceof ad) && (wVar instanceof ad)) {
            a = ag.b((ad) a, (ad) wVar);
        }
        return new ar(bPD, a);
    }

    private List<ap> a(List<ao> list, List<ap> list2, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        Object obj = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ao aoVar = (ao) list.get(i2);
            ap apVar = (ap) list2.get(i2);
            ap a = a(apVar, i + 1);
            int i3 = AnonymousClass2.fxC[b(aoVar.bta(), a.bPD()).ordinal()];
            if (i3 == 1 || i3 == 2) {
                a = au.d(aoVar);
            } else if (!(i3 != 3 || aoVar.bta() == Variance.INVARIANT || a.bPC())) {
                a = new ar(Variance.INVARIANT, a.bpT());
            }
            if (a != apVar) {
                obj = 1;
            }
            arrayList.add(a);
        }
        return obj == null ? list2 : arrayList;
    }

    public static Variance a(Variance variance, ap apVar) {
        if (variance == null) {
            $$$reportNull$$$0(34);
        }
        if (apVar == null) {
            $$$reportNull$$$0(35);
        }
        if (apVar.bPC()) {
            variance = Variance.OUT_VARIANCE;
            if (variance == null) {
                $$$reportNull$$$0(36);
            }
            return variance;
        }
        variance = a(variance, apVar.bPD());
        if (variance == null) {
            $$$reportNull$$$0(37);
        }
        return variance;
    }

    public static Variance a(Variance variance, Variance variance2) {
        if (variance == null) {
            $$$reportNull$$$0(38);
        }
        if (variance2 == null) {
            $$$reportNull$$$0(39);
        }
        if (variance == Variance.INVARIANT) {
            if (variance2 == null) {
                $$$reportNull$$$0(40);
            }
            return variance2;
        } else if (variance2 == Variance.INVARIANT) {
            if (variance == null) {
                $$$reportNull$$$0(41);
            }
            return variance;
        } else if (variance == variance2) {
            if (variance2 == null) {
                $$$reportNull$$$0(42);
            }
            return variance2;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Variance conflict: type parameter variance '");
            stringBuilder.append(variance);
            stringBuilder.append("' and ");
            stringBuilder.append("projection kind '");
            stringBuilder.append(variance2);
            stringBuilder.append("' cannot be combined");
            throw new AssertionError(stringBuilder.toString());
        }
    }

    private static VarianceConflictType b(Variance variance, Variance variance2) {
        if (variance == Variance.IN_VARIANCE && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        if (variance == Variance.OUT_VARIANCE && variance2 == Variance.IN_VARIANCE) {
            return VarianceConflictType.IN_IN_OUT_POSITION;
        }
        return VarianceConflictType.NO_CONFLICT;
    }

    private static void a(int i, ap apVar, as asVar) {
        if (i > 100) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Recursion too deep. Most likely infinite loop while substituting ");
            stringBuilder.append(dV(apVar));
            stringBuilder.append("; substitution: ");
            stringBuilder.append(dV(asVar));
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private static String dV(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (c.aq(th)) {
                RuntimeException runtimeException = (RuntimeException) th;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[Exception while computing toString(): ");
                stringBuilder.append(th);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        }
    }
}

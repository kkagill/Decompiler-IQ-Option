package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.ao;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.b;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: utils.kt */
public final class p {
    public static final w a(w wVar, w wVar2, o oVar) {
        i.f(wVar, "subtype");
        i.f(wVar2, "supertype");
        i.f(oVar, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new m(wVar, null));
        an bMZ = wVar2.bMZ();
        while (!arrayDeque.isEmpty()) {
            m mVar = (m) arrayDeque.poll();
            w bpT = mVar.bpT();
            an bMZ2 = bpT.bMZ();
            w bpT2;
            if (oVar.c(bMZ2, bMZ)) {
                boolean boc = bpT.boc();
                for (mVar = mVar.bPK(); mVar != null; mVar = mVar.bPK()) {
                    Object obj;
                    bpT2 = mVar.bpT();
                    Iterable<ap> btD = bpT2.btD();
                    if (!((btD instanceof Collection) && ((Collection) btD).isEmpty())) {
                        for (ap bPD : btD) {
                            Object obj2;
                            if (bPD.bPD() != Variance.INVARIANT) {
                                obj2 = 1;
                                continue;
                            } else {
                                obj2 = null;
                                continue;
                            }
                            if (obj2 != null) {
                                obj = 1;
                                break;
                            }
                        }
                    }
                    obj = null;
                    String str = "TypeConstructorSubstitut…uted, Variance.INVARIANT)";
                    if (obj != null) {
                        bpT = d.a(ao.fxv.aS(bpT2), false, 1, null).bPF().b(bpT, Variance.INVARIANT);
                        i.e(bpT, str);
                        bpT = bn(bpT);
                    } else {
                        bpT = ao.fxv.aS(bpT2).bPF().b(bpT, Variance.INVARIANT);
                        i.e(bpT, str);
                    }
                    boc = boc || bpT2.boc();
                }
                an bMZ3 = bpT.bMZ();
                if (oVar.c(bMZ3, bMZ)) {
                    return au.b(bpT, boc);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Type constructors should be equals!\n");
                stringBuilder.append("substitutedSuperType: ");
                stringBuilder.append(e(bMZ3));
                stringBuilder.append(", \n\n");
                stringBuilder.append("supertype: ");
                stringBuilder.append(e(bMZ));
                stringBuilder.append(" \n");
                stringBuilder.append(oVar.c(bMZ3, bMZ));
                throw new AssertionError(stringBuilder.toString());
            }
            for (w bpT22 : bMZ2.bup()) {
                i.e(bpT22, "immediateSupertype");
                arrayDeque.add(new m(bpT22, mVar));
            }
        }
        return null;
    }

    private static final w bn(w wVar) {
        return (w) b.br(wVar).bPP();
    }

    private static final String e(an anVar) {
        StringBuilder stringBuilder = new StringBuilder();
        UtilsKt$debugInfo$1$1 utilsKt$debugInfo$1$1 = new UtilsKt$debugInfo$1$1(stringBuilder);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("type: ");
        stringBuilder2.append(anVar);
        utilsKt$debugInfo$1$1.invoke(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("hashCode: ");
        stringBuilder2.append(anVar.hashCode());
        utilsKt$debugInfo$1$1.invoke(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        String str = "javaClass: ";
        stringBuilder2.append(str);
        stringBuilder2.append(anVar.getClass().getCanonicalName());
        utilsKt$debugInfo$1$1.invoke(stringBuilder2.toString());
        for (k brQ = anVar.brQ(); brQ != null; brQ = brQ.brj()) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("fqName: ");
            stringBuilder2.append(kotlin.reflect.jvm.internal.impl.renderer.b.frn.s(brQ));
            utilsKt$debugInfo$1$1.invoke(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(brQ.getClass().getCanonicalName());
            utilsKt$debugInfo$1$1.invoke(stringBuilder2.toString());
        }
        String stringBuilder3 = stringBuilder.toString();
        i.e(stringBuilder3, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder3;
    }
}

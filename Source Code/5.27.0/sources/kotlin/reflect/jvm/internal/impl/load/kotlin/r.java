package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.kotlin.i.b;
import kotlin.reflect.jvm.internal.impl.load.kotlin.i.c;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: methodSignatureMapping.kt */
public final class r {
    public static final String a(s sVar, boolean z, boolean z2) {
        i.f(sVar, "$this$computeJvmDescriptor");
        StringBuilder stringBuilder = new StringBuilder();
        if (z2) {
            String str;
            if (sVar instanceof j) {
                str = "<init>";
            } else {
                str = sVar.bsZ().boi();
                i.e(str, "name.asString()");
            }
            stringBuilder.append(str);
        }
        stringBuilder.append("(");
        for (ar arVar : sVar.bsP()) {
            i.e(arVar, "parameter");
            w bpT = arVar.bpT();
            i.e(bpT, "parameter.type");
            a(stringBuilder, bpT);
        }
        stringBuilder.append(")");
        if (z) {
            if (z.e(sVar)) {
                stringBuilder.append("V");
            } else {
                w bsN = sVar.bsN();
                if (bsN == null) {
                    i.bnJ();
                }
                i.e(bsN, "returnType!!");
                a(stringBuilder, bsN);
            }
        }
        String stringBuilder2 = stringBuilder.toString();
        i.e(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }

    public static /* synthetic */ String a(s sVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return a(sVar, z, z2);
    }

    public static final boolean c(a aVar) {
        i.f(aVar, "f");
        boolean z = false;
        if (!(aVar instanceof s)) {
            return false;
        }
        s sVar = (s) aVar;
        if (sVar.bsP().size() == 1 && !kotlin.reflect.jvm.internal.impl.load.java.r.v((CallableMemberDescriptor) aVar) && (i.y(sVar.bsZ().boi(), ProductAction.ACTION_REMOVE) ^ 1) == 0) {
            s bti = sVar.bti();
            i.e(bti, "f.original");
            List bsP = bti.bsP();
            i.e(bsP, "f.original.valueParameters");
            Object bY = u.bY(bsP);
            i.e(bY, "f.original.valueParameters.single()");
            w bpT = ((ar) bY).bpT();
            i.e(bpT, "f.original.valueParameters.single().type");
            i af = af(bpT);
            JvmPrimitiveType jvmPrimitiveType = null;
            if (!(af instanceof c)) {
                af = null;
            }
            c cVar = (c) af;
            if (cVar != null) {
                jvmPrimitiveType = cVar.byF();
            }
            if (jvmPrimitiveType != JvmPrimitiveType.INT) {
                return false;
            }
            bti = BuiltinMethodsWithSpecialGenericSignature.h(sVar);
            if (bti != null) {
                sVar = bti.bti();
                i.e(sVar, "overridden.original");
                List bsP2 = sVar.bsP();
                i.e(bsP2, "overridden.original.valueParameters");
                Object bY2 = u.bY(bsP2);
                i.e(bY2, "overridden.original.valueParameters.single()");
                w bpT2 = ((ar) bY2).bpT();
                i.e(bpT2, "overridden.original.valueParameters.single().type");
                i af2 = af(bpT2);
                k brj = bti.brj();
                i.e(brj, "overridden.containingDeclaration");
                if (i.y(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.z(brj), g.eZA.fay.bKa()) && (af2 instanceof b) && i.y(((b) af2).byE(), "java/lang/Object")) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static final String C(d dVar) {
        i.f(dVar, "$this$internalName");
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.fca;
        kotlin.reflect.jvm.internal.impl.name.c bKa = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x(dVar).bKa();
        i.e(bKa, "fqNameSafe.toUnsafe()");
        kotlin.reflect.jvm.internal.impl.name.a c = cVar.c(bKa);
        if (c == null) {
            return z.a(dVar, null, false, 2, null);
        }
        kotlin.reflect.jvm.internal.impl.resolve.jvm.c l = kotlin.reflect.jvm.internal.impl.resolve.jvm.c.l(c);
        i.e(l, "JvmClassName.byClassId(it)");
        String byE = l.byE();
        i.e(byE, "JvmClassName.byClassId(it).internalName");
        return byE;
    }

    private static final void a(StringBuilder stringBuilder, w wVar) {
        stringBuilder.append(af(wVar));
    }

    public static final i af(w wVar) {
        i.f(wVar, "$this$mapToJvmType");
        return (i) z.a(wVar, k.fmb, x.fms, w.fmh, null, null, false, 32, null);
    }

    public static final String d(a aVar) {
        i.f(aVar, "$this$computeJvmSignature");
        u uVar = u.fmf;
        if (kotlin.reflect.jvm.internal.impl.resolve.c.u(aVar)) {
            return null;
        }
        k brj = aVar.brj();
        if (!(brj instanceof d)) {
            brj = null;
        }
        d dVar = (d) brj;
        if (dVar != null) {
            f bsZ = dVar.bsZ();
            i.e(bsZ, "classDescriptor.name");
            if (bsZ.bKh()) {
                return null;
            }
            aVar = aVar.bsO();
            if (!(aVar instanceof ai)) {
                aVar = null;
            }
            ai aiVar = (ai) aVar;
            if (aiVar != null) {
                return uVar.a(dVar, a(aiVar, false, false, 3, null));
            }
        }
        return null;
    }
}

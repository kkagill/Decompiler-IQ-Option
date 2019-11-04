package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ad;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.c;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure;

/* compiled from: specialBuiltinMembers.kt */
public final class r {
    private static final b b(b bVar, String str) {
        bVar = bVar.C(f.ms(str));
        i.e(bVar, "child(Name.identifier(name))");
        return bVar;
    }

    private static final b b(c cVar, String str) {
        b bKf = cVar.F(f.ms(str)).bKf();
        i.e(bKf, "child(Name.identifier(name)).toSafe()");
        return bKf;
    }

    private static final p j(String str, String str2, String str3, String str4) {
        f ms = f.ms(str2);
        i.e(ms, "Name.identifier(name)");
        u uVar = u.fmf;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append('(');
        stringBuilder.append(str3);
        stringBuilder.append(')');
        stringBuilder.append(str4);
        return new p(ms, uVar.bf(str, stringBuilder.toString()));
    }

    public static final <T extends CallableMemberDescriptor> T p(T t) {
        i.f(t, "$this$getOverriddenBuiltinWithDifferentJvmName");
        T t2 = null;
        if (!b.fgH.bvv().contains(t.bsZ()) && !c.fgW.bvw().contains(a.F(t).bsZ())) {
            return null;
        }
        if ((t instanceof ae) || (t instanceof ad)) {
            t2 = a.a(t, false, SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1.fhK, 1, null);
        } else if (t instanceof ai) {
            t2 = a.a(t, false, SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2.fhL, 1, null);
        }
        return t2;
    }

    public static final boolean q(CallableMemberDescriptor callableMemberDescriptor) {
        i.f(callableMemberDescriptor, "$this$doesOverrideBuiltinWithDifferentJvmName");
        return p(callableMemberDescriptor) != null;
    }

    public static final <T extends CallableMemberDescriptor> T r(T t) {
        i.f(t, "$this$getOverriddenSpecialBuiltin");
        CallableMemberDescriptor p = p(t);
        if (p != null) {
            return p;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.fgP;
        f bsZ = t.bsZ();
        i.e(bsZ, ConditionalUserProperty.NAME);
        if (builtinMethodsWithSpecialGenericSignature.m(bsZ)) {
            return a.a(t, false, SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2.fhM, 1, null);
        }
        return null;
    }

    public static final String s(CallableMemberDescriptor callableMemberDescriptor) {
        i.f(callableMemberDescriptor, "callableMemberDescriptor");
        callableMemberDescriptor = t(callableMemberDescriptor);
        if (callableMemberDescriptor == null) {
            return null;
        }
        callableMemberDescriptor = a.F(callableMemberDescriptor);
        if (callableMemberDescriptor == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof ae) {
            return c.fgW.n(callableMemberDescriptor);
        }
        if (!(callableMemberDescriptor instanceof ai)) {
            return null;
        }
        f a = b.fgH.a((ai) callableMemberDescriptor);
        if (a != null) {
            return a.boi();
        }
        return null;
    }

    private static final CallableMemberDescriptor t(CallableMemberDescriptor callableMemberDescriptor) {
        return g.c((k) callableMemberDescriptor) ? p(callableMemberDescriptor) : null;
    }

    public static final boolean a(d dVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        i.f(dVar, "$this$hasRealKotlinSuperClassWithOverrideOf");
        i.f(aVar, "specialCallableDescriptor");
        k brj = aVar.brj();
        if (brj != null) {
            kotlin.reflect.jvm.internal.impl.types.ad bsY = ((d) brj).bsY();
            i.e(bsY, "(specialCallableDescript…ssDescriptor).defaultType");
            dVar = kotlin.reflect.jvm.internal.impl.resolve.c.I(dVar);
            while (true) {
                boolean z = false;
                if (dVar == null) {
                    return false;
                }
                if (!(dVar instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.d)) {
                    if (TypeCheckingProcedure.f(dVar.bsY(), bsY) != null) {
                        z = true;
                    }
                    if (z) {
                        return g.c((k) dVar) ^ 1;
                    }
                }
                dVar = kotlin.reflect.jvm.internal.impl.resolve.c.I(dVar);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
    }

    public static final boolean u(CallableMemberDescriptor callableMemberDescriptor) {
        i.f(callableMemberDescriptor, "$this$isFromJava");
        return a.F(callableMemberDescriptor).brj() instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.d;
    }

    public static final boolean v(CallableMemberDescriptor callableMemberDescriptor) {
        i.f(callableMemberDescriptor, "$this$isFromJavaOrBuiltins");
        return u(callableMemberDescriptor) || g.c((k) callableMemberDescriptor);
    }
}

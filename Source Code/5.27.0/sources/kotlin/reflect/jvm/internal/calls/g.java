package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import kotlin.i;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.at;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.types.w;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a6\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u000b*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\f\u0010\u0012\u001a\u00020\r*\u00020\u0002H\u0002\u001a\u0014\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u0004\u0018\u00010\u0014H\u0000\u001a\u0012\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u00020\u0001H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0015"}, bng = {"expectedReceiverType", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "coerceToExpectedReceiverType", "", "descriptor", "createInlineClassAwareCallerIfNeeded", "Lkotlin/reflect/jvm/internal/calls/Caller;", "M", "Ljava/lang/reflect/Member;", "isDefault", "", "getBoxMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "getUnboxMethod", "hasInlineClassReceiver", "toInlineClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "kotlin-reflect-api"})
/* compiled from: InlineClassAwareCaller.kt */
public final class g {
    public static /* synthetic */ c a(c cVar, CallableMemberDescriptor callableMemberDescriptor, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(cVar, callableMemberDescriptor, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Missing block: B:17:0x0060, code skipped:
            if (kotlin.reflect.jvm.internal.impl.resolve.d.ap(r0) == true) goto L_0x006c;
     */
    /* JADX WARNING: Missing block: B:21:0x006a, code skipped:
            if (b(r6) != false) goto L_0x006c;
     */
    public static final <M extends java.lang.reflect.Member> kotlin.reflect.jvm.internal.calls.c<M> a(kotlin.reflect.jvm.internal.calls.c<? extends M> r5, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6, boolean r7) {
        /*
        r0 = "$this$createInlineClassAwareCallerIfNeeded";
        kotlin.jvm.internal.i.f(r5, r0);
        r0 = "descriptor";
        kotlin.jvm.internal.i.f(r6, r0);
        r0 = r6;
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r0;
        r0 = kotlin.reflect.jvm.internal.impl.resolve.d.g(r0);
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x006c;
    L_0x0015:
        r0 = r6.bsP();
        r3 = "descriptor.valueParameters";
        kotlin.jvm.internal.i.e(r0, r3);
        r0 = (java.lang.Iterable) r0;
        r3 = r0 instanceof java.util.Collection;
        if (r3 == 0) goto L_0x002f;
    L_0x0024:
        r3 = r0;
        r3 = (java.util.Collection) r3;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x002f;
    L_0x002d:
        r0 = 0;
        goto L_0x0054;
    L_0x002f:
        r0 = r0.iterator();
    L_0x0033:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x002d;
    L_0x0039:
        r3 = r0.next();
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ar) r3;
        r4 = "it";
        kotlin.jvm.internal.i.e(r3, r4);
        r3 = r3.bpT();
        r4 = "it.type";
        kotlin.jvm.internal.i.e(r3, r4);
        r3 = kotlin.reflect.jvm.internal.impl.resolve.d.ap(r3);
        if (r3 == 0) goto L_0x0033;
    L_0x0053:
        r0 = 1;
    L_0x0054:
        if (r0 != 0) goto L_0x006c;
    L_0x0056:
        r0 = r6.bsN();
        if (r0 == 0) goto L_0x0062;
    L_0x005c:
        r0 = kotlin.reflect.jvm.internal.impl.resolve.d.ap(r0);
        if (r0 == r2) goto L_0x006c;
    L_0x0062:
        r0 = r5 instanceof kotlin.reflect.jvm.internal.calls.b;
        if (r0 != 0) goto L_0x006d;
    L_0x0066:
        r0 = b(r6);
        if (r0 == 0) goto L_0x006d;
    L_0x006c:
        r1 = 1;
    L_0x006d:
        if (r1 == 0) goto L_0x0077;
    L_0x006f:
        r0 = new kotlin.reflect.jvm.internal.calls.f;
        r0.<init>(r6, r5, r7);
        r5 = r0;
        r5 = (kotlin.reflect.jvm.internal.calls.c) r5;
    L_0x0077:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.g.a(kotlin.reflect.jvm.internal.calls.c, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, boolean):kotlin.reflect.jvm.internal.calls.c");
    }

    private static final boolean b(CallableMemberDescriptor callableMemberDescriptor) {
        w c = c(callableMemberDescriptor);
        return c != null && d.ap(c);
    }

    public static final Method a(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.i.f(cls, "$this$getUnboxMethod");
        kotlin.jvm.internal.i.f(callableMemberDescriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            kotlin.jvm.internal.i.e(declaredMethod, "getDeclaredMethod(\"unbox…FOR_INLINE_CLASS_MEMBERS)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No unbox method found in inline class: ");
            stringBuilder.append(cls);
            stringBuilder.append(" (calling ");
            stringBuilder.append(callableMemberDescriptor);
            stringBuilder.append(')');
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        }
    }

    public static final Method b(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.i.f(cls, "$this$getBoxMethod");
        kotlin.jvm.internal.i.f(callableMemberDescriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", new Class[]{a((Class) cls, callableMemberDescriptor).getReturnType()});
            kotlin.jvm.internal.i.e(declaredMethod, "getDeclaredMethod(\"box\" …d(descriptor).returnType)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No box method found in inline class: ");
            stringBuilder.append(cls);
            stringBuilder.append(" (calling ");
            stringBuilder.append(callableMemberDescriptor);
            stringBuilder.append(')');
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        }
    }

    public static final Class<?> c(w wVar) {
        kotlin.jvm.internal.i.f(wVar, "$this$toInlineClass");
        return a(wVar.bMZ().brQ());
    }

    public static final Class<?> a(k kVar) {
        if (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) kVar;
            if (dVar.brA()) {
                Class<?> a = ae.a(dVar);
                if (a != null) {
                    return a;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Class object for the class ");
                stringBuilder.append(dVar.bsZ());
                stringBuilder.append(" cannot be found (classId=");
                stringBuilder.append(a.c((f) kVar));
                stringBuilder.append(')');
                throw new KotlinReflectionInternalError(stringBuilder.toString());
            }
        }
        return null;
    }

    private static final w c(CallableMemberDescriptor callableMemberDescriptor) {
        ah bsK = callableMemberDescriptor.bsK();
        ah bsL = callableMemberDescriptor.bsL();
        w wVar = null;
        if (bsK != null) {
            return bsK.bpT();
        }
        if (bsL == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof j) {
            return bsL.bpT();
        }
        k brj = callableMemberDescriptor.brj();
        if (!(brj instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            brj = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) brj;
        if (dVar != null) {
            wVar = dVar.bsY();
        }
        return wVar;
    }

    public static final Object a(Object obj, CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.i.f(callableMemberDescriptor, "descriptor");
        if ((callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ae) && d.a((at) callableMemberDescriptor)) {
            return obj;
        }
        w c = c(callableMemberDescriptor);
        if (c != null) {
            Class c2 = c(c);
            if (c2 != null) {
                Method a = a(c2, callableMemberDescriptor);
                if (a != null) {
                    obj = a.invoke(obj, new Object[0]);
                }
            }
        }
        return obj;
    }
}

package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.c;
import kotlin.reflect.jvm.internal.impl.resolve.constants.t;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: functionTypes.kt */
public final class f {
    public static final boolean d(w wVar) {
        i.f(wVar, "$this$isFunctionType");
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
        return (brQ != null ? b((k) brQ) : null) == Kind.Function;
    }

    public static final boolean e(w wVar) {
        i.f(wVar, "$this$isSuspendFunctionType");
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
        return (brQ != null ? b((k) brQ) : null) == Kind.SuspendFunction;
    }

    public static final boolean f(w wVar) {
        i.f(wVar, "$this$isBuiltinFunctionalType");
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
        Kind b = brQ != null ? b(brQ) : null;
        return b == Kind.Function || b == Kind.SuspendFunction;
    }

    public static final boolean g(w wVar) {
        i.f(wVar, "$this$isBuiltinExtensionFunctionalType");
        return f(wVar) && h(wVar);
    }

    private static final boolean h(w wVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.f brE = wVar.brE();
        b bVar = g.eZA.fad;
        i.e(bVar, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        return brE.i(bVar) != null;
    }

    public static final Kind b(k kVar) {
        i.f(kVar, "$this$getFunctionalClassKind");
        if ((kVar instanceof d) && g.d(kVar)) {
            return a(a.z(kVar));
        }
        return null;
    }

    private static final Kind a(c cVar) {
        if (!cVar.bKe() || cVar.isRoot()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.functions.a.a aVar = kotlin.reflect.jvm.internal.impl.builtins.functions.a.fbA;
        String boi = cVar.bKc().boi();
        i.e(boi, "shortName().asString()");
        b bKb = cVar.bKf().bKb();
        i.e(bKb, "toSafe().parent()");
        return aVar.b(boi, bKb);
    }

    public static final w i(w wVar) {
        i.f(wVar, "$this$getReceiverTypeFromFunctionType");
        boolean f = f(wVar);
        if (!m.eVC || f) {
            return h(wVar) ? ((ap) u.bU(wVar.btD())).bpT() : null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Not a function type: ");
            stringBuilder.append(wVar);
            throw new AssertionError(stringBuilder.toString());
        }
    }

    public static final w j(w wVar) {
        i.f(wVar, "$this$getReturnTypeFromFunctionType");
        boolean f = f(wVar);
        if (!m.eVC || f) {
            wVar = ((ap) u.bW(wVar.btD())).bpT();
            i.e(wVar, "arguments.last().type");
            return wVar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a function type: ");
        stringBuilder.append(wVar);
        throw new AssertionError(stringBuilder.toString());
    }

    public static final List<ap> k(w wVar) {
        i.f(wVar, "$this$getValueParameterTypesFromFunctionType");
        boolean f = f(wVar);
        StringBuilder stringBuilder;
        if (!m.eVC || f) {
            List btD = wVar.btD();
            boolean g = g(wVar);
            int i = 1;
            boolean size = btD.size() - 1;
            if (g > size) {
                i = 0;
            }
            if (!m.eVC || i != 0) {
                return btD.subList(g, size);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Not an exact function type: ");
            stringBuilder.append(wVar);
            throw new AssertionError(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Not a function type: ");
        stringBuilder.append(wVar);
        throw new AssertionError(stringBuilder.toString());
    }

    public static final kotlin.reflect.jvm.internal.impl.name.f l(w wVar) {
        i.f(wVar, "$this$extractParameterNameFromFunctionTypeArgument");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.f brE = wVar.brE();
        b bVar = g.eZA.fae;
        i.e(bVar, "KotlinBuiltIns.FQ_NAMES.parameterName");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c i = brE.i(bVar);
        if (i != null) {
            Object O = u.O(i.buf().values());
            if (!(O instanceof t)) {
                O = null;
            }
            t tVar = (t) O;
            if (tVar != null) {
                String str = (String) tVar.getValue();
                if (str != null) {
                    if (!kotlin.reflect.jvm.internal.impl.name.f.mt(str)) {
                        str = null;
                    }
                    if (str != null) {
                        return kotlin.reflect.jvm.internal.impl.name.f.ms(str);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Missing block: B:19:0x0057, code skipped:
            if (r2.bKh() == false) goto L_0x005b;
     */
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.ap> a(kotlin.reflect.jvm.internal.impl.types.w r10, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.w> r11, java.util.List<kotlin.reflect.jvm.internal.impl.name.f> r12, kotlin.reflect.jvm.internal.impl.types.w r13, kotlin.reflect.jvm.internal.impl.builtins.g r14) {
        /*
        r0 = "parameterTypes";
        kotlin.jvm.internal.i.f(r11, r0);
        r0 = "returnType";
        kotlin.jvm.internal.i.f(r13, r0);
        r0 = "builtIns";
        kotlin.jvm.internal.i.f(r14, r0);
        r0 = new java.util.ArrayList;
        r1 = r11.size();
        r2 = 0;
        r3 = 1;
        if (r10 == 0) goto L_0x001b;
    L_0x0019:
        r4 = 1;
        goto L_0x001c;
    L_0x001b:
        r4 = 0;
    L_0x001c:
        r1 = r1 + r4;
        r1 = r1 + r3;
        r0.<init>(r1);
        r1 = r0;
        r1 = (java.util.Collection) r1;
        r3 = 0;
        if (r10 == 0) goto L_0x002c;
    L_0x0027:
        r10 = kotlin.reflect.jvm.internal.impl.types.b.a.bp(r10);
        goto L_0x002d;
    L_0x002c:
        r10 = r3;
    L_0x002d:
        kotlin.reflect.jvm.internal.impl.utils.a.j(r1, r10);
        r11 = (java.lang.Iterable) r11;
        r10 = r11.iterator();
    L_0x0036:
        r11 = r10.hasNext();
        if (r11 == 0) goto L_0x00a4;
    L_0x003c:
        r11 = r10.next();
        r4 = r2 + 1;
        if (r2 >= 0) goto L_0x0047;
    L_0x0044:
        kotlin.collections.m.bno();
    L_0x0047:
        r11 = (kotlin.reflect.jvm.internal.impl.types.w) r11;
        if (r12 == 0) goto L_0x005a;
    L_0x004b:
        r2 = r12.get(r2);
        r2 = (kotlin.reflect.jvm.internal.impl.name.f) r2;
        if (r2 == 0) goto L_0x005a;
    L_0x0053:
        r5 = r2.bKh();
        if (r5 != 0) goto L_0x005a;
    L_0x0059:
        goto L_0x005b;
    L_0x005a:
        r2 = r3;
    L_0x005b:
        if (r2 == 0) goto L_0x009b;
    L_0x005d:
        r5 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.i;
        r6 = kotlin.reflect.jvm.internal.impl.builtins.g.eZA;
        r6 = r6.fae;
        r7 = "KotlinBuiltIns.FQ_NAMES.parameterName";
        kotlin.jvm.internal.i.e(r6, r7);
        r7 = "name";
        r7 = kotlin.reflect.jvm.internal.impl.name.f.ms(r7);
        r8 = new kotlin.reflect.jvm.internal.impl.resolve.constants.t;
        r2 = r2.boi();
        r9 = "name.asString()";
        kotlin.jvm.internal.i.e(r2, r9);
        r8.<init>(r2);
        r2 = kotlin.j.x(r7, r8);
        r2 = kotlin.collections.ae.m(r2);
        r5.<init>(r14, r6, r2);
        r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA;
        r6 = r11.brE();
        r6 = (java.lang.Iterable) r6;
        r5 = kotlin.collections.u.e(r6, r5);
        r2 = r2.cc(r5);
        r11 = kotlin.reflect.jvm.internal.impl.types.b.a.a(r11, r2);
    L_0x009b:
        r11 = kotlin.reflect.jvm.internal.impl.types.b.a.bp(r11);
        r1.add(r11);
        r2 = r4;
        goto L_0x0036;
    L_0x00a4:
        r10 = kotlin.reflect.jvm.internal.impl.types.b.a.bp(r13);
        r0.add(r10);
        r0 = (java.util.List) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.f.a(kotlin.reflect.jvm.internal.impl.types.w, java.util.List, java.util.List, kotlin.reflect.jvm.internal.impl.types.w, kotlin.reflect.jvm.internal.impl.builtins.g):java.util.List");
    }

    public static /* synthetic */ ad a(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, w wVar, List list, List list2, w wVar2, boolean z, int i, Object obj) {
        return a(gVar, fVar, wVar, list, list2, wVar2, (i & 64) != 0 ? false : z);
    }

    public static final ad a(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, w wVar, List<? extends w> list, List<kotlin.reflect.jvm.internal.impl.name.f> list2, w wVar2, boolean z) {
        i.f(gVar, "builtIns");
        i.f(fVar, "annotations");
        i.f(list, "parameterTypes");
        i.f(wVar2, "returnType");
        List a = a(wVar, list, list2, wVar2, gVar);
        int size = list.size();
        if (wVar != null) {
            size++;
        }
        Object jQ = z ? gVar.jQ(size) : gVar.jP(size);
        i.e(jQ, "if (suspendFunction) bui…tFunction(parameterCount)");
        if (wVar != null) {
            b bVar = g.eZA.fad;
            String str = "KotlinBuiltIns.FQ_NAMES.extensionFunctionType";
            i.e(bVar, str);
            if (fVar.i(bVar) == null) {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA;
                Iterable iterable = fVar;
                b bVar2 = g.eZA.fad;
                i.e(bVar2, str);
                fVar = aVar.cc(u.e(iterable, (Object) new kotlin.reflect.jvm.internal.impl.descriptors.annotations.i(gVar, bVar2, af.emptyMap())));
            }
        }
        return x.a(fVar, jQ, a);
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;

/* compiled from: context.kt */
public final class a {
    public static final h a(h hVar, m mVar) {
        i.f(hVar, "$this$child");
        i.f(mVar, "typeParameterResolver");
        return new h(hVar.bwl(), mVar, hVar.bwn());
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.d a(kotlin.reflect.jvm.internal.impl.load.java.lazy.h r5, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f r6) {
        /*
        r0 = "$this$computeNewDefaultTypeQualifiers";
        kotlin.jvm.internal.i.f(r5, r0);
        r0 = "additionalAnnotations";
        kotlin.jvm.internal.i.f(r6, r0);
        r0 = r5.bwl();
        r0 = r0.bwc();
        r0 = r0.bvp();
        if (r0 == 0) goto L_0x001d;
    L_0x0018:
        r5 = r5.bwj();
        return r5;
    L_0x001d:
        r6 = (java.lang.Iterable) r6;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r6 = r6.iterator();
    L_0x002a:
        r1 = r6.hasNext();
        if (r1 == 0) goto L_0x0040;
    L_0x0030:
        r1 = r6.next();
        r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r1;
        r1 = a(r5, r1);
        if (r1 == 0) goto L_0x002a;
    L_0x003c:
        r0.add(r1);
        goto L_0x002a;
    L_0x0040:
        r0 = (java.util.List) r0;
        r6 = r0.isEmpty();
        if (r6 == 0) goto L_0x004d;
    L_0x0048:
        r5 = r5.bwj();
        return r5;
    L_0x004d:
        r6 = r5.bwj();
        if (r6 == 0) goto L_0x005f;
    L_0x0053:
        r6 = r6.bwh();
        if (r6 == 0) goto L_0x005f;
    L_0x0059:
        r1 = new java.util.EnumMap;
        r1.<init>(r6);
        goto L_0x0066;
    L_0x005f:
        r1 = new java.util.EnumMap;
        r6 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.class;
        r1.<init>(r6);
    L_0x0066:
        r6 = 0;
        r0 = r0.iterator();
    L_0x006b:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0097;
    L_0x0071:
        r2 = r0.next();
        r2 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.k) r2;
        r3 = r2.bwo();
        r2 = r2.bwp();
        r2 = r2.iterator();
    L_0x0083:
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x006b;
    L_0x0089:
        r6 = r2.next();
        r6 = (kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType) r6;
        r4 = r1;
        r4 = (java.util.Map) r4;
        r4.put(r6, r3);
        r6 = 1;
        goto L_0x0083;
    L_0x0097:
        if (r6 != 0) goto L_0x009e;
    L_0x0099:
        r5 = r5.bwj();
        goto L_0x00a3;
    L_0x009e:
        r5 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.d;
        r5.<init>(r1);
    L_0x00a3:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.a.a(kotlin.reflect.jvm.internal.impl.load.java.lazy.h, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f):kotlin.reflect.jvm.internal.impl.load.java.lazy.d");
    }

    private static final k a(h hVar, c cVar) {
        AnnotationTypeQualifierResolver bwc = hVar.bwl().bwc();
        k e = bwc.e(cVar);
        if (e != null) {
            return e;
        }
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.a f = bwc.f(cVar);
        if (f != null) {
            c bvq = f.bvq();
            List btx = f.btx();
            ReportLevel h = bwc.h(cVar);
            if (h == null) {
                h = bwc.g(bvq);
            }
            if (h.isIgnore()) {
                return null;
            }
            f j = hVar.bwl().bwd().j(bvq);
            if (j != null) {
                j = f.a(j, null, h.isWarning(), 1, null);
                if (j != null) {
                    return new k(j, btx);
                }
            }
        }
        return null;
    }

    public static final h a(h hVar, b bVar) {
        i.f(hVar, "$this$replaceComponents");
        i.f(bVar, "components");
        return new h(bVar, hVar.bwm(), hVar.bwn());
    }

    private static final h a(h hVar, k kVar, x xVar, int i, d<d> dVar) {
        m iVar;
        b bwl = hVar.bwl();
        if (xVar != null) {
            iVar = new i(hVar, kVar, xVar, i);
        } else {
            iVar = hVar.bwm();
        }
        return new h(bwl, iVar, dVar);
    }

    public static final h a(h hVar, k kVar, x xVar, int i) {
        i.f(hVar, "$this$childForMethod");
        i.f(kVar, "containingDeclaration");
        i.f(xVar, "typeParameterOwner");
        return a(hVar, kVar, xVar, i, hVar.bwn());
    }

    public static final h a(h hVar, e eVar, x xVar, int i) {
        i.f(hVar, "$this$childForClassOrPackage");
        i.f(eVar, "containingDeclaration");
        return a(hVar, eVar, xVar, i, g.a(LazyThreadSafetyMode.NONE, new ContextKt$childForClassOrPackage$1(hVar, eVar)));
    }

    public static final h b(h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar) {
        i.f(hVar, "$this$copyWithNewDefaultTypeQualifiers");
        i.f(fVar, "additionalAnnotations");
        return fVar.isEmpty() ? hVar : new h(hVar.bwl(), hVar.bwm(), g.a(LazyThreadSafetyMode.NONE, new ContextKt$copyWithNewDefaultTypeQualifiers$1(hVar, fVar)));
    }
}

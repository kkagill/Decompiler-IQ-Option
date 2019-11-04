package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.k;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.j;
import kotlin.reflect.jvm.internal.impl.storage.c;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;
import kotlin.reflect.jvm.internal.impl.utils.e;

/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class AnnotationTypeQualifierResolver {
    private final c<d, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> fgs;
    private final e fgt;
    private final boolean qW = this.fgt.bvp();

    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public enum QualifierApplicabilityType {
        METHOD_RETURN_TYPE,
        VALUE_PARAMETER,
        FIELD,
        TYPE_USE
    }

    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public static final class a {
        private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c fgu;
        private final int fgv;

        public a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, int i) {
            i.f(cVar, "typeQualifier");
            this.fgu = cVar;
            this.fgv = i;
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c bvq() {
            return this.fgu;
        }

        public final List<QualifierApplicabilityType> btx() {
            QualifierApplicabilityType[] values = QualifierApplicabilityType.values();
            Collection arrayList = new ArrayList();
            for (QualifierApplicabilityType qualifierApplicabilityType : values) {
                if (a(qualifierApplicabilityType)) {
                    arrayList.add(qualifierApplicabilityType);
                }
            }
            return (List) arrayList;
        }

        private final boolean a(QualifierApplicabilityType qualifierApplicabilityType) {
            return b(QualifierApplicabilityType.TYPE_USE) || b(qualifierApplicabilityType);
        }

        private final boolean b(QualifierApplicabilityType qualifierApplicabilityType) {
            return ((1 << qualifierApplicabilityType.ordinal()) & this.fgv) != 0;
        }
    }

    public AnnotationTypeQualifierResolver(h hVar, e eVar) {
        i.f(hVar, "storageManager");
        i.f(eVar, "jsr305State");
        this.fgt = eVar;
        this.fgs = hVar.r(new AnnotationTypeQualifierResolver$resolvedNicknames$1(this));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c t(d dVar) {
        if (!dVar.brE().j(a.fgw)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c d;
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c d2 : dVar.brE()) {
            d2 = d(d2);
            if (d2 != null) {
                break;
            }
        }
        d2 = null;
        return d2;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c u(d dVar) {
        if (dVar.brt() != ClassKind.ANNOTATION_CLASS) {
            return null;
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) this.fgs.invoke(dVar);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        i.f(cVar, "annotationDescriptor");
        if (this.fgt.bvp()) {
            return null;
        }
        d m = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.m(cVar);
        if (m == null) {
            return null;
        }
        if (a.x(m)) {
            return cVar;
        }
        return u(m);
    }

    public final k e(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        i.f(cVar, "annotationDescriptor");
        if (this.fgt.bvp()) {
            return null;
        }
        k kVar = (k) a.fgA.get(cVar.btB());
        if (kVar == null) {
            return (k) null;
        }
        f bwo = kVar.bwo();
        Collection bwp = kVar.bwp();
        ReportLevel g = g(cVar);
        if ((g != ReportLevel.IGNORE ? 1 : null) == null) {
            g = null;
        }
        if (g != null) {
            return new k(f.a(bwo, null, g.isWarning(), 1, null), bwp);
        }
        return null;
    }

    public final a f(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        i.f(cVar, "annotationDescriptor");
        if (this.fgt.bvp()) {
            return null;
        }
        d m = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.m(cVar);
        if (m != null) {
            if (!m.brE().j(a.fgy)) {
                m = null;
            }
            if (m != null) {
                d m2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.m(cVar);
                if (m2 == null) {
                    i.bnJ();
                }
                cVar = m2.brE().i(a.fgy);
                if (cVar == null) {
                    i.bnJ();
                }
                Collection arrayList = new ArrayList();
                for (Entry entry : cVar.buf().entrySet()) {
                    List a;
                    kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) entry.getKey();
                    g gVar = (g) entry.getValue();
                    if (i.y(fVar, n.fhm)) {
                        a = a(gVar);
                    } else {
                        a = m.emptyList();
                    }
                    r.a(arrayList, (Iterable) a);
                }
                int i = 0;
                for (QualifierApplicabilityType ordinal : (List) arrayList) {
                    i |= 1 << ordinal.ordinal();
                }
                for (Object next : m.brE()) {
                    Object obj;
                    if (d((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) next) != null) {
                        obj = 1;
                        continue;
                    } else {
                        obj = null;
                        continue;
                    }
                    if (obj != null) {
                        break;
                    }
                }
                Object next2 = null;
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) next2;
                if (cVar2 != null) {
                    return new a(cVar2, i);
                }
            }
        }
        return null;
    }

    public final ReportLevel g(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        i.f(cVar, "annotationDescriptor");
        ReportLevel h = h(cVar);
        if (h != null) {
            return h;
        }
        return this.fgt.bPZ();
    }

    public final ReportLevel h(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        i.f(cVar, "annotationDescriptor");
        Map bQb = this.fgt.bQb();
        b btB = cVar.btB();
        ReportLevel reportLevel = null;
        ReportLevel reportLevel2 = (ReportLevel) bQb.get(btB != null ? btB.boi() : null);
        if (reportLevel2 != null) {
            return reportLevel2;
        }
        d m = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.m(cVar);
        if (m != null) {
            reportLevel = v(m);
        }
        return reportLevel;
    }

    private final ReportLevel v(d dVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c i = dVar.brE().i(a.fgz);
        ReportLevel reportLevel = null;
        g n = i != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.n(i) : null;
        if (!(n instanceof j)) {
            n = null;
        }
        j jVar = (j) n;
        if (jVar != null) {
            ReportLevel bQa = this.fgt.bQa();
            if (bQa != null) {
                return bQa;
            }
            String boi = jVar.bNf().boi();
            int hashCode = boi.hashCode();
            if (hashCode != -2137067054) {
                if (hashCode != -1838656823) {
                    if (hashCode == 2656902 && boi.equals("WARN")) {
                        reportLevel = ReportLevel.WARN;
                    }
                } else if (boi.equals("STRICT")) {
                    reportLevel = ReportLevel.STRICT;
                }
            } else if (boi.equals("IGNORE")) {
                reportLevel = ReportLevel.IGNORE;
            }
        }
        return reportLevel;
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType> a(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> r3) {
        /*
        r2 = this;
        r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b;
        if (r0 == 0) goto L_0x0030;
    L_0x0004:
        r3 = (kotlin.reflect.jvm.internal.impl.resolve.constants.b) r3;
        r3 = r3.getValue();
        r3 = (java.lang.Iterable) r3;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r3 = r3.iterator();
    L_0x0017:
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x002d;
    L_0x001d:
        r1 = r3.next();
        r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r1;
        r1 = r2.a(r1);
        r1 = (java.lang.Iterable) r1;
        kotlin.collections.r.a(r0, r1);
        goto L_0x0017;
    L_0x002d:
        r0 = (java.util.List) r0;
        goto L_0x007c;
    L_0x0030:
        r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.j;
        if (r0 == 0) goto L_0x0078;
    L_0x0034:
        r3 = (kotlin.reflect.jvm.internal.impl.resolve.constants.j) r3;
        r3 = r3.bNf();
        r3 = r3.getIdentifier();
        r0 = r3.hashCode();
        switch(r0) {
            case -2024225567: goto L_0x0067;
            case 66889946: goto L_0x005c;
            case 107598562: goto L_0x0051;
            case 446088073: goto L_0x0046;
            default: goto L_0x0045;
        };
    L_0x0045:
        goto L_0x0072;
    L_0x0046:
        r0 = "PARAMETER";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0072;
    L_0x004e:
        r3 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.VALUE_PARAMETER;
        goto L_0x0073;
    L_0x0051:
        r0 = "TYPE_USE";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0072;
    L_0x0059:
        r3 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.TYPE_USE;
        goto L_0x0073;
    L_0x005c:
        r0 = "FIELD";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0072;
    L_0x0064:
        r3 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.FIELD;
        goto L_0x0073;
    L_0x0067:
        r0 = "METHOD";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0072;
    L_0x006f:
        r3 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.METHOD_RETURN_TYPE;
        goto L_0x0073;
    L_0x0072:
        r3 = 0;
    L_0x0073:
        r0 = kotlin.collections.m.dc(r3);
        goto L_0x007c;
    L_0x0078:
        r0 = kotlin.collections.m.emptyList();
    L_0x007c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.a(kotlin.reflect.jvm.internal.impl.resolve.constants.g):java.util.List");
    }

    public final boolean bvp() {
        return this.qW;
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.o;
import kotlin.reflect.jvm.internal.impl.load.java.s;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;
import kotlin.reflect.jvm.internal.impl.utils.e;

/* compiled from: signatureEnhancement.kt */
public final class j {
    private final e fgt;
    private final AnnotationTypeQualifierResolver fiM;

    /* compiled from: signatureEnhancement.kt */
    private static class a {
        private final w eYc;
        private final boolean fkR;
        private final boolean fkS;

        public a(w wVar, boolean z, boolean z2) {
            i.f(wVar, "type");
            this.eYc = wVar;
            this.fkR = z;
            this.fkS = z2;
        }

        public final w bpT() {
            return this.eYc;
        }

        public final boolean byh() {
            return this.fkR;
        }

        public final boolean byi() {
            return this.fkS;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    private final class b {
        private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a fkT;
        private final w fkU;
        private final Collection<w> fkV;
        private final boolean fkW;
        private final h fkX;
        private final QualifierApplicabilityType fkY;
        final /* synthetic */ j fkZ;

        public b(j jVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, w wVar, Collection<? extends w> collection, boolean z, h hVar, QualifierApplicabilityType qualifierApplicabilityType) {
            i.f(wVar, "fromOverride");
            i.f(collection, "fromOverridden");
            i.f(hVar, "containerContext");
            i.f(qualifierApplicabilityType, "containerApplicabilityType");
            this.fkZ = jVar;
            this.fkT = aVar;
            this.fkU = wVar;
            this.fkV = collection;
            this.fkW = z;
            this.fkX = hVar;
            this.fkY = qualifierApplicabilityType;
        }

        private final boolean byj() {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = this.fkT;
            w wVar = null;
            if (!(aVar instanceof ar)) {
                aVar = null;
            }
            ar arVar = (ar) aVar;
            if (arVar != null) {
                wVar = arVar.btS();
            }
            return wVar != null;
        }

        public final a a(o oVar) {
            kotlin.jvm.a.b byk = byk();
            kotlin.jvm.a.b signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1 = oVar != null ? new SignatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1(oVar, byk) : null;
            boolean b = au.b(this.fkU, (kotlin.jvm.a.b) SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1.fla);
            w wVar = this.fkU;
            if (signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1 == null) {
                signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1 = byk;
            }
            w a = p.a(wVar, signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1);
            if (a != null) {
                return new a(a, true, b);
            }
            return new a(this.fkU, false, b);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d ac(kotlin.reflect.jvm.internal.impl.types.w r12) {
            /*
            r11 = this;
            r0 = kotlin.reflect.jvm.internal.impl.types.t.aE(r12);
            if (r0 == 0) goto L_0x0018;
        L_0x0006:
            r0 = kotlin.reflect.jvm.internal.impl.types.t.aF(r12);
            r1 = new kotlin.Pair;
            r2 = r0.bPr();
            r0 = r0.bPs();
            r1.<init>(r2, r0);
            goto L_0x001d;
        L_0x0018:
            r1 = new kotlin.Pair;
            r1.<init>(r12, r12);
        L_0x001d:
            r0 = r1.bnj();
            r0 = (kotlin.reflect.jvm.internal.impl.types.w) r0;
            r1 = r1.bnk();
            r1 = (kotlin.reflect.jvm.internal.impl.types.w) r1;
            r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.fca;
            r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d;
            r3 = r0.boc();
            r4 = 0;
            if (r3 == 0) goto L_0x0038;
        L_0x0034:
            r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
        L_0x0036:
            r5 = r3;
            goto L_0x0042;
        L_0x0038:
            r3 = r1.boc();
            if (r3 != 0) goto L_0x0041;
        L_0x003e:
            r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL;
            goto L_0x0036;
        L_0x0041:
            r5 = r4;
        L_0x0042:
            r0 = r2.L(r0);
            if (r0 == 0) goto L_0x004b;
        L_0x0048:
            r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY;
            goto L_0x0055;
        L_0x004b:
            r0 = r2.K(r1);
            if (r0 == 0) goto L_0x0054;
        L_0x0051:
            r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE;
            goto L_0x0055;
        L_0x0054:
            r0 = r4;
        L_0x0055:
            r12 = r12.bPA();
            r6 = r12 instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e;
            r7 = 0;
            r8 = 8;
            r9 = 0;
            r3 = r10;
            r4 = r5;
            r5 = r0;
            r3.<init>(r4, r5, r6, r7, r8, r9);
            return r10;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j$b.ac(kotlin.reflect.jvm.internal.impl.types.w):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d");
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d a(kotlin.reflect.jvm.internal.impl.types.w r8, boolean r9, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d r10) {
            /*
            r7 = this;
            if (r9 == 0) goto L_0x0013;
        L_0x0002:
            r0 = r7.fkT;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r0 = r0.brE();
            r1 = r8.brE();
            r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.a(r0, r1);
            goto L_0x0017;
        L_0x0013:
            r0 = r8.brE();
        L_0x0017:
            r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1;
            r1.<init>(r0);
            r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2.flb;
            r3 = 0;
            if (r9 == 0) goto L_0x0031;
        L_0x0021:
            r9 = r7.fkX;
            r9 = r9.bwj();
            if (r9 == 0) goto L_0x0030;
        L_0x0029:
            r10 = r7.fkY;
            r10 = r9.c(r10);
            goto L_0x0031;
        L_0x0030:
            r10 = r3;
        L_0x0031:
            r9 = r7.i(r0);
            if (r9 == 0) goto L_0x0038;
        L_0x0037:
            goto L_0x004f;
        L_0x0038:
            if (r10 == 0) goto L_0x004e;
        L_0x003a:
            r9 = r10.bxQ();
            if (r9 == 0) goto L_0x004e;
        L_0x0040:
            r9 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f;
            r0 = r10.bxQ();
            r10 = r10.bxT();
            r9.<init>(r0, r10);
            goto L_0x004f;
        L_0x004e:
            r9 = r3;
        L_0x004f:
            r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d;
            if (r9 == 0) goto L_0x0058;
        L_0x0053:
            r0 = r9.bxX();
            goto L_0x0059;
        L_0x0058:
            r0 = r3;
        L_0x0059:
            r4 = kotlin.reflect.jvm.internal.impl.load.java.o.bvG();
            r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY;
            r4 = r1.w(r4, r5);
            r5 = kotlin.reflect.jvm.internal.impl.load.java.o.bvH();
            r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE;
            r1 = r1.w(r5, r6);
            r1 = r2.w(r4, r1);
            r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r1;
            if (r9 == 0) goto L_0x0079;
        L_0x0075:
            r3 = r9.bxX();
        L_0x0079:
            r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL;
            r4 = 0;
            r5 = 1;
            if (r3 != r2) goto L_0x0087;
        L_0x007f:
            r8 = kotlin.reflect.jvm.internal.impl.types.b.a.bf(r8);
            if (r8 == 0) goto L_0x0087;
        L_0x0085:
            r8 = 1;
            goto L_0x0088;
        L_0x0087:
            r8 = 0;
        L_0x0088:
            if (r9 == 0) goto L_0x0091;
        L_0x008a:
            r9 = r9.bxY();
            if (r9 != r5) goto L_0x0091;
        L_0x0090:
            r4 = 1;
        L_0x0091:
            r10.<init>(r0, r1, r8, r4);
            return r10;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j$b.a(kotlin.reflect.jvm.internal.impl.types.w, boolean, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d");
        }

        private final f i(f fVar) {
            Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterable = fVar;
            j jVar = this.fkZ;
            for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c j : iterable) {
                f j2 = jVar.j(j);
                if (j2 != null) {
                    return j2;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
        private final kotlin.jvm.a.b<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d> byk() {
            /*
            r14 = this;
            r0 = r14.fkV;
            r0 = (java.lang.Iterable) r0;
            r1 = new java.util.ArrayList;
            r2 = 10;
            r2 = kotlin.collections.n.e(r0, r2);
            r1.<init>(r2);
            r1 = (java.util.Collection) r1;
            r0 = r0.iterator();
        L_0x0015:
            r2 = r0.hasNext();
            if (r2 == 0) goto L_0x0029;
        L_0x001b:
            r2 = r0.next();
            r2 = (kotlin.reflect.jvm.internal.impl.types.w) r2;
            r2 = r14.ad(r2);
            r1.add(r2);
            goto L_0x0015;
        L_0x0029:
            r1 = (java.util.List) r1;
            r0 = r14.fkU;
            r0 = r14.ad(r0);
            r2 = r14.fkW;
            r3 = 0;
            r4 = 1;
            if (r2 == 0) goto L_0x006a;
        L_0x0037:
            r2 = r14.fkV;
            r2 = (java.lang.Iterable) r2;
            r5 = r2 instanceof java.util.Collection;
            if (r5 == 0) goto L_0x004a;
        L_0x003f:
            r5 = r2;
            r5 = (java.util.Collection) r5;
            r5 = r5.isEmpty();
            if (r5 == 0) goto L_0x004a;
        L_0x0048:
            r2 = 0;
            goto L_0x0066;
        L_0x004a:
            r2 = r2.iterator();
        L_0x004e:
            r5 = r2.hasNext();
            if (r5 == 0) goto L_0x0048;
        L_0x0054:
            r5 = r2.next();
            r5 = (kotlin.reflect.jvm.internal.impl.types.w) r5;
            r6 = kotlin.reflect.jvm.internal.impl.types.checker.b.fxI;
            r7 = r14.fkU;
            r5 = r6.d(r5, r7);
            r5 = r5 ^ r4;
            if (r5 == 0) goto L_0x004e;
        L_0x0065:
            r2 = 1;
        L_0x0066:
            if (r2 == 0) goto L_0x006a;
        L_0x0068:
            r2 = 1;
            goto L_0x006b;
        L_0x006a:
            r2 = 0;
        L_0x006b:
            if (r2 == 0) goto L_0x006f;
        L_0x006d:
            r5 = 1;
            goto L_0x0073;
        L_0x006f:
            r5 = r0.size();
        L_0x0073:
            r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d[r5];
            r6 = r5.length;
            r7 = 0;
        L_0x0077:
            if (r7 >= r6) goto L_0x00e0;
        L_0x0079:
            if (r7 != 0) goto L_0x007d;
        L_0x007b:
            r8 = 1;
            goto L_0x007e;
        L_0x007d:
            r8 = 0;
        L_0x007e:
            if (r8 != 0) goto L_0x0085;
        L_0x0080:
            if (r2 != 0) goto L_0x0083;
        L_0x0082:
            goto L_0x0085;
        L_0x0083:
            r9 = 0;
            goto L_0x0086;
        L_0x0085:
            r9 = 1;
        L_0x0086:
            r10 = kotlin.m.eVC;
            if (r10 == 0) goto L_0x0097;
        L_0x008a:
            if (r9 == 0) goto L_0x008d;
        L_0x008c:
            goto L_0x0097;
        L_0x008d:
            r0 = new java.lang.AssertionError;
            r1 = "Only head type constructors should be computed";
            r0.<init>(r1);
            r0 = (java.lang.Throwable) r0;
            throw r0;
        L_0x0097:
            r9 = r0.get(r7);
            r9 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n) r9;
            r10 = r9.bym();
            r9 = r9.byn();
            r11 = r1;
            r11 = (java.lang.Iterable) r11;
            r12 = new java.util.ArrayList;
            r12.<init>();
            r12 = (java.util.Collection) r12;
            r11 = r11.iterator();
        L_0x00b3:
            r13 = r11.hasNext();
            if (r13 == 0) goto L_0x00d3;
        L_0x00b9:
            r13 = r11.next();
            r13 = (java.util.List) r13;
            r13 = kotlin.collections.u.h(r13, r7);
            r13 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n) r13;
            if (r13 == 0) goto L_0x00cc;
        L_0x00c7:
            r13 = r13.bpT();
            goto L_0x00cd;
        L_0x00cc:
            r13 = 0;
        L_0x00cd:
            if (r13 == 0) goto L_0x00b3;
        L_0x00cf:
            r12.add(r13);
            goto L_0x00b3;
        L_0x00d3:
            r12 = (java.util.List) r12;
            r12 = (java.util.Collection) r12;
            r8 = r14.a(r10, r12, r9, r8);
            r5[r7] = r8;
            r7 = r7 + 1;
            goto L_0x0077;
        L_0x00e0:
            r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1;
            r0.<init>(r5);
            r0 = (kotlin.jvm.a.b) r0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j$b.byk():kotlin.jvm.a.b");
        }

        private final List<n> ad(w wVar) {
            ArrayList arrayList = new ArrayList(1);
            new SignatureEnhancement$SignatureParts$toIndexed$1(arrayList).a(wVar, this.fkX);
            return arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:72:0x0149  */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d a(kotlin.reflect.jvm.internal.impl.types.w r11, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.w> r12, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d r13, boolean r14) {
            /*
            r10 = this;
            r12 = (java.lang.Iterable) r12;
            r0 = new java.util.ArrayList;
            r1 = 10;
            r1 = kotlin.collections.n.e(r12, r1);
            r0.<init>(r1);
            r0 = (java.util.Collection) r0;
            r1 = r12.iterator();
        L_0x0013:
            r2 = r1.hasNext();
            if (r2 == 0) goto L_0x0027;
        L_0x0019:
            r2 = r1.next();
            r2 = (kotlin.reflect.jvm.internal.impl.types.w) r2;
            r2 = r10.ac(r2);
            r0.add(r2);
            goto L_0x0013;
        L_0x0027:
            r0 = (java.util.List) r0;
            r0 = (java.lang.Iterable) r0;
            r1 = new java.util.ArrayList;
            r1.<init>();
            r1 = (java.util.Collection) r1;
            r2 = r0.iterator();
        L_0x0036:
            r3 = r2.hasNext();
            if (r3 == 0) goto L_0x004c;
        L_0x003c:
            r3 = r2.next();
            r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d) r3;
            r3 = r3.bxR();
            if (r3 == 0) goto L_0x0036;
        L_0x0048:
            r1.add(r3);
            goto L_0x0036;
        L_0x004c:
            r1 = (java.util.List) r1;
            r1 = (java.lang.Iterable) r1;
            r1 = kotlin.collections.u.V(r1);
            r2 = new java.util.ArrayList;
            r2.<init>();
            r2 = (java.util.Collection) r2;
            r3 = r0.iterator();
        L_0x005f:
            r4 = r3.hasNext();
            if (r4 == 0) goto L_0x0075;
        L_0x0065:
            r4 = r3.next();
            r4 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d) r4;
            r4 = r4.bxQ();
            if (r4 == 0) goto L_0x005f;
        L_0x0071:
            r2.add(r4);
            goto L_0x005f;
        L_0x0075:
            r2 = (java.util.List) r2;
            r2 = (java.lang.Iterable) r2;
            r2 = kotlin.collections.u.V(r2);
            r3 = new java.util.ArrayList;
            r3.<init>();
            r3 = (java.util.Collection) r3;
            r12 = r12.iterator();
        L_0x0088:
            r4 = r12.hasNext();
            if (r4 == 0) goto L_0x00a6;
        L_0x008e:
            r4 = r12.next();
            r4 = (kotlin.reflect.jvm.internal.impl.types.w) r4;
            r4 = kotlin.reflect.jvm.internal.impl.types.aw.bi(r4);
            r4 = r10.ac(r4);
            r4 = r4.bxQ();
            if (r4 == 0) goto L_0x0088;
        L_0x00a2:
            r3.add(r4);
            goto L_0x0088;
        L_0x00a6:
            r3 = (java.util.List) r3;
            r3 = (java.lang.Iterable) r3;
            r12 = kotlin.collections.u.V(r3);
            r11 = r10.a(r11, r14, r13);
            r13 = r11.bxT();
            r3 = 1;
            r13 = r13 ^ r3;
            r4 = 0;
            if (r13 == 0) goto L_0x00bd;
        L_0x00bb:
            r13 = r11;
            goto L_0x00be;
        L_0x00bd:
            r13 = r4;
        L_0x00be:
            if (r13 == 0) goto L_0x00c5;
        L_0x00c0:
            r13 = r13.bxQ();
            goto L_0x00c6;
        L_0x00c5:
            r13 = r4;
        L_0x00c6:
            r5 = r11.bxQ();
            r6 = r10.fkW;
            r7 = 0;
            if (r6 == 0) goto L_0x00d3;
        L_0x00cf:
            if (r14 == 0) goto L_0x00d3;
        L_0x00d1:
            r6 = 1;
            goto L_0x00d4;
        L_0x00d3:
            r6 = 0;
        L_0x00d4:
            r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l.a(r2, r13, r6);
            if (r8 == 0) goto L_0x00ec;
        L_0x00da:
            r9 = r10.byj();
            if (r9 == 0) goto L_0x00e8;
        L_0x00e0:
            if (r14 == 0) goto L_0x00e8;
        L_0x00e2:
            r14 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
            if (r8 != r14) goto L_0x00e8;
        L_0x00e6:
            r14 = 1;
            goto L_0x00e9;
        L_0x00e8:
            r14 = 0;
        L_0x00e9:
            if (r14 != 0) goto L_0x00ec;
        L_0x00eb:
            r4 = r8;
        L_0x00ec:
            r14 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE;
            r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY;
            r9 = r11.bxR();
            r14 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l.a(r1, r14, r8, r9, r6);
            r14 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r14;
            if (r5 != r13) goto L_0x0106;
        L_0x00fc:
            r13 = kotlin.jvm.internal.i.y(r12, r2);
            r13 = r13 ^ r3;
            if (r13 == 0) goto L_0x0104;
        L_0x0103:
            goto L_0x0106;
        L_0x0104:
            r13 = 0;
            goto L_0x0107;
        L_0x0106:
            r13 = 1;
        L_0x0107:
            r11 = r11.bxS();
            if (r11 != 0) goto L_0x0138;
        L_0x010d:
            r11 = r0 instanceof java.util.Collection;
            if (r11 == 0) goto L_0x011c;
        L_0x0111:
            r11 = r0;
            r11 = (java.util.Collection) r11;
            r11 = r11.isEmpty();
            if (r11 == 0) goto L_0x011c;
        L_0x011a:
            r11 = 0;
            goto L_0x0133;
        L_0x011c:
            r11 = r0.iterator();
        L_0x0120:
            r0 = r11.hasNext();
            if (r0 == 0) goto L_0x011a;
        L_0x0126:
            r0 = r11.next();
            r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d) r0;
            r0 = r0.bxS();
            if (r0 == 0) goto L_0x0120;
        L_0x0132:
            r11 = 1;
        L_0x0133:
            if (r11 == 0) goto L_0x0136;
        L_0x0135:
            goto L_0x0138;
        L_0x0136:
            r11 = 0;
            goto L_0x0139;
        L_0x0138:
            r11 = 1;
        L_0x0139:
            if (r4 != 0) goto L_0x0146;
        L_0x013b:
            if (r13 == 0) goto L_0x0146;
        L_0x013d:
            r12 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l.a(r12, r5, r6);
            r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l.a(r12, r14, r3, r11);
            return r11;
        L_0x0146:
            if (r4 != 0) goto L_0x0149;
        L_0x0148:
            goto L_0x014a;
        L_0x0149:
            r3 = 0;
        L_0x014a:
            r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l.a(r4, r14, r3, r11);
            return r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j$b.a(kotlin.reflect.jvm.internal.impl.types.w, java.util.Collection, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d");
        }
    }

    /* compiled from: signatureEnhancement.kt */
    private static final class c extends a {
        private final boolean fiy;

        public final boolean bvO() {
            return this.fiy;
        }

        public c(w wVar, boolean z, boolean z2, boolean z3) {
            i.f(wVar, "type");
            super(wVar, z2, z3);
            this.fiy = z;
        }
    }

    public j(AnnotationTypeQualifierResolver annotationTypeQualifierResolver, e eVar) {
        i.f(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        i.f(eVar, "jsr305State");
        this.fiM = annotationTypeQualifierResolver;
        this.fgt = eVar;
    }

    /* JADX WARNING: Missing block: B:14:0x0046, code skipped:
            if (r5.equals("NEVER") != false) goto L_0x0051;
     */
    /* JADX WARNING: Missing block: B:16:0x004f, code skipped:
            if (r5.equals("MAYBE") != false) goto L_0x0051;
     */
    /* JADX WARNING: Missing block: B:17:0x0051, code skipped:
            r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, false, 2, null);
     */
    /* JADX WARNING: Missing block: B:18:0x0059, code skipped:
            r5 = null;
     */
    /* JADX WARNING: Missing block: B:19:0x005a, code skipped:
            return r5;
     */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r5) {
        /*
        r4 = this;
        r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.n(r5);
        r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.j;
        r1 = 0;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        r5 = r1;
    L_0x000a:
        r5 = (kotlin.reflect.jvm.internal.impl.resolve.constants.j) r5;
        r0 = 2;
        r2 = 0;
        if (r5 == 0) goto L_0x005b;
    L_0x0010:
        r5 = r5.bNf();
        r5 = r5.boi();
        r3 = r5.hashCode();
        switch(r3) {
            case 73135176: goto L_0x0049;
            case 74175084: goto L_0x0040;
            case 433141802: goto L_0x0030;
            case 1933739535: goto L_0x0020;
            default: goto L_0x001f;
        };
    L_0x001f:
        goto L_0x0059;
    L_0x0020:
        r3 = "ALWAYS";
        r5 = r5.equals(r3);
        if (r5 == 0) goto L_0x0059;
    L_0x0028:
        r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f;
        r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL;
        r5.<init>(r3, r2, r0, r1);
        goto L_0x005a;
    L_0x0030:
        r3 = "UNKNOWN";
        r5 = r5.equals(r3);
        if (r5 == 0) goto L_0x0059;
    L_0x0038:
        r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f;
        r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY;
        r5.<init>(r3, r2, r0, r1);
        goto L_0x005a;
    L_0x0040:
        r3 = "NEVER";
        r5 = r5.equals(r3);
        if (r5 == 0) goto L_0x0059;
    L_0x0048:
        goto L_0x0051;
    L_0x0049:
        r3 = "MAYBE";
        r5 = r5.equals(r3);
        if (r5 == 0) goto L_0x0059;
    L_0x0051:
        r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f;
        r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
        r5.<init>(r3, r2, r0, r1);
        goto L_0x005a;
    L_0x0059:
        r5 = r1;
    L_0x005a:
        return r5;
    L_0x005b:
        r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f;
        r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL;
        r5.<init>(r3, r2, r0, r1);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j.i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f");
    }

    public final f j(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        i.f(cVar, "annotationDescriptor");
        f k = k(cVar);
        if (k != null) {
            return k;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c d = this.fiM.d(cVar);
        f fVar = null;
        if (d != null) {
            ReportLevel g = this.fiM.g(cVar);
            if (g.isIgnore()) {
                return null;
            }
            k = k(d);
            if (k != null) {
                fVar = f.a(k, null, g.isWarning(), 1, null);
            }
        }
        return fVar;
    }

    private final f k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        kotlin.reflect.jvm.internal.impl.name.b btB = cVar.btB();
        f fVar = null;
        if (btB == null) {
            return null;
        }
        f fVar2;
        if (o.bvy().contains(btB)) {
            fVar2 = new f(NullabilityQualifier.NULLABLE, false, 2, null);
        } else if (o.bvB().contains(btB)) {
            fVar2 = new f(NullabilityQualifier.NOT_NULL, false, 2, null);
        } else {
            if (i.y(btB, o.bvz())) {
                fVar = i(cVar);
            } else if (i.y(btB, o.bvC()) && this.fgt.bQc()) {
                fVar2 = new f(NullabilityQualifier.NULLABLE, false, 2, null);
            } else if (i.y(btB, o.bvD()) && this.fgt.bQc()) {
                fVar2 = new f(NullabilityQualifier.NOT_NULL, false, 2, null);
            } else if (i.y(btB, o.bvF())) {
                fVar = new f(NullabilityQualifier.NOT_NULL, true);
            } else if (i.y(btB, o.bvE())) {
                fVar = new f(NullabilityQualifier.NULLABLE, true);
            }
            fVar2 = fVar;
        }
        return fVar2;
    }

    public final <D extends CallableMemberDescriptor> Collection<D> a(h hVar, Collection<? extends D> collection) {
        i.f(hVar, "c");
        i.f(collection, "platformSignatures");
        Iterable<CallableMemberDescriptor> iterable = collection;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (CallableMemberDescriptor a : iterable) {
            arrayList.add(a(a, hVar));
        }
        return (List) arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0245  */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D a(D r18, kotlin.reflect.jvm.internal.impl.load.java.lazy.h r19) {
        /*
        r17 = this;
        r7 = r17;
        r8 = r18;
        r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.b;
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        return r8;
    L_0x0009:
        r9 = r8;
        r9 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.b) r9;
        r0 = r9.bsT();
        r1 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
        r10 = 1;
        if (r0 != r1) goto L_0x0029;
    L_0x0015:
        r0 = r9.bsS();
        r1 = "original";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.bsR();
        r0 = r0.size();
        if (r0 != r10) goto L_0x0029;
    L_0x0028:
        return r8;
    L_0x0029:
        r0 = r18.brE();
        r1 = r19;
        r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.b(r1, r0);
        r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e;
        if (r0 == 0) goto L_0x0057;
    L_0x0037:
        r0 = r8;
        r0 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) r0;
        r1 = r0.buU();
        if (r1 == 0) goto L_0x0057;
    L_0x0040:
        r1 = r1.isDefault();
        if (r1 != 0) goto L_0x0057;
    L_0x0046:
        r0 = r0.buU();
        if (r0 != 0) goto L_0x004f;
    L_0x004c:
        kotlin.jvm.internal.i.bnJ();
    L_0x004f:
        r1 = "getter!!";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0;
        goto L_0x0058;
    L_0x0057:
        r0 = r8;
    L_0x0058:
        r1 = r9.bsK();
        r11 = 0;
        if (r1 == 0) goto L_0x0082;
    L_0x005f:
        r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.s;
        if (r1 != 0) goto L_0x0065;
    L_0x0063:
        r1 = r11;
        goto L_0x0066;
    L_0x0065:
        r1 = r0;
    L_0x0066:
        r1 = (kotlin.reflect.jvm.internal.impl.descriptors.s) r1;
        if (r1 == 0) goto L_0x0073;
    L_0x006a:
        r2 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.fit;
        r1 = r1.a(r2);
        r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ar) r1;
        goto L_0x0074;
    L_0x0073:
        r1 = r11;
    L_0x0074:
        r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.flc;
        r2 = (kotlin.jvm.a.b) r2;
        r1 = r7.a(r8, r1, r4, r2);
        r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j.b.a(r1, r11, r10, r11);
        r12 = r1;
        goto L_0x0083;
    L_0x0082:
        r12 = r11;
    L_0x0083:
        r1 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
        if (r1 != 0) goto L_0x0089;
    L_0x0087:
        r1 = r11;
        goto L_0x008a;
    L_0x0089:
        r1 = r8;
    L_0x008a:
        r1 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) r1;
        r13 = 0;
        if (r1 == 0) goto L_0x00ba;
    L_0x008f:
        r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.u.fmf;
        r3 = r1.brj();
        if (r3 == 0) goto L_0x00b2;
    L_0x0097:
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r3;
        r1 = (kotlin.reflect.jvm.internal.impl.descriptors.s) r1;
        r5 = 3;
        r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.r.a(r1, r13, r13, r5, r11);
        r1 = r2.a(r3, r1);
        if (r1 == 0) goto L_0x00ba;
    L_0x00a6:
        r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g.bxZ();
        r1 = r2.get(r1);
        r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h) r1;
        r14 = r1;
        goto L_0x00bb;
    L_0x00b2:
        r0 = new kotlin.TypeCastException;
        r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor";
        r0.<init>(r1);
        throw r0;
    L_0x00ba:
        r14 = r11;
    L_0x00bb:
        if (r14 == 0) goto L_0x0117;
    L_0x00bd:
        r1 = r14.bye();
        r1 = r1.size();
        r2 = r9.bsP();
        r2 = r2.size();
        if (r1 != r2) goto L_0x00d1;
    L_0x00cf:
        r1 = 1;
        goto L_0x00d2;
    L_0x00d1:
        r1 = 0;
    L_0x00d2:
        r2 = kotlin.m.eVC;
        if (r2 == 0) goto L_0x0117;
    L_0x00d6:
        if (r1 == 0) goto L_0x00d9;
    L_0x00d8:
        goto L_0x0117;
    L_0x00d9:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Predefined enhancement info for ";
        r0.append(r1);
        r0.append(r8);
        r1 = " has ";
        r0.append(r1);
        r1 = r14.bye();
        r1 = r1.size();
        r0.append(r1);
        r1 = ", but ";
        r0.append(r1);
        r1 = r9.bsP();
        r1 = r1.size();
        r0.append(r1);
        r1 = " expected";
        r0.append(r1);
        r0 = r0.toString();
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        r1 = (java.lang.Throwable) r1;
        throw r1;
    L_0x0117:
        r1 = r0.bsP();
        r2 = "annotationOwnerForMember.valueParameters";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (java.lang.Iterable) r1;
        r2 = new java.util.ArrayList;
        r15 = 10;
        r3 = kotlin.collections.n.e(r1, r15);
        r2.<init>(r3);
        r2 = (java.util.Collection) r2;
        r1 = r1.iterator();
    L_0x0133:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x01a6;
    L_0x0139:
        r3 = r1.next();
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ar) r3;
        r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1;
        r5.<init>(r3);
        r5 = (kotlin.jvm.a.b) r5;
        r5 = r7.a(r8, r3, r4, r5);
        if (r14 == 0) goto L_0x015e;
    L_0x014c:
        r6 = r14.bye();
        if (r6 == 0) goto L_0x015e;
    L_0x0152:
        r11 = r3.getIndex();
        r6 = kotlin.collections.u.h(r6, r11);
        r11 = r6;
        r11 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o) r11;
        goto L_0x015f;
    L_0x015e:
        r11 = 0;
    L_0x015f:
        r5 = r5.a(r11);
        r6 = r5.byh();
        r11 = "p";
        if (r6 == 0) goto L_0x0170;
    L_0x016b:
        r6 = r5.bpT();
        goto L_0x017c;
    L_0x0170:
        kotlin.jvm.internal.i.e(r3, r11);
        r6 = r3.bpT();
        r13 = "p.type";
        kotlin.jvm.internal.i.e(r6, r13);
    L_0x017c:
        kotlin.jvm.internal.i.e(r3, r11);
        r6 = r7.a(r3, r6);
        r11 = r5.byh();
        if (r11 != 0) goto L_0x0192;
    L_0x0189:
        r3 = r3.btR();
        if (r6 == r3) goto L_0x0190;
    L_0x018f:
        goto L_0x0192;
    L_0x0190:
        r3 = 0;
        goto L_0x0193;
    L_0x0192:
        r3 = 1;
    L_0x0193:
        r11 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j$c;
        r13 = r5.bpT();
        r5 = r5.byi();
        r11.<init>(r13, r6, r3, r5);
        r2.add(r11);
        r11 = 0;
        r13 = 0;
        goto L_0x0133;
    L_0x01a6:
        r11 = r2;
        r11 = (java.util.List) r11;
        r2 = r0;
        r2 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) r2;
        r3 = 1;
        r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ae;
        if (r0 != 0) goto L_0x01b3;
    L_0x01b1:
        r0 = 0;
        goto L_0x01b4;
    L_0x01b3:
        r0 = r8;
    L_0x01b4:
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ae) r0;
        if (r0 == 0) goto L_0x01c1;
    L_0x01b8:
        r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.h(r0);
        if (r0 != r10) goto L_0x01c1;
    L_0x01be:
        r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.FIELD;
        goto L_0x01c3;
    L_0x01c1:
        r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.METHOD_RETURN_TYPE;
    L_0x01c3:
        r5 = r0;
        r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.fld;
        r6 = r0;
        r6 = (kotlin.jvm.a.b) r6;
        r0 = r17;
        r1 = r18;
        r0 = r0.a(r1, r2, r3, r4, r5, r6);
        if (r14 == 0) goto L_0x01d8;
    L_0x01d3:
        r1 = r14.byd();
        goto L_0x01d9;
    L_0x01d8:
        r1 = 0;
    L_0x01d9:
        r0 = r0.a(r1);
        if (r12 == 0) goto L_0x01e5;
    L_0x01df:
        r1 = r12.byi();
        if (r1 == r10) goto L_0x0219;
    L_0x01e5:
        r1 = r0.byi();
        if (r1 != 0) goto L_0x0219;
    L_0x01eb:
        r1 = r11;
        r1 = (java.lang.Iterable) r1;
        r2 = r1 instanceof java.util.Collection;
        if (r2 == 0) goto L_0x01fd;
    L_0x01f2:
        r2 = r1;
        r2 = (java.util.Collection) r2;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x01fd;
    L_0x01fb:
        r1 = 0;
        goto L_0x0214;
    L_0x01fd:
        r1 = r1.iterator();
    L_0x0201:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x01fb;
    L_0x0207:
        r2 = r1.next();
        r2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j.c) r2;
        r2 = r2.byi();
        if (r2 == 0) goto L_0x0201;
    L_0x0213:
        r1 = 1;
    L_0x0214:
        if (r1 == 0) goto L_0x0217;
    L_0x0216:
        goto L_0x0219;
    L_0x0217:
        r1 = 0;
        goto L_0x021a;
    L_0x0219:
        r1 = 1;
    L_0x021a:
        if (r12 == 0) goto L_0x0222;
    L_0x021c:
        r2 = r12.byh();
        if (r2 == r10) goto L_0x0259;
    L_0x0222:
        r2 = r0.byh();
        if (r2 != 0) goto L_0x0259;
    L_0x0228:
        r2 = r11;
        r2 = (java.lang.Iterable) r2;
        r3 = r2 instanceof java.util.Collection;
        if (r3 == 0) goto L_0x023b;
    L_0x022f:
        r3 = r2;
        r3 = (java.util.Collection) r3;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x023b;
    L_0x0238:
        r16 = 0;
        goto L_0x0253;
    L_0x023b:
        r2 = r2.iterator();
    L_0x023f:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0238;
    L_0x0245:
        r3 = r2.next();
        r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j.c) r3;
        r3 = r3.byh();
        if (r3 == 0) goto L_0x023f;
    L_0x0251:
        r16 = 1;
    L_0x0253:
        if (r16 != 0) goto L_0x0259;
    L_0x0255:
        if (r1 == 0) goto L_0x0258;
    L_0x0257:
        goto L_0x0259;
    L_0x0258:
        return r8;
    L_0x0259:
        if (r1 == 0) goto L_0x026c;
    L_0x025b:
        r1 = kotlin.reflect.jvm.internal.impl.resolve.a.a.bNj();
        r2 = new kotlin.reflect.jvm.internal.impl.load.java.e;
        r3 = r8;
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r3;
        r2.<init>(r3);
        r1 = kotlin.j.x(r1, r2);
        goto L_0x026d;
    L_0x026c:
        r1 = 0;
    L_0x026d:
        if (r12 == 0) goto L_0x0274;
    L_0x026f:
        r2 = r12.bpT();
        goto L_0x0275;
    L_0x0274:
        r2 = 0;
    L_0x0275:
        r11 = (java.lang.Iterable) r11;
        r3 = new java.util.ArrayList;
        r4 = kotlin.collections.n.e(r11, r15);
        r3.<init>(r4);
        r3 = (java.util.Collection) r3;
        r4 = r11.iterator();
    L_0x0286:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x02a3;
    L_0x028c:
        r5 = r4.next();
        r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j.c) r5;
        r6 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.i;
        r8 = r5.bpT();
        r5 = r5.bvO();
        r6.<init>(r8, r5);
        r3.add(r6);
        goto L_0x0286;
    L_0x02a3:
        r3 = (java.util.List) r3;
        r0 = r0.bpT();
        r0 = r9.a(r2, r3, r0, r1);
        if (r0 == 0) goto L_0x02b2;
    L_0x02af:
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0;
        return r0;
    L_0x02b2:
        r0 = new kotlin.TypeCastException;
        r1 = "null cannot be cast to non-null type D";
        r0.<init>(r1);
        goto L_0x02bb;
    L_0x02ba:
        throw r0;
    L_0x02bb:
        goto L_0x02ba;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j.a(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.h):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    private final boolean a(ar arVar, w wVar) {
        boolean z;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.a d = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.d(arVar);
        if (d instanceof g) {
            z = s.a(wVar, ((g) d).getValue()) != null;
        } else if (i.y(d, kotlin.reflect.jvm.internal.impl.load.java.descriptors.f.fix)) {
            z = au.bc(wVar);
        } else if (d == null) {
            z = arVar.btR();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (z && arVar.bsR().isEmpty()) {
            return true;
        }
        return false;
    }

    private final b a(CallableMemberDescriptor callableMemberDescriptor, ar arVar, h hVar, kotlin.jvm.a.b<? super CallableMemberDescriptor, ? extends w> bVar) {
        h hVar2;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = arVar;
        if (arVar != null) {
            h b = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.b(hVar, arVar.brE());
            if (b != null) {
                hVar2 = b;
                return a(callableMemberDescriptor, aVar, false, hVar2, QualifierApplicabilityType.VALUE_PARAMETER, bVar);
            }
        }
        hVar2 = hVar;
        return a(callableMemberDescriptor, aVar, false, hVar2, QualifierApplicabilityType.VALUE_PARAMETER, bVar);
    }

    private final b a(CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z, h hVar, QualifierApplicabilityType qualifierApplicabilityType, kotlin.jvm.a.b<? super CallableMemberDescriptor, ? extends w> bVar) {
        w wVar = (w) bVar.invoke(callableMemberDescriptor);
        Collection bsR = callableMemberDescriptor.bsR();
        i.e(bsR, "this.overriddenDescriptors");
        Iterable<CallableMemberDescriptor> iterable = bsR;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : iterable) {
            i.e(callableMemberDescriptor2, "it");
            arrayList.add((w) bVar.invoke(callableMemberDescriptor2));
        }
        return new b(this, aVar, wVar, (List) arrayList, z, kotlin.reflect.jvm.internal.impl.load.java.lazy.a.b(hVar, ((w) bVar.invoke(callableMemberDescriptor)).brE()), qualifierApplicabilityType);
    }
}

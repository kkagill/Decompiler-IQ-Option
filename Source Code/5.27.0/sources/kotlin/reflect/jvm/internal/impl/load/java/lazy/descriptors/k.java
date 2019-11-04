package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.at;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.i;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.storage.g;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: LazyJavaScope.kt */
public abstract class k extends i {
    static final /* synthetic */ j[] anY = new j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(k.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(k.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(k.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    private final kotlin.reflect.jvm.internal.impl.storage.b<f, Collection<ai>> feu = this.fiV.bqz().q(new LazyJavaScope$functions$1(this));
    private final kotlin.reflect.jvm.internal.impl.storage.b<f, List<ae>> fev = this.fiV.bqz().q(new LazyJavaScope$properties$1(this));
    private final e<Collection<kotlin.reflect.jvm.internal.impl.descriptors.k>> few = this.fiV.bqz().a(new LazyJavaScope$allDescriptors$1(this), m.emptyList());
    private final h fiV;
    private final e<b> fjW = this.fiV.bqz().f(new LazyJavaScope$declaredMemberIndex$1(this));
    private final e fjX = this.fiV.bqz().f(new LazyJavaScope$functionNamesLazy$2(this));
    private final e fjY = this.fiV.bqz().f(new LazyJavaScope$propertyNamesLazy$2(this));
    private final e fjZ = this.fiV.bqz().f(new LazyJavaScope$classNamesLazy$2(this));

    /* compiled from: LazyJavaScope.kt */
    protected static final class a {
        private final List<String> errors;
        private final List<ao> fcP;
        private final boolean feP;
        private final w ffV;
        private final w fio;
        private final List<ar> fip;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (kotlin.jvm.internal.i.y(this.ffV, aVar.ffV) && kotlin.jvm.internal.i.y(this.fio, aVar.fio) && kotlin.jvm.internal.i.y(this.fip, aVar.fip) && kotlin.jvm.internal.i.y(this.fcP, aVar.fcP)) {
                        if ((this.feP == aVar.feP ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.errors, aVar.errors)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            w wVar = this.ffV;
            int i = 0;
            int hashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
            w wVar2 = this.fio;
            hashCode = (hashCode + (wVar2 != null ? wVar2.hashCode() : 0)) * 31;
            List list = this.fip;
            hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            list = this.fcP;
            hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            int i2 = this.feP;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            list = this.errors;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MethodSignatureData(returnType=");
            stringBuilder.append(this.ffV);
            stringBuilder.append(", receiverType=");
            stringBuilder.append(this.fio);
            stringBuilder.append(", valueParameters=");
            stringBuilder.append(this.fip);
            stringBuilder.append(", typeParameters=");
            stringBuilder.append(this.fcP);
            stringBuilder.append(", hasStableParameterNames=");
            stringBuilder.append(this.feP);
            stringBuilder.append(", errors=");
            stringBuilder.append(this.errors);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(w wVar, w wVar2, List<? extends ar> list, List<? extends ao> list2, boolean z, List<String> list3) {
            kotlin.jvm.internal.i.f(wVar, "returnType");
            kotlin.jvm.internal.i.f(list, "valueParameters");
            kotlin.jvm.internal.i.f(list2, "typeParameters");
            kotlin.jvm.internal.i.f(list3, "errors");
            this.ffV = wVar;
            this.fio = wVar2;
            this.fip = list;
            this.fcP = list2;
            this.feP = z;
            this.errors = list3;
        }

        public final w bsN() {
            return this.ffV;
        }

        public final w bvN() {
            return this.fio;
        }

        public final List<ar> bsP() {
            return this.fip;
        }

        public final List<ao> bsM() {
            return this.fcP;
        }

        public final boolean bwQ() {
            return this.feP;
        }

        public final List<String> Zh() {
            return this.errors;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    protected static final class b {
        private final List<ar> fka;
        private final boolean fkb;

        public b(List<? extends ar> list, boolean z) {
            kotlin.jvm.internal.i.f(list, "descriptors");
            this.fka = list;
            this.fkb = z;
        }

        public final boolean bwR() {
            return this.fkb;
        }

        public final List<ar> getDescriptors() {
            return this.fka;
        }
    }

    private final Set<f> bwN() {
        return (Set) g.a(this.fjX, (Object) this, anY[0]);
    }

    private final Set<f> bwO() {
        return (Set) g.a(this.fjY, (Object) this, anY[1]);
    }

    public abstract a a(q qVar, List<? extends ao> list, w wVar, List<? extends ar> list2);

    public abstract void a(Collection<ai> collection, f fVar);

    /* Access modifiers changed, original: protected */
    public boolean a(JavaMethodDescriptor javaMethodDescriptor) {
        kotlin.jvm.internal.i.f(javaMethodDescriptor, "$this$isVisibleAsFunction");
        return true;
    }

    public abstract void b(f fVar, Collection<ae> collection);

    public abstract ah bsL();

    public abstract b bwB();

    public abstract kotlin.reflect.jvm.internal.impl.descriptors.k bwF();

    public abstract Set<f> c(d dVar, kotlin.jvm.a.b<? super f, Boolean> bVar);

    public abstract Set<f> d(d dVar, kotlin.jvm.a.b<? super f, Boolean> bVar);

    public abstract Set<f> e(d dVar, kotlin.jvm.a.b<? super f, Boolean> bVar);

    public k(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "c");
        this.fiV = hVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final h bwP() {
        return this.fiV;
    }

    /* Access modifiers changed, original: protected|final */
    public final e<b> bwM() {
        return this.fjW;
    }

    /* Access modifiers changed, original: protected|final */
    public final JavaMethodDescriptor c(q qVar) {
        Map m;
        kotlin.jvm.internal.i.f(qVar, "method");
        JavaMethodDescriptor a = JavaMethodDescriptor.a(bwF(), kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(this.fiV, qVar), qVar.bsZ(), (aj) this.fiV.bwl().bvX().a(qVar));
        kotlin.jvm.internal.i.e(a, "JavaMethodDescriptor.cre….source(method)\n        )");
        h a2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.a(this.fiV, (kotlin.reflect.jvm.internal.impl.descriptors.k) a, (x) qVar, 0, 4, null);
        Iterable<kotlin.reflect.jvm.internal.impl.load.java.structure.w> bsM = qVar.bsM();
        Collection arrayList = new ArrayList(n.e(bsM, 10));
        for (kotlin.reflect.jvm.internal.impl.load.java.structure.w a3 : bsM) {
            ao a4 = a2.bwm().a(a3);
            if (a4 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            arrayList.add(a4);
        }
        List list = (List) arrayList;
        b a5 = a(a2, (s) a, qVar.bsP());
        a a6 = a(qVar, list, a(qVar, a2), a5.getDescriptors());
        w bvN = a6.bvN();
        ah a7 = bvN != null ? kotlin.reflect.jvm.internal.impl.resolve.b.a((kotlin.reflect.jvm.internal.impl.descriptors.a) a, bvN, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug()) : null;
        ah bsL = bsL();
        List bsM2 = a6.bsM();
        List bsP = a6.bsP();
        w bsN = a6.bsN();
        Modality p = Modality.Companion.p(qVar.bxG(), qVar.bxH() ^ 1);
        aw brx = qVar.brx();
        if (a6.bvN() != null) {
            m = ae.m(kotlin.j.x(JavaMethodDescriptor.fit, u.bU(a5.getDescriptors())));
        } else {
            m = af.emptyMap();
        }
        a.a(a7, bsL, bsM2, bsP, bsN, p, brx, m);
        a.q(a6.bwQ(), a5.bwR());
        if ((a6.Zh().isEmpty() ^ 1) != 0) {
            a2.bwl().bvT().a(a, a6.Zh());
        }
        return a;
    }

    /* Access modifiers changed, original: protected|final */
    public final w a(q qVar, h hVar) {
        kotlin.jvm.internal.i.f(qVar, "method");
        kotlin.jvm.internal.i.f(hVar, "c");
        return hVar.bwk().a(qVar.bxD(), c.a(TypeUsage.COMMON, qVar.bxC().bxn(), null, 2, null));
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0139  */
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k.b a(kotlin.reflect.jvm.internal.impl.load.java.lazy.h r22, kotlin.reflect.jvm.internal.impl.descriptors.s r23, java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.y> r24) {
        /*
        r21 = this;
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = "c";
        kotlin.jvm.internal.i.f(r0, r3);
        r3 = "function";
        kotlin.jvm.internal.i.f(r1, r3);
        r3 = "jValueParameters";
        kotlin.jvm.internal.i.f(r2, r3);
        r3 = new java.util.LinkedHashSet;
        r3.<init>();
        r3 = (java.util.Set) r3;
        r4 = r2;
        r4 = (java.lang.Iterable) r4;
        r4 = kotlin.collections.u.W(r4);
        r5 = new java.util.ArrayList;
        r6 = 10;
        r6 = kotlin.collections.n.e(r4, r6);
        r5.<init>(r6);
        r5 = (java.util.Collection) r5;
        r4 = r4.iterator();
        r6 = 0;
        r7 = 0;
    L_0x0036:
        r8 = r4.hasNext();
        if (r8 == 0) goto L_0x0180;
    L_0x003c:
        r8 = r4.next();
        r8 = (kotlin.collections.w) r8;
        r12 = r8.component1();
        r8 = r8.bnk();
        r8 = (kotlin.reflect.jvm.internal.impl.load.java.structure.y) r8;
        r9 = r8;
        r9 = (kotlin.reflect.jvm.internal.impl.load.java.structure.d) r9;
        r13 = kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(r0, r9);
        r9 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON;
        r10 = 3;
        r11 = 0;
        r9 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c.a(r9, r6, r11, r10, r11);
        r10 = kotlin.reflect.jvm.internal.impl.load.java.n.fhw;
        r14 = "JvmAnnotationNames.PARAMETER_NAME_FQ_NAME";
        kotlin.jvm.internal.i.e(r10, r14);
        r10 = r13.i(r10);
        if (r10 == 0) goto L_0x007e;
    L_0x0068:
        r10 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.n(r10);
        if (r10 == 0) goto L_0x007e;
    L_0x006e:
        r14 = r10 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.t;
        if (r14 != 0) goto L_0x0073;
    L_0x0072:
        r10 = r11;
    L_0x0073:
        r10 = (kotlin.reflect.jvm.internal.impl.resolve.constants.t) r10;
        if (r10 == 0) goto L_0x007e;
    L_0x0077:
        r10 = r10.getValue();
        r10 = (java.lang.String) r10;
        goto L_0x007f;
    L_0x007e:
        r10 = r11;
    L_0x007f:
        r14 = r8.bxL();
        r15 = 1;
        if (r14 == 0) goto L_0x00c5;
    L_0x0086:
        r14 = r8.bxA();
        r6 = r14 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.f;
        if (r6 != 0) goto L_0x008f;
    L_0x008e:
        r14 = r11;
    L_0x008f:
        r14 = (kotlin.reflect.jvm.internal.impl.load.java.structure.f) r14;
        if (r14 == 0) goto L_0x00ac;
    L_0x0093:
        r6 = r22.bwk();
        r6 = r6.a(r14, r9, r15);
        r9 = r22.bql();
        r9 = r9.btw();
        r9 = r9.m(r6);
        r6 = kotlin.j.x(r6, r9);
        goto L_0x00d5;
    L_0x00ac:
        r0 = new java.lang.AssertionError;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Vararg parameter should be an array: ";
        r1.append(r2);
        r1.append(r8);
        r1 = r1.toString();
        r0.<init>(r1);
        r0 = (java.lang.Throwable) r0;
        throw r0;
    L_0x00c5:
        r6 = r22.bwk();
        r14 = r8.bxA();
        r6 = r6.a(r14, r9);
        r6 = kotlin.j.x(r6, r11);
    L_0x00d5:
        r9 = r6.bnj();
        r14 = r9;
        r14 = (kotlin.reflect.jvm.internal.impl.types.w) r14;
        r6 = r6.bnk();
        r19 = r6;
        r19 = (kotlin.reflect.jvm.internal.impl.types.w) r19;
        r6 = r23.bsZ();
        r6 = r6.boi();
        r9 = "equals";
        r6 = kotlin.jvm.internal.i.y(r6, r9);
        if (r6 == 0) goto L_0x0113;
    L_0x00f4:
        r6 = r24.size();
        if (r6 != r15) goto L_0x0113;
    L_0x00fa:
        r6 = r22.bql();
        r6 = r6.btw();
        r6 = r6.bqN();
        r6 = kotlin.jvm.internal.i.y(r6, r14);
        if (r6 == 0) goto L_0x0113;
    L_0x010c:
        r6 = "other";
        r6 = kotlin.reflect.jvm.internal.impl.name.f.ms(r6);
        goto L_0x014f;
    L_0x0113:
        if (r10 == 0) goto L_0x012e;
    L_0x0115:
        r6 = r10;
        r6 = (java.lang.CharSequence) r6;
        r6 = r6.length();
        if (r6 <= 0) goto L_0x0120;
    L_0x011e:
        r6 = 1;
        goto L_0x0121;
    L_0x0120:
        r6 = 0;
    L_0x0121:
        if (r6 == 0) goto L_0x012e;
    L_0x0123:
        r6 = r3.add(r10);
        if (r6 == 0) goto L_0x012e;
    L_0x0129:
        r6 = kotlin.reflect.jvm.internal.impl.name.f.ms(r10);
        goto L_0x014f;
    L_0x012e:
        r6 = r8.bsZ();
        if (r6 != 0) goto L_0x0135;
    L_0x0134:
        goto L_0x0136;
    L_0x0135:
        r15 = r7;
    L_0x0136:
        if (r6 == 0) goto L_0x0139;
    L_0x0138:
        goto L_0x014e;
    L_0x0139:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r6.append(r7);
        r6.append(r12);
        r6 = r6.toString();
        r6 = kotlin.reflect.jvm.internal.impl.name.f.ms(r6);
    L_0x014e:
        r7 = r15;
    L_0x014f:
        r9 = "if (function.name.asStri…(\"p$index\")\n            }";
        kotlin.jvm.internal.i.e(r6, r9);
        r15 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ai;
        r10 = r1;
        r10 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r10;
        r11 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r9 = r22.bwl();
        r9 = r9.bvX();
        r8 = (kotlin.reflect.jvm.internal.impl.load.java.structure.l) r8;
        r8 = r9.a(r8);
        r20 = r8;
        r20 = (kotlin.reflect.jvm.internal.impl.descriptors.aj) r20;
        r9 = r15;
        r8 = r14;
        r14 = r6;
        r6 = r15;
        r15 = r8;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r5.add(r6);
        r6 = 0;
        goto L_0x0036;
    L_0x0180:
        r5 = (java.util.List) r5;
        r5 = (java.lang.Iterable) r5;
        r0 = kotlin.collections.u.T(r5);
        r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k$b;
        r1.<init>(r0, r7);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k.a(kotlin.reflect.jvm.internal.impl.load.java.lazy.h, kotlin.reflect.jvm.internal.impl.descriptors.s, java.util.List):kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k$b");
    }

    public Set<f> bux() {
        return bwN();
    }

    public Set<f> buy() {
        return bwO();
    }

    public Collection<ai> b(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(bVar, "location");
        if (bux().contains(fVar)) {
            return (Collection) this.feu.invoke(fVar);
        }
        return m.emptyList();
    }

    private final ae a(n nVar) {
        z b = b(nVar);
        b.a(null, null, null, null);
        b.a(d(nVar), m.emptyList(), bsL(), null);
        if (kotlin.reflect.jvm.internal.impl.resolve.c.a((at) b, b.bpT())) {
            b.a(this.fiV.bqz().g(new LazyJavaScope$resolveProperty$1(this, nVar, b)));
        }
        ae aeVar = b;
        this.fiV.bwl().bvV().c(nVar, aeVar);
        return aeVar;
    }

    private final z b(n nVar) {
        int bxH = nVar.bxH() ^ 1;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.e a = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.a(bwF(), kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(this.fiV, nVar), Modality.FINAL, nVar.brx(), bxH, nVar.bsZ(), this.fiV.bwl().bvX().a(nVar), c(nVar));
        kotlin.jvm.internal.i.e(a, "JavaPropertyDescriptor.c…d.isFinalStatic\n        )");
        return a;
    }

    private final boolean c(n nVar) {
        return nVar.bxH() && nVar.bo();
    }

    private final w d(n nVar) {
        boolean z = false;
        w a = this.fiV.bwk().a(nVar.bxA(), c.a(TypeUsage.COMMON, false, null, 3, null));
        if ((kotlin.reflect.jvm.internal.impl.builtins.g.q(a) || kotlin.reflect.jvm.internal.impl.builtins.g.I(a)) && c(nVar) && nVar.bxB()) {
            z = true;
        }
        if (!z) {
            return a;
        }
        w aZ = au.aZ(a);
        kotlin.jvm.internal.i.e(aZ, "TypeUtils.makeNotNullable(propertyType)");
        return aZ;
    }

    public Collection<ae> a(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(bVar, "location");
        if (buy().contains(fVar)) {
            return (Collection) this.fev.invoke(fVar);
        }
        return m.emptyList();
    }

    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> a(d dVar, kotlin.jvm.a.b<? super f, Boolean> bVar) {
        kotlin.jvm.internal.i.f(dVar, "kindFilter");
        kotlin.jvm.internal.i.f(bVar, "nameFilter");
        return (Collection) this.few.invoke();
    }

    /* Access modifiers changed, original: protected|final */
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.k> a(d dVar, kotlin.jvm.a.b<? super f, Boolean> bVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar2) {
        kotlin.jvm.internal.i.f(dVar, "kindFilter");
        kotlin.jvm.internal.i.f(bVar, "nameFilter");
        kotlin.jvm.internal.i.f(bVar2, "location");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (dVar.mr(d.fuu.bNI())) {
            for (f fVar : d(dVar, bVar)) {
                if (((Boolean) bVar.invoke(fVar)).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.j(linkedHashSet, c(fVar, bVar2));
                }
            }
        }
        if (dVar.mr(d.fuu.bNF()) && !dVar.bNq().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.c.a.ftT)) {
            for (f fVar2 : c(dVar, bVar)) {
                if (((Boolean) bVar.invoke(fVar2)).booleanValue()) {
                    linkedHashSet.addAll(b(fVar2, bVar2));
                }
            }
        }
        if (dVar.mr(d.fuu.bNG()) && !dVar.bNq().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.c.a.ftT)) {
            for (f fVar3 : e(dVar, bVar)) {
                if (((Boolean) bVar.invoke(fVar3)).booleanValue()) {
                    linkedHashSet.addAll(a(fVar3, bVar2));
                }
            }
        }
        return u.T(linkedHashSet);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lazy scope for ");
        stringBuilder.append(bwF());
        return stringBuilder.toString();
    }
}

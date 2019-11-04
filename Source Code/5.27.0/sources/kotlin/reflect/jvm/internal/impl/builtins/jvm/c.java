package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.d;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.name.h;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: JavaToKotlinClassMap.kt */
public final class c {
    private static final String fbO;
    private static final String fbP;
    private static final String fbQ;
    private static final String fbR;
    private static final kotlin.reflect.jvm.internal.impl.name.a fbS;
    private static final b fbT;
    private static final kotlin.reflect.jvm.internal.impl.name.a fbU;
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.a> fbV = new HashMap();
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.a> fbW = new HashMap();
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.c, b> fbX = new HashMap();
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.c, b> fbY = new HashMap();
    private static final List<a> fbZ;
    public static final c fca;

    /* compiled from: JavaToKotlinClassMap.kt */
    public static final class a {
        private final kotlin.reflect.jvm.internal.impl.name.a fcb;
        private final kotlin.reflect.jvm.internal.impl.name.a fcc;
        private final kotlin.reflect.jvm.internal.impl.name.a fcd;

        public final kotlin.reflect.jvm.internal.impl.name.a bse() {
            return this.fcb;
        }

        public final kotlin.reflect.jvm.internal.impl.name.a bsf() {
            return this.fcc;
        }

        public final kotlin.reflect.jvm.internal.impl.name.a bsg() {
            return this.fcd;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.fcd, r3.fcd) != false) goto L_0x0029;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a) r3;
            r0 = r2.fcb;
            r1 = r3.fcb;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.fcc;
            r1 = r3.fcc;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.fcd;
            r3 = r3.fcd;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.c$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            kotlin.reflect.jvm.internal.impl.name.a aVar = this.fcb;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            kotlin.reflect.jvm.internal.impl.name.a aVar2 = this.fcc;
            hashCode = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            aVar2 = this.fcd;
            if (aVar2 != null) {
                i = aVar2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PlatformMutabilityMapping(javaClass=");
            stringBuilder.append(this.fcb);
            stringBuilder.append(", kotlinReadOnly=");
            stringBuilder.append(this.fcc);
            stringBuilder.append(", kotlinMutable=");
            stringBuilder.append(this.fcd);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(kotlin.reflect.jvm.internal.impl.name.a aVar, kotlin.reflect.jvm.internal.impl.name.a aVar2, kotlin.reflect.jvm.internal.impl.name.a aVar3) {
            i.f(aVar, "javaClass");
            i.f(aVar2, "kotlinReadOnly");
            i.f(aVar3, "kotlinMutable");
            this.fcb = aVar;
            this.fcc = aVar2;
            this.fcd = aVar3;
        }

        public final kotlin.reflect.jvm.internal.impl.name.a bsd() {
            return this.fcb;
        }
    }

    static {
        int i;
        kotlin.reflect.jvm.internal.impl.name.a s;
        StringBuilder stringBuilder;
        kotlin.reflect.jvm.internal.impl.name.a s2;
        c cVar = new c();
        fca = cVar;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(Kind.Function.getPackageFqName().toString());
        String str = ".";
        stringBuilder2.append(str);
        stringBuilder2.append(Kind.Function.getClassNamePrefix());
        fbO = stringBuilder2.toString();
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(Kind.KFunction.getPackageFqName().toString());
        stringBuilder2.append(str);
        stringBuilder2.append(Kind.KFunction.getClassNamePrefix());
        fbP = stringBuilder2.toString();
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(Kind.SuspendFunction.getPackageFqName().toString());
        stringBuilder2.append(str);
        stringBuilder2.append(Kind.SuspendFunction.getClassNamePrefix());
        fbQ = stringBuilder2.toString();
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(Kind.KSuspendFunction.getPackageFqName().toString());
        stringBuilder2.append(str);
        stringBuilder2.append(Kind.KSuspendFunction.getClassNamePrefix());
        fbR = stringBuilder2.toString();
        kotlin.reflect.jvm.internal.impl.name.a s3 = kotlin.reflect.jvm.internal.impl.name.a.s(new b("kotlin.jvm.functions.FunctionN"));
        i.e(s3, "ClassId.topLevel(FqName(…vm.functions.FunctionN\"))");
        fbS = s3;
        b bJZ = fbS.bJZ();
        i.e(bJZ, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        fbT = bJZ;
        s3 = kotlin.reflect.jvm.internal.impl.name.a.s(new b("kotlin.reflect.KFunction"));
        i.e(s3, "ClassId.topLevel(FqName(…tlin.reflect.KFunction\"))");
        fbU = s3;
        a[] aVarArr = new a[8];
        kotlin.reflect.jvm.internal.impl.name.a s4 = kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.fap);
        i.e(s4, "ClassId.topLevel(FQ_NAMES.iterable)");
        b bVar = g.eZA.fax;
        i.e(bVar, "FQ_NAMES.mutableIterable");
        b packageFqName = s4.getPackageFqName();
        b packageFqName2 = s4.getPackageFqName();
        String str2 = "kotlinReadOnly.packageFqName";
        i.e(packageFqName2, str2);
        bVar = d.b(bVar, packageFqName2);
        int i2 = 0;
        aVarArr[0] = new a(cVar.P(Iterable.class), s4, new kotlin.reflect.jvm.internal.impl.name.a(packageFqName, bVar, false));
        s4 = kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.fao);
        i.e(s4, "ClassId.topLevel(FQ_NAMES.iterator)");
        bVar = g.eZA.faw;
        i.e(bVar, "FQ_NAMES.mutableIterator");
        packageFqName = s4.getPackageFqName();
        b packageFqName3 = s4.getPackageFqName();
        i.e(packageFqName3, str2);
        aVarArr[1] = new a(cVar.P(Iterator.class), s4, new kotlin.reflect.jvm.internal.impl.name.a(packageFqName, d.b(bVar, packageFqName3), false));
        s4 = kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.faq);
        i.e(s4, "ClassId.topLevel(FQ_NAMES.collection)");
        bVar = g.eZA.fay;
        i.e(bVar, "FQ_NAMES.mutableCollection");
        packageFqName = s4.getPackageFqName();
        packageFqName3 = s4.getPackageFqName();
        i.e(packageFqName3, str2);
        aVarArr[2] = new a(cVar.P(Collection.class), s4, new kotlin.reflect.jvm.internal.impl.name.a(packageFqName, d.b(bVar, packageFqName3), false));
        s4 = kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.far);
        i.e(s4, "ClassId.topLevel(FQ_NAMES.list)");
        bVar = g.eZA.faz;
        i.e(bVar, "FQ_NAMES.mutableList");
        packageFqName = s4.getPackageFqName();
        packageFqName3 = s4.getPackageFqName();
        i.e(packageFqName3, str2);
        aVarArr[3] = new a(cVar.P(List.class), s4, new kotlin.reflect.jvm.internal.impl.name.a(packageFqName, d.b(bVar, packageFqName3), false));
        s4 = kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.fat);
        i.e(s4, "ClassId.topLevel(FQ_NAMES.set)");
        bVar = g.eZA.faB;
        i.e(bVar, "FQ_NAMES.mutableSet");
        packageFqName = s4.getPackageFqName();
        packageFqName3 = s4.getPackageFqName();
        i.e(packageFqName3, str2);
        aVarArr[4] = new a(cVar.P(Set.class), s4, new kotlin.reflect.jvm.internal.impl.name.a(packageFqName, d.b(bVar, packageFqName3), false));
        s4 = kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.fas);
        i.e(s4, "ClassId.topLevel(FQ_NAMES.listIterator)");
        bVar = g.eZA.faA;
        i.e(bVar, "FQ_NAMES.mutableListIterator");
        packageFqName = s4.getPackageFqName();
        packageFqName3 = s4.getPackageFqName();
        i.e(packageFqName3, str2);
        aVarArr[5] = new a(cVar.P(ListIterator.class), s4, new kotlin.reflect.jvm.internal.impl.name.a(packageFqName, d.b(bVar, packageFqName3), false));
        s4 = kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.fau);
        i.e(s4, "ClassId.topLevel(FQ_NAMES.map)");
        bVar = g.eZA.faC;
        i.e(bVar, "FQ_NAMES.mutableMap");
        packageFqName = s4.getPackageFqName();
        packageFqName3 = s4.getPackageFqName();
        i.e(packageFqName3, str2);
        aVarArr[6] = new a(cVar.P(Map.class), s4, new kotlin.reflect.jvm.internal.impl.name.a(packageFqName, d.b(bVar, packageFqName3), false));
        s4 = kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.fau).B(g.eZA.fav.bKc());
        i.e(s4, "ClassId.topLevel(FQ_NAME…MES.mapEntry.shortName())");
        bVar = g.eZA.faD;
        i.e(bVar, "FQ_NAMES.mutableMapEntry");
        packageFqName = s4.getPackageFqName();
        packageFqName3 = s4.getPackageFqName();
        i.e(packageFqName3, str2);
        aVarArr[7] = new a(cVar.P(Entry.class), s4, new kotlin.reflect.jvm.internal.impl.name.a(packageFqName, d.b(bVar, packageFqName3), false));
        fbZ = m.listOf(aVarArr);
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = g.eZA.eZD;
        i.e(cVar2, "FQ_NAMES.any");
        cVar.a(Object.class, cVar2);
        cVar2 = g.eZA.eZJ;
        i.e(cVar2, "FQ_NAMES.string");
        cVar.a(String.class, cVar2);
        cVar2 = g.eZA.eZI;
        i.e(cVar2, "FQ_NAMES.charSequence");
        cVar.a(CharSequence.class, cVar2);
        b bVar2 = g.eZA.eZW;
        i.e(bVar2, "FQ_NAMES.throwable");
        cVar.a(Throwable.class, bVar2);
        cVar2 = g.eZA.eZF;
        i.e(cVar2, "FQ_NAMES.cloneable");
        cVar.a(Cloneable.class, cVar2);
        cVar2 = g.eZA.eZT;
        i.e(cVar2, "FQ_NAMES.number");
        cVar.a(Number.class, cVar2);
        bVar2 = g.eZA.eZX;
        i.e(bVar2, "FQ_NAMES.comparable");
        cVar.a(Comparable.class, bVar2);
        cVar2 = g.eZA.eZU;
        i.e(cVar2, "FQ_NAMES._enum");
        cVar.a(Enum.class, cVar2);
        bVar2 = g.eZA.faf;
        i.e(bVar2, "FQ_NAMES.annotation");
        cVar.a(Annotation.class, bVar2);
        for (a a : fbZ) {
            cVar.a(a);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            kotlin.reflect.jvm.internal.impl.name.a s5 = kotlin.reflect.jvm.internal.impl.name.a.s(jvmPrimitiveType.getWrapperFqName());
            i.e(s5, "ClassId.topLevel(jvmType.wrapperFqName)");
            s = kotlin.reflect.jvm.internal.impl.name.a.s(g.d(jvmPrimitiveType.getPrimitiveType()));
            i.e(s, "ClassId.topLevel(KotlinB…e(jvmType.primitiveType))");
            cVar.a(s5, s);
        }
        for (kotlin.reflect.jvm.internal.impl.name.a s42 : kotlin.reflect.jvm.internal.impl.builtins.c.eZl.bqt()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("kotlin.jvm.internal.");
            stringBuilder.append(s42.bJV().boi());
            stringBuilder.append("CompanionObject");
            s2 = kotlin.reflect.jvm.internal.impl.name.a.s(new b(stringBuilder.toString()));
            i.e(s2, "ClassId.topLevel(FqName(…g() + \"CompanionObject\"))");
            s42 = s42.B(h.fpA);
            i.e(s42, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            cVar.a(s2, s42);
        }
        for (i = 0; i < 23; i++) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("kotlin.jvm.functions.Function");
            stringBuilder.append(i);
            s2 = kotlin.reflect.jvm.internal.impl.name.a.s(new b(stringBuilder.toString()));
            i.e(s2, "ClassId.topLevel(FqName(…m.functions.Function$i\"))");
            s = g.jO(i);
            i.e(s, "KotlinBuiltIns.getFunctionClassId(i)");
            cVar.a(s2, s);
            stringBuilder = new StringBuilder();
            stringBuilder.append(fbP);
            stringBuilder.append(i);
            cVar.a(new b(stringBuilder.toString()), fbU);
        }
        while (i2 < 22) {
            Kind kind = Kind.KSuspendFunction;
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(kind.getPackageFqName().toString());
            stringBuilder3.append(str);
            stringBuilder3.append(kind.getClassNamePrefix());
            String stringBuilder4 = stringBuilder3.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder4);
            stringBuilder.append(i2);
            cVar.a(new b(stringBuilder.toString()), fbU);
            i2++;
        }
        bJZ = g.eZA.eZE.bKf();
        i.e(bJZ, "FQ_NAMES.nothing.toSafe()");
        cVar.a(bJZ, cVar.P(Void.class));
    }

    private c() {
    }

    public final b bsb() {
        return fbT;
    }

    public final List<a> bsc() {
        return fbZ;
    }

    public final kotlin.reflect.jvm.internal.impl.name.a e(b bVar) {
        i.f(bVar, "fqName");
        return (kotlin.reflect.jvm.internal.impl.name.a) fbV.get(bVar.bKa());
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d a(c cVar, b bVar, g gVar, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = (Integer) null;
        }
        return cVar.a(bVar, gVar, num);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.d a(b bVar, g gVar, Integer num) {
        kotlin.reflect.jvm.internal.impl.name.a e;
        i.f(bVar, "fqName");
        i.f(gVar, "builtIns");
        if (num == null || !i.y(bVar, fbT)) {
            e = e(bVar);
        } else {
            e = g.jO(num.intValue());
        }
        return e != null ? gVar.c(e.bJZ()) : null;
    }

    public final kotlin.reflect.jvm.internal.impl.name.a c(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        i.f(cVar, "kotlinFqName");
        if (a(cVar, fbO)) {
            return fbS;
        }
        if (a(cVar, fbQ)) {
            return fbS;
        }
        if (a(cVar, fbP)) {
            return fbU;
        }
        if (a(cVar, fbR)) {
            return fbU;
        }
        return (kotlin.reflect.jvm.internal.impl.name.a) fbW.get(cVar);
    }

    private final boolean a(kotlin.reflect.jvm.internal.impl.name.c cVar, String str) {
        String boi = cVar.boi();
        i.e(boi, "kotlinFqName.asString()");
        boi = v.w(boi, str, "");
        CharSequence charSequence = boi;
        boolean z = true;
        if ((charSequence.length() > 0 ? 1 : null) == null || v.a(charSequence, '0', false, 2, null)) {
            return false;
        }
        Integer mW = t.mW(boi);
        if (mW == null || mW.intValue() < 23) {
            z = false;
        }
        return z;
    }

    private final void a(a aVar) {
        kotlin.reflect.jvm.internal.impl.name.a bse = aVar.bse();
        kotlin.reflect.jvm.internal.impl.name.a bsf = aVar.bsf();
        kotlin.reflect.jvm.internal.impl.name.a bsg = aVar.bsg();
        a(bse, bsf);
        b bJZ = bsg.bJZ();
        String str = "mutableClassId.asSingleFqName()";
        i.e(bJZ, str);
        a(bJZ, bse);
        b bJZ2 = bsf.bJZ();
        i.e(bJZ2, "readOnlyClassId.asSingleFqName()");
        b bJZ3 = bsg.bJZ();
        i.e(bJZ3, str);
        fbX.put(bsg.bJZ().bKa(), bJZ2);
        fbY.put(bJZ2.bKa(), bJZ3);
    }

    private final void a(kotlin.reflect.jvm.internal.impl.name.a aVar, kotlin.reflect.jvm.internal.impl.name.a aVar2) {
        b(aVar, aVar2);
        b bJZ = aVar2.bJZ();
        i.e(bJZ, "kotlinClassId.asSingleFqName()");
        a(bJZ, aVar);
    }

    private final void a(Class<?> cls, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        b bKf = cVar.bKf();
        i.e(bKf, "kotlinFqName.toSafe()");
        a((Class) cls, bKf);
    }

    private final void a(Class<?> cls, b bVar) {
        kotlin.reflect.jvm.internal.impl.name.a P = P(cls);
        kotlin.reflect.jvm.internal.impl.name.a s = kotlin.reflect.jvm.internal.impl.name.a.s(bVar);
        i.e(s, "ClassId.topLevel(kotlinFqName)");
        a(P, s);
    }

    private final void b(kotlin.reflect.jvm.internal.impl.name.a aVar, kotlin.reflect.jvm.internal.impl.name.a aVar2) {
        fbV.put(aVar.bJZ().bKa(), aVar2);
    }

    private final void a(b bVar, kotlin.reflect.jvm.internal.impl.name.a aVar) {
        fbW.put(bVar.bKa(), aVar);
    }

    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> a(b bVar, g gVar) {
        i.f(bVar, "fqName");
        i.f(gVar, "builtIns");
        kotlin.reflect.jvm.internal.impl.descriptors.d a = a(this, bVar, gVar, null, 4, null);
        if (a == null) {
            return al.emptySet();
        }
        b bVar2 = (b) fbY.get(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.z(a));
        if (bVar2 == null) {
            return ak.df(a);
        }
        i.e(bVar2, "readOnlyToMutable[kotlin…eturn setOf(kotlinAnalog)");
        List asList = Arrays.asList(new kotlin.reflect.jvm.internal.impl.descriptors.d[]{a, gVar.c(bVar2)});
        i.e(asList, "Arrays.asList(kotlinAnal…tlinMutableAnalogFqName))");
        return asList;
    }

    public final boolean h(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        i.f(dVar, "mutable");
        return fbX.containsKey(kotlin.reflect.jvm.internal.impl.resolve.c.w(dVar));
    }

    public final boolean K(w wVar) {
        i.f(wVar, "type");
        kotlin.reflect.jvm.internal.impl.descriptors.d be = au.be(wVar);
        return be != null && h(be);
    }

    public final boolean i(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        i.f(dVar, "readOnly");
        return fbY.containsKey(kotlin.reflect.jvm.internal.impl.resolve.c.w(dVar));
    }

    public final boolean L(w wVar) {
        i.f(wVar, "type");
        kotlin.reflect.jvm.internal.impl.descriptors.d be = au.be(wVar);
        return be != null && i(be);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.d j(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        String str = "mutable";
        i.f(dVar, str);
        return a(dVar, (Map) fbX, str);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.d k(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        i.f(dVar, "readOnly");
        return a(dVar, (Map) fbY, "read-only");
    }

    private final kotlin.reflect.jvm.internal.impl.name.a P(Class<?> cls) {
        Object obj = (cls.isPrimitive() || cls.isArray()) ? null : 1;
        if (m.eVC && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid class: ");
            stringBuilder.append(cls);
            throw new AssertionError(stringBuilder.toString());
        }
        Class declaringClass = cls.getDeclaringClass();
        kotlin.reflect.jvm.internal.impl.name.a s;
        if (declaringClass == null) {
            s = kotlin.reflect.jvm.internal.impl.name.a.s(new b(cls.getCanonicalName()));
            i.e(s, "ClassId.topLevel(FqName(clazz.canonicalName))");
            return s;
        }
        s = P(declaringClass).B(f.ms(cls.getSimpleName()));
        i.e(s, "classId(outer).createNes…tifier(clazz.simpleName))");
        return s;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d a(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, Map<kotlin.reflect.jvm.internal.impl.name.c, b> map, String str) {
        k kVar = dVar;
        b bVar = (b) map.get(kotlin.reflect.jvm.internal.impl.resolve.c.w(kVar));
        if (bVar != null) {
            dVar = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(kVar).c(bVar);
            i.e(dVar, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return dVar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Given class ");
        stringBuilder.append(dVar);
        stringBuilder.append(" is not a ");
        stringBuilder.append(str);
        stringBuilder.append(" collection");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

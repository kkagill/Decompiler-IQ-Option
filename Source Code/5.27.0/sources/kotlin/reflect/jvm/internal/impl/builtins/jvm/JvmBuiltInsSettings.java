package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.x;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.z;

/* compiled from: JvmBuiltInsSettings.kt */
public class JvmBuiltInsSettings implements kotlin.reflect.jvm.internal.impl.descriptors.a.a, kotlin.reflect.jvm.internal.impl.descriptors.a.c {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(JvmBuiltInsSettings.class), "ownerModuleDescriptor", "getOwnerModuleDescriptor()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;")), k.a(new PropertyReference1Impl(k.G(JvmBuiltInsSettings.class), "isAdditionalBuiltInsFeatureSupported", "isAdditionalBuiltInsFeatureSupported()Z")), k.a(new PropertyReference1Impl(k.G(JvmBuiltInsSettings.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), k.a(new PropertyReference1Impl(k.G(JvmBuiltInsSettings.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    private static final Set<String> fcA;
    private static final Set<String> fcB;
    public static final a fcC = new a();
    private static final Set<String> fcw;
    private static final Set<String> fcx;
    private static final Set<String> fcy;
    private static final Set<String> fcz;
    private final v fcf;
    private final c fcp = c.fca;
    private final kotlin.d fcq;
    private final kotlin.d fcr;
    private final w fcs;
    private final kotlin.reflect.jvm.internal.impl.storage.e fct;
    private final kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.descriptors.d> fcu;
    private final kotlin.reflect.jvm.internal.impl.storage.e fcv;

    /* compiled from: JvmBuiltInsSettings.kt */
    private enum JDKMemberStatus {
        BLACK_LIST,
        WHITE_LIST,
        NOT_CONSIDERED,
        DROP
    }

    /* compiled from: JvmBuiltInsSettings.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final boolean d(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            i.f(cVar, "fqName");
            if (e(cVar)) {
                return true;
            }
            kotlin.reflect.jvm.internal.impl.name.a c = c.fca.c(cVar);
            if (c != null) {
                try {
                    return Serializable.class.isAssignableFrom(Class.forName(c.bJZ().boi()));
                } catch (ClassNotFoundException unused) {
                }
            }
            return false;
        }

        private final boolean e(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            return i.y(cVar, g.eZA.eZK) || g.b(cVar);
        }

        public final Set<String> bsy() {
            return JvmBuiltInsSettings.fcw;
        }

        public final Set<String> bsz() {
            return JvmBuiltInsSettings.fcx;
        }

        public final Set<String> bsB() {
            return JvmBuiltInsSettings.fcy;
        }

        private final Set<String> bsA() {
            u uVar = u.fmf;
            Collection linkedHashSet = new LinkedHashSet();
            for (JvmPrimitiveType jvmPrimitiveType : m.listOf(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR)) {
                String boi = jvmPrimitiveType.getWrapperFqName().bKc().boi();
                i.e(boi, "it.wrapperFqName.shortName().asString()");
                String[] strArr = new String[1];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(jvmPrimitiveType.getJavaKeywordName());
                stringBuilder.append("Value()");
                stringBuilder.append(jvmPrimitiveType.getDesc());
                strArr[0] = stringBuilder.toString();
                r.a(linkedHashSet, (Iterable) uVar.c(boi, strArr));
            }
            return (LinkedHashSet) linkedHashSet;
        }

        private final Set<String> bsC() {
            u uVar = u.fmf;
            Collection linkedHashSet = new LinkedHashSet();
            for (JvmPrimitiveType wrapperFqName : m.listOf(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.BYTE, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, JvmPrimitiveType.BYTE, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT)) {
                String boi = wrapperFqName.getWrapperFqName().bKc().boi();
                i.e(boi, "it.wrapperFqName.shortName().asString()");
                String[] i = uVar.i("Ljava/lang/String;");
                r.a(linkedHashSet, (Iterable) uVar.c(boi, (String[]) Arrays.copyOf(i, i.length)));
            }
            return (LinkedHashSet) linkedHashSet;
        }
    }

    /* compiled from: JvmBuiltInsSettings.kt */
    static final class c<N> implements kotlin.reflect.jvm.internal.impl.utils.b.b<N> {
        final /* synthetic */ JvmBuiltInsSettings this$0;

        c(JvmBuiltInsSettings jvmBuiltInsSettings) {
            this.this$0 = jvmBuiltInsSettings;
        }

        /* renamed from: q */
        public final List<f> dy(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
            i.e(dVar, "it");
            an brm = dVar.brm();
            i.e(brm, "it.typeConstructor");
            Collection<w> bup = brm.bup();
            i.e(bup, "it.typeConstructor.supertypes");
            Collection arrayList = new ArrayList();
            for (w bMZ : bup) {
                kotlin.reflect.jvm.internal.impl.descriptors.f brQ = bMZ.bMZ().brQ();
                Object obj = null;
                brQ = brQ != null ? brQ.bsX() : null;
                if (!(brQ instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
                    brQ = null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) brQ;
                if (dVar2 != null) {
                    obj = this.this$0.o(dVar2);
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            return (List) arrayList;
        }
    }

    /* compiled from: JvmBuiltInsSettings.kt */
    static final class e<N> implements kotlin.reflect.jvm.internal.impl.utils.b.b<N> {
        public static final e fcF = new e();

        e() {
        }

        /* renamed from: e */
        public final Collection<? extends CallableMemberDescriptor> dy(CallableMemberDescriptor callableMemberDescriptor) {
            i.e(callableMemberDescriptor, "it");
            callableMemberDescriptor = callableMemberDescriptor.bsS();
            i.e(callableMemberDescriptor, "it.original");
            return callableMemberDescriptor.bsR();
        }
    }

    /* compiled from: JvmBuiltInsSettings.kt */
    public static final class d extends kotlin.reflect.jvm.internal.impl.utils.b.a<kotlin.reflect.jvm.internal.impl.descriptors.d, JDKMemberStatus> {
        final /* synthetic */ String fcD;
        final /* synthetic */ ObjectRef fcE;

        d(String str, ObjectRef objectRef) {
            this.fcD = str;
            this.fcE = objectRef;
        }

        /* renamed from: r */
        public boolean dz(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
            i.f(dVar, "javaClassDescriptor");
            String a = u.fmf.a(dVar, this.fcD);
            if (JvmBuiltInsSettings.fcC.bsz().contains(a)) {
                this.fcE.element = JDKMemberStatus.BLACK_LIST;
            } else if (JvmBuiltInsSettings.fcC.bsB().contains(a)) {
                this.fcE.element = JDKMemberStatus.WHITE_LIST;
            } else if (JvmBuiltInsSettings.fcC.bsy().contains(a)) {
                this.fcE.element = JDKMemberStatus.DROP;
            }
            return ((JDKMemberStatus) this.fcE.element) == null;
        }

        /* renamed from: bsH */
        public JDKMemberStatus bsI() {
            JDKMemberStatus jDKMemberStatus = (JDKMemberStatus) this.fcE.element;
            return jDKMemberStatus != null ? jDKMemberStatus : JDKMemberStatus.NOT_CONSIDERED;
        }
    }

    /* compiled from: JvmBuiltInsSettings.kt */
    public static final class b extends x {
        final /* synthetic */ JvmBuiltInsSettings this$0;

        b(JvmBuiltInsSettings jvmBuiltInsSettings, v vVar, kotlin.reflect.jvm.internal.impl.name.b bVar) {
            this.this$0 = jvmBuiltInsSettings;
            super(vVar, bVar);
        }

        /* renamed from: bsE */
        public kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c bsF() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c.fuD;
        }
    }

    private final v bsr() {
        kotlin.d dVar = this.fcq;
        j jVar = anY[0];
        return (v) dVar.getValue();
    }

    private final boolean bss() {
        kotlin.d dVar = this.fcr;
        j jVar = anY[1];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    private final ad bst() {
        return (ad) kotlin.reflect.jvm.internal.impl.storage.g.a(this.fct, (Object) this, anY[2]);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.f bsu() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.f) kotlin.reflect.jvm.internal.impl.storage.g.a(this.fcv, (Object) this, anY[3]);
    }

    public JvmBuiltInsSettings(v vVar, h hVar, kotlin.jvm.a.a<? extends v> aVar, kotlin.jvm.a.a<Boolean> aVar2) {
        i.f(vVar, "moduleDescriptor");
        i.f(hVar, "storageManager");
        i.f(aVar, "deferredOwnerModuleDescriptor");
        i.f(aVar2, "isAdditionalBuiltInsFeatureSupported");
        this.fcf = vVar;
        this.fcq = g.c(aVar);
        this.fcr = g.c(aVar2);
        this.fcs = a(hVar);
        this.fct = hVar.f(new JvmBuiltInsSettings$cloneableType$2(this, hVar));
        this.fcu = hVar.bPb();
        this.fcv = hVar.f(new JvmBuiltInsSettings$notConsideredDeprecation$2(this));
    }

    private final w a(h hVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.h hVar2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.h(new b(this, this.fcf, new kotlin.reflect.jvm.internal.impl.name.b("java.io")), kotlin.reflect.jvm.internal.impl.name.f.ms("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, l.listOf(new z(hVar, new JvmBuiltInsSettings$createMockJavaIoSerializableType$superTypes$1(this))), aj.fcV, false, hVar);
        hVar2.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c.fuD, al.emptySet(), null);
        ad bsY = hVar2.bsY();
        i.e(bsY, "mockSerializableClass.defaultType");
        return bsY;
    }

    public Collection<w> l(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        i.f(dVar, "classDescriptor");
        kotlin.reflect.jvm.internal.impl.name.c z = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.z(dVar);
        if (fcC.e(z)) {
            w[] wVarArr = new w[2];
            ad bst = bst();
            i.e(bst, "cloneableType");
            wVarArr[0] = bst;
            wVarArr[1] = this.fcs;
            return m.listOf(wVarArr);
        } else if (fcC.d(z)) {
            return l.listOf(this.fcs);
        } else {
            return m.emptyList();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c4 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c4 A:{SYNTHETIC} */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ai> a(kotlin.reflect.jvm.internal.impl.name.f r7, kotlin.reflect.jvm.internal.impl.descriptors.d r8) {
        /*
        r6 = this;
        r0 = "name";
        kotlin.jvm.internal.i.f(r7, r0);
        r0 = "classDescriptor";
        kotlin.jvm.internal.i.f(r8, r0);
        r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.a.fbL;
        r0 = r0.brX();
        r0 = kotlin.jvm.internal.i.y(r7, r0);
        r1 = 1;
        if (r0 == 0) goto L_0x009f;
    L_0x0017:
        r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d;
        if (r0 == 0) goto L_0x009f;
    L_0x001b:
        r0 = kotlin.reflect.jvm.internal.impl.builtins.g.c(r8);
        if (r0 == 0) goto L_0x009f;
    L_0x0021:
        r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d) r8;
        r0 = r8.bOJ();
        r0 = r0.bAF();
        r2 = "classDescriptor.classProto.functionList";
        kotlin.jvm.internal.i.e(r0, r2);
        r0 = (java.lang.Iterable) r0;
        r2 = r0 instanceof java.util.Collection;
        r3 = 0;
        if (r2 == 0) goto L_0x0041;
    L_0x0037:
        r2 = r0;
        r2 = (java.util.Collection) r2;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0073;
    L_0x0041:
        r0 = r0.iterator();
    L_0x0045:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0073;
    L_0x004b:
        r2 = r0.next();
        r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r2;
        r4 = r8.bOB();
        r4 = r4.bot();
        r5 = "functionProto";
        kotlin.jvm.internal.i.e(r2, r5);
        r2 = r2.bCg();
        r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.q.b(r4, r2);
        r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.a.fbL;
        r4 = r4.brX();
        r2 = kotlin.jvm.internal.i.y(r2, r4);
        if (r2 == 0) goto L_0x0045;
    L_0x0072:
        r3 = 1;
    L_0x0073:
        if (r3 == 0) goto L_0x007c;
    L_0x0075:
        r7 = kotlin.collections.m.emptyList();
        r7 = (java.util.Collection) r7;
        return r7;
    L_0x007c:
        r0 = r6.bst();
        r0 = r0.bsF();
        r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS;
        r1 = (kotlin.reflect.jvm.internal.impl.incremental.components.b) r1;
        r7 = r0.b(r7, r1);
        r7 = (java.lang.Iterable) r7;
        r7 = kotlin.collections.u.N(r7);
        r7 = (kotlin.reflect.jvm.internal.impl.descriptors.ai) r7;
        r7 = r6.a(r8, r7);
        r7 = kotlin.collections.l.listOf(r7);
        r7 = (java.util.Collection) r7;
        return r7;
    L_0x009f:
        r0 = r6.bss();
        if (r0 != 0) goto L_0x00ac;
    L_0x00a5:
        r7 = kotlin.collections.m.emptyList();
        r7 = (java.util.Collection) r7;
        return r7;
    L_0x00ac:
        r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$getFunctions$2;
        r0.<init>(r7);
        r0 = (kotlin.jvm.a.b) r0;
        r7 = r6.a(r8, r0);
        r7 = (java.lang.Iterable) r7;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r7 = r7.iterator();
    L_0x00c4:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x0156;
    L_0x00ca:
        r2 = r7.next();
        r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ai) r2;
        r3 = r2.brj();
        if (r3 == 0) goto L_0x014e;
    L_0x00d6:
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r3;
        r3 = kotlin.reflect.jvm.internal.impl.builtins.jvm.g.a(r3, r8);
        r3 = r3.bPF();
        r3 = r2.c(r3);
        if (r3 == 0) goto L_0x0146;
    L_0x00e6:
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ai) r3;
        r3 = r3.btp();
        r4 = r8;
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r4;
        r3.i(r4);
        r4 = r8.bte();
        r3.b(r4);
        r3.btr();
        r2 = (kotlin.reflect.jvm.internal.impl.descriptors.s) r2;
        r2 = r6.f(r2);
        r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.f.aob;
        r2 = r2.ordinal();
        r2 = r4[r2];
        r4 = 0;
        if (r2 == r1) goto L_0x0123;
    L_0x010d:
        r5 = 2;
        if (r2 == r5) goto L_0x0115;
    L_0x0110:
        r5 = 3;
        if (r2 == r5) goto L_0x013f;
    L_0x0113:
        r4 = 4;
        goto L_0x0133;
    L_0x0115:
        r2 = r6.bsu();
        r2 = r3.a(r2);
        r4 = "setAdditionalAnnotations(notConsideredDeprecation)";
        kotlin.jvm.internal.i.e(r2, r4);
        goto L_0x0133;
    L_0x0123:
        r2 = kotlin.reflect.jvm.internal.impl.descriptors.u.s(r8);
        if (r2 == 0) goto L_0x012a;
    L_0x0129:
        goto L_0x013f;
    L_0x012a:
        r2 = r3.btu();
        r4 = "setHiddenForResolutionEverywhereBesideSupercalls()";
        kotlin.jvm.internal.i.e(r2, r4);
    L_0x0133:
        r2 = r3.btv();
        if (r2 != 0) goto L_0x013c;
    L_0x0139:
        kotlin.jvm.internal.i.bnJ();
    L_0x013c:
        r4 = r2;
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ai) r4;
    L_0x013f:
        if (r4 == 0) goto L_0x00c4;
    L_0x0141:
        r0.add(r4);
        goto L_0x00c4;
    L_0x0146:
        r7 = new kotlin.TypeCastException;
        r8 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor";
        r7.<init>(r8);
        throw r7;
    L_0x014e:
        r7 = new kotlin.TypeCastException;
        r8 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor";
        r7.<init>(r8);
        throw r7;
    L_0x0156:
        r0 = (java.util.List) r0;
        r0 = (java.util.Collection) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.a(kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d):java.util.Collection");
    }

    /* JADX WARNING: Missing block: B:9:0x0020, code skipped:
            if (r2 != null) goto L_0x0027;
     */
    /* renamed from: m */
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> n(kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
        /*
        r1 = this;
        r0 = "classDescriptor";
        kotlin.jvm.internal.i.f(r2, r0);
        r0 = r1.bss();
        if (r0 != 0) goto L_0x0010;
    L_0x000b:
        r2 = kotlin.collections.al.emptySet();
        return r2;
    L_0x0010:
        r2 = r1.o(r2);
        if (r2 == 0) goto L_0x0023;
    L_0x0016:
        r2 = r2.bro();
        if (r2 == 0) goto L_0x0023;
    L_0x001c:
        r2 = r2.bux();
        if (r2 == 0) goto L_0x0023;
    L_0x0022:
        goto L_0x0027;
    L_0x0023:
        r2 = kotlin.collections.al.emptySet();
    L_0x0027:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.n(kotlin.reflect.jvm.internal.impl.descriptors.d):java.util.Set");
    }

    private final Collection<ai> a(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.h, ? extends Collection<? extends ai>> bVar) {
        f o = o(dVar);
        if (o == null) {
            return m.emptyList();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar = o;
        Iterable<kotlin.reflect.jvm.internal.impl.descriptors.d> a = this.fcp.a(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x(kVar), b.fbN.bsa());
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) u.M(a);
        if (dVar2 == null) {
            return m.emptyList();
        }
        kotlin.reflect.jvm.internal.impl.utils.i.b bVar2 = kotlin.reflect.jvm.internal.impl.utils.i.fAh;
        Collection arrayList = new ArrayList(n.e(a, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.d x : a) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x(x));
        }
        kotlin.reflect.jvm.internal.impl.utils.i R = bVar2.R((List) arrayList);
        boolean h = this.fcp.h(dVar);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h bro = ((kotlin.reflect.jvm.internal.impl.descriptors.d) this.fcu.b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x(kVar), new JvmBuiltInsSettings$getAdditionalFunctions$fakeJavaClassDescriptor$1(o, dVar2))).bro();
        i.e(bro, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
        Iterable iterable = (Iterable) bVar.invoke(bro);
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable) {
            ai aiVar = (ai) next;
            Object obj = null;
            if (aiVar.bsT() == Kind.DECLARATION && aiVar.brx().bue() && !g.g((kotlin.reflect.jvm.internal.impl.descriptors.k) aiVar)) {
                Object obj2;
                Collection bsR = aiVar.bsR();
                i.e(bsR, "analogueMember.overriddenDescriptors");
                Iterable<s> iterable2 = bsR;
                if (!((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty())) {
                    for (s sVar : iterable2) {
                        i.e(sVar, "it");
                        kotlin.reflect.jvm.internal.impl.descriptors.k brj = sVar.brj();
                        i.e(brj, "it.containingDeclaration");
                        if (R.contains(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x(brj))) {
                            obj2 = 1;
                            break;
                        }
                    }
                }
                obj2 = null;
                if (obj2 == null && !a(aiVar, h)) {
                    obj = 1;
                }
            }
            if (obj != null) {
                arrayList2.add(next);
            }
        }
        return (List) arrayList2;
    }

    private final ai a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d dVar, ai aiVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.s.a btp = aiVar.btp();
        btp.i(dVar);
        btp.a(av.fde);
        btp.N(dVar.bsY());
        btp.b(dVar.bte());
        s btv = btp.btv();
        if (btv == null) {
            i.bnJ();
        }
        return (ai) btv;
    }

    private final boolean a(ai aiVar, boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.k brj = aiVar.brj();
        if (brj != null) {
            if ((z ^ fcz.contains(u.fmf.a((kotlin.reflect.jvm.internal.impl.descriptors.d) brj, r.a(aiVar, false, false, 3, null)))) != 0) {
                return true;
            }
            Boolean a = kotlin.reflect.jvm.internal.impl.utils.b.a((Collection) l.listOf(aiVar), (kotlin.reflect.jvm.internal.impl.utils.b.b) e.fcF, (kotlin.jvm.a.b) new JvmBuiltInsSettings$isMutabilityViolation$2(this));
            i.e(a, "DFS.ifAny<CallableMember…lassDescriptor)\n        }");
            return a.booleanValue();
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    private final JDKMemberStatus f(s sVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.k brj = sVar.brj();
        if (brj != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) brj;
            String a = r.a(sVar, false, false, 3, null);
            ObjectRef objectRef = new ObjectRef();
            objectRef.element = (JDKMemberStatus) null;
            Object a2 = kotlin.reflect.jvm.internal.impl.utils.b.a((Collection) l.listOf(dVar), (kotlin.reflect.jvm.internal.impl.utils.b.b) new c(this), (kotlin.reflect.jvm.internal.impl.utils.b.c) new d(a, objectRef));
            i.e(a2, "DFS.dfs<ClassDescriptor,…CONSIDERED\n            })");
            return (JDKMemberStatus) a2;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    private final f o(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (g.f(dVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar = dVar;
        if (!g.d(kVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.c z = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.z(kVar);
        if (!z.bKe()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.a c = this.fcp.c(z);
        if (c != null) {
            kotlin.reflect.jvm.internal.impl.name.b bJZ = c.bJZ();
            if (bJZ != null) {
                i.e(bJZ, "j2kClassMap.mapKotlinToJ…leFqName() ?: return null");
                dVar = p.a(bsr(), bJZ, NoLookupLocation.FROM_BUILTINS);
                if (!(dVar instanceof f)) {
                    dVar = null;
                }
                return (f) dVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0058 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e1  */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> p(kotlin.reflect.jvm.internal.impl.descriptors.d r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = "classDescriptor";
        kotlin.jvm.internal.i.f(r1, r2);
        r2 = r18.brt();
        r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS;
        if (r2 != r3) goto L_0x0169;
    L_0x0011:
        r2 = r17.bss();
        if (r2 != 0) goto L_0x0019;
    L_0x0017:
        goto L_0x0169;
    L_0x0019:
        r2 = r17.o(r18);
        if (r2 == 0) goto L_0x0162;
    L_0x001f:
        r3 = r0.fcp;
        r4 = r2;
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r4;
        r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x(r4);
        r5 = kotlin.reflect.jvm.internal.impl.builtins.jvm.b.fbN;
        r5 = r5.bsa();
        r6 = 0;
        r7 = 4;
        r8 = 0;
        r3 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a(r3, r4, r5, r6, r7, r8);
        if (r3 == 0) goto L_0x015b;
    L_0x0037:
        r4 = r2;
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r4;
        r5 = kotlin.reflect.jvm.internal.impl.builtins.jvm.g.a(r3, r4);
        r5 = r5.bPF();
        r6 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$getConstructors$1;
        r6.<init>(r5);
        r2 = r2.brs();
        r2 = (java.lang.Iterable) r2;
        r7 = new java.util.ArrayList;
        r7.<init>();
        r7 = (java.util.Collection) r7;
        r2 = r2.iterator();
    L_0x0058:
        r8 = r2.hasNext();
        r9 = 0;
        r10 = 3;
        r11 = "javaConstructor";
        r12 = 0;
        if (r8 == 0) goto L_0x00e6;
    L_0x0063:
        r8 = r2.next();
        r13 = r8;
        r13 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r13;
        kotlin.jvm.internal.i.e(r13, r11);
        r11 = r13.brx();
        r11 = r11.bue();
        if (r11 == 0) goto L_0x00dd;
    L_0x0077:
        r11 = r3.brs();
        r15 = "defaultKotlinVersion.constructors";
        kotlin.jvm.internal.i.e(r11, r15);
        r11 = (java.lang.Iterable) r11;
        r15 = r11 instanceof java.util.Collection;
        if (r15 == 0) goto L_0x0091;
    L_0x0086:
        r15 = r11;
        r15 = (java.util.Collection) r15;
        r15 = r15.isEmpty();
        if (r15 == 0) goto L_0x0091;
    L_0x008f:
        r14 = 1;
        goto L_0x00b2;
    L_0x0091:
        r11 = r11.iterator();
    L_0x0095:
        r15 = r11.hasNext();
        if (r15 == 0) goto L_0x008f;
    L_0x009b:
        r15 = r11.next();
        r15 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r15;
        r14 = "it";
        kotlin.jvm.internal.i.e(r15, r14);
        r15 = (kotlin.reflect.jvm.internal.impl.descriptors.j) r15;
        r14 = r13;
        r14 = (kotlin.reflect.jvm.internal.impl.descriptors.j) r14;
        r14 = r6.a(r15, r14);
        if (r14 == 0) goto L_0x0095;
    L_0x00b1:
        r14 = 0;
    L_0x00b2:
        if (r14 == 0) goto L_0x00dd;
    L_0x00b4:
        r11 = r13;
        r11 = (kotlin.reflect.jvm.internal.impl.descriptors.j) r11;
        r11 = r0.a(r11, r1);
        if (r11 != 0) goto L_0x00dd;
    L_0x00bd:
        r11 = r13;
        r11 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r11;
        r11 = kotlin.reflect.jvm.internal.impl.builtins.g.g(r11);
        if (r11 != 0) goto L_0x00dd;
    L_0x00c6:
        r11 = fcA;
        r14 = kotlin.reflect.jvm.internal.impl.load.kotlin.u.fmf;
        r13 = (kotlin.reflect.jvm.internal.impl.descriptors.s) r13;
        r9 = kotlin.reflect.jvm.internal.impl.load.kotlin.r.a(r13, r12, r12, r10, r9);
        r9 = r14.a(r4, r9);
        r9 = r11.contains(r9);
        if (r9 != 0) goto L_0x00dd;
    L_0x00da:
        r16 = 1;
        goto L_0x00df;
    L_0x00dd:
        r16 = 0;
    L_0x00df:
        if (r16 == 0) goto L_0x0058;
    L_0x00e1:
        r7.add(r8);
        goto L_0x0058;
    L_0x00e6:
        r7 = (java.util.List) r7;
        r7 = (java.lang.Iterable) r7;
        r2 = new java.util.ArrayList;
        r3 = 10;
        r3 = kotlin.collections.n.e(r7, r3);
        r2.<init>(r3);
        r2 = (java.util.Collection) r2;
        r3 = r7.iterator();
    L_0x00fb:
        r6 = r3.hasNext();
        if (r6 == 0) goto L_0x0156;
    L_0x0101:
        r6 = r3.next();
        r6 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r6;
        r7 = r6.btp();
        r8 = r1;
        r8 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r8;
        r7.i(r8);
        r8 = r18.bsY();
        r8 = (kotlin.reflect.jvm.internal.impl.types.w) r8;
        r7.N(r8);
        r7.btr();
        r8 = r5.bPG();
        r7.b(r8);
        r8 = fcB;
        r13 = kotlin.reflect.jvm.internal.impl.load.kotlin.u.fmf;
        kotlin.jvm.internal.i.e(r6, r11);
        r6 = (kotlin.reflect.jvm.internal.impl.descriptors.s) r6;
        r6 = kotlin.reflect.jvm.internal.impl.load.kotlin.r.a(r6, r12, r12, r10, r9);
        r6 = r13.a(r4, r6);
        r6 = r8.contains(r6);
        if (r6 != 0) goto L_0x0142;
    L_0x013b:
        r6 = r17.bsu();
        r7.a(r6);
    L_0x0142:
        r6 = r7.btv();
        if (r6 == 0) goto L_0x014e;
    L_0x0148:
        r6 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r6;
        r2.add(r6);
        goto L_0x00fb;
    L_0x014e:
        r1 = new kotlin.TypeCastException;
        r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor";
        r1.<init>(r2);
        throw r1;
    L_0x0156:
        r2 = (java.util.List) r2;
        r2 = (java.util.Collection) r2;
        return r2;
    L_0x015b:
        r1 = kotlin.collections.m.emptyList();
        r1 = (java.util.Collection) r1;
        return r1;
    L_0x0162:
        r1 = kotlin.collections.m.emptyList();
        r1 = (java.util.Collection) r1;
        return r1;
    L_0x0169:
        r1 = kotlin.collections.m.emptyList();
        r1 = (java.util.Collection) r1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.p(kotlin.reflect.jvm.internal.impl.descriptors.d):java.util.Collection");
    }

    public boolean a(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, ai aiVar) {
        i.f(dVar, "classDescriptor");
        i.f(aiVar, "functionDescriptor");
        f o = o(dVar);
        if (o == null || !aiVar.brE().j(kotlin.reflect.jvm.internal.impl.descriptors.a.d.buh())) {
            return true;
        }
        boolean z = false;
        if (!bss()) {
            return false;
        }
        String a = r.a(aiVar, false, false, 3, null);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g bww = o.bro();
        kotlin.reflect.jvm.internal.impl.name.f bsZ = aiVar.bsZ();
        i.e(bsZ, "functionDescriptor.name");
        Iterable<ai> b = bww.b(bsZ, (kotlin.reflect.jvm.internal.impl.incremental.components.b) NoLookupLocation.FROM_BUILTINS);
        if (!(b instanceof Collection) || !((Collection) b).isEmpty()) {
            for (ai aiVar2 : b) {
                if (i.y(r.a(aiVar2, false, false, 3, null), a)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    private final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.j jVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (jVar.bsP().size() == 1) {
            List bsP = jVar.bsP();
            i.e(bsP, "valueParameters");
            Object bY = u.bY(bsP);
            i.e(bY, "valueParameters.single()");
            kotlin.reflect.jvm.internal.impl.descriptors.f brQ = ((ar) bY).bpT().bMZ().brQ();
            if (i.y(brQ != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.z(brQ) : null, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.z(dVar))) {
                return true;
            }
        }
        return false;
    }

    static {
        String str = "Collection";
        fcw = am.d(u.fmf.d(str, "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        u uVar = u.fmf;
        String str2 = "sort(Ljava/util/Comparator;)V";
        String str3 = "List";
        String str4 = "String";
        Set a = am.a(am.a(fcC.bsA(), uVar.d(str3, str2)), uVar.c(str4, "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;"));
        String str5 = "isNaN()Z";
        String str6 = "isInfinite()Z";
        String[] strArr = new String[]{str6, str5};
        str6 = "Float";
        fcx = am.a(am.a(am.a(a, uVar.c("Double", str6, str5)), uVar.c(str6, strArr)), uVar.c("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        uVar = u.fmf;
        str5 = "spliterator()Ljava/util/Spliterator;";
        String str7 = "Throwable";
        a = am.a(am.a(am.a(uVar.c("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), uVar.d("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), uVar.c("Iterable", "forEach(Ljava/util/function/Consumer;)V", str5)), uVar.c(str7, "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V"));
        String str8 = "removeIf(Ljava/util/function/Predicate;)Z";
        a = am.a(a, uVar.d(str, str5, "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", str8));
        str5 = "replaceAll(Ljava/util/function/UnaryOperator;)V";
        String str9 = "Map";
        fcy = am.a(am.a(a, uVar.d(str3, str5)), uVar.d(str9, "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        uVar = u.fmf;
        fcz = am.a(am.a(uVar.d(str, str8), uVar.d(str3, str5, str2)), uVar.d(str9, "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        uVar = u.fmf;
        a = fcC.bsC();
        String[] i = uVar.i("D");
        a = am.a(a, uVar.c(str6, (String[]) Arrays.copyOf(i, i.length)));
        i = uVar.i("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        fcA = am.a(a, uVar.c(str4, (String[]) Arrays.copyOf(i, i.length)));
        uVar = u.fmf;
        String[] i2 = uVar.i("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        fcB = uVar.c(str7, (String[]) Arrays.copyOf(i2, i2.length));
    }
}

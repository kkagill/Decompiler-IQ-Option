package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ad;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: DescriptorUtils.kt */
public final class a {
    private static final f ftJ;

    /* compiled from: DescriptorUtils.kt */
    static final class a<N> implements kotlin.reflect.jvm.internal.impl.utils.b.b<N> {
        public static final a ftK = new a();

        a() {
        }

        /* renamed from: f */
        public final List<ar> dy(ar arVar) {
            i.e(arVar, "current");
            Iterable<ar> bsR = arVar.bsR();
            Collection arrayList = new ArrayList(n.e(bsR, 10));
            for (ar btT : bsR) {
                arrayList.add(btT.btT());
            }
            return (List) arrayList;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    static final class b<N> implements kotlin.reflect.jvm.internal.impl.utils.b.b<N> {
        final /* synthetic */ boolean ftM;

        b(boolean z) {
            this.ftM = z;
        }

        /* JADX WARNING: Missing block: B:7:0x0012, code skipped:
            if (r2 != null) goto L_0x0019;
     */
        /* renamed from: G */
        public final java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> dy(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
            /*
            r1 = this;
            r0 = r1.ftM;
            if (r0 == 0) goto L_0x000c;
        L_0x0004:
            if (r2 == 0) goto L_0x000b;
        L_0x0006:
            r2 = r2.bsS();
            goto L_0x000c;
        L_0x000b:
            r2 = 0;
        L_0x000c:
            if (r2 == 0) goto L_0x0015;
        L_0x000e:
            r2 = r2.bsR();
            if (r2 == 0) goto L_0x0015;
        L_0x0014:
            goto L_0x0019;
        L_0x0015:
            r2 = kotlin.collections.m.emptyList();
        L_0x0019:
            r2 = (java.lang.Iterable) r2;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a$b.dy(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor):java.lang.Iterable");
        }
    }

    /* compiled from: DescriptorUtils.kt */
    public static final class c extends kotlin.reflect.jvm.internal.impl.utils.b.a<CallableMemberDescriptor, CallableMemberDescriptor> {
        final /* synthetic */ ObjectRef fcE;
        final /* synthetic */ kotlin.jvm.a.b ftN;

        c(ObjectRef objectRef, kotlin.jvm.a.b bVar) {
            this.fcE = objectRef;
            this.ftN = bVar;
        }

        /* renamed from: H */
        public boolean dz(CallableMemberDescriptor callableMemberDescriptor) {
            i.f(callableMemberDescriptor, "current");
            return ((CallableMemberDescriptor) this.fcE.element) == null;
        }

        /* renamed from: I */
        public void dR(CallableMemberDescriptor callableMemberDescriptor) {
            i.f(callableMemberDescriptor, "current");
            if (((CallableMemberDescriptor) this.fcE.element) == null && ((Boolean) this.ftN.invoke(callableMemberDescriptor)).booleanValue()) {
                this.fcE.element = callableMemberDescriptor;
            }
        }

        /* renamed from: bNk */
        public CallableMemberDescriptor bsI() {
            return (CallableMemberDescriptor) this.fcE.element;
        }
    }

    static {
        f ms = f.ms(ConditionalUserProperty.VALUE);
        i.e(ms, "Name.identifier(\"value\")");
        ftJ = ms;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.c z(k kVar) {
        i.f(kVar, "$this$fqNameUnsafe");
        kotlin.reflect.jvm.internal.impl.name.c w = kotlin.reflect.jvm.internal.impl.resolve.c.w(kVar);
        i.e(w, "DescriptorUtils.getFqName(this)");
        return w;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.b x(k kVar) {
        i.f(kVar, "$this$fqNameSafe");
        kotlin.reflect.jvm.internal.impl.name.b x = kotlin.reflect.jvm.internal.impl.resolve.c.x(kVar);
        i.e(x, "DescriptorUtils.getFqNameSafe(this)");
        return x;
    }

    public static final v P(k kVar) {
        i.f(kVar, "$this$module");
        v B = kotlin.reflect.jvm.internal.impl.resolve.c.B(kVar);
        i.e(B, "DescriptorUtils.getContainingModule(this)");
        return B;
    }

    public static final d b(v vVar, kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar2) {
        i.f(vVar, "$this$resolveTopLevelClass");
        i.f(bVar, "topLevelClassFqName");
        i.f(bVar2, "location");
        int isRoot = bVar.isRoot() ^ 1;
        if (m.eVC && isRoot == 0) {
            throw new AssertionError("Assertion failed");
        }
        kotlin.reflect.jvm.internal.impl.name.b bKb = bVar.bKb();
        i.e(bKb, "topLevelClassFqName.parent()");
        h bsF = vVar.f(bKb).bsF();
        f bKc = bVar.bKc();
        i.e(bKc, "topLevelClassFqName.shortName()");
        kotlin.reflect.jvm.internal.impl.descriptors.f c = bsF.c(bKc, bVar2);
        if (!(c instanceof d)) {
            c = null;
        }
        return (d) c;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.a c(kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
        if (fVar == null) {
            return null;
        }
        k brj = fVar.brj();
        if (brj == null) {
            return null;
        }
        if (brj instanceof y) {
            return new kotlin.reflect.jvm.internal.impl.name.a(((y) brj).btB(), fVar.bsZ());
        }
        if (!(brj instanceof g)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.a c = c((kotlin.reflect.jvm.internal.impl.descriptors.f) brj);
        if (c != null) {
            return c.B(fVar.bsZ());
        }
        return null;
    }

    public static final d L(d dVar) {
        i.f(dVar, "$this$getSuperClassNotAny");
        for (w wVar : dVar.bsY().bMZ().bup()) {
            if (!kotlin.reflect.jvm.internal.impl.builtins.g.E(wVar)) {
                kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
                if (kotlin.reflect.jvm.internal.impl.resolve.c.L(brQ)) {
                    if (brQ != null) {
                        return (d) brQ;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                }
            }
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.builtins.g Q(k kVar) {
        i.f(kVar, "$this$builtIns");
        return P(kVar).btw();
    }

    public static final boolean e(ar arVar) {
        i.f(arVar, "$this$declaresOrInheritsDefaultValue");
        Boolean a = kotlin.reflect.jvm.internal.impl.utils.b.a((Collection) l.listOf(arVar), (kotlin.reflect.jvm.internal.impl.utils.b.b) a.ftK, (kotlin.jvm.a.b) DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.ftL);
        i.e(a, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
        return a.booleanValue();
    }

    public static final kotlin.sequences.h<k> R(k kVar) {
        i.f(kVar, "$this$parentsWithSelf");
        return l.a((Object) kVar, (kotlin.jvm.a.b) DescriptorUtilsKt$parentsWithSelf$1.ftO);
    }

    public static final kotlin.sequences.h<k> S(k kVar) {
        i.f(kVar, "$this$parents");
        return n.a(R(kVar), 1);
    }

    public static final CallableMemberDescriptor F(CallableMemberDescriptor callableMemberDescriptor) {
        i.f(callableMemberDescriptor, "$this$propertyIfAccessor");
        if (!(callableMemberDescriptor instanceof ad)) {
            return callableMemberDescriptor;
        }
        ae btF = ((ad) callableMemberDescriptor).btF();
        i.e(btF, "correspondingProperty");
        return btF;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.b T(k kVar) {
        i.f(kVar, "$this$fqNameOrNull");
        kotlin.reflect.jvm.internal.impl.name.c z = z(kVar);
        if (!z.bKe()) {
            z = null;
        }
        return z != null ? z.bKf() : null;
    }

    public static /* synthetic */ CallableMemberDescriptor a(CallableMemberDescriptor callableMemberDescriptor, boolean z, kotlin.jvm.a.b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(callableMemberDescriptor, z, bVar);
    }

    public static final CallableMemberDescriptor a(CallableMemberDescriptor callableMemberDescriptor, boolean z, kotlin.jvm.a.b<? super CallableMemberDescriptor, Boolean> bVar) {
        i.f(callableMemberDescriptor, "$this$firstOverridden");
        i.f(bVar, "predicate");
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = (CallableMemberDescriptor) null;
        return (CallableMemberDescriptor) kotlin.reflect.jvm.internal.impl.utils.b.a((Collection) l.listOf(callableMemberDescriptor), (kotlin.reflect.jvm.internal.impl.utils.b.b) new b(z), (kotlin.reflect.jvm.internal.impl.utils.b.c) new c(objectRef, bVar));
    }

    public static final Collection<d> M(d dVar) {
        i.f(dVar, "sealedClass");
        if (dVar.bru() != Modality.SEALED) {
            return m.emptyList();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DescriptorUtilsKt$computeSealedSubclasses$1 descriptorUtilsKt$computeSealedSubclasses$1 = new DescriptorUtilsKt$computeSealedSubclasses$1(dVar, linkedHashSet);
        k brj = dVar.brj();
        i.e(brj, "sealedClass.containingDeclaration");
        if (brj instanceof y) {
            descriptorUtilsKt$computeSealedSubclasses$1.a(((y) brj).bsF(), false);
        }
        h btd = dVar.btd();
        i.e(btd, "sealedClass.unsubstitutedInnerClassesScope");
        descriptorUtilsKt$computeSealedSubclasses$1.a(btd, true);
        return linkedHashSet;
    }

    public static final d m(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        i.f(cVar, "$this$annotationClass");
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = cVar.bpT().bMZ().brQ();
        if (!(brQ instanceof d)) {
            brQ = null;
        }
        return (d) brQ;
    }

    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> n(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        i.f(cVar, "$this$firstArgument");
        return (kotlin.reflect.jvm.internal.impl.resolve.constants.g) u.K(cVar.buf().values());
    }
}

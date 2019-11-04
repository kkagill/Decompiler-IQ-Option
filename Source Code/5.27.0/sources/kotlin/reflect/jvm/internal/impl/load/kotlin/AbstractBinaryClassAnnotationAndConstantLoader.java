package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.k;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n.e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.a.g;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.j;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.a<A, C> {
    private static final Set<kotlin.reflect.jvm.internal.impl.name.a> flo;
    @Deprecated
    public static final a flp = new a();
    private final l fiA;
    private final kotlin.reflect.jvm.internal.impl.storage.b<n, b<A, C>> fln;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    private enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    private static final class b<A, C> {
        private final Map<q, List<A>> flq;
        private final Map<q, C> flr;

        public b(Map<q, ? extends List<? extends A>> map, Map<q, ? extends C> map2) {
            i.f(map, "memberAnnotations");
            i.f(map2, "propertyConstants");
            this.flq = map;
            this.flr = map2;
        }

        public final Map<q, List<A>> byo() {
            return this.flq;
        }

        public final Map<q, C> byp() {
            return this.flr;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class c implements kotlin.reflect.jvm.internal.impl.load.kotlin.n.d {
        final /* synthetic */ HashMap fls;
        final /* synthetic */ HashMap flt;
        final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader this$0;

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public class b implements kotlin.reflect.jvm.internal.impl.load.kotlin.n.c {
            final /* synthetic */ c flu;
            private final ArrayList<A> flv = new ArrayList();
            private final q flw;

            public b(c cVar, q qVar) {
                i.f(qVar, "signature");
                this.flu = cVar;
                this.flw = qVar;
            }

            /* Access modifiers changed, original: protected|final */
            public final q byr() {
                return this.flw;
            }

            public kotlin.reflect.jvm.internal.impl.load.kotlin.n.a a(kotlin.reflect.jvm.internal.impl.name.a aVar, aj ajVar) {
                i.f(aVar, "classId");
                i.f(ajVar, "source");
                return this.flu.this$0.b(aVar, ajVar, (List) this.flv);
            }

            public void byq() {
                if ((this.flv.isEmpty() ^ 1) != 0) {
                    this.flu.fls.put(this.flw, this.flv);
                }
            }
        }

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public final class a extends b implements e {
            final /* synthetic */ c flu;

            public a(c cVar, q qVar) {
                i.f(qVar, "signature");
                this.flu = cVar;
                super(cVar, qVar);
            }

            public kotlin.reflect.jvm.internal.impl.load.kotlin.n.a a(int i, kotlin.reflect.jvm.internal.impl.name.a aVar, aj ajVar) {
                i.f(aVar, "classId");
                i.f(ajVar, "source");
                q a = q.fme.a(byr(), i);
                List list = (List) this.flu.fls.get(a);
                if (list == null) {
                    list = new ArrayList();
                    this.flu.fls.put(a, list);
                }
                return this.flu.this$0.b(aVar, ajVar, list);
            }
        }

        c(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, HashMap hashMap, HashMap hashMap2) {
            this.this$0 = abstractBinaryClassAnnotationAndConstantLoader;
            this.fls = hashMap;
            this.flt = hashMap2;
        }

        public e a(f fVar, String str) {
            i.f(fVar, ConditionalUserProperty.NAME);
            i.f(str, "desc");
            kotlin.reflect.jvm.internal.impl.load.kotlin.q.a aVar = q.fme;
            String boi = fVar.boi();
            i.e(boi, "name.asString()");
            return new a(this, aVar.bd(boi, str));
        }

        public kotlin.reflect.jvm.internal.impl.load.kotlin.n.c a(f fVar, String str, Object obj) {
            i.f(fVar, ConditionalUserProperty.NAME);
            i.f(str, "desc");
            kotlin.reflect.jvm.internal.impl.load.kotlin.q.a aVar = q.fme;
            String boi = fVar.boi();
            i.e(boi, "name.asString()");
            q be = aVar.be(boi, str);
            if (obj != null) {
                Object s = this.this$0.s(str, obj);
                if (s != null) {
                    this.flt.put(be, s);
                }
            }
            return new b(this, be);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class d implements kotlin.reflect.jvm.internal.impl.load.kotlin.n.c {
        final /* synthetic */ ArrayList $result;
        final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader this$0;

        public void byq() {
        }

        d(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, ArrayList arrayList) {
            this.this$0 = abstractBinaryClassAnnotationAndConstantLoader;
            this.$result = arrayList;
        }

        public kotlin.reflect.jvm.internal.impl.load.kotlin.n.a a(kotlin.reflect.jvm.internal.impl.name.a aVar, aj ajVar) {
            i.f(aVar, "classId");
            i.f(ajVar, "source");
            return this.this$0.b(aVar, ajVar, (List) this.$result);
        }
    }

    public abstract A a(Annotation annotation, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar);

    public abstract kotlin.reflect.jvm.internal.impl.load.kotlin.n.a a(kotlin.reflect.jvm.internal.impl.name.a aVar, aj ajVar, List<A> list);

    /* Access modifiers changed, original: protected */
    public byte[] b(n nVar) {
        i.f(nVar, "kotlinClass");
        return null;
    }

    public abstract C dD(C c);

    public abstract C s(String str, Object obj);

    public AbstractBinaryClassAnnotationAndConstantLoader(h hVar, l lVar) {
        i.f(hVar, "storageManager");
        i.f(lVar, "kotlinClassFinder");
        this.fiA = lVar;
        this.fln = hVar.q(new AbstractBinaryClassAnnotationAndConstantLoader$storage$1(this));
    }

    private final kotlin.reflect.jvm.internal.impl.load.kotlin.n.a b(kotlin.reflect.jvm.internal.impl.name.a aVar, aj ajVar, List<A> list) {
        if (flo.contains(aVar)) {
            return null;
        }
        return a(aVar, ajVar, (List) list);
    }

    private final n a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a aVar) {
        aj brF = aVar.brF();
        if (!(brF instanceof p)) {
            brF = null;
        }
        p pVar = (p) brF;
        return pVar != null ? pVar.byL() : null;
    }

    public List<A> b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a aVar) {
        i.f(aVar, "container");
        n a = a(aVar);
        if (a != null) {
            ArrayList arrayList = new ArrayList(1);
            a.a((kotlin.reflect.jvm.internal.impl.load.kotlin.n.c) new d(this, arrayList), b(a));
            return arrayList;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class for loading annotations is not found: ");
        stringBuilder.append(aVar.bOr());
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public List<A> a(r rVar, n nVar, AnnotatedCallableKind annotatedCallableKind) {
        i.f(rVar, "container");
        i.f(nVar, "proto");
        i.f(annotatedCallableKind, "kind");
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return a(rVar, (Property) nVar, PropertyRelatedElement.PROPERTY);
        }
        q a = a(this, nVar, rVar.bot(), rVar.bou(), annotatedCallableKind, false, 16, null);
        if (a != null) {
            return a(this, rVar, a, false, false, null, false, 60, null);
        }
        return m.emptyList();
    }

    public List<A> a(r rVar, Property property) {
        i.f(rVar, "container");
        i.f(property, "proto");
        return a(rVar, property, PropertyRelatedElement.BACKING_FIELD);
    }

    public List<A> b(r rVar, Property property) {
        i.f(rVar, "container");
        i.f(property, "proto");
        return a(rVar, property, PropertyRelatedElement.DELEGATE_FIELD);
    }

    private final List<A> a(r rVar, Property property, PropertyRelatedElement propertyRelatedElement) {
        PropertyRelatedElement propertyRelatedElement2 = propertyRelatedElement;
        Boolean lB = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnL.get(property.getFlags());
        i.e(lB, "Flags.IS_CONST.get(proto.flags)");
        boolean booleanValue = lB.booleanValue();
        boolean g = j.g(property);
        q a;
        if (propertyRelatedElement2 == PropertyRelatedElement.PROPERTY) {
            a = a(this, property, rVar.bot(), rVar.bou(), false, true, false, 40, null);
            if (a == null) {
                return m.emptyList();
            }
            return a(this, rVar, a, true, false, Boolean.valueOf(booleanValue), g, 8, null);
        }
        a = a(this, property, rVar.bot(), rVar.bou(), true, false, false, 48, null);
        if (a == null) {
            return m.emptyList();
        }
        boolean z = false;
        boolean b = v.b((CharSequence) a.byM(), (CharSequence) "$delegate", false, 2, null);
        if (propertyRelatedElement2 == PropertyRelatedElement.DELEGATE_FIELD) {
            z = true;
        }
        if (b != z) {
            return m.emptyList();
        }
        return a(rVar, a, true, true, Boolean.valueOf(booleanValue), g);
    }

    public List<A> a(r rVar, EnumEntry enumEntry) {
        i.f(rVar, "container");
        i.f(enumEntry, "proto");
        kotlin.reflect.jvm.internal.impl.load.kotlin.q.a aVar = q.fme;
        String string = rVar.bot().getString(enumEntry.bCg());
        String boi = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a) rVar).getClassId().boi();
        i.e(boi, "(container as ProtoConta…Class).classId.asString()");
        return a(this, rVar, aVar.be(string, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.c.mn(boi)), false, false, null, false, 60, null);
    }

    private final List<A> a(r rVar, q qVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        n a = a(rVar, a(rVar, z, z2, bool, z3));
        if (a == null) {
            return m.emptyList();
        }
        List<A> list = (List) ((b) this.fln.invoke(a)).byo().get(qVar);
        if (list == null) {
            list = m.emptyList();
        }
        return list;
    }

    public List<A> a(r rVar, n nVar, AnnotatedCallableKind annotatedCallableKind, int i, ValueParameter valueParameter) {
        i.f(rVar, "container");
        i.f(nVar, "callableProto");
        i.f(annotatedCallableKind, "kind");
        i.f(valueParameter, "proto");
        q a = a(this, nVar, rVar.bot(), rVar.bou(), annotatedCallableKind, false, 16, null);
        if (a == null) {
            return m.emptyList();
        }
        return a(this, rVar, q.fme.a(a, i + a(rVar, nVar)), false, false, null, false, 60, null);
    }

    private final int a(r rVar, n nVar) {
        if (nVar instanceof Function) {
            if (g.g((Function) nVar)) {
                return 1;
            }
        } else if (nVar instanceof Property) {
            if (g.f((Property) nVar)) {
                return 1;
            }
        } else if (!(nVar instanceof Constructor)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported message: ");
            stringBuilder.append(nVar.getClass());
            throw new UnsupportedOperationException(stringBuilder.toString());
        } else if (rVar != null) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a aVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a) rVar;
            if (aVar.bOs() == Kind.ENUM_CLASS) {
                return 2;
            }
            if (aVar.brz()) {
                return 1;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        }
        return 0;
    }

    public List<A> b(r rVar, n nVar, AnnotatedCallableKind annotatedCallableKind) {
        i.f(rVar, "container");
        i.f(nVar, "proto");
        i.f(annotatedCallableKind, "kind");
        q a = a(this, nVar, rVar.bot(), rVar.bou(), annotatedCallableKind, false, 16, null);
        if (a == null) {
            return m.emptyList();
        }
        return a(this, rVar, q.fme.a(a, 0), false, false, null, false, 60, null);
    }

    public List<A> a(Type type, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar) {
        i.f(type, "proto");
        i.f(cVar, "nameResolver");
        Object e = type.e(JvmProtoBuf.fov);
        i.e(e, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<Annotation> iterable = (Iterable) e;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (Annotation annotation : iterable) {
            i.e(annotation, "it");
            arrayList.add(a(annotation, cVar));
        }
        return (List) arrayList;
    }

    public List<A> a(TypeParameter typeParameter, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar) {
        i.f(typeParameter, "proto");
        i.f(cVar, "nameResolver");
        Object e = typeParameter.e(JvmProtoBuf.fox);
        i.e(e, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<Annotation> iterable = (Iterable) e;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (Annotation annotation : iterable) {
            i.e(annotation, "it");
            arrayList.add(a(annotation, cVar));
        }
        return (List) arrayList;
    }

    public C a(r rVar, Property property, w wVar) {
        i.f(rVar, "container");
        i.f(property, "proto");
        i.f(wVar, "expectedType");
        n a = a(rVar, a(rVar, true, true, kotlin.reflect.jvm.internal.impl.metadata.a.b.fnL.get(property.getFlags()), j.g(property)));
        if (a != null) {
            q a2 = a((n) property, rVar.bot(), rVar.bou(), AnnotatedCallableKind.PROPERTY, a.bqj().byW().b(d.flN.byv()));
            if (a2 != null) {
                C c = ((b) this.fln.invoke(a)).byp().get(a2);
                if (c != null) {
                    if (k.fby.J(wVar)) {
                        c = dD(c);
                    }
                    return c;
                }
            }
        }
        return null;
    }

    private final n a(r rVar, n nVar) {
        if (nVar != null) {
            return nVar;
        }
        return rVar instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a ? a((kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a) rVar) : null;
    }

    private final n a(r rVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a aVar;
        if (z) {
            if (bool != null) {
                l lVar;
                kotlin.reflect.jvm.internal.impl.name.a B;
                if (rVar instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a) {
                    aVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a) rVar;
                    if (aVar.bOs() == Kind.INTERFACE) {
                        lVar = this.fiA;
                        B = aVar.getClassId().B(f.ms("DefaultImpls"));
                        i.e(B, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                        return m.a(lVar, B);
                    }
                }
                if (bool.booleanValue() && (rVar instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.b)) {
                    aj brF = rVar.brF();
                    if (!(brF instanceof h)) {
                        brF = null;
                    }
                    h hVar = (h) brF;
                    kotlin.reflect.jvm.internal.impl.resolve.jvm.c byB = hVar != null ? hVar.byB() : null;
                    if (byB != null) {
                        lVar = this.fiA;
                        String byE = byB.byE();
                        i.e(byE, "facadeClassName.internalName");
                        B = kotlin.reflect.jvm.internal.impl.name.a.s(new kotlin.reflect.jvm.internal.impl.name.b(u.a(byE, '/', '.', false, 4, null)));
                        i.e(B, "ClassId.topLevel(FqName(…lName.replace('/', '.')))");
                        return m.a(lVar, B);
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("isConst should not be null for property (container=");
            stringBuilder.append(rVar);
            stringBuilder.append(')');
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        if (z2 && (rVar instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a)) {
            aVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a) rVar;
            if (aVar.bOs() == Kind.COMPANION_OBJECT) {
                aVar = aVar.bOt();
                if (aVar != null && (aVar.bOs() == Kind.CLASS || aVar.bOs() == Kind.ENUM_CLASS || (z3 && (aVar.bOs() == Kind.INTERFACE || aVar.bOs() == Kind.ANNOTATION_CLASS)))) {
                    return a(aVar);
                }
            }
        }
        if (!(rVar instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.b) || !(rVar.brF() instanceof h)) {
            return null;
        }
        aj brF2 = rVar.brF();
        if (brF2 != null) {
            h hVar2 = (h) brF2;
            n byC = hVar2.byC();
            if (byC == null) {
                byC = m.a(this.fiA, hVar2.getClassId());
            }
            return byC;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
    }

    private final b<A, C> c(n nVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        nVar.a((kotlin.reflect.jvm.internal.impl.load.kotlin.n.d) new c(this, hashMap, hashMap2), b(nVar));
        return new b(hashMap, hashMap2);
    }

    private final q a(Property property, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar, kotlin.reflect.jvm.internal.impl.metadata.a.h hVar, boolean z, boolean z2, boolean z3) {
        ExtendableMessage extendableMessage = property;
        GeneratedMessageLite.e eVar = JvmProtoBuf.fot;
        i.e(eVar, "propertySignature");
        JvmPropertySignature jvmPropertySignature = (JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.a.f.a(extendableMessage, eVar);
        if (jvmPropertySignature != null) {
            if (z) {
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f.a a = j.foZ.a(property, cVar, hVar, z3);
                if (a != null) {
                    return q.fme.a(a);
                }
                return null;
            } else if (z2 && jvmPropertySignature.bIO()) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.q.a aVar = q.fme;
                JvmMethodSignature bIP = jvmPropertySignature.bIP();
                i.e(bIP, "signature.syntheticMethod");
                return aVar.a(cVar, bIP);
            }
        }
        return null;
    }

    static /* synthetic */ q a(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, n nVar, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar, kotlin.reflect.jvm.internal.impl.metadata.a.h hVar, AnnotatedCallableKind annotatedCallableKind, boolean z, int i, Object obj) {
        if (obj == null) {
            return abstractBinaryClassAnnotationAndConstantLoader.a(nVar, cVar, hVar, annotatedCallableKind, (i & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    private final q a(n nVar, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar, kotlin.reflect.jvm.internal.impl.metadata.a.h hVar, AnnotatedCallableKind annotatedCallableKind, boolean z) {
        q qVar = null;
        kotlin.reflect.jvm.internal.impl.load.kotlin.q.a aVar;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f.b a;
        if (nVar instanceof Constructor) {
            aVar = q.fme;
            a = j.foZ.a((Constructor) nVar, cVar, hVar);
            if (a == null) {
                return null;
            }
            qVar = aVar.a(a);
        } else if (nVar instanceof Function) {
            aVar = q.fme;
            a = j.foZ.a((Function) nVar, cVar, hVar);
            if (a == null) {
                return null;
            }
            qVar = aVar.a(a);
        } else if (nVar instanceof Property) {
            ExtendableMessage extendableMessage = (ExtendableMessage) nVar;
            GeneratedMessageLite.e eVar = JvmProtoBuf.fot;
            i.e(eVar, "propertySignature");
            JvmPropertySignature jvmPropertySignature = (JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.a.f.a(extendableMessage, eVar);
            if (jvmPropertySignature != null) {
                int i = a.aob[annotatedCallableKind.ordinal()];
                kotlin.reflect.jvm.internal.impl.load.kotlin.q.a aVar2;
                JvmMethodSignature bIT;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            qVar = a((Property) nVar, cVar, hVar, true, true, z);
                        }
                    } else if (jvmPropertySignature.bIS()) {
                        aVar2 = q.fme;
                        bIT = jvmPropertySignature.bIT();
                        i.e(bIT, "signature.setter");
                        qVar = aVar2.a(cVar, bIT);
                    }
                } else if (jvmPropertySignature.bIQ()) {
                    aVar2 = q.fme;
                    bIT = jvmPropertySignature.bIR();
                    i.e(bIT, "signature.getter");
                    qVar = aVar2.a(cVar, bIT);
                }
            }
        }
        return qVar;
    }

    static {
        Iterable<kotlin.reflect.jvm.internal.impl.name.b> listOf = m.listOf(kotlin.reflect.jvm.internal.impl.load.java.n.fhk, kotlin.reflect.jvm.internal.impl.load.java.n.fhn, kotlin.reflect.jvm.internal.impl.load.java.n.fho, new kotlin.reflect.jvm.internal.impl.name.b("java.lang.annotation.Target"), new kotlin.reflect.jvm.internal.impl.name.b("java.lang.annotation.Retention"), new kotlin.reflect.jvm.internal.impl.name.b("java.lang.annotation.Documented"));
        Collection arrayList = new ArrayList(n.e(listOf, 10));
        for (kotlin.reflect.jvm.internal.impl.name.b s : listOf) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.name.a.s(s));
        }
        flo = u.V((List) arrayList);
    }
}

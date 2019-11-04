package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.am;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility;
import kotlin.reflect.jvm.internal.impl.metadata.a.g;
import kotlin.reflect.jvm.internal.impl.metadata.a.h;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.i;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.s;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: DeserializedClassDescriptor.kt */
public final class d extends kotlin.reflect.jvm.internal.impl.descriptors.impl.a {
    private final kotlin.reflect.jvm.internal.impl.name.a classId;
    private final f fdr;
    private final aw feG = s.fvC.a((Visibility) kotlin.reflect.jvm.internal.impl.metadata.a.b.fnr.get(this.fuS.getFlags()));
    private final k fej;
    private final Modality fel = s.fvC.a((ProtoBuf.Modality) kotlin.reflect.jvm.internal.impl.metadata.a.b.fns.get(this.fuS.getFlags()));
    private final ClassKind fem = s.fvC.a((Kind) kotlin.reflect.jvm.internal.impl.metadata.a.b.fnt.get(this.fuS.getFlags()));
    private final e<Collection<kotlin.reflect.jvm.internal.impl.descriptors.c>> fjF;
    private final Class fuS;
    private final kotlin.reflect.jvm.internal.impl.metadata.a.a fuT;
    private final aj fuU;
    private final i fvT;
    private final b fvU;
    private final a fvV;
    private final c fvW;
    private final kotlin.reflect.jvm.internal.impl.storage.f<kotlin.reflect.jvm.internal.impl.descriptors.c> fvX;
    private final kotlin.reflect.jvm.internal.impl.storage.f<kotlin.reflect.jvm.internal.impl.descriptors.d> fvY;
    private final e<Collection<kotlin.reflect.jvm.internal.impl.descriptors.d>> fvZ;
    private final j fvy;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a fwa;

    /* compiled from: DeserializedClassDescriptor.kt */
    private final class c {
        private final e<Set<kotlin.reflect.jvm.internal.impl.name.f>> fet;
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, EnumEntry> fwc;
        private final kotlin.reflect.jvm.internal.impl.storage.c<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d> fwd;

        public c() {
            List bAL = d.this.bOJ().bAL();
            kotlin.jvm.internal.i.e(bAL, "classProto.enumEntryList");
            Iterable iterable = bAL;
            Map linkedHashMap = new LinkedHashMap(m.bi(af.jL(n.e(iterable, 10)), 16));
            for (Object next : iterable) {
                EnumEntry enumEntry = (EnumEntry) next;
                kotlin.reflect.jvm.internal.impl.metadata.a.c bot = d.this.bOB().bot();
                kotlin.jvm.internal.i.e(enumEntry, "it");
                linkedHashMap.put(q.b(bot, enumEntry.bCg()), next);
            }
            this.fwc = linkedHashMap;
            this.fwd = d.this.bOB().bqz().r(new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1(this));
            this.fet = d.this.bOB().bqz().f(new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1(this));
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.d Q(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
            return (kotlin.reflect.jvm.internal.impl.descriptors.d) this.fwd.invoke(fVar);
        }

        private final Set<kotlin.reflect.jvm.internal.impl.name.f> bOP() {
            String str;
            kotlin.reflect.jvm.internal.impl.metadata.a.c bot;
            HashSet hashSet = new HashSet();
            for (w bsF : d.this.brm().bup()) {
                for (k kVar : kotlin.reflect.jvm.internal.impl.resolve.scopes.j.a.a(bsF.bsF(), null, null, 3, null)) {
                    if ((kVar instanceof ai) || (kVar instanceof ae)) {
                        hashSet.add(kVar.bsZ());
                    }
                }
            }
            List bAF = d.this.bOJ().bAF();
            kotlin.jvm.internal.i.e(bAF, "classProto.functionList");
            Iterator it = bAF.iterator();
            while (true) {
                str = "it";
                if (!it.hasNext()) {
                    break;
                }
                Collection collection = hashSet;
                Function function = (Function) it.next();
                bot = d.this.bOB().bot();
                kotlin.jvm.internal.i.e(function, str);
                collection.add(q.b(bot, function.bCg()));
            }
            Collection collection2 = hashSet;
            Set set = (Set) collection2;
            List<Property> bAH = d.this.bOJ().bAH();
            kotlin.jvm.internal.i.e(bAH, "classProto.propertyList");
            for (Property property : bAH) {
                bot = d.this.bOB().bot();
                kotlin.jvm.internal.i.e(property, str);
                collection2.add(q.b(bot, property.bCg()));
            }
            return am.a(set, collection2);
        }

        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> bOQ() {
            Collection arrayList = new ArrayList();
            for (kotlin.reflect.jvm.internal.impl.name.f Q : this.fwc.keySet()) {
                kotlin.reflect.jvm.internal.impl.descriptors.d Q2 = Q(Q);
                if (Q2 != null) {
                    arrayList.add(Q2);
                }
            }
            return (List) arrayList;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    private final class b extends kotlin.reflect.jvm.internal.impl.types.b {
        private final e<List<ao>> fjE;

        public boolean brS() {
            return true;
        }

        public b() {
            super(d.this.bOB().bqz());
            this.fjE = d.this.bOB().bqz().f(new DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1(this));
        }

        /* Access modifiers changed, original: protected */
        public Collection<w> brO() {
            Iterable<Type> a = g.a(d.this.bOJ(), d.this.bOB().bou());
            Collection arrayList = new ArrayList(n.e(a, 10));
            for (Type r : a) {
                arrayList.add(d.this.bOB().bOm().r(r));
            }
            Iterable<w> b = u.b((Collection) (List) arrayList, (Iterable) d.this.bOB().bys().bqw().l(d.this));
            arrayList = new ArrayList();
            for (w bMZ : b) {
                kotlin.reflect.jvm.internal.impl.descriptors.f brQ = bMZ.bMZ().brQ();
                if (!(brQ instanceof kotlin.reflect.jvm.internal.impl.descriptors.x.b)) {
                    brQ = null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.x.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.x.b) brQ;
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            List list = (List) arrayList;
            if ((list.isEmpty() ^ 1) != 0) {
                l bvU = d.this.bOB().bys().bvU();
                kotlin.reflect.jvm.internal.impl.descriptors.d dVar = d.this;
                Iterable<kotlin.reflect.jvm.internal.impl.descriptors.x.b> iterable = list;
                Collection arrayList2 = new ArrayList(n.e(iterable, 10));
                for (kotlin.reflect.jvm.internal.impl.descriptors.x.b bVar2 : iterable) {
                    Object boi;
                    kotlin.reflect.jvm.internal.impl.name.a c = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.c(bVar2);
                    if (c != null) {
                        kotlin.reflect.jvm.internal.impl.name.b bJZ = c.bJZ();
                        if (bJZ != null) {
                            boi = bJZ.boi();
                            if (boi != null) {
                                arrayList2.add(boi);
                            }
                        }
                    }
                    boi = bVar2.bsZ().boi();
                    arrayList2.add(boi);
                }
                bvU.a(dVar, (List) arrayList2);
            }
            return u.T(b);
        }

        public List<ao> getParameters() {
            return (List) this.fjE.invoke();
        }

        /* renamed from: bOO */
        public d brR() {
            return d.this;
        }

        public String toString() {
            String fVar = d.this.bsZ().toString();
            kotlin.jvm.internal.i.e(fVar, "name.toString()");
            return fVar;
        }

        /* Access modifiers changed, original: protected */
        public am brT() {
            return kotlin.reflect.jvm.internal.impl.descriptors.am.a.fcX;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    private final class a extends f {
        private final e<Collection<k>> few;

        /* compiled from: DeserializedClassDescriptor.kt */
        public static final class a extends kotlin.reflect.jvm.internal.impl.resolve.g {
            final /* synthetic */ Collection fwb;

            /* Access modifiers changed, original: protected */
            public void a(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                kotlin.jvm.internal.i.f(callableMemberDescriptor, "fromSuper");
                kotlin.jvm.internal.i.f(callableMemberDescriptor2, "fromCurrent");
            }

            a(Collection collection) {
                this.fwb = collection;
            }

            public void g(CallableMemberDescriptor callableMemberDescriptor) {
                kotlin.jvm.internal.i.f(callableMemberDescriptor, "fakeOverride");
                OverridingUtil.a(callableMemberDescriptor, null);
                this.fwb.add(callableMemberDescriptor);
            }
        }

        public a() {
            j bOB = d.this.bOB();
            List bAF = d.this.bOJ().bAF();
            kotlin.jvm.internal.i.e(bAF, "classProto.functionList");
            Collection collection = bAF;
            bAF = d.this.bOJ().bAH();
            kotlin.jvm.internal.i.e(bAF, "classProto.propertyList");
            Collection collection2 = bAF;
            bAF = d.this.bOJ().bAJ();
            kotlin.jvm.internal.i.e(bAF, "classProto.typeAliasList");
            Collection collection3 = bAF;
            bAF = d.this.bOJ().bAC();
            kotlin.jvm.internal.i.e(bAF, "classProto.nestedClassNameList");
            Iterable<Number> iterable = bAF;
            kotlin.reflect.jvm.internal.impl.metadata.a.c bot = d.this.bOB().bot();
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (Number intValue : iterable) {
                arrayList.add(q.b(bot, intValue.intValue()));
            }
            super(bOB, collection, collection2, collection3, new DeserializedClassDescriptor$DeserializedClassMemberScope$2$1((List) arrayList));
            this.few = bOB().bqz().f(new DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1(this));
        }

        private final d bOL() {
            return d.this;
        }

        public Collection<k> a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
            kotlin.jvm.internal.i.f(dVar, "kindFilter");
            kotlin.jvm.internal.i.f(bVar, "nameFilter");
            return (Collection) this.few.invoke();
        }

        public Collection<ai> b(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
            kotlin.jvm.internal.i.f(bVar, "location");
            d(fVar, bVar);
            return super.b(fVar, bVar);
        }

        public Collection<ae> a(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
            kotlin.jvm.internal.i.f(bVar, "location");
            d(fVar, bVar);
            return super.a(fVar, bVar);
        }

        /* Access modifiers changed, original: protected */
        public void d(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<ai> collection) {
            kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
            kotlin.jvm.internal.i.f(collection, "functions");
            ArrayList arrayList = new ArrayList();
            for (w bsF : bOL().brm().bup()) {
                arrayList.addAll(bsF.bsF().b(fVar, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            r.a((Iterable) collection, (kotlin.jvm.a.b) new DeserializedClassDescriptor$DeserializedClassMemberScope$computeNonDeclaredFunctions$1(this));
            collection.addAll(bOB().bys().bqw().a(fVar, d.this));
            a(fVar, arrayList, collection);
        }

        /* Access modifiers changed, original: protected */
        public void b(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<ae> collection) {
            kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
            kotlin.jvm.internal.i.f(collection, "descriptors");
            ArrayList arrayList = new ArrayList();
            for (w bsF : bOL().brm().bup()) {
                arrayList.addAll(bsF.bsF().a(fVar, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            a(fVar, arrayList, collection);
        }

        private final <D extends CallableMemberDescriptor> void a(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<? extends D> collection, Collection<D> collection2) {
            OverridingUtil.a(fVar, collection, new ArrayList(collection2), bOL(), new a(collection2));
        }

        /* Access modifiers changed, original: protected */
        public Set<kotlin.reflect.jvm.internal.impl.name.f> bOM() {
            Collection linkedHashSet = new LinkedHashSet();
            for (w bsF : bOL().fvU.bup()) {
                r.a(linkedHashSet, (Iterable) bsF.bsF().bux());
            }
            ((LinkedHashSet) linkedHashSet).addAll(bOB().bys().bqw().n(d.this));
            return (Set) linkedHashSet;
        }

        /* Access modifiers changed, original: protected */
        public Set<kotlin.reflect.jvm.internal.impl.name.f> bON() {
            Collection linkedHashSet = new LinkedHashSet();
            for (w bsF : bOL().fvU.bup()) {
                r.a(linkedHashSet, (Iterable) bsF.bsF().buy());
            }
            return (Set) linkedHashSet;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.f c(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
            kotlin.jvm.internal.i.f(bVar, "location");
            d(fVar, bVar);
            c b = bOL().fvW;
            if (b != null) {
                kotlin.reflect.jvm.internal.impl.descriptors.d Q = b.Q(fVar);
                if (Q != null) {
                    return Q;
                }
            }
            return super.c(fVar, bVar);
        }

        /* Access modifiers changed, original: protected */
        public kotlin.reflect.jvm.internal.impl.name.a P(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
            kotlin.reflect.jvm.internal.impl.name.a B = d.this.classId.B(fVar);
            kotlin.jvm.internal.i.e(B, "classId.createNestedClassId(name)");
            return B;
        }

        /* Access modifiers changed, original: protected */
        public void c(Collection<k> collection, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
            kotlin.jvm.internal.i.f(collection, "result");
            kotlin.jvm.internal.i.f(bVar, "nameFilter");
            c b = bOL().fvW;
            Collection bOQ = b != null ? b.bOQ() : null;
            if (bOQ == null) {
                bOQ = m.emptyList();
            }
            collection.addAll(bOQ);
        }

        public void d(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
            kotlin.jvm.internal.i.f(bVar, "location");
            kotlin.reflect.jvm.internal.impl.incremental.a.a(bOB().bys().bwa(), bVar, (kotlin.reflect.jvm.internal.impl.descriptors.d) bOL(), fVar);
        }
    }

    public boolean brC() {
        return false;
    }

    public final Class bOJ() {
        return this.fuS;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.a.a bOK() {
        return this.fuT;
    }

    public d(j jVar, Class classR, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar, kotlin.reflect.jvm.internal.impl.metadata.a.a aVar, aj ajVar) {
        f lVar;
        kotlin.jvm.internal.i.f(jVar, "outerContext");
        kotlin.jvm.internal.i.f(classR, "classProto");
        kotlin.jvm.internal.i.f(cVar, "nameResolver");
        kotlin.jvm.internal.i.f(aVar, "metadataVersion");
        kotlin.jvm.internal.i.f(ajVar, "sourceElement");
        super(jVar.bqz(), q.a(cVar, classR.bAu()).bJV());
        this.fuS = classR;
        this.fuT = aVar;
        this.fuU = ajVar;
        this.classId = q.a(cVar, this.fuS.bAu());
        k kVar = this;
        List bAx = this.fuS.bAx();
        kotlin.jvm.internal.i.e(bAx, "classProto.typeParameterList");
        TypeTable bAP = this.fuS.bAP();
        kotlin.jvm.internal.i.e(bAP, "classProto.typeTable");
        h hVar = new h(bAP);
        kotlin.reflect.jvm.internal.impl.metadata.a.k.a aVar2 = kotlin.reflect.jvm.internal.impl.metadata.a.k.fon;
        VersionRequirementTable bAS = this.fuS.bAS();
        kotlin.jvm.internal.i.e(bAS, "classProto.versionRequirementTable");
        this.fvy = jVar.a(kVar, bAx, cVar, hVar, aVar2.g(bAS), this.fuT);
        this.fvT = this.fem == ClassKind.ENUM_CLASS ? new kotlin.reflect.jvm.internal.impl.resolve.scopes.k(this.fvy.bqz(), this) : kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c.fuD;
        this.fvU = new b();
        this.fvV = new a();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a aVar3 = null;
        this.fvW = this.fem == ClassKind.ENUM_CLASS ? new c() : null;
        this.fej = jVar.brj();
        this.fvX = this.fvy.bqz().g(new DeserializedClassDescriptor$primaryConstructor$1(this));
        this.fjF = this.fvy.bqz().f(new DeserializedClassDescriptor$constructors$1(this));
        this.fvY = this.fvy.bqz().g(new DeserializedClassDescriptor$companionObjectDescriptor$1(this));
        this.fvZ = this.fvy.bqz().f(new DeserializedClassDescriptor$sealedSubclasses$1(this));
        Class classR2 = this.fuS;
        kotlin.reflect.jvm.internal.impl.metadata.a.c bot = this.fvy.bot();
        h bou = this.fvy.bou();
        aj ajVar2 = this.fuU;
        k kVar2 = this.fej;
        if (!(kVar2 instanceof d)) {
            kVar2 = null;
        }
        d dVar = (d) kVar2;
        if (dVar != null) {
            aVar3 = dVar.fwa;
        }
        this.fwa = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a(classR2, bot, bou, ajVar2, aVar3);
        if (kotlin.reflect.jvm.internal.impl.metadata.a.b.fnq.get(this.fuS.getFlags()).booleanValue()) {
            lVar = new l(this.fvy.bqz(), new DeserializedClassDescriptor$annotations$1(this));
        } else {
            lVar = f.fdA.bug();
        }
        this.fdr = lVar;
    }

    public final j bOB() {
        return this.fvy;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.a bOC() {
        return this.fwa;
    }

    public f brE() {
        return this.fdr;
    }

    public k brj() {
        return this.fej;
    }

    public an brm() {
        return this.fvU;
    }

    public ClassKind brt() {
        return this.fem;
    }

    public Modality bru() {
        return this.fel;
    }

    public aw brx() {
        return this.feG;
    }

    public boolean brz() {
        Boolean lB = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnu.get(this.fuS.getFlags());
        kotlin.jvm.internal.i.e(lB, "Flags.IS_INNER.get(classProto.flags)");
        return lB.booleanValue();
    }

    public boolean AZ() {
        Boolean lB = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnv.get(this.fuS.getFlags());
        kotlin.jvm.internal.i.e(lB, "Flags.IS_DATA.get(classProto.flags)");
        return lB.booleanValue();
    }

    public boolean brA() {
        Boolean lB = kotlin.reflect.jvm.internal.impl.metadata.a.b.fny.get(this.fuS.getFlags());
        kotlin.jvm.internal.i.e(lB, "Flags.IS_INLINE_CLASS.get(classProto.flags)");
        return lB.booleanValue();
    }

    public boolean brB() {
        Boolean lB = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnx.get(this.fuS.getFlags());
        kotlin.jvm.internal.i.e(lB, "Flags.IS_EXPECT_CLASS.get(classProto.flags)");
        return lB.booleanValue();
    }

    public boolean brD() {
        Boolean lB = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnw.get(this.fuS.getFlags());
        kotlin.jvm.internal.i.e(lB, "Flags.IS_EXTERNAL_CLASS.get(classProto.flags)");
        return lB.booleanValue();
    }

    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h bro() {
        return this.fvV;
    }

    /* renamed from: bOD */
    public i brl() {
        return this.fvT;
    }

    public boolean bry() {
        return ((Kind) kotlin.reflect.jvm.internal.impl.metadata.a.b.fnt.get(this.fuS.getFlags())) == Kind.COMPANION_OBJECT;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.c bOE() {
        if (this.fem.isSingleton()) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f a = kotlin.reflect.jvm.internal.impl.resolve.b.a((kotlin.reflect.jvm.internal.impl.descriptors.d) this, aj.fcV);
            a.Q(bsY());
            return a;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.c cVar;
        Object obj;
        List bAD = this.fuS.bAD();
        kotlin.jvm.internal.i.e(bAD, "classProto.constructorList");
        Iterator it = bAD.iterator();
        kotlin.reflect.jvm.internal.impl.metadata.a.b.a aVar;
        Constructor constructor;
        do {
            cVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            constructor = (Constructor) obj;
            aVar = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnz;
            kotlin.jvm.internal.i.e(constructor, "it");
        } while ((aVar.get(constructor.getFlags()).booleanValue() ^ 1) == 0);
        Constructor constructor2 = (Constructor) obj;
        if (constructor2 != null) {
            cVar = this.fvy.bOn().a(constructor2, true);
        }
        return cVar;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.c brw() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.c) this.fvX.invoke();
    }

    private final Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> bOF() {
        return u.b((Collection) u.b((Collection) bOG(), (Iterable) m.dc(brw())), (Iterable) this.fvy.bys().bqw().p(this));
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.c> bOG() {
        String str;
        List bAD = this.fuS.bAD();
        kotlin.jvm.internal.i.e(bAD, "classProto.constructorList");
        Collection arrayList = new ArrayList();
        Iterator it = bAD.iterator();
        while (true) {
            str = "it";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Constructor constructor = (Constructor) next;
            kotlin.reflect.jvm.internal.impl.metadata.a.b.a aVar = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnz;
            kotlin.jvm.internal.i.e(constructor, str);
            Boolean lB = aVar.get(constructor.getFlags());
            kotlin.jvm.internal.i.e(lB, "Flags.IS_SECONDARY.get(it.flags)");
            if (lB.booleanValue()) {
                arrayList.add(next);
            }
        }
        Iterable<Constructor> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(n.e(iterable, 10));
        for (Constructor constructor2 : iterable) {
            p bOn = this.fvy.bOn();
            kotlin.jvm.internal.i.e(constructor2, str);
            arrayList2.add(bOn.a(constructor2, false));
        }
        return (List) arrayList2;
    }

    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> brs() {
        return (Collection) this.fjF.invoke();
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d bOH() {
        if (!this.fuS.bAv()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f c = this.fvV.c(q.b(this.fvy.bot(), this.fuS.bAw()), (kotlin.reflect.jvm.internal.impl.incremental.components.b) NoLookupLocation.FROM_DESERIALIZATION);
        if (!(c instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            c = null;
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.d) c;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.d brq() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.d) this.fvY.invoke();
    }

    public final boolean O(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        return this.fvV.bOU().contains(fVar);
    }

    private final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> bOI() {
        if (this.fel != Modality.SEALED) {
            return m.emptyList();
        }
        List<Integer> bAN = this.fuS.bAN();
        kotlin.jvm.internal.i.e(bAN, "fqNames");
        if ((bAN.isEmpty() ^ 1) == 0) {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.M(this);
        }
        Collection arrayList = new ArrayList();
        for (Integer num : bAN) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.h bys = this.fvy.bys();
            kotlin.reflect.jvm.internal.impl.metadata.a.c bot = this.fvy.bot();
            kotlin.jvm.internal.i.e(num, "index");
            kotlin.reflect.jvm.internal.impl.descriptors.d m = bys.m(q.a(bot, num.intValue()));
            if (m != null) {
                arrayList.add(m);
            }
        }
        return (List) arrayList;
    }

    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> brH() {
        return (Collection) this.fvZ.invoke();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("deserialized class ");
        stringBuilder.append(bsZ());
        return stringBuilder.toString();
    }

    public aj brF() {
        return this.fuU;
    }

    public List<ao> brI() {
        return this.fvy.bOm().bOu();
    }
}

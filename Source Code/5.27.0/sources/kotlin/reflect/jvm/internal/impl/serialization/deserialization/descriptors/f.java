package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.i;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q;
import kotlin.reflect.jvm.internal.impl.storage.b;
import kotlin.reflect.jvm.internal.impl.storage.c;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.storage.g;

/* compiled from: DeserializedMemberScope.kt */
public abstract class f extends i {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(f.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), k.a(new PropertyReference1Impl(k.G(f.class), "variableNamesLazy", "getVariableNamesLazy()Ljava/util/Set;")), k.a(new PropertyReference1Impl(k.G(f.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;"))};
    private final b<kotlin.reflect.jvm.internal.impl.name.f, Collection<ai>> feu;
    private final b<kotlin.reflect.jvm.internal.impl.name.f, Collection<ae>> fev;
    private final e fjX;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j fvy;
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> fwe;
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> fwf;
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> fwg;
    private final c<kotlin.reflect.jvm.internal.impl.name.f, an> fwh;
    private final e fwi;
    private final e fwj;

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> bOS() {
        return (Set) g.a(this.fwi, (Object) this, anY[1]);
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> bwN() {
        return (Set) g.a(this.fjX, (Object) this, anY[0]);
    }

    public abstract a P(kotlin.reflect.jvm.internal.impl.name.f fVar);

    /* Access modifiers changed, original: protected */
    public void b(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<ae> collection) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(collection, "descriptors");
    }

    public abstract Set<kotlin.reflect.jvm.internal.impl.name.f> bOM();

    public abstract Set<kotlin.reflect.jvm.internal.impl.name.f> bON();

    public final Set<kotlin.reflect.jvm.internal.impl.name.f> bOU() {
        return (Set) g.a(this.fwj, (Object) this, anY[2]);
    }

    public abstract void c(Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> collection, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar);

    /* Access modifiers changed, original: protected */
    public void d(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<ai> collection) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(collection, "functions");
    }

    /* Access modifiers changed, original: protected|final */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j bOB() {
        return this.fvy;
    }

    protected f(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j jVar, Collection<Function> collection, Collection<Property> collection2, Collection<TypeAlias> collection3, kotlin.jvm.a.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.f>> aVar) {
        kotlin.jvm.internal.i.f(jVar, "c");
        kotlin.jvm.internal.i.f(collection, "functionList");
        kotlin.jvm.internal.i.f(collection2, "propertyList");
        kotlin.jvm.internal.i.f(collection3, "typeAliasList");
        kotlin.jvm.internal.i.f(aVar, "classNames");
        this.fvy = jVar;
        Map linkedHashMap = new LinkedHashMap();
        for (Object next : collection) {
            kotlin.reflect.jvm.internal.impl.name.f b = q.b(this.fvy.bot(), ((Function) ((n) next)).bCg());
            ArrayList arrayList = linkedHashMap.get(b);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(b, arrayList);
            }
            arrayList.add(next);
        }
        this.fwe = Y(linkedHashMap);
        linkedHashMap = new LinkedHashMap();
        for (Object next2 : collection2) {
            kotlin.reflect.jvm.internal.impl.name.f b2 = q.b(this.fvy.bot(), ((Property) ((n) next2)).bCg());
            ArrayList arrayList2 = linkedHashMap.get(b2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(b2, arrayList2);
            }
            arrayList2.add(next2);
        }
        this.fwf = Y(linkedHashMap);
        if (this.fvy.bys().bNZ().bOj()) {
            linkedHashMap = new LinkedHashMap();
            for (Object next22 : collection3) {
                kotlin.reflect.jvm.internal.impl.name.f b3 = q.b(this.fvy.bot(), ((TypeAlias) ((n) next22)).bCg());
                ArrayList arrayList3 = linkedHashMap.get(b3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(b3, arrayList3);
                }
                arrayList3.add(next22);
            }
            linkedHashMap = Y(linkedHashMap);
        } else {
            linkedHashMap = af.emptyMap();
        }
        this.fwg = linkedHashMap;
        this.feu = this.fvy.bqz().q(new DeserializedMemberScope$functions$1(this));
        this.fev = this.fvy.bqz().q(new DeserializedMemberScope$properties$1(this));
        this.fwh = this.fvy.bqz().r(new DeserializedMemberScope$typeAliasByName$1(this));
        this.fjX = this.fvy.bqz().f(new DeserializedMemberScope$functionNamesLazy$2(this));
        this.fwi = this.fvy.bqz().f(new DeserializedMemberScope$variableNamesLazy$2(this));
        this.fwj = this.fvy.bqz().f(new DeserializedMemberScope$classNames$2(aVar));
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> bOT() {
        return this.fwg.keySet();
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.f> bux() {
        return bwN();
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.f> buy() {
        return bOS();
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043 A:{LOOP_END, LOOP:0: B:7:0x003d->B:9:0x0043} */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ai> g(kotlin.reflect.jvm.internal.impl.name.f r6) {
        /*
        r5 = this;
        r0 = r5.fwe;
        r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.fmO;
        r2 = "ProtoBuf.Function.PARSER";
        kotlin.jvm.internal.i.e(r1, r2);
        r0 = r0.get(r6);
        r0 = (byte[]) r0;
        if (r0 == 0) goto L_0x002a;
    L_0x0011:
        r2 = new java.io.ByteArrayInputStream;
        r2.<init>(r0);
        r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$1;
        r0.<init>(r2, r5, r1);
        r0 = (kotlin.jvm.a.a) r0;
        r0 = kotlin.sequences.l.h(r0);
        r0 = kotlin.sequences.n.f(r0);
        if (r0 == 0) goto L_0x002a;
    L_0x0027:
        r0 = (java.util.Collection) r0;
        goto L_0x0030;
    L_0x002a:
        r0 = kotlin.collections.m.emptyList();
        r0 = (java.util.Collection) r0;
    L_0x0030:
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
    L_0x003d:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x005c;
    L_0x0043:
        r2 = r0.next();
        r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r2;
        r3 = r5.fvy;
        r3 = r3.bOn();
        r4 = "it";
        kotlin.jvm.internal.i.e(r2, r4);
        r2 = r3.h(r2);
        r1.add(r2);
        goto L_0x003d;
    L_0x005c:
        r1 = (java.util.ArrayList) r1;
        r0 = r1;
        r0 = (java.util.Collection) r0;
        r5.d(r6, r0);
        r6 = kotlin.reflect.jvm.internal.impl.utils.a.i(r1);
        r6 = (java.util.Collection) r6;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.g(kotlin.reflect.jvm.internal.impl.name.f):java.util.Collection");
    }

    public Collection<ai> b(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(bVar, "location");
        if (bux().contains(fVar)) {
            return (Collection) this.feu.invoke(fVar);
        }
        return m.emptyList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043 A:{LOOP_END, LOOP:0: B:7:0x003d->B:9:0x0043} */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ae> f(kotlin.reflect.jvm.internal.impl.name.f r6) {
        /*
        r5 = this;
        r0 = r5.fwf;
        r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.fmO;
        r2 = "ProtoBuf.Property.PARSER";
        kotlin.jvm.internal.i.e(r1, r2);
        r0 = r0.get(r6);
        r0 = (byte[]) r0;
        if (r0 == 0) goto L_0x002a;
    L_0x0011:
        r2 = new java.io.ByteArrayInputStream;
        r2.<init>(r0);
        r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$3;
        r0.<init>(r2, r5, r1);
        r0 = (kotlin.jvm.a.a) r0;
        r0 = kotlin.sequences.l.h(r0);
        r0 = kotlin.sequences.n.f(r0);
        if (r0 == 0) goto L_0x002a;
    L_0x0027:
        r0 = (java.util.Collection) r0;
        goto L_0x0030;
    L_0x002a:
        r0 = kotlin.collections.m.emptyList();
        r0 = (java.util.Collection) r0;
    L_0x0030:
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
    L_0x003d:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x005c;
    L_0x0043:
        r2 = r0.next();
        r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r2;
        r3 = r5.fvy;
        r3 = r3.bOn();
        r4 = "it";
        kotlin.jvm.internal.i.e(r2, r4);
        r2 = r3.h(r2);
        r1.add(r2);
        goto L_0x003d;
    L_0x005c:
        r1 = (java.util.ArrayList) r1;
        r0 = r1;
        r0 = (java.util.Collection) r0;
        r5.b(r6, r0);
        r6 = kotlin.reflect.jvm.internal.impl.utils.a.i(r1);
        r6 = (java.util.Collection) r6;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.f(kotlin.reflect.jvm.internal.impl.name.f):java.util.Collection");
    }

    private final an S(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        byte[] bArr = (byte[]) this.fwg.get(fVar);
        if (bArr != null) {
            TypeAlias d = TypeAlias.d((InputStream) new ByteArrayInputStream(bArr), this.fvy.bys().bOh());
            if (d != null) {
                return this.fvy.bOn().g(d);
            }
        }
        return null;
    }

    public Collection<ae> a(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(bVar, "location");
        if (buy().contains(fVar)) {
            return (Collection) this.fev.invoke(fVar);
        }
        return m.emptyList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> b(d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar2) {
        kotlin.jvm.internal.i.f(dVar, "kindFilter");
        kotlin.jvm.internal.i.f(bVar, "nameFilter");
        kotlin.jvm.internal.i.f(bVar2, "location");
        ArrayList arrayList = new ArrayList(0);
        if (dVar.mr(d.fuu.bNC())) {
            c((Collection) arrayList, (kotlin.jvm.a.b) bVar);
        }
        Collection collection = arrayList;
        a(collection, dVar, bVar, bVar2);
        if (dVar.mr(d.fuu.bNI())) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : bOU()) {
                if (((Boolean) bVar.invoke(fVar)).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.j(collection, T(fVar));
                }
            }
        }
        if (dVar.mr(d.fuu.bND())) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : bOT()) {
                if (((Boolean) bVar.invoke(fVar2)).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.j(collection, this.fwh.invoke(fVar2));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.i(arrayList);
    }

    private final void a(Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> collection, d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar2) {
        String str = "MemberComparator.NameAnd…MemberComparator.INSTANCE";
        if (dVar.mr(d.fuu.bNG())) {
            Collection<kotlin.reflect.jvm.internal.impl.name.f> buy = buy();
            ArrayList arrayList = new ArrayList();
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : buy) {
                if (((Boolean) bVar.invoke(fVar)).booleanValue()) {
                    arrayList.addAll(a(fVar, bVar2));
                }
            }
            List list = arrayList;
            kotlin.reflect.jvm.internal.impl.resolve.e.a aVar = kotlin.reflect.jvm.internal.impl.resolve.e.a.fsZ;
            kotlin.jvm.internal.i.e(aVar, str);
            q.a(list, aVar);
            collection.addAll(arrayList);
        }
        if (dVar.mr(d.fuu.bNF())) {
            Collection<kotlin.reflect.jvm.internal.impl.name.f> bux = bux();
            ArrayList arrayList2 = new ArrayList();
            for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : bux) {
                if (((Boolean) bVar.invoke(fVar2)).booleanValue()) {
                    arrayList2.addAll(b(fVar2, bVar2));
                }
            }
            List list2 = arrayList2;
            kotlin.reflect.jvm.internal.impl.resolve.e.a aVar2 = kotlin.reflect.jvm.internal.impl.resolve.e.a.fsZ;
            kotlin.jvm.internal.i.e(aVar2, str);
            q.a(list2, aVar2);
            collection.addAll(arrayList2);
        }
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.f c(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(bVar, "location");
        if (U(fVar)) {
            return T(fVar);
        }
        return bOT().contains(fVar) ? (kotlin.reflect.jvm.internal.impl.descriptors.f) this.fwh.invoke(fVar) : null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d T(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return this.fvy.bys().m(P(fVar));
    }

    /* Access modifiers changed, original: protected */
    public boolean U(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        return bOU().contains(fVar);
    }

    private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> Y(Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>> map) {
        Map linkedHashMap = new LinkedHashMap(af.jL(map.size()));
        for (Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<kotlin.reflect.jvm.internal.impl.protobuf.a> iterable = (Iterable) entry.getValue();
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (kotlin.reflect.jvm.internal.impl.protobuf.a d : iterable) {
                d.d(byteArrayOutputStream);
                arrayList.add(l.eVB);
            }
            List list = (List) arrayList;
            linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap;
    }
}

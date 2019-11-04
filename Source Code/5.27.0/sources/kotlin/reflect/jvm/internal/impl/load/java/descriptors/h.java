package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ai;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l;
import kotlin.reflect.jvm.internal.impl.load.java.n;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.t;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: util.kt */
public final class h {
    public static final List<ar> a(Collection<i> collection, Collection<? extends ar> collection2, a aVar) {
        Collection<i> collection3 = collection;
        Collection<? extends ar> collection4 = collection2;
        a aVar2 = aVar;
        i.f(collection3, "newValueParametersTypes");
        i.f(collection4, "oldValueParameters");
        i.f(aVar2, "newOwner");
        Object obj = collection.size() == collection2.size() ? 1 : null;
        if (m.eVC && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Different value parameters sizes: Enhanced = ");
            stringBuilder.append(collection.size());
            stringBuilder.append(", Old = ");
            stringBuilder.append(collection2.size());
            throw new AssertionError(stringBuilder.toString());
        }
        Iterable<Pair> e = u.e((Iterable) collection3, (Iterable) collection4);
        Collection arrayList = new ArrayList(n.e(e, 10));
        for (Pair pair : e) {
            i iVar = (i) pair.bnj();
            ar arVar = (ar) pair.bnk();
            int index = arVar.getIndex();
            f brE = arVar.brE();
            kotlin.reflect.jvm.internal.impl.name.f bsZ = arVar.bsZ();
            i.e(bsZ, "oldParameter.name");
            w bpT = iVar.bpT();
            boolean bvO = iVar.bvO();
            boolean btU = arVar.btU();
            boolean btV = arVar.btV();
            w m = arVar.btS() != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.P(aVar2).btw().m(iVar.bpT()) : null;
            aj brF = arVar.brF();
            i.e(brF, "oldParameter.source");
            arrayList.add(new ai(aVar, null, index, brE, bsZ, bpT, bvO, btU, btV, m, brF));
        }
        return (List) arrayList;
    }

    public static final l z(d dVar) {
        i.f(dVar, "$this$getParentJavaStaticClassScope");
        dVar = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.L(dVar);
        if (dVar == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h brl = dVar.brl();
        i.e(brl, "superClassDescriptor.staticScope");
        if (brl instanceof l) {
            return (l) brl;
        }
        return z(dVar);
    }

    public static final c a(DeserializedMemberDescriptor deserializedMemberDescriptor) {
        i.f(deserializedMemberDescriptor, "$this$getImplClassNameForDeserialized");
        e bOp = deserializedMemberDescriptor.bOp();
        if (!(bOp instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.h)) {
            bOp = null;
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.h hVar = (kotlin.reflect.jvm.internal.impl.load.kotlin.h) bOp;
        return hVar != null ? hVar.byA() : null;
    }

    public static final a d(ar arVar) {
        i.f(arVar, "$this$getDefaultValueFromAnnotation");
        f brE = arVar.brE();
        b bVar = n.fhx;
        i.e(bVar, "JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c i = brE.i(bVar);
        if (i != null) {
            g n = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.n(i);
            if (n != null) {
                if (!(n instanceof t)) {
                    n = null;
                }
                t tVar = (t) n;
                if (tVar != null) {
                    String str = (String) tVar.getValue();
                    if (str != null) {
                        return new g(str);
                    }
                }
            }
        }
        f brE2 = arVar.brE();
        b bVar2 = n.fhy;
        i.e(bVar2, "JvmAnnotationNames.DEFAULT_NULL_FQ_NAME");
        if (brE2.j(bVar2)) {
            return f.fix;
        }
        return null;
    }
}

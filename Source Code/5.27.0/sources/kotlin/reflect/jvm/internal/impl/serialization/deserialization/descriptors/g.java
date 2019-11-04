package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.a.a;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.j;

/* compiled from: DeserializedPackageMemberScope.kt */
public class g extends f {
    private final y fwk;
    private final b packageFqName = this.fwk.btB();

    /* Access modifiers changed, original: protected */
    public void c(Collection<k> collection, kotlin.jvm.a.b<? super f, Boolean> bVar) {
        i.f(collection, "result");
        i.f(bVar, "nameFilter");
    }

    public g(y yVar, Package packageR, c cVar, a aVar, e eVar, h hVar, kotlin.jvm.a.a<? extends Collection<f>> aVar2) {
        y yVar2 = yVar;
        i.f(yVar2, "packageDescriptor");
        i.f(packageR, "proto");
        i.f(cVar, "nameResolver");
        i.f(aVar, "metadataVersion");
        i.f(hVar, "components");
        kotlin.jvm.a.a<? extends Collection<f>> aVar3 = aVar2;
        i.f(aVar3, "classNames");
        TypeTable bAP = packageR.bAP();
        i.e(bAP, "proto.typeTable");
        kotlin.reflect.jvm.internal.impl.metadata.a.h hVar2 = new kotlin.reflect.jvm.internal.impl.metadata.a.h(bAP);
        kotlin.reflect.jvm.internal.impl.metadata.a.k.a aVar4 = kotlin.reflect.jvm.internal.impl.metadata.a.k.fon;
        VersionRequirementTable bAS = packageR.bAS();
        i.e(bAS, "proto.versionRequirementTable");
        j a = hVar.a(yVar, cVar, hVar2, aVar4.g(bAS), aVar, eVar);
        List bAF = packageR.bAF();
        i.e(bAF, "proto.functionList");
        Collection collection = bAF;
        bAF = packageR.bAH();
        i.e(bAF, "proto.propertyList");
        Collection collection2 = bAF;
        bAF = packageR.bAJ();
        i.e(bAF, "proto.typeAliasList");
        super(a, collection, collection2, bAF, aVar3);
        this.fwk = yVar2;
    }

    /* renamed from: f */
    public List<k> a(d dVar, kotlin.jvm.a.b<? super f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        i.f(bVar, "nameFilter");
        Collection b = b(dVar, bVar, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Collection arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.a.b d : bOB().bys().bOe()) {
            r.a(arrayList, (Iterable) d.d(this.packageFqName));
        }
        return u.b(b, (Iterable) (List) arrayList);
    }

    /* Access modifiers changed, original: protected */
    public boolean U(f fVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        if (super.U(fVar)) {
            return true;
        }
        Object obj;
        Iterable<kotlin.reflect.jvm.internal.impl.descriptors.a.b> bOe = bOB().bys().bOe();
        if (!((bOe instanceof Collection) && ((Collection) bOe).isEmpty())) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.a.b a : bOe) {
                if (a.a(this.packageFqName, fVar)) {
                    obj = 1;
                    break;
                }
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public kotlin.reflect.jvm.internal.impl.name.a P(f fVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        return new kotlin.reflect.jvm.internal.impl.name.a(this.packageFqName, fVar);
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.f c(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        d(fVar, bVar);
        return super.c(fVar, bVar);
    }

    public void d(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        kotlin.reflect.jvm.internal.impl.incremental.a.a(bOB().bys().bwa(), bVar, this.fwk, fVar);
    }

    /* Access modifiers changed, original: protected */
    public Set<f> bOM() {
        return al.emptySet();
    }

    /* Access modifiers changed, original: protected */
    public Set<f> bON() {
        return al.emptySet();
    }
}

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.a.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.incremental.components.c;
import kotlin.reflect.jvm.internal.impl.metadata.a.k;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e;

/* compiled from: context.kt */
public final class h {
    private final kotlin.reflect.jvm.internal.impl.storage.h eZz;
    private final x fbm;
    private final v fcf;
    private final l fiD;
    private final c fiK;
    private final f fvc = new f(this);
    private final i fvd;
    private final e fve;
    private final a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, g<?>> fvf;
    private final z fvg;
    private final o fvh;
    private final m fvi;
    private final Iterable<b> fvj;
    private final g fvk;
    private final a fvl;
    private final kotlin.reflect.jvm.internal.impl.descriptors.a.c fvm;
    private final f fvn;

    public h(kotlin.reflect.jvm.internal.impl.storage.h hVar, v vVar, i iVar, e eVar, a<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, ? extends g<?>> aVar, z zVar, o oVar, l lVar, c cVar, m mVar, Iterable<? extends b> iterable, x xVar, g gVar, a aVar2, kotlin.reflect.jvm.internal.impl.descriptors.a.c cVar2, f fVar) {
        kotlin.reflect.jvm.internal.impl.storage.h hVar2 = hVar;
        v vVar2 = vVar;
        i iVar2 = iVar;
        e eVar2 = eVar;
        a<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, ? extends g<?>> aVar3 = aVar;
        z zVar2 = zVar;
        o oVar2 = oVar;
        l lVar2 = lVar;
        c cVar3 = cVar;
        m mVar2 = mVar;
        Iterable<? extends b> iterable2 = iterable;
        x xVar2 = xVar;
        g gVar2 = gVar;
        a aVar4 = aVar2;
        kotlin.reflect.jvm.internal.impl.descriptors.a.c cVar4 = cVar2;
        i.f(hVar2, "storageManager");
        i.f(vVar2, "moduleDescriptor");
        i.f(iVar2, "configuration");
        i.f(eVar2, "classDataFinder");
        i.f(aVar3, "annotationAndConstantLoader");
        i.f(zVar2, "packageFragmentProvider");
        i.f(oVar2, "localClassifierTypeSettings");
        i.f(lVar2, "errorReporter");
        i.f(cVar3, "lookupTracker");
        i.f(mVar2, "flexibleTypeDeserializer");
        i.f(iterable2, "fictitiousClassDescriptorFactories");
        i.f(xVar2, "notFoundClasses");
        i.f(gVar2, "contractDeserializer");
        i.f(aVar4, "additionalClassPartsProvider");
        i.f(cVar4, "platformDependentDeclarationFilter");
        f fVar2 = fVar;
        i.f(fVar2, "extensionRegistryLite");
        this.eZz = hVar2;
        this.fcf = vVar2;
        this.fvd = iVar2;
        this.fve = eVar2;
        this.fvf = aVar3;
        this.fvg = zVar2;
        this.fvh = oVar2;
        this.fiD = lVar2;
        this.fiK = cVar3;
        this.fvi = mVar2;
        this.fvj = iterable2;
        this.fbm = xVar2;
        this.fvk = gVar2;
        this.fvl = aVar4;
        this.fvm = cVar2;
        this.fvn = fVar2;
    }

    public final kotlin.reflect.jvm.internal.impl.storage.h bqz() {
        return this.eZz;
    }

    public final v bNY() {
        return this.fcf;
    }

    public final i bNZ() {
        return this.fvd;
    }

    public final e bOa() {
        return this.fve;
    }

    public final a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, g<?>> bOb() {
        return this.fvf;
    }

    public final z buP() {
        return this.fvg;
    }

    public final o bOc() {
        return this.fvh;
    }

    public final l bvU() {
        return this.fiD;
    }

    public final c bwa() {
        return this.fiK;
    }

    public final m bOd() {
        return this.fvi;
    }

    public final Iterable<b> bOe() {
        return this.fvj;
    }

    public final x bOf() {
        return this.fbm;
    }

    public final g bOg() {
        return this.fvk;
    }

    public final a bqw() {
        return this.fvl;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.a.c bqx() {
        return this.fvm;
    }

    public final f bOh() {
        return this.fvn;
    }

    public final f bNX() {
        return this.fvc;
    }

    public final d m(kotlin.reflect.jvm.internal.impl.name.a aVar) {
        i.f(aVar, "classId");
        return f.a(this.fvc, aVar, null, 2, null);
    }

    public final j a(y yVar, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar, kotlin.reflect.jvm.internal.impl.metadata.a.h hVar, k kVar, kotlin.reflect.jvm.internal.impl.metadata.a.a aVar, e eVar) {
        y yVar2 = yVar;
        i.f(yVar, "descriptor");
        kotlin.reflect.jvm.internal.impl.metadata.a.c cVar2 = cVar;
        i.f(cVar, "nameResolver");
        kotlin.reflect.jvm.internal.impl.metadata.a.h hVar2 = hVar;
        i.f(hVar, "typeTable");
        k kVar2 = kVar;
        i.f(kVar2, "versionRequirementTable");
        kotlin.reflect.jvm.internal.impl.metadata.a.a aVar2 = aVar;
        i.f(aVar2, "metadataVersion");
        return new j(this, cVar2, yVar2, hVar2, kVar2, aVar2, eVar, null, m.emptyList());
    }
}

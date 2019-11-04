package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.a.h;
import kotlin.reflect.jvm.internal.impl.metadata.a.i;
import kotlin.reflect.jvm.internal.impl.metadata.a.k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b.a;

/* compiled from: DeserializedMemberDescriptor.kt */
public final class c extends f implements b {
    private final kotlin.reflect.jvm.internal.impl.metadata.a.c eWN;
    private final h eWO;
    private CoroutinesCompatibilityMode fvR;
    private final Constructor fvS;
    private final k fvr;
    private final e fvs;

    public boolean brA() {
        return false;
    }

    public boolean brD() {
        return false;
    }

    public boolean brV() {
        return false;
    }

    public boolean bto() {
        return false;
    }

    public List<i> bOA() {
        return a.a(this);
    }

    /* renamed from: bOy */
    public Constructor bOz() {
        return this.fvS;
    }

    public kotlin.reflect.jvm.internal.impl.metadata.a.c bot() {
        return this.eWN;
    }

    public h bou() {
        return this.eWO;
    }

    public k bOo() {
        return this.fvr;
    }

    public e bOp() {
        return this.fvs;
    }

    public /* synthetic */ c(d dVar, j jVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, boolean z, Kind kind, Constructor constructor, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar, h hVar, k kVar, e eVar, aj ajVar, int i, f fVar2) {
        this(dVar, jVar, fVar, z, kind, constructor, cVar, hVar, kVar, eVar, (i & 1024) != 0 ? (aj) null : ajVar);
    }

    public c(d dVar, j jVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, boolean z, Kind kind, Constructor constructor, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar, h hVar, k kVar, e eVar, aj ajVar) {
        Constructor constructor2 = constructor;
        kotlin.reflect.jvm.internal.impl.metadata.a.c cVar2 = cVar;
        h hVar2 = hVar;
        k kVar2 = kVar;
        d dVar2 = dVar;
        kotlin.jvm.internal.i.f(dVar, "containingDeclaration");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar2 = fVar;
        kotlin.jvm.internal.i.f(fVar, "annotations");
        kotlin.jvm.internal.i.f(kind, "kind");
        kotlin.jvm.internal.i.f(constructor2, "proto");
        kotlin.jvm.internal.i.f(cVar2, "nameResolver");
        kotlin.jvm.internal.i.f(hVar2, "typeTable");
        kotlin.jvm.internal.i.f(kVar2, "versionRequirementTable");
        super(dVar, jVar, fVar, z, kind, ajVar != null ? ajVar : aj.fcV);
        this.fvS = constructor2;
        this.eWN = cVar2;
        this.eWO = hVar2;
        this.fvr = kVar2;
        this.fvs = eVar;
        this.fvR = CoroutinesCompatibilityMode.COMPATIBLE;
    }

    public void a(CoroutinesCompatibilityMode coroutinesCompatibilityMode) {
        kotlin.jvm.internal.i.f(coroutinesCompatibilityMode, "<set-?>");
        this.fvR = coroutinesCompatibilityMode;
    }

    public CoroutinesCompatibilityMode bOx() {
        return this.fvR;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: f */
    public c b(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, s sVar, Kind kind, kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar2, aj ajVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar2 = kVar;
        kotlin.jvm.internal.i.f(kVar, "newOwner");
        Kind kind2 = kind;
        kotlin.jvm.internal.i.f(kind2, "kind");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar3 = fVar2;
        kotlin.jvm.internal.i.f(fVar3, "annotations");
        aj ajVar2 = ajVar;
        kotlin.jvm.internal.i.f(ajVar2, "source");
        c cVar = new c((d) kVar2, (j) sVar, fVar3, this.feh, kind2, bOz(), bot(), bou(), bOo(), bOp(), ajVar2);
        cVar.a(bOx());
        return cVar;
    }
}

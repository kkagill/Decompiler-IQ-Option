package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ad;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.metadata.a.h;
import kotlin.reflect.jvm.internal.impl.metadata.a.k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b.a;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: DeserializedMemberDescriptor.kt */
public final class i extends ad implements b {
    private final c eWN;
    private final h eWO;
    private CoroutinesCompatibilityMode fvR;
    private final k fvr;
    private final e fvs;
    private final Function fwl;

    public List<kotlin.reflect.jvm.internal.impl.metadata.a.i> bOA() {
        return a.a(this);
    }

    /* renamed from: bOW */
    public Function bOz() {
        return this.fwl;
    }

    public c bot() {
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

    public /* synthetic */ i(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, ai aiVar, f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, Kind kind, Function function, c cVar, h hVar, k kVar2, e eVar, aj ajVar, int i, f fVar3) {
        this(kVar, aiVar, fVar, fVar2, kind, function, cVar, hVar, kVar2, eVar, (i & 1024) != 0 ? (aj) null : ajVar);
    }

    public i(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, ai aiVar, f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, Kind kind, Function function, c cVar, h hVar, k kVar2, e eVar, aj ajVar) {
        Function function2 = function;
        c cVar2 = cVar;
        h hVar2 = hVar;
        k kVar3 = kVar2;
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar4 = kVar;
        kotlin.jvm.internal.i.f(kVar, "containingDeclaration");
        f fVar3 = fVar;
        kotlin.jvm.internal.i.f(fVar, "annotations");
        kotlin.jvm.internal.i.f(fVar2, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(kind, "kind");
        kotlin.jvm.internal.i.f(function2, "proto");
        kotlin.jvm.internal.i.f(cVar2, "nameResolver");
        kotlin.jvm.internal.i.f(hVar2, "typeTable");
        kotlin.jvm.internal.i.f(kVar3, "versionRequirementTable");
        super(kVar, aiVar, fVar, fVar2, kind, ajVar != null ? ajVar : aj.fcV);
        this.fwl = function2;
        this.eWN = cVar2;
        this.eWO = hVar2;
        this.fvr = kVar3;
        this.fvs = eVar;
        this.fvR = CoroutinesCompatibilityMode.COMPATIBLE;
    }

    public CoroutinesCompatibilityMode bOx() {
        return this.fvR;
    }

    public final ad a(ah ahVar, ah ahVar2, List<? extends ao> list, List<? extends ar> list2, w wVar, Modality modality, aw awVar, Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.a.a<?>, ?> map, CoroutinesCompatibilityMode coroutinesCompatibilityMode) {
        kotlin.jvm.internal.i.f(list, "typeParameters");
        kotlin.jvm.internal.i.f(list2, "unsubstitutedValueParameters");
        kotlin.jvm.internal.i.f(awVar, "visibility");
        kotlin.jvm.internal.i.f(map, "userDataMap");
        kotlin.jvm.internal.i.f(coroutinesCompatibilityMode, "isExperimentalCoroutineInReleaseEnvironment");
        ad a = super.a(ahVar, ahVar2, list, list2, wVar, modality, awVar, map);
        this.fvR = coroutinesCompatibilityMode;
        kotlin.jvm.internal.i.e(a, "super.initialize(\n      …easeEnvironment\n        }");
        return a;
    }

    /* Access modifiers changed, original: protected */
    public p a(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, s sVar, Kind kind, kotlin.reflect.jvm.internal.impl.name.f fVar, f fVar2, aj ajVar) {
        kotlin.reflect.jvm.internal.impl.name.f fVar3;
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar2 = kVar;
        kotlin.jvm.internal.i.f(kVar, "newOwner");
        kotlin.jvm.internal.i.f(kind, "kind");
        kotlin.jvm.internal.i.f(fVar2, "annotations");
        kotlin.jvm.internal.i.f(ajVar, "source");
        ai aiVar = (ai) sVar;
        if (fVar != null) {
            fVar3 = fVar;
        } else {
            kotlin.reflect.jvm.internal.impl.name.f bsZ = bsZ();
            kotlin.jvm.internal.i.e(bsZ, ConditionalUserProperty.NAME);
            fVar3 = bsZ;
        }
        i iVar = new i(kVar, aiVar, fVar2, fVar3, kind, bOz(), bot(), bou(), bOo(), bOp(), ajVar);
        iVar.fvR = bOx();
        return iVar;
    }
}

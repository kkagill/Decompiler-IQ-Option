package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.List;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ag;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.q;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.a.b;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.metadata.a.i;
import kotlin.reflect.jvm.internal.impl.metadata.a.k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b.a;

/* compiled from: DeserializedMemberDescriptor.kt */
public final class h extends z implements b {
    private final Property eWL;
    private final c eWN;
    private final kotlin.reflect.jvm.internal.impl.metadata.a.h eWO;
    private CoroutinesCompatibilityMode fvR = CoroutinesCompatibilityMode.COMPATIBLE;
    private final k fvr;
    private final e fvs;

    public List<i> bOA() {
        return a.a(this);
    }

    /* renamed from: bor */
    public Property bOz() {
        return this.eWL;
    }

    public c bot() {
        return this.eWN;
    }

    public kotlin.reflect.jvm.internal.impl.metadata.a.h bou() {
        return this.eWO;
    }

    public k bOo() {
        return this.fvr;
    }

    public e bOp() {
        return this.fvs;
    }

    public h(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, ae aeVar, f fVar, Modality modality, aw awVar, boolean z, kotlin.reflect.jvm.internal.impl.name.f fVar2, Kind kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Property property, c cVar, kotlin.reflect.jvm.internal.impl.metadata.a.h hVar, k kVar2, e eVar) {
        Property property2 = property;
        c cVar2 = cVar;
        kotlin.reflect.jvm.internal.impl.metadata.a.h hVar2 = hVar;
        k kVar3 = kVar2;
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar4 = kVar;
        kotlin.jvm.internal.i.f(kVar4, "containingDeclaration");
        f fVar3 = fVar;
        kotlin.jvm.internal.i.f(fVar3, "annotations");
        Modality modality2 = modality;
        kotlin.jvm.internal.i.f(modality2, "modality");
        aw awVar2 = awVar;
        kotlin.jvm.internal.i.f(awVar2, "visibility");
        kotlin.reflect.jvm.internal.impl.name.f fVar4 = fVar2;
        kotlin.jvm.internal.i.f(fVar4, ConditionalUserProperty.NAME);
        Kind kind2 = kind;
        kotlin.jvm.internal.i.f(kind2, "kind");
        kotlin.jvm.internal.i.f(property2, "proto");
        kotlin.jvm.internal.i.f(cVar2, "nameResolver");
        kotlin.jvm.internal.i.f(hVar2, "typeTable");
        kotlin.jvm.internal.i.f(kVar3, "versionRequirementTable");
        super(kVar4, aeVar, fVar3, modality2, awVar2, z, fVar4, kind2, aj.fcV, z2, z3, z6, false, z4, z5);
        this.eWL = property;
        this.eWN = cVar;
        this.eWO = hVar;
        this.fvr = kVar2;
        this.fvs = eVar;
    }

    public final void a(aa aaVar, ag agVar, q qVar, q qVar2, CoroutinesCompatibilityMode coroutinesCompatibilityMode) {
        kotlin.jvm.internal.i.f(coroutinesCompatibilityMode, "isExperimentalCoroutineInReleaseEnvironment");
        super.a(aaVar, agVar, qVar, qVar2);
        l lVar = l.eVB;
        this.fvR = coroutinesCompatibilityMode;
    }

    /* Access modifiers changed, original: protected */
    public z a(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, Modality modality, aw awVar, ae aeVar, Kind kind, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar2 = kVar;
        Modality modality2 = modality;
        aw awVar2 = awVar;
        ae aeVar2 = aeVar;
        Kind kind2 = kind;
        kotlin.reflect.jvm.internal.impl.name.f fVar2 = fVar;
        kotlin.jvm.internal.i.f(kVar, "newOwner");
        kotlin.jvm.internal.i.f(modality, "newModality");
        kotlin.jvm.internal.i.f(awVar, "newVisibility");
        kotlin.jvm.internal.i.f(kind, "kind");
        kotlin.jvm.internal.i.f(fVar, "newName");
        return new h(kVar2, aeVar2, brE(), modality2, awVar2, btW(), fVar2, kind2, btZ(), btY(), brD(), bua(), brB(), bOz(), bot(), bou(), bOo(), bOp());
    }

    public boolean brD() {
        Boolean lB = b.fnO.get(bOz().getFlags());
        kotlin.jvm.internal.i.e(lB, "Flags.IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return lB.booleanValue();
    }
}

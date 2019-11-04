package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ap;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.af;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.metadata.a.h;
import kotlin.reflect.jvm.internal.impl.metadata.a.i;
import kotlin.reflect.jvm.internal.impl.metadata.a.k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.a;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.y;

/* compiled from: DeserializedMemberDescriptor.kt */
public final class j extends d implements DeserializedMemberDescriptor {
    private final c eWN;
    private final h eWO;
    private final kotlin.reflect.jvm.internal.impl.storage.h eZz;
    private List<? extends ao> ffw;
    private CoroutinesCompatibilityMode fvR = CoroutinesCompatibilityMode.COMPATIBLE;
    private final k fvr;
    private final e fvs;
    private Collection<? extends af> fwm;
    private ad fwn;
    private ad fwo;
    private ad fwp;
    private final TypeAlias fwq;

    public List<i> bOA() {
        return a.d(this);
    }

    /* Access modifiers changed, original: protected */
    public kotlin.reflect.jvm.internal.impl.storage.h bqz() {
        return this.eZz;
    }

    /* renamed from: bOX */
    public TypeAlias bOz() {
        return this.fwq;
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

    public j(kotlin.reflect.jvm.internal.impl.storage.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.k kVar, f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, aw awVar, TypeAlias typeAlias, c cVar, h hVar2, k kVar2, e eVar) {
        kotlin.reflect.jvm.internal.impl.storage.h hVar3 = hVar;
        TypeAlias typeAlias2 = typeAlias;
        c cVar2 = cVar;
        h hVar4 = hVar2;
        k kVar3 = kVar2;
        kotlin.jvm.internal.i.f(hVar, "storageManager");
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar4 = kVar;
        kotlin.jvm.internal.i.f(kVar, "containingDeclaration");
        f fVar3 = fVar;
        kotlin.jvm.internal.i.f(fVar, "annotations");
        kotlin.reflect.jvm.internal.impl.name.f fVar4 = fVar2;
        kotlin.jvm.internal.i.f(fVar4, ConditionalUserProperty.NAME);
        aw awVar2 = awVar;
        kotlin.jvm.internal.i.f(awVar2, "visibility");
        kotlin.jvm.internal.i.f(typeAlias2, "proto");
        kotlin.jvm.internal.i.f(cVar2, "nameResolver");
        kotlin.jvm.internal.i.f(hVar4, "typeTable");
        kotlin.jvm.internal.i.f(kVar3, "versionRequirementTable");
        aj ajVar = aj.fcV;
        kotlin.jvm.internal.i.e(ajVar, "SourceElement.NO_SOURCE");
        super(kVar4, fVar3, fVar4, ajVar, awVar2);
        this.eZz = hVar3;
        this.fwq = typeAlias2;
        this.eWN = cVar2;
        this.eWO = hVar4;
        this.fvr = kVar3;
        this.fvs = eVar;
    }

    public ad btN() {
        ad adVar = this.fwn;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG("underlyingType");
        }
        return adVar;
    }

    public ad btO() {
        ad adVar = this.fwo;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG("expandedType");
        }
        return adVar;
    }

    public CoroutinesCompatibilityMode bOx() {
        return this.fvR;
    }

    public final void a(List<? extends ao> list, ad adVar, ad adVar2, CoroutinesCompatibilityMode coroutinesCompatibilityMode) {
        kotlin.jvm.internal.i.f(list, "declaredTypeParameters");
        kotlin.jvm.internal.i.f(adVar, "underlyingType");
        kotlin.jvm.internal.i.f(adVar2, "expandedType");
        kotlin.jvm.internal.i.f(coroutinesCompatibilityMode, "isExperimentalCoroutineInReleaseEnvironment");
        cd(list);
        this.fwn = adVar;
        this.fwo = adVar2;
        this.ffw = ap.a(this);
        this.fwp = bun();
        this.fwm = buj();
        this.fvR = coroutinesCompatibilityMode;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.d btP() {
        if (y.aJ(btO())) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = btO().bMZ().brQ();
        if (!(brQ instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            brQ = null;
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.d) brQ;
    }

    public ad bsY() {
        ad adVar = this.fwp;
        if (adVar == null) {
            kotlin.jvm.internal.i.lG("defaultTypeImpl");
        }
        return adVar;
    }

    /* renamed from: k */
    public an f(TypeSubstitutor typeSubstitutor) {
        kotlin.jvm.internal.i.f(typeSubstitutor, "substitutor");
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        kotlin.reflect.jvm.internal.impl.storage.h bqz = bqz();
        kotlin.reflect.jvm.internal.impl.descriptors.k brj = brj();
        kotlin.jvm.internal.i.e(brj, "containingDeclaration");
        f brE = brE();
        kotlin.jvm.internal.i.e(brE, "annotations");
        kotlin.reflect.jvm.internal.impl.name.f bsZ = bsZ();
        kotlin.jvm.internal.i.e(bsZ, ConditionalUserProperty.NAME);
        j jVar = new j(bqz, brj, brE, bsZ, brx(), bOz(), bot(), bou(), bOo(), bOp());
        List brI = brI();
        w b = typeSubstitutor.b((w) btN(), Variance.INVARIANT);
        String str = "substitutor.safeSubstitu…Type, Variance.INVARIANT)";
        kotlin.jvm.internal.i.e(b, str);
        ad aU = at.aU(b);
        w b2 = typeSubstitutor.b((w) btO(), Variance.INVARIANT);
        kotlin.jvm.internal.i.e(b2, str);
        jVar.a(brI, aU, at.aU(b2), bOx());
        return jVar;
    }

    /* Access modifiers changed, original: protected */
    public List<ao> bum() {
        List list = this.ffw;
        if (list == null) {
            kotlin.jvm.internal.i.lG("typeConstructorParameters");
        }
        return list;
    }
}

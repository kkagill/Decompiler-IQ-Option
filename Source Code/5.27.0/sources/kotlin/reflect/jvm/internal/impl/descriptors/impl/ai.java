package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: ValueParameterDescriptorImpl.kt */
public class ai extends aj implements ar {
    public static final a fgl = new a();
    private final ar fgg;
    private final boolean fgh;
    private final boolean fgi;
    private final boolean fgj;
    private final w fgk;
    private final int index;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public boolean btW() {
        return false;
    }

    public Void bvj() {
        return null;
    }

    public /* synthetic */ g btX() {
        return (g) bvj();
    }

    public boolean btZ() {
        return kotlin.reflect.jvm.internal.impl.descriptors.ar.a.b(this);
    }

    public int getIndex() {
        return this.index;
    }

    public boolean btU() {
        return this.fgi;
    }

    public boolean btV() {
        return this.fgj;
    }

    public w btS() {
        return this.fgk;
    }

    public ai(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, ar arVar, int i, f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, w wVar, boolean z, boolean z2, boolean z3, w wVar2, aj ajVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = aVar;
        i.f(aVar, "containingDeclaration");
        f fVar3 = fVar;
        i.f(fVar, "annotations");
        kotlin.reflect.jvm.internal.impl.name.f fVar4 = fVar2;
        i.f(fVar2, ConditionalUserProperty.NAME);
        w wVar3 = wVar;
        i.f(wVar, "outType");
        aj ajVar2 = ajVar;
        i.f(ajVar2, "source");
        super(aVar2, fVar3, fVar4, wVar3, ajVar2);
        this.index = i;
        this.fgh = z;
        this.fgi = z2;
        this.fgj = z3;
        this.fgk = wVar2;
        this.fgg = arVar != null ? arVar : this;
    }

    /* renamed from: btQ */
    public kotlin.reflect.jvm.internal.impl.descriptors.a brj() {
        k brj = super.brj();
        if (brj != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.a) brj;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
    }

    public boolean btR() {
        if (this.fgh) {
            kotlin.reflect.jvm.internal.impl.descriptors.a btQ = brj();
            if (btQ != null) {
                Kind bsT = ((CallableMemberDescriptor) btQ).bsT();
                i.e(bsT, "(containingDeclaration a…bleMemberDescriptor).kind");
                if (bsT.isReal()) {
                    return true;
                }
            }
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        }
        return false;
    }

    /* renamed from: btT */
    public ar bul() {
        ar arVar = this.fgg;
        return arVar == ((ai) this) ? this : arVar.btT();
    }

    /* renamed from: j */
    public ar f(TypeSubstitutor typeSubstitutor) {
        i.f(typeSubstitutor, "substitutor");
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        i.f(mVar, "visitor");
        return mVar.a((ar) this, (Object) d);
    }

    public ar a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.name.f fVar, int i) {
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = aVar;
        i.f(aVar, "newOwner");
        kotlin.reflect.jvm.internal.impl.name.f fVar2 = fVar;
        i.f(fVar, "newName");
        f brE = brE();
        i.e(brE, "annotations");
        w bpT = bpT();
        i.e(bpT, "type");
        boolean btR = btR();
        boolean btU = btU();
        boolean btV = btV();
        w btS = btS();
        aj ajVar = aj.fcV;
        i.e(ajVar, "SourceElement.NO_SOURCE");
        return new ai(aVar2, null, i, brE, fVar2, bpT, btR, btU, btV, btS, ajVar);
    }

    public aw brx() {
        aw awVar = av.fdf;
        i.e(awVar, "Visibilities.LOCAL");
        return awVar;
    }

    public Collection<ar> bsR() {
        Collection bsR = brj().bsR();
        i.e(bsR, "containingDeclaration.overriddenDescriptors");
        Iterable<kotlin.reflect.jvm.internal.impl.descriptors.a> iterable = bsR;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.a aVar : iterable) {
            i.e(aVar, "it");
            arrayList.add((ar) aVar.bsP().get(getIndex()));
        }
        return (List) arrayList;
    }
}

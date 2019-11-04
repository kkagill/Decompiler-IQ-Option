package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.iqoption.dto.entity.ActiveQuote;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.w;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ad;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.j;

/* compiled from: FunctionInvokeDescriptor.kt */
public final class e extends ad {
    public static final a fbJ = new a();

    /* compiled from: FunctionInvokeDescriptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final e a(FunctionClassDescriptor functionClassDescriptor, boolean z) {
            i.f(functionClassDescriptor, "functionClass");
            List brI = functionClassDescriptor.brI();
            e eVar = new e(functionClassDescriptor, null, Kind.DECLARATION, z, null);
            ah bte = functionClassDescriptor.bte();
            List emptyList = m.emptyList();
            Iterable iterable = brI;
            ArrayList arrayList = new ArrayList();
            for (Object next : iterable) {
                if ((((ao) next).bta() == Variance.IN_VARIANCE ? 1 : null) == null) {
                    break;
                }
                arrayList.add(next);
            }
            Iterable<w> W = u.W(arrayList);
            Collection arrayList2 = new ArrayList(n.e(W, 10));
            for (w wVar : W) {
                arrayList2.add(e.fbJ.a(eVar, wVar.getIndex(), (ao) wVar.getValue()));
            }
            eVar.a(null, bte, emptyList, (List) arrayList2, ((ao) u.bW(brI)).bsY(), Modality.ABSTRACT, av.fde);
            eVar.gC(true);
            return eVar;
        }

        private final ar a(e eVar, int i, ao aoVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar;
            f bug;
            kotlin.reflect.jvm.internal.impl.name.f ms;
            kotlin.reflect.jvm.internal.impl.types.ad bsY;
            kotlin.reflect.jvm.internal.impl.types.w wVar;
            aj ajVar;
            String boi = aoVar.bsZ().boi();
            i.e(boi, "typeParameter.name.asString()");
            int hashCode = boi.hashCode();
            if (hashCode != 69) {
                if (hashCode == 84 && boi.equals(ActiveQuote.PHASE_TRADING)) {
                    boi = "instance";
                    aVar = eVar;
                    bug = f.fdA.bug();
                    ms = kotlin.reflect.jvm.internal.impl.name.f.ms(boi);
                    i.e(ms, "Name.identifier(name)");
                    bsY = aoVar.bsY();
                    i.e(bsY, "typeParameter.defaultType");
                    wVar = bsY;
                    ajVar = aj.fcV;
                    i.e(ajVar, "SourceElement.NO_SOURCE");
                    return new ai(aVar, null, i, bug, ms, wVar, false, false, false, null, ajVar);
                }
            } else if (boi.equals("E")) {
                boi = "receiver";
                aVar = eVar;
                bug = f.fdA.bug();
                ms = kotlin.reflect.jvm.internal.impl.name.f.ms(boi);
                i.e(ms, "Name.identifier(name)");
                bsY = aoVar.bsY();
                i.e(bsY, "typeParameter.defaultType");
                wVar = bsY;
                ajVar = aj.fcV;
                i.e(ajVar, "SourceElement.NO_SOURCE");
                return new ai(aVar, null, i, bug, ms, wVar, false, false, false, null, ajVar);
            }
            if (boi != null) {
                boi = boi.toLowerCase();
                i.e(boi, "(this as java.lang.String).toLowerCase()");
                aVar = eVar;
                bug = f.fdA.bug();
                ms = kotlin.reflect.jvm.internal.impl.name.f.ms(boi);
                i.e(ms, "Name.identifier(name)");
                bsY = aoVar.bsY();
                i.e(bsY, "typeParameter.defaultType");
                wVar = bsY;
                ajVar = aj.fcV;
                i.e(ajVar, "SourceElement.NO_SOURCE");
                return new ai(aVar, null, i, bug, ms, wVar, false, false, false, null, ajVar);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public boolean brA() {
        return false;
    }

    public boolean brD() {
        return false;
    }

    public boolean brV() {
        return false;
    }

    public /* synthetic */ e(k kVar, e eVar, Kind kind, boolean z, f fVar) {
        this(kVar, eVar, kind, z);
    }

    private e(k kVar, e eVar, Kind kind, boolean z) {
        super(kVar, eVar, f.fdA.bug(), j.fyN, kind, aj.fcV);
        gr(true);
        gA(z);
        gB(false);
    }

    /* Access modifiers changed, original: protected */
    public s a(kotlin.reflect.jvm.internal.impl.descriptors.impl.p.a aVar) {
        i.f(aVar, "configuration");
        e eVar = (e) super.a(aVar);
        if (eVar == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.w bpT;
        List bsP = eVar.bsP();
        String str = "substituted.valueParameters";
        i.e(bsP, str);
        Iterable<ar> iterable = bsP;
        String str2 = "it.type";
        String str3 = "it";
        Object obj = 1;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (ar arVar : iterable) {
                Object obj2;
                i.e(arVar, str3);
                bpT = arVar.bpT();
                i.e(bpT, str2);
                if (kotlin.reflect.jvm.internal.impl.builtins.f.l(bpT) != null) {
                    obj2 = 1;
                    continue;
                } else {
                    obj2 = null;
                    continue;
                }
                if (obj2 != null) {
                    obj = null;
                    break;
                }
            }
        }
        if (obj != null) {
            return eVar;
        }
        bsP = eVar.bsP();
        i.e(bsP, str);
        iterable = bsP;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (ar arVar2 : iterable) {
            i.e(arVar2, str3);
            bpT = arVar2.bpT();
            i.e(bpT, str2);
            arrayList.add(kotlin.reflect.jvm.internal.impl.builtins.f.l(bpT));
        }
        return eVar.ca((List) arrayList);
    }

    /* Access modifiers changed, original: protected */
    public p a(k kVar, s sVar, Kind kind, kotlin.reflect.jvm.internal.impl.name.f fVar, f fVar2, aj ajVar) {
        i.f(kVar, "newOwner");
        i.f(kind, "kind");
        i.f(fVar2, "annotations");
        i.f(ajVar, "source");
        return new e(kVar, (e) sVar, kind, bto());
    }

    private final s ca(List<kotlin.reflect.jvm.internal.impl.name.f> list) {
        int size = bsP().size() - list.size();
        boolean z = false;
        Object obj = (size == 0 || size == 1) ? 1 : null;
        if (m.eVC && obj == null) {
            throw new AssertionError("Assertion failed");
        }
        List bsP = bsP();
        i.e(bsP, "valueParameters");
        Iterable<ar> iterable = bsP;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (ar arVar : iterable) {
            i.e(arVar, "it");
            kotlin.reflect.jvm.internal.impl.name.f bsZ = arVar.bsZ();
            i.e(bsZ, "it.name");
            int index = arVar.getIndex();
            int i = index - size;
            if (i >= 0) {
                kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) list.get(i);
                if (fVar != null) {
                    bsZ = fVar;
                }
            }
            arrayList.add(arVar.a(this, bsZ, index));
        }
        List list2 = (List) arrayList;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.p.a h = h(TypeSubstitutor.fxB);
        Iterable<kotlin.reflect.jvm.internal.impl.name.f> iterable2 = list;
        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : iterable2) {
                if (fVar2 == null) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    z = true;
                    break;
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.p.a h2 = h.gE(z).cb(list2).h(bul());
        i.e(h2, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
        s a = super.a(h2);
        if (a == null) {
            i.bnJ();
        }
        return a;
    }
}

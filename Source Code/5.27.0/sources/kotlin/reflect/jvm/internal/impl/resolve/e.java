package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import java.util.List;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import kotlin.reflect.jvm.internal.impl.renderer.g;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: MemberComparator */
public class e implements Comparator<k> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final e fsX = new e();
    private static final b fsY = b.frr.p(new kotlin.jvm.a.b<g, l>() {
        /* renamed from: d */
        public l invoke(g gVar) {
            gVar.gW(false);
            gVar.gV(true);
            gVar.a(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            gVar.p(DescriptorRendererModifier.ALL);
            return l.eVB;
        }
    });

    /* compiled from: MemberComparator */
    public static class a implements Comparator<k> {
        public static final a fsZ = new a();

        private a() {
        }

        private static int O(k kVar) {
            if (c.G(kVar)) {
                return 8;
            }
            if (kVar instanceof j) {
                return 7;
            }
            if (kVar instanceof ae) {
                return ((ae) kVar).bsK() == null ? 6 : 5;
            } else {
                if (kVar instanceof s) {
                    return ((s) kVar).bsK() == null ? 4 : 3;
                } else {
                    if (kVar instanceof d) {
                        return 2;
                    }
                    return kVar instanceof an ? 1 : 0;
                }
            }
        }

        /* renamed from: g */
        public int compare(k kVar, k kVar2) {
            Integer h = h(kVar, kVar2);
            return h != null ? h.intValue() : 0;
        }

        private static Integer h(k kVar, k kVar2) {
            int O = O(kVar2) - O(kVar);
            if (O != 0) {
                return Integer.valueOf(O);
            }
            if (c.G(kVar) && c.G(kVar2)) {
                return Integer.valueOf(0);
            }
            int H = kVar.bsZ().compareTo(kVar2.bsZ());
            return H != 0 ? Integer.valueOf(H) : null;
        }
    }

    private e() {
    }

    /* renamed from: g */
    public int compare(k kVar, k kVar2) {
        Integer i = a.h(kVar, kVar2);
        if (i != null) {
            return i.intValue();
        }
        int compareTo;
        if ((kVar instanceof an) && (kVar2 instanceof an)) {
            compareTo = fsY.b(((an) kVar).btN()).compareTo(fsY.b(((an) kVar2).btN()));
            if (compareTo != 0) {
                return compareTo;
            }
        } else if ((kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) && (kVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            int compareTo2;
            int i2;
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) kVar;
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) kVar2;
            ah bsK = aVar.bsK();
            ah bsK2 = aVar2.bsK();
            if (bsK != null) {
                compareTo2 = fsY.b(bsK.bpT()).compareTo(fsY.b(bsK2.bpT()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            List bsP = aVar.bsP();
            List bsP2 = aVar2.bsP();
            for (i2 = 0; i2 < Math.min(bsP.size(), bsP2.size()); i2++) {
                int compareTo3 = fsY.b(((ar) bsP.get(i2)).bpT()).compareTo(fsY.b(((ar) bsP2.get(i2)).bpT()));
                if (compareTo3 != 0) {
                    return compareTo3;
                }
            }
            compareTo2 = bsP.size() - bsP2.size();
            if (compareTo2 != 0) {
                return compareTo2;
            }
            bsP = aVar.bsM();
            bsP2 = aVar2.bsM();
            for (i2 = 0; i2 < Math.min(bsP.size(), bsP2.size()); i2++) {
                List bod = ((ao) bsP.get(i2)).bod();
                List bod2 = ((ao) bsP2.get(i2)).bod();
                int size = bod.size() - bod2.size();
                if (size != 0) {
                    return size;
                }
                for (size = 0; size < bod.size(); size++) {
                    int compareTo4 = fsY.b((w) bod.get(size)).compareTo(fsY.b((w) bod2.get(size)));
                    if (compareTo4 != 0) {
                        return compareTo4;
                    }
                }
            }
            int size2 = bsP.size() - bsP2.size();
            if (size2 != 0) {
                return size2;
            }
            if ((aVar instanceof CallableMemberDescriptor) && (aVar2 instanceof CallableMemberDescriptor)) {
                compareTo = ((CallableMemberDescriptor) aVar).bsT().ordinal() - ((CallableMemberDescriptor) aVar2).bsT().ordinal();
                if (compareTo != 0) {
                    return compareTo;
                }
            }
        } else {
            int i3 = 1;
            if ((kVar instanceof d) && (kVar2 instanceof d)) {
                d dVar = (d) kVar;
                d dVar2 = (d) kVar2;
                if (dVar.brt().ordinal() != dVar2.brt().ordinal()) {
                    return dVar.brt().ordinal() - dVar2.brt().ordinal();
                }
                if (dVar.bry() != dVar2.bry()) {
                    if (!dVar.bry()) {
                        i3 = -1;
                    }
                    return i3;
                }
            }
            throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", new Object[]{kVar, kVar.getClass(), kVar2, kVar2.getClass()}));
        }
        compareTo = fsY.s(kVar).compareTo(fsY.s(kVar2));
        if (compareTo != 0) {
            return compareTo;
        }
        return c.B(kVar).bsZ().compareTo(c.B(kVar2).bsZ());
    }
}

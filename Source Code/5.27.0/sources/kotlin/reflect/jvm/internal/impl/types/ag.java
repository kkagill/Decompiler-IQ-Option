package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;

/* compiled from: SpecialTypes.kt */
public final class ag {
    public static final a aK(w wVar) {
        i.f(wVar, "$this$getAbbreviatedType");
        ay bPA = wVar.bPA();
        if (!(bPA instanceof a)) {
            bPA = null;
        }
        return (a) bPA;
    }

    public static final ad aL(w wVar) {
        i.f(wVar, "$this$getAbbreviation");
        a aK = aK(wVar);
        return aK != null ? aK.bPg() : null;
    }

    public static final ad b(ad adVar, ad adVar2) {
        i.f(adVar, "$this$withAbbreviation");
        i.f(adVar2, "abbreviatedType");
        if (y.aJ(adVar)) {
            return adVar;
        }
        return new a(adVar, adVar2);
    }

    public static final boolean aM(w wVar) {
        i.f(wVar, "$this$isDefinitelyNotNullType");
        return wVar.bPA() instanceof g;
    }

    public static final ad b(ad adVar) {
        ad adVar2;
        i.f(adVar, "$this$makeSimpleTypeDefinitelyNotNullOrNotNull");
        g b = g.fwO.b(adVar);
        if (b != null) {
            adVar2 = b;
        } else {
            adVar2 = aN(adVar);
        }
        return adVar2 != null ? adVar2 : adVar.gM(false);
    }

    public static final ay d(ay ayVar) {
        ay ayVar2;
        i.f(ayVar, "$this$makeDefinitelyNotNullOrNotNull");
        g b = g.fwO.b(ayVar);
        if (b != null) {
            ayVar2 = b;
        } else {
            ayVar2 = aN(ayVar);
        }
        return ayVar2 != null ? ayVar2 : ayVar.gL(false);
    }

    private static final ad aN(w wVar) {
        an bMZ = wVar.bMZ();
        if (!(bMZ instanceof v)) {
            bMZ = null;
        }
        v vVar = (v) bMZ;
        if (vVar != null) {
            vVar = a(vVar);
            if (vVar != null) {
                return x.a(wVar.brE(), vVar, m.emptyList(), false, vVar.bPz());
            }
        }
        return null;
    }

    private static final v a(v vVar) {
        Iterable<Object> bup = vVar.bup();
        Collection arrayList = new ArrayList(n.e(bup, 10));
        Object obj = null;
        for (Object obj2 : bup) {
            Object obj22;
            if (au.bb(obj22)) {
                obj = 1;
                obj22 = d(obj22.bPA());
            }
            arrayList.add(obj22);
        }
        List list = (List) arrayList;
        if (obj == null) {
            return null;
        }
        return new v(list);
    }
}

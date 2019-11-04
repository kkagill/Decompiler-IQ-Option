package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.i;

/* compiled from: TypeCapabilities.kt */
public final class am {
    public static final boolean aO(w wVar) {
        i.f(wVar, "$this$isCustomTypeVariable");
        ay bPA = wVar.bPA();
        if (!(bPA instanceof f)) {
            bPA = null;
        }
        f fVar = (f) bPA;
        return fVar != null ? fVar.bxW() : false;
    }

    public static final f aP(w wVar) {
        i.f(wVar, "$this$getCustomTypeVariable");
        ay bPA = wVar.bPA();
        if (!(bPA instanceof f)) {
            bPA = null;
        }
        f fVar = (f) bPA;
        if (fVar == null || !fVar.bxW()) {
            return null;
        }
        return fVar;
    }

    public static final w aQ(w wVar) {
        i.f(wVar, "$this$getSubtypeRepresentative");
        ay bPA = wVar.bPA();
        if (!(bPA instanceof ak)) {
            bPA = null;
        }
        ak akVar = (ak) bPA;
        if (akVar == null) {
            return wVar;
        }
        w bMW = akVar.bMW();
        return bMW != null ? bMW : wVar;
    }

    public static final w aR(w wVar) {
        i.f(wVar, "$this$getSupertypeRepresentative");
        ay bPA = wVar.bPA();
        if (!(bPA instanceof ak)) {
            bPA = null;
        }
        ak akVar = (ak) bPA;
        if (akVar == null) {
            return wVar;
        }
        w bMX = akVar.bMX();
        return bMX != null ? bMX : wVar;
    }

    public static final boolean b(w wVar, w wVar2) {
        i.f(wVar, "first");
        i.f(wVar2, "second");
        ay bPA = wVar.bPA();
        if (!(bPA instanceof ak)) {
            bPA = null;
        }
        ak akVar = (ak) bPA;
        if (!(akVar != null ? akVar.ar(wVar2) : false)) {
            ay bPA2 = wVar2.bPA();
            if (!(bPA2 instanceof ak)) {
                bPA2 = null;
            }
            ak akVar2 = (ak) bPA2;
            if (!(akVar2 != null ? akVar2.ar(wVar) : false)) {
                return false;
            }
        }
        return true;
    }
}

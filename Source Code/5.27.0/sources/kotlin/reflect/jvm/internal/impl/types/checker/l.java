package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ag;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.q;

/* compiled from: NewKotlinTypeChecker.kt */
public final class l {
    public static final l fxR = new l();

    private l() {
    }

    public final boolean a(ay ayVar, ay ayVar2) {
        i.f(ayVar, "a");
        i.f(ayVar2, "b");
        boolean z = true;
        if (ayVar == ayVar2) {
            return true;
        }
        if ((ayVar instanceof ad) && (ayVar2 instanceof ad)) {
            return c((ad) ayVar, (ad) ayVar2);
        }
        if (!(ayVar instanceof q) || !(ayVar2 instanceof q)) {
            return false;
        }
        q qVar = (q) ayVar;
        q qVar2 = (q) ayVar2;
        if (!(c(qVar.bPr(), qVar2.bPr()) && c(qVar.bPs(), qVar2.bPs()))) {
            z = false;
        }
        return z;
    }

    public final boolean c(ad adVar, ad adVar2) {
        i.f(adVar, "a");
        i.f(adVar2, "b");
        if (adVar.boc() != adVar2.boc() || ag.aM(adVar) != ag.aM(adVar2) || (i.y(adVar.bMZ(), adVar2.bMZ()) ^ 1) != 0 || adVar.btD().size() != adVar2.btD().size()) {
            return false;
        }
        if (adVar.btD() == adVar2.btD()) {
            return true;
        }
        int size = adVar.btD().size();
        for (int i = 0; i < size; i++) {
            ap apVar = (ap) adVar.btD().get(i);
            ap apVar2 = (ap) adVar2.btD().get(i);
            if (apVar.bPC() != apVar2.bPC()) {
                return false;
            }
            if (!apVar.bPC() && (apVar.bPD() != apVar2.bPD() || !a(apVar.bpT().bPA(), apVar2.bpT().bPA()))) {
                return false;
            }
        }
        return true;
    }
}

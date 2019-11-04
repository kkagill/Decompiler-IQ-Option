package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import kotlin.reflect.jvm.internal.impl.renderer.g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: KotlinType.kt */
public abstract class q extends ay implements ak {
    private final ad fxd;
    private final ad fxe;

    public abstract String a(b bVar, g gVar);

    public boolean ar(w wVar) {
        i.f(wVar, "type");
        return false;
    }

    public abstract ad bxe();

    public final ad bPr() {
        return this.fxd;
    }

    public final ad bPs() {
        return this.fxe;
    }

    public q(ad adVar, ad adVar2) {
        i.f(adVar, "lowerBound");
        i.f(adVar2, "upperBound");
        super();
        this.fxd = adVar;
        this.fxe = adVar2;
    }

    public w bMW() {
        return this.fxd;
    }

    public w bMX() {
        return this.fxe;
    }

    public f brE() {
        return bxe().brE();
    }

    public an bMZ() {
        return bxe().bMZ();
    }

    public List<ap> btD() {
        return bxe().btD();
    }

    public boolean boc() {
        return bxe().boc();
    }

    public h bsF() {
        return bxe().bsF();
    }

    public String toString() {
        return b.frp.b(this);
    }
}

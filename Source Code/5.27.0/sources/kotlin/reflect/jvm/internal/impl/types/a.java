package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;

/* compiled from: SpecialTypes.kt */
public final class a extends i {
    private final ad fkH;
    private final ad fwI;

    public a(ad adVar, ad adVar2) {
        i.f(adVar, "delegate");
        i.f(adVar2, "abbreviation");
        this.fkH = adVar;
        this.fwI = adVar2;
    }

    public final ad bPg() {
        return this.fwI;
    }

    /* Access modifiers changed, original: protected */
    public ad bxe() {
        return this.fkH;
    }

    public final ad btO() {
        return bxe();
    }

    /* renamed from: k */
    public a h(f fVar) {
        i.f(fVar, "newAnnotations");
        return new a(bxe().h(fVar), this.fwI);
    }

    /* renamed from: hb */
    public a gM(boolean z) {
        return new a(bxe().gM(z), this.fwI.gM(z));
    }
}

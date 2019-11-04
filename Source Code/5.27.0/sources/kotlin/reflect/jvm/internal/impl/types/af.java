package kotlin.reflect.jvm.internal.impl.types;

import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;

/* compiled from: TypeWithEnhancement.kt */
public final class af extends i implements av {
    private final ad fkH;
    private final w fxj;

    /* Access modifiers changed, original: protected */
    public ad bxe() {
        return this.fkH;
    }

    public w bPw() {
        return this.fxj;
    }

    public af(ad adVar, w wVar) {
        i.f(adVar, "delegate");
        i.f(wVar, "enhancement");
        this.fkH = adVar;
        this.fxj = wVar;
    }

    public ay bPv() {
        return bxe();
    }

    /* renamed from: h */
    public ad f(f fVar) {
        i.f(fVar, "newAnnotations");
        ay b = aw.b(bPv().f(fVar), bPw());
        if (b != null) {
            return (ad) b;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }

    /* renamed from: gM */
    public ad gL(boolean z) {
        ay b = aw.b(bPv().gL(z), bPw().bPA().gL(z));
        if (b != null) {
            return (ad) b;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }
}

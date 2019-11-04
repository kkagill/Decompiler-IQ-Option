package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.aw;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.b.a;
import kotlin.reflect.jvm.internal.impl.types.f;
import kotlin.reflect.jvm.internal.impl.types.i;
import kotlin.reflect.jvm.internal.impl.types.q;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: typeEnhancement.kt */
public final class e extends i implements f {
    private final ad fkH;

    public boolean boc() {
        return false;
    }

    public boolean bxW() {
        return true;
    }

    public e(ad adVar) {
        kotlin.jvm.internal.i.f(adVar, "delegate");
        this.fkH = adVar;
    }

    /* Access modifiers changed, original: protected */
    public ad bxe() {
        return this.fkH;
    }

    public w ab(w wVar) {
        kotlin.jvm.internal.i.f(wVar, "replacement");
        ay bPA = wVar.bPA();
        w wVar2 = bPA;
        if (!au.bb(wVar2) && !a.bf(wVar2)) {
            return wVar2;
        }
        if (bPA instanceof ad) {
            wVar = a((ad) bPA);
        } else if (bPA instanceof q) {
            q qVar = (q) bPA;
            wVar = aw.b(x.a(a(qVar.bPr()), a(qVar.bPs())), aw.bh(wVar2));
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Incorrect type: ");
            stringBuilder.append(bPA);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        return wVar;
    }

    private final ad a(ad adVar) {
        ad gM = adVar.gM(false);
        if (a.bf(adVar)) {
            return new e(gM);
        }
        return gM;
    }

    /* renamed from: g */
    public e h(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar) {
        kotlin.jvm.internal.i.f(fVar, "newAnnotations");
        return new e(bxe().h(fVar));
    }

    /* renamed from: gM */
    public ad gL(boolean z) {
        return z ? bxe().gM(true) : this;
    }
}

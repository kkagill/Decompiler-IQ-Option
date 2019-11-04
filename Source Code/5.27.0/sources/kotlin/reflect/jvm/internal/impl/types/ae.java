package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.p.b;

/* compiled from: KotlinTypeFactory.kt */
final class ae extends ad {
    private final List<ap> fcT;
    private final h ffr;
    private final boolean ftu;
    private final an fwS;

    public an bMZ() {
        return this.fwS;
    }

    public List<ap> btD() {
        return this.fcT;
    }

    public boolean boc() {
        return this.ftu;
    }

    public h bsF() {
        return this.ffr;
    }

    public ae(an anVar, List<? extends ap> list, boolean z, h hVar) {
        i.f(anVar, "constructor");
        i.f(list, "arguments");
        i.f(hVar, "memberScope");
        this.fwS = anVar;
        this.fcT = list;
        this.ftu = z;
        this.ffr = hVar;
        if (bsF() instanceof b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SimpleTypeImpl should not be created for error type: ");
            stringBuilder.append(bsF());
            stringBuilder.append(10);
            stringBuilder.append(bMZ());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public f brE() {
        return f.fdA.bug();
    }

    /* renamed from: h */
    public ad f(f fVar) {
        i.f(fVar, "newAnnotations");
        if (fVar.isEmpty()) {
            return this;
        }
        return new d(this, fVar);
    }

    /* renamed from: gM */
    public ad gL(boolean z) {
        if (z == boc()) {
            return this;
        }
        j abVar;
        if (z) {
            abVar = new ab(this);
        } else {
            abVar = new aa(this);
        }
        return abVar;
    }
}

package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: StubType.kt */
public final class aj extends ad {
    private final h ffr;
    private final boolean ftu;
    private final an fwS;
    private final an fxt;

    public boolean boc() {
        return this.ftu;
    }

    public an bMZ() {
        return this.fwS;
    }

    public h bsF() {
        return this.ffr;
    }

    public aj(an anVar, boolean z, an anVar2, h hVar) {
        i.f(anVar, "originalTypeVariable");
        i.f(anVar2, "constructor");
        i.f(hVar, "memberScope");
        this.fxt = anVar;
        this.ftu = z;
        this.fwS = anVar2;
        this.ffr = hVar;
    }

    public List<ap> btD() {
        return m.emptyList();
    }

    public f brE() {
        return f.fdA.bug();
    }

    /* renamed from: h */
    public ad f(f fVar) {
        i.f(fVar, "newAnnotations");
        throw new IllegalStateException("Shouldn't be called on non-fixed type".toString());
    }

    /* renamed from: gM */
    public ad gL(boolean z) {
        if (z == boc()) {
            return this;
        }
        return new aj(this.fxt, z, bMZ(), bsF());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NonFixed: ");
        stringBuilder.append(this.fxt);
        return stringBuilder.toString();
    }
}

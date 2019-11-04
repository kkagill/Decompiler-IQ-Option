package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: ErrorType.kt */
public class o extends ad {
    private final List<ap> fcT;
    private final h ffr;
    private final boolean ftu;
    private final an fwS;

    public o(an anVar, h hVar) {
        this(anVar, hVar, null, false, 12, null);
    }

    public an bMZ() {
        return this.fwS;
    }

    public h bsF() {
        return this.ffr;
    }

    public /* synthetic */ o(an anVar, h hVar, List list, boolean z, int i, f fVar) {
        if ((i & 4) != 0) {
            list = m.emptyList();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        this(anVar, hVar, list, z);
    }

    public List<ap> btD() {
        return this.fcT;
    }

    public boolean boc() {
        return this.ftu;
    }

    public o(an anVar, h hVar, List<? extends ap> list, boolean z) {
        i.f(anVar, "constructor");
        i.f(hVar, "memberScope");
        i.f(list, "arguments");
        this.fwS = anVar;
        this.ffr = hVar;
        this.fcT = list;
        this.ftu = z;
    }

    public f brE() {
        return f.fdA.bug();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bMZ().toString());
        stringBuilder.append(btD().isEmpty() ? "" : u.a(btD(), ", ", "<", ">", -1, "...", null));
        return stringBuilder.toString();
    }

    /* renamed from: h */
    public ad f(f fVar) {
        i.f(fVar, "newAnnotations");
        return this;
    }

    /* renamed from: gM */
    public ad gL(boolean z) {
        return new o(bMZ(), bsF(), btD(), z);
    }
}

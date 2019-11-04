package kotlin.reflect.jvm.internal.impl.resolve.scopes.a;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: ImplicitClassReceiver.kt */
public class c implements d, g {
    private final c fuP;
    private final d fuQ;
    private final d fuR;

    public c(d dVar, c cVar) {
        i.f(dVar, "classDescriptor");
        this.fuR = dVar;
        if (cVar == null) {
            cVar = this;
        }
        this.fuP = cVar;
        this.fuQ = this.fuR;
    }

    public final d btP() {
        return this.fuR;
    }

    /* renamed from: bvI */
    public ad bpT() {
        ad bsY = this.fuR.bsY();
        i.e(bsY, "classDescriptor.defaultType");
        return bsY;
    }

    public boolean equals(Object obj) {
        d dVar = this.fuR;
        Object obj2 = null;
        if (!(obj instanceof c)) {
            obj = null;
        }
        c cVar = (c) obj;
        if (cVar != null) {
            obj2 = cVar.fuR;
        }
        return i.y(dVar, obj2);
    }

    public int hashCode() {
        return this.fuR.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class{");
        stringBuilder.append(bpT());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

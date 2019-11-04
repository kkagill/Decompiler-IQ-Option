package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: constantValues.kt */
public final class j extends g<Pair<? extends a, ? extends f>> {
    private final a ftC;
    private final f ftD;

    public j(a aVar, f fVar) {
        i.f(aVar, "enumClassId");
        i.f(fVar, "enumEntryName");
        super(kotlin.j.x(aVar, fVar));
        this.ftC = aVar;
        this.ftD = fVar;
    }

    public final f bNf() {
        return this.ftD;
    }

    public w g(v vVar) {
        ad bsY;
        i.f(vVar, "module");
        d a = r.a(vVar, this.ftC);
        if (a != null) {
            if (!c.H(a)) {
                a = null;
            }
            if (a != null) {
                bsY = a.bsY();
                if (bsY != null) {
                    return bsY;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Containing class for error-class based enum entry ");
        stringBuilder.append(this.ftC);
        stringBuilder.append('.');
        stringBuilder.append(this.ftD);
        bsY = p.mK(stringBuilder.toString());
        i.e(bsY, "ErrorUtils.createErrorTy…mClassId.$enumEntryName\")");
        return bsY;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.ftC.bJV());
        stringBuilder.append('.');
        stringBuilder.append(this.ftD);
        return stringBuilder.toString();
    }
}

package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;

/* compiled from: modifierChecks.kt */
final class OperatorChecks$checks$1 extends Lambda implements b<s, String> {
    public static final OperatorChecks$checks$1 fyD = new OperatorChecks$checks$1();

    OperatorChecks$checks$1() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(s sVar) {
        i.f(sVar, "$receiver");
        List bsP = sVar.bsP();
        i.e(bsP, "valueParameters");
        ar arVar = (ar) u.bX(bsP);
        Object obj = null;
        if (arVar != null) {
            int i = (a.e(arVar) || arVar.btS() != null) ? 0 : 1;
            if (i == 1) {
                obj = 1;
            }
        }
        i iVar = i.fyC;
        return obj == null ? "last parameter should not have a default value or be a vararg" : null;
    }
}

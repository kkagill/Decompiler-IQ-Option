package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.types.b.a;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: modifierChecks.kt */
final class OperatorChecks$checks$3 extends Lambda implements b<s, String> {
    public static final OperatorChecks$checks$3 fyG = new OperatorChecks$checks$3();

    OperatorChecks$checks$3() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(s sVar) {
        i.f(sVar, "$receiver");
        ah bsL = sVar.bsL();
        if (bsL == null) {
            bsL = sVar.bsK();
        }
        i iVar = i.fyC;
        Object obj = null;
        if (bsL != null) {
            boolean c;
            w bsN = sVar.bsN();
            if (bsN != null) {
                w bpT = bsL.bpT();
                i.e(bpT, "receiver.type");
                c = a.c(bsN, bpT);
            } else {
                c = false;
            }
            if (c) {
                obj = 1;
            }
        }
        return obj == null ? "receiver must be a supertype of the return type" : null;
    }
}

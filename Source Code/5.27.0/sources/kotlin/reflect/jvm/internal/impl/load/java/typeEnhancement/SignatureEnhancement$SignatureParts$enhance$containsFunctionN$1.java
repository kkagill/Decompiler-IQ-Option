package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.c;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.types.ay;

/* compiled from: signatureEnhancement.kt */
final class SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1 extends Lambda implements b<ay, Boolean> {
    public static final SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1 fla = new SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1();

    SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((ay) obj));
    }

    public final boolean a(ay ayVar) {
        f brQ = ayVar.bMZ().brQ();
        if (brQ == null) {
            return false;
        }
        i.e(brQ, "it.constructor.declarati… ?: return@contains false");
        if (i.y(brQ.bsZ(), c.fca.bsb().bKc()) && i.y(a.T(brQ), c.fca.bsb())) {
            return true;
        }
        return false;
    }
}

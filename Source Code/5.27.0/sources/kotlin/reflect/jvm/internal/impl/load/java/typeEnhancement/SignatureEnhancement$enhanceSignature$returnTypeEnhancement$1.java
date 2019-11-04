package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: signatureEnhancement.kt */
final class SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 extends Lambda implements b<CallableMemberDescriptor, w> {
    public static final SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 fld = new SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1();

    SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1() {
        super(1);
    }

    /* renamed from: x */
    public final w invoke(CallableMemberDescriptor callableMemberDescriptor) {
        i.f(callableMemberDescriptor, "it");
        w bsN = callableMemberDescriptor.bsN();
        if (bsN == null) {
            i.bnJ();
        }
        return bsN;
    }
}

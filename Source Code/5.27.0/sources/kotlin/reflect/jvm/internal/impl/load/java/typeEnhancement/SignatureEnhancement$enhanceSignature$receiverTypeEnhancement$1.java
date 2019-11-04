package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: signatureEnhancement.kt */
final class SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 extends Lambda implements b<CallableMemberDescriptor, w> {
    public static final SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 flc = new SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1();

    SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1() {
        super(1);
    }

    /* renamed from: x */
    public final w invoke(CallableMemberDescriptor callableMemberDescriptor) {
        i.f(callableMemberDescriptor, "it");
        ah bsK = callableMemberDescriptor.bsK();
        if (bsK == null) {
            i.bnJ();
        }
        i.e(bsK, "it.extensionReceiverParameter!!");
        w bpT = bsK.bpT();
        i.e(bpT, "it.extensionReceiverParameter!!.type");
        return bpT;
    }
}

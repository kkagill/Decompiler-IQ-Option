package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: signatureEnhancement.kt */
final class SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1 extends Lambda implements b<CallableMemberDescriptor, w> {
    final /* synthetic */ ar $p;

    SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1(ar arVar) {
        this.$p = arVar;
        super(1);
    }

    /* renamed from: x */
    public final w invoke(CallableMemberDescriptor callableMemberDescriptor) {
        i.f(callableMemberDescriptor, "it");
        Object obj = callableMemberDescriptor.bsP().get(this.$p.getIndex());
        i.e(obj, "it.valueParameters[p.index]");
        w bpT = ((ar) obj).bpT();
        i.e(bpT, "it.valueParameters[p.index].type");
        return bpT;
    }
}

package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "R", "invoke"})
/* compiled from: KPropertyImpl.kt */
final class KPropertyImpl$_descriptor$1 extends Lambda implements a<ae> {
    final /* synthetic */ r this$0;

    KPropertyImpl$_descriptor$1(r rVar) {
        this.this$0 = rVar;
        super(0);
    }

    /* renamed from: bpR */
    public final ae invoke() {
        return this.this$0.boA().aY(this.this$0.getName(), this.this$0.RX());
    }
}

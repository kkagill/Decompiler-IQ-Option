package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.s;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "invoke"})
/* compiled from: KFunctionImpl.kt */
final class KFunctionImpl$descriptor$2 extends Lambda implements a<s> {
    final /* synthetic */ String $name;
    final /* synthetic */ i this$0;

    KFunctionImpl$descriptor$2(i iVar, String str) {
        this.this$0 = iVar;
        this.$name = str;
        super(0);
    }

    /* renamed from: bpd */
    public final s invoke() {
        return this.this$0.boA().aZ(this.$name, this.this$0.signature);
    }
}

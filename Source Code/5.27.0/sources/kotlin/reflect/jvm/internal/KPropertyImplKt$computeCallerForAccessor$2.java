package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.au;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"isNotNullProperty", "", "invoke"})
/* compiled from: KPropertyImpl.kt */
final class KPropertyImplKt$computeCallerForAccessor$2 extends Lambda implements a<Boolean> {
    final /* synthetic */ r.a $this_computeCallerForAccessor;

    KPropertyImplKt$computeCallerForAccessor$2(r.a aVar) {
        this.$this_computeCallerForAccessor = aVar;
        super(0);
    }

    public final boolean invoke() {
        return au.bb(this.$this_computeCallerForAccessor.bpg().box().bpT()) ^ 1;
    }
}

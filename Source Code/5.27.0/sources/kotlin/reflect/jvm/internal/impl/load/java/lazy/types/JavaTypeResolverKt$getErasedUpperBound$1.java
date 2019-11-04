package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.p;

/* compiled from: JavaTypeResolver.kt */
final class JavaTypeResolverKt$getErasedUpperBound$1 extends Lambda implements a<ad> {
    final /* synthetic */ ao $this_getErasedUpperBound;

    JavaTypeResolverKt$getErasedUpperBound$1(ao aoVar) {
        this.$this_getErasedUpperBound = aoVar;
        super(0);
    }

    /* renamed from: bsD */
    public final ad invoke() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't compute erased upper bound of type parameter `");
        stringBuilder.append(this.$this_getErasedUpperBound);
        stringBuilder.append('`');
        ad mK = p.mK(stringBuilder.toString());
        i.e(mK, "ErrorUtils.createErrorTy… type parameter `$this`\")");
        return mK;
    }
}

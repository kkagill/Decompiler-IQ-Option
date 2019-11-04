package kotlin.collections;

import java.util.Iterator;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "T", "invoke"})
/* compiled from: _Collections.kt */
final class CollectionsKt___CollectionsKt$withIndex$1 extends Lambda implements a<Iterator<? extends T>> {
    final /* synthetic */ Iterable $this_withIndex;

    CollectionsKt___CollectionsKt$withIndex$1(Iterable iterable) {
        this.$this_withIndex = iterable;
        super(0);
    }

    /* renamed from: bnn */
    public final Iterator<T> invoke() {
        return this.$this_withIndex.iterator();
    }
}

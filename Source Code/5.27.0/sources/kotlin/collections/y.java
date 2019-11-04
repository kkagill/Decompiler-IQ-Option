package kotlin.collections;

import java.util.Iterator;
import kotlin.i;
import kotlin.jvm.internal.a.a;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0002J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lkotlin/collections/IndexingIterator;", "T", "", "Lkotlin/collections/IndexedValue;", "iterator", "(Ljava/util/Iterator;)V", "index", "", "hasNext", "", "next", "kotlin-stdlib"})
/* compiled from: Iterators.kt */
public final class y<T> implements Iterator<w<? extends T>>, a {
    private final Iterator<T> WJ;
    private int index;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public y(Iterator<? extends T> it) {
        kotlin.jvm.internal.i.f(it, "iterator");
        this.WJ = it;
    }

    public final boolean hasNext() {
        return this.WJ.hasNext();
    }

    /* renamed from: bnu */
    public final w<T> next() {
        int i = this.index;
        this.index = i + 1;
        if (i < 0) {
            m.bno();
        }
        return new w(i, this.WJ.next());
    }
}

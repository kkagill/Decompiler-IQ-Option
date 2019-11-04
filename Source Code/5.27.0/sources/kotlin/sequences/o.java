package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "startIndex", "", "endIndex", "(Lkotlin/sequences/Sequence;II)V", "count", "getCount", "()I", "drop", "n", "iterator", "", "take", "kotlin-stdlib"})
/* compiled from: Sequences.kt */
public final class o<T> implements c<T>, h<T> {
    private final int bMk;
    private final int bMl;
    private final h<T> fBd;

    @i(bne = {1, 1, 15}, bnf = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, bng = {"kotlin/sequences/SubSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, kotlin.jvm.internal.a.a {
        private final Iterator<T> WJ;
        final /* synthetic */ o fBz;
        private int position;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        a(o oVar) {
            this.fBz = oVar;
            this.WJ = oVar.fBd.iterator();
        }

        private final void drop() {
            while (this.position < this.fBz.bMk && this.WJ.hasNext()) {
                this.WJ.next();
                this.position++;
            }
        }

        public boolean hasNext() {
            drop();
            return this.position < this.fBz.bMl && this.WJ.hasNext();
        }

        public T next() {
            drop();
            if (this.position < this.fBz.bMl) {
                this.position++;
                return this.WJ.next();
            }
            throw new NoSuchElementException();
        }
    }

    public o(h<? extends T> hVar, int i, int i2) {
        kotlin.jvm.internal.i.f(hVar, "sequence");
        this.fBd = hVar;
        this.bMk = i;
        this.bMl = i2;
        Object obj = 1;
        StringBuilder stringBuilder;
        if ((this.bMk >= 0 ? 1 : null) != null) {
            if ((this.bMl >= 0 ? 1 : null) != null) {
                if (this.bMl < this.bMk) {
                    obj = null;
                }
                if (obj == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("endIndex should be not less than startIndex, but was ");
                    stringBuilder.append(this.bMl);
                    stringBuilder.append(" < ");
                    stringBuilder.append(this.bMk);
                    throw new IllegalArgumentException(stringBuilder.toString().toString());
                }
                return;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex should be non-negative, but is ");
            stringBuilder.append(this.bMl);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("startIndex should be non-negative, but is ");
        stringBuilder.append(this.bMk);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    private final int getCount() {
        return this.bMl - this.bMk;
    }

    public h<T> mH(int i) {
        return i >= getCount() ? l.bQD() : new o(this.fBd, this.bMk + i, this.bMl);
    }

    public h<T> mI(int i) {
        if (i >= getCount()) {
            return this;
        }
        h hVar = this.fBd;
        int i2 = this.bMk;
        return new o(hVar, i2, i + i2);
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}

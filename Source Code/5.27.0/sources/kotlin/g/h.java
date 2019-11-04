package kotlin.g;

import java.util.NoSuchElementException;
import kotlin.collections.aa;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, bng = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "first", "", "last", "step", "(JJJ)V", "finalElement", "hasNext", "", "next", "getStep", "()J", "nextLong", "kotlin-stdlib"})
/* compiled from: ProgressionIterators.kt */
public final class h extends aa {
    private boolean eWm;
    private final long eWr;
    private final long eWt;
    private long eWu;

    public h(long j, long j2, long j3) {
        this.eWr = j3;
        this.eWt = j2;
        boolean z = true;
        if (this.eWr <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.eWm = z;
        if (!this.eWm) {
            j = this.eWt;
        }
        this.eWu = j;
    }

    public boolean hasNext() {
        return this.eWm;
    }

    public long nextLong() {
        long j = this.eWu;
        if (j != this.eWt) {
            this.eWu = this.eWr + j;
        } else if (this.eWm) {
            this.eWm = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }
}

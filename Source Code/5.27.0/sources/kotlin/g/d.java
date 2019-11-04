package kotlin.g;

import kotlin.c.c;
import kotlin.collections.z;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, bng = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"})
/* compiled from: Progressions.kt */
public class d implements Iterable<Integer>, kotlin.jvm.internal.a.a {
    public static final a eWk = new a();
    private final int eWj;
    private final int last;
    private final int step;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, bng = {"Lkotlin/ranges/IntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"})
    /* compiled from: Progressions.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d A(int i, int i2, int i3) {
            return new d(i, i2, i3);
        }
    }

    public d(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.eWj = i;
            this.last = c.z(i, i2, i3);
            this.step = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int getFirst() {
        return this.eWj;
    }

    public final int getLast() {
        return this.last;
    }

    public final int bnR() {
        return this.step;
    }

    /* renamed from: bnS */
    public z iterator() {
        return new e(this.eWj, this.last, this.step);
    }

    public boolean isEmpty() {
        if (this.step > 0) {
            if (this.eWj > this.last) {
                return true;
            }
        } else if (this.eWj < this.last) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:11:0x0025, code skipped:
            if (r2.step == r3.step) goto L_0x0027;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        r0 = r3 instanceof kotlin.g.d;
        if (r0 == 0) goto L_0x0029;
    L_0x0004:
        r0 = r2.isEmpty();
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r3;
        r0 = (kotlin.g.d) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0027;
    L_0x0013:
        r0 = r2.eWj;
        r3 = (kotlin.g.d) r3;
        r1 = r3.eWj;
        if (r0 != r1) goto L_0x0029;
    L_0x001b:
        r0 = r2.last;
        r1 = r3.last;
        if (r0 != r1) goto L_0x0029;
    L_0x0021:
        r0 = r2.step;
        r3 = r3.step;
        if (r0 != r3) goto L_0x0029;
    L_0x0027:
        r3 = 1;
        goto L_0x002a;
    L_0x0029:
        r3 = 0;
    L_0x002a:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.g.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return isEmpty() ? -1 : (((this.eWj * 31) + this.last) * 31) + this.step;
    }

    public String toString() {
        StringBuilder stringBuilder;
        int i;
        String str = " step ";
        if (this.step > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.eWj);
            stringBuilder.append("..");
            stringBuilder.append(this.last);
            stringBuilder.append(str);
            i = this.step;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.eWj);
            stringBuilder.append(" downTo ");
            stringBuilder.append(this.last);
            stringBuilder.append(str);
            i = -this.step;
        }
        stringBuilder.append(i);
        return stringBuilder.toString();
    }
}

package kotlin.g;

import kotlin.c.c;
import kotlin.collections.aa;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, bng = {"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "(JJJ)V", "first", "getFirst", "()J", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "Lkotlin/collections/LongIterator;", "toString", "", "Companion", "kotlin-stdlib"})
/* compiled from: Progressions.kt */
public class g implements Iterable<Long>, kotlin.jvm.internal.a.a {
    public static final a eWs = new a();
    private final long eWp;
    private final long eWq;
    private final long eWr;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, bng = {"Lkotlin/ranges/LongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/LongProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"})
    /* compiled from: Progressions.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public g(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.eWp = j;
            this.eWq = c.b(j, j2, j3);
            this.eWr = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final long bnX() {
        return this.eWp;
    }

    public final long bnY() {
        return this.eWq;
    }

    /* renamed from: bnZ */
    public aa iterator() {
        return new h(this.eWp, this.eWq, this.eWr);
    }

    public boolean isEmpty() {
        if (this.eWr > 0) {
            if (this.eWp > this.eWq) {
                return true;
            }
        } else if (this.eWp < this.eWq) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:11:0x002b, code skipped:
            if (r5.eWr == r6.eWr) goto L_0x002d;
     */
    public boolean equals(java.lang.Object r6) {
        /*
        r5 = this;
        r0 = r6 instanceof kotlin.g.g;
        if (r0 == 0) goto L_0x002f;
    L_0x0004:
        r0 = r5.isEmpty();
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r6;
        r0 = (kotlin.g.g) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x002d;
    L_0x0013:
        r0 = r5.eWp;
        r6 = (kotlin.g.g) r6;
        r2 = r6.eWp;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x002f;
    L_0x001d:
        r0 = r5.eWq;
        r2 = r6.eWq;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x002f;
    L_0x0025:
        r0 = r5.eWr;
        r2 = r6.eWr;
        r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r6 != 0) goto L_0x002f;
    L_0x002d:
        r6 = 1;
        goto L_0x0030;
    L_0x002f:
        r6 = 0;
    L_0x0030:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.g.g.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = (long) 31;
        long j2 = this.eWp;
        j2 = (j2 ^ (j2 >>> 32)) * j;
        long j3 = this.eWq;
        j *= j2 + (j3 ^ (j3 >>> 32));
        j2 = this.eWr;
        return (int) (j + (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder;
        long j;
        String str = " step ";
        if (this.eWr > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.eWp);
            stringBuilder.append("..");
            stringBuilder.append(this.eWq);
            stringBuilder.append(str);
            j = this.eWr;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.eWp);
            stringBuilder.append(" downTo ");
            stringBuilder.append(this.eWq);
            stringBuilder.append(str);
            j = -this.eWr;
        }
        stringBuilder.append(j);
        return stringBuilder.toString();
    }
}

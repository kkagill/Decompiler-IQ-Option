package kotlin.g;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, bng = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(JJ)V", "getEndInclusive", "()Ljava/lang/Long;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"})
/* compiled from: Ranges.kt */
public final class i extends g implements c<Long> {
    private static final i eWv = new i(1, 0);
    public static final a eWw = new a();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lkotlin/ranges/LongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/LongRange;", "getEMPTY", "()Lkotlin/ranges/LongRange;", "kotlin-stdlib"})
    /* compiled from: Ranges.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public i(long j, long j2) {
        super(j, j2, 1);
    }

    public /* synthetic */ boolean contains(Comparable comparable) {
        return dd(((Number) comparable).longValue());
    }

    public boolean dd(long j) {
        return bnX() <= j && j <= bnY();
    }

    public boolean isEmpty() {
        return bnX() > bnY();
    }

    /* JADX WARNING: Missing block: B:9:0x002b, code skipped:
            if (bnY() == r6.bnY()) goto L_0x002d;
     */
    public boolean equals(java.lang.Object r6) {
        /*
        r5 = this;
        r0 = r6 instanceof kotlin.g.i;
        if (r0 == 0) goto L_0x002f;
    L_0x0004:
        r0 = r5.isEmpty();
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r6;
        r0 = (kotlin.g.i) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x002d;
    L_0x0013:
        r0 = r5.bnX();
        r6 = (kotlin.g.i) r6;
        r2 = r6.bnX();
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x002f;
    L_0x0021:
        r0 = r5.bnY();
        r2 = r6.bnY();
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.g.i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return isEmpty() ? -1 : (int) ((((long) 31) * (bnX() ^ (bnX() >>> 32))) + (bnY() ^ (bnY() >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bnX());
        stringBuilder.append("..");
        stringBuilder.append(bnY());
        return stringBuilder.toString();
    }
}

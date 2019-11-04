package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.g.f;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.sequences.h;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"})
/* compiled from: Strings.kt */
final class e implements h<f> {
    private final int bMk;
    private final CharSequence fBE;
    private final m<CharSequence, Integer, Pair<Integer, Integer>> fBF;
    private final int limit;

    @i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, bng = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"})
    /* compiled from: Strings.kt */
    public static final class a implements Iterator<f>, kotlin.jvm.internal.a.a {
        private int counter;
        private int fBG;
        private int fBH;
        private f fBI;
        final /* synthetic */ e fBJ;
        private int fBi = -1;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        a(e eVar) {
            this.fBJ = eVar;
            this.fBG = m.B(eVar.bMk, 0, eVar.fBE.length());
            this.fBH = this.fBG;
        }

        /* JADX WARNING: Missing block: B:6:0x0025, code skipped:
            if (r6.counter < kotlin.text.e.a(r6.fBJ)) goto L_0x0027;
     */
        private final void bQB() {
            /*
            r6 = this;
            r0 = r6.fBH;
            r1 = 0;
            if (r0 >= 0) goto L_0x000e;
        L_0x0005:
            r6.fBi = r1;
            r0 = 0;
            r0 = (kotlin.g.f) r0;
            r6.fBI = r0;
            goto L_0x00a4;
        L_0x000e:
            r0 = r6.fBJ;
            r0 = r0.limit;
            r2 = -1;
            r3 = 1;
            if (r0 <= 0) goto L_0x0027;
        L_0x0018:
            r0 = r6.counter;
            r0 = r0 + r3;
            r6.counter = r0;
            r0 = r6.counter;
            r4 = r6.fBJ;
            r4 = r4.limit;
            if (r0 >= r4) goto L_0x0035;
        L_0x0027:
            r0 = r6.fBH;
            r4 = r6.fBJ;
            r4 = r4.fBE;
            r4 = r4.length();
            if (r0 <= r4) goto L_0x004b;
        L_0x0035:
            r0 = r6.fBG;
            r1 = new kotlin.g.f;
            r4 = r6.fBJ;
            r4 = r4.fBE;
            r4 = kotlin.text.v.aa(r4);
            r1.<init>(r0, r4);
            r6.fBI = r1;
            r6.fBH = r2;
            goto L_0x00a2;
        L_0x004b:
            r0 = r6.fBJ;
            r0 = r0.fBF;
            r4 = r6.fBJ;
            r4 = r4.fBE;
            r5 = r6.fBH;
            r5 = java.lang.Integer.valueOf(r5);
            r0 = r0.w(r4, r5);
            r0 = (kotlin.Pair) r0;
            if (r0 != 0) goto L_0x007b;
        L_0x0065:
            r0 = r6.fBG;
            r1 = new kotlin.g.f;
            r4 = r6.fBJ;
            r4 = r4.fBE;
            r4 = kotlin.text.v.aa(r4);
            r1.<init>(r0, r4);
            r6.fBI = r1;
            r6.fBH = r2;
            goto L_0x00a2;
        L_0x007b:
            r2 = r0.bnj();
            r2 = (java.lang.Number) r2;
            r2 = r2.intValue();
            r0 = r0.bnk();
            r0 = (java.lang.Number) r0;
            r0 = r0.intValue();
            r4 = r6.fBG;
            r4 = kotlin.g.m.bh(r4, r2);
            r6.fBI = r4;
            r2 = r2 + r0;
            r6.fBG = r2;
            r2 = r6.fBG;
            if (r0 != 0) goto L_0x009f;
        L_0x009e:
            r1 = 1;
        L_0x009f:
            r2 = r2 + r1;
            r6.fBH = r2;
        L_0x00a2:
            r6.fBi = r3;
        L_0x00a4:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.e$a.bQB():void");
        }

        /* renamed from: bQE */
        public f next() {
            if (this.fBi == -1) {
                bQB();
            }
            if (this.fBi != 0) {
                f fVar = this.fBI;
                if (fVar != null) {
                    this.fBI = (f) null;
                    this.fBi = -1;
                    return fVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.fBi == -1) {
                bQB();
            }
            return this.fBi == 1;
        }
    }

    public e(CharSequence charSequence, int i, int i2, m<? super CharSequence, ? super Integer, Pair<Integer, Integer>> mVar) {
        kotlin.jvm.internal.i.f(charSequence, "input");
        kotlin.jvm.internal.i.f(mVar, "getNextMatch");
        this.fBE = charSequence;
        this.bMk = i;
        this.limit = i2;
        this.fBF = mVar;
    }

    public Iterator<f> iterator() {
        return new a(this);
    }
}

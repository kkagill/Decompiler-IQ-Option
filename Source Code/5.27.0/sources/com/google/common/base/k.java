package com.google.common.base;

import java.util.Iterator;

/* compiled from: Splitter */
public final class k {
    private final b Sh;
    private final boolean Si;
    private final b Sj;
    private final int limit;

    /* compiled from: Splitter */
    private interface b {
        Iterator<String> c(k kVar, CharSequence charSequence);
    }

    /* compiled from: Splitter */
    private static abstract class a extends AbstractIterator<String> {
        final b Sh;
        final boolean Si;
        final CharSequence So;
        int limit;
        int offset = 0;

        public abstract int bn(int i);

        public abstract int bo(int i);

        protected a(k kVar, CharSequence charSequence) {
            this.Sh = kVar.Sh;
            this.Si = kVar.Si;
            this.limit = kVar.limit;
            this.So = charSequence;
        }

        /* Access modifiers changed, original: protected */
        /* renamed from: qe */
        public String pO() {
            int i;
            int i2;
            int i3 = this.offset;
            while (true) {
                i = this.offset;
                if (i == -1) {
                    return (String) pP();
                }
                i = bn(i);
                if (i == -1) {
                    i = this.So.length();
                    this.offset = -1;
                } else {
                    this.offset = bo(i);
                }
                i2 = this.offset;
                if (i2 == i3) {
                    this.offset = i2 + 1;
                    if (this.offset > this.So.length()) {
                        this.offset = -1;
                    }
                } else {
                    while (i3 < i && this.Sh.b(this.So.charAt(i3))) {
                        i3++;
                    }
                    while (i > i3 && this.Sh.b(this.So.charAt(i - 1))) {
                        i--;
                    }
                    if (this.Si && i3 == i) {
                        i3 = this.offset;
                    } else {
                        i2 = this.limit;
                    }
                }
            }
            i2 = this.limit;
            if (i2 == 1) {
                i = this.So.length();
                this.offset = -1;
                while (i > i3 && this.Sh.b(this.So.charAt(i - 1))) {
                    i--;
                }
            } else {
                this.limit = i2 - 1;
            }
            return this.So.subSequence(i3, i).toString();
        }
    }

    private k(b bVar) {
        this(bVar, false, b.pR(), Integer.MAX_VALUE);
    }

    private k(b bVar, boolean z, b bVar2, int i) {
        this.Sj = bVar;
        this.Si = z;
        this.Sh = bVar2;
        this.limit = i;
    }

    public static k f(char c) {
        return a(b.a(c));
    }

    public static k a(final b bVar) {
        i.checkNotNull(bVar);
        return new k(new b() {
            /* renamed from: b */
            public a c(k kVar, CharSequence charSequence) {
                return new a(kVar, charSequence) {
                    /* Access modifiers changed, original: 0000 */
                    public int bo(int i) {
                        return i + 1;
                    }

                    /* Access modifiers changed, original: 0000 */
                    public int bn(int i) {
                        return bVar.a(this.So, i);
                    }
                };
            }
        });
    }

    public k qc() {
        return new k(this.Sj, true, this.Sh, this.limit);
    }

    public k qd() {
        return b(b.pS());
    }

    public k b(b bVar) {
        i.checkNotNull(bVar);
        return new k(this.Sj, this.Si, bVar, this.limit);
    }

    public Iterable<String> k(final CharSequence charSequence) {
        i.checkNotNull(charSequence);
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return k.this.l(charSequence);
            }

            public String toString() {
                Joiner on = Joiner.on(", ");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append('[');
                StringBuilder a = on.a(stringBuilder, (Iterable) this);
                a.append(']');
                return a.toString();
            }
        };
    }

    private Iterator<String> l(CharSequence charSequence) {
        return this.Sj.c(this, charSequence);
    }
}

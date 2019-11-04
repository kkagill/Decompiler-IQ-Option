package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* compiled from: RopeByteString */
class r extends d {
    private static final int[] fqA;
    private final int fqB;
    private final d fqC;
    private final d fqD;
    private final int fqE;
    private final int fqF;
    private int hash;

    /* compiled from: RopeByteString */
    private static class a {
        private final Stack<d> fqG;

        private a() {
            this.fqG = new Stack();
        }

        private d c(d dVar, d dVar2) {
            h(dVar);
            h(dVar2);
            dVar = (d) this.fqG.pop();
            while (!this.fqG.isEmpty()) {
                dVar = new r((d) this.fqG.pop(), dVar);
            }
            return dVar;
        }

        private void h(d dVar) {
            if (dVar.bKr()) {
                i(dVar);
            } else if (dVar instanceof r) {
                r rVar = (r) dVar;
                h(rVar.fqC);
                h(rVar.fqD);
            } else {
                String valueOf = String.valueOf(String.valueOf(dVar.getClass()));
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 49);
                stringBuilder.append("Has a new type of ByteString been created? Found ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        private void i(d dVar) {
            int mk = mk(dVar.size());
            int i = r.fqA[mk + 1];
            if (this.fqG.isEmpty() || ((d) this.fqG.peek()).size() >= i) {
                this.fqG.push(dVar);
                return;
            }
            mk = r.fqA[mk];
            d dVar2 = (d) this.fqG.pop();
            while (!this.fqG.isEmpty() && ((d) this.fqG.peek()).size() < mk) {
                dVar2 = new r((d) this.fqG.pop(), dVar2);
            }
            d rVar = new r(dVar2, dVar);
            while (!this.fqG.isEmpty()) {
                if (((d) this.fqG.peek()).size() >= r.fqA[mk(rVar.size()) + 1]) {
                    break;
                }
                rVar = new r((d) this.fqG.pop(), rVar);
            }
            this.fqG.push(rVar);
        }

        private int mk(int i) {
            i = Arrays.binarySearch(r.fqA, i);
            return i < 0 ? (-(i + 1)) - 1 : i;
        }
    }

    /* compiled from: RopeByteString */
    private static class b implements Iterator<m> {
        private final Stack<r> fqH;
        private m fqI;

        private b(d dVar) {
            this.fqH = new Stack();
            this.fqI = j(dVar);
        }

        private m j(d dVar) {
            while (dVar instanceof r) {
                r rVar = (r) dVar;
                this.fqH.push(rVar);
                dVar = rVar.fqC;
            }
            return (m) dVar;
        }

        private m bLC() {
            while (!this.fqH.isEmpty()) {
                m j = j(((r) this.fqH.pop()).fqD);
                if (!j.isEmpty()) {
                    return j;
                }
            }
            return null;
        }

        public boolean hasNext() {
            return this.fqI != null;
        }

        /* renamed from: bLD */
        public m next() {
            m mVar = this.fqI;
            if (mVar != null) {
                this.fqI = bLC();
                return mVar;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: RopeByteString */
    private class d extends InputStream {
        private b fqN;
        private m fqO;
        private int fqP;
        private int fqQ;
        private int fqR;
        private int mark;

        public boolean markSupported() {
            return true;
        }

        public d() {
            initialize();
        }

        public int read(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException();
            } else if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m(bArr, i, i2);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) m(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        private int m(byte[] bArr, int i, int i2) {
            int i3 = i;
            i = i2;
            while (i > 0) {
                bLE();
                if (this.fqO == null) {
                    if (i == i2) {
                        return -1;
                    }
                    return i2 - i;
                }
                int min = Math.min(this.fqP - this.fqQ, i);
                if (bArr != null) {
                    this.fqO.a(bArr, this.fqQ, i3, min);
                    i3 += min;
                }
                this.fqQ += min;
                i -= min;
            }
            return i2 - i;
        }

        public int read() {
            bLE();
            m mVar = this.fqO;
            if (mVar == null) {
                return -1;
            }
            int i = this.fqQ;
            this.fqQ = i + 1;
            return mVar.lR(i) & 255;
        }

        public int available() {
            return r.this.size() - (this.fqR + this.fqQ);
        }

        public void mark(int i) {
            this.mark = this.fqR + this.fqQ;
        }

        public synchronized void reset() {
            initialize();
            m(null, 0, this.mark);
        }

        private void initialize() {
            this.fqN = new b(r.this);
            this.fqO = this.fqN.next();
            this.fqP = this.fqO.size();
            this.fqQ = 0;
            this.fqR = 0;
        }

        private void bLE() {
            if (this.fqO != null) {
                int i = this.fqQ;
                int i2 = this.fqP;
                if (i == i2) {
                    this.fqR += i2;
                    this.fqQ = 0;
                    if (this.fqN.hasNext()) {
                        this.fqO = this.fqN.next();
                        this.fqP = this.fqO.size();
                        return;
                    }
                    this.fqO = null;
                    this.fqP = 0;
                }
            }
        }
    }

    /* compiled from: RopeByteString */
    private class c implements kotlin.reflect.jvm.internal.impl.protobuf.d.a {
        private final b fqJ;
        private kotlin.reflect.jvm.internal.impl.protobuf.d.a fqK;
        int fqL;

        private c() {
            this.fqJ = new b(r.this);
            this.fqK = this.fqJ.next().iterator();
            this.fqL = r.this.size();
        }

        public boolean hasNext() {
            return this.fqL > 0;
        }

        /* renamed from: bKl */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        public byte nextByte() {
            if (!this.fqK.hasNext()) {
                this.fqK = this.fqJ.next().iterator();
            }
            this.fqL--;
            return this.fqK.nextByte();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Integer.MAX_VALUE));
        fqA = new int[arrayList.size()];
        i = 0;
        while (true) {
            int[] iArr = fqA;
            if (i < iArr.length) {
                iArr[i] = ((Integer) arrayList.get(i)).intValue();
                i++;
            } else {
                return;
            }
        }
    }

    private r(d dVar, d dVar2) {
        this.hash = 0;
        this.fqC = dVar;
        this.fqD = dVar2;
        this.fqE = dVar.size();
        this.fqB = this.fqE + dVar2.size();
        this.fqF = Math.max(dVar.bKq(), dVar2.bKq()) + 1;
    }

    static d a(d dVar, d dVar2) {
        r rVar = dVar instanceof r ? (r) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return b(dVar, dVar2);
            }
            if (rVar != null && rVar.fqD.size() + dVar2.size() < 128) {
                dVar2 = new r(rVar.fqC, b(rVar.fqD, dVar2));
            } else if (rVar == null || rVar.fqC.bKq() <= rVar.fqD.bKq() || rVar.bKq() <= dVar2.bKq()) {
                if (size >= fqA[Math.max(dVar.bKq(), dVar2.bKq()) + 1]) {
                    return new r(dVar, dVar2);
                }
                return new a().c(dVar, dVar2);
            } else {
                dVar2 = new r(rVar.fqC, new r(rVar.fqD, dVar2));
            }
        }
        return dVar2;
    }

    private static m b(d dVar, d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[(size + size2)];
        dVar.a(bArr, 0, 0, size);
        dVar2.a(bArr, 0, size, size2);
        return new m(bArr);
    }

    public int size() {
        return this.fqB;
    }

    /* Access modifiers changed, original: protected */
    public int bKq() {
        return this.fqF;
    }

    /* Access modifiers changed, original: protected */
    public boolean bKr() {
        return this.fqB >= fqA[this.fqF];
    }

    /* Access modifiers changed, original: protected */
    public void b(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.fqE;
        if (i4 <= i5) {
            this.fqC.b(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.fqD.b(bArr, i - i5, i2, i3);
        } else {
            i5 -= i;
            this.fqC.b(bArr, i, i2, i5);
            this.fqD.b(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        int i4 = this.fqE;
        if (i3 <= i4) {
            this.fqC.b(outputStream, i, i2);
        } else if (i >= i4) {
            this.fqD.b(outputStream, i - i4, i2);
        } else {
            i4 -= i;
            this.fqC.b(outputStream, i, i4);
            this.fqD.b(outputStream, 0, i2 - i4);
        }
    }

    public String toString(String str) {
        return new String(toByteArray(), str);
    }

    public boolean bKn() {
        int D = this.fqC.D(0, 0, this.fqE);
        d dVar = this.fqD;
        if (dVar.D(D, 0, dVar.size()) == 0) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public int D(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.fqE;
        if (i4 <= i5) {
            return this.fqC.D(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.fqD.D(i, i2 - i5, i3);
        }
        i5 -= i2;
        return this.fqD.D(this.fqC.D(i, i2, i5), 0, i3 - i5);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.fqB != dVar.size()) {
            return false;
        }
        if (this.fqB == 0) {
            return true;
        }
        if (this.hash != 0) {
            int bKs = dVar.bKs();
            if (!(bKs == 0 || this.hash == bKs)) {
                return false;
            }
        }
        return g(dVar);
    }

    private boolean g(d dVar) {
        b bVar = new b(this);
        m mVar = (m) bVar.next();
        b bVar2 = new b(dVar);
        m mVar2 = (m) bVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = mVar.size() - i;
            int size2 = mVar2.size() - i2;
            int min = Math.min(size, size2);
            if (!(i == 0 ? mVar.a(mVar2, i2, min) : mVar2.a(mVar, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.fqB;
            if (i3 < i4) {
                if (min == size) {
                    mVar = (m) bVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    mVar2 = (m) bVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int i = this.hash;
        if (i == 0) {
            i = this.fqB;
            i = E(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    /* Access modifiers changed, original: protected */
    public int bKs() {
        return this.hash;
    }

    /* Access modifiers changed, original: protected */
    public int E(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.fqE;
        if (i4 <= i5) {
            return this.fqC.E(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.fqD.E(i, i2 - i5, i3);
        }
        i5 -= i2;
        return this.fqD.E(this.fqC.E(i, i2, i5), 0, i3 - i5);
    }

    public e bKo() {
        return e.n(new d());
    }

    /* renamed from: bKk */
    public kotlin.reflect.jvm.internal.impl.protobuf.d.a iterator() {
        return new c();
    }
}

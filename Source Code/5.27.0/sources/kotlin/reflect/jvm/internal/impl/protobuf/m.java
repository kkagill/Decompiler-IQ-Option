package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.NoSuchElementException;

/* compiled from: LiteralByteString */
class m extends d {
    protected final byte[] bytes;
    private int hash = 0;

    /* compiled from: LiteralByteString */
    private class a implements kotlin.reflect.jvm.internal.impl.protobuf.d.a {
        private final int limit;
        private int position;

        private a() {
            this.position = 0;
            this.limit = m.this.size();
        }

        public boolean hasNext() {
            return this.position < this.limit;
        }

        /* renamed from: bKl */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        public byte nextByte() {
            try {
                byte[] bArr = m.this.bytes;
                int i = this.position;
                this.position = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* Access modifiers changed, original: protected */
    public int bKj() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public int bKq() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public boolean bKr() {
        return true;
    }

    m(byte[] bArr) {
        this.bytes = bArr;
    }

    public byte lR(int i) {
        return this.bytes[i];
    }

    public int size() {
        return this.bytes.length;
    }

    /* Access modifiers changed, original: protected */
    public void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    /* Access modifiers changed, original: 0000 */
    public void b(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.bytes, bKj() + i, i2);
    }

    public String toString(String str) {
        return new String(this.bytes, bKj(), size(), str);
    }

    public boolean bKn() {
        int bKj = bKj();
        return u.n(this.bytes, bKj, size() + bKj);
    }

    /* Access modifiers changed, original: protected */
    public int D(int i, int i2, int i3) {
        int bKj = bKj() + i2;
        return u.e(i, this.bytes, bKj, i3 + bKj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof m) {
            return a((m) obj, 0, size());
        }
        if (obj instanceof r) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(String.valueOf(obj.getClass()));
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 49);
        stringBuilder.append("Has a new type of ByteString been created? Found ");
        stringBuilder.append(valueOf);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(m mVar, int i, int i2) {
        int bKj;
        if (i2 > mVar.size()) {
            i = size();
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i2);
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i + i2 <= mVar.size()) {
            byte[] bArr = this.bytes;
            byte[] bArr2 = mVar.bytes;
            int bKj2 = bKj() + i2;
            i2 = bKj();
            bKj = mVar.bKj() + i;
            while (i2 < bKj2) {
                if (bArr[i2] != bArr2[bKj]) {
                    return false;
                }
                i2++;
                bKj++;
            }
            return true;
        } else {
            bKj = mVar.size();
            StringBuilder stringBuilder2 = new StringBuilder(59);
            stringBuilder2.append("Ran off end of other: ");
            stringBuilder2.append(i);
            String str = ", ";
            stringBuilder2.append(str);
            stringBuilder2.append(i2);
            stringBuilder2.append(str);
            stringBuilder2.append(bKj);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    public int hashCode() {
        int i = this.hash;
        if (i == 0) {
            i = size();
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
        return d(i, this.bytes, bKj() + i2, i3);
    }

    static int d(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (i = i2; i < i2 + i3; i++) {
            i4 = (i4 * 31) + bArr[i];
        }
        return i4;
    }

    public e bKo() {
        return e.a(this);
    }

    /* renamed from: bKk */
    public kotlin.reflect.jvm.internal.impl.protobuf.d.a iterator() {
        return new a();
    }
}

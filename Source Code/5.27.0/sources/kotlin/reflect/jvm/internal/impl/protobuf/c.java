package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;

/* compiled from: BoundedByteString */
class c extends m {
    private final int fpE;
    private final int fpF;

    /* compiled from: BoundedByteString */
    private class a implements kotlin.reflect.jvm.internal.impl.protobuf.d.a {
        private final int limit;
        private int position;

        private a() {
            this.position = c.this.bKj();
            this.limit = this.position + c.this.size();
        }

        public boolean hasNext() {
            return this.position < this.limit;
        }

        /* renamed from: bKl */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        public byte nextByte() {
            if (this.position < this.limit) {
                byte[] bArr = c.this.bytes;
                int i = this.position;
                this.position = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    c(byte[] bArr, int i, int i2) {
        super(bArr);
        StringBuilder stringBuilder;
        if (i < 0) {
            stringBuilder = new StringBuilder(29);
            stringBuilder.append("Offset too small: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 < 0) {
            stringBuilder = new StringBuilder(29);
            stringBuilder.append("Length too small: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (((long) i) + ((long) i2) <= ((long) bArr.length)) {
            this.fpE = i;
            this.fpF = i2;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(48);
            stringBuilder2.append("Offset+Length too large: ");
            stringBuilder2.append(i);
            stringBuilder2.append("+");
            stringBuilder2.append(i2);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    public byte lR(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(28);
            stringBuilder.append("Index too small: ");
            stringBuilder.append(i);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        } else if (i < size()) {
            return this.bytes[this.fpE + i];
        } else {
            int size = size();
            StringBuilder stringBuilder2 = new StringBuilder(41);
            stringBuilder2.append("Index too large: ");
            stringBuilder2.append(i);
            stringBuilder2.append(", ");
            stringBuilder2.append(size);
            throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
        }
    }

    public int size() {
        return this.fpF;
    }

    /* Access modifiers changed, original: protected */
    public int bKj() {
        return this.fpE;
    }

    /* Access modifiers changed, original: protected */
    public void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, bKj() + i, bArr, i2, i3);
    }

    /* renamed from: bKk */
    public kotlin.reflect.jvm.internal.impl.protobuf.d.a iterator() {
        return new a();
    }
}

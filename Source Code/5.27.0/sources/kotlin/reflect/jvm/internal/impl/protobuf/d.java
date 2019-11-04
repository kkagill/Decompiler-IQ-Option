package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ByteString */
public abstract class d implements Iterable<Byte> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final d fpH = new m(new byte[0]);

    /* compiled from: ByteString */
    public interface a extends Iterator<Byte> {
        byte nextByte();
    }

    /* compiled from: ByteString */
    public static final class b extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private final int Td;
        private byte[] buffer;
        private final ArrayList<d> fpI;
        private int fpJ;
        private int fpK;

        b(int i) {
            if (i >= 0) {
                this.Td = i;
                this.fpI = new ArrayList();
                this.buffer = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        public synchronized void write(int i) {
            if (this.fpK == this.buffer.length) {
                lS(1);
            }
            byte[] bArr = this.buffer;
            int i2 = this.fpK;
            this.fpK = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            if (i2 <= this.buffer.length - this.fpK) {
                System.arraycopy(bArr, i, this.buffer, this.fpK, i2);
                this.fpK += i2;
            } else {
                int length = this.buffer.length - this.fpK;
                System.arraycopy(bArr, i, this.buffer, this.fpK, length);
                i += length;
                i2 -= length;
                lS(i2);
                System.arraycopy(bArr, i, this.buffer, 0, i2);
                this.fpK = i2;
            }
        }

        public synchronized d bKt() {
            bKu();
            return d.ad(this.fpI);
        }

        private byte[] h(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        public synchronized int size() {
            return this.fpJ + this.fpK;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
        }

        private void lS(int i) {
            this.fpI.add(new m(this.buffer));
            this.fpJ += this.buffer.length;
            this.buffer = new byte[Math.max(this.Td, Math.max(i, this.fpJ >>> 1))];
            this.fpK = 0;
        }

        private void bKu() {
            int i = this.fpK;
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.fpI.add(new m(bArr));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i > 0) {
                this.fpI.add(new m(h(bArr, i)));
            }
            this.fpJ += this.fpK;
            this.fpK = 0;
        }
    }

    public abstract int D(int i, int i2, int i3);

    public abstract int E(int i, int i2, int i3);

    public abstract void b(OutputStream outputStream, int i, int i2);

    public abstract void b(byte[] bArr, int i, int i2, int i3);

    /* renamed from: bKk */
    public abstract a iterator();

    public abstract boolean bKn();

    public abstract e bKo();

    public abstract int bKq();

    public abstract boolean bKr();

    public abstract int bKs();

    public abstract int size();

    public abstract String toString(String str);

    d() {
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public static d l(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new m(bArr2);
    }

    public static d aa(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    public static d mx(String str) {
        try {
            return new m(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public d a(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return r.a(this, dVar);
        }
        StringBuilder stringBuilder = new StringBuilder(53);
        stringBuilder.append("ByteString would be too long: ");
        stringBuilder.append(size);
        stringBuilder.append("+");
        stringBuilder.append(size2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static d ad(Iterable<d> iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            collection = new ArrayList();
            for (d add : iterable) {
                collection.add(add);
            }
        }
        if (collection.isEmpty()) {
            return fpH;
        }
        return d(collection.iterator(), collection.size());
    }

    private static d d(Iterator<d> it, int i) {
        if (i == 1) {
            return (d) it.next();
        }
        int i2 = i >>> 1;
        return d(it, i2).a(d(it, i - i2));
    }

    public void a(byte[] bArr, int i, int i2, int i3) {
        StringBuilder stringBuilder;
        if (i < 0) {
            StringBuilder stringBuilder2 = new StringBuilder(30);
            stringBuilder2.append("Source offset < 0: ");
            stringBuilder2.append(i);
            throw new IndexOutOfBoundsException(stringBuilder2.toString());
        } else if (i2 < 0) {
            stringBuilder = new StringBuilder(30);
            stringBuilder.append("Target offset < 0: ");
            stringBuilder.append(i2);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                i4 = i2 + i3;
                if (i4 > bArr.length) {
                    stringBuilder = new StringBuilder(34);
                    stringBuilder.append("Target end offset < 0: ");
                    stringBuilder.append(i4);
                    throw new IndexOutOfBoundsException(stringBuilder.toString());
                } else if (i3 > 0) {
                    b(bArr, i, i2, i3);
                    return;
                } else {
                    return;
                }
            }
            stringBuilder = new StringBuilder(34);
            stringBuilder.append("Source end offset < 0: ");
            stringBuilder.append(i4);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else {
            stringBuilder = new StringBuilder(23);
            stringBuilder.append("Length < 0: ");
            stringBuilder.append(i3);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return h.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        b(bArr, 0, 0, size);
        return bArr;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(OutputStream outputStream, int i, int i2) {
        StringBuilder stringBuilder;
        if (i < 0) {
            StringBuilder stringBuilder2 = new StringBuilder(30);
            stringBuilder2.append("Source offset < 0: ");
            stringBuilder2.append(i);
            throw new IndexOutOfBoundsException(stringBuilder2.toString());
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > size()) {
                stringBuilder = new StringBuilder(39);
                stringBuilder.append("Source end offset exceeded: ");
                stringBuilder.append(i3);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            } else if (i2 > 0) {
                b(outputStream, i, i2);
            }
        } else {
            stringBuilder = new StringBuilder(23);
            stringBuilder.append("Length < 0: ");
            stringBuilder.append(i2);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public String bKm() {
        try {
            return toString("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static b bKp() {
        return new b(128);
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }
}

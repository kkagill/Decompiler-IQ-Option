package io.fabric.sdk.android.services.common;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: QueueFile */
public class r implements Closeable {
    private static final Logger eNz = Logger.getLogger(r.class.getName());
    private final byte[] buffer = new byte[16];
    private final RandomAccessFile eNA;
    int eNB;
    private a eNC;
    private a eND;
    private int elementCount;

    /* compiled from: QueueFile */
    static class a {
        static final a eNG = new a(0, 0);
        final int length;
        final int position;

        a(int i, int i2) {
            this.position = i;
            this.length = i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append("[position = ");
            stringBuilder.append(this.position);
            stringBuilder.append(", length = ");
            stringBuilder.append(this.length);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* compiled from: QueueFile */
    private final class b extends InputStream {
        private int aao;
        private int position;

        /* synthetic */ b(r rVar, a aVar, AnonymousClass1 anonymousClass1) {
            this(aVar);
        }

        private b(a aVar) {
            this.position = r.this.jo(aVar.position + 4);
            this.aao = aVar.length;
        }

        public int read(byte[] bArr, int i, int i2) {
            r.c(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.aao;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            r.this.c(this.position, bArr, i, i2);
            this.position = r.this.jo(this.position + i2);
            this.aao -= i2;
            return i2;
        }

        public int read() {
            if (this.aao == 0) {
                return -1;
            }
            r.this.eNA.seek((long) this.position);
            int read = r.this.eNA.read();
            this.position = r.this.jo(this.position + 1);
            this.aao--;
            return read;
        }
    }

    /* compiled from: QueueFile */
    public interface c {
        void a(InputStream inputStream, int i);
    }

    public r(File file) {
        if (!file.exists()) {
            w(file);
        }
        this.eNA = x(file);
        readHeader();
    }

    private static void j(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int j : iArr) {
            j(bArr, i, j);
            i += 4;
        }
    }

    private static int f(byte[] bArr, int i) {
        return ((((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16)) + ((bArr[i + 2] & 255) << 8)) + (bArr[i + 3] & 255);
    }

    private void readHeader() {
        this.eNA.seek(0);
        this.eNA.readFully(this.buffer);
        this.eNB = f(this.buffer, 0);
        if (((long) this.eNB) <= this.eNA.length()) {
            this.elementCount = f(this.buffer, 4);
            int f = f(this.buffer, 8);
            int f2 = f(this.buffer, 12);
            this.eNC = jn(f);
            this.eND = jn(f2);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("File is truncated. Expected length: ");
        stringBuilder.append(this.eNB);
        stringBuilder.append(", Actual length: ");
        stringBuilder.append(this.eNA.length());
        throw new IOException(stringBuilder.toString());
    }

    private void m(int i, int i2, int i3, int i4) {
        a(this.buffer, i, i2, i3, i4);
        this.eNA.seek(0);
        this.eNA.write(this.buffer);
    }

    private a jn(int i) {
        if (i == 0) {
            return a.eNG;
        }
        this.eNA.seek((long) i);
        return new a(i, this.eNA.readInt());
    }

    private static void w(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getPath());
        stringBuilder.append(".tmp");
        File file2 = new File(stringBuilder.toString());
        RandomAccessFile x = x(file2);
        try {
            x.setLength(4096);
            x.seek(0);
            byte[] bArr = new byte[16];
            a(bArr, 4096, 0, 0, 0);
            x.write(bArr);
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } finally {
            x.close();
        }
    }

    private static RandomAccessFile x(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private int jo(int i) {
        int i2 = this.eNB;
        return i < i2 ? i : (i + 16) - i2;
    }

    private void b(int i, byte[] bArr, int i2, int i3) {
        i = jo(i);
        int i4 = i + i3;
        int i5 = this.eNB;
        if (i4 <= i5) {
            this.eNA.seek((long) i);
            this.eNA.write(bArr, i2, i3);
            return;
        }
        i5 -= i;
        this.eNA.seek((long) i);
        this.eNA.write(bArr, i2, i5);
        this.eNA.seek(16);
        this.eNA.write(bArr, i2 + i5, i3 - i5);
    }

    private void c(int i, byte[] bArr, int i2, int i3) {
        i = jo(i);
        int i4 = i + i3;
        int i5 = this.eNB;
        if (i4 <= i5) {
            this.eNA.seek((long) i);
            this.eNA.readFully(bArr, i2, i3);
            return;
        }
        i5 -= i;
        this.eNA.seek((long) i);
        this.eNA.readFully(bArr, i2, i5);
        this.eNA.seek(16);
        this.eNA.readFully(bArr, i2 + i5, i3 - i5);
    }

    public void W(byte[] bArr) {
        k(bArr, 0, bArr.length);
    }

    public synchronized void k(byte[] bArr, int i, int i2) {
        c(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int i3;
        jp(i2);
        boolean isEmpty = isEmpty();
        if (isEmpty) {
            i3 = 16;
        } else {
            i3 = jo((this.eND.position + 4) + this.eND.length);
        }
        a aVar = new a(i3, i2);
        j(this.buffer, 0, i2);
        b(aVar.position, this.buffer, 0, 4);
        b(aVar.position + 4, bArr, i, i2);
        m(this.eNB, this.elementCount + 1, isEmpty ? aVar.position : this.eNC.position, aVar.position);
        this.eND = aVar;
        this.elementCount++;
        if (isEmpty) {
            this.eNC = this.eND;
        }
    }

    public int bjJ() {
        if (this.elementCount == 0) {
            return 16;
        }
        if (this.eND.position >= this.eNC.position) {
            return (((this.eND.position - this.eNC.position) + 4) + this.eND.length) + 16;
        }
        return (((this.eND.position + 4) + this.eND.length) + this.eNB) - this.eNC.position;
    }

    private int bjK() {
        return this.eNB - bjJ();
    }

    public synchronized boolean isEmpty() {
        return this.elementCount == 0;
    }

    private void jp(int i) {
        i += 4;
        int bjK = bjK();
        if (bjK < i) {
            int i2 = this.eNB;
            do {
                bjK += i2;
                i2 <<= 1;
            } while (bjK < i);
            setLength(i2);
            i = jo((this.eND.position + 4) + this.eND.length);
            if (i < this.eNC.position) {
                FileChannel channel = this.eNA.getChannel();
                channel.position((long) this.eNB);
                long j = (long) (i - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.eND.position < this.eNC.position) {
                i = (this.eNB + this.eND.position) - 16;
                m(i2, this.elementCount, this.eNC.position, i);
                this.eND = new a(i, this.eND.length);
            } else {
                m(i2, this.elementCount, this.eNC.position, this.eND.position);
            }
            this.eNB = i2;
        }
    }

    private void setLength(int i) {
        this.eNA.setLength((long) i);
        this.eNA.getChannel().force(true);
    }

    public synchronized void a(c cVar) {
        int i = this.eNC.position;
        for (int i2 = 0; i2 < this.elementCount; i2++) {
            a jn = jn(i);
            cVar.a(new b(this, jn, null), jn.length);
            i = jo((jn.position + 4) + jn.length);
        }
    }

    private static <T> T c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public synchronized void remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (this.elementCount == 1) {
            clear();
        } else {
            int jo = jo((this.eNC.position + 4) + this.eNC.length);
            c(jo, this.buffer, 0, 4);
            int f = f(this.buffer, 0);
            m(this.eNB, this.elementCount - 1, jo, this.eND.position);
            this.elementCount--;
            this.eNC = new a(jo, f);
        }
    }

    public synchronized void clear() {
        m(4096, 0, 0, 0);
        this.elementCount = 0;
        this.eNC = a.eNG;
        this.eND = a.eNG;
        if (this.eNB > 4096) {
            setLength(4096);
        }
        this.eNB = 4096;
    }

    public synchronized void close() {
        this.eNA.close();
    }

    public boolean aX(int i, int i2) {
        return (bjJ() + 4) + i <= i2;
    }

    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append("fileLength=");
        stringBuilder.append(this.eNB);
        stringBuilder.append(", size=");
        stringBuilder.append(this.elementCount);
        stringBuilder.append(", first=");
        stringBuilder.append(this.eNC);
        stringBuilder.append(", last=");
        stringBuilder.append(this.eND);
        stringBuilder.append(", element lengths=[");
        try {
            a(new c() {
                boolean eNE = true;

                public void a(InputStream inputStream, int i) {
                    if (this.eNE) {
                        this.eNE = false;
                    } else {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(i);
                }
            });
        } catch (IOException e) {
            eNz.log(Level.WARNING, "read error", e);
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}

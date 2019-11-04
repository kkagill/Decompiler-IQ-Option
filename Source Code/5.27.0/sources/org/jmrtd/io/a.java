package org.jmrtd.io;

import java.io.IOException;
import java.io.InputStream;
import org.jmrtd.io.FragmentBuffer.Fragment;

/* compiled from: InputStreamBuffer */
public class a {
    private b fEw;
    private FragmentBuffer fEx;

    /* compiled from: InputStreamBuffer */
    public class a extends InputStream {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private int fEy = -1;
        private Object fEz;
        private int position = 0;

        public void close() {
        }

        public boolean markSupported() {
            return true;
        }

        static {
            Class cls = a.class;
        }

        public a(Object obj) {
            this.fEz = obj;
        }

        public int read() {
            synchronized (this.fEz) {
                int i;
                if (this.position >= a.this.fEx.getLength()) {
                    return -1;
                } else if (a.this.fEx.mO(this.position)) {
                    byte[] bRe = a.this.fEx.bRe();
                    int i2 = this.position;
                    this.position = i2 + 1;
                    i = bRe[i2] & 255;
                    return i;
                } else {
                    if (a.this.fEw.markSupported()) {
                        mQ(this.position);
                    }
                    try {
                        i = a.this.fEw.read();
                        if (i < 0) {
                            return -1;
                        }
                        FragmentBuffer a = a.this.fEx;
                        int i3 = this.position;
                        this.position = i3 + 1;
                        a.a(i3, (byte) i);
                        return i;
                    } catch (IOException e) {
                        throw e;
                    }
                }
            }
        }

        public int read(byte[] bArr) {
            int read;
            synchronized (this.fEz) {
                read = read(bArr, 0, bArr.length);
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            synchronized (this.fEz) {
                if (bArr != null) {
                    if (i >= 0 && i2 >= 0) {
                        if (i2 <= bArr.length - i) {
                            if (i2 == 0) {
                                return 0;
                            }
                            if (i2 > a.this.fEx.getLength() - this.position) {
                                i2 = a.this.fEx.getLength() - this.position;
                            }
                            if (this.position >= a.this.fEx.getLength()) {
                                return -1;
                            }
                            if (a.this.fEw.markSupported()) {
                                mQ(this.position);
                            }
                            Fragment bo = a.this.fEx.bo(this.position, i2);
                            if (bo.getLength() > 0) {
                                i2 = bo.getOffset() - this.position;
                                int length = bo.getLength();
                                System.arraycopy(a.this.fEx.bRe(), this.position, bArr, i, i2);
                                this.position += i2;
                                if (a.this.fEw.markSupported()) {
                                    mQ(this.position);
                                }
                                i += i2;
                                length = a.this.fEw.read(bArr, i, length);
                                a.this.fEx.f(bo.getOffset(), bArr, i, length);
                                this.position += length;
                                i2 += length;
                                return i2;
                            }
                            i2 = Math.min(i2, a.this.fEx.getLength() - this.position);
                            System.arraycopy(a.this.fEx.bRe(), this.position, bArr, i, i2);
                            this.position += i2;
                            return i2;
                        }
                    }
                    throw new IndexOutOfBoundsException();
                }
                throw new NullPointerException();
            }
        }

        public long skip(long j) {
            synchronized (this.fEz) {
                int mP = a.this.fEx.mP(this.position);
                long j2 = (long) mP;
                if (j <= j2) {
                    this.position = (int) (((long) this.position) + j);
                    return j;
                }
                this.position += mP;
                if (a.this.fEw.markSupported()) {
                    mQ(this.position);
                    j = a.this.fEw.skip(j - j2);
                    this.position += (int) j;
                } else {
                    j = super.skip(j - j2);
                }
                j2 += j;
                return j2;
            }
        }

        public int available() {
            return a.this.fEx.mP(this.position);
        }

        public synchronized void mark(int i) {
            this.fEy = this.position;
        }

        public synchronized void reset() {
            if (this.fEy >= 0) {
                this.position = this.fEy;
            } else {
                throw new IOException("Invalid reset, was mark() called?");
            }
        }

        private void mQ(int i) {
            long j = (long) i;
            if (j != a.this.fEw.getPosition()) {
                a.this.fEw.reset();
                int i2 = 0;
                while (i2 < i) {
                    long j2 = (long) i2;
                    i2 = (int) (j2 + a.this.fEw.skip(j - j2));
                }
            }
        }
    }

    public a(InputStream inputStream, int i) {
        this.fEw = new b(inputStream);
        this.fEw.mark(i);
        this.fEx = new FragmentBuffer(i);
    }

    public a bRf() {
        a aVar;
        synchronized (this.fEw) {
            aVar = new a(this.fEw);
        }
        return aVar;
    }

    public int getLength() {
        return this.fEx.getLength();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InputStreamBuffer [");
        stringBuilder.append(this.fEx);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

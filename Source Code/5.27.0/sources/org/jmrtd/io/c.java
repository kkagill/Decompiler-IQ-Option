package org.jmrtd.io;

import java.io.IOException;
import java.io.InputStream;
import org.jmrtd.io.a.a;

/* compiled from: SplittableInputStream */
public class c extends InputStream {
    private a fEE;
    private a fEF = this.fEE.bRf();

    public c(InputStream inputStream, int i) {
        this.fEE = new a(inputStream, i);
    }

    public InputStream ia(int i) {
        try {
            a bRf = this.fEE.bRf();
            long j = 0;
            while (true) {
                long j2 = (long) i;
                if (j >= j2) {
                    return bRf;
                }
                j += bRf.skip(j2 - j);
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public int read() {
        return this.fEF.read();
    }

    public long skip(long j) {
        return this.fEF.skip(j);
    }

    public int available() {
        return this.fEF.available();
    }

    public void close() {
        this.fEF.close();
    }

    public synchronized void mark(int i) {
        this.fEF.mark(i);
    }

    public synchronized void reset() {
        this.fEF.reset();
    }

    public boolean markSupported() {
        return this.fEF.markSupported();
    }

    public int getLength() {
        return this.fEE.getLength();
    }
}

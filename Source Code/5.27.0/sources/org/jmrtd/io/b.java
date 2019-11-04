package org.jmrtd.io;

import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: PositionInputStream */
public class b extends InputStream {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private InputStream fEB;
    private long fEC = 0;
    private long fED = -1;

    public b(InputStream inputStream) {
        this.fEB = inputStream;
    }

    public int read() {
        int read = this.fEB.read();
        if (read >= 0) {
            this.fEC++;
        }
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.fEB.read(bArr, i, i2);
        this.fEC += (long) read;
        return read;
    }

    public long skip(long j) {
        long skip = this.fEB.skip(j);
        if (skip <= 0) {
            Logger logger = eNz;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Carrier (");
            stringBuilder.append(this.fEB.getClass().getCanonicalName());
            stringBuilder.append(")'s skip(");
            stringBuilder.append(j);
            stringBuilder.append(") only skipped ");
            stringBuilder.append(skip);
            stringBuilder.append(", position = ");
            stringBuilder.append(this.fEC);
            logger.warning(stringBuilder.toString());
        }
        this.fEC += skip;
        return skip;
    }

    public void mark(int i) {
        this.fEB.mark(i);
        this.fED = this.fEC;
    }

    public void reset() {
        this.fEB.reset();
        this.fEC = this.fED;
    }

    public boolean markSupported() {
        return this.fEB.markSupported();
    }

    public long getPosition() {
        return this.fEC;
    }
}

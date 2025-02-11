package com.google.android.gms.internal.firebase_messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class zzl extends FilterInputStream {
    private long zzh;
    private long zzi = -1;

    zzl(InputStream inputStream, long j) {
        super(inputStream);
        zzg.checkNotNull(inputStream);
        this.zzh = 1048576;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.zzh);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.zzi = this.zzh;
    }

    public final int read() {
        if (this.zzh == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.zzh--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.zzh;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.zzh -= (long) read;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.zzi != -1) {
            this.in.reset();
            this.zzh = this.zzi;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        j = this.in.skip(Math.min(j, this.zzh));
        this.zzh -= j;
        return j;
    }
}

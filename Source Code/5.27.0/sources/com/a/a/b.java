package com.a.a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader */
class b implements Closeable {
    private byte[] buf;
    private final Charset charset;
    private int end;
    private final InputStream in;
    private int pos;

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(c.US_ASCII)) {
            this.in = inputStream;
            this.charset = charset;
            this.buf = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public void close() {
        synchronized (this.in) {
            if (this.buf != null) {
                this.buf = null;
                this.in.close();
            }
        }
    }

    public String readLine() {
        synchronized (this.in) {
            if (this.buf != null) {
                int i;
                if (this.pos >= this.end) {
                    bdj();
                }
                for (int i2 = this.pos; i2 != this.end; i2++) {
                    if (this.buf[i2] == (byte) 10) {
                        int i3;
                        String str;
                        if (i2 != this.pos) {
                            i3 = i2 - 1;
                            if (this.buf[i3] == (byte) 13) {
                                str = new String(this.buf, this.pos, i3 - this.pos, this.charset.name());
                                this.pos = i2 + 1;
                                return str;
                            }
                        }
                        i3 = i2;
                        str = new String(this.buf, this.pos, i3 - this.pos, this.charset.name());
                        this.pos = i2 + 1;
                        return str;
                    }
                }
                AnonymousClass1 anonymousClass1 = new ByteArrayOutputStream((this.end - this.pos) + 80) {
                    public String toString() {
                        int i = (this.count <= 0 || this.buf[this.count - 1] != (byte) 13) ? this.count : this.count - 1;
                        try {
                            return new String(this.buf, 0, i, b.this.charset.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    anonymousClass1.write(this.buf, this.pos, this.end - this.pos);
                    this.end = -1;
                    bdj();
                    i = this.pos;
                    while (i != this.end) {
                        if (this.buf[i] == (byte) 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                if (i != this.pos) {
                    anonymousClass1.write(this.buf, this.pos, i - this.pos);
                }
                this.pos = i + 1;
                String byteArrayOutputStream = anonymousClass1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    private void bdj() {
        InputStream inputStream = this.in;
        byte[] bArr = this.buf;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.pos = 0;
            this.end = read;
            return;
        }
        throw new EOFException();
    }
}

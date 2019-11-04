package com.google.common.io;

import com.google.common.base.Optional;
import com.google.common.base.i;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/* compiled from: ByteSource */
public abstract class b {

    /* compiled from: ByteSource */
    class a extends d {
        final Charset charset;

        a(Charset charset) {
            this.charset = (Charset) i.checkNotNull(charset);
        }

        public Reader uX() {
            return new InputStreamReader(b.this.openStream(), this.charset);
        }

        public String read() {
            return new String(b.this.uW(), this.charset);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b.this.toString());
            stringBuilder.append(".asCharSource(");
            stringBuilder.append(this.charset);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public abstract InputStream openStream();

    protected b() {
    }

    public d a(Charset charset) {
        return new a(charset);
    }

    public Optional<Long> uV() {
        return Optional.pW();
    }

    public long b(OutputStream outputStream) {
        i.checkNotNull(outputStream);
        g va = g.va();
        try {
            long copy = c.copy((InputStream) va.a(openStream()), outputStream);
            va.close();
            return copy;
        } catch (Throwable th) {
            va.close();
        }
    }

    public byte[] uW() {
        g va = g.va();
        try {
            byte[] a;
            InputStream inputStream = (InputStream) va.a(openStream());
            Optional uV = uV();
            if (uV.isPresent()) {
                a = c.a(inputStream, ((Long) uV.get()).longValue());
            } else {
                a = c.toByteArray(inputStream);
            }
            va.close();
            return a;
        } catch (Throwable th) {
            va.close();
        }
    }
}

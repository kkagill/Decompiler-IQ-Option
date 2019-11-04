package com.google.common.io;

import com.google.common.base.i;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: AppendableWriter */
class a extends Writer {
    private final Appendable Ys;
    private boolean closed;

    a(Appendable appendable) {
        this.Ys = (Appendable) i.checkNotNull(appendable);
    }

    public void write(char[] cArr, int i, int i2) {
        checkNotClosed();
        this.Ys.append(new String(cArr, i, i2));
    }

    public void write(int i) {
        checkNotClosed();
        this.Ys.append((char) i);
    }

    public void write(String str) {
        checkNotClosed();
        this.Ys.append(str);
    }

    public void write(String str, int i, int i2) {
        checkNotClosed();
        this.Ys.append(str, i, i2 + i);
    }

    public void flush() {
        checkNotClosed();
        Appendable appendable = this.Ys;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    public void close() {
        this.closed = true;
        Appendable appendable = this.Ys;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    public Writer append(char c) {
        checkNotClosed();
        this.Ys.append(c);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        checkNotClosed();
        this.Ys.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int i, int i2) {
        checkNotClosed();
        this.Ys.append(charSequence, i, i2);
        return this;
    }

    private void checkNotClosed() {
        if (this.closed) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }
}

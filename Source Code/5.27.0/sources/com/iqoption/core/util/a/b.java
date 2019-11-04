package com.iqoption.core.util.a;

import java.io.IOException;
import java.io.Reader;

/* compiled from: ReusableStringReader */
class b extends Reader {
    private String bRP;
    private int length;
    private int mark = 0;
    private int next = 0;

    public boolean markSupported() {
        return true;
    }

    b(String str) {
        setString(str);
    }

    public void setString(String str) {
        this.bRP = str;
        this.length = str.length();
        this.next = 0;
        this.mark = 0;
    }

    private void anQ() {
        if (this.bRP == null) {
            throw new IOException("Stream closed");
        }
    }

    public int read() {
        anQ();
        int i = this.next;
        if (i >= this.length) {
            return -1;
        }
        String str = this.bRP;
        this.next = i + 1;
        return str.charAt(i);
    }

    public int read(char[] cArr, int i, int i2) {
        anQ();
        if (i >= 0 && i <= cArr.length && i2 >= 0) {
            int i3 = i + i2;
            if (i3 <= cArr.length && i3 >= 0) {
                if (i2 == 0) {
                    return 0;
                }
                i3 = this.next;
                int i4 = this.length;
                if (i3 >= i4) {
                    return -1;
                }
                i2 = Math.min(i4 - i3, i2);
                String str = this.bRP;
                i4 = this.next;
                str.getChars(i4, i4 + i2, cArr, i);
                this.next += i2;
                return i2;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public long skip(long j) {
        anQ();
        int i = this.next;
        int i2 = this.length;
        if (i >= i2) {
            return 0;
        }
        j = Math.max((long) (-this.next), Math.min((long) (i2 - i), j));
        this.next = (int) (((long) this.next) + j);
        return j;
    }

    public boolean ready() {
        anQ();
        return true;
    }

    public void mark(int i) {
        if (i >= 0) {
            anQ();
            this.mark = this.next;
            return;
        }
        throw new IllegalArgumentException("Read-ahead limit < 0");
    }

    public void reset() {
        anQ();
        this.next = this.mark;
    }

    public void close() {
        this.bRP = null;
    }
}

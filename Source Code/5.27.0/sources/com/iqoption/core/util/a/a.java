package com.iqoption.core.util.a;

import java.io.Closeable;
import java.io.Reader;

/* compiled from: ReusableJsonReader */
public class a implements Closeable {
    private static final char[] NON_EXECUTE_PREFIX = ")]}'\n".toCharArray();
    private boolean bRO;
    private final char[] buffer;
    private Reader in;
    private boolean lenient;
    private int limit;
    private int lineNumber;
    private int lineStart;
    private int[] pathIndices;
    private String[] pathNames;
    private int peeked;
    private int pos;
    private int[] stack;
    private int stackSize;

    public static a cL(boolean z) {
        a aVar = new a("{}");
        aVar.setLenient(z);
        return aVar;
    }

    public a(Reader reader) {
        this.lenient = false;
        this.buffer = new char[1024];
        this.pos = 0;
        this.limit = 0;
        this.lineNumber = 0;
        this.lineStart = 0;
        this.peeked = 0;
        this.stack = new int[32];
        this.stackSize = 0;
        int[] iArr = this.stack;
        int i = this.stackSize;
        this.stackSize = i + 1;
        iArr[i] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        if (reader != null) {
            this.in = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    public a(String str) {
        this(new b(str));
        this.bRO = true;
    }

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    public void close() {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(locationString());
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: 0000 */
    public String locationString() {
        int i = this.lineNumber + 1;
        int i2 = (this.pos - this.lineStart) + 1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at line ");
        stringBuilder.append(i);
        stringBuilder.append(" column ");
        stringBuilder.append(i2);
        stringBuilder.append(" path ");
        stringBuilder.append(getPath());
        return stringBuilder.toString();
    }

    public String getPath() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        int i = this.stackSize;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.stack[i2];
            if (i3 == 1 || i3 == 2) {
                stringBuilder.append('[');
                stringBuilder.append(this.pathIndices[i2]);
                stringBuilder.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                stringBuilder.append('.');
                String[] strArr = this.pathNames;
                if (strArr[i2] != null) {
                    stringBuilder.append(strArr[i2]);
                }
            }
        }
        return stringBuilder.toString();
    }
}

package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public class JsonReader implements Closeable {
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final char[] NON_EXECUTE_PREFIX = ")]}'\n".toCharArray();
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final char[] buffer = new char[1024];
    private final Reader in;
    private boolean lenient = false;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    private int[] pathIndices;
    private String[] pathNames;
    int peeked = 0;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int pos = 0;
    private int[] stack = new int[32];
    private int stackSize = 0;

    static {
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() {
            public void promoteNameToValue(JsonReader jsonReader) {
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader) jsonReader).promoteNameToValue();
                    return;
                }
                int i = jsonReader.peeked;
                if (i == 0) {
                    i = jsonReader.doPeek();
                }
                if (i == 13) {
                    jsonReader.peeked = 9;
                } else if (i == 12) {
                    jsonReader.peeked = 8;
                } else if (i == 14) {
                    jsonReader.peeked = 10;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Expected a name but was ");
                    stringBuilder.append(jsonReader.peek());
                    stringBuilder.append(jsonReader.locationString());
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
        };
    }

    public JsonReader(Reader reader) {
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

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    public void beginArray() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 3) {
            push(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_ARRAY but was ");
        stringBuilder.append(peek());
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void endArray() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 4) {
            this.stackSize--;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            this.peeked = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_ARRAY but was ");
        stringBuilder.append(peek());
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void beginObject() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 1) {
            push(3);
            this.peeked = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_OBJECT but was ");
        stringBuilder.append(peek());
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void endObject() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 2) {
            this.stackSize--;
            String[] strArr = this.pathNames;
            int i2 = this.stackSize;
            strArr[i2] = null;
            int[] iArr = this.pathIndices;
            i2--;
            iArr[i2] = iArr[i2] + 1;
            this.peeked = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_OBJECT but was ");
        stringBuilder.append(peek());
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean hasNext() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public JsonToken peek() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        switch (i) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int doPeek() {
        int nextNonWhitespace;
        int[] iArr = this.stack;
        int i = this.stackSize;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            nextNonWhitespace = nextNonWhitespace(true);
            if (nextNonWhitespace != 44) {
                if (nextNonWhitespace == 59) {
                    checkLenient();
                } else if (nextNonWhitespace == 93) {
                    this.peeked = 4;
                    return 4;
                } else {
                    throw syntaxError("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            this.stack[this.stackSize - 1] = 4;
            if (i2 == 5) {
                i = nextNonWhitespace(true);
                if (i != 44) {
                    if (i == 59) {
                        checkLenient();
                    } else if (i == 125) {
                        this.peeked = 2;
                        return 2;
                    } else {
                        throw syntaxError("Unterminated object");
                    }
                }
            }
            i = nextNonWhitespace(true);
            if (i == 34) {
                this.peeked = 13;
                return 13;
            } else if (i != 39) {
                String str = "Expected name";
                if (i != 125) {
                    checkLenient();
                    this.pos--;
                    if (isLiteral((char) i)) {
                        this.peeked = 14;
                        return 14;
                    }
                    throw syntaxError(str);
                } else if (i2 != 5) {
                    this.peeked = 2;
                    return 2;
                } else {
                    throw syntaxError(str);
                }
            } else {
                checkLenient();
                this.peeked = 12;
                return 12;
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            nextNonWhitespace = nextNonWhitespace(true);
            if (nextNonWhitespace != 58) {
                if (nextNonWhitespace == 61) {
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        char[] cArr = this.buffer;
                        i = this.pos;
                        if (cArr[i] == '>') {
                            this.pos = i + 1;
                        }
                    }
                } else {
                    throw syntaxError("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            if (this.lenient) {
                consumeNonExecutePrefix();
            }
            this.stack[this.stackSize - 1] = 7;
        } else if (i2 == 7) {
            if (nextNonWhitespace(false) == -1) {
                this.peeked = 17;
                return 17;
            }
            checkLenient();
            this.pos--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        nextNonWhitespace = nextNonWhitespace(true);
        if (nextNonWhitespace == 34) {
            this.peeked = 9;
            return 9;
        } else if (nextNonWhitespace != 39) {
            if (!(nextNonWhitespace == 44 || nextNonWhitespace == 59)) {
                if (nextNonWhitespace == 91) {
                    this.peeked = 3;
                    return 3;
                } else if (nextNonWhitespace != 93) {
                    if (nextNonWhitespace != 123) {
                        this.pos--;
                        nextNonWhitespace = peekKeyword();
                        if (nextNonWhitespace != 0) {
                            return nextNonWhitespace;
                        }
                        nextNonWhitespace = peekNumber();
                        if (nextNonWhitespace != 0) {
                            return nextNonWhitespace;
                        }
                        if (isLiteral(this.buffer[this.pos])) {
                            checkLenient();
                            this.peeked = 10;
                            return 10;
                        }
                        throw syntaxError("Expected value");
                    }
                    this.peeked = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.peeked = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                checkLenient();
                this.pos--;
                this.peeked = 7;
                return 7;
            }
            throw syntaxError("Unexpected value");
        } else {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
    }

    private int peekKeyword() {
        int i;
        String str;
        char c = this.buffer[this.pos];
        String str2;
        if (c == 't' || c == 'T') {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            if (this.pos + i2 >= this.limit && !fillBuffer(i2 + 1)) {
                return 0;
            }
            char c2 = this.buffer[this.pos + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
            i2++;
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i;
        return i;
    }

    private int peekNumber() {
        char c;
        char[] cArr = this.buffer;
        int i = this.pos;
        int i2 = 0;
        int i3 = this.limit;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        long j = 0;
        Object obj = null;
        while (true) {
            if (i + i4 == i3) {
                if (i4 == cArr.length) {
                    return i2;
                }
                if (!fillBuffer(i4 + 1)) {
                    break;
                }
                i = this.pos;
                i3 = this.limit;
            }
            c = cArr[i + i4];
            if (c == '+') {
                i2 = 0;
                if (i5 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i2 = 0;
                if (i5 != 2 && i5 != 4) {
                    return 0;
                }
                i5 = 5;
                i4++;
            } else {
                if (c == '-') {
                    i2 = 0;
                    if (i5 == 0) {
                        i5 = 1;
                        obj = 1;
                    } else if (i5 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i2 = 0;
                    if (i5 != 2) {
                        return 0;
                    }
                    i5 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (i5 == 1 || i5 == 0) {
                        j = (long) (-(c - 48));
                        i2 = 0;
                        i5 = 2;
                    } else {
                        if (i5 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - 48));
                            i2 = (j > MIN_INCOMPLETE_INTEGER || (j == MIN_INCOMPLETE_INTEGER && j2 < j)) ? 1 : 0;
                            j = j2;
                            i6 = i2 & i6;
                        } else if (i5 == 3) {
                            i2 = 0;
                            i5 = 4;
                        } else if (i5 == 5 || i5 == 6) {
                            i2 = 0;
                            i5 = 7;
                        }
                        i2 = 0;
                    }
                }
                i4++;
            }
            i5 = 6;
            i4++;
        }
        if (isLiteral(c)) {
            return 0;
        }
        if (i5 == 2 && i6 != 0 && ((j != Long.MIN_VALUE || obj != null) && (j != 0 || obj == null))) {
            if (obj == null) {
                j = -j;
            }
            this.peekedLong = j;
            this.pos += i4;
            this.peeked = 15;
            return 15;
        } else if (i5 != 2 && i5 != 4 && i5 != 7) {
            return 0;
        } else {
            this.peekedNumberLength = i4;
            this.peeked = 16;
            return 16;
        }
    }

    private boolean isLiteral(char c) {
        if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
            if (c != '#') {
                if (c != ',') {
                    if (!(c == '/' || c == '=')) {
                        if (!(c == '{' || c == '}' || c == ':')) {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        break;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            checkLenient();
        }
        return false;
    }

    public String nextName() {
        String nextUnquotedValue;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 14) {
            nextUnquotedValue = nextUnquotedValue();
        } else if (i == 12) {
            nextUnquotedValue = nextQuotedValue('\'');
        } else if (i == 13) {
            nextUnquotedValue = nextQuotedValue('\"');
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a name but was ");
            stringBuilder.append(peek());
            stringBuilder.append(locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = nextUnquotedValue;
        return nextUnquotedValue;
    }

    public String nextString() {
        String nextUnquotedValue;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 10) {
            nextUnquotedValue = nextUnquotedValue();
        } else if (i == 8) {
            nextUnquotedValue = nextQuotedValue('\'');
        } else if (i == 9) {
            nextUnquotedValue = nextQuotedValue('\"');
        } else if (i == 11) {
            nextUnquotedValue = this.peekedString;
            this.peekedString = null;
        } else if (i == 15) {
            nextUnquotedValue = Long.toString(this.peekedLong);
        } else if (i == 16) {
            nextUnquotedValue = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a string but was ");
            stringBuilder.append(peek());
            stringBuilder.append(locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return nextUnquotedValue;
    }

    public boolean nextBoolean() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        int[] iArr;
        int i2;
        if (i == 5) {
            this.peeked = 0;
            iArr = this.pathIndices;
            i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.peeked = 0;
            iArr = this.pathIndices;
            i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return false;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a boolean but was ");
            stringBuilder.append(peek());
            stringBuilder.append(locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void nextNull() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 7) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected null but was ");
        stringBuilder.append(peek());
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public double nextDouble() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.peekedLong;
        }
        if (i == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (i == 8 || i == 9) {
            this.peekedString = nextQuotedValue(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i != 11) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a double but was ");
            stringBuilder.append(peek());
            stringBuilder.append(locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        if (this.lenient || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("JSON forbids NaN and infinities: ");
        stringBuilder2.append(parseDouble);
        stringBuilder2.append(locationString());
        throw new MalformedJsonException(stringBuilder2.toString());
    }

    public long nextLong() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        int[] iArr;
        int i2;
        if (i == 15) {
            this.peeked = 0;
            iArr = this.pathIndices;
            i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        StringBuilder stringBuilder;
        String str = "Expected a long but was ";
        if (i == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(peek());
            stringBuilder.append(locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.peekedString = null;
            this.peeked = 0;
            iArr = this.pathIndices;
            i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return j;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.peekedString);
        stringBuilder.append(locationString());
        throw new NumberFormatException(stringBuilder.toString());
    }

    /* JADX WARNING: Missing block: B:23:0x005b, code skipped:
            if (r1 != null) goto L_0x006b;
     */
    /* JADX WARNING: Missing block: B:24:0x005d, code skipped:
            r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r4) * 2, 16));
     */
    /* JADX WARNING: Missing block: B:25:0x006b, code skipped:
            r1.append(r0, r4, r2 - r4);
            r9.pos = r2;
     */
    /* JADX WARNING: Missing block: B:26:0x0076, code skipped:
            if (fillBuffer(1) == false) goto L_0x0079;
     */
    /* JADX WARNING: Missing block: B:29:0x0080, code skipped:
            throw syntaxError("Unterminated string");
     */
    private java.lang.String nextQuotedValue(char r10) {
        /*
        r9 = this;
        r0 = r9.buffer;
        r1 = 0;
    L_0x0003:
        r2 = r9.pos;
        r3 = r9.limit;
    L_0x0007:
        r4 = r2;
    L_0x0008:
        r5 = 16;
        r6 = 1;
        if (r2 >= r3) goto L_0x005b;
    L_0x000d:
        r7 = r2 + 1;
        r2 = r0[r2];
        if (r2 != r10) goto L_0x0027;
    L_0x0013:
        r9.pos = r7;
        r7 = r7 - r4;
        r7 = r7 - r6;
        if (r1 != 0) goto L_0x001f;
    L_0x0019:
        r10 = new java.lang.String;
        r10.<init>(r0, r4, r7);
        return r10;
    L_0x001f:
        r1.append(r0, r4, r7);
        r10 = r1.toString();
        return r10;
    L_0x0027:
        r8 = 92;
        if (r2 != r8) goto L_0x004e;
    L_0x002b:
        r9.pos = r7;
        r7 = r7 - r4;
        r7 = r7 - r6;
        if (r1 != 0) goto L_0x003f;
    L_0x0031:
        r1 = r7 + 1;
        r1 = r1 * 2;
        r2 = new java.lang.StringBuilder;
        r1 = java.lang.Math.max(r1, r5);
        r2.<init>(r1);
        r1 = r2;
    L_0x003f:
        r1.append(r0, r4, r7);
        r2 = r9.readEscapeCharacter();
        r1.append(r2);
        r2 = r9.pos;
        r3 = r9.limit;
        goto L_0x0007;
    L_0x004e:
        r5 = 10;
        if (r2 != r5) goto L_0x0059;
    L_0x0052:
        r2 = r9.lineNumber;
        r2 = r2 + r6;
        r9.lineNumber = r2;
        r9.lineStart = r7;
    L_0x0059:
        r2 = r7;
        goto L_0x0008;
    L_0x005b:
        if (r1 != 0) goto L_0x006b;
    L_0x005d:
        r1 = r2 - r4;
        r1 = r1 * 2;
        r3 = new java.lang.StringBuilder;
        r1 = java.lang.Math.max(r1, r5);
        r3.<init>(r1);
        r1 = r3;
    L_0x006b:
        r3 = r2 - r4;
        r1.append(r0, r4, r3);
        r9.pos = r2;
        r2 = r9.fillBuffer(r6);
        if (r2 == 0) goto L_0x0079;
    L_0x0078:
        goto L_0x0003;
    L_0x0079:
        r10 = "Unterminated string";
        r10 = r9.syntaxError(r10);
        goto L_0x0081;
    L_0x0080:
        throw r10;
    L_0x0081:
        goto L_0x0080;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextQuotedValue(char):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARNING: Missing block: B:32:0x004b, code skipped:
            checkLenient();
     */
    private java.lang.String nextUnquotedValue() {
        /*
        r6 = this;
        r0 = 0;
        r1 = 0;
        r2 = r1;
    L_0x0003:
        r1 = 0;
    L_0x0004:
        r3 = r6.pos;
        r4 = r3 + r1;
        r5 = r6.limit;
        if (r4 >= r5) goto L_0x004f;
    L_0x000c:
        r4 = r6.buffer;
        r3 = r3 + r1;
        r3 = r4[r3];
        r4 = 9;
        if (r3 == r4) goto L_0x005d;
    L_0x0015:
        r4 = 10;
        if (r3 == r4) goto L_0x005d;
    L_0x0019:
        r4 = 12;
        if (r3 == r4) goto L_0x005d;
    L_0x001d:
        r4 = 13;
        if (r3 == r4) goto L_0x005d;
    L_0x0021:
        r4 = 32;
        if (r3 == r4) goto L_0x005d;
    L_0x0025:
        r4 = 35;
        if (r3 == r4) goto L_0x004b;
    L_0x0029:
        r4 = 44;
        if (r3 == r4) goto L_0x005d;
    L_0x002d:
        r4 = 47;
        if (r3 == r4) goto L_0x004b;
    L_0x0031:
        r4 = 61;
        if (r3 == r4) goto L_0x004b;
    L_0x0035:
        r4 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r3 == r4) goto L_0x005d;
    L_0x0039:
        r4 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r3 == r4) goto L_0x005d;
    L_0x003d:
        r4 = 58;
        if (r3 == r4) goto L_0x005d;
    L_0x0041:
        r4 = 59;
        if (r3 == r4) goto L_0x004b;
    L_0x0045:
        switch(r3) {
            case 91: goto L_0x005d;
            case 92: goto L_0x004b;
            case 93: goto L_0x005d;
            default: goto L_0x0048;
        };
    L_0x0048:
        r1 = r1 + 1;
        goto L_0x0004;
    L_0x004b:
        r6.checkLenient();
        goto L_0x005d;
    L_0x004f:
        r3 = r6.buffer;
        r3 = r3.length;
        if (r1 >= r3) goto L_0x005f;
    L_0x0054:
        r3 = r1 + 1;
        r3 = r6.fillBuffer(r3);
        if (r3 == 0) goto L_0x005d;
    L_0x005c:
        goto L_0x0004;
    L_0x005d:
        r0 = r1;
        goto L_0x007f;
    L_0x005f:
        if (r2 != 0) goto L_0x006c;
    L_0x0061:
        r2 = new java.lang.StringBuilder;
        r3 = 16;
        r3 = java.lang.Math.max(r1, r3);
        r2.<init>(r3);
    L_0x006c:
        r3 = r6.buffer;
        r4 = r6.pos;
        r2.append(r3, r4, r1);
        r3 = r6.pos;
        r3 = r3 + r1;
        r6.pos = r3;
        r1 = 1;
        r1 = r6.fillBuffer(r1);
        if (r1 != 0) goto L_0x0003;
    L_0x007f:
        if (r2 != 0) goto L_0x008b;
    L_0x0081:
        r1 = new java.lang.String;
        r2 = r6.buffer;
        r3 = r6.pos;
        r1.<init>(r2, r3, r0);
        goto L_0x0096;
    L_0x008b:
        r1 = r6.buffer;
        r3 = r6.pos;
        r2.append(r1, r3, r0);
        r1 = r2.toString();
    L_0x0096:
        r2 = r6.pos;
        r2 = r2 + r0;
        r6.pos = r2;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextUnquotedValue():java.lang.String");
    }

    private void skipQuotedValue(char c) {
        char[] cArr = this.buffer;
        while (true) {
            int i = this.pos;
            int i2 = this.limit;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.pos = i3;
                    return;
                } else if (c2 == '\\') {
                    this.pos = i3;
                    readEscapeCharacter();
                    i = this.pos;
                    i2 = this.limit;
                } else {
                    if (c2 == 10) {
                        this.lineNumber++;
                        this.lineStart = i3;
                    }
                    i = i3;
                }
            }
            this.pos = i;
            if (!fillBuffer(1)) {
                throw syntaxError("Unterminated string");
            }
        }
    }

    /* JADX WARNING: Missing block: B:31:0x0048, code skipped:
            checkLenient();
     */
    private void skipUnquotedValue() {
        /*
        r4 = this;
    L_0x0000:
        r0 = 0;
    L_0x0001:
        r1 = r4.pos;
        r2 = r1 + r0;
        r3 = r4.limit;
        if (r2 >= r3) goto L_0x0051;
    L_0x0009:
        r2 = r4.buffer;
        r1 = r1 + r0;
        r1 = r2[r1];
        r2 = 9;
        if (r1 == r2) goto L_0x004b;
    L_0x0012:
        r2 = 10;
        if (r1 == r2) goto L_0x004b;
    L_0x0016:
        r2 = 12;
        if (r1 == r2) goto L_0x004b;
    L_0x001a:
        r2 = 13;
        if (r1 == r2) goto L_0x004b;
    L_0x001e:
        r2 = 32;
        if (r1 == r2) goto L_0x004b;
    L_0x0022:
        r2 = 35;
        if (r1 == r2) goto L_0x0048;
    L_0x0026:
        r2 = 44;
        if (r1 == r2) goto L_0x004b;
    L_0x002a:
        r2 = 47;
        if (r1 == r2) goto L_0x0048;
    L_0x002e:
        r2 = 61;
        if (r1 == r2) goto L_0x0048;
    L_0x0032:
        r2 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r1 == r2) goto L_0x004b;
    L_0x0036:
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r1 == r2) goto L_0x004b;
    L_0x003a:
        r2 = 58;
        if (r1 == r2) goto L_0x004b;
    L_0x003e:
        r2 = 59;
        if (r1 == r2) goto L_0x0048;
    L_0x0042:
        switch(r1) {
            case 91: goto L_0x004b;
            case 92: goto L_0x0048;
            case 93: goto L_0x004b;
            default: goto L_0x0045;
        };
    L_0x0045:
        r0 = r0 + 1;
        goto L_0x0001;
    L_0x0048:
        r4.checkLenient();
    L_0x004b:
        r1 = r4.pos;
        r1 = r1 + r0;
        r4.pos = r1;
        return;
    L_0x0051:
        r1 = r1 + r0;
        r4.pos = r1;
        r0 = 1;
        r0 = r4.fillBuffer(r0);
        if (r0 != 0) goto L_0x0000;
    L_0x005b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.skipUnquotedValue():void");
    }

    public int nextInt() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        String str = "Expected an int but was ";
        int i2;
        int[] iArr;
        int i3;
        StringBuilder stringBuilder;
        if (i == 15) {
            long j = this.peekedLong;
            i2 = (int) j;
            if (j == ((long) i2)) {
                this.peeked = 0;
                iArr = this.pathIndices;
                i3 = this.stackSize - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.peekedLong);
            stringBuilder.append(locationString());
            throw new NumberFormatException(stringBuilder.toString());
        }
        if (i == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i == 8 ? '\'' : '\"');
            }
            try {
                i = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                i2 = this.stackSize - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return i;
            } catch (NumberFormatException unused) {
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(peek());
            stringBuilder.append(locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        i2 = (int) parseDouble;
        if (((double) i2) == parseDouble) {
            this.peekedString = null;
            this.peeked = 0;
            iArr = this.pathIndices;
            i3 = this.stackSize - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.peekedString);
        stringBuilder.append(locationString());
        throw new NumberFormatException(stringBuilder.toString());
    }

    public void close() {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    public void skipValue() {
        int i;
        int i2 = 0;
        do {
            i = this.peeked;
            if (i == 0) {
                i = doPeek();
            }
            if (i == 3) {
                push(1);
            } else if (i == 1) {
                push(3);
            } else {
                if (i == 4) {
                    this.stackSize--;
                } else if (i == 2) {
                    this.stackSize--;
                } else if (i == 14 || i == 10) {
                    skipUnquotedValue();
                    this.peeked = 0;
                } else if (i == 8 || i == 12) {
                    skipQuotedValue('\'');
                    this.peeked = 0;
                } else if (i == 9 || i == 13) {
                    skipQuotedValue('\"');
                    this.peeked = 0;
                } else {
                    if (i == 16) {
                        this.pos += this.peekedNumberLength;
                    }
                    this.peeked = 0;
                }
                i2--;
                this.peeked = 0;
            }
            i2++;
            this.peeked = 0;
        } while (i2 != 0);
        int[] iArr = this.pathIndices;
        i2 = this.stackSize;
        i = i2 - 1;
        iArr[i] = iArr[i] + 1;
        this.pathNames[i2 - 1] = "null";
    }

    private void push(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.stack;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            int[] iArr3 = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.pathIndices, 0, iArr3, 0, this.stackSize);
            System.arraycopy(this.pathNames, 0, strArr, 0, this.stackSize);
            this.stack = iArr2;
            this.pathIndices = iArr3;
            this.pathNames = strArr;
        }
        int[] iArr4 = this.stack;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr4[i3] = i;
    }

    private boolean fillBuffer(int i) {
        char[] cArr = this.buffer;
        int i2 = this.lineStart;
        int i3 = this.pos;
        this.lineStart = i2 - i3;
        i2 = this.limit;
        if (i2 != i3) {
            this.limit = i2 - i3;
            System.arraycopy(cArr, i3, cArr, 0, this.limit);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.in;
            i3 = this.limit;
            i2 = reader.read(cArr, i3, cArr.length - i3);
            if (i2 == -1) {
                return false;
            }
            this.limit += i2;
            if (this.lineNumber == 0) {
                i2 = this.lineStart;
                if (i2 == 0 && this.limit > 0 && cArr[0] == 65279) {
                    this.pos++;
                    this.lineStart = i2 + 1;
                    i++;
                }
            }
        } while (this.limit < i);
        return true;
    }

    private int nextNonWhitespace(boolean z) {
        char[] cArr = this.buffer;
        int i = this.pos;
        int i2 = this.limit;
        while (true) {
            if (i == i2) {
                this.pos = i;
                if (fillBuffer(1)) {
                    i = this.pos;
                    i2 = this.limit;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("End of input");
                    stringBuilder.append(locationString());
                    throw new EOFException(stringBuilder.toString());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.lineNumber++;
                this.lineStart = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.pos = i3;
                    if (i3 == i2) {
                        this.pos--;
                        boolean fillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!fillBuffer) {
                            return c;
                        }
                    }
                    checkLenient();
                    i2 = this.pos;
                    char c2 = cArr[i2];
                    if (c2 == '*') {
                        this.pos = i2 + 1;
                        if (skipTo("*/")) {
                            i = this.pos + 2;
                            i2 = this.limit;
                        } else {
                            throw syntaxError("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.pos = i2 + 1;
                        skipToEndOfLine();
                        i = this.pos;
                        i2 = this.limit;
                    }
                } else if (c == '#') {
                    this.pos = i3;
                    checkLenient();
                    skipToEndOfLine();
                    i = this.pos;
                    i2 = this.limit;
                } else {
                    this.pos = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private void checkLenient() {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void skipToEndOfLine() {
        char c;
        do {
            if (this.pos < this.limit || fillBuffer(1)) {
                char[] cArr = this.buffer;
                int i = this.pos;
                this.pos = i + 1;
                c = cArr[i];
                if (c == 10) {
                    this.lineNumber++;
                    this.lineStart = this.pos;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    private boolean skipTo(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i2 = this.pos;
            if (cArr[i2] == 10) {
                this.lineNumber++;
                this.lineStart = i2 + 1;
            } else {
                while (i < length) {
                    if (this.buffer[this.pos + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.pos++;
        }
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

    private char readEscapeCharacter() {
        String str = "Unterminated escape sequence";
        if (this.pos != this.limit || fillBuffer(1)) {
            char[] cArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.lineNumber++;
                this.lineStart = this.pos;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    throw syntaxError("Invalid escape sequence");
                } else if (this.pos + 4 <= this.limit || fillBuffer(4)) {
                    int i2 = 0;
                    int i3 = this.pos;
                    int i4 = i3 + 4;
                    while (i3 < i4) {
                        int i5;
                        char c2 = this.buffer[i3];
                        c = (char) (i2 << 4);
                        if (c2 < '0' || c2 > '9') {
                            if (c2 >= 'a' && c2 <= 'f') {
                                i5 = c2 - 97;
                            } else if (c2 < 'A' || c2 > 'F') {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("\\u");
                                stringBuilder.append(new String(this.buffer, this.pos, 4));
                                throw new NumberFormatException(stringBuilder.toString());
                            } else {
                                i5 = c2 - 65;
                            }
                            i5 += 10;
                        } else {
                            i5 = c2 - 48;
                        }
                        i2 = (char) (c + i5);
                        i3++;
                    }
                    this.pos += 4;
                    return i2;
                } else {
                    throw syntaxError(str);
                }
            }
            return c;
        }
        throw syntaxError(str);
    }

    private IOException syntaxError(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(locationString());
        throw new MalformedJsonException(stringBuilder.toString());
    }

    private void consumeNonExecutePrefix() {
        nextNonWhitespace(true);
        this.pos--;
        int i = this.pos;
        char[] cArr = NON_EXECUTE_PREFIX;
        if (i + cArr.length <= this.limit || fillBuffer(cArr.length)) {
            i = 0;
            while (true) {
                cArr = NON_EXECUTE_PREFIX;
                if (i >= cArr.length) {
                    this.pos += cArr.length;
                    return;
                } else if (this.buffer[this.pos + i] == cArr[i]) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}

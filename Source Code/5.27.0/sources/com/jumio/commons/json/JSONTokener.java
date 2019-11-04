package com.jumio.commons.json;

import java.util.Locale;
import org.json.JSONException;

public class JSONTokener {
    private final StringBuilder in;
    private int pos;

    public static int dehexchar(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        int i = 65;
        if (c < 'A' || c > 'F') {
            i = 97;
            if (c < 'a' || c > 'f') {
                return -1;
            }
        }
        return (c - i) + 10;
    }

    public JSONTokener(StringBuilder stringBuilder) {
        if (stringBuilder != null && stringBuilder.charAt(0) == 65279) {
            stringBuilder = stringBuilder.deleteCharAt(0);
        }
        this.in = stringBuilder;
    }

    public Object nextValue() {
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == -1) {
            throw syntaxError("End of input");
        } else if (nextCleanInternal == 34 || nextCleanInternal == 39) {
            return nextString((char) nextCleanInternal);
        } else {
            if (nextCleanInternal == 91) {
                return readArray();
            }
            if (nextCleanInternal == 123) {
                return readObject();
            }
            this.pos--;
            return readLiteral();
        }
    }

    private int nextCleanInternal() {
        while (this.pos < this.in.length()) {
            StringBuilder stringBuilder = this.in;
            int i = this.pos;
            this.pos = i + 1;
            char charAt = stringBuilder.charAt(i);
            if (!(charAt == 9 || charAt == 10 || charAt == 13 || charAt == ' ')) {
                if (charAt == '#') {
                    skipToEndOfLine();
                } else if (charAt != '/' || this.pos == this.in.length()) {
                    return charAt;
                } else {
                    char charAt2 = this.in.charAt(this.pos);
                    if (charAt2 == '*') {
                        this.pos++;
                        int indexOf = this.in.indexOf("*/", this.pos);
                        if (indexOf != -1) {
                            this.pos = indexOf + 2;
                        } else {
                            throw syntaxError("Unterminated comment");
                        }
                    } else if (charAt2 != '/') {
                        return charAt;
                    } else {
                        this.pos++;
                        skipToEndOfLine();
                    }
                }
            }
        }
        return -1;
    }

    private void skipToEndOfLine() {
        while (this.pos < this.in.length()) {
            char charAt = this.in.charAt(this.pos);
            if (charAt == 13 || charAt == 10) {
                this.pos++;
                return;
            }
            this.pos++;
        }
    }

    public StringBuilder nextString(char c) {
        int i = this.pos;
        StringBuilder stringBuilder = null;
        while (this.pos < this.in.length()) {
            StringBuilder stringBuilder2 = this.in;
            int i2 = this.pos;
            this.pos = i2 + 1;
            char charAt = stringBuilder2.charAt(i2);
            if (charAt == c) {
                if (stringBuilder == null) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(this.in, i, this.pos - 1);
                    return stringBuilder3;
                }
                stringBuilder.append(this.in, i, this.pos - 1);
                return stringBuilder;
            } else if (charAt == '\\') {
                if (this.pos != this.in.length()) {
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder();
                    }
                    stringBuilder.append(this.in, i, this.pos - 1);
                    stringBuilder.append(readEscapeCharacter());
                    i = this.pos;
                } else {
                    throw syntaxError("Unterminated escape sequence");
                }
            }
        }
        throw syntaxError("Unterminated string");
    }

    private char readEscapeCharacter() {
        StringBuilder stringBuilder = this.in;
        int i = this.pos;
        this.pos = i + 1;
        char charAt = stringBuilder.charAt(i);
        if (charAt == 'b') {
            return 8;
        }
        if (charAt == 'f') {
            return 12;
        }
        if (charAt == 'n') {
            return 10;
        }
        if (charAt == 'r') {
            return 13;
        }
        if (charAt == 't') {
            return 9;
        }
        if (charAt != 'u') {
            return charAt;
        }
        if (this.pos + 4 <= this.in.length()) {
            stringBuilder = this.in;
            i = this.pos;
            String substring = stringBuilder.substring(i, i + 4);
            this.pos += 4;
            return (char) Integer.parseInt(substring, 16);
        }
        throw syntaxError("Unterminated escape sequence");
    }

    private boolean equalsIgnoreCase(StringBuilder stringBuilder, String str) {
        if (stringBuilder.length() != str.length()) {
            return false;
        }
        String toUpperCase = str.toUpperCase(Locale.GERMAN);
        String toLowerCase = str.toLowerCase(Locale.GERMAN);
        int i = 0;
        while (i < str.length()) {
            char charAt = stringBuilder.charAt(i);
            if (toUpperCase.charAt(i) != charAt && toLowerCase.charAt(i) != charAt) {
                return false;
            }
            i++;
        }
        return true;
    }

    private int indexOf(StringBuilder stringBuilder, char c) {
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    private boolean isNumber(StringBuilder stringBuilder) {
        for (int i = 0; i < stringBuilder.length(); i++) {
            char charAt = stringBuilder.charAt(i);
            if ((charAt < '0' || charAt > '9') && charAt != '.' && charAt != 'E' && charAt != '-') {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008d */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|(5:18|(1:27)(2:22|(1:26))|28|29|(2:35|36)(2:33|34))|37|38|39) */
    private java.lang.Object readLiteral() {
        /*
        r6 = this;
        r0 = "{}[]/\\:,=;# \t\f";
        r0 = r6.nextToInternal(r0);
        r1 = r0.length();
        if (r1 == 0) goto L_0x009c;
    L_0x000c:
        r1 = "null";
        r1 = r6.equalsIgnoreCase(r0, r1);
        if (r1 == 0) goto L_0x0017;
    L_0x0014:
        r0 = com.jumio.commons.json.JumioJSONObject.NULL;
        return r0;
    L_0x0017:
        r1 = "true";
        r1 = r6.equalsIgnoreCase(r0, r1);
        if (r1 == 0) goto L_0x0022;
    L_0x001f:
        r0 = java.lang.Boolean.TRUE;
        return r0;
    L_0x0022:
        r1 = "false";
        r1 = r6.equalsIgnoreCase(r0, r1);
        if (r1 == 0) goto L_0x002d;
    L_0x002a:
        r0 = java.lang.Boolean.FALSE;
        return r0;
    L_0x002d:
        r1 = r6.isNumber(r0);
        if (r1 == 0) goto L_0x0096;
    L_0x0033:
        r1 = 46;
        r1 = r6.indexOf(r0, r1);
        r2 = -1;
        if (r1 != r2) goto L_0x008d;
    L_0x003c:
        r1 = 10;
        r2 = r0.toString();
        r3 = "0x";
        r3 = r2.startsWith(r3);
        if (r3 != 0) goto L_0x0069;
    L_0x004a:
        r3 = "0X";
        r3 = r2.startsWith(r3);
        if (r3 == 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0069;
    L_0x0053:
        r3 = "0";
        r3 = r2.startsWith(r3);
        if (r3 == 0) goto L_0x0070;
    L_0x005b:
        r3 = r2.length();
        r4 = 1;
        if (r3 <= r4) goto L_0x0070;
    L_0x0062:
        r2 = r2.substring(r4);
        r1 = 8;
        goto L_0x0070;
    L_0x0069:
        r1 = 2;
        r2 = r2.substring(r1);
        r1 = 16;
    L_0x0070:
        r1 = java.lang.Long.parseLong(r2, r1);	 Catch:{ NumberFormatException -> 0x008d }
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 > 0) goto L_0x0088;
    L_0x007b:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 < 0) goto L_0x0088;
    L_0x0082:
        r2 = (int) r1;	 Catch:{ NumberFormatException -> 0x008d }
        r0 = java.lang.Integer.valueOf(r2);	 Catch:{ NumberFormatException -> 0x008d }
        return r0;
    L_0x0088:
        r0 = java.lang.Long.valueOf(r1);	 Catch:{ NumberFormatException -> 0x008d }
        return r0;
    L_0x008d:
        r1 = r0.toString();	 Catch:{ NumberFormatException -> 0x0096 }
        r0 = java.lang.Double.valueOf(r1);	 Catch:{ NumberFormatException -> 0x0096 }
        return r0;
    L_0x0096:
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        return r1;
    L_0x009c:
        r0 = "Expected literal value";
        r0 = r6.syntaxError(r0);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.commons.json.JSONTokener.readLiteral():java.lang.Object");
    }

    private StringBuilder nextToInternal(String str) {
        StringBuilder stringBuilder;
        int i = this.pos;
        while (this.pos < this.in.length()) {
            char charAt = this.in.charAt(this.pos);
            if (charAt == 13 || charAt == 10 || str.indexOf(charAt) != -1) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.in, i, this.pos);
                return stringBuilder;
            }
            this.pos++;
        }
        stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = this.in;
        stringBuilder.append(stringBuilder2, i, stringBuilder2.length());
        return stringBuilder;
    }

    private JumioJSONObject readObject() {
        JumioJSONObject jumioJSONObject = new JumioJSONObject();
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == 125) {
            return jumioJSONObject;
        }
        if (nextCleanInternal != -1) {
            this.pos--;
        }
        while (true) {
            Object nextValue = nextValue();
            StringBuilder stringBuilder;
            if (nextValue instanceof StringBuilder) {
                int nextCleanInternal2 = nextCleanInternal();
                if (nextCleanInternal2 == 58 || nextCleanInternal2 == 61) {
                    if (this.pos < this.in.length() && this.in.charAt(this.pos) == '>') {
                        this.pos++;
                    }
                    jumioJSONObject.put(((StringBuilder) nextValue).toString(), nextValue());
                    nextCleanInternal = nextCleanInternal();
                    if (nextCleanInternal != 44 && nextCleanInternal != 59) {
                        if (nextCleanInternal == 125) {
                            return jumioJSONObject;
                        }
                        throw syntaxError("Unterminated object");
                    }
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Expected ':' after ");
                    stringBuilder.append(nextValue);
                    throw syntaxError(stringBuilder.toString());
                }
            } else if (nextValue == null) {
                throw syntaxError("Names cannot be null");
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Names must be strings, but ");
                stringBuilder.append(nextValue);
                stringBuilder.append(" is of type ");
                stringBuilder.append(nextValue.getClass().getName());
                throw syntaxError(stringBuilder.toString());
            }
        }
    }

    private JumioJSONArray readArray() {
        JumioJSONArray jumioJSONArray = new JumioJSONArray();
        Object obj = null;
        while (true) {
            int nextCleanInternal = nextCleanInternal();
            String str = "Unterminated array";
            if (nextCleanInternal != -1) {
                if (nextCleanInternal == 44 || nextCleanInternal == 59) {
                    jumioJSONArray.put(null);
                } else if (nextCleanInternal != 93) {
                    this.pos--;
                    jumioJSONArray.put(nextValue());
                    int nextCleanInternal2 = nextCleanInternal();
                    if (!(nextCleanInternal2 == 44 || nextCleanInternal2 == 59)) {
                        if (nextCleanInternal2 == 93) {
                            return jumioJSONArray;
                        }
                        throw syntaxError(str);
                    }
                } else {
                    if (obj != null) {
                        jumioJSONArray.put(null);
                    }
                    return jumioJSONArray;
                }
                obj = 1;
            } else {
                throw syntaxError(str);
            }
        }
    }

    public JSONException syntaxError(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this);
        return new JSONException(stringBuilder.toString());
    }

    public boolean more() {
        return this.pos < this.in.length();
    }

    public char next() {
        if (this.pos >= this.in.length()) {
            return 0;
        }
        StringBuilder stringBuilder = this.in;
        int i = this.pos;
        this.pos = i + 1;
        return stringBuilder.charAt(i);
    }

    public char next(char c) {
        char next = next();
        if (next == c) {
            return next;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(c);
        stringBuilder.append(" but was ");
        stringBuilder.append(next);
        throw syntaxError(stringBuilder.toString());
    }

    public char nextClean() {
        int nextCleanInternal = nextCleanInternal();
        return nextCleanInternal == -1 ? 0 : (char) nextCleanInternal;
    }

    public StringBuilder next(int i) {
        StringBuilder stringBuilder;
        if (this.pos + i <= this.in.length()) {
            stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = this.in;
            int i2 = this.pos;
            stringBuilder.append(stringBuilder2, i2, i2 + i);
            this.pos += i;
            return stringBuilder;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        stringBuilder.append(" is out of bounds");
        throw syntaxError(stringBuilder.toString());
    }

    public StringBuilder nextTo(String str) {
        if (str != null) {
            return nextToInternal(str);
        }
        throw new NullPointerException();
    }

    public StringBuilder nextTo(char c) {
        return nextToInternal(String.valueOf(c));
    }

    public void skipPast(String str) {
        int indexOf = this.in.indexOf(str, this.pos);
        this.pos = indexOf == -1 ? this.in.length() : str.length() + indexOf;
    }

    public char skipTo(char c) {
        int indexOf = this.in.indexOf(String.valueOf(c), this.pos);
        if (indexOf == -1) {
            return 0;
        }
        this.pos = indexOf;
        return c;
    }

    public void back() {
        int i = this.pos - 1;
        this.pos = i;
        if (i == -1) {
            this.pos = 0;
        }
    }

    public void clear() {
        if (this.in != null) {
            for (int i = 0; i < this.in.length(); i++) {
                this.in.setCharAt(i, 0);
            }
        }
    }
}

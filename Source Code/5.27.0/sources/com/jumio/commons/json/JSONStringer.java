package com.jumio.commons.json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

public class JSONStringer {
    private final String indent;
    final StringBuilder out;
    private final List<Scope> stack;

    enum Scope {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public JSONStringer() {
        this.out = new StringBuilder();
        this.stack = new ArrayList();
        this.indent = null;
    }

    JSONStringer(int i) {
        this.out = new StringBuilder();
        this.stack = new ArrayList();
        char[] cArr = new char[i];
        Arrays.fill(cArr, ' ');
        this.indent = new String(cArr);
    }

    public JSONStringer array() {
        return open(Scope.EMPTY_ARRAY, "[");
    }

    public JSONStringer endArray() {
        return close(Scope.EMPTY_ARRAY, Scope.NONEMPTY_ARRAY, "]");
    }

    public JSONStringer object() {
        return open(Scope.EMPTY_OBJECT, "{");
    }

    public JSONStringer endObject() {
        return close(Scope.EMPTY_OBJECT, Scope.NONEMPTY_OBJECT, "}");
    }

    /* Access modifiers changed, original: 0000 */
    public JSONStringer open(Scope scope, String str) {
        if (!this.stack.isEmpty() || this.out.length() <= 0) {
            beforeValue();
            this.stack.add(scope);
            this.out.append(str);
            return this;
        }
        throw new JSONException("Nesting problem: multiple top-level roots");
    }

    /* Access modifiers changed, original: 0000 */
    public JSONStringer close(Scope scope, Scope scope2, String str) {
        Scope peek = peek();
        if (peek == scope2 || peek == scope) {
            List list = this.stack;
            list.remove(list.size() - 1);
            if (peek == scope2) {
                newline();
            }
            this.out.append(str);
            return this;
        }
        throw new JSONException("Nesting problem");
    }

    private Scope peek() {
        if (this.stack.isEmpty()) {
            throw new JSONException("Nesting problem");
        }
        List list = this.stack;
        return (Scope) list.get(list.size() - 1);
    }

    private void replaceTop(Scope scope) {
        List list = this.stack;
        list.set(list.size() - 1, scope);
    }

    public JSONStringer value(Object obj) {
        if (this.stack.isEmpty()) {
            throw new JSONException("Nesting problem");
        } else if (obj instanceof JumioJSONArray) {
            ((JumioJSONArray) obj).writeTo(this);
            return this;
        } else if (obj instanceof JumioJSONObject) {
            ((JumioJSONObject) obj).writeTo(this);
            return this;
        } else {
            beforeValue();
            if (obj == null || (obj instanceof Boolean) || obj == JumioJSONObject.NULL) {
                this.out.append(obj);
            } else if (obj instanceof Number) {
                this.out.append(JumioJSONObject.numberToString((Number) obj));
            } else if (obj instanceof char[]) {
                charArray((char[]) obj);
            } else {
                string(obj.toString());
            }
            return this;
        }
    }

    public JSONStringer value(boolean z) {
        if (this.stack.isEmpty()) {
            throw new JSONException("Nesting problem");
        }
        beforeValue();
        this.out.append(z);
        return this;
    }

    public JSONStringer value(double d) {
        if (this.stack.isEmpty()) {
            throw new JSONException("Nesting problem");
        }
        beforeValue();
        this.out.append(JumioJSONObject.numberToString(Double.valueOf(d)));
        return this;
    }

    public JSONStringer value(long j) {
        if (this.stack.isEmpty()) {
            throw new JSONException("Nesting problem");
        }
        beforeValue();
        this.out.append(j);
        return this;
    }

    private void string(String str) {
        String str2 = "\"";
        this.out.append(str2);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            replaceUnicodeChar(str.charAt(i));
        }
        this.out.append(str2);
    }

    private void charArray(char[] cArr) {
        String str = "\"";
        this.out.append(str);
        for (char replaceUnicodeChar : cArr) {
            replaceUnicodeChar(replaceUnicodeChar);
        }
        this.out.append(str);
    }

    private void replaceUnicodeChar(char c) {
        if (c == 12) {
            this.out.append("\\f");
        } else if (c == 13) {
            this.out.append("\\r");
        } else if (c == '\"' || c == '/' || c == '\\') {
            StringBuilder stringBuilder = this.out;
            stringBuilder.append('\\');
            stringBuilder.append(c);
        } else {
            switch (c) {
                case 8:
                    this.out.append("\\b");
                    return;
                case 9:
                    this.out.append("\\t");
                    return;
                case 10:
                    this.out.append("\\n");
                    return;
                default:
                    if (c <= 31) {
                        this.out.append(String.format("\\u%04x", new Object[]{Integer.valueOf(c)}));
                        return;
                    }
                    this.out.append(c);
                    return;
            }
        }
    }

    private void newline() {
        if (this.indent != null) {
            this.out.append("\n");
            for (int i = 0; i < this.stack.size(); i++) {
                this.out.append(this.indent);
            }
        }
    }

    public JSONStringer key(String str) {
        if (str != null) {
            beforeKey();
            string(str);
            return this;
        }
        throw new JSONException("Names must be non-null");
    }

    private void beforeKey() {
        Scope peek = peek();
        if (peek == Scope.NONEMPTY_OBJECT) {
            this.out.append(',');
        } else if (peek != Scope.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        newline();
        replaceTop(Scope.DANGLING_KEY);
    }

    private void beforeValue() {
        if (!this.stack.isEmpty()) {
            Scope peek = peek();
            if (peek == Scope.EMPTY_ARRAY) {
                replaceTop(Scope.NONEMPTY_ARRAY);
                newline();
            } else if (peek == Scope.NONEMPTY_ARRAY) {
                this.out.append(',');
                newline();
            } else if (peek == Scope.DANGLING_KEY) {
                this.out.append(this.indent == null ? ":" : ": ");
                replaceTop(Scope.NONEMPTY_OBJECT);
            } else if (peek != Scope.NULL) {
                throw new JSONException("Nesting problem");
            }
        }
    }

    public String toString() {
        return this.out.length() == 0 ? super.toString() : this.out.toString();
    }

    public void clear() {
        StringBuilder stringBuilder = this.out;
        if (stringBuilder != null && stringBuilder.length() != 0) {
            for (int i = 0; i < this.out.length(); i++) {
                this.out.setCharAt(i, 0);
            }
            StringBuilder stringBuilder2 = this.out;
            stringBuilder2.delete(0, stringBuilder2.length());
        }
    }
}

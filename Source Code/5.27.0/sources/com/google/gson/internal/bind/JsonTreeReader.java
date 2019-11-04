package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

public final class JsonTreeReader extends JsonReader {
    private static final Object SENTINEL_CLOSED = new Object();
    private static final Reader UNREADABLE_READER = new Reader() {
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        public void close() {
            throw new AssertionError();
        }
    };
    private int[] pathIndices = new int[32];
    private String[] pathNames = new String[32];
    private Object[] stack = new Object[32];
    private int stackSize = 0;

    public JsonTreeReader(JsonElement jsonElement) {
        super(UNREADABLE_READER);
        push(jsonElement);
    }

    public void beginArray() {
        expect(JsonToken.BEGIN_ARRAY);
        push(((JsonArray) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    public void endArray() {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            i--;
            iArr[i] = iArr[i] + 1;
        }
    }

    public void beginObject() {
        expect(JsonToken.BEGIN_OBJECT);
        push(((JsonObject) peekStack()).entrySet().iterator());
    }

    public void endObject() {
        expect(JsonToken.END_OBJECT);
        popStack();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            i--;
            iArr[i] = iArr[i] + 1;
        }
    }

    public boolean hasNext() {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    public JsonToken peek() {
        if (this.stackSize == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object peekStack = peekStack();
        if (peekStack instanceof Iterator) {
            boolean z = this.stack[this.stackSize - 2] instanceof JsonObject;
            Iterator it = (Iterator) peekStack;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            } else if (z) {
                return JsonToken.NAME;
            } else {
                push(it.next());
                return peek();
            }
        } else if (peekStack instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (peekStack instanceof JsonArray) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (peekStack instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) peekStack;
                if (jsonPrimitive.isString()) {
                    return JsonToken.STRING;
                }
                if (jsonPrimitive.isBoolean()) {
                    return JsonToken.BOOLEAN;
                }
                if (jsonPrimitive.isNumber()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (peekStack instanceof JsonNull) {
                return JsonToken.NULL;
            } else {
                if (peekStack == SENTINEL_CLOSED) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    private Object popStack() {
        Object[] objArr = this.stack;
        int i = this.stackSize - 1;
        this.stackSize = i;
        Object obj = objArr[i];
        objArr[this.stackSize] = null;
        return obj;
    }

    private void expect(JsonToken jsonToken) {
        if (peek() != jsonToken) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append(jsonToken);
            stringBuilder.append(" but was ");
            stringBuilder.append(peek());
            stringBuilder.append(locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public String nextName() {
        expect(JsonToken.NAME);
        Entry entry = (Entry) ((Iterator) peekStack()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.stackSize - 1] = str;
        push(entry.getValue());
        return str;
    }

    public String nextString() {
        JsonToken peek = peek();
        if (peek == JsonToken.STRING || peek == JsonToken.NUMBER) {
            String asString = ((JsonPrimitive) popStack()).getAsString();
            int i = this.stackSize;
            if (i > 0) {
                int[] iArr = this.pathIndices;
                i--;
                iArr[i] = iArr[i] + 1;
            }
            return asString;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(JsonToken.STRING);
        stringBuilder.append(" but was ");
        stringBuilder.append(peek);
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean nextBoolean() {
        expect(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) popStack()).getAsBoolean();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            i--;
            iArr[i] = iArr[i] + 1;
        }
        return asBoolean;
    }

    public void nextNull() {
        expect(JsonToken.NULL);
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            i--;
            iArr[i] = iArr[i] + 1;
        }
    }

    public double nextDouble() {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            double asDouble = ((JsonPrimitive) peekStack()).getAsDouble();
            if (isLenient() || !(Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
                popStack();
                int i = this.stackSize;
                if (i > 0) {
                    int[] iArr = this.pathIndices;
                    i--;
                    iArr[i] = iArr[i] + 1;
                }
                return asDouble;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(asDouble);
            throw new NumberFormatException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Expected ");
        stringBuilder2.append(JsonToken.NUMBER);
        stringBuilder2.append(" but was ");
        stringBuilder2.append(peek);
        stringBuilder2.append(locationString());
        throw new IllegalStateException(stringBuilder2.toString());
    }

    public long nextLong() {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            long asLong = ((JsonPrimitive) peekStack()).getAsLong();
            popStack();
            int i = this.stackSize;
            if (i > 0) {
                int[] iArr = this.pathIndices;
                i--;
                iArr[i] = iArr[i] + 1;
            }
            return asLong;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(JsonToken.NUMBER);
        stringBuilder.append(" but was ");
        stringBuilder.append(peek);
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int nextInt() {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            int asInt = ((JsonPrimitive) peekStack()).getAsInt();
            popStack();
            int i = this.stackSize;
            if (i > 0) {
                int[] iArr = this.pathIndices;
                i--;
                iArr[i] = iArr[i] + 1;
            }
            return asInt;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(JsonToken.NUMBER);
        stringBuilder.append(" but was ");
        stringBuilder.append(peek);
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void close() {
        this.stack = new Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    public void skipValue() {
        int i;
        String str = "null";
        if (peek() == JsonToken.NAME) {
            nextName();
            this.pathNames[this.stackSize - 2] = str;
        } else {
            popStack();
            i = this.stackSize;
            if (i > 0) {
                this.pathNames[i - 1] = str;
            }
        }
        i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            i--;
            iArr[i] = iArr[i] + 1;
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public void promoteNameToValue() {
        expect(JsonToken.NAME);
        Entry entry = (Entry) ((Iterator) peekStack()).next();
        push(entry.getValue());
        push(new JsonPrimitive((String) entry.getKey()));
    }

    private void push(Object obj) {
        int i = this.stackSize;
        Object[] objArr = this.stack;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.pathIndices, 0, iArr, 0, this.stackSize);
            System.arraycopy(this.pathNames, 0, strArr, 0, this.stackSize);
            this.stack = objArr2;
            this.pathIndices = iArr;
            this.pathNames = strArr;
        }
        Object[] objArr3 = this.stack;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        objArr3[i2] = obj;
    }

    public String getPath() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        int i = 0;
        while (i < this.stackSize) {
            Object[] objArr = this.stack;
            if (objArr[i] instanceof JsonArray) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    stringBuilder.append('[');
                    stringBuilder.append(this.pathIndices[i]);
                    stringBuilder.append(']');
                }
            } else if (objArr[i] instanceof JsonObject) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    stringBuilder.append('.');
                    String[] strArr = this.pathNames;
                    if (strArr[i] != null) {
                        stringBuilder.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return stringBuilder.toString();
    }

    private String locationString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at path ");
        stringBuilder.append(getPath());
        return stringBuilder.toString();
    }
}
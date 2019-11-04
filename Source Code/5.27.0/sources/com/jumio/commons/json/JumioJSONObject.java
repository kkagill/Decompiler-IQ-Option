package com.jumio.commons.json;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class JumioJSONObject extends JSONObject {
    private JSONStringer stringer = null;

    public JumioJSONObject(String str) {
        super(str);
    }

    public StringBuilder getStringBuilder(String str) {
        Object obj = get(str);
        StringBuilder toStringBuilder = JSON.toStringBuilder(obj);
        if (toStringBuilder != null) {
            return toStringBuilder;
        }
        throw JSON.typeMismatch(str, obj, "StringBuilder");
    }

    public StringBuilder optStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        return optStringBuilder(str, stringBuilder);
    }

    public StringBuilder optStringBuilder(String str, StringBuilder stringBuilder) {
        StringBuilder toStringBuilder = JSON.toStringBuilder(opt(str));
        return toStringBuilder != null ? toStringBuilder : stringBuilder;
    }

    public void clear() {
        JSONStringer jSONStringer = this.stringer;
        if (jSONStringer != null) {
            jSONStringer.clear();
        }
        Iterator keys = keys();
        while (keys.hasNext()) {
            try {
                Object opt = opt((String) keys.next());
                if (opt != null) {
                    if (opt instanceof StringBuilder) {
                        overwriteStringBuilder((StringBuilder) opt);
                    } else if (opt instanceof JumioJSONArray) {
                        ((JumioJSONArray) opt).clear();
                    } else if (opt instanceof JumioJSONObject) {
                        ((JumioJSONObject) opt).clear();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private void overwriteStringBuilder(StringBuilder stringBuilder) {
        if (stringBuilder != null) {
            for (int i = 0; i < stringBuilder.length(); i++) {
                stringBuilder.setCharAt(i, 0);
            }
        }
    }

    public String toString() {
        try {
            if (this.stringer != null) {
                this.stringer.clear();
            }
            this.stringer = new JSONStringer();
            writeTo(this.stringer);
            return this.stringer.toString();
        } catch (JSONException unused) {
            return super.toString();
        }
    }

    public String toString(int i) {
        JSONStringer jSONStringer = this.stringer;
        if (jSONStringer != null) {
            jSONStringer.clear();
        }
        this.stringer = new JSONStringer(i);
        writeTo(this.stringer);
        return this.stringer.toString();
    }

    public void writeTo(JSONStringer jSONStringer) {
        jSONStringer.object();
        Iterator keys = keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            jSONStringer.key(str).value(opt(str));
        }
        jSONStringer.endObject();
    }
}

package com.neovisionaries.ws.client;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: WebSocketExtension */
public class ah {
    private final Map<String, String> eBp;
    private final String mName;

    /* Access modifiers changed, original: 0000 */
    public void validate() {
    }

    public ah(String str) {
        if (ae.isValid(str)) {
            this.mName = str;
            this.eBp = new LinkedHashMap();
            return;
        }
        throw new IllegalArgumentException("'name' is not a valid token.");
    }

    public String getName() {
        return this.mName;
    }

    public Map<String, String> getParameters() {
        return this.eBp;
    }

    public ah aP(String str, String str2) {
        if (!ae.isValid(str)) {
            throw new IllegalArgumentException("'key' is not a valid token.");
        } else if (str2 == null || ae.isValid(str2)) {
            this.eBp.put(str, str2);
            return this;
        } else {
            throw new IllegalArgumentException("'value' is not a valid token.");
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.mName);
        for (Entry entry : this.eBp.entrySet()) {
            stringBuilder.append("; ");
            stringBuilder.append((String) entry.getKey());
            String str = (String) entry.getValue();
            if (!(str == null || str.length() == 0)) {
                stringBuilder.append("=");
                stringBuilder.append(str);
            }
        }
        return stringBuilder.toString();
    }

    public static ah kG(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.trim().split("\\s*;\\s*");
        if (split.length == 0) {
            return null;
        }
        String str2 = split[0];
        if (!ae.isValid(str2)) {
            return null;
        }
        ah kH = kH(str2);
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].split("\\s*=\\s*", 2);
            if (!(split2.length == 0 || split2[0].length() == 0)) {
                String str3 = split2[0];
                if (ae.isValid(str3)) {
                    String f = f(split2);
                    if (f == null || ae.isValid(f)) {
                        kH.aP(str3, f);
                    }
                }
            }
        }
        return kH;
    }

    private static String f(String[] strArr) {
        if (strArr.length != 2) {
            return null;
        }
        return ae.kC(strArr[1]);
    }

    private static ah kH(String str) {
        if ("permessage-deflate".equals(str)) {
            return new t(str);
        }
        return new ah(str);
    }
}

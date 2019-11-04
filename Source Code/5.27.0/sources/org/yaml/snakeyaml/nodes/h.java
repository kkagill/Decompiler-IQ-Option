package org.yaml.snakeyaml.nodes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.yaml.snakeyaml.d.c;
import org.yaml.snakeyaml.error.YAMLException;

/* compiled from: Tag */
public final class h {
    public static final h fLA = new h("tag:yaml.org,2002:null");
    public static final h fLB = new h("tag:yaml.org,2002:str");
    public static final h fLC = new h("tag:yaml.org,2002:seq");
    public static final h fLD = new h("tag:yaml.org,2002:map");
    public static final Map<h, Set<Class<?>>> fLE = new HashMap();
    public static final h fLq = new h("tag:yaml.org,2002:yaml");
    public static final h fLr = new h("tag:yaml.org,2002:merge");
    public static final h fLs = new h("tag:yaml.org,2002:set");
    public static final h fLt = new h("tag:yaml.org,2002:pairs");
    public static final h fLu = new h("tag:yaml.org,2002:omap");
    public static final h fLv = new h("tag:yaml.org,2002:binary");
    public static final h fLw = new h("tag:yaml.org,2002:int");
    public static final h fLx = new h("tag:yaml.org,2002:float");
    public static final h fLy = new h("tag:yaml.org,2002:timestamp");
    public static final h fLz = new h("tag:yaml.org,2002:bool");
    private boolean fLF = false;
    private final String value;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(Double.class);
        hashSet.add(Float.class);
        hashSet.add(BigDecimal.class);
        fLE.put(fLx, hashSet);
        hashSet = new HashSet();
        hashSet.add(Integer.class);
        hashSet.add(Long.class);
        hashSet.add(BigInteger.class);
        fLE.put(fLw, hashSet);
        hashSet = new HashSet();
        hashSet.add(Date.class);
        try {
            hashSet.add(Class.forName("java.sql.Date"));
            hashSet.add(Class.forName("java.sql.Timestamp"));
        } catch (ClassNotFoundException unused) {
        }
        fLE.put(fLy, hashSet);
    }

    public h(String str) {
        if (str == null) {
            throw new NullPointerException("Tag must be provided.");
        } else if (str.length() == 0) {
            throw new IllegalArgumentException("Tag must not be empty.");
        } else if (str.trim().length() == str.length()) {
            this.value = c.encode(str);
            this.fLF = str.startsWith("tag:yaml.org,2002:") ^ 1;
        } else {
            throw new IllegalArgumentException("Tag must not contain leading or trailing spaces.");
        }
    }

    public h(Class<? extends Object> cls) {
        if (cls != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("tag:yaml.org,2002:");
            stringBuilder.append(c.encode(cls.getName()));
            this.value = stringBuilder.toString();
            return;
        }
        throw new NullPointerException("Class for tag must be provided.");
    }

    public boolean bUQ() {
        return this.fLF;
    }

    public String getValue() {
        return this.value;
    }

    public boolean startsWith(String str) {
        return this.value.startsWith(str);
    }

    public String getClassName() {
        if (this.value.startsWith("tag:yaml.org,2002:")) {
            return c.decode(this.value.substring(18));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: ");
        stringBuilder.append(this.value);
        throw new YAMLException(stringBuilder.toString());
    }

    public String toString() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return obj instanceof h ? this.value.equals(((h) obj).getValue()) : false;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public boolean aj(Class<?> cls) {
        Set set = (Set) fLE.get(this);
        return set != null ? set.contains(cls) : false;
    }
}

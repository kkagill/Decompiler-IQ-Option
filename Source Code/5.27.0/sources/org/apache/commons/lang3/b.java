package org.apache.commons.lang3;

import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.position.Position;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ClassUtils */
public class b {
    public static final String fCl = String.valueOf('.');
    public static final String fCm = String.valueOf('$');
    private static final Map<Class<?>, Class<?>> fCn = new HashMap();
    private static final Map<Class<?>, Class<?>> fCo = new HashMap();
    private static final Map<String, String> fCp = new HashMap();
    private static final Map<String, String> fCq = new HashMap();

    static {
        fCn.put(Boolean.TYPE, Boolean.class);
        fCn.put(Byte.TYPE, Byte.class);
        fCn.put(Character.TYPE, Character.class);
        fCn.put(Short.TYPE, Short.class);
        fCn.put(Integer.TYPE, Integer.class);
        fCn.put(Long.TYPE, Long.class);
        fCn.put(Double.TYPE, Double.class);
        fCn.put(Float.TYPE, Float.class);
        fCn.put(Void.TYPE, Void.TYPE);
        for (Class cls : fCn.keySet()) {
            Class cls2 = (Class) fCn.get(cls);
            if (!cls.equals(cls2)) {
                fCo.put(cls2, cls);
            }
        }
        bm("int", ActiveQuote.PHASE_INTRADAY_AUCTION);
        bm("boolean", "Z");
        bm("float", "F");
        bm(Position.TYPE_LONG, "J");
        bm(Position.TYPE_SHORT, "S");
        bm("byte", "B");
        bm("double", "D");
        bm("char", ActiveQuote.PHASE_CLOSED);
    }

    private static void bm(String str, String str2) {
        fCp.put(str, str2);
        fCq.put(str2, str);
    }

    public static String Z(Class<?> cls) {
        return cls == null ? "" : na(cls.getName());
    }

    public static String na(String str) {
        String str2 = "";
        if (str == null || str.length() == 0) {
            return str2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                stringBuilder.append("[]");
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
        }
        if (fCq.containsKey(str)) {
            str = (String) fCq.get(str);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            i = lastIndexOf + 1;
        }
        i = str.indexOf(36, i);
        str = str.substring(lastIndexOf + 1);
        if (i != -1) {
            str = str.replace('$', '.');
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(stringBuilder);
        return stringBuilder2.toString();
    }
}

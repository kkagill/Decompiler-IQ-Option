package org.jmrtd.cbeff;

import java.io.Serializable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import net.sf.scuba.util.Hex;

public class StandardBiometricHeader implements Serializable {
    private static final long serialVersionUID = 4113147521594478513L;
    private SortedMap<Integer, byte[]> elements;

    public StandardBiometricHeader(Map<Integer, byte[]> map) {
        this.elements = new TreeMap(map);
    }

    public SortedMap<Integer, byte[]> bRd() {
        return new TreeMap(this.elements);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StandardBiometricHeader ");
        stringBuilder.append(a(this.elements));
        return stringBuilder.toString();
    }

    public int hashCode() {
        SortedMap sortedMap = this.elements;
        return 31 + (sortedMap == null ? 0 : sortedMap.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return c(this.elements, ((StandardBiometricHeader) obj).elements);
    }

    private static boolean c(Map<Integer, byte[]> map, Map<Integer, byte[]> map2) {
        boolean z = false;
        if (map == null && map2 != null) {
            return false;
        }
        if (map != null && map2 == null) {
            return false;
        }
        if (map == map2 || map.entrySet().equals(map2.entrySet())) {
            z = true;
        }
        return z;
    }

    private static String a(SortedMap<Integer, byte[]> sortedMap) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Object obj = 1;
        for (Entry entry : sortedMap.entrySet()) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(Integer.toHexString(((Integer) entry.getKey()).intValue()));
            stringBuilder.append(" -> ");
            stringBuilder.append(Hex.bytesToHexString((byte[]) entry.getValue()));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

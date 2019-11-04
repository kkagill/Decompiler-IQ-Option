package org.threeten.bp;

import java.io.DataOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.threeten.bp.a.d;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.zone.ZoneRules;
import org.threeten.bp.zone.ZoneRulesException;

public abstract class ZoneId implements Serializable {
    public static final g<ZoneId> FROM = new g<ZoneId>() {
        /* renamed from: w */
        public ZoneId b(b bVar) {
            return ZoneId.v(bVar);
        }
    };
    public static final Map<String, String> SHORT_IDS;
    private static final long serialVersionUID = 8352817235686L;

    public abstract void a(DataOutput dataOutput);

    public abstract ZoneRules bSZ();

    public abstract String getId();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        SHORT_IDS = Collections.unmodifiableMap(hashMap);
    }

    public static ZoneId bSY() {
        return d(TimeZone.getDefault().getID(), SHORT_IDS);
    }

    public static ZoneId d(String str, Map<String, String> map) {
        d.requireNonNull(str, "zoneId");
        d.requireNonNull(map, "aliasMap");
        String str2 = (String) map.get(str);
        if (str2 != null) {
            str = str2;
        }
        return nH(str);
    }

    public static ZoneId nH(String str) {
        d.requireNonNull(str, "zoneId");
        if (str.equals("Z")) {
            return ZoneOffset.fGt;
        }
        if (str.length() == 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid zone: ");
            stringBuilder.append(str);
            throw new DateTimeException(stringBuilder.toString());
        } else if (str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.nI(str);
        } else {
            if (!(str.equals("UTC") || str.equals("GMT"))) {
                String str2 = "UT";
                if (!str.equals(str2)) {
                    if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                        ZoneOffset nI = ZoneOffset.nI(str.substring(3));
                        if (nI.getTotalSeconds() == 0) {
                            return new ZoneRegion(str.substring(0, 3), nI.bSZ());
                        }
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(str.substring(0, 3));
                        stringBuilder2.append(nI.getId());
                        return new ZoneRegion(stringBuilder2.toString(), nI.bSZ());
                    } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                        return ZoneRegion.F(str, true);
                    } else {
                        ZoneOffset nI2 = ZoneOffset.nI(str.substring(2));
                        if (nI2.getTotalSeconds() == 0) {
                            return new ZoneRegion(str2, nI2.bSZ());
                        }
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(str2);
                        stringBuilder3.append(nI2.getId());
                        return new ZoneRegion(stringBuilder3.toString(), nI2.bSZ());
                    }
                }
            }
            return new ZoneRegion(str, ZoneOffset.fGt.bSZ());
        }
    }

    public static ZoneId v(b bVar) {
        ZoneId zoneId = (ZoneId) bVar.query(f.bTS());
        if (zoneId != null) {
            return zoneId;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to obtain ZoneId from TemporalAccessor: ");
        stringBuilder.append(bVar);
        stringBuilder.append(", type ");
        stringBuilder.append(bVar.getClass().getName());
        throw new DateTimeException(stringBuilder.toString());
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != ZoneRegion.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public ZoneId bTa() {
        try {
            ZoneRules bSZ = bSZ();
            if (bSZ.isFixedOffset()) {
                return bSZ.d(Instant.fFV);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneId)) {
            return false;
        }
        return getId().equals(((ZoneId) obj).getId());
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString() {
        return getId();
    }
}

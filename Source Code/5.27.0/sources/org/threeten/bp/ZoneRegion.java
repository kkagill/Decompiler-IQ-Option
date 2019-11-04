package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.threeten.bp.a.d;
import org.threeten.bp.zone.ZoneRules;
import org.threeten.bp.zone.ZoneRulesException;
import org.threeten.bp.zone.c;

final class ZoneRegion extends ZoneId implements Serializable {
    private static final Pattern fFU = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private static final long serialVersionUID = 8386373296231747096L;
    private final transient ZoneRules fGw;
    private final String id;

    private static ZoneRegion nJ(String str) {
        if (str.equals("Z") || str.startsWith("+") || str.startsWith("-")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid ID for region-based ZoneId, invalid format: ");
            stringBuilder.append(str);
            throw new DateTimeException(stringBuilder.toString());
        }
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
                    return F(str, false);
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

    static ZoneRegion F(String str, boolean z) {
        d.requireNonNull(str, "zoneId");
        if (str.length() < 2 || !fFU.matcher(str).matches()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid ID for region-based ZoneId, invalid format: ");
            stringBuilder.append(str);
            throw new DateTimeException(stringBuilder.toString());
        }
        ZoneRules zoneRules = null;
        try {
            zoneRules = c.H(str, true);
        } catch (ZoneRulesException e) {
            if (str.equals("GMT0")) {
                zoneRules = ZoneOffset.fGt.bSZ();
            } else if (z) {
                throw e;
            }
        }
        return new ZoneRegion(str, zoneRules);
    }

    ZoneRegion(String str, ZoneRules zoneRules) {
        this.id = str;
        this.fGw = zoneRules;
    }

    public String getId() {
        return this.id;
    }

    public ZoneRules bSZ() {
        ZoneRules zoneRules = this.fGw;
        return zoneRules != null ? zoneRules : c.H(this.id, false);
    }

    private Object writeReplace() {
        return new Ser((byte) 7, this);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* Access modifiers changed, original: 0000 */
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        writeExternal(dataOutput);
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeUTF(this.id);
    }

    static ZoneId m(DataInput dataInput) {
        return nJ(dataInput.readUTF());
    }
}

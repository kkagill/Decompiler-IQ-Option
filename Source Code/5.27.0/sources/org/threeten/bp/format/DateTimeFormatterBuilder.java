package org.threeten.bp.format;

import com.iqoption.dto.ChartTimeInterval;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.IsoFields;
import org.threeten.bp.temporal.ValueRange;

public final class DateTimeFormatterBuilder {
    private static final org.threeten.bp.temporal.g<ZoneId> fHZ = new org.threeten.bp.temporal.g<ZoneId>() {
        /* renamed from: w */
        public ZoneId b(org.threeten.bp.temporal.b bVar) {
            ZoneId zoneId = (ZoneId) bVar.query(org.threeten.bp.temporal.f.bTP());
            return (zoneId == null || (zoneId instanceof ZoneOffset)) ? null : zoneId;
        }
    };
    private static final Map<Character, org.threeten.bp.temporal.e> fIh = new HashMap();
    static final Comparator<String> fIi = new Comparator<String>() {
        public int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    };
    private DateTimeFormatterBuilder fIa;
    private final DateTimeFormatterBuilder fIb;
    private final List<c> fIc;
    private final boolean fId;
    private int fIe;
    private char fIf;
    private int fIg;

    /* renamed from: org.threeten.bp.format.DateTimeFormatterBuilder$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] fIl = new int[SignStyle.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = org.threeten.bp.format.SignStyle.values();
            r0 = r0.length;
            r0 = new int[r0];
            fIl = r0;
            r0 = fIl;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.threeten.bp.format.SignStyle.EXCEEDS_PAD;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fIl;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = org.threeten.bp.format.SignStyle.ALWAYS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = fIl;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = org.threeten.bp.format.SignStyle.NORMAL;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = fIl;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = org.threeten.bp.format.SignStyle.NOT_NEGATIVE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.DateTimeFormatterBuilder$AnonymousClass4.<clinit>():void");
        }
    }

    interface c {
        boolean print(d dVar, StringBuilder stringBuilder);
    }

    enum SettingsParser implements c {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        public boolean print(d dVar, StringBuilder stringBuilder) {
            return true;
        }

        public int parse(c cVar, CharSequence charSequence, int i) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                cVar.hq(true);
            } else if (ordinal == 1) {
                cVar.hq(false);
            } else if (ordinal == 2) {
                cVar.setStrict(true);
            } else if (ordinal == 3) {
                cVar.setStrict(false);
            }
            return i;
        }

        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    static final class a implements c {
        private final char fIm;

        a(char c) {
            this.fIm = c;
        }

        public boolean print(d dVar, StringBuilder stringBuilder) {
            stringBuilder.append(this.fIm);
            return true;
        }

        public String toString() {
            if (this.fIm == '\'') {
                return "''";
            }
            StringBuilder stringBuilder = new StringBuilder();
            String str = "'";
            stringBuilder.append(str);
            stringBuilder.append(this.fIm);
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
    }

    static final class b implements c {
        private final boolean fId;
        private final c[] fIn;

        b(List<c> list, boolean z) {
            this((c[]) list.toArray(new c[list.size()]), z);
        }

        b(c[] cVarArr, boolean z) {
            this.fIn = cVarArr;
            this.fId = z;
        }

        public b hp(boolean z) {
            if (z == this.fId) {
                return this;
            }
            return new b(this.fIn, z);
        }

        public boolean print(d dVar, StringBuilder stringBuilder) {
            int length = stringBuilder.length();
            if (this.fId) {
                dVar.bTJ();
            }
            try {
                c[] cVarArr = this.fIn;
                int length2 = cVarArr.length;
                int i = 0;
                while (i < length2) {
                    if (cVarArr[i].print(dVar, stringBuilder)) {
                        i++;
                    } else {
                        stringBuilder.setLength(length);
                        return true;
                    }
                }
                if (this.fId) {
                    dVar.bTK();
                }
                return true;
            } finally {
                if (this.fId) {
                    dVar.bTK();
                }
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.fIn != null) {
                stringBuilder.append(this.fId ? "[" : "(");
                for (Object append : this.fIn) {
                    stringBuilder.append(append);
                }
                stringBuilder.append(this.fId ? "]" : ")");
            }
            return stringBuilder.toString();
        }
    }

    static final class d implements c {
        private final org.threeten.bp.temporal.e fIo;
        private final boolean fIp;
        private final int maxWidth;
        private final int minWidth;

        d(org.threeten.bp.temporal.e eVar, int i, int i2, boolean z) {
            org.threeten.bp.a.d.requireNonNull(eVar, "field");
            StringBuilder stringBuilder;
            if (!eVar.range().isFixed()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Field must have a fixed set of values: ");
                stringBuilder.append(eVar);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (i < 0 || i > 9) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Minimum width must be from 0 to 9 inclusive but was ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (i2 < 1 || i2 > 9) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Maximum width must be from 1 to 9 inclusive but was ");
                stringBuilder2.append(i2);
                throw new IllegalArgumentException(stringBuilder2.toString());
            } else if (i2 >= i) {
                this.fIo = eVar;
                this.minWidth = i;
                this.maxWidth = i2;
                this.fIp = z;
            } else {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Maximum width must exceed or equal the minimum width but ");
                stringBuilder3.append(i2);
                stringBuilder3.append(" < ");
                stringBuilder3.append(i);
                throw new IllegalArgumentException(stringBuilder3.toString());
            }
        }

        public boolean print(d dVar, StringBuilder stringBuilder) {
            Long c = dVar.c(this.fIo);
            int i = 0;
            if (c == null) {
                return false;
            }
            f bTI = dVar.bTI();
            BigDecimal ep = ep(c.longValue());
            if (ep.scale() != 0) {
                String nN = bTI.nN(ep.setScale(Math.min(Math.max(ep.scale(), this.minWidth), this.maxWidth), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.fIp) {
                    stringBuilder.append(bTI.getDecimalSeparator());
                }
                stringBuilder.append(nN);
            } else if (this.minWidth > 0) {
                if (this.fIp) {
                    stringBuilder.append(bTI.getDecimalSeparator());
                }
                while (i < this.minWidth) {
                    stringBuilder.append(bTI.getZeroDigit());
                    i++;
                }
            }
            return true;
        }

        private BigDecimal ep(long j) {
            ValueRange range = this.fIo.range();
            range.a(j, this.fIo);
            BigDecimal valueOf = BigDecimal.valueOf(range.getMinimum());
            BigDecimal divide = BigDecimal.valueOf(j).subtract(valueOf).divide(BigDecimal.valueOf(range.getMaximum()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            return divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        }

        public String toString() {
            String str = this.fIp ? ",DecimalPoint" : "";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fraction(");
            stringBuilder.append(this.fIo);
            String str2 = ",";
            stringBuilder.append(str2);
            stringBuilder.append(this.minWidth);
            stringBuilder.append(str2);
            stringBuilder.append(this.maxWidth);
            stringBuilder.append(str);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static final class e implements c {
        private final int fIq;

        public String toString() {
            return "Instant()";
        }

        e(int i) {
            this.fIq = i;
        }

        public boolean print(d dVar, StringBuilder stringBuilder) {
            StringBuilder stringBuilder2 = stringBuilder;
            Long c = dVar.c(ChronoField.INSTANT_SECONDS);
            Long valueOf = Long.valueOf(0);
            if (dVar.bTH().isSupported(ChronoField.NANO_OF_SECOND)) {
                valueOf = Long.valueOf(dVar.bTH().getLong(ChronoField.NANO_OF_SECOND));
            }
            int i = 0;
            if (c == null) {
                return false;
            }
            long longValue = c.longValue();
            int checkValidIntValue = ChronoField.NANO_OF_SECOND.checkValidIntValue(valueOf.longValue());
            String str = ":00";
            long floorDiv;
            LocalDateTime a;
            if (longValue >= -62167219200L) {
                longValue = (longValue - 315569520000L) + 62167219200L;
                floorDiv = org.threeten.bp.a.d.floorDiv(longValue, 315569520000L) + 1;
                a = LocalDateTime.a(org.threeten.bp.a.d.floorMod(longValue, 315569520000L) - 62167219200L, 0, ZoneOffset.fGt);
                if (floorDiv > 0) {
                    stringBuilder2.append('+');
                    stringBuilder2.append(floorDiv);
                }
                stringBuilder2.append(a);
                if (a.getSecond() == 0) {
                    stringBuilder2.append(str);
                }
            } else {
                longValue += 62167219200L;
                floorDiv = longValue / 315569520000L;
                longValue %= 315569520000L;
                a = LocalDateTime.a(longValue - 62167219200L, 0, ZoneOffset.fGt);
                int length = stringBuilder.length();
                stringBuilder2.append(a);
                if (a.getSecond() == 0) {
                    stringBuilder2.append(str);
                }
                if (floorDiv < 0) {
                    if (a.getYear() == -10000) {
                        stringBuilder2.replace(length, length + 2, Long.toString(floorDiv - 1));
                    } else if (longValue == 0) {
                        stringBuilder2.insert(length, floorDiv);
                    } else {
                        stringBuilder2.insert(length + 1, Math.abs(floorDiv));
                    }
                }
            }
            int i2 = this.fIq;
            if (i2 == -2) {
                if (checkValidIntValue != 0) {
                    stringBuilder2.append('.');
                    if (checkValidIntValue % 1000000 == 0) {
                        stringBuilder2.append(Integer.toString((checkValidIntValue / 1000000) + 1000).substring(1));
                    } else if (checkValidIntValue % 1000 == 0) {
                        stringBuilder2.append(Integer.toString((checkValidIntValue / 1000) + 1000000).substring(1));
                    } else {
                        stringBuilder2.append(Integer.toString(checkValidIntValue + 1000000000).substring(1));
                    }
                }
            } else if (i2 > 0 || (i2 == -1 && checkValidIntValue > 0)) {
                stringBuilder2.append('.');
                i2 = 100000000;
                while (true) {
                    if ((this.fIq != -1 || checkValidIntValue <= 0) && i >= this.fIq) {
                        break;
                    }
                    int i3 = checkValidIntValue / i2;
                    stringBuilder2.append((char) (i3 + 48));
                    checkValidIntValue -= i3 * i2;
                    i2 /= 10;
                    i++;
                }
            }
            stringBuilder2.append('Z');
            return true;
        }
    }

    static class f implements c {
        static final int[] fIr = new int[]{0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        final org.threeten.bp.temporal.e fIo;
        final SignStyle fIs;
        final int fIt;
        final int maxWidth;
        final int minWidth;

        /* Access modifiers changed, original: 0000 */
        public long a(d dVar, long j) {
            return j;
        }

        f(org.threeten.bp.temporal.e eVar, int i, int i2, SignStyle signStyle) {
            this.fIo = eVar;
            this.minWidth = i;
            this.maxWidth = i2;
            this.fIs = signStyle;
            this.fIt = 0;
        }

        private f(org.threeten.bp.temporal.e eVar, int i, int i2, SignStyle signStyle, int i3) {
            this.fIo = eVar;
            this.minWidth = i;
            this.maxWidth = i2;
            this.fIs = signStyle;
            this.fIt = i3;
        }

        /* Access modifiers changed, original: 0000 */
        public f bTE() {
            if (this.fIt == -1) {
                return this;
            }
            return new f(this.fIo, this.minWidth, this.maxWidth, this.fIs, -1);
        }

        /* Access modifiers changed, original: 0000 */
        public f nL(int i) {
            return new f(this.fIo, this.minWidth, this.maxWidth, this.fIs, this.fIt + i);
        }

        public boolean print(d dVar, StringBuilder stringBuilder) {
            Long c = dVar.c(this.fIo);
            int i = 0;
            if (c == null) {
                return false;
            }
            String str;
            long a = a(dVar, c.longValue());
            f bTI = dVar.bTI();
            if (a == Long.MIN_VALUE) {
                str = "9223372036854775808";
            } else {
                str = Long.toString(Math.abs(a));
            }
            String str2 = " cannot be printed as the value ";
            String str3 = "Field ";
            if (str.length() <= this.maxWidth) {
                str = bTI.nN(str);
                int i2;
                if (a >= 0) {
                    i2 = AnonymousClass4.fIl[this.fIs.ordinal()];
                    if (i2 == 1) {
                        i2 = this.minWidth;
                        if (i2 < 19 && a >= ((long) fIr[i2])) {
                            stringBuilder.append(bTI.getPositiveSign());
                        }
                    } else if (i2 == 2) {
                        stringBuilder.append(bTI.getPositiveSign());
                    }
                } else {
                    i2 = AnonymousClass4.fIl[this.fIs.ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        stringBuilder.append(bTI.getNegativeSign());
                    } else if (i2 == 4) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str3);
                        stringBuilder.append(this.fIo);
                        stringBuilder.append(str2);
                        stringBuilder.append(a);
                        stringBuilder.append(" cannot be negative according to the SignStyle");
                        throw new DateTimeException(stringBuilder.toString());
                    }
                }
                while (i < this.minWidth - str.length()) {
                    stringBuilder.append(bTI.getZeroDigit());
                    i++;
                }
                stringBuilder.append(str);
                return true;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append(this.fIo);
            stringBuilder.append(str2);
            stringBuilder.append(a);
            stringBuilder.append(" exceeds the maximum print width of ");
            stringBuilder.append(this.maxWidth);
            throw new DateTimeException(stringBuilder.toString());
        }

        public String toString() {
            String str = ")";
            String str2 = "Value(";
            StringBuilder stringBuilder;
            if (this.minWidth == 1 && this.maxWidth == 19 && this.fIs == SignStyle.NORMAL) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(this.fIo);
                stringBuilder.append(str);
                return stringBuilder.toString();
            }
            String str3 = ",";
            if (this.minWidth == this.maxWidth && this.fIs == SignStyle.NOT_NEGATIVE) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(this.fIo);
                stringBuilder.append(str3);
                stringBuilder.append(this.minWidth);
                stringBuilder.append(str);
                return stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(this.fIo);
            stringBuilder.append(str3);
            stringBuilder.append(this.minWidth);
            stringBuilder.append(str3);
            stringBuilder.append(this.maxWidth);
            stringBuilder.append(str3);
            stringBuilder.append(this.fIs);
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
    }

    static final class g implements c {
        static final String[] fIu = new String[]{"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};
        static final g fIv = new g("Z", "+HH:MM:ss");
        private final String fIw;
        private final int type;

        g(String str, String str2) {
            org.threeten.bp.a.d.requireNonNull(str, "noOffsetText");
            org.threeten.bp.a.d.requireNonNull(str2, "pattern");
            this.fIw = str;
            this.type = nM(str2);
        }

        private int nM(String str) {
            int i = 0;
            while (true) {
                String[] strArr = fIu;
                if (i >= strArr.length) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid zone offset pattern: ");
                    stringBuilder.append(str);
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (strArr[i].equals(str)) {
                    return i;
                } else {
                    i++;
                }
            }
        }

        public boolean print(d dVar, StringBuilder stringBuilder) {
            Long c = dVar.c(ChronoField.OFFSET_SECONDS);
            if (c == null) {
                return false;
            }
            int eq = org.threeten.bp.a.d.eq(c.longValue());
            if (eq == 0) {
                stringBuilder.append(this.fIw);
            } else {
                int abs = Math.abs((eq / ChartTimeInterval.CANDLE_1H) % 100);
                int abs2 = Math.abs((eq / 60) % 60);
                int abs3 = Math.abs(eq % 60);
                int length = stringBuilder.length();
                stringBuilder.append(eq < 0 ? "-" : "+");
                stringBuilder.append((char) ((abs / 10) + 48));
                stringBuilder.append((char) ((abs % 10) + 48));
                eq = this.type;
                if (eq >= 3 || (eq >= 1 && abs2 > 0)) {
                    String str = ":";
                    String str2 = "";
                    stringBuilder.append(this.type % 2 == 0 ? str : str2);
                    stringBuilder.append((char) ((abs2 / 10) + 48));
                    stringBuilder.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    eq = this.type;
                    if (eq >= 7 || (eq >= 5 && abs3 > 0)) {
                        if (this.type % 2 != 0) {
                            str = str2;
                        }
                        stringBuilder.append(str);
                        stringBuilder.append((char) ((abs3 / 10) + 48));
                        stringBuilder.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    stringBuilder.setLength(length);
                    stringBuilder.append(this.fIw);
                }
            }
            return true;
        }

        public String toString() {
            String replace = this.fIw.replace("'", "''");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Offset(");
            stringBuilder.append(fIu[this.type]);
            stringBuilder.append(",'");
            stringBuilder.append(replace);
            stringBuilder.append("')");
            return stringBuilder.toString();
        }
    }

    static final class h implements c {
        private final c fIx;
        private final int fIy;
        private final char fIz;

        h(c cVar, int i, char c) {
            this.fIx = cVar;
            this.fIy = i;
            this.fIz = c;
        }

        public boolean print(d dVar, StringBuilder stringBuilder) {
            int length = stringBuilder.length();
            int i = 0;
            if (!this.fIx.print(dVar, stringBuilder)) {
                return false;
            }
            int length2 = stringBuilder.length() - length;
            if (length2 <= this.fIy) {
                while (i < this.fIy - length2) {
                    stringBuilder.insert(length, this.fIz);
                    i++;
                }
                return true;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Cannot print as output of ");
            stringBuilder2.append(length2);
            stringBuilder2.append(" characters exceeds pad width of ");
            stringBuilder2.append(this.fIy);
            throw new DateTimeException(stringBuilder2.toString());
        }

        public String toString() {
            String str;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Pad(");
            stringBuilder.append(this.fIx);
            stringBuilder.append(",");
            stringBuilder.append(this.fIy);
            if (this.fIz == ' ') {
                str = ")";
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(",'");
                stringBuilder2.append(this.fIz);
                stringBuilder2.append("')");
                str = stringBuilder2.toString();
            }
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
    }

    static final class i implements c {
        private final String fIA;

        i(String str) {
            this.fIA = str;
        }

        public boolean print(d dVar, StringBuilder stringBuilder) {
            stringBuilder.append(this.fIA);
            return true;
        }

        public String toString() {
            String str = "'";
            String replace = this.fIA.replace(str, "''");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(replace);
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
    }

    static final class j implements c {
        private final TextStyle fIB;
        private final e fIC;
        private volatile f fID;
        private final org.threeten.bp.temporal.e fIo;

        j(org.threeten.bp.temporal.e eVar, TextStyle textStyle, e eVar2) {
            this.fIo = eVar;
            this.fIB = textStyle;
            this.fIC = eVar2;
        }

        public boolean print(d dVar, StringBuilder stringBuilder) {
            Long c = dVar.c(this.fIo);
            if (c == null) {
                return false;
            }
            String a = this.fIC.a(this.fIo, c.longValue(), this.fIB, dVar.getLocale());
            if (a == null) {
                return bTF().print(dVar, stringBuilder);
            }
            stringBuilder.append(a);
            return true;
        }

        private f bTF() {
            if (this.fID == null) {
                this.fID = new f(this.fIo, 1, 19, SignStyle.NORMAL);
            }
            return this.fID;
        }

        public String toString() {
            String str = ")";
            String str2 = "Text(";
            StringBuilder stringBuilder;
            if (this.fIB == TextStyle.FULL) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(this.fIo);
                stringBuilder.append(str);
                return stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(this.fIo);
            stringBuilder.append(",");
            stringBuilder.append(this.fIB);
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
    }

    static final class k implements c {
        private final String description;
        private final org.threeten.bp.temporal.g<ZoneId> fIE;

        k(org.threeten.bp.temporal.g<ZoneId> gVar, String str) {
            this.fIE = gVar;
            this.description = str;
        }

        public boolean print(d dVar, StringBuilder stringBuilder) {
            ZoneId zoneId = (ZoneId) dVar.a(this.fIE);
            if (zoneId == null) {
                return false;
            }
            stringBuilder.append(zoneId.getId());
            return true;
        }

        public String toString() {
            return this.description;
        }
    }

    static {
        fIh.put(Character.valueOf('G'), ChronoField.ERA);
        fIh.put(Character.valueOf('y'), ChronoField.YEAR_OF_ERA);
        fIh.put(Character.valueOf('u'), ChronoField.YEAR);
        fIh.put(Character.valueOf('Q'), IsoFields.fIZ);
        fIh.put(Character.valueOf('q'), IsoFields.fIZ);
        fIh.put(Character.valueOf('M'), ChronoField.MONTH_OF_YEAR);
        fIh.put(Character.valueOf('L'), ChronoField.MONTH_OF_YEAR);
        fIh.put(Character.valueOf('D'), ChronoField.DAY_OF_YEAR);
        fIh.put(Character.valueOf('d'), ChronoField.DAY_OF_MONTH);
        fIh.put(Character.valueOf('F'), ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        fIh.put(Character.valueOf('E'), ChronoField.DAY_OF_WEEK);
        fIh.put(Character.valueOf('c'), ChronoField.DAY_OF_WEEK);
        fIh.put(Character.valueOf('e'), ChronoField.DAY_OF_WEEK);
        fIh.put(Character.valueOf('a'), ChronoField.AMPM_OF_DAY);
        fIh.put(Character.valueOf('H'), ChronoField.HOUR_OF_DAY);
        fIh.put(Character.valueOf('k'), ChronoField.CLOCK_HOUR_OF_DAY);
        fIh.put(Character.valueOf('K'), ChronoField.HOUR_OF_AMPM);
        fIh.put(Character.valueOf('h'), ChronoField.CLOCK_HOUR_OF_AMPM);
        fIh.put(Character.valueOf('m'), ChronoField.MINUTE_OF_HOUR);
        fIh.put(Character.valueOf('s'), ChronoField.SECOND_OF_MINUTE);
        fIh.put(Character.valueOf('S'), ChronoField.NANO_OF_SECOND);
        fIh.put(Character.valueOf('A'), ChronoField.MILLI_OF_DAY);
        fIh.put(Character.valueOf('n'), ChronoField.NANO_OF_SECOND);
        fIh.put(Character.valueOf('N'), ChronoField.NANO_OF_DAY);
    }

    public DateTimeFormatterBuilder() {
        this.fIa = this;
        this.fIc = new ArrayList();
        this.fIg = -1;
        this.fIb = null;
        this.fId = false;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z) {
        this.fIa = this;
        this.fIc = new ArrayList();
        this.fIg = -1;
        this.fIb = dateTimeFormatterBuilder;
        this.fId = z;
    }

    public DateTimeFormatterBuilder bTv() {
        a(SettingsParser.SENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder bTw() {
        a(SettingsParser.INSENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder bTx() {
        a(SettingsParser.LENIENT);
        return this;
    }

    public DateTimeFormatterBuilder a(org.threeten.bp.temporal.e eVar, int i) {
        org.threeten.bp.a.d.requireNonNull(eVar, "field");
        if (i < 1 || i > 19) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The width must be from 1 to 19 inclusive but was ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        a(new f(eVar, i, i, SignStyle.NOT_NEGATIVE));
        return this;
    }

    public DateTimeFormatterBuilder a(org.threeten.bp.temporal.e eVar, int i, int i2, SignStyle signStyle) {
        if (i == i2 && signStyle == SignStyle.NOT_NEGATIVE) {
            return a(eVar, i2);
        }
        org.threeten.bp.a.d.requireNonNull(eVar, "field");
        org.threeten.bp.a.d.requireNonNull(signStyle, "signStyle");
        if (i < 1 || i > 19) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The minimum width must be from 1 to 19 inclusive but was ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 < 1 || i2 > 19) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("The maximum width must be from 1 to 19 inclusive but was ");
            stringBuilder2.append(i2);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else if (i2 >= i) {
            a(new f(eVar, i, i2, signStyle));
            return this;
        } else {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("The maximum width must exceed or equal the minimum width but ");
            stringBuilder3.append(i2);
            stringBuilder3.append(" < ");
            stringBuilder3.append(i);
            throw new IllegalArgumentException(stringBuilder3.toString());
        }
    }

    private DateTimeFormatterBuilder a(f fVar) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.fIa;
        int i = dateTimeFormatterBuilder.fIg;
        if (i < 0 || !(dateTimeFormatterBuilder.fIc.get(i) instanceof f)) {
            this.fIa.fIg = a((c) fVar);
        } else {
            Object nL;
            dateTimeFormatterBuilder = this.fIa;
            i = dateTimeFormatterBuilder.fIg;
            f fVar2 = (f) dateTimeFormatterBuilder.fIc.get(i);
            if (fVar.minWidth == fVar.maxWidth && fVar.fIs == SignStyle.NOT_NEGATIVE) {
                nL = fVar2.nL(fVar.maxWidth);
                a(fVar.bTE());
                this.fIa.fIg = i;
            } else {
                nL = fVar2.bTE();
                this.fIa.fIg = a((c) fVar);
            }
            this.fIa.fIc.set(i, nL);
        }
        return this;
    }

    public DateTimeFormatterBuilder a(org.threeten.bp.temporal.e eVar, int i, int i2, boolean z) {
        a(new d(eVar, i, i2, z));
        return this;
    }

    public DateTimeFormatterBuilder a(org.threeten.bp.temporal.e eVar, TextStyle textStyle) {
        org.threeten.bp.a.d.requireNonNull(eVar, "field");
        org.threeten.bp.a.d.requireNonNull(textStyle, "textStyle");
        a(new j(eVar, textStyle, e.bTL()));
        return this;
    }

    public DateTimeFormatterBuilder a(org.threeten.bp.temporal.e eVar, Map<Long, String> map) {
        org.threeten.bp.a.d.requireNonNull(eVar, "field");
        org.threeten.bp.a.d.requireNonNull(map, "textLookup");
        final a aVar = new a(Collections.singletonMap(TextStyle.FULL, new LinkedHashMap(map)));
        a(new j(eVar, TextStyle.FULL, new e() {
            public String a(org.threeten.bp.temporal.e eVar, long j, TextStyle textStyle, Locale locale) {
                return aVar.a(j, textStyle);
            }
        }));
        return this;
    }

    public DateTimeFormatterBuilder bTy() {
        a(new e(-2));
        return this;
    }

    public DateTimeFormatterBuilder bTz() {
        a(g.fIv);
        return this;
    }

    public DateTimeFormatterBuilder br(String str, String str2) {
        a(new g(str2, str));
        return this;
    }

    public DateTimeFormatterBuilder bTA() {
        a(new k(fHZ, "ZoneRegionId()"));
        return this;
    }

    public DateTimeFormatterBuilder I(char c) {
        a(new a(c));
        return this;
    }

    public DateTimeFormatterBuilder nL(String str) {
        org.threeten.bp.a.d.requireNonNull(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                a(new a(str.charAt(0)));
            } else {
                a(new i(str));
            }
        }
        return this;
    }

    public DateTimeFormatterBuilder a(b bVar) {
        org.threeten.bp.a.d.requireNonNull(bVar, "formatter");
        a(bVar.ho(false));
        return this;
    }

    public DateTimeFormatterBuilder bTB() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.fIa;
        dateTimeFormatterBuilder.fIg = -1;
        this.fIa = new DateTimeFormatterBuilder(dateTimeFormatterBuilder, true);
        return this;
    }

    public DateTimeFormatterBuilder bTC() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.fIa;
        if (dateTimeFormatterBuilder.fIb != null) {
            if (dateTimeFormatterBuilder.fIc.size() > 0) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.fIa;
                c bVar = new b(dateTimeFormatterBuilder2.fIc, dateTimeFormatterBuilder2.fId);
                this.fIa = this.fIa.fIb;
                a(bVar);
            } else {
                this.fIa = this.fIa.fIb;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    private int a(c cVar) {
        Object hVar;
        org.threeten.bp.a.d.requireNonNull(cVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.fIa;
        int i = dateTimeFormatterBuilder.fIe;
        if (i > 0) {
            if (cVar != null) {
                hVar = new h(cVar, i, dateTimeFormatterBuilder.fIf);
            }
            dateTimeFormatterBuilder = this.fIa;
            dateTimeFormatterBuilder.fIe = 0;
            dateTimeFormatterBuilder.fIf = 0;
        }
        this.fIa.fIc.add(hVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.fIa;
        dateTimeFormatterBuilder2.fIg = -1;
        return dateTimeFormatterBuilder2.fIc.size() - 1;
    }

    public b bTD() {
        return b(Locale.getDefault());
    }

    public b b(Locale locale) {
        org.threeten.bp.a.d.requireNonNull(locale, "locale");
        while (this.fIa.fIb != null) {
            bTC();
        }
        return new b(new b(this.fIc, false), locale, f.fIQ, ResolverStyle.SMART, null, null, null);
    }

    /* Access modifiers changed, original: 0000 */
    public b b(ResolverStyle resolverStyle) {
        return bTD().a(resolverStyle);
    }
}

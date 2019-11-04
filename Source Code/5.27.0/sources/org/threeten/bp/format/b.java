package org.threeten.bp.format;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.a.d;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.e;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.IsoFields;
import org.threeten.bp.temporal.g;

/* compiled from: DateTimeFormatter */
public final class b {
    public static final b fHE = new DateTimeFormatterBuilder().a(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).I('-').a(ChronoField.MONTH_OF_YEAR, 2).I('-').a(ChronoField.DAY_OF_MONTH, 2).b(ResolverStyle.STRICT).c(IsoChronology.fHk);
    public static final b fHF = new DateTimeFormatterBuilder().bTw().a(fHE).bTz().b(ResolverStyle.STRICT).c(IsoChronology.fHk);
    public static final b fHG = new DateTimeFormatterBuilder().bTw().a(fHE).bTB().bTz().b(ResolverStyle.STRICT).c(IsoChronology.fHk);
    public static final b fHH = new DateTimeFormatterBuilder().a(ChronoField.HOUR_OF_DAY, 2).I(':').a(ChronoField.MINUTE_OF_HOUR, 2).bTB().I(':').a(ChronoField.SECOND_OF_MINUTE, 2).bTB().a(ChronoField.NANO_OF_SECOND, 0, 9, true).b(ResolverStyle.STRICT);
    public static final b fHI = new DateTimeFormatterBuilder().bTw().a(fHH).bTz().b(ResolverStyle.STRICT);
    public static final b fHJ = new DateTimeFormatterBuilder().bTw().a(fHH).bTB().bTz().b(ResolverStyle.STRICT);
    public static final b fHK = new DateTimeFormatterBuilder().bTw().a(fHE).I('T').a(fHH).b(ResolverStyle.STRICT).c(IsoChronology.fHk);
    public static final b fHL = new DateTimeFormatterBuilder().bTw().a(fHK).bTz().b(ResolverStyle.STRICT).c(IsoChronology.fHk);
    public static final b fHM = new DateTimeFormatterBuilder().a(fHL).bTB().I('[').bTv().bTA().I(']').b(ResolverStyle.STRICT).c(IsoChronology.fHk);
    public static final b fHN = new DateTimeFormatterBuilder().a(fHK).bTB().bTz().bTB().I('[').bTv().bTA().I(']').b(ResolverStyle.STRICT).c(IsoChronology.fHk);
    public static final b fHO = new DateTimeFormatterBuilder().bTw().a(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).I('-').a(ChronoField.DAY_OF_YEAR, 3).bTB().bTz().b(ResolverStyle.STRICT).c(IsoChronology.fHk);
    public static final b fHP = new DateTimeFormatterBuilder().bTw().a(IsoFields.fJb, 4, 10, SignStyle.EXCEEDS_PAD).nL("-W").a(IsoFields.fJa, 2).I('-').a(ChronoField.DAY_OF_WEEK, 1).bTB().bTz().b(ResolverStyle.STRICT).c(IsoChronology.fHk);
    public static final b fHQ = new DateTimeFormatterBuilder().bTw().bTy().b(ResolverStyle.STRICT);
    public static final b fHR = new DateTimeFormatterBuilder().bTw().a(ChronoField.YEAR, 4).a(ChronoField.MONTH_OF_YEAR, 2).a(ChronoField.DAY_OF_MONTH, 2).bTB().br("+HHMMss", "Z").b(ResolverStyle.STRICT).c(IsoChronology.fHk);
    public static final b fHS;
    private static final g<Period> fHT = new g<Period>() {
        /* renamed from: O */
        public Period b(org.threeten.bp.temporal.b bVar) {
            if (bVar instanceof a) {
                return ((a) bVar).fHD;
            }
            return Period.fGq;
        }
    };
    private static final g<Boolean> fHU = new g<Boolean>() {
        /* renamed from: P */
        public Boolean b(org.threeten.bp.temporal.b bVar) {
            if (bVar instanceof a) {
                return Boolean.valueOf(((a) bVar).fHC);
            }
            return Boolean.FALSE;
        }
    };
    private final e fHB;
    private final b fHV;
    private final f fHW;
    private final ResolverStyle fHX;
    private final Set<org.threeten.bp.temporal.e> fHY;
    private final Locale locale;
    private final ZoneId zone;

    static {
        Map hashMap = new HashMap();
        Long valueOf = Long.valueOf(1);
        hashMap.put(valueOf, "Mon");
        Long valueOf2 = Long.valueOf(2);
        hashMap.put(valueOf2, "Tue");
        Long valueOf3 = Long.valueOf(3);
        hashMap.put(valueOf3, "Wed");
        Long valueOf4 = Long.valueOf(4);
        hashMap.put(valueOf4, "Thu");
        Long valueOf5 = Long.valueOf(5);
        hashMap.put(valueOf5, "Fri");
        Long valueOf6 = Long.valueOf(6);
        hashMap.put(valueOf6, "Sat");
        hashMap.put(Long.valueOf(7), "Sun");
        Map hashMap2 = new HashMap();
        hashMap2.put(valueOf, "Jan");
        hashMap2.put(valueOf2, "Feb");
        hashMap2.put(valueOf3, "Mar");
        hashMap2.put(valueOf4, "Apr");
        hashMap2.put(valueOf5, "May");
        hashMap2.put(valueOf6, "Jun");
        hashMap2.put(Long.valueOf(7), "Jul");
        hashMap2.put(Long.valueOf(8), "Aug");
        hashMap2.put(Long.valueOf(9), "Sep");
        hashMap2.put(Long.valueOf(10), "Oct");
        hashMap2.put(Long.valueOf(11), "Nov");
        hashMap2.put(Long.valueOf(12), "Dec");
        fHS = new DateTimeFormatterBuilder().bTw().bTx().bTB().a(ChronoField.DAY_OF_WEEK, hashMap).nL(", ").bTC().a(ChronoField.DAY_OF_MONTH, 1, 2, SignStyle.NOT_NEGATIVE).I(' ').a(ChronoField.MONTH_OF_YEAR, hashMap2).I(' ').a(ChronoField.YEAR, 4).I(' ').a(ChronoField.HOUR_OF_DAY, 2).I(':').a(ChronoField.MINUTE_OF_HOUR, 2).bTB().I(':').a(ChronoField.SECOND_OF_MINUTE, 2).bTC().I(' ').br("+HHMM", "GMT").b(ResolverStyle.SMART).c(IsoChronology.fHk);
    }

    b(b bVar, Locale locale, f fVar, ResolverStyle resolverStyle, Set<org.threeten.bp.temporal.e> set, e eVar, ZoneId zoneId) {
        this.fHV = (b) d.requireNonNull(bVar, "printerParser");
        this.locale = (Locale) d.requireNonNull(locale, "locale");
        this.fHW = (f) d.requireNonNull(fVar, "decimalStyle");
        this.fHX = (ResolverStyle) d.requireNonNull(resolverStyle, "resolverStyle");
        this.fHY = set;
        this.fHB = eVar;
        this.zone = zoneId;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public f bTu() {
        return this.fHW;
    }

    public e bSR() {
        return this.fHB;
    }

    public b c(e eVar) {
        if (d.equals(this.fHB, eVar)) {
            return this;
        }
        return new b(this.fHV, this.locale, this.fHW, this.fHX, this.fHY, eVar, this.zone);
    }

    public ZoneId bSJ() {
        return this.zone;
    }

    public b a(ResolverStyle resolverStyle) {
        d.requireNonNull(resolverStyle, "resolverStyle");
        if (d.equals(this.fHX, resolverStyle)) {
            return this;
        }
        return new b(this.fHV, this.locale, this.fHW, resolverStyle, this.fHY, this.fHB, this.zone);
    }

    public String N(org.threeten.bp.temporal.b bVar) {
        StringBuilder stringBuilder = new StringBuilder(32);
        a(bVar, stringBuilder);
        return stringBuilder.toString();
    }

    public void a(org.threeten.bp.temporal.b bVar, Appendable appendable) {
        d.requireNonNull(bVar, "temporal");
        d.requireNonNull(appendable, "appendable");
        try {
            d dVar = new d(bVar, this);
            if (appendable instanceof StringBuilder) {
                this.fHV.print(dVar, (StringBuilder) appendable);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder(32);
            this.fHV.print(dVar, stringBuilder);
            appendable.append(stringBuilder);
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public b ho(boolean z) {
        return this.fHV.hp(z);
    }

    public String toString() {
        String bVar = this.fHV.toString();
        return bVar.startsWith("[") ? bVar : bVar.substring(1, bVar.length() - 1);
    }
}

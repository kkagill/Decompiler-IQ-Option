package org.threeten.bp.temporal;

import java.util.Locale;
import java.util.Map;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Duration;
import org.threeten.bp.LocalDate;
import org.threeten.bp.a.d;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.e;
import org.threeten.bp.format.ResolverStyle;

public final class IsoFields {
    public static final e fIY = Field.DAY_OF_QUARTER;
    public static final e fIZ = Field.QUARTER_OF_YEAR;
    public static final e fJa = Field.WEEK_OF_WEEK_BASED_YEAR;
    public static final e fJb = Field.WEEK_BASED_YEAR;
    public static final h fJc = Unit.WEEK_BASED_YEARS;
    public static final h fJd = Unit.QUARTER_YEARS;

    /* renamed from: org.threeten.bp.temporal.IsoFields$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fJe = new int[Unit.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = org.threeten.bp.temporal.IsoFields.Unit.values();
            r0 = r0.length;
            r0 = new int[r0];
            fJe = r0;
            r0 = fJe;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.threeten.bp.temporal.IsoFields.Unit.WEEK_BASED_YEARS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fJe;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = org.threeten.bp.temporal.IsoFields.Unit.QUARTER_YEARS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.temporal.IsoFields$AnonymousClass1.<clinit>():void");
        }
    }

    private enum Field implements e {
        DAY_OF_QUARTER {
            public String toString() {
                return "DayOfQuarter";
            }

            public h getBaseUnit() {
                return ChronoUnit.DAYS;
            }

            public h getRangeUnit() {
                return IsoFields.fJd;
            }

            public ValueRange range() {
                return ValueRange.c(1, 90, 92);
            }

            public boolean isSupportedBy(b bVar) {
                return bVar.isSupported(ChronoField.DAY_OF_YEAR) && bVar.isSupported(ChronoField.MONTH_OF_YEAR) && bVar.isSupported(ChronoField.YEAR) && Field.isIso(bVar);
            }

            public ValueRange rangeRefinedBy(b bVar) {
                if (bVar.isSupported(this)) {
                    long j = bVar.getLong(QUARTER_OF_YEAR);
                    if (j == 1) {
                        return IsoChronology.fHk.isLeapYear(bVar.getLong(ChronoField.YEAR)) ? ValueRange.I(1, 91) : ValueRange.I(1, 90);
                    } else if (j == 2) {
                        return ValueRange.I(1, 91);
                    } else {
                        if (j == 3 || j == 4) {
                            return ValueRange.I(1, 92);
                        }
                        return range();
                    }
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            public long getFrom(b bVar) {
                if (bVar.isSupported(this)) {
                    return (long) (bVar.get(ChronoField.DAY_OF_YEAR) - Field.QUARTER_DAYS[((bVar.get(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (IsoChronology.fHk.isLeapYear(bVar.getLong(ChronoField.YEAR)) ? 4 : 0)]);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            public <R extends a> R adjustInto(R r, long j) {
                long from = getFrom(r);
                range().a(j, this);
                return r.b(ChronoField.DAY_OF_YEAR, r.getLong(ChronoField.DAY_OF_YEAR) + (j - from));
            }

            /* JADX WARNING: Missing block: B:14:0x0079, code skipped:
            if (r0 == 2) goto L_0x007b;
     */
            public org.threeten.bp.temporal.b resolve(java.util.Map<org.threeten.bp.temporal.e, java.lang.Long> r11, org.threeten.bp.temporal.b r12, org.threeten.bp.format.ResolverStyle r13) {
                /*
                r10 = this;
                r12 = org.threeten.bp.temporal.ChronoField.YEAR;
                r12 = r11.get(r12);
                r12 = (java.lang.Long) r12;
                r0 = QUARTER_OF_YEAR;
                r0 = r11.get(r0);
                r0 = (java.lang.Long) r0;
                if (r12 == 0) goto L_0x00a8;
            L_0x0012:
                if (r0 != 0) goto L_0x0016;
            L_0x0014:
                goto L_0x00a8;
            L_0x0016:
                r1 = org.threeten.bp.temporal.ChronoField.YEAR;
                r2 = r12.longValue();
                r12 = r1.checkValidIntValue(r2);
                r1 = DAY_OF_QUARTER;
                r1 = r11.get(r1);
                r1 = (java.lang.Long) r1;
                r1 = r1.longValue();
                r3 = org.threeten.bp.format.ResolverStyle.LENIENT;
                r4 = 3;
                r5 = 1;
                r7 = 1;
                if (r13 != r3) goto L_0x0051;
            L_0x0034:
                r8 = r0.longValue();
                r12 = org.threeten.bp.LocalDate.G(r12, r7, r7);
                r7 = org.threeten.bp.a.d.G(r8, r5);
                r3 = org.threeten.bp.a.d.j(r7, r4);
                r12 = r12.dz(r3);
                r0 = org.threeten.bp.a.d.G(r1, r5);
                r12 = r12.dB(r0);
                goto L_0x009a;
            L_0x0051:
                r3 = QUARTER_OF_YEAR;
                r3 = r3.range();
                r8 = r0.longValue();
                r0 = QUARTER_OF_YEAR;
                r0 = r3.b(r8, r0);
                r3 = org.threeten.bp.format.ResolverStyle.STRICT;
                if (r13 != r3) goto L_0x0086;
            L_0x0065:
                r13 = 92;
                r3 = 91;
                if (r0 != r7) goto L_0x0078;
            L_0x006b:
                r13 = org.threeten.bp.chrono.IsoChronology.fHk;
                r8 = (long) r12;
                r13 = r13.isLeapYear(r8);
                if (r13 == 0) goto L_0x0075;
            L_0x0074:
                goto L_0x007b;
            L_0x0075:
                r13 = 90;
                goto L_0x007d;
            L_0x0078:
                r8 = 2;
                if (r0 != r8) goto L_0x007d;
            L_0x007b:
                r13 = 91;
            L_0x007d:
                r8 = (long) r13;
                r13 = org.threeten.bp.temporal.ValueRange.I(r5, r8);
                r13.a(r1, r10);
                goto L_0x008d;
            L_0x0086:
                r13 = r10.range();
                r13.a(r1, r10);
            L_0x008d:
                r0 = r0 - r7;
                r0 = r0 * 3;
                r0 = r0 + r7;
                r12 = org.threeten.bp.LocalDate.G(r12, r0, r7);
                r1 = r1 - r5;
                r12 = r12.dB(r1);
            L_0x009a:
                r11.remove(r10);
                r13 = org.threeten.bp.temporal.ChronoField.YEAR;
                r11.remove(r13);
                r13 = QUARTER_OF_YEAR;
                r11.remove(r13);
                return r12;
            L_0x00a8:
                r11 = 0;
                return r11;
                */
                throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.temporal.IsoFields$Field$AnonymousClass1.resolve(java.util.Map, org.threeten.bp.temporal.b, org.threeten.bp.format.ResolverStyle):org.threeten.bp.temporal.b");
            }
        },
        QUARTER_OF_YEAR {
            public String toString() {
                return "QuarterOfYear";
            }

            public h getBaseUnit() {
                return IsoFields.fJd;
            }

            public h getRangeUnit() {
                return ChronoUnit.YEARS;
            }

            public ValueRange range() {
                return ValueRange.I(1, 4);
            }

            public boolean isSupportedBy(b bVar) {
                return bVar.isSupported(ChronoField.MONTH_OF_YEAR) && Field.isIso(bVar);
            }

            public ValueRange rangeRefinedBy(b bVar) {
                return range();
            }

            public long getFrom(b bVar) {
                if (bVar.isSupported(this)) {
                    return (bVar.getLong(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            public <R extends a> R adjustInto(R r, long j) {
                long from = getFrom(r);
                range().a(j, this);
                return r.b(ChronoField.MONTH_OF_YEAR, r.getLong(ChronoField.MONTH_OF_YEAR) + ((j - from) * 3));
            }
        },
        WEEK_OF_WEEK_BASED_YEAR {
            public String toString() {
                return "WeekOfWeekBasedYear";
            }

            public h getBaseUnit() {
                return ChronoUnit.WEEKS;
            }

            public h getRangeUnit() {
                return IsoFields.fJc;
            }

            public String getDisplayName(Locale locale) {
                d.requireNonNull(locale, "locale");
                return "Week";
            }

            public ValueRange range() {
                return ValueRange.c(1, 52, 53);
            }

            public boolean isSupportedBy(b bVar) {
                return bVar.isSupported(ChronoField.EPOCH_DAY) && Field.isIso(bVar);
            }

            public ValueRange rangeRefinedBy(b bVar) {
                if (bVar.isSupported(this)) {
                    return Field.getWeekRange(LocalDate.e(bVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            public long getFrom(b bVar) {
                if (bVar.isSupported(this)) {
                    return (long) Field.getWeek(LocalDate.e(bVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            public <R extends a> R adjustInto(R r, long j) {
                range().a(j, this);
                return r.d(d.G(j, getFrom(r)), ChronoUnit.WEEKS);
            }

            public b resolve(Map<e, Long> map, b bVar, ResolverStyle resolverStyle) {
                Map<e, Long> map2 = map;
                ResolverStyle resolverStyle2 = resolverStyle;
                Long l = (Long) map2.get(WEEK_BASED_YEAR);
                Long l2 = (Long) map2.get(ChronoField.DAY_OF_WEEK);
                if (l == null || l2 == null) {
                    return null;
                }
                b c;
                int b = WEEK_BASED_YEAR.range().b(l.longValue(), WEEK_BASED_YEAR);
                long longValue = ((Long) map2.get(WEEK_OF_WEEK_BASED_YEAR)).longValue();
                if (resolverStyle2 == ResolverStyle.LENIENT) {
                    long longValue2 = l2.longValue();
                    long j = 0;
                    if (longValue2 > 7) {
                        longValue2--;
                        j = longValue2 / 7;
                        longValue2 = (longValue2 % 7) + 1;
                    } else if (longValue2 < 1) {
                        j = (longValue2 / 7) - 1;
                        longValue2 = (longValue2 % 7) + 7;
                    }
                    c = LocalDate.G(b, 1, 4).dA(longValue - 1).dA(j).d(ChronoField.DAY_OF_WEEK, longValue2);
                } else {
                    int checkValidIntValue = ChronoField.DAY_OF_WEEK.checkValidIntValue(l2.longValue());
                    if (resolverStyle2 == ResolverStyle.STRICT) {
                        Field.getWeekRange(LocalDate.G(b, 1, 4)).a(longValue, this);
                    } else {
                        range().a(longValue, this);
                    }
                    c = LocalDate.G(b, 1, 4).dA(longValue - 1).d(ChronoField.DAY_OF_WEEK, (long) checkValidIntValue);
                }
                map2.remove(this);
                map2.remove(WEEK_BASED_YEAR);
                map2.remove(ChronoField.DAY_OF_WEEK);
                return c;
            }
        },
        WEEK_BASED_YEAR {
            public String toString() {
                return "WeekBasedYear";
            }

            public h getBaseUnit() {
                return IsoFields.fJc;
            }

            public h getRangeUnit() {
                return ChronoUnit.FOREVER;
            }

            public ValueRange range() {
                return ChronoField.YEAR.range();
            }

            public boolean isSupportedBy(b bVar) {
                return bVar.isSupported(ChronoField.EPOCH_DAY) && Field.isIso(bVar);
            }

            public ValueRange rangeRefinedBy(b bVar) {
                return ChronoField.YEAR.range();
            }

            public long getFrom(b bVar) {
                if (bVar.isSupported(this)) {
                    return (long) Field.getWeekBasedYear(LocalDate.e(bVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            public <R extends a> R adjustInto(R r, long j) {
                if (isSupportedBy(r)) {
                    int b = range().b(j, WEEK_BASED_YEAR);
                    LocalDate e = LocalDate.e(r);
                    int i = e.get(ChronoField.DAY_OF_WEEK);
                    int access$400 = Field.getWeek(e);
                    if (access$400 == 53 && Field.getWeekRange(b) == 52) {
                        access$400 = 52;
                    }
                    LocalDate G = LocalDate.G(b, 1, 4);
                    return r.b(G.dB((long) ((i - G.get(ChronoField.DAY_OF_WEEK)) + ((access$400 - 1) * 7))));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }
        };
        
        private static final int[] QUARTER_DAYS = null;

        public boolean isDateBased() {
            return true;
        }

        public boolean isTimeBased() {
            return false;
        }

        public b resolve(Map<e, Long> map, b bVar, ResolverStyle resolverStyle) {
            return null;
        }

        static {
            QUARTER_DAYS = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        public String getDisplayName(Locale locale) {
            d.requireNonNull(locale, "locale");
            return toString();
        }

        private static boolean isIso(b bVar) {
            return e.B(bVar).equals(IsoChronology.fHk);
        }

        private static ValueRange getWeekRange(LocalDate localDate) {
            return ValueRange.I(1, (long) getWeekRange(getWeekBasedYear(localDate)));
        }

        private static int getWeekRange(int i) {
            LocalDate G = LocalDate.G(i, 1, 1);
            return (G.bSQ() == DayOfWeek.THURSDAY || (G.bSQ() == DayOfWeek.WEDNESDAY && G.isLeapYear())) ? 53 : 52;
        }

        private static int getWeek(LocalDate localDate) {
            int dayOfYear = localDate.getDayOfYear() - 1;
            int ordinal = (3 - localDate.bSQ().ordinal()) + dayOfYear;
            ordinal = (ordinal - ((ordinal / 7) * 7)) - 3;
            if (ordinal < -3) {
                ordinal += 7;
            }
            if (dayOfYear < ordinal) {
                return (int) getWeekRange(localDate.ni(180).dC(1)).getMaximum();
            }
            dayOfYear = ((dayOfYear - ordinal) / 7) + 1;
            if (dayOfYear == 53) {
                Object obj = (ordinal == -3 || (ordinal == -2 && localDate.isLeapYear())) ? 1 : null;
                if (obj == null) {
                    dayOfYear = 1;
                }
            }
            return dayOfYear;
        }

        private static int getWeekBasedYear(LocalDate localDate) {
            int year = localDate.getYear();
            int dayOfYear = localDate.getDayOfYear();
            if (dayOfYear <= 3) {
                if (dayOfYear - localDate.bSQ().ordinal() < -2) {
                    return year - 1;
                }
                return year;
            } else if (dayOfYear < 363) {
                return year;
            } else {
                return ((dayOfYear - 363) - localDate.isLeapYear()) - localDate.bSQ().ordinal() >= 0 ? year + 1 : year;
            }
        }
    }

    private enum Unit implements h {
        WEEK_BASED_YEARS("WeekBasedYears", Duration.dr(31556952)),
        QUARTER_YEARS("QuarterYears", Duration.dr(7889238));
        
        private final Duration duration;
        private final String name;

        public boolean isDateBased() {
            return true;
        }

        public boolean isDurationEstimated() {
            return true;
        }

        public boolean isTimeBased() {
            return false;
        }

        private Unit(String str, Duration duration) {
            this.name = str;
            this.duration = duration;
        }

        public Duration getDuration() {
            return this.duration;
        }

        public boolean isSupportedBy(a aVar) {
            return aVar.isSupported(ChronoField.EPOCH_DAY);
        }

        public <R extends a> R addTo(R r, long j) {
            int i = AnonymousClass1.fJe[ordinal()];
            if (i == 1) {
                return r.b(IsoFields.fJb, d.F((long) r.get(IsoFields.fJb), j));
            } else if (i == 2) {
                return r.d(j / 256, ChronoUnit.YEARS).d((j % 256) * 3, ChronoUnit.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        public long between(a aVar, a aVar2) {
            int i = AnonymousClass1.fJe[ordinal()];
            if (i == 1) {
                return d.G(aVar2.getLong(IsoFields.fJb), aVar.getLong(IsoFields.fJb));
            }
            if (i == 2) {
                return aVar.a(aVar2, ChronoUnit.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }

        public String toString() {
            return this.name;
        }
    }
}

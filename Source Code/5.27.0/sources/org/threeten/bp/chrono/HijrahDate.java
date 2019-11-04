package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalTime;
import org.threeten.bp.a.d;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.h;

public final class HijrahDate extends ChronoDateImpl<HijrahDate> implements Serializable {
    private static final int[] fGG = new int[]{0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
    private static final int[] fGH = new int[]{0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
    private static final int[] fGI = new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};
    private static final int[] fGJ = new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};
    private static final int[] fGK = new int[]{0, 1, 0, 1, 0, 1, 1};
    private static final int[] fGL = new int[]{1, 9999, 11, 51, 5, 29, 354};
    private static final int[] fGM = new int[]{1, 9999, 11, 52, 6, 30, 355};
    private static final int[] fGN = new int[]{0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};
    private static final char fGO = File.separatorChar;
    private static final String fGP = File.pathSeparator;
    private static final String fGQ;
    private static final HashMap<Integer, Integer[]> fGR = new HashMap();
    private static final HashMap<Integer, Integer[]> fGS = new HashMap();
    private static final HashMap<Integer, Integer[]> fGT = new HashMap();
    private static final Long[] fGU = new Long[334];
    private static final Integer[] fGV = new Integer[fGK.length];
    private static final Integer[] fGW = new Integer[fGL.length];
    private static final Integer[] fGX = new Integer[fGM.length];
    private static final Integer[] fGY = new Integer[fGG.length];
    private static final Integer[] fGZ = new Integer[fGH.length];
    private static final Integer[] fHa = new Integer[fGI.length];
    private static final Integer[] fHb = new Integer[fGJ.length];
    private static final Integer[] fHc = new Integer[fGN.length];
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient HijrahEra fHd;
    private final transient int fHe;
    private final transient int fHf;
    private final transient int fHg;
    private final transient int fHh;
    private final transient DayOfWeek fHi;
    private final transient boolean fHj = isLeapYear((long) this.fHe);
    private final long gregorianEpochDay;

    public /* bridge */ /* synthetic */ long a(a aVar, h hVar) {
        return super.a(aVar, hVar);
    }

    static {
        int[] iArr;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("org");
        stringBuilder.append(fGO);
        stringBuilder.append("threeten");
        stringBuilder.append(fGO);
        stringBuilder.append("bp");
        stringBuilder.append(fGO);
        stringBuilder.append("chrono");
        fGQ = stringBuilder.toString();
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = fGG;
            if (i2 >= iArr.length) {
                break;
            }
            fGY[i2] = Integer.valueOf(iArr[i2]);
            i2++;
        }
        i2 = 0;
        while (true) {
            iArr = fGH;
            if (i2 >= iArr.length) {
                break;
            }
            fGZ[i2] = Integer.valueOf(iArr[i2]);
            i2++;
        }
        i2 = 0;
        while (true) {
            iArr = fGI;
            if (i2 >= iArr.length) {
                break;
            }
            fHa[i2] = Integer.valueOf(iArr[i2]);
            i2++;
        }
        i2 = 0;
        while (true) {
            iArr = fGJ;
            if (i2 >= iArr.length) {
                break;
            }
            fHb[i2] = Integer.valueOf(iArr[i2]);
            i2++;
        }
        i2 = 0;
        while (true) {
            iArr = fGN;
            if (i2 >= iArr.length) {
                break;
            }
            fHc[i2] = Integer.valueOf(iArr[i2]);
            i2++;
        }
        i2 = 0;
        while (true) {
            Long[] lArr = fGU;
            if (i2 >= lArr.length) {
                break;
            }
            lArr[i2] = Long.valueOf((long) (i2 * 10631));
            i2++;
        }
        i2 = 0;
        while (true) {
            iArr = fGK;
            if (i2 >= iArr.length) {
                break;
            }
            fGV[i2] = Integer.valueOf(iArr[i2]);
            i2++;
        }
        i2 = 0;
        while (true) {
            iArr = fGL;
            if (i2 >= iArr.length) {
                break;
            }
            fGW[i2] = Integer.valueOf(iArr[i2]);
            i2++;
        }
        while (true) {
            int[] iArr2 = fGM;
            if (i < iArr2.length) {
                fGX[i] = Integer.valueOf(iArr2[i]);
                i++;
            } else {
                try {
                    bTh();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            }
        }
    }

    public static HijrahDate M(int i, int i2, int i3) {
        if (i >= 1) {
            return a(HijrahEra.AH, i, i2, i3);
        }
        return a(HijrahEra.BEFORE_AH, 1 - i, i2, i3);
    }

    static HijrahDate a(HijrahEra hijrahEra, int i, int i2, int i3) {
        d.requireNonNull(hijrahEra, "era");
        nu(i);
        nw(i2);
        nx(i3);
        return new HijrahDate(O(hijrahEra.prolepticYear(i), i2, i3));
    }

    private static void nu(int i) {
        if (i < 1 || i > 9999) {
            throw new DateTimeException("Invalid year of Hijrah Era");
        }
    }

    private static void nv(int i) {
        if (i < 1 || i > bTg()) {
            throw new DateTimeException("Invalid day of year of Hijrah date");
        }
    }

    private static void nw(int i) {
        if (i < 1 || i > 12) {
            throw new DateTimeException("Invalid month of Hijrah date");
        }
    }

    private static void nx(int i) {
        if (i < 1 || i > bTf()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid day of month of Hijrah date, day ");
            stringBuilder.append(i);
            stringBuilder.append(" greater than ");
            stringBuilder.append(bTf());
            stringBuilder.append(" or less than 1");
            throw new DateTimeException(stringBuilder.toString());
        }
    }

    static HijrahDate ea(long j) {
        return new HijrahDate(j);
    }

    private HijrahDate(long j) {
        int[] ee = ee(j);
        nu(ee[1]);
        nw(ee[2]);
        nx(ee[3]);
        nv(ee[4]);
        this.fHd = HijrahEra.of(ee[0]);
        this.fHe = ee[1];
        this.fHf = ee[2];
        this.fHg = ee[3];
        this.fHh = ee[4];
        this.fHi = DayOfWeek.of(ee[5]);
        this.gregorianEpochDay = j;
    }

    private Object readResolve() {
        return new HijrahDate(this.gregorianEpochDay);
    }

    /* renamed from: bTd */
    public HijrahChronology bSR() {
        return HijrahChronology.fGC;
    }

    /* renamed from: bTe */
    public HijrahEra bSO() {
        return this.fHd;
    }

    public ValueRange range(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.rangeRefinedBy(this);
        }
        if (isSupported(eVar)) {
            ChronoField chronoField = (ChronoField) eVar;
            int i = AnonymousClass1.fFY[chronoField.ordinal()];
            if (i == 1) {
                return ValueRange.I(1, (long) lengthOfMonth());
            }
            if (i == 2) {
                return ValueRange.I(1, (long) lengthOfYear());
            }
            if (i == 3) {
                return ValueRange.I(1, 5);
            }
            if (i != 4) {
                return bSR().a(chronoField);
            }
            return ValueRange.I(1, 1000);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported field: ");
        stringBuilder.append(eVar);
        throw new UnsupportedTemporalTypeException(stringBuilder.toString());
    }

    public long getLong(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        int i;
        switch ((ChronoField) eVar) {
            case DAY_OF_MONTH:
                i = this.fHg;
                break;
            case DAY_OF_YEAR:
                i = this.fHh;
                break;
            case ALIGNED_WEEK_OF_MONTH:
                i = (this.fHg - 1) / 7;
                break;
            case YEAR_OF_ERA:
                i = this.fHe;
                break;
            case DAY_OF_WEEK:
                i = this.fHi.getValue();
                break;
            case ALIGNED_DAY_OF_WEEK_IN_MONTH:
                i = (this.fHg - 1) % 7;
                break;
            case ALIGNED_DAY_OF_WEEK_IN_YEAR:
                i = (this.fHh - 1) % 7;
                break;
            case EPOCH_DAY:
                return toEpochDay();
            case ALIGNED_WEEK_OF_YEAR:
                i = (this.fHh - 1) / 7;
                break;
            case MONTH_OF_YEAR:
                i = this.fHf;
                break;
            case YEAR:
                i = this.fHe;
                break;
            case ERA:
                i = this.fHd.getValue();
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported field: ");
                stringBuilder.append(eVar);
                throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
        i++;
        return (long) i;
    }

    /* renamed from: o */
    public HijrahDate d(c cVar) {
        return (HijrahDate) super.b(cVar);
    }

    /* renamed from: o */
    public HijrahDate d(e eVar, long j) {
        if (!(eVar instanceof ChronoField)) {
            return (HijrahDate) eVar.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) eVar;
        chronoField.checkValidValue(j);
        int i = (int) j;
        switch (chronoField) {
            case DAY_OF_MONTH:
                return N(this.fHe, this.fHf, i);
            case DAY_OF_YEAR:
                i--;
                return N(this.fHe, (i / 30) + 1, (i % 30) + 1);
            case ALIGNED_WEEK_OF_MONTH:
                return dU((j - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case YEAR_OF_ERA:
                if (this.fHe < 1) {
                    i = 1 - i;
                }
                return N(i, this.fHf, this.fHg);
            case DAY_OF_WEEK:
                return dU(j - ((long) this.fHi.getValue()));
            case ALIGNED_DAY_OF_WEEK_IN_MONTH:
                return dU(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case ALIGNED_DAY_OF_WEEK_IN_YEAR:
                return dU(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case EPOCH_DAY:
                return new HijrahDate((long) i);
            case ALIGNED_WEEK_OF_YEAR:
                return dU((j - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case MONTH_OF_YEAR:
                return N(this.fHe, i, this.fHg);
            case YEAR:
                return N(i, this.fHf, this.fHg);
            case ERA:
                return N(1 - this.fHe, this.fHf, this.fHg);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported field: ");
                stringBuilder.append(eVar);
                throw new UnsupportedTemporalTypeException(stringBuilder.toString());
        }
    }

    private static HijrahDate N(int i, int i2, int i3) {
        int bv = bv(i2 - 1, i);
        if (i3 > bv) {
            i3 = bv;
        }
        return M(i, i2, i3);
    }

    /* renamed from: C */
    public HijrahDate h(long j, h hVar) {
        return (HijrahDate) super.h(j, hVar);
    }

    /* renamed from: D */
    public HijrahDate g(long j, h hVar) {
        return (HijrahDate) super.c(j, hVar);
    }

    public final b<HijrahDate> b(LocalTime localTime) {
        return super.b(localTime);
    }

    public long toEpochDay() {
        return O(this.fHe, this.fHf, this.fHg);
    }

    public boolean isLeapYear() {
        return this.fHj;
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: eb */
    public HijrahDate dS(long j) {
        if (j == 0) {
            return this;
        }
        return a(this.fHd, d.by(this.fHe, (int) j), this.fHf, this.fHg);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: ec */
    public HijrahDate dT(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.fHf - 1) + ((int) j);
        int i2 = i / 12;
        i %= 12;
        while (i < 0) {
            i += 12;
            i2 = d.bz(i2, 1);
        }
        return a(this.fHd, d.by(this.fHe, i2), i + 1, this.fHg);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: ed */
    public HijrahDate dU(long j) {
        return new HijrahDate(this.gregorianEpochDay + j);
    }

    private static int[] ee(long j) {
        int ef;
        int i;
        int A;
        int Q;
        int value;
        j -= -492148;
        if (j >= 0) {
            ef = ef(j);
            i = i(j, ef);
            A = A(ef, (long) i);
            i = P(ef, i, A);
            ef = ((ef * 30) + A) + 1;
            A = bu(i, ef);
            Q = Q(i, A, ef) + 1;
            value = HijrahEra.AH.getValue();
        } else {
            ef = (int) j;
            i = ef / 10631;
            ef %= 10631;
            if (ef == 0) {
                ef = -10631;
                i++;
            }
            A = A(i, (long) ef);
            ef = P(i, ef, A);
            i = 1 - ((i * 30) - A);
            ef = isLeapYear((long) i) ? ef + 355 : ef + 354;
            A = bu(ef, i);
            Q = Q(ef, A, i) + 1;
            value = HijrahEra.BEFORE_AH.getValue();
            int i2 = i;
            i = ef;
            ef = i2;
        }
        int i3 = (int) ((j + 5) % 7);
        i3 += i3 <= 0 ? 7 : 0;
        return new int[]{value, ef, A + 1, Q, i + 1, i3};
    }

    private static long O(int i, int i2, int i3) {
        return (ny(i) + ((long) bv(i2 - 1, i))) + ((long) i3);
    }

    private static long ny(int i) {
        Long l;
        i--;
        int i2 = i / 30;
        i %= 30;
        int intValue = nz(i2)[Math.abs(i)].intValue();
        if (i < 0) {
            intValue = -intValue;
        }
        try {
            l = fGU[i2];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = Long.valueOf((long) (i2 * 10631));
        }
        return ((l.longValue() + ((long) intValue)) - 492148) - 1;
    }

    private static int ef(long j) {
        int i;
        Long[] lArr = fGU;
        int i2 = 0;
        while (i2 < lArr.length) {
            try {
                if (j < lArr[i2].longValue()) {
                    return i2 - 1;
                }
                i2++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                i = ((int) j) / 10631;
            }
        }
        i = ((int) j) / 10631;
        return i;
    }

    private static int i(long j, int i) {
        Long l;
        try {
            l = fGU[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = Long.valueOf((long) (i * 10631));
        }
        return (int) (j - l.longValue());
    }

    private static int A(int i, long j) {
        Integer[] nz = nz(i);
        int i2 = 0;
        if (j == 0) {
            return 0;
        }
        if (j > 0) {
            while (i2 < nz.length) {
                if (j < ((long) nz[i2].intValue())) {
                    return i2 - 1;
                }
                i2++;
            }
            return 29;
        }
        j = -j;
        while (i2 < nz.length) {
            if (j <= ((long) nz[i2].intValue())) {
                return i2 - 1;
            }
            i2++;
        }
        return 29;
    }

    private static Integer[] nz(int i) {
        Integer[] numArr;
        try {
            numArr = (Integer[]) fGT.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? fHc : numArr;
    }

    private static Integer[] nA(int i) {
        Integer[] numArr;
        try {
            numArr = (Integer[]) fGR.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (isLeapYear((long) i)) {
            return fGZ;
        }
        return fGY;
    }

    private static Integer[] nB(int i) {
        Integer[] numArr;
        try {
            numArr = (Integer[]) fGS.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (isLeapYear((long) i)) {
            return fHb;
        }
        return fHa;
    }

    private static int P(int i, int i2, int i3) {
        Integer[] nz = nz(i);
        if (i2 > 0) {
            return i2 - nz[i3].intValue();
        }
        return nz[i3].intValue() + i2;
    }

    private static int bu(int i, int i2) {
        Integer[] nA = nA(i2);
        int i3 = 0;
        if (i >= 0) {
            while (i3 < nA.length) {
                if (i < nA[i3].intValue()) {
                    return i3 - 1;
                }
                i3++;
            }
            return 11;
        }
        i = isLeapYear((long) i2) ? i + 355 : i + 354;
        while (i3 < nA.length) {
            if (i < nA[i3].intValue()) {
                return i3 - 1;
            }
            i3++;
        }
        return 11;
    }

    private static int Q(int i, int i2, int i3) {
        Integer[] nA = nA(i3);
        if (i >= 0) {
            if (i2 > 0) {
                i2 = nA[i2].intValue();
            }
            return i;
        }
        i = isLeapYear((long) i3) ? i + 355 : i + 354;
        if (i2 <= 0) {
            return i;
        }
        i2 = nA[i2].intValue();
        i -= i2;
        return i;
    }

    static boolean isLeapYear(long j) {
        if (j <= 0) {
            j = -j;
        }
        return ((j * 11) + 14) % 30 < 11;
    }

    private static int bv(int i, int i2) {
        return nA(i2)[i].intValue();
    }

    static int bw(int i, int i2) {
        return nB(i2)[i].intValue();
    }

    public int lengthOfMonth() {
        return bw(this.fHf - 1, this.fHe);
    }

    static int nC(int i) {
        Integer[] numArr;
        int i2 = i - 1;
        int i3 = i2 / 30;
        try {
            numArr = (Integer[]) fGT.get(Integer.valueOf(i3));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            i2 %= 30;
            if (i2 == 29) {
                i = fGU[i3 + 1].intValue() - fGU[i3].intValue();
                i2 = numArr[i2].intValue();
            } else {
                i = numArr[i2 + 1].intValue();
                i2 = numArr[i2].intValue();
            }
            return i - i2;
        }
        return isLeapYear((long) i) ? 355 : 354;
    }

    public int lengthOfYear() {
        return nC(this.fHe);
    }

    static int bTf() {
        return fGX[5].intValue();
    }

    static int bTg() {
        return fGX[6].intValue();
    }

    private static void g(int i, int i2, int i3, int i4, int i5) {
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        if (i6 < 1) {
            throw new IllegalArgumentException("startYear < 1");
        } else if (i8 < 1) {
            throw new IllegalArgumentException("endYear < 1");
        } else if (i7 < 0 || i7 > 11) {
            throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
        } else if (i9 < 0 || i9 > 11) {
            throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
        } else if (i8 > 9999) {
            throw new IllegalArgumentException("endYear > 9999");
        } else if (i8 < i6) {
            throw new IllegalArgumentException("startYear > endYear");
        } else if (i8 != i6 || i9 >= i7) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            Integer[] numArr;
            int i16;
            boolean isLeapYear = isLeapYear((long) i6);
            Integer[] numArr2 = (Integer[]) fGR.get(Integer.valueOf(i));
            if (numArr2 == null) {
                int[] iArr;
                if (!isLeapYear) {
                    numArr2 = new Integer[fGG.length];
                    i11 = 0;
                    while (true) {
                        iArr = fGG;
                        if (i11 >= iArr.length) {
                            break;
                        }
                        numArr2[i11] = Integer.valueOf(iArr[i11]);
                        i11++;
                    }
                } else {
                    numArr2 = new Integer[fGH.length];
                    i11 = 0;
                    while (true) {
                        iArr = fGH;
                        if (i11 >= iArr.length) {
                            break;
                        }
                        numArr2[i11] = Integer.valueOf(iArr[i11]);
                        i11++;
                    }
                }
            }
            Integer[] numArr3 = new Integer[numArr2.length];
            for (i12 = 0; i12 < 12; i12++) {
                if (i12 > i7) {
                    numArr3[i12] = Integer.valueOf(numArr2[i12].intValue() - i10);
                } else {
                    numArr3[i12] = Integer.valueOf(numArr2[i12].intValue());
                }
            }
            fGR.put(Integer.valueOf(i), numArr3);
            numArr2 = (Integer[]) fGS.get(Integer.valueOf(i));
            if (numArr2 == null) {
                int[] iArr2;
                if (!isLeapYear) {
                    numArr2 = new Integer[fGI.length];
                    i13 = 0;
                    while (true) {
                        iArr2 = fGI;
                        if (i13 >= iArr2.length) {
                            break;
                        }
                        numArr2[i13] = Integer.valueOf(iArr2[i13]);
                        i13++;
                    }
                } else {
                    numArr2 = new Integer[fGJ.length];
                    i13 = 0;
                    while (true) {
                        iArr2 = fGJ;
                        if (i13 >= iArr2.length) {
                            break;
                        }
                        numArr2[i13] = Integer.valueOf(iArr2[i13]);
                        i13++;
                    }
                }
            }
            Integer[] numArr4 = new Integer[numArr2.length];
            for (i11 = 0; i11 < 12; i11++) {
                if (i11 == i7) {
                    numArr4[i11] = Integer.valueOf(numArr2[i11].intValue() - i10);
                } else {
                    numArr4[i11] = Integer.valueOf(numArr2[i11].intValue());
                }
            }
            fGS.put(Integer.valueOf(i), numArr4);
            if (i6 != i8) {
                i13 = i6 - 1;
                i14 = i13 / 30;
                i13 %= 30;
                numArr3 = (Integer[]) fGT.get(Integer.valueOf(i14));
                if (numArr3 == null) {
                    numArr3 = new Integer[fGN.length];
                    for (i12 = 0; i12 < numArr3.length; i12++) {
                        numArr3[i12] = Integer.valueOf(fGN[i12]);
                    }
                }
                for (i13++; i13 < fGN.length; i13++) {
                    numArr3[i13] = Integer.valueOf(numArr3[i13].intValue() - i10);
                }
                fGT.put(Integer.valueOf(i14), numArr3);
                i13 = i8 - 1;
                i11 = i13 / 30;
                if (i14 != i11) {
                    i14++;
                    while (true) {
                        Long[] lArr = fGU;
                        if (i14 >= lArr.length) {
                            break;
                        }
                        lArr[i14] = Long.valueOf(lArr[i14].longValue() - ((long) i10));
                        i14++;
                    }
                    i15 = i11 + 1;
                    while (true) {
                        Long[] lArr2 = fGU;
                        if (i15 >= lArr2.length) {
                            break;
                        }
                        i12 = i11;
                        lArr2[i15] = Long.valueOf(lArr2[i15].longValue() + ((long) i10));
                        i15++;
                        i11 = i12;
                    }
                }
                i12 = i11;
                i13 %= 30;
                numArr = (Integer[]) fGT.get(Integer.valueOf(i12));
                if (numArr == null) {
                    numArr = new Integer[fGN.length];
                    for (i16 = 0; i16 < numArr.length; i16++) {
                        numArr[i16] = Integer.valueOf(fGN[i16]);
                    }
                }
                for (i13++; i13 < fGN.length; i13++) {
                    numArr[i13] = Integer.valueOf(numArr[i13].intValue() + i10);
                }
                fGT.put(Integer.valueOf(i12), numArr);
            }
            boolean isLeapYear2 = isLeapYear((long) i8);
            Integer[] numArr5 = (Integer[]) fGR.get(Integer.valueOf(i3));
            if (numArr5 == null) {
                int[] iArr3;
                if (!isLeapYear2) {
                    numArr5 = new Integer[fGG.length];
                    i13 = 0;
                    while (true) {
                        iArr3 = fGG;
                        if (i13 >= iArr3.length) {
                            break;
                        }
                        numArr5[i13] = Integer.valueOf(iArr3[i13]);
                        i13++;
                    }
                } else {
                    numArr5 = new Integer[fGH.length];
                    i13 = 0;
                    while (true) {
                        iArr3 = fGH;
                        if (i13 >= iArr3.length) {
                            break;
                        }
                        numArr5[i13] = Integer.valueOf(iArr3[i13]);
                        i13++;
                    }
                }
            }
            numArr4 = new Integer[numArr5.length];
            for (int i17 = 0; i17 < 12; i17++) {
                if (i17 > i9) {
                    numArr4[i17] = Integer.valueOf(numArr5[i17].intValue() + i10);
                } else {
                    numArr4[i17] = Integer.valueOf(numArr5[i17].intValue());
                }
            }
            fGR.put(Integer.valueOf(i3), numArr4);
            numArr5 = (Integer[]) fGS.get(Integer.valueOf(i3));
            if (numArr5 == null) {
                int[] iArr4;
                if (!isLeapYear2) {
                    numArr5 = new Integer[fGI.length];
                    i15 = 0;
                    while (true) {
                        iArr4 = fGI;
                        if (i15 >= iArr4.length) {
                            break;
                        }
                        numArr5[i15] = Integer.valueOf(iArr4[i15]);
                        i15++;
                    }
                } else {
                    numArr5 = new Integer[fGJ.length];
                    i15 = 0;
                    while (true) {
                        iArr4 = fGJ;
                        if (i15 >= iArr4.length) {
                            break;
                        }
                        numArr5[i15] = Integer.valueOf(iArr4[i15]);
                        i15++;
                    }
                }
            }
            numArr = new Integer[numArr5.length];
            for (i14 = 0; i14 < 12; i14++) {
                if (i14 == i9) {
                    numArr[i14] = Integer.valueOf(numArr5[i14].intValue() + i10);
                } else {
                    numArr[i14] = Integer.valueOf(numArr5[i14].intValue());
                }
            }
            fGS.put(Integer.valueOf(i3), numArr);
            Integer[] numArr6 = (Integer[]) fGS.get(Integer.valueOf(i));
            numArr = (Integer[]) fGS.get(Integer.valueOf(i3));
            Integer[] numArr7 = (Integer[]) fGR.get(Integer.valueOf(i));
            Integer[] numArr8 = (Integer[]) fGR.get(Integer.valueOf(i3));
            i7 = numArr6[i7].intValue();
            i9 = numArr[i9].intValue();
            i6 = numArr7[11].intValue() + numArr6[11].intValue();
            i8 = numArr8[11].intValue() + numArr[11].intValue();
            i10 = fGX[5].intValue();
            i16 = fGW[5].intValue();
            if (i10 < i7) {
                i10 = i7;
            }
            if (i10 < i9) {
                i10 = i9;
            }
            fGX[5] = Integer.valueOf(i10);
            if (i16 <= i7) {
                i7 = i16;
            }
            if (i7 > i9) {
                i7 = i9;
            }
            fGW[5] = Integer.valueOf(i7);
            i7 = fGX[6].intValue();
            i10 = fGW[6].intValue();
            if (i7 < i6) {
                i7 = i6;
            }
            if (i7 < i8) {
                i7 = i8;
            }
            fGX[6] = Integer.valueOf(i7);
            if (i10 <= i6) {
                i6 = i10;
            }
            if (i6 > i8) {
                i6 = i8;
            }
            fGW[6] = Integer.valueOf(i6);
        } else {
            throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    private static void bTh() {
        /*
        r0 = bTi();
        if (r0 == 0) goto L_0x0030;
    L_0x0006:
        r1 = 0;
        r2 = new java.io.BufferedReader;	 Catch:{ all -> 0x0029 }
        r3 = new java.io.InputStreamReader;	 Catch:{ all -> 0x0029 }
        r3.<init>(r0);	 Catch:{ all -> 0x0029 }
        r2.<init>(r3);	 Catch:{ all -> 0x0029 }
        r0 = 0;
    L_0x0012:
        r1 = r2.readLine();	 Catch:{ all -> 0x0026 }
        if (r1 == 0) goto L_0x0022;
    L_0x0018:
        r0 = r0 + 1;
        r1 = r1.trim();	 Catch:{ all -> 0x0026 }
        ac(r1, r0);	 Catch:{ all -> 0x0026 }
        goto L_0x0012;
    L_0x0022:
        r2.close();
        goto L_0x0030;
    L_0x0026:
        r0 = move-exception;
        r1 = r2;
        goto L_0x002a;
    L_0x0029:
        r0 = move-exception;
    L_0x002a:
        if (r1 == 0) goto L_0x002f;
    L_0x002c:
        r1.close();
    L_0x002f:
        throw r0;
    L_0x0030:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.chrono.HijrahDate.bTh():void");
    }

    private static void ac(String str, int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            str = stringTokenizer.nextToken();
            int indexOf = str.indexOf(58);
            String str2 = ".";
            StringBuilder stringBuilder;
            if (indexOf != -1) {
                try {
                    int parseInt = Integer.parseInt(str.substring(indexOf + 1, str.length()));
                    int indexOf2 = str.indexOf(45);
                    if (indexOf2 != -1) {
                        String substring = str.substring(0, indexOf2);
                        str = str.substring(indexOf2 + 1, indexOf);
                        indexOf2 = substring.indexOf(47);
                        indexOf = str.indexOf(47);
                        if (indexOf2 != -1) {
                            String substring2 = substring.substring(0, indexOf2);
                            String substring3 = substring.substring(indexOf2 + 1, substring.length());
                            try {
                                int parseInt2 = Integer.parseInt(substring2);
                                try {
                                    indexOf2 = Integer.parseInt(substring3);
                                    if (indexOf != -1) {
                                        String substring4 = str.substring(0, indexOf);
                                        str = str.substring(indexOf + 1, str.length());
                                        try {
                                            indexOf = Integer.parseInt(substring4);
                                            try {
                                                int parseInt3 = Integer.parseInt(str);
                                                if (parseInt2 == -1 || indexOf2 == -1 || indexOf == -1 || parseInt3 == -1) {
                                                    stringBuilder = new StringBuilder();
                                                    stringBuilder.append("Unknown error at line ");
                                                    stringBuilder.append(i);
                                                    stringBuilder.append(str2);
                                                    throw new ParseException(stringBuilder.toString(), i);
                                                }
                                                g(parseInt2, indexOf2, indexOf, parseInt3, parseInt);
                                            } catch (NumberFormatException unused) {
                                                stringBuilder = new StringBuilder();
                                                stringBuilder.append("End month is not properly set at line ");
                                                stringBuilder.append(i);
                                                stringBuilder.append(str2);
                                                throw new ParseException(stringBuilder.toString(), i);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("End year is not properly set at line ");
                                            stringBuilder.append(i);
                                            stringBuilder.append(str2);
                                            throw new ParseException(stringBuilder.toString(), i);
                                        }
                                    }
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("End year/month has incorrect format at line ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(str2);
                                    throw new ParseException(stringBuilder.toString(), i);
                                } catch (NumberFormatException unused3) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Start month is not properly set at line ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(str2);
                                    throw new ParseException(stringBuilder.toString(), i);
                                }
                            } catch (NumberFormatException unused4) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Start year is not properly set at line ");
                                stringBuilder.append(i);
                                stringBuilder.append(str2);
                                throw new ParseException(stringBuilder.toString(), i);
                            }
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Start year/month has incorrect format at line ");
                        stringBuilder.append(i);
                        stringBuilder.append(str2);
                        throw new ParseException(stringBuilder.toString(), i);
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Start and end year/month has incorrect format at line ");
                    stringBuilder.append(i);
                    stringBuilder.append(str2);
                    throw new ParseException(stringBuilder.toString(), i);
                } catch (NumberFormatException unused5) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Offset is not properly set at line ");
                    stringBuilder.append(i);
                    stringBuilder.append(str2);
                    throw new ParseException(stringBuilder.toString(), i);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Offset has incorrect format at line ");
            stringBuilder.append(i);
            stringBuilder.append(str2);
            throw new ParseException(stringBuilder.toString(), i);
        }
    }

    private static InputStream bTi() {
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        String str;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        if (property2 != null) {
            str = "file.separator";
            if (!(property2.length() == 0 && property2.endsWith(System.getProperty(str)))) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(property2);
                stringBuilder.append(System.getProperty(str));
                property2 = stringBuilder.toString();
            }
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(property2);
            stringBuilder2.append(fGO);
            stringBuilder2.append(property);
            File file = new File(stringBuilder2.toString());
            if (!file.exists()) {
                return null;
            }
            try {
                return new FileInputStream(file);
            } catch (IOException e) {
                throw e;
            }
        }
        StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), fGP);
        while (stringTokenizer.hasMoreTokens()) {
            property2 = stringTokenizer.nextToken();
            File file2 = new File(property2);
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(property2);
                    stringBuilder3.append(fGO);
                    stringBuilder3.append(fGQ);
                    if (new File(stringBuilder3.toString(), property).exists()) {
                        try {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(property2);
                            stringBuilder.append(fGO);
                            stringBuilder.append(fGQ);
                            stringBuilder.append(fGO);
                            stringBuilder.append(property);
                            return new FileInputStream(stringBuilder.toString());
                        } catch (IOException e2) {
                            throw e2;
                        }
                    }
                } else {
                    ZipFile zipFile;
                    try {
                        zipFile = new ZipFile(file2);
                    } catch (IOException unused) {
                        zipFile = null;
                    }
                    if (zipFile != null) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(fGQ);
                        stringBuilder2.append(fGO);
                        stringBuilder2.append(property);
                        str = stringBuilder2.toString();
                        ZipEntry entry = zipFile.getEntry(str);
                        if (entry == null) {
                            char c = fGO;
                            if (c == '/') {
                                str = str.replace('/', '\\');
                            } else if (c == '\\') {
                                str = str.replace('\\', '/');
                            }
                            entry = zipFile.getEntry(str);
                        }
                        if (entry != null) {
                            try {
                                return zipFile.getInputStream(entry);
                            } catch (IOException e22) {
                                throw e22;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeInt(get(ChronoField.YEAR));
        dataOutput.writeByte(get(ChronoField.MONTH_OF_YEAR));
        dataOutput.writeByte(get(ChronoField.DAY_OF_MONTH));
    }

    static a p(DataInput dataInput) {
        return HijrahChronology.fGC.L(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }
}

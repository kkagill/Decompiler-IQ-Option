package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.a.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.e;

public final class JapaneseEra extends a implements Serializable {
    public static final JapaneseEra fHs = new JapaneseEra(-1, LocalDate.G(1868, 9, 8), "Meiji");
    public static final JapaneseEra fHt = new JapaneseEra(0, LocalDate.G(1912, 7, 30), "Taisho");
    public static final JapaneseEra fHu = new JapaneseEra(1, LocalDate.G(1926, 12, 25), "Showa");
    public static final JapaneseEra fHv = new JapaneseEra(2, LocalDate.G(1989, 1, 8), "Heisei");
    private static final AtomicReference<JapaneseEra[]> fHw = new AtomicReference(new JapaneseEra[]{fHs, fHt, fHu, fHv});
    private static final long serialVersionUID = 1466499369062886794L;
    private final int eraValue;
    private final transient LocalDate fHx;
    private final transient String name;

    private static int nI(int i) {
        return i + 1;
    }

    private JapaneseEra(int i, LocalDate localDate, String str) {
        this.eraValue = i;
        this.fHx = localDate;
        this.name = str;
    }

    private Object readResolve() {
        try {
            return nH(this.eraValue);
        } catch (DateTimeException e) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e);
            throw invalidObjectException;
        }
    }

    public static JapaneseEra nH(int i) {
        JapaneseEra[] japaneseEraArr = (JapaneseEra[]) fHw.get();
        if (i >= fHs.eraValue && i <= japaneseEraArr[japaneseEraArr.length - 1].eraValue) {
            return japaneseEraArr[nI(i)];
        }
        throw new DateTimeException("japaneseEra is invalid");
    }

    public static JapaneseEra[] bTm() {
        JapaneseEra[] japaneseEraArr = (JapaneseEra[]) fHw.get();
        return (JapaneseEra[]) Arrays.copyOf(japaneseEraArr, japaneseEraArr.length);
    }

    static JapaneseEra e(LocalDate localDate) {
        if (localDate.c(fHs.fHx)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Date too early: ");
            stringBuilder.append(localDate);
            throw new DateTimeException(stringBuilder.toString());
        }
        JapaneseEra[] japaneseEraArr = (JapaneseEra[]) fHw.get();
        for (int length = japaneseEraArr.length - 1; length >= 0; length--) {
            JapaneseEra japaneseEra = japaneseEraArr[length];
            if (localDate.compareTo(japaneseEra.fHx) >= 0) {
                return japaneseEra;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public LocalDate bTn() {
        return this.fHx;
    }

    /* Access modifiers changed, original: 0000 */
    public LocalDate bTo() {
        int nI = nI(this.eraValue);
        JapaneseEra[] bTm = bTm();
        if (nI >= bTm.length - 1) {
            return LocalDate.fGb;
        }
        return bTm[nI + 1].bTn().dD(1);
    }

    public int getValue() {
        return this.eraValue;
    }

    public ValueRange range(e eVar) {
        if (eVar == ChronoField.ERA) {
            return JapaneseChronology.fHm.a(ChronoField.ERA);
        }
        return super.range(eVar);
    }

    public String toString() {
        return this.name;
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    /* Access modifiers changed, original: 0000 */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeByte(getValue());
    }

    static JapaneseEra q(DataInput dataInput) {
        return nH(dataInput.readByte());
    }
}

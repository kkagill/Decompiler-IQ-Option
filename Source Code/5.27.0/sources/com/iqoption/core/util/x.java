package com.iqoption.core.util;

import java.math.BigDecimal;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/util/MathUtils;", "", "()V", "calcPercent", "", "base", "value", "round", "places", "", "roundingMode", "core_release"})
/* compiled from: MathUtils.kt */
public final class x {
    public static final x bRe = new x();

    public final double e(double d, double d2) {
        return (d2 * 100.0d) / d;
    }

    private x() {
    }

    public final double g(double d, int i) {
        return a(d, i, 4);
    }

    public final double a(double d, int i, int i2) {
        try {
            d = new BigDecimal(Double.toString(d)).setScale(i, i2).doubleValue();
            return d;
        } catch (NumberFormatException unused) {
            return Double.isInfinite(d) ? d : Double.NaN;
        }
    }
}

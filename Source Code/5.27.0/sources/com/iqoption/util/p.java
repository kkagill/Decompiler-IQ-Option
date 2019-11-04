package com.iqoption.util;

import androidx.annotation.Nullable;

/* compiled from: DoubleUtils */
public final class p {
    @Nullable
    public static Double d(Double d, Double d2) {
        return (d == null || d2 == null) ? null : Double.valueOf(d.doubleValue() + d2.doubleValue());
    }
}

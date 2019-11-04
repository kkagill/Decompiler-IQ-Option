package com.iqoption.util;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.iqoption.app.b;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.f;
import com.iqoption.dto.Currencies;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.gl.c;
import com.iqoption.x.R;
import java.text.DecimalFormat;
import java.util.Locale;

/* compiled from: CurrencyUtils */
public class j {
    @ColorInt
    public static int a(Context context, Number number) {
        if (number.doubleValue() > 0.001d) {
            return ContextCompat.getColor(context, R.color.green);
        }
        if (number.doubleValue() < -0.001d) {
            return ContextCompat.getColor(context, R.color.red);
        }
        return ContextCompat.getColor(context, R.color.grey_blur_50);
    }

    public static String b(Number number) {
        if (number.doubleValue() > 0.001d) {
            return "+";
        }
        return number.doubleValue() < -0.001d ? "-" : "";
    }

    public static String DO() {
        return b.DG().DO();
    }

    public static int aWH() {
        return e(b.DG().DQ());
    }

    public static String p(Double d) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b((Number) d));
        stringBuilder.append(DO());
        return d(stringBuilder.toString(), Double.valueOf(Math.abs(d.doubleValue())));
    }

    public static String q(Double d) {
        return c(DO(), d);
    }

    public static String r(Double d) {
        return d(DO(), d);
    }

    public static String O(double d) {
        return String.format(Locale.US, DO(), new Object[]{u(Double.valueOf(d))});
    }

    public static String a(double d, DecimalFormat decimalFormat) {
        return String.format(Locale.US, DO(), new Object[]{decimalFormat.format(d)});
    }

    public static String b(String str, Double d) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b((Number) d));
        stringBuilder.append(str);
        return d(stringBuilder.toString(), Double.valueOf(Math.abs(d.doubleValue())));
    }

    public static String c(String str, Double d) {
        return String.format(Locale.US, str, new Object[]{s(d)});
    }

    public static String s(Double d) {
        double doubleValue = d.doubleValue();
        double intValue = (double) d.intValue();
        Double.isNaN(intValue);
        if (Math.abs(doubleValue - intValue) > 0.001d) {
            return u(d);
        }
        return t(d);
    }

    public static String d(String str, Double d) {
        return String.format(Locale.US, str, new Object[]{u(d)});
    }

    public static String a(String str, Double d, DecimalFormat decimalFormat) {
        return String.format(Locale.US, str, new Object[]{decimalFormat.format(d)});
    }

    public static String t(Double d) {
        return com.iqoption.core.util.j.fr(0).format(d);
    }

    public static String u(Double d) {
        return com.iqoption.core.util.j.fr(2).format(d);
    }

    public static String a(Double d, String str, Double d2) {
        return d(str, b(d2, d));
    }

    public static Double aWI() {
        return b(b.DG().DQ());
    }

    public static Double v(Double d) {
        return b(d, b(b.DG().DQ()));
    }

    public static Double b(Double d, Double d2) {
        return Double.valueOf(d.doubleValue() / d2.doubleValue());
    }

    public static Double c(Double d, Double d2) {
        return Double.valueOf(d.doubleValue() * d2.doubleValue());
    }

    public static void aWJ() {
        String mask;
        b DG = b.DG();
        ConversionCurrency DQ = DG.DQ();
        Double b = b(DQ);
        if (DQ != null) {
            mask = DQ.getMask();
        } else {
            mask = DG.DO();
        }
        c.aIy().setProfitMaskText(mask);
        c.aIy().setDollarRate(b.doubleValue());
    }

    public static double[] ae(@Nullable InstrumentType instrumentType) {
        Double minDealAmount;
        Double maxDealAmount;
        ConversionCurrency DQ = b.DG().DQ();
        String str = null;
        if (DQ != null) {
            str = DQ.name;
            minDealAmount = DQ.getMinDealAmount();
            maxDealAmount = DQ.getMaxDealAmount();
        } else {
            maxDealAmount = null;
            minDealAmount = maxDealAmount;
        }
        return f.a(instrumentType, str, minDealAmount, maxDealAmount);
    }

    public static Double b(ConversionCurrency conversionCurrency) {
        if (conversionCurrency == null || conversionCurrency.rateUsd == null || conversionCurrency.unit == null) {
            return Double.valueOf(1.0d);
        }
        return Double.valueOf(conversionCurrency.rateUsd.doubleValue() / conversionCurrency.unit.doubleValue());
    }

    public static String c(ConversionCurrency conversionCurrency) {
        return conversionCurrency == null ? Currencies.REPLACE_CURRENCY_MASK : conversionCurrency.getMask();
    }

    public static String d(ConversionCurrency conversionCurrency) {
        return conversionCurrency == null ? "" : conversionCurrency.getName();
    }

    public static int e(ConversionCurrency conversionCurrency) {
        return conversionCurrency == null ? 2 : conversionCurrency.getMinorUnits();
    }

    public static int f(ConversionCurrency conversionCurrency) {
        return conversionCurrency == null ? 6 : conversionCurrency.getMinorUnits();
    }

    public static DecimalFormat aWK() {
        return com.iqoption.core.util.j.fq(f(b.DG().du(Currencies.OTN_CURRENCY)));
    }

    public static double P(double d) {
        ConversionCurrency DQ = b.DG().DQ();
        String d2 = d(DQ);
        String str = Currencies.EUR_CURRENCY;
        if (str.equalsIgnoreCase(d2)) {
            return d;
        }
        return Math.ceil(b(c(Double.valueOf(d), b(b.DG().du(str))), b(DQ)).doubleValue());
    }
}

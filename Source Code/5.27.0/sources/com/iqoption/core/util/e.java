package com.iqoption.core.util;

import android.util.LruCache;
import com.iqoption.core.ext.c;
import com.iqoption.core.microservices.billing.response.deposit.d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.i;
import kotlin.jvm.internal.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a(\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u001c\u0010\u0010\u001a\u00020\u0004*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\u001a0\u0010\u0014\u001a\u00020\u0004*\u00020\u00152\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a:\u0010\u0014\u001a\u00020\u0004*\u00020\u00112\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u001c\u0010\u0017\u001a\u00020\u0004*\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u001a&\u0010\u0017\u001a\u00020\u0004*\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u001b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a>\u0010\u0017\u001a\u00020\u0004*\u00020\u00152\b\b\u0002\u0010\u0013\u001a\u00020\u00012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u0017\u001a\u00020\u0004*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u001a\u001c\u0010\u0017\u001a\u00020\u0004*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u001b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u001a&\u0010\u0017\u001a\u00020\u0004*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u001b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u001a^\u0010\u0017\u001a\u00020\u0004*\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\n\u0010\u001e\u001a\u00020\u0004*\u00020\u0015\u001a\u0014\u0010\u001e\u001a\u00020\u0004*\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0014\u0010\u001f\u001a\u00020\u0004*\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\n\u0010 \u001a\u00020\u0004*\u00020\u0011\u001a\n\u0010!\u001a\u00020\u0015*\u00020\u0004\u001a\n\u0010\"\u001a\u00020\u0011*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, bng = {"DEFAULT_PRECISION", "", "decimalFormatCache", "Landroid/util/LruCache;", "", "Ljava/text/DecimalFormat;", "decimalFormatSymbolsCache", "Ljava/text/DecimalFormatSymbols;", "getDecimalFormat", "pattern", "useGrouping", "", "rounding", "Ljava/math/RoundingMode;", "locale", "Ljava/util/Locale;", "appendSign", "", "formatted", "minorUnits", "format", "Ljava/math/BigDecimal;", "useSign", "formatAmount", "currency", "Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "softPattern", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "mask", "signAfterMask", "formatPercent", "formatSignedPercent", "formatUsdAmount", "parseToDecimal", "parseToDouble", "core_release"})
/* compiled from: CurrencyFormatting.kt */
public final class e {
    private static final LruCache<String, DecimalFormatSymbols> bQn = new LruCache(100);
    private static final LruCache<String, DecimalFormat> bQo = new LruCache(100);

    public static final String a(double d, int i, String str) {
        return a(d, i, str, false, false, false, false, null, null, 252, null);
    }

    public static final String a(double d, int i, String str, boolean z, boolean z2, boolean z3, boolean z4, RoundingMode roundingMode) {
        return a(d, i, str, z, z2, z3, z4, roundingMode, null, 128, null);
    }

    public static final String f(double d, int i) {
        return a(d, i, null, false, false, false, false, null, null, 254, null);
    }

    public static final String a(BigDecimal bigDecimal, d dVar, boolean z) {
        kotlin.jvm.internal.i.f(bigDecimal, "$this$formatAmount");
        kotlin.jvm.internal.i.f(dVar, "currency");
        return a(bigDecimal, 0, dVar.getMask(), z, false, null, 25, null);
    }

    public static final String a(BigDecimal bigDecimal, com.iqoption.core.microservices.configuration.a.d dVar, boolean z, boolean z2) {
        kotlin.jvm.internal.i.f(bigDecimal, "$this$formatAmount");
        kotlin.jvm.internal.i.f(dVar, "currency");
        return a(bigDecimal, 0, dVar.getMask(), z, z2, null, 17, null);
    }

    public static final String a(BigDecimal bigDecimal, int i, String str, boolean z, boolean z2, RoundingMode roundingMode) {
        kotlin.jvm.internal.i.f(bigDecimal, "$this$formatAmount");
        kotlin.jvm.internal.i.f(roundingMode, "rounding");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0.");
        stringBuilder.append(u.l(z ? "#" : "0", i));
        String a = a(bigDecimal, stringBuilder.toString(), z2, roundingMode, null, 8, null);
        if (str == null) {
            return a;
        }
        n nVar = n.eWf;
        Object[] objArr = new Object[]{a};
        a = String.format(str, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(a, "java.lang.String.format(format, *args)");
        return a;
    }

    public static /* synthetic */ String a(BigDecimal bigDecimal, String str, boolean z, RoundingMode roundingMode, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        if ((i & 8) != 0) {
            locale = Locale.US;
            kotlin.jvm.internal.i.e(locale, "Locale.US");
        }
        return a(bigDecimal, str, z, roundingMode, locale);
    }

    public static final String a(BigDecimal bigDecimal, String str, boolean z, RoundingMode roundingMode, Locale locale) {
        kotlin.jvm.internal.i.f(bigDecimal, "$this$format");
        kotlin.jvm.internal.i.f(str, "pattern");
        kotlin.jvm.internal.i.f(roundingMode, "rounding");
        kotlin.jvm.internal.i.f(locale, "locale");
        String format = a(str, z, roundingMode, locale).format(bigDecimal);
        kotlin.jvm.internal.i.e(format, "formatter.format(this)");
        return format;
    }

    public static final String a(double d, RoundingMode roundingMode) {
        kotlin.jvm.internal.i.f(roundingMode, "rounding");
        return a(d, "#.##'%'", false, false, roundingMode, null, 20, null);
    }

    public static /* synthetic */ String b(double d, RoundingMode roundingMode, int i, Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return b(d, roundingMode);
    }

    public static final String b(double d, RoundingMode roundingMode) {
        kotlin.jvm.internal.i.f(roundingMode, "rounding");
        return a(d, "#.##'%'", false, true, roundingMode, null, 16, null);
    }

    public static final String a(double d, com.iqoption.core.microservices.configuration.a.d dVar, boolean z) {
        com.iqoption.core.microservices.configuration.a.d dVar2 = dVar;
        kotlin.jvm.internal.i.f(dVar, "currency");
        return a(d, 0, dVar.getMask(), z, false, false, false, null, null, 249, null);
    }

    public static final String a(double d, d dVar, boolean z) {
        d dVar2 = dVar;
        kotlin.jvm.internal.i.f(dVar, "currency");
        return a(d, 0, dVar.getMask(), z, false, false, false, null, null, 249, null);
    }

    public static /* synthetic */ String a(double d, int i, String str, boolean z, boolean z2, boolean z3, boolean z4, RoundingMode roundingMode, Locale locale, int i2, Object obj) {
        Locale locale2;
        int i3 = i2;
        int i4 = (i3 & 1) != 0 ? 2 : i;
        String str2 = (i3 & 2) != 0 ? (String) null : str;
        boolean z5 = false;
        boolean z6 = (i3 & 4) != 0 ? false : z;
        boolean z7 = true;
        boolean z8 = (i3 & 8) != 0 ? true : z2;
        if ((i3 & 16) == 0) {
            z5 = z3;
        }
        if ((i3 & 32) == 0) {
            z7 = z4;
        }
        RoundingMode roundingMode2 = (i3 & 64) != 0 ? RoundingMode.HALF_UP : roundingMode;
        if ((i3 & 128) != 0) {
            locale2 = Locale.US;
            kotlin.jvm.internal.i.e(locale2, "Locale.US");
        } else {
            locale2 = locale;
        }
        return a(d, i4, str2, z6, z8, z5, z7, roundingMode2, locale2);
    }

    public static final String a(double d, int i, String str, boolean z, boolean z2, boolean z3, boolean z4, RoundingMode roundingMode, Locale locale) {
        int i2 = i;
        String str2 = str;
        kotlin.jvm.internal.i.f(roundingMode, "rounding");
        kotlin.jvm.internal.i.f(locale, "locale");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0.");
        stringBuilder.append(u.l(z ? "#" : "0", i));
        String stringBuilder2 = stringBuilder.toString();
        boolean z5 = z3 && !z4;
        String a = a(d, stringBuilder2, z2, z5, roundingMode, locale);
        if (str2 != null) {
            Locale locale2 = Locale.US;
            kotlin.jvm.internal.i.e(locale2, "Locale.US");
            Object[] objArr = new Object[]{a};
            a = String.format(locale2, str, Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(a, "java.lang.String.format(locale, this, *args)");
        }
        if (!z3 || !z4) {
            return a;
        }
        double d2 = d;
        return a(d, a, i);
    }

    public static final String a(double d, String str, boolean z, boolean z2, RoundingMode roundingMode, Locale locale) {
        kotlin.jvm.internal.i.f(str, "pattern");
        kotlin.jvm.internal.i.f(roundingMode, "rounding");
        kotlin.jvm.internal.i.f(locale, "locale");
        double abs = Math.abs(d);
        DecimalFormat a = a(str, z, roundingMode, locale);
        Object format = a.format(abs);
        String str2 = "formatted";
        if (z2) {
            kotlin.jvm.internal.i.e(format, str2);
            format = a(d, (String) format, a.getMaximumFractionDigits());
        }
        kotlin.jvm.internal.i.e(format, str2);
        return format;
    }

    private static final DecimalFormat a(String str, boolean z, RoundingMode roundingMode, Locale locale) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(locale);
        stringBuilder.append("|useGrouping:");
        stringBuilder.append(z);
        String stringBuilder2 = stringBuilder.toString();
        DecimalFormatSymbols decimalFormatSymbols = (DecimalFormatSymbols) bQn.get(stringBuilder2);
        if (decimalFormatSymbols == null) {
            DecimalFormatSymbols decimalFormatSymbols2;
            synchronized (bQn) {
                decimalFormatSymbols2 = new DecimalFormatSymbols(locale);
                if (z) {
                    decimalFormatSymbols2.setGroupingSeparator(',');
                }
                bQn.put(stringBuilder2, decimalFormatSymbols2);
            }
            decimalFormatSymbols = decimalFormatSymbols2;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("|locale:");
        stringBuilder.append(locale);
        stringBuilder.append("|useGrouping:");
        stringBuilder.append(z);
        String stringBuilder3 = stringBuilder.toString();
        DecimalFormat decimalFormat = (DecimalFormat) bQo.get(stringBuilder3);
        if (decimalFormat != null) {
            return decimalFormat;
        }
        DecimalFormat decimalFormat2;
        synchronized (bQo) {
            decimalFormat2 = new DecimalFormat(str);
            if (z) {
                decimalFormat2.setGroupingUsed(true);
            }
            decimalFormat2.setDecimalFormatSymbols(decimalFormatSymbols);
            decimalFormat2.setRoundingMode(roundingMode);
            bQo.put(stringBuilder3, decimalFormat2);
        }
        return decimalFormat2;
    }

    private static final String a(double d, String str, int i) {
        int c = c.c(d, 0.0d, c.e(1.0d, i));
        StringBuilder stringBuilder;
        if (c == -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append('-');
            stringBuilder.append(str);
            return stringBuilder.toString();
        } else if (c != 1) {
            return str;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append('+');
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
    }

    public static final String q(double d) {
        return a(d, 0, "$%s", false, false, false, false, null, null, 253, null);
    }

    public static final double ho(String str) {
        kotlin.jvm.internal.i.f(str, "$this$parseToDouble");
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        Locale locale = Locale.US;
        kotlin.jvm.internal.i.e(locale, "Locale.US");
        return a("#.#", true, roundingMode, locale).parse(str).doubleValue();
    }
}

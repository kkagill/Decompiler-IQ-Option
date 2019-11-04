package com.iqoption.core.util;

import android.text.TextUtils;
import android.text.TextUtils.SimpleStringSplitter;
import android.util.Patterns;
import androidx.annotation.IntRange;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.n;
import kotlin.text.Regex;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020 H\u0007J\u0017\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0007J\u0017\u0010%\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0002\u0010(J\u0017\u0010%\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0002\u0010#J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0007J\u0017\u0010*\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0002\u0010(J\u0017\u0010*\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0002\u0010#J$\u0010+\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'2\b\b\u0003\u0010,\u001a\u00020 2\b\b\u0002\u0010-\u001a\u00020.H\u0007J\u0017\u0010+\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0002\u0010(J\u0017\u0010+\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0002\u0010#J.\u0010/\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'2\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0003\u0010,\u001a\u00020 2\b\b\u0002\u0010-\u001a\u00020.H\u0007J\u0018\u00101\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'2\u0006\u0010,\u001a\u00020 H\u0007J.\u00101\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'2\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0003\u0010,\u001a\u00020 2\b\b\u0002\u0010-\u001a\u00020.H\u0007J\u0010\u00101\u001a\u00020\u00042\u0006\u0010&\u001a\u00020 H\u0007J\u0010\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u000204H\u0007J\u0010\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u000207H\u0002J\u0012\u00108\u001a\u00020.2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020;H\u0003J>\u0010<\u001a\u00020\u0004\"\u0004\b\u0000\u0010=\"\u0004\b\u0001\u0010>2\u0006\u0010?\u001a\u00020\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u0002H=0A2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u0002H=\u0012\u0004\u0012\u0002H>0CH\u0007J\u0010\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u0004H\u0007J\u0018\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u0004H\u0007J\u0010\u0010I\u001a\u00020.2\u0006\u0010J\u001a\u000204H\u0007J\u0010\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u00020\u0004H\u0007J\u0010\u0010M\u001a\u00020\u00042\u0006\u0010N\u001a\u00020OH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006P"}, bng = {"Lcom/iqoption/core/util/StringUtil;", "", "()V", "BILLION_MASK", "", "BRACKETS_MASK", "CONCAT_EQUALLY_MASK", "CONCAT_MASK", "EMPTY_MASK", "JSON_PATTERN", "MILLION_MASK", "NEGATIVE_MASK", "PERCENT_DOUBLE_MASK", "PERCENT_MASK", "PERCENT_NEGATIVE_DOUBLE_MASK", "PERCENT_NEGATIVE_MASK", "PERCENT_POSITIVE_DOUBLE_MASK", "PERCENT_POSITIVE_MASK", "PERCENT_STRING_MASK", "POSITIVE_MASK", "THOUSAND_MASK", "TRILLION_MASK", "clearLineSeparator", "text", "emptyIfNull", "s", "extractJsonFromString", "str", "token", "firstUpperLetterTransform", "formatMultiplier", "multiplier", "", "formatedBrackets", "value", "(Ljava/lang/Integer;)Ljava/lang/String;", "formatedNegative", "formatedNegativePercent", "percent", "", "(Ljava/lang/Double;)Ljava/lang/String;", "formatedPositive", "formatedPositivePercent", "formattedPercent", "precision", "isHard", "", "formattedSign", "sign", "formattedSignPercent", "getNumbers", "cc", "", "getSign", "val", "", "isEmpty", "isNumber", "c", "", "join", "T", "S", "delimiter", "collection", "", "function", "Lcom/google/common/base/Function;", "toUpperCamelWithSpace", "src", "transformMask", "mask", "transformation", "validateEmail", "email", "validatePhone", "number", "volumeElapsed", "volume", "", "core_release"})
/* compiled from: StringUtil.kt */
public final class af {
    public static final af bRn = new af();

    private static final boolean E(char c) {
        return '0' <= c && '9' >= c;
    }

    public static final String b(double d, String str) {
        return a(d, str, 0, false, 12, null);
    }

    public static final String b(double d, String str, @IntRange(from = 0, to = 4) int i) {
        return a(d, str, i, false, 8, null);
    }

    public static final String r(double d) {
        return a(d, null, 0, false, 14, null);
    }

    public static final String s(double d) {
        return a(d, 0, false, 6, null);
    }

    private af() {
    }

    public static final boolean G(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "email");
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }

    public static final boolean isEmpty(String str) {
        if (str != null) {
            if (!((((CharSequence) str).length() == 0 ? 1 : null) != null || kotlin.jvm.internal.i.y(str, "null") || kotlin.jvm.internal.i.y(str, "Null"))) {
                return false;
            }
        }
        return true;
    }

    public static final String as(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "str");
        int a = str2 == null ? 0 : v.a((CharSequence) str, str2, 0, false, 6, null);
        if (a != -1) {
            Pattern compile = Pattern.compile("\\{# Match an opening brace.       \n(?:           # Match either...                                      \n \"           #  a quoted string,                                    \n (?:          #  which may contain either...                         \n  \\\\.       #   escaped characters                                 \n |            #  or                                                  \n  [^\"\\\\]   #   any other characters except quotes and backslashes \n )*           #  any number of times,                                \n \"           #  and ends with a quote.                              \n|             # Or match...                                          \n [^\"{}]*     #  any number of characters besides quotes and braces. \n)*            # Repeat as needed.                                    \n\\}           # Then match a closing brace.", 4);
            str = str.substring(a);
            kotlin.jvm.internal.i.e(str, "(this as java.lang.String).substring(startIndex)");
            Matcher matcher = compile.matcher(str);
            if (matcher.find()) {
                return matcher.group(0);
            }
        }
        return null;
    }

    public static final String ht(String str) {
        kotlin.jvm.internal.i.f(str, "src");
        SimpleStringSplitter simpleStringSplitter = new SimpleStringSplitter(' ');
        simpleStringSplitter.setString(str);
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = simpleStringSplitter.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            kotlin.jvm.internal.i.e(str2, "s");
            if ((((CharSequence) str2).length() > 0 ? 1 : null) != null) {
                if ((((CharSequence) stringBuilder).length() > 0 ? 1 : null) != null) {
                    stringBuilder.append(' ');
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                String substring = str2.substring(0, 1);
                kotlin.jvm.internal.i.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Locale locale = Locale.getDefault();
                kotlin.jvm.internal.i.e(locale, "Locale.getDefault()");
                if (substring != null) {
                    substring = substring.toUpperCase(locale);
                    kotlin.jvm.internal.i.e(substring, "(this as java.lang.String).toUpperCase(locale)");
                    stringBuilder2.append(substring);
                    if (str2.length() > 1) {
                        str2 = str2.substring(1);
                        kotlin.jvm.internal.i.e(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        str2 = "";
                    }
                    stringBuilder2.append(str2);
                    stringBuilder.append(stringBuilder2.toString());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        str = stringBuilder.toString();
        kotlin.jvm.internal.i.e(str, "sb.toString()");
        return str;
    }

    public static final String i(Integer num) {
        n nVar = n.eWf;
        Locale locale = Locale.US;
        kotlin.jvm.internal.i.e(locale, "Locale.US");
        Object[] objArr = new Object[]{num};
        String format = String.format(locale, "%d%%", Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final String d(Double d) {
        n nVar = n.eWf;
        Locale locale = Locale.US;
        kotlin.jvm.internal.i.e(locale, "Locale.US");
        Object[] objArr = new Object[]{d};
        String format = String.format(locale, "+%.1f%%", Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final String e(Double d) {
        n nVar = n.eWf;
        Locale locale = Locale.US;
        kotlin.jvm.internal.i.e(locale, "Locale.US");
        Object[] objArr = new Object[]{d};
        String format = String.format(locale, "-%.1f%%", Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final String hu(String str) {
        kotlin.jvm.internal.i.f(str, "str");
        n nVar = n.eWf;
        Object[] objArr = new Object[]{str};
        str = String.format("+%s", Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String hv(String str) {
        kotlin.jvm.internal.i.f(str, "str");
        n nVar = n.eWf;
        Object[] objArr = new Object[]{str};
        str = String.format("-%s", Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(str, "java.lang.String.format(format, *args)");
        return str;
    }

    private final String b(Number number) {
        if (number.doubleValue() > 0.001d) {
            return "+";
        }
        return number.doubleValue() < -0.001d ? "-" : "";
    }

    public static final String fs(int i) {
        return a((double) i, bRn.b(Integer.valueOf(i)), 0, false, 8, null);
    }

    public static final String h(double d, int i) {
        return a(d, bRn.b(Double.valueOf(d)), i, false, 8, null);
    }

    public static /* synthetic */ String a(double d, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = bRn.b(Double.valueOf(d));
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        return a(d, str, i, z);
    }

    public static final String a(double d, String str, @IntRange(from = 0, to = 4) int i, boolean z) {
        kotlin.jvm.internal.i.f(str, "sign");
        String format = (z ? j.fr(i) : j.fq(i)).format(Math.abs(d));
        n nVar = n.eWf;
        Locale locale = Locale.US;
        kotlin.jvm.internal.i.e(locale, "Locale.US");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("%s%%");
        str = stringBuilder.toString();
        Object[] objArr = new Object[]{format};
        format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static /* synthetic */ String a(double d, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return a(d, i, z);
    }

    public static final String a(double d, @IntRange(from = 0, to = 4) int i, boolean z) {
        String format = (z ? j.fr(i) : j.fq(i)).format(d);
        n nVar = n.eWf;
        Locale locale = Locale.US;
        kotlin.jvm.internal.i.e(locale, "Locale.US");
        Object[] objArr = new Object[]{format};
        format = String.format(locale, "%s%%", Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final String H(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "cc");
        StringBuilder stringBuilder = new StringBuilder(16);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (E(charAt)) {
                stringBuilder.append(charAt);
            }
        }
        String stringBuilder2 = stringBuilder.toString();
        kotlin.jvm.internal.i.e(stringBuilder2, "sb.toString()");
        return stringBuilder2;
    }

    public static final String ft(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('x');
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public static final String at(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "mask");
        kotlin.jvm.internal.i.f(str2, "transformation");
        n nVar = n.eWf;
        Object[] objArr = new Object[]{str2};
        str = String.format(str, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String hw(String str) {
        kotlin.jvm.internal.i.f(str, "text");
        CharSequence charSequence = str;
        String property = System.getProperty("line.separator");
        kotlin.jvm.internal.i.e(property, "System.getProperty(\"line.separator\")");
        return new Regex(property).c(charSequence, "");
    }

    public static final String bn(long j) {
        long j2 = j / 1000000000000L;
        j %= 1000000000000L;
        long j3 = j / 1000000000;
        j %= 1000000000;
        long j4 = j / 1000000;
        j %= 1000000;
        String str = "java.lang.String.format(format, *args)";
        n nVar;
        Object[] objArr;
        String format;
        if (j2 > 0) {
            nVar = n.eWf;
            objArr = new Object[]{Long.valueOf(j2)};
            format = String.format("$%dT", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, str);
            return format;
        } else if (j3 > 0) {
            nVar = n.eWf;
            objArr = new Object[]{Long.valueOf(j3)};
            format = String.format("$%dB", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, str);
            return format;
        } else if (j4 > 0) {
            nVar = n.eWf;
            objArr = new Object[]{Long.valueOf(j4)};
            format = String.format("$%dM", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, str);
            return format;
        } else {
            n nVar2 = n.eWf;
            Object[] objArr2 = new Object[]{Long.valueOf(j)};
            format = String.format("$%d", Arrays.copyOf(objArr2, objArr2.length));
            kotlin.jvm.internal.i.e(format, str);
            return format;
        }
    }
}

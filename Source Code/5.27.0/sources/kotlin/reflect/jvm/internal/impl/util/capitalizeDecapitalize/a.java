package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import kotlin.jvm.internal.i;

/* compiled from: capitalizeDecapitalize.kt */
public final class a {
    public static final String D(String str, boolean z) {
        i.f(str, "$this$decapitalizeSmart");
        CapitalizeDecapitalizeKt$decapitalizeSmart$1 capitalizeDecapitalizeKt$decapitalizeSmart$1 = new CapitalizeDecapitalizeKt$decapitalizeSmart$1(str, z);
        CharSequence charSequence = str;
        if ((charSequence.length() == 0 ? 1 : null) == null && capitalizeDecapitalizeKt$decapitalizeSmart$1.mB(0)) {
            if (str.length() == 1 || !capitalizeDecapitalizeKt$decapitalizeSmart$1.mB(1)) {
                str = z ? mQ(str) : u.mZ(str);
            } else {
                CapitalizeDecapitalizeKt$decapitalizeSmart$2 capitalizeDecapitalizeKt$decapitalizeSmart$2 = new CapitalizeDecapitalizeKt$decapitalizeSmart$2(z);
                for (Object next : v.Z(charSequence)) {
                    if ((capitalizeDecapitalizeKt$decapitalizeSmart$1.mB(((Number) next).intValue()) ^ 1) != 0) {
                        break;
                    }
                }
                Object next2 = null;
                Integer num = (Integer) next2;
                if (num == null) {
                    return capitalizeDecapitalizeKt$decapitalizeSmart$2.invoke(str);
                }
                int intValue = num.intValue() - 1;
                StringBuilder stringBuilder = new StringBuilder();
                String substring = str.substring(0, intValue);
                i.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                stringBuilder.append(capitalizeDecapitalizeKt$decapitalizeSmart$2.invoke(substring));
                str = str.substring(intValue);
                i.e(str, "(this as java.lang.String).substring(startIndex)");
                stringBuilder.append(str);
                return stringBuilder.toString();
            }
        }
        return str;
    }

    public static final String mP(String str) {
        i.f(str, "$this$capitalizeAsciiOnly");
        if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && 'z' >= charAt) {
            charAt = Character.toUpperCase(charAt);
            str = str.substring(1);
            i.e(str, "(this as java.lang.String).substring(startIndex)");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(charAt));
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        return str;
    }

    public static final String mQ(String str) {
        i.f(str, "$this$decapitalizeAsciiOnly");
        if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && 'Z' >= charAt) {
            charAt = Character.toLowerCase(charAt);
            str = str.substring(1);
            i.e(str, "(this as java.lang.String).substring(startIndex)");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(charAt));
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        return str;
    }

    public static final String mR(String str) {
        i.f(str, "$this$toLowerCaseAsciiOnly");
        StringBuilder stringBuilder = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && 'Z' >= charAt) {
                charAt = Character.toLowerCase(charAt);
            }
            stringBuilder.append(charAt);
        }
        str = stringBuilder.toString();
        i.e(str, "builder.toString()");
        return str;
    }
}

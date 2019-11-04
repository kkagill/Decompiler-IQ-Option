package androidx.core.os;

import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.util.Locale;

@RestrictTo({Scope.LIBRARY_GROUP})
final class LocaleHelper {
    static Locale forLanguageTag(String str) {
        String str2 = "-";
        String[] split;
        if (str.contains(str2)) {
            split = str.split(str2, -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        }
        str2 = "_";
        if (!str.contains(str2)) {
            return new Locale(str);
        }
        split = str.split(str2, -1);
        if (split.length > 2) {
            return new Locale(split[0], split[1], split[2]);
        }
        if (split.length > 1) {
            return new Locale(split[0], split[1]);
        }
        if (split.length == 1) {
            return new Locale(split[0]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not parse language tag: [");
        stringBuilder.append(str);
        stringBuilder.append("]");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static String toLanguageTag(Locale locale) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!(country == null || country.isEmpty())) {
            stringBuilder.append("-");
            stringBuilder.append(locale.getCountry());
        }
        return stringBuilder.toString();
    }

    private LocaleHelper() {
    }
}

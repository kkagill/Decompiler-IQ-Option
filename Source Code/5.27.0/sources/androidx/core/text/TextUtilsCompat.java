package androidx.core.text;

import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

public final class TextUtilsCompat {
    private static final String ARAB_SCRIPT_SUBTAG = "Arab";
    private static final String HEBR_SCRIPT_SUBTAG = "Hebr";
    private static final Locale ROOT;

    static {
        String str = "";
        ROOT = new Locale(str, str);
    }

    @NonNull
    public static String htmlEncode(@NonNull String str) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.htmlEncode(str);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                stringBuilder.append("&quot;");
            } else if (charAt == '<') {
                stringBuilder.append("&lt;");
            } else if (charAt == '>') {
                stringBuilder.append("&gt;");
            } else if (charAt == '&') {
                stringBuilder.append("&amp;");
            } else if (charAt != '\'') {
                stringBuilder.append(charAt);
            } else {
                stringBuilder.append("&#39;");
            }
        }
        return stringBuilder.toString();
    }

    public static int getLayoutDirectionFromLocale(@Nullable Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (!(locale == null || locale.equals(ROOT))) {
            String maximizeAndGetScript = ICUCompat.maximizeAndGetScript(locale);
            if (maximizeAndGetScript == null) {
                return getLayoutDirectionFromFirstChar(locale);
            }
            if (maximizeAndGetScript.equalsIgnoreCase(ARAB_SCRIPT_SUBTAG) || maximizeAndGetScript.equalsIgnoreCase(HEBR_SCRIPT_SUBTAG)) {
                return 1;
            }
        }
        return 0;
    }

    private static int getLayoutDirectionFromFirstChar(@NonNull Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == (byte) 1 || directionality == (byte) 2) ? 1 : 0;
    }

    private TextUtilsCompat() {
    }
}

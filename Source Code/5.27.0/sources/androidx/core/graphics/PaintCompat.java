package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;

public final class PaintCompat {
    private static final String EM_STRING = "m";
    private static final String TOFU_STRING = "󟿽";
    private static final ThreadLocal<Pair<Rect, Rect>> sRectThreadLocal = new ThreadLocal();

    public static boolean hasGlyph(@NonNull Paint paint, @NonNull String str) {
        if (VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        String str2 = TOFU_STRING;
        float measureText = paint.measureText(str2);
        float measureText2 = paint.measureText(EM_STRING);
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        Pair obtainEmptyRects = obtainEmptyRects();
        paint.getTextBounds(str2, 0, 2, (Rect) obtainEmptyRects.first);
        paint.getTextBounds(str, 0, length, (Rect) obtainEmptyRects.second);
        return ((Rect) obtainEmptyRects.first).equals(obtainEmptyRects.second) ^ 1;
    }

    private static Pair<Rect, Rect> obtainEmptyRects() {
        Pair pair = (Pair) sRectThreadLocal.get();
        if (pair == null) {
            Pair<Rect, Rect> pair2 = new Pair(new Rect(), new Rect());
            sRectThreadLocal.set(pair2);
            return pair2;
        }
        ((Rect) pair.first).setEmpty();
        ((Rect) pair.second).setEmpty();
        return pair;
    }

    private PaintCompat() {
    }
}

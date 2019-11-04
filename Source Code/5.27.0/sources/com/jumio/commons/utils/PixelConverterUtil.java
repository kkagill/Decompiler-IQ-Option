package com.jumio.commons.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class PixelConverterUtil {
    private static final float DEFAULT = 0.56f;
    private static final float HDPI = 0.5f;
    private static final float HDPI_FONT = 0.5f;
    private static final float MDPI = 0.5f;
    private static final float MDPI_FONT = 0.67f;
    private static final float XHDPI = 0.56f;
    private static final float XHDPI_FONT = 0.56f;
    private static final float XXHDPI = 0.56f;
    private static final float XXHDPI_FONT = 0.56f;

    public static int getPxFromPt(Context context, int i) {
        return getPxFromPt(context, i, false);
    }

    public static int getPxFromPt(Context context, int i, boolean z) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = displayMetrics.densityDpi;
        if (i2 == 120 || i2 == 160) {
            return (int) TypedValue.applyDimension(3, z ? ((float) i) * MDPI_FONT : ((float) i) * 0.5f, displayMetrics);
        } else if (i2 == 240) {
            return (int) TypedValue.applyDimension(3, ((float) i) * 0.5f, displayMetrics);
        } else {
            if (i2 == 320) {
                return (int) TypedValue.applyDimension(3, ((float) i) * 0.56f, displayMetrics);
            }
            if (i2 != 480) {
                return (int) TypedValue.applyDimension(3, ((float) i) * 0.56f, displayMetrics);
            }
            return (int) TypedValue.applyDimension(3, ((float) i) * 0.56f, displayMetrics);
        }
    }
}

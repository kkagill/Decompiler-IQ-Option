package com.jumio.gui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;

public class Colors {
    public static final int DIALOG_NEGATIVE_ACTION_COLOR = -10066330;
    public static final int DIALOG_POSITIVE_ACTION_COLOR = -6832627;

    public static int parseColor(Context context, int i, int i2) {
        int[] iArr = new int[]{i};
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(iArr);
            int color = typedArray.getColor(0, i2);
            return color;
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }

    public static ColorStateList parseColorStateList(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList == null) {
            i = obtainStyledAttributes.getColor(0, 0);
            if (i == 0) {
                i = i2;
            }
            colorStateList = ColorStateList.valueOf(i);
        }
        obtainStyledAttributes.recycle();
        return colorStateList;
    }

    public static ColorStateList constructList(int i, int i2, int i3) {
        int[][] iArr = new int[4][];
        iArr[0] = new int[]{16842910};
        iArr[1] = new int[]{-16842910};
        iArr[2] = new int[]{16842919};
        iArr[3] = new int[0];
        return new ColorStateList(iArr, new int[]{i, i2, i3, i});
    }
}

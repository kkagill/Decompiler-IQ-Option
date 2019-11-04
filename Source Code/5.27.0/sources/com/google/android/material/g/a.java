package com.google.android.material.g;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.StateSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.core.graphics.ColorUtils;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: RippleUtils */
public class a {
    private static final int[] FOCUSED_STATE_SET = new int[]{16842908};
    public static final boolean Lh = (VERSION.SDK_INT >= 21);
    private static final int[] Li = new int[]{16843623, 16842908};
    private static final int[] Lj = new int[]{16843623};
    private static final int[] Lk = new int[]{16842913, 16842919};
    private static final int[] Ll = new int[]{16842913, 16843623, 16842908};
    private static final int[] Lm = new int[]{16842913, 16842908};
    private static final int[] Ln = new int[]{16842913, 16843623};
    private static final int[] PRESSED_STATE_SET = new int[]{16842919};
    private static final int[] SELECTED_STATE_SET = new int[]{16842913};

    @NonNull
    public static ColorStateList d(@Nullable ColorStateList colorStateList) {
        if (Lh) {
            r0 = new int[2][];
            int[] iArr = new int[]{SELECTED_STATE_SET, a(colorStateList, Lk)};
            r0[1] = StateSet.NOTHING;
            iArr[1] = a(colorStateList, PRESSED_STATE_SET);
            return new ColorStateList(r0, iArr);
        }
        r4 = new int[10][];
        int[] iArr2 = new int[10];
        int[] iArr3 = Lk;
        r4[0] = iArr3;
        iArr2[0] = a(colorStateList, iArr3);
        iArr3 = Ll;
        r4[1] = iArr3;
        iArr2[1] = a(colorStateList, iArr3);
        int[] iArr4 = Lm;
        r4[2] = iArr4;
        iArr2[2] = a(colorStateList, iArr4);
        iArr4 = Ln;
        r4[3] = iArr4;
        iArr2[3] = a(colorStateList, iArr4);
        r4[4] = SELECTED_STATE_SET;
        iArr2[4] = 0;
        iArr4 = PRESSED_STATE_SET;
        r4[5] = iArr4;
        iArr2[5] = a(colorStateList, iArr4);
        iArr4 = Li;
        r4[6] = iArr4;
        iArr2[6] = a(colorStateList, iArr4);
        iArr4 = FOCUSED_STATE_SET;
        r4[7] = iArr4;
        iArr2[7] = a(colorStateList, iArr4);
        iArr4 = Lj;
        r4[8] = iArr4;
        iArr2[8] = a(colorStateList, iArr4);
        r4[9] = StateSet.NOTHING;
        iArr2[9] = 0;
        return new ColorStateList(r4, iArr2);
    }

    @ColorInt
    private static int a(@Nullable ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return Lh ? aN(colorForState) : colorForState;
    }

    @TargetApi(21)
    @ColorInt
    private static int aN(@ColorInt int i) {
        return ColorUtils.setAlphaComponent(i, Math.min(Color.alpha(i) * 2, 255));
    }
}

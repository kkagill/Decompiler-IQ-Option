package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.a.b;
import com.google.android.material.a.k;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: ThemeEnforcement */
public final class g {
    private static final int[] Fy = new int[]{b.colorPrimary};
    private static final int[] Lf = new int[]{b.colorSecondary};

    public static TypedArray a(Context context, AttributeSet attributeSet, @StyleableRes int[] iArr, @AttrRes int i, @StyleRes int i2, @StyleableRes int... iArr2) {
        a(context, attributeSet, i, i2);
        c(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static TintTypedArray b(Context context, AttributeSet attributeSet, @StyleableRes int[] iArr, @AttrRes int i, @StyleRes int i2, @StyleableRes int... iArr2) {
        a(context, attributeSet, i, i2);
        c(context, attributeSet, iArr, i, i2, iArr2);
        return TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i, i2);
    }

    private static void a(Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(k.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            am(context);
        }
        al(context);
    }

    private static void c(Context context, AttributeSet attributeSet, @StyleableRes int[] iArr, @AttrRes int i, @StyleRes int i2, @StyleableRes int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ThemeEnforcement, i, i2);
        if (obtainStyledAttributes.getBoolean(k.ThemeEnforcement_enforceTextAppearance, false)) {
            boolean d = (iArr2 == null || iArr2.length == 0) ? obtainStyledAttributes.getResourceId(k.ThemeEnforcement_android_textAppearance, -1) != -1 : d(context, attributeSet, iArr, i, i2, iArr2);
            obtainStyledAttributes.recycle();
            if (!d) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
            return;
        }
        obtainStyledAttributes.recycle();
    }

    private static boolean d(Context context, AttributeSet attributeSet, @StyleableRes int[] iArr, @AttrRes int i, @StyleRes int i2, @StyleableRes int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i22 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i22, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static void al(Context context) {
        a(context, Fy, "Theme.AppCompat");
    }

    public static void am(Context context) {
        a(context, Lf, "Theme.MaterialComponents");
    }

    private static boolean a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    private static void a(Context context, int[] iArr, String str) {
        if (!a(context, iArr)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The style on this component requires your app theme to be ");
            stringBuilder.append(str);
            stringBuilder.append(" (or a descendant).");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

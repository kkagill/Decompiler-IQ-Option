package com.google.android.material.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: MaterialResources */
public class a {
    @Nullable
    public static ColorStateList a(Context context, TypedArray typedArray, @StyleableRes int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList colorStateList = AppCompatResources.getColorStateList(context, resourceId);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    @Nullable
    public static Drawable b(Context context, TypedArray typedArray, @StyleableRes int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable drawable = AppCompatResources.getDrawable(context, resourceId);
                if (drawable != null) {
                    return drawable;
                }
            }
        }
        return typedArray.getDrawable(i);
    }
}

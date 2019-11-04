package com.iqoption.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import com.iqoption.d.a;
import com.iqoption.x.R;

/* compiled from: RobotoTextWidgetHelper */
class e {
    private static Typeface p(Context context, int i) {
        int i2 = i != 1 ? i != 2 ? i != 3 ? R.font.regular : R.font.italic : R.font.bold : R.font.medium;
        try {
            return ResourcesCompat.getFont(context, i2);
        } catch (Exception unused) {
            return hL(i);
        }
    }

    private static Typeface hL(int i) {
        String str;
        int i2 = 0;
        if (i == 1) {
            str = "sans-serif-medium";
        } else if (i == 2) {
            str = "sans-serif-bold";
            i2 = 1;
        } else if (i != 3) {
            str = "sans-serif";
        } else {
            str = "sans-serif-italic";
            i2 = 2;
        }
        return Typeface.create(str, i2);
    }

    static void a(TextView textView, AttributeSet attributeSet) {
        if (!textView.isInEditMode()) {
            Typeface p;
            Context context = textView.getContext();
            if (attributeSet != null) {
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.RobotoTextView);
                int i = obtainStyledAttributes.getInt(4, -1);
                if (i != -1) {
                    p = p(context, i);
                } else {
                    p = p(context, obtainStyledAttributes.getInt(5, 0));
                }
                Drawable drawable4 = null;
                if (VERSION.SDK_INT >= 21) {
                    Drawable drawable5 = obtainStyledAttributes.getDrawable(1);
                    Drawable drawable6 = obtainStyledAttributes.getDrawable(2);
                    drawable = obtainStyledAttributes.getDrawable(0);
                    drawable4 = obtainStyledAttributes.getDrawable(3);
                    drawable2 = drawable5;
                    drawable3 = drawable6;
                } else {
                    int resourceId = obtainStyledAttributes.getResourceId(1, -1);
                    int resourceId2 = obtainStyledAttributes.getResourceId(2, -1);
                    int resourceId3 = obtainStyledAttributes.getResourceId(0, -1);
                    int resourceId4 = obtainStyledAttributes.getResourceId(3, -1);
                    drawable2 = resourceId != -1 ? AppCompatResources.getDrawable(context, resourceId) : null;
                    drawable3 = resourceId2 != -1 ? AppCompatResources.getDrawable(context, resourceId2) : null;
                    drawable = resourceId3 != -1 ? AppCompatResources.getDrawable(context, resourceId3) : null;
                    if (resourceId4 != -1) {
                        drawable4 = AppCompatResources.getDrawable(context, resourceId4);
                    }
                }
                if (!(drawable2 == null && drawable == null && drawable3 == null && drawable4 == null)) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable4, drawable3, drawable);
                }
                obtainStyledAttributes.recycle();
            } else {
                p = p(context, 0);
            }
            textView.setTypeface(p);
        }
    }
}

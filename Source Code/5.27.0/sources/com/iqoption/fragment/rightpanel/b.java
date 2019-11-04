package com.iqoption.fragment.rightpanel;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.databinding.BindingAdapter;
import com.iqoption.core.ext.a;
import com.iqoption.view.d.c;
import com.iqoption.view.d.d;

/* compiled from: BindingAdapters */
public final class b {
    @BindingAdapter({"touchEffect"})
    public static void j(View view, float f) {
        view.setOnTouchListener(new d(f));
    }

    @BindingAdapter({"alphascaleTouchEffect"})
    public static void a(View view, Void voidR) {
        view.setOnTouchListener(new c());
    }

    @BindingAdapter({"progressTint"})
    public static void a(ProgressBar progressBar, @ColorInt int i) {
        progressBar.getIndeterminateDrawable().setColorFilter(i, Mode.SRC_IN);
    }

    @BindingAdapter({"startDrawableTint"})
    public static void f(TextView textView, @ColorInt int i) {
        Drawable drawable = textView.getCompoundDrawablesRelative()[0];
        if (drawable != null) {
            a.c(textView, a.a(drawable, i));
        }
    }
}

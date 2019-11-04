package com.iqoption.util;

import android.animation.LayoutTransition;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Property;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.app.IQApp;

/* compiled from: ViewUtils */
public class ak {
    private static final String TAG = "com.iqoption.util.ak";
    private static int ebW = 1;
    public static final Property<ImageView, Integer> ebX = new Property<ImageView, Integer>(Integer.class, "imageAlpha") {
        /* renamed from: d */
        public Integer get(ImageView imageView) {
            return Integer.valueOf(imageView.getImageAlpha());
        }

        /* renamed from: a */
        public void set(ImageView imageView, Integer num) {
            imageView.setImageAlpha(num.intValue());
        }
    };

    public static LayoutTransition aWZ() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(2, 0);
        layoutTransition.setStartDelay(0, 0);
        layoutTransition.setStartDelay(1, 0);
        layoutTransition.setStartDelay(3, 0);
        layoutTransition.setStagger(2, 0);
        layoutTransition.setStagger(0, 0);
        layoutTransition.setStagger(1, 0);
        layoutTransition.setStagger(3, 0);
        layoutTransition.setStagger(4, 0);
        layoutTransition.setStartDelay(4, 0);
        return layoutTransition;
    }

    public static LayoutTransition anP() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(2, 0);
        layoutTransition.setStartDelay(0, 0);
        layoutTransition.setStartDelay(1, 0);
        layoutTransition.setStartDelay(3, 0);
        layoutTransition.setStagger(2, 0);
        layoutTransition.setStagger(0, 0);
        layoutTransition.setStagger(1, 0);
        layoutTransition.setStagger(3, 0);
        layoutTransition.setStagger(4, 0);
        layoutTransition.setStartDelay(4, 0);
        layoutTransition.enableTransitionType(4);
        return layoutTransition;
    }

    public static void a(String str, String str2, TextView textView, int i, boolean z) {
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            textView.setText(str);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), indexOf, str2.length() + indexOf, 33);
        if (z) {
            spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, str2.length() + indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
    }

    public static boolean a(float f, float f2, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (f <= ((float) i) || f >= ((float) (i + view.getWidth())) || f2 <= ((float) i2) || f2 >= ((float) (i2 + view.getHeight()))) {
            return false;
        }
        return true;
    }

    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setDrawableLeft(@NonNull TextView textView, Drawable drawable) {
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
    }

    public static void setDrawableRight(@NonNull TextView textView, Drawable drawable) {
        textView.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
    }

    public static void j(@NonNull TextView textView, @DrawableRes int i) {
        textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
    }

    public static void k(@NonNull TextView textView, @DrawableRes int i) {
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    public static void q(@NonNull TextView textView) {
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    public static void f(View view, int i, int i2) {
        view.measure(MeasureSpec.makeMeasureSpec(view.getWidth(), i), MeasureSpec.makeMeasureSpec(view.getHeight(), i2));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static void ca(View view) {
        f(view, Integer.MIN_VALUE, 0);
    }

    public static void a(final View view, final Runnable runnable) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                runnable.run();
            }
        });
    }

    public static void b(final View view, final Runnable runnable) {
        view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                runnable.run();
                return false;
            }
        });
    }

    @Nullable
    public static Rect a(RecyclerView recyclerView, @IdRes int i, int i2) {
        int childCount = recyclerView.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = recyclerView.getChildAt(i3);
            if (recyclerView.getChildAdapterPosition(childAt) != i2) {
                i3++;
            } else if (i != -1) {
                return ah(childAt.findViewById(i));
            } else {
                return ah(childAt);
            }
        }
        return null;
    }

    public static Rect ah(View view) {
        Rect rect = new Rect();
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        }
        return rect;
    }

    public static Point ai(View view) {
        Point point = new Point();
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            point.set(iArr[0], iArr[1]);
        }
        return point;
    }

    @ColorInt
    public static int getColor(@ColorRes int i) {
        return ContextCompat.getColor(IQApp.Eu(), i);
    }
}

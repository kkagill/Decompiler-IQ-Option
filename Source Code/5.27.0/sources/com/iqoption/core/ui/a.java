package com.iqoption.core.ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.iqoption.core.graphics.a.a.c;
import com.iqoption.core.graphics.a.d;
import com.iqoption.core.graphics.animation.j;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001aE\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0014\u001aE\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0018H\u0007\u001a\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007\u001a\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007\u001aE\u0010\u001f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020 2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010!\u001a\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u001eH\u0007\u001a\"\u0010$\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020 2\u0006\u0010%\u001a\u00020\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007\u001a\u0018\u0010&\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007\u001a\u001a\u0010&\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020 2\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007\u001a*\u0010'\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020 2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007\u001a\u0018\u0010*\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001eH\u0007\u001a\u0018\u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u0018H\u0007\u001a \u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u000bH\u0007\u001a\u001a\u0010/\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0007\u001a\u001a\u00103\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002042\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007\u001a\"\u00105\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u001eH\u0007\u001a\u0018\u00108\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020 2\u0006\u00109\u001a\u00020\u001eH\u0007\u001aE\u0010:\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020;2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010<\u001a \u0010=\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u001eH\u0007\u001a\"\u0010?\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020 2\u0006\u0010%\u001a\u00020\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007\u001a\u0018\u0010@\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007\u001a\u001a\u0010@\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020 2\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007\u001a\u0018\u0010A\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0007\u001aE\u0010E\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020 2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010!\u001a\u001c\u0010F\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010HH\u0007\u001a \u0010F\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000bH\u0007\u001a\u0018\u0010K\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010I\u001a\u00020\u000bH\u0007\u001a\u0018\u0010L\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u000bH\u0007\u001a\u0018\u0010M\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u00106\u001a\u00020\u000bH\u0007\u001a\u0010\u0010N\u001a\u0004\u0018\u00010O*\u0004\u0018\u00010PH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006Q"}, bng = {"EMPTY_BACKGROUND", "Landroid/graphics/drawable/ColorDrawable;", "ON_TOUCH_SPEC", "", "", "[[I", "setAlphaOnTouch", "", "v", "Landroid/view/View;", "alphaOnTouch", "", "setBackgroundAlphaSpecs", "specs", "alphas", "Landroid/content/res/TypedArray;", "durations", "", "interpolators", "Landroid/animation/TimeInterpolator;", "(Landroid/view/View;[[ILandroid/content/res/TypedArray;[J[Landroid/animation/TimeInterpolator;)V", "setBackgroundColorSpecs", "colors", "setBackgroundTint", "Landroid/content/res/ColorStateList;", "color", "", "setDisableChangeAnimations", "Landroidx/recyclerview/widget/RecyclerView;", "disable", "", "setDrawableStartSpecs", "Landroid/widget/TextView;", "(Landroid/widget/TextView;[[ILandroid/content/res/TypedArray;[J[Landroid/animation/TimeInterpolator;)V", "setEatTouches", "eat", "setEndDrawableSizeColor", "size", "setEndDrawableTint", "setEndDrawableWidthHeightColor", "width", "height", "setFixedSize", "enabled", "setInputBackground", "Landroid/widget/EditText;", "lineWidth", "setOffsetStatusBar", "Landroid/view/ViewGroup;", "stub", "", "setProgressTint", "Landroid/widget/ProgressBar;", "setScaleOnTouch", "pixels", "isVertical", "setShowKeyboardOnFocus", "show", "setSourceSpecs", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;[[ILandroid/content/res/TypedArray;[J[Landroid/animation/TimeInterpolator;)V", "setSpacingItemDecoration", "includeEdge", "setStartDrawableSizeColor", "setStartDrawableTint", "setSwitchFont", "Landroidx/appcompat/widget/SwitchCompat;", "font", "Landroid/graphics/Typeface;", "setTextColorSpecs", "setTouchAlphaAndScaleEffect", "params", "Ljava/lang/Void;", "alpha", "scale", "setTouchEffect", "setTouchScaleEffect", "setTouchScalePixelsEffect", "findGradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/drawable/Drawable;", "core_release"})
/* compiled from: BindingAdapters.kt */
public final class a {
    private static final int[][] bGP;
    private static final ColorDrawable bGQ = new ColorDrawable(0);

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnLayout$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b implements OnGlobalLayoutListener {
        final /* synthetic */ View bGT;
        final /* synthetic */ float[] bGU;
        final /* synthetic */ boolean bGV;
        final /* synthetic */ float bGW;
        final /* synthetic */ Drawable bGX;
        final /* synthetic */ View bgH;

        @i(bne = {1, 1, 15}, bnf = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\f¸\u0006\u0000"}, bng = {"com/iqoption/core/ui/BindingAdaptersKt$setScaleOnTouch$1$controller$1", "Lcom/iqoption/core/graphics/drawable/stateanimator/AnimatorController;", "init", "", "specIndex", "", "onCreate", "Landroid/animation/ObjectAnimator;", "fromSpecIndex", "toSpecIndex", "onPrepare", "animator", "core_release"})
        /* compiled from: BindingAdapters.kt */
        public static final class a extends com.iqoption.core.graphics.a.a.a {
            final /* synthetic */ b bGY;

            a(int i, b bVar) {
                this.bGY = bVar;
                super(i);
            }

            public void init(int i) {
                com.iqoption.core.ext.a.i(this.bGY.bGT, this.bGY.bGU[i]);
            }

            public ObjectAnimator al(int i, int i2) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setTarget(this.bGY.bGT);
                objectAnimator.setDuration(200);
                objectAnimator.setInterpolator(j.XJ());
                return objectAnimator;
            }

            public void a(ObjectAnimator objectAnimator, int i, int i2) {
                kotlin.jvm.internal.i.f(objectAnimator, "animator");
                PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
                propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{this.bGY.bGU[i], this.bGY.bGU[i2]});
                propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{this.bGY.bGU[i], this.bGY.bGU[i2]});
                objectAnimator.setValues(propertyValuesHolderArr);
            }
        }

        public b(View view, View view2, float[] fArr, boolean z, float f, Drawable drawable) {
            this.bgH = view;
            this.bGT = view2;
            this.bGU = fArr;
            this.bGV = z;
            this.bGW = f;
            this.bGX = drawable;
        }

        public void onGlobalLayout() {
            this.bgH.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            float measuredWidth = (float) this.bGT.getMeasuredWidth();
            float measuredHeight = (float) this.bGT.getMeasuredHeight();
            if (measuredWidth != 0.0f && measuredHeight != 0.0f) {
                this.bGT.setBackground((Drawable) null);
                float[] fArr = this.bGU;
                if (this.bGV) {
                    measuredWidth = (measuredHeight - this.bGW) / measuredHeight;
                } else {
                    measuredWidth = (measuredWidth - this.bGW) / measuredWidth;
                }
                fArr[0] = measuredWidth;
                a aVar = new a(((Object[]) a.bGP).length, this);
                this.bGT.setBackground(new c(this.bGX, a.bGP, aVar));
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\f"}, bng = {"com/iqoption/core/ui/BindingAdaptersKt$setAlphaOnTouch$controller$1", "Lcom/iqoption/core/graphics/drawable/stateanimator/AnimatorController;", "init", "", "specIndex", "", "onCreate", "Landroid/animation/ObjectAnimator;", "fromSpecIndex", "toSpecIndex", "onPrepare", "animator", "core_release"})
    /* compiled from: BindingAdapters.kt */
    public static final class a extends com.iqoption.core.graphics.a.a.a {
        final /* synthetic */ View bGR;
        final /* synthetic */ float[] bGS;

        a(View view, float[] fArr, int i) {
            this.bGR = view;
            this.bGS = fArr;
            super(i);
        }

        public void init(int i) {
            this.bGR.setAlpha(this.bGS[i]);
        }

        public ObjectAnimator al(int i, int i2) {
            ObjectAnimator objectAnimator = new ObjectAnimator();
            objectAnimator.setTarget(this.bGR);
            objectAnimator.setDuration(200);
            objectAnimator.setInterpolator(j.XJ());
            return objectAnimator;
        }

        public void a(ObjectAnimator objectAnimator, int i, int i2) {
            kotlin.jvm.internal.i.f(objectAnimator, "animator");
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
            Property property = View.ALPHA;
            r3 = new float[2];
            float[] fArr = this.bGS;
            r3[0] = fArr[i];
            r3[1] = fArr[i2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(property, r3);
            objectAnimator.setValues(propertyValuesHolderArr);
        }
    }

    @BindingAdapter({"progressTint"})
    public static final void a(ProgressBar progressBar, @ColorInt int i) {
        kotlin.jvm.internal.i.f(progressBar, "v");
        progressBar.getIndeterminateDrawable().setColorFilter(i, Mode.SRC_IN);
    }

    @BindingAdapter({"bgTint"})
    public static final void n(View view, int i) {
        kotlin.jvm.internal.i.f(view, "v");
        Drawable background = view.getBackground();
        kotlin.jvm.internal.i.e(background, "v.background");
        view.setBackground(com.iqoption.core.ext.a.a(background, i));
    }

    @BindingAdapter({"inputBgColor", "inputBgWidth"})
    public static final void a(EditText editText, ColorStateList colorStateList, float f) {
        kotlin.jvm.internal.i.f(editText, "v");
        kotlin.jvm.internal.i.f(colorStateList, "colors");
        editText.setBackground(new d(colorStateList, f));
    }

    @BindingAdapter({"startDrawableTint"})
    public static final void f(TextView textView, @ColorInt int i) {
        kotlin.jvm.internal.i.f(textView, "v");
        Drawable h = com.iqoption.core.ext.a.h(textView);
        if (h != null) {
            com.iqoption.core.ext.a.c(textView, com.iqoption.core.ext.a.a(h, i));
        }
    }

    @BindingAdapter({"endDrawableSize", "endDrawableTint"})
    public static final void a(TextView textView, float f, @ColorInt int i) {
        kotlin.jvm.internal.i.f(textView, "v");
        Drawable i2 = com.iqoption.core.ext.a.i(textView);
        if (i2 != null) {
            Drawable a = com.iqoption.core.ext.a.a(i2, i);
            int i3 = (int) f;
            a.setBounds(0, 0, i3, i3);
            com.iqoption.core.ext.a.d(textView, a);
        }
    }

    @BindingAdapter({"startDrawableSize", "startDrawableTint"})
    public static final void b(TextView textView, float f, @ColorInt int i) {
        kotlin.jvm.internal.i.f(textView, "v");
        Drawable h = com.iqoption.core.ext.a.h(textView);
        if (h != null) {
            Drawable a = com.iqoption.core.ext.a.a(h, i);
            int i2 = (int) f;
            a.setBounds(0, 0, i2, i2);
            com.iqoption.core.ext.a.c(textView, a);
        }
    }

    @BindingAdapter({"touchEffect"})
    public static final void j(View view, float f) {
        kotlin.jvm.internal.i.f(view, "v");
        view.setOnTouchListener(new com.iqoption.core.ui.widget.h.b(f));
    }

    @BindingAdapter({"scaleTouchEffect"})
    public static final void k(View view, float f) {
        kotlin.jvm.internal.i.f(view, "v");
        view.setOnTouchListener(new com.iqoption.core.ui.widget.h.c(f));
    }

    @BindingAdapter({"scalePixelsTouchEffect"})
    public static final void l(View view, float f) {
        kotlin.jvm.internal.i.f(view, "v");
        view.setOnTouchListener(new com.iqoption.core.ui.widget.h.d(f));
    }

    @BindingAdapter({"alphascaleTouchEffect"})
    public static final void a(View view, Void voidR) {
        kotlin.jvm.internal.i.f(view, "v");
        view.setOnTouchListener(new com.iqoption.core.ui.widget.h.a(0.0f, 0.0f, 3, null));
    }

    @BindingAdapter(requireAll = false, value = {"itemSpacing", "includeEdge"})
    public static final void a(RecyclerView recyclerView, float f, boolean z) {
        kotlin.jvm.internal.i.f(recyclerView, "v");
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            recyclerView.addItemDecoration(new com.iqoption.core.ui.widget.recyclerview.a(((GridLayoutManager) layoutManager).getSpanCount(), Math.round(f), z));
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
        } else {
            if (layoutManager.canScrollVertically()) {
                recyclerView.addItemDecoration(new com.iqoption.core.ui.widget.recyclerview.d(c.au(f)));
            } else {
                recyclerView.addItemDecoration(new com.iqoption.core.ui.widget.recyclerview.c(c.au(f)));
            }
        }
    }

    @BindingAdapter({"disableChangeAnimations"})
    public static final void a(RecyclerView recyclerView, boolean z) {
        kotlin.jvm.internal.i.f(recyclerView, "v");
        if (z) {
            com.iqoption.core.ext.a.b(recyclerView);
        }
    }

    @BindingAdapter(requireAll = false, value = {"bgSpecStates", "bgSpecColors", "bgDurations", "bgInterpolators"})
    public static final void a(View view, int[][] iArr, TypedArray typedArray, long[] jArr, TimeInterpolator[] timeInterpolatorArr) {
        kotlin.jvm.internal.i.f(view, "v");
        kotlin.jvm.internal.i.f(iArr, "specs");
        kotlin.jvm.internal.i.f(typedArray, "colors");
        Drawable background = view.getBackground();
        GradientDrawable e = e(background);
        if (background != null && e != null) {
            int length;
            int i;
            view.setBackground((Drawable) null);
            int[] b = b.b(typedArray);
            if (jArr == null) {
                jArr = new long[((Object[]) iArr).length];
                length = jArr.length;
                for (i = 0; i < length; i++) {
                    jArr[i] = 200;
                }
            }
            if (timeInterpolatorArr == null) {
                timeInterpolatorArr = new TimeInterpolator[((Object[]) iArr).length];
                length = timeInterpolatorArr.length;
                for (i = 0; i < length; i++) {
                    timeInterpolatorArr[i] = j.XJ();
                }
            }
            com.iqoption.core.graphics.a.a.b bVar = new com.iqoption.core.graphics.a.a.b(e, b, jArr, timeInterpolatorArr);
            view.setBackground(new c(background, iArr, bVar));
        }
    }

    private static final GradientDrawable e(Drawable drawable) {
        while (!(drawable instanceof GradientDrawable)) {
            if (!(drawable instanceof com.iqoption.core.graphics.a.b)) {
                return null;
            }
            drawable = ((com.iqoption.core.graphics.a.b) drawable).XZ();
        }
        drawable = drawable.mutate();
        if (drawable != null) {
            return (GradientDrawable) drawable;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
    }

    @BindingAdapter(requireAll = false, value = {"textColorSpecStates", "textColorSpecValues", "textColorDurations", "textColorInterpolators"})
    public static final void a(TextView textView, int[][] iArr, TypedArray typedArray, long[] jArr, TimeInterpolator[] timeInterpolatorArr) {
        int length;
        int i;
        kotlin.jvm.internal.i.f(textView, "v");
        kotlin.jvm.internal.i.f(iArr, "specs");
        kotlin.jvm.internal.i.f(typedArray, "colors");
        Drawable background = textView.getBackground();
        if (background != null) {
            textView.setBackground((Drawable) null);
        } else {
            background = new ColorDrawable(0);
        }
        int[] b = b.b(typedArray);
        if (jArr == null) {
            jArr = new long[((Object[]) iArr).length];
            length = jArr.length;
            for (i = 0; i < length; i++) {
                jArr[i] = 200;
            }
        }
        if (timeInterpolatorArr == null) {
            timeInterpolatorArr = new TimeInterpolator[((Object[]) iArr).length];
            length = timeInterpolatorArr.length;
            for (i = 0; i < length; i++) {
                timeInterpolatorArr[i] = j.XJ();
            }
        }
        com.iqoption.core.graphics.a.a.d dVar = new com.iqoption.core.graphics.a.a.d(textView, b, jArr, timeInterpolatorArr);
        textView.setBackground(new c(background, iArr, dVar));
    }

    static {
        r0 = new int[2][];
        r0[0] = new int[]{16842919};
        r0[1] = com.iqoption.core.ext.c.bgU;
        bGP = r0;
    }

    @BindingAdapter(requireAll = false, value = {"scaleOnTouch", "sotIsVertical"})
    public static final void a(View view, float f, boolean z) {
        kotlin.jvm.internal.i.f(view, "v");
        float[] fArr = new float[]{1.0f, view.getScaleX()};
        Drawable background = view.getBackground();
        if (background == null) {
            background = bGQ;
        }
        Drawable drawable = background;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new b(view, view, fArr, z, com.iqoption.core.ext.a.g(view, f), drawable));
    }

    @BindingAdapter({"alphaOnTouch"})
    public static final void m(View view, float f) {
        kotlin.jvm.internal.i.f(view, "v");
        float[] fArr = new float[2];
        fArr[0] = f;
        fArr[1] = view.getAlpha() > 0.0f ? view.getAlpha() : 1.0f;
        Drawable background = view.getBackground();
        if (background == null) {
            background = bGQ;
        }
        a aVar = new a(view, fArr, ((Object[]) bGP).length);
        view.setBackground(new c(background, bGP, aVar));
    }

    @BindingAdapter({"switchFont"})
    public static final void a(SwitchCompat switchCompat, Typeface typeface) {
        kotlin.jvm.internal.i.f(switchCompat, "v");
        kotlin.jvm.internal.i.f(typeface, "font");
        switchCompat.setTypeface(typeface);
    }

    @BindingAdapter({"offsetStatusBar"})
    public static final void a(ViewGroup viewGroup, String str) {
        kotlin.jvm.internal.i.f(viewGroup, "v");
        LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            int height;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            int marginStart = marginLayoutParams.leftMargin != 0 ? marginLayoutParams.leftMargin : marginLayoutParams.getMarginStart();
            int marginEnd = marginLayoutParams.rightMargin != 0 ? marginLayoutParams.rightMargin : marginLayoutParams.getMarginEnd();
            if ((VERSION.SDK_INT >= 28 ? 1 : null) != null) {
                WindowInsets rootWindowInsets = viewGroup.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                    if (displayCutout != null) {
                        List boundingRects = displayCutout.getBoundingRects();
                        if (boundingRects != null) {
                            Object obj;
                            Iterator it = boundingRects.iterator();
                            if (it.hasNext()) {
                                Object next = it.next();
                                int height2 = ((Rect) next).height();
                                while (it.hasNext()) {
                                    Object next2 = it.next();
                                    int height3 = ((Rect) next2).height();
                                    if (height2 < height3) {
                                        next = next2;
                                        height2 = height3;
                                    }
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            Rect rect = (Rect) obj;
                            if (rect != null) {
                                height = rect.height();
                            }
                        }
                    }
                }
                height = com.iqoption.core.ext.a.i((View) viewGroup, com.iqoption.core.i.d.status_bar_height);
            } else {
                height = com.iqoption.core.ext.a.i((View) viewGroup, com.iqoption.core.i.d.status_bar_height);
            }
            marginLayoutParams.setMargins(marginStart, marginLayoutParams.topMargin + height, marginEnd, marginLayoutParams.bottomMargin);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}

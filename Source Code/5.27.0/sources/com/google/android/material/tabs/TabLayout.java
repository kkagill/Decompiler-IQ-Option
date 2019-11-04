package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar.Tab;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;
import androidx.core.util.Pools.SynchronizedPool;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.DecorView;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.google.android.material.a.j;
import com.google.android.material.a.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@DecorView
public class TabLayout extends HorizontalScrollView {
    private static final Pool<f> NH = new SynchronizedPool(16);
    private final ArrayList<f> NJ;
    private f NK;
    private final RectF NM;
    private final e NN;
    ColorStateList NQ;
    ColorStateList NS;
    ColorStateList NT;
    @Nullable
    Drawable NV;
    Mode NW;
    float NX;
    float NY;
    final int Oa;
    private final int Ob;
    private final int Oc;
    private final int Od;
    boolean Oe;
    boolean Of;
    boolean Og;
    private b Oh;
    private final ArrayList<b> Oi;
    private b Oj;
    private ValueAnimator Ok;
    ViewPager Ol;
    private PagerAdapter Om;
    private DataSetObserver Oo;
    private g Op;
    private a Oq;
    private boolean Or;
    private final Pool<h> Os;
    private int contentInsetStart;
    int mode;
    int tabGravity;
    int tabIndicatorAnimationDuration;
    int tabIndicatorGravity;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    int tabTextAppearance;

    public interface b<T extends f> {
        void i(T t);

        void j(T t);

        void k(T t);
    }

    private class d extends DataSetObserver {
        d() {
        }

        public void onChanged() {
            TabLayout.this.oy();
        }

        public void onInvalidated() {
            TabLayout.this.oy();
        }
    }

    private class e extends LinearLayout {
        private ValueAnimator OA;
        private int Ov;
        private final Paint Ow;
        private final GradientDrawable Ox;
        int Oy = -1;
        float Oz;
        private int indicatorLeft = -1;
        private int indicatorRight = -1;
        private int layoutDirection = -1;

        e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.Ow = new Paint();
            this.Ox = new GradientDrawable();
        }

        /* Access modifiers changed, original: 0000 */
        public void bb(int i) {
            if (this.Ow.getColor() != i) {
                this.Ow.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void bc(int i) {
            if (this.Ov != i) {
                this.Ov = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean oD() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* Access modifiers changed, original: 0000 */
        public void d(int i, float f) {
            ValueAnimator valueAnimator = this.OA;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.OA.cancel();
            }
            this.Oy = i;
            this.Oz = f;
            oE();
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.layoutDirection != i) {
                requestLayout();
                this.layoutDirection = i;
            }
        }

        /* Access modifiers changed, original: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                Object obj = 1;
                if (TabLayout.this.mode == 1 && TabLayout.this.tabGravity == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            i4 = Math.max(i4, childAt.getMeasuredWidth());
                        }
                    }
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (TabLayout.this.aZ(16) * 2)) {
                            Object obj2 = null;
                            while (i3 < childCount) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                                if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i4;
                                    layoutParams.weight = 0.0f;
                                    obj2 = 1;
                                }
                                i3++;
                            }
                            obj = obj2;
                        } else {
                            TabLayout tabLayout = TabLayout.this;
                            tabLayout.tabGravity = 0;
                            tabLayout.Z(false);
                        }
                        if (obj != null) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        /* Access modifiers changed, original: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.OA;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                oE();
                return;
            }
            this.OA.cancel();
            q(this.Oy, Math.round((1.0f - this.OA.getAnimatedFraction()) * ((float) this.OA.getDuration())));
        }

        private void oE() {
            int i;
            int i2;
            View childAt = getChildAt(this.Oy);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (!TabLayout.this.Of && (childAt instanceof h)) {
                    a((h) childAt, TabLayout.this.NM);
                    i = (int) TabLayout.this.NM.left;
                    i2 = (int) TabLayout.this.NM.right;
                }
                if (this.Oz > 0.0f && this.Oy < getChildCount() - 1) {
                    childAt = getChildAt(this.Oy + 1);
                    int left = childAt.getLeft();
                    int right = childAt.getRight();
                    if (!TabLayout.this.Of && (childAt instanceof h)) {
                        a((h) childAt, TabLayout.this.NM);
                        left = (int) TabLayout.this.NM.left;
                        right = (int) TabLayout.this.NM.right;
                    }
                    float f = this.Oz;
                    i = (int) ((((float) left) * f) + ((1.0f - f) * ((float) i)));
                    i2 = (int) ((((float) right) * f) + ((1.0f - f) * ((float) i2)));
                }
            }
            p(i, i2);
        }

        /* Access modifiers changed, original: 0000 */
        public void p(int i, int i2) {
            if (i != this.indicatorLeft || i2 != this.indicatorRight) {
                this.indicatorLeft = i;
                this.indicatorRight = i2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void q(final int i, int i2) {
            ValueAnimator valueAnimator = this.OA;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.OA.cancel();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                oE();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (!TabLayout.this.Of && (childAt instanceof h)) {
                a((h) childAt, TabLayout.this.NM);
                left = (int) TabLayout.this.NM.left;
                right = (int) TabLayout.this.NM.right;
            }
            final int i3 = left;
            final int i4 = right;
            final int i5 = this.indicatorLeft;
            final int i6 = this.indicatorRight;
            if (!(i5 == i3 && i6 == i4)) {
                valueAnimator = new ValueAnimator();
                this.OA = valueAnimator;
                valueAnimator.setInterpolator(com.google.android.material.a.a.DH);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        e.this.p(com.google.android.material.a.a.b(i5, i3, animatedFraction), com.google.android.material.a.a.b(i6, i4, animatedFraction));
                    }
                });
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        e eVar = e.this;
                        eVar.Oy = i;
                        eVar.Oz = 0.0f;
                    }
                });
                valueAnimator.start();
            }
        }

        private void a(h hVar, RectF rectF) {
            int a = hVar.oH();
            if (a < TabLayout.this.aZ(24)) {
                a = TabLayout.this.aZ(24);
            }
            int left = (hVar.getLeft() + hVar.getRight()) / 2;
            a /= 2;
            rectF.set((float) (left - a), 0.0f, (float) (left + a), 0.0f);
        }

        public void draw(Canvas canvas) {
            int i = 0;
            int intrinsicHeight = TabLayout.this.NV != null ? TabLayout.this.NV.getIntrinsicHeight() : 0;
            int i2 = this.Ov;
            if (i2 >= 0) {
                intrinsicHeight = i2;
            }
            i2 = TabLayout.this.tabIndicatorGravity;
            if (i2 == 0) {
                i = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i2 == 1) {
                i = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i2 != 2) {
                intrinsicHeight = i2 != 3 ? 0 : getHeight();
            }
            i2 = this.indicatorLeft;
            if (i2 >= 0 && this.indicatorRight > i2) {
                Drawable wrap = DrawableCompat.wrap(TabLayout.this.NV != null ? TabLayout.this.NV : this.Ox);
                wrap.setBounds(this.indicatorLeft, i, this.indicatorRight, intrinsicHeight);
                if (this.Ow != null) {
                    if (VERSION.SDK_INT == 21) {
                        wrap.setColorFilter(this.Ow.getColor(), Mode.SRC_IN);
                    } else {
                        DrawableCompat.setTint(wrap, this.Ow.getColor());
                    }
                }
                wrap.draw(canvas);
            }
            super.draw(canvas);
        }
    }

    public static class f {
        private CharSequence OG;
        private View OH;
        public TabLayout OI;
        public h OJ;
        private Drawable icon;
        private int position = -1;
        private Object tag;
        private CharSequence text;

        @Nullable
        public View getCustomView() {
            return this.OH;
        }

        @NonNull
        public f I(@Nullable View view) {
            this.OH = view;
            oF();
            return this;
        }

        @NonNull
        public f bd(@LayoutRes int i) {
            return I(LayoutInflater.from(this.OJ.getContext()).inflate(i, this.OJ, false));
        }

        @Nullable
        public Drawable getIcon() {
            return this.icon;
        }

        public int getPosition() {
            return this.position;
        }

        /* Access modifiers changed, original: 0000 */
        public void setPosition(int i) {
            this.position = i;
        }

        @Nullable
        public CharSequence getText() {
            return this.text;
        }

        @NonNull
        public f c(@Nullable Drawable drawable) {
            this.icon = drawable;
            oF();
            return this;
        }

        @NonNull
        public f g(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.OG) && !TextUtils.isEmpty(charSequence)) {
                this.OJ.setContentDescription(charSequence);
            }
            this.text = charSequence;
            oF();
            return this;
        }

        public void select() {
            TabLayout tabLayout = this.OI;
            if (tabLayout != null) {
                tabLayout.e(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public boolean isSelected() {
            TabLayout tabLayout = this.OI;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.position;
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }

        @NonNull
        public f h(@Nullable CharSequence charSequence) {
            this.OG = charSequence;
            oF();
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public void oF() {
            h hVar = this.OJ;
            if (hVar != null) {
                hVar.update();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void reset() {
            this.OI = null;
            this.OJ = null;
            this.tag = null;
            this.icon = null;
            this.text = null;
            this.OG = null;
            this.position = -1;
            this.OH = null;
        }
    }

    class h extends LinearLayout {
        private View OH;
        private f OP;
        private TextView OQ;
        private ImageView OR;
        private TextView OS;
        private ImageView OT;
        @Nullable
        private Drawable OU;
        private int OV = 2;

        public h(Context context) {
            super(context);
            ao(context);
            ViewCompat.setPaddingRelative(this, TabLayout.this.tabPaddingStart, TabLayout.this.tabPaddingTop, TabLayout.this.tabPaddingEnd, TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(TabLayout.this.Oe ^ 1);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        private void ao(Context context) {
            Drawable drawable;
            if (TabLayout.this.Oa != 0) {
                this.OU = AppCompatResources.getDrawable(context, TabLayout.this.Oa);
                drawable = this.OU;
                if (drawable != null && drawable.isStateful()) {
                    this.OU.setState(getDrawableState());
                }
            } else {
                this.OU = null;
            }
            drawable = new GradientDrawable();
            ((GradientDrawable) drawable).setColor(0);
            if (TabLayout.this.NT != null) {
                Drawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(1.0E-5f);
                gradientDrawable.setColor(-1);
                ColorStateList d = com.google.android.material.g.a.d(TabLayout.this.NT);
                if (VERSION.SDK_INT >= 21) {
                    if (TabLayout.this.Og) {
                        drawable = null;
                    }
                    if (TabLayout.this.Og) {
                        gradientDrawable = null;
                    }
                    drawable = new RippleDrawable(d, drawable, gradientDrawable);
                } else {
                    DrawableCompat.setTintList(DrawableCompat.wrap(gradientDrawable), d);
                    drawable = new LayerDrawable(new Drawable[]{drawable, gradientDrawable});
                }
            }
            ViewCompat.setBackground(this, drawable);
            TabLayout.this.invalidate();
        }

        private void i(Canvas canvas) {
            Drawable drawable = this.OU;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.OU.draw(canvas);
            }
        }

        /* Access modifiers changed, original: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.OU;
            int i = 0;
            if (drawable != null && drawable.isStateful()) {
                i = 0 | this.OU.setState(drawableState);
            }
            if (i != 0) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.OP == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.OP.select();
            return true;
        }

        public void setSelected(boolean z) {
            Object obj = isSelected() != z ? 1 : null;
            super.setSelected(z);
            if (obj != null && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.OQ;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.OR;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.OH;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(Tab.class.getName());
        }

        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Tab.class.getName());
        }

        public void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.OQ != null) {
                float f = TabLayout.this.NX;
                mode = this.OV;
                ImageView imageView = this.OR;
                Object obj = 1;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.OQ;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.NY;
                    }
                } else {
                    mode = 1;
                }
                float textSize = this.OQ.getTextSize();
                int lineCount = this.OQ.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.OQ);
                if (f != textSize || (maxLines >= 0 && mode != maxLines)) {
                    if (TabLayout.this.mode == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.OQ.getLayout();
                        if (layout == null || a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        this.OQ.setTextSize(0, f);
                        this.OQ.setMaxLines(mode);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void n(@Nullable f fVar) {
            if (fVar != this.OP) {
                this.OP = fVar;
                update();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void reset() {
            n(null);
            setSelected(false);
        }

        /* Access modifiers changed, original: final */
        public final void update() {
            f fVar = this.OP;
            Drawable drawable = null;
            View customView = fVar != null ? fVar.getCustomView() : null;
            if (customView != null) {
                h parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        parent.removeView(customView);
                    }
                    addView(customView);
                }
                this.OH = customView;
                TextView textView = this.OQ;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.OR;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.OR.setImageDrawable(null);
                }
                this.OS = (TextView) customView.findViewById(16908308);
                textView = this.OS;
                if (textView != null) {
                    this.OV = TextViewCompat.getMaxLines(textView);
                }
                this.OT = (ImageView) customView.findViewById(16908294);
            } else {
                customView = this.OH;
                if (customView != null) {
                    removeView(customView);
                    this.OH = null;
                }
                this.OS = null;
                this.OT = null;
            }
            boolean z = false;
            if (this.OH == null) {
                if (this.OR == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.google.android.material.a.h.design_layout_tab_icon, this, false);
                    addView(imageView2, 0);
                    this.OR = imageView2;
                }
                if (!(fVar == null || fVar.getIcon() == null)) {
                    drawable = DrawableCompat.wrap(fVar.getIcon()).mutate();
                }
                if (drawable != null) {
                    DrawableCompat.setTintList(drawable, TabLayout.this.NS);
                    if (TabLayout.this.NW != null) {
                        DrawableCompat.setTintMode(drawable, TabLayout.this.NW);
                    }
                }
                if (this.OQ == null) {
                    TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(com.google.android.material.a.h.design_layout_tab_text, this, false);
                    addView(textView2);
                    this.OQ = textView2;
                    this.OV = TextViewCompat.getMaxLines(this.OQ);
                }
                TextViewCompat.setTextAppearance(this.OQ, TabLayout.this.tabTextAppearance);
                if (TabLayout.this.NQ != null) {
                    this.OQ.setTextColor(TabLayout.this.NQ);
                }
                a(this.OQ, this.OR);
            } else if (!(this.OS == null && this.OT == null)) {
                a(this.OS, this.OT);
            }
            if (!(fVar == null || TextUtils.isEmpty(fVar.OG))) {
                setContentDescription(fVar.OG);
            }
            if (fVar != null && fVar.isSelected()) {
                z = true;
            }
            setSelected(z);
        }

        /* Access modifiers changed, original: final */
        public final void oG() {
            setOrientation(TabLayout.this.Oe ^ 1);
            if (this.OS == null && this.OT == null) {
                a(this.OQ, this.OR);
            } else {
                a(this.OS, this.OT);
            }
        }

        private void a(@Nullable TextView textView, @Nullable ImageView imageView) {
            f fVar = this.OP;
            Drawable mutate = (fVar == null || fVar.getIcon() == null) ? null : DrawableCompat.wrap(this.OP.getIcon()).mutate();
            f fVar2 = this.OP;
            CharSequence text = fVar2 != null ? fVar2.getText() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            int isEmpty = TextUtils.isEmpty(text) ^ 1;
            if (textView != null) {
                if (isEmpty != 0) {
                    textView.setText(text);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                int aZ = (isEmpty == 0 || imageView.getVisibility() != 0) ? 0 : TabLayout.this.aZ(8);
                if (TabLayout.this.Oe) {
                    if (aZ != MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) {
                        MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, aZ);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (aZ != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = aZ;
                    MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar3 = this.OP;
            CharSequence l = fVar3 != null ? fVar3.OG : null;
            if (isEmpty != 0) {
                l = null;
            }
            TooltipCompat.setTooltipText(this, l);
        }

        private int oH() {
            r0 = new View[3];
            int i = 0;
            r0[0] = this.OQ;
            r0[1] = this.OR;
            r0[2] = this.OH;
            int length = r0.length;
            int i2 = 0;
            int i3 = 0;
            Object obj = null;
            while (i < length) {
                View view = r0[i];
                if (view != null && view.getVisibility() == 0) {
                    i3 = obj != null ? Math.min(i3, view.getLeft()) : view.getLeft();
                    i2 = obj != null ? Math.max(i2, view.getRight()) : view.getRight();
                    obj = 1;
                }
                i++;
            }
            return i2 - i3;
        }

        private float a(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    private class a implements OnAdapterChangeListener {
        private boolean Ou;

        a() {
        }

        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            if (TabLayout.this.Ol == viewPager) {
                TabLayout.this.a(pagerAdapter2, this.Ou);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void aa(boolean z) {
            this.Ou = z;
        }
    }

    public interface c extends b {
    }

    public static class g implements OnPageChangeListener {
        private final WeakReference<TabLayout> OL;
        private int ON;
        private int OO;

        public g(TabLayout tabLayout) {
            this.OL = new WeakReference(tabLayout);
        }

        public void onPageScrollStateChanged(int i) {
            this.ON = this.OO;
            this.OO = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.OL.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.OO != 2 || this.ON == 1;
                if (!(this.OO == 2 && this.ON == 0)) {
                    z = true;
                }
                tabLayout.a(i, f, z2, z);
            }
        }

        public void onPageSelected(int i) {
            TabLayout tabLayout = (TabLayout) this.OL.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.OO;
                boolean z = i2 == 0 || (i2 == 2 && this.ON == 0);
                tabLayout.b(tabLayout.aY(i), z);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void reset() {
            this.OO = 0;
            this.ON = 0;
        }
    }

    public static class i implements c {
        private final ViewPager Ol;

        public void j(f fVar) {
        }

        public void k(f fVar) {
        }

        public i(ViewPager viewPager) {
            this.Ol = viewPager;
        }

        public void i(f fVar) {
            this.Ol.setCurrentItem(fVar.getPosition());
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.a.b.tabStyle);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.NJ = new ArrayList();
        this.NM = new RectF();
        this.tabMaxWidth = Integer.MAX_VALUE;
        this.Oi = new ArrayList();
        this.Os = new SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        this.NN = new e(context);
        super.addView(this.NN, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a = com.google.android.material.internal.g.a(context, attributeSet, k.TabLayout, i, j.Widget_Design_TabLayout, k.TabLayout_tabTextAppearance);
        this.NN.bc(a.getDimensionPixelSize(k.TabLayout_tabIndicatorHeight, -1));
        this.NN.bb(a.getColor(k.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(com.google.android.material.f.a.b(context, a, k.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(a.getInt(k.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(a.getBoolean(k.TabLayout_tabIndicatorFullWidth, true));
        i = a.getDimensionPixelSize(k.TabLayout_tabPadding, 0);
        this.tabPaddingBottom = i;
        this.tabPaddingEnd = i;
        this.tabPaddingTop = i;
        this.tabPaddingStart = i;
        this.tabPaddingStart = a.getDimensionPixelSize(k.TabLayout_tabPaddingStart, this.tabPaddingStart);
        this.tabPaddingTop = a.getDimensionPixelSize(k.TabLayout_tabPaddingTop, this.tabPaddingTop);
        this.tabPaddingEnd = a.getDimensionPixelSize(k.TabLayout_tabPaddingEnd, this.tabPaddingEnd);
        this.tabPaddingBottom = a.getDimensionPixelSize(k.TabLayout_tabPaddingBottom, this.tabPaddingBottom);
        this.tabTextAppearance = a.getResourceId(k.TabLayout_tabTextAppearance, j.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.tabTextAppearance, R.styleable.TextAppearance);
        try {
            this.NX = (float) obtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
            this.NQ = com.google.android.material.f.a.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColor);
            if (a.hasValue(k.TabLayout_tabTextColor)) {
                this.NQ = com.google.android.material.f.a.a(context, a, k.TabLayout_tabTextColor);
            }
            if (a.hasValue(k.TabLayout_tabSelectedTextColor)) {
                this.NQ = o(this.NQ.getDefaultColor(), a.getColor(k.TabLayout_tabSelectedTextColor, 0));
            }
            this.NS = com.google.android.material.f.a.a(context, a, k.TabLayout_tabIconTint);
            this.NW = com.google.android.material.internal.h.parseTintMode(a.getInt(k.TabLayout_tabIconTintMode, -1), null);
            this.NT = com.google.android.material.f.a.a(context, a, k.TabLayout_tabRippleColor);
            this.tabIndicatorAnimationDuration = a.getInt(k.TabLayout_tabIndicatorAnimationDuration, 300);
            this.Ob = a.getDimensionPixelSize(k.TabLayout_tabMinWidth, -1);
            this.Oc = a.getDimensionPixelSize(k.TabLayout_tabMaxWidth, -1);
            this.Oa = a.getResourceId(k.TabLayout_tabBackground, 0);
            this.contentInsetStart = a.getDimensionPixelSize(k.TabLayout_tabContentStart, 0);
            this.mode = a.getInt(k.TabLayout_tabMode, 1);
            this.tabGravity = a.getInt(k.TabLayout_tabGravity, 0);
            this.Oe = a.getBoolean(k.TabLayout_tabInlineLabel, false);
            this.Og = a.getBoolean(k.TabLayout_tabUnboundedRipple, false);
            a.recycle();
            Resources resources = getResources();
            this.NY = (float) resources.getDimensionPixelSize(com.google.android.material.a.d.design_tab_text_size_2line);
            this.Od = resources.getDimensionPixelSize(com.google.android.material.a.d.design_tab_scrollable_min_width);
            oC();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.NN.bb(i);
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.NN.bc(i);
    }

    public void a(int i, float f, boolean z) {
        a(i, f, z, true);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.NN.getChildCount()) {
            if (z2) {
                this.NN.d(i, f);
            }
            ValueAnimator valueAnimator = this.Ok;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.Ok.cancel();
            }
            scrollTo(c(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void a(@NonNull f fVar) {
        a(fVar, this.NJ.isEmpty());
    }

    public void a(@NonNull f fVar, boolean z) {
        a(fVar, this.NJ.size(), z);
    }

    public void a(@NonNull f fVar, int i, boolean z) {
        if (fVar.OI == this) {
            a(fVar, i);
            d(fVar);
            if (z) {
                fVar.select();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    private void a(@NonNull TabItem tabItem) {
        f ow = ow();
        if (tabItem.text != null) {
            ow.g(tabItem.text);
        }
        if (tabItem.icon != null) {
            ow.c(tabItem.icon);
        }
        if (tabItem.ND != 0) {
            ow.bd(tabItem.ND);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            ow.h(tabItem.getContentDescription());
        }
        a(ow);
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable b bVar) {
        b bVar2 = this.Oh;
        if (bVar2 != null) {
            b(bVar2);
        }
        this.Oh = bVar;
        if (bVar != null) {
            a(bVar);
        }
    }

    public void a(@NonNull b bVar) {
        if (!this.Oi.contains(bVar)) {
            this.Oi.add(bVar);
        }
    }

    public void b(@NonNull b bVar) {
        this.Oi.remove(bVar);
    }

    @NonNull
    public f ow() {
        f ox = ox();
        ox.OI = this;
        ox.OJ = c(ox);
        return ox;
    }

    /* Access modifiers changed, original: protected */
    public f ox() {
        f fVar = (f) NH.acquire();
        return fVar == null ? new f() : fVar;
    }

    /* Access modifiers changed, original: protected */
    public boolean b(f fVar) {
        return NH.release(fVar);
    }

    public int getTabCount() {
        return this.NJ.size();
    }

    @Nullable
    public f aY(int i) {
        return (i < 0 || i >= getTabCount()) ? null : (f) this.NJ.get(i);
    }

    public int getSelectedTabPosition() {
        f fVar = this.NK;
        return fVar != null ? fVar.getPosition() : -1;
    }

    public void removeAllTabs() {
        for (int childCount = this.NN.getChildCount() - 1; childCount >= 0; childCount--) {
            ba(childCount);
        }
        Iterator it = this.NJ.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            it.remove();
            fVar.reset();
            b(fVar);
        }
        this.NK = null;
    }

    public void setTabMode(int i) {
        if (i != this.mode) {
            this.mode = i;
            oC();
        }
    }

    public int getTabMode() {
        return this.mode;
    }

    public void setTabGravity(int i) {
        if (this.tabGravity != i) {
            this.tabGravity = i;
            oC();
        }
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.tabIndicatorGravity != i) {
            this.tabIndicatorGravity = i;
            ViewCompat.postInvalidateOnAnimation(this.NN);
        }
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.Of = z;
        ViewCompat.postInvalidateOnAnimation(this.NN);
    }

    public void setInlineLabel(boolean z) {
        if (this.Oe != z) {
            this.Oe = z;
            for (int i = 0; i < this.NN.getChildCount(); i++) {
                View childAt = this.NN.getChildAt(i);
                if (childAt instanceof h) {
                    ((h) childAt).oG();
                }
            }
            oC();
        }
    }

    public void setInlineLabelResource(@BoolRes int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setUnboundedRipple(boolean z) {
        if (this.Og != z) {
            this.Og = z;
            for (int i = 0; i < this.NN.getChildCount(); i++) {
                View childAt = this.NN.getChildAt(i);
                if (childAt instanceof h) {
                    ((h) childAt).ao(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.NQ != colorStateList) {
            this.NQ = colorStateList;
            oz();
        }
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.NQ;
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.NS != colorStateList) {
            this.NS = colorStateList;
            oz();
        }
    }

    public void setTabIconTintResource(@ColorRes int i) {
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i));
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.NS;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.NT;
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.NT != colorStateList) {
            this.NT = colorStateList;
            for (int i = 0; i < this.NN.getChildCount(); i++) {
                View childAt = this.NN.getChildAt(i);
                if (childAt instanceof h) {
                    ((h) childAt).ao(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i) {
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i));
    }

    @Nullable
    public Drawable getTabSelectedIndicator() {
        return this.NV;
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (this.NV != drawable) {
            this.NV = drawable;
            ViewCompat.postInvalidateOnAnimation(this.NN);
        }
    }

    public void setSelectedTabIndicator(@DrawableRes int i) {
        if (i != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i));
        } else {
            setSelectedTabIndicator(null);
        }
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        a(viewPager, true);
    }

    public void a(@Nullable ViewPager viewPager, boolean z) {
        a(viewPager, z, false);
    }

    private void a(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.Ol;
        if (viewPager2 != null) {
            g gVar = this.Op;
            if (gVar != null) {
                viewPager2.removeOnPageChangeListener(gVar);
            }
            a aVar = this.Oq;
            if (aVar != null) {
                this.Ol.removeOnAdapterChangeListener(aVar);
            }
        }
        b bVar = this.Oj;
        if (bVar != null) {
            b(bVar);
            this.Oj = null;
        }
        if (viewPager != null) {
            this.Ol = viewPager;
            if (this.Op == null) {
                this.Op = new g(this);
            }
            this.Op.reset();
            viewPager.addOnPageChangeListener(this.Op);
            this.Oj = new i(viewPager);
            a(this.Oj);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, z);
            }
            if (this.Oq == null) {
                this.Oq = new a();
            }
            this.Oq.aa(z);
            viewPager.addOnAdapterChangeListener(this.Oq);
            a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.Ol = null;
            a(null, false);
        }
        this.Or = z2;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        a(pagerAdapter, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.Ol == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true, true);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.Or) {
            setupWithViewPager(null);
            this.Or = false;
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.NN.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* Access modifiers changed, original: 0000 */
    public void a(@Nullable PagerAdapter pagerAdapter, boolean z) {
        PagerAdapter pagerAdapter2 = this.Om;
        if (pagerAdapter2 != null) {
            DataSetObserver dataSetObserver = this.Oo;
            if (dataSetObserver != null) {
                pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.Om = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.Oo == null) {
                this.Oo = new d();
            }
            pagerAdapter.registerDataSetObserver(this.Oo);
        }
        oy();
    }

    /* Access modifiers changed, original: 0000 */
    public void oy() {
        removeAllTabs();
        PagerAdapter pagerAdapter = this.Om;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                a(ow().g(this.Om.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.Ol;
            if (viewPager != null && count > 0) {
                count = viewPager.getCurrentItem();
                if (count != getSelectedTabPosition() && count < getTabCount()) {
                    e(aY(count));
                }
            }
        }
    }

    private void oz() {
        int size = this.NJ.size();
        for (int i = 0; i < size; i++) {
            ((f) this.NJ.get(i)).oF();
        }
    }

    private h c(@NonNull f fVar) {
        Pool pool = this.Os;
        h hVar = pool != null ? (h) pool.acquire() : null;
        if (hVar == null) {
            hVar = new h(getContext());
        }
        hVar.n(fVar);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.OG)) {
            hVar.setContentDescription(fVar.text);
        } else {
            hVar.setContentDescription(fVar.OG);
        }
        return hVar;
    }

    private void a(f fVar, int i) {
        fVar.setPosition(i);
        this.NJ.add(i, fVar);
        int size = this.NJ.size();
        while (true) {
            i++;
            if (i < size) {
                ((f) this.NJ.get(i)).setPosition(i);
            } else {
                return;
            }
        }
    }

    private void d(f fVar) {
        this.NN.addView(fVar.OJ, fVar.getPosition(), oA());
    }

    public void addView(View view) {
        H(view);
    }

    public void addView(View view, int i) {
        H(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        H(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        H(view);
    }

    private void H(View view) {
        if (view instanceof TabItem) {
            a((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private LayoutParams oA() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    private void a(LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* Access modifiers changed, original: 0000 */
    @Dimension(unit = 1)
    public int aZ(@Dimension(unit = 0) int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.NN.getChildCount(); i++) {
            View childAt = this.NN.getChildAt(i);
            if (childAt instanceof h) {
                ((h) childAt).i(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int aZ = (aZ(getDefaultHeight()) + getPaddingTop()) + getPaddingBottom();
        int mode = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(aZ, MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = MeasureSpec.makeMeasureSpec(aZ, 1073741824);
        }
        aZ = MeasureSpec.getSize(i);
        if (MeasureSpec.getMode(i) != 0) {
            mode = this.Oc;
            if (mode <= 0) {
                mode = aZ - aZ(56);
            }
            this.tabMaxWidth = mode;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            i = 0;
            View childAt = getChildAt(0);
            int i3 = this.mode;
            if (i3 == 0 ? childAt.getMeasuredWidth() >= getMeasuredWidth() : i3 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                i = 1;
            }
            if (i != 0) {
                childAt.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    private void ba(int i) {
        h hVar = (h) this.NN.getChildAt(i);
        this.NN.removeViewAt(i);
        if (hVar != null) {
            hVar.reset();
            this.Os.release(hVar);
        }
        requestLayout();
    }

    private void animateToTab(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.NN.oD()) {
                a(i, 0.0f, true);
                return;
            }
            if (getScrollX() != c(i, 0.0f)) {
                oB();
                this.Ok.setIntValues(new int[]{r0, r2});
                this.Ok.start();
            }
            this.NN.q(i, this.tabIndicatorAnimationDuration);
        }
    }

    private void oB() {
        if (this.Ok == null) {
            this.Ok = new ValueAnimator();
            this.Ok.setInterpolator(com.google.android.material.a.a.DH);
            this.Ok.setDuration((long) this.tabIndicatorAnimationDuration);
            this.Ok.addUpdateListener(new AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        oB();
        this.Ok.addListener(animatorListener);
    }

    private void setSelectedTabView(int i) {
        int childCount = this.NN.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.NN.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void e(f fVar) {
        b(fVar, true);
    }

    /* Access modifiers changed, original: 0000 */
    public void b(f fVar, boolean z) {
        f fVar2 = this.NK;
        if (fVar2 != fVar) {
            int position = fVar != null ? fVar.getPosition() : -1;
            if (z) {
                if ((fVar2 == null || fVar2.getPosition() == -1) && position != -1) {
                    a(position, 0.0f, true);
                } else {
                    animateToTab(position);
                }
                if (position != -1) {
                    setSelectedTabView(position);
                }
            }
            this.NK = fVar;
            if (fVar2 != null) {
                g(fVar2);
            }
            if (fVar != null) {
                f(fVar);
            }
        } else if (fVar2 != null) {
            h(fVar);
            animateToTab(fVar.getPosition());
        }
    }

    private void f(@NonNull f fVar) {
        for (int size = this.Oi.size() - 1; size >= 0; size--) {
            ((b) this.Oi.get(size)).i(fVar);
        }
    }

    private void g(@NonNull f fVar) {
        for (int size = this.Oi.size() - 1; size >= 0; size--) {
            ((b) this.Oi.get(size)).j(fVar);
        }
    }

    private void h(@NonNull f fVar) {
        for (int size = this.Oi.size() - 1; size >= 0; size--) {
            ((b) this.Oi.get(size)).k(fVar);
        }
    }

    private int c(int i, float f) {
        int i2 = 0;
        if (this.mode != 0) {
            return 0;
        }
        View childAt = this.NN.getChildAt(i);
        i++;
        View childAt2 = i < this.NN.getChildCount() ? this.NN.getChildAt(i) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        i = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i3 = (int) ((((float) (width + i2)) * 0.5f) * f);
        return ViewCompat.getLayoutDirection(this) == 0 ? i + i3 : i - i3;
    }

    private void oC() {
        ViewCompat.setPaddingRelative(this.NN, this.mode == 0 ? Math.max(0, this.contentInsetStart - this.tabPaddingStart) : 0, 0, 0, 0);
        int i = this.mode;
        if (i == 0) {
            this.NN.setGravity(GravityCompat.START);
        } else if (i == 1) {
            this.NN.setGravity(1);
        }
        Z(true);
    }

    /* Access modifiers changed, original: 0000 */
    public void Z(boolean z) {
        for (int i = 0; i < this.NN.getChildCount(); i++) {
            View childAt = this.NN.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    private static ColorStateList o(int i, int i2) {
        r1 = new int[2][];
        int[] iArr = new int[]{SELECTED_STATE_SET, i2};
        r1[1] = EMPTY_STATE_SET;
        iArr[1] = i;
        return new ColorStateList(r1, iArr);
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        int size = this.NJ.size();
        Object obj = null;
        for (int i = 0; i < size; i++) {
            f fVar = (f) this.NJ.get(i);
            if (fVar != null && fVar.getIcon() != null && !TextUtils.isEmpty(fVar.getText())) {
                obj = 1;
                break;
            }
        }
        return (obj == null || this.Oe) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.Ob;
        if (i != -1) {
            return i;
        }
        return this.mode == 0 ? this.Od : 0;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* Access modifiers changed, original: 0000 */
    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }
}

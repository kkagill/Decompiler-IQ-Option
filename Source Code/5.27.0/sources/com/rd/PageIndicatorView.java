package com.rd;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.text.TextUtilsCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.rd.animation.type.AnimationType;
import com.rd.b.c;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.RtlMode;
import com.rd.draw.data.a;
import com.rd.draw.data.b;

public class PageIndicatorView extends View implements OnAdapterChangeListener, OnPageChangeListener, a {
    private ViewPager Ol;
    private a eHj;
    private DataSetObserver eHk;
    private boolean eHl;

    /* renamed from: com.rd.PageIndicatorView$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] eHn = new int[RtlMode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.rd.draw.data.RtlMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            eHn = r0;
            r0 = eHn;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.rd.draw.data.RtlMode.On;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = eHn;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.rd.draw.data.RtlMode.Off;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = eHn;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.rd.draw.data.RtlMode.Auto;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rd.PageIndicatorView$AnonymousClass2.<clinit>():void");
        }
    }

    public PageIndicatorView(Context context) {
        super(context);
        init(null);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    @TargetApi(21)
    public PageIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(getParent());
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        bhk();
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        a bhe = this.eHj.bhe();
        b bVar = new b(super.onSaveInstanceState());
        bVar.dB(bhe.bhV());
        bVar.iV(bhe.bhW());
        bVar.iW(bhe.bhX());
        return bVar;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof b) {
            a bhe = this.eHj.bhe();
            b bVar = (b) parcelable;
            bhe.dB(bVar.bhV());
            bhe.iV(bVar.bhW());
            bhe.iW(bVar.bhX());
            super.onRestoreInstanceState(bVar.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        Pair aQ = this.eHj.bhf().aQ(i, i2);
        setMeasuredDimension(((Integer) aQ.first).intValue(), ((Integer) aQ.second).intValue());
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        this.eHj.bhf().draw(canvas);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.eHj.bhf().d(motionEvent);
        return true;
    }

    public void bhg() {
        invalidate();
    }

    public void onPageScrolled(int i, float f, int i2) {
        h(i, f);
    }

    public void onPageSelected(int i) {
        iI(i);
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.eHj.bhe().setInteractiveAnimation(this.eHl);
        }
    }

    public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
        aSr();
    }

    public void setCount(int i) {
        if (i >= 0 && this.eHj.bhe().getCount() != i) {
            this.eHj.bhe().setCount(i);
            bhl();
            requestLayout();
        }
    }

    public int getCount() {
        return this.eHj.bhe().getCount();
    }

    public void setDynamicCount(boolean z) {
        this.eHj.bhe().setDynamicCount(z);
        if (z) {
            bhj();
        } else {
            bhk();
        }
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        this.eHj.bhe().setRadius(com.rd.b.b.aZ(i));
        invalidate();
    }

    public void setRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.eHj.bhe().setRadius((int) f);
        invalidate();
    }

    public int getRadius() {
        return this.eHj.bhe().getRadius();
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        this.eHj.bhe().setPadding(com.rd.b.b.aZ(i));
        invalidate();
    }

    public void setPadding(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.eHj.bhe().setPadding((int) f);
        invalidate();
    }

    public int getPadding() {
        return this.eHj.bhe().getPadding();
    }

    public void setScaleFactor(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.3f) {
            f = 0.3f;
        }
        this.eHj.bhe().setScaleFactor(f);
    }

    public float getScaleFactor() {
        return this.eHj.bhe().getScaleFactor();
    }

    public void setStrokeWidth(float f) {
        int radius = this.eHj.bhe().getRadius();
        if (f < 0.0f) {
            f = 0.0f;
        } else {
            float f2 = (float) radius;
            if (f > f2) {
                f = f2;
            }
        }
        this.eHj.bhe().iM((int) f);
        invalidate();
    }

    public void setStrokeWidth(int i) {
        i = com.rd.b.b.aZ(i);
        int radius = this.eHj.bhe().getRadius();
        if (i < 0) {
            i = 0;
        } else if (i > radius) {
            i = radius;
        }
        this.eHj.bhe().iM(i);
        invalidate();
    }

    public int getStrokeWidth() {
        return this.eHj.bhe().bhJ();
    }

    public void setSelectedColor(int i) {
        this.eHj.bhe().setSelectedColor(i);
        invalidate();
    }

    public int getSelectedColor() {
        return this.eHj.bhe().getSelectedColor();
    }

    public void setUnselectedColor(int i) {
        this.eHj.bhe().setUnselectedColor(i);
        invalidate();
    }

    public int getUnselectedColor() {
        return this.eHj.bhe().getUnselectedColor();
    }

    public void setAutoVisibility(boolean z) {
        if (!z) {
            setVisibility(0);
        }
        this.eHj.bhe().setAutoVisibility(z);
        bhl();
    }

    public void setOrientation(@Nullable Orientation orientation) {
        if (orientation != null) {
            this.eHj.bhe().setOrientation(orientation);
            requestLayout();
        }
    }

    public void setAnimationDuration(long j) {
        this.eHj.bhe().setAnimationDuration(j);
    }

    public long getAnimationDuration() {
        return this.eHj.bhe().getAnimationDuration();
    }

    public void setAnimationType(@Nullable AnimationType animationType) {
        this.eHj.a(null);
        if (animationType != null) {
            this.eHj.bhe().setAnimationType(animationType);
        } else {
            this.eHj.bhe().setAnimationType(AnimationType.NONE);
        }
        invalidate();
    }

    public void setInteractiveAnimation(boolean z) {
        this.eHj.bhe().setInteractiveAnimation(z);
        this.eHl = z;
    }

    public void setViewPager(@Nullable ViewPager viewPager) {
        bhh();
        if (viewPager != null) {
            this.Ol = viewPager;
            this.Ol.addOnPageChangeListener(this);
            this.Ol.addOnAdapterChangeListener(this);
            this.eHj.bhe().iX(this.Ol.getId());
            setDynamicCount(this.eHj.bhe().bhU());
            aSr();
        }
    }

    public void bhh() {
        ViewPager viewPager = this.Ol;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(this);
            this.Ol = null;
        }
    }

    public void setRtlMode(@Nullable RtlMode rtlMode) {
        a bhe = this.eHj.bhe();
        if (rtlMode == null) {
            bhe.setRtlMode(RtlMode.Off);
        } else {
            bhe.setRtlMode(rtlMode);
        }
        if (this.Ol != null) {
            int bhV = bhe.bhV();
            if (isRtl()) {
                bhV = (bhe.getCount() - 1) - bhV;
            } else {
                ViewPager viewPager = this.Ol;
                if (viewPager != null) {
                    bhV = viewPager.getCurrentItem();
                }
            }
            bhe.iW(bhV);
            bhe.iV(bhV);
            bhe.dB(bhV);
            invalidate();
        }
    }

    public int getSelection() {
        return this.eHj.bhe().bhV();
    }

    public void setSelection(int i) {
        a bhe = this.eHj.bhe();
        i = iJ(i);
        if (i != bhe.bhV() && i != bhe.bhW()) {
            bhe.setInteractiveAnimation(false);
            bhe.iW(bhe.bhV());
            bhe.iV(i);
            bhe.dB(i);
            this.eHj.bhd().bhn();
        }
    }

    public void setSelected(int i) {
        a bhe = this.eHj.bhe();
        AnimationType bhZ = bhe.bhZ();
        bhe.setAnimationType(AnimationType.NONE);
        setSelection(i);
        bhe.setAnimationType(bhZ);
    }

    public void g(int i, float f) {
        a bhe = this.eHj.bhe();
        if (bhe.bhS()) {
            int count = bhe.getCount();
            if (count <= 0 || i < 0) {
                i = 0;
            } else {
                count--;
                if (i > count) {
                    i = count;
                }
            }
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f == 1.0f) {
                bhe.iW(bhe.bhV());
                bhe.dB(i);
            }
            bhe.iV(i);
            this.eHj.bhd().al(f);
        }
    }

    public void setClickListener(@Nullable com.rd.draw.a.b.a aVar) {
        this.eHj.bhf().setClickListener(aVar);
    }

    private void init(@Nullable AttributeSet attributeSet) {
        bhi();
        h(attributeSet);
    }

    private void bhi() {
        if (getId() == -1) {
            setId(c.generateViewId());
        }
    }

    private void h(@Nullable AttributeSet attributeSet) {
        this.eHj = new a(this);
        this.eHj.bhf().a(getContext(), attributeSet);
        a bhe = this.eHj.bhe();
        bhe.setPaddingLeft(getPaddingLeft());
        bhe.setPaddingTop(getPaddingTop());
        bhe.setPaddingRight(getPaddingRight());
        bhe.setPaddingBottom(getPaddingBottom());
        this.eHl = bhe.bhS();
    }

    private void bhj() {
        if (this.eHk == null) {
            ViewPager viewPager = this.Ol;
            if (viewPager != null && viewPager.getAdapter() != null) {
                this.eHk = new DataSetObserver() {
                    public void onChanged() {
                        PageIndicatorView.this.aSr();
                    }
                };
                try {
                    this.Ol.getAdapter().registerDataSetObserver(this.eHk);
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void bhk() {
        if (this.eHk != null) {
            ViewPager viewPager = this.Ol;
            if (viewPager != null && viewPager.getAdapter() != null) {
                try {
                    this.Ol.getAdapter().unregisterDataSetObserver(this.eHk);
                    this.eHk = null;
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void aSr() {
        ViewPager viewPager = this.Ol;
        if (viewPager != null && viewPager.getAdapter() != null) {
            int count = this.Ol.getAdapter().getCount();
            int currentItem = isRtl() ? (count - 1) - this.Ol.getCurrentItem() : this.Ol.getCurrentItem();
            this.eHj.bhe().dB(currentItem);
            this.eHj.bhe().iV(currentItem);
            this.eHj.bhe().iW(currentItem);
            this.eHj.bhe().setCount(count);
            this.eHj.bhd().end();
            bhl();
            requestLayout();
        }
    }

    private void bhl() {
        if (this.eHj.bhe().bhT()) {
            int count = this.eHj.bhe().getCount();
            int visibility = getVisibility();
            if (visibility != 0 && count > 1) {
                setVisibility(0);
            } else if (visibility != 4 && count <= 1) {
                setVisibility(4);
            }
        }
    }

    private void iI(int i) {
        a bhe = this.eHj.bhe();
        boolean bhm = bhm();
        int count = bhe.getCount();
        if (bhm) {
            if (isRtl()) {
                i = (count - 1) - i;
            }
            setSelection(i);
        }
    }

    private void h(int i, float f) {
        a bhe = this.eHj.bhe();
        Object obj = (bhm() && bhe.bhS() && bhe.bhZ() != AnimationType.NONE) ? 1 : null;
        if (obj != null) {
            Pair a = com.rd.b.a.a(bhe, i, f, isRtl());
            g(((Integer) a.first).intValue(), ((Float) a.second).floatValue());
        }
    }

    private boolean isRtl() {
        int i = AnonymousClass2.eHn[this.eHj.bhe().bia().ordinal()];
        boolean z = true;
        if (i == 1) {
            return true;
        }
        if (i == 2 || i != 3) {
            return false;
        }
        if (TextUtilsCompat.getLayoutDirectionFromLocale(getContext().getResources().getConfiguration().locale) != 1) {
            z = false;
        }
        return z;
    }

    private boolean bhm() {
        return (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
    }

    private void a(@Nullable ViewParent viewParent) {
        Object obj = (viewParent == null || !(viewParent instanceof ViewGroup) || ((ViewGroup) viewParent).getChildCount() <= 0) ? null : 1;
        if (obj != null) {
            ViewPager Y = Y((ViewGroup) viewParent, this.eHj.bhe().bib());
            if (Y != null) {
                setViewPager(Y);
            } else {
                a(viewParent.getParent());
            }
        }
    }

    @Nullable
    private ViewPager Y(@NonNull ViewGroup viewGroup, int i) {
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        View findViewById = viewGroup.findViewById(i);
        if (findViewById == null || !(findViewById instanceof ViewPager)) {
            return null;
        }
        return (ViewPager) findViewById;
    }

    private int iJ(int i) {
        int count = this.eHj.bhe().getCount() - 1;
        if (i < 0) {
            return 0;
        }
        return i > count ? count : i;
    }
}

package com.iqoption.core.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.iqoption.core.i.e;
import com.iqoption.core.i.m;

public final class StarBar extends View {
    private static final String TAG = "com.iqoption.core.ui.widget.StarBar";
    private final int Fp = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    private float Mh;
    private int bLE;
    private Drawable bLF;
    private Drawable bLG;
    private float bLH;
    private boolean bLI = false;
    private int bLJ;
    private b bLK;
    private int starWidth = -1;

    private static final class a {
        final Drawable bLF;
        final Drawable bLG;
        final float bLH;
        final int bLL;
        final int bLM;
        final int starHeight;
        final int starNum;
        final int starWidth;

        a(Context context, @Nullable AttributeSet attributeSet) {
            if (attributeSet == null) {
                this.bLF = new ColorDrawable(0);
                this.bLG = this.bLF;
                this.bLH = 0.0f;
                this.starNum = 0;
                this.starWidth = 0;
                this.starHeight = 0;
                this.bLL = 0;
                this.bLM = 0;
                return;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.StarBar);
            this.bLF = AppCompatResources.getDrawable(context, obtainStyledAttributes.getResourceId(m.StarBar_starFull, e.ic_star_black_24dp));
            this.bLG = AppCompatResources.getDrawable(context, obtainStyledAttributes.getResourceId(m.StarBar_starEmpty, e.ic_star_black_24dp));
            this.bLH = obtainStyledAttributes.getDimension(m.StarBar_starOffset, 0.0f);
            this.starNum = obtainStyledAttributes.getInt(m.StarBar_starNum, 0);
            this.starWidth = obtainStyledAttributes.getDimensionPixelSize(m.StarBar_starWidth, 0);
            this.starHeight = obtainStyledAttributes.getDimensionPixelSize(m.StarBar_starHeight, 0);
            this.bLL = obtainStyledAttributes.getColor(m.StarBar_starFullTint, 0);
            this.bLM = obtainStyledAttributes.getColor(m.StarBar_starEmptyTint, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public interface b {
        void ev(int i);
    }

    public StarBar(Context context) {
        super(context);
        a(new a(context, null));
    }

    public StarBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(new a(context, attributeSet));
    }

    public StarBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(new a(context, attributeSet));
    }

    @TargetApi(21)
    public StarBar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(new a(context, attributeSet));
    }

    public void setStars(int i) {
        if (this.bLE != i) {
            this.bLE = i;
            invalidate();
        }
    }

    public int getStars() {
        return this.bLE;
    }

    public void setOnStarsChangedListener(b bVar) {
        this.bLK = bVar;
    }

    private static Drawable c(Drawable drawable, int i) {
        drawable = DrawableCompat.wrap(drawable.mutate());
        if (i == 0) {
            return drawable;
        }
        DrawableCompat.setTint(drawable, i);
        return drawable;
    }

    private void a(@NonNull a aVar) {
        Rect rect;
        this.bLF = c(aVar.bLF, aVar.bLL);
        this.bLG = c(aVar.bLG, aVar.bLM);
        this.bLH = aVar.bLH;
        this.bLE = aVar.starNum;
        if (aVar.starWidth == 0 || aVar.starHeight == 0) {
            rect = new Rect(0, 0, this.bLF.getIntrinsicWidth(), this.bLF.getIntrinsicHeight());
        } else {
            rect = new Rect(0, 0, aVar.starWidth, aVar.starHeight);
        }
        this.bLF.setBounds(rect);
        this.bLG.setBounds(rect);
        this.starWidth = this.bLF.getBounds().width();
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        Drawable drawable = this.bLF;
        i2 = 0;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            i2 = bounds.width();
            i = bounds.height();
        } else {
            i = 0;
        }
        setMeasuredDimension((int) (((((float) (i2 * 5)) + (this.bLH * 4.0f)) + ((float) ViewCompat.getPaddingStart(this))) + ((float) ViewCompat.getPaddingEnd(this))), (i + getPaddingTop()) + getPaddingBottom());
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            this.bLF.setAlpha(255);
            this.bLG.setAlpha(255);
            return;
        }
        this.bLF.setAlpha(100);
        this.bLG.setAlpha(100);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate((float) ViewCompat.getPaddingStart(this), (float) getPaddingTop());
        int i = 0;
        while (i < 5) {
            Drawable drawable;
            i++;
            if (this.bLE >= i) {
                drawable = this.bLF;
            } else {
                drawable = this.bLG;
            }
            drawable.draw(canvas);
            canvas.translate(((float) drawable.getBounds().width()) + this.bLH, 0.0f);
        }
        canvas.restore();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        if (actionMasked == 0) {
            this.Mh = motionEvent.getX();
            this.bLJ = getStars();
        } else if (actionMasked == 1) {
            actionMasked = getStars();
            int b = b(motionEvent);
            b bVar;
            if (this.bLJ != actionMasked) {
                bVar = this.bLK;
                if (bVar != null) {
                    bVar.ev(b);
                }
            } else if (actionMasked != b) {
                setStars(b);
                bVar = this.bLK;
                if (bVar != null) {
                    bVar.ev(b);
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            this.bLI = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                getParent().requestDisallowInterceptTouchEvent(false);
                this.bLI = false;
            }
            z = false;
        } else {
            if (!this.bLI && Math.abs(motionEvent.getX() - this.Mh) > ((float) this.Fp)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.bLI = true;
            }
            if (!this.bLI) {
                return false;
            }
            setStars(b(motionEvent));
        }
        return z;
    }

    private int b(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float paddingStart = (float) ViewCompat.getPaddingStart(this);
        if (x <= paddingStart) {
            return 0;
        }
        x -= paddingStart;
        int i = 1;
        while (i < 5) {
            int i2 = this.starWidth;
            float f = (float) i2;
            float f2 = this.bLH;
            if (x <= f + f2) {
                break;
            }
            x -= ((float) i2) + f2;
            i++;
        }
        return i;
    }
}

package com.iqoption.core.ui.widget.amountview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.i.f;
import com.iqoption.core.i.m;

public class AmountView extends View {
    private static final Interpolator bLR = j.XJ();
    private final ValueAnimator Le = ValueAnimator.ofFloat(new float[]{1.0f});
    private float bHV;
    protected final Paint bLS = new TextPaint(1);
    private final d bLT = new d(this.bLS);
    private final c bLU = new c(this.bLT);
    private final Rect bLV = new Rect();
    private int bLW;
    private int bLX;
    private long bLY;
    private long bLZ;
    private Interpolator bMa;
    private boolean bMb;
    private String bMc;
    private int gravity;
    private String text;
    private int textColor;
    private int textStyle;

    private class a {
        float bHV;
        float bMe;
        float bMf;
        float bMg;
        int gravity;
        int shadowColor;
        String text;
        int textColor = ViewCompat.MEASURED_STATE_MASK;
        int textStyle;

        a(Resources resources) {
            this.bHV = TypedValue.applyDimension(2, 12.0f, resources.getDisplayMetrics());
            this.gravity = GravityCompat.START;
        }

        /* Access modifiers changed, original: 0000 */
        public void c(TypedArray typedArray) {
            this.gravity = typedArray.getInt(m.AmountView_android_gravity, this.gravity);
            this.shadowColor = typedArray.getColor(m.AmountView_android_shadowColor, this.shadowColor);
            this.bMe = typedArray.getFloat(m.AmountView_android_shadowDx, this.bMe);
            this.bMf = typedArray.getFloat(m.AmountView_android_shadowDy, this.bMf);
            this.bMg = typedArray.getFloat(m.AmountView_android_shadowRadius, this.bMg);
            this.text = typedArray.getString(m.AmountView_android_text);
            this.textColor = typedArray.getColor(m.AmountView_android_textColor, this.textColor);
            this.bHV = typedArray.getDimension(m.AmountView_android_textSize, this.bHV);
            this.textStyle = typedArray.getInt(m.AmountView_android_textStyle, this.textStyle);
        }
    }

    public AmountView(Context context) {
        super(context);
        init(context, null, 0, 0);
    }

    public AmountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0, 0);
    }

    public AmountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public AmountView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet, i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void init(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context.getResources());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.AmountView, i, i2);
        i = obtainStyledAttributes.getResourceId(m.AmountView_android_textAppearance, -1);
        if (i != -1) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, m.AmountView);
            aVar.c(obtainStyledAttributes2);
            obtainStyledAttributes2.recycle();
        }
        aVar.c(obtainStyledAttributes);
        this.bMa = bLR;
        this.bLZ = (long) obtainStyledAttributes.getInt(m.AmountView_animationDuration, 400);
        this.bMb = obtainStyledAttributes.getBoolean(m.AmountView_animateResizing, false);
        this.gravity = aVar.gravity;
        if (aVar.shadowColor != 0) {
            this.bLS.setShadowLayer(aVar.bMg, aVar.bMe, aVar.bMf, aVar.shadowColor);
        }
        if (aVar.textStyle != 0) {
            this.textStyle = aVar.textStyle;
            setTypeface(this.bLS.getTypeface());
        }
        if (obtainStyledAttributes.hasValue(m.AmountView_android_fontFamily)) {
            Typeface typeface = null;
            try {
                typeface = ResourcesCompat.getFont(getContext(), obtainStyledAttributes.getResourceId(m.AmountView_android_fontFamily, f.regular));
            } catch (Throwable unused) {
            }
            if (typeface != null) {
                setTypeface(typeface);
            }
        }
        setTextColor(aVar.textColor);
        setTextSize(aVar.bHV);
        int i3 = obtainStyledAttributes.getInt(m.AmountView_defaultCharacters, 0);
        if (i3 == 1) {
            setCharacterLists(e.amy());
        } else if (i3 == 2) {
            setCharacterLists(e.amz());
        } else if (isInEditMode()) {
            setCharacterLists(e.amy());
        }
        if (amj()) {
            t(aVar.text, false);
        } else {
            this.bMc = aVar.text;
        }
        obtainStyledAttributes.recycle();
        this.Le.addUpdateListener(new -$$Lambda$AmountView$NSfMeRDoeEILGsS2iPgBKq3LaqA(this));
        this.Le.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                AmountView.this.bLU.onAnimationEnd();
                AmountView.this.amk();
                AmountView.this.invalidate();
            }
        });
    }

    private /* synthetic */ void e(ValueAnimator valueAnimator) {
        this.bLU.setAnimationProgress(valueAnimator.getAnimatedFraction());
        amk();
        invalidate();
    }

    public void setCharacterLists(String... strArr) {
        this.bLU.setCharacterLists(strArr);
        String str = this.bMc;
        if (str != null) {
            t(str, false);
            this.bMc = null;
        }
    }

    public boolean amj() {
        return this.bLU.amu() != null;
    }

    public void setText(String str) {
        t(str, TextUtils.isEmpty(this.text) ^ 1);
    }

    public void t(String str, boolean z) {
        if (!TextUtils.equals(str, this.text)) {
            this.text = str;
            this.bLU.a(str == null ? new char[0] : str.toCharArray());
            setContentDescription(str);
            if (z) {
                if (this.Le.isRunning()) {
                    this.Le.cancel();
                }
                this.Le.setStartDelay(this.bLY);
                this.Le.setDuration(this.bLZ);
                this.Le.setInterpolator(this.bMa);
                this.Le.start();
            } else {
                this.bLU.setAnimationProgress(1.0f);
                this.bLU.onAnimationEnd();
                amk();
                invalidate();
            }
        }
    }

    public String getText() {
        return this.text;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public void setTextColor(int i) {
        if (this.textColor != i) {
            this.textColor = i;
            this.bLS.setColor(this.textColor);
            invalidate();
        }
    }

    public float getTextSize() {
        return this.bHV;
    }

    public void setTextSize(float f) {
        if (this.bHV != f) {
            this.bHV = f;
            this.bLS.setTextSize(f);
            amn();
        }
    }

    public Typeface getTypeface() {
        return this.bLS.getTypeface();
    }

    public void setTypeface(Typeface typeface) {
        int i = this.textStyle;
        if (i == 3) {
            typeface = Typeface.create(typeface, 3);
        } else if (i == 1) {
            typeface = Typeface.create(typeface, 1);
        } else if (i == 2) {
            typeface = Typeface.create(typeface, 2);
        }
        this.bLS.setTypeface(typeface);
        amn();
    }

    public long getAnimationDelay() {
        return this.bLY;
    }

    public void setAnimationDelay(long j) {
        this.bLY = j;
    }

    public long getAnimationDuration() {
        return this.bLZ;
    }

    public void setAnimationDuration(long j) {
        this.bLZ = j;
    }

    public Interpolator getAnimationInterpolator() {
        return this.bMa;
    }

    public void setAnimationInterpolator(Interpolator interpolator) {
        this.bMa = interpolator;
    }

    public int getGravity() {
        return this.gravity;
    }

    public void setGravity(int i) {
        if (this.gravity != i) {
            this.gravity = i;
            invalidate();
        }
    }

    public void setAnimateMeasurementChange(boolean z) {
        this.bMb = z;
    }

    public boolean getAnimateMeasurementChange() {
        return this.bMb;
    }

    private void amk() {
        Object obj = 1;
        Object obj2 = this.bLW != aml() ? 1 : null;
        if (this.bLX == amm()) {
            obj = null;
        }
        if (obj2 != null || obj != null) {
            requestLayout();
        }
    }

    private int aml() {
        return (((int) (this.bMb ? this.bLU.amq() : this.bLU.amr())) + getPaddingLeft()) + getPaddingRight();
    }

    private int amm() {
        return (((int) this.bLT.amw()) + getPaddingTop()) + getPaddingBottom();
    }

    private void amn() {
        this.bLT.invalidate();
        amk();
        invalidate();
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        this.bLW = aml();
        this.bLX = amm();
        setMeasuredDimension(resolveSize(this.bLW, i), resolveSize(this.bLX, i2));
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.bLV.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        o(canvas);
        canvas.translate(0.0f, this.bLT.amx());
        this.bLU.draw(canvas, this.bLS);
        canvas.restore();
    }

    private void o(Canvas canvas) {
        a(canvas, this.gravity, this.bLV, this.bLU.amq(), this.bLT.amw());
    }

    static void a(Canvas canvas, int i, Rect rect, float f, float f2) {
        int width = rect.width();
        int height = rect.height();
        float f3 = (i & 16) == 16 ? ((float) rect.top) + ((((float) height) - f2) / 2.0f) : 0.0f;
        float f4 = (i & 1) == 1 ? ((float) rect.left) + ((((float) width) - f) / 2.0f) : 0.0f;
        if ((i & 48) == 48) {
            f3 = 0.0f;
        }
        if ((i & 80) == 80) {
            f3 = ((float) rect.top) + (((float) height) - f2);
        }
        if ((i & GravityCompat.START) == GravityCompat.START) {
            f4 = 0.0f;
        }
        if ((i & GravityCompat.END) == GravityCompat.END) {
            f4 = ((float) rect.left) + (((float) width) - f);
        }
        canvas.translate(f4, f3);
        canvas.clipRect(0.0f, 0.0f, f, f2);
    }
}

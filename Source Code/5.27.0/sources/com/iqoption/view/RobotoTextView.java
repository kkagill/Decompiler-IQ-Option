package com.iqoption.view;

import android.content.Context;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

public class RobotoTextView extends AppCompatTextView {
    private int efQ;
    private boolean efR = false;
    private float efS;
    private float efT;
    private float efU = 0.0f;
    private float efV = 4.0f;
    private a efZ;

    public interface a {
        void a(TextView textView, float f, float f2);
    }

    public RobotoTextView(Context context) {
        super(context);
        setCustomFont(null);
        init();
    }

    public RobotoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setCustomFont(attributeSet);
        init();
    }

    public RobotoTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setCustomFont(attributeSet);
        init();
    }

    private void init() {
        this.efT = getTextSize();
        float f = this.efT;
        this.efS = f;
        double d = (double) f;
        Double.isNaN(d);
        this.efV = (float) ((int) (d * 0.5d));
        if (this.efQ == 0) {
            this.efQ = Integer.MAX_VALUE;
        }
    }

    public void reinit() {
        init();
    }

    private void setCustomFont(AttributeSet attributeSet) {
        e.a(this, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.efR = true;
        aYn();
    }

    public void setOnResizeListener(a aVar) {
        this.efZ = aVar;
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.efQ = i;
    }

    public void setSingleLine() {
        super.setSingleLine();
        this.efQ = 1;
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
        if (z) {
            this.efQ = 1;
        } else {
            this.efQ = Integer.MAX_VALUE;
        }
    }

    public void setLines(int i) {
        super.setLines(i);
        this.efQ = i;
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        this.efT = getTextSize();
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.efT = getTextSize();
        this.efS = getTextSize();
    }

    public void setMaxTextSize(float f) {
        this.efU = f;
        requestLayout();
        invalidate();
    }

    public float getMaxTextSize() {
        return this.efU;
    }

    public void setMinTextSize(float f) {
        this.efV = f;
        requestLayout();
        invalidate();
    }

    public float getMinTextSize() {
        return this.efV;
    }

    private void aYn() {
        float f = this.efS;
        if (f > 0.0f && this.efT > 0.0f) {
            setTextSize(0, f);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(i == i3 && i2 == i4) && this.efT == this.efS) {
            this.efR = true;
        }
        if (this.efT != this.efS) {
            aYn();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z || this.efR) {
            aG(((i3 - i) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i4 - i2) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void aG(int i, int i2) {
        CharSequence text = getText();
        if (text != null && text.length() != 0 && i2 > 0 && i > 0 && this.efT != 0.0f) {
            if (getTransformationMethod() != null) {
                text = getTransformationMethod().getTransformation(text, this);
            }
            TextPaint paint = getPaint();
            float textSize = paint.getTextSize();
            float f = this.efU;
            float min = f > 0.0f ? Math.min(this.efT, f) : this.efT;
            int[] a = a(text, paint, i, min);
            while (true) {
                if (a[0] <= i2 && a[1] <= this.efQ) {
                    break;
                }
                f = this.efV;
                if (min <= f) {
                    break;
                }
                min = Math.max(min - 2.0f, f);
                a = a(text, paint, i, min);
            }
            setTextSize(0, min);
            a aVar = this.efZ;
            if (aVar != null) {
                aVar.a(this, textSize, min);
            }
            this.efR = false;
        }
    }

    private int[] a(CharSequence charSequence, TextPaint textPaint, int i, float f) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f);
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint2, i, Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        return new int[]{staticLayout.getHeight(), staticLayout.getLineCount()};
    }
}

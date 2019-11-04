package com.iqoption.view.scoreboard;

import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.AppCompatTextView;

public class BalanceView extends AppCompatTextView {
    private float efT;
    private float efW;
    private float efX;
    private Rect egW;
    private int[] ehA;
    private ObjectAnimator ehB;
    private TypeEvaluator<int[]> ehC;
    private int ehD;
    private final String[] ehv;
    private int ehw;
    private int ehx;
    private int ehy;
    private Rect ehz;
    private TextPaint mTextPaint;

    public BalanceView(Context context) {
        super(context);
        this.ehv = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        this.ehw = 0;
        this.ehx = 0;
        this.ehy = 0;
        this.egW = null;
        this.ehz = null;
        this.mTextPaint = null;
        this.efW = 1.0f;
        this.efX = 0.0f;
        this.ehA = null;
        this.ehB = null;
        this.ehC = null;
        aYE();
    }

    public BalanceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ehv = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        this.ehw = 0;
        this.ehx = 0;
        this.ehy = 0;
        this.egW = null;
        this.ehz = null;
        this.mTextPaint = null;
        this.efW = 1.0f;
        this.efX = 0.0f;
        this.ehA = null;
        this.ehB = null;
        this.ehC = null;
        aYE();
    }

    public BalanceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ehv = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        this.ehw = 0;
        this.ehx = 0;
        this.ehy = 0;
        this.egW = null;
        this.ehz = null;
        this.mTextPaint = null;
        this.efW = 1.0f;
        this.efX = 0.0f;
        this.ehA = null;
        this.ehB = null;
        this.ehC = null;
        aYE();
    }

    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.efW = f2;
        this.efX = f;
    }

    public int[] getOffset() {
        return this.ehA;
    }

    public void setOffset(int[] iArr) {
        this.ehA = iArr;
        invalidate();
    }

    private void aYE() {
        this.efT = getTextSize();
        this.mTextPaint = new TextPaint(getPaint());
        this.mTextPaint.setColor(getCurrentTextColor());
        this.ehw = (int) StaticLayout.getDesiredWidth(".", this.mTextPaint);
        this.ehx = (int) (this.mTextPaint.descent() - this.mTextPaint.ascent());
        this.ehy = (int) StaticLayout.getDesiredWidth("0", this.mTextPaint);
        this.egW = new Rect(0, 0, this.ehy, this.ehx);
        this.ehz = new Rect(0, 0, this.ehy, this.ehx);
        if (this.ehB == null) {
            this.ehB = new ObjectAnimator();
            this.ehB.setTarget(this);
            this.ehB.setPropertyName("offset");
        }
        if (this.ehC == null) {
            this.ehC = new TypeEvaluator<int[]>() {
                public int[] evaluate(float f, int[] iArr, int[] iArr2) {
                    int[] iArr3 = null;
                    if (!(iArr == null || iArr2 == null)) {
                        try {
                            iArr3 = new int[iArr2.length];
                            int length = iArr2.length - 1;
                            while (length >= 0) {
                                int a = iArr.length >= length + 1 ? iArr[length] : BalanceView.this.ehx * -1;
                                iArr3[length] = a + ((int) (((float) (iArr2[length] - a)) * f));
                                length--;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return iArr3;
                }
            };
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        try {
            if (this.efT != getTextSize()) {
                aYE();
            }
            if (TextUtils.isEmpty(getText())) {
                throw new NumberFormatException();
            }
            if (this.ehA == null) {
                jY(getText().toString());
            }
            int length = this.ehA.length;
            float descent = this.mTextPaint.descent();
            this.mTextPaint.setColor(getCurrentTextColor());
            int i = 0;
            while (i < length) {
                int i2 = (i < this.ehD || this.ehD <= 0) ? 0 : this.ehw;
                if (i == this.ehD) {
                    canvas.drawText(".", (float) (this.ehy * i), ((float) this.ehx) - descent, this.mTextPaint);
                }
                this.egW.top = this.ehA[i];
                this.egW.bottom = this.egW.top + this.ehx;
                this.ehz.left = i2 + (this.ehy * i);
                this.ehz.right = this.ehz.left + this.ehy;
                i2 = this.ehx;
                int i3 = i2;
                for (String drawText : this.ehv) {
                    canvas.drawText(drawText, (float) this.ehz.left, (((float) i3) - descent) - ((float) this.egW.top), this.mTextPaint);
                    i3 += this.ehx;
                }
                i++;
            }
        } catch (Exception unused) {
            super.onDraw(canvas);
        }
    }

    private void jY(String str) {
        char[] toCharArray = str.toCharArray();
        int[] iArr = this.ehA;
        if (iArr == null || iArr.length != toCharArray.length) {
            this.ehA = new int[toCharArray.length];
        }
        for (int length = toCharArray.length - 1; length >= 0; length--) {
            this.ehA[length] = Character.getNumericValue(toCharArray[length]) * this.ehx;
        }
    }

    private int[] jZ(String str) {
        char[] toCharArray = str.toCharArray();
        int[] iArr = new int[toCharArray.length];
        for (int length = toCharArray.length - 1; length >= 0; length--) {
            iArr[length] = Character.getNumericValue(toCharArray[length]) * this.ehx;
        }
        return iArr;
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, bufferType);
        ObjectAnimator objectAnimator = this.ehB;
        if (objectAnimator == null || !(objectAnimator.isRunning() || this.ehB.isStarted())) {
            try {
                jY(ka(charSequence.toString()));
                invalidate();
            } catch (Exception unused) {
            }
        }
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
    }

    private int indexOf(String str) {
        int indexOf = str.indexOf(".");
        return indexOf == -1 ? str.indexOf(",") : indexOf;
    }

    private String ka(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        this.ehD = indexOf(str);
        if (this.ehD > -1) {
            str = str.replace(".", str2).replace(",", str2);
        }
        return str;
    }

    public void kb(String str) {
        try {
            String ka = ka(str);
            if (this.ehA == null) {
                jY(ka);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            invalidate();
        }
        invalidate();
        setText(str);
    }

    public void d(String str, int i, int i2) {
        try {
            String ka = ka(str);
            if (this.ehA == null) {
                jY(ka);
            }
            int[] jZ = jZ(ka);
            this.ehB.setObjectValues(new Object[]{jZ});
            this.ehB.setEvaluator(this.ehC);
            this.ehB.setStartDelay((long) i);
            this.ehB.setDuration((long) i2);
            this.ehB.start();
        } catch (Exception unused) {
            invalidate();
        }
        setText(str);
    }
}

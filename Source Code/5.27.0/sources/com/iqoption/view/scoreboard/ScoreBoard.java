package com.iqoption.view.scoreboard;

import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import com.iqoption.view.RobotoTextView;

public class ScoreBoard extends RobotoTextView {
    private float efT;
    private float efW = 1.0f;
    private float efX = 0.0f;
    private Rect egW = null;
    private int[] ehA = null;
    private ObjectAnimator ehB = null;
    private TypeEvaluator<int[]> ehC = null;
    private final String ehF = "0\n1\n2\n3\n4\n5\n6\n7\n8\n9";
    private Bitmap ehG = null;
    private int ehx = 0;
    private int ehy = 0;
    private Rect ehz = null;
    private TextPaint mTextPaint = null;

    public ScoreBoard(Context context) {
        super(context);
        aYE();
    }

    public ScoreBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        aYE();
    }

    public ScoreBoard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
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
        this.ehx = (int) (this.mTextPaint.descent() - this.mTextPaint.ascent());
        this.ehy = (int) StaticLayout.getDesiredWidth("0", this.mTextPaint);
        this.ehG = Bitmap.createBitmap(this.ehy, this.ehx * 10, Config.ARGB_8888);
        Canvas canvas = new Canvas(this.ehG);
        int i = this.ehx;
        int i2 = i;
        for (String drawText : "0\n1\n2\n3\n4\n5\n6\n7\n8\n9".split("\n")) {
            canvas.drawText(drawText, 0.0f, ((float) i2) - (this.mTextPaint.descent() / 2.0f), this.mTextPaint);
            i2 += this.ehx;
        }
        this.egW = new Rect(0, 0, this.ehy, this.ehx);
        this.ehz = new Rect(0, 0, this.ehy, this.ehx);
        this.ehB = new ObjectAnimator();
        this.ehB.setTarget(this);
        this.ehB.setPropertyName("offset");
        this.ehC = new TypeEvaluator<int[]>() {
            public int[] evaluate(float f, int[] iArr, int[] iArr2) {
                int[] iArr3 = new int[iArr2.length];
                int length = iArr2.length - 1;
                while (length >= 0) {
                    int a = iArr.length >= length + 1 ? iArr[length] : ScoreBoard.this.ehx * -1;
                    iArr3[length] = a + ((int) (((float) (iArr2[length] - a)) * f));
                    length--;
                }
                return iArr3;
            }
        };
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        try {
            if (this.efT != getTextSize() || this.ehG == null) {
                aYE();
            }
            if (this.ehG == null) {
                throw new NumberFormatException();
            } else if (TextUtils.isEmpty(getText())) {
                throw new NumberFormatException();
            } else {
                if (this.ehA == null) {
                    jY(getText().toString());
                }
                for (int i = 0; i < this.ehA.length; i++) {
                    this.egW.top = this.ehA[i];
                    this.egW.bottom = this.egW.top + this.ehx;
                    this.ehz.left = this.ehy * i;
                    this.ehz.right = this.ehz.left + this.ehy;
                    canvas.drawBitmap(this.ehG, this.egW, this.ehz, null);
                }
            }
        } catch (NumberFormatException unused) {
            super.onDraw(canvas);
        }
    }

    private void jY(String str) {
        int parseInt = Integer.parseInt(str);
        int[] iArr = this.ehA;
        if (iArr == null || iArr.length != str.length()) {
            this.ehA = new int[str.length()];
        }
        for (int length = this.ehA.length - 1; length >= 0; length--) {
            this.ehA[length] = (parseInt % 10) * this.ehx;
            parseInt /= 10;
        }
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, bufferType);
        ObjectAnimator objectAnimator = this.ehB;
        if (objectAnimator == null || !(objectAnimator.isRunning() || this.ehB.isStarted())) {
            try {
                jY(charSequence.toString());
                invalidate();
            } catch (Exception unused) {
            }
        }
    }
}

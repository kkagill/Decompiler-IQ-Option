package com.iqoption.core.ui.widget.time;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.widget.TextView;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/core/ui/widget/time/TimeDrawDelegate;", "", "()V", "animator", "Landroid/animation/ValueAnimator;", "colonPaint", "Landroid/text/TextPaint;", "colonWidth", "", "postfixText", "", "postfixWidth", "prefixText", "prefixWidth", "progress", "textPaint", "textView", "Landroid/widget/TextView;", "animateText", "", "text", "cancelAnimation", "init", "tv", "Lcom/iqoption/core/ui/widget/time/TimeTextView;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "parseText", "prepareAnimation", "startAnimation", "Companion", "core_release"})
/* compiled from: TimeDrawDelegate.kt */
public final class a {
    public static final a bPJ = new a();
    private final TextPaint Kj = new TextPaint();
    private ValueAnimator Le;
    private TextView OQ;
    private CharSequence bPD;
    private CharSequence bPE;
    private float bPF;
    private float bPG;
    private float bPH;
    private final TextPaint bPI = new TextPaint();
    private float di;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/ui/widget/time/TimeDrawDelegate$Companion;", "", "()V", "ANIMATION_DURATION", "", "COLON", "", "core_release"})
    /* compiled from: TimeDrawDelegate.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/iqoption/core/ui/widget/time/TimeDrawDelegate$startAnimation$1$1"})
    /* compiled from: TimeDrawDelegate.kt */
    static final class b implements AnimatorUpdateListener {
        final /* synthetic */ a bPK;

        b(a aVar) {
            this.bPK = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            a aVar = this.bPK;
            kotlin.jvm.internal.i.e(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                aVar.di = ((Float) animatedValue).floatValue();
                a.a(this.bPK).invalidate();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public a() {
        String str = "";
        this.bPD = str;
        this.bPE = str;
    }

    public final void a(TimeTextView timeTextView) {
        kotlin.jvm.internal.i.f(timeTextView, "tv");
        this.OQ = timeTextView;
        ane();
        this.Kj.setAntiAlias(true);
        anf();
    }

    private final void ane() {
        String str = "";
        this.bPD = str;
        this.bPE = str;
        TextView textView = this.OQ;
        if (textView == null) {
            kotlin.jvm.internal.i.lG("textView");
        }
        CharSequence text = textView.getText();
        kotlin.jvm.internal.i.e(text, "text");
        int a = v.a(text, ':', 0, false, 6, null);
        if (a != -1) {
            if (a == 0) {
                this.bPE = text.subSequence(1, text.length()).toString();
            } else {
                int length = text.length() - 2;
                if (1 <= a && length >= a) {
                    this.bPD = text.subSequence(0, a).toString();
                    this.bPE = text.subSequence(a + 1, text.length()).toString();
                } else if (a == text.length() - 1) {
                    this.bPD = text.subSequence(0, text.length() - 1).toString();
                }
            }
            this.bPF = this.Kj.measureText(this.bPD.toString());
            this.bPG = this.bPI.measureText(":");
            this.bPH = this.Kj.measureText(this.bPE.toString());
        }
    }

    private final void anf() {
        TextPaint textPaint = this.Kj;
        TextView textView = this.OQ;
        String str = "textView";
        if (textView == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textPaint.setColor(textView.getCurrentTextColor());
        textPaint = this.Kj;
        textView = this.OQ;
        if (textView == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textPaint.setTextSize(textView.getTextSize());
        textPaint = this.Kj;
        textView = this.OQ;
        if (textView == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textPaint.setTypeface(textView.getTypeface());
        textPaint = this.bPI;
        textView = this.OQ;
        if (textView == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textPaint.setColor(textView.getCurrentTextColor());
        textPaint = this.bPI;
        textView = this.OQ;
        if (textView == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textPaint.setTextSize(textView.getTextSize());
        textPaint = this.bPI;
        textView = this.OQ;
        if (textView == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textPaint.setTypeface(textView.getTypeface());
    }

    public final void D(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "text");
        TextView textView = this.OQ;
        if (textView == null) {
            kotlin.jvm.internal.i.lG("textView");
        }
        textView.setText(charSequence);
        ane();
        anf();
        if (this.Le == null) {
            ang();
        }
    }

    public final void ac() {
        ValueAnimator valueAnimator = this.Le;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.Le = (ValueAnimator) null;
    }

    private final void ang() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.3f});
        ofFloat.setDuration(500);
        ofFloat.addUpdateListener(new b(this));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.start();
        this.Le = ofFloat;
    }

    public final boolean p(Canvas canvas) {
        kotlin.jvm.internal.i.f(canvas, "canvas");
        if (this.Le == null) {
            return false;
        }
        float f = (this.bPF + this.bPG) + this.bPH;
        TextView textView = this.OQ;
        String str = "textView";
        if (textView == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        float width = (((float) textView.getWidth()) - f) / ((float) 2);
        TextView textView2 = this.OQ;
        if (textView2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        f = (float) textView2.getBaseline();
        canvas.drawText(this.bPD.toString(), width, f, this.Kj);
        this.bPI.setAlpha((int) (this.di * ((float) 255)));
        canvas.drawText(":", this.bPF + width, f, this.bPI);
        canvas.drawText(this.bPE.toString(), (width + this.bPF) + this.bPG, f, this.Kj);
        return true;
    }
}

package com.iqoption.core.ui.widget;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import kotlin.i;
import kotlin.jvm.internal.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007J\u0018\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0015\u001a\u00020\u000eJ\u0018\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0015\u001a\u00020\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/ui/widget/NumberAnimateTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animator", "Landroid/animation/ValueAnimator;", "doubleEvaluator", "Lcom/iqoption/core/ui/widget/NumberAnimateTextView$DoubleEvaluator;", "lastDoubleValue", "", "lastIntValue", "listener", "Lcom/iqoption/core/ui/widget/NumberAnimateTextView$AnimatorWithMaskUpdateListener;", "clear", "", "setValue", "value", "mask", "", "AnimatorWithMaskUpdateListener", "DoubleEvaluator", "core_release"})
/* compiled from: NumberAnimateTextView.kt */
public final class NumberAnimateTextView extends AppCompatTextView {
    private ValueAnimator Le;
    private int bLt;
    private double bLu;
    private a bLv;
    private b bLw;

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00030\u00030\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/ui/widget/NumberAnimateTextView$AnimatorWithMaskUpdateListener;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "view", "Lcom/iqoption/core/ui/widget/NumberAnimateTextView;", "(Lcom/iqoption/core/ui/widget/NumberAnimateTextView;)V", "mask", "", "viewRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "", "animation", "Landroid/animation/ValueAnimator;", "setMask", "core_release"})
    /* compiled from: NumberAnimateTextView.kt */
    private static final class a implements AnimatorUpdateListener {
        private final WeakReference<NumberAnimateTextView> Hg;
        private String mask;

        public a(NumberAnimateTextView numberAnimateTextView) {
            kotlin.jvm.internal.i.f(numberAnimateTextView, Promotion.ACTION_VIEW);
            this.Hg = new WeakReference(numberAnimateTextView);
        }

        public final void hl(String str) {
            this.mask = str;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            kotlin.jvm.internal.i.f(valueAnimator, "animation");
            NumberAnimateTextView numberAnimateTextView = (NumberAnimateTextView) this.Hg.get();
            if (numberAnimateTextView == null) {
                return;
            }
            if (this.mask != null) {
                n nVar = n.eWf;
                Locale locale = Locale.US;
                kotlin.jvm.internal.i.e(locale, "Locale.US");
                String str = this.mask;
                if (str == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                Object[] objArr = new Object[]{valueAnimator.getAnimatedValue()};
                String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
                kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
                numberAnimateTextView.setText(format);
                return;
            }
            numberAnimateTextView.setText(valueAnimator.getAnimatedValue().toString());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J+\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, bng = {"Lcom/iqoption/core/ui/widget/NumberAnimateTextView$DoubleEvaluator;", "Landroid/animation/TypeEvaluator;", "", "()V", "evaluate", "fraction", "", "startValue", "endValue", "(FLjava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;", "core_release"})
    /* compiled from: NumberAnimateTextView.kt */
    private static final class b implements TypeEvaluator<Double> {
        /* renamed from: a */
        public Double evaluate(float f, Double d, Double d2) {
            if (d == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            double doubleValue = d.doubleValue();
            double d3 = (double) f;
            if (d2 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            double doubleValue2 = d2.doubleValue() - d.doubleValue();
            Double.isNaN(d3);
            return Double.valueOf(doubleValue + (d3 * doubleValue2));
        }
    }

    public NumberAnimateTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public NumberAnimateTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ NumberAnimateTextView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = (AttributeSet) null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public NumberAnimateTextView(Context context, AttributeSet attributeSet, int i) {
        kotlin.jvm.internal.i.f(context, "context");
        super(context, attributeSet, i);
    }

    public final void setValue(int i) {
        H(null, i);
    }

    public final void setValue(double d) {
        h(null, d);
    }

    public final void H(String str, int i) {
        if (this.bLt != i) {
            ValueAnimator valueAnimator = this.Le;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.bLv == null) {
                this.bLv = new a(this);
            }
            a aVar = this.bLv;
            if (aVar != null) {
                aVar.hl(str);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.bLt, i});
            ofInt.setDuration(200);
            ofInt.addUpdateListener(this.bLv);
            ofInt.start();
            this.Le = ofInt;
            this.bLt = i;
        }
    }

    public final void h(String str, double d) {
        if (this.bLu != d) {
            ValueAnimator valueAnimator = this.Le;
            if (valueAnimator != null) {
                if (valueAnimator == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                valueAnimator.cancel();
            }
            if (this.bLw == null) {
                this.bLw = new b();
            }
            if (this.bLv == null) {
                this.bLv = new a(this);
            }
            a aVar = this.bLv;
            if (aVar != null) {
                aVar.hl(str);
            }
            ValueAnimator ofObject = ValueAnimator.ofObject(this.bLw, new Object[]{Double.valueOf(this.bLu), Double.valueOf(d)});
            ofObject.setDuration(200);
            ofObject.addUpdateListener(this.bLv);
            ofObject.start();
            this.Le = ofObject;
            this.bLu = d;
        }
    }

    public final void clear() {
        ValueAnimator valueAnimator = this.Le;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.Le = (ValueAnimator) null;
        this.bLu = 0.0d;
        this.bLt = 0;
        this.bLw = (b) null;
        setText("");
    }
}

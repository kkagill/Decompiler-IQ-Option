package com.iqoption.core.ui.widget.g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.RectF;
import android.view.View;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J(\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0014J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/core/ui/widget/timerview/FlowerView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mEngine", "Lcom/iqoption/core/ui/widget/timerview/FlowerDataCalc;", "mPetalPaint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "onUpdate", "leftTime", "", "maxValue", "Companion", "core_release"})
/* compiled from: FlowerView.kt */
public final class b extends View {
    private static final int bPT = 20;
    public static final a bPU = new a();
    private Paint bPR;
    private a bPS;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/ui/widget/timerview/FlowerView$Companion;", "", "()V", "PETAL_COUNT", "", "core_release"})
    /* compiled from: FlowerView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = ((float) i) / 8.0f;
        if (f < ((float) 5)) {
            f = 5.0f;
        }
        float f2 = f / ((float) 2);
        this.bPR.setAntiAlias(true);
        this.bPR.setStrokeWidth(f2);
        this.bPR.setStrokeCap(Cap.ROUND);
        this.bPR.setColor(-1);
        this.bPS.f(i, f);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        kotlin.jvm.internal.i.f(canvas, "canvas");
        int i = bPT;
        for (int i2 = 0; i2 < i; i2++) {
            this.bPR.setAlpha(this.bPS.ani()[i2]);
            RectF rectF = this.bPS.anh()[i2];
            if (rectF != null) {
                canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.bPR);
            }
        }
    }
}

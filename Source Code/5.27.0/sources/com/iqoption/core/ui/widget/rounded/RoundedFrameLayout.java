package com.iqoption.core.ui.widget.rounded;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.iqoption.core.i.d;
import com.iqoption.core.i.m;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/ui/widget/rounded/RoundedFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cornerRadius", "", "path", "Landroid/graphics/Path;", "rect", "Landroid/graphics/RectF;", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "core_release"})
/* compiled from: RoundedFrameLayout.kt */
public class RoundedFrameLayout extends FrameLayout {
    private float Lr;
    private final Path fb;
    private final RectF fd;

    public RoundedFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ RoundedFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = (AttributeSet) null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        kotlin.jvm.internal.i.f(context, "context");
        super(context, attributeSet, i);
        this.fd = new RectF();
        this.fb = new Path();
        TypedArray typedArray = (TypedArray) null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, m.RoundedFrameLayout, 0, 0);
            this.Lr = typedArray.getDimension(m.RoundedFrameLayout_cornerRadius, getResources().getDimension(d.dp4));
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.fb.reset();
        this.fd.set(0.0f, 0.0f, (float) i, (float) i2);
        Path path = this.fb;
        RectF rectF = this.fd;
        float f = this.Lr;
        path.addRoundRect(rectF, f, f, Direction.CW);
        this.fb.close();
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        Integer valueOf = canvas != null ? Integer.valueOf(canvas.save()) : null;
        if (canvas != null) {
            canvas.clipPath(this.fb);
        }
        super.dispatchDraw(canvas);
        if (canvas != null && valueOf != null) {
            canvas.restoreToCount(valueOf.intValue());
        }
    }
}

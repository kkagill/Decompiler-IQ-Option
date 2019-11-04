package com.iqoption.core.ui.widget.time;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/ui/widget/time/TimeTextView;", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "delegate", "Lcom/iqoption/core/ui/widget/time/TimeDrawDelegate;", "animateText", "", "text", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "showStaticText", "core_release"})
/* compiled from: TimeTextView.kt */
public final class TimeTextView extends TextView {
    private final a bPL;

    public TimeTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public TimeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TimeTextView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = (AttributeSet) null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public TimeTextView(Context context, AttributeSet attributeSet, int i) {
        kotlin.jvm.internal.i.f(context, "context");
        super(context, attributeSet, i);
        this.bPL = new a();
        this.bPL.a(this);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        kotlin.jvm.internal.i.f(canvas, "canvas");
        if (!this.bPL.p(canvas)) {
            super.onDraw(canvas);
        }
    }

    public final void D(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "text");
        this.bPL.D(charSequence);
    }

    public final void E(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "text");
        this.bPL.ac();
        setText(charSequence);
    }
}

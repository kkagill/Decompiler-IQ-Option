package com.iqoption.core.ui.widget.h;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.iqoption.core.graphics.animation.j;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/ui/widget/viewinterface/OnTouchScalePixelsEffect;", "Landroid/view/View$OnTouchListener;", "pixels", "", "(F)V", "getPixels", "()F", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "Companion", "core_release"})
/* compiled from: OnTouchScalePixelsEffect.kt */
public final class d implements OnTouchListener {
    public static final a bPZ = new a();
    private final float bPY;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/ui/widget/viewinterface/OnTouchScalePixelsEffect$Companion;", "", "()V", "DURATION", "", "core_release"})
    /* compiled from: OnTouchScalePixelsEffect.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public d() {
        this(0.0f, 1, null);
    }

    public d(float f) {
        this.bPY = f;
    }

    public /* synthetic */ d(float f, int i, f fVar) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        this(f);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.i.f(view, "v");
        kotlin.jvm.internal.i.f(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            float f = (float) 1;
            view.animate().scaleX((this.bPY / ((float) view.getWidth())) + f).scaleY(f + (this.bPY / ((float) view.getHeight()))).setDuration(300).setInterpolator(j.XJ()).start();
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300).setInterpolator(j.XJ()).start();
        }
        return false;
    }
}

package com.iqoption.core.ui.widget.gl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import com.iqoption.core.gl.ChartWindow;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/ui/widget/gl/ChartGestureDetector;", "", "context", "Landroid/content/Context;", "chart", "Lcom/iqoption/core/gl/ChartWindow;", "frame", "Lcom/iqoption/core/ui/widget/gl/ChartFrame;", "(Landroid/content/Context;Lcom/iqoption/core/gl/ChartWindow;Lcom/iqoption/core/ui/widget/gl/ChartFrame;)V", "gestureListener", "Lcom/iqoption/core/ui/widget/gl/ChartGestureDetector$GestureListener;", "isInstrumentSelected", "", "isScaling", "scaleDetector", "Landroid/view/ScaleGestureDetector;", "scrollDetector", "Landroid/view/GestureDetector;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "GestureListener", "ScaleListener", "core_release"})
/* compiled from: ChartGestureDetector.kt */
public final class b {
    private final ChartWindow aDk;
    private final a bNH = new a();
    private final GestureDetector bNI;
    private final ScaleGestureDetector bNJ;
    private boolean bNK;
    private boolean bNL;
    private final a bNM;

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016J(\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/ui/widget/gl/ChartGestureDetector$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/iqoption/core/ui/widget/gl/ChartGestureDetector;)V", "isMoveStarted", "", "onDoubleTap", "e", "Landroid/view/MotionEvent;", "onDown", "e1", "onFling", "e2", "velocityX", "", "velocityY", "onScroll", "distanceX", "distanceY", "onUp", "core_release"})
    /* compiled from: ChartGestureDetector.kt */
    private final class a extends SimpleOnGestureListener {
        private boolean bNN;

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            kotlin.jvm.internal.i.f(motionEvent, "e1");
            kotlin.jvm.internal.i.f(motionEvent2, "e2");
            if (b.this.bNK) {
                b.this.aDk.actionTouchMovedToPoint((motionEvent2.getX() - ((float) b.this.bNM.getPaddingLeft())) / ((float) b.this.bNM.amM()), (motionEvent2.getY() - ((float) b.this.bNM.getPaddingTop())) / ((float) b.this.bNM.amN()));
            } else {
                b.this.aDk.actionMove(f / ((float) b.this.bNM.amM()), f2 / ((float) b.this.bNM.amN()), 0.0f);
                this.bNN = true;
            }
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            kotlin.jvm.internal.i.f(motionEvent, "e1");
            kotlin.jvm.internal.i.f(motionEvent2, "e2");
            b.this.aDk.actionMove(0.0f, 0.0f, (((float) -1) * (f / ((float) 2))) / ((float) b.this.bNM.amM()));
            this.bNN = true;
            c(motionEvent2);
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            kotlin.jvm.internal.i.f(motionEvent, "e1");
            b bVar = b.this;
            bVar.bNK = bVar.aDk.actionTouchBegin((motionEvent.getX() - ((float) b.this.bNM.getPaddingLeft())) / ((float) b.this.bNM.amM()), (motionEvent.getY() - ((float) b.this.bNM.getPaddingTop())) / ((float) b.this.bNM.amN())) == 1;
            return true;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            kotlin.jvm.internal.i.f(motionEvent, "e");
            b.this.aDk.actionScale(2.0f);
            return true;
        }

        public final boolean c(MotionEvent motionEvent) {
            kotlin.jvm.internal.i.f(motionEvent, "e");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            if (this.bNN) {
                b.this.aDk.actionMoveEnded();
                this.bNN = false;
            }
            b.this.aDk.actionTouchEnd((motionEvent.getX() - ((float) b.this.bNM.getPaddingLeft())) / ((float) b.this.bNM.amM()), (motionEvent.getY() - ((float) b.this.bNM.getPaddingTop())) / ((float) b.this.bNM.amN()));
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\n"}, bng = {"Lcom/iqoption/core/ui/widget/gl/ChartGestureDetector$ScaleListener;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "(Lcom/iqoption/core/ui/widget/gl/ChartGestureDetector;)V", "onScale", "", "detector", "Landroid/view/ScaleGestureDetector;", "onScaleBegin", "onScaleEnd", "", "core_release"})
    /* compiled from: ChartGestureDetector.kt */
    private final class b extends SimpleOnScaleGestureListener {
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            kotlin.jvm.internal.i.f(scaleGestureDetector, "detector");
            if (scaleGestureDetector.getScaleFactor() > 0.0f) {
                b.this.aDk.actionScale(scaleGestureDetector.getScaleFactor());
            }
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            b.this.bNL = true;
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            b.this.bNL = false;
        }
    }

    public b(Context context, ChartWindow chartWindow, a aVar) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(chartWindow, "chart");
        kotlin.jvm.internal.i.f(aVar, "frame");
        this.aDk = chartWindow;
        this.bNM = aVar;
        GestureDetector gestureDetector = new GestureDetector(context, this.bNH);
        gestureDetector.setIsLongpressEnabled(false);
        this.bNI = gestureDetector;
        this.bNJ = new ScaleGestureDetector(context, new b());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kotlin.jvm.internal.i.f(motionEvent, "event");
        boolean z = true;
        if (this.bNJ.onTouchEvent(motionEvent) && this.bNL) {
            return true;
        }
        if (!(this.bNI.onTouchEvent(motionEvent) || this.bNH.c(motionEvent))) {
            z = false;
        }
        return z;
    }
}

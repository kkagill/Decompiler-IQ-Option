package com.jumio.gui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;

public class DrawView extends RelativeLayout {
    private DrawViewInterface drawViewInterface;

    public interface DrawViewInterface {
        void addChildren(@NonNull ViewGroup viewGroup);

        void draw(Canvas canvas);

        Rect getOverlayBounds();

        void measure(int i, int i2);
    }

    public DrawView(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public DrawView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    public DrawView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
    }

    @TargetApi(21)
    public DrawView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setWillNotDraw(false);
    }

    public void setDrawViewInterface(DrawViewInterface drawViewInterface) {
        this.drawViewInterface = drawViewInterface;
        if (drawViewInterface != null) {
            drawViewInterface.addChildren(this);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        i2 = getMeasuredHeight();
        if (i != 0 && i2 != 0) {
            DrawViewInterface drawViewInterface = this.drawViewInterface;
            if (drawViewInterface != null) {
                drawViewInterface.measure(i, i2);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        DrawViewInterface drawViewInterface = this.drawViewInterface;
        if (drawViewInterface != null) {
            drawViewInterface.draw(canvas);
        }
    }
}

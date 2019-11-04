package com.iqoption.core.ui.widget.gl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;

public final class GLChartSurfaceView extends GLSurfaceView {
    private a bNV;

    public interface a extends Renderer {
        void amO();

        void amP();

        boolean onTouchEvent(@NonNull MotionEvent motionEvent);
    }

    public GLChartSurfaceView(Context context) {
        this(context, null);
    }

    public GLChartSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            setEGLContextClientVersion(2);
            setEGLContextFactory(e.bNZ);
            setPreserveEGLContextOnPause(true);
        }
    }

    public void setController(@NonNull a aVar) {
        this.bNV = aVar;
        setRenderer(aVar);
        setRenderMode(1);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar = this.bNV;
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (aVar.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
            z = true;
        }
        return z;
    }

    public void onResume() {
        super.onResume();
        a aVar = this.bNV;
        if (aVar != null) {
            aVar.amO();
        }
    }

    public void onPause() {
        super.onPause();
        a aVar = this.bNV;
        if (aVar != null) {
            aVar.amP();
        }
    }
}

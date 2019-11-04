package com.iqoption.core.ui.widget.gl;

import android.opengl.GLSurfaceView.Renderer;
import com.iqoption.core.d;
import com.iqoption.core.gl.ChartLibrary;
import com.iqoption.core.gl.ChartWindow;
import com.iqoption.core.ui.widget.b.m;
import com.iqoption.core.ui.widget.gl.a.a;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J8\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\"\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u001c\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u001fJ\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u001fJ\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u001fJ\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, bng = {"Lcom/iqoption/core/ui/widget/gl/ChartRenderer;", "Landroid/opengl/GLSurfaceView$Renderer;", "Lcom/iqoption/core/ui/widget/GLTextureView$Renderer;", "Lcom/iqoption/core/ui/widget/gl/ChartFrame$OnFrameSizeChangedListener;", "chart", "Lcom/iqoption/core/gl/ChartWindow;", "frame", "Lcom/iqoption/core/ui/widget/gl/ChartFrame;", "color", "", "interfaceMode", "(Lcom/iqoption/core/gl/ChartWindow;Lcom/iqoption/core/ui/widget/gl/ChartFrame;II)V", "duration", "", "onDrawFrame", "", "gl", "Ljavax/microedition/khronos/opengles/GL10;", "onFrameSizeChanged", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "width", "height", "onSurfaceChanged", "onSurfaceCreated", "config", "Ljavax/microedition/khronos/egl/EGLConfig;", "setBottomPadding", "padding", "", "setLeftPadding", "setRightPadding", "setTopPadding", "core_release"})
/* compiled from: ChartRenderer.kt */
public final class c implements Renderer, m, a {
    private final ChartWindow aDk;
    private final a bNM;
    private float bNP;
    private final int bNQ;
    private final int color;

    public c(ChartWindow chartWindow, a aVar, int i, int i2) {
        kotlin.jvm.internal.i.f(chartWindow, "chart");
        kotlin.jvm.internal.i.f(aVar, "frame");
        this.aDk = chartWindow;
        this.bNM = aVar;
        this.color = i;
        this.bNQ = i2;
        this.bNM.a(this);
    }

    public /* synthetic */ c(ChartWindow chartWindow, a aVar, int i, int i2, int i3, f fVar) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        this(chartWindow, aVar, i, i2);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        ChartLibrary.init(d.Uo());
        ChartWindow chartWindow = this.aDk;
        int eJ = com.iqoption.core.ext.a.eJ(this.color);
        chartWindow.removeAllResources(0);
        chartWindow.workaroundNexusFlickeringEnable();
        if (eJ != 0) {
            chartWindow.commonSetViewBackgroundColor(eJ);
        }
        chartWindow.setInterfaceMode(this.bNQ);
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        if (i != 0 && i2 != 0) {
            this.bNM.ar(i, i2);
            a aVar = this.bNM;
            ChartWindow chartWindow = this.aDk;
            chartWindow.commonSetViewWidthAndHeight(i, i2);
            chartWindow.tabSetFrame((float) aVar.getPaddingLeft(), (float) aVar.getPaddingTop(), (float) ((i - aVar.getPaddingLeft()) - aVar.getPaddingRight()), (float) ((i2 - aVar.getPaddingTop()) - aVar.getPaddingBottom()), 1.0f);
            if (this.color == 0) {
                float f = (1.0f - ((((float) 512) * (((float) i) / ((float) i2))) / ((float) 1024))) / 2.0f;
                ChartWindow chartWindow2 = chartWindow;
                chartWindow2.commonSetViewBackground(ChartWindow.BG_RESOURCE_NAME, f, 0.0f, 1.0f - f, 1.0f);
            }
        }
    }

    public void onDrawFrame(GL10 gl10) {
        this.aDk.commonUpdateAndRender();
    }

    public void b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.aDk.tabSetFrame((float) i, (float) i2, (float) i5, (float) i6, this.bNP);
        this.bNP = 0.0f;
    }

    public static /* synthetic */ void a(c cVar, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        cVar.f(i, j);
    }

    public final void f(int i, long j) {
        this.bNP = ((float) j) / 1000.0f;
        this.bNM.setPaddingTop(i);
    }

    public static /* synthetic */ void b(c cVar, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        cVar.g(i, j);
    }

    public final void g(int i, long j) {
        this.bNP = ((float) j) / 1000.0f;
        this.bNM.setPaddingLeft(i);
    }

    public static /* synthetic */ void c(c cVar, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        cVar.h(i, j);
    }

    public final void h(int i, long j) {
        this.bNP = ((float) j) / 1000.0f;
        this.bNM.setPaddingRight(i);
    }

    public static /* synthetic */ void d(c cVar, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        cVar.i(i, j);
    }

    public final void i(int i, long j) {
        this.bNP = ((float) j) / 1000.0f;
        this.bNM.setPaddingBottom(i);
    }
}

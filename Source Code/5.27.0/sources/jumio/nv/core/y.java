package jumio.nv.core;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import com.jumio.commons.utils.ScreenUtil;
import com.jumio.core.data.document.DocumentFormat;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.core.data.document.ScanSide;
import com.jumio.nv.NVOverlay;
import com.jumio.nv.NVOverlay.NVOverlayConfig;
import com.jumio.nv.R;
import com.jumio.nv.gui.TextOverlayView;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;

/* compiled from: LineFinderOverlay */
public class y extends NVOverlay {
    private Paint a;
    private Paint b;
    private int c;
    private int d;
    private int e;
    private a f;
    private a g;
    private a i;
    private a j;
    private NVOverlayConfig k;

    /* compiled from: LineFinderOverlay */
    class a {
        private int b = 0;
        private int c = 0;
        private int d = 0;
        private int e = 0;
        private boolean f = false;

        public void a(int i, int i2, int i3, int i4) {
            this.b = i;
            this.d = i2;
            this.c = i3;
            this.e = i4;
        }

        public void a(boolean z) {
            this.f = z;
        }

        public void a(Canvas canvas) {
            if (this.f) {
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) this.b, (float) this.d, (float) this.c, (float) this.e, y.this.a);
                canvas2.drawRect((float) this.b, (float) this.d, (float) this.c, (float) this.e, y.this.b);
            }
        }
    }

    public y(Context context) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = null;
        this.g = null;
        this.i = null;
        this.j = null;
        this.k = new NVOverlayConfig();
        this.f = new a();
        this.g = new a();
        this.i = new a();
        this.j = new a();
        this.e = (int) ScreenUtil.dipToPx(context, 20.0f);
        this.d = (int) ScreenUtil.dipToPx(context, 4.0f);
        this.c = (int) ScreenUtil.dipToPx(context, 2.0f);
    }

    public NVOverlayConfig getNetverifyOverlayConfiguration(Context context) {
        NVOverlayConfig nVOverlayConfig = this.k;
        nVOverlayConfig.drawBrackets = true;
        nVOverlayConfig.dimBackground = true;
        nVOverlayConfig.topLeftCornerRadius = ScreenUtil.dpToPx(context, 15);
        NVOverlayConfig nVOverlayConfig2 = this.k;
        nVOverlayConfig2.topRightCornerRadius = nVOverlayConfig2.topLeftCornerRadius;
        nVOverlayConfig2 = this.k;
        nVOverlayConfig2.bottomLeftCornerRadius = nVOverlayConfig2.topLeftCornerRadius;
        nVOverlayConfig2 = this.k;
        nVOverlayConfig2.bottomRightCornerRadius = nVOverlayConfig2.topLeftCornerRadius;
        return this.k;
    }

    public void calculate(@NonNull DocumentScanMode documentScanMode, @NonNull DocumentFormat documentFormat, Rect rect) {
        super.calculate(documentScanMode, documentFormat, rect);
        this.f.a(this.overlayLeftPixel + this.e, (this.overlayTopPixel - this.c) - this.d, this.overlayRightPixel - this.e, this.overlayTopPixel - this.d);
        this.g.a(this.overlayLeftPixel + this.e, this.overlayBottomPixel + this.d, this.overlayRightPixel - this.e, (this.overlayBottomPixel + this.c) + this.d);
        this.i.a((this.overlayLeftPixel - this.c) - this.d, this.overlayTopPixel + this.e, this.overlayLeftPixel - this.d, this.overlayBottomPixel - this.e);
        this.j.a(this.overlayRightPixel + this.d, this.overlayTopPixel + this.e, (this.overlayRightPixel + this.c) + this.d, this.overlayBottomPixel - this.e);
    }

    public void prepareDraw(ScanSide scanSide, boolean z, boolean z2) {
        super.prepareDraw(scanSide, z, z2);
        TypedValue typedValue = new TypedValue();
        Theme theme = this.mContext.getTheme();
        theme.resolveAttribute(R.attr.netverify_scanOverlayDetectedLine, typedValue, true);
        this.a = new Paint(1);
        this.a.setStrokeWidth(0.0f);
        this.a.setStrokeJoin(Join.ROUND);
        this.a.setStrokeCap(Cap.ROUND);
        this.a.setPathEffect(new CornerPathEffect(1.0f));
        this.a.setStyle(Style.FILL);
        this.a.setColor(typedValue.data);
        this.a.setAlpha(128);
        theme.resolveAttribute(R.attr.netverify_scanOverlayDetectedLineStroke, typedValue, true);
        this.b = new Paint(1);
        this.b.setStrokeWidth(0.0f);
        this.b.setStrokeJoin(Join.ROUND);
        this.b.setStrokeCap(Cap.ROUND);
        this.b.setPathEffect(new CornerPathEffect(1.0f));
        this.b.setStyle(Style.STROKE);
        this.b.setColor(typedValue.data);
        this.b.setAlpha(128);
        this.mTextOverlayView.setText(this.mContext.getString(scanSide == ScanSide.FRONT ? R.string.netverify_use_front_side_of_card : R.string.netverify_use_back_side_of_card));
        TextOverlayView textOverlayView = this.mTextOverlayView;
        double measureText = (double) (((float) this.w) - this.mTextOverlayView.measureText());
        Double.isNaN(measureText);
        textOverlayView.setPosition((float) (measureText * 0.5d), (float) (this.overlayTopPixel + ((int) ScreenUtil.dipToPx(this.mContext, 30.0f))));
    }

    public void doDraw(Canvas canvas) {
        if (this.mVisibility.get() == 0) {
            super.doDraw(canvas);
            this.f.a(canvas);
            this.g.a(canvas);
            this.i.a(canvas);
            this.j.a(canvas);
            this.mTextOverlayView.draw(canvas);
        }
    }

    public void update(ExtractionUpdate extractionUpdate) {
        if (extractionUpdate.getData() instanceof w) {
            w wVar = (w) extractionUpdate.getData();
            this.f.a(wVar.c());
            this.g.a(wVar.d());
            this.i.a(wVar.b());
            this.j.a(wVar.a());
        }
    }
}

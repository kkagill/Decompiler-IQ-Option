package jumio.nv.mrz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.jumio.commons.utils.DrawingUtil;
import com.jumio.commons.utils.ScreenUtil;
import com.jumio.core.data.document.DocumentFormat;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.core.data.document.ScanSide;
import com.jumio.nv.NVOverlay;
import com.jumio.nv.NVOverlay.NVOverlayConfig;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;

/* compiled from: MrzOverlay */
public class d extends NVOverlay {
    private Paint a;
    private Rect b;
    private Path c;
    private NVOverlayConfig d = new NVOverlayConfig();
    private DocumentScanMode e = null;

    public void update(ExtractionUpdate extractionUpdate) {
    }

    public d(Context context) {
        super(context);
    }

    public void calculate(@NonNull DocumentScanMode documentScanMode, @NonNull DocumentFormat documentFormat, Rect rect) {
        super.calculate(documentScanMode, documentFormat, rect);
        this.e = documentScanMode;
        int i;
        if (documentScanMode == DocumentScanMode.MRP || documentScanMode == DocumentScanMode.MRV) {
            double d;
            int i2 = 0;
            Object obj = ((float) this.w) / ((float) this.h) >= 1.3333334f ? 1 : null;
            this.overlayLeftMargin = documentFormat.getOverlayLeftInPx(this.w);
            this.overlayRightMargin = documentFormat.getOverlayRightInPx(this.w);
            this.overlayTopMargin = documentFormat.getOverlayTopInPx(this.h);
            this.overlayBottomMargin = documentFormat.getOverlayBottomInPx(this.h);
            if (obj != null) {
                this.topOffset = 0;
                i = (this.h - this.overlayTopMargin) - this.overlayBottomMargin;
                double d2 = (double) i;
                double overlayRatio = documentFormat.getOverlayRatio();
                Double.isNaN(d2);
                this.leftOffset = (this.w - ((((int) (d2 * overlayRatio)) + this.overlayLeftMargin) + this.overlayRightMargin)) / 2;
            } else {
                this.leftOffset = 0;
                d = (double) ((this.w - this.overlayLeftMargin) - this.overlayRightMargin);
                double overlayRatio2 = documentFormat.getOverlayRatio();
                Double.isNaN(d);
                i = (((int) (d / overlayRatio2)) + this.overlayTopMargin) + this.overlayBottomMargin;
                i2 = (this.h - i) / 2;
                this.topOffset = i2;
            }
            this.overlayWidth = this.w - (this.leftOffset * 2);
            this.overlayHeight = (this.h - this.topOffset) - i2;
            this.overlayRightPixel = (this.w - this.leftOffset) - this.overlayRightMargin;
            this.overlayBottomPixel = (this.h - i2) - this.overlayBottomMargin;
            this.overlayLeftPixel = this.overlayLeftMargin + this.leftOffset;
            this.overlayTopPixel = this.overlayTopMargin + this.topOffset;
            int i3 = this.overlayBottomPixel;
            d = (double) i;
            double roiHeight = documentFormat.getRoiHeight();
            Double.isNaN(d);
            this.b = new Rect(this.overlayLeftPixel, i3 - ((int) (d * roiHeight)), this.overlayRightPixel, this.overlayBottomPixel);
            return;
        }
        i = this.overlayBottomPixel - documentFormat.getRoiMarginBottomPx(this.overlayHeight);
        this.b = new Rect(this.overlayLeftPixel, i - documentFormat.getRoiHeightInPx(this.overlayHeight), this.overlayRightPixel, i);
    }

    public void addViews(@NonNull ViewGroup viewGroup) {
        viewGroup.setLayerType(1, null);
    }

    public void prepareDraw(ScanSide scanSide, boolean z, boolean z2) {
        super.prepareDraw(scanSide, z, z2);
        int dipToPx = (int) ScreenUtil.dipToPx(this.mContext, 15.0f);
        int dipToPx2 = (int) ScreenUtil.dipToPx(this.mContext, 1.916f);
        int i = 2;
        int dipToPx3 = ((int) ScreenUtil.dipToPx(this.mContext, 2.0f)) / 2;
        this.a = new Paint();
        this.a.setColor(this.borderPaint.getColor());
        this.a.setStyle(Style.FILL_AND_STROKE);
        int i2 = 1;
        this.a.setDither(true);
        this.a.setAntiAlias(true);
        if (this.e == DocumentScanMode.MRP || this.e == DocumentScanMode.MRV) {
            this.c = DrawingUtil.createRectWithRoundedCornersAsPath(new Rect(this.overlayLeftPixel + dipToPx3, this.overlayTopPixel + dipToPx3, this.overlayRightPixel - dipToPx3, this.b.top), 0, 0, 0, 0);
            return;
        }
        DocumentFormat format = this.e.getFormat();
        int roiMarginBottomPx = (this.overlayBottomPixel - format.getRoiMarginBottomPx(this.overlayHeight)) - format.getRoiHeightInPx(this.overlayHeight);
        if (this.e == DocumentScanMode.TD1) {
            i = 3;
        }
        this.c = DrawingUtil.createRectWithRoundedCornersAsPath(new Rect(this.overlayLeftPixel + dipToPx3, this.overlayTopPixel + dipToPx3, this.overlayRightPixel - dipToPx3, (roiMarginBottomPx - dipToPx3) - format.getRoiMarginBottomPx(this.overlayHeight)), this.d.topLeftCornerRadius - dipToPx3, this.d.topRightCornerRadius - dipToPx3, 0, 0);
        this.c.setFillType(FillType.EVEN_ODD);
        float f = ((float) (this.b.bottom - this.b.top)) / ((float) i);
        while (i2 <= i) {
            float f2 = ((float) this.b.top) + (((float) i2) * f);
            float f3 = ((float) dipToPx2) / 2.0f;
            float f4 = f2 - f3;
            f2 += f3;
            this.c.addRect((float) (this.b.left + dipToPx), f4, (float) (this.b.right - dipToPx), f2, Direction.CCW);
            i2++;
        }
    }

    public void doDraw(Canvas canvas) {
        super.doDraw(canvas);
        if (this.mVisibility.get() == 0) {
            canvas.drawPath(this.c, this.a);
        }
    }

    public Rect a() {
        return this.b;
    }

    public NVOverlayConfig getNetverifyOverlayConfiguration(Context context) {
        NVOverlayConfig nVOverlayConfig = this.d;
        nVOverlayConfig.dimBackground = true;
        nVOverlayConfig.drawBrackets = true;
        NVOverlayConfig nVOverlayConfig2;
        if (this.e == DocumentScanMode.MRP || this.e == DocumentScanMode.MRV) {
            nVOverlayConfig = this.d;
            nVOverlayConfig.topLeftCornerRadius = 0;
            nVOverlayConfig.topRightCornerRadius = 0;
            nVOverlayConfig.bottomLeftCornerRadius = ScreenUtil.dpToPx(context, 5);
            nVOverlayConfig2 = this.d;
            nVOverlayConfig2.bottomRightCornerRadius = nVOverlayConfig2.bottomLeftCornerRadius;
        } else {
            this.d.topLeftCornerRadius = ScreenUtil.dpToPx(context, 15);
            nVOverlayConfig2 = this.d;
            nVOverlayConfig2.topRightCornerRadius = nVOverlayConfig2.topLeftCornerRadius;
            nVOverlayConfig2 = this.d;
            nVOverlayConfig2.bottomLeftCornerRadius = nVOverlayConfig2.topLeftCornerRadius;
            nVOverlayConfig2 = this.d;
            nVOverlayConfig2.bottomRightCornerRadius = nVOverlayConfig2.topLeftCornerRadius;
        }
        return this.d;
    }
}

package jumio.nv.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.Log.LogLevel;
import com.jumio.core.ImageQuality;
import com.jumio.core.data.document.DocumentFormat;
import com.jumio.core.environment.Environment;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.core.network.ErrorMock;
import com.jumio.nv.enums.NVErrorCase;
import com.jumio.nv.environment.NVEnvironment;
import com.jumio.nv.models.NVScanPartModel;
import com.jumio.nv.utils.NetverifyLogUtils;
import com.jumio.nv.utils.NetverifyLogUtils.a;
import com.jumio.ocr.impl.smartEngines.swig.DetectionEngine;
import com.jumio.ocr.impl.smartEngines.swig.DetectionInternalSettingsFactory;
import com.jumio.ocr.impl.smartEngines.swig.DetectionResult;
import com.jumio.ocr.impl.smartEngines.swig.DetectionSettings;
import com.jumio.ocr.impl.smartEngines.swig.OcrPoint;
import com.jumio.ocr.impl.smartEngines.swig.OcrQuadrangle;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.extraction.ExtractionClient;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.extraction.ExtractionUpdateState;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: LineFinderClient */
public class v extends ExtractionClient<ExtractionUpdate, Void> {
    public static int a = 800;
    public static int b = 600;
    private DetectionEngine c;
    private long d = 0;
    private DocumentFormat e;
    private byte[] f;
    private float g = 0.0f;

    private int a(boolean z, boolean z2, boolean z3, boolean z4) {
        int i = z ? 1 : 0;
        if (z2) {
            i++;
        }
        if (z3) {
            i++;
        }
        return z4 ? i + 1 : i;
    }

    public v(Context context) {
        super(context);
    }

    public void configure(StaticModel staticModel) {
        super.configure(staticModel);
        if (staticModel instanceof NVScanPartModel) {
            this.e = ((NVScanPartModel) staticModel).getFormat();
            return;
        }
        throw new InvalidParameterException("Configuration model should be an instance of ScanPartModel");
    }

    /* Access modifiers changed, original: protected */
    public void init(PreviewProperties previewProperties, Rect rect) {
        super.init(previewProperties, rect);
        Environment.loadJniInterfaceLib();
        DetectionSettings detectionSettings = new DetectionSettings();
        detectionSettings.setRoiLeftMargin(this.e.getOverlayLeft());
        detectionSettings.setRoiRightMargin(this.e.getOverlayRight());
        detectionSettings.setRoiTopMargin(this.e.getOverlayTop());
        detectionSettings.setRoiBottomMargin(this.e.getOverlayBottom());
        detectionSettings.setRoiVerticalDeviation(0.04d);
        detectionSettings.setRoiHorizontalDeviation(0.03d);
        try {
            ErrorMock.onOcrLoadingMock();
            String cardDetectionSettingsPath = NVEnvironment.getCardDetectionSettingsPath(this.mContext);
            if (cardDetectionSettingsPath != null) {
                this.c = new DetectionEngine(detectionSettings, DetectionInternalSettingsFactory.createFromFileSystem(cardDetectionSettingsPath));
                return;
            }
            throw new Exception("Loading detection settings failed!");
        } catch (Exception unused) {
            publishError(new JumioError(NVErrorCase.OCR_LOADING_FAILED));
        }
    }

    /* Access modifiers changed, original: protected */
    public void process(byte[] bArr, PreviewProperties previewProperties, Rect rect) {
        PreviewProperties previewProperties2 = previewProperties;
        a = 800;
        b = 600;
        RectF surfaceToPreview = CameraUtils.surfaceToPreview(previewProperties, rect);
        float height = ((float) rect.height()) / ((float) rect.width());
        if (previewProperties2.isPortrait) {
            if (surfaceToPreview.width() < 800.0f && height >= 0.75f) {
                a = (int) surfaceToPreview.width();
                b = (int) (((float) a) * 0.75f);
            } else if (surfaceToPreview.height() < 600.0f) {
                b = (int) surfaceToPreview.height();
                a = (int) (((float) b) / 0.75f);
            }
        } else if (surfaceToPreview.height() < 600.0f && height <= 0.75f) {
            b = (int) surfaceToPreview.height();
            a = (int) (((float) b) / 0.75f);
        } else if (surfaceToPreview.width() < 800.0f) {
            a = (int) surfaceToPreview.width();
            b = (int) (((float) a) * 0.75f);
        }
        byte[] yuv2rgb = CameraUtils.yuv2rgb(bArr, previewProperties2.isPortrait, previewProperties, rect, 0.75f, new Size(a, b));
        boolean z = false;
        if (yuv2rgb != null) {
            DetectionResult processRawImage;
            float calculateFocus = ImageQuality.calculateFocus(yuv2rgb, a, b, true);
            if (calculateFocus >= this.extractionInterface.getFocusThreshold()) {
                DetectionEngine detectionEngine = this.c;
                int i = a;
                processRawImage = detectionEngine.processRawImage(yuv2rgb, i, b, i * 3, (int) System.currentTimeMillis());
            } else {
                processRawImage = null;
            }
            if (processRawImage != null) {
                if (a(processRawImage.hasTopOfCard(), processRawImage.hasBottomOfCard(), processRawImage.hasLeftOfCard(), processRawImage.hasRightOfCard()) >= 3 && calculateFocus > this.g) {
                    if (Log.isLogEnabledForLevel(LogLevel.INFO)) {
                        Log.i("LineFinderClient", String.format(Locale.getDefault(), "Previous image focus value %f was replaced with new image focus value %f", new Object[]{Float.valueOf(this.g), Float.valueOf(calculateFocus)}));
                    }
                    this.g = calculateFocus;
                    this.f = Arrays.copyOf(yuv2rgb, yuv2rgb.length);
                }
                boolean a = a(processRawImage.hasTopOfCard(), processRawImage.hasBottomOfCard(), processRawImage.hasLeftOfCard(), processRawImage.hasRightOfCard(), processRawImage.getFlashTurnOn(), processRawImage.isCardImageOfGoodQuality() ^ 1);
                if (a) {
                    OcrQuadrangle cardQuadrangle = processRawImage.getCardQuadrangle();
                    if (cardQuadrangle != null) {
                        OcrPoint topLeft = cardQuadrangle.getTopLeft();
                        OcrPoint topRight = cardQuadrangle.getTopRight();
                        OcrPoint bottomLeft = cardQuadrangle.getBottomLeft();
                        OcrPoint bottomRight = cardQuadrangle.getBottomRight();
                        int x = topLeft.getX() < bottomLeft.getX() ? topLeft.getX() : bottomLeft.getX();
                        int y = topLeft.getY() < topRight.getY() ? topLeft.getY() : topRight.getY();
                        int x2 = (bottomRight.getX() > topRight.getX() ? bottomRight.getX() : topRight.getX()) - x;
                        int y2 = (bottomRight.getY() > bottomLeft.getY() ? bottomRight.getY() : bottomLeft.getY()) - y;
                        byte[] bArr2 = new byte[((x2 * y2) * 3)];
                        for (int i2 = y; i2 < y + y2; i2++) {
                            System.arraycopy(this.f, ((a * i2) * 3) + (x * 3), bArr2, ((i2 - y) * x2) * 3, x2 * 3);
                        }
                        a(this.f, a, b, bArr2, x2, y2, calculateFocus);
                    }
                    if (Log.isLogEnabledForLevel(LogLevel.INFO)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("hasTopOfCard(): ");
                        stringBuilder2.append(Boolean.toString(processRawImage.hasTopOfCard()));
                        stringBuilder.append(stringBuilder2.toString());
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("hasBottomOfCard(): ");
                        stringBuilder2.append(Boolean.toString(processRawImage.hasBottomOfCard()));
                        stringBuilder.append(stringBuilder2.toString());
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("hasLeftOfCard(): ");
                        stringBuilder2.append(Boolean.toString(processRawImage.hasLeftOfCard()));
                        stringBuilder.append(stringBuilder2.toString());
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("hasRightOfCard(): ");
                        stringBuilder2.append(Boolean.toString(processRawImage.hasRightOfCard()));
                        stringBuilder.append(stringBuilder2.toString());
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("getFlashTurnOn(): ");
                        stringBuilder2.append(Boolean.toString(processRawImage.getFlashTurnOn()));
                        stringBuilder.append(stringBuilder2.toString());
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("isCardImageOfGoodQuality(): ");
                        stringBuilder2.append(Boolean.toString(processRawImage.isCardImageOfGoodQuality()));
                        stringBuilder.append(stringBuilder2.toString());
                        stringBuilder.append("\r\n");
                        a.a(stringBuilder);
                        NetverifyLogUtils.logInfoInSubfolder(stringBuilder.toString(), v.class.getSimpleName(), null);
                    }
                }
                z = a;
            }
        }
        setResult(z);
    }

    /* Access modifiers changed, original: protected */
    public boolean shouldFeed() {
        return (this.c == null || this.extractionInterface == null || !this.extractionInterface.isSteady()) ? false : true;
    }

    private void a() {
        this.g = 0.0f;
        this.f = null;
    }

    private boolean a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        publishUpdate(new ExtractionUpdate(x.a, new w(z4, z3, z, z2, z5, z6)));
        int a = a(z, z2, z3, z4);
        z2 = false;
        if (a < 3 || z6) {
            this.d = 0;
            a();
            if (Log.isLogEnabledForLevel(LogLevel.INFO)) {
                a.a();
            }
            return false;
        }
        if (this.d == 0) {
            this.d = System.currentTimeMillis();
        }
        if (Log.isLogEnabledForLevel(LogLevel.INFO)) {
            a.a(a);
        }
        if (System.currentTimeMillis() >= this.d + 400) {
            z2 = true;
        }
        return z2;
    }

    private void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, float f) {
        publishUpdate(new ExtractionUpdate(ExtractionUpdateState.shotTaken, Float.valueOf(f)));
        publishUpdate(new ExtractionUpdate(x.a, new w(false, false, false, false, false, false)));
        Bitmap rgb2bitmap = CameraUtils.rgb2bitmap(bArr, i, i2);
        Bitmap rgb2bitmap2 = CameraUtils.rgb2bitmap(bArr2, i3, i4);
        publishUpdate(new ExtractionUpdate(ExtractionUpdateState.saveImage, rgb2bitmap));
        publishUpdate(new ExtractionUpdate(ExtractionUpdateState.saveExactImage, rgb2bitmap2));
        a();
        publishResult(null);
        System.gc();
    }
}

package jumio.nv.ocr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.jumio.clientlib.impl.templatematcher.FrameProcessingSettingsTemplateMatcher;
import com.jumio.clientlib.impl.templatematcher.FrameProcessorTemplateMatcher;
import com.jumio.clientlib.impl.templatematcher.HierarchicalClusteringSettings;
import com.jumio.clientlib.impl.templatematcher.LibImage;
import com.jumio.clientlib.impl.templatematcher.PixelFormatType;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.FileUtil;
import com.jumio.core.ImageQuality;
import com.jumio.core.network.ErrorMock;
import com.jumio.nv.benchmark.Benchmark;
import com.jumio.nv.benchmark.BenchmarkAlgorithm.DeviceCategory;
import com.jumio.nv.data.country.Country;
import com.jumio.nv.enums.NVErrorCase;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.nv.models.SelectionModel;
import com.jumio.nv.models.TemplateModel;
import com.jumio.nv.ocr.environment.NVOcrEnvironment;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.extraction.ExtractionClient;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.extraction.ExtractionUpdateState;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TemplateMatcherClient */
public class b extends ExtractionClient<ExtractionUpdate, DocumentDataModel> implements a {
    private final AtomicBoolean a = new AtomicBoolean(true);
    private int b = 10;
    private FrameProcessorTemplateMatcher c = null;
    private e d = null;
    private int e;
    private int f;
    private PreviewProperties g;
    private byte[] h;

    public b(Context context) {
        super(context);
        NVOcrEnvironment.loadTemplateMatcherLib();
        this.shouldInitAsync = true;
    }

    /* Access modifiers changed, original: protected */
    public void init(PreviewProperties previewProperties, Rect rect) {
        String str = "TemplateMatcherClient";
        super.init(previewProperties, rect);
        try {
            ErrorMock.onOcrLoadingMock();
            HierarchicalClusteringSettings hierarchicalClusteringSettings = new HierarchicalClusteringSettings();
            DeviceCategory deviceCategory = Benchmark.getDeviceCategory(this.mContext);
            if (deviceCategory == DeviceCategory.FAST) {
                this.b = 15;
            } else if (deviceCategory == DeviceCategory.MEDIUM) {
                this.b = 10;
            } else {
                this.b = 7;
            }
            FrameProcessingSettingsTemplateMatcher frameProcessingSettingsTemplateMatcher = new FrameProcessingSettingsTemplateMatcher(500, true, hierarchicalClusteringSettings, this.b, this.b);
            if (this.d != null) {
                try {
                    this.d.a();
                    this.d = null;
                } catch (Exception e) {
                    Log.printStackTrace(e);
                }
            }
            this.d = new e(this);
            if (this.c != null) {
                try {
                    this.c.reset();
                    this.c = null;
                } catch (Exception e2) {
                    Log.printStackTrace(e2);
                }
            }
            this.c = new FrameProcessorTemplateMatcher(frameProcessingSettingsTemplateMatcher, this.d);
            SelectionModel selectionModel = (SelectionModel) DataAccess.load(this.mContext, SelectionModel.class);
            if (selectionModel != null) {
                Country selectedCountry = selectionModel.getSelectedCountry();
                for (String str2 : new TemplateModel(this.mContext).getTemplate(selectedCountry, selectionModel.getSelectedDoctype().getId(), selectionModel.getSelectedDoctype().getDocumentScanSide())) {
                    String str3 = " to template matcher";
                    if (this.c.addTemplatesFromBinaryFile(str2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("pushed template ");
                        stringBuilder.append(selectedCountry);
                        stringBuilder.append(str3);
                        Log.d(str, stringBuilder.toString());
                    } else {
                        FileUtil.deleteFile(str2);
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Could not push file ");
                        stringBuilder2.append(str2);
                        stringBuilder2.append(str3);
                        throw new Exception(stringBuilder2.toString());
                    }
                }
                this.a.set(false);
                System.gc();
                return;
            }
            throw new Exception("SelectionModel should not be null");
        } catch (Exception e3) {
            Log.w(str, e3.getMessage());
            publishError(new JumioError(NVErrorCase.OCR_LOADING_FAILED));
            destroy();
        } catch (Throwable th) {
            this.a.set(false);
            System.gc();
        }
    }

    public void cancel() {
        super.cancel();
        publishUpdate(new c(d.b));
    }

    /* Access modifiers changed, original: protected */
    public void process(byte[] bArr, PreviewProperties previewProperties, Rect rect) {
        int i = previewProperties.camera.width;
        int i2 = previewProperties.camera.height;
        this.g = previewProperties;
        publishUpdate(new ExtractionUpdate(ExtractionUpdateState.notifyFlash, Boolean.valueOf(ImageQuality.isFlashNeeded(bArr, i, i2, false))));
        try {
            Log.i(String.format("push frame id %d", new Object[]{Integer.valueOf(this.e)}));
            PixelFormatType pixelFormatType = PixelFormatType.PIXEL_FORMAT_YUV420_NV21;
            long j = (long) i;
            int i3 = this.e;
            this.e = i3 + 1;
            this.c.pushFrame(new LibImage(bArr, pixelFormatType, i, i2, j, 1, 1, i3, 0));
        } catch (Exception e) {
            Log.e("TemplateMatcherClient", "Error pushing Frame to TemplateMatcherEngine: ", e);
            setResult(false);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean shouldFeed() {
        return this.a.get() ^ 1;
    }

    public void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if (bArr2 != null) {
            Bitmap rgb2bitmap = CameraUtils.rgb2bitmap(bArr2, i3, i4);
            publishUpdate(new ExtractionUpdate(ExtractionUpdateState.saveImage, CameraUtils.rgb2bitmap(bArr, i, i2)));
            publishUpdate(new ExtractionUpdate(ExtractionUpdateState.saveExactImage, rgb2bitmap));
        }
        System.gc();
        publishResult(null);
    }

    public void a() {
        this.f = 0;
        publishUpdate(new c(d.b));
        setResult(false);
    }

    public void a(LibImage libImage, a aVar) {
        if (aVar == null) {
            setResult(false);
            return;
        }
        aVar.a(this.g, this.isTablet);
        Log.i(String.format("intermediateResult frame id %d", new Object[]{Integer.valueOf(aVar.e())}));
        Object obj = (aVar.c() || !aVar.b()) ? 1 : null;
        if (obj != null) {
            try {
                if (this.c != null) {
                    this.c.discardFrameByID(aVar.e());
                }
            } catch (Exception e) {
                Log.printStackTrace(e);
            }
        } else {
            this.f++;
        }
        publishUpdate(new c(d.a, aVar, (float) Math.round((((float) this.f) / ((float) (this.b - 1))) * 100.0f)));
        int width = libImage.getWidth();
        int height = libImage.getHeight();
        byte[] bArr = this.h;
        if (bArr == null || Float.compare((float) bArr.length, ((float) (width * height)) * 1.5f) != 0) {
            this.h = new byte[((int) (((float) (width * height)) * 1.5f))];
        }
        libImage.getFrameBuffer(this.h);
        if (this.h != null && obj == null) {
            try {
                System.gc();
                Size size = new Size(-1, -1);
                byte[] a = a(this.h, aVar, false, size);
                float f = 0.0f;
                if (a != null) {
                    f = ImageQuality.calculateFocus(a, size.width, size.height, true);
                }
                if (f < this.extractionInterface.getFocusThreshold()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("request refocus - focus too low (");
                    stringBuilder.append(f);
                    stringBuilder.append(")");
                    Log.d("TemplateMatcherClient", stringBuilder.toString());
                    publishUpdate(new ExtractionUpdate(ExtractionUpdateState.notifyFocus, new Point((int) aVar.j().x, (int) aVar.j().y)));
                }
                System.gc();
            } catch (OutOfMemoryError e2) {
                Log.w("TemplateMatcher", "Intermediate result: focus check skipped - OOM!", e2);
                System.gc();
            } catch (Exception e22) {
                Log.w("TemplateMatcher handle IntermediateResult exception ", e22);
            }
        }
        setResult(false);
    }

    public void b(LibImage libImage, a aVar) {
        Object[] objArr = new Object[1];
        boolean z = false;
        objArr[0] = Integer.valueOf(aVar.e());
        Log.i(String.format("finalResult frame id %d", objArr));
        aVar.a(this.g, this.isTablet);
        publishUpdate(new c(d.c, aVar, 100.0f));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("final result, fIx = ");
        stringBuilder.append(aVar.e());
        String str = "TemplateMatcherClient";
        Log.i(str, stringBuilder.toString());
        this.f = 0;
        if (!aVar.b() || aVar.c()) {
            Log.w(str, "discard final result - out of bounds or object too small");
        } else {
            int width = libImage.getWidth();
            int height = libImage.getHeight();
            byte[] bArr = this.h;
            if (bArr == null || Float.compare((float) bArr.length, ((float) (width * height)) * 1.5f) != 0) {
                this.h = new byte[((int) (((float) (width * height)) * 1.5f))];
            }
            libImage.getFrameBuffer(this.h);
            float o = ((float) aVar.o()) / ((float) aVar.p());
            int width2 = aVar.h().width();
            int i = (int) (((float) width2) / o);
            byte[] a = f.a(this.h, this.g.isPortrait, aVar);
            o = ImageQuality.calculateFocus(a, width2, i, true);
            if (o >= this.extractionInterface.getFocusThreshold()) {
                publishUpdate(new ExtractionUpdate(ExtractionUpdateState.shotTaken, Float.valueOf(o)));
                Size size = new Size(-1, -1);
                a(f.a(this.h, 1.1f, size, this.g.isPortrait, aVar), size.width, size.height, a, width2, i);
                z = true;
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("discard final result because focus < ");
                stringBuilder2.append(this.extractionInterface.getFocusThreshold());
                Log.w(str, stringBuilder2.toString());
            }
        }
        this.c.reset();
        this.d.a();
        setResult(z);
    }

    private byte[] a(byte[] bArr, a aVar, boolean z, Size size) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Size size2 = size;
        Rect i7 = aVar.i();
        int i8 = i7.left;
        int i9 = i7.top;
        int height = i7.height();
        int width = i7.width();
        int i10;
        if (z) {
            int i11;
            if (aVar.q().isPortrait) {
                i8 = (int) aVar.f();
                height = (int) (((float) i7.width()) * 1.1f);
                width = i7.left - ((int) (((float) i7.width()) * 0.05f));
                if (width < 0) {
                    width = height;
                    i10 = 0;
                } else if (((float) (height + width)) > aVar.g()) {
                    i11 = width;
                    width = (int) (aVar.g() - ((float) width));
                    i10 = i11;
                } else {
                    i10 = width;
                    width = height;
                }
                i = i10;
                i2 = i8;
                i3 = i2;
                i4 = width;
                i5 = i4;
            } else {
                i8 = (int) aVar.g();
                height = (int) (((float) i7.width()) * 1.1f);
                width = i7.left - ((int) (((float) i7.width()) * 0.05f));
                if (width < 0) {
                    width = height;
                    i10 = 0;
                } else if (((float) (height + width)) > aVar.f()) {
                    i11 = width;
                    width = (int) (aVar.f() - ((float) width));
                    i10 = i11;
                } else {
                    i10 = width;
                    width = height;
                }
                i = i10;
                i2 = i8;
                i5 = i2;
                i4 = width;
                i3 = i4;
            }
            i6 = 0;
        } else {
            int height2;
            if (aVar.q().isPortrait) {
                height2 = i7.height();
                i10 = i7.width();
            } else {
                height2 = i7.width();
                i10 = i7.height();
            }
            i5 = i10;
            i = i8;
            i6 = i9;
            i2 = height;
            i4 = width;
            i3 = height2;
        }
        if (size2 != null) {
            size2.width = i3;
            size2.height = i5;
        }
        return CameraUtils.yuv2rgb(bArr, aVar.q().isPortrait, aVar.q(), i4, i2, i, i6, i3, i5);
    }
}

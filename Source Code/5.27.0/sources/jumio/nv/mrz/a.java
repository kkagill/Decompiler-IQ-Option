package jumio.nv.mrz;

import android.content.Context;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.log.Log;
import com.jumio.core.data.document.DocumentFormat;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.core.network.ErrorMock;
import com.jumio.mrz.impl.smartEngines.swig.MrzDate;
import com.jumio.mrz.impl.smartEngines.swig.MrzEngine;
import com.jumio.mrz.impl.smartEngines.swig.MrzEngineInternalSettingsLoader;
import com.jumio.mrz.impl.smartEngines.swig.MrzEngineSessionHelpers;
import com.jumio.mrz.impl.smartEngines.swig.MrzEngineSessionSettings;
import com.jumio.mrz.impl.smartEngines.swig.MrzField;
import com.jumio.mrz.impl.smartEngines.swig.MrzRectMatrix;
import com.jumio.mrz.impl.smartEngines.swig.MrzRectVector;
import com.jumio.mrz.impl.smartEngines.swig.MrzResult;
import com.jumio.mrz.impl.smartEngines.swig.StreamReporterInterface;
import com.jumio.mrz.impl.smartEngines.swig.StringVector;
import com.jumio.nv.data.document.NVMRZFormat;
import com.jumio.nv.enums.NVErrorCase;
import com.jumio.nv.enums.NVGender;
import com.jumio.nv.extraction.JumioRect;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.nv.models.NVScanPartModel;
import com.jumio.nv.mrz.environment.MrzEnvironment;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.extraction.ExtractionClient;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.extraction.ExtractionUpdateState;
import java.security.InvalidParameterException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: MrzClient */
public class a extends ExtractionClient<ExtractionUpdate, DocumentDataModel> {
    private MrzEngine a;
    private MrzEngineSessionHelpers b;
    private MrzEngineSessionSettings c;
    private a d;
    private DocumentScanMode e;
    private DocumentFormat f;
    private int g = 0;
    private int h = 0;
    private byte[] i;
    private float j = 0.0f;
    private byte[] k;
    private float l = 0.0f;

    /* compiled from: MrzClient */
    /* renamed from: jumio.nv.mrz.a$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[DocumentScanMode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Missing block: B:13:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.jumio.core.data.document.DocumentScanMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.jumio.core.data.document.DocumentScanMode.MRV;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.jumio.core.data.document.DocumentScanMode.MRP;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.jumio.core.data.document.DocumentScanMode.TD1;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.jumio.core.data.document.DocumentScanMode.TD2;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.jumio.core.data.document.DocumentScanMode.CNIS;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: jumio.nv.mrz.a$AnonymousClass1.<clinit>():void");
        }
    }

    /* compiled from: MrzClient */
    class a extends StreamReporterInterface {
        public boolean a;
        public MrzResult b;
        public MrzRectVector[] c;

        private a() {
            this.a = false;
        }

        /* synthetic */ a(a aVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void a() {
            this.a = false;
            this.b = null;
            this.c = new MrzRectVector[0];
            a.this.b();
        }

        public void SnapshotProcessed(MrzResult mrzResult, boolean z) {
            this.a = z;
            if (z) {
                this.b = new MrzResult(mrzResult);
                a.this.a();
            }
        }

        public void SnapshotRejected() {
            this.c = new MrzRectVector[0];
        }

        public void SymbolRectsFound(MrzRectMatrix mrzRectMatrix) {
            this.c = new MrzRectVector[((int) mrzRectMatrix.size())];
            for (int i = 0; ((long) i) < mrzRectMatrix.size(); i++) {
                this.c[i] = new MrzRectVector(mrzRectMatrix.get(i).size());
                for (int i2 = 0; ((long) i2) < mrzRectMatrix.get(i).size(); i2++) {
                    this.c[i].set(i2, mrzRectMatrix.get(i).get(i2));
                }
            }
        }
    }

    public a(Context context) {
        super(context);
        MrzEnvironment.loadMRZJniInterfaceLib();
        this.c = new MrzEngineSessionSettings();
        this.c.set_should_postprocess(true);
        this.c.set_m3z_support_enabled(false);
        this.b = new MrzEngineSessionHelpers();
        this.shouldInitAsync = true;
    }

    public void configure(StaticModel staticModel) {
        super.configure(staticModel);
        if (staticModel instanceof NVScanPartModel) {
            NVScanPartModel nVScanPartModel = (NVScanPartModel) staticModel;
            this.e = nVScanPartModel.getScanMode();
            this.f = nVScanPartModel.getFormat();
            boolean z = true;
            this.c.set_mrp_support_enabled(this.e == DocumentScanMode.MRP);
            this.c.set_td1_support_enabled(this.e == DocumentScanMode.TD1);
            MrzEngineSessionSettings mrzEngineSessionSettings = this.c;
            boolean z2 = this.e == DocumentScanMode.TD2 || this.e == DocumentScanMode.CNIS;
            mrzEngineSessionSettings.set_td2_support_enabled(z2);
            this.c.set_cnis_support_enabled(this.e == DocumentScanMode.CNIS);
            this.c.set_mrva_support_enabled(this.e == DocumentScanMode.MRV);
            mrzEngineSessionSettings = this.c;
            if (this.e != DocumentScanMode.MRV) {
                z = false;
            }
            mrzEngineSessionSettings.set_mrvb_support_enabled(z);
            this.d = new a(this, null);
            return;
        }
        throw new InvalidParameterException("Configuration model should be an instance of ScanPartModel");
    }

    /* Access modifiers changed, original: protected */
    public void init(PreviewProperties previewProperties, Rect rect) {
        String str = "MrzClient";
        super.init(previewProperties, rect);
        try {
            ErrorMock.onOcrLoadingMock();
            String mRZEngineSettingsPath = MrzEnvironment.getMRZEngineSettingsPath(this.mContext);
            if (mRZEngineSettingsPath != null) {
                this.a = new MrzEngine(MrzEngineInternalSettingsLoader.createFromFilesystem(mRZEngineSettingsPath));
                this.d.a();
                if (this.a != null) {
                    try {
                        ErrorMock.onOcrLoadingMock();
                        this.a.InitializeSession(this.d, this.b, this.c);
                    } catch (Exception e) {
                        Log.e(str, "MrzInitTask", e);
                        publishError(new JumioError(NVErrorCase.OCR_LOADING_FAILED));
                    }
                    d dVar = new d(this.mContext);
                    dVar.calculate(this.e, this.f, rect);
                    rect = dVar.getOverlayBounds();
                    Rect a = dVar.a();
                    this.g = rect.left;
                    double d = (double) (previewProperties.surface.width - (this.g * 2));
                    double d2 = this.b.get_optimal_aspect_ratio();
                    Double.isNaN(d);
                    int i = (int) (d / d2);
                    this.h = a.top - ((i - (a.bottom - a.top)) / 2);
                    if (this.h + i > previewProperties.surface.height) {
                        this.h = previewProperties.surface.height - i;
                        return;
                    }
                    return;
                }
                return;
            }
            throw new Exception("Loading mrz settings failed!");
        } catch (Exception e2) {
            Log.e(str, "MrzLoadingTask", e2);
            publishError(new JumioError(NVErrorCase.OCR_LOADING_FAILED));
        }
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    public void process(byte[] r24, com.jumio.commons.camera.PreviewProperties r25, android.graphics.Rect r26) {
        /*
        r23 = this;
        r8 = r23;
        r0 = r25;
        r1 = r0.preview;
        r1 = r1.width;
        r2 = r0.preview;
        r2 = r2.height;
        r3 = r8.b;
        r3 = r3.get_optimal_aspect_ratio();
        r5 = r8.g;
        r6 = r0.scaledPreview;
        r6 = r6.width;
        r7 = r0.surface;
        r7 = r7.width;
        r6 = r6 - r7;
        r6 = r6 / 2;
        r5 = r5 + r6;
        r5 = r5 * r1;
        r6 = r0.scaledPreview;
        r6 = r6.width;
        r7 = r5 / r6;
        r5 = r7 * 2;
        r9 = r1 - r5;
        r10 = (double) r9;
        java.lang.Double.isNaN(r10);
        r3 = r10 / r3;
        r12 = (int) r3;
        r1 = r8.h;
        r3 = r0.scaledPreview;
        r3 = r3.height;
        r4 = r0.surface;
        r4 = r4.height;
        r3 = r3 - r4;
        r3 = r3 / 2;
        r1 = r1 + r3;
        r1 = r1 * r2;
        r2 = r0.scaledPreview;
        r2 = r2.height;
        r13 = r1 / r2;
        r15 = new com.jumio.mrz.impl.smartEngines.swig.MrzRect;
        r15.<init>(r7, r13, r9, r12);
        r1 = com.jumio.mrz.impl.smartEngines.swig.MrzEngine.ImageOrientation.Landscape;
        r2 = r0.orientation;
        r3 = 90;
        if (r2 != r3) goto L_0x0059;
    L_0x0056:
        r1 = com.jumio.mrz.impl.smartEngines.swig.MrzEngine.ImageOrientation.Portrait;
        goto L_0x006a;
    L_0x0059:
        r2 = r0.orientation;
        r3 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        if (r2 != r3) goto L_0x0062;
    L_0x005f:
        r1 = com.jumio.mrz.impl.smartEngines.swig.MrzEngine.ImageOrientation.InvertedLandscape;
        goto L_0x006a;
    L_0x0062:
        r2 = r0.orientation;
        r3 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        if (r2 != r3) goto L_0x006a;
    L_0x0068:
        r1 = com.jumio.mrz.impl.smartEngines.swig.MrzEngine.ImageOrientation.InvertedPortrait;
    L_0x006a:
        r2 = r0.frontFacing;
        if (r2 == 0) goto L_0x007b;
    L_0x006e:
        r2 = com.jumio.mrz.impl.smartEngines.swig.MrzEngine.ImageOrientation.Portrait;
        if (r1 != r2) goto L_0x0075;
    L_0x0072:
        r1 = com.jumio.mrz.impl.smartEngines.swig.MrzEngine.ImageOrientation.InvertedPortrait;
        goto L_0x007b;
    L_0x0075:
        r2 = com.jumio.mrz.impl.smartEngines.swig.MrzEngine.ImageOrientation.InvertedPortrait;
        if (r1 != r2) goto L_0x007b;
    L_0x0079:
        r1 = com.jumio.mrz.impl.smartEngines.swig.MrzEngine.ImageOrientation.Portrait;
    L_0x007b:
        r14 = r1;
        r1 = r26.height();
        r1 = (float) r1;
        r2 = r26.width();
        r2 = (float) r2;
        r1 = r1 / r2;
        r2 = r0.isPortrait;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r2 == 0) goto L_0x0090;
    L_0x008d:
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x0092;
    L_0x0090:
        r2 = 1061158912; // 0x3f400000 float:0.75 double:5.24282163E-315;
    L_0x0092:
        r4 = r0.isPortrait;
        if (r4 == 0) goto L_0x009c;
    L_0x0096:
        r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r4 >= 0) goto L_0x009c;
    L_0x009a:
        r5 = r1;
        goto L_0x00aa;
    L_0x009c:
        r4 = r0.isPortrait;
        if (r4 != 0) goto L_0x00a9;
    L_0x00a0:
        r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x00a9;
    L_0x00a4:
        r1 = java.lang.Math.min(r3, r1);
        goto L_0x009a;
    L_0x00a9:
        r5 = r2;
    L_0x00aa:
        r6 = new com.jumio.commons.camera.Size;
        r1 = -1;
        r6.<init>(r1, r1);
        r2 = r0.isPortrait;
        r1 = r24;
        r3 = r25;
        r4 = r26;
        r22 = r6;
        r4 = com.jumio.commons.camera.CameraUtils.yuv2rgb(r1, r2, r3, r4, r5, r6);
        r1 = 0;
        if (r4 != 0) goto L_0x00c5;
    L_0x00c1:
        r8.setResult(r1);
        return;
    L_0x00c5:
        r2 = r22;
        r3 = r2.width;
        r5 = r2.height;
        r6 = 1;
        r5 = com.jumio.core.ImageQuality.calculateFocus(r4, r3, r5, r6);
        r3 = r2.width;
        r1 = r2.height;
        r1 = com.jumio.core.ImageQuality.isFlashNeeded(r4, r3, r1, r6);
        r3 = new com.jumio.sdk.extraction.ExtractionClient$ExtractionUpdate;
        r6 = com.jumio.sdk.extraction.ExtractionUpdateState.notifyFlash;
        r1 = java.lang.Boolean.valueOf(r1);
        r3.<init>(r6, r1);
        r8.publishUpdate(r3);
        r1 = r8.extractionInterface;
        r1 = r1.getFocusThreshold();
        r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r1 > 0) goto L_0x00f2;
    L_0x00f0:
        r1 = 1;
        goto L_0x00f3;
    L_0x00f2:
        r1 = 0;
    L_0x00f3:
        if (r1 == 0) goto L_0x0127;
    L_0x00f5:
        r0 = r0.surface;
        r0 = r0.width;
        r1 = r8.g;
        r1 = r1 * 2;
        r0 = r0 - r1;
        r1 = r8.b;
        r1 = r1.get_optimal_aspect_ratio();
        java.lang.Double.isNaN(r10);
        r10 = r10 / r1;
        r1 = (int) r10;
        r2 = r8.g;
        r0 = r0 / 2;
        r2 = r2 + r0;
        r0 = r8.h;
        r1 = r1 / 2;
        r0 = r0 + r1;
        r1 = new com.jumio.sdk.extraction.ExtractionClient$ExtractionUpdate;
        r3 = com.jumio.sdk.extraction.ExtractionUpdateState.notifyFocus;
        r4 = new android.graphics.Point;
        r4.<init>(r2, r0);
        r1.<init>(r3, r4);
        r8.publishUpdate(r1);
        r1 = 0;
        r8.setResult(r1);
        return;
    L_0x0127:
        r1 = r4.length;
        r1 = java.util.Arrays.copyOf(r4, r1);
        r8.i = r1;
        r8.j = r5;
        r1 = r8.a;	 Catch:{ MrzException -> 0x052e }
        r3 = r0.camera;	 Catch:{ MrzException -> 0x052e }
        r3 = r3.width;	 Catch:{ MrzException -> 0x052e }
        r6 = r0.camera;	 Catch:{ MrzException -> 0x052e }
        r6 = r6.height;	 Catch:{ MrzException -> 0x052e }
        r10 = r0.camera;	 Catch:{ MrzException -> 0x052e }
        r10 = r10.width;	 Catch:{ MrzException -> 0x052e }
        r19 = 1;
        r11 = r14;
        r14 = r1;
        r1 = r15;
        r15 = r24;
        r16 = r3;
        r17 = r6;
        r18 = r10;
        r20 = r1;
        r21 = r11;
        r14.FeedUncompressedImageData(r15, r16, r17, r18, r19, r20, r21);	 Catch:{ MrzException -> 0x052e }
        r1 = com.jumio.commons.camera.CameraUtils.surfaceToPreview(r25, r26);
        r3 = (float) r7;
        r6 = r1.left;
        r3 = r3 - r6;
        r6 = r1.width();
        r10 = r2.width;
        r10 = (float) r10;
        r6 = r6 - r10;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r6 / r10;
        r3 = r3 - r6;
        r3 = (int) r3;
        r6 = (float) r13;
        r14 = r1.top;
        r6 = r6 - r14;
        r1 = r1.height();
        r14 = r2.height;
        r14 = (float) r14;
        r1 = r1 - r14;
        r1 = r1 / r10;
        r6 = r6 - r1;
        r1 = (int) r6;
        r6 = r8.d;
        r6 = r6.c;
        r3 = r8.a(r6, r3, r1);
        r1 = r8.d;
        r1 = r1.a;
        if (r1 == 0) goto L_0x04fe;
    L_0x0184:
        r1 = jumio.nv.mrz.a.class;
        r1 = r1.getSimpleName();
        r6 = com.jumio.commons.log.Log.LogLevel.INFO;
        r6 = com.jumio.commons.log.Log.isLogEnabledForLevel(r6);
        if (r6 == 0) goto L_0x04e8;
    L_0x0192:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r10 = java.util.Calendar.getInstance();
        r14 = new java.lang.StringBuilder;
        r14.<init>();
        r15 = "width = ";
        r14.append(r15);
        r15 = r0.camera;
        r15 = r15.width;
        r14.append(r15);
        r15 = "\r\n";
        r14.append(r15);
        r14 = r14.toString();
        r6.append(r14);
        r14 = new java.lang.StringBuilder;
        r14.<init>();
        r20 = r5;
        r5 = "height = ";
        r14.append(r5);
        r5 = r0.camera;
        r5 = r5.height;
        r14.append(r5);
        r14.append(r15);
        r5 = r14.toString();
        r6.append(r5);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r14 = "stride = ";
        r5.append(r14);
        r0 = r0.camera;
        r0 = r0.width;
        r5.append(r0);
        r5.append(r15);
        r0 = r5.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = "roi_x = ";
        r0.append(r5);
        r0.append(r7);
        r0.append(r15);
        r0 = r0.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = "roi_y = ";
        r0.append(r5);
        r0.append(r13);
        r0.append(r15);
        r0 = r0.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = "roiWidth = ";
        r0.append(r5);
        r0.append(r9);
        r0.append(r15);
        r0 = r0.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = "roiHeight = ";
        r0.append(r5);
        r0.append(r12);
        r0.append(r15);
        r0 = r0.toString();
        r6.append(r0);
        r0 = "roi = new MrzRect(roi_x, roi_y, roiWidth, roiHeight)\r\n";
        r6.append(r0);
        r0 = com.jumio.mrz.impl.smartEngines.swig.MrzEngine.ImageOrientation.InvertedPortrait;
        if (r11 != r0) goto L_0x0258;
    L_0x0255:
        r0 = "InvertedPortrait";
        goto L_0x0268;
    L_0x0258:
        r0 = com.jumio.mrz.impl.smartEngines.swig.MrzEngine.ImageOrientation.Landscape;
        if (r11 != r0) goto L_0x025f;
    L_0x025c:
        r0 = "Landscape";
        goto L_0x0268;
    L_0x025f:
        r0 = com.jumio.mrz.impl.smartEngines.swig.MrzEngine.ImageOrientation.InvertedLandscape;
        if (r11 != r0) goto L_0x0266;
    L_0x0263:
        r0 = "InvertedLandscape";
        goto L_0x0268;
    L_0x0266:
        r0 = "Portrait";
    L_0x0268:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r7 = "orientation = ";
        r5.append(r7);
        r5.append(r0);
        r0 = r5.toString();
        r6.append(r0);
        r0 = "FeedUncompressedImageData(buffer, width, height, stride, 1, roi, orientation)";
        r6.append(r0);
        r6.append(r15);
        r6.append(r15);
        r0 = "Result:";
        r6.append(r0);
        r6.append(r15);
        r0 = r8.d;
        r0 = r0.b;
        r0 = r0.getMrzLines();
        r5 = 0;
    L_0x0298:
        r11 = (long) r5;
        r13 = r0.size();
        r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r7 >= 0) goto L_0x02ca;
    L_0x02a1:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r9 = 1;
        r11 = new java.lang.Object[r9];
        r9 = java.lang.Integer.valueOf(r5);
        r12 = 0;
        r11[r12] = r9;
        r9 = "getMrzLines().get(%d) ";
        r9 = java.lang.String.format(r9, r11);
        r7.append(r9);
        r9 = r0.get(r5);
        r7.append(r9);
        r7 = r7.toString();
        r6.append(r7);
        r5 = r5 + 1;
        goto L_0x0298;
    L_0x02ca:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = "getDocType() ";
        r0.append(r5);
        r5 = r8.d;
        r5 = r5.b;
        r5 = r5.getDocType();
        r5 = r5.getAsString();
        r0.append(r5);
        r0.append(r15);
        r0 = r0.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = "getDocTypeCode() ";
        r0.append(r5);
        r5 = r8.d;
        r5 = r5.b;
        r5 = r5.getDocTypeCode();
        r5 = r5.getAsString();
        r0.append(r5);
        r0.append(r15);
        r0 = r0.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = "getDocNum() ";
        r0.append(r5);
        r5 = r8.d;
        r5 = r5.b;
        r5 = r5.getDocNum();
        r5 = r5.getAsString();
        r0.append(r5);
        r0.append(r15);
        r0 = r0.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = "getOptData1() ";
        r0.append(r5);
        r5 = r8.d;
        r5 = r5.b;
        r5 = r5.getOptData1();
        r5 = r5.getAsString();
        r0.append(r5);
        r0.append(r15);
        r0 = r0.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = "getOptData2() ";
        r0.append(r5);
        r5 = r8.d;
        r5 = r5.b;
        r5 = r5.getOptData2();
        r5 = r5.getAsString();
        r0.append(r5);
        r0.append(r15);
        r0 = r0.toString();
        r6.append(r0);
        r0 = r8.d;
        r0 = r0.b;
        r0 = r0.getExpidate();
        r0 = r0.getAsMrzDate();
        r0 = r0.getYear();
        r5 = r8.d;
        r5 = r5.b;
        r5 = r5.getExpidate();
        r5 = r5.getAsMrzDate();
        r5 = r5.getMonth();
        r0 = r0 + r5;
        r5 = 1;
        r0 = r0 - r5;
        r5 = r8.d;
        r5 = r5.b;
        r5 = r5.getExpidate();
        r5 = r5.getAsMrzDate();
        r16 = r5.getDay();
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r14 = r10;
        r5 = r15;
        r15 = r0;
        r14.set(r15, r16, r17, r18, r19);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7 = "getExpidate() ";
        r0.append(r7);
        r7 = r10.getTime();
        r7 = r7.toString();
        r0.append(r7);
        r0.append(r5);
        r0 = r0.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7 = "getCountry() ";
        r0.append(r7);
        r7 = r8.d;
        r7 = r7.b;
        r7 = r7.getCountry();
        r7 = r7.getAsString();
        r0.append(r7);
        r0.append(r5);
        r0 = r0.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7 = "getSecondName() ";
        r0.append(r7);
        r7 = r8.d;
        r7 = r7.b;
        r7 = r7.getSecondName();
        r7 = r7.getAsString();
        r0.append(r7);
        r0.append(r5);
        r0 = r0.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7 = "getFirstName() ";
        r0.append(r7);
        r7 = r8.d;
        r7 = r7.b;
        r7 = r7.getFirstName();
        r7 = r7.getAsString();
        r0.append(r7);
        r0.append(r5);
        r0 = r0.toString();
        r6.append(r0);
        r0 = r8.d;
        r0 = r0.b;
        r0 = r0.getBirthdate();
        r0 = r0.getAsMrzDate();
        r0 = r0.getYear();
        r7 = r8.d;
        r7 = r7.b;
        r7 = r7.getBirthdate();
        r7 = r7.getAsMrzDate();
        r7 = r7.getMonth();
        r0 = r0 + r7;
        r7 = 1;
        r15 = r0 + -1;
        r0 = r8.d;
        r0 = r0.b;
        r0 = r0.getBirthdate();
        r0 = r0.getAsMrzDate();
        r16 = r0.getDay();
        r14.set(r15, r16, r17, r18, r19);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7 = "getBirthdate() ";
        r0.append(r7);
        r7 = r10.getTime();
        r7 = r7.toString();
        r0.append(r7);
        r0.append(r5);
        r0 = r0.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7 = "getSex() ";
        r0.append(r7);
        r7 = r8.d;
        r7 = r7.b;
        r7 = r7.getSex();
        r7 = r7.getAsString();
        r0.append(r7);
        r0.append(r5);
        r0 = r0.toString();
        r6.append(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7 = "getNationality() ";
        r0.append(r7);
        r7 = r8.d;
        r7 = r7.b;
        r7 = r7.getNationality();
        r7 = r7.getAsString();
        r0.append(r7);
        r0.append(r5);
        r0 = r0.toString();
        r6.append(r0);
        com.jumio.nv.utils.NetverifyLogUtils.appendCoordinatesLog(r6, r3);
        r0 = r6.toString();
        r5 = 0;
        com.jumio.nv.utils.NetverifyLogUtils.logInfoInSubfolder(r0, r1, r5);
        goto L_0x04ea;
    L_0x04e8:
        r20 = r5;
    L_0x04ea:
        r0 = com.jumio.commons.log.Log.LogLevel.VERBOSE;
        r0 = com.jumio.commons.log.Log.isLogEnabledForLevel(r0);
        if (r0 == 0) goto L_0x0500;
    L_0x04f2:
        r0 = r2.width;
        r5 = r2.height;
        r0 = com.jumio.commons.utils.ImageUtil.rgbToBitmap(r4, r0, r5);
        com.jumio.nv.utils.NetverifyLogUtils.dumpPictureWithCoordinates(r3, r0, r1);
        goto L_0x0500;
    L_0x04fe:
        r20 = r5;
    L_0x0500:
        r0 = r8.d;
        r0 = r0.a;
        if (r0 == 0) goto L_0x0518;
    L_0x0506:
        r0 = r8.d;
        r0 = r0.b;
        r5 = r2.width;
        r6 = r2.height;
        r1 = r23;
        r2 = r0;
        r0 = r20;
        r7 = r0;
        r1.a(r2, r3, r4, r5, r6, r7);
        goto L_0x0526;
    L_0x0518:
        r0 = new com.jumio.sdk.extraction.ExtractionClient$ExtractionUpdate;
        r1 = jumio.nv.mrz.b.a;
        r2 = r8.d;
        r2 = r2.c;
        r0.<init>(r1, r2);
        r8.publishUpdate(r0);
    L_0x0526:
        r0 = r8.d;
        r0 = r0.a;
        r8.setResult(r0);
        return;
    L_0x052e:
        r0 = move-exception;
        com.jumio.commons.log.Log.printStackTrace(r0);
        r1 = 0;
        r8.setResult(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: jumio.nv.mrz.a.process(byte[], com.jumio.commons.camera.PreviewProperties, android.graphics.Rect):void");
    }

    /* Access modifiers changed, original: protected */
    public boolean shouldFeed() {
        return this.a != null && this.extractionInterface.isSteady();
    }

    /* Access modifiers changed, original: protected */
    public void a() {
        float f = this.j;
        if (f > this.l) {
            this.l = f;
            Log.i("MrzClient", String.format(Locale.getDefault(), "Previous image focus value %f was replaced with new image focus value %f", new Object[]{Float.valueOf(this.l), Float.valueOf(this.j)}));
            byte[] bArr = this.i;
            this.k = Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        this.j = 0.0f;
        this.l = 0.0f;
        this.k = null;
        this.i = null;
    }

    /* Access modifiers changed, original: protected */
    public void a(MrzResult mrzResult, ArrayList<ArrayList<JumioRect>> arrayList, byte[] bArr, int i, int i2, float f) {
        Object rgb2bitmap;
        String a;
        publishUpdate(new ExtractionUpdate(ExtractionUpdateState.shotTaken, Float.valueOf(f)));
        DocumentDataModel cVar = new c();
        byte[] bArr2 = this.k;
        if (bArr2 != null) {
            rgb2bitmap = CameraUtils.rgb2bitmap(bArr2, i, i2);
        } else {
            rgb2bitmap = CameraUtils.rgb2bitmap(bArr, i, i2);
        }
        publishUpdate(new ExtractionUpdate(ExtractionUpdateState.saveImage, rgb2bitmap));
        publishUpdate(new ExtractionUpdate(ExtractionUpdateState.saveExactImage, rgb2bitmap));
        StringVector mrzLines = mrzResult.getMrzLines();
        cVar.setIdNumber(a(mrzResult.getDocNum()));
        i = AnonymousClass1.a[this.e.ordinal()];
        if (i == 1) {
            a(mrzResult, cVar);
        } else if (i == 2) {
            a = a(mrzResult.getOptData2());
            if (!(a == null || a.length() == 0)) {
                a = a.replaceAll("\\s+", "");
            }
            cVar.setPersonalNumber(a);
        } else if (i == 3) {
            a = a(mrzResult.getOptData1());
            if (!(a == null || a.length() == 0)) {
                cVar.setOptionalData1(a);
            }
            a(mrzResult, cVar);
        } else if (i == 4 || i == 5) {
            a(mrzResult, cVar);
        }
        cVar.setExpiryDate(a(mrzResult.getExpidate().getAsMrzDate(), false));
        a = a(mrzResult.getCountry());
        if (a != null) {
            a = a.trim();
        }
        String str = "D";
        String str2 = "DEU";
        if (str.equals(a)) {
            a = str2;
        }
        cVar.setIssuingCountry(a);
        cVar.setLastName(a(mrzResult.getSecondName()));
        a = a(mrzResult.getFirstName());
        if (this.e != DocumentScanMode.CNIS || a == null) {
            cVar.setFirstName(a);
        } else {
            cVar.setFirstName(a.replaceAll("  ", " ").split("\\s{2}", 2));
        }
        cVar.setDob(a(mrzResult.getBirthdate().getAsMrzDate(), true));
        if (NVGender.M.name().equals(a(mrzResult.getSex()))) {
            cVar.setGender(NVGender.M);
        } else if (NVGender.F.name().equals(a(mrzResult.getSex()))) {
            cVar.setGender(NVGender.F);
        } else if (NVGender.X.name().equals(a(mrzResult.getSex()))) {
            cVar.setGender(NVGender.X);
        }
        a = a(mrzResult.getNationality());
        if (a != null) {
            a = a.trim();
        }
        if (str.equals(a)) {
            a = str2;
        }
        cVar.setOriginatingCountry(a);
        NVMRZFormat nVMRZFormat = null;
        int i3 = AnonymousClass1.a[this.e.ordinal()];
        if (i3 != 1) {
            nVMRZFormat = i3 != 3 ? i3 != 4 ? i3 != 5 ? NVMRZFormat.MRP : NVMRZFormat.CNIS : NVMRZFormat.TD2 : NVMRZFormat.TD1;
        } else if (mrzLines.size() == 2 && mrzLines.get(0).length() == 36) {
            nVMRZFormat = NVMRZFormat.MRV_B;
        } else if (mrzLines.size() == 2 && mrzLines.get(0).length() == 44) {
            nVMRZFormat = NVMRZFormat.MRV_A;
        }
        cVar.a(mrzResult, nVMRZFormat);
        cVar.a(mrzLines);
        cVar.a((ArrayList) arrayList);
        publishResult(cVar);
    }

    private void a(MrzResult mrzResult, DocumentDataModel documentDataModel) {
        String a = a(mrzResult.getOptData2());
        if (a != null && a.length() != 0) {
            if (this.e == DocumentScanMode.CNIS) {
                documentDataModel.setPersonalNumber(a.replaceAll("\\s+", ""));
            } else {
                documentDataModel.setOptionalData2(a);
            }
        }
    }

    private Date a(MrzDate mrzDate, boolean z) {
        Calendar instance = Calendar.getInstance();
        if (mrzDate.getYear() == -1 || mrzDate.getMonth() < 1 || mrzDate.getMonth() > 12 || mrzDate.getDay() < 1 || mrzDate.getDay() > 31) {
            return null;
        }
        instance.set(mrzDate.getYear(), mrzDate.getMonth() - 1, mrzDate.getDay(), 0, 0, 0);
        Date time = instance.getTime();
        if (z) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                if (time.after(simpleDateFormat.parse(simpleDateFormat.format(new Date())))) {
                    return null;
                }
            } catch (ParseException unused) {
            }
        }
        return time;
    }

    private String a(MrzField mrzField) {
        return mrzField.getAsString();
    }

    private ArrayList<ArrayList<JumioRect>> a(MrzRectVector[] mrzRectVectorArr, int i, int i2) {
        if (mrzRectVectorArr == null || mrzRectVectorArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MrzRectVector mrzRectVector : mrzRectVectorArr) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; ((long) i3) < mrzRectVector.size(); i3++) {
                int x = mrzRectVector.get(i3).getX() + i;
                int y = mrzRectVector.get(i3).getY() + i2;
                arrayList2.add(new JumioRect(x, y, mrzRectVector.get(i3).getWidth() + x, mrzRectVector.get(i3).getHeight() + y));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }
}

package jumio.bam;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import com.jumio.bam.enums.BamErrorCase;
import com.jumio.bam.enums.CreditCardType;
import com.jumio.bam.environment.BamEnvironment;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.camera.Size;
import com.jumio.commons.json.JumioJSONObject;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.Log.LogLevel;
import com.jumio.commons.utils.ImageUtil;
import com.jumio.core.ImageQuality;
import com.jumio.core.environment.Environment;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.core.network.ErrorMock;
import com.jumio.ocr.impl.smartEngines.swig.OcrCardType;
import com.jumio.ocr.impl.smartEngines.swig.OcrCharStringVector;
import com.jumio.ocr.impl.smartEngines.swig.OcrCharVariants;
import com.jumio.ocr.impl.smartEngines.swig.OcrEngine;
import com.jumio.ocr.impl.smartEngines.swig.OcrEngineInternalSettings;
import com.jumio.ocr.impl.smartEngines.swig.OcrEngineSession;
import com.jumio.ocr.impl.smartEngines.swig.OcrEngineSettings;
import com.jumio.ocr.impl.smartEngines.swig.OcrPoint;
import com.jumio.ocr.impl.smartEngines.swig.OcrQuadrangle;
import com.jumio.ocr.impl.smartEngines.swig.OcrResult;
import com.jumio.ocr.impl.smartEngines.swig.ResultAcceptorInterface;
import com.jumio.ocr.impl.smartEngines.swig.ResultAcceptorInterfaceSettings;
import com.jumio.ocr.impl.smartEngines.swig.ResultAcceptorInterfaceSettings.FieldName;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.exception.JumioErrorCase;
import com.jumio.sdk.extraction.ExtractionClient;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.extraction.ExtractionUpdateState;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: OcrClient */
public class i extends ExtractionClient<ExtractionUpdate, w> {
    private static int b = 320;
    private static int c = 240;
    protected long a = 0;
    private OcrEngine d = null;
    private OcrEngineSession e = null;
    private OcrEngineSettings f = null;
    private final Object g = new Object();
    private a h = null;
    private boolean i = false;
    private byte[] j = null;
    private Object k = new Object();
    private long l = 0;
    private w m;
    private v n;
    private u o;
    private boolean p = false;

    /* compiled from: OcrClient */
    class a extends ResultAcceptorInterface {
        private int b;
        private int c;

        private a() {
        }

        public void accept(FieldName fieldName, OcrCharStringVector ocrCharStringVector, int i, int i2, ResultAcceptorInterfaceSettings resultAcceptorInterfaceSettings, boolean z) {
            FieldName fieldName2 = fieldName;
            ResultAcceptorInterfaceSettings resultAcceptorInterfaceSettings2 = resultAcceptorInterfaceSettings;
            boolean z2 = z;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AcceptorInterface.accept(): ");
            stringBuilder.append(fieldName.toString());
            stringBuilder.append(" - ");
            stringBuilder.append(ocrCharStringVector.size());
            Log.d(stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            for (int i3 = 0; ((long) i3) < ocrCharStringVector.size(); i3++) {
                OcrCharVariants ocrCharVariants = ocrCharStringVector.get(i3);
                stringBuilder2.append(ocrCharVariants.get().get(0).getCharacter());
                if (Log.isLogEnabledForLevel(LogLevel.INFO)) {
                    y.a(fieldName.toString(), ocrCharVariants.getQuadrangle());
                }
            }
            OcrCharStringVector ocrCharStringVector2 = ocrCharStringVector;
            long currentTimeMillis = System.currentTimeMillis();
            JumioErrorCase jumioErrorCase = null;
            int i4 = 1;
            if (fieldName2.equals(FieldName.NUMBER)) {
                i.this.m.clear();
                i.this.i = z2;
                if (z2) {
                    resultAcceptorInterfaceSettings2.setOcrEnabledFlag(FieldName.EXPIRY, i.this.n.a());
                    resultAcceptorInterfaceSettings2.setOcrEnabledFlag(FieldName.UK_SORTCODE, i.this.n.f());
                    resultAcceptorInterfaceSettings2.setOcrEnabledFlag(FieldName.UK_ACCOUNTNUM, i.this.n.f());
                    resultAcceptorInterfaceSettings2.setOcrEnabledFlag(FieldName.NAME, i.this.n.d());
                    resultAcceptorInterfaceSettings2.setOcrEnabledFlag(FieldName.NAME_2NDLINE, false);
                    resultAcceptorInterfaceSettings2.setOcrEnabledFlag(FieldName.AMEX_CVV, true);
                    try {
                        i.this.m.a(i.this.a(ocrCharStringVector, this.b, this.c, 6, (((int) ocrCharStringVector.size()) - 1) - 4));
                    } catch (JSONException e) {
                        Log.printStackTrace(e);
                    }
                    i.this.publishUpdate(new ExtractionUpdate(j.a, null));
                    i.this.m.a(stringBuilder2);
                    i.this.m.a("ocrCardNumber", currentTimeMillis - i.this.l);
                } else {
                    jumioErrorCase = BamErrorCase.CARD_NOT_DETECTED;
                }
            } else if (fieldName2.equals(FieldName.EXPIRY)) {
                if (z2) {
                    i.this.m.e(new StringBuilder(stringBuilder2.subSequence(0, 2)));
                    i.this.m.f(new StringBuilder(stringBuilder2.subSequence(stringBuilder2.length() - 2, stringBuilder2.length())));
                }
                i.this.m.a("ocrExpiryDate", currentTimeMillis - i.this.l);
            } else {
                String str = "";
                w a;
                boolean z3;
                if (fieldName2.equals(FieldName.UK_SORTCODE)) {
                    i.this.m.c(i.this.n.f() ? stringBuilder2 : new StringBuilder(str));
                    a = i.this.m;
                    z3 = i.this.n.f() && z2;
                    a.b(z3);
                    i.this.m.a("ocrSortCode", currentTimeMillis - i.this.l);
                } else if (fieldName2.equals(FieldName.UK_ACCOUNTNUM)) {
                    i.this.m.d(i.this.n.f() ? stringBuilder2 : new StringBuilder(str));
                    a = i.this.m;
                    z3 = i.this.n.f() && z2;
                    a.c(z3);
                    i.this.m.a("ocrAccountNumber", currentTimeMillis - i.this.l);
                } else if (fieldName2.equals(FieldName.NAME)) {
                    i.this.m.b(stringBuilder2);
                    i.this.m.a("ocrCardHolderName", currentTimeMillis - i.this.l);
                } else if (fieldName2.equals(FieldName.AMEX_CVV) && z2 && ((ocrCharStringVector.size() == 3 || ocrCharStringVector.size() == 4) && i.this.a(stringBuilder2))) {
                    try {
                        i.this.m.b(i.this.a(ocrCharStringVector, this.b, this.c, 0, ((int) ocrCharStringVector.size()) - 1));
                    } catch (JSONException e2) {
                        Log.printStackTrace(e2);
                    }
                }
            }
            if (Log.isLogEnabledForLevel(LogLevel.INFO)) {
                y.a(fieldName.toString(), stringBuilder2.toString(), currentTimeMillis - i.this.l, z2);
            }
            if (jumioErrorCase != null) {
                i4 = 0;
            }
            if (i4 == 0 && jumioErrorCase != BamErrorCase.CARD_NOT_DETECTED) {
                i.this.publishError(new JumioError(jumioErrorCase));
            }
            i iVar = i.this;
            iVar.i = iVar.i & i4;
            i.this.l = currentTimeMillis;
            if (!i.this.i) {
                resultAcceptorInterfaceSettings2.setOcrEnabledFlag(FieldName.EXPIRY, false);
                resultAcceptorInterfaceSettings2.setOcrEnabledFlag(FieldName.UK_SORTCODE, false);
                resultAcceptorInterfaceSettings2.setOcrEnabledFlag(FieldName.UK_ACCOUNTNUM, false);
                resultAcceptorInterfaceSettings2.setOcrEnabledFlag(FieldName.NAME, false);
                resultAcceptorInterfaceSettings2.setOcrEnabledFlag(FieldName.NAME_2NDLINE, false);
                resultAcceptorInterfaceSettings2.setOcrEnabledFlag(FieldName.AMEX_CVV, false);
            }
        }

        public void a(int i) {
            this.b = i;
        }

        public void b(int i) {
            this.c = i;
        }
    }

    public i(Context context) {
        super(context);
        Environment.loadJniInterfaceLib();
        this.shouldInitAsync = true;
    }

    public void configure(StaticModel staticModel) {
        super.configure(staticModel);
        if (staticModel instanceof t) {
            this.n = (v) DataAccess.load(this.mContext, v.class);
            this.m = new w();
            return;
        }
        throw new InvalidParameterException("Configuration model should be an instance of BamScanPartModel");
    }

    private void a() {
        this.o = (u) DataAccess.load(this.mContext, u.class);
        if (this.o == null) {
            this.p = true;
            this.o = new u();
            return;
        }
        this.p = false;
    }

    /* Access modifiers changed, original: protected */
    public void init(PreviewProperties previewProperties, Rect rect) {
        super.init(previewProperties, rect);
        this.i = false;
        this.a = System.currentTimeMillis();
        a();
        try {
            ErrorMock.onOcrLoadingMock();
            String oCREngineSettingsPath = BamEnvironment.getOCREngineSettingsPath(this.mContext);
            if (oCREngineSettingsPath != null) {
                OcrEngineInternalSettings createFromFilesystem = OcrEngineInternalSettings.createFromFilesystem(oCREngineSettingsPath);
                this.h = new a();
                this.d = new OcrEngine(createFromFilesystem);
                synchronized (this.g) {
                    this.f = new OcrEngineSettings();
                    this.f.setIntensityThreshold(70);
                    this.f.setFocusThreshold(15);
                }
                this.e = this.d.createSession(this.h);
                publishUpdate(new ExtractionUpdate(j.c, Boolean.valueOf(true)));
                return;
            }
            throw new Exception("OCR loading failed!");
        } catch (Exception e) {
            Log.printStackTrace(e);
            publishError(new JumioError(BamErrorCase.OCR_LOADING_FAILED));
        }
    }

    /* Access modifiers changed, original: protected */
    public void process(byte[] bArr, PreviewProperties previewProperties, Rect rect) {
        byte[] bArr2 = bArr;
        PreviewProperties previewProperties2 = previewProperties;
        if (this.p) {
            a();
        }
        try {
            float calculateFocus = ImageQuality.calculateFocus(bArr2, previewProperties2.preview.width, previewProperties2.preview.height, false);
            if (calculateFocus <= 0.12f) {
                publishUpdate(new ExtractionUpdate(ExtractionUpdateState.notifyFocus, Float.valueOf(calculateFocus)));
                setResult(false);
                return;
            }
            Size size = new Size(-1, -1);
            byte[] yuv2rgb = CameraUtils.yuv2rgb(bArr, previewProperties2.isPortrait, previewProperties, rect, 0.75f, size);
            if (yuv2rgb != null) {
                synchronized (this.g) {
                    if (this.f != null) {
                        try {
                            publishUpdate(new ExtractionUpdate(ExtractionUpdateState.notifyFlash, Boolean.valueOf(ImageQuality.isFlashNeeded(yuv2rgb, size.width, size.height, true))));
                        } catch (Exception e) {
                            Log.w("ImageCheck", "isFlashNeeded failed!", e);
                        }
                    }
                }
            }
            if (!(this.e == null || yuv2rgb == null)) {
                if (this.o.c()) {
                    b = Math.min(size.width, 720);
                    c = Math.min(size.height, 540);
                } else {
                    b = 320;
                    c = 240;
                }
                Size size2 = new Size(b, c);
                if (this.o.b()) {
                    synchronized (this.k) {
                        this.j = CameraUtils.yuv2rgb(bArr, previewProperties2.isPortrait, previewProperties, rect, 0.75f, size2);
                    }
                }
                try {
                    this.h.a(size.width);
                    this.h.b(size.height);
                    y.b();
                    y.d();
                    this.l = System.currentTimeMillis();
                    synchronized (this.g) {
                        if (this.f != null) {
                            this.f.setNumberRecognitionFlag(true);
                            this.f.setNumberContextCorrectionFlag(true);
                            this.f.setExpiryRecognitionFlag(this.n.a());
                            this.f.setExpiryContextCorrectionFlag(this.n.a());
                            this.f.setNameRecognitionFlag(this.n.d());
                            this.f.setNameContextCorrectionFlag(this.n.d());
                            this.f.setUkSortCodeAccountNumberRecognitionFlag(this.n.f());
                            this.f.setUkSortCodeAccountNumberContextCorrectionFlag(this.n.f());
                            this.f.setAmexCVVRecognitionFlag(true);
                            this.f.setNumberOfQuadranglesToProcess(1);
                            this.f.setRawSecondLineRecognitionFlag(false);
                            this.f.setCheckUmpFlag(true);
                            this.f.setCheckStarbucksFlag(false);
                            this.f.setSbcodeRecognitionFlag(true);
                            this.f.setLogoAnalysisFlag(false);
                            long currentTimeMillis = System.currentTimeMillis();
                            byte[] bArr3 = yuv2rgb;
                            OcrResult processUncompressedImageData = this.e.processUncompressedImageData(yuv2rgb, size.width, size.height, size.width * 3, this.f);
                            this.m.d(processUncompressedImageData.getUmpCardFlag());
                            OcrCardType cardType = processUncompressedImageData.getCardType();
                            if (this.n.a()) {
                                this.i = processUncompressedImageData.getCardExpiry().getToAcceptFlag() & this.i;
                            }
                            CreditCardType creditCardType = CreditCardType.UNKNOWN;
                            if (cardType == OcrCardType.OcrCardTypeVisa) {
                                creditCardType = CreditCardType.VISA;
                            } else if (cardType == OcrCardType.OcrCardTypeMastercard) {
                                creditCardType = CreditCardType.MASTER_CARD;
                            } else if (cardType == OcrCardType.OcrCardTypeAmericanExpress) {
                                creditCardType = CreditCardType.AMERICAN_EXPRESS;
                            } else if (cardType == OcrCardType.OcrCardTypeChinaUnionPay) {
                                creditCardType = CreditCardType.CHINA_UNIONPAY;
                            } else if (cardType == OcrCardType.OcrCardTypeJcb) {
                                creditCardType = CreditCardType.JCB;
                            } else if (cardType == OcrCardType.OcrCardTypeDinersClubInternational) {
                                creditCardType = CreditCardType.DINERS_CLUB;
                            } else if (cardType == OcrCardType.OcrCardTypeDiscover) {
                                creditCardType = CreditCardType.DISCOVER;
                            }
                            this.m.a(creditCardType);
                            if (this.i && !this.n.m().contains(this.m.getCardType())) {
                                this.i = false;
                                publishError(new JumioError(BamErrorCase.CREDIT_CARD_NOT_SUPPORTED));
                            }
                            if (this.n.a()) {
                                Pattern compile = Pattern.compile(z.a());
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(this.m.getCardExpiryDateMonth());
                                stringBuilder.append("/");
                                stringBuilder.append(this.m.getCardExpiryDateYear());
                                Matcher matcher = compile.matcher(stringBuilder);
                                if (this.i && !matcher.matches()) {
                                    this.i = false;
                                    publishError(new JumioError(BamErrorCase.CREDIT_CARD_EXPIRED));
                                }
                            }
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            String str = "OcrTask";
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("processImageData ");
                            stringBuilder2.append(this.o.b() ? "with" : "without");
                            stringBuilder2.append(" logo detector took ");
                            stringBuilder2.append(currentTimeMillis2);
                            stringBuilder2.append(" ms");
                            Log.v(str, stringBuilder2.toString());
                            if (this.i) {
                                publishUpdate(new ExtractionUpdate(ExtractionUpdateState.shotTaken, null));
                                publishUpdate(new ExtractionUpdate(j.c, Boolean.valueOf(false)));
                                synchronized (this.k) {
                                    if (this.o.b()) {
                                        if (Log.isLogEnabledForLevel(LogLevel.VERBOSE)) {
                                            y.b(bArr3, size.width, size.height);
                                        }
                                        if (Log.isLogEnabledForLevel(LogLevel.DEBUG)) {
                                            y.a(this.j, b, c);
                                        }
                                        publishUpdate(new ExtractionUpdate(j.b, ImageUtil.rgbToFormat(this.j, b, c, CompressFormat.WEBP, 80)));
                                    }
                                }
                                if (Log.isLogEnabledForLevel(LogLevel.INFO)) {
                                    y.a(size.width, size.height, b, c);
                                }
                                this.m.e(this.i);
                                publishResult(this.m);
                            }
                        }
                    }
                } catch (Exception e2) {
                    Log.printStackTrace(e2);
                }
                this.e.resetSession();
                Arrays.fill(bArr2, (byte) 0);
            }
            setResult(this.i);
        } catch (Exception e22) {
            Log.printStackTrace(e22);
            setResult(false);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean shouldFeed() {
        return this.i ^ 1;
    }

    /* Access modifiers changed, original: protected */
    public JumioJSONObject a(OcrCharStringVector ocrCharStringVector, int i, int i2, int i3, int i4) {
        OcrQuadrangle quadrangle = ocrCharStringVector.get(i3).getQuadrangle();
        OcrQuadrangle quadrangle2 = ocrCharStringVector.get(i4).getQuadrangle();
        PointF a = a(quadrangle.getTopLeft(), i, i2);
        PointF a2 = a(quadrangle2.getTopRight(), i, i2);
        PointF a3 = a(quadrangle.getBottomLeft(), i, i2);
        PointF a4 = a(quadrangle2.getBottomRight(), i, i2);
        a(a, a2, a3, a4);
        JumioJSONObject jumioJSONObject = new JumioJSONObject();
        jumioJSONObject.put("topLeft", a(a));
        jumioJSONObject.put("bottomLeft", a(a3));
        jumioJSONObject.put("topRight", a(a2));
        jumioJSONObject.put("bottomRight", a(a4));
        if (Log.isLogEnabledForLevel(LogLevel.INFO)) {
            y.a(quadrangle, quadrangle2, jumioJSONObject);
        }
        return jumioJSONObject;
    }

    private JumioJSONObject a(PointF pointF) {
        JumioJSONObject jumioJSONObject = new JumioJSONObject();
        jumioJSONObject.put("x", (double) pointF.x);
        jumioJSONObject.put("y", (double) pointF.y);
        return jumioJSONObject;
    }

    private void a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        pointF.x = ((float) Math.floor((double) pointF.x)) - 1.0f;
        pointF.y = ((float) Math.floor((double) pointF.y)) - 1.0f;
        pointF2.x = ((float) Math.ceil((double) pointF2.x)) + 1.0f;
        pointF2.y = ((float) Math.floor((double) pointF2.y)) - 1.0f;
        pointF3.x = ((float) Math.floor((double) pointF3.x)) - 1.0f;
        pointF3.y = ((float) Math.ceil((double) pointF3.y)) + 1.0f;
        pointF4.x = ((float) Math.ceil((double) pointF4.x)) + 1.0f;
        pointF4.y = ((float) Math.ceil((double) pointF4.y)) + 1.0f;
    }

    private PointF a(OcrPoint ocrPoint, int i, int i2) {
        PointF pointF = new PointF();
        pointF.x = (((float) ocrPoint.getX()) * ((float) b)) / ((float) i);
        pointF.y = (((float) ocrPoint.getY()) * ((float) c)) / ((float) i2);
        return pointF;
    }

    private boolean a(StringBuilder stringBuilder) {
        int i = 0;
        if (stringBuilder == null || stringBuilder.length() == 0) {
            return false;
        }
        boolean z = false;
        while (i < stringBuilder.length()) {
            z = Character.isDigit(stringBuilder.charAt(i));
            if (!z) {
                break;
            }
            i++;
        }
        return z;
    }
}

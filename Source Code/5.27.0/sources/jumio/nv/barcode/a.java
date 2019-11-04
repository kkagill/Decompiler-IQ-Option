package jumio.nv.barcode;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.log.Log;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.sdk.extraction.ExtractionClient;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.microblink.directApi.Recognizer;
import com.microblink.image.Image;
import com.microblink.recognizers.BaseRecognitionResult;
import com.microblink.recognizers.b;
import com.microblink.recognizers.blinkbarcode.pdf417.Pdf417ScanResult;
import com.microblink.results.barcode.BarcodeDetailedData;

/* compiled from: BarcodeClient */
public class a extends ExtractionClient<ExtractionUpdate, DocumentDataModel> implements com.microblink.directApi.a, com.microblink.view.recognition.a {
    private Recognizer a;
    private final Object b = new Object();
    private DocumentScanMode c;
    private PreviewProperties d;
    private Rect e;
    private byte[] f = null;
    private int g;
    private int h;
    private float i;
    private Image j;

    public void onRecognizerError(Throwable th) {
    }

    public a(Context context) {
        super(context);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0054 */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:7|8|9|10|11|12|13|21) */
    public void configure(com.jumio.core.mvp.model.StaticModel r10) {
        /*
        r9 = this;
        super.configure(r10);
        r0 = r10 instanceof com.jumio.nv.models.NVScanPartModel;
        if (r0 == 0) goto L_0x009c;
    L_0x0007:
        r10 = (com.jumio.nv.models.NVScanPartModel) r10;
        r10 = r10.getScanMode();
        r9.c = r10;
        r10 = r9.b;
        monitor-enter(r10);
        com.jumio.core.network.ErrorMock.onOcrLoadingMock();	 Catch:{ Exception -> 0x008b }
        r0 = r9.mContext;	 Catch:{ Exception -> 0x008b }
        r1 = com.jumio.nv.models.ServerSettingsModel.class;
        r0 = com.jumio.persistence.DataAccess.load(r0, r1);	 Catch:{ Exception -> 0x008b }
        r0 = (com.jumio.nv.models.ServerSettingsModel) r0;	 Catch:{ Exception -> 0x008b }
        if (r0 == 0) goto L_0x0081;
    L_0x0021:
        r1 = com.microblink.directApi.Recognizer.bdl();	 Catch:{ Exception -> 0x008b }
        r9.a = r1;	 Catch:{ Exception -> 0x008b }
        r1 = 0;
        r2 = 1;
        r3 = r9.a;	 Catch:{ InvalidLicenceKeyException -> 0x0054 }
        r4 = r0.getBarcodeScannerKey();	 Catch:{ InvalidLicenceKeyException -> 0x0054 }
        r5 = 5;
        r5 = new byte[r5];	 Catch:{ InvalidLicenceKeyException -> 0x0054 }
        r6 = 49;
        r5[r1] = r6;	 Catch:{ InvalidLicenceKeyException -> 0x0054 }
        r7 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r5[r2] = r7;	 Catch:{ InvalidLicenceKeyException -> 0x0054 }
        r7 = 2;
        r8 = 69;
        r5[r7] = r8;	 Catch:{ InvalidLicenceKeyException -> 0x0054 }
        r7 = 3;
        r8 = 25;
        r5[r7] = r8;	 Catch:{ InvalidLicenceKeyException -> 0x0054 }
        r7 = 4;
        r5[r7] = r6;	 Catch:{ InvalidLicenceKeyException -> 0x0054 }
        r6 = 2707057876264250875; // 0x259166cbbd276dfb float:-0.04087637 double:1.0041756561503918E-127;
        r5 = com.jumio.commons.obfuscate.StringObfuscater.format(r5, r6);	 Catch:{ InvalidLicenceKeyException -> 0x0054 }
        r3.aJ(r4, r5);	 Catch:{ InvalidLicenceKeyException -> 0x0054 }
        goto L_0x005f;
    L_0x0054:
        r3 = r9.a;	 Catch:{ Exception -> 0x008b }
        r4 = r9.mContext;	 Catch:{ Exception -> 0x008b }
        r0 = r0.getBarcodeScannerKey();	 Catch:{ Exception -> 0x008b }
        r3.J(r4, r0);	 Catch:{ Exception -> 0x008b }
    L_0x005f:
        r0 = new com.microblink.recognizers.blinkbarcode.pdf417.Pdf417RecognizerSettings;	 Catch:{ Exception -> 0x008b }
        r0.<init>();	 Catch:{ Exception -> 0x008b }
        r0.fI(r2);	 Catch:{ Exception -> 0x008b }
        r0.fH(r2);	 Catch:{ Exception -> 0x008b }
        r3 = new com.microblink.recognizers.settings.RecognitionSettings;	 Catch:{ Exception -> 0x008b }
        r3.<init>();	 Catch:{ Exception -> 0x008b }
        r2 = new com.microblink.recognizers.settings.RecognizerSettings[r2];	 Catch:{ Exception -> 0x008b }
        r2[r1] = r0;	 Catch:{ Exception -> 0x008b }
        r3.a(r2);	 Catch:{ Exception -> 0x008b }
        r3.fJ(r1);	 Catch:{ Exception -> 0x008b }
        r0 = r9.a;	 Catch:{ Exception -> 0x008b }
        r1 = r9.mContext;	 Catch:{ Exception -> 0x008b }
        r0.a(r1, r3, r9);	 Catch:{ Exception -> 0x008b }
        goto L_0x0098;
    L_0x0081:
        r0 = new java.lang.Exception;	 Catch:{ Exception -> 0x008b }
        r1 = "ServerSettings should not be null";
        r0.<init>(r1);	 Catch:{ Exception -> 0x008b }
        throw r0;	 Catch:{ Exception -> 0x008b }
    L_0x0089:
        r0 = move-exception;
        goto L_0x009a;
    L_0x008b:
        r0 = 0;
        r9.a = r0;	 Catch:{ all -> 0x0089 }
        r0 = new com.jumio.sdk.exception.JumioError;	 Catch:{ all -> 0x0089 }
        r1 = com.jumio.nv.enums.NVErrorCase.OCR_LOADING_FAILED;	 Catch:{ all -> 0x0089 }
        r0.<init>(r1);	 Catch:{ all -> 0x0089 }
        r9.publishError(r0);	 Catch:{ all -> 0x0089 }
    L_0x0098:
        monitor-exit(r10);	 Catch:{ all -> 0x0089 }
        return;
    L_0x009a:
        monitor-exit(r10);	 Catch:{ all -> 0x0089 }
        throw r0;
    L_0x009c:
        r10 = new java.lang.IllegalArgumentException;
        r0 = "Configuration model should be an instance of ScanPartModel";
        r10.<init>(r0);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: jumio.nv.barcode.a.configure(com.jumio.core.mvp.model.StaticModel):void");
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0054 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|12) */
    public void process(byte[] r5, com.jumio.commons.camera.PreviewProperties r6, android.graphics.Rect r7) {
        /*
        r4 = this;
        r4.f = r5;
        r0 = r6.camera;
        r0 = r0.width;
        r4.g = r0;
        r0 = r6.camera;
        r0 = r0.height;
        r4.h = r0;
        r4.d = r6;
        r4.e = r7;
        r6 = r4.g;
        r7 = r4.h;
        r0 = 0;
        r6 = com.jumio.core.ImageQuality.calculateFocus(r5, r6, r7, r0);
        r4.i = r6;
        r6 = r4.g;
        r7 = r4.h;
        r6 = com.jumio.core.ImageQuality.isFlashNeeded(r5, r6, r7, r0);
        r7 = new com.jumio.sdk.extraction.ExtractionClient$ExtractionUpdate;
        r1 = com.jumio.sdk.extraction.ExtractionUpdateState.notifyFlash;
        r6 = java.lang.Boolean.valueOf(r6);
        r7.<init>(r1, r6);
        r4.publishUpdate(r7);
        r6 = r4.b;
        monitor-enter(r6);
        r7 = r4.a;	 Catch:{ all -> 0x005b }
        if (r7 != 0) goto L_0x003f;
    L_0x003a:
        r4.setResult(r0);	 Catch:{ all -> 0x005b }
        monitor-exit(r6);	 Catch:{ all -> 0x005b }
        return;
    L_0x003f:
        r7 = r4.g;	 Catch:{ all -> 0x005b }
        r1 = r4.h;	 Catch:{ all -> 0x005b }
        r2 = com.microblink.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT;	 Catch:{ all -> 0x005b }
        r3 = 0;
        r5 = com.microblink.image.ImageBuilder.a(r5, r7, r1, r2, r3);	 Catch:{ all -> 0x005b }
        r4.j = r5;	 Catch:{ all -> 0x005b }
        r5 = r4.a;	 Catch:{ Exception -> 0x0054 }
        r7 = r4.j;	 Catch:{ Exception -> 0x0054 }
        r5.a(r7, r4);	 Catch:{ Exception -> 0x0054 }
        goto L_0x0059;
    L_0x0054:
        r4.f = r3;	 Catch:{ all -> 0x005b }
        r4.setResult(r0);	 Catch:{ all -> 0x005b }
    L_0x0059:
        monitor-exit(r6);	 Catch:{ all -> 0x005b }
        return;
    L_0x005b:
        r5 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x005b }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: jumio.nv.barcode.a.process(byte[], com.jumio.commons.camera.PreviewProperties, android.graphics.Rect):void");
    }

    /* Access modifiers changed, original: protected */
    public boolean shouldFeed() {
        return this.a != null && this.f == null;
    }

    public void destroy() {
        super.destroy();
        synchronized (this.b) {
            if (this.a != null) {
                this.a.terminate();
                this.a = null;
            }
        }
    }

    /* JADX WARNING: Missing block: B:40:0x02a1, code skipped:
            if (r4.length() == 0) goto L_0x02b1;
     */
    public boolean a(java.lang.String r17, android.graphics.Bitmap r18, int r19, int r20, float r21) {
        /*
        r16 = this;
        r1 = r16;
        r2 = r17;
        r0 = r18;
        r3 = "<Binary Data>";
        r4 = "[^\\x20-\\x7E%s]+";
        r5 = "Result:";
        r6 = "Raw Data:";
        r7 = "\r\n";
        r8 = new com.jumio.nv.barcode.model.BarcodeDataModel;
        r8.<init>();
        r9 = r1.c;
        r10 = com.jumio.core.data.document.DocumentScanMode.PDF417;
        r11 = 1;
        if (r9 != r10) goto L_0x0260;
    L_0x001c:
        r9 = new com.jumio.nv.barcode.decoder.PDF417DataDecoder;
        r9.<init>();
        r10 = r16.getClass();
        r10 = r10.getSimpleName();
        r13 = 0;
        r14 = com.jumio.commons.log.Log.LogLevel.INFO;	 Catch:{ Exception -> 0x021f }
        r14 = com.jumio.commons.log.Log.isLogEnabledForLevel(r14);	 Catch:{ Exception -> 0x021f }
        if (r14 == 0) goto L_0x0037;
    L_0x0032:
        r14 = "rawdata.text";
        com.jumio.nv.utils.NetverifyLogUtils.logInfoInSubfolder(r2, r10, r14);	 Catch:{ Exception -> 0x021f }
    L_0x0037:
        r8.setRawBarcodeData(r2);	 Catch:{ Exception -> 0x021f }
        r9 = r9.decode(r2);	 Catch:{ Exception -> 0x021f }
        r14 = r9.getIdNumber();	 Catch:{ Exception -> 0x021f }
        r8.setIdNumber(r14);	 Catch:{ Exception -> 0x021f }
        r14 = r9.getIssueDate();	 Catch:{ Exception -> 0x021f }
        r8.setIssuingDate(r14);	 Catch:{ Exception -> 0x021f }
        r14 = r9.getExpiryDate();	 Catch:{ Exception -> 0x021f }
        r8.setExpiryDate(r14);	 Catch:{ Exception -> 0x021f }
        r14 = r9.getIssuingCountry();	 Catch:{ Exception -> 0x021f }
        if (r14 == 0) goto L_0x005f;
    L_0x0059:
        r15 = r14.length();	 Catch:{ Exception -> 0x021f }
        if (r15 != 0) goto L_0x0063;
    L_0x005f:
        r14 = r8.getSelectedCountry();	 Catch:{ Exception -> 0x021f }
    L_0x0063:
        r8.setIssuingCountry(r14);	 Catch:{ Exception -> 0x021f }
        r14 = r9.getLastName();	 Catch:{ Exception -> 0x021f }
        r8.setLastName(r14);	 Catch:{ Exception -> 0x021f }
        r14 = 2;
        r14 = new java.lang.String[r14];	 Catch:{ Exception -> 0x021f }
        r15 = r9.getFirstName();	 Catch:{ Exception -> 0x021f }
        r14[r13] = r15;	 Catch:{ Exception -> 0x021f }
        r15 = r9.getMiddleName();	 Catch:{ Exception -> 0x021f }
        r14[r11] = r15;	 Catch:{ Exception -> 0x021f }
        r8.setFirstName(r14);	 Catch:{ Exception -> 0x021f }
        r14 = r9.getNameSuffix();	 Catch:{ Exception -> 0x021f }
        r8.setNameSuffix(r14);	 Catch:{ Exception -> 0x021f }
        r14 = r9.getDateOfBirth();	 Catch:{ Exception -> 0x021f }
        r8.setDob(r14);	 Catch:{ Exception -> 0x021f }
        r14 = r9.getGender();	 Catch:{ Exception -> 0x021f }
        r8.setGender(r14);	 Catch:{ Exception -> 0x021f }
        r14 = r9.getAddressStreet1();	 Catch:{ Exception -> 0x021f }
        r8.setAddressLine(r14);	 Catch:{ Exception -> 0x021f }
        r14 = r9.getAddressCity();	 Catch:{ Exception -> 0x021f }
        r8.setCity(r14);	 Catch:{ Exception -> 0x021f }
        r14 = r9.getAddressState();	 Catch:{ Exception -> 0x021f }
        r8.setSubdivision(r14);	 Catch:{ Exception -> 0x021f }
        r14 = r9.getAddressZip();	 Catch:{ Exception -> 0x021f }
        r8.setPostCode(r14);	 Catch:{ Exception -> 0x021f }
        r14 = com.jumio.commons.log.Log.LogLevel.INFO;	 Catch:{ Exception -> 0x021f }
        r14 = com.jumio.commons.log.Log.isLogEnabledForLevel(r14);	 Catch:{ Exception -> 0x021f }
        if (r14 == 0) goto L_0x0260;
    L_0x00b8:
        r14 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021f }
        r14.<init>();	 Catch:{ Exception -> 0x021f }
        r15 = "Image dimensions:";
        r14.append(r15);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r15 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021f }
        r15.<init>();	 Catch:{ Exception -> 0x021f }
        r12 = "width: ";
        r15.append(r12);	 Catch:{ Exception -> 0x021f }
        r12 = r19;
        r15.append(r12);	 Catch:{ Exception -> 0x021f }
        r12 = r15.toString();	 Catch:{ Exception -> 0x021f }
        r14.append(r12);	 Catch:{ Exception -> 0x021f }
        r12 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021f }
        r12.<init>();	 Catch:{ Exception -> 0x021f }
        r15 = "height: ";
        r12.append(r15);	 Catch:{ Exception -> 0x021f }
        r15 = r20;
        r12.append(r15);	 Catch:{ Exception -> 0x021f }
        r12 = r12.toString();	 Catch:{ Exception -> 0x021f }
        r14.append(r12);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r14.append(r6);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r12 = "";
        r15 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x021f }
        r15[r13] = r12;	 Catch:{ Exception -> 0x021f }
        r15 = java.lang.String.format(r4, r15);	 Catch:{ Exception -> 0x021f }
        r15 = r2.replaceAll(r15, r3);	 Catch:{ Exception -> 0x021f }
        r14.append(r15);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r14.append(r5);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r15 = "getIdNumber() ";
        r13 = r9.getIdNumber();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r15, r13);	 Catch:{ Exception -> 0x021f }
        r13 = "getIssueDate() ";
        r15 = r9.getIssueDate();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getExpiryDate() ";
        r15 = r9.getExpiryDate();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getIssuingCountry() ";
        r15 = r9.getIssuingCountry();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getLastName() ";
        r15 = r9.getLastName();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getFirstName() ";
        r15 = r9.getFirstName();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getMiddleName() ";
        r15 = r9.getMiddleName();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getNameSuffix() ";
        r15 = r9.getNameSuffix();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getDateOfBirth() ";
        r15 = r9.getDateOfBirth();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = r9.getGender();	 Catch:{ Exception -> 0x021f }
        if (r13 == 0) goto L_0x017e;
    L_0x0171:
        r13 = "getGender() ";
        r15 = r9.getGender();	 Catch:{ Exception -> 0x021f }
        r15 = r15.name();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
    L_0x017e:
        r13 = "getAddressStreet1() ";
        r15 = r9.getAddressStreet1();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getAddressCity() ";
        r15 = r9.getAddressCity();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getAddressState() ";
        r15 = r9.getAddressState();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getAddressZip() ";
        r15 = r9.getAddressZip();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r13 = "Unused:";
        r14.append(r13);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r13 = "getAddressStreet2() ";
        r15 = r9.getAddressStreet2();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getEndorsementCodes() ";
        r15 = r9.getEndorsementCodes();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = r9.getEyeColor();	 Catch:{ Exception -> 0x021f }
        if (r13 == 0) goto L_0x01d5;
    L_0x01c8:
        r13 = "getEyeColor() ";
        r15 = r9.getEyeColor();	 Catch:{ Exception -> 0x021f }
        r15 = r15.name();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
    L_0x01d5:
        r13 = "getHeight() ";
        r15 = r9.getHeight();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getRestrictionCodes() ";
        r15 = r9.getRestrictionCodes();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r13 = "getVehicleClass() ";
        r15 = r9.getVehicleClass();	 Catch:{ Exception -> 0x021f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r13 = "Unparsed:";
        r14.append(r13);	 Catch:{ Exception -> 0x021f }
        r14.append(r7);	 Catch:{ Exception -> 0x021f }
        r9 = r9.getUnparsedData();	 Catch:{ Exception -> 0x021f }
        r9 = r9.toString();	 Catch:{ Exception -> 0x021f }
        r13 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x021f }
        r15 = 0;
        r13[r15] = r12;	 Catch:{ Exception -> 0x021f }
        r4 = java.lang.String.format(r4, r13);	 Catch:{ Exception -> 0x021f }
        r3 = r9.replaceAll(r4, r3);	 Catch:{ Exception -> 0x021f }
        r14.append(r3);	 Catch:{ Exception -> 0x021f }
        r3 = r14.toString();	 Catch:{ Exception -> 0x021f }
        r4 = 0;
        com.jumio.nv.utils.NetverifyLogUtils.logInfoInSubfolder(r3, r10, r4);	 Catch:{ Exception -> 0x021f }
        goto L_0x0260;
    L_0x021f:
        r0 = move-exception;
        r3 = com.jumio.commons.log.Log.LogLevel.INFO;
        r3 = com.jumio.commons.log.Log.isLogEnabledForLevel(r3);
        if (r3 == 0) goto L_0x025e;
    L_0x0228:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r6);
        r3.append(r7);
        r3.append(r2);
        r3.append(r7);
        r3.append(r7);
        r3.append(r5);
        r3.append(r7);
        r2 = new java.io.StringWriter;
        r2.<init>();
        r4 = new java.io.PrintWriter;
        r4.<init>(r2);
        r0.printStackTrace(r4);
        r0 = r2.toString();
        r3.append(r0);
        r0 = r3.toString();
        r2 = 0;
        com.jumio.nv.utils.NetverifyLogUtils.logInfoInSubfolder(r0, r10, r2);
    L_0x025e:
        r2 = 0;
        return r2;
    L_0x0260:
        java.lang.System.gc();
        r2 = r1.mContext;
        r3 = com.jumio.nv.models.SelectionModel.class;
        r2 = com.jumio.persistence.DataAccess.load(r2, r3);
        r2 = (com.jumio.nv.models.SelectionModel) r2;
        r3 = r8.getAddressLine();
        r4 = r8.getCity();
        if (r2 == 0) goto L_0x02a3;
    L_0x0277:
        r5 = r2.isVerificationRequired();
        if (r5 != 0) goto L_0x02a3;
    L_0x027d:
        r2 = r2.getSelectedCountry();
        r2 = r2.getIsoCode();
        r5 = "USA";
        r2 = r5.equals(r2);
        if (r2 == 0) goto L_0x02a3;
    L_0x028d:
        r2 = r1.c;
        r5 = com.jumio.core.data.document.DocumentScanMode.PDF417;
        if (r2 != r5) goto L_0x02a3;
    L_0x0293:
        if (r3 == 0) goto L_0x02b1;
    L_0x0295:
        r2 = r3.length();
        if (r2 == 0) goto L_0x02b1;
    L_0x029b:
        if (r4 == 0) goto L_0x02b1;
    L_0x029d:
        r2 = r4.length();
        if (r2 == 0) goto L_0x02b1;
    L_0x02a3:
        r2 = new com.jumio.sdk.extraction.ExtractionClient$ExtractionUpdate;
        r3 = com.jumio.sdk.extraction.ExtractionUpdateState.shotTaken;
        r4 = java.lang.Float.valueOf(r21);
        r2.<init>(r3, r4);
        r1.publishUpdate(r2);
    L_0x02b1:
        r2 = new com.jumio.sdk.extraction.ExtractionClient$ExtractionUpdate;
        r3 = com.jumio.sdk.extraction.ExtractionUpdateState.saveImage;
        r2.<init>(r3, r0);
        r1.publishUpdate(r2);
        r2 = new com.jumio.sdk.extraction.ExtractionClient$ExtractionUpdate;
        r3 = com.jumio.sdk.extraction.ExtractionUpdateState.saveExactImage;
        r2.<init>(r3, r0);
        r1.publishUpdate(r2);
        r1.publishResult(r8);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: jumio.nv.barcode.a.a(java.lang.String, android.graphics.Bitmap, int, int, float):boolean");
    }

    public void onScanningDone(@Nullable b bVar) {
        Image image = this.j;
        if (image != null) {
            try {
                image.dispose();
                this.j = null;
            } catch (Exception unused) {
            }
        }
        boolean z = false;
        if (bVar != null) {
            BaseRecognitionResult[] bdO = bVar.bdO();
            if (bdO != null && bdO.length == 1) {
                boolean z2 = false;
                for (BaseRecognitionResult baseRecognitionResult : bdO) {
                    boolean z3 = !baseRecognitionResult.isEmpty() && baseRecognitionResult.isValid();
                    BarcodeDetailedData bdQ = baseRecognitionResult instanceof Pdf417ScanResult ? ((Pdf417ScanResult) baseRecognitionResult).bdQ() : null;
                    if (bdQ != null) {
                        if (z3) {
                            z2 = a(new String(bdQ.bdU()), CameraUtils.yuv2bitmap(this.f, this.d.isPortrait, this.d, this.e, -1), this.g, this.h, this.i);
                        } else {
                            Log.d("Photopay", bdQ.toString());
                        }
                    }
                    z2 = z3;
                }
                z = z2;
            }
            this.f = null;
        }
        setResult(z);
    }
}

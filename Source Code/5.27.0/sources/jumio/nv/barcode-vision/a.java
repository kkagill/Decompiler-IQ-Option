package jumio.nv.barcode-vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.android.gms.vision.barcode.BarcodeDetector.Builder;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.log.Log;
import com.jumio.core.ImageQuality;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.core.network.ErrorMock;
import com.jumio.nv.enums.NVErrorCase;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.nv.models.NVScanPartModel;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.extraction.ExtractionClient;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.extraction.ExtractionUpdateState;
import java.nio.ByteBuffer;

/* compiled from: BarcodeVisionClient */
public class a extends ExtractionClient<ExtractionUpdate, DocumentDataModel> {
    private BarcodeDetector a;
    private long b;
    private DocumentScanMode c;
    private int d = 0;

    /* Access modifiers changed, original: protected */
    public boolean shouldFeed() {
        return true;
    }

    public a(Context context) {
        super(context);
    }

    public void configure(StaticModel staticModel) {
        super.configure(staticModel);
        if (staticModel instanceof NVScanPartModel) {
            this.c = ((NVScanPartModel) staticModel).getScanMode();
            try {
                ErrorMock.onOcrLoadingMock();
                this.a = new Builder(this.mContext).setBarcodeFormats(2048).build();
                if (this.a.isOperational()) {
                    this.b = System.currentTimeMillis();
                    return;
                }
                throw new Exception("Detector dependencies are not yet available.");
            } catch (Exception unused) {
                publishError(new JumioError(NVErrorCase.OCR_LOADING_FAILED));
                return;
            }
        }
        throw new IllegalArgumentException("Configuration model should be an instance of ScanPartModel");
    }

    /* Access modifiers changed, original: protected */
    public void process(byte[] bArr, PreviewProperties previewProperties, Rect rect) {
        int i = previewProperties.camera.width;
        int i2 = previewProperties.camera.height;
        boolean z = false;
        float calculateFocus = ImageQuality.calculateFocus(bArr, i, i2, false);
        publishUpdate(new ExtractionUpdate(ExtractionUpdateState.notifyFlash, Boolean.valueOf(ImageQuality.isFlashNeeded(bArr, i, i2, false))));
        try {
            Frame.Builder timestampMillis = new Frame.Builder().setImageData(ByteBuffer.wrap(bArr), i, i2, 17).setTimestampMillis(System.currentTimeMillis());
            int i3 = this.d;
            this.d = i3 + 1;
            SparseArray detect = this.a.detect(timestampMillis.setId(i3).build());
            if (!(detect == null || detect.size() == 0)) {
                Bitmap a;
                Barcode barcode = (Barcode) detect.get(detect.keyAt(0));
                if (barcode.getBoundingBox() != null) {
                    a = a(bArr, barcode.getBoundingBox(), previewProperties, 5);
                    i2 = previewProperties.isPortrait ? barcode.getBoundingBox().width() : barcode.getBoundingBox().height();
                    i = previewProperties.isPortrait ? barcode.getBoundingBox().height() : barcode.getBoundingBox().width();
                } else {
                    a = CameraUtils.yuv2bitmap(bArr, previewProperties.isPortrait, previewProperties, rect, -1);
                }
                z = a(barcode.rawValue, a, i, i2, calculateFocus);
            }
        } catch (Exception e) {
            Log.printStackTrace(e);
        }
        setResult(z);
    }

    public void destroy() {
        super.destroy();
        BarcodeDetector barcodeDetector = this.a;
        if (barcodeDetector != null) {
            barcodeDetector.release();
            this.a = null;
        }
    }

    /* JADX WARNING: Missing block: B:44:0x02b1, code skipped:
            if (r4.length() == 0) goto L_0x02c1;
     */
    private boolean a(java.lang.String r18, android.graphics.Bitmap r19, int r20, int r21, float r22) {
        /*
        r17 = this;
        r1 = r17;
        r2 = r18;
        r0 = r19;
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
        if (r9 != r10) goto L_0x0270;
    L_0x001c:
        r9 = new com.jumio.nv.barcode.decoder.PDF417DataDecoder;
        r9.<init>();
        r10 = r17.getClass();
        r10 = r10.getSimpleName();
        r13 = 0;
        r14 = com.jumio.commons.log.Log.LogLevel.INFO;	 Catch:{ Exception -> 0x022f }
        r14 = com.jumio.commons.log.Log.isLogEnabledForLevel(r14);	 Catch:{ Exception -> 0x022f }
        if (r14 == 0) goto L_0x0037;
    L_0x0032:
        r14 = "rawdata.txt";
        com.jumio.nv.utils.NetverifyLogUtils.logInfoInSubfolder(r2, r10, r14);	 Catch:{ Exception -> 0x022f }
    L_0x0037:
        r8.setRawBarcodeData(r2);	 Catch:{ Exception -> 0x022f }
        r9 = r9.decode(r2);	 Catch:{ Exception -> 0x022f }
        r14 = r9.getIdNumber();	 Catch:{ Exception -> 0x022f }
        r8.setIdNumber(r14);	 Catch:{ Exception -> 0x022f }
        r14 = r9.getIssueDate();	 Catch:{ Exception -> 0x022f }
        r8.setIssuingDate(r14);	 Catch:{ Exception -> 0x022f }
        r14 = r9.getExpiryDate();	 Catch:{ Exception -> 0x022f }
        r8.setExpiryDate(r14);	 Catch:{ Exception -> 0x022f }
        r14 = r9.getIssuingCountry();	 Catch:{ Exception -> 0x022f }
        if (r14 == 0) goto L_0x005f;
    L_0x0059:
        r15 = r14.length();	 Catch:{ Exception -> 0x022f }
        if (r15 != 0) goto L_0x0063;
    L_0x005f:
        r14 = r8.getSelectedCountry();	 Catch:{ Exception -> 0x022f }
    L_0x0063:
        r8.setIssuingCountry(r14);	 Catch:{ Exception -> 0x022f }
        r14 = r9.getLastName();	 Catch:{ Exception -> 0x022f }
        r8.setLastName(r14);	 Catch:{ Exception -> 0x022f }
        r14 = 2;
        r14 = new java.lang.String[r14];	 Catch:{ Exception -> 0x022f }
        r15 = r9.getFirstName();	 Catch:{ Exception -> 0x022f }
        r14[r13] = r15;	 Catch:{ Exception -> 0x022f }
        r15 = r9.getMiddleName();	 Catch:{ Exception -> 0x022f }
        r14[r11] = r15;	 Catch:{ Exception -> 0x022f }
        r8.setFirstName(r14);	 Catch:{ Exception -> 0x022f }
        r14 = r9.getNameSuffix();	 Catch:{ Exception -> 0x022f }
        r8.setNameSuffix(r14);	 Catch:{ Exception -> 0x022f }
        r14 = r9.getDateOfBirth();	 Catch:{ Exception -> 0x022f }
        r8.setDob(r14);	 Catch:{ Exception -> 0x022f }
        r14 = r9.getGender();	 Catch:{ Exception -> 0x022f }
        r8.setGender(r14);	 Catch:{ Exception -> 0x022f }
        r14 = r9.getAddressStreet1();	 Catch:{ Exception -> 0x022f }
        r8.setAddressLine(r14);	 Catch:{ Exception -> 0x022f }
        r14 = r9.getAddressCity();	 Catch:{ Exception -> 0x022f }
        r8.setCity(r14);	 Catch:{ Exception -> 0x022f }
        r14 = r9.getAddressState();	 Catch:{ Exception -> 0x022f }
        r8.setSubdivision(r14);	 Catch:{ Exception -> 0x022f }
        r14 = r9.getAddressZip();	 Catch:{ Exception -> 0x022f }
        r8.setPostCode(r14);	 Catch:{ Exception -> 0x022f }
        r14 = com.jumio.commons.log.Log.LogLevel.INFO;	 Catch:{ Exception -> 0x022f }
        r14 = com.jumio.commons.log.Log.isLogEnabledForLevel(r14);	 Catch:{ Exception -> 0x022f }
        if (r14 == 0) goto L_0x0270;
    L_0x00b8:
        r14 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x022f }
        r14.<init>();	 Catch:{ Exception -> 0x022f }
        r15 = "Image dimensions:";
        r14.append(r15);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r15 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x022f }
        r15.<init>();	 Catch:{ Exception -> 0x022f }
        r12 = "width: ";
        r15.append(r12);	 Catch:{ Exception -> 0x022f }
        r12 = r20;
        r15.append(r12);	 Catch:{ Exception -> 0x022f }
        r12 = r15.toString();	 Catch:{ Exception -> 0x022f }
        r14.append(r12);	 Catch:{ Exception -> 0x022f }
        r12 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x022f }
        r12.<init>();	 Catch:{ Exception -> 0x022f }
        r15 = "height: ";
        r12.append(r15);	 Catch:{ Exception -> 0x022f }
        r15 = r21;
        r12.append(r15);	 Catch:{ Exception -> 0x022f }
        r12 = r12.toString();	 Catch:{ Exception -> 0x022f }
        r14.append(r12);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r14.append(r6);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r12 = "";
        r15 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x022f }
        r15[r13] = r12;	 Catch:{ Exception -> 0x022f }
        r15 = java.lang.String.format(r4, r15);	 Catch:{ Exception -> 0x022f }
        r15 = r2.replaceAll(r15, r3);	 Catch:{ Exception -> 0x022f }
        r14.append(r15);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r14.append(r5);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r15 = "getIdNumber() ";
        r13 = r9.getIdNumber();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r15, r13);	 Catch:{ Exception -> 0x022f }
        r13 = "getIssueDate() ";
        r15 = r9.getIssueDate();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getExpiryDate() ";
        r15 = r9.getExpiryDate();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getIssuingCountry() ";
        r15 = r9.getIssuingCountry();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getLastName() ";
        r15 = r9.getLastName();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getFirstName() ";
        r15 = r9.getFirstName();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getMiddleName() ";
        r15 = r9.getMiddleName();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getNameSuffix() ";
        r15 = r9.getNameSuffix();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getDateOfBirth() ";
        r15 = r9.getDateOfBirth();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = r9.getGender();	 Catch:{ Exception -> 0x022f }
        if (r13 == 0) goto L_0x017e;
    L_0x0171:
        r13 = "getGender() ";
        r15 = r9.getGender();	 Catch:{ Exception -> 0x022f }
        r15 = r15.name();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
    L_0x017e:
        r13 = "getAddressStreet1() ";
        r15 = r9.getAddressStreet1();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getAddressCity() ";
        r15 = r9.getAddressCity();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getAddressState() ";
        r15 = r9.getAddressState();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getAddressZip() ";
        r15 = r9.getAddressZip();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r13 = "Unused:";
        r14.append(r13);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r13 = "getAddressStreet2() ";
        r15 = r9.getAddressStreet2();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getEndorsementCodes() ";
        r15 = r9.getEndorsementCodes();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = r9.getEyeColor();	 Catch:{ Exception -> 0x022f }
        if (r13 == 0) goto L_0x01d5;
    L_0x01c8:
        r13 = "getEyeColor() ";
        r15 = r9.getEyeColor();	 Catch:{ Exception -> 0x022f }
        r15 = r15.name();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
    L_0x01d5:
        r13 = "getHeight() ";
        r15 = r9.getHeight();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getRestrictionCodes() ";
        r15 = r9.getRestrictionCodes();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r13 = "getVehicleClass() ";
        r15 = r9.getVehicleClass();	 Catch:{ Exception -> 0x022f }
        com.jumio.commons.log.LogUtils.appendParameter(r14, r13, r15);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r13 = "Unparsed:";
        r14.append(r13);	 Catch:{ Exception -> 0x022f }
        r14.append(r7);	 Catch:{ Exception -> 0x022f }
        r13 = r9.getUnparsedData();	 Catch:{ Exception -> 0x022f }
        r13 = r13.toString();	 Catch:{ Exception -> 0x022f }
        r15 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x022f }
        r16 = 0;
        r15[r16] = r12;	 Catch:{ Exception -> 0x022f }
        r4 = java.lang.String.format(r4, r15);	 Catch:{ Exception -> 0x022f }
        r3 = r13.replaceAll(r4, r3);	 Catch:{ Exception -> 0x022f }
        r14.append(r3);	 Catch:{ Exception -> 0x022f }
        r3 = r9.getIdNumber();	 Catch:{ Exception -> 0x022f }
        if (r3 == 0) goto L_0x0221;
    L_0x021d:
        r9.getIdNumber();	 Catch:{ Exception -> 0x022f }
        goto L_0x0226;
    L_0x0221:
        r3 = r1.b;	 Catch:{ Exception -> 0x022f }
        java.lang.Long.toString(r3);	 Catch:{ Exception -> 0x022f }
    L_0x0226:
        r3 = r14.toString();	 Catch:{ Exception -> 0x022f }
        r4 = 0;
        com.jumio.nv.utils.NetverifyLogUtils.logInfoInSubfolder(r3, r10, r4);	 Catch:{ Exception -> 0x022f }
        goto L_0x0270;
    L_0x022f:
        r0 = move-exception;
        r3 = com.jumio.commons.log.Log.LogLevel.INFO;
        r3 = com.jumio.commons.log.Log.isLogEnabledForLevel(r3);
        if (r3 == 0) goto L_0x026e;
    L_0x0238:
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
    L_0x026e:
        r2 = 0;
        return r2;
    L_0x0270:
        java.lang.System.gc();
        r2 = r1.mContext;
        r3 = com.jumio.nv.models.SelectionModel.class;
        r2 = com.jumio.persistence.DataAccess.load(r2, r3);
        r2 = (com.jumio.nv.models.SelectionModel) r2;
        r3 = r8.getAddressLine();
        r4 = r8.getCity();
        if (r2 == 0) goto L_0x02b3;
    L_0x0287:
        r5 = r2.isVerificationRequired();
        if (r5 != 0) goto L_0x02b3;
    L_0x028d:
        r2 = r2.getSelectedCountry();
        r2 = r2.getIsoCode();
        r5 = "USA";
        r2 = r5.equals(r2);
        if (r2 == 0) goto L_0x02b3;
    L_0x029d:
        r2 = r1.c;
        r5 = com.jumio.core.data.document.DocumentScanMode.PDF417;
        if (r2 != r5) goto L_0x02b3;
    L_0x02a3:
        if (r3 == 0) goto L_0x02c1;
    L_0x02a5:
        r2 = r3.length();
        if (r2 == 0) goto L_0x02c1;
    L_0x02ab:
        if (r4 == 0) goto L_0x02c1;
    L_0x02ad:
        r2 = r4.length();
        if (r2 == 0) goto L_0x02c1;
    L_0x02b3:
        r2 = new com.jumio.sdk.extraction.ExtractionClient$ExtractionUpdate;
        r3 = com.jumio.sdk.extraction.ExtractionUpdateState.shotTaken;
        r4 = java.lang.Float.valueOf(r22);
        r2.<init>(r3, r4);
        r1.publishUpdate(r2);
    L_0x02c1:
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
        throw new UnsupportedOperationException("Method not decompiled: jumio.nv.barcode-vision.a.a(java.lang.String, android.graphics.Bitmap, int, int, float):boolean");
    }

    private Bitmap a(byte[] bArr, Rect rect, PreviewProperties previewProperties, int i) {
        int i2;
        int i3;
        int width;
        int height;
        int i4;
        int i5;
        int i6 = previewProperties.camera.width;
        int i7 = previewProperties.camera.height;
        if (previewProperties.isPortrait) {
            i2 = rect.top;
            i3 = rect.left;
            width = rect.width();
            height = rect.height();
            i4 = i2;
            i2 = i3;
            i5 = width;
            i3 = height;
        } else {
            i2 = rect.top;
            i3 = rect.height();
            width = rect.width();
            i4 = i2;
            i5 = i3;
            height = width;
            i2 = rect.left;
        }
        if (i > 0) {
            float f = ((float) i) / 100.0f;
            int i8 = (int) (((float) width) * f);
            int i9 = (int) (((float) i3) * f);
            i2 = Math.max(0, i2 - i8);
            i4 = Math.max(0, i4 - i9);
            width += i8 * 2;
            i6 = width + i2 > i6 ? (i6 - i2) - 1 : width;
            i3 += i9 * 2;
            i7 = i3 + i4 > i7 ? (i7 - i4) - 1 : i3;
            if (previewProperties.isPortrait) {
                height = i6;
                width = i7;
            } else {
                width = i6;
                height = i7;
            }
            return CameraUtils.yuv2bitmap(bArr, previewProperties.isPortrait, previewProperties, i6, i7, i2, i4, width, height);
        }
        return CameraUtils.yuv2bitmap(bArr, previewProperties.isPortrait, previewProperties, width, i3, i2, i4, height, i5);
    }
}

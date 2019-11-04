package jumio.nv.core;

/* compiled from: PluginMap */
public class af extends ae {
    public af() {
        this.a.put("com.jumio.MobileSDK", Long.valueOf(1));
        this.a.put("com.jumio.bam.BamPlugin", Long.valueOf(2));
        this.a.put("com.jumio.nv.linefinder.LineFinderPlugin", Long.valueOf(4));
        this.a.put("com.jumio.nv.barcode.BarcodePlugin", Long.valueOf(8));
        this.a.put("com.jumio.nv.liveness.eyetracking.EyeTrackingPlugin", Long.valueOf(16));
        this.a.put("com.jumio.nv.ocr.OcrPlugin", Long.valueOf(32));
        this.a.put("com.jumio.nv.mrz.MrzPlugin", Long.valueOf(64));
        this.a.put("com.jumio.nv.nfc.NfcPlugin", Long.valueOf(128));
        this.a.put("com.jumio.nv.barcode.vision.BarcodeVisionPlugin", Long.valueOf(256));
        this.a.put("com.jumio.dv.DocumentVerificationSDK", Long.valueOf(512));
    }
}

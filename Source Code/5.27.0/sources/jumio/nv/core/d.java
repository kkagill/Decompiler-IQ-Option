package jumio.nv.core;

import android.content.Context;
import androidx.annotation.Nullable;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.camera.ImageData.CameraPosition;
import com.jumio.commons.camera.Size;
import com.jumio.commons.enums.ScreenAngle;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.core.data.document.ScanSide;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall.DynamicProvider;
import com.jumio.core.network.PreconditionNotSatisfiedException;
import com.jumio.core.network.multipart.MultipartApiCall;
import com.jumio.nv.models.InitiateModel;
import com.jumio.persistence.DataAccess;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: AddPartCall */
public class d extends MultipartApiCall<Void> {
    private static int a;
    private final ScanSide b;
    private String c = null;
    private ImageData d;
    private byte[] e;

    /* compiled from: AddPartCall */
    /* renamed from: jumio.nv.core.d$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ScanSide.values().length];
        static final /* synthetic */ int[] b = new int[ScreenAngle.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0052 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|5|6|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Missing block: B:23:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.jumio.commons.enums.ScreenAngle.values();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.jumio.commons.enums.ScreenAngle.PORTRAIT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.jumio.commons.enums.ScreenAngle.INVERTED_PORTRAIT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.jumio.commons.enums.ScreenAngle.LANDSCAPE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4 = com.jumio.commons.enums.ScreenAngle.INVERTED_LANDSCAPE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = 4;
            r3[r4] = r5;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r3 = com.jumio.core.data.document.ScanSide.values();
            r3 = r3.length;
            r3 = new int[r3];
            a = r3;
            r3 = a;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r4 = com.jumio.core.data.document.ScanSide.FRONT;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0048 }
            r3[r4] = r0;	 Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r3 = com.jumio.core.data.document.ScanSide.BACK;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r0[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = com.jumio.core.data.document.ScanSide.FACE;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x005c }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x005c }
        L_0x005c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: jumio.nv.core.d$AnonymousClass1.<clinit>():void");
        }
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public Void parseResponse(String str) {
        return null;
    }

    public d(Context context, DynamicProvider dynamicProvider, ScanSide scanSide, ImageData imageData, byte[] bArr, Subscriber<Void> subscriber) {
        super(context, dynamicProvider, subscriber);
        this.b = scanSide;
        this.e = bArr;
        this.d = imageData;
    }

    @Nullable
    /* renamed from: a */
    public Void execute() {
        if (this.e != null) {
            return (Void) super.execute();
        }
        throw new PreconditionNotSatisfiedException("image data cannot be null!");
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8 A:{Catch:{ Exception -> 0x00bf }} */
    /* renamed from: b */
    public java.lang.Void offlineResponse() {
        /*
        r7 = this;
        r0 = r7.context;
        r1 = com.jumio.nv.models.SelectionModel.class;
        r0 = com.jumio.persistence.DataAccess.load(r0, r1);
        r0 = (com.jumio.nv.models.SelectionModel) r0;
        r1 = 0;
        if (r0 == 0) goto L_0x00c3;
    L_0x000d:
        r0 = r0.isVerificationRequired();
        if (r0 == 0) goto L_0x00c3;
    L_0x0013:
        r0 = r7.context;
        r2 = com.jumio.nv.models.MerchantSettingsModel.class;
        r0 = com.jumio.persistence.DataAccess.load(r0, r2);
        r0 = (com.jumio.nv.models.MerchantSettingsModel) r0;
        r2 = r7.e;
        r3 = 0;
        r4 = r2.length;
        r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r3, r4);
        if (r2 == 0) goto L_0x00c3;
    L_0x0027:
        if (r0 == 0) goto L_0x00c3;
    L_0x0029:
        r3 = r0.getOutputDirectory();
        if (r3 == 0) goto L_0x00c3;
    L_0x002f:
        r3 = r0.getOutputFormat();
        if (r3 == 0) goto L_0x00c3;
    L_0x0035:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b4 }
        r3.<init>();	 Catch:{ all -> 0x00b4 }
        r4 = r7.b;	 Catch:{ all -> 0x00b4 }
        r4 = r4.name();	 Catch:{ all -> 0x00b4 }
        r3.append(r4);	 Catch:{ all -> 0x00b4 }
        r4 = ".";
        r3.append(r4);	 Catch:{ all -> 0x00b4 }
        r4 = r0.getOutputFormat();	 Catch:{ all -> 0x00b4 }
        r4 = r4.name();	 Catch:{ all -> 0x00b4 }
        r4 = r4.toLowerCase();	 Catch:{ all -> 0x00b4 }
        r3.append(r4);	 Catch:{ all -> 0x00b4 }
        r3 = r3.toString();	 Catch:{ all -> 0x00b4 }
        r4 = new java.io.FileOutputStream;	 Catch:{ all -> 0x00b4 }
        r5 = new java.io.File;	 Catch:{ all -> 0x00b4 }
        r6 = r0.getOutputDirectory();	 Catch:{ all -> 0x00b4 }
        r5.<init>(r6, r3);	 Catch:{ all -> 0x00b4 }
        r4.<init>(r5);	 Catch:{ all -> 0x00b4 }
        r5 = r0.getOutputFormat();	 Catch:{ all -> 0x00b2 }
        r0 = r0.getOutputLevel();	 Catch:{ all -> 0x00b2 }
        r2.compress(r5, r0, r4);	 Catch:{ all -> 0x00b2 }
        r0 = r7.context;	 Catch:{ all -> 0x00b2 }
        r2 = com.jumio.nv.models.OfflineDataModel.class;
        r0 = com.jumio.persistence.DataAccess.load(r0, r2);	 Catch:{ all -> 0x00b2 }
        r0 = (com.jumio.nv.models.OfflineDataModel) r0;	 Catch:{ all -> 0x00b2 }
        if (r0 != 0) goto L_0x0085;
    L_0x0080:
        r0 = new com.jumio.nv.models.OfflineDataModel;	 Catch:{ all -> 0x00b2 }
        r0.<init>();	 Catch:{ all -> 0x00b2 }
    L_0x0085:
        r2 = jumio.nv.core.d.AnonymousClass1.a;	 Catch:{ all -> 0x00b2 }
        r5 = r7.b;	 Catch:{ all -> 0x00b2 }
        r5 = r5.ordinal();	 Catch:{ all -> 0x00b2 }
        r2 = r2[r5];	 Catch:{ all -> 0x00b2 }
        r5 = 1;
        if (r2 == r5) goto L_0x00a1;
    L_0x0092:
        r5 = 2;
        if (r2 == r5) goto L_0x009d;
    L_0x0095:
        r5 = 3;
        if (r2 == r5) goto L_0x0099;
    L_0x0098:
        goto L_0x00a4;
    L_0x0099:
        r0.setFaceImage(r3);	 Catch:{ all -> 0x00b2 }
        goto L_0x00a4;
    L_0x009d:
        r0.setBackImage(r3);	 Catch:{ all -> 0x00b2 }
        goto L_0x00a4;
    L_0x00a1:
        r0.setFrontImage(r3);	 Catch:{ all -> 0x00b2 }
    L_0x00a4:
        r2 = r7.context;	 Catch:{ all -> 0x00b2 }
        r3 = com.jumio.nv.models.OfflineDataModel.class;
        com.jumio.persistence.DataAccess.update(r2, r3, r0);	 Catch:{ all -> 0x00b2 }
        r4.flush();	 Catch:{ Exception -> 0x00bf }
        r4.close();	 Catch:{ Exception -> 0x00bf }
        goto L_0x00c3;
    L_0x00b2:
        r0 = move-exception;
        goto L_0x00b6;
    L_0x00b4:
        r0 = move-exception;
        r4 = r1;
    L_0x00b6:
        if (r4 == 0) goto L_0x00be;
    L_0x00b8:
        r4.flush();	 Catch:{ Exception -> 0x00bf }
        r4.close();	 Catch:{ Exception -> 0x00bf }
    L_0x00be:
        throw r0;	 Catch:{ Exception -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        com.jumio.commons.log.Log.printStackTrace(r0);
    L_0x00c3:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: jumio.nv.core.d.offlineResponse():java.lang.Void");
    }

    public String getUri() {
        String classifier = this.b.getClassifier();
        if (this.c == null) {
            InitiateModel initiateModel = (InitiateModel) DataAccess.load(this.context, InitiateModel.class);
            if (initiateModel != null) {
                this.c = initiateModel.getJumioScanRef();
            } else {
                throw new IllegalStateException("SelectionModel cannot be null!");
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(StringObfuscater.format(new byte[]{(byte) -15, (byte) 42, (byte) 43, (byte) 27, (byte) 67, (byte) 85}, 983068124891981253L));
        stringBuilder.append(this.c);
        stringBuilder.append(StringObfuscater.format(new byte[]{(byte) -40, (byte) -15, (byte) -72, (byte) -59, (byte) -38, (byte) 20, (byte) -54, (byte) 48}, -3512380628637652580L));
        stringBuilder.append(classifier);
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    public void responseReceived(int i, long j) {
        JumioAnalytics.add(MobileEvents.networkRequest(JumioAnalytics.getSessionId(), "addpart", i, j));
    }

    /* Access modifiers changed, original: protected */
    public void prepareData() {
        JSONObject jSONObject = new JSONObject();
        ImageData imageData = this.d;
        int i = AnonymousClass1.b[imageData.getOrientationMode().ordinal()];
        Object obj = i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : "reverseLandscape" : "landscape" : "reversePortrait" : "portrait";
        jSONObject.put("cameraPosition", imageData.getCameraPosition().equals(CameraPosition.FRONT) ? "front" : "back");
        jSONObject.put("orientationMode", obj);
        Size imageSize = imageData.getImageSize();
        jSONObject.put("imageSize", String.format(Locale.GERMAN, "%dx%d", new Object[]{Integer.valueOf(imageSize.width), Integer.valueOf(imageSize.height)}));
        jSONObject.put("flashMode", Boolean.toString(imageData.isFlashMode()));
        jSONObject.put("focusConfidence", Float.toString(imageData.getFocusConfidence()));
        String jSONObject2 = jSONObject.toString();
        String[] strArr = new String[3];
        strArr[0] = "Content-Disposition: form-data; name=\"cameraDeviceDetail\"";
        strArr[1] = "Content-Type: application/json; charset=UTF-8";
        String str = "Content-Length: %d";
        strArr[2] = String.format(str, new Object[]{Integer.valueOf(jSONObject2.length())});
        addPart(strArr, jSONObject2);
        String[] strArr2 = new String[3];
        strArr2[0] = "Content-Disposition: form-data; name=\"image\"; filename=\"image.webp\"";
        strArr2[1] = "Content-Type: image/webp";
        strArr2[2] = String.format(str, new Object[]{Integer.valueOf(this.e.length)});
        addPart(strArr2, this.e);
    }

    /* Access modifiers changed, original: protected */
    public int networkErrorMock() {
        return a;
    }
}

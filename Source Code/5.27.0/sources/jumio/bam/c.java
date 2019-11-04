package jumio.bam;

import android.content.Context;
import androidx.annotation.Nullable;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.camera.ImageData.CameraPosition;
import com.jumio.commons.camera.Size;
import com.jumio.commons.enums.ScreenAngle;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall.DynamicProvider;
import com.jumio.core.network.PreconditionNotSatisfiedException;
import com.jumio.core.network.multipart.MultipartApiCall;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: ImageCall */
public class c extends MultipartApiCall<String> {
    private static int a;
    private final String b;
    private ImageData c;
    private byte[] d;

    /* compiled from: ImageCall */
    /* renamed from: jumio.bam.c$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ScreenAngle.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.jumio.commons.enums.ScreenAngle.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.jumio.commons.enums.ScreenAngle.PORTRAIT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.jumio.commons.enums.ScreenAngle.INVERTED_PORTRAIT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.jumio.commons.enums.ScreenAngle.LANDSCAPE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.jumio.commons.enums.ScreenAngle.INVERTED_LANDSCAPE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: jumio.bam.c$AnonymousClass1.<clinit>():void");
        }
    }

    public c(Context context, DynamicProvider dynamicProvider, ImageData imageData, byte[] bArr, String str, Subscriber<String> subscriber) {
        super(context, dynamicProvider, subscriber);
        this.b = str;
        this.d = bArr;
        this.c = imageData;
    }

    @Nullable
    /* renamed from: a */
    public String execute() {
        if (this.d != null) {
            return (String) super.execute();
        }
        throw new PreconditionNotSatisfiedException("image data cannot be null!");
    }

    public String getUri() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append("/");
        stringBuilder.append(StringObfuscater.format(new byte[]{(byte) 1, (byte) -114, (byte) -15, (byte) 83, (byte) -71, (byte) 50}, -5263286210864610361L));
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public String parseResponse(String str) {
        return this.b;
    }

    /* Access modifiers changed, original: protected */
    public void prepareData() {
        JSONObject jSONObject = new JSONObject();
        int i = AnonymousClass1.a[this.c.getOrientationMode().ordinal()];
        Object obj = i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : "reverseLandscape" : "landscape" : "reversePortrait" : "portrait";
        jSONObject.put("cameraPosition", this.c.getCameraPosition().equals(CameraPosition.FRONT) ? "front" : "back");
        jSONObject.put("orientationMode", obj);
        Size imageSize = this.c.getImageSize();
        jSONObject.put("imageSize", String.format(Locale.GERMAN, "%dx%d", new Object[]{Integer.valueOf(imageSize.width), Integer.valueOf(imageSize.height)}));
        jSONObject.put("flashMode", Boolean.toString(this.c.isFlashMode()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cameraDeviceDetail", jSONObject);
        String jSONObject3 = jSONObject2.toString();
        String[] strArr = new String[3];
        strArr[0] = "Content-Disposition: form-data; name=\"cameraDeviceDetail\"";
        strArr[1] = "Content-Type: application/json; charset=UTF-8";
        String str = "Content-Length: %d";
        strArr[2] = String.format(str, new Object[]{Integer.valueOf(jSONObject3.length())});
        addPart(strArr, jSONObject3);
        String[] strArr2 = new String[3];
        strArr2[0] = "Content-Disposition: form-data; name=\"image\"; filename=\"rawImage\"";
        strArr2[1] = "Content-Type: image/webp";
        strArr2[2] = String.format(str, new Object[]{Integer.valueOf(this.d.length)});
        addPart(strArr2, this.d);
    }

    /* Access modifiers changed, original: protected */
    public int networkErrorMock() {
        return a;
    }
}

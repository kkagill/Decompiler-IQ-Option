package jumio.bam;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.jumio.commons.json.JumioJSONObject;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogUtils;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall;
import com.jumio.core.network.ApiCall.DynamicProvider;
import com.jumio.core.network.SimpleApiCall;
import java.util.UUID;

/* compiled from: InitiateCall */
public class d extends SimpleApiCall<u> {
    private static int a;
    private v b;

    public String getUri() {
        return "";
    }

    public d(Context context, DynamicProvider dynamicProvider, v vVar, Subscriber<u> subscriber) {
        super(context, dynamicProvider, subscriber);
        this.b = vVar;
        setTimeout(5000);
        ApiCall.setTrackingId(UUID.randomUUID().toString());
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public u parseResponse(String str) {
        try {
            u uVar = new u();
            uVar.a(str);
            if (Log.isFileLoggingActivated()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("BAM_");
                stringBuilder.append(uVar.a());
                LogUtils.setSesssionLogFolderName(stringBuilder.toString());
            }
            return uVar;
        } catch (Exception e) {
            Log.w(this.TAG, "Exception", e);
            return null;
        }
    }

    /* Access modifiers changed, original: protected */
    public String getRequest() {
        JumioJSONObject jumioJSONObject = new JumioJSONObject();
        JumioJSONObject jumioJSONObject2 = new JumioJSONObject();
        jumioJSONObject2.put("sdk-platform", "Android");
        jumioJSONObject2.put("sdk-version", "JMSDK 2.14.0 (0-69)");
        jumioJSONObject2.put("manufacturer", Build.MANUFACTURER);
        jumioJSONObject2.put("model", Build.MODEL);
        jumioJSONObject2.put("software-version", VERSION.RELEASE);
        jumioJSONObject2.put("software-build-number", Build.DISPLAY);
        jumioJSONObject2.put("kernel-version", System.getProperty("os.version"));
        jumioJSONObject.put("mobileDeviceDetail", jumioJSONObject2);
        jumioJSONObject.put("merchantReportingCriteria", this.b.k());
        jumioJSONObject.put("dataTransferEnabledSupported", true);
        return jumioJSONObject.toString();
    }

    /* Access modifiers changed, original: protected */
    public int networkErrorMock() {
        return a;
    }
}

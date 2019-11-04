package jumio.nv.core;

import android.content.Context;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.log.Log;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.commons.utils.FileUtil;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall.DynamicProvider;
import com.jumio.core.network.multipart.MultipartApiCall;
import com.jumio.nv.models.InitiateModel;
import com.jumio.persistence.DataAccess;
import java.io.IOException;

/* compiled from: LivenessCall */
public class i extends MultipartApiCall<Void> {
    private String a = null;
    private String[] b;

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public Void parseResponse(String str) {
        return null;
    }

    public i(Context context, DynamicProvider dynamicProvider, String[] strArr, Subscriber<Void> subscriber) {
        super(context, dynamicProvider, subscriber);
        this.b = strArr;
    }

    public String getUri() {
        if (this.a == null) {
            InitiateModel initiateModel = (InitiateModel) DataAccess.load(this.context, InitiateModel.class);
            if (initiateModel != null) {
                this.a = initiateModel.getJumioScanRef();
            } else {
                throw new IllegalStateException("SelectionModel cannot be null!");
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(StringObfuscater.format(new byte[]{(byte) -15, (byte) 42, (byte) 43, (byte) 27, (byte) 67, (byte) 85}, 983068124891981253L));
        stringBuilder.append(this.a);
        stringBuilder.append(StringObfuscater.format(new byte[]{(byte) -40, (byte) -15, (byte) -72, (byte) -59, (byte) -38, (byte) 20, (byte) -54, (byte) 48}, -3512380628637652580L));
        stringBuilder.append("LIVENESS");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public Void execute() {
        try {
            super.execute();
        } catch (Exception unused) {
            Log.i(this.TAG, "<- call(failed) - mark it as success anyways");
        }
        return null;
    }

    /* Access modifiers changed, original: protected */
    public void responseReceived(int i, long j) {
        JumioAnalytics.add(MobileEvents.networkRequest(JumioAnalytics.getSessionId(), "liveness", i, j));
    }

    /* Access modifiers changed, original: protected */
    public void prepareData() {
        int i = 0;
        while (true) {
            String[] strArr = this.b;
            if (i < strArr.length) {
                try {
                    byte[] readFile = FileUtil.readFile(strArr[i]);
                    r4 = new String[3];
                    r4[0] = String.format("Content-Disposition: form-data; name=\"%s_%d\"; filename=\"%s_%d.jpg\"", new Object[]{this.a, Integer.valueOf(i), this.a, Integer.valueOf(i)});
                    r4[1] = "Content-Type: image/webp";
                    r4[2] = String.format("Content-Length: %d", new Object[]{Integer.valueOf(readFile.length)});
                    addPart(r4, readFile);
                } catch (IOException unused) {
                }
                i++;
            } else {
                return;
            }
        }
    }
}

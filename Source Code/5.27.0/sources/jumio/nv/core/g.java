package jumio.nv.core;

import android.content.Context;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall;
import com.jumio.core.network.ApiCall.DynamicProvider;
import com.jumio.core.network.SimpleApiCall;
import com.jumio.nv.models.InitiateModel;
import com.jumio.persistence.DataAccess;

/* compiled from: FinalizeCall */
public class g extends SimpleApiCall<Void> {
    private static int a;
    private String b = null;

    public String getMethod() {
        return "PUT";
    }

    /* Access modifiers changed, original: protected */
    public String getRequest() {
        return "";
    }

    public g(Context context, DynamicProvider dynamicProvider, Subscriber<Void> subscriber) {
        super(context, dynamicProvider, subscriber);
    }

    public String getUri() {
        if (this.b == null) {
            InitiateModel initiateModel = (InitiateModel) DataAccess.load(this.context, InitiateModel.class);
            if (initiateModel != null) {
                this.b = initiateModel.getJumioScanRef();
            } else {
                throw new IllegalStateException("SelectionModel cannot be null!");
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(StringObfuscater.format(new byte[]{(byte) 38, (byte) 90, (byte) 19, (byte) -37, (byte) -45, (byte) -48}, -4723252326649916104L));
        stringBuilder.append(this.b);
        stringBuilder.append(StringObfuscater.format(new byte[]{(byte) -33, (byte) -92, (byte) -126, (byte) 38, (byte) -74, (byte) 28, (byte) -46, (byte) -126, (byte) 92, (byte) 112, (byte) 13, (byte) -69, (byte) -125, (byte) -103, (byte) -14, (byte) -112}, 1206204796263429576L));
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    public void responseReceived(int i, long j) {
        JumioAnalytics.add(MobileEvents.networkRequest(JumioAnalytics.getSessionId(), "finalize", i, j));
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public Void parseResponse(String str) {
        ApiCall.setTrackingId(null);
        return null;
    }

    /* Access modifiers changed, original: protected */
    public int networkErrorMock() {
        return a;
    }
}

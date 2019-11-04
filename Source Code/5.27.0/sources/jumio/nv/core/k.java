package jumio.nv.core;

import android.content.Context;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.log.Log;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall;
import com.jumio.core.network.SimpleApiCall;
import com.jumio.nv.data.document.NVDocumentType;
import com.jumio.nv.models.CountryDocumentModel;
import com.jumio.nv.models.MerchantSettingsModel;
import com.jumio.nv.models.NetverifyCredentialsModel;
import com.jumio.nv.models.NetverifyOfflineCredentialsModel;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.sdk.models.CredentialsModel;
import java.util.Iterator;
import java.util.UUID;
import jumio.nv.core.j.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SettingsCall */
public class k extends SimpleApiCall<ServerSettingsModel> implements a {
    private static int a;
    private MerchantSettingsModel b;
    private CredentialsModel c;

    public k(Context context, c cVar, CredentialsModel credentialsModel, MerchantSettingsModel merchantSettingsModel, Subscriber<ServerSettingsModel> subscriber) {
        super(context, cVar, subscriber);
        ApiCall.setTrackingId(UUID.randomUUID().toString());
        this.b = merchantSettingsModel;
        this.c = credentialsModel;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public ServerSettingsModel offlineResponse() {
        try {
            ((NetverifyOfflineCredentialsModel) this.c).verify(this.context);
            ServerSettingsModel serverSettingsModel = new ServerSettingsModel();
            serverSettingsModel.useOfflineToken((NetverifyOfflineCredentialsModel) this.c, CountryDocumentModel.isDeviceLanguageLocalizable(this.context));
            return serverSettingsModel;
        } catch (Exception e) {
            publishError(e);
            return null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void responseReceived(int i, long j) {
        JumioAnalytics.add(MobileEvents.networkRequest(JumioAnalytics.getSessionId(), "settings", i, j));
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public ServerSettingsModel parseResponse(String str) {
        try {
            ServerSettingsModel serverSettingsModel = new ServerSettingsModel();
            serverSettingsModel.parseJson(str, ((c) this.dynamicProvider).a(), CountryDocumentModel.isDeviceLanguageLocalizable(this.context));
            return serverSettingsModel;
        } catch (Exception e) {
            Log.w(this.TAG, "Exception", e);
            return null;
        }
    }

    /* Access modifiers changed, original: protected */
    public String getRequest() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.b.getSupportedDocumentTypes().iterator();
        while (it.hasNext()) {
            jSONArray.put(((NVDocumentType) it.next()).toString());
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("cdnPublicKey");
        jSONArray2.put("barcodeScanner");
        jSONArray2.put("eMRTD");
        jSONArray2.put("eyeTracking");
        jSONArray2.put("eyeTrackingAnalytics");
        jSONArray2.put("blur");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idTypes", jSONArray);
        jSONObject.put("features", jSONArray2);
        return jSONObject.toString();
    }

    public String getUri() {
        return StringObfuscater.format(new byte[]{(byte) -22, (byte) -121, (byte) -25, (byte) 65, (byte) 43, (byte) 57, (byte) 98, (byte) -73}, -3991709031461092330L);
    }

    public boolean a(Throwable th, Context context) {
        boolean a = ((c) this.dynamicProvider).a(th, context, true);
        if (a) {
            this.c = ((NetverifyCredentialsModel) this.c).getOfflineCredentialsModel();
            publishResult(offlineResponse());
        }
        return a;
    }

    /* Access modifiers changed, original: protected */
    public int networkErrorMock() {
        return a;
    }
}

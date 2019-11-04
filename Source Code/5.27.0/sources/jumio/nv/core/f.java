package jumio.nv.core;

import android.content.Context;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.core.data.document.ScanSide;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall.DynamicProvider;
import com.jumio.core.network.multipart.MultipartApiCall;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.nv.models.SelectionModel;
import com.jumio.persistence.DataAccess;
import org.json.JSONObject;

/* compiled from: ExtractDataCall */
public class f extends MultipartApiCall<DocumentDataModel> {
    private static int b;
    byte[] a = null;
    private SelectionModel c = null;

    public f(Context context, DynamicProvider dynamicProvider, byte[] bArr, Subscriber<DocumentDataModel> subscriber) {
        super(context, dynamicProvider, subscriber);
        this.a = bArr;
    }

    public String getUri() {
        return StringObfuscater.format(new byte[]{(byte) 9, (byte) 80, (byte) -55, (byte) -97, (byte) 29, (byte) 60, (byte) 56, (byte) 65, (byte) -48, (byte) 107, (byte) 2, (byte) -101}, 4399378386366219258L);
    }

    /* Access modifiers changed, original: protected */
    public void responseReceived(int i, long j) {
        JumioAnalytics.add(MobileEvents.networkRequest(JumioAnalytics.getSessionId(), "extractdata", i, j));
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public DocumentDataModel parseResponse(String str) {
        DocumentDataModel documentDataModel = new DocumentDataModel();
        documentDataModel.parseJson(str);
        return documentDataModel;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public DocumentDataModel offlineResponse() {
        return new DocumentDataModel();
    }

    /* Access modifiers changed, original: protected */
    public void prepareData() {
        if (this.c == null) {
            this.c = (SelectionModel) DataAccess.load(this.context, SelectionModel.class);
            if (this.c == null) {
                throw new IllegalStateException("SelectionModel cannot be null!");
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("country", this.c.getSelectedCountry().getIsoCode());
        jSONObject.put("idType", this.c.getSelectedDoctype().getId());
        jSONObject.put("imageSide", this.c.getSelectedDoctype().getDocumentScanSide() == ScanSide.FRONT ? "FRONT" : "BACK");
        String jSONObject2 = jSONObject.toString();
        String[] strArr = new String[3];
        strArr[0] = "Content-Disposition: form-data; name=\"data\"";
        strArr[1] = "Content-Type: application/json; charset=UTF-8";
        String str = "Content-Length: %d";
        strArr[2] = String.format(str, new Object[]{Integer.valueOf(jSONObject2.length())});
        addPart(strArr, jSONObject2);
        String[] strArr2 = new String[3];
        strArr2[0] = "Content-Disposition: form-data; name=\"fileUpload\"; filename=\"image.jpeg\"";
        strArr2[1] = "Content-Type: image/jpeg";
        strArr2[2] = String.format(str, new Object[]{Integer.valueOf(this.a.length)});
        addPart(strArr2, this.a);
    }

    /* Access modifiers changed, original: protected */
    public int networkErrorMock() {
        return b;
    }
}

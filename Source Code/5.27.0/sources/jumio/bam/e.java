package jumio.bam;

import android.content.Context;
import com.jumio.commons.json.JumioJSONObject;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall.DynamicProvider;
import com.jumio.core.network.SimpleApiCall;

/* compiled from: ResultCall */
public class e extends SimpleApiCall<String> {
    private static int a;
    private final String b;
    private final w c;
    private final v d;

    public e(Context context, DynamicProvider dynamicProvider, v vVar, w wVar, String str, Subscriber<String> subscriber) {
        super(context, dynamicProvider, subscriber);
        this.d = vVar;
        this.c = wVar;
        this.b = str;
    }

    public String getUri() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append("/");
        stringBuilder.append(StringObfuscater.format(new byte[]{(byte) -37, (byte) -73, (byte) -57, (byte) -11, (byte) 111, (byte) 113, (byte) -37}, -7026069298207849224L));
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public String parseResponse(String str) {
        return this.b;
    }

    /* Access modifiers changed, original: protected */
    public String getRequest() {
        JumioJSONObject jumioJSONObject = new JumioJSONObject();
        JumioJSONObject jumioJSONObject2 = new JumioJSONObject();
        if (this.c.getCardNumber().length != 0) {
            jumioJSONObject2.put("cardNumber", this.c.getCardNumber());
        }
        if (this.c.getCardExpiryDateMonth().length != 0) {
            jumioJSONObject2.put("cardExpiryMonth", this.c.getCardExpiryDateMonth());
        }
        if (this.c.getCardExpiryDateYear().length != 0) {
            jumioJSONObject2.put("cardExpiryYear", this.c.getCardExpiryDateYear());
        }
        jumioJSONObject2.put("cardHolderName", this.c.getCardHolderName());
        jumioJSONObject2.put("cardSortCode", this.c.getCardSortCode());
        jumioJSONObject2.put("cardAccountNumber", this.c.getCardAccountNumber());
        jumioJSONObject2.put("cardUMP", this.c.b());
        JumioJSONObject jumioJSONObject3 = new JumioJSONObject();
        jumioJSONObject3.put("recognitionResult", a());
        if (!(this.c.c() == null || this.c.c().length() == 0)) {
            jumioJSONObject3.put("digitCoordinates", this.c.c());
        }
        if (!(this.c.d() == null || this.c.d().length() == 0)) {
            jumioJSONObject3.put("cvvCoordinates", this.c.d());
        }
        jumioJSONObject.put("cardData", jumioJSONObject2);
        jumioJSONObject.put("ocrResult", jumioJSONObject3);
        jumioJSONObject.put("timings", this.c.e());
        return jumioJSONObject.toString();
    }

    private String a() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "3";
        String str2 = "1";
        String str3 = "2";
        if (!this.d.f()) {
            stringBuilder.append(str);
        } else if (this.c.getCardSortCode().length == 0 || this.c.getCardAccountNumber().length == 0) {
            stringBuilder.append(str3);
        } else {
            stringBuilder.append(str2);
        }
        if (!this.d.d()) {
            stringBuilder.append(str);
        } else if (this.c.getCardHolderName().length == 0) {
            stringBuilder.append(str3);
        } else {
            stringBuilder.append(str2);
        }
        if (!this.d.a()) {
            stringBuilder.append(str);
        } else if (this.c.getCardExpiryDateMonth().length == 0 || this.c.getCardExpiryDateYear().length == 0) {
            stringBuilder.append(str3);
        } else {
            stringBuilder.append(str2);
        }
        if (this.c.getCardNumber().length == 0) {
            stringBuilder.append(str3);
        } else {
            stringBuilder.append(str2);
        }
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    public int networkErrorMock() {
        return a;
    }
}

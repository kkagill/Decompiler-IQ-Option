package jumio.bam;

import android.content.Context;
import com.jumio.commons.json.JumioJSONObject;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.core.network.ApiCall.DynamicProvider;
import com.jumio.core.network.SimpleApiCall;

/* compiled from: UpdateCall */
public class f extends SimpleApiCall<Void> {
    private static int a;
    private final String b;
    private final w c;

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public Void parseResponse(String str) {
        return null;
    }

    public f(Context context, DynamicProvider dynamicProvider, w wVar, String str) {
        super(context, dynamicProvider);
        this.b = str;
        this.c = wVar;
    }

    public String getUri() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append("/");
        stringBuilder.append(StringObfuscater.format(new byte[]{(byte) -98, (byte) -66, (byte) 73, (byte) -47, (byte) 98, (byte) 31}, -3640786553150147589L));
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    public String getRequest() {
        JumioJSONObject jumioJSONObject = new JumioJSONObject();
        jumioJSONObject.put("changedCardExpiryMonth", this.c.getCardExpiryDateMonth());
        jumioJSONObject.put("changedCardExpiryYear", this.c.getCardExpiryDateYear());
        jumioJSONObject.put("changedCardHolderName", this.c.getCardHolderName());
        return jumioJSONObject.toString();
    }

    /* Access modifiers changed, original: protected */
    public int networkErrorMock() {
        return a;
    }
}

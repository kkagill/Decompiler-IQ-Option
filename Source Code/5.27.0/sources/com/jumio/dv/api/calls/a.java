package com.jumio.dv.api.calls;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import androidx.annotation.Nullable;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogUtils;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall.DynamicProvider;
import com.jumio.core.network.PreconditionNotSatisfiedException;
import com.jumio.core.network.multipart.MultipartApiCall;
import com.jumio.dv.models.DvSettingsModel;
import com.jumio.persistence.DataAccess;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CompleteCall */
public class a extends MultipartApiCall<String> {
    private static int a;
    private byte[] b;

    public a(Context context, DynamicProvider dynamicProvider, ImageData imageData, Subscriber<String> subscriber) {
        super(context, dynamicProvider, subscriber);
        this.b = imageData.getImageData();
    }

    @Nullable
    /* renamed from: a */
    public String execute() {
        if (this.b != null) {
            return (String) super.execute();
        }
        throw new PreconditionNotSatisfiedException("image data cannot be null!");
    }

    public String getUri() {
        return StringObfuscater.format(new byte[]{(byte) -122, (byte) -29, (byte) -111, (byte) -90, (byte) -5, (byte) 76, (byte) 28, (byte) -127}, 5325261152337364777L);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public String parseResponse(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String str2 = "scanReference";
                if (Log.isFileLoggingActivated()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DV_");
                    stringBuilder.append(jSONObject.getString(str2));
                    LogUtils.setSesssionLogFolderName(stringBuilder.toString());
                }
                return jSONObject.getString(str2);
            } catch (JSONException e) {
                Log.printStackTrace(e);
            }
        }
        return null;
    }

    /* Access modifiers changed, original: protected */
    public void prepareData() {
        DvSettingsModel dvSettingsModel = (DvSettingsModel) DataAccess.load(this.context, DvSettingsModel.class);
        if (dvSettingsModel != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", dvSettingsModel.getType());
            if ("CUSTOM".equals(dvSettingsModel.getType().toUpperCase())) {
                jSONObject.put("customDocumentCode", dvSettingsModel.getCustomDocumentCode());
            }
            jSONObject.put("country", dvSettingsModel.getCountry());
            jSONObject.put("merchantScanReference", dvSettingsModel.getMerchantScanReference());
            jSONObject.put("customerId", dvSettingsModel.getCustomerId());
            String str = "";
            if (!str.equals(dvSettingsModel.getMerchantReportingCriteria())) {
                jSONObject.put("merchantReportingCriteria", dvSettingsModel.getMerchantReportingCriteria());
            }
            if (!str.equals(dvSettingsModel.getCallbackUrl())) {
                jSONObject.put("callbackUrl", dvSettingsModel.getCallbackUrl());
            }
            jSONObject.put("enableExtraction", dvSettingsModel.isEnableExtraction());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sdk-platform", "Android");
            jSONObject2.put("sdk-version", "JMSDK 2.14.0 (0-69)");
            jSONObject2.put("manufacturer", Build.MANUFACTURER);
            jSONObject2.put("model", Build.MODEL);
            jSONObject2.put("software-version", VERSION.RELEASE);
            jSONObject2.put("software-build-number", Build.DISPLAY);
            jSONObject2.put("kernel-version", System.getProperty("os.version"));
            jSONObject.put("deviceDetail", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            String[] strArr = new String[3];
            strArr[0] = "Content-Disposition: form-data; name=\"metadata\"";
            strArr[1] = "Content-Type: application/json; charset=UTF-8";
            String str2 = "Content-Length: %d";
            strArr[2] = String.format(str2, new Object[]{Integer.valueOf(jSONObject3.length())});
            addPart(strArr, jSONObject3);
            String[] strArr2 = new String[3];
            strArr2[0] = "Content-Disposition: form-data; name=\"image\"; filename=\"image.jpg\"";
            strArr2[1] = "Content-Type: image/jpg";
            strArr2[2] = String.format(str2, new Object[]{Integer.valueOf(this.b.length)});
            addPart(strArr2, this.b);
        }
    }

    /* Access modifiers changed, original: protected */
    public int networkErrorMock() {
        return a;
    }
}

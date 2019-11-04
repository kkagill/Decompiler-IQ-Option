package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;

/* compiled from: ApiKey */
public class g {
    /* Access modifiers changed, original: protected */
    public String bjr() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    public String cj(Context context) {
        CharSequence cl = cl(context);
        if (TextUtils.isEmpty(cl)) {
            cl = cm(context);
        }
        if (TextUtils.isEmpty(cl)) {
            cl = ck(context);
        }
        if (TextUtils.isEmpty(cl)) {
            cn(context);
        }
        return cl;
    }

    /* Access modifiers changed, original: protected */
    public String ck(Context context) {
        return new p().ck(context);
    }

    /* Access modifiers changed, original: protected */
    public String cl(Context context) {
        Object e;
        String str = "Fabric";
        String str2 = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    c.biX().d(str, "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str2 = string;
                }
                if (str2 != null) {
                    return str2;
                }
                c.biX().d(str, "Falling back to Crashlytics key lookup from Manifest");
                str2 = bundle.getString("com.crashlytics.ApiKey");
                return str2;
            } catch (Exception e2) {
                e = e2;
                str2 = string;
                k biX = c.biX();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Caught non-fatal exception while retrieving apiKey: ");
                stringBuilder.append(e);
                biX.d(str, stringBuilder.toString());
                return str2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* Access modifiers changed, original: protected */
    public String cm(Context context) {
        String str = "string";
        int f = CommonUtils.f(context, "io.fabric.ApiKey", str);
        if (f == 0) {
            c.biX().d("Fabric", "Falling back to Crashlytics key lookup from Strings");
            f = CommonUtils.f(context, "com.crashlytics.ApiKey", str);
        }
        return f != 0 ? context.getResources().getString(f) : null;
    }

    /* Access modifiers changed, original: protected */
    public void cn(Context context) {
        if (c.biY() || CommonUtils.cv(context)) {
            throw new IllegalArgumentException(bjr());
        }
        c.biX().e("Fabric", bjr());
    }
}

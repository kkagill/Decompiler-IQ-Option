package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.text.TextUtils;
import io.fabric.sdk.android.c;

/* compiled from: FirebaseInfo */
public class p {
    /* Access modifiers changed, original: 0000 */
    public String ck(Context context) {
        int f = CommonUtils.f(context, "google_app_id", "string");
        if (f == 0) {
            return null;
        }
        c.biX().d("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
        return lr(context.getResources().getString(f));
    }

    /* Access modifiers changed, original: 0000 */
    public String lr(String str) {
        return CommonUtils.lm(str).substring(0, 40);
    }

    public boolean cE(Context context) {
        boolean z = false;
        if (CommonUtils.a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        if (cH(context) && !cF(context)) {
            z = true;
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean cF(Context context) {
        if (TextUtils.isEmpty(new g().cl(context))) {
            return TextUtils.isEmpty(new g().cm(context)) ^ 1;
        }
        return true;
    }

    public boolean cG(Context context) {
        int f = CommonUtils.f(context, "io.fabric.auto_initialize", "bool");
        if (f == 0) {
            return false;
        }
        boolean z = context.getResources().getBoolean(f);
        if (z) {
            c.biX().d("Fabric", "Found Fabric auto-initialization flag for joint Firebase/Fabric customers");
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean cH(Context context) {
        int f = CommonUtils.f(context, "google_app_id", "string");
        if (f == 0) {
            return false;
        }
        return TextUtils.isEmpty(context.getResources().getString(f)) ^ 1;
    }
}

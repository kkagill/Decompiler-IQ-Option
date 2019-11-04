package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import com.facebook.f;

/* compiled from: CustomTab */
public class d {
    private Uri uri;

    public d(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String kH = x.kH();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f.gU());
        stringBuilder.append("/");
        stringBuilder.append("dialog/");
        stringBuilder.append(str);
        this.uri = z.a(kH, stringBuilder.toString(), bundle);
    }

    public void b(Activity activity, String str) {
        CustomTabsIntent build = new Builder().build();
        build.intent.setPackage(str);
        build.intent.addFlags(1073741824);
        build.launchUrl(activity, this.uri);
    }
}

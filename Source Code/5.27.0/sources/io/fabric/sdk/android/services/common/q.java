package io.fabric.sdk.android.services.common;

import android.content.Context;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.services.a.b;
import io.fabric.sdk.android.services.a.d;

/* compiled from: InstallerPackageNameProvider */
public class q {
    private final d<String> eNw = new d<String>() {
        /* renamed from: cI */
        public String ch(Context context) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    };
    private final b<String> eNx = new b();

    public String V(Context context) {
        try {
            String str = (String) this.eNx.a(context, this.eNw);
            if ("".equals(str)) {
                str = null;
            }
            return str;
        } catch (Exception e) {
            c.biX().e("Fabric", "Failed to determine installer package name", e);
            return null;
        }
    }
}

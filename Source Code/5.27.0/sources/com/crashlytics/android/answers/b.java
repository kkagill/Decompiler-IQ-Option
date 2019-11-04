package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.i.a;
import io.fabric.sdk.android.services.common.k;
import io.fabric.sdk.android.services.common.p;
import io.fabric.sdk.android.services.settings.q;
import io.fabric.sdk.android.services.settings.s;
import java.io.File;

/* compiled from: Answers */
public class b extends h<Boolean> {
    boolean nL = false;
    z nM;

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:answers";
    }

    public String getVersion() {
        return "1.4.7.32";
    }

    public void a(io.fabric.sdk.android.services.common.i.b bVar) {
        z zVar = this.nM;
        if (zVar != null) {
            zVar.onError(bVar.ZX());
        }
    }

    public void a(a aVar) {
        z zVar = this.nM;
        if (zVar != null) {
            zVar.n(aVar.ZX(), aVar.bjv());
        }
    }

    /* Access modifiers changed, original: protected */
    @SuppressLint({"NewApi"})
    public boolean ee() {
        try {
            long j;
            Context context = getContext();
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            String str = packageInfo.versionName == null ? "0.0" : packageInfo.versionName;
            if (VERSION.SDK_INT >= 9) {
                j = packageInfo.firstInstallTime;
            } else {
                j = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            this.nM = z.a(this, context, bje(), num, str, j);
            this.nM.enable();
            this.nL = new p().cE(context);
            return true;
        } catch (Exception e) {
            c.biX().e("Answers", "Error retrieving app properties", e);
            return false;
        }
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: ef */
    public Boolean ec() {
        String str = "Answers";
        boolean bjx = k.cC(getContext()).bjx();
        Boolean valueOf = Boolean.valueOf(false);
        if (bjx) {
            try {
                s bkH = q.bkG().bkH();
                if (bkH == null) {
                    c.biX().e(str, "Failed to retrieve settings");
                    return valueOf;
                } else if (bkH.ePX.ePC) {
                    c.biX().d(str, "Analytics collection enabled");
                    this.nM.a(bkH.oL, eg());
                    return Boolean.valueOf(true);
                } else {
                    c.biX().d(str, "Analytics collection disabled");
                    this.nM.disable();
                    return valueOf;
                }
            } catch (Exception e) {
                c.biX().e(str, "Error dealing with settings", e);
                return valueOf;
            }
        }
        c.biX().d("Fabric", "Analytics collection disabled, because data collection is disabled by Firebase.");
        this.nM.disable();
        return valueOf;
    }

    /* Access modifiers changed, original: 0000 */
    public String eg() {
        return CommonUtils.L(getContext(), "com.crashlytics.ApiEndpoint");
    }
}

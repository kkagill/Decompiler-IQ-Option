package io.fabric.sdk.android.services.settings;

import android.content.Context;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.g;
import io.fabric.sdk.android.services.common.k;
import io.fabric.sdk.android.services.common.t;
import io.fabric.sdk.android.services.network.c;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Settings */
public class q {
    private final AtomicReference<s> ePR;
    private final CountDownLatch ePS;
    private r ePT;
    private boolean initialized;

    /* compiled from: Settings */
    static class a {
        private static final q ePU = new q();
    }

    public static q bkG() {
        return a.ePU;
    }

    private q() {
        this.ePR = new AtomicReference();
        this.ePS = new CountDownLatch(1);
        this.initialized = false;
    }

    public synchronized q a(h hVar, IdManager idManager, c cVar, String str, String str2, String str3, k kVar) {
        h hVar2 = hVar;
        synchronized (this) {
            if (this.initialized) {
                return this;
            }
            if (this.ePT == null) {
                Context context = hVar.getContext();
                String bjB = idManager.bjB();
                String cj = new g().cj(context);
                String installerPackageName = idManager.getInstallerPackageName();
                t tVar = new t();
                k kVar2 = new k();
                i iVar = new i(hVar2);
                String cx = CommonUtils.cx(context);
                String str4 = str3;
                l lVar = new l(hVar2, str4, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{bjB}), cVar);
                bjB = idManager.bjF();
                String str5 = bjB;
                String str6 = str2;
                String str7 = str;
                h hVar3 = hVar;
                this.ePT = new j(hVar3, new v(cj, str5, idManager.bjE(), idManager.bjD(), idManager.bjA(), CommonUtils.g(CommonUtils.cz(context)), str6, str7, DeliveryMechanism.determineFrom(installerPackageName).getId(), cx), tVar, kVar2, iVar, lVar, kVar);
            }
            this.initialized = true;
            return this;
        }
    }

    public s bkH() {
        try {
            this.ePS.await();
            return (s) this.ePR.get();
        } catch (InterruptedException unused) {
            io.fabric.sdk.android.c.biX().e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    public synchronized boolean bkI() {
        s bkC;
        bkC = this.ePT.bkC();
        d(bkC);
        return bkC != null;
    }

    public synchronized boolean bkJ() {
        s a;
        a = this.ePT.a(SettingsCacheBehavior.SKIP_CACHE_LOOKUP);
        d(a);
        if (a == null) {
            io.fabric.sdk.android.c.biX().e("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        }
        return a != null;
    }

    private void d(s sVar) {
        this.ePR.set(sVar);
        this.ePS.countDown();
    }
}

package io.fabric.sdk.android;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.g;
import io.fabric.sdk.android.services.common.k;
import io.fabric.sdk.android.services.network.b;
import io.fabric.sdk.android.services.network.c;
import io.fabric.sdk.android.services.settings.d;
import io.fabric.sdk.android.services.settings.e;
import io.fabric.sdk.android.services.settings.h;
import io.fabric.sdk.android.services.settings.n;
import io.fabric.sdk.android.services.settings.q;
import io.fabric.sdk.android.services.settings.s;
import io.fabric.sdk.android.services.settings.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: Onboarding */
class l extends h<Boolean> {
    private String applicationLabel;
    private PackageManager eMD;
    private PackageInfo eME;
    private String eMF;
    private final Future<Map<String, j>> eMG;
    private final Collection<h> eMH;
    private String installerPackageName;
    private final c nS = new b();
    private String packageName;
    private String pk;
    private String versionName;

    public String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    public String getVersion() {
        return "1.4.8.32";
    }

    public l(Future<Map<String, j>> future, Collection<h> collection) {
        this.eMG = future;
        this.eMH = collection;
    }

    /* Access modifiers changed, original: protected */
    public boolean ee() {
        try {
            this.installerPackageName = bje().getInstallerPackageName();
            this.eMD = getContext().getPackageManager();
            this.packageName = getContext().getPackageName();
            this.eME = this.eMD.getPackageInfo(this.packageName, 0);
            this.pk = Integer.toString(this.eME.versionCode);
            this.versionName = this.eME.versionName == null ? "0.0" : this.eME.versionName;
            this.applicationLabel = this.eMD.getApplicationLabel(getContext().getApplicationInfo()).toString();
            this.eMF = Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (NameNotFoundException e) {
            c.biX().e("Fabric", "Failed init", e);
            return false;
        }
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: ef */
    public Boolean ec() {
        boolean a;
        String cx = CommonUtils.cx(getContext());
        s bjj = bjj();
        if (bjj != null) {
            try {
                Map map;
                if (this.eMG != null) {
                    map = (Map) this.eMG.get();
                } else {
                    map = new HashMap();
                }
                a = a(cx, bjj.ePV, b(map, this.eMH).values());
            } catch (Exception e) {
                c.biX().e("Fabric", "Error performing auto configuration.", e);
            }
            return Boolean.valueOf(a);
        }
        a = false;
        return Boolean.valueOf(a);
    }

    private s bjj() {
        try {
            q.bkG().a(this, this.pj, this.nS, this.pk, this.versionName, eg(), k.cC(getContext())).bkI();
            return q.bkG().bkH();
        } catch (Exception e) {
            c.biX().e("Fabric", "Error dealing with settings", e);
            return null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Map<String, j> b(Map<String, j> map, Collection<h> collection) {
        for (h hVar : collection) {
            if (!map.containsKey(hVar.getIdentifier())) {
                map.put(hVar.getIdentifier(), new j(hVar.getIdentifier(), hVar.getVersion(), "binary"));
            }
        }
        return map;
    }

    private boolean a(String str, e eVar, Collection<j> collection) {
        String str2 = "Fabric";
        if (!"new".equals(eVar.status)) {
            if ("configured".equals(eVar.status)) {
                return q.bkG().bkJ();
            }
            if (eVar.ePq) {
                c.biX().d(str2, "Server says an update is required - forcing a full App update.");
                c(str, eVar, collection);
            }
            return true;
        } else if (b(str, eVar, collection)) {
            return q.bkG().bkJ();
        } else {
            c.biX().e(str2, "Failed to create app with Crashlytics service.", null);
            return false;
        }
    }

    private boolean b(String str, e eVar, Collection<j> collection) {
        return new h(this, eg(), eVar.url, this.nS).a(a(n.N(getContext(), str), collection));
    }

    private boolean c(String str, e eVar, Collection<j> collection) {
        return a(eVar, n.N(getContext(), str), (Collection) collection);
    }

    private boolean a(e eVar, n nVar, Collection<j> collection) {
        return new x(this, eg(), eVar.url, this.nS).a(a(nVar, collection));
    }

    private d a(n nVar, Collection<j> collection) {
        return new d(new g().cj(getContext()), bje().bjB(), this.versionName, this.pk, CommonUtils.g(CommonUtils.cz(r1)), this.applicationLabel, DeliveryMechanism.determineFrom(this.installerPackageName).getId(), this.eMF, "0", nVar, collection);
    }

    /* Access modifiers changed, original: 0000 */
    public String eg() {
        return CommonUtils.L(getContext(), "com.crashlytics.ApiEndpoint");
    }
}

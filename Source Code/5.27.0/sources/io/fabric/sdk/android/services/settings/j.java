package io.fabric.sdk.android.services.settings;

import android.annotation.SuppressLint;
import android.content.SharedPreferences.Editor;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.services.c.c;
import io.fabric.sdk.android.services.c.d;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.k;
import org.json.JSONObject;

/* compiled from: DefaultSettingsController */
class j implements r {
    private final io.fabric.sdk.android.services.common.j eOl;
    private final v ePu;
    private final u ePv;
    private final g ePw;
    private final w ePx;
    private final k ePy;
    private final h nP;
    private final c rE = new d(this.nP);

    public j(h hVar, v vVar, io.fabric.sdk.android.services.common.j jVar, u uVar, g gVar, w wVar, k kVar) {
        this.nP = hVar;
        this.ePu = vVar;
        this.eOl = jVar;
        this.ePv = uVar;
        this.ePw = gVar;
        this.ePx = wVar;
        this.ePy = kVar;
    }

    public s bkC() {
        return a(SettingsCacheBehavior.USE_CACHE);
    }

    public s a(SettingsCacheBehavior settingsCacheBehavior) {
        String str = "Fabric";
        s sVar = null;
        if (this.ePy.bjx()) {
            try {
                if (!(io.fabric.sdk.android.c.biY() || bkF())) {
                    sVar = b(settingsCacheBehavior);
                }
                if (sVar == null) {
                    JSONObject a = this.ePx.a(this.ePu);
                    if (a != null) {
                        sVar = this.ePv.a(this.eOl, a);
                        this.ePw.a(sVar.ePZ, a);
                        b(a, "Loaded settings: ");
                        lD(bkD());
                    }
                }
                if (sVar == null) {
                    sVar = b(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
                }
            } catch (Exception e) {
                io.fabric.sdk.android.c.biX().e(str, "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e);
            }
            return sVar;
        }
        io.fabric.sdk.android.c.biX().d(str, "Not fetching settings, because data collection is disabled by Firebase.");
        return null;
    }

    private s b(SettingsCacheBehavior settingsCacheBehavior) {
        Throwable e;
        String str = "Fabric";
        s sVar = null;
        try {
            if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                return null;
            }
            JSONObject bkB = this.ePw.bkB();
            if (bkB != null) {
                s a = this.ePv.a(this.eOl, bkB);
                if (a != null) {
                    b(bkB, "Loaded cached settings: ");
                    long bjw = this.eOl.bjw();
                    if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior)) {
                        if (a.cN(bjw)) {
                            io.fabric.sdk.android.c.biX().d(str, "Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        io.fabric.sdk.android.c.biX().d(str, "Returning cached settings.");
                        return a;
                    } catch (Exception e2) {
                        e = e2;
                        sVar = a;
                        io.fabric.sdk.android.c.biX().e(str, "Failed to get cached settings", e);
                        return sVar;
                    }
                }
                io.fabric.sdk.android.c.biX().e(str, "Failed to transform cached settings data.", null);
                return null;
            }
            io.fabric.sdk.android.c.biX().d(str, "No cached settings data found.");
            return null;
        } catch (Exception e3) {
            e = e3;
            io.fabric.sdk.android.c.biX().e(str, "Failed to get cached settings", e);
            return sVar;
        }
    }

    private void b(JSONObject jSONObject, String str) {
        io.fabric.sdk.android.k biX = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(jSONObject.toString());
        biX.d("Fabric", stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public String bkD() {
        return CommonUtils.g(CommonUtils.cz(this.nP.getContext()));
    }

    /* Access modifiers changed, original: 0000 */
    public String bkE() {
        return this.rE.bkA().getString("existing_instance_identifier", "");
    }

    /* Access modifiers changed, original: 0000 */
    @SuppressLint({"CommitPrefEdits"})
    public boolean lD(String str) {
        Editor edit = this.rE.edit();
        edit.putString("existing_instance_identifier", str);
        return this.rE.a(edit);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bkF() {
        return bkE().equals(bkD()) ^ 1;
    }
}

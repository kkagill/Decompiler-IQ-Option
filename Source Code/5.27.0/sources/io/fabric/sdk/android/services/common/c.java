package io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import io.fabric.sdk.android.services.c.d;

/* compiled from: AdvertisingInfoProvider */
class c {
    private final Context context;
    private final io.fabric.sdk.android.services.c.c rE;

    public c(Context context) {
        this.context = context.getApplicationContext();
        this.rE = new d(context, "TwitterAdvertisingInfoPreferences");
    }

    public b bjl() {
        b bjm = bjm();
        if (c(bjm)) {
            io.fabric.sdk.android.c.biX().d("Fabric", "Using AdvertisingInfo from Preference Store");
            a(bjm);
            return bjm;
        }
        bjm = bjp();
        b(bjm);
        return bjm;
    }

    private void a(final b bVar) {
        new Thread(new h() {
            public void fV() {
                b a = c.this.bjp();
                if (!bVar.equals(a)) {
                    io.fabric.sdk.android.c.biX().d("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                    c.this.b(a);
                }
            }
        }).start();
    }

    @SuppressLint({"CommitPrefEdits"})
    private void b(b bVar) {
        String str = "limit_ad_tracking_enabled";
        String str2 = "advertising_id";
        if (c(bVar)) {
            io.fabric.sdk.android.services.c.c cVar = this.rE;
            cVar.a(cVar.edit().putString(str2, bVar.eMM).putBoolean(str, bVar.eMN));
            return;
        }
        io.fabric.sdk.android.services.c.c cVar2 = this.rE;
        cVar2.a(cVar2.edit().remove(str2).remove(str));
    }

    /* Access modifiers changed, original: protected */
    public b bjm() {
        return new b(this.rE.bkA().getString("advertising_id", ""), this.rE.bkA().getBoolean("limit_ad_tracking_enabled", false));
    }

    public f bjn() {
        return new d(this.context);
    }

    public f bjo() {
        return new e(this.context);
    }

    private boolean c(b bVar) {
        return (bVar == null || TextUtils.isEmpty(bVar.eMM)) ? false : true;
    }

    private b bjp() {
        b bjl = bjn().bjl();
        String str = "Fabric";
        if (c(bjl)) {
            io.fabric.sdk.android.c.biX().d(str, "Using AdvertisingInfo from Reflection Provider");
        } else {
            bjl = bjo().bjl();
            if (c(bjl)) {
                io.fabric.sdk.android.c.biX().d(str, "Using AdvertisingInfo from Service Provider");
            } else {
                io.fabric.sdk.android.c.biX().d(str, "AdvertisingInfo not present");
            }
        }
        return bjl;
    }
}

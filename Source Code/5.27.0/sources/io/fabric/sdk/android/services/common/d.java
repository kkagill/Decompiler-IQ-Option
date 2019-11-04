package io.fabric.sdk.android.services.common;

import android.content.Context;
import io.fabric.sdk.android.c;

/* compiled from: AdvertisingInfoReflectionStrategy */
class d implements f {
    private final Context context;

    public d(Context context) {
        this.context = context.getApplicationContext();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ci(Context context) {
        try {
            if (((Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke(null, new Object[]{context})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public b bjl() {
        return ci(this.context) ? new b(bjq(), isLimitAdTrackingEnabled()) : null;
    }

    private String bjq() {
        try {
            return (String) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(getInfo(), new Object[0]);
        } catch (Exception unused) {
            c.biX().w("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return null;
        }
    }

    private boolean isLimitAdTrackingEnabled() {
        boolean z = false;
        try {
            z = ((Boolean) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(getInfo(), new Object[0])).booleanValue();
            return z;
        } catch (Exception unused) {
            c.biX().w("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return z;
        }
    }

    private Object getInfo() {
        Object obj = null;
        try {
            obj = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{this.context});
            return obj;
        } catch (Exception unused) {
            c.biX().w("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return obj;
        }
    }
}

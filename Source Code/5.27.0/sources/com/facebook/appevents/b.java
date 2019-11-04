package com.facebook.appevents;

import android.content.Context;
import com.facebook.f;
import com.facebook.internal.a;
import java.util.HashMap;
import java.util.Set;

/* compiled from: AppEventCollection */
class b {
    private final HashMap<AccessTokenAppIdPair, h> vf = new HashMap();

    public synchronized void a(PersistedEvents persistedEvents) {
        if (persistedEvents != null) {
            for (AccessTokenAppIdPair accessTokenAppIdPair : persistedEvents.keySet()) {
                h b = b(accessTokenAppIdPair);
                for (AppEvent a : persistedEvents.c(accessTokenAppIdPair)) {
                    b.a(a);
                }
            }
        }
    }

    public synchronized void a(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        b(accessTokenAppIdPair).a(appEvent);
    }

    public synchronized Set<AccessTokenAppIdPair> keySet() {
        return this.vf.keySet();
    }

    public synchronized h a(AccessTokenAppIdPair accessTokenAppIdPair) {
        return (h) this.vf.get(accessTokenAppIdPair);
    }

    public synchronized int ij() {
        int i;
        i = 0;
        for (h ix : this.vf.values()) {
            i += ix.ix();
        }
        return i;
    }

    private synchronized h b(AccessTokenAppIdPair accessTokenAppIdPair) {
        Object obj;
        obj = (h) this.vf.get(accessTokenAppIdPair);
        if (obj == null) {
            Context applicationContext = f.getApplicationContext();
            obj = new h(a.U(applicationContext), AppEventsLogger.P(applicationContext));
        }
        this.vf.put(accessTokenAppIdPair, obj);
        return obj;
    }
}

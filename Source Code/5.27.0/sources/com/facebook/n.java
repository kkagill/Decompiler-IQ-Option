package com.facebook;

import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.aa;
import com.facebook.internal.z;

/* compiled from: ProfileManager */
public final class n {
    private static volatile n uB;
    private final LocalBroadcastManager sE;
    private final m uC;
    private l uD;

    n(LocalBroadcastManager localBroadcastManager, m mVar) {
        aa.b((Object) localBroadcastManager, "localBroadcastManager");
        aa.b((Object) mVar, "profileCache");
        this.sE = localBroadcastManager;
        this.uC = mVar;
    }

    static n hN() {
        if (uB == null) {
            synchronized (n.class) {
                if (uB == null) {
                    uB = new n(LocalBroadcastManager.getInstance(f.getApplicationContext()), new m());
                }
            }
        }
        return uB;
    }

    /* Access modifiers changed, original: 0000 */
    public l hJ() {
        return this.uD;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hO() {
        l hM = this.uC.hM();
        if (hM == null) {
            return false;
        }
        a(hM, false);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(@Nullable l lVar) {
        a(lVar, true);
    }

    private void a(@Nullable l lVar, boolean z) {
        l lVar2 = this.uD;
        this.uD = lVar;
        if (z) {
            if (lVar != null) {
                this.uC.b(lVar);
            } else {
                this.uC.clear();
            }
        }
        if (!z.c((Object) lVar2, (Object) lVar)) {
            a(lVar2, lVar);
        }
    }

    private void a(l lVar, l lVar2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", lVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", lVar2);
        this.sE.sendBroadcast(intent);
    }
}

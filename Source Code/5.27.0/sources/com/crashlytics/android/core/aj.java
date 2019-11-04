package com.crashlytics.android.core;

import android.annotation.SuppressLint;
import io.fabric.sdk.android.services.c.c;
import io.fabric.sdk.android.services.c.d;

@SuppressLint({"CommitPrefEdits"})
/* compiled from: PreferenceManager */
class aj {
    private final c rE;
    private final k rF;

    public static aj a(c cVar, k kVar) {
        return new aj(cVar, kVar);
    }

    public aj(c cVar, k kVar) {
        this.rE = cVar;
        this.rF = kVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void B(boolean z) {
        c cVar = this.rE;
        cVar.a(cVar.edit().putBoolean("always_send_reports_opt_in", z));
    }

    /* Access modifiers changed, original: 0000 */
    public boolean fQ() {
        String str = "preferences_migration_complete";
        String str2 = "always_send_reports_opt_in";
        if (!this.rE.bkA().contains(str)) {
            d dVar = new d(this.rF);
            Object obj = (this.rE.bkA().contains(str2) || !dVar.bkA().contains(str2)) ? null : 1;
            if (obj != null) {
                boolean z = dVar.bkA().getBoolean(str2, false);
                c cVar = this.rE;
                cVar.a(cVar.edit().putBoolean(str2, z));
            }
            c cVar2 = this.rE;
            cVar2.a(cVar2.edit().putBoolean(str, true));
        }
        return this.rE.bkA().getBoolean(str2, false);
    }
}

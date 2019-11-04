package com.iqoption.kyc.a;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.common.base.n;
import com.iqoption.core.analytics.b;
import com.iqoption.util.t;

/* compiled from: ScreenEventOnBackStackChangedListener */
public class d implements OnBackStackChangedListener {
    private final boolean aZy;
    private b dtO;
    private final FragmentManager dtP;
    private final String dtQ;
    private final String dtR;
    private n<b> dtS;
    private final String tag;

    /* Access modifiers changed, original: protected */
    public void aKr() {
    }

    /* Access modifiers changed, original: protected */
    public void aKs() {
    }

    public d(b bVar, FragmentManager fragmentManager, boolean z, String str, String str2, String str3) {
        this.dtO = bVar;
        this.aZy = z;
        this.dtP = fragmentManager;
        this.dtQ = str;
        this.dtR = str2;
        this.tag = str3;
    }

    public void onBackStackChanged() {
        if (t.a(this.dtP, this.tag)) {
            b aKm;
            n nVar = this.dtS;
            if (nVar == null) {
                aKm = a.aKm();
            } else {
                aKm = (b) nVar.get();
            }
            this.dtO = aKm;
            aKr();
            return;
        }
        aKq();
    }

    public void aKq() {
        b bVar = this.dtO;
        if (bVar != null) {
            a.a(bVar, this.dtQ, this.dtR, this.aZy);
            this.dtO = null;
            aKs();
        }
    }
}

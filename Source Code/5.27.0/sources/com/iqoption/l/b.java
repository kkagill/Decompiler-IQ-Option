package com.iqoption.l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iqoption.app.IQApp;
import com.iqoption.app.d;
import com.iqoption.core.data.d.e;
import com.iqoption.h.a;
import com.iqoption.l.a.c;
import com.iqoption.l.a.f;
import com.iqoption.l.a.g;
import com.iqoption.l.a.h;
import com.iqoption.l.a.i;
import com.iqoption.l.a.j;
import com.iqoption.l.a.k;
import com.iqoption.l.a.l;
import com.iqoption.l.a.m;
import com.iqoption.l.a.n;
import com.iqoption.l.a.o;

/* compiled from: SettingsManager */
public final class b {
    private static volatile b dTa;
    private final d dTb;

    private static b bJ(@NonNull Context context) {
        if (dTa == null) {
            synchronized (b.class) {
                if (dTa == null) {
                    dTa = new b(context);
                }
            }
        }
        return dTa;
    }

    public static b aTS() {
        return bJ(IQApp.Eu());
    }

    public b(@NonNull Context context) {
        this.dTb = d.aP(context);
    }

    public boolean aTT() {
        return this.dTb.Gf();
    }

    public void fa(boolean z) {
        this.dTb.br(z);
        IQApp.Ex().bd(new com.iqoption.l.a.b().setValue(Boolean.valueOf(z)));
    }

    public boolean aTU() {
        return this.dTb.Ge();
    }

    public void fb(boolean z) {
        this.dTb.bq(z);
        IQApp.Ex().bd(new f().setValue(Boolean.valueOf(z)));
    }

    public boolean Pk() {
        return e.bdq.WD();
    }

    public void setTradersMoodEnabled(boolean z) {
        e.bdq.cv(z);
        IQApp.Ex().bd(new n().setValue(Boolean.valueOf(z)));
    }

    public boolean Pl() {
        return a.aNv() && e.bdq.WE();
    }

    public void setLiveDealsEnabled(boolean z) {
        e.bdq.cw(z);
        IQApp.Ex().bd(new g().setValue(Boolean.valueOf(z)));
    }

    public boolean aTV() {
        return this.dTb.FC();
    }

    public void fc(boolean z) {
        this.dTb.bd(z);
        IQApp.Ex().bd(new j().setValue(Boolean.valueOf(z)));
    }

    public boolean aTW() {
        return this.dTb.FD();
    }

    public void fd(boolean z) {
        this.dTb.be(z);
        IQApp.Ex().bd(new k().setValue(Boolean.valueOf(z)));
    }

    public boolean aTX() {
        return this.dTb.FE();
    }

    public void fe(boolean z) {
        this.dTb.bf(z);
        IQApp.Ex().bd(new c().setValue(Boolean.valueOf(z)));
    }

    public boolean aTY() {
        return this.dTb.FA();
    }

    public void ff(boolean z) {
        this.dTb.bb(z);
        IQApp.Ex().bd(new l().setValue(Boolean.valueOf(z)));
    }

    public boolean FB() {
        return this.dTb.FB();
    }

    public void bc(boolean z) {
        this.dTb.bc(z);
        IQApp.Ex().bd(new m().setValue(Boolean.valueOf(z)));
    }

    public boolean aTZ() {
        return this.dTb.Gg();
    }

    public void eh(boolean z) {
        this.dTb.bs(z);
        IQApp.Ex().bd(new a.e().setValue(Boolean.valueOf(z)));
    }

    public boolean aUa() {
        return this.dTb.Fm();
    }

    public void fg(boolean z) {
        this.dTb.aU(z);
        IQApp.Ex().bd(new a.a().setValue(Boolean.valueOf(z)));
    }

    public boolean Fo() {
        return this.dTb.Fo();
    }

    public void aW(boolean z) {
        this.dTb.aW(z);
        IQApp.Ex().bd(new o().setValue(Boolean.valueOf(z)));
    }

    public boolean Fn() {
        return this.dTb.Fn();
    }

    public void aV(boolean z) {
        if (z) {
            com.iqoption.marginaddon.b.aND();
        }
        this.dTb.aV(z);
        IQApp.Ex().bd(new h().setValue(Boolean.valueOf(z)));
    }

    public boolean Gd() {
        return this.dTb.Gd();
    }

    public void fh(boolean z) {
        this.dTb.bp(z);
        IQApp.Ex().bd(new i().setValue(Boolean.valueOf(z)));
    }

    public boolean Fp() {
        return this.dTb.Fp();
    }

    public void aX(boolean z) {
        this.dTb.aX(z);
        IQApp.Ex().bd(new a.d().setValue(Boolean.valueOf(z)));
    }
}

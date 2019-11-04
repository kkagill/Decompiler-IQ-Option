package com.iqoption.app.managers;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.x;
import com.iqoption.analytics.sla.Sla;
import com.iqoption.app.managers.i.a;
import com.iqoption.core.connect.c;
import com.iqoption.core.connect.d;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.mobbtech.connect.request.api.e;
import java.util.HashMap;

/* compiled from: SubscribeManager */
public class j implements d {
    private static final String TAG = "com.iqoption.app.managers.j";
    private static final n<j> avc = Suppliers.a(-$$Lambda$--1PysM55v95eoQ4bNfJ4J5fCWw.INSTANCE);
    private final x<i> avd = ConcurrentHashMultiset.st();

    public static j HX() {
        return (j) avc.get();
    }

    public boolean a(i iVar) {
        int count = this.avd.count(iVar);
        if (count != 0) {
            this.avd.add(iVar);
        } else if (e.jh("subscribeMessage").ji(iVar.getName()).e(iVar.HU()).jj(iVar.getVersion()).jk(iVar.HV()).exec()) {
            this.avd.add(iVar);
        }
        return count == 0;
    }

    public boolean b(i iVar) {
        int count = this.avd.count(iVar);
        if (count != 1) {
            this.avd.remove(iVar);
        } else if (e.jh("unsubscribeMessage").ji(iVar.getName()).e(iVar.HU()).jj(iVar.getVersion()).jk(iVar.HV()).exec()) {
            this.avd.remove(iVar);
        }
        if (count == 1) {
            return true;
        }
        return false;
    }

    public void clear() {
        this.avd.clear();
    }

    public void HY() {
        for (i iVar : this.avd.sh()) {
            e.jh("subscribeMessage").ji(iVar.getName()).e(iVar.HU()).jj(iVar.getVersion()).jk(iVar.HV()).exec();
        }
    }

    public <T> c<T> b(String str, Class<T> cls) {
        return new h(str, cls, null, null);
    }

    public static boolean a(boolean z, HashMap<String, Object> hashMap, String str) {
        return new a("expiration-list-changed", str).ee("4.0").a(hashMap).HW().by(z);
    }

    public static boolean a(boolean z, InstrumentType instrumentType) {
        return new a("top-assets-updated").ee("1.2").j("instrument_type", instrumentType).HW().by(z);
    }

    public static boolean a(boolean z, com.iqoption.mobbtech.connect.response.d.a aVar) {
        String str = "timestamp";
        i HW = new a("spot-buyback-quote-generated").j(ConditionalUserProperty.ACTIVE, aVar.activeId).j(str, aVar.akW).HW();
        boolean by = HW.by(z);
        if (by) {
            Sla.CV().a("pricing", z, HW);
        }
        return by;
    }

    public static boolean bz(boolean z) {
        String str = "1.0";
        return new a("balance-created").ee(str).HW().by(z) && new a("balance-changed").ee(str).HW().by(z) && new a("auth-balance-changed").ee(str).HW().by(z);
    }
}

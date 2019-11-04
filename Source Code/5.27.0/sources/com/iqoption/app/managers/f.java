package com.iqoption.app.managers;

import com.iqoption.app.IQApp;
import com.iqoption.app.managers.feature.c;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.entity.StockRate;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.system.a.d;
import com.iqoption.util.v;
import java.lang.ref.WeakReference;

/* compiled from: OtnStockRateManager */
public class f implements com.iqoption.view.a.b.a {
    private final a auA;
    private volatile boolean auB = true;
    private final b auC = new b();
    private final boolean auD;
    private final boolean auE;

    /* compiled from: OtnStockRateManager */
    public interface a {
        void onUpdateStockValue(Double d, Double d2);
    }

    /* compiled from: OtnStockRateManager */
    private final class b extends d {
        private b() {
        }
    }

    public f(a aVar) {
        boolean z = true;
        this.auA = aVar;
        c Iw = c.Iw();
        this.auE = Iw.ej("coinmarketcap");
        if (this.auE || !Iw.ej("show-otn-withdrawal-rate")) {
            z = false;
        }
        this.auD = z;
    }

    public boolean isEnabled() {
        return this.auE || this.auD;
    }

    public void onResume() {
        this.auB = false;
        if (this.auD) {
            this.auC.register();
            j.a(true, InstrumentType.CRYPTO_INSTRUMENT);
        }
        if (this.auE) {
            com.iqoption.view.a.b.aYv().a((com.iqoption.view.a.b.a) this, Integer.valueOf(150));
        }
    }

    public void onPause() {
        this.auB = true;
        if (this.auD) {
            this.auC.unregister();
            j.a(false, InstrumentType.CRYPTO_INSTRUMENT);
        }
        if (this.auE) {
            com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
        }
    }

    private void onUpdateStockValue(Double d, Double d2) {
        if (!this.auB) {
            a aVar = this.auA;
            if (aVar != null) {
                aVar.onUpdateStockValue(d, d2);
            }
        }
    }

    public void HN() {
        Double d = null;
        if (this.auE) {
            WeakReference weakReference = new WeakReference(this);
            String str = "https://api.coinmarketcap.com/v1/ticker/open-trading-network/";
            v.a(new com.iqoption.mobbtech.connect.request.a.a.b(StockRate[].class, RequestManager.a(str, null, IQApp.Eu()), str).aPF(), new -$$Lambda$f$gozb1fwsRNqmXUZZl2Yc76fmXXs(weakReference), new -$$Lambda$f$NEi1P9XaOSd0jiiROS7EHncL1HU(weakReference));
        } else if (this.auD) {
            Double d2;
            com.iqoption.core.microservices.f.a.a.a a = com.iqoption.app.helpers.a.Gs().a(833, InstrumentType.CRYPTO_INSTRUMENT);
            if (a == null) {
                d2 = null;
            } else {
                d2 = com.iqoption.core.microservices.f.a.a.a.a(a.ahz());
            }
            if (a != null) {
                d = com.iqoption.core.microservices.f.a.a.a.a(a.ahy());
            }
            onUpdateStockValue(d2, d);
        }
    }

    private static /* synthetic */ void a(WeakReference weakReference, StockRate[] stockRateArr) {
        f fVar = (f) weakReference.get();
        if (fVar == null) {
            return;
        }
        if (stockRateArr == null || stockRateArr[0] == null) {
            fVar.onUpdateStockValue(null, null);
        } else {
            fVar.onUpdateStockValue(stockRateArr[0].priceUsd, stockRateArr[0].percentChange24h);
        }
    }

    private static /* synthetic */ void b(WeakReference weakReference, Throwable th) {
        f fVar = (f) weakReference.get();
        if (fVar != null) {
            fVar.onUpdateStockValue(null, null);
        }
    }

    public void onTick(long j) {
        HN();
    }
}

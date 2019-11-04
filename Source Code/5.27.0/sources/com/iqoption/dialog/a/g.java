package com.iqoption.dialog.a;

import androidx.annotation.NonNull;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.b;
import com.iqoption.core.microservices.portfolio.response.PortfolioPosition;
import com.iqoption.mobbtech.connect.response.options.c;
import com.iqoption.util.v;
import io.reactivex.e;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.a;

/* compiled from: OptionsLoader */
class g {
    private final long[] cIc;
    private volatile ImmutableList<c> cId;
    private t<List<c>> future;

    g(long[] jArr) {
        this.cIc = jArr;
    }

    public t<List<c>> atH() {
        if (b.DG().DH() == 0) {
            return p.m(new IllegalStateException("balance id = 0"));
        }
        if (this.cId != null) {
            return p.bo(this.cId);
        }
        if (v.f(this.future)) {
            return this.future;
        }
        this.future = com.iqoption.core.rx.g.c(e.w(a.j(this.cIc)).f(-$$Lambda$g$_TBJWg-KsrXUcfls9n0PTapLKK8.INSTANCE).blc().t(-$$Lambda$g$DqmuhXCaPm8aEYwi5ViWCrj8kdI.INSTANCE));
        v.b(this.future, new o<List<c>>() {
            /* renamed from: B */
            public void onSuccess(List<c> list) {
                g.this.cId = ImmutableList.m(list);
            }

            public void l(@NonNull Throwable th) {
                g.this.cId = null;
            }
        });
        return this.future;
    }

    private static /* synthetic */ List aO(List list) {
        ArrayList arrayList = new ArrayList();
        for (com.iqoption.core.microservices.portfolio.response.a agl : list) {
            for (PortfolioPosition agm : agl.agl()) {
                com.iqoption.core.microservices.binaryoptions.response.b agm2 = agm.agm();
                if (agm2 != null) {
                    arrayList.add(c.tradingOption2Option(agm2));
                }
            }
        }
        return arrayList;
    }
}

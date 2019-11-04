package com.iqoption.app.managers;

import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.system.a.c;
import com.iqoption.util.v;
import java.lang.ref.SoftReference;

/* compiled from: OtnLeaderBoardManager */
public final class d {
    private static final String TAG = "com.iqoption.app.managers.d";
    private static final n<d> UB = Suppliers.a(-$$Lambda$d$VwqvEgDnq84_4gMB9XKhrx1HXTA.INSTANCE);
    private t<com.iqoption.microservice.c.a.a> auj;
    private SoftReference<LongSparseArray<com.iqoption.microservice.c.a.a>> auk = new SoftReference(null);

    /* compiled from: OtnLeaderBoardManager */
    public static final class a extends c<Boolean> {
        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        private a() {
        }
    }

    public static d Hs() {
        return (d) UB.get();
    }

    public void al(final long j) {
        LongSparseArray longSparseArray = (LongSparseArray) this.auk.get();
        if (!(longSparseArray == null || longSparseArray.get(j) == null)) {
            a(new a().setValue(Boolean.valueOf(true)));
        }
        if (!Ht()) {
            this.auj = com.iqoption.microservice.c.a.bU(j);
            v.b(this.auj, new o<com.iqoption.microservice.c.a.a>() {
                /* renamed from: a */
                public void onSuccess(com.iqoption.microservice.c.a.a aVar) {
                    LongSparseArray longSparseArray = (LongSparseArray) d.this.auk.get();
                    if (longSparseArray == null) {
                        longSparseArray = new LongSparseArray();
                    }
                    longSparseArray.put(j, aVar);
                    d.this.auk = new SoftReference(longSparseArray);
                    d.a((com.iqoption.system.a.a) new a().setValue(Boolean.valueOf(true)));
                }

                public void l(@NonNull Throwable th) {
                    d.a((com.iqoption.system.a.a) new a().setValue(Boolean.valueOf(false)));
                }
            });
        }
    }

    private static void a(com.iqoption.system.a.a aVar) {
        IQApp.Ex().bd(aVar);
    }

    private d() {
    }

    public int am(long j) {
        LongSparseArray longSparseArray = (LongSparseArray) this.auk.get();
        if (longSparseArray == null || longSparseArray.get(j) == null) {
            return 0;
        }
        return ((com.iqoption.microservice.c.a.a) longSparseArray.get(j)).aOi().aOj();
    }

    public int an(long j) {
        LongSparseArray longSparseArray = (LongSparseArray) this.auk.get();
        if (longSparseArray == null || longSparseArray.get(j) == null) {
            return 0;
        }
        return ((com.iqoption.microservice.c.a.a) longSparseArray.get(j)).aOi().aOk();
    }

    private boolean Ht() {
        t tVar = this.auj;
        return (tVar == null || tVar.isDone()) ? false : true;
    }
}

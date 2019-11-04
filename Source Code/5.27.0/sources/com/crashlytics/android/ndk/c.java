package com.crashlytics.android.ndk;

import com.crashlytics.android.core.k;
import com.crashlytics.android.core.m;
import com.crashlytics.android.core.o;
import com.crashlytics.android.core.p;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.services.c.b;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.io.IOException;

/* compiled from: CrashlyticsNdk */
public class c extends h<Void> implements p {
    private f sn;
    private o so;

    public String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-ndk";
    }

    public String getVersion() {
        return "2.1.0.33";
    }

    /* Access modifiers changed, original: protected */
    public boolean ee() {
        k kVar = (k) io.fabric.sdk.android.c.C(k.class);
        if (kVar != null) {
            return a(new a(getContext(), new JniNativeApi(), new e(new b(this))), kVar, new m());
        }
        throw new UnmetDependencyException("CrashlyticsNdk requires Crashlytics");
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(f fVar, k kVar, m mVar) {
        this.sn = fVar;
        boolean fY = fVar.fY();
        if (fY) {
            mVar.a(kVar, this);
            io.fabric.sdk.android.c.biX().d("CrashlyticsNdk", "Crashlytics NDK initialization successful");
        }
        return fY;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: dZ */
    public Void ec() {
        try {
            this.so = this.sn.fZ();
        } catch (IOException e) {
            io.fabric.sdk.android.c.biX().e("CrashlyticsNdk", "Could not process ndk data; ", e);
        }
        return null;
    }

    public o fv() {
        return this.so;
    }
}

package com.google.android.youtube.player.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.youtube.player.internal.u.a;
import com.google.android.youtube.player.internal.u.b;

public final class r extends s<n> implements d {
    private final String b;
    private final String c;
    private final String d;
    private boolean e;

    public r(Context context, String str, String str2, String str3, a aVar, b bVar) {
        super(context, aVar, bVar);
        this.b = (String) b.ac(str);
        this.c = b.c(str2, "callingPackage cannot be null or empty");
        this.d = b.c(str3, "callingAppVersion cannot be null or empty");
    }

    private final void pE() {
        i();
        if (this.e) {
            throw new IllegalStateException("Connection client has been released");
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(k kVar, d dVar) {
        kVar.a(dVar, 1202, this.c, this.d, this.b, null);
    }

    public final void a(boolean z) {
        if (f()) {
            try {
                ((n) pJ()).a(z);
            } catch (RemoteException unused) {
            }
            this.e = true;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }

    public final void d() {
        if (!this.e) {
            a(true);
        }
        super.d();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface i(IBinder iBinder) {
        return n.a.h(iBinder);
    }

    public final IBinder pB() {
        pE();
        try {
            return ((n) pJ()).pB();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final String pI() {
        return "com.google.android.youtube.api.service.START";
    }
}

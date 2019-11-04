package com.microblink.hardware;

import com.microblink.secured.aa;
import com.microblink.secured.u;

/* compiled from: line */
public class NativeDeviceManager {
    public long IlIllIlIIl = 0;

    private static native long nativeConstruct(String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2);

    private static native void nativeDestruct(long j);

    public NativeDeviceManager(aa aaVar) {
        boolean z;
        boolean z2;
        String bet = aa.bet();
        String manufacturer = aa.getManufacturer();
        String model = aa.getModel();
        String bes = aa.bes();
        int beu = aa.beu();
        int bev = aa.bev();
        u bep = aaVar.bep();
        if (bep == null) {
            z = false;
        } else {
            z = aaVar.a(bep.exr);
        }
        bep = aaVar.bep();
        if (bep == null) {
            z2 = false;
        } else {
            z2 = aaVar.a(bep.exs);
        }
        this.IlIllIlIIl = nativeConstruct(bet, manufacturer, model, bes, beu, bev, z, z2);
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        super.finalize();
        long j = this.IlIllIlIIl;
        if (j != 0) {
            nativeDestruct(j);
        }
    }
}

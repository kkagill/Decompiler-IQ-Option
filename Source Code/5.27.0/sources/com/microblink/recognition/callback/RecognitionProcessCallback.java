package com.microblink.recognition.callback;

import androidx.annotation.Keep;
import com.microblink.a.a;
import com.microblink.a.b;
import com.microblink.a.d;
import com.microblink.a.e;
import com.microblink.a.f;
import com.microblink.detectors.DetectorResult;
import com.microblink.geometry.c;
import com.microblink.image.Image;
import com.microblink.recognition.NativeRecognizerWrapper;
import com.microblink.secured.i;

/* compiled from: line */
public final class RecognitionProcessCallback {
    private long IlIllIlIIl = 0;
    private d euf = null;
    private e evr = null;
    private boolean evs = true;
    private NativeRecognizerWrapper evt;

    private native long nativeConstruct(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i);

    private static native void nativeDestruct(long j);

    private static native void nativeSetMirrorType(long j, int i);

    private static native void nativeSetPaused(long j, boolean z);

    private static native void nativeSetScanningRegion(long j, float f, float f2, float f3, float f4);

    public RecognitionProcessCallback(e eVar, d dVar, c cVar, int i) {
        e eVar2;
        d dVar2 = dVar;
        if (eVar == null || dVar2 == null) {
            eVar2 = new e();
        } else {
            eVar2 = eVar;
        }
        this.evr = eVar2;
        this.euf = dVar2;
        this.IlIllIlIIl = nativeConstruct(this.evr.bdx(), this.evr.bdz(), this.evr.bdA(), this.evr.bdB(), this.evr.bdC().bdD(), this.evr.bdC().bdE(), this.evr.bdC().bdF(), this.evr.bdC().bdG().bdI(), this.evr.bdC().bdG().bdH(), this.evr.bdC().bdG().bdE(), this.evr.bdC().bdG().bdJ(), i);
        a(cVar);
    }

    @Keep
    public final void onDetectionFailed() {
        this.euf.a(new a(null));
    }

    public final long bdL() {
        return this.IlIllIlIIl;
    }

    public final void a(c cVar) {
        if (cVar == null) {
            cVar = c.bdn();
        }
        nativeSetScanningRegion(this.IlIllIlIIl, cVar.getX(), cVar.getY(), cVar.getWidth(), cVar.getHeight());
    }

    public final void a(NativeRecognizerWrapper nativeRecognizerWrapper) {
        this.evt = nativeRecognizerWrapper;
    }

    @Keep
    public final void onMetadataAvailable(int i, Object obj) {
        com.microblink.a.c bVar;
        if (i == 4) {
            NativeRecognizerWrapper nativeRecognizerWrapper = this.evt;
            if (nativeRecognizerWrapper != null) {
                nativeRecognizerWrapper.IIlIlllIIl();
            }
            e eVar = this.evr;
            if (eVar == null || !eVar.bdy()) {
                return;
            }
        }
        if (i == 0) {
            bVar = new b((Image) obj);
        } else if (i == 1) {
            bVar = new f((String) obj);
        } else if (i == 3) {
            bVar = new a((DetectorResult) obj);
        } else {
            StringBuilder stringBuilder = new StringBuilder("Internal error: Cannot build metadata for type ");
            stringBuilder.append(obj.getClass().getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.euf.a(bVar);
        if (i == 0) {
            ((Image) obj).dispose();
        }
    }

    public final void fG(boolean z) {
        this.evs = z;
        nativeSetPaused(this.IlIllIlIIl, z);
    }

    public final boolean isPaused() {
        return this.evs;
    }

    public final void dispose() {
        long j = this.IlIllIlIIl;
        if (j != 0) {
            nativeDestruct(j);
            this.IlIllIlIIl = 0;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        super.finalize();
        dispose();
    }

    static {
        i.bed();
    }
}

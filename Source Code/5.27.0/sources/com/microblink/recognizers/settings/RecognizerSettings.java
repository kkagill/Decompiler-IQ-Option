package com.microblink.recognizers.settings;

import android.os.Parcelable;
import com.microblink.secured.i;

/* compiled from: line */
public abstract class RecognizerSettings implements Parcelable {
    protected long IlIllIlIIl = 0;

    private static native void nativeDestruct(long j);

    private static native boolean nativeIsEnabled(long j);

    private static native boolean nativeRequiresAutofocus(long j);

    private static native boolean nativeRequiresLandscapeMode(long j);

    private static native void nativeSetEnabled(long j, boolean z);

    public int describeContents() {
        return 0;
    }

    protected RecognizerSettings() {
        i.beg();
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        super.finalize();
        long j = this.IlIllIlIIl;
        if (j != 0) {
            nativeDestruct(j);
        }
    }

    public long bdL() {
        return this.IlIllIlIIl;
    }
}

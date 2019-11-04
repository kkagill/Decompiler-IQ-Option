package com.google.android.gms.internal.gtm;

public abstract class zzan extends zzam {
    private boolean zzwd;

    protected zzan(zzap zzap) {
        super(zzap);
    }

    public abstract void zzaw();

    public final boolean isInitialized() {
        return this.zzwd;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzdb() {
        if (!isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzag() {
        zzaw();
        this.zzwd = true;
    }
}

package com.jumio.mrz.impl.smartEngines.swig;

public class MrzEngineInternalSettings {
    private transient long a;
    private transient boolean b;

    protected MrzEngineInternalSettings(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    protected static long getCPtr(MrzEngineInternalSettings mrzEngineInternalSettings) {
        return mrzEngineInternalSettings == null ? 0 : mrzEngineInternalSettings.a;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.a != 0) {
            if (this.b) {
                this.b = false;
                mrzjniInterfaceJNI.delete_MrzEngineInternalSettings(this.a);
            }
            this.a = 0;
        }
    }
}

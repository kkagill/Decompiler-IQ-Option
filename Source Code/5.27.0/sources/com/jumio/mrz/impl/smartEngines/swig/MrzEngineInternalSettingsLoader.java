package com.jumio.mrz.impl.smartEngines.swig;

public class MrzEngineInternalSettingsLoader {
    private transient long a;
    protected transient boolean swigCMemOwn;

    protected MrzEngineInternalSettingsLoader(long j, boolean z) {
        this.swigCMemOwn = z;
        this.a = j;
    }

    protected static long getCPtr(MrzEngineInternalSettingsLoader mrzEngineInternalSettingsLoader) {
        return mrzEngineInternalSettingsLoader == null ? 0 : mrzEngineInternalSettingsLoader.a;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                mrzjniInterfaceJNI.delete_MrzEngineInternalSettingsLoader(this.a);
            }
            this.a = 0;
        }
    }

    public static MrzEngineInternalSettings createFromFilesystem(String str) {
        long MrzEngineInternalSettingsLoader_createFromFilesystem = mrzjniInterfaceJNI.MrzEngineInternalSettingsLoader_createFromFilesystem(str);
        if (MrzEngineInternalSettingsLoader_createFromFilesystem == 0) {
            return null;
        }
        return new MrzEngineInternalSettings(MrzEngineInternalSettingsLoader_createFromFilesystem, true);
    }
}

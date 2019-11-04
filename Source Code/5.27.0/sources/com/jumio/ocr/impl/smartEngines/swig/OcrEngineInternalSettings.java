package com.jumio.ocr.impl.smartEngines.swig;

public class OcrEngineInternalSettings {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected OcrEngineInternalSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(OcrEngineInternalSettings ocrEngineInternalSettings) {
        return ocrEngineInternalSettings == null ? 0 : ocrEngineInternalSettings.swigCPtr;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                jniInterfaceJNI.delete_OcrEngineInternalSettings(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public OcrEngineInternalSettings() {
        this(jniInterfaceJNI.new_OcrEngineInternalSettings(), true);
    }

    public static OcrEngineInternalSettings createFromFilesystem(String str) {
        long OcrEngineInternalSettings_createFromFilesystem = jniInterfaceJNI.OcrEngineInternalSettings_createFromFilesystem(str);
        if (OcrEngineInternalSettings_createFromFilesystem == 0) {
            return null;
        }
        return new OcrEngineInternalSettings(OcrEngineInternalSettings_createFromFilesystem, true);
    }
}

package com.jumio.ocr.impl.smartEngines.swig;

public class DetectionInternalSettings {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected DetectionInternalSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(DetectionInternalSettings detectionInternalSettings) {
        return detectionInternalSettings == null ? 0 : detectionInternalSettings.swigCPtr;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                jniInterfaceJNI.delete_DetectionInternalSettings(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public DetectionInternalSettings() {
        this(jniInterfaceJNI.new_DetectionInternalSettings(), true);
    }
}

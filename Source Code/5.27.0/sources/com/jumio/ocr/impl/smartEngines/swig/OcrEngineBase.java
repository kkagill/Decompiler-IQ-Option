package com.jumio.ocr.impl.smartEngines.swig;

public class OcrEngineBase {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected OcrEngineBase(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(OcrEngineBase ocrEngineBase) {
        return ocrEngineBase == null ? 0 : ocrEngineBase.swigCPtr;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                jniInterfaceJNI.delete_OcrEngineBase(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public OcrEngineBase(OcrEngineInternalSettings ocrEngineInternalSettings) {
        this(jniInterfaceJNI.new_OcrEngineBase(OcrEngineInternalSettings.getCPtr(ocrEngineInternalSettings), ocrEngineInternalSettings), true);
    }

    public OcrEngineBaseSession createSession(ResultAcceptorInterface resultAcceptorInterface) {
        long OcrEngineBase_createSession__SWIG_0 = jniInterfaceJNI.OcrEngineBase_createSession__SWIG_0(this.swigCPtr, this, ResultAcceptorInterface.getCPtr(resultAcceptorInterface), resultAcceptorInterface);
        if (OcrEngineBase_createSession__SWIG_0 == 0) {
            return null;
        }
        return new OcrEngineBaseSession(OcrEngineBase_createSession__SWIG_0, true);
    }

    public OcrEngineBaseSession createSession() {
        long OcrEngineBase_createSession__SWIG_1 = jniInterfaceJNI.OcrEngineBase_createSession__SWIG_1(this.swigCPtr, this);
        if (OcrEngineBase_createSession__SWIG_1 == 0) {
            return null;
        }
        return new OcrEngineBaseSession(OcrEngineBase_createSession__SWIG_1, true);
    }

    public static OcrTimingRecordVector getTimingStats() {
        return new OcrTimingRecordVector(jniInterfaceJNI.OcrEngineBase_getTimingStats(), true);
    }

    public static int getBuildNumber() {
        return jniInterfaceJNI.OcrEngineBase_getBuildNumber();
    }
}

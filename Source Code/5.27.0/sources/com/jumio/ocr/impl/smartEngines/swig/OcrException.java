package com.jumio.ocr.impl.smartEngines.swig;

public class OcrException extends Exception {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected OcrException(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(OcrException ocrException) {
        return ocrException == null ? 0 : ocrException.swigCPtr;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                jniInterfaceJNI.delete_OcrException(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public String getMessage() {
        return what();
    }

    public OcrException(String str) {
        this(jniInterfaceJNI.new_OcrException(str), true);
    }

    public String what() {
        return jniInterfaceJNI.OcrException_what(this.swigCPtr, this);
    }
}

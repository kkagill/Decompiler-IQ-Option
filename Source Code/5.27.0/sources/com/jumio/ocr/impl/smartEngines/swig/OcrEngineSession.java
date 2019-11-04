package com.jumio.ocr.impl.smartEngines.swig;

public class OcrEngineSession extends OcrEngineBaseSession {
    private transient boolean swigCMemOwnDerived;
    private transient long swigCPtr;

    protected OcrEngineSession(long j, boolean z) {
        super(jniInterfaceJNI.OcrEngineSession_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(OcrEngineSession ocrEngineSession) {
        return ocrEngineSession == null ? 0 : ocrEngineSession.swigCPtr;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                jniInterfaceJNI.delete_OcrEngineSession(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    public OcrResult processImageFile(String str, OcrEngineSettings ocrEngineSettings) {
        long OcrEngineSession_processImageFile__SWIG_0 = jniInterfaceJNI.OcrEngineSession_processImageFile__SWIG_0(this.swigCPtr, this, str, OcrEngineSettings.getCPtr(ocrEngineSettings), ocrEngineSettings);
        if (OcrEngineSession_processImageFile__SWIG_0 == 0) {
            return null;
        }
        return new OcrResult(OcrEngineSession_processImageFile__SWIG_0, true);
    }

    public OcrResult processImageFile(String str) {
        long OcrEngineSession_processImageFile__SWIG_1 = jniInterfaceJNI.OcrEngineSession_processImageFile__SWIG_1(this.swigCPtr, this, str);
        if (OcrEngineSession_processImageFile__SWIG_1 == 0) {
            return null;
        }
        return new OcrResult(OcrEngineSession_processImageFile__SWIG_1, true);
    }

    public OcrResult processImageData(byte[] bArr, OcrEngineSettings ocrEngineSettings) {
        long OcrEngineSession_processImageData__SWIG_0 = jniInterfaceJNI.OcrEngineSession_processImageData__SWIG_0(this.swigCPtr, this, bArr, OcrEngineSettings.getCPtr(ocrEngineSettings), ocrEngineSettings);
        if (OcrEngineSession_processImageData__SWIG_0 == 0) {
            return null;
        }
        return new OcrResult(OcrEngineSession_processImageData__SWIG_0, true);
    }

    public OcrResult processImageData(byte[] bArr) {
        long OcrEngineSession_processImageData__SWIG_1 = jniInterfaceJNI.OcrEngineSession_processImageData__SWIG_1(this.swigCPtr, this, bArr);
        if (OcrEngineSession_processImageData__SWIG_1 == 0) {
            return null;
        }
        return new OcrResult(OcrEngineSession_processImageData__SWIG_1, true);
    }
}

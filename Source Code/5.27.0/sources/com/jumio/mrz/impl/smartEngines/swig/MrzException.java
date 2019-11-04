package com.jumio.mrz.impl.smartEngines.swig;

public class MrzException extends Exception {
    private transient long a;
    protected transient boolean swigCMemOwn;

    protected MrzException(long j, boolean z) {
        this.swigCMemOwn = z;
        this.a = j;
    }

    protected static long getCPtr(MrzException mrzException) {
        return mrzException == null ? 0 : mrzException.a;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                mrzjniInterfaceJNI.delete_MrzException(this.a);
            }
            this.a = 0;
        }
    }

    public String getMessage() {
        return what();
    }

    public MrzException(String str) {
        this(mrzjniInterfaceJNI.new_MrzException(str), true);
    }

    public String what() {
        return mrzjniInterfaceJNI.MrzException_what(this.a, this);
    }
}

package com.jumio.ocr.impl.smartEngines.swig;

public class StringVector {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected StringVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(StringVector stringVector) {
        return stringVector == null ? 0 : stringVector.swigCPtr;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                jniInterfaceJNI.delete_StringVector(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public StringVector() {
        this(jniInterfaceJNI.new_StringVector__SWIG_0(), true);
    }

    public StringVector(long j) {
        this(jniInterfaceJNI.new_StringVector__SWIG_1(j), true);
    }

    public long size() {
        return jniInterfaceJNI.StringVector_size(this.swigCPtr, this);
    }

    public long capacity() {
        return jniInterfaceJNI.StringVector_capacity(this.swigCPtr, this);
    }

    public void reserve(long j) {
        jniInterfaceJNI.StringVector_reserve(this.swigCPtr, this, j);
    }

    public boolean isEmpty() {
        return jniInterfaceJNI.StringVector_isEmpty(this.swigCPtr, this);
    }

    public void clear() {
        jniInterfaceJNI.StringVector_clear(this.swigCPtr, this);
    }

    public void add(String str) {
        jniInterfaceJNI.StringVector_add(this.swigCPtr, this, str);
    }

    public String get(int i) {
        return jniInterfaceJNI.StringVector_get(this.swigCPtr, this, i);
    }

    public void set(int i, String str) {
        jniInterfaceJNI.StringVector_set(this.swigCPtr, this, i, str);
    }
}

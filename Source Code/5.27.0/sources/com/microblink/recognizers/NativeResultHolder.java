package com.microblink.recognizers;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.microblink.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: line */
class NativeResultHolder implements a {
    private long IlIllIlIIl = 0;
    private boolean evv = false;
    private boolean evw = true;
    private HashMap<String, Object> evx = new HashMap();
    private HashSet<String> evy = null;

    private static native void nativeDestruct(long j);

    private static native String[] nativeGetAllKeys(long j);

    private static native boolean nativeGetBool(long j, String str, boolean z);

    private static native int nativeGetInt(long j, String str, int i);

    private static native Object nativeGetObject(long j, String str);

    private static native String nativeGetString(long j, String str);

    NativeResultHolder(long j, boolean z, boolean z2) {
        this.IlIllIlIIl = j;
        this.evw = z;
        this.evv = z2;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        super.finalize();
        long j = this.IlIllIlIIl;
        if (j != 0) {
            nativeDestruct(j);
        }
    }

    public Set<String> keySet() {
        if (this.evy == null) {
            this.evy = new HashSet();
            Collections.addAll(this.evy, nativeGetAllKeys(this.IlIllIlIIl));
        }
        return this.evy;
    }

    public String getString(String str) {
        String str2 = (String) this.evx.get(str);
        if (str2 != null) {
            return str2;
        }
        str2 = nativeGetString(this.IlIllIlIIl, str);
        this.evx.put(str, str2);
        return str2;
    }

    @Nullable
    public Object getObject(String str) {
        Object obj = this.evx.get(str);
        if (obj != null) {
            return obj;
        }
        obj = nativeGetObject(this.IlIllIlIIl, str);
        this.evx.put(str, obj);
        return obj;
    }

    public Parcelable getParcelable(String str) {
        Object object = getObject(str);
        return (object == null || !(object instanceof Parcelable)) ? null : (Parcelable) object;
    }

    public boolean isValid() {
        return this.evv;
    }

    public boolean isEmpty() {
        return this.evw;
    }

    public void as(Parcel parcel) {
        Set<String> keySet = keySet();
        Bundle bundle = new Bundle();
        for (String str : keySet) {
            Object object = getObject(str);
            if (object == null) {
                Log.f(this, "Object for key {} is null. Skipping!", str);
            } else if (object instanceof String) {
                bundle.putString(str, (String) object);
            } else if (object instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) object);
            } else if (object instanceof Integer) {
                bundle.putInt(str, ((Integer) object).intValue());
            } else if (object instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) object).booleanValue());
            } else if (object instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) object);
            } else {
                StringBuilder stringBuilder = new StringBuilder("Cannot write to parcel object of type ");
                stringBuilder.append(object.getClass().getName());
                throw new UnsupportedOperationException(stringBuilder.toString());
            }
        }
        parcel.writeBundle(bundle);
        parcel.writeBooleanArray(new boolean[]{this.evv, this.evw});
    }
}

package com.microblink.secured;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.microblink.recognizers.a;
import java.util.Set;

/* compiled from: line */
public final class ac implements a {
    private boolean evv = false;
    private boolean evw = true;
    private Bundle exZ;

    public ac(Parcel parcel) {
        this.exZ = parcel.readBundle(getClass().getClassLoader());
        this.exZ.setClassLoader(getClass().getClassLoader());
        boolean[] zArr = new boolean[2];
        parcel.readBooleanArray(zArr);
        this.evv = zArr[0];
        this.evw = zArr[1];
    }

    public final Set<String> keySet() {
        return this.exZ.keySet();
    }

    public final void as(Parcel parcel) {
        parcel.writeBundle(this.exZ);
        parcel.writeBooleanArray(new boolean[]{this.evv, this.evw});
    }

    public final Parcelable getParcelable(String str) {
        return this.exZ.getParcelable(str);
    }

    public final String getString(String str) {
        return this.exZ.getString(str);
    }

    public final Object getObject(String str) {
        return this.exZ.get(str);
    }

    public final boolean isValid() {
        return this.evv;
    }

    public final boolean isEmpty() {
        return this.evw;
    }
}

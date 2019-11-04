package com.google.android.material.j;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.collection.SimpleArrayMap;
import androidx.customview.view.AbsSavedState;

/* compiled from: ExtendableSavedState */
public class a extends AbsSavedState {
    public static final Creator<a> CREATOR = new ClassLoaderCreator<a>() {
        /* renamed from: e */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        /* renamed from: R */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        /* renamed from: aX */
        public a[] newArray(int i) {
            return new a[i];
        }
    };
    public final SimpleArrayMap<String, Bundle> NB;

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, AnonymousClass1 anonymousClass1) {
        this(parcel, classLoader);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.NB = new SimpleArrayMap();
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.NB = new SimpleArrayMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.NB.put(strArr[i], bundleArr[i]);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        i = this.NB.size();
        parcel.writeInt(i);
        String[] strArr = new String[i];
        Bundle[] bundleArr = new Bundle[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = (String) this.NB.keyAt(i2);
            bundleArr[i2] = (Bundle) this.NB.valueAt(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExtendableSavedState{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" states=");
        stringBuilder.append(this.NB);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

package com.iqoption.util;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: Bundler */
public final class e {
    private final Bundle DC = new Bundle();

    public Bundle toBundle() {
        return this.DC;
    }

    public e aF(String str, String str2) {
        this.DC.putString(str, str2);
        return this;
    }

    public e O(String str, int i) {
        this.DC.putInt(str, i);
        return this;
    }

    public e i(String str, double d) {
        this.DC.putDouble(str, d);
        return this;
    }

    public e g(String str, long j) {
        this.DC.putLong(str, j);
        return this;
    }

    public e a(String str, Parcelable parcelable) {
        this.DC.putParcelable(str, parcelable);
        return this;
    }

    public e a(String str, ArrayList<? extends Parcelable> arrayList) {
        this.DC.putParcelableArrayList(str, arrayList);
        return this;
    }

    public e a(String str, Serializable serializable) {
        this.DC.putSerializable(str, serializable);
        return this;
    }

    public e a(String str, long[] jArr) {
        this.DC.putLongArray(str, jArr);
        return this;
    }

    public e z(String str, boolean z) {
        this.DC.putBoolean(str, z);
        return this;
    }

    public e b(String str, String[] strArr) {
        this.DC.putStringArray(str, strArr);
        return this;
    }

    public e b(String str, Parcelable parcelable) {
        this.DC.putParcelable(str, parcelable);
        return this;
    }
}

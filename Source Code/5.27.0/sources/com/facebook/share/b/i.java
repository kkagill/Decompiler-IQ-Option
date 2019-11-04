package com.facebook.share.b;

import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import java.util.Set;

/* compiled from: ShareOpenGraphValueContainer */
public abstract class i<P extends i, E extends a> implements e {
    private final Bundle DC;

    /* compiled from: ShareOpenGraphValueContainer */
    public static abstract class a<P extends i, E extends a> {
        private Bundle DC = new Bundle();

        public E L(String str, @Nullable String str2) {
            this.DC.putString(str, str2);
            return this;
        }

        public E a(P p) {
            if (p != null) {
                this.DC.putAll(p.getBundle());
            }
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    protected i(a<P, E> aVar) {
        this.DC = (Bundle) aVar.DC.clone();
    }

    i(Parcel parcel) {
        this.DC = parcel.readBundle(a.class.getClassLoader());
    }

    @Nullable
    public Object get(String str) {
        return this.DC.get(str);
    }

    @Nullable
    public String getString(String str) {
        return this.DC.getString(str);
    }

    public Bundle getBundle() {
        return (Bundle) this.DC.clone();
    }

    public Set<String> keySet() {
        return this.DC.keySet();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.DC);
    }
}

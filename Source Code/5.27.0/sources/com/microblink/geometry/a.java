package com.microblink.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: line */
public class a implements Parcelable {
    public static final Creator<a> CREATOR = new Creator<a>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };
    private float euq;
    private float eur;
    private float eus;

    public int describeContents() {
        return 0;
    }

    public a() {
        this.eus = -1.0f;
        this.euq = 0.0f;
        this.eur = 0.0f;
    }

    public a(float f, float f2) {
        this.eus = -1.0f;
        this.euq = f;
        this.eur = f2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Point{mX=");
        stringBuilder.append(this.euq);
        stringBuilder.append(", mY=");
        stringBuilder.append(this.eur);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (this.euq == aVar.euq && this.eur == aVar.eur) {
                return true;
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.euq);
        parcel.writeFloat(this.eur);
        parcel.writeFloat(this.eus);
    }

    protected a(Parcel parcel) {
        this.eus = -1.0f;
        this.euq = parcel.readFloat();
        this.eur = parcel.readFloat();
        this.eus = parcel.readFloat();
    }
}

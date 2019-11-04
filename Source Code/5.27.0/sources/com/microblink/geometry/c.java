package com.microblink.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: line */
public class c implements Parcelable {
    public static final Creator<c> CREATOR = new Creator<c>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new c[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new c(parcel, (byte) 0);
        }
    };
    private float euA;
    private float euq;
    private float eur;
    private float euz;

    private static boolean ag(float f) {
        return f >= 0.0f && f <= 1.0f;
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ c(Parcel parcel, byte b) {
        this(parcel);
    }

    public c(float f, float f2, float f3, float f4) {
        this.euq = f;
        this.eur = f2;
        this.euz = f3;
        this.euA = f4;
    }

    public boolean isRelative() {
        return ag(this.euq) && ag(this.eur) && ag(this.euz) && ag(this.euA) && this.euq + this.euz <= 1.0f && this.eur + this.euA <= 1.0f;
    }

    private c(Parcel parcel) {
        this.euq = parcel.readFloat();
        this.eur = parcel.readFloat();
        this.euz = parcel.readFloat();
        this.euA = parcel.readFloat();
    }

    public static c bdn() {
        return new c(0.0f, 0.0f, 1.0f, 1.0f);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Rectangle[");
        stringBuilder.append(this.euq);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(this.eur);
        stringBuilder.append(str);
        stringBuilder.append(this.euz);
        stringBuilder.append(str);
        stringBuilder.append(this.euA);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public float getX() {
        return this.euq;
    }

    public float getY() {
        return this.eur;
    }

    public float getWidth() {
        return this.euz;
    }

    public float getHeight() {
        return this.euA;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.euq);
        parcel.writeFloat(this.eur);
        parcel.writeFloat(this.euz);
        parcel.writeFloat(this.euA);
    }
}

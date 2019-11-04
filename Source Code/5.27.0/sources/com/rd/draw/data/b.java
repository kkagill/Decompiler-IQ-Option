package com.rd.draw.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

/* compiled from: PositionSavedState */
public class b extends BaseSavedState {
    public static final Creator<b> CREATOR = new Creator<b>() {
        /* renamed from: aG */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        /* renamed from: iY */
        public b[] newArray(int i) {
            return new b[i];
        }
    };
    private int Oy;
    private int eIG;
    private int enb;

    /* synthetic */ b(Parcel parcel, AnonymousClass1 anonymousClass1) {
        this(parcel);
    }

    public b(Parcelable parcelable) {
        super(parcelable);
    }

    private b(Parcel parcel) {
        super(parcel);
        this.Oy = parcel.readInt();
        this.eIG = parcel.readInt();
        this.enb = parcel.readInt();
    }

    public int bhV() {
        return this.Oy;
    }

    public void dB(int i) {
        this.Oy = i;
    }

    public int bhW() {
        return this.eIG;
    }

    public void iV(int i) {
        this.eIG = i;
    }

    public int bhX() {
        return this.enb;
    }

    public void iW(int i) {
        this.enb = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.Oy);
        parcel.writeInt(this.eIG);
        parcel.writeInt(this.enb);
    }
}

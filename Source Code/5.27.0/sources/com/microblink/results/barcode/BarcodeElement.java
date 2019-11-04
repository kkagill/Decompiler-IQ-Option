package com.microblink.results.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: line */
public class BarcodeElement implements Parcelable {
    public static final Creator<BarcodeElement> CREATOR = new Creator<BarcodeElement>() {
        /* renamed from: is */
        public final BarcodeElement[] newArray(int i) {
            return new BarcodeElement[i];
        }

        /* renamed from: aF */
        public final BarcodeElement createFromParcel(Parcel parcel) {
            return new BarcodeElement(parcel);
        }
    };
    long IlIllIlIIl;
    private ElementType evI = null;
    private byte[] evJ = null;
    BarcodeDetailedData evK;

    private static native byte[] nativeGetElementBytes(long j);

    private static native int nativeGetElementType(long j);

    public int describeContents() {
        return 0;
    }

    public BarcodeElement(long j, BarcodeDetailedData barcodeDetailedData) {
        this.IlIllIlIIl = j;
        this.evK = barcodeDetailedData;
    }

    public ElementType bdV() {
        if (this.evI == null && this.IlIllIlIIl != 0) {
            this.evI = ElementType.values()[nativeGetElementType(this.IlIllIlIIl)];
        }
        return this.evI;
    }

    public byte[] bdW() {
        if (this.evJ == null) {
            long j = this.IlIllIlIIl;
            if (j != 0) {
                this.evJ = nativeGetElementBytes(j);
            }
        }
        return this.evJ;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(bdV().ordinal());
        byte[] bdW = bdW();
        parcel.writeInt(bdW.length);
        parcel.writeByteArray(bdW);
    }

    public BarcodeElement(Parcel parcel) {
        this.evI = ElementType.values()[parcel.readInt()];
        this.evJ = new byte[parcel.readInt()];
        parcel.readByteArray(this.evJ);
    }
}

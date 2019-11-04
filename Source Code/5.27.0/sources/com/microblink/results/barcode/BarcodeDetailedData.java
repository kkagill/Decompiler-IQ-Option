package com.microblink.results.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* compiled from: line */
public class BarcodeDetailedData implements Parcelable {
    public static final Creator<BarcodeDetailedData> CREATOR = new Creator<BarcodeDetailedData>() {
        /* renamed from: ir */
        public final BarcodeDetailedData[] newArray(int i) {
            return new BarcodeDetailedData[i];
        }

        /* renamed from: aE */
        public final BarcodeDetailedData createFromParcel(Parcel parcel) {
            return new BarcodeDetailedData(parcel);
        }
    };
    long IlIllIlIIl;
    private BarcodeElement[] evG;
    private byte[] evH;

    private static native void nativeDestruct(long j);

    private static native byte[] nativeGetAllData(long j);

    private static native void nativeGetElements(long j, long[] jArr);

    private static native int nativeGetNumElements(long j);

    public int describeContents() {
        return 0;
    }

    @Keep
    public BarcodeDetailedData(long j) {
        this.evG = null;
        this.evH = null;
        this.IlIllIlIIl = j;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        super.finalize();
        long j = this.IlIllIlIIl;
        if (j != 0) {
            nativeDestruct(j);
        }
    }

    @Nullable
    public BarcodeElement[] bdT() {
        if (this.evG == null) {
            long j = this.IlIllIlIIl;
            if (j != 0) {
                int nativeGetNumElements = nativeGetNumElements(j);
                long[] jArr = new long[nativeGetNumElements];
                this.evG = new BarcodeElement[nativeGetNumElements];
                nativeGetElements(this.IlIllIlIIl, jArr);
                for (int i = 0; i < nativeGetNumElements; i++) {
                    this.evG[i] = new BarcodeElement(jArr[i], this);
                }
            }
        }
        return this.evG;
    }

    public void writeToParcel(Parcel parcel, int i) {
        BarcodeElement[] bdT = bdT();
        if (bdT == null || bdT.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(bdT.length);
        parcel.writeTypedArray(bdT, 0);
    }

    public BarcodeDetailedData(Parcel parcel) {
        this.evG = null;
        this.evH = null;
        this.IlIllIlIIl = 0;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.evG = new BarcodeElement[readInt];
            parcel.readTypedArray(this.evG, BarcodeElement.CREATOR);
        }
    }

    @Nullable
    public byte[] bdU() {
        if (this.evH == null) {
            long j = this.IlIllIlIIl;
            if (j != 0) {
                this.evH = nativeGetAllData(j);
            } else if (this.evG != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                BarcodeElement[] barcodeElementArr = this.evG;
                int length = barcodeElementArr.length;
                int i = 0;
                while (i < length) {
                    try {
                        byteArrayOutputStream.write(barcodeElementArr[i].bdW());
                        i++;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
                this.evH = byteArrayOutputStream.toByteArray();
            } else {
                this.evH = null;
            }
        }
        return this.evH;
    }

    public String toString() {
        BarcodeElement[] bdT = bdT();
        StringBuilder stringBuilder = new StringBuilder("Total elements: ");
        if (bdT != null) {
            stringBuilder.append(bdT.length);
            String str = "\n";
            stringBuilder.append(str);
            int i = 0;
            while (i < bdT.length) {
                stringBuilder.append("Element #");
                int i2 = i + 1;
                stringBuilder.append(i2);
                stringBuilder.append(" is of type ");
                BarcodeElement barcodeElement = this.evG[i];
                stringBuilder.append(barcodeElement.bdV() == ElementType.TEXT_DATA ? "text" : "byte");
                stringBuilder.append(str);
                byte[] bdW = barcodeElement.bdW();
                stringBuilder.append("Length = ");
                stringBuilder.append(bdW.length);
                stringBuilder.append(" {");
                for (int i3 = 0; i3 < bdW.length; i3++) {
                    stringBuilder.append(bdW[i3] & 255);
                    if (i3 != bdW.length - 1) {
                        stringBuilder.append(", ");
                    }
                }
                stringBuilder.append("}\n");
                if (barcodeElement.bdV() == ElementType.TEXT_DATA) {
                    try {
                        String str2 = new String(bdW, "UTF-8");
                        stringBuilder.append("Text representation (UTF-8 decoded): ");
                        stringBuilder.append(str2);
                        stringBuilder.append(str);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
                i = i2;
            }
        } else {
            stringBuilder.append("0\n");
        }
        return stringBuilder.toString();
    }
}

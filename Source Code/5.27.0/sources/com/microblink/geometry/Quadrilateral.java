package com.microblink.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import androidx.annotation.Size;
import com.microblink.util.Log;

/* compiled from: line */
public class Quadrilateral implements Parcelable {
    public static final Creator<Quadrilateral> CREATOR = new Creator<Quadrilateral>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Quadrilateral[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Quadrilateral(parcel);
        }
    };
    a euu;
    a euv;
    a euw;
    a eux;
    boolean euy;
    int mColor;

    public int describeContents() {
        return 0;
    }

    public Quadrilateral() {
        this.mColor = -1;
        this.euy = false;
        b(100, 100, 200, 200, 1);
    }

    public void b(int i, int i2, int i3, int i4, int i5) {
        Log.e(this, "Setting margins: top={}, bottom={}, left={}, right={}", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        float f;
        float f2;
        float f3;
        float f4;
        if (i5 == 1 || i5 == 9) {
            f = (float) i4;
            f2 = (float) i;
            this.euu = new a(f, f2);
            f3 = (float) i3;
            this.euv = new a(f3, f2);
            f4 = (float) i2;
            this.euw = new a(f, f4);
            this.eux = new a(f3, f4);
            return;
        }
        f3 = (float) i3;
        f2 = (float) i;
        this.euu = new a(f3, f2);
        f4 = (float) i2;
        this.euv = new a(f3, f4);
        f = (float) i4;
        this.euw = new a(f, f2);
        this.eux = new a(f, f4);
    }

    public Quadrilateral(a aVar, a aVar2, a aVar3, a aVar4) {
        this.mColor = -1;
        this.euy = false;
        a(aVar, aVar2, aVar3, aVar4);
    }

    @Keep
    public Quadrilateral(@Size(8) float[] fArr) {
        this.mColor = -1;
        this.euy = false;
        a(new a(fArr[0], fArr[1]), new a(fArr[2], fArr[3]), new a(fArr[6], fArr[7]), new a(fArr[4], fArr[5]));
    }

    public void a(a aVar, a aVar2, a aVar3, a aVar4) {
        this.euu = aVar;
        this.euv = aVar2;
        this.euw = aVar3;
        this.eux = aVar4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Quadrilateral{mUpperLeft=");
        stringBuilder.append(this.euu);
        stringBuilder.append(", mUpperRight=");
        stringBuilder.append(this.euv);
        stringBuilder.append(", mLowerLeft=");
        stringBuilder.append(this.euw);
        stringBuilder.append(", mLowerRight=");
        stringBuilder.append(this.eux);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void setColor(int i) {
        this.mColor = i;
    }

    public void fF(boolean z) {
        this.euy = z;
    }

    /* renamed from: bdm */
    public Quadrilateral clone() {
        Quadrilateral quadrilateral = new Quadrilateral(this.euu, this.euv, this.euw, this.eux);
        quadrilateral.fF(this.euy);
        quadrilateral.setColor(this.mColor);
        return quadrilateral;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.euu, 0);
        parcel.writeParcelable(this.euv, 0);
        parcel.writeParcelable(this.euw, 0);
        parcel.writeParcelable(this.eux, 0);
        parcel.writeInt(this.mColor);
        parcel.writeByte(this.euy);
    }

    protected Quadrilateral(Parcel parcel) {
        this.mColor = -1;
        boolean z = false;
        this.euy = false;
        this.euu = (a) parcel.readParcelable(a.class.getClassLoader());
        this.euv = (a) parcel.readParcelable(a.class.getClassLoader());
        this.euw = (a) parcel.readParcelable(a.class.getClassLoader());
        this.eux = (a) parcel.readParcelable(a.class.getClassLoader());
        this.mColor = parcel.readInt();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.euy = z;
    }
}

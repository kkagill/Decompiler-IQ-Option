package com.microblink.detectors.quad;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import androidx.annotation.Size;
import com.microblink.detectors.DetectorResult;
import com.microblink.geometry.Quadrilateral;

/* compiled from: line */
public class QuadDetectorResult extends DetectorResult {
    public static final Creator<QuadDetectorResult> CREATOR = new Creator<QuadDetectorResult>() {
        /* renamed from: ap */
        public final QuadDetectorResult createFromParcel(Parcel parcel) {
            return new QuadDetectorResult(parcel);
        }

        /* renamed from: id */
        public final QuadDetectorResult[] newArray(int i) {
            return new QuadDetectorResult[i];
        }
    };
    protected Quadrilateral etZ;
    protected Quadrilateral eua;

    @Keep
    public QuadDetectorResult(int i, int i2, @Size(9) float[] fArr, @Size(8) float[] fArr2, @Size(8) float[] fArr3) {
        super(i, i2, fArr);
        this.etZ = new Quadrilateral(fArr2);
        this.eua = new Quadrilateral(fArr3);
    }

    public QuadDetectorResult(Parcel parcel) {
        super(parcel);
        this.etZ = (Quadrilateral) parcel.readParcelable(Quadrilateral.class.getClassLoader());
        this.eua = (Quadrilateral) parcel.readParcelable(Quadrilateral.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.etZ, 0);
        parcel.writeParcelable(this.eua, 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("; Detection Location: ");
        stringBuilder.append(this.etZ);
        stringBuilder.append("; Display Location: ");
        stringBuilder.append(this.eua);
        return stringBuilder.toString();
    }
}

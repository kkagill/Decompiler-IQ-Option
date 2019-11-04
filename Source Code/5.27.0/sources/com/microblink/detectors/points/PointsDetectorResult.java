package com.microblink.detectors.points;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import androidx.annotation.Size;
import com.microblink.detectors.DetectorResult;
import com.microblink.geometry.b;

/* compiled from: line */
public class PointsDetectorResult extends DetectorResult {
    public static final Creator<PointsDetectorResult> CREATOR = new Creator<PointsDetectorResult>() {
        /* renamed from: ao */
        public final PointsDetectorResult createFromParcel(Parcel parcel) {
            return new PointsDetectorResult(parcel);
        }

        /* renamed from: ic */
        public final PointsDetectorResult[] newArray(int i) {
            return new PointsDetectorResult[i];
        }
    };
    private b etY;

    public int describeContents() {
        return 0;
    }

    @Keep
    public PointsDetectorResult(int i, int i2, @Size(9) float[] fArr, @Size(multiple = 2) float[] fArr2) {
        super(i, i2, fArr);
        this.etY = new b(fArr2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.etY, 0);
    }

    public PointsDetectorResult(Parcel parcel) {
        super(parcel);
        this.etY = (b) parcel.readParcelable(b.class.getClassLoader());
    }
}

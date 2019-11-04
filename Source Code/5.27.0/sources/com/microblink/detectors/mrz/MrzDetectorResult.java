package com.microblink.detectors.mrz;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import androidx.annotation.Size;
import com.microblink.detectors.DetectorResult;
import com.microblink.detectors.points.PointsDetectorResult;

/* compiled from: line */
public class MrzDetectorResult extends DetectorResult {
    public static final Creator<MrzDetectorResult> CREATOR = new Creator<MrzDetectorResult>() {
        /* renamed from: an */
        public final MrzDetectorResult createFromParcel(Parcel parcel) {
            return new MrzDetectorResult(parcel);
        }

        /* renamed from: ib */
        public final MrzDetectorResult[] newArray(int i) {
            return new MrzDetectorResult[i];
        }
    };
    PointsDetectorResult etX;

    @Keep
    public MrzDetectorResult(int i, int i2, @Size(9) float[] fArr, @Size(multiple = 2) float[] fArr2) {
        super(i, i2, fArr);
        this.etX = new PointsDetectorResult(i, i2, fArr, fArr2);
    }

    protected MrzDetectorResult(Parcel parcel) {
        super(parcel);
        this.etX = new PointsDetectorResult(parcel);
    }
}

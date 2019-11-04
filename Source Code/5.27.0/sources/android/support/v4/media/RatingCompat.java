package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new Creator<RatingCompat>() {
        /* renamed from: f */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: h */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };
    private final int aB;
    private final float aC;

    RatingCompat(int i, float f) {
        this.aB = i;
        this.aC = f;
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rating:style=");
        stringBuilder.append(this.aB);
        stringBuilder.append(" rating=");
        float f = this.aC;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public int describeContents() {
        return this.aB;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.aB);
        parcel.writeFloat(this.aC);
    }
}

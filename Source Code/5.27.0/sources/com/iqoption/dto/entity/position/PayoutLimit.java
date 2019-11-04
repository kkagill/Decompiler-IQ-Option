package com.iqoption.dto.entity.position;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;

public class PayoutLimit implements Parcelable {
    public static final Creator<PayoutLimit> CREATOR = new Creator<PayoutLimit>() {
        public PayoutLimit createFromParcel(Parcel parcel) {
            return new PayoutLimit(parcel);
        }

        public PayoutLimit[] newArray(int i) {
            return new PayoutLimit[i];
        }
    };
    @SerializedName("absolute")
    private Double absolute;
    @SerializedName("percent")
    private Integer percent;

    public int describeContents() {
        return 0;
    }

    public double getAbsolute() {
        Double d = this.absolute;
        return d != null ? d.doubleValue() : 0.0d;
    }

    public int getPercent() {
        Integer num = this.percent;
        return num != null ? num.intValue() : 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.absolute.doubleValue());
        parcel.writeInt(this.percent.intValue());
    }

    protected PayoutLimit(Parcel parcel) {
        this.absolute = Double.valueOf(parcel.readDouble());
        this.percent = Integer.valueOf(parcel.readInt());
    }
}

package com.iqoption.dto.entity.position;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;

public class ExtraData implements Parcelable {
    public static final Creator<ExtraData> CREATOR = new Creator<ExtraData>() {
        public ExtraData createFromParcel(Parcel parcel) {
            return new ExtraData(parcel);
        }

        public ExtraData[] newArray(int i) {
            return new ExtraData[i];
        }
    };
    @SerializedName("auto_margin_call")
    public Boolean autoMarginCall;
    @SerializedName("spot_option")
    public Boolean isSpotOption;
    @SerializedName("lower_instrument_strike")
    public Long lowerInstrumentStrike;
    @SerializedName("payout_limit")
    public PayoutLimit payoutLimit;
    @SerializedName("lower_instrument_id")
    public String spotLowerInstrumentId;
    @SerializedName("upper_instrument_id")
    public String spotUpperInstrumentId;
    @SerializedName("stop_out_threshold")
    public Integer stopOutThreshold;
    @SerializedName("upper_instrument_strike")
    public Long upperInstrumentStrike;

    public int describeContents() {
        return 0;
    }

    public PayoutLimit getPayoutLimit() {
        return this.payoutLimit;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.autoMarginCall);
        parcel.writeValue(this.stopOutThreshold);
        parcel.writeValue(this.isSpotOption);
        parcel.writeString(this.spotLowerInstrumentId);
        parcel.writeString(this.spotUpperInstrumentId);
        parcel.writeValue(this.lowerInstrumentStrike);
        parcel.writeValue(this.upperInstrumentStrike);
        parcel.writeParcelable(this.payoutLimit, i);
    }

    protected ExtraData(Parcel parcel) {
        this.autoMarginCall = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.stopOutThreshold = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.isSpotOption = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.spotLowerInstrumentId = parcel.readString();
        this.spotUpperInstrumentId = parcel.readString();
        this.lowerInstrumentStrike = (Long) parcel.readValue(Long.class.getClassLoader());
        this.upperInstrumentStrike = (Long) parcel.readValue(Long.class.getClassLoader());
        this.payoutLimit = (PayoutLimit) parcel.readParcelable(PayoutLimit.class.getClassLoader());
    }
}

package com.iqoption.dto.entity.result;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;

public class KycState implements Parcelable {
    public static final Creator<KycState> CREATOR = new Creator<KycState>() {
        public KycState createFromParcel(Parcel parcel) {
            return new KycState(parcel);
        }

        public KycState[] newArray(int i) {
            return new KycState[i];
        }
    };
    public static final int DAYS_LEFT_BLOCKED = 0;
    public static final int DAYS_LEFT_IGNORE = -1;
    public static final int STATUS_KYC_IS_REQUIRED = 1;
    public static final int STATUS_KYC_PARTIAL_DOCS = 2;
    public static final int STATUS_KYC_WAS_VERIFIED = 3;
    public static final int STATUS_NO_KYC = 0;
    @SerializedName("daysLeftToVerify")
    public Integer daysLeftToVerify;
    @SerializedName("isDocumentPoaUploaded")
    public Boolean isDocumentPoaUploaded;
    @SerializedName("isDocumentPoiUploaded")
    public Boolean isDocumentPoiUploaded;
    @SerializedName("isDocumentsApproved")
    public Boolean isDocumentsApproved;
    @SerializedName("isDocumentsDeclined")
    public Boolean isDocumentsDeclined;
    @SerializedName("isDocumentsNeeded")
    public Boolean isDocumentsNeeded;
    @SerializedName("isDocumentsUploadSkipped")
    public Boolean isDocumentsUploadSkipped;
    @SerializedName("isDocumentsUploaded")
    public Boolean isDocumentsUploaded;
    @SerializedName("isPhoneConfirmationSkipped")
    public Boolean isPhoneConfirmationSkipped;
    @SerializedName("isPhoneConfirmed")
    public Boolean isPhoneConfirmed;
    @SerializedName("isPhoneFilled")
    public Boolean isPhoneFilled;
    @SerializedName("isPhoneNeeded")
    public Boolean isPhoneNeeded;
    @SerializedName("isProfileFilled")
    public Boolean isProfileFilled;
    @SerializedName("isProfileNeeded")
    public Boolean isProfileNeeded;
    @SerializedName("isRegulatedUser")
    public Boolean isRegulatedUser;
    @SerializedName("status")
    public Integer status;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycState{status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", isRegulatedUser=");
        stringBuilder.append(this.isRegulatedUser);
        stringBuilder.append(", isProfileNeeded=");
        stringBuilder.append(this.isProfileNeeded);
        stringBuilder.append(", isPhoneNeeded=");
        stringBuilder.append(this.isPhoneNeeded);
        stringBuilder.append(", isDocumentsNeeded=");
        stringBuilder.append(this.isDocumentsNeeded);
        stringBuilder.append(", isDocumentsDeclined=");
        stringBuilder.append(this.isDocumentsDeclined);
        stringBuilder.append(", isProfileFilled=");
        stringBuilder.append(this.isProfileFilled);
        stringBuilder.append(", isPhoneFilled=");
        stringBuilder.append(this.isPhoneFilled);
        stringBuilder.append(", isDocumentsUploaded=");
        stringBuilder.append(this.isDocumentsUploaded);
        stringBuilder.append(", isPhoneConfirmationSkipped=");
        stringBuilder.append(this.isPhoneConfirmationSkipped);
        stringBuilder.append(", isPhoneConfirmed=");
        stringBuilder.append(this.isPhoneConfirmed);
        stringBuilder.append(", isDocumentsUploadSkipped=");
        stringBuilder.append(this.isDocumentsUploadSkipped);
        stringBuilder.append(", isDocumentsApproved=");
        stringBuilder.append(this.isDocumentsApproved);
        stringBuilder.append(", isDocumentPoiUploaded=");
        stringBuilder.append(this.isDocumentPoiUploaded);
        stringBuilder.append(", isDocumentPoaUploaded=");
        stringBuilder.append(this.isDocumentPoaUploaded);
        stringBuilder.append(", daysLeftToVerify=");
        stringBuilder.append(this.daysLeftToVerify);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.status);
        parcel.writeValue(this.isRegulatedUser);
        parcel.writeValue(this.isProfileNeeded);
        parcel.writeValue(this.isPhoneNeeded);
        parcel.writeValue(this.isDocumentsNeeded);
        parcel.writeValue(this.isDocumentsDeclined);
        parcel.writeValue(this.isProfileFilled);
        parcel.writeValue(this.isPhoneFilled);
        parcel.writeValue(this.isDocumentsUploaded);
        parcel.writeValue(this.isPhoneConfirmationSkipped);
        parcel.writeValue(this.isPhoneConfirmed);
        parcel.writeValue(this.isDocumentsUploadSkipped);
        parcel.writeValue(this.isDocumentsApproved);
        parcel.writeValue(this.isDocumentPoiUploaded);
        parcel.writeValue(this.isDocumentPoaUploaded);
        parcel.writeValue(this.daysLeftToVerify);
    }

    protected KycState(Parcel parcel) {
        this.status = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.isRegulatedUser = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isProfileNeeded = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isPhoneNeeded = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isDocumentsNeeded = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isDocumentsDeclined = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isProfileFilled = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isPhoneFilled = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isDocumentsUploaded = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isPhoneConfirmationSkipped = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isPhoneConfirmed = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isDocumentsUploadSkipped = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isDocumentsApproved = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isDocumentPoiUploaded = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isDocumentPoaUploaded = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.daysLeftToVerify = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycState)) {
            return false;
        }
        KycState kycState = (KycState) obj;
        Integer num = this.status;
        if (!num == null ? num.equals(kycState.status) : kycState.status == null) {
            return false;
        }
        Boolean bool = this.isRegulatedUser;
        if (!bool == null ? bool.equals(kycState.isRegulatedUser) : kycState.isRegulatedUser == null) {
            return false;
        }
        bool = this.isProfileNeeded;
        if (!bool == null ? bool.equals(kycState.isProfileNeeded) : kycState.isProfileNeeded == null) {
            return false;
        }
        bool = this.isPhoneNeeded;
        if (!bool == null ? bool.equals(kycState.isPhoneNeeded) : kycState.isPhoneNeeded == null) {
            return false;
        }
        bool = this.isDocumentsNeeded;
        if (!bool == null ? bool.equals(kycState.isDocumentsNeeded) : kycState.isDocumentsNeeded == null) {
            return false;
        }
        bool = this.isDocumentsDeclined;
        if (!bool == null ? bool.equals(kycState.isDocumentsDeclined) : kycState.isDocumentsDeclined == null) {
            return false;
        }
        bool = this.isProfileFilled;
        if (!bool == null ? bool.equals(kycState.isProfileFilled) : kycState.isProfileFilled == null) {
            return false;
        }
        bool = this.isPhoneFilled;
        if (!bool == null ? bool.equals(kycState.isPhoneFilled) : kycState.isPhoneFilled == null) {
            return false;
        }
        bool = this.isDocumentsUploaded;
        if (!bool == null ? bool.equals(kycState.isDocumentsUploaded) : kycState.isDocumentsUploaded == null) {
            return false;
        }
        bool = this.isPhoneConfirmationSkipped;
        if (!bool == null ? bool.equals(kycState.isPhoneConfirmationSkipped) : kycState.isPhoneConfirmationSkipped == null) {
            return false;
        }
        bool = this.isPhoneConfirmed;
        if (!bool == null ? bool.equals(kycState.isPhoneConfirmed) : kycState.isPhoneConfirmed == null) {
            return false;
        }
        bool = this.isDocumentsUploadSkipped;
        if (!bool == null ? bool.equals(kycState.isDocumentsUploadSkipped) : kycState.isDocumentsUploadSkipped == null) {
            return false;
        }
        bool = this.isDocumentsApproved;
        if (!bool == null ? bool.equals(kycState.isDocumentsApproved) : kycState.isDocumentsApproved == null) {
            return false;
        }
        bool = this.isDocumentPoiUploaded;
        if (!bool == null ? bool.equals(kycState.isDocumentPoiUploaded) : kycState.isDocumentPoiUploaded == null) {
            return false;
        }
        bool = this.isDocumentPoaUploaded;
        if (!bool == null ? bool.equals(kycState.isDocumentPoaUploaded) : kycState.isDocumentPoaUploaded == null) {
            return false;
        }
        num = this.daysLeftToVerify;
        if (num != null) {
            z = num.equals(kycState.daysLeftToVerify);
        } else if (kycState.daysLeftToVerify != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Integer num = this.status;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Boolean bool = this.isRegulatedUser;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isProfileNeeded;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isPhoneNeeded;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isDocumentsNeeded;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isDocumentsDeclined;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isProfileFilled;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isPhoneFilled;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isDocumentsUploaded;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isPhoneConfirmationSkipped;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isPhoneConfirmed;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isDocumentsUploadSkipped;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isDocumentsApproved;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isDocumentPoiUploaded;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.isDocumentPoaUploaded;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num2 = this.daysLeftToVerify;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }
}

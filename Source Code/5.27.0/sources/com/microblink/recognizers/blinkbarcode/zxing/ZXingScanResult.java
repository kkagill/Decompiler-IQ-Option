package com.microblink.recognizers.blinkbarcode.zxing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.microblink.recognizers.BaseRecognitionResult;

/* compiled from: line */
public class ZXingScanResult extends BaseRecognitionResult {
    public static final Creator<ZXingScanResult> CREATOR = new Creator<ZXingScanResult>() {
        /* renamed from: ip */
        public final ZXingScanResult[] newArray(int i) {
            return new ZXingScanResult[i];
        }

        /* renamed from: aC */
        public final ZXingScanResult createFromParcel(Parcel parcel) {
            return new ZXingScanResult(parcel);
        }
    };

    @Keep
    public ZXingScanResult(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    protected ZXingScanResult(Parcel parcel) {
        super(parcel);
    }

    @Nullable
    public String getStringData() {
        return bdM().getString("BarcodeData");
    }

    private String bdP() {
        return bdM().getString("PaymentDataType");
    }

    public String toString() {
        return getStringData();
    }

    public String getTitle() {
        String bdP = bdP();
        if (bdP == null) {
            return "ZXing scan result";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bdP);
        stringBuilder.append(" (ZXing) scan result");
        return stringBuilder.toString();
    }
}

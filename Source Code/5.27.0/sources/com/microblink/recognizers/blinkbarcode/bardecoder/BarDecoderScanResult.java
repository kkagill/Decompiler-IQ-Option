package com.microblink.recognizers.blinkbarcode.bardecoder;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.microblink.recognizers.BaseRecognitionResult;

/* compiled from: line */
public class BarDecoderScanResult extends BaseRecognitionResult {
    public static final Creator<BarDecoderScanResult> CREATOR = new Creator<BarDecoderScanResult>() {
        /* renamed from: ih */
        public final BarDecoderScanResult[] newArray(int i) {
            return new BarDecoderScanResult[i];
        }

        /* renamed from: au */
        public final BarDecoderScanResult createFromParcel(Parcel parcel) {
            return new BarDecoderScanResult(parcel);
        }
    };

    @Keep
    public BarDecoderScanResult(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    protected BarDecoderScanResult(Parcel parcel) {
        super(parcel);
    }

    private String bdP() {
        return bdM().getString("PaymentDataType");
    }

    @Nullable
    public String getStringData() {
        return bdM().getString("BarcodeData");
    }

    public String toString() {
        return getStringData();
    }

    public String getTitle() {
        String bdP = bdP();
        if (bdP == null) {
            return "1D barcode scan result";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bdP);
        stringBuilder.append(" scan result");
        return stringBuilder.toString();
    }
}

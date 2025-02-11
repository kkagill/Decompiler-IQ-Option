package com.microblink.recognizers.blinkbarcode.usdl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import com.microblink.recognizers.BaseRecognitionResult;
import com.microblink.recognizers.a;

/* compiled from: line */
public class USDLScanResult extends BaseRecognitionResult {
    public static final Creator<USDLScanResult> CREATOR = new Creator<USDLScanResult>() {
        /* renamed from: in */
        public final USDLScanResult[] newArray(int i) {
            return new USDLScanResult[i];
        }

        /* renamed from: aA */
        public final USDLScanResult createFromParcel(Parcel parcel) {
            return new USDLScanResult(parcel);
        }
    };

    public String getTitle() {
        return "US Driver's Licence Scan Result";
    }

    @Keep
    public USDLScanResult(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    protected USDLScanResult(Parcel parcel) {
        super(parcel);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        a bdM = bdM();
        for (String str : bdM.keySet()) {
            if (!("pdf417".equals(str) || "PaymentDataType".equals(str))) {
                String string = bdM.getString(str);
                if (string != null) {
                    stringBuilder.append(str);
                    stringBuilder.append(": ");
                    stringBuilder.append(string);
                    stringBuilder.append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }
}

package com.microblink.recognizers.blinkbarcode.pdf417;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.microblink.recognizers.BaseRecognitionResult;
import com.microblink.results.barcode.BarcodeDetailedData;

/* compiled from: line */
public class Pdf417ScanResult extends BaseRecognitionResult {
    public static final Creator<Pdf417ScanResult> CREATOR = new Creator<Pdf417ScanResult>() {
        /* renamed from: ij */
        public final Pdf417ScanResult[] newArray(int i) {
            return new Pdf417ScanResult[i];
        }

        /* renamed from: aw */
        public final Pdf417ScanResult createFromParcel(Parcel parcel) {
            return new Pdf417ScanResult(parcel);
        }
    };

    public String getTitle() {
        return "PDF417 Scan result";
    }

    @Keep
    public Pdf417ScanResult(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    protected Pdf417ScanResult(Parcel parcel) {
        super(parcel);
    }

    @Nullable
    public String getStringData() {
        return bdM().getString("BarcodeData");
    }

    @Nullable
    public BarcodeDetailedData bdQ() {
        return (BarcodeDetailedData) bdM().getParcelable("RawBarcodeData");
    }

    public String toString() {
        return getStringData();
    }
}

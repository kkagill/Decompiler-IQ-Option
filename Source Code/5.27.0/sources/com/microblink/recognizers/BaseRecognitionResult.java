package com.microblink.recognizers;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.microblink.secured.ac;

/* compiled from: line */
public abstract class BaseRecognitionResult implements Parcelable {
    private a evu;

    public int describeContents() {
        return 0;
    }

    @Keep
    public BaseRecognitionResult(long j, boolean z, boolean z2) {
        this.evu = new NativeResultHolder(j, z, z2);
    }

    public final a bdM() {
        return this.evu;
    }

    public String getTitle() {
        a aVar = this.evu;
        if (aVar != null) {
            String string = aVar.getString("PaymentDataType");
            if (string != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(" result");
                return stringBuilder.toString();
            }
        }
        return "Base recognition result";
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Title: ");
        stringBuilder.append(getTitle());
        String str = ",\n";
        stringBuilder.append(str);
        stringBuilder.append("Valid: ");
        stringBuilder.append(this.evu.isValid());
        stringBuilder.append(str);
        stringBuilder.append("Empty: ");
        stringBuilder.append(this.evu.isEmpty());
        stringBuilder.append(str);
        for (String str2 : this.evu.keySet()) {
            Object object = this.evu.getObject(str2);
            if (object != null) {
                stringBuilder.append(str2);
                stringBuilder.append(": ");
                stringBuilder.append(object.toString());
                stringBuilder.append(str);
            }
        }
        return stringBuilder.toString();
    }

    public boolean isValid() {
        return this.evu.isValid();
    }

    public boolean isEmpty() {
        return this.evu.isEmpty();
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.evu.as(parcel);
    }

    protected BaseRecognitionResult(Parcel parcel) {
        this.evu = new ac(parcel);
    }
}

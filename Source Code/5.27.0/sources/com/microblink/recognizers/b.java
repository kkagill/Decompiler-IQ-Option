package com.microblink.recognizers;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.microblink.view.recognition.RecognitionType;

/* compiled from: line */
public class b implements Parcelable {
    public static final Creator<b> CREATOR = new Creator<b>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new b[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }
    };
    private RecognitionType evA;
    private BaseRecognitionResult[] evz;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.evA.ordinal());
        parcel.writeParcelableArray(this.evz, 0);
    }

    public b(BaseRecognitionResult[] baseRecognitionResultArr, RecognitionType recognitionType) {
        this.evz = baseRecognitionResultArr;
        this.evA = recognitionType;
    }

    @Nullable
    public BaseRecognitionResult[] bdO() {
        return this.evz;
    }

    protected b(Parcel parcel) {
        this.evA = RecognitionType.values()[parcel.readInt()];
        Parcelable[] readParcelableArray = parcel.readParcelableArray(getClass().getClassLoader());
        if (readParcelableArray != null) {
            this.evz = new BaseRecognitionResult[readParcelableArray.length];
            for (int i = 0; i < readParcelableArray.length; i++) {
                this.evz[i] = (BaseRecognitionResult) readParcelableArray[i];
            }
        }
    }
}

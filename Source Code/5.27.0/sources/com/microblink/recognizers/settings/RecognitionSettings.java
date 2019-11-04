package com.microblink.recognizers.settings;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: line */
public class RecognitionSettings implements Parcelable {
    public static final Creator<RecognitionSettings> CREATOR = new Creator<RecognitionSettings>() {
        /* renamed from: aD */
        public final RecognitionSettings createFromParcel(Parcel parcel) {
            return new RecognitionSettings(parcel, (byte) 0);
        }

        /* renamed from: iq */
        public final RecognitionSettings[] newArray(int i) {
            return new RecognitionSettings[i];
        }
    };
    private int evB;
    private boolean evC;
    private int evD;
    private FrameQualityEstimationMode evE;
    private RecognizerSettings[] evF;

    /* compiled from: line */
    public enum FrameQualityEstimationMode {
        AUTOMATIC,
        ALWAYS_ON,
        ALWAYS_OFF
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ RecognitionSettings(Parcel parcel, byte b) {
        this(parcel);
    }

    public RecognitionSettings() {
        this.evB = 0;
        this.evC = true;
        this.evD = 10000;
        this.evE = FrameQualityEstimationMode.AUTOMATIC;
        this.evF = null;
    }

    public boolean bdR() {
        return this.evC;
    }

    public void fJ(boolean z) {
        this.evC = z;
    }

    public void a(RecognizerSettings[] recognizerSettingsArr) {
        this.evF = recognizerSettingsArr;
    }

    public RecognizerSettings[] bdS() {
        return this.evF;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.evB);
        parcel.writeByte(this.evC);
        parcel.writeInt(this.evD);
        parcel.writeInt(this.evE.ordinal());
        parcel.writeParcelableArray(this.evF, 0);
    }

    private RecognitionSettings(Parcel parcel) {
        int i = 0;
        this.evB = 0;
        boolean z = true;
        this.evC = true;
        this.evD = 10000;
        this.evE = FrameQualityEstimationMode.AUTOMATIC;
        this.evF = null;
        this.evB = parcel.readInt();
        if (parcel.readByte() != (byte) 1) {
            z = false;
        }
        this.evC = z;
        this.evD = parcel.readInt();
        this.evE = FrameQualityEstimationMode.values()[parcel.readInt()];
        Parcelable[] readParcelableArray = parcel.readParcelableArray(getClass().getClassLoader());
        if (readParcelableArray != null && readParcelableArray.length > 0) {
            this.evF = new RecognizerSettings[readParcelableArray.length];
            while (i < readParcelableArray.length) {
                this.evF[i] = (RecognizerSettings) readParcelableArray[i];
                i++;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof RecognitionSettings)) {
            RecognitionSettings recognitionSettings = (RecognitionSettings) obj;
            if (this == recognitionSettings && this.evF == recognitionSettings.evF) {
                return true;
            }
        }
        return false;
    }
}

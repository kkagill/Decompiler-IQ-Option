package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableFloat extends BaseObservableField implements Parcelable, Serializable {
    public static final Creator<ObservableFloat> CREATOR = new Creator<ObservableFloat>() {
        public ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        public ObservableFloat[] newArray(int i) {
            return new ObservableFloat[i];
        }
    };
    static final long serialVersionUID = 1;
    private float mValue;

    public int describeContents() {
        return 0;
    }

    public ObservableFloat(float f) {
        this.mValue = f;
    }

    public ObservableFloat(Observable... observableArr) {
        super(observableArr);
    }

    public float get() {
        return this.mValue;
    }

    public void set(float f) {
        if (f != this.mValue) {
            this.mValue = f;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.mValue);
    }
}

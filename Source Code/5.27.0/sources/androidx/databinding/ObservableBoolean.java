package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableBoolean extends BaseObservableField implements Parcelable, Serializable {
    public static final Creator<ObservableBoolean> CREATOR = new Creator<ObservableBoolean>() {
        public ObservableBoolean createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new ObservableBoolean(z);
        }

        public ObservableBoolean[] newArray(int i) {
            return new ObservableBoolean[i];
        }
    };
    static final long serialVersionUID = 1;
    private boolean mValue;

    public int describeContents() {
        return 0;
    }

    public ObservableBoolean(boolean z) {
        this.mValue = z;
    }

    public ObservableBoolean(Observable... observableArr) {
        super(observableArr);
    }

    public boolean get() {
        return this.mValue;
    }

    public void set(boolean z) {
        if (z != this.mValue) {
            this.mValue = z;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}

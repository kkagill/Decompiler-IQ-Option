package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class AbsSavedState implements Parcelable {
    public static final Creator<AbsSavedState> CREATOR = new ClassLoaderCreator<AbsSavedState>() {
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.EMPTY_STATE;
            }
            throw new IllegalStateException("superState must be null");
        }

        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    };
    public static final AbsSavedState EMPTY_STATE = new AbsSavedState() {
    };
    private final Parcelable mSuperState;

    public int describeContents() {
        return 0;
    }

    private AbsSavedState() {
        this.mSuperState = null;
    }

    protected AbsSavedState(@NonNull Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == EMPTY_STATE) {
                parcelable = null;
            }
            this.mSuperState = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(@NonNull Parcel parcel) {
        this(parcel, null);
    }

    protected AbsSavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = EMPTY_STATE;
        }
        this.mSuperState = readParcelable;
    }

    @Nullable
    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }
}

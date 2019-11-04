package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new Creator<ParcelableVolumeInfo>() {
        /* renamed from: j */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: p */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    };
    public int bc;
    public int bd;
    public int be;
    public int bf;
    public int bg;

    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.bc = parcel.readInt();
        this.be = parcel.readInt();
        this.bf = parcel.readInt();
        this.bg = parcel.readInt();
        this.bd = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.bc);
        parcel.writeInt(this.be);
        parcel.writeInt(this.bf);
        parcel.writeInt(this.bg);
        parcel.writeInt(this.bd);
    }
}

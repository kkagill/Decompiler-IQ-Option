package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY})
class VersionedParcelParcel extends VersionedParcel {
    private static final boolean DEBUG = false;
    private static final String TAG = "VersionedParcelParcel";
    private int mCurrentField;
    private final int mEnd;
    private int mNextRead;
    private final int mOffset;
    private final Parcel mParcel;
    private final SparseIntArray mPositionLookup;
    private final String mPrefix;

    VersionedParcelParcel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    VersionedParcelParcel(Parcel parcel, int i, int i2, String str) {
        this.mPositionLookup = new SparseIntArray();
        this.mCurrentField = -1;
        this.mNextRead = 0;
        this.mParcel = parcel;
        this.mOffset = i;
        this.mEnd = i2;
        this.mNextRead = this.mOffset;
        this.mPrefix = str;
    }

    private int readUntilField(int i) {
        int readInt;
        do {
            int i2 = this.mNextRead;
            if (i2 >= this.mEnd) {
                return -1;
            }
            this.mParcel.setDataPosition(i2);
            i2 = this.mParcel.readInt();
            readInt = this.mParcel.readInt();
            this.mNextRead += i2;
        } while (readInt != i);
        return this.mParcel.dataPosition();
    }

    public boolean readField(int i) {
        i = readUntilField(i);
        if (i == -1) {
            return false;
        }
        this.mParcel.setDataPosition(i);
        return true;
    }

    public void setOutputField(int i) {
        closeField();
        this.mCurrentField = i;
        this.mPositionLookup.put(i, this.mParcel.dataPosition());
        writeInt(0);
        writeInt(i);
    }

    public void closeField() {
        int i = this.mCurrentField;
        if (i >= 0) {
            i = this.mPositionLookup.get(i);
            int dataPosition = this.mParcel.dataPosition();
            int i2 = dataPosition - i;
            this.mParcel.setDataPosition(i);
            this.mParcel.writeInt(i2);
            this.mParcel.setDataPosition(dataPosition);
        }
    }

    /* Access modifiers changed, original: protected */
    public VersionedParcel createSubParcel() {
        Parcel parcel = this.mParcel;
        int dataPosition = parcel.dataPosition();
        int i = this.mNextRead;
        if (i == this.mOffset) {
            i = this.mEnd;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.mPrefix);
        stringBuilder.append("  ");
        return new VersionedParcelParcel(parcel, dataPosition, i, stringBuilder.toString());
    }

    public void writeByteArray(byte[] bArr) {
        if (bArr != null) {
            this.mParcel.writeInt(bArr.length);
            this.mParcel.writeByteArray(bArr);
            return;
        }
        this.mParcel.writeInt(-1);
    }

    public void writeByteArray(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.mParcel.writeInt(bArr.length);
            this.mParcel.writeByteArray(bArr, i, i2);
            return;
        }
        this.mParcel.writeInt(-1);
    }

    public void writeInt(int i) {
        this.mParcel.writeInt(i);
    }

    public void writeLong(long j) {
        this.mParcel.writeLong(j);
    }

    public void writeFloat(float f) {
        this.mParcel.writeFloat(f);
    }

    public void writeDouble(double d) {
        this.mParcel.writeDouble(d);
    }

    public void writeString(String str) {
        this.mParcel.writeString(str);
    }

    public void writeStrongBinder(IBinder iBinder) {
        this.mParcel.writeStrongBinder(iBinder);
    }

    public void writeParcelable(Parcelable parcelable) {
        this.mParcel.writeParcelable(parcelable, 0);
    }

    public void writeBoolean(boolean z) {
        this.mParcel.writeInt(z);
    }

    public void writeStrongInterface(IInterface iInterface) {
        this.mParcel.writeStrongInterface(iInterface);
    }

    public void writeBundle(Bundle bundle) {
        this.mParcel.writeBundle(bundle);
    }

    public int readInt() {
        return this.mParcel.readInt();
    }

    public long readLong() {
        return this.mParcel.readLong();
    }

    public float readFloat() {
        return this.mParcel.readFloat();
    }

    public double readDouble() {
        return this.mParcel.readDouble();
    }

    public String readString() {
        return this.mParcel.readString();
    }

    public IBinder readStrongBinder() {
        return this.mParcel.readStrongBinder();
    }

    public byte[] readByteArray() {
        int readInt = this.mParcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.mParcel.readByteArray(bArr);
        return bArr;
    }

    public <T extends Parcelable> T readParcelable() {
        return this.mParcel.readParcelable(getClass().getClassLoader());
    }

    public Bundle readBundle() {
        return this.mParcel.readBundle(getClass().getClassLoader());
    }

    public boolean readBoolean() {
        return this.mParcel.readInt() != 0;
    }
}

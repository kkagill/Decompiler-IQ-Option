package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new Creator<PlaybackStateCompat>() {
        /* renamed from: k */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: q */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };
    final long bh;
    final long bi;
    final float bj;
    final long bk;
    final int bl;
    final CharSequence bm;
    final long bn;
    List<CustomAction> bp;
    final long bq;
    private Object br;
    final Bundle mExtras;
    final int mState;

    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new Creator<CustomAction>() {
            /* renamed from: l */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: r */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };
        private final String J;
        private Object bs;
        private final Bundle mExtras;
        private final int mIcon;
        private final CharSequence mName;

        public int describeContents() {
            return 0;
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.J = str;
            this.mName = charSequence;
            this.mIcon = i;
            this.mExtras = bundle;
        }

        CustomAction(Parcel parcel) {
            this.J = parcel.readString();
            this.mName = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.mIcon = parcel.readInt();
            this.mExtras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.J);
            TextUtils.writeToParcel(this.mName, parcel, i);
            parcel.writeInt(this.mIcon);
            parcel.writeBundle(this.mExtras);
        }

        public static CustomAction B(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(CustomAction.L(obj), CustomAction.M(obj), CustomAction.N(obj), CustomAction.e(obj));
            customAction.bs = obj;
            return customAction;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Action:mName='");
            stringBuilder.append(this.mName);
            stringBuilder.append(", mIcon=");
            stringBuilder.append(this.mIcon);
            stringBuilder.append(", mExtras=");
            stringBuilder.append(this.mExtras);
            return stringBuilder.toString();
        }
    }

    public static int a(long j) {
        return j == 4 ? 126 : j == 2 ? 127 : j == 32 ? 87 : j == 16 ? 88 : j == 1 ? 86 : j == 64 ? 90 : j == 8 ? 89 : j == 512 ? 85 : 0;
    }

    public int describeContents() {
        return 0;
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.mState = i;
        this.bh = j;
        this.bi = j2;
        this.bj = f;
        this.bk = j3;
        this.bl = i2;
        this.bm = charSequence;
        this.bn = j4;
        this.bp = new ArrayList(list);
        this.bq = j5;
        this.mExtras = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.mState = parcel.readInt();
        this.bh = parcel.readLong();
        this.bj = parcel.readFloat();
        this.bn = parcel.readLong();
        this.bi = parcel.readLong();
        this.bk = parcel.readLong();
        this.bm = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.bp = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.bq = parcel.readLong();
        this.mExtras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.bl = parcel.readInt();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
        stringBuilder.append("state=");
        stringBuilder.append(this.mState);
        stringBuilder.append(", position=");
        stringBuilder.append(this.bh);
        stringBuilder.append(", buffered position=");
        stringBuilder.append(this.bi);
        stringBuilder.append(", speed=");
        stringBuilder.append(this.bj);
        stringBuilder.append(", updated=");
        stringBuilder.append(this.bn);
        stringBuilder.append(", actions=");
        stringBuilder.append(this.bk);
        stringBuilder.append(", error code=");
        stringBuilder.append(this.bl);
        stringBuilder.append(", error message=");
        stringBuilder.append(this.bm);
        stringBuilder.append(", custom actions=");
        stringBuilder.append(this.bp);
        stringBuilder.append(", active item id=");
        stringBuilder.append(this.bq);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mState);
        parcel.writeLong(this.bh);
        parcel.writeFloat(this.bj);
        parcel.writeLong(this.bn);
        parcel.writeLong(this.bi);
        parcel.writeLong(this.bk);
        TextUtils.writeToParcel(this.bm, parcel, i);
        parcel.writeTypedList(this.bp);
        parcel.writeLong(this.bq);
        parcel.writeBundle(this.mExtras);
        parcel.writeInt(this.bl);
    }

    public static PlaybackStateCompat A(Object obj) {
        Object obj2 = obj;
        PlaybackStateCompat playbackStateCompat = null;
        if (obj2 == null || VERSION.SDK_INT < 21) {
            return null;
        }
        List list;
        List<Object> J = PlaybackStateCompatApi21.J(obj);
        if (J != null) {
            ArrayList arrayList = new ArrayList(J.size());
            for (Object B : J) {
                arrayList.add(CustomAction.B(B));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            playbackStateCompat = PlaybackStateCompatApi22.e(obj);
        }
        PlaybackStateCompat playbackStateCompat2 = new PlaybackStateCompat(PlaybackStateCompatApi21.C(obj), PlaybackStateCompatApi21.D(obj), PlaybackStateCompatApi21.E(obj), PlaybackStateCompatApi21.F(obj), PlaybackStateCompatApi21.G(obj), 0, PlaybackStateCompatApi21.H(obj), PlaybackStateCompatApi21.I(obj), list, PlaybackStateCompatApi21.K(obj), playbackStateCompat);
        playbackStateCompat2.br = obj2;
        return playbackStateCompat2;
    }
}

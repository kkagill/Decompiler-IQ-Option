package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.util.ArrayList;
import java.util.List;

public class MediaSessionCompat {
    private final MediaControllerCompat aV;

    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new Creator<QueueItem>() {
            /* renamed from: g */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: m */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };
        private final long aW;
        private Object aX;
        private final MediaDescriptionCompat aj;

        public int describeContents() {
            return 0;
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.aj = mediaDescriptionCompat;
                this.aW = j;
                this.aX = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        QueueItem(Parcel parcel) {
            this.aj = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.aW = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.aj.writeToParcel(parcel, i);
            parcel.writeLong(this.aW);
        }

        public static QueueItem w(Object obj) {
            return (obj == null || VERSION.SDK_INT < 21) ? null : new QueueItem(obj, MediaDescriptionCompat.i(QueueItem.h(obj)), QueueItem.z(obj));
        }

        public static List<QueueItem> c(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object w : list) {
                arrayList.add(w(w));
            }
            return arrayList;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MediaSession.QueueItem {Description=");
            stringBuilder.append(this.aj);
            stringBuilder.append(", Id=");
            stringBuilder.append(this.aW);
            stringBuilder.append(" }");
            return stringBuilder.toString();
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new Creator<ResultReceiverWrapper>() {
            /* renamed from: h */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: n */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };
        ResultReceiver aY;

        public int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.aY = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.aY.writeToParcel(parcel, i);
        }
    }

    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new Creator<Token>() {
            /* renamed from: i */
            public Token createFromParcel(Parcel parcel) {
                Object readParcelable;
                if (VERSION.SDK_INT >= 21) {
                    readParcelable = parcel.readParcelable(null);
                } else {
                    readParcelable = parcel.readStrongBinder();
                }
                return new Token(readParcelable);
            }

            /* renamed from: o */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        };
        private final Object aZ;
        private IMediaSession ba;
        private Bundle bb;

        public int describeContents() {
            return 0;
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        Token(Object obj, IMediaSession iMediaSession) {
            this(obj, iMediaSession, null);
        }

        Token(Object obj, IMediaSession iMediaSession, Bundle bundle) {
            this.aZ = obj;
            this.ba = iMediaSession;
            this.bb = bundle;
        }

        public static Token x(Object obj) {
            return a(obj, null);
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public static Token a(Object obj, IMediaSession iMediaSession) {
            return (obj == null || VERSION.SDK_INT < 21) ? null : new Token(MediaSessionCompatApi21.y(obj), iMediaSession);
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.aZ, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.aZ);
            }
        }

        public int hashCode() {
            Object obj = this.aZ;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.aZ;
            if (obj2 == null) {
                if (token.aZ != null) {
                    z = false;
                }
                return z;
            }
            obj = token.aZ;
            if (obj == null) {
                return false;
            }
            return obj2.equals(obj);
        }

        public Object L() {
            return this.aZ;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public IMediaSession M() {
            return this.ba;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public void a(IMediaSession iMediaSession) {
            this.ba = iMediaSession;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public void e(Bundle bundle) {
            this.bb = bundle;
        }
    }

    public MediaControllerCompat K() {
        return this.aV;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static void d(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}

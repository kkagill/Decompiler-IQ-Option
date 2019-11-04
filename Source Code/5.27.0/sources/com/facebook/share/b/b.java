package com.facebook.share.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ShareHashtag */
public class b implements e {
    public static final Creator<b> CREATOR = new Creator<b>() {
        /* renamed from: F */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: am */
        public b[] newArray(int i) {
            return new b[i];
        }
    };
    private final String Dv;

    /* compiled from: ShareHashtag */
    public static class a {
        private String Dv;

        public a bG(String str) {
            this.Dv = str;
            return this;
        }

        public a a(b bVar) {
            return bVar == null ? this : bG(bVar.mn());
        }

        /* Access modifiers changed, original: 0000 */
        public a G(Parcel parcel) {
            return a((b) parcel.readParcelable(b.class.getClassLoader()));
        }

        public b mo() {
            return new b(this, null);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ b(a aVar, AnonymousClass1 anonymousClass1) {
        this(aVar);
    }

    private b(a aVar) {
        this.Dv = aVar.Dv;
    }

    b(Parcel parcel) {
        this.Dv = parcel.readString();
    }

    public String mn() {
        return this.Dv;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Dv);
    }
}

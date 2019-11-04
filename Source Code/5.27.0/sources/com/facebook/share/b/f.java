package com.facebook.share.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;

/* compiled from: ShareOpenGraphAction */
public final class f extends i<f, a> {
    public static final Creator<f> CREATOR = new Creator<f>() {
        /* renamed from: I */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: ao */
        public f[] newArray(int i) {
            return new f[i];
        }
    };

    /* compiled from: ShareOpenGraphAction */
    public static final class a extends com.facebook.share.b.i.a<f, a> {
        public a bH(String str) {
            L("og:type", str);
            return this;
        }

        public f mr() {
            return new f(this, null);
        }

        public a a(f fVar) {
            if (fVar == null) {
                return this;
            }
            return ((a) super.a((i) fVar)).bH(fVar.mq());
        }

        /* Access modifiers changed, original: 0000 */
        public a J(Parcel parcel) {
            return a((f) parcel.readParcelable(f.class.getClassLoader()));
        }
    }

    /* synthetic */ f(a aVar, AnonymousClass1 anonymousClass1) {
        this(aVar);
    }

    private f(a aVar) {
        super((com.facebook.share.b.i.a) aVar);
    }

    f(Parcel parcel) {
        super(parcel);
    }

    @Nullable
    public String mq() {
        return getString("og:type");
    }
}

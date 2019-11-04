package com.iqoption.portfolio;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PortfolioState */
public final class j implements Parcelable {
    public static final Creator<j> CREATOR = new Creator<j>() {
        /* renamed from: aj */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        /* renamed from: gE */
        public j[] newArray(int i) {
            return new j[i];
        }
    };
    private final Bundle dLK;
    private final Bundle dLL;
    private final Bundle dLM;
    private final Long dLN;
    private final Long dLO;

    /* compiled from: PortfolioState */
    public static final class a {
        private Bundle dLK;
        private Bundle dLL;
        private Bundle dLM;
        private Long dLN;
        private Long dLO;

        public a U(Bundle bundle) {
            this.dLK = bundle;
            return this;
        }

        public a V(Bundle bundle) {
            this.dLL = bundle;
            return this;
        }

        public a W(Bundle bundle) {
            this.dLM = bundle;
            return this;
        }

        public a b(Long l, Long l2) {
            this.dLN = l;
            this.dLO = l2;
            return this;
        }

        public j aRf() {
            return new j(this, null);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ j(a aVar, AnonymousClass1 anonymousClass1) {
        this(aVar);
    }

    private j(a aVar) {
        this.dLK = aVar.dLK;
        this.dLL = aVar.dLL;
        this.dLM = aVar.dLM;
        this.dLN = aVar.dLN;
        this.dLO = aVar.dLO;
    }

    public Bundle akF() {
        return this.dLK;
    }

    public Bundle aRb() {
        return this.dLL;
    }

    public Bundle aRc() {
        return this.dLM;
    }

    public Long aRd() {
        return this.dLN;
    }

    public Long aRe() {
        return this.dLO;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.dLK);
        parcel.writeBundle(this.dLL);
        parcel.writeBundle(this.dLM);
        parcel.writeValue(this.dLN);
        parcel.writeValue(this.dLO);
    }

    protected j(Parcel parcel) {
        this.dLK = parcel.readBundle(getClass().getClassLoader());
        this.dLL = parcel.readBundle(getClass().getClassLoader());
        this.dLM = parcel.readBundle(getClass().getClassLoader());
        this.dLN = (Long) parcel.readValue(Long.class.getClassLoader());
        this.dLO = (Long) parcel.readValue(Long.class.getClassLoader());
    }
}

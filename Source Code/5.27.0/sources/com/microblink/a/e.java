package com.microblink.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: line */
public class e {
    private boolean euR = false;
    private boolean euS = false;
    private boolean euT = false;
    private boolean euU = false;
    private boolean euV = false;
    private a euW = new a();

    /* compiled from: line */
    public static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            /* renamed from: aq */
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: ie */
            public final a[] newArray(int i) {
                return new a[i];
            }
        };
        private boolean euX = false;
        private boolean euY = false;
        private boolean euZ = false;
        private a eva = new a();

        /* compiled from: line */
        public static class a implements Parcelable {
            public static final Creator<a> CREATOR = new Creator<a>() {
                /* renamed from: ar */
                public final a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: if */
                public final a[] newArray(int i) {
                    return new a[i];
                }
            };
            private boolean euY = false;
            private boolean evb = false;
            private boolean evc = false;
            private boolean evd = false;

            public int describeContents() {
                return 0;
            }

            public boolean bdH() {
                return this.evc;
            }

            public boolean bdI() {
                return this.evb;
            }

            public boolean bdE() {
                return this.euY;
            }

            public boolean bdJ() {
                return this.evd;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeByte(this.evb);
                parcel.writeByte(this.evc);
                parcel.writeByte(this.euY);
                parcel.writeByte(this.evd);
            }

            protected a(Parcel parcel) {
                boolean z = false;
                this.evb = parcel.readByte() != (byte) 0;
                this.evc = parcel.readByte() != (byte) 0;
                this.euY = parcel.readByte() != (byte) 0;
                if (parcel.readByte() != (byte) 0) {
                    z = true;
                }
                this.evd = z;
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean bdD() {
            return this.euX;
        }

        public boolean bdE() {
            return this.euY;
        }

        public boolean bdF() {
            return this.euZ;
        }

        public a bdG() {
            return this.eva;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.euX);
            parcel.writeByte(this.euY);
            parcel.writeByte(this.euZ);
            parcel.writeParcelable(this.eva, i);
        }

        protected a(Parcel parcel) {
            boolean z = false;
            this.euX = parcel.readByte() != (byte) 0;
            this.euY = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.euZ = z;
            this.eva = (a) parcel.readParcelable(a.class.getClassLoader());
        }
    }

    public boolean bdx() {
        return this.euR;
    }

    public boolean bdy() {
        return this.euU;
    }

    public boolean bdz() {
        return this.euS;
    }

    public boolean bdA() {
        return this.euT;
    }

    public boolean bdB() {
        return this.euV;
    }

    public a bdC() {
        return this.euW;
    }
}

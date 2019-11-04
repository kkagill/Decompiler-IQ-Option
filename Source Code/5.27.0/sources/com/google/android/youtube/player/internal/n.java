package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface n extends IInterface {

    public static abstract class a extends Binder implements n {

        private static class a implements n {
            private IBinder Rr;

            a(IBinder iBinder) {
                this.Rr = iBinder;
            }

            public final m a(l lVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.Rr.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    m g = com.google.android.youtube.player.internal.m.a.g(obtain2.readStrongBinder());
                    return g;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeInt(z ? 1 : 0);
                    this.Rr.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.Rr;
            }

            public final IBinder pB() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    this.Rr.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    return readStrongBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static n h(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof n)) ? new a(iBinder) : (n) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = "com.google.android.youtube.player.internal.IYouTubeService";
            IBinder pB;
            if (i == 1) {
                parcel.enforceInterface(str);
                pB = pB();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(pB);
                return true;
            } else if (i == 2) {
                l lVar;
                parcel.enforceInterface(str);
                pB = parcel.readStrongBinder();
                IBinder iBinder = null;
                if (pB == null) {
                    lVar = null;
                } else {
                    IInterface queryLocalInterface = pB.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                    lVar = (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new a(pB) : (l) queryLocalInterface;
                }
                m a = a(lVar);
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(str);
                a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    m a(l lVar);

    void a(boolean z);

    IBinder pB();
}

package com.appsflyer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

final class y {

    static final class a {
        private final String kZ;
        private final boolean md;

        a(String str, boolean z) {
            this.kZ = str;
            this.md = z;
        }

        public final String dE() {
            return this.kZ;
        }

        /* Access modifiers changed, original: final */
        public final boolean dL() {
            return this.md;
        }
    }

    static final class b implements ServiceConnection {
        private boolean md;
        private final LinkedBlockingQueue<IBinder> mw;

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private b() {
            this.md = false;
            this.mw = new LinkedBlockingQueue(1);
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.mw.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public final IBinder dM() {
            if (this.md) {
                throw new IllegalStateException();
            }
            this.md = true;
            return (IBinder) this.mw.take();
        }
    }

    static final class c implements IInterface {
        private IBinder mx;

        c(IBinder iBinder) {
            this.mx = iBinder;
        }

        public final IBinder asBinder() {
            return this.mx;
        }

        public final String dE() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.mx.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                return readString;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* Access modifiers changed, original: final */
        public final boolean dN() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.mx.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                obtain2.recycle();
                obtain.recycle();
                return z;
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    static a B(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                b bVar = new b();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, bVar, 1)) {
                        c cVar = new c(bVar.dM());
                        a aVar = new a(cVar.dE(), cVar.dN());
                        if (context != null) {
                            context.unbindService(bVar);
                        }
                        return aVar;
                    }
                    if (context != null) {
                        context.unbindService(bVar);
                    }
                    throw new IOException("Google Play connection failed");
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    if (context != null) {
                        context.unbindService(bVar);
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }
}

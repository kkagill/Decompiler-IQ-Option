package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import androidx.annotation.Nullable;
import com.facebook.FacebookException;
import com.facebook.f;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AttributionIdentifiers */
public class a {
    private static final String TAG = "com.facebook.internal.a";
    private static a xA;
    private String xv;
    private String xw;
    private String xx;
    private boolean xy;
    private long xz;

    /* compiled from: AttributionIdentifiers */
    private static final class a implements IInterface {
        private IBinder xB;

        a(IBinder iBinder) {
            this.xB = iBinder;
        }

        public IBinder asBinder() {
            return this.xB;
        }

        public String jH() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.xB.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                return readString;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean jG() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.xB.transact(2, obtain, obtain2, 0);
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

    /* compiled from: AttributionIdentifiers */
    private static final class b implements ServiceConnection {
        private AtomicBoolean xC;
        private final BlockingQueue<IBinder> xD;

        public void onServiceDisconnected(ComponentName componentName) {
        }

        private b() {
            this.xC = new AtomicBoolean(false);
            this.xD = new LinkedBlockingDeque();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.xD.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public IBinder getBinder() {
            if (!this.xC.compareAndSet(true, true)) {
                return (IBinder) this.xD.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }
    }

    private static a Q(Context context) {
        a R = R(context);
        if (R != null) {
            return R;
        }
        R = T(context);
        return R == null ? new a() : R;
    }

    private static a R(Context context) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new FacebookException("getAndroidId cannot be called on the main thread.");
            } else if (!S(context)) {
                return null;
            } else {
                Method a = z.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (a == null) {
                    return null;
                }
                Object a2 = z.a(null, a, context);
                if (a2 == null) {
                    return null;
                }
                a = z.a(a2.getClass(), "getId", new Class[0]);
                Method a3 = z.a(a2.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (a != null) {
                    if (a3 != null) {
                        a aVar = new a();
                        aVar.xw = (String) z.a(a2, a, new Object[0]);
                        aVar.xy = ((Boolean) z.a(a2, a3, new Object[0])).booleanValue();
                        return aVar;
                    }
                }
                return null;
            }
        } catch (Exception e) {
            z.a("android_id", e);
            return null;
        }
    }

    private static boolean S(Context context) {
        Method a = z.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (a == null) {
            return false;
        }
        Object a2 = z.a(null, a, context);
        return (a2 instanceof Integer) && ((Integer) a2).intValue() == 0;
    }

    private static a T(Context context) {
        if (!S(context)) {
            return null;
        }
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        a aVar = true;
        if (context.bindService(intent, bVar, 1)) {
            try {
                a aVar2 = new a(bVar.getBinder());
                aVar = new a();
                aVar.xw = aVar2.jH();
                aVar.xy = aVar2.jG();
                return aVar;
            } catch (Exception e) {
                aVar = "android_id";
                z.a((String) aVar, e);
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A:{Catch:{ Exception -> 0x00cc, all -> 0x00ca }} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d A:{Catch:{ Exception -> 0x00cc, all -> 0x00ca }} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068 A:{Catch:{ Exception -> 0x00cc, all -> 0x00ca }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f2  */
    public static com.facebook.internal.a U(android.content.Context r12) {
        /*
        r0 = "limit_tracking";
        r1 = "androidid";
        r2 = "aid";
        r3 = android.os.Looper.myLooper();
        r4 = android.os.Looper.getMainLooper();
        if (r3 != r4) goto L_0x0017;
    L_0x0010:
        r3 = TAG;
        r4 = "getAttributionIdentifiers should not be called from the main thread";
        android.util.Log.e(r3, r4);
    L_0x0017:
        r3 = xA;
        if (r3 == 0) goto L_0x002c;
    L_0x001b:
        r3 = java.lang.System.currentTimeMillis();
        r5 = xA;
        r6 = r5.xz;
        r3 = r3 - r6;
        r6 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
        if (r8 >= 0) goto L_0x002c;
    L_0x002b:
        return r5;
    L_0x002c:
        r3 = Q(r12);
        r4 = 0;
        r7 = new java.lang.String[]{r2, r1, r0};	 Catch:{ Exception -> 0x00cc, all -> 0x00ca }
        r5 = r12.getPackageManager();	 Catch:{ Exception -> 0x00cc, all -> 0x00ca }
        r6 = "com.facebook.katana.provider.AttributionIdProvider";
        r8 = 0;
        r5 = r5.resolveContentProvider(r6, r8);	 Catch:{ Exception -> 0x00cc, all -> 0x00ca }
        if (r5 == 0) goto L_0x004a;
    L_0x0042:
        r5 = "content://com.facebook.katana.provider.AttributionIdProvider";
        r5 = android.net.Uri.parse(r5);	 Catch:{ Exception -> 0x00cc, all -> 0x00ca }
    L_0x0048:
        r6 = r5;
        goto L_0x005e;
    L_0x004a:
        r5 = r12.getPackageManager();	 Catch:{ Exception -> 0x00cc, all -> 0x00ca }
        r6 = "com.facebook.wakizashi.provider.AttributionIdProvider";
        r5 = r5.resolveContentProvider(r6, r8);	 Catch:{ Exception -> 0x00cc, all -> 0x00ca }
        if (r5 == 0) goto L_0x005d;
    L_0x0056:
        r5 = "content://com.facebook.wakizashi.provider.AttributionIdProvider";
        r5 = android.net.Uri.parse(r5);	 Catch:{ Exception -> 0x00cc, all -> 0x00ca }
        goto L_0x0048;
    L_0x005d:
        r6 = r4;
    L_0x005e:
        r5 = V(r12);	 Catch:{ Exception -> 0x00cc, all -> 0x00ca }
        if (r5 == 0) goto L_0x0066;
    L_0x0064:
        r3.xx = r5;	 Catch:{ Exception -> 0x00cc, all -> 0x00ca }
    L_0x0066:
        if (r6 != 0) goto L_0x006d;
    L_0x0068:
        r12 = a(r3);	 Catch:{ Exception -> 0x00cc, all -> 0x00ca }
        return r12;
    L_0x006d:
        r5 = r12.getContentResolver();	 Catch:{ Exception -> 0x00cc, all -> 0x00ca }
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r12 = r5.query(r6, r7, r8, r9, r10);	 Catch:{ Exception -> 0x00cc, all -> 0x00ca }
        if (r12 == 0) goto L_0x00b7;
    L_0x007a:
        r5 = r12.moveToFirst();	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        if (r5 != 0) goto L_0x0081;
    L_0x0080:
        goto L_0x00b7;
    L_0x0081:
        r2 = r12.getColumnIndex(r2);	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        r1 = r12.getColumnIndex(r1);	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        r0 = r12.getColumnIndex(r0);	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        r2 = r12.getString(r2);	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        r3.xv = r2;	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        if (r1 <= 0) goto L_0x00ad;
    L_0x0095:
        if (r0 <= 0) goto L_0x00ad;
    L_0x0097:
        r2 = r3.jE();	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        if (r2 != 0) goto L_0x00ad;
    L_0x009d:
        r1 = r12.getString(r1);	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        r3.xw = r1;	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        r0 = r12.getString(r0);	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        r0 = java.lang.Boolean.parseBoolean(r0);	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        r3.xy = r0;	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
    L_0x00ad:
        if (r12 == 0) goto L_0x00b2;
    L_0x00af:
        r12.close();
    L_0x00b2:
        r12 = a(r3);
        return r12;
    L_0x00b7:
        r0 = a(r3);	 Catch:{ Exception -> 0x00c5, all -> 0x00c1 }
        if (r12 == 0) goto L_0x00c0;
    L_0x00bd:
        r12.close();
    L_0x00c0:
        return r0;
    L_0x00c1:
        r0 = move-exception;
        r4 = r12;
        r12 = r0;
        goto L_0x00f0;
    L_0x00c5:
        r0 = move-exception;
        r11 = r0;
        r0 = r12;
        r12 = r11;
        goto L_0x00ce;
    L_0x00ca:
        r12 = move-exception;
        goto L_0x00f0;
    L_0x00cc:
        r12 = move-exception;
        r0 = r4;
    L_0x00ce:
        r1 = TAG;	 Catch:{ all -> 0x00ee }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ee }
        r2.<init>();	 Catch:{ all -> 0x00ee }
        r3 = "Caught unexpected exception in getAttributionId(): ";
        r2.append(r3);	 Catch:{ all -> 0x00ee }
        r12 = r12.toString();	 Catch:{ all -> 0x00ee }
        r2.append(r12);	 Catch:{ all -> 0x00ee }
        r12 = r2.toString();	 Catch:{ all -> 0x00ee }
        com.facebook.internal.z.G(r1, r12);	 Catch:{ all -> 0x00ee }
        if (r0 == 0) goto L_0x00ed;
    L_0x00ea:
        r0.close();
    L_0x00ed:
        return r4;
    L_0x00ee:
        r12 = move-exception;
        r4 = r0;
    L_0x00f0:
        if (r4 == 0) goto L_0x00f5;
    L_0x00f2:
        r4.close();
    L_0x00f5:
        goto L_0x00f7;
    L_0x00f6:
        throw r12;
    L_0x00f7:
        goto L_0x00f6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.a.U(android.content.Context):com.facebook.internal.a");
    }

    private static a a(a aVar) {
        aVar.xz = System.currentTimeMillis();
        xA = aVar;
        return aVar;
    }

    public String jD() {
        return this.xv;
    }

    public String jE() {
        return (f.isInitialized() && f.hb()) ? this.xw : null;
    }

    public String jF() {
        return this.xx;
    }

    public boolean jG() {
        return this.xy;
    }

    @Nullable
    private static String V(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager != null ? packageManager.getInstallerPackageName(context.getPackageName()) : null;
    }
}

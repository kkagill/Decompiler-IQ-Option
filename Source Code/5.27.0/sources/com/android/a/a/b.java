package com.android.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: InstallReferrerClientImpl */
class b extends a {
    private final Context kA;
    private com.google.android.a.a.a kB;
    private ServiceConnection kC;
    private int kz = 0;

    /* compiled from: InstallReferrerClientImpl */
    private final class a implements ServiceConnection {
        private final c kD;

        private a(c cVar) {
            if (cVar != null) {
                this.kD = cVar;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.android.a.b.a.h("InstallReferrerClient", "Install Referrer service connected.");
            b.this.kB = com.google.android.a.a.a.a.d(iBinder);
            b.this.kz = 2;
            this.kD.y(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            com.android.a.b.a.j("InstallReferrerClient", "Install Referrer service disconnected.");
            b.this.kB = null;
            b.this.kz = 0;
            this.kD.cY();
        }
    }

    public b(@NonNull Context context) {
        this.kA = context.getApplicationContext();
    }

    public boolean isReady() {
        return (this.kz != 2 || this.kB == null || this.kC == null) ? false : true;
    }

    public void a(@NonNull c cVar) {
        String str = "InstallReferrerClient";
        if (isReady()) {
            com.android.a.b.a.h(str, "Service connection is valid. No need to re-initialize.");
            cVar.y(0);
            return;
        }
        int i = this.kz;
        if (i == 1) {
            com.android.a.b.a.j(str, "Client is already in the process of connecting to the service.");
            cVar.y(3);
        } else if (i == 3) {
            com.android.a.b.a.j(str, "Client was already closed and can't be reused. Please create another instance.");
            cVar.y(3);
        } else {
            com.android.a.b.a.h(str, "Starting install referrer service setup.");
            this.kC = new a(cVar);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            String str2 = "com.android.vending";
            intent.setComponent(new ComponentName(str2, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List queryIntentServices = this.kA.getPackageManager().queryIntentServices(intent, 0);
            if (!(queryIntentServices == null || queryIntentServices.isEmpty())) {
                ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str3 = resolveInfo.serviceInfo.packageName;
                    String str4 = resolveInfo.serviceInfo.name;
                    if (str2.equals(str3) && str4 != null && cX()) {
                        if (this.kA.bindService(new Intent(intent), this.kC, 1)) {
                            com.android.a.b.a.h(str, "Service was bonded successfully.");
                            return;
                        }
                        com.android.a.b.a.j(str, "Connection to service is blocked.");
                        this.kz = 0;
                        cVar.y(1);
                        return;
                    }
                    com.android.a.b.a.j(str, "Play Store missing or incompatible. Version 8.3.73 or later required.");
                    this.kz = 0;
                    cVar.y(2);
                    return;
                }
            }
            this.kz = 0;
            com.android.a.b.a.h(str, "Install Referrer service unavailable on device.");
            cVar.y(2);
        }
    }

    public void cU() {
        this.kz = 3;
        if (this.kC != null) {
            com.android.a.b.a.h("InstallReferrerClient", "Unbinding from service.");
            this.kA.unbindService(this.kC);
            this.kC = null;
        }
        this.kB = null;
    }

    public d cV() {
        if (isReady()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.kA.getPackageName());
            try {
                return new d(this.kB.t(bundle));
            } catch (RemoteException e) {
                com.android.a.b.a.j("InstallReferrerClient", "RemoteException getting install referrer information");
                this.kz = 0;
                throw e;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    private boolean cX() {
        try {
            if (this.kA.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}

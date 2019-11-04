package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* compiled from: PlatformServiceClient */
public abstract class v implements ServiceConnection {
    private final String applicationId;
    private final Context context;
    private final Handler handler;
    private boolean kd;
    private final int zA;
    private a zB;
    private Messenger zC;
    private int zD;
    private int zE;

    /* compiled from: PlatformServiceClient */
    public interface a {
        void o(Bundle bundle);
    }

    public abstract void m(Bundle bundle);

    public v(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.context = context;
        this.zD = i;
        this.zE = i2;
        this.applicationId = str;
        this.zA = i3;
        this.handler = new Handler() {
            public void handleMessage(Message message) {
                v.this.handleMessage(message);
            }
        };
    }

    public void a(a aVar) {
        this.zB = aVar;
    }

    public boolean start() {
        if (this.kd || u.X(this.zA) == -1) {
            return false;
        }
        Intent Y = u.Y(this.context);
        if (Y == null) {
            return false;
        }
        this.kd = true;
        this.context.bindService(Y, this, 1);
        return true;
    }

    public void cancel() {
        this.kd = false;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zC = new Messenger(iBinder);
        kG();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.zC = null;
        try {
            this.context.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        n(null);
    }

    private void kG() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.applicationId);
        m(bundle);
        Message obtain = Message.obtain(null, this.zD);
        obtain.arg1 = this.zA;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.handler);
        try {
            this.zC.send(obtain);
        } catch (RemoteException unused) {
            n(null);
        }
    }

    /* Access modifiers changed, original: protected */
    public void handleMessage(Message message) {
        if (message.what == this.zE) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                n(null);
            } else {
                n(data);
            }
            try {
                this.context.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private void n(Bundle bundle) {
        if (this.kd) {
            this.kd = false;
            a aVar = this.zB;
            if (aVar != null) {
                aVar.o(bundle);
            }
        }
    }
}

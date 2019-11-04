package com.google.android.youtube.player.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.youtube.player.YouTubeInitializationResult;
import java.util.ArrayList;

public abstract class s<T extends IInterface> implements u {
    private T Rt;
    private final ArrayList<com.google.android.youtube.player.internal.u.a> Ru = new ArrayList();
    private ArrayList<com.google.android.youtube.player.internal.u.b> Rv;
    private ServiceConnection Rw;
    final Handler a;
    private final Context b;
    private ArrayList<com.google.android.youtube.player.internal.u.a> d;
    private boolean f = false;
    private boolean h = false;
    private final ArrayList<b<?>> i = new ArrayList();
    private boolean k = false;

    /* renamed from: com.google.android.youtube.player.internal.s$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[YouTubeInitializationResult.values().length];

        static {
            try {
                a[YouTubeInitializationResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    final class a extends Handler {
        a() {
        }

        public final void handleMessage(Message message) {
            if (message.what == 3) {
                s.this.a((YouTubeInitializationResult) message.obj);
            } else if (message.what == 4) {
                synchronized (s.this.d) {
                    if (s.this.k && s.this.f() && s.this.d.contains(message.obj)) {
                        ((com.google.android.youtube.player.internal.u.a) message.obj).a();
                    }
                }
            } else if (message.what == 2 && !s.this.f()) {
            } else {
                if (message.what == 2 || message.what == 1) {
                    ((b) message.obj).a();
                }
            }
        }
    }

    protected abstract class b<TListener> {
        private TListener b;

        public b(TListener tListener) {
            this.b = tListener;
            synchronized (s.this.i) {
                s.this.i.add(this);
            }
        }

        public final void a() {
            Object obj;
            synchronized (this) {
                obj = this.b;
            }
            a(obj);
        }

        public abstract void a(TListener tListener);

        public final void b() {
            synchronized (this) {
                this.b = null;
            }
        }
    }

    final class e implements ServiceConnection {
        e() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            s.this.j(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            s.this.Rt = null;
            s.this.h();
        }
    }

    protected final class c extends b<Boolean> {
        public final YouTubeInitializationResult Ry;
        public final IBinder Rz;

        public c(String str, IBinder iBinder) {
            super(Boolean.valueOf(true));
            this.Ry = s.bM(str);
            this.Rz = iBinder;
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ void a(Object obj) {
            if (((Boolean) obj) != null) {
                if (AnonymousClass1.a[this.Ry.ordinal()] != 1) {
                    s.this.a(this.Ry);
                } else {
                    try {
                        if (s.this.b().equals(this.Rz.getInterfaceDescriptor())) {
                            s.this.Rt = s.this.i(this.Rz);
                            if (s.this.Rt != null) {
                                s.this.g();
                                return;
                            }
                        }
                    } catch (RemoteException unused) {
                    }
                    s.this.a();
                    s.this.a(YouTubeInitializationResult.INTERNAL_ERROR);
                }
            }
        }
    }

    protected final class d extends com.google.android.youtube.player.internal.e.a {
        protected d() {
        }

        public final void a(String str, IBinder iBinder) {
            s.this.a.sendMessage(s.this.a.obtainMessage(1, new c(str, iBinder)));
        }
    }

    protected s(Context context, com.google.android.youtube.player.internal.u.a aVar, com.google.android.youtube.player.internal.u.b bVar) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.b = (Context) b.ac(context);
            this.d = new ArrayList();
            this.d.add(b.ac(aVar));
            this.Rv = new ArrayList();
            this.Rv.add(b.ac(bVar));
            this.a = new a();
            return;
        }
        throw new IllegalStateException("Clients must be created on the UI thread.");
    }

    private void a() {
        ServiceConnection serviceConnection = this.Rw;
        if (serviceConnection != null) {
            try {
                this.b.unbindService(serviceConnection);
            } catch (IllegalArgumentException e) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e);
            }
        }
        this.Rt = null;
        this.Rw = null;
    }

    private static YouTubeInitializationResult bM(String str) {
        try {
            return YouTubeInitializationResult.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return YouTubeInitializationResult.UNKNOWN_ERROR;
        } catch (NullPointerException unused2) {
            return YouTubeInitializationResult.UNKNOWN_ERROR;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(YouTubeInitializationResult youTubeInitializationResult) {
        this.a.removeMessages(4);
        synchronized (this.Rv) {
            this.h = true;
            ArrayList arrayList = this.Rv;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (this.k) {
                    if (this.Rv.contains(arrayList.get(i))) {
                        ((com.google.android.youtube.player.internal.u.b) arrayList.get(i)).a(youTubeInitializationResult);
                    }
                    i++;
                } else {
                    return;
                }
            }
            this.h = false;
        }
    }

    public abstract void a(k kVar, d dVar);

    public abstract String b();

    public void d() {
        h();
        int i = 0;
        this.k = false;
        synchronized (this.i) {
            int size = this.i.size();
            while (i < size) {
                ((b) this.i.get(i)).b();
                i++;
            }
            this.i.clear();
        }
        a();
    }

    public final void e() {
        this.k = true;
        YouTubeInitializationResult ap = com.google.android.youtube.player.a.ap(this.b);
        if (ap != YouTubeInitializationResult.SUCCESS) {
            Handler handler = this.a;
            handler.sendMessage(handler.obtainMessage(3, ap));
            return;
        }
        Intent intent = new Intent(pI()).setPackage(aa.aq(this.b));
        if (this.Rw != null) {
            Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
            a();
        }
        this.Rw = new e();
        if (!this.b.bindService(intent, this.Rw, 129)) {
            Handler handler2 = this.a;
            handler2.sendMessage(handler2.obtainMessage(3, YouTubeInitializationResult.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    public final boolean f() {
        return this.Rt != null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void g() {
        synchronized (this.d) {
            boolean z = true;
            b.a(!this.f);
            this.a.removeMessages(4);
            this.f = true;
            if (this.Ru.size() != 0) {
                z = false;
            }
            b.a(z);
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.k && f(); i++) {
                if (!this.Ru.contains(arrayList.get(i))) {
                    ((com.google.android.youtube.player.internal.u.a) arrayList.get(i)).a();
                }
            }
            this.Ru.clear();
            this.f = false;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void h() {
        this.a.removeMessages(4);
        synchronized (this.d) {
            this.f = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.k; i++) {
                if (this.d.contains(arrayList.get(i))) {
                    ((com.google.android.youtube.player.internal.u.a) arrayList.get(i)).b();
                }
            }
            this.f = false;
        }
    }

    public abstract T i(IBinder iBinder);

    /* Access modifiers changed, original: protected|final */
    public final void i() {
        if (!f()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void j(IBinder iBinder) {
        try {
            a(com.google.android.youtube.player.internal.k.a.f(iBinder), new d());
        } catch (RemoteException unused) {
            Log.w("YouTubeClient", "service died");
        }
    }

    public abstract String pI();

    /* Access modifiers changed, original: protected|final */
    public final T pJ() {
        i();
        return this.Rt;
    }
}

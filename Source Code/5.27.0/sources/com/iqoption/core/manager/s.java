package com.iqoption.core.manager;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkInfo;
import io.reactivex.BackpressureStrategy;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0003\u001a\u001a\u0010\u0006\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\t\u001a\u00020\u0002*\u00020\u0004H\u0002¨\u0006\n"}, bng = {"createNetworkFlowable", "Lio/reactivex/Flowable;", "", "networkService", "Landroid/net/ConnectivityManager;", "createNetworkFlowableOreo", "emmitNext", "", "Lio/reactivex/FlowableEmitter;", "isConnected", "core_release"})
/* compiled from: NetworkManager.kt */
public final class s {

    @i(bne = {1, 1, 15}, bnf = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, bng = {"com/iqoption/core/manager/NetworkManagerKt$createNetworkFlowable$NetworkReceiver", "Landroid/content/BroadcastReceiver;", "(Landroid/net/ConnectivityManager;)V", "emitter", "Lio/reactivex/FlowableEmitter;", "", "getEmitter", "()Lio/reactivex/FlowableEmitter;", "setEmitter", "(Lio/reactivex/FlowableEmitter;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "core_release"})
    /* compiled from: NetworkManager.kt */
    public static final class d extends BroadcastReceiver {
        private io.reactivex.f<Boolean> bjV;
        final /* synthetic */ ConnectivityManager bjW;

        public d(ConnectivityManager connectivityManager) {
            this.bjW = connectivityManager;
        }

        public final void b(io.reactivex.f<Boolean> fVar) {
            this.bjV = fVar;
        }

        public void onReceive(Context context, Intent intent) {
            io.reactivex.f fVar = this.bjV;
            if (fVar != null) {
                s.a(fVar, this.bjW);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, bng = {"com/iqoption/core/manager/NetworkManagerKt$createNetworkFlowableOreo$NetworkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "(Landroid/net/ConnectivityManager;)V", "emitter", "Lio/reactivex/FlowableEmitter;", "", "getEmitter", "()Lio/reactivex/FlowableEmitter;", "setEmitter", "(Lio/reactivex/FlowableEmitter;)V", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "core_release"})
    /* compiled from: NetworkManager.kt */
    public static final class h extends NetworkCallback {
        private io.reactivex.f<Boolean> bjV;
        final /* synthetic */ ConnectivityManager bjW;

        public h(ConnectivityManager connectivityManager) {
            this.bjW = connectivityManager;
        }

        public final void b(io.reactivex.f<Boolean> fVar) {
            this.bjV = fVar;
        }

        public void onAvailable(Network network) {
            io.reactivex.f fVar = this.bjV;
            if (fVar != null) {
                s.a(fVar, this.bjW);
            }
        }

        public void onLost(Network network) {
            io.reactivex.f fVar = this.bjV;
            if (fVar != null) {
                s.a(fVar, this.bjW);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "emitter", "Lio/reactivex/FlowableEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"})
    /* compiled from: NetworkManager.kt */
    static final class a<T> implements io.reactivex.g<T> {
        final /* synthetic */ d bjU;

        a(d dVar) {
            this.bjU = dVar;
        }

        public final void a(io.reactivex.f<Boolean> fVar) {
            kotlin.jvm.internal.i.f(fVar, "emitter");
            this.bjU.b(fVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: NetworkManager.kt */
    static final class b<T> implements io.reactivex.b.f<org.a.d> {
        final /* synthetic */ d bjU;

        b(d dVar) {
            this.bjU = dVar;
        }

        public final void accept(org.a.d dVar) {
            com.iqoption.core.d.Uo().registerReceiver(this.bjU, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: NetworkManager.kt */
    static final class c implements io.reactivex.b.a {
        final /* synthetic */ d bjU;

        c(d dVar) {
            this.bjU = dVar;
        }

        public final void run() {
            com.iqoption.core.d.Uo().unregisterReceiver(this.bjU);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "emitter", "Lio/reactivex/FlowableEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"})
    /* compiled from: NetworkManager.kt */
    static final class e<T> implements io.reactivex.g<T> {
        final /* synthetic */ h bjX;

        e(h hVar) {
            this.bjX = hVar;
        }

        public final void a(io.reactivex.f<Boolean> fVar) {
            kotlin.jvm.internal.i.f(fVar, "emitter");
            this.bjX.b(fVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: NetworkManager.kt */
    static final class f<T> implements io.reactivex.b.f<org.a.d> {
        final /* synthetic */ ConnectivityManager bjW;
        final /* synthetic */ h bjX;

        f(ConnectivityManager connectivityManager, h hVar) {
            this.bjW = connectivityManager;
            this.bjX = hVar;
        }

        public final void accept(org.a.d dVar) {
            this.bjW.registerDefaultNetworkCallback(this.bjX, com.iqoption.core.rx.i.akh().getHandler());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: NetworkManager.kt */
    static final class g implements io.reactivex.b.a {
        final /* synthetic */ ConnectivityManager bjW;
        final /* synthetic */ h bjX;

        g(ConnectivityManager connectivityManager, h hVar) {
            this.bjW = connectivityManager;
            this.bjX = hVar;
        }

        public final void run() {
            this.bjW.unregisterNetworkCallback(this.bjX);
        }
    }

    private static final boolean a(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    private static final void a(io.reactivex.f<Boolean> fVar, ConnectivityManager connectivityManager) {
        if (!fVar.isCancelled()) {
            fVar.onNext(Boolean.valueOf(a(connectivityManager)));
        }
    }

    @TargetApi(26)
    private static final io.reactivex.e<Boolean> b(ConnectivityManager connectivityManager) {
        h hVar = new h(connectivityManager);
        io.reactivex.e e = io.reactivex.e.a((io.reactivex.g) new e(hVar), BackpressureStrategy.LATEST).d((io.reactivex.b.f) new f(connectivityManager, hVar)).e((io.reactivex.b.a) new g(connectivityManager, hVar));
        kotlin.jvm.internal.i.e(e, "Flowable\n            .cr…k(callback)\n            }");
        return e;
    }

    private static final io.reactivex.e<Boolean> c(ConnectivityManager connectivityManager) {
        d dVar = new d(connectivityManager);
        io.reactivex.e e = io.reactivex.e.a((io.reactivex.g) new a(dVar), BackpressureStrategy.LATEST).d((io.reactivex.b.f) new b(dVar)).e((io.reactivex.b.a) new c(dVar));
        kotlin.jvm.internal.i.e(e, "Flowable\n            .cr…r(receiver)\n            }");
        return e;
    }
}

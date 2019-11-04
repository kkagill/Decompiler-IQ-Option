package com.iqoption.core.manager;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.iqoption.core.rx.d;
import io.reactivex.b.f;
import io.reactivex.e;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\r¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/manager/NetworkManager;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "isConnected", "", "()Z", "isConnectedProcessor", "Lcom/iqoption/core/rx/IQBehaviorProcessor;", "isConnectedStream", "Lio/reactivex/Flowable;", "()Lio/reactivex/Flowable;", "init", "", "core_release"})
/* compiled from: NetworkManager.kt */
public final class r {
    private static final String TAG = r.class.getSimpleName();
    private static final d<Boolean> bjP = d.bER.akd();
    private static final e<Boolean> bjQ = bjP;
    public static final r bjR = new r();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"})
    /* compiled from: NetworkManager.kt */
    static final class a<T> implements f<Boolean> {
        public static final a bjS = new a();

        a() {
        }

        /* renamed from: j */
        public final void accept(Boolean bool) {
            if ((kotlin.jvm.internal.i.y(bool, Boolean.valueOf(r.bjR.isConnected())) ^ 1) != 0) {
                d a = r.bjP;
                kotlin.jvm.internal.i.e(bool, "it");
                a.onNext(bool);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: NetworkManager.kt */
    static final class b<T> implements f<Throwable> {
        public static final b bjT = new b();

        b() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    private r() {
    }

    public final boolean isConnected() {
        Boolean bool = (Boolean) bjP.getValue();
        return bool != null ? bool.booleanValue() : true;
    }

    public final void init() {
        e d;
        ConnectivityManager bd = com.iqoption.core.ext.a.bd(com.iqoption.core.d.Uo());
        NetworkInfo activeNetworkInfo = bd.getActiveNetworkInfo();
        d dVar = bjP;
        Object obj = null;
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        dVar.onNext(Boolean.valueOf(z));
        if (VERSION.SDK_INT >= 26) {
            obj = 1;
        }
        if (obj != null) {
            d = s.b(bd);
        } else {
            d = s.c(bd);
        }
        d.d(com.iqoption.core.rx.i.aki()).i(500, TimeUnit.MILLISECONDS).a((f) a.bjS, (f) b.bjT);
    }
}

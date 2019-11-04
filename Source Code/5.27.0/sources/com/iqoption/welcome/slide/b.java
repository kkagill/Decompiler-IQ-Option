package com.iqoption.welcome.slide;

import android.util.SparseArray;
import androidx.annotation.RawRes;
import com.airbnb.lottie.e;
import com.iqoption.core.d;
import com.iqoption.core.splash.a;
import com.iqoption.welcome.g.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/welcome/slide/WelcomeResources;", "", "()V", "animations", "Landroid/util/SparseArray;", "Lcom/airbnb/lottie/LottieComposition;", "keys", "", "getAnimation", "id", "", "load", "Lio/reactivex/Completable;", "loadAnimations", "", "welcome_release"})
/* compiled from: WelcomeResources.kt */
public final class b {
    private static final int[] emI = new int[]{a.bFU.akv(), f.welcome_market, f.welcome_security, f.welcome_support, f.welcome_solutions, f.welcome_forex, f.welcome_crypto, f.welcome_cfd, f.welcome_trading};
    private static final SparseArray<e> emJ = new SparseArray();
    public static final b emK = new b();

    private b() {
    }

    private final synchronized void bbp() {
        if (emJ.size() == 0) {
            for (int i : emI) {
                emJ.put(i, e.a.a(d.Uo().getResources().openRawResource(i)));
            }
        }
    }

    public final e hS(@RawRes int i) {
        if (emJ.size() == 0) {
            bbp();
        }
        Object obj = emJ.get(i);
        kotlin.jvm.internal.i.e(obj, "animations[id]");
        return (e) obj;
    }
}

package com.iqoption.deposit;

import android.content.Context;
import com.airbnb.lottie.a;
import com.airbnb.lottie.e;
import java.io.FileInputStream;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/deposit/CurrencyAnimation;", "", "path", "", "(Ljava/lang/String;)V", "load", "Lcom/airbnb/lottie/Cancellable;", "context", "Landroid/content/Context;", "loadedListener", "Lkotlin/Function1;", "Lcom/airbnb/lottie/LottieComposition;", "", "deposit_release"})
/* compiled from: CurrencyProgressAnimations.kt */
public final class b {
    private final String path;

    public b(String str) {
        kotlin.jvm.internal.i.f(str, "path");
        this.path = str;
    }

    public final a a(Context context, kotlin.jvm.a.b<? super e, l> bVar) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(bVar, "loadedListener");
        a a;
        if (u.a(this.path, "lottie/completion", false, 2, null)) {
            a = e.a.a(context, this.path, new d(bVar));
            kotlin.jvm.internal.i.e(a, "LottieComposition.Factor…xt, path, loadedListener)");
            return a;
        }
        a = e.a.a(new FileInputStream(this.path), new d(bVar));
        kotlin.jvm.internal.i.e(a, "LottieComposition.Factor…am(path), loadedListener)");
        return a;
    }
}

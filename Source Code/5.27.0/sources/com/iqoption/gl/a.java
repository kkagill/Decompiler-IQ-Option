package com.iqoption.gl;

import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.k;
import java.util.concurrent.Callable;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/gl/ActiveImageLoader;", "", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "disposeSubscriptions", "", "getBitmap", "Lio/reactivex/Maybe;", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "url", "", "performActiveImageLoading", "activeIdStr", "app_optionXRelease"})
/* compiled from: ActiveImageLoader.kt */
public final class a {
    private static io.reactivex.disposables.a cyj = new io.reactivex.disposables.a();
    public static final a drp = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Landroid/graphics/Bitmap;", "call"})
    /* compiled from: ActiveImageLoader.kt */
    static final class a<V> implements Callable<T> {
        final /* synthetic */ Context aOk;
        final /* synthetic */ String bEG;

        a(String str, Context context) {
            this.bEG = str;
            this.aOk = context;
        }

        /* renamed from: aIw */
        public final Bitmap call() {
            return this.bEG != null ? Picasso.with(this.aOk).load(this.bEG).get() : null;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "call"})
    /* compiled from: ActiveImageLoader.kt */
    static final class b<V> implements Callable<T> {
        final /* synthetic */ String drq;

        b(String str) {
            this.drq = str;
        }

        /* renamed from: iH */
        public final String call() {
            com.iqoption.core.microservices.tradingengine.response.active.a dX = com.iqoption.app.helpers.a.Gs().dX(Integer.parseInt(this.drq));
            return dX != null ? dX.getImage() : null;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/Maybe;", "Landroid/graphics/Bitmap;", "url", "", "apply"})
    /* compiled from: ActiveImageLoader.kt */
    static final class c<T, R> implements g<T, k<? extends R>> {
        public static final c drr = new c();

        c() {
        }

        /* renamed from: iB */
        public final io.reactivex.i<Bitmap> apply(String str) {
            kotlin.jvm.internal.i.f(str, "url");
            return a.drp.F(com.iqoption.core.d.Uo(), str);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveImageLoader.kt */
    static final class d<T> implements f<Bitmap> {
        final /* synthetic */ String drq;

        d(String str) {
            this.drq = str;
        }

        /* renamed from: c */
        public final void accept(Bitmap bitmap) {
            c.aIy().setRawImageByActiveId(this.drq, bitmap);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveImageLoader.kt */
    static final class e<T> implements f<Throwable> {
        public static final e drs = new e();

        e() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    private a() {
    }

    public static final void iA(String str) {
        kotlin.jvm.internal.i.f(str, "activeIdStr");
        cyj.e(io.reactivex.i.g(new b(str)).m(c.drr).f(com.iqoption.core.rx.i.aki()).e(com.iqoption.core.rx.i.akl()).a(new d(str), e.drs));
    }

    public static final void aIv() {
        cyj.clear();
    }

    private final io.reactivex.i<Bitmap> F(Context context, String str) {
        io.reactivex.i g = io.reactivex.i.g(new a(str, context));
        kotlin.jvm.internal.i.e(g, "Maybe.fromCallable<Bitma…)\n            }\n        }");
        return g;
    }
}

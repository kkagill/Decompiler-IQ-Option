package com.iqoption.core.splash;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.a.f;
import com.iqoption.core.i.h;
import com.iqoption.core.util.ag;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\fH\u0002J\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!J\u0012\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010$\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020&2\b\u0010$\u001a\u0004\u0018\u00010\u001aH\u0016J\u000e\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u000fJ\u0006\u0010/\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u00061"}, bng = {"Lcom/iqoption/core/splash/SplashFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/core/databinding/FragmentSplashBinding;", "fadingController", "Lcom/iqoption/core/splash/SplashFadingController;", "getFadingController", "()Lcom/iqoption/core/splash/SplashFadingController;", "fadingController$delegate", "Lkotlin/Lazy;", "initialState", "", "Ljava/lang/Boolean;", "pendingProgress", "", "Ljava/lang/Float;", "pendingState", "splashLogHelper", "Lcom/iqoption/core/splash/SplashLogHelper;", "getSplashLogHelper", "()Lcom/iqoption/core/splash/SplashLogHelper;", "splashLogHelper$delegate", "viewModel", "Lcom/iqoption/core/splash/SplashViewModel;", "getSharedState", "Landroid/os/Bundle;", "hide", "", "initRegulation", "isCysec", "log", "msg", "", "logDebug", "onCreate", "savedInstanceState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setProgress", "progress", "show", "Companion", "core_release"})
/* compiled from: SplashFragment.kt */
public final class d extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(d.class), "fadingController", "getFadingController()Lcom/iqoption/core/splash/SplashFadingController;")), k.a(new PropertyReference1Impl(k.G(d.class), "splashLogHelper", "getSplashLogHelper()Lcom/iqoption/core/splash/SplashLogHelper;"))};
    public static final a bGp = new a();
    private HashMap apm;
    private f bGi;
    private e bGj;
    private Boolean bGk;
    private Boolean bGl;
    private Float bGm;
    private final kotlin.d bGn = g.c(new SplashFragment$fadingController$2(this));
    private final kotlin.d bGo = g.c(new SplashFragment$splashLogHelper$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/splash/SplashFragment$Companion;", "", "()V", "EXTRA_SHARED_STATE", "", "STATE_LOGO_GLOBAL_RECT", "STATE_PROGRESS", "STATE_SCREEN_ORIENTATION", "TAG", "prepare", "Lcom/iqoption/core/splash/SplashFragment;", "fm", "Landroidx/fragment/app/FragmentManager;", "containerId", "", "initialState", "", "restoreGlobalRect", "Landroid/graphics/Rect;", "activity", "Landroidx/fragment/app/FragmentActivity;", "sharedState", "Landroid/os/Parcelable;", "restoreProgress", "", "core_release"})
    /* compiled from: SplashFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d a(FragmentManager fragmentManager, int i, boolean z) {
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(d.TAG);
            if (!(findFragmentByTag instanceof d)) {
                findFragmentByTag = null;
            }
            d dVar = (d) findFragmentByTag;
            if (dVar != null) {
                return dVar;
            }
            dVar = new d();
            fragmentManager.beginTransaction().replace(i, dVar, d.TAG).commitAllowingStateLoss();
            dVar.bGk = Boolean.valueOf(z);
            return dVar;
        }

        public final Rect a(FragmentActivity fragmentActivity, Parcelable parcelable) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                String str = "STATE_SCREEN_ORIENTATION";
                if (bundle.containsKey(str)) {
                    int i = bundle.getInt(str);
                    Rect rect = (Rect) bundle.getParcelable("STATE_LOGO_GLOBAL_RECT");
                    if (rect != null) {
                        Resources resources = fragmentActivity.getResources();
                        kotlin.jvm.internal.i.e(resources, "activity.resources");
                        if (i == resources.getConfiguration().orientation) {
                            return rect;
                        }
                    }
                }
            }
            return new Rect();
        }

        public final float a(Parcelable parcelable) {
            return parcelable instanceof Bundle ? ((Bundle) parcelable).getFloat("STATE_PROGRESS") : 0.0f;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: SplashFragment.kt */
    static final class b implements Runnable {
        final /* synthetic */ String bGq;
        final /* synthetic */ d this$0;

        b(d dVar, String str) {
            this.this$0 = dVar;
            this.bGq = str;
        }

        public final void run() {
            if (this.this$0.getView() != null) {
                this.this$0.akE().ag(this.bGq);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "regulated", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: SplashFragment.kt */
    static final class c<T> implements Observer<Boolean> {
        final /* synthetic */ d this$0;

        c(d dVar) {
            this.this$0 = dVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                this.this$0.cD(bool.booleanValue());
            }
        }
    }

    public static final float a(Parcelable parcelable) {
        return bGp.a(parcelable);
    }

    public static final Rect a(FragmentActivity fragmentActivity, Parcelable parcelable) {
        return bGp.a(fragmentActivity, parcelable);
    }

    public static final d a(FragmentManager fragmentManager, int i, boolean z) {
        return bGp.a(fragmentManager, i, z);
    }

    private final c akD() {
        kotlin.d dVar = this.bGn;
        j jVar = anY[0];
        return (c) dVar.getValue();
    }

    private final SplashLogHelper akE() {
        kotlin.d dVar = this.bGo;
        j jVar = anY[1];
        return (SplashLogHelper) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ f b(d dVar) {
        f fVar = dVar.bGi;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return fVar;
    }

    static {
        String name = d.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.bGj = e.bGM.y(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.bGi = (f) com.iqoption.core.ext.a.a((Fragment) this, h.fragment_splash, viewGroup, false, 4, null);
        f fVar = this.bGi;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return fVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        e eVar = this.bGj;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        eVar.akT().observe(this, new c(this));
        if (kotlin.jvm.internal.i.y(this.bGl, Boolean.valueOf(true))) {
            show();
            this.bGl = (Boolean) null;
        } else if (kotlin.jvm.internal.i.y(this.bGl, Boolean.valueOf(false))) {
            hide();
            this.bGl = (Boolean) null;
        } else if ((kotlin.jvm.internal.i.y(this.bGk, Boolean.valueOf(false)) ^ 1) != 0) {
            show();
        } else {
            hide();
        }
        f fVar = this.bGi;
        String str = "binding";
        if (fVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = fVar.bfC;
        kotlin.jvm.internal.i.e(textView, "binding.splashConnectingInfo");
        textView.setText(getString(com.iqoption.core.i.k.you_are_connecting_to_n1, getString(com.iqoption.core.i.k.app_name)));
        Float f = this.bGm;
        if (f != null) {
            float floatValue = f.floatValue();
            f fVar2 = this.bGi;
            if (fVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            LottieAnimationView lottieAnimationView = fVar2.bfv;
            kotlin.jvm.internal.i.e(lottieAnimationView, "binding.animation");
            lottieAnimationView.setProgress(floatValue);
        }
        this.bGm = (Float) null;
    }

    public final void show() {
        View view = getView();
        Boolean valueOf = Boolean.valueOf(true);
        if (view == null) {
            this.bGl = valueOf;
            return;
        }
        this.bGl = (Boolean) null;
        akD().m(valueOf);
        akE().show();
    }

    public final void hide() {
        View view = getView();
        Boolean valueOf = Boolean.valueOf(false);
        if (view == null) {
            this.bGl = valueOf;
            return;
        }
        this.bGl = (Boolean) null;
        akD().m(valueOf);
        akE().akJ();
        akE().hide();
    }

    public final Bundle akF() {
        f fVar;
        LottieAnimationView lottieAnimationView;
        Bundle bundle = new Bundle();
        FragmentActivity activity = getActivity();
        String str = "binding.animation";
        String str2 = "binding";
        if (activity != null) {
            kotlin.jvm.internal.i.e(activity, "it");
            Resources resources = activity.getResources();
            kotlin.jvm.internal.i.e(resources, "it.resources");
            bundle.putInt("STATE_SCREEN_ORIENTATION", resources.getConfiguration().orientation);
            fVar = this.bGi;
            if (fVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            lottieAnimationView = fVar.bfv;
            kotlin.jvm.internal.i.e(lottieAnimationView, str);
            bundle.putParcelable("STATE_LOGO_GLOBAL_RECT", com.iqoption.core.ext.a.ah(lottieAnimationView));
        }
        fVar = this.bGi;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        lottieAnimationView = fVar.bfv;
        kotlin.jvm.internal.i.e(lottieAnimationView, str);
        bundle.putFloat("STATE_PROGRESS", lottieAnimationView.getProgress());
        fVar = this.bGi;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        fVar.bfv.ad();
        return bundle;
    }

    public final void setProgress(float f) {
        if (getView() == null) {
            this.bGm = Float.valueOf(f);
            return;
        }
        f fVar = this.bGi;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LottieAnimationView lottieAnimationView = fVar.bfv;
        kotlin.jvm.internal.i.e(lottieAnimationView, "binding.animation");
        lottieAnimationView.setProgress(f);
    }

    public final void ha(String str) {
        kotlin.jvm.internal.i.f(str, NotificationCompat.CATEGORY_MESSAGE);
        if (com.iqoption.core.d.Un().Ds()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DEBUG: ");
            stringBuilder.append(str);
            ag(stringBuilder.toString());
        }
    }

    public final void ag(String str) {
        kotlin.jvm.internal.i.f(str, NotificationCompat.CATEGORY_MESSAGE);
        if (!ag.anH() || getView() == null) {
            kotlin.jvm.internal.i.e(com.iqoption.core.rx.i.akj().m(new b(this, str)), "ui.scheduleDirect {\n    …          }\n            }");
        } else {
            akE().ag(str);
        }
    }

    private final void cD(boolean z) {
        String str = "binding";
        String str2 = "binding.icCysec";
        f fVar;
        ImageView imageView;
        if (z) {
            fVar = this.bGi;
            if (fVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            imageView = fVar.bfy;
            kotlin.jvm.internal.i.e(imageView, str2);
            com.iqoption.core.ext.a.ak(imageView);
            return;
        }
        fVar = this.bGi;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        imageView = fVar.bfy;
        kotlin.jvm.internal.i.e(imageView, str2);
        com.iqoption.core.ext.a.al(imageView);
    }
}

package com.iqoption.welcome.slide;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.JsonObject;
import com.iqoption.welcome.a.u;
import com.iqoption.welcome.g.e;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0018H\u0016J\u0018\u0010'\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\rH\u0016J\b\u0010)\u001a\u00020\u0018H\u0016J\u001a\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0015\u0010,\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015¨\u00061"}, bng = {"Lcom/iqoption/welcome/slide/WelcomeSlideFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/welcome/slide/PageScrollListener;", "()V", "binding", "Lcom/iqoption/welcome/databinding/FragmentWelcomeSlideBinding;", "pendingLogoProgress", "", "Ljava/lang/Float;", "pendingLogoVisible", "", "Ljava/lang/Boolean;", "position", "", "getPosition", "()I", "position$delegate", "Lkotlin/Lazy;", "slide", "Lcom/iqoption/welcome/slide/WelcomeSlideData;", "getSlide", "()Lcom/iqoption/welcome/slide/WelcomeSlideData;", "slide$delegate", "applyProgressToView", "", "progress", "eventParams", "Lcom/google/gson/JsonObject;", "getLogoRect", "Landroid/graphics/Rect;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPageGone", "onPageScrollProgress", "directionType", "onPageSelected", "onViewCreated", "view", "setLogoProgress", "(Ljava/lang/Float;)V", "setLogoVisible", "visible", "Companion", "welcome_release"})
/* compiled from: WelcomeSlideFragment.kt */
public final class d extends com.iqoption.core.ui.fragment.d {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(d.class), "slide", "getSlide()Lcom/iqoption/welcome/slide/WelcomeSlideData;")), k.a(new PropertyReference1Impl(k.G(d.class), "position", "getPosition()I"))};
    public static final a emR = new a();
    private HashMap apm;
    private u emM;
    private final kotlin.d emN = g.c(new WelcomeSlideFragment$slide$2(this));
    private final kotlin.d emO = g.c(new WelcomeSlideFragment$position$2(this));
    private Boolean emP;
    private Float emQ;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/welcome/slide/WelcomeSlideFragment$Companion;", "", "()V", "ARG_POSITION", "", "ARG_SLIDE", "newInstance", "Lcom/iqoption/welcome/slide/WelcomeSlideFragment;", "slideData", "Lcom/iqoption/welcome/slide/WelcomeSlideData;", "position", "", "welcome_release"})
    /* compiled from: WelcomeSlideFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d a(c cVar, int i) {
            kotlin.jvm.internal.i.f(cVar, "slideData");
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg.slide", cVar);
            bundle.putInt("arg.position", i);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    private final c bbr() {
        kotlin.d dVar = this.emN;
        j jVar = anY[0];
        return (c) dVar.getValue();
    }

    private final int getPosition() {
        kotlin.d dVar = this.emO;
        j jVar = anY[1];
        return ((Number) dVar.getValue()).intValue();
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, e.fragment_welcome_slide, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…_slide, container, false)");
        this.emM = (u) inflate;
        u uVar = this.emM;
        if (uVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return uVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        u uVar;
        LottieAnimationView lottieAnimationView;
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        Integer bbq = bbr().bbq();
        String str = "binding.animationView";
        String str2 = "binding";
        if (bbq != null) {
            u uVar2 = this.emM;
            if (uVar2 == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            LottieAnimationView lottieAnimationView2 = uVar2.cQF;
            kotlin.jvm.internal.i.e(lottieAnimationView2, str);
            com.iqoption.core.ext.a.ak(lottieAnimationView2);
            com.airbnb.lottie.e hS = b.emK.hS(bbq.intValue());
            uVar2 = this.emM;
            if (uVar2 == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            uVar2.cQF.setComposition(hS);
            uVar = this.emM;
            if (uVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            lottieAnimationView = uVar.cQF;
            kotlin.jvm.internal.i.e(lottieAnimationView, str);
            lottieAnimationView.setProgress(getPosition() == 0 ? 1.0f : 0.0f);
        } else {
            uVar = this.emM;
            if (uVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            lottieAnimationView = uVar.cQF;
            kotlin.jvm.internal.i.e(lottieAnimationView, str);
            com.iqoption.core.ext.a.hide(lottieAnimationView);
        }
        uVar = this.emM;
        if (uVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        TextView textView = uVar.eln;
        kotlin.jvm.internal.i.e(textView, "binding.slideTitle");
        textView.setText(bbr().getTitle());
        uVar = this.emM;
        if (uVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        textView = uVar.elm;
        kotlin.jvm.internal.i.e(textView, "binding.slideDescription");
        textView.setText(bbr().getDescription());
        if (this.emP != null) {
            uVar = this.emM;
            if (uVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            lottieAnimationView = uVar.cQF;
            kotlin.jvm.internal.i.e(lottieAnimationView, str);
            Boolean bool = this.emP;
            if (bool == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            lottieAnimationView.setVisibility(bool.booleanValue() ? 0 : 8);
            this.emP = (Boolean) null;
        }
        Float f = this.emQ;
        if (f != null) {
            if (f == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            af(f.floatValue());
            this.emQ = (Float) null;
        }
    }

    public void b(float f, int i) {
        if (getView() != null) {
            String str = "binding.slideDescription";
            String str2 = "binding.slideTitle";
            String str3 = "binding";
            u uVar;
            TextView textView;
            if (i == 0) {
                uVar = this.emM;
                if (uVar == null) {
                    kotlin.jvm.internal.i.lG(str3);
                }
                textView = uVar.eln;
                kotlin.jvm.internal.i.e(textView, str2);
                textView.setAlpha(f);
                uVar = this.emM;
                if (uVar == null) {
                    kotlin.jvm.internal.i.lG(str3);
                }
                textView = uVar.elm;
                kotlin.jvm.internal.i.e(textView, str);
                textView.setAlpha(f);
            } else if (i == 1) {
                uVar = this.emM;
                if (uVar == null) {
                    kotlin.jvm.internal.i.lG(str3);
                }
                textView = uVar.eln;
                kotlin.jvm.internal.i.e(textView, str2);
                float f2 = ((float) 1) - f;
                textView.setAlpha(f2);
                u uVar2 = this.emM;
                if (uVar2 == null) {
                    kotlin.jvm.internal.i.lG(str3);
                }
                TextView textView2 = uVar2.elm;
                kotlin.jvm.internal.i.e(textView2, str);
                textView2.setAlpha(f2);
            }
        }
    }

    public void bbs() {
        if (getView() != null) {
            u uVar = this.emM;
            String str = "binding";
            if (uVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            uVar.cQF.ac();
            uVar = this.emM;
            if (uVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            LottieAnimationView lottieAnimationView = uVar.cQF;
            kotlin.jvm.internal.i.e(lottieAnimationView, "binding.animationView");
            lottieAnimationView.setProgress(0.0f);
            uVar = this.emM;
            if (uVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            uVar.cQF.Z();
            com.iqoption.core.d.EC().h("welcomescreen_swipe-carousel", 0.0d, bbv()).Cc();
        }
    }

    public void bbt() {
        if (getView() != null) {
            u uVar = this.emM;
            String str = "binding";
            if (uVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            uVar.cQF.ac();
            uVar = this.emM;
            if (uVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            LottieAnimationView lottieAnimationView = uVar.cQF;
            kotlin.jvm.internal.i.e(lottieAnimationView, "binding.animationView");
            lottieAnimationView.setProgress(0.0f);
        }
    }

    public final Rect bbu() {
        if (getView() == null) {
            return null;
        }
        u uVar = this.emM;
        if (uVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LottieAnimationView lottieAnimationView = uVar.cQF;
        kotlin.jvm.internal.i.e(lottieAnimationView, "binding.animationView");
        return com.iqoption.core.ext.a.ah(lottieAnimationView);
    }

    public final void fA(boolean z) {
        if (getView() == null) {
            this.emP = Boolean.valueOf(z);
            return;
        }
        u uVar = this.emM;
        if (uVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LottieAnimationView lottieAnimationView = uVar.cQF;
        kotlin.jvm.internal.i.e(lottieAnimationView, "binding.animationView");
        lottieAnimationView.setVisibility(z ? 0 : 8);
    }

    public final void a(Float f) {
        if (getView() == null || f == null) {
            this.emQ = f;
        } else {
            af(f.floatValue());
        }
    }

    private final void af(float f) {
        u uVar = this.emM;
        String str = "binding";
        if (uVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LottieAnimationView lottieAnimationView = uVar.cQF;
        kotlin.jvm.internal.i.e(lottieAnimationView, "binding.animationView");
        lottieAnimationView.setProgress(f);
        if (f < ((float) 1)) {
            u uVar2 = this.emM;
            if (uVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            uVar2.cQF.aa();
        }
    }

    private final JsonObject bbv() {
        Resources resources = getResources();
        kotlin.jvm.internal.i.e(resources, "resources");
        JsonObject anr = com.iqoption.core.util.u.anp().o("screen_number", Integer.valueOf(getPosition())).o("screen_orientation", resources.getConfiguration().orientation == 1 ? "vertical" : "horizontal").anr();
        kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…\n                .build()");
        return anr;
    }
}

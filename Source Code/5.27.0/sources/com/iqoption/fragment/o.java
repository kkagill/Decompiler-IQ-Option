package com.iqoption.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.iqoption.analytics.f;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ext.g;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.zn;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0019H\u0016J\b\u0010(\u001a\u00020\u0019H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, bng = {"Lcom/iqoption/fragment/FxNextExpirationToast;", "Lcom/iqoption/fragment/base/IQAnimationFragment;", "()V", "activeId", "", "getActiveId", "()I", "activeId$delegate", "Lkotlin/Lazy;", "binding", "Lcom/iqoption/databinding/ToastFxNextExpirationBinding;", "eventBuilder", "Lcom/iqoption/dto/Event$Builder;", "Lcom/iqoption/dto/Event;", "expTime", "", "getExpTime", "()J", "expTime$delegate", "handler", "Landroid/os/Handler;", "hideCommand", "Ljava/lang/Runnable;", "getAnimationDuration", "nextExpiration", "", "onClose", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onHideAnimation", "onShowAnimation", "onStart", "onStop", "Companion", "DragDropGestureListener", "app_optionXRelease"})
/* compiled from: FxNextExpirationToast.kt */
public final class o extends com.iqoption.fragment.b.b {
    private static final String TAG = TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(o.class), "activeId", "getActiveId()I")), k.a(new PropertyReference1Impl(k.G(o.class), "expTime", "getExpTime()J"))};
    public static final a cVA = new a();
    private final Runnable aUY = new c(this);
    private HashMap apm;
    private Builder cVb;
    private final kotlin.d cVx = g.c(new FxNextExpirationToast$activeId$2(this));
    private final kotlin.d cVy = g.c(new FxNextExpirationToast$expTime$2(this));
    private zn cVz;
    private final Handler handler = new Handler();

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, bng = {"Lcom/iqoption/fragment/FxNextExpirationToast$Companion;", "", "()V", "ARG_ACTIVE_ID", "", "ARG_EXP_TIME", "TAG", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/fragment/FxNextExpirationToast;", "activeId", "", "expirationTime", "", "app_optionXRelease"})
    /* compiled from: FxNextExpirationToast.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return o.TAG;
        }

        public final o j(int i, long j) {
            o oVar = new o();
            oVar.setArguments(new com.iqoption.util.e().O("ARG_ACTIVE_ID", i).g("ARG_EXP_TIME", j).toBundle());
            return oVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/fragment/FxNextExpirationToast$DragDropGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/iqoption/fragment/FxNextExpirationToast;)V", "isScrolled", "", "onDown", "motionEvent", "Landroid/view/MotionEvent;", "onScroll", "motionEvent1", "distanceX", "", "distanceY", "onSingleTapUp", "onUp", "", "app_optionXRelease"})
    /* compiled from: FxNextExpirationToast.kt */
    private final class b extends SimpleOnGestureListener {
        private boolean cVB;

        public boolean onDown(MotionEvent motionEvent) {
            kotlin.jvm.internal.i.f(motionEvent, "motionEvent");
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            kotlin.jvm.internal.i.f(motionEvent, "motionEvent");
            o.this.axO();
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            kotlin.jvm.internal.i.f(motionEvent, "motionEvent");
            kotlin.jvm.internal.i.f(motionEvent2, "motionEvent1");
            this.cVB = true;
            if (f < ((float) 0)) {
                o.b(o.this).aIv.animate().translationXBy(-f).setDuration(0).start();
            }
            return true;
        }

        public final void axP() {
            if (this.cVB) {
                o.this.onClose();
            }
            this.cVB = false;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: FxNextExpirationToast.kt */
    static final class c implements Runnable {
        final /* synthetic */ o this$0;

        c(o oVar) {
            this.this$0 = oVar;
        }

        public final void run() {
            this.this$0.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/fragment/FxNextExpirationToast$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends g {
        final /* synthetic */ o this$0;

        public d(o oVar) {
            this.this$0 = oVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, bng = {"com/iqoption/fragment/FxNextExpirationToast$onCreateView$1$3", "Lcom/iqoption/view/viewinterface/OnTouchAlphaEffect;", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "app_optionXRelease"})
    /* compiled from: FxNextExpirationToast.kt */
    public static final class e extends com.iqoption.view.d.d {
        final /* synthetic */ b cVC;
        final /* synthetic */ GestureDetector cVD;

        e(b bVar, GestureDetector gestureDetector) {
            this.cVC = bVar;
            this.cVD = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            kotlin.jvm.internal.i.f(view, "v");
            kotlin.jvm.internal.i.f(motionEvent, "event");
            super.onTouch(view, motionEvent);
            if (motionEvent.getAction() == 1) {
                this.cVC.axP();
            }
            return this.cVD.onTouchEvent(motionEvent);
        }
    }

    private final long aim() {
        kotlin.d dVar = this.cVy;
        j jVar = anY[1];
        return ((Number) dVar.getValue()).longValue();
    }

    private final int getActiveId() {
        kotlin.d dVar = this.cVx;
        j jVar = anY[0];
        return ((Number) dVar.getValue()).intValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public long getAnimationDuration() {
        return 250;
    }

    public static final /* synthetic */ zn b(o oVar) {
        zn znVar = oVar.cVz;
        if (znVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return znVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        f fVar = f.aqU;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long aim = aim();
        l HZ = l.HZ();
        String str = "TimeServerManager.instance()";
        kotlin.jvm.internal.i.e(HZ, str);
        this.cVb = fVar.a((double) timeUnit.toMinutes(aim - HZ.Ib()), getActiveId());
        zn znVar = (zn) com.iqoption.core.ext.a.a(layoutInflater, (int) R.layout.toast_fx_next_expiration, viewGroup, false);
        FrameLayout frameLayout = znVar.caT;
        kotlin.jvm.internal.i.e(frameLayout, "screen");
        frameLayout.setOnClickListener(new d(this));
        com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(getActiveId()), InstrumentType.FX_INSTRUMENT);
        if (a != null) {
            String image = a.getImage();
            if ((((CharSequence) image).length() > 0 ? 1 : null) != null) {
                Picasso.with(com.iqoption.core.ext.a.q(this)).load(image).into(znVar.akZ);
            }
            TextView textView = znVar.anJ;
            kotlin.jvm.internal.i.e(textView, "activeName");
            kotlin.jvm.internal.i.e(a, "it");
            textView.setText(com.iqoption.core.microservices.tradingengine.response.active.d.B(a));
        }
        TextView textView2 = znVar.aol;
        kotlin.jvm.internal.i.e(textView2, "instrumentType");
        textView2.setText(com.iqoption.util.c.a.af(InstrumentType.FX_INSTRUMENT));
        textView2 = znVar.anj;
        kotlin.jvm.internal.i.e(textView2, "time");
        Object[] objArr = new Object[1];
        long aim2 = aim();
        l HZ2 = l.HZ();
        kotlin.jvm.internal.i.e(HZ2, str);
        objArr[0] = TimeUtil.formatElapsedTime((aim2 - HZ2.Ib()) / ((long) 1000));
        textView2.setText(getString(R.string.in_time_n1, objArr));
        b bVar = new b();
        znVar.aIv.setOnTouchListener(new e(bVar, new GestureDetector(getContext(), bVar)));
        this.cVz = znVar;
        znVar = this.cVz;
        if (znVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return znVar.getRoot();
    }

    public void onStart() {
        super.onStart();
        this.handler.postDelayed(this.aUY, TimeUnit.SECONDS.toMillis(5));
    }

    public void onStop() {
        super.onStop();
        this.handler.removeCallbacks(this.aUY);
    }

    public void onDestroyView() {
        super.onDestroyView();
        Builder builder = this.cVb;
        if (builder != null) {
            f.aqU.a(builder);
        }
        Bj();
    }

    public boolean onClose() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        return true;
    }

    public void att() {
        zn znVar = this.cVz;
        if (znVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ConstraintLayout constraintLayout = znVar.aIv;
        String str = "content";
        kotlin.jvm.internal.i.e(constraintLayout, str);
        constraintLayout.setAlpha(0.0f);
        constraintLayout = znVar.aIv;
        kotlin.jvm.internal.i.e(constraintLayout, str);
        ConstraintLayout constraintLayout2 = znVar.aIv;
        kotlin.jvm.internal.i.e(constraintLayout2, str);
        constraintLayout.setTranslationX((float) (constraintLayout2.getWidth() / 2));
        znVar.aIv.animate().alpha(1.0f).translationX(0.0f).setDuration(axh()).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        zn znVar = this.cVz;
        if (znVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ViewPropertyAnimator alpha = znVar.aIv.animate().alpha(0.0f);
        ConstraintLayout constraintLayout = znVar.aIv;
        kotlin.jvm.internal.i.e(constraintLayout, "content");
        alpha.translationX((float) (constraintLayout.getWidth() / 2)).setDuration(axj()).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    private final void axO() {
        onClose();
        com.iqoption.o.d.a(com.iqoption.o.d.dUK.F(com.iqoption.core.ext.a.r(this)), InstrumentType.FX_INSTRUMENT, getActiveId(), false, 4, null);
        f fVar = f.aqU;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long aim = aim();
        l HZ = l.HZ();
        kotlin.jvm.internal.i.e(HZ, "TimeServerManager.instance()");
        fVar.b((double) timeUnit.toMinutes(aim - HZ.Ib()), getActiveId());
    }
}

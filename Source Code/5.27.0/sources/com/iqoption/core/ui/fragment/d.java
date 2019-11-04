package com.iqoption.core.ui.fragment;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentExtensionsKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.transition.Transition;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.animation.transitions.e;
import com.iqoption.core.util.p;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001XB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0004J\b\u0010)\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,H\u0007J\b\u0010-\u001a\u00020\u001fH\u0016J\n\u0010.\u001a\u0004\u0018\u00010/H\u0016J\n\u00100\u001a\u0004\u0018\u00010/H\u0016J\n\u00101\u001a\u0004\u0018\u00010/H\u0016J\n\u00102\u001a\u0004\u0018\u00010/H\u0016J\b\u00103\u001a\u00020\u0016H\u0016J\u0006\u00104\u001a\u00020\u0016J\u0006\u00105\u001a\u00020\u0016J\u0012\u00106\u001a\u00020\u00162\b\u00107\u001a\u0004\u0018\u000108H\u0014J\"\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u00020<H\u0016J\b\u0010?\u001a\u00020\bH\u0014J\b\u0010@\u001a\u00020\u001aH\u0014J\u0010\u0010A\u001a\u00020&2\u0006\u0010B\u001a\u00020\u0016H\u0014J\b\u0010C\u001a\u00020&H\u0016J\b\u0010D\u001a\u00020&H\u0016J\b\u0010E\u001a\u00020&H\u0016J\u0010\u0010F\u001a\u00020&2\u0006\u0010B\u001a\u00020\u0016H\u0016J\u0012\u0010G\u001a\u00020\u00102\b\u0010H\u001a\u0004\u0018\u00010\u0000H\u0014J\u001a\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0010\u0010N\u001a\u00020\u00162\b\u0010O\u001a\u0004\u0018\u000108J\u0006\u0010P\u001a\u00020\u0016J\u0006\u0010Q\u001a\u00020\u0016J\u0010\u0010R\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0004J\u0010\u0010S\u001a\u0004\u0018\u00010:2\u0006\u0010>\u001a\u00020<J(\u0010T\u001a\u00020&\"\u0004\b\u0000\u0010U*\b\u0012\u0004\u0012\u0002HU0V2\u000e\u0010'\u001a\n\u0012\u0006\b\u0000\u0012\u0002HU0WH\u0004R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006Y"}, bng = {"Lcom/iqoption/core/ui/fragment/IQFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/iqoption/core/ui/animation/EnterExitAnimatable;", "Lcom/iqoption/core/util/HasUid;", "()V", "_viewLifecycleHelper", "Lcom/iqoption/core/ui/fragment/ViewLifecycleHelper;", "animationProvider", "Lcom/iqoption/core/ui/animation/AnimationProvider;", "getAnimationProvider", "()Lcom/iqoption/core/ui/animation/AnimationProvider;", "animationProvider$delegate", "Lkotlin/Lazy;", "disposablesOnDestroy", "Lio/reactivex/disposables/CompositeDisposable;", "enterAnimationDuration", "", "getEnterAnimationDuration", "()J", "exitAnimationDuration", "getExitAnimationDuration", "isCustomAnimationsEnabled", "", "()Z", "isCustomTransitionsEnabled", "transitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "getTransitionProvider", "()Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "transitionProvider$delegate", "uid", "", "getUid", "()Ljava/lang/String;", "viewLifecycleHelper", "getViewLifecycleHelper", "()Lcom/iqoption/core/ui/fragment/ViewLifecycleHelper;", "addLifecycleObserver", "", "observer", "Landroidx/lifecycle/LifecycleObserver;", "back", "disposeOnDestroy", "disposable", "Lio/reactivex/disposables/Disposable;", "getContentTransitionName", "getEnterTransition", "", "getExitTransition", "getReenterTransition", "getReturnTransition", "handleBackPressed", "isKeyboardVisible", "isTopOfBackStack", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "nextAnim", "onCreateAnimationProvider", "onCreateTransitionProvider", "onCustomHiddenChanged", "hidden", "onDestroy", "onEnterAnimation", "onExitAnimation", "onHiddenChanged", "onRequestExitAnimationDuration", "initiator", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "popBackStack", "fragmentManager", "popChildBackStack", "popSelfBackStack", "removeLifecycleObserver", "tryLoadAnimation", "observeData", "T", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/Observer;", "Companion", "core_release"})
/* compiled from: IQFragment.kt */
public class d extends Fragment implements p {
    private static final String LOG_TAG = d.class.getSimpleName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(d.class), "animationProvider", "getAnimationProvider()Lcom/iqoption/core/ui/animation/AnimationProvider;")), k.a(new PropertyReference1Impl(k.G(d.class), "transitionProvider", "getTransitionProvider()Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;"))};
    private static final com.iqoption.core.ui.animation.a bIQ = new b();
    private static final e bIR = new c();
    private static kotlin.jvm.a.b<? super d, ? extends e> bIS = IQFragment$Companion$DEFAULT_TRANSITION_PROVIDER_FACTORY$1.bIU;
    public static final a bIT = new a();
    private HashMap apm;
    private final String bIH;
    private f bII;
    private final io.reactivex.disposables.a bIJ = new io.reactivex.disposables.a();
    private final kotlin.d bIK = g.c(new IQFragment$animationProvider$2(this));
    private final kotlin.d bIL = g.c(new IQFragment$transitionProvider$2(this));
    private final boolean bIM;
    private final boolean bIN;
    private final long bIO = 250;
    private final long bIP = 250;

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/ui/fragment/IQFragment$Companion;", "", "()V", "DEFAULT_TRANSITION_PROVIDER_FACTORY", "Lkotlin/Function1;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "LOG_TAG", "", "kotlin.jvm.PlatformType", "NO_ANIMATION_PROVIDER", "Lcom/iqoption/core/ui/animation/AnimationProvider;", "getNO_ANIMATION_PROVIDER", "()Lcom/iqoption/core/ui/animation/AnimationProvider;", "NO_TRANSITION_PROVIDER", "getNO_TRANSITION_PROVIDER", "()Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "enableTransitionProvider", "", "provider", "core_release"})
    /* compiled from: IQFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final e alA() {
            return d.bIR;
        }

        public final void l(kotlin.jvm.a.b<? super d, ? extends e> bVar) {
            kotlin.jvm.internal.i.f(bVar, "provider");
            d.bIS = bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, bng = {"com/iqoption/core/ui/fragment/IQFragment$Companion$NO_ANIMATION_PROVIDER$1", "Lcom/iqoption/core/ui/animation/AnimationProvider;", "core_release"})
    /* compiled from: IQFragment.kt */
    public static final class b implements com.iqoption.core.ui.animation.a {
        b() {
        }

        public Animation a(int i, boolean z, int i2) {
            return com.iqoption.core.ui.animation.a.a.a(this, i, z, i2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, bng = {"com/iqoption/core/ui/fragment/IQFragment$Companion$NO_TRANSITION_PROVIDER$1", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "core_release"})
    /* compiled from: IQFragment.kt */
    public static final class c implements e {
        c() {
        }

        public Transition RY() {
            return com.iqoption.core.ui.animation.transitions.e.a.a(this);
        }

        public Transition RZ() {
            return com.iqoption.core.ui.animation.transitions.e.a.c(this);
        }

        public Transition Sa() {
            return com.iqoption.core.ui.animation.transitions.e.a.d(this);
        }

        public Transition Sb() {
            return com.iqoption.core.ui.animation.transitions.e.a.b(this);
        }
    }

    private final com.iqoption.core.ui.animation.a alu() {
        kotlin.d dVar = this.bIK;
        j jVar = anY[0];
        return (com.iqoption.core.ui.animation.a) dVar.getValue();
    }

    private final e alv() {
        kotlin.d dVar = this.bIL;
        j jVar = anY[1];
        return (e) dVar.getValue();
    }

    public static final void l(kotlin.jvm.a.b<? super d, ? extends e> bVar) {
        bIT.l(bVar);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void PX() {
    }

    public void PY() {
    }

    /* Access modifiers changed, original: protected */
    public void cG(boolean z) {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public d() {
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.i.e(uuid, "UUID.randomUUID().toString()");
        this.bIH = uuid;
        setReturnTransition(null);
        setReenterTransition(null);
    }

    public String Or() {
        return this.bIH;
    }

    private final f alt() {
        f fVar = this.bII;
        if (fVar != null) {
            return fVar;
        }
        LiveData viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        kotlin.jvm.internal.i.e(viewLifecycleOwnerLiveData, "viewLifecycleOwnerLiveData");
        fVar = new f(viewLifecycleOwnerLiveData);
        this.bII = fVar;
        return fVar;
    }

    public boolean ME() {
        return this.bIM;
    }

    public boolean PU() {
        return this.bIN;
    }

    public long PV() {
        return this.bIO;
    }

    public long PW() {
        return this.bIP;
    }

    /* Access modifiers changed, original: protected|final */
    public final <T> void a(LiveData<T> liveData, Observer<? super T> observer) {
        kotlin.jvm.internal.i.f(liveData, "$this$observeData");
        kotlin.jvm.internal.i.f(observer, "observer");
        alt().b(liveData, observer);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(LifecycleObserver lifecycleObserver) {
        kotlin.jvm.internal.i.f(lifecycleObserver, "observer");
        alt().a(lifecycleObserver);
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.a alw() {
        if (PU()) {
            return new com.iqoption.core.ui.animation.c(this);
        }
        return bIQ;
    }

    /* Access modifiers changed, original: protected */
    public e Bv() {
        if (ME()) {
            return (e) bIS.invoke(this);
        }
        return bIR;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (!z) {
            Fragment parentFragment = getParentFragment();
            Object obj = (parentFragment == null || !parentFragment.isRemoving()) ? null : 1;
            if (obj != null) {
                com.iqoption.core.graphics.animation.d dVar = new com.iqoption.core.graphics.animation.d();
                dVar.setDuration(f(null));
                return dVar;
            }
        }
        return alu().a(i, z, i2);
    }

    public Object getEnterTransition() {
        Object enterTransition = super.getEnterTransition();
        return enterTransition != null ? enterTransition : alv().RY();
    }

    public Object getExitTransition() {
        Object exitTransition = super.getExitTransition();
        return exitTransition != null ? exitTransition : alv().Sb();
    }

    public Object getReenterTransition() {
        Object reenterTransition = super.getReenterTransition();
        return reenterTransition != null ? reenterTransition : alv().RZ();
    }

    public Object getReturnTransition() {
        Object returnTransition = super.getReturnTransition();
        return returnTransition != null ? returnTransition : alv().Sa();
    }

    public String alx() {
        String name = getClass().getName();
        kotlin.jvm.internal.i.e(name, "javaClass.name");
        return name;
    }

    public final Animation fd(int i) {
        if (!kotlin.jvm.internal.i.y("anim", getResources().getResourceTypeName(i))) {
            return null;
        }
        try {
            return AnimationUtils.loadAnimation(getContext(), i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* Access modifiers changed, original: protected */
    public long f(d dVar) {
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof d)) {
            parentFragment = null;
        }
        d dVar2 = (d) parentFragment;
        if (dVar2 == null) {
            return 0;
        }
        if (dVar == null) {
            dVar = this;
        }
        return dVar2.f(dVar);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ViewCompat.setTransitionName(view, alx());
    }

    public void onDestroy() {
        super.onDestroy();
        if (getRetainInstance()) {
            getViewModelStore().clear();
        }
        this.bIJ.clear();
    }

    public final void a(io.reactivex.disposables.b bVar) {
        kotlin.jvm.internal.i.f(bVar, "disposable");
        this.bIJ.e(bVar);
    }

    public final boolean akX() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof com.iqoption.core.ui.a.a)) {
            activity = null;
        }
        com.iqoption.core.ui.a.a aVar = (com.iqoption.core.ui.a.a) activity;
        return aVar != null && aVar.akX();
    }

    public void back() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public boolean aly() {
        FragmentManager peekChildFragmentManager = FragmentExtensionsKt.peekChildFragmentManager(this);
        if (peekChildFragmentManager != null) {
            List fragments = peekChildFragmentManager.getFragments();
            kotlin.jvm.internal.i.e(fragments, "childFragmentManager.fragments");
            int size = fragments.size();
            for (int i = 0; i < size; i++) {
                Object obj = fragments.get((fragments.size() - i) - 1);
                if (!(obj instanceof d)) {
                    obj = null;
                }
                d dVar = (d) obj;
                if (dVar != null && dVar.aly()) {
                    return true;
                }
            }
        }
        return a(peekChildFragmentManager);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        return b(fragmentManager);
    }

    public final boolean b(FragmentManager fragmentManager) {
        if (fragmentManager == null) {
            return false;
        }
        if (!fragmentManager.isStateSaved() || VERSION.SDK_INT > 25) {
            return fragmentManager.popBackStackImmediate();
        }
        return false;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        cG(z);
        com.iqoption.core.ext.a.a((Fragment) this, true, (kotlin.jvm.a.b) new IQFragment$onHiddenChanged$1(z));
    }
}

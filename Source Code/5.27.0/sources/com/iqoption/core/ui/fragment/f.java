package com.iqoption.core.ui.fragment;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0007J,\u0010\u000f\u001a\u00020\r\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00032\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00100\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/ui/fragment/ViewLifecycleHelper;", "", "ownerLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LiveData;)V", "lifecycleOwner", "pendingLifecycleObservers", "", "Landroidx/lifecycle/LifecycleObserver;", "pendingObserveOps", "Lcom/iqoption/core/ui/fragment/ViewLifecycleHelper$ObserveOp;", "addLifecycleObserver", "", "observer", "observe", "T", "liveData", "Landroidx/lifecycle/Observer;", "removeLifecycleObserver", "ObserveOp", "core_release"})
/* compiled from: ViewLifecycleHelper.kt */
public final class f {
    private LifecycleOwner aNp;
    private List<LifecycleObserver> bIZ;
    private List<a<?>> bJa;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/ui/fragment/ViewLifecycleHelper$ObserveOp;", "T", "", "liveData", "Landroidx/lifecycle/LiveData;", "observer", "Landroidx/lifecycle/Observer;", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/Observer;)V", "getLiveData", "()Landroidx/lifecycle/LiveData;", "getObserver", "()Landroidx/lifecycle/Observer;", "exec", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "core_release"})
    /* compiled from: ViewLifecycleHelper.kt */
    private static final class a<T> {
        private final Observer<? super T> aNr;
        private final LiveData<T> bJc;

        public a(LiveData<T> liveData, Observer<? super T> observer) {
            kotlin.jvm.internal.i.f(liveData, "liveData");
            kotlin.jvm.internal.i.f(observer, "observer");
            this.bJc = liveData;
            this.aNr = observer;
        }

        public final void b(LifecycleOwner lifecycleOwner) {
            kotlin.jvm.internal.i.f(lifecycleOwner, "owner");
            this.bJc.observe(lifecycleOwner, this.aNr);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: ViewLifecycleHelper.kt */
    /* renamed from: com.iqoption.core.ui.fragment.f$1 */
    static final class AnonymousClass1<T> implements Observer<LifecycleOwner> {
        final /* synthetic */ f bJb;

        AnonymousClass1(f fVar) {
            this.bJb = fVar;
        }

        /* renamed from: a */
        public final void onChanged(LifecycleOwner lifecycleOwner) {
            this.bJb.aNp = lifecycleOwner;
            if (lifecycleOwner != null) {
                Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                kotlin.jvm.internal.i.e(lifecycle, "lifecycleOwner.lifecycle");
                List<LifecycleObserver> a = this.bJb.bIZ;
                if (a != null) {
                    for (LifecycleObserver addObserver : a) {
                        lifecycle.addObserver(addObserver);
                    }
                    a.clear();
                }
                List<a> b = this.bJb.bJa;
                if (b != null) {
                    for (a b2 : b) {
                        b2.b(lifecycleOwner);
                    }
                    b.clear();
                }
            }
        }
    }

    public f(LiveData<LifecycleOwner> liveData) {
        kotlin.jvm.internal.i.f(liveData, "ownerLiveData");
        liveData.observeForever(new AnonymousClass1(this));
    }

    @MainThread
    public final void a(LifecycleObserver lifecycleObserver) {
        kotlin.jvm.internal.i.f(lifecycleObserver, "observer");
        LifecycleOwner lifecycleOwner = this.aNp;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(lifecycleObserver);
            return;
        }
        List list = this.bIZ;
        if (list == null) {
            list = new ArrayList();
            this.bIZ = list;
        }
        list.add(lifecycleObserver);
    }

    @MainThread
    public final <T> void b(LiveData<T> liveData, Observer<? super T> observer) {
        kotlin.jvm.internal.i.f(liveData, "liveData");
        kotlin.jvm.internal.i.f(observer, "observer");
        LifecycleOwner lifecycleOwner = this.aNp;
        if (lifecycleOwner != null) {
            liveData.observe(lifecycleOwner, observer);
            return;
        }
        List list = this.bJa;
        if (list == null) {
            list = new ArrayList();
            this.bJa = list;
        }
        list.add(new a(liveData, observer));
    }
}

package com.iqoption.util;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0007H\b\u001a,\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\u001a9\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0004\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\u00010\u0007H\b\u001a,\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\t\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f¨\u0006\u0010"}, bng = {"observe", "", "T", "Landroidx/lifecycle/LiveData;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onChange", "Lkotlin/Function1;", "observeFragment", "fragment", "Landroidx/fragment/app/Fragment;", "observer", "Landroidx/lifecycle/Observer;", "observeNullable", "observeSubFragment", "Lcom/iqoption/util/fragmentstack/VisibilityAwareFragment;", "app_optionXRelease"})
/* compiled from: LiveDatas.kt */
public final class z {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Object;)V"})
    /* compiled from: LiveDatas.kt */
    public static final class a<T> implements Observer<T> {
        final /* synthetic */ kotlin.jvm.a.b ebH;

        public a(kotlin.jvm.a.b bVar) {
            this.ebH = bVar;
        }

        public final void onChanged(T t) {
            if (t != null) {
                this.ebH.invoke(t);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, bng = {"com/iqoption/util/LiveDatasKt$observeFragment$1", "Lcom/iqoption/util/fragmentstack/FragmentAwareLiveDataObserver;", "onCustomChange", "", "t", "(Ljava/lang/Object;)V", "app_optionXRelease"})
    /* compiled from: LiveDatas.kt */
    public static final class b extends com.iqoption.util.fragmentstack.b<T> {
        final /* synthetic */ Observer bcL;
        final /* synthetic */ Fragment cwK;

        b(Observer observer, Fragment fragment, Fragment fragment2) {
            this.bcL = observer;
            this.cwK = fragment;
            super(fragment2);
        }

        public void cp(T t) {
            this.bcL.onChanged(t);
        }
    }

    public static final <T> void a(LiveData<T> liveData, Fragment fragment, Observer<T> observer) {
        kotlin.jvm.internal.i.f(liveData, "$this$observeFragment");
        kotlin.jvm.internal.i.f(fragment, "fragment");
        kotlin.jvm.internal.i.f(observer, "observer");
        LifecycleOwner lifecycleOwner = fragment;
        b bVar = new b(observer, fragment, fragment);
        FragmentActivity activity = fragment.getActivity();
        if (activity instanceof com.iqoption.activity.a) {
            ((com.iqoption.activity.a) activity).zK().a(fragment, bVar);
        }
        liveData.observe(lifecycleOwner, bVar);
    }

    public static final <T> void a(LiveData<T> liveData, LifecycleOwner lifecycleOwner, kotlin.jvm.a.b<? super T, l> bVar) {
        kotlin.jvm.internal.i.f(liveData, "$this$observe");
        kotlin.jvm.internal.i.f(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.i.f(bVar, "onChange");
        liveData.observe(lifecycleOwner, new a(bVar));
    }
}

package com.iqoption.core.ui.f;

import android.app.Application;
import android.content.Context;
import androidx.annotation.CallSuper;
import androidx.lifecycle.AndroidViewModel;
import io.reactivex.disposables.a;
import io.reactivex.disposables.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0015J\f\u0010\u0011\u001a\u00020\r*\u00020\u0002H\u0004R\u0014\u0010\u0006\u001a\u00020\u00078DX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/ui/viewmodel/DisposableAndroidViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lio/reactivex/disposables/Disposable;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "dispose", "", "isDisposed", "", "onCleared", "disposeOnCleared", "core_release"})
/* compiled from: DisposableAndroidViewModel.kt */
public abstract class c extends AndroidViewModel implements b {
    private final a bJT = new a();

    public c(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public void dispose() {
        this.bJT.clear();
    }

    public boolean isDisposed() {
        return this.bJT.isDisposed();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "$this$disposeOnCleared");
        this.bJT.e(bVar);
    }

    /* Access modifiers changed, original: protected */
    @CallSuper
    public void onCleared() {
        super.onCleared();
        dispose();
    }

    /* Access modifiers changed, original: protected|final */
    public final Context getContext() {
        Application application = getApplication();
        kotlin.jvm.internal.i.e(application, "getApplication()");
        return application;
    }
}

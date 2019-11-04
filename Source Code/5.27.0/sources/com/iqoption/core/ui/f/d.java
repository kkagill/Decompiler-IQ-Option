package com.iqoption.core.ui.f;

import androidx.annotation.CallSuper;
import androidx.lifecycle.ViewModel;
import io.reactivex.disposables.a;
import io.reactivex.disposables.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0004J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0015J\f\u0010\f\u001a\u00020\u0007*\u00020\u0002H\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/reactivex/disposables/Disposable;", "()V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "dispose", "", "hasActiveDisposables", "", "isDisposed", "onCleared", "disposeOnCleared", "core_release"})
/* compiled from: DisposableViewModel.kt */
public abstract class d extends ViewModel implements b {
    private final a bJT = new a();

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
}

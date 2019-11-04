package com.iqoption.core.util;

import android.app.Activity;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/core/util/KeyboardAutoCloser;", "Landroidx/lifecycle/LifecycleObserver;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "closeKeyboard", "", "core_release"})
/* compiled from: KeyboardAutoCloser.kt */
public final class KeyboardAutoCloser implements LifecycleObserver {
    private final Activity activity;

    public KeyboardAutoCloser(Activity activity) {
        this.activity = activity;
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void closeKeyboard() {
        v.j(this.activity);
    }
}

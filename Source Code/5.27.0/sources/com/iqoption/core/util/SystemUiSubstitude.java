package com.iqoption.core.util;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\f"}, bng = {"Lcom/iqoption/core/util/SystemUiSubstitude;", "Landroidx/lifecycle/LifecycleObserver;", "activity", "Landroid/app/Activity;", "flags", "", "(Landroid/app/Activity;I)V", "savedFlags", "Ljava/lang/Integer;", "restoreSoftInputMode", "", "saveAndClearSoftInputMode", "core_release"})
/* compiled from: SystemUiSubstitude.kt */
public final class SystemUiSubstitude implements LifecycleObserver {
    private final Activity activity;
    private Integer bRo;
    private final int flags;

    public SystemUiSubstitude(Activity activity, int i) {
        this.activity = activity;
        this.flags = i;
    }

    @OnLifecycleEvent(Event.ON_CREATE)
    public final void saveAndClearSoftInputMode() {
        Activity activity = this.activity;
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null) {
                    this.bRo = Integer.valueOf(decorView.getSystemUiVisibility());
                    decorView.setSystemUiVisibility(this.flags);
                }
            }
        }
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void restoreSoftInputMode() {
        Integer num = this.bRo;
        if (num != null) {
            int intValue = num.intValue();
            Activity activity = this.activity;
            if (activity != null) {
                Window window = activity.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        decorView.setSystemUiVisibility(intValue);
                    }
                }
            }
        }
    }
}
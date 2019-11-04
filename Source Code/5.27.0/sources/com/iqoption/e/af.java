package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ActivityProKycBinding */
public abstract class af extends ViewDataBinding {
    @NonNull
    public final FrameLayout bTu;
    @NonNull
    public final FrameLayout bTv;
    @NonNull
    public final FrameLayout bTw;

    protected af(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        super(obj, view, i);
        this.bTv = frameLayout;
        this.bTw = frameLayout2;
        this.bTu = frameLayout3;
    }
}

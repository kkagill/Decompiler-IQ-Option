package com.iqoption.chat.a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentChatBinding */
public abstract class ci extends ViewDataBinding {
    @NonNull
    public final FrameLayout aRW;
    @NonNull
    public final FrameLayout aRX;
    @NonNull
    public final FrameLayout aRY;

    protected ci(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        super(obj, view, i);
        this.aRW = frameLayout;
        this.aRX = frameLayout2;
        this.aRY = frameLayout3;
    }
}

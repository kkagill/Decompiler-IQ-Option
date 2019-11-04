package com.iqoption.chat.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.MaxSizeCardViewLayout;

/* compiled from: ChatDialogMessageOptionsBinding */
public abstract class i extends ViewDataBinding {
    @NonNull
    public final FrameLayout aHP;
    @NonNull
    public final MaxSizeCardViewLayout aQN;
    @NonNull
    public final LinearLayout aQV;

    protected i(Object obj, View view, int i, MaxSizeCardViewLayout maxSizeCardViewLayout, LinearLayout linearLayout, FrameLayout frameLayout) {
        super(obj, view, i);
        this.aQN = maxSizeCardViewLayout;
        this.aQV = linearLayout;
        this.aHP = frameLayout;
    }
}

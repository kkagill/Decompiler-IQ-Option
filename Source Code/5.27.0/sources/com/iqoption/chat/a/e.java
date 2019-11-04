package com.iqoption.chat.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.MaxSizeCardViewLayout;

/* compiled from: ChatDialogCantSendReasonBinding */
public abstract class e extends ViewDataBinding {
    @NonNull
    public final FrameLayout aHP;
    @NonNull
    public final TextView aQM;
    @NonNull
    public final MaxSizeCardViewLayout aQN;
    @NonNull
    public final TextView ani;

    protected e(Object obj, View view, int i, TextView textView, MaxSizeCardViewLayout maxSizeCardViewLayout, FrameLayout frameLayout, TextView textView2) {
        super(obj, view, i);
        this.aQM = textView;
        this.aQN = maxSizeCardViewLayout;
        this.aHP = frameLayout;
        this.ani = textView2;
    }
}

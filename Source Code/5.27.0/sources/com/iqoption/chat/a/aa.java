package com.iqoption.chat.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: ChatFragmentAttachmentPickerBinding */
public abstract class aa extends ViewDataBinding {
    @NonNull
    public final TextView aRj;
    @NonNull
    public final LinearLayout aRk;
    @NonNull
    public final LinearLayout aRl;
    @NonNull
    public final LottieAnimationView aRm;
    @NonNull
    public final TextView aRn;
    @NonNull
    public final RecyclerView aRo;
    @NonNull
    public final CoordinatorLayout aRp;

    protected aa(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, LinearLayout linearLayout2, LottieAnimationView lottieAnimationView, TextView textView2, RecyclerView recyclerView, CoordinatorLayout coordinatorLayout) {
        super(obj, view, i);
        this.aRj = textView;
        this.aRk = linearLayout;
        this.aRl = linearLayout2;
        this.aRm = lottieAnimationView;
        this.aRn = textView2;
        this.aRo = recyclerView;
        this.aRp = coordinatorLayout;
    }
}

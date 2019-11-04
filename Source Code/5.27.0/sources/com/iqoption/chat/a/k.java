package com.iqoption.chat.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.MaxSizeCardViewLayout;

/* compiled from: ChatDialogUserInfoBinding */
public abstract class k extends ViewDataBinding {
    @NonNull
    public final FrameLayout aHP;
    @NonNull
    public final MaxSizeCardViewLayout aQN;
    @NonNull
    public final ImageView aQW;
    @NonNull
    public final TextView aQX;
    @NonNull
    public final TextView aQY;
    @NonNull
    public final FrameLayout aQZ;
    @NonNull
    public final TextView aRa;
    @NonNull
    public final FrameLayout aRb;
    @NonNull
    public final TextView aRc;
    @NonNull
    public final TextView amZ;
    @NonNull
    public final TextView anC;

    protected k(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3, TextView textView4, MaxSizeCardViewLayout maxSizeCardViewLayout, TextView textView5, FrameLayout frameLayout2, FrameLayout frameLayout3, TextView textView6) {
        super(obj, view, i);
        this.aQW = imageView;
        this.aQX = textView;
        this.aQY = textView2;
        this.aQZ = frameLayout;
        this.anC = textView3;
        this.aRa = textView4;
        this.aQN = maxSizeCardViewLayout;
        this.amZ = textView5;
        this.aRb = frameLayout2;
        this.aHP = frameLayout3;
        this.aRc = textView6;
    }
}

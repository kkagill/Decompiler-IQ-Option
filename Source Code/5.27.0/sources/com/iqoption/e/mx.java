package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.TextureVideoView;

/* compiled from: FragmentPromoVideoBinding */
public abstract class mx extends ViewDataBinding {
    @NonNull
    public final View cio;
    @NonNull
    public final ProgressBar cip;
    @NonNull
    public final FrameLayout ciq;
    @NonNull
    public final FrameLayout cir;
    @NonNull
    public final TextureVideoView cis;

    protected mx(Object obj, View view, int i, View view2, ProgressBar progressBar, FrameLayout frameLayout, FrameLayout frameLayout2, TextureVideoView textureVideoView) {
        super(obj, view, i);
        this.cio = view2;
        this.cip = progressBar;
        this.ciq = frameLayout;
        this.cir = frameLayout2;
        this.cis = textureVideoView;
    }
}

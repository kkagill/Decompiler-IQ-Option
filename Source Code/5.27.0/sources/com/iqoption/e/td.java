package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.dialog.popup.a.a;

/* compiled from: NpsCompletedFragmentBinding */
public abstract class td extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView ani;
    @NonNull
    public final ImageView cbk;
    @NonNull
    public final FrameLayout coB;
    @NonNull
    public final ConstraintLayout coC;
    @NonNull
    public final FrameLayout coD;
    @Bindable
    protected a coE;

    public abstract void a(@Nullable a aVar);

    protected td(Object obj, View view, int i, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, ConstraintLayout constraintLayout, FrameLayout frameLayout2, TextView textView) {
        super(obj, view, i);
        this.cbk = imageView;
        this.coB = frameLayout;
        this.aRh = imageView2;
        this.coC = constraintLayout;
        this.coD = frameLayout2;
        this.ani = textView;
    }
}

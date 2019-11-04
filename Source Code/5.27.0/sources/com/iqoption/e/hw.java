package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: DialpadKeyTouchidBinding */
public abstract class hw extends ViewDataBinding {
    @NonNull
    public final ImageView ced;
    @NonNull
    public final ImageView ceg;
    @NonNull
    public final ImageView ceh;

    protected hw(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        super(obj, view, i);
        this.ceg = imageView;
        this.ced = imageView2;
        this.ceh = imageView3;
    }
}

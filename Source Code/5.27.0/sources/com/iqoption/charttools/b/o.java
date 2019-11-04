package com.iqoption.charttools.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.iqoption.charttools.constructor.widget.ColorPicker;

/* compiled from: IndicatorConstructorInputColorBinding */
public abstract class o extends ViewDataBinding {
    @NonNull
    public final ImageView aIu;
    @NonNull
    public final ConstraintLayout aIv;
    @NonNull
    public final ColorPicker aIw;
    @NonNull
    public final TextView aoo;

    protected o(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, ColorPicker colorPicker) {
        super(obj, view, i);
        this.aIu = imageView;
        this.aIv = constraintLayout;
        this.aoo = textView;
        this.aIw = colorPicker;
    }
}

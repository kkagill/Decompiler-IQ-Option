package com.iqoption.j.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutOperationHistoryToolbarBinding */
public abstract class i extends ViewDataBinding {
    @NonNull
    public final ImageView cCu;
    @NonNull
    public final TextView dKf;
    @NonNull
    public final TextView dKg;

    protected i(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView) {
        super(obj, view, i);
        this.dKf = textView;
        this.dKg = textView2;
        this.cCu = imageView;
    }
}

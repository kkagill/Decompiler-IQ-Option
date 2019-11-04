package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutDialogToolbarBinding */
public abstract class ph extends ViewDataBinding {
    @NonNull
    public final ImageView cms;
    @NonNull
    public final TextView cmt;

    protected ph(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.cms = imageView;
        this.cmt = textView;
    }
}

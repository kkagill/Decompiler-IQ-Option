package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentOtnLeadingBoardUserBoardPlaceBinding */
public abstract class mh extends ViewDataBinding {
    @NonNull
    public final ImageView chF;
    @NonNull
    public final TextView chG;
    @NonNull
    public final TextView chH;

    protected mh(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.chF = imageView;
        this.chG = textView;
        this.chH = textView2;
    }
}

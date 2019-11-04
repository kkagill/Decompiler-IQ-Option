package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: LeftPanelItemBinding */
public abstract class qj extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final FormattedTextView chj;
    @NonNull
    public final ImageView cmQ;
    @NonNull
    public final ImageView cmR;

    protected qj(Object obj, View view, int i, ImageView imageView, ImageView imageView2, FormattedTextView formattedTextView, ImageView imageView3) {
        super(obj, view, i);
        this.aRh = imageView;
        this.cmQ = imageView2;
        this.chj = formattedTextView;
        this.cmR = imageView3;
    }
}

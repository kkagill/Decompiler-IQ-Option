package com.iqoption.withdraw.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: WithdrawInsufficientFoundsLayoutBinding */
public abstract class ae extends ViewDataBinding {
    @NonNull
    public final TextView erb;
    @NonNull
    public final ImageView erc;
    @NonNull
    public final TextView erd;

    protected ae(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i);
        this.erb = textView;
        this.erc = imageView;
        this.erd = textView2;
    }
}

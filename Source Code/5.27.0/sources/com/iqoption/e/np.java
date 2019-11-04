package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: FragmentTrendingTodayBinding */
public abstract class np extends ViewDataBinding {
    @NonNull
    public final ImageView ccJ;
    @NonNull
    public final ConstraintLayout ckv;
    @NonNull
    public final FormattedTextView ckw;
    @NonNull
    public final RecyclerView ckx;

    protected np(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, FormattedTextView formattedTextView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.ccJ = imageView;
        this.ckv = constraintLayout;
        this.ckw = formattedTextView;
        this.ckx = recyclerView;
    }
}

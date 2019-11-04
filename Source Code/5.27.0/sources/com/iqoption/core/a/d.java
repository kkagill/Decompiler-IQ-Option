package com.iqoption.core.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: FragmentSearchCountryBinding */
public abstract class d extends ViewDataBinding {
    @NonNull
    public final View bfk;
    @NonNull
    public final LinearLayout bfl;
    @NonNull
    public final IQTextInputEditText bfm;
    @NonNull
    public final TextInputLayout bfn;
    @NonNull
    public final FrameLayout bfo;
    @NonNull
    public final ImageView bfp;
    @NonNull
    public final RecyclerView bfq;
    @NonNull
    public final ImageView bfr;
    @NonNull
    public final TextView bft;
    @NonNull
    public final LinearLayout bfu;

    protected d(Object obj, View view, int i, View view2, LinearLayout linearLayout, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, FrameLayout frameLayout, ImageView imageView, RecyclerView recyclerView, ImageView imageView2, TextView textView, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.bfk = view2;
        this.bfl = linearLayout;
        this.bfm = iQTextInputEditText;
        this.bfn = textInputLayout;
        this.bfo = frameLayout;
        this.bfp = imageView;
        this.bfq = recyclerView;
        this.bfr = imageView2;
        this.bft = textView;
        this.bfu = linearLayout2;
    }
}

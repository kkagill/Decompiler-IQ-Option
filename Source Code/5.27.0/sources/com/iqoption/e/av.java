package com.iqoption.e;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: AssetInfoInfoItemBinding */
public abstract class av extends ViewDataBinding {
    @NonNull
    public final TextView bVE;
    @NonNull
    public final LinearLayout bVF;
    @NonNull
    public final FormattedTextView bVG;
    @NonNull
    public final TextView bVH;
    @NonNull
    public final TextView bVI;
    @NonNull
    public final LinearLayout bVJ;
    @NonNull
    public final View bVK;

    protected av(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, FormattedTextView formattedTextView, TextView textView2, TextView textView3, LinearLayout linearLayout2, View view2) {
        super(obj, view, i);
        this.bVE = textView;
        this.bVF = linearLayout;
        this.bVG = formattedTextView;
        this.bVH = textView2;
        this.bVI = textView3;
        this.bVJ = linearLayout2;
        this.bVK = view2;
    }
}

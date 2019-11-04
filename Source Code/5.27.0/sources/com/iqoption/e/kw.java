package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: FragmentKycRadioButtonBinding */
public abstract class kw extends ViewDataBinding {
    @NonNull
    public final ImageView cgW;
    @NonNull
    public final FormattedTextView cgb;
    @NonNull
    public final LinearLayout cgc;

    protected kw(Object obj, View view, int i, FormattedTextView formattedTextView, LinearLayout linearLayout, ImageView imageView) {
        super(obj, view, i);
        this.cgb = formattedTextView;
        this.cgc = linearLayout;
        this.cgW = imageView;
    }
}

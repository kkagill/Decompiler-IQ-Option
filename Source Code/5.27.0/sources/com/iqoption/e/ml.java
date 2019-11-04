package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: FragmentOtnLeadingBoardUserBoardUserBinding */
public abstract class ml extends ViewDataBinding {
    @NonNull
    public final FormattedTextView chK;
    @NonNull
    public final ImageView chL;
    @NonNull
    public final ImageView chM;
    @NonNull
    public final TextView chN;
    @NonNull
    public final ImageView chO;

    protected ml(Object obj, View view, int i, FormattedTextView formattedTextView, ImageView imageView, ImageView imageView2, TextView textView, ImageView imageView3) {
        super(obj, view, i);
        this.chK = formattedTextView;
        this.chL = imageView;
        this.chM = imageView2;
        this.chN = textView;
        this.chO = imageView3;
    }
}

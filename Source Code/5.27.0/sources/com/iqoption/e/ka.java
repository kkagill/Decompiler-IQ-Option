package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: FragmentKycFinishOldBinding */
public abstract class ka extends ViewDataBinding {
    @NonNull
    public final ConfirmButtonView cfW;
    @NonNull
    public final TextView cgE;
    @NonNull
    public final ImageView cgF;
    @NonNull
    public final FormattedTextView cgG;

    protected ka(Object obj, View view, int i, TextView textView, ImageView imageView, FormattedTextView formattedTextView, ConfirmButtonView confirmButtonView) {
        super(obj, view, i);
        this.cgE = textView;
        this.cgF = imageView;
        this.cgG = formattedTextView;
        this.cfW = confirmButtonView;
    }
}

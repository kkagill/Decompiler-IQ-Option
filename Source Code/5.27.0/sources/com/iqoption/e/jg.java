package com.iqoption.e;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: FragmentKycCheckBoxBinding */
public abstract class jg extends ViewDataBinding {
    @NonNull
    public final FormattedTextView cgb;
    @NonNull
    public final LinearLayout cgc;
    @NonNull
    public final AppCompatCheckBox cgd;

    protected jg(Object obj, View view, int i, FormattedTextView formattedTextView, LinearLayout linearLayout, AppCompatCheckBox appCompatCheckBox) {
        super(obj, view, i);
        this.cgb = formattedTextView;
        this.cgc = linearLayout;
        this.cgd = appCompatCheckBox;
    }
}

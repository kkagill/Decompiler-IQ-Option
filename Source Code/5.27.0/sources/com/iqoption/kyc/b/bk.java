package com.iqoption.kyc.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ItemKycDocumentBinding */
public abstract class bk extends ViewDataBinding {
    @NonNull
    public final TextView cpl;
    @NonNull
    public final TextView duK;
    @NonNull
    public final ImageView duO;
    @NonNull
    public final TextView dwm;
    @NonNull
    public final View dwn;
    @NonNull
    public final TextView dwo;
    @NonNull
    public final TextView dwp;

    protected bk(Object obj, View view, int i, TextView textView, TextView textView2, View view2, TextView textView3, ImageView imageView, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.duK = textView;
        this.dwm = textView2;
        this.dwn = view2;
        this.dwo = textView3;
        this.duO = imageView;
        this.cpl = textView4;
        this.dwp = textView5;
    }
}

package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.dialog.popup.whatsnew.a;
import com.iqoption.view.RobotoTextView;

/* compiled from: WhatsNewDialogBinding */
public abstract class aaz extends ViewDataBinding {
    @NonNull
    public final ImageView cle;
    @Bindable
    protected a clg;
    @NonNull
    public final RobotoTextView clj;
    @NonNull
    public final TextView cuD;
    @NonNull
    public final LinearLayout cuS;
    @NonNull
    public final AppCompatImageView cuT;
    @NonNull
    public final ImageView cuU;
    @NonNull
    public final View cuV;
    @NonNull
    public final TextView cuW;

    public abstract void a(@Nullable a aVar);

    protected aaz(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, AppCompatImageView appCompatImageView, ImageView imageView, View view2, ImageView imageView2, RobotoTextView robotoTextView, TextView textView2) {
        super(obj, view, i);
        this.cuD = textView;
        this.cuS = linearLayout;
        this.cuT = appCompatImageView;
        this.cuU = imageView;
        this.cuV = view2;
        this.cle = imageView2;
        this.clj = robotoTextView;
        this.cuW = textView2;
    }
}

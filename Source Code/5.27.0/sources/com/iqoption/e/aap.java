package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.dialog.popup.whatsnew.a;
import com.iqoption.view.SmoothViewPager;

/* compiled from: ViewPagerWhatsNewDialogBinding */
public abstract class aap extends ViewDataBinding {
    @NonNull
    public final ImageView ceH;
    @NonNull
    public final ImageView ceI;
    @NonNull
    public final LinearLayout ceL;
    @NonNull
    public final SmoothViewPager ceT;
    @NonNull
    public final ImageView cle;
    @Bindable
    protected a clg;
    @NonNull
    public final TextView clk;
    @NonNull
    public final TextView cuG;

    public abstract void a(@Nullable a aVar);

    protected aap(Object obj, View view, int i, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, SmoothViewPager smoothViewPager, ImageView imageView3, TextView textView2) {
        super(obj, view, i);
        this.ceH = imageView;
        this.ceI = imageView2;
        this.ceL = linearLayout;
        this.cuG = textView;
        this.ceT = smoothViewPager;
        this.cle = imageView3;
        this.clk = textView2;
    }
}
